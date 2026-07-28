package session3;

public class C4_Array {
    public static void main(String[] args) {
    // example 1
        String [] names = {"Mohamed","Ahmed","Dahy"};
        String [] Students = new String[3];

        for (int i = 0; i< names.length ; i++) {
            System.out.println(names[i]);
        }
//        System.out.println(names[5]); // This will throw an ArrayIndexOutOfBoundsException because the index 5 is out of bounds for the array of size 3.

    // example  2
        int[] numbers = {1, 2, 3, 4, 5};
        double[] salaries = {10000.5, 200000.5, 300000.5, 400000.5, 50000.5};
        for (int i = 0; i < salaries.length; i++) {
            salaries[i] = salaries[i] + 1444;
            System.out.printf("Salary after bonus of %d element = %.2f \n", i+1, salaries[i]);
        }

        //TODO enhanced for


    }


}
