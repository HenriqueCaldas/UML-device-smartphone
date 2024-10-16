package com.deviceluis.telefone.model;

public class Telefone implements TelefoneInterface {
	
	private String numeroDiscado;
	
	@Override
	public void ligar(String telefone) {
		numeroDiscado = telefone;
		System.out.println("Ligando para o número: " + getNumeroDiscado());
	}

	@Override
	public void atender() {
		System.out.println("Atendendo chamada");
		
	}

	@Override
	public void desligar() {
		System.out.println("Desligando chamada");
		
	}

	public String getNumeroDiscado() {
		return numeroDiscado;
	}

	public void setNumeroDiscado(String numeroDiscado) {
		this.numeroDiscado = numeroDiscado;
	}

}
