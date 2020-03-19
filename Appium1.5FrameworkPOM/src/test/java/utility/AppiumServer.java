package utility;

import java.io.File;
import java.io.IOException;

import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;


public class AppiumServer {
	
	//Starting the Appium Server
	
	public static AppiumDriverLocalService service;
	
	public static void start() {
		
		 service = AppiumDriverLocalService
		            .buildService(new AppiumServiceBuilder()
		                    .usingDriverExecutable(new File("C:\\Program Files (x86)\\Appium\\node.exe"))
		                    .withAppiumJS(new File("C:\\Program Files (x86)\\Appium\\node_modules\\appium\\bin\\appium.js")));
		    service.start();
	  


	}

	
	//Stopping the Appium Server
	
	public static void stop() throws IOException {

		service.stop();
	}


}
