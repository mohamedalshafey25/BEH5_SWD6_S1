package session4;
// 2-Aug-2026 (Sun-Online)

public class C1_EnhancedLoop {
    public static void main(String[] args) {

        // Define int array of size 10
        double[] basicSalaries = {10000, 20000, 30000, 40000, 50000, 60000, 70000, 80000, 90000, 100000};

        // New array for taxed salaries
        double[] taxedSalaries = new double[basicSalaries.length];

        // Normal for loop to iterate through the array

        /**
         for (int i =0 ; i<basicSalaries.length ; i++){

         taxedSalaries[i] = basicSalaries[i] * 0.8;
         System.out.println(basicSalaries[i] + " Gross of Net : " + taxedSalaries[i]);
         }
         */

        // Enhanced for loop to iterate through the array
        for (double salary : basicSalaries) {
            System.out.println("Gross Salary : " + salary);
        }


        //TODO Type Casting
        //TODO nested loop for two arrays

    }
}
