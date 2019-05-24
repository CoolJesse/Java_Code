
public class Star extends HeavenlyBody{
/************************************ Constructor **************************************/
	public Star(String name, double orbitalPeriod){
		super(name, orbitalPeriod, "Star");
	}	
	@Override
    public boolean addMoon(HeavenlyBody moon) {
		return this.satellites.add(moon);
    }	
}