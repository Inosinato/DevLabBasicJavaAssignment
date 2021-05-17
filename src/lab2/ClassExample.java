package lab2;

public class ClassExample {
	
	private String name;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}


	private int id;
	private int age;
	
	ClassExample(String name, int id, int age)
	{
		this.name = name;
		this.id = id;
		this.age = age;
	}
	
	public void display()
	{
		System.out.println("Name is : " + name);
		System.out.println("ID is : " + id);
		System.out.println("Age is : " + age);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassExample c1 = new ClassExample("Jhon", 101, 40);
		c1.display();
	}

}
