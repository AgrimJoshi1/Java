package Class5;

public class string2 {
    public static void main(String[] args) {
       String name = "Agrim Joshi";
       //String name = new String("Agrim");
       System.out.println(name);
       System.out.println(name.length());
       System.out.println(name.charAt(0));
       String s1 = "Agrim";
       System.out.println(s1.equals(name));
       System.out.println(name.contains(s1));
       System.out.println(name.indexOf("Agrim"));
       
       String s2 = "Agrim";
       if (name == s2) {
           System.out.println("Both are same");
       } else {
           System.out.println("Both are not same");
       }
       
       if(name.equals(s2)) {
           System.out.println("Both are same");
       } else {
           System.out.println("Both are not same");
       }
       s1 = s1 + " Joshi";
       System.out.println(s1);
       System.out.println(s2);

       String s3 = "Agrim Joshi";
       if(name.equals(s3)) {
           System.out.println("Both are same");
       } else {
           System.out.println("Both are not same");
       }

       if(name == s3) {
           System.out.println("Both are same");
       } else {
           System.out.println("Both are not same");
       }

       String r = "Agrim";
       String s = r;
       r = r + " Joshi";
       System.out.println(r);
       System.out.println(s);

       /* StringBuilder sb = new StringBuilder("Agrim");
       StringBuffer sbf = new StringBuffer("Agrim");
       if (sb == sbf) {
           System.out.println("Both are same");
       } else {
           System.out.println("Both are not same");
       } */

       String str = "Hello";
       System.out.println(str.toUpperCase());
       System.out.println(str.toLowerCase());
    
}
}