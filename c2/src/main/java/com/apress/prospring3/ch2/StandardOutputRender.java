package com.apress.prospring3.ch2;

public class StandardOutputRender implements MessageRender {

	public void render() {
		System.out.println(provider.getmessage());
	}

	public void setprovider(MessageProvider provider) {
		provider = this.provider;

	}

}
