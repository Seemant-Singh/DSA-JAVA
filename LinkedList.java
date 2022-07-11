package com.company;

class Node{
    int data;
    Node next;
    public Node(int x){
        this.data=x;
        this.next=null;
    }
}
public class LinkedList {
    public static void main(String[] args) {
        Node head=new Node(10);
        head.next=new Node(20);//ctrl+D
        head.next.next=new Node(30);
        print(head);
        System.out.println("\n");
        head=insertBeg(head,2);
        print(head);
        System.out.println("\n");
        head=insertend(head,40);
        print(head);
        System.out.println("\n");
        head=deleteStart(head);
        print(head);
        System.out.println("\n");
        head=deleteEnd(head);
        print(head);
    }
    static Node deleteEnd(Node head){
        if(head==null)return null;
        if(head.next==null)return null;
        Node curr=head;
        while(curr.next.next!=null){
            curr=curr.next;
        }
        curr.next=null;
        return head;
    }
    static Node deleteStart(Node head){
        if(head==null)return null;
        else return head.next;
    }
    static Node insertend(Node head,int z){
        Node temp=new Node(z);
        if(head==null)return temp;
        Node curr=head;
        while(curr.next!=null){
            curr=curr.next;
        }
        curr.next=temp;
        return head;
    }
    static Node insertBeg(Node head,int y){
        Node temp=new Node(y);
//        if(head==null){return temp};
        temp.next=head;
        return temp;
    }
    static void print(Node head){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+"->");
            curr=curr.next;
        }
        System.out.print("null");
    }
    static void rprint(Node head){
        if (head==null)
            return ;
        System.out.print(head.data + " ");
        rprint(head.next);
    }

}
