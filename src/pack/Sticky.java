package pack;
import java.util.Date;
import java.util.Timer;

// java.time stupf
// https://developer.android.com/reference/java/time/package-summary?hl=en

public class Sticky {
	
	private Date timeDue; // (year, month, day, hour, minute) (x-1900, 0-11, 0,31, 0-23, 0-59)
	private String title = "(untitled)";
	private String description = "No description yet!";
	public boolean isEditing;
	public boolean isOverdue;
//	private int routine; //idk how to run this one just yet - might be a Date, Date[], or just an int to count how often. idk.
	
	
	
	// constructors! ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	Sticky(long timeDue)
	{
		this.timeDue = new Date(timeDue); //millis since jan 1, 1970
//		if(this.timeDue < localDate())
//		{
//			
//		}
	}
	
	Sticky(long timeDue, String title)
	{
		this.timeDue = new Date(timeDue); //millis since jan 1, 1970
		this.title = title;
	}
	
	Sticky(long timeDue, String title, String description)
	{
		this.timeDue = new Date(timeDue); //millis since jan 1, 1970
		this.title = title;
		this.description = description;
	}
	
	
	// Methods! ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	
	// various getters and setters
	public Date getTimeDue()
	{
		return this.timeDue;
	}
	
	public void setTimeDue(Date timeDue)
	{
		this.timeDue = timeDue;
	}	
	
	public String getTitle()
	{
		return this.title;
	}
	
	public void setTitle(String newTitle)
	{
		this.title = newTitle;
	}
	
	public String getDescription()
	{
		return this.description;
	}
	
	public void setDescription(String newDescription)
	{
		this.description = newDescription;
	}
	
	
	// edit: while isEditing is true, open editor and tinker with stuph, when false make changes and close editor (requires an editor class?)
	
	// trigger alarm
	
	public void displayDescription()
	{
		System.out.println("===== " + this.title + " ======");
		System.out.println(this.description + "\n");
	}
	
	
	
	
	
}
