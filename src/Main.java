public class Main {
    public static void main(String[] args) {
        int supplement = 1200;
        int bonus;
        if (supplement > 1000) {
            bonus = supplement / 100;
        } else {
            bonus = 0;
        }
        System.out.println(bonus);
    }
}


