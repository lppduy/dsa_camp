public class SampleString {

  public static void xinChaoSep(String s) {

    if(s.equals("Boss")) {
      System.out.println("Xin chao sep a!");
    } else {
      System.out.println("Chao!");
    }
  }
  
  public static void main(String[] args) {
    String s = "Phuong Duy 123";
    // String s2 = new String("PDUY");

    // for (int i = 0; i < s.length(); i++) {
    //   char c = s.charAt(i);
    //   if(Character.isDigit(c)==true){
    //     System.out.println(c+" ");
    //   }
    // }

    // char c = 'A';
    // System.out.println(c+" ASCII: "+(int)c);

    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      // if(c >=48 && c<=57){
      //   System.out.println(c+" ");
      // }
      if(c >='0' && c<='9'){
        System.out.println(c+" ");
      }
      if(c >='A' && c<='Z'){
        System.out.println(c+" ");
      }
    }

    String s1 = "Hello";
    String s2 = "Hello";
    String s3 = new String("Hello");

    System.out.println("s1==s2: "+(s1==s2));
    System.out.println("s2==s3: "+(s2==s3));
    System.out.println("s1==s3: "+(s1==s3));

    System.out.println("s1.equals(s2): "+(s1.equals(s2)));
    System.out.println("s2.equals(s3): "+(s2.equals(s3)));
    System.out.println("s1.equals(s3): "+(s1.equals(s3)));

    String k1="Boss";
    String k2= new String("Boss");
    xinChaoSep(k1);
    xinChaoSep(k2);
  }
}
