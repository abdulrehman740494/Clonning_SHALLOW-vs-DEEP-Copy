package shallowCopy_IMMUTABLE;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student s1 = new Student("Ali", 20);
        Student s2 = (Student) s1.clone(); // Shallow copy

        System.out.println("Before increment:");
        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);

        s2.incrementAge(); // increment in s2

        System.out.println("\nAfter incrementing s2:");
        System.out.println("s2 = " + s2);
        System.out.println("s1 = " + s1); // Immutable fields unchanged
    }
}
