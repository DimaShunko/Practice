package TaskTwo;

public class LinList {

    public Node head;

    public LinList() {
        head = null;
    }

    public class Node{
        public int data;
        public Node next;

        public Node(int data) {
            this.data = data;
            next = null;
        }
    }

    public void add(int data){
        Node newNode = new Node(data);
        Node currentNode = head;

        if(head == null){
            head = newNode;
        }else {
            while(currentNode.next != null){
                currentNode = currentNode.next;

            }
            currentNode.next = newNode;
        }
    }

    public void remove(int data){
        Node currentNode = head;
        Node prev = null;
        while(currentNode.next != null){
            if(currentNode.data == data) {
                System.out.println(currentNode);
                if (currentNode == head) {
                    head = currentNode.next;
                } else {
                    prev.next = currentNode.next;
                }
            }

            prev =currentNode;
            currentNode = currentNode.next;
        }
    }

    public void print(){
        Node currentNode = head;

        if(head != null){
            System.out.println(head.data);
        }

        while(currentNode.next != null){
            currentNode = currentNode.next;
            System.out.println(currentNode.data);
        }
    }
}
