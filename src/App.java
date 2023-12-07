public class App {
    public static void main(String[] args) throws Exception {

        Task1 task1 = new Task1();
        System.out.println("- Task 1 -");
        task1.test();
        task1.basic();
        task1.advance();
        System.out.println("");

        Task2 task2 = new Task2();
        System.out.println("- Task 2 -");
        task2.test();
        task2.basic();
        task2.advance();
        System.out.println("");

        Task3 task3 = new Task3();
        System.out.println("- Task 3 -");
        task3.test();
        task3.basic();
        task3.advance();
    }
}
