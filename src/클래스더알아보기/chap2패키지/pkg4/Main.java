package 클래스더알아보기.chap2패키지.pkg4;

import 클래스더알아보기.chap2패키지.pkg1.Parent;

import 클래스더알아보기.chap2패키지.pkg3.*; //와일드 카드
//import 클래스더알아보기.chap2패키지.pkg3.Cls1;
//import 클래스더알아보기.chap2패키지.pkg3.Cls2;
//import 클래스더알아보기.chap2패키지.pkg3.Cls3;

public class Main {
    public static void main(String[] args) {
        Parent parent = new Parent();

        //  ⭐️ 패키지가 다른 동명의 클래스들을 불러올 경우
        클래스더알아보기.chap2패키지.pkg1.Child child1 = new 클래스더알아보기.chap2패키지.pkg1.Child();
        클래스더알아보기.chap2패키지.pkg2.Child child2 = new 클래스더알아보기.chap2패키지.pkg2.Child();

        Cls1 cls1 = new Cls1();
        Cls2 cls2 = new Cls2();
        Cls3 cls3 = new Cls3();
    }
}
