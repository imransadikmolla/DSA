class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null)
            return list2;
        else if(list2==null)
            return list1;
        ListNode ans=null;
        ListNode result=null;
        
        while(list1!=null && list2!=null){
            if(list1.val<=list2.val){
                if(ans==null){
                ListNode temp=new ListNode(list1.val);
                ans=temp;
                result=ans; 
                }
                else{
                ListNode temp=new ListNode(list1.val);
                ans.next=temp;  
                ans=ans.next;
                }
                list1=list1.next;
               
            }
            else{
                 if(ans==null){
                ListNode temp=new ListNode(list2.val);
                ans=temp;
                result=ans; 
                }
                else{
                ListNode temp=new ListNode(list2.val);
                ans.next=temp;
                ans=ans.next;
            }
                 list2=list2.next;
                       
        }
        }
        if(list1!=null) 
            ans.next=list1;
        if(list2!=null) 
            ans.next=list2;
    
        
        return result;
        
    }
}
