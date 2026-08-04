package session5;

public class C0_Main {

    public static void main(String[] args) {
//
//        C1_TrainingCompany skillsDynamix = new C1_TrainingCompany();
//        skillsDynamix.name = "Skills Dynamix";
//        skillsDynamix.address = "123 Main Street";
//        skillsDynamix.availability = true;
//        skillsDynamix.capacity = 200;
//
//        skillsDynamix.displayCompanyInfo();
//        skillsDynamix.teachCourse("Java Programming");
//
//        //
//
//        C1_TrainingCompany techSolutions = new C1_TrainingCompany();
//        techSolutions.name = "Tech Solutions";
//        techSolutions.address = "456 Elm Avenue";
//        techSolutions.availability = false;
//        techSolutions.capacity = 150;
//
//        techSolutions.displayCompanyInfo();
//        techSolutions.teachCourse("Python Programming");


        // Using parameterized constructor
        C1_TrainingCompany codeMasters = new C1_TrainingCompany("Masters", "789", 100, true);
        codeMasters.displayCompanyInfo();

        C1_TrainingCompany tp2 = new C1_TrainingCompany("Traing Providers");
        tp2.displayCompanyInfo();

        C1_TrainingCompany tp3 = new C1_TrainingCompany("tp3", "address");
    }
}
