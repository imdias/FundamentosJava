public class Player implements java.io.Serializable{
	private int id;
	private String name;
	private float score;

	public Player(int id, String name, float score){
		this.id = id;
		this.name = name;
		this.score = score;		
	}

	public int getId(){
		return this.id;
	}

	public String getName(){
		return this.name;
	}

	public float getScore(){
		return this.score;
	}

	public void setId(int id){
		this.id = id;
	}

	public void setName(String name){
		this.name = name;
	}
	
	public void setSore(float score){
		this.score = score;
	}

	public String toString(){
		return id+";"+name+";"+score;
	}

	public String showInfo(){
		return "Player("+id+","+name+","+score+")";
	}

}