package 클래스더알아보기.chap6열거형.ex03;

public class HongsChicken {
    static HongsChickenMenu[] menus = HongsChickenMenu.values();

    public void takeOrder(String menuName) {
        HongsChickenMenu ordered = null;

        for (HongsChickenMenu menu : menus) {
            if (menu.getName().equals(menuName)) {
                ordered = menu;
            }
        }

        if (ordered == null) {
            System.out.println("해당 메뉴가 없습니다");
            return;
        }

        System.out.println(ordered.getPrice() + "원입니다");
    }
}
