package com.test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionApi {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
Class c=Class.forName("com.test.RefDemo");
RefDemo rd=(RefDemo)c.newInstance();

Method m=c.getDeclaredMethod("show", new Class[] { Integer.class });
m.setAccessible(true);
m.invoke(rd,  5);
	}

}
