package com.example.android.reportcard;

public class ReportCard {

    private String studentName;
    private String year;
    private int physics;
    private int english;
    private int maths;

    public ReportCard(String studentName, String year, int physics, int english, int maths) {
        this.studentName = studentName;
        this.year = year;
        this.physics = physics;
        this.english = english;
        this.maths = maths;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String name) {
        studentName = name;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public int getPhysics() {
        return physics;
    }

    public void setPhysics(int physics) {
        if (physics>=0)
        this.physics = physics;
    }

    public int getEnglish() {
        return english;
    }

    public void setEnglish(int english) {
        if (english>=0)
        this.english = english;
    }

    public int getMaths() {
        return maths;
    }

    public void setMaths(int maths) {
        if (maths>=0)
        this.maths = maths;
    }

    @Override
    public String toString() {
        return "ReportCard{" +
                ", studentName='" + studentName + '\'' +
                ", year='" + year + '\'' +
                ", physics=" + physics +
                ", english='" + english + '\'' +
                ", maths=" + maths +
                '}';
    }
}