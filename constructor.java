class student{
  String name;
  int age;

  student(String n, int a){
    name = n;
    age = a;
  }
  // student(){
  //   name = "Nidhi";
  //   age = 20;
  // }
  void display(){
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
  }
}


public class constructor {
  public static void main(String a[]){
    student student1 = new student("Nidhi", 20);
    student1.display();
  }
}
//wpj using parameterizd constructor to print name ,rollno,prn of user using scanner sc
//wpj using paramerterized constructor to find add, sub,mul,div of two numbers with scanner sc
//wpj using static variable to display the student detail where clg name will be coming through static variable
