package Module_I.LinkDoubleList;

public class LinkDoubleLIst {
    private NodeDouble inicio;
    private int elements = 0;

    public boolean isEmpty(){
        return (inicio == null && elements == 0);
    }

    public void insertStart(Object element1, Object element2, Object element3){
        if (isEmpty())
            inicio = new NodeDouble(element1,element2,element3);

        NodeDouble newNode = new NodeDouble(element1,element2,element3);
        newNode.setNextNode(inicio);
        inicio = newNode;
        elements++;
    }

    public void insertAt(Object element1, Object element2, Object element3,int index){
        if (isEmpty())
            insertStart(element1,element2,element3);

        NodeDouble act = inicio;
        for (int i = 0; i < index; i++) {
            act = act.getNextNode();
        }

        NodeDouble newNode = new NodeDouble(element1,element2,element3);

        newNode.setNextNode(act.getNextNode());
        newNode.setPrevNode(act);
        act.setNextNode(newNode);
        elements++;
    }

    public void insertEnd(Object element1, Object element2, Object element3){
        if (isEmpty())
            insertStart(element1,element2,element3);

        NodeDouble act = inicio;
        while (act.getNextNode() != null){
            act = act.getNextNode();
        }
        act.setNextNode(new NodeDouble(element1,element2,element3));
        act.getNextNode().setPrevNode(act);
        elements++;
    }




}
