class instance {
  String name;
  void display(){
    System.out.println(name);
  }
  public static void main(String[] args) {
    instance obj1 = new instance();
    obj1.name = "Nidhi";
    obj1.display();

  }
}
