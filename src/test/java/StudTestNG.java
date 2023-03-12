package online_tusur.unit_online_tusur;


import static org.testng.AssertJUnit.assertEquals;

import org.testng.annotations.*;



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
/* Параметризированный тест для геттера getLastName()*/
	
	@DataProvider(name="data1", parallel = true)
	public static Object[][] LastNameData() {
		return new Object[][] {{"iVaNoV","Ivanov"},{"PeTrOv","Petrov"},{"k", "K"},{"P","P"}};
	}
	@Test(dataProvider="data1",threadPoolSize = 2)
      public void test1(String lastName, String expLN) {
		s.setLastName(lastName);
		assertEquals(expLN, s.getLastName());
  }
	
/*--------------------------------------------------------------------------------------------------------------*/		
/* Параметризированный тест для геттера getFirstName()*/
	
	@DataProvider(name="data2", parallel = true)
	public static Object[][] FirstNameData() {
		return new Object[][] {{"damir","Damir"},{"TIMUR","Timur"},{"d", "D"},{"T","T"}};
	}
	@Test(dataProvider="data2",threadPoolSize = 2)
      public void test2(String firstName, String expFN) {
		s.setFirstName(firstName);
		assertEquals(expFN, s.getFirstName());
  }
/*--------------------------------------------------------------------------------------------------------------*/		
/* Параметризированный тест для геттера getAge()*/	
	
	@DataProvider(name="data3", parallel = true)
	public static Object[][] AgeData() {
		return new Object[][] {{17,18},{18,18},{50,50},{51,18}};
	}
	@Test(dataProvider="data3",threadPoolSize = 2)
      public void test3(int age, int expAge) {
		s.setAge(age);
		assertEquals(expAge, s.getAge());
  }

/*==============================================================================================================*/	
/* Проверка метода расчета среднего возраста студентов */
	 @Test
	 public void test_AVG() {
	    Student[] students2 = {
	    		new Student("ivan", "sidorov", 20),
	    		new Student("IVAN", "NIKULIN", 18),
				new Student("kONSTANTIN","pETROV", 40),
				new Student("Mihail","Petrov", 30)};
	 	assertEquals(27, Student.avgAge(students2));	
	 }
	 
/* Проверка метода расчета максимального возраста студентов */
	  @Test
	  void test_MAX() {
	    Student[] students2 = {
	    		new Student("ivan", "sidorov", 17),
	    		new Student("IVAN", "NIKULIN", 18),
				new Student("kONSTANTIN","pETROV", 49),
				new Student("Mihail","Petrov", 40)};
	 	assertEquals(49, Student.maxAge(students2));	
	 }
/* Проверка метода расчета минимального возраста студентов */
	  @Test
	  void test_MIN() {
	    Student[] students2 = {
	    		new Student("ivan", "sidorov", 20),
	    		new Student("IVAN", "NIKULIN", 18),
				new Student("kONSTANTIN","pETROV", 40),
				new Student("Mihail","Petrov", 45)};
	 	assertEquals(18, Student.minAge(students2));	
	 }
/* Проверка регистра записи фамилии и имени студентов */
	  @Test
	  void test_name() {
	    s.setFirstName("iVaN");
		s.setLastName("sIdOrOv");
	 	assertEquals(s.getFullName(),("Sidorov Ivan"));	
	 }
}

