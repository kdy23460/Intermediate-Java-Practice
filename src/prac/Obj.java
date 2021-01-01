package prac;

public class Obj {

	String name;
	String number;
	int birthYear;
	
	@Override
	public String toString() {
		return "Obj [name=" + name + ", number=" + number + ", birthYear=" + birthYear + ", hashCode()=" + hashCode()
				+ ", getClass()=" + getClass() + ", toString()=" + super.toString() + "]";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((number == null) ? 0 : number.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Obj other = (Obj) obj;
		if (number == null) {
			if (other.number != null)
				return false;
		} else if (!number.equals(other.number))
			return false;
		return true;
	}



	public static void main(String[] args) {
		Obj s1 = new Obj();
		s1.name ="ȫ�浿";
		s1.number ="1234";
		s1.birthYear= 1995;
		
		Obj s2 = new Obj();
		s2.name ="ȫ�浿";
		s2.number="1234";
		s2.birthYear=1995;
		
		if(s1.equals(s2))
			System.out.println("s1 == s2");
		else
			System.out.println("s1 ! == s2");
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		System.out.println(s1);
		System.out.println(s1.toString());
		
	}



}
