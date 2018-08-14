import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Log4j_Demo_Class {

	public static void main(String[] args) {

		Logger logger = Logger.getLogger("Log4j_Demo_Class");
		PropertyConfigurator.configure("C:\\Users\\Jasmeet\\workspace\\Log4jDemo\\log4j.properties");
		logger.debug("This is debug");
		logger.info("This is info");
		logger.warn("This is warning");
		logger.fatal("This is fatal");
		logger.error("This is error");
		
		
	}

}
