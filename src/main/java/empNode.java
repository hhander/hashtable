public class empNode {
    public int id;
    public String name;
    public empNode next;

    public empNode(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "empNode{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
