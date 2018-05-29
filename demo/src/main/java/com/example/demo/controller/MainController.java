/**
 * 
 */
package com.example.demo.controller;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.SResponse;

/**
 * @author dinesh.joshi
 *
 */
@RestController
@RequestMapping("sample")
public class MainController {

	@RequestMapping(method = RequestMethod.GET)
	public SResponse getServerInfo(HttpServletRequest request) {

		System.out.println("getServerInfo..");

		return new SResponse(request.getLocalAddr(), request.getRemoteAddr(), request.getHeader("X-FORWARDED-FOR"),
				request.getServerName(), request.getServerPort(), request.getRemoteHost(), request.getRemotePort());
	}

}
