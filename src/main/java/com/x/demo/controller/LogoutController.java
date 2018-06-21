package com.x.demo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.x.sso.client.filter.SSOClientUtil;


/**
 * 登出controller
 * Date: 2017年2月9日 <br>
 * Copyright (c) 2017.7 ifudata.com <br>
 * 
 * @author wangyongxin
 */
@Controller
public class LogoutController {
	private static final Logger LOG = LoggerFactory.getLogger(LogoutController.class);
	/**
	 * 单点登出
	 * @param request
	 * @param response
	 * @author
	 */
	@RequestMapping("/ssologout")
	public void logout(HttpServletRequest request,HttpServletResponse response){
		String logOutServerUrl = SSOClientUtil.getLogOutServerUrlRuntime(request);
		String logOutBackUrl = SSOClientUtil.getLogOutBackUrlRuntime(request);
		try {
			/*if(user!=null){
					session.removeAttribute(SSOClientConstants.USER_SESSION_KEY);
					session.invalidate();
			}*/
			response.sendRedirect(logOutServerUrl + "?service=" + logOutBackUrl);
		} catch (Exception e) {
			LOG.error("用户登出失败",e);
		}
		
	}

}
