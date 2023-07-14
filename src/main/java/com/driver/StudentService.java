package com.driver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository = new StudentRepository();
    public void addStudent(Student student) {
        studentRepository.addStudent(student);
    }

    public void addTeacher(Teacher teacher) {
        studentRepository.addTeacher(teacher);
    }

    public List<String> getAllStudent() {
        return studentRepository.getAllStudent();
    }

    public Student getStudentByName(String name) {
        return studentRepository.getStudentByName(name);
    }

    public Teacher getTeacher(String name) {
        return studentRepository.getTeacher(name);
    }

    public void deleteAllTeacher() {
        studentRepository.deleteAllTeacher();
    }

    public void deleteTeacher(String teacher) {
        studentRepository.deleteTeacher(teacher);
    }

    public List<String> getStudent(String teacher) {
        return studentRepository.getStudent(teacher);
    }

    public void addPair(String student, String teacher) {
        studentRepository.addPair(student,teacher);
    }
}
