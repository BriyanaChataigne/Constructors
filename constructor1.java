public class nutella {
	private String boyName;
	public nutella(String name){
		boyName = name;
		
	}
	
	public void setName(String name){
		boyName=name;
	}
		
	public String getName(){
		return boyName;
	}
	public void saying(){
		System.out.printf("Your first bf was %s", getName());
	}

}