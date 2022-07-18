package main.java.homework.classHomework;

public class Main {
    public static void main(String[] args) {
        Trissturis trissturis1 = new Trissturis();

        trissturis1.malaA=3;
        trissturis1.malaB=3;
        trissturis1.malaC=3;

        System.out.println("vienādmalu? "+ trissturis1.irVienadmalu());
        System.out.println("vienādsānu? "+ trissturis1.irVienadsanu());
       // System.out.println("aprekinatl? "+ trissturis1.aprekinatLaukumu());

        System.out.println("tagad trissturis2");

        Trissturis trissturis2 = new Trissturis(3,3,3);
        System.out.println("vienādmalu? "+ trissturis2.irVienadmalu());
        System.out.println("vienādsānu? "+ trissturis2.irVienadsanu());
        System.out.println("Laukums no klases "+ trissturis2.laukums);

    }
}
