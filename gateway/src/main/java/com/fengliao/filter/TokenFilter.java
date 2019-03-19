package com.fengliao.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

@Component
public class TokenFilter extends ZuulFilter {
    /**
     * 以下提供四种标准的Filter类型及其在请求生命周期中所处的位置：
     *
     * PRE Filter：在请求路由到目标之前执行。一般用于请求认证、负载均衡和日志记录。
     * ROUTING Filter：处理目标请求。这里使用Apache HttpClient或Netflix Ribbon构造对目标的HTTP请求。
     * POST Filter：在目标请求返回后执行。一般会在此步骤添加响应头、收集统计和性能数据等。
     * ERROR Filter：整个流程某块出错时执行。
     * 除了上述默认的四种Filter类型外，Zuul还允许自定义Filter类型并显示执行。例如，我们定义一个STATIC类型的Filter，它直接在Zuul中生成一个响应，而非将请求在转发到目标。
     * @return
     */
    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        //过滤器执行顺序 数字越小顺序越高，越先执行
        return 0;
    }

    /**
     * 什么情况下启动过滤，可以写复杂的逻辑
     * @return
     */
    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        System.out.print(String.format("send %s request to %s",request.getMethod(),request.getRequestURL()));
        String token = request.getParameter("token");
        if (StringUtils.isNotBlank(token)) {
            ctx.setSendZuulResponse(true); //对请求进行路由
            ctx.setResponseStatusCode(200);
            ctx.set("isSuccess", true);
            return null;
        } else {
            ctx.setSendZuulResponse(false); //不对其进行路由
            ctx.setResponseStatusCode(400);
            ctx.setResponseBody("token is empty");
            ctx.set("isSuccess", false);
            return null;
        }
    }
}
