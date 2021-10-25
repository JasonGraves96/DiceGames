import java.util.Random;

public class Die {
	private int value;

public Die() {
	super();
	Random rand = new Random();
	int roll = (rand.nextInt(5)+1);
	this.value = roll;
}//end Die

	public int Roll() {
		Random rand = new Random();
		int result = (rand.nextInt(6)+1);
		this.value = result;
		return result;
	}//end Roll
	
	public void Draw() {
		switch(this.value){
		case 1:
			System.out.println("#######");
			System.out.println("#     #");
			System.out.println("#  O  #");
			System.out.println("#     #");
			System.out.println("#######");
		break;
		
		
		case 2:
			System.out.println("#######");
			System.out.println("# O   #");
			System.out.println("#     #");
			System.out.println("#   O #");
			System.out.println("#######");
		break;
		
		
		case 3:
			System.out.println("#######");
			System.out.println("# O   #");
			System.out.println("#  O  #");
			System.out.println("#   O #");
			System.out.println("#######");
		break;
		
		case 4:
			System.out.println("#######");
			System.out.println("# O O #");
			System.out.println("#     #");
			System.out.println("# O O #");
			System.out.println("#######");
		break;
		
		
		case 5:
			System.out.println("#######");
			System.out.println("# O O #");
			System.out.println("#  O  #");
			System.out.println("# O O #");
			System.out.println("#######");
		break;
		
		
		case 6:
			System.out.println("#######");
			System.out.println("# OOO #");
			System.out.println("#     #");
			System.out.println("# OOO #");
			System.out.println("#######");
		break;
		
		
		default:
		System.out.println("Something went wrong");
		break;
		}
		
	}

}
