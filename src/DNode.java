public class DNode {
    private DNode next;
    private DNode prev;
    private Object data;

    //All-in-one Constructor
    public DNode(DNode next, DNode prev, Object data) {
        this.next = next;
        this.prev = prev;
        this.data = data;
    }

    //Data Getter-Setters

    public Object getData() {
        return data;
    }
    public void setData(Object data) {
        this.data = data;
    }

    //Node Getter-Setters

    public DNode getNext() {
        return next;
    }
    public void setNext(DNode next) {
        this.next = next;
    }
    public DNode getPrev() {
        return prev;
    }
    public void setPrev(DNode prev) {
        this.prev = prev;
    }


}
