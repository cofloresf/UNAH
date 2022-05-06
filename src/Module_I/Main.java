package Module_I;

import Module_I.LinkSimpleList.LinkSimpleList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Module I: Basic Data Structures");

        int input = 0;
        boolean ban =true;
        Scanner scan = new Scanner(System.in);
        do {
            try{
                System.out.println("\n1. LinkDoubleList\n2. LinkList\n0. Exit\n===============\nSelect a option");
                input = scan.nextInt();
                switch (input) {
                    case 1 -> testLinkSimpleList();
                    case 2 -> testLinkDoubleList();
                    default -> ban = false;
                }
            }catch (NumberFormatException e){
                System.out.println("Enter a option valid");
            }
        }while (ban);

    }

    public static void testLinkSimpleList(){
        System.out.println("List Simple");

        LinkSimpleList list = new LinkSimpleList();

        System.out.println("Add end list numbers of 1 to 5");
        for (int i = 1; i <= 5; i++) {
            list.insertEnd(i);
        }

        System.out.println("Add begging list the number 0");
        list.insertStart(0);
        list.printList();

        System.out.println("\nDelete the element 4");
        list.Delete(4);
        list.printList();

        System.out.println("\nAdd the element 4 in index 2");
        list.insertAt(4,1);
        list.printList();
        System.out.println("\nEdit the element 4 for 87");
        list.editElement(3,87);
        list.printList();
        System.out.printf("\nASize of list: %d\n", list.size());
    }

    public static void testLinkDoubleList(){
        System.out.println("List Double");
    }
}
