package patrones.estructura.composite;

import java.util.ArrayList;
import java.util.List;

public class Directory extends Component {

    private List<Component> children = new ArrayList<>();

    public Directory(String name) {
        super(name);
    }

    public void add(Component c) {
        children.add(c);
    }

    public void remove(Component c) {
        children.remove(c);
    }

    public void display() {
        System.out.println(name);
        for (Component c : children) {
            c.display();
        }
    }

}
