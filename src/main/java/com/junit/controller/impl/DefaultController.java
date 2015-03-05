package com.junit.controller.impl;

import com.junit.controller.Controller;
import com.junit.controller.Request;
import com.junit.controller.RequestHandler;
import com.junit.controller.Response;

/**
 * Created by mingyuan.wang on 2015/3/5.
 */
public class DefaultController implements Controller {
    @Override
    public Response processRequest(Request request) {
        return null;
    }

    @Override
    public void addHandler(Request request, RequestHandler requestHandler) {

    }
}
