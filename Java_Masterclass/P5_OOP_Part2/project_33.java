/* Project 33 from Java Master Class, OOP Part 2: Polymorphism */
/* Super Class ********************************************************************** */
class Movie{
	private String name;
	
	public Movie(String name){
		this.name = name;
	}
	public String plot(){
		return "No plot here.";
	}
	
	public String getName(){
		return name;
	}
}
/* Sub Classes ************************************************************************/
class Jaws extends Movie{
	public Jaws(){ //inherits name field and constructor from Movie super class
		super("Jaws");
	}
	
	public String plot(){
		return "Shark is really hungry.";
	}
}

class IndependenceDay extends Movie{
	public IndependenceDay(){
		super("Independence Day");
	}
	
	public String plot(){
		return "Will Smith inadvertantely blows up The White House.";
	}
}

class PointBreak extends Movie{
	public PointBreak(){
		super("Point Break");
	}
	@Override
	public String plot(){
		return "Patric Swayze does a poor Ronald Reagan.";
	}
}

class HellRaiser extends Movie{
	public HellRaiser(){
		super("Hellraiser");
	}
	@Override
	public String plot(){
		return "Fully grown goths give each other fun nicknames.";
	}
}

class ForgetableMovie extends Movie{
	public ForgetableMovie(){
		super("Forgetable Movie");
	}
}

public class project_33{
	public static void main(String[] args){
		
		for(int i=1; i<11; i++){
			Movie movie = randomMovie();
			System.out.println("Movie #: " + i + " : " + movie.getName() + '\n' + "Plot: " + movie.plot() + '\n');
		}
		
	}
	/* Random Movie generator ******************************************************/
	public static Movie randomMovie(){
		int randomNumber = (int) (Math.random() * 5) + 1;
		System.out.println("Random number generated was: " + randomNumber);
	
		switch(randomNumber){
			case 1:
				return new Jaws();
				
			case 2:
				return new IndependenceDay();
				
			case 3:
				return new PointBreak();
				
			case 4:
				return new HellRaiser();
				
			case 5:
				return new ForgetableMovie();	
		}
		
		return null;
	}
}