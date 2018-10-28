package jp.ac.ritsumei.rcc.sample.model;

public class Student {
    private long number;
    private String name;

    public Student() {

    }

    public Student(long number, String name) {
        this.number = number;
        this.name = name;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
