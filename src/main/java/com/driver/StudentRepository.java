package com.driver;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Repository
public class StudentRepository {
    HashMap<String,Student> studentDb = new HashMap<>();
    HashMap<String,Teacher> teacherDB = new HashMap<>();
    HashMap<String,List<String>> pairDb = new HashMap<>();

    public void addStudent(Student student) {
        studentDb.put(student.getName(),student);
    }

    public void addTeacher(Teacher teacher) {
        teacherDB.put(teacher.getName(),teacher);
    }

    public List<String> getAllStudent() {
        List<String> allStudent = new ArrayList<>();
        for(String str : studentDb.keySet()) {
            Student std = studentDb.get(str);
            allStudent.add(std.getName());
        }
        return allStudent;
    }

    public Student getStudentByName(String name) {
        return studentDb.get(name);
    }

    public Teacher getTeacher(String name) {
        return teacherDB.get(name);
    }

    public void deleteAllTeacher() {
        teacherDB.clear();
    }

    public void deleteTeacher(String teacher) {
        Teacher teach = teacherDB.get(teacher);
        teacherDB.remove(teach.getName());
    }

    public List<String> getStudent(String teacher) {
        List<String> std = pairDb.get(teacher);
        return std;
    }

    public void addPair(String student, String teacher) {
        List<String> pair = pairDb.get(teacher);
        if(pair != null) {
            pair.add(student);
            pairDb.put(teacher,pair);
        }else {
            pair = new ArrayList<>();
            pair.add(student);
            pairDb.put(teacher,pair);
        }
    }
}
