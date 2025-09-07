package shallowCopy_MUTABLE;

import java.util.Arrays;

class Candidate implements Cloneable {
    private String name;
    private int[] marks; // mutable array

    Candidate(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
    }

    // Increment marks
    public void increment() {
        for (int i = 0; i < marks.length; i++) {
            marks[i] += 5; // increment +5
        }
    }

    @Override
    public String toString() {
        return "Candidate_Name = '" + name + "', Marks = " + Arrays.toString(marks);
    }

    // Shallow copy (NO new array only reference copied )
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); // shallow copy
    }

}
