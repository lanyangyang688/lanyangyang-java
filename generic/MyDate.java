package com.generic;

/**
 * @author lanyangyang
 */
public class MyDate implements Comparable<MyDate>{
    private int year;
    private int mouth;
    private int day;

    public MyDate(int year, int mouth, int day) {
        this.year = year;
        this.mouth = mouth;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMouth() {
        return mouth;
    }

    public void setMouth(int mouth) {
        this.mouth = mouth;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return "MyDate{" +
                "year=" + year +
                ", mouth=" + mouth +
                ", day=" + day +
                '}';
    }

    @Override
    public int compareTo(MyDate o) {//把year- mouth-day的比较放在这
        //如果name相同就比较 birthday - year
        int yearMinus = year - o.getYear();
        if (yearMinus != 0 ){
            return yearMinus;
        }
        //如果year相同就比较 mouth
        int mouthMinus = mouth - o.getMouth();
        if (mouthMinus != 0 ){
            return mouthMinus;
        }
        return day - o.getDay();
    }
}
