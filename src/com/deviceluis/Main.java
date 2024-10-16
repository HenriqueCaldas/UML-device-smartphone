package com.deviceluis;

import com.deviceluis.player.model.ReprodutorDeMidia;
import com.deviceluis.player.model.ReprodutorVideo;
import com.deviceluis.smarthpone.Smartphone;

public class Main {

	public static void main(String[] args) {
		
		Smartphone smartPhone = new Smartphone();
		
		smartPhone.reproduzirMusica("Metallica - Nothing else matters");
		smartPhone.aumentarVolumeMusica();
		smartPhone.diminuirVolumeMusica();
		smartPhone.reproduzirVideo("De volta para o futuro");
		
		ReprodutorDeMidia player = new ReprodutorVideo();
		player.reproduzirMidia("Exterminador do futuro 2");
		player.aumentarVolume();
		
		smartPhone.ligar("81995314763");
		
		smartPhone.acessarURL("www.claro.com.br");
		
		
		
		
		
		
		
		
		
		
		

	}

}
