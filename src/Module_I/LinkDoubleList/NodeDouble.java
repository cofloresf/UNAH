package Module_I.LinkDoubleList;

public class NodeDouble {
    private Object element1;
    private Object element2;
    private Object element3;
    private NodeDouble next;
    private NodeDouble prev;

    public NodeDouble(Object element1, Object element2, Object element3) {
        this.element1 = element1;
        this.element2 = element2;
        this.element3 = element3;
        this.next = null;
        this.prev = null;
    }

    public Object getElement1() {
        return element1;
    }

    public void setElement1(Object element1) {
        this.element1 = element1;
    }

    public Object getElement2() {
        return element2;
    }

    public void setElement2(Object element2) {
        this.element2 = element2;
    }

    public Object getElement3() {
        return element3;
    }

    public void setElement3(Object element3) {
        this.element3 = element3;
    }

    public NodeDouble getNextNode() {
        return next;
    }

    public void setNextNode(NodeDouble next) {
        this.next = next;
    }

    public NodeDouble getPrevNode() {
        return prev;
    }

    public void setPrevNode(NodeDouble prev) {
        this.prev = prev;
    }
}
