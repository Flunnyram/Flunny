public class Main {

    public static void main(String[] args) {
        int piglet = 0;
        int ham = 1;
        int pork;
        for (int i = 0; i < 10; i++) {
            pork = piglet + ham;
            piglet = ham;
            ham = pork;
            System.out.println(pork);
        }
        int Joooo = 1;
        for (int i=1; i<7; i++) {
            Joooo= Joooo * i;}
        System.out.println(Joooo);
    }
}