package SinglyLinkedList;
public class SLLNode<T> {
    public T value;
    public SLLNode<T> next;
    public SLLNode(T val) {
        this.value = val;
        this.next = null;
    }
    public boolean Equals(T comparer) {
        return value.toString().equals(comparer.toString());
    }
}