/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Assignment;

/**
 *
 * @author Muhammad Aqib
 */

public class LinkedList {
    public class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next=null;
    
        }
    }
    private Node head;

    public LinkedList() {
        this.head=null;
    }
    public void insertAtStart(int data){
        Node newNode = new Node(data);
        newNode.next= head;
        head = newNode;
    }
    public void display(){
        if(head == null){
            System.out.println("list is empaty");
        }
        Node current = head;
        while (current!=null){
            System.out.print(current.data + " ");
            current = current.next;  
        }   System.out.println("null");
    }
    public void deleteAtStart(){
        if(head == null){
            System.out.println("empaty");
        }
        head = head.next;
    }
    public void sizeOf(){
        int size=0;
        if(head == null)
            System.out.println("empaty");
        Node current = head;
        while(current != null){
            size++;
            current =current.next;
        }
        System.out.println(size);
    }
    public void insertAtEnd(int data){
        Node newNode =new Node(data);
        if (head==null) 
            head=newNode;
        else{
            Node current =head;
            while (current.next!=null) {
                current=current.next;
            }
            current.next=newNode;
        }
    }
    public void deleteAtEnd(){
        if(head==null)
            System.out.println("List is empty");
        else if(head.next==null)
            head=null;
        else{
            Node current =head;
            while(current.next.next !=null){
                current=current.next;
            }
            current.next=null;
        }
    }
    
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertAtStart(1);
        list.insertAtStart(2);
        list.insertAtStart(3);
        list.insertAtStart(4);
        list.insertAtStart(5);
        list.deleteAtStart();
        list.sizeOf();
        list.insertAtEnd(6);
        list.deleteAtEnd();
        list.display();
    }
    
}
