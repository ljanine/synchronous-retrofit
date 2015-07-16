import retrofit.Callback;
import responses.*;
import retrofit.RetrofitError;
import retrofit.client.Response;
import java.awt.Desktop;
import java.net.URI;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Scanner;
import java.lang.Math;
import responses.Etiqueta;
import java.util.*;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Etiqueta e1 = new Etiqueta();
		
		//public int num = (int) (Math.random()*(10-1)+1); //establecer un numero aleatorio no mayor del 10

		System.out.print("\n\nBuscar gifs con la etiqueta: " );	
		e1.setEtiqueta(scan.nextLine());
		

		System.out.print("Numero de gifs que quiere ver: " );
		e1.setNumero(scan.nextInt());
		


		Main.searchGifs(e1.getEtiqueta(), e1.getNumero());
	}

	public static void searchGifs(String term, int numImages){
		GiphyService service = new GiphyService();

		GiphyResponse gifs = service.searchGifs(term);
		int i = 0;

		for (Gif gif : gifs.getData()) {
			i++;
			if(i <= numImages){
				Main.openInBrowser(gif.getImages().fixed_height.url);
			}

		}
	}

	public static void openInBrowser(String url){
		if(Desktop.isDesktopSupported()){
			try {
                Desktop.getDesktop().browse(new URI(url));
            } catch (URISyntaxException e) {
                e.printStackTrace();
            } catch(IOException e){
                e.printStackTrace();
            }
			
		}
	}
}