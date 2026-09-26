public class StudentLinkedList {
    private static class Node {
        Student data;
        Node next;

        Node(Student data) {
            this.data = data;
        }
    }

    private Node head;
    private int size;
}