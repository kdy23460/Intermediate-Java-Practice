package prac;

public class Generic <E>{
	private E obj; //�ʵ� 

	public void setObj (E obj) {
		this.obj = obj;
		
		//�ʵ� obj�� �Ű����� obj�� ���� ������ this.obj�� ����
	}

	public E getobj () {
		return obj;
	}
}
