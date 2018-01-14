package Strings;

public class Initialization {
    public static void main(String[] args) {
        String s;
        s = "Madhu";
        System.out.println(s);
        String s1 = "Nira";
        System.out.println(s1);
        String s2 = new String("Balaji");
        System.out.println(s2);
        char arr[] = {'c','h','a','i','r'};
        String s3 = new String(arr);
        System.out.println(s3);
        String s4 = new String(arr,2,3);
        String snew1 = s2.substring(0,4);
        System.out.println(snew1);
        System.out.println(s4);
        System.out.println(s1.concat(s));
        System.out.println(s1.charAt(1));
        System.out.println(s.length());
        System.out.println(s.compareTo(s1));
        System.out.println(s1.compareTo(s));
        System.out.println(s1.compareTo("NIRA"));
        String s5 = "Madhu";
        System.out.println(s.equals(s5));
        System.out.println((s.concat(s1)).endsWith("ira"));
        System.out.println((s.concat(s1)).startsWith("Mad"));
        System.out.println(s.indexOf('d'));
        System.out.println(("This is Madhu").indexOf("is"));
        System.out.println(("This is Madhu").lastIndexOf("is"));
        System.out.println(s.compareToIgnoreCase("MADHU"));
        System.out.println(s.equalsIgnoreCase("MADHU"));
        System.out.println(s.toUpperCase());
        System.out.println(("NIRAMADHU").toLowerCase());
        System.out.println(("NIRAMADHU").substring(1));
        System.out.println(("NIRAMADHU").substring(1,4));
        System.out.println(" Nira Madhu ".trim());
        char arr1[] = new char[20];
        s.getChars(1,4,arr1,1);
        System.out.println(arr1);
        String arr2[] = "Niramadhu".split("ma");
        for (String a : arr2){
            System.out.println(a);
        }

        String arr3[] = "Niramadhu".split("a");
        for (String a : arr3){
            System.out.println(a);
        }

        String str = new String("Ajay");
        String str1 = new String("Ajay");
        String str2 = "Ajay";
        String str3 = "Ajay";
        System.out.println((str == str1));
        System.out.println((str2 == str3));
    }
}
