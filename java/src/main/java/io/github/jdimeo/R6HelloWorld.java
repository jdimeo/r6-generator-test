package io.github.jdimeo;

import uk.co.terminological.rjava.RClass;
import uk.co.terminological.rjava.RMethod;

@RClass
public class R6HelloWorld {
	@RMethod(examples = "rgentest::helloWorld()", tests = "rgentest::helloWorld()")
	public void helloWorld() {
		System.out.println("Hello, world!");
	}
}
