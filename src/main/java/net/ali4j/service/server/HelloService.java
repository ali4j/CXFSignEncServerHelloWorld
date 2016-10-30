package net.ali4j.service.server;

import javax.jws.WebService;

@WebService
public interface HelloService {
	public String sayHello(String name);

}
