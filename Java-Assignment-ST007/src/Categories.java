import java.util.PriorityQueue;

public class Categories implements Comparable<Categories> {

    private PriorityQueue priority;

    public PriorityQueue getPriority() {
        return priority;
    }

    public void setPriority(PriorityQueue priority) {
        this.priority = priority;
    }

    public Categories() {}

    public Categories(PriorityQueue priority) {
        this.priority = priority;
    }

    @Override
    public int compareTo(Categories o) {
        return 0;
    }
}
