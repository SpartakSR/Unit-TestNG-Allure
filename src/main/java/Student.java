package online_tusur.unit_online_tusur;

 class Student {
//РїРѕР»СЏ РєР»Р°СЃСЃР°
	private String firstName;
	private String lastName;
	private int age;

//РєРѕРЅСЃС‚СЂСѓРєС‚РѕСЂ СЃ Р°СЂРіСѓРјРµРЅС‚Р°РјРё
	public Student(String firstName, String lastName, int age) {
		setFirstName(firstName);
		setLastName(lastName);
		setAge(age);
	}

//РєРѕРЅСЃС‚СЂСѓРєС‚РѕСЂ РїРѕ СѓРјРѕР»С‡Р°РЅРёСЋ
	public Student() {
	}

//РіРµС‚С‚РµСЂС‹ Рё СЃРµС‚С‚РµСЂС‹
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		if (firstName.length() > 1) {
			this.firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1).toLowerCase();
		} else {
			this.firstName = firstName.toUpperCase();
			}
		
		 	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		if (lastName.length() > 1) {
			this.lastName = Character.toUpperCase(lastName.charAt(0)) + lastName.substring(1).toLowerCase();
		} else {
			this.lastName = lastName;
		}
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age > 17 && age < 50 ? age : 18;
	}

	public String getFullName() {
		return getLastName() + " " + getFirstName();
	}

//РјРµС‚РѕРґ РґР»СЏ СЂР°СЃС‡РµС‚Р° СЃСЂРµРґРЅРµРіРѕ РІРѕР·СЂР°СЃС‚Р°
    public static int avgAge(Student [] array) {
		int avg = 0;
		int ageSum=0;
		
		for (int i = 0; i < array.length; i++) {
			ageSum += array[i].age;
		}
		avg= ageSum / array.length;
		
		return avg;
	}
	
//РјРµС‚РѕРґ РґР»СЏ СЂР°СЃС‡РµС‚Р° РјРёРЅРёРјР°Р»СЊРЅРѕРіРѕ РІРѕР·СЂР°СЃС‚Р°
public static int minAge(Student [] array) {

	int min=100;		// С‚РµРєСѓС‰РёР№ РјРёРЅРёРјР°Р»СЊРЅС‹Р№ РІРѕР·СЂР°СЃС‚ 
	
	for (int i=0; i < array.length; i++){
			if (array[i].getAge() < min) { 
				min = array[i].getAge();
			}
		
	}
		return min;
		}
		
//РјРµС‚РѕРґ РґР»СЏ СЂР°СЃС‡РµС‚Р° РјР°РєСЃРёРјР°Р»СЊРЅРѕРіРѕ РІРѕР·СЂР°СЃС‚Р°
public static int maxAge(Student [] array) {

int max=0; // С‚РµРєСѓС‰РёР№ РјР°РєСЃРёРјР°Р»СЊРЅС‹Р№ РІРѕР·СЂР°СЃС‚

for (int i=0; i < array.length; i++){
if (array[i].getAge() > max) {
max = array[i].getAge();
}

}
return max;
}
		
}
