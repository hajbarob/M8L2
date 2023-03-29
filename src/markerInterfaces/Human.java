package markerInterfaces;

import java.io.Serializable;

public class Human implements Cloneable, Serializable {

    private final String name;

    public Human(String name) {
        this.name = name;
    }

    public Human(Human human) {
        this.name = human.getName();
    }

    public String getName() {
        return name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new Human(this);
    }
}
