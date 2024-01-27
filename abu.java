package task10;

public class abu {
char name;
int age;
abu(){
	System.out.println("This is Default Constructor");
	
	name = Deepak;   
    age= 50;
			
}
}

class Constructor{
	public static void main(String[] args) {
		
		abu obj = new abu();
		System.out.println(obj.name);
		System.out.println(obj.age);

	}

}
