package P15;

public class DoubleLinkedList28 {
        Node28 head;
        int size;
    
        public DoubleLinkedList28() {
            head = null;
            size = 0;
        }
    
        public boolean isEmpty() {
            return head == null;
        }
    
        public void addFirst(int item, int jarak) {
            if (isEmpty()) {
                head = new Node28(null, item, jarak, null);
            } else {
                Node28 newNode = new Node28(null, item, jarak, head);
                head.prev = newNode;
                head = newNode;
            }
            size++;
        }
    
        public void addLast(int item, int jarak) {
            if (isEmpty()) {
                addFirst(item,jarak);
            } else {
                Node28 current = head;
                while (current.next != null) {
                    current = current.next;
                }
                Node28 newNode = new Node28(current, item, jarak, null);
                current.next = newNode;
                size++;
            }
        }
    
        public void add(int item,int jarak, int index) throws Exception {
            if (isEmpty()) {
                addFirst(item,jarak);
            } else if (index < 0 || index > size) {
                throw new Exception("Nilai indeks diluar batas");
            } else {
                Node28 current = head;
                int i = 0;
                while (i < index) {
                    current = current.next;
                    i++;
                }
                if (current.prev == null) {
                    Node28 newNode = new Node28(null, item,jarak, current);
                    current.prev = newNode;
                    head = newNode;
                } else {
                    Node28 newNode = new Node28(current.prev, item,jarak, current);
                    newNode.prev = current.prev;
                    newNode.next = current;
                    current.prev.next = newNode;
                    current.prev = newNode;
                }
            }
            size++;
        }
    
        public int size() {
            return size;
        }
    
        public void clear() {
            head = null;
            size = 0;
        }
    
        public void print() {
            if (!isEmpty()) {
                Node28 tmp = head;
                while (tmp != null) {
                    System.out.print(tmp.data + "\t");
                    tmp = tmp.next;
                }
                System.out.println("\nBerhasil diisi");
            } else {
                System.out.println("Linked List Kosong");
            }
        }
        public void removeFirst() throws Exception {
            if (isEmpty()) {
                throw new Exception("Linked List masih kosong, tidak dapat dihapus");
            }else if (head.next != null) {
                head=head.next;
                head.prev = null;
                size--;
            }
        }
        public void removeLast()throws Exception{
            if (isEmpty()) {
                throw new Exception("Linked List masih kosong, tidak dapat dihapus");
            }else if (head.next==null) {
                head = null;
                size--;
                return;
            }
            Node28 current =head;
            while (current.next.next != null) {
                current = current.next;
            }
            current.next = null;
            size--;
        }
        public void remove(int index) {
            Node28 current = head;
            while (current!=null) {
                if (current.data == index) {
                    if (current.prev!=null) {
                        current.prev.next=current.next;
                    }else{
                        head=current.next;
                    }
                    if (current.next!=null) {
                        current.next.prev=current.prev;
                    }
                    size--;
                    break;
                }
                current=current.next;
            }
        }
        public int getFirst()throws Exception {
            if (isEmpty()) {
                throw new Exception("Linked List Kosong");
            }
            return head.data;
        }
        public int getLast()throws Exception{
            if (isEmpty()) {
                throw new Exception("Linked List Kosong");
            }
            Node28 tmp = head;
            while (tmp.next!=null) {
                tmp=tmp.next;
            }
            return tmp.data;
        }
        public int get(int index) throws Exception{
            if (isEmpty()|| index>=size) {
                throw new Exception("Nilai indeks di luar batas");
            }
            Node28 tmp = head;
            for (int i = 0; i < index; i++) {
                tmp=tmp.next;
            }
            return tmp.data;
        }

        public int getJarak(int index) throws Exception{
            if (isEmpty()|| index>=size) {
                throw new Exception("Nilai indeks di luar batas");
            }
            Node28 tmp = head;
            for (int i = 0; i < index; i++) {
                tmp=tmp.next;
            }
            return tmp.jarak;
        }
    }
