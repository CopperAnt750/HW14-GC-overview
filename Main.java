import java.util.LinkedList;
import java.util.List;

public class Main {

    static final List<Object[]> arrays = new LinkedList<>();

    public static void main(String[] args) {

        for (; ; ) {
            arrays.add(new Object[100000000]);
        }
    }
}

