package com.deviceluis.browser.model;

public class NavegadorModel implements NavegadorInterface{
	private String url;

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public void conectarInternet() {
		System.out.println("Conexão de internet estabelecida");
		
	}

	@Override
	public void desconectarInternet() {
		System.out.println("Você foi desconectado da internet");
		
	}

	@Override
	public void acessarURL(String url) {
		setUrl(url);
		System.out.println("Olá, bem vindo ao site: " + getUrl());
		
	}
	
	
	
}
