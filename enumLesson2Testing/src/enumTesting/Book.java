package enumTesting;

public enum Book {
	//declare constants of enum type
		//argument to pass to the enum constructor is enclosed in parenthesis
		VBNET("Visual Basic .NET","2011"),
		CHTP4("C How to Progam", "2010"),
		IW3HTP3("Internet and World Widw Web","2005");
	   
		//instance variables
		private final String title;
		private final String copyrightYear;
		
		Book(String bookTitle, String year)
		{
			title = bookTitle;
			copyrightYear = year;
		}
		
		//nagamit ng methods para makuha yung enumeration constant
		//accessor for field title
		public String getTitle()
		{
			return title;
		}
		
		//accessor for field title
			public String getCopyrightYear()
			{
				return copyrightYear;
			}//end of method getCopyrightYear
	}//end of enum Book
