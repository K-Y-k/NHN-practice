public class Guitarist {
    private int no;
    private String name;
    private String teamName;   
    private String guitar;

    // 기본 생성자를 막음
    private Guitarist(Builder builder) {
        this.no = builder.no;
        this.name = builder.name;
        this.teamName = builder.teamName;
        this.guitar = builder.guitar;
    }

    @Override
    public String toString() {
        return "no:" + no + 
               "\nname:" + name + 
               "\nteamName:" + teamName + 
               "\nguitar:" + guitar;
    }
    
    /* 생성자에 너무 많은 필드 값을 넣을 때의 번거로움을 위해
     * Builder 클래스 구현 */
    public static class Builder { // static으로 선언하지 않으면 메모리 누수
        private int no;
        private String name;
        private String teamName;   
        private String guitar;

        public Builder no(int no) {
            this.no = no;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder teamName(String teamName) {
            this.teamName = teamName;
            return this;
        }

        public Builder guitar(String guitar) {
            this.guitar = guitar;
            return this;
        }

        public Guitarist build() {
            return new Guitarist(this);
        }
    }
}

class Test10 {
    public static void main(String[] args) {
        Guitarist g1 = new Guitarist.Builder()
            .no(1)
            .name("Slash")
            .teamName("Guns and Roses")
            .guitar("Lespaul").build();
            
        Guitarist g2 = new Guitarist.Builder()
            .no(2)
            .name("Celine")
            .guitar("Lespaul").build();
        
        System.out.println(g1);
        System.out.println();
        System.out.println(g2);
    }
}
