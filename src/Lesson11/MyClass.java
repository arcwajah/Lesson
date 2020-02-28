package Lesson11;

public class MyClass {
    private int myPropertyInt;
    private String myPropertyString;
    private ProfessionalData professionalData;

    /*public MyClass(int myPropertyInt, String myPropertyString, ProfessionalData professionalData) {
        this.myPropertyInt = myPropertyInt;
        this.myPropertyString = myPropertyString;
        this.professionalData = professionalData;
    }*/

    class ProfessionalData {
        public ProfessionalData() {
            this(12, 12, "er");
            System.out.println("Hello from Default!!!");
        }

        public ProfessionalData(int salary, int taxes, String department) {
            this.salary = salary;
            this.taxes = taxes;
            this.department = department;
        }

        private int salary;
        private int taxes;
        private String department;
    }

    public static class InnerStatic {

    }


}
