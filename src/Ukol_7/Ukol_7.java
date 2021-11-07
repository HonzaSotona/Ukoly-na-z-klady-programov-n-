package Ukol_7;
import java.util.regex.Pattern;
    public class Ukol_7 {

        private Ukol_7() {
            Kostka obj1 = new Kostka(6);
            System.out.println("Číslo které kostka hodí  : " + obj1.hodKostkou());
            System.out.println(obj1);

            ValidatorTextu obj2 = new ValidatorTextu("^[A-Z][a-z]+ [A-Z][a-z]+$");
            System.out.println("Jan Sotona: " + obj2.validuj("Jan Sotona")); //true
            System.out.println("jansotona: " + obj2.validuj("jansotona"));  //false

            System.out.println(obj2);
        }

        public static void main(String[] args) {
            new Ukol_7();
        }
    }
