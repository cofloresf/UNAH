package Module_I.LinkSimpleList;

public class NodoSimple {
    private Object element;
    private NodoSimple nextNodo;

    public NodoSimple (Object element, NodoSimple nextNodo){
        this.element = element;
        this.nextNodo = nextNodo;
    }

    public NodoSimple(Object element) {
        this.element = element;
        this.nextNodo = null;
    }

    public Object getElement() {
        return element;
    }

    public void setElement(Object element) {
        this.element = element;
    }

    public NodoSimple getNextNodo() {
        return nextNodo;
    }

    public void setNextNodo(NodoSimple nextNodo) {
        this.nextNodo = nextNodo;
    }
}
