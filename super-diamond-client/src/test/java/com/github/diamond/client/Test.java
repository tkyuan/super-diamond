/**
 * Copyright (c) 2013 by 苏州科大国创信息技术有限公司.
 *
 * Test.java Create on 2013-7-11 下午4:48:04
 */
package com.github.diamond.client;
import javax.naming.ConfigurationException;

import com.github.diamond.client.event.ConfigurationEvent;
import com.github.diamond.client.event.ConfigurationListener;
/**
 *
 * @author <a href="mailto:bsli@ustcinfo.com">li.binsong</a>
 *
 */
public class Test {

	/**
	 * @param args
	 * @throws ConfigurationException
	 */
	public static void main(String[] args) throws Exception {
		PropertiesConfiguration config = new PropertiesConfiguration("localhost", 8283, "wed-test", "development","hunshasy");
		config.addConfigurationListener(new ConfigurationListener(){

			@Override
			public void configurationChanged(ConfigurationEvent event) {
				//UPDATE test.key0 中国jhgjghkjh
				System.out.println(event.getType().name() + " " + event.getPropertyName() + " " + event.getPropertyValue());
			}
			
		});
		System.out.println(config.getString("test.key0"));
		
	}
	
}


