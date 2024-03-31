package com.springcore;

public class Student {

        private int studentId;
        private String studentName;
        private String studentAddress;

        public int getStudentId() {
            return studentId;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "studentId=" + studentId +
                    ", studentName='" + studentName + '\'' +
                    ", studentAddress='" + studentAddress + '\'' +
                    '}';
        }

        public void setStudentId(int studentId) {
            System.out.println("Setting ID");
            this.studentId = studentId;
        }

        public String getStudentName() {
            return studentName;
        }

        public void setStudentName(String studentName) {
            System.out.println("Setting Name");
            this.studentName = studentName;
        }

        public String getStudentAddress() {
            return studentAddress;
        }

        public void setStudentAddress(String studentAddress) {
            System.out.println("Setting Address");
            this.studentAddress = studentAddress;
        }

        public Student() {
        }

        public Student(int studentId, String studentName, String studentAddress) {
            this.studentId = studentId;
            this.studentName = studentName;
            this.studentAddress = studentAddress;
        }
    }
