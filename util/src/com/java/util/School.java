package com.java.util;

public class School implements Comparable<School> {
    private String major;
    private Integer grade;

    public School(String major, Integer grade) {
        this.major = major;
        this.grade = grade;
    }

    public School() {
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    @Override
    public int compareTo(School school) {
        return this.getGrade() - school.getGrade();
    }
}
