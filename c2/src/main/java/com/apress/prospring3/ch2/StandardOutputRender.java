package com.apress.prospring3.ch2;

public class StandardOutputRender implements MessageRender {
	public MessageProvider provider;
	public void render() {
		System.out.println(provider.getmessage());
	}

	public void setprovider(MessageProvider provider) {
		this.provider = provider;

	}

}
