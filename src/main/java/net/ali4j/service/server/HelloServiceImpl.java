package net.ali4j.service.server;

import javax.jws.WebService;

/**
 * Created by ali4j on 1/5/2017.
 */
@WebService(endpointInterface="net.ali4j.service.server.HelloService")
public class HelloServiceImpl implements HelloService{

	public String sayHello(String name) {
		return "Hello " + name;
	}
}
