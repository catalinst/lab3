package isp.lab3.exercise1;

public class Tree {
    int height;

    Tree() {
        height = 15;
    }

    public void grow(int meters) {
        if (meters >= 1) {
            height += meters;
        }
    }

    @Override
    public String toString() {
        return "Tree{" +
                "height=" + height +
                '}';
    }
}
