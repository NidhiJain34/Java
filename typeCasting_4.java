public class typeCasting_4 {
  public static void main(String arg[]){
    byte b = 125;
    //byte b = 227;  gives error
    System.out.println(b);
    int a = b;
    System.out.println(a);

    //byte k=a; 
    //System.out.println(k);
    //cant assign an integer to byte directly
    byte k=(byte)a; 
    System.out.println(k);
    float f = 5.6f;
    // int t =f;
    // System.out.println(t);
    int p = (int)f;
    System.err.println(p);

    byte x = 10;
    byte y = 30;
    System.out.println(x*y);
    int res = x*y;
    System.out.println(res);



  }
  
}
