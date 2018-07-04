package com.cf;

import org.apache.camel.builder.RouteBuilder;

public class SimpleRouteBuilder extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        from("file:C:/inputFolder?noop=true").split().tokenize("\n").to("jms:queue:manohar_queue");
    }

}