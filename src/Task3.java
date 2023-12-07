public class Task3 {

    // declare static count variable to find 100th prime number in basic()
    public static int count = 0;

    // function to check if number is a prime number
    // prime number : can only be divded by 1 or by itself
    private boolean isPrime(long number) {
        if (number < 2) {
            return false;
        }
        for (long i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    public void test() {
        // given
        long modulus = 65536;
        int multiplier = 137;
        int increment = 1;
        long seed = 0;

        // instantiate
        Lcg lcg = new Lcg(modulus, multiplier, increment, seed);

        // print text to make it pretty
        System.out.print("Test\t|\t");

        // call Lcg method
        for (int i = 0; i < 50; i++) {
            long result = lcg.next();
            
            // check if result is prime number, print result if true
            if(isPrime(result) == true) {
                System.out.print(result + " ");
            }
        }

        System.out.println("");
    }

    public void basic() {
        // given
        long modulus = 65536;
        int multiplier = 137;
        int increment = 1;
        long seed = 0;

        // instantiate
        Lcg lcg = new Lcg(modulus, multiplier, increment, seed);

        // print text to make it pretty
        System.out.print("Basic\t|\t");

        // call Lcg method
        for (int i = 0; i < 1183; i++) {
            long result = lcg.next();
            
            // check if result is prime number, print result if true
            if(isPrime(result) == true) {
                count++;
                if (count == 100) {
                    System.out.print("The 100th prime number is: " + result);
                    break;
                }
            }
        }
    }

    // advance

    public static String encrypt(String plainText) throws Exception {
        Lcg lcg = new Lcg(256, 11, 1, 0);
        byte[] bytes = plainText.getBytes("UTF-8");
        int len = bytes.length;
        byte[] xors = new byte[len];
        for (int ix = 0; ix < len; ix += 1) {
            xors[ix] = (byte) ((int) bytes[ix] ^ ((int) lcg.next()));
        }
        return new String(java.util.Base64.getEncoder().encode(xors), "UTF-8");
    }

    // public static String decrypt(String base64EncodedValue) throws Exception {
    public static String decrypt(String base64EncodedValue) {
        // throw new UnsupportedOperationException("TODO: to be implemented");

        // Goal : reverse engineer encryption logic

        return someString;
    }
    
    public void advance() {
        // intention: to print original string, then it's encrypted version, then it's decrypted version to show effectiveness of decrypt()'s algo
    }
}
