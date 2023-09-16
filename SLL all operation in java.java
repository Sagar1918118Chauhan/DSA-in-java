/* LinkedList Operationin java
  1.Create
  2.Display/traverse
  3.Insert
        ->at beg
        ->at end
        ->at any specific location
   4.Deletion
               ->at beg 
               ->at end 
               ->from any loc
   
    */
    import java.util.Scanner;

    class SLL {
        class Node {
            int data;
            Node next;
    
            public Node(int data) {
                this.data = data;
                this.next = null;
            }
        }
    
        Node head;
    
        public void create() {
            Node newNode;
            Node endNode = null;
            int item;
            char ch;
            Scanner sc = new Scanner(System.in);
            do {
                System.out.println("Please enter Element to create List");
                item = sc.nextInt();
                newNode = new Node(item);
                if (head == null) {
                    head = newNode;
                    endNode = newNode;
                } else {
                    endNode.next = newNode;
                    endNode = newNode;
                }
                System.out.println("Do you want to add more elementsin List? (y/n)");
                ch = sc.next().charAt(0);
            } while (ch == 'y' || ch == 'Y');
        }
        public void display()
        {
            Node temp;
            temp=head;
            System.out.println("Element present in SLL=");
            while(temp!=null)
            {
                System.out.println(temp.data);
                temp=temp.next;
                
                
            }
        }
    public void InsertAtBeg()
    {
        Node newnode;
        int item;
        Scanner sc=new Scanner(System.in);
           System.out.println("Enter the element to insert at beg in SLL");
           
           item=sc.nextInt();
           newnode= new Node(item);
           newnode.next=head;
           head=newnode;
           
           }
    public void InsertAtEndSLL()
           {
            Node newnode;
            Node temp;
            int item;
        Scanner sc=new Scanner(System.in);
           System.out.println("Enter the element to insert at end in SLL");
           
           item=sc.nextInt();
           newnode= new Node(item);
           newnode.next=null;
           if(head==null)
           {
            head=newnode;
    
           }
           else{
            temp=head;
            while(temp.next!=null)
            {
             temp=temp.next;
            }
            temp.next=newnode;
           }
    
           }
           public void InsertAtAnyLocation()
           {Node newnode;
            Node temp;
             int item,pos,i;
           Scanner sc=new Scanner(System.in);
           System.out.println("Enter the element to insert data at any location in SLL");
           
           item=sc.nextInt();
           newnode= new Node(item);
           System.out.println("Enter the position");
            pos=sc.nextInt();
            if(pos==1)
            {
                newnode.next=head;
                head=newnode;
            }
            else{
                temp=head;
                for(i=1;i<pos-1 && temp!=null ;i++)
                {
                       temp=temp.next;
    
                }
                if(temp==null)
                {
                    System.out.print("Invalid choice");
                }
                else{
                    newnode.next=temp.next;
                    temp.next=newnode;
                }
            }
    
           }
           public void deletionBegElement()
           {   Node temp;
            if(head==null)
            {
                System.out.print("List is Empty");
                return;
            }
            temp=head;
            head=head.next;
           temp=null;
           System.out.print("Successfully delete beg element frome List");
           }
            public void deletionEndElement()
            {
                Node temp1=head;
                Node temp2=null;
                if(head==null)
                {
                    System.out.print("List is Empty");
                      return;
                }
                if(temp1.next==null)
                {
                    head=null;
                    temp1=null;
                    return;
                }
                while(temp1.next!=null)
                {
                    temp2=temp1;
                    temp1=temp1.next;
                }
                temp2.next=null;
                temp1=null;
                   System.out.print("Successfully delete ending element frome List");
            }
            public void deleteAtSpecificLocation()
            {
                if(head==null)
                {
                    System.out.println("List is Empty");
                    return;
                }
                int pos,i=1;
                Scanner sc=new Scanner (System.in);
                System.out.print("Enter the pos to deleted element");
                 pos=sc.nextInt();
                 Node temp1=head;
                 Node temp2=null;
                 if(pos==1)
                 {
                    head=temp1.next;
                    temp1=null;
                    return;
                 }
                 while(i<pos && temp1!=null)
                 {
                    temp2=temp1;
                    temp1=temp1.next;
                    i++;
                 }
                 if(temp1==null)
                 {
                    System.out.print("Invalid choice");
                    return;

                 }
                 temp2.next=temp1.next;
                 temp1=null;
                    System.out.print("Successfully delete pos"+pos+" element frome List");

            }
        public static void main(String[] args) {
            SLL obj = new SLL();
            obj.create();
            obj.display();
            obj.InsertAtBeg();
            obj.display();
            obj.InsertAtEndSLL();
            obj.display();
            obj.InsertAtAnyLocation();
            obj.display();
            obj.deletionBegElement();
            obj.display();
            obj.deletionEndElement();
            obj.display();
           obj.deleteAtSpecificLocation();
            obj.display();
        }
    }
    