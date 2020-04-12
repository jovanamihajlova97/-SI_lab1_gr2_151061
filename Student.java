class Student {
	String index;
	String firstName;
	String lastName;
	int grades[];

	//TODO constructor
	public Student(String index,String firstName,String lastName,int grades[]){
	this.index=index;
	this.firstName=firstName;
	this.lastName=lastName;
	this.grades=grades[];
}

public Student(){
}
	
	//TODO seters & getters
	public String getindex(){
		return index;
	}
	public void setIndex(String index){
	this.index=index;
}
	public String getfirstName(){
		return firstName;
}
	public void setFirstName(String firstName){
	this.firstName=firstName;
}
	public String getlastName(){
		return lastName;
}
	public void setLastName(String lastName){
	this.lastName=lastName;
}
	public int get grades[](){
		return grades;
}
	public void setGrades(int grades[]){
	this.grades=grades[];
}
	public double getAverage() {
		average=total/grades.length;
		return average;

	}

	public int ECTSCredits() {
		//TODO
	int credits=0;
	credits=total*6;
	}
public static void main (String[] args){
int[] grades={6,7,8,9,10};
int total=0;
for (int i=0;i<grades.length;i++){
total=total+grades[i];
}
