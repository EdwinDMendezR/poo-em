package patrones.estructura.composite;

import org.junit.jupiter.api.Test;

public class CompositePattern {

    @Test
    public void methodTest() {

        // Arrange
        // Act
        Directory root = new Directory("root");
        Directory home = new Directory("home");
        Directory sam = new Directory("sam");
        File file1 = new File("file1.txt");
        root.add(home);
        home.add(sam);
        sam.add(file1);
        root.display();

        // Assert

    }

}
