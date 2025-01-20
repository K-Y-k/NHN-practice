package Annotation1;

public class Woman extends Person {
    Woman(String name) {
        super(name);
    }

    @Override
    public String getGender() {
        return "Woman";
    }
}
