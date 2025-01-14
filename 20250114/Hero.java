public class Hero {
    protected String name;

    // 생성자를 따로 선언하지 않으면 Object의 기본 생성자가 자동으로 적용됨
    public Hero() {
    }

    // 생성자에 인자 전달로 초기화 하는 방식
    public Hero(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}

class IronMan extends Hero {
    private String reactor;

    public IronMan(String name, String reactor) {
        // 부모 생성자 활용 방식
        // 이 방식이 가능한 이유는 부모 객체도 같이 생성되기 때문
        // 즉, 1.Object 2.IronMan, 3.Hero 순서로 모두 생성됨
        
        // 부모를 이렇게 따로 생성자를 만든 경우는 
        // 자식 생성자에서 super로 반드시 호출해줘야 한다.
        
        // super로 호출해줘야 하는 경우 첫줄에 작성해야 한다.
        super(name);

        this.reactor = reactor;
    }

    public String get() {
        return this.name;
    }
}

class Test10 {
    public static void main(String[] args) {
        Hero h = new Hero("Hulk");
        System.out.println(h.getName());

        Hero h2 = new IronMan("IronMan", "Tony");

    }
}