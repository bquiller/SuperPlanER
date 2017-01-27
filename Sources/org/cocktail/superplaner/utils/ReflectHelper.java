package org.cocktail.superplaner.utils;

import java.lang.reflect.Method;

public class ReflectHelper {

	
	
	public static Object invokeMethod(Object object,String methodName) {
		return invokeMethod(object,methodName,(Object[])null,(Class[])null);
	}
	
	public static Object invokeMethod(Object object,String methodName,Object arg,Class argType) {
		return invokeMethod(object, methodName, new Object[] {arg},new Class[] {argType});
	}
	
	public static Object invokeMethod(Object object,String methodName,Object[] args,Class[] argTypes) {
		Object result = null;
		try {
			Class cls = object.getClass();
	        Method method = cls.getMethod(methodName,argTypes);
	        result = method.invoke(object,args);
		}
	    catch ( Exception e) {
	    	e.printStackTrace();
	    }
	    return result;
	}


}
