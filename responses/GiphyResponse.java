package responses;

import java.util.ArrayList;
import responses.Gif;
import java.util.*;

public class GiphyResponse{
	private ArrayList<Gif> data;

	public ArrayList<Gif> getData(){
		Collections.shuffle(data); //altera el orden de la lista, asi no siempre devolvera el mismo 
		return data;
	}
}