package 클래스.클래스02기초활용예제.ex03;

public class ChickenStore {

    int no;
    String name;
    ChickenMenu[] menus;

    public ChickenStore(int no, String name, ChickenMenu[] menus) {
        this.no = no;
        this.name = name;
        this.menus = menus;
    }

    ChickenMenu orderMenu(String name) {
        for (ChickenMenu menu : menus) {
            if (menu.name.equals(name)) return menu;
        }
        return null;
    }
}
