package Model;

public class RatingVO {
	private String id;
	private String rating;
	private String review;
	
	public RatingVO(String id, String rating, String review) {

		this.id = id;
		this.rating = rating;
		this.review = review;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public String getReview() {
		return review;
	}
	public void setReview(String review) {
		this.review = review;
	}
}
