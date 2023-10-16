package 클래스.클래스08추상클래스.ex02;

public class DropDown extends FormElement{

    private String[] menus;

    public DropDown(int space, String[] menus) {
        super(space);
        this.menus = menus;
    }

    @Override
    void func() {
        System.out.println("메뉴 선택\n- - - - - - -");
        for (String menu : menus) {
            System.out.printf(" - %s%n", menu);
        }
    }
}
