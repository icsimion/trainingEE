package com.endava.soap;

import javax.xml.ws.Endpoint;

//Endpoint publisher
public class HelloWorldPublisher{

//    http://www.mkyong.com/webservices/jax-ws/jax-ws-hello-world-example/
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:9999/ws/hello", new HelloWorldImpl());
    }

}
