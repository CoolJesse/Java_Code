import java.util.List;

public interface IMonsters{

	enum Gender{
		MALE, FEMALE, NA;
	}	
	
	List<String> outputTraits();
	void inputTraits(List<String> info);	
}