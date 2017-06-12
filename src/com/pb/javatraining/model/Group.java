package com.pb.javatraining.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Group {

    public String title;
    public int groupNumber;
    public Collection<Student> students = new ArrayList<>();

    public Group(String title, int groupNumber) {
        this.title = title;
        this.groupNumber = groupNumber;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    public Collection<Student> getStudents() {
        return students;
    }

    public void setStudents(Collection<Student> students) {
        this.students = students;
    }

    public void addStudent(Student [] students) {
        Collections.addAll(this.students, students);
    }

    public Integer avarageMarks () {
        return (int) students.stream().mapToDouble(Student::avarageMark).average().getAsDouble();
    }

    @Override
    public String toString() {
        return "Group{" +
                "title='" + title + '\'' +
                ", groupNumber=" + groupNumber +
                ", students=" + students +
                "}\n";
    }

    // TODO override equals

}
