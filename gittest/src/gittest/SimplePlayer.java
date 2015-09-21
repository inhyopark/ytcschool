package gittest;

import javazoom.jl.player.*;
import java.io.FileInputStream;

public class SimplePlayer {
	public SimplePlayer(){

	    try{

	    FileInputStream fis = new FileInputStream("nhk.mp3");
	    Player playMP3 = new Player(fis);

	    playMP3.play();

	    }catch(Exception e){System.out.println(e);}
	}

}
