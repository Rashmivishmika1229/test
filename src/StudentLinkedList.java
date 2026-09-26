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

    public Student search(int studentId) {
        Node current = head;
        while (current != null) {
            if (current.data.getStudentId() == studentId) {
                return current.data;
            }
            current = current.next;
        }
        return null;
    }
}