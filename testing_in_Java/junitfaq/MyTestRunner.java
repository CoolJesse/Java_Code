package junitfaq;
//import java.util.ArrayList;
import static org.junit.Assert.*;
import org.junit.*;

import java.util.*;

public class MyTestRunner{

	public static void main(String[] args){
		org.junit.runner.JUnitCore.main("junitfaq.SimpleTest");
	}
	
}