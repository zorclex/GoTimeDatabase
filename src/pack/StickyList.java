package pack;
import java.util.ArrayList;


public class StickyList {
	
	private String title = "(untitled)";
	private ArrayList<Sticky> list;
	
	
	StickyList(String title)
	{
		this.list = new ArrayList<Sticky>();
		this.title = title;
	}
	
	public void appendSticky(Sticky note)
	{
		this.list.add(note);
	}
	
	public void removeSticky(Sticky note)
	{
		int temp = this.list.indexOf(note);
		this.list.remove(temp);
	}
	
	public void traverse()
	{
		for(int i = 0; i < list.size(); i++)
		{
            list.get(i).displayDescription();
        }
	}
	
	
	public String getTitle()
	{
		return this.title;
	}
	
	public void setTitle(String newTitle)
	{
		this.title = newTitle;
	}
	
	
	
	
	
	
	
	
	
	
}
