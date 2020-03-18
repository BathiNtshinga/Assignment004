package org.ntshinga;

public class Student {
    public String name;
    public String studentID;
    public int id;

    public Student() {

    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(int id, String name){
        this.id=id;
        this.name = name;
    }
    public String getStudentID(){
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }
    @Override
    public int hashCode(){
        final int prime = 31;
        int result =1;
        result = prime * result + ((name== null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Student other = (Student) obj;
        if (name == null){
            if (other.name != null)
                return false;
        }else if(name.equals(other.name))
            return false;
        return true;
    }
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}
