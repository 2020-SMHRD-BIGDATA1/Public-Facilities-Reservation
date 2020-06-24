package Model;

public class GradeVO {
	private String Id;
	private String Name;
	private String Rating;
	private String Review;
	


	public GradeVO(String id, String name, String rating, String review) {
		
		Id = id;
		Name = name;
		Rating = rating;
		Review = review;
	}




	public GradeVO(String rating, String review) {
		Rating = rating;
		Review = review;
	}




	public String getId() {
		return Id;
	}


	public void setId(String id) {
		Id = id;
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
	

