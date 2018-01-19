package WrapperClass;

public class NumberClassMethodsTest {
    public static void main(String[] args) {
        Long longValue = new Long(65535);
        byte byteValue = longValue.byteValue();
        System.out.println(byteValue);
        Integer integerValue = new Integer(longValue.intValue());
        System.out.println(integerValue);
        Double floatValue = new Double(45.67);
        System.out.println(floatValue.shortValue());
    }
}
