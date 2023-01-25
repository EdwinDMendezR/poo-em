package patrones.composite;

public class File extends Component {

    public File(String name) {
        super(name);
    }

    public void add(Component c) {
        throw new UnsupportedOperationException();
    }

    public void remove(Component c) {
        throw new UnsupportedOperationException();
    }

    public void display() {
        System.out.println(name);
    }

}
