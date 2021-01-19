/**
 * 
 */
package com.laptrinhjavaweb.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.laptrinhjavaweb.constant.SystemConstant;
import com.laptrinhjavaweb.model.UserModel;
import com.laptrinhjavaweb.utils.SessionUtil;

/**
 * @author nkimk
 *
 */
@WebFilter("/servletFilter")
public class AuthorizationFilter implements Filter {

	private ServletContext context;

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		this.context = filterConfig.getServletContext();
		this.context.log("RequestLoggingFilter initialized");
	}

	@Override
	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain)
			throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest) servletRequest;
		HttpServletResponse response = (HttpServletResponse) servletResponse;
		String url = request.getRequestURI();
		if (url.startsWith("/Do-an-TeamBoDoi/admin")) {
			UserModel model = (UserModel) SessionUtil.getInstance().getValue(request, "USERMODEL");
			if (model != null) {
				if (model.getRole().getCode().equals(SystemConstant.ADMIN)) {
					filterChain.doFilter(servletRequest, servletResponse);
				} else if (model.getRole().getCode().equals(SystemConstant.USER)) {
					response.sendRedirect(
							request.getContextPath() + "/dang-nhap?action=login&message=not_permission&alert=danger");
				}
			} else {
				response.sendRedirect(
						request.getContextPath() + "/dang-nhap?action=login&message=not_login&alert=danger");
			}
		} else {
			if (url.startsWith("/Do-an-TeamBoDoi/checkout")) {
				UserModel model = (UserModel) SessionUtil.getInstance().getValue(request, "USERMODEL");
				if (model != null) {
					filterChain.doFilter(servletRequest, servletResponse);
				}else {
					response.sendRedirect(
							request.getContextPath() + "/dang-nhap?action=login&message=need_login&alert=warning");
				}
			} else {

				filterChain.doFilter(servletRequest, servletResponse);
			}
		}

	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

}
