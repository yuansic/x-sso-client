package com.x.sso.client.filter;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map;

import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;

/**
 * FilterConfig
 * Date: 2017年2月9日 <br>
 * Copyright (c) 2017 ifudata.com <br>
 * 
 * @author
 */
public class WrappedFilterConfig implements FilterConfig {
	private ThreadLocal<Map<String, String>> params=new ThreadLocal<Map<String, String>>();
	
	private FilterConfig filterConfig;
	
	
	public WrappedFilterConfig(FilterConfig filterConfig){
		this.filterConfig = filterConfig;
		//initParams();
	}
	/**
	 * 根据内外网自动调整IP参数
	 * @param currentFilterConfig
	 * @param params
	 */
	public WrappedFilterConfig(FilterConfig currentFilterConfig, ThreadLocal<Map<String, String>> params) {
		this.filterConfig = currentFilterConfig;
		this.params=params;
	}

	@Override
	public String getFilterName() {
		return filterConfig.getFilterName();
	}

	/**
	 * 获取初始化参数
	 */
	@Override
	public String getInitParameter(String key) {
		String value = filterConfig.getInitParameter(key);
		if(value!=null){
			return value;
		}
		return StringUtils.isBlank(System.getenv().get(key))?params.get().get(key):System.getenv().get(key);
	}

	/**
	 * 获取初始化枚举
	 */
	@Override
	public Enumeration<String> getInitParameterNames() {
		final Iterator<String> iterator = params.get().keySet().iterator();
		return new Enumeration<String>() {

			@Override
			public boolean hasMoreElements() {
				return iterator.hasNext();
			}

			@Override
			public String nextElement() {
				return iterator.next();
			}
		};
	}

	/**
	 * 获取上下文
	 */
	@Override
	public ServletContext getServletContext() {
		return filterConfig.getServletContext();
	}
	
}
