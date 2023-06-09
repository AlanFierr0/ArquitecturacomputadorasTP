public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Ascii ascii = new Ascii();
        BCD bcd = new BCD();
        System.out.println(calc.fromHex("A7F"));
        System.out.println(calc.toHex("101001111111"));
        System.out.println(calc.sumBinary("1001010", "100101010101"));
        System.out.println(calc.subBinary("01010110101", "101010010000"));
        System.out.println(calc.subBinary("01010110101", "001010010"));
        System.out.println(calc.mult("1010", "101"));
        System.out.println(ascii.decode("A7F"));
        System.out.println(ascii.encode("100000101101111000110"));
        System.out.println(bcd.encode(150));
        System.out.println(bcd.decode("000101010000"));
        System.out.println(ascii.encode("001101110010110011010"));
        }
    }

