package shallowCopy_MUTABLE;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Candidate s1 = new Candidate("Ali", new int[] { 90, 80, 60 });
        Candidate s2 = (Candidate) s1.clone(); // shallow copy

        System.out.println("Before increment:");
        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);

        s2.increment(); // s2 me change karenge

        System.out.println("\nAfter incrementing s2:");
        System.out.println("s2 = " + s2);
        System.out.println("s1 = " + s1); // Increment in s2 , s1 also channged due to shallow copy
    }
}
