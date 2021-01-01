package prac;

public class GenericExam {
	
	public static void main (String[] args) {
		//Generic generic = new Generic ();
	
        //generic.setObj(new Object()); 
        //Object obj = generic.getobj();
        
        //generic.setObj("hello");
        //String str = (String)generic.getobj();
        
       // generic.setObj(1);
        //int value = (int) generic.getobj();
		
		Generic<Object> generic = new Generic<>();
		generic.setObj(new Object());
		Object obj = generic.getobj();
		
		Generic<String> generic2 = new Generic<>();
		generic2.setObj("hello");
		String str = generic2.getobj();
		
		Generic<Integer>  generic3 = new Generic<>();
		generic3.setObj(4);
		int v2 = generic3.getobj();
		
		
        
    }
}