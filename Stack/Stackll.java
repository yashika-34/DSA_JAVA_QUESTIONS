

class LinkList
{
  public int data; // data item
  public LinkList next; // next link in list
  public LinkList(int dd) // constructor
  { data = dd; }
} 
class LinkStack
{
  private LinkList first; // ref to first item on list
  public LinkStack() // constructor
  {
      first=null;
  }
  public boolean isEmpty()
  {
      return (first==null);
  }
  public void push(int dd)
  {
      LinkList s=new LinkList(dd);
      s.next=first;
      first=s;
  }
  public int pop()
  {
      if(first==null){
          return -1;
      }
      int x=first.data;
      first=first.next;
      return x;
  }
}