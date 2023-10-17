package generic.제네릭05와일드카드;

public class Main {
    public static void main(String[] args) {
        //  아무 유닛이나 태우는 말
        Horse<Unit> avante = new Horse<>(); // Horse<Unit>에서 Unit 생략
        avante.setRider(new Unit());
        avante.setRider(new Knight());
        avante.setRider(new MagicKnight());


        // 기사 계급만 태우는 말
        Horse<Knight> sonata = new Horse<>();
//        sonata.setRider(new Unit()); // 불가. 왜? 선언한 클래스 하위 클래스의 인스턴스만 가능
        avante.setRider(new Knight());
        avante.setRider(new MagicKnight());

        //마법기사만 태우는 말
        Horse<MagicKnight> grandeur = new Horse<>();
        grandeur.setRider(new MagicKnight());


        // ⚠️ 자료형과 제네릭 타입이 일치하지 않으면 대입 불가
        // - 제네릭 타입이 상속관계에 있어도 마찬가지
//        Horse<Unit> wrongHorse1 = new Horse<Knight>();
//        Horse<Knight> wrongHorse2 = new Horse<Unit>();
//        avante = sonata;
//        sonata = grandeur;

        /*
         왜 안될까?
                  좌                    우
              Horse<Unit>       new Horse<Knight>();
               T -> Unit           T -> Knight
            => 애초에 클래스를 정의하는 타입이 다른 문제이다.
        */

        /* 위의 방법을 해결 하기 위해선? */
        // ⭐️ 와일드 카드 - 제네릭 타입의 다형성을 위함

        // Knight 와 그 자식 클래스만 받을 수 있음
        // 기사 계급 이상을 태우는 말 이상만 대입 가능한 것
        Horse<? extends Knight> knightHorse;
        knightHorse = new Horse<Knight>();
        knightHorse = new Horse<MagicKnight>();
//        knightHorse = new Horse<Unit>(); // 불가

        knightHorse = grandeur;
        knightHorse = sonata;
//        knightHorse = avante; // 불가

        // Knight 와 그 상위 클래스만 대입 가능하도록 하려면?
        Horse<? super Knight> nonLuxuryHorse;
        nonLuxuryHorse = new Horse<Unit>();
        nonLuxuryHorse = new Horse<Knight>();
//        nonLuxuryHorse = new Horse<MagicKnight>(); // 불가




        HorseShop.intoBestSellers(avante);
        HorseShop.intoBestSellers(sonata);
        HorseShop.intoBestSellers(grandeur);

//        HorseShop.intoPremiums(avante); // ⚠️ 불가
        HorseShop.intoPremiums(sonata);
        HorseShop.intoPremiums(grandeur);

        HorseShop.intoEntryLevels(avante);
        HorseShop.intoEntryLevels(sonata);
//        HorseShop.intoEntryLevels(grandeur); // ⚠️ 불가





        //  ⭐️ 제네릭은 변수에 들어올 값에 대한 제한
        //  - 데이터 그 자체에 대함이 아님
        Horse[] horses = { avante, sonata, grandeur };
        for (Horse horse : horses) {
            horse.setRider(new Unit());
        } // ⁉️ 에러 발생하지 않음
    }
}
