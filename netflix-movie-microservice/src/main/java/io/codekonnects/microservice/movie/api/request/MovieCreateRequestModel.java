package io.codekonnects.microservice.movie.api.request;

import javax.validation.constraints.NotNull;
public class MovieCreateRequestModel {
	@NotNull(message = "title cannot be null")
	private String title;
	@NotNull(message = "categoryId cannot be null")
	private String categoryId;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}
}
