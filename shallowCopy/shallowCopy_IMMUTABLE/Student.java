package shallowCopy_IMMUTABLE;

class Student implements Cloneable {
    private String name; // Immutable fields
    private Integer age; // Immutable fields

    Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    // //This method will create new obj (immutable)
    public void incrementAge() {
        age = age + 1;
    }

    @Override
    public String toString() {
        return "Student_Name = '" + name + "', Age = " + age;
    }

    // Shallow copy
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
