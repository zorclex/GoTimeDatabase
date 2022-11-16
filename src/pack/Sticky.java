package pack;
import java.util.Date;
//import java.util.Timer;

// java.time stupf
// https://developer.android.com/reference/java/time/package-summary?hl=en

public class Sticky {
	
	private Date timeDue; // long Time is the number of millis since jan 1, 1970 - math on that should be easy ish.
	private String title = "(untitled)";
	private String description = "(No description yet!)";
	public boolean isEditing;
	public boolean isOverdue;
	public boolean isRoutine; //is or is not
	private int routineTime; //where the timer a routine is run by is stored on
//	private reminder[] reminders //a list of reminders so we can keep track of how many dings and of what kind
	
	
	
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
