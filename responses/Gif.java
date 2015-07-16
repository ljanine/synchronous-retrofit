package responses;

public class Gif{
	private String type;
	private String id;
	private String url;
	private String bitly_gif_url;
	private String source;
	private String username;
	private GiphyImage images;


	//SET
	public void setType(String type){
		this.type = type;
	}

	public void setID(String id){
		this.id = id;
	}

	public void setURL(String url){
		this.url = url;
	}

	public void setBitly_gif_url(String bitly_gif_url){
		this.bitly_gif_url = bitly_gif_url;
	}

	public void setUserName(String username){
		this.username = username;
	}

	public void setImages(GiphyImage images){
		this.images = images;
	}


	//GET
	public String getType(){
		return this.type;
	}

	public String getID(){
		return this.id;
	}

	public String getURL(){
		return this.url;
	}

	public String getBitly_gif_url(){
		return this.bitly_gif_url;
	}

	public String getUserName(){
		return this.username;
	}

	public GiphyImage getImages(){
		return this.images;
	}

}