package wyjatki;

public class App {

    public static void main(String[] args) {
//        metoda();

        try {
            jakasMetoda();
            metoda();
        } catch (NullPointerException e) {

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("slabo");
        } catch (JakisWyjatek e) {  // Exception
            System.out.println("wywalil blad");
            e.printStackTrace();
            System.out.println("koniecx programu !!!");
        }
    }
    public static void metoda() {
        int[] tab = new int[5];
        tab[10] = 15;
    }

    public static void sprawdzanieLoginu(String login) throws JakisWyjatek {
        if (login.startsWith("X")) {
            throw new JakisWyjatek();
        }
    }


    public static void jakasMetoda() throws JakisWyjatek {
        sprawdzanieLoginu("XYZ");
    }
}
