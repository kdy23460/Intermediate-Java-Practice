package prac;

public class Generic <E>{
	private E obj; //필드 

	public void setObj (E obj) {
		this.obj = obj;
		
		//필드 obj와 매개변수 obj가 같기 때문에 this.obj로 설정
	}

	public E getobj () {
		return obj;
	}
}
