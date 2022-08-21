public class Main {
    public static void main(String[] args) {
        Fighter A = new Fighter("A" , 15 , 100, 90, 50);
        Fighter B = new Fighter("B" , 15 , 100, 90, 50);
        Ring r = new Ring(A, B, 90 , 100);
        r.run();
    }
}