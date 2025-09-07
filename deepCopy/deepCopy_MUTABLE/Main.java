package deepCopy.deepCopy_MUTABLE;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student s1 = new Student("Ali", new int[] { 70, 80, 90 });
        Student s2 = (Student) s1.clone();

        System.out.println("Before increment:");
        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);

        s2.increment();

        System.out.println("\nAfter incrementing s2:");
        System.out.println("s2 = " + s2);
        System.out.println("s1 = " + s1); // s1 unaffected (deep copy)
    }
}
