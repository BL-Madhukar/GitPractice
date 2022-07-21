package com.bridgelabz.JavaDemo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App 
{
	private static final Logger LOG = LogManager.getLogger(App.class);
    public static void main( String[] args )
    {
    	String message = "Hello Java";
    	LOG.debug(message, " will be printed on debug 2");
    	LOG.info(message, " will be printed on info 2");
    	LOG.warn(message, " will be printed on warn 2");
    	LOG.error(message, " will be printed on error 2");
    	LOG.fatal(message, " will be printed on fatal 1");
        System.out.println("Hello world");
    }
}
