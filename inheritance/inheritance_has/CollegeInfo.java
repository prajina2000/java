public class CollegeInfo{

	public static void main(String[] args) {

		HeadOfDepartment hod1 = new HeadOfDepartment("Sumathi", 55, 65000.00f, "MCA");
		HeadOfDepartment hod2 = new HeadOfDepartment("Reshmi", 45, 65000.00f, "MBA");

		HeadOfDepartment[] hod = {hod1, hod2};

		Principal princi1 = new Principal("Rajesh", 88, 1000000.00f, 4);

		Professors professor1 = new Professors("Savitha", 28, 40000.00f, "JAVA");
		Professors professor2 = new Professors("Kavtha", 30, 45000.00f, "Python");
		Professors professor3 = new Professors("Maneesh", 35, 42000.00f, "C++");
		Professors professor4 = new Professors("Athul", 40, 35000.00f, "JavaScript");

		Professors[] professor = {professor1, professor2, professor3, professor4};


		Students student1 = new Student("Anish", 24, "MCA");
		Students student2 = new Student("Maneesh", 25, "MBA");
		Students student3 = new Student("Athul", 23, "MCA");
		Students student4 = new Student("Sumant", 24, "MBA");
		Students student5 = new Student("Prajwal", 23, "MCA");
		Students[] student = {student1,student2, student3, student4, student5};



		IHRDCollege ihrd = new IHRDCollege(hod, princi1, student, professor,4,12);
		ihrd.printDetails();



		// SDM COLLEGE

		HeadOfDepartment hod3 = new HeadOfDepartment("Prajina", 55, 65000.00f, "MCA");
		HeadOfDepartment hod4 = new HeadOfDepartment("Swathi", 45, 65000.00f, "MBA");

		HeadOfDepartment[] s_hod = {hod3, hod4};

		Principal princi2 = new Principal("Suresh", 60, 1000000.00f, 2);

		Professors professor5 = new Professors("Namitha", 28, 40000.00f, "JAVA");
		Professors professor6 = new Professors("Rajith", 30, 45000.00f, "Python");
		Professors professor7 = new Professors("Sumanth", 35, 42000.00f, "C++");
		Professors professor8 = new Professors("Mohan", 40, 35000.00f, "JavaScript");

		Professors[] s_professor = {professor5, professor6, professor7, professor8};


		Student student0 = new Student("Rijesh", 24, "MCA");
		Student student6 = new Student("Sujay", 25, "MBA");
		Student student7 = new Student("Pankaj", 23, "MCA");
		Student student8 = new Student("Ravi", 24, "MBA");
		Student student9 = new Student("Praji", 23, "MCA");
		Student[] s_student = {student0,student6, student7, student8, student9};



		SDMCollege sdm = new SDMCollege(s_hod, princi2, s_student, s_professor,15);
		sdm.printDetails();

	}
}