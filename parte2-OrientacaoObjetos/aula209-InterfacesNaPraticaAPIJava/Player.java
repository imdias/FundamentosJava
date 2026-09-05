public class Player{
	private int id;
	private String username;
	private float points;

	public Player(int id, String username, float points){
		this.id = id;
		this.username = username;
		this.points = points;
	}

	public void setId(int id){
		this.id = id;
	}

	public void setUsername(String username){
		this.username = username;
	}

	public void setPoints(float points){
		this.points = points;
	}

	public int getId(){
		return this.id;
	}

	public String getUsername(){
		return this.username;
	}

	public float getPoints(){
		return this.points;
	}

	public String toString(){
		return "(" + this.id + ") " + this.username + " | " + this.points;
	}
}