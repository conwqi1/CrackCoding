package LinkedListDemo;
public class ListNode {
    private String data;
    private ListNode link;
    
    public ListNode(){
    	data=null;
    	link=null;
    }
    public ListNode(String newdata, ListNode linkValue){
    	data=newdata;
    	link=linkValue;
    }
    public void setData(String newData){
    	data=newData;
    }
    public void setLink(ListNode linkValue){
    	link=linkValue;
    }
    public String getData(){
    	return data;
    }
    public ListNode getLink(){
    	return link;
    }
}
