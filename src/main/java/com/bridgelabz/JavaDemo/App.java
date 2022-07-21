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
<<<<<<< HEAD
    	LOG.debug(message, " will be printed on debug 2");
    	LOG.info(message, " will be printed on info 2");
    	LOG.warn(message, " will be printed on warn 2");
    	LOG.error(message, " will be printed on error 2");
=======
    	LOG.debug(message, " will be printed on debug 3");
    	LOG.info(message, " will be printed on info 3");
    	LOG.warn(message, " will be printed on warn 3");
    	LOG.error(message, " will be printed on error 3");
>>>>>>> cc76a4999a51cdef72d632741bc98ba64297849f
    	LOG.fatal(message, " will be printed on fatal 1");
        System.out.println("Hello world");
    }
}
