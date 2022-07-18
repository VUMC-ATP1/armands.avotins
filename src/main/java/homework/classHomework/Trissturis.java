package main.java.homework.classHomework;

public class Trissturis {
    int malaA;
    int malaB;
    int malaC;
    double laukums;
    double pusperimetrs ;

    public Trissturis() {
    }

    public Trissturis(int malaA, int malaB, int malaC) {
    /*
    Heron’s formula  from https://www.britannica.com/science/Herons-formula
    Area = Square root of √s(s - a)(s - b)(s - c)
    where s is half the perimeter, or (a + b + c)/2.
    */
        this.malaA=malaA;
        this.malaB=malaB;
        this.malaC=malaC;
        this.pusperimetrs=(malaA + malaB + malaC) * 0.5;
       // System.out.println(pusperimetrs);
        this.laukums =Math.sqrt((pusperimetrs * (pusperimetrs - malaA) * (pusperimetrs - malaB) * (pusperimetrs - malaC)));
       // System.out.println(laukums);
    }

//    public double aprekinatLaukumu() {
//        this.pusperimetrs = (malaA + malaB + malaC) * 0.5;
//        this.laukums = Math.sqrt((pusperimetrs * (pusperimetrs - malaA) * (pusperimetrs - malaB) * (pusperimetrs - malaC)));
//        return laukums;
//
//    }

    public boolean irVienadmalu() {
        return (malaA == malaB && malaB == malaC && malaA==malaC ) ;
    }

    public boolean irVienadsanu() {
        return (malaA == malaB || malaB == malaC || malaA == malaC);

    }
}
