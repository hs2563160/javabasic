package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //123
//        ListNode head = new ListNode(1);
//        head.next=new ListNode(2);
//        head.next.next = new ListNode(3);
//        head.next.next.next = new ListNode(4);
//        head.next.next.next.next = new ListNode(5);
//        swapPairs(head);

//        int[] arr = new int[]{5,2,3,1};
        //quickSort(arr, 0, arr.length-1);
        System.out.print(6%2);
    }



      public static class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }


    public static ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode evenhead = new ListNode(0);
        ListNode curreven = evenhead;
        ListNode tmp = head;
        while(tmp.next != null && tmp.next.next!=null){
            ListNode odd = tmp.next.next;
            ListNode even = tmp.next;
            tmp.next=odd;
            curreven.next = even;
            curreven = curreven.next;
            tmp = tmp.next.next;
        }
        if(tmp.next == null){
            tmp.next = evenhead.next;
        }else{tmp.next.next = evenhead.next;}
        return head;
    }

    private static void quickSort(int[] nums, int low, int high){
        if(low < high){
            int flag = partition(nums, low, high);
            quickSort(nums, low, flag-1);
            quickSort(nums, flag+1, high);
        }
    }

    private static int partition(int[] nums, int low, int high){
        int flag = nums[low];
        int pivot = low;
        while(low<high){
            while(low<high && nums[high]>=flag){
                high--;
            }
            while(low<high && nums[low]<=flag){
                low++;
            }
            swap(nums, low, high);
        }
        swap(nums, low, pivot);
        return low;
    }

    private static void swap(int[] nums, int a, int b){
        int tmp = nums[a];
        nums[a] = nums[b];
        nums[b] = tmp;
    }

}
