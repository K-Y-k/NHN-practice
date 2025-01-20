package Annotation1;

public class Person {
    private String name;

    Person(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public String getGender() { 
        return null; 
    }

    @Deprecated // 이제 이 기능은 사라질 예정이다를 알려주는 어노테이션
    public void hey(Person person) {
        System.out.println("Hey, " + person.getName());
    }

    public void hello(Person person) {
        System.out.println("Hello, " + person.getName());
    }
}
