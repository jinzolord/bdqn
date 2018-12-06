package cn.tcbd.entity;

public class Student {

    private int id, gradeId,age;
    private String studentName, gender, studentNum;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", gradeId=" + gradeId +
                ", age=" + age +
                ", studentName='" + studentName + '\'' +
                ", gender='" + gender + '\'' +
                ", studentNum='" + studentNum + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getGradeId() {
        return gradeId;
    }

    public void setGradeId(int gradeId) {
        this.gradeId = gradeId;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getStudentNum() {
        return studentNum;
    }

    public void setStudentNum(String studentNum) {
        this.studentNum = studentNum;
    }

    public Student() {
    }

    public Student(int id, int gradeId, int age, String studentName, String gender, String studentNum) {
        this.id = id;
        this.gradeId = gradeId;
        this.age = age;
        this.studentName = studentName;
        this.gender = gender;
        this.studentNum = studentNum;
    }
}
