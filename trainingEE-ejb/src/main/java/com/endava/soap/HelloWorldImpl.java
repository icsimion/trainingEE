package com.endava.soap;

import javax.jws.WebService;

/**
 * Created by simion on 5/6/14.
 */
//Service Implementation
@WebService(endpointInterface = "com.endava.soap.HelloWorld")
public class HelloWorldImpl implements HelloWorld{

    @Override
    public String getHelloWorldAsString(String name) {
        return "Hello World JAX-WS " + name;
    }

}
