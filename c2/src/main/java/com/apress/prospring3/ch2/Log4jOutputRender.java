package com.apress.prospring3.ch2;

import org.apache.log4j.Logger;

public class Log4jOutputRender implements MessageRender {
	MessageProvider provider = null;
	static final Logger logger = Logger.getLogger(Log4jOutputRender.class);  
	public void render() {
		logger.debug(provider.getmessage());
	}

	public void setprovider(MessageProvider provider) {
		this.provider = provider;

	}

}
