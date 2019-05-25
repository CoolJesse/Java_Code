/************************ For testing HeavenlyBody class *******************************/
import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.LinkedHashMap;
import java.util.Iterator;

public class Main{
/** Helper class to form key of solar system map *************************************/
	public static class Pair{
		private String name;
		private String type;
		
		public Pair(String name, String type){
			this.name = name;
			this.type = type;
		}
		public Pair(){
			this("","");
		}
		
		@Override
		public String toString(){
			return this.name + " " + this.type;
		}
		
		@Override
		public boolean equals(Object obj){
			if(this == obj)
				return true;
			
			if( (obj == null) || (this.getClass() != obj.getClass()) )
				return false;
			
			String objName = ((Pair) obj).name;
			String objType = ((Pair) obj).type;
			
			return ( this.name.equals(objName) && this.type.equals(objType) );
		}
		
		@Override
		public int hashCode(){
			return ( this.name.hashCode() + this.type.hashCode() );
		}
	}
/** Main body of program *************************************************************/
	public static void main(String[] args){
		
		Set<HeavenlyBody> SolarSystem = new HashSet<>();
		Map<Pair, HeavenlyBody> SolarMap = new LinkedHashMap<>();
	/** Create Stars/the Sun *************************************************/	
		HeavenlyBody Sun = new Star("The Sun", 0.0);
	
	/** Create Planets *******************************************************/
		HeavenlyBody Mercury = new Planet("Mercury", 87.969);
		HeavenlyBody Venus = new Planet("Venus", 224.7);
		HeavenlyBody Earth = new Planet("Earth", 365.256);
		HeavenlyBody Mars = new Planet("Mars", 687.0);
		HeavenlyBody Jupiter = new Planet("Jupiter",4329.63);
		HeavenlyBody Saturn = new Planet("Saturn", 10751.805);
		HeavenlyBody Uranus = new Planet("Uranus", 30667.4825);		
		HeavenlyBody Neptune = new Planet("Neptune", 60152.0);
		
	/** Create Moons *********************************************************/
		HeavenlyBody Moon = new Moon("The Moon", 27.32);
		HeavenlyBody Titan = new Moon("Titan", 15.945);
		HeavenlyBody Ganymede = new Moon("Ganymede", 7.15);
		HeavenlyBody Lo = new Moon("Lo", 1.7691);
		HeavenlyBody Callisto = new Moon("Callisto", 16.689);
		HeavenlyBody Triton = new Moon("Triton", 5.877);
		HeavenlyBody Europa = new Moon("Europa", 3.5);
	
	/** Add moons to appropriate planets **************************************/
		Earth.addMoon(Moon);
		Jupiter.addMoon(Europa);
		Jupiter.addMoon(Callisto);
		Jupiter.addMoon(Ganymede);
		Jupiter.addMoon(Lo);
		Saturn.addMoon(Titan);
		Neptune.addMoon(Triton);
	/** Add bodies to solar system Set *****************************************/
		SolarSystem.add(Sun);
		SolarSystem.add(Venus);
		SolarSystem.add(Mercury);
		SolarSystem.add(Earth);
		SolarSystem.add(Mars);
		SolarSystem.add(Jupiter);
		SolarSystem.add(Saturn);
		SolarSystem.add(Uranus);
		SolarSystem.add(Neptune);		
		
		Iterator<HeavenlyBody> itr = SolarSystem.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next().printAllInfo());
		}
	/** Add bodies to solar system Map *********************************************/
		SolarMap.put(new Pair(Sun.getName(), Sun.getBodyType()), Sun);
		SolarMap.put(new Pair(Venus.getName(), Venus.getBodyType()), Venus);
		SolarMap.put(new Pair(Mercury.getName(), Mercury.getBodyType()), Mercury);
		SolarMap.put(new Pair(Earth.getName(), Earth.getBodyType()), Earth);
		SolarMap.put(new Pair(Mars.getName(), Mars.getBodyType()), Mars);
		SolarMap.put(new Pair(Jupiter.getName(), Jupiter.getBodyType()), Jupiter);
		SolarMap.put(new Pair(Saturn.getName(), Saturn.getBodyType()), Saturn);
		SolarMap.put(new Pair(Uranus.getName(), Uranus.getBodyType()), Uranus);
		SolarMap.put(new Pair(Neptune.getName(), Neptune.getBodyType()), Neptune);
		
		for( Map.Entry<Pair, HeavenlyBody> entry : SolarMap.entrySet()){
			//System.out.println(entry.getValue().printAllInfo());
			System.out.println("SolarMap " + entry.getValue().toString());
		}
		
		for( Map.Entry<Pair, HeavenlyBody> entry : SolarMap.entrySet()){
			System.out.println("SolarMap " + entry.getValue().toString());
		}		
		
	}
}