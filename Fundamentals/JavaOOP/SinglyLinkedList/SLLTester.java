package SinglyLinkedList;
public class SLLTester {
    public static void main(String[] args) {
        SinglyLinkedList<String> sll = new SinglyLinkedList<String>();

        sll.AddBack("1");
        sll.AddBack("2");
        sll.AddBack("3");
        sll.AddBack("4");

        String val = sll.removeBack();

    }
}