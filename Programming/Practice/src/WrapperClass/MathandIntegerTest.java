package WrapperClass;

import com.sun.org.apache.xpath.internal.operations.Bool;

public class MathandIntegerTest {
    public static void main(String[] args) {
        Integer integer1 = 123;
        System.out.println("Binary string: "+Integer.toBinaryString(integer1));
        System.out.println("Hexadecimal string: "+Integer.toHexString(integer1));
        System.out.println("Octal string: "+Integer.toOctalString(integer1));
        Boolean bol1 = true;
        Boolean bol2 = false;
        System.out.println(bol1.equals(bol2));
        System.out.println(bol1.compareTo(bol2));
        System.out.println(bol1.toString());
        System.out.println(Boolean.parseBoolean("true"));
        System.out.println(Boolean.valueOf("true"));
    }
}
