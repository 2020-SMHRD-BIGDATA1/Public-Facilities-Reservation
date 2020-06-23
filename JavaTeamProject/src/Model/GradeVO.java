package Model;

public class GradeVO {
	private String Name;
	private String Rating;
	private String Review;
	private String review;
	
	
	
	
	public GradeVO(String name, String rating, String review) {
		Name = name;
		Rating = rating;
		Review = review;
	}
	public GradeVO(String name, String rating) {
		super();
		Name = name;
		Rating = rating;
		Review = review;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getRating() {
		return Rating;
	}
	public void setRating(String rating) {
		Rating = rating;
	}
	public String getReview() {
		return Review;
	}
	public void setReview(String review) {
		Review = review;
	}
	
	
}