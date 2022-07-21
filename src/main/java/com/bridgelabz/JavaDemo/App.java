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
    	LOG.debug(message, " will be printed on debug");
    	LOG.info(message, " will be printed on info");
    	LOG.warn(message, " will be printed on warn");
    	LOG.error(message, " will be printed on error");
    	LOG.fatal(message, " will be printed on fatal");
        System.out.println("Hello world");
    }
}
