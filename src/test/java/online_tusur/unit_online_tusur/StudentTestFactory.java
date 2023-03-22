package online_tusur.unit_online_tusur;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.*;

/* Динамические тесты с помощью аннотации @Factory */

public class StudentTestFactory {
	@Factory
	public Object[] testFactory() {
		return new Object [] {new TestStudent()};
	}
}
	class TestStudent {
		@DataProvider(name="dataST")
		public Object [][] Students(){
			return new Object [][] {
				{"Alexandr","Ivanov",18,new Student("alexandr", "ivanov", 17)}, 
				{"Vladimir","Petrov",18,new Student("VLADIMIR", "PETROV", 18)},
		        {"Aleksey","Alekseev",50,new Student("Aleksey", "Alekseev", 50)}, 
		        {"Konstantin","Petrov",18,new Student("kONSTANTIN","pETROV", 51)}
			};
		}
	

  @Test(dataProvider="dataST")
  public void test4(String firstName, String lastName, int age, Student s) {
	  assertEquals(firstName, s.getFirstName());
  }
  
  @Test(dataProvider="dataST")
  public void test5(String firstName, String lastName, int age, Student s) {
	  assertEquals(lastName, s.getLastName());
  }
  
  @Test(dataProvider="dataST")
  public void test6(String firstName, String lastName, int age, Student s) {
	  assertEquals(age, s.getAge());
}
	}
