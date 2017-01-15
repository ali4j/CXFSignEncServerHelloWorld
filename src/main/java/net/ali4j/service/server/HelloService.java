package net.ali4j.service.server;

import javax.jws.WebService;

/**
 * Created by ali4j on 1/5/2017.
 */
@WebService
public interface HelloService {
	String  sayHello(String name);
}
