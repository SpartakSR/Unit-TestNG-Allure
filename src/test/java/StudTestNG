package online_tusur.unit_online_tusur;

import static org.testng.Assert.*;

import java.util.*;

import org.testng.AssertJUnit;
import org.testng.annotations.*;
import org.testng.annotations.Optional;
import org.testng.TestNGException;



public class StudTestNG {
  private Student s = new Student();
  
	
	@BeforeTest
	public void bef_class() {
		long id = Thread.currentThread().getId();
		System.out.println("Befor test. Thread id is: "+id);
	}
	
	@AfterTest
	public void aft_class() {
		long id = Thread.currentThread().getId();
		System.out.println("After test. Thread id is: "+id);
	}

/*==============================================================================================================*/	
	/* Тест для геттера getLastName()*/
	
	@DataProvider(name="data2", parallel = true)
	public static Object[][] LastNameData() {
		return new Object[][] {{"ivanov","Ivanov"},{"PETROV","Petrov"}};
	}
	@Test(dataProvider="data2",threadPoolSize = 2)
      public void test1(String lastName, String expLN) {
		s.setLastName(lastName);
		assertEquals(expLN, s.getLastName());
		long id = Thread.currentThread().getId();
		System.out.println("Param test-metod. Thread id is: "+id);
  }
	
/*==========================================================================================================*/		
	
/* Тест для геттера getAge()*/	
	
	@DataProvider(name="data3", parallel = true)
	public static Object[][] AgeData() {
		return new Object[][] {{17,18},{50,50}};
	}
	@Test(dataProvider="data3",threadPoolSize = 2)
      public void test2(int age, int expAge) {
		s.setAge(age);
		assertEquals(expAge, s.getAge());
		long id = Thread.currentThread().getId();
		System.out.println("Param test-metod. Thread id is: "+id);
  }

/*===========================================================================================================*/		
/* Тест расчета среднего возраста студентов */
	
	@DataProvider(name="data1", parallel = true)
	public static Student[] AVGAge1() {
		return new Student[] {new Student("Alexandr", "Ivanov", 17), new Student("Vladimir", "Petrov", 18),
				              new Student("Aleksey", "Alekseev", 50), new Student("kONStantin","petrov", 51)};
	}
	@Test(dataProvider="data1",threadPoolSize = 4)
      public void test3(Student[] medavg) {
		assertEquals(Student.avgAge(medavg), 34);
		long id = Thread.currentThread().getId();
		System.out.println("Param test-metod. Thread id is: "+id);
	}
	
/*============================================================================================================*/		
	/* Вывод регистарционных данных */
	
	@DataProvider(name="data4", parallel = true)
	public static Object[] AVGAge2() {
		return new Object[][] {
				{"alexandr", "ivanov", 17},
				{"Vladimir", "Petrov", 25},
				{"Aleksey", "Alekseev", 50},
				{"kONStantin","petrov", 51}
		};		
		}
	@Test(dataProvider="data4",threadPoolSize = 4)
      public void test4(String firstName, String lastName, int age) {
		s.setLastName(lastName);
		s.setFirstName(firstName);
		s.setAge(age);
		
		System.out.println("Registered student with details: "+s.getFullName()+" "+s.getAge());
		long id = Thread.currentThread().getId();
		System.out.println("Param test-metod. Thread id is: "+id);
	}
		
/*==============================================================================================================*/
	@Test
	@Parameters({"age"})
      public void test5(@Optional ("0") int age) {
	 	s.setAge(age);
		AssertJUnit.assertEquals(50, s.getAge());
		long id = Thread.currentThread().getId();
		System.out.println("Param test-metod. Thread id is: "+id);
  }

/*==============================================================================================================*/	
	@Test
	  public void test6() {
		int age = 17;
		int expAge = 18;
		assertEquals(expAge, s.getAge());
		long id = Thread.currentThread().getId();
		System.out.println("Sample test-metod. Thread id is: "+id);
	  }
	
}
