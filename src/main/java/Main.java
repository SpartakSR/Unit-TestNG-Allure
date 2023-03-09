package online_tusur.unit_online_tusur;
import online_tusur.unit_online_tusur.Student;

import java.util.Arrays;


public class Main {

	//РіР»Р°РІРЅС‹Р№ РјРµС‚РѕРґ РєР»Р°СЃСЃР°
		public static void main(String[] args) {
			// s1, s2, s3 - РѕР±СЉРµРєС‚С‹ РєР»Р°СЃСЃР° Student
			Student s1 = new Student();
			s1.setFirstName("Ivan");
			s1.setLastName("SIDORov");
			s1.setAge(17);
						
			Student s2 = new Student("Ivan", "nIkulin", 18);
			Student s3 = new Student("kONStantin","petrov", 50);
			Student s4 = new Student("Aleksey", "Alekseev", 51);
			
			System.out.println(s1.getFullName() + ", " + s1.getAge());
			System.out.println(s2.getFullName() + ", " + s2.getAge());
			System.out.println(s3.getFullName() + ", " + s3.getAge());
			System.out.println(s4.getFullName() + ", " + s4.getAge());
			
			Student[] students = { s1,s2,s3};
			  Student[] students2 = {new Student("Alexandr", "Ivanov", 17), new Student("Vladimir", "Petrov", 25),
						new Student("Aleksey", "Alekseev", 50), new Student("kONStantin","petrov", 51)};
			  
			System.out.println("AVG= "+Student.avgAge(students2));
			System.out.println("MAX= "+Student.maxAge(students));
			System.out.println("MIN= "+Student.minAge(students));
			
			
		   
		}

}
