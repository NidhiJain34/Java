class StudentStatic {
  
  int id ;
  String name;

  public static void main(String[] args){
    StudentStatic s1 = new StudentStatic();
    StudentStatic s2 = new StudentStatic();
    s1.id = 101;
    s1.name = "Nidhi";
    System.out.println("ID: " + s1.id); 
    System.out.println("Name: " + s1.name);
    s2.id = 102;
    s2.name = "Amit"; 
    System.out.println("ID: " + s2.id);
    System.out.println("Name: " + s2.name);
  }
}
