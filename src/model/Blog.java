package model;

import java.time.LocalDate;

// Type your code
public class Blog {
	private String blogTitle;
	private String blogDescription;
	private LocalDate blogPostedOn;

	public Blog(String blogTitle, String blogDescription, LocalDate blogPostedOn) {
		super();
		this.blogTitle = blogTitle;
		this.blogDescription = blogDescription;
		this.blogPostedOn = blogPostedOn;
	}

	public String getBlogTitle() {
		return blogTitle;
	}

	public void setBlogTitle(String blogTitle) {
		this.blogTitle = blogTitle;
	}

	public String getBlogDescription() {
		return blogDescription;
	}

	public void setBlogDescription(String blogDescription) {
		this.blogDescription = blogDescription;
	}

	public LocalDate getBlogPostedOn() {
		return blogPostedOn;
	}

	public void setBlogPostedOn(LocalDate blogPostedOn) {
		this.blogPostedOn = blogPostedOn;
	}

	@Override
	public String toString() {
		return "Blog [blogTitle=" + blogTitle + ", blogDescription=" + blogDescription + ", blogPostedOn="
				+ blogPostedOn + "]";
	}

}