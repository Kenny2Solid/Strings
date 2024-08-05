public class Strings
{
    public static void main(String[] args) {
        byte byteValue = 15;
        byte shortValue = 10;
        int intValue = 5;
        long longTotal = 80000L - 5L * (byteValue + shortValue + intValue);
        System.out.println(longTotal);
    }
}
