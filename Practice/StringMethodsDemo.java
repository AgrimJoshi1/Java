package Practice;
public class StringMethodsDemo {
    public static void main(String[] args) {

        // length()
        String str1 = "Programming";
        System.out.println("length(): " + str1.length());

        // charAt()
        String str2 = "Java";
        System.out.println("charAt(0): " + str2.charAt(0));

        // equals()
        String a = "Java";
        String b = "Java";
        System.out.println("equals(): " + a.equals(b));

        // equalsIgnoreCase()
        String c = "java";
        String d = "JAVA";
        System.out.println("equalsIgnoreCase(): " + c.equalsIgnoreCase(d));

        // compareTo()
        String e = "Apple";
        String f = "Banana";
        System.out.println("compareTo(): " + e.compareTo(f));

        // contains()
        System.out.println("contains(\"gram\"): " + str1.contains("gram"));

        // startsWith()
        System.out.println("startsWith(\"Ja\"): " + str2.startsWith("Ja"));

        // endsWith()
        System.out.println("endsWith(\"va\"): " + str2.endsWith("va"));

        // indexOf()
        System.out.println("indexOf('g'): " + str1.indexOf("g"));

        // lastIndexOf()
        System.out.println("lastIndexOf('m'): " + str1.lastIndexOf("m"));

        // substring()
        System.out.println("substring(3): " + str1.substring(3));

        // toUpperCase()
        System.out.println("toUpperCase(): " + c.toUpperCase());

        // toLowerCase()
        System.out.println("toLowerCase(): " + d.toLowerCase());

        // replace()
        System.out.println("replace('a','o'): " + str2.replace('a', 'o'));

        // trim()
        String str3 = "  Java  ";
        System.out.println("trim(): '" + str3.trim() + "'");

        // isEmpty()
        String str4 = "";
        System.out.println("isEmpty(): " + str4.isEmpty());

        // isBlank() (Java 11+)
        String str5 = "   ";
        System.out.println("isBlank(): " + str5.isBlank());

        // concat()
        System.out.println("concat(): " + str2.concat(" Programming"));

        // split()
        String str6 = "Java DSA";
        String[] arr = str6.split(" ");
        System.out.println("split():");
        for (String s : arr) {
            System.out.println(s);
        }

        // valueOf()
        String num = String.valueOf(10);
        System.out.println("valueOf(): " + num);

        // toCharArray()
        char[] chars = str2.toCharArray();
        System.out.println("toCharArray():");
        for (char ch : chars) {
            System.out.print(ch + " ");
        }
        System.out.println();

        // matches()
        String str7 = "12345";
        System.out.println("matches(\"[0-9]+\"): " + str7.matches("[0-9]+"));

        // intern()
        String str8 = new String("Java");
        System.out.println("intern(): " + str8.intern());
    }
}

