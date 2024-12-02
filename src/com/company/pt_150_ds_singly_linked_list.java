//package com.company;
//
//import java.util.Scanner;
//
//
//
//public class pt_150_ds_singly_linked_list {
//    static class Node {
//        int data;
//        Node next;
//
//        Node(int data) {
//            this.data = data;
//            this.next = null;
//        }
//    }
//
//    Node head = null;
//
//    public void creation() {
//        int data, n;
//        Scanner sc = new Scanner(System.in);
//        while (true) {
//            System.out.println("Enter negative number to breaking the loop..\nEnter data:");
//            data = sc.nextInt();
//            Node new_node = new Node(data);
//            if (head == null) {
//                head = new_node;
//            } else {
//                new_node.next = head;
//                head = new_node;
//            }
//            if (data < 0) {
//                break;
//            }
//
//        }
//    }
//
//
//        public void traversor_or_display() {
//        if(head ==null)
//        {
//            System.out.println("LInkest List does not exista");
//        }
//        else {
//
//        }
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//
//    }
//}
