import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.LinkedList;

public class Main{

	public static void main(String[] args){
		Wolfman Bob = new Wolfman();
		Wolfman Alice = new Wolfman("Alice", 25,"FEMALE");
		
		Vampire Vlad = new Vampire();
		Vampire Janet = new Vampire("Janet", 34, "FEMALE");
		
		Bob.setPersonName("Bob");
		Bob.setAge(47);
		Bob.setGender("MALE");
		
		Vlad.setPersonName("Vlad");
		Vlad.setAge(300);
		Vlad.setGender("MALE");

		System.out.println(Bob.toString());
		System.out.println(Alice.toString());
		System.out.println(Vlad.toString());
		System.out.println(Janet.toString());
		
		System.out.println("-------- Testing inherited outputTraits() -----------");
		
		List<String> wolfmanTraitsList = Bob.outputTraits();
		System.out.println(wolfmanTraitsList.toString());
		
		wolfmanTraitsList = Alice.outputTraits();
		System.out.println(wolfmanTraitsList.toString());
		
		List<String> vampireTraitsList = Vlad.outputTraits();
		System.out.println(vampireTraitsList.toString());

		vampireTraitsList = Janet.outputTraits();
		System.out.println(vampireTraitsList.toString());

		System.out.println("----------- Testing inherited inputTraits() ----------");
		List<String>inputList = new LinkedList<String>();
		
		inputList.add("John Doe");
		inputList.add("0");
		inputList.add("NA");
		
		Bob.inputTraits(inputList);
		Vlad.inputTraits(inputList);
		
		inputList.set(0, "Jane Doe");
		
		Alice.inputTraits(inputList);
		Janet.inputTraits(inputList);
		
		wolfmanTraitsList = Bob.outputTraits();
		System.out.println(wolfmanTraitsList.toString());		
		
		wolfmanTraitsList = Alice.outputTraits();
		System.out.println(wolfmanTraitsList.toString());		

		vampireTraitsList = Vlad.outputTraits();
		System.out.println(vampireTraitsList.toString());		
		
		vampireTraitsList = Janet.outputTraits();
		System.out.println(vampireTraitsList.toString());		
		
	}
/** Function provided for this project **************************************************/
public static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" +
                "1 to enter a string\n" +
                "0 to quit");

        while (!quit) {
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.print("Enter a string: ");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }	
	public static void saveObject(IMonsters objectToSave){
		for(int i=0; i<objectToSave.outputTraits().size(); i++){
			System.out.println("Saving " + objectToSave.outputTraits().get(i) + " to storage device.");
		}
	}
	public static void loadObject(IMonsters objectToLoad){
		ArrayList<String> values = readValues();
		objectToLoad.inputTraits(values);
	}
}
 