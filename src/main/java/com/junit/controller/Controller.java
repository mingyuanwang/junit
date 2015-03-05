package com.junit.controller;

/**
 * Created by mingyuan.wang on 2015/3/5.
 */
public interface Controller {
    Response processRequest(Request request);
    void addHandler(Request request,RequestHandler requestHandler);
}
