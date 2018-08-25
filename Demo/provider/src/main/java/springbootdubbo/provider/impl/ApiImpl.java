package springbootdubbo.provider.impl;

import com.orbyun.api.Api;

public class ApiImpl implements Api {
	@Override
	public String say(String str) {
		return "hello"+str;
	}
}
