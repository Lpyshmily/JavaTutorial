import java.util.Arrays;

public class Try {
    public static void main(String[] args) {
        Group g = new Group();
        g.setNames("Albert", "Curry");
        System.out.println(Arrays.toString(g.names));
    }
}

class Group {
    public String[] names;

    public void setNames(String... _names) {
        this.names = _names;
    }
}
