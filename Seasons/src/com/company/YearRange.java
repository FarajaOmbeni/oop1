package com.company;

public class YearRange {
    private int year1;
    private int year2;
    private int range;
    private int firstDivisor;
    private int secondDivisor;

    public YearRange(int a, int b){
        this.year1=a;
        this.year2=b;
    }

    public void setRangeType(int a) {
        this.range = a;
    }
    public void setFirstDivisor(int a){
        this.firstDivisor=a;
    }
    public void setSecondDivisor(int b){
        this.secondDivisor=b;
    }
    public int getFirstDivisor(){
        return this.firstDivisor;
    }
    public int getSecondDivisor(){
        return this.secondDivisor;
    }
    public int getFirstYear(){
        return this.year1;
    }
    public int getSecondYear(){
        return this.year2;
    }
    public void printYears(){
        while (year1<=year2){
            year1++;
            if(year1%firstDivisor==0 && year1%secondDivisor==0)
            System.out.println(year1);
        }
    }
}
