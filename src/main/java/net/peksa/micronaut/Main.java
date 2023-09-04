package net.peksa.micronaut;

import io.micronaut.serde.ObjectMapper;

public class Main {
	public static void main(String[] args) throws Exception {
		var one = new BlaClass();
		one.setFoo("foo");

		var two = new BlaRecord("foo");

		var objectMapper = ObjectMapper.getDefault();

		System.out.println(objectMapper.writeValueAsString(one));
		System.out.println(objectMapper.writeValueAsString(two));
	}
}