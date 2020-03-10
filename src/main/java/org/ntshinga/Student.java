package org.ntshinga;

public class Student {
    public String name;
    public String studentID;

    public Student() {

    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(String name){
        super();
        this.name = name;
    }
    public String getStudentID(){
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}
