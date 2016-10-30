package net.ali4j.service.server;

import javax.jws.WebService;

@WebService(endpointInterface="net.ali4j.service.server.HelloService")
public class HelloServiceImpl implements HelloService{
	@Override
	public String sayHello(String name) {
		return "Hello " + name;
	}

}
