package activityOne;

public class Cage {
	
	private int Length;
	private int Width;
	private int Height;
	private boolean Clean;
	private boolean Covered;
	private boolean shape;
	public Cage() {
		
	}
	
	public Cage(int Length, int Width, int Height, boolean Clean, boolean Covered) {
		this.Length = Length;
		this.Width = Width;
		this.Height = Height;
		this.Clean = Clean;
		this.Covered = Covered;
	}

	public Cage(int Length, int Width, int Height, boolean Clean, boolean Covered, boolean shape) {
		this.Length = Length;
		this.Width = Width;
		this.Height = Height;
		this.Clean = Clean;
		this.Covered = Covered;
		this.shape = shape;
	}
	
	public int getLength() {
		return Length;
	}

	public int getWidth() {
		return Width;
	}

	public int getHeight() {
		return Height;
	}

	public boolean isClean() {

		return Clean;
		}
		
	public boolean isCovered() {
		
		return Covered;
		}
		
	public String cleans() {
		String mensahe;
	
	if  (getLength() == getWidth() && getWidth() == getHeight()) {
		mensahe = "The cage is clean";
	}
	
	else {
		mensahe = "The cage is not clean";
	}
		return mensahe;
	}
	
	public String covered() {
		String messg;
		
		if (isCovered()) {
			messg = "The cage is covered";
		}
		
		else {
			messg = "The cage is not covered";
		}
		return messg;
	}
}
