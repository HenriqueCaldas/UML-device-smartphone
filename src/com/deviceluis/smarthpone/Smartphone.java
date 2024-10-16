package com.deviceluis.smarthpone;

import com.deviceluis.browser.model.NavegadorModel;
import com.deviceluis.player.model.ReprodutorDeMidia;
import com.deviceluis.player.model.ReprodutorMusica;
import com.deviceluis.player.model.ReprodutorVideo;
import com.deviceluis.telefone.model.Telefone;

public class Smartphone {

	private ReprodutorDeMidia reprodutorMusicas;
	private ReprodutorDeMidia reprodutorVideos;
	private Telefone telefone;
	private NavegadorModel browser;

	public Smartphone() {
		this.reprodutorMusicas = new ReprodutorMusica();
		this.reprodutorVideos = new ReprodutorVideo();
		this.telefone = new Telefone();
		this.browser = new NavegadorModel();

	}

	public void reproduzirMusica(String musica) {
		reprodutorMusicas.reproduzirMidia(musica);
	}

	public void pausarMusica() {
		reprodutorMusicas.pausarMidia();
	}

	public void aumentarVolumeMusica() {
		reprodutorMusicas.aumentarVolume();
	}

	public void diminuirVolumeMusica() {
		reprodutorMusicas.diminuirVolume();
	}

	public void reproduzirVideo(String video) {
		reprodutorVideos.reproduzirMidia(video);
	}

	public void pausarVideo() {
		reprodutorVideos.pausarMidia();
	}

	public void aumentarVolumeVideo() {
		reprodutorVideos.aumentarVolume();
	}

	public void diminuirVolumeVideo() {
		reprodutorVideos.diminuirVolume();
	}

	public void ligar(String numero) {
		telefone.ligar(numero);
	}

	public void atenderChamada() {
		telefone.atender();
	}
	public void desligarChamada() {
		telefone.desligar();
	}
	
	public void conectarInternet() {
		browser.conectarInternet();
	}
	
	public void desconectarInternet() {
		browser.desconectarInternet();
	}
	public void acessarURL(String url) {
		browser.acessarURL(url);
	}
	
	
	
}
