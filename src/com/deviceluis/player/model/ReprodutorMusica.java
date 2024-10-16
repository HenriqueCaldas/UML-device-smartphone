package com.deviceluis.player.model;

public class ReprodutorMusica extends ReprodutorDeMidia implements PlayerInterface{
	
	private String nomeMusica;
	
	public String getNomeMusica() {
		return nomeMusica;
	}

	public void setNomeMusica(String nomeMusica) {
		this.nomeMusica = nomeMusica;
	}

	@Override
	public void reproduzirMidia(String nome) {
		nomeMusica = nome;
		System.out.println("Reproduzindo a música: " + getNomeMusica() );
		
	}

	@Override
	public void pausarMidia() {
		System.out.println("Pausando a música");
		
	}

	@Override
	public void aumentarVolume() {
		
		System.out.println("Aumentando o volume da música");
		
	}

	@Override
	public void diminuirVolume() {
		
		System.out.println("Baixando o volume da música");	
	}

}
