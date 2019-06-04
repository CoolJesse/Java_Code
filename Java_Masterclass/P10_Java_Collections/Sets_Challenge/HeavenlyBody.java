/***************************************************************************************
imported May 21, 2019 from:https://www.udemy.com/java-the-complete-java-developer-course/
***************************************************************************************/
import java.util.HashSet;
import java.util.Set;

public class HeavenlyBody {
	
/******************* Declare what type of stellar object this is ********************/
	enum bodyType{
		STAR("Star"), PLANET("Planet"), MOON("Moon"), ASTEROID("Asteroid");
		
		private String name;
		
		private bodyType(String name){
			this.name = name;
		}
		
		@Override
		public String toString(){
			return name;
		}
	}
/******************************* HeavenlyBody Fields ********************************/
	private final String name;
    private final double orbitalPeriod;
    protected final Set<HeavenlyBody> satellites;
	private final bodyType type;
/************************************ Constructor ************************************/
    public HeavenlyBody(String name, double orbitalPeriod, String type ) {
        this.name = name;
        this.orbitalPeriod = orbitalPeriod;
        this.satellites = new HashSet<>();
		this.type = bodyType.valueOf(type.toUpperCase());
    }
/************************************** Getters ***************************************/
    public String getName() {
        return name;
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public Set<HeavenlyBody> getSatellites() {
        return new HashSet<>(this.satellites);
    }
	
	public String getBodyType(){
		return type.toString();
	}
/************************************** Methods ***************************************/
    public boolean addMoon(HeavenlyBody moon) {
		if(moon.type.equals(bodyType.valueOf("MOON"))){
			return this.satellites.add(moon);
		}
		else
			return false;
    }
	public String printAllInfo(){
		return (name + ", has an orbital period of " + orbitalPeriod + " days," + " has the following satellites: " + satellites.toString() + ", and is a " + type.toString());
	}
    @Override
    public final boolean equals(Object obj) {
		System.out.println("equals() called!");
        if(this == obj) {
            return true;
        }

        //System.out.println("obj.getClass() is " + obj.getClass());
        //System.out.println("this.getClass() is " + this.getClass());
        if ((obj == null) || (obj.getClass() != this.getClass())) {
            return false;
        }

        String objName = ((HeavenlyBody) obj).getName();
		String objType = ((HeavenlyBody) obj).getBodyType();
		
        return (this.name.equals(objName) && this.type.equals(objType));
    }

    @Override
    public int hashCode() {
        //System.out.println("hashcode called");
        return this.name.hashCode() + 57;
    }
	@Override
	public String toString(){
		return this.name;
	}
}
