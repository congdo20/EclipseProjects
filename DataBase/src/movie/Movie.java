package movie;

public class Movie {
	private String movieTitle, category, mediaFormat;
	private int number;
	
	
	public Movie(int n, String title, String cat, String format) {
		number = n;
		movieTitle = title;
		category = cat;
		mediaFormat = format;
	}
	
	public int getNumber() {
		return number;
	}
	
	public String getMovieTitle() {
		return movieTitle;
	}
	
	public String getCategory() {
		return category;
	}
	
	public void setCategory(String cat) {
		category = cat;
	}
	
	public String getFormat() {
		return mediaFormat;
	}
	
	public void setFormat(String format) {
		mediaFormat = format;
	}
	
	public String toString() {
		return number + ": " + movieTitle + " - " + category +
				" " + mediaFormat;
	}
}
