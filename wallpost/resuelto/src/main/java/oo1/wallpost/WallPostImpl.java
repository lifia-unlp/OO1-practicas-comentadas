package oo1.wallpost;

public class WallPostImpl implements WallPost {

	private String text;
	private int likes;
	private boolean isFeatured;

    public WallPostImpl() {
    	this.text = "Undefined post";
    	this.likes = 0;
    	this.isFeatured = false;
	}

	@Override
    public String toString() {
        return "WallPost {" +
            "text: " + getText() +
            ", likes: '" + getLikes() + "'" +
            ", featured: '" + isFeatured() + "'" +
            "}";
    }

	@Override
	public String getText() {
		
		return text;
	}

	@Override
	public void setText(String text) {
		this.text = text;
		
	}

	@Override
	public int getLikes() {
		return likes;
	}

	@Override
	public void like() {
		likes = likes + 1;
	}

	@Override
	public void dislike() {
		if (likes > 0) {
			likes = likes - 1;
		}
	}

	@Override
	public boolean isFeatured() {
		return isFeatured;
	}

	@Override
	public void toggleFeatured() {
		isFeatured = ! isFeatured; 
		
	}

}
