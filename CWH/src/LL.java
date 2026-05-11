
public class LL {
    Node head;
    int size;

    public LL() {
        this.size=0;
    }

    
    public static void main(String[] args) {
        LL list = new LL();
        list.addFirst(12);
        list.addFirst(10);
        list.addLast(25);
        list.addFirst(27);
        list.addFirst(30);
        list.printList();
        list.size();
        System.out.println("=============Delete============");
        list.deleteFirst();
        list.deleteLast();
        list.printList();
        list.size();
        System.out.println("=============Reverse============");
        list.reverseList();
        list.printList();
        list.size();

        

    }

    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head ==null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
        
        
    }
    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = newNode;
            return;
        }
        

        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }
        
        currNode.next = newNode;
        
    }
    public void deleteFirst(){
        if(head == null){
            System.out.println("The List is empty");
            return;
        }
        size--;
        head = head.next;
        
        
    }

    public void deleteLast(){
        if(head == null){
            System.out.println("The List is empty");
            return;
        }
        size--;
        if(head.next == null){
            head = null;
            return;
        }

        Node currNode = head;
        while(currNode.next.next != null){
            currNode = currNode.next;
        }
        currNode.next = null;


    }

    public void printList(){
        if(head == null){
            System.out.println("List is Empty");
            return;
        }
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.val + " ->");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }
    public  void  size() {
        System.out.println(size);

    }

    class Node{
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
        public Node(int val, Node next){
            this.val = val;
            this.next = next;
        }
        
    }

    
    public void reverseList() {
        if(head == null){
            System.out.println("List is Empty");
            return;
        }
        Node prev = null;
        Node curr = head;

        while(curr != null){
            Node next = curr.next;
            curr.next = prev;
            prev= curr;
            curr = next;

        }
        head = prev;


    }
    
}
