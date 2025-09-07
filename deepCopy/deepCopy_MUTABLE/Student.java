package deepCopy.deepCopy_MUTABLE;

import java.util.Arrays;

class Student implements Cloneable {
    private String name;
    private int[] marks; // mutable array

    Student(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
    }

    // Increment marks
    public void increment() {
        for (int i = 0; i < marks.length; i++) {
            marks[i] += 5; // increment by 5
        }
    }

    @Override
    public String toString() {
        return "Student's name = '" + name + "', Marks = " + Arrays.toString(marks);
    }

    // Deep copy
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Student cloned = (Student) super.clone(); // shallow copy
        cloned.marks = marks.clone(); // deep copy for array
        return cloned;
    }
}
