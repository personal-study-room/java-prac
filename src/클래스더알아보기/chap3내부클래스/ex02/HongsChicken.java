package 클래스더알아보기.chap3내부클래스.ex02;

public class HongsChicken {
    private String name;
    public HongsChicken (String name) {
        this.name = name;
    }

    //  매장신설 TF팀 - 본사에서 창설
    public static class LaunchTF {
        private String title;
        private String leader;

        public LaunchTF(String title, String leader) {
            this.title = title;
            this.leader = leader;
        }

        public HongsChicken launch () {
            //  ⚠️ 인스턴스 필드는 사용 불가
            //  System.out.println(this.name);
            return new HongsChicken(title);
        }
    }

    //  매장마다의 기프트 - 매장에서 배부
    class Gift {
        private String message;

        public Gift(String to) {
            this.message = "From 얄코치킨 %s점 to %s님"
                    .formatted(name, to);
        }
    }

    public Gift getGift (String to) {
        return new Gift(to);
    }
}
