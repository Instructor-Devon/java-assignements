public class SinglyLinkedList<T> {
    private SLLNode<T> head;
    public SinglyLinkedList() {
        this.head = null;
    }
    private boolean IsEmpty() {
        return this.head == null;
    }
    public void AddFront(T value) {
        SLLNode<T> newNode = new SLLNode<T>(value);
        if(head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public void AddBack(T value) {
        SLLNode<T> newNode = new SLLNode<T>(value);
        if(head == null) {
            head = newNode;
            return;
        }
        SLLNode<T> runner = this.head;
        while(runner.next != null) {
            runner = runner.next;
        }
        runner.next = newNode;
    }
    public boolean Contains(T value) {
        SLLNode<T> runner = this.head;
        while(runner != null) {
            if(runner.Equals(value))
                return true;
            runner = runner.next;
        }
        return false;

    }
    public void DisplayValues() {
        if(IsEmpty()) {
            System.out.println("List is empty");
            return;
        }

        SLLNode<T> runner = this.head;
        while(runner.next != null) {
            System.out.println("$$$$$$$$$$$$$$$$");
            String s = String.format("Node Value: %s :: Next Value: %s", runner.value, runner.next.value);
            System.out.println(s);
            runner = runner.next;
        }
        System.out.println("$$$$$$$$$$$$$$$$");
        String s = String.format("Node Value: %s :: Next Value: null", runner.value);
        System.out.println(s);
    }
    public static void Tester() {
        SinglyLinkedList<int[]> sll = new SinglyLinkedList<int[]>();
        
        sll.AddFront(new int[]{1,2,3});
        sll.AddFront(new int[]{5,6,8});
        sll.DisplayValues();
        System.out.println(sll.Contains(new int[]{1,2,3}));
        System.out.println(sll.Contains(new int[]{3,2,5}));
    }
}