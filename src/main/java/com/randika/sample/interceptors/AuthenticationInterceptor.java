package com.randika.sample.interceptors;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

import java.util.Map;

public class AuthenticationInterceptor implements Interceptor {
    public void destroy() {
        System.out.println("DemoCustomInterceptor destroy() is called...");
    }

    public void init() {
        System.out.println("DemoCustomInterceptor init() is called...");
    }

    public String intercept(ActionInvocation actionInvocation) throws Exception {
        System.out.println("inside auth interceptor");
        Map<String, Object> sessionAttributes = actionInvocation.getInvocationContext().getSession();

        String user = (String) sessionAttributes.get("username");
        System.out.println(user);

        if (user == null) {
            return Action.LOGIN;
        } else {
            Action action = (Action) actionInvocation.getAction();
            return actionInvocation.invoke();
        }
    }
}
