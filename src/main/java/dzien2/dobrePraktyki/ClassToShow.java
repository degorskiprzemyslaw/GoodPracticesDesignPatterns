package dzien2.dobrePraktyki;


public class ClassToShow {

    int age = 35267321;

    public void someMethod(String name) {
        int sum = 10;


        int number = 10;

        System.out.println(10);



    }

    public static int sumNumber(int a, int b, String name) {

        int sum = a + b;
        return sum;
    }
}

// trzeba kliknąć na terminal mvn checkstyle:check albo klika sie po prawej pionowy Maven i tam sa w plugins checkstyle
// mvn clean test - komenda do przeprowadzenia testow -> trzeba skomentowac checkstyle, bo jak pojawia sie bledy, to nie dopusci do testow
// mvn jacoco:report -> trzeba zakomentowac execution checkstylea
//trzeba wygenerowac site w targecie -> mvn clean package albo w Mavenie -> Lifecycle package
//nastepnie wchodzimy w pomaranczowy folder target -> site i tam wybieramy cos
//pokazujemy folder w browser i wchodzimy w index.html
