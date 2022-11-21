package org.example;

import java.util.ArrayList;

public class Solution {

    public Solution(){

    }

        public boolean isPalindrome(ListNode head){

            ArrayList<Integer> arrayList = new ArrayList<>();

            int pointer = 0;

            while( head != null ){

                pointer++;

                arrayList.add(head.val);

                head = head.next;
            }

            if( pointer < 1){
                return true;
            }

            int pivot = ( pointer - 1) / 2;

            for( int i = 0; i <= pivot; i++){

                if( !arrayList.get(i).equals( arrayList.get(pointer-i-1))){

                    return false;
                }
            }

            return true;
        }
}