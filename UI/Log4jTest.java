package com.testing.UI;

import org.apache.log4j.Logger;

public class Log4jTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Logger logger = Logger.getLogger(Log4jTest.class);
        logger.debug("this is debug");
        logger.info("this is info");
        logger.warn("this is warn");
        try {
			Integer.parseInt("ss");
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			logger.error(e,e.fillInStackTrace());
		}
        logger.fatal("this is fatal");
	}

}
