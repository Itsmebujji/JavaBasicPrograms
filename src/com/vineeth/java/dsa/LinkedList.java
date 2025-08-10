package com.vineeth.java.dsa;

public class LinkedList {
    private Node head;
    private Node tail;
    private int length;
    static class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }
    public LinkedList(int value){
        head = new Node(value);
        tail = new Node(value);
        length=1;
    }
    public Node getHead(){
        return head;
    }
    public void setHead(Node head){
        this.head=head;
    }
  public Node getTail(){
        return tail;
  }
  public void setTail(Node tail){
        this.tail=tail;
  }
  public int getLength(){
        return length;
  }

  public void add(int value){
      Node newNode = new Node(value);
        if(length==0){
            head = newNode;
        }else{
            tail.next = newNode;
        }
      tail=newNode;
      length++;
  }
  public Node removeLast(){
        if(length==0) return null;
        Node temp = head;
        Node pre = head;
        while(temp.next!=null){
            pre=temp;
            temp=temp.next;
        }
        tail = pre;
        tail.next=null;
        length--;
        if(length==0){
            head=null;
            tail=null;
        }
        return temp;
  }
  public void prepend(int value){
        Node newNode = new Node(value);
        if(length==0){
            head = newNode;
            tail = newNode;
        }else{
            newNode.next = head;
            head = newNode;
        }
        length++;
  }
  public Node removeFirst(int value){
        if(length==0) return null;
        Node temp = head;
        head = head.next;
        temp.next=null;
        length--;
        if(length==0){
            tail=null;
        }
        return temp;
  }
  public Node get(int index){
        if(index<0 || index>=length){
            return null;
        }
        Node temp = head;
        for(int i=0;i<index;i++){
            temp=temp.next;
        }
        return temp;
  }
  public boolean set (int index, int value){
        Node temp = get(index);
        if(temp!=null){
            temp.value=value;
            return true;
        }
        return false;
  }
  public boolean insert(int index, int value){
        if(index<0||index>length){
            return false;
        }
        if(index==0){
            prepend(value);
            return true;
        } else if (index==length) {
            add(value);
            return true;
        }else{
            Node newNode = new Node(value);
            Node temp = get(index-1);
            newNode.next=temp.next;
            temp.next=newNode;
            length++;
            return true;
        }
  }
}
