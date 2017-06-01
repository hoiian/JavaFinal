package proj;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

public class PlaySound {

	public static void play(String Filename){

		try {
			InputStream in = new FileInputStream(Filename);
			AudioStream as = new AudioStream(in);
			AudioPlayer.player.start(as);
		} catch (FileNotFoundException e) {
			System.out.print("FileNotFoundException ");
		} catch (IOException e) {
			System.out.print("¦³¿ù»~¡I");
		}
	}
	
	public static void ha(int j){
		switch(j){
		case 0:play("src/proj/sound/wav_H/H_c4.wav");break;
		case 1:play("src/proj/sound/wav_H/H_c41.wav");break;
		case 2:play("src/proj/sound/wav_H/H_d4.wav");break;
		case 3:play("src/proj/sound/wav_H/H_d41.wav");break;
		case 4:play("src/proj/sound/wav_H/H_e4.wav");break;
		case 5:play("src/proj/sound/wav_H/H_f4.wav");break;
		case 6:play("src/proj/sound/wav_H/H_f41.wav");break;
		case 7:play("src/proj/sound/wav_H/H_g4.wav");break;
		case 8:play("src/proj/sound/wav_H/H_g41.wav");break;
		case 9:play("src/proj/sound/wav_H/H_a4.wav");break;
		case 10:play("src/proj/sound/wav_H/H_a41.wav");break;
		case 11:play("src/proj/sound/wav_H/H_b4.wav");break;
		case 12:play("src/proj/sound/wav_H/H_c5.wav");break;
		}
	}
	
	public static void lo(int j){
		switch(j){
		case 0:play("src/proj/sound/wav_H/H_c4.wav");break;
		case 1:play("src/proj/sound/wav_H/H_c41.wav");break;
		case 2:play("src/proj/sound/wav_H/H_d4.wav");break;
		case 3:play("src/proj/sound/wav_H/H_d41.wav");break;
		case 4:play("src/proj/sound/wav_H/H_e4.wav");break;
		case 5:play("src/proj/sound/wav_H/H_f4.wav");break;
		case 6:play("src/proj/sound/wav_H/H_f41.wav");break;
		case 7:play("src/proj/sound/wav_H/H_g4.wav");break;
		case 8:play("src/proj/sound/wav_H/H_g41.wav");break;
		case 9:play("src/proj/sound/wav_H/H_a4.wav");break;
		case 10:play("src/proj/sound/wav_H/H_a41.wav");break;
		case 11:play("src/proj/sound/wav_H/H_b4.wav");break;
		case 12:play("src/proj/sound/wav_H/H_c5.wav");break;
		}
	}
	
	public static void world(int j){
		switch(j){
		case 0:play("src/proj/sound/wav_H/H_c4.wav");break;
		case 1:play("src/proj/sound/wav_H/H_c41.wav");break;
		case 2:play("src/proj/sound/wav_H/H_d4.wav");break;
		case 3:play("src/proj/sound/wav_H/H_d41.wav");break;
		case 4:play("src/proj/sound/wav_H/H_e4.wav");break;
		case 5:play("src/proj/sound/wav_H/H_f4.wav");break;
		case 6:play("src/proj/sound/wav_H/H_f41.wav");break;
		case 7:play("src/proj/sound/wav_H/H_g4.wav");break;
		case 8:play("src/proj/sound/wav_H/H_g41.wav");break;
		case 9:play("src/proj/sound/wav_H/H_a4.wav");break;
		case 10:play("src/proj/sound/wav_H/H_a41.wav");break;
		case 11:play("src/proj/sound/wav_H/H_b4.wav");break;
		case 12:play("src/proj/sound/wav_H/H_c5.wav");break;
		}
	}
	
	
	public static void question(int n1, int n2, int n3){
		
		ha(n1);
		
		try{
			Thread.sleep(1800);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		
		lo(n2);
		
		try{
			Thread.sleep(1800);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		
		world(n3);
	}
}
