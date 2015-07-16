package responses;

import java.util.ArrayList;
import responses.Gif;
import java.util.*;


public class Etiqueta{
	private String etiqueta;
	public int num=(int) (Math.random()*(10-1)+1);
	public int numero = 0;

	Random r = new Random();

	public void setEtiqueta(String etiqueta){
		this.etiqueta = etiqueta;
	}

	public String getEtiqueta(){
		return this.etiqueta;
	}

	public void setNumero(int numero){
		this.numero = numero;
	}

	public int getNumero(){
		return this.numero;
	}



}