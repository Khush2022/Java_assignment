

package Numpyninja;

public class Student {

	//properties or variable
	 public int Geography;
	 public int English;
	 public int Socialstudies;
	 public int Literature;
	 public int NoOfSubject = 4;
	 
	 
			 
	public Student (int Geography, int English, int Socialstudies, int Literature) 
	{
		this.Geography = Geography;
		this.English = English;
		this.Socialstudies = Socialstudies;
		this.Literature = Literature;
	}
		//this function will return average marks of all subject
		int avgMarks ()
		{
		 int avg = (this.Geography + this.English + this.Socialstudies + this.Literature)/NoOfSubject;
		 return avg;
		}
		
		//this function will return total marks of all four subjects
		int sumOfMarks ()
		{
			int sum = (this.Geography + this.English + this.Socialstudies + this.Literature);
			return sum;		
		}
		
		public static void main(String[] args) {
			//project starts 
			
			Student Student_1 = new Student(80,70,90,60);
			System.out.println("***** Student 1 *****");
			System.out.println("Average marks : " +Student_1.avgMarks());
			System.out.println("Sum Of Marks : " +Student_1.sumOfMarks());
		    System.out.println();
		    Student Student_2 = new Student(55,85,75,95);
			System.out.println("***** Student 2 *****");
			System.out.println("Average marks : " +Student_2.avgMarks());
			System.out.println("Sum Of Marks : " +Student_2.sumOfMarks());
		    System.out.println();
		    
		}

}