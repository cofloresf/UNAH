package Module_I.LinkSimpleList;

public class LinkSimpleList {
    private NodoSimple inicio;
    private int elements = 0;

    public boolean isEmpty(){
        return (inicio==null && elements == 0);
    }

    public void insertStart(Object element){
        if (isEmpty()){
            inicio = new NodoSimple(element);
            elements ++;
            return;
        }
        NodoSimple temp = new NodoSimple(element);
        temp.setNextNodo(inicio);
        inicio = temp;
        elements++;
    }

    public void insertAt(Object element, int index){
        if (isEmpty() || index == 0)
            insertStart(element);

        NodoSimple act = inicio;
        for (int i = 0; i < index; i++) {
            act = act.getNextNodo();
        }
        NodoSimple newNode = new NodoSimple(element);

        newNode.setNextNodo(act.getNextNodo());
        act.setNextNodo(newNode);
        elements++;
    }

    public void insertEnd(Object element){
        if (isEmpty()) {
            insertStart(element);
            return;
        }

        NodoSimple nodeAct = inicio;
        while (nodeAct.getNextNodo() != null){
            nodeAct = nodeAct.getNextNodo();
        }
        nodeAct.setNextNodo(new NodoSimple(element));
        elements++;
    }

    public void Delete(Object element){
        if (isEmpty())
            return;

        if (inicio.getElement() == element){
            if (inicio.getNextNodo() == null)
                inicio = null;
            else
                inicio = inicio.getNextNodo();
            elements--;
        }
        else {
            NodoSimple actual = inicio;

            while (actual.getNextNodo() != null && actual.getNextNodo().getElement() != element)
                actual = actual.getNextNodo();

            if (actual.getNextNodo() == null)
                System.out.println("elemento " + element + " no esta en la lista");
            else {
                actual.setNextNodo(actual.getNextNodo().getNextNodo());
                elements--;
            }
        }

    }

    public void printList(){
        if (isEmpty())
            return;

        System.out.println("========Printing========");
        NodoSimple nodeAct = inicio;
        System.out.println("Elements: " + elements);
        while (nodeAct.getNextNodo() != null){
            System.out.printf("%d, ",nodeAct.getElement());
            nodeAct = nodeAct.getNextNodo();
        }
        System.out.printf("%d ",nodeAct.getElement());
    }

    public int size() {
        return elements;
    }

    public void editElement(Object element,Object newElement){
        if (isEmpty())
            return;

        if (inicio.getElement() == element){
            if (inicio.getNextNodo() == null)
                inicio = null;
            else
                inicio = inicio.getNextNodo();
            elements--;
        }
        else {
            NodoSimple actual = inicio;

            while (actual.getNextNodo() != null && actual.getNextNodo().getElement() != element)
                actual = actual.getNextNodo();

            if (actual.getNextNodo() == null)
                System.out.println("elemento " + element + " no esta en la lista");
            else {
                actual.setElement(element);
            }
        }
    }
}