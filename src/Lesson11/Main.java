package Lesson11;

public class Main {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        MyClass.ProfessionalData professionalData = obj.new ProfessionalData();
        MyClass.InnerStatic innerSt = new MyClass.InnerStatic();

        MyInterface anonymousInitObject = new MyInterface() {
            @Override
            public void doSmt1() {

            }

            @Override
            public void doSmt2() {

            }
        };
        anonymousInitObject.doSmt1();
        anonymousInitObject.doSmt2();

        MyAbstactClass myAbstactObj = new MyAbstactClass() {
            @Override
            public void doAbstrStuff1() {
                System.out.println("doAbstrStuff1..");
            }

            @Override
            public void doAbstrStuff2() {
                System.out.println("doAbstrStuff2..");
            }
        };
        myAbstactObj.doAbstrStuff1();
        myAbstactObj.doAbstrStuff2();
        myAbstactObj.getMyInt();
    }
}
