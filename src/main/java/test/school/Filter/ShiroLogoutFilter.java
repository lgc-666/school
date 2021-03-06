package test.school.Filter;


import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.filter.authc.LogoutFilter;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * @author: lgc
 * @date: 2020/9/27
 * @description: 自定义 LogoutFilter
 */
public class ShiroLogoutFilter extends LogoutFilter {

    /**
     * 自定义登出（去掉跳转操作，交给前端处理，避免跨域问题）
     * @param request
     * @param response
     * @return
     * @throws Exception
     */
    @Override
    protected boolean preHandle(ServletRequest request, ServletResponse response) throws Exception {

        Subject subject = getSubject(request,response);

        //登出
        subject.logout();

        //获取登出后重定向到的地址
        //String redirectUrl = getRedirectUrl(request,response,subject);
        //重定向
        //issueRedirect(request,response,redirectUrl);
        //不执行后续的过滤器
        return false;
    }

}
