package com.apress.prospring3.ch2;

public interface MessageRender {
	public MessageProvider provider = null;

	public void render();

	public void setprovider(MessageProvider provider);

}
