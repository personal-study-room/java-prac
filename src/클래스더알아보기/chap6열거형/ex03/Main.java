package 클래스더알아보기.chap6열거형.ex03;

public class Main {
    public static void main(String[] args) {
        HongsChickenMenu menu1 = HongsChickenMenu.YN;
        HongsChickenMenu menu2 = HongsChickenMenu.RS;
        HongsChickenMenu menu3 = HongsChickenMenu.XX;

        var menu1Name = menu1.getName();
        var menu2Price = menu2.getPrice();
        var menu1Desc = menu3.getDesc();

        menu2.setPrice(16000);
        var menu2NewPrice = menu2.getPrice();

        //  ⭐️ 열거형의 메소드들

        var byNames = new HongsChickenMenu[] {
                HongsChickenMenu.valueOf("FR"),
                HongsChickenMenu.valueOf("PP"),
                HongsChickenMenu.valueOf("GJ"),
                //  YalcoChickenMenu.valueOf("NN"), // ⚠️ 런다임 에러
        };

        //  💡 name 메소드 : 각 항목의 이름 반환
        var names = new String[] {
                menu1.name(), menu2.name(), menu3.name()
        };

        //  💡 ordinal 메소드 : 순번 반환
        var orders = new int[] {
                menu1.ordinal(), menu2.ordinal(), menu3.ordinal()
        };

        //  💡 values 메소드 : 전체 포함된 배열 반환
        //  YalcoChickenMenu[] 자료형
        var menus = HongsChickenMenu.values();

        for (var menu : menus) {
            System.out.println(menu.getDesc());
        }

        System.out.println("\n- - - - -\n");

        HongsChicken store1 = new HongsChicken();

        for (var menuName : "양념치킨,능이백숙,땡초치킨".split(",")) {
            store1.takeOrder(menuName);
        }
    }
}
