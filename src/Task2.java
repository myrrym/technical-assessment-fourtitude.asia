public class Task2 {

    public void test() {
        int sum = 0;
        int[] array = {2, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        for (int i : array) {
            sum += i;

            // if sum is even
            if (sum % 2 == 0) {
                sum = sum / 2;
            }
            // if sum is odd
            else {
                sum = (sum - 1) / 2;
            }
        }

        // print check digit
        System.out.println("Test\t|\tCheck digit: " + sum);

        // push check digit into array
        int newArrayLength = array.length + 1;
        int[] newArray = new int[newArrayLength];

        System.arraycopy(array, 0, newArray, 0, array.length);

        int newElement = sum;
        newArray[newArrayLength - 1] = newElement;

        // update the reference to the original array
        array = newArray;

        // print the updated array
        StringBuilder result = new StringBuilder();
        for (int i : array) {
            result.append(i);
        }
        System.out.println("Test\t|\tGenerated value: " + result.toString());
    }

    public void basic() {
        int sum = 0;
        int[] array = {9, 8, 0, 6, 2, 4, 7, 7, 1, 2, 3};

        for (int i : array) {
            sum += i;

            // if sum is even
            if (sum % 2 == 0) {
                sum = sum / 2;
            }
            // if sum is odd
            else {
                sum = (sum - 1) / 2;
            }
        }

        // print check digit
        System.out.println("Basic\t|\tCheck digit: " + sum);

        // *note:   below code commented because question only asked to provide answer for check digit,
        //          and comment left here to provide context to the answer and is used for checking purposes

        // push check digit into array
        // int newArrayLength = array.length + 1;
        // int[] newArray = new int[newArrayLength];

        // System.arraycopy(array, 0, newArray, 0, array.length);

        // int newElement = sum;
        // newArray[newArrayLength - 1] = newElement;

        // // update the reference to the original array
        // array = newArray;

        // // print the updated array
        // StringBuilder result = new StringBuilder();
        // for (int i : array) {
        //     result.append(i);
        // }
        // System.out.println("Basic\t|\tGenerated value: " + result.toString());
    }

    public void advance() {
        // Goal (how I'm understanding it) :
        // (1) Find out check digit for numbers in range 1 - 1 000 000
        // (2) Tally the frequencies for each number
        // (3) See if uniformly distributed (i.e. all frequency = 7)
        // (4) If not uniformly distributed, what number has highest frequency

        // Strategy :
        // (1) create 2-d array to store frequency of check digits (0-9)
        // (2) Create a loop from 1 - 1 000 000
        //      Part 1
        //          (a) create array that holds numbers
        //          (b) if number at index 0 < 9, number++
        //          (c) if number at index 0 = 9, push number 1 to index 0, increase index of other numbers
        //      Part 2
        //          (a) run check digit algo
        //          (b) trace 2-d array to store check digit frequency (++)
    }
}
