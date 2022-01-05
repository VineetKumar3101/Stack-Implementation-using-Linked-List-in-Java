interface StackADT

{

    void push(int element);

    int pop();

    int peek();

    boolean isEmpty();

    int size();



}

class Node

{

    private int data;

    private Node next;

    public Node()

    {

        data=0;

        next=null;



    }



    public void setData(int data)

    {

        this.data=data;

    }

    public void setNext(Node next)

    {

        this.next=next;

    }

    public int getData()

    {

        return data;

    }

    public Node getNext()

    {

        return next;

    }

    public Node(int data)

    {

        this.data=data;

        this.next=next;

    }

}

class LinkList implements StackADT

{

    private int size;

    private Node top;

    public LinkList()

    {

        size=0;

        top=null;

    }

    public boolean isEmpty()

    {

        if(top==null)

        {

            return true;

        }

        else

        {

            return false;



        }



    }

    public void push(int element)//addFirst

    {

        Node node=new Node(element);

        if(!isEmpty())

        {

            node.setNext(top);

            top=node;

        }

        else

        {



            top=node;



        }

        size++;

    }

    public int pop()//removeFirst

    {

        int res=0;

        if(!isEmpty())

        {

            res=top.getData();

            top=top.getNext();

            size--;

        }

        else

        {

            System.out.println("Stack underflow;Sorry,You can not perform pop operation on the list.");

        }

        return res;

    }



    public int size()

    {

        return size;

    }

    public int peek()

    {

        int res=0;

        if(!isEmpty())

        {

            res=top.getData();

        }

        else

        {

            System.out.println("Sorry ! List is empty.");



        }

        return res;

    }

    public void traverse()

    {

        System.out.println();

        if(!isEmpty())

        {

            Node temp=top;

            System.out.print("top"+"----->"+" ");

            while(temp!=null)

            {

                System.out.print(" "+temp.getData()+"----->"+" ");

                temp=temp.getNext();



            }

            System.out.print("null");

        }

        else

        {

            System.out.println("Sorry! Link list is empty.");

        }





    }

    public boolean search(int searchElement)

    {

        boolean res=false;

        if(!isEmpty())

        {

            Node temp;

            temp=top;

            while(temp!=null)

            {

                if(temp.getData()==searchElement)

                {



                    res=true;

                    break;

                }



                temp=temp.getNext();

            }

        }

        else

        {

            System.out.println("Search operation can not be perform on empty list. Thank you");



        }

        return res;

    }



}

class StackImpULink

{

    public static void main(String args[])

    {

        LinkList list=new LinkList();

        list.push(10);

        list.traverse();

        System.out.println("\nPop element:"+list.pop());

        list.traverse();

        System.out.println("\nSize is :"+list.size());

        System.out.println("Peak value is:"+list.peek());

        System.out.println("Element 20 in stack is found ="+list.search(20));

    }

}