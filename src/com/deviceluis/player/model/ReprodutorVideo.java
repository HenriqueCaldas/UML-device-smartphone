package com.deviceluis.player.model;

public class ReprodutorVideo extends ReprodutorDeMidia implements PlayerInterface {

private String nomeVideo;
	
	public String getNomeVideo() {
		return nomeVideo;
	}

	public void setNomeVideo(String nomeVideo) {
		this.nomeVideo = nomeVideo;
	}

	@Override
	public void reproduzirMidia(String nome) {
		nomeVideo = nome;
		System.out.println("Reproduzindo o vídeo: " + getNomeVideo() );
		
	}

	@Override
	public void pausarMidia() {
		System.out.println("Pausando o vídeo");
		
	}

	@Override
	public void aumentarVolume() {
		
		System.out.println("Aumentando o volume do vídeo");
		
	}

	@Override
	public void diminuirVolume() {
		
		System.out.println("Baixando o volume do vídeo");	
	}

}
