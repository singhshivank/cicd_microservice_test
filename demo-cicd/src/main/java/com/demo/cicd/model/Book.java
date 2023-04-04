package com.demo.cicd.model;

import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonProperty;

@Document(collection = "Book")
public class Book {

	
	private String id;
	
	@JsonProperty("name")
	private String name = null;

	@JsonProperty("@baseType")
	private String auther = null;

	@JsonProperty("@schemaLocation")
	private Integer pages = null;

	@JsonProperty("@type")
	private Float rating = null;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuther() {
		return auther;
	}

	public void setAuther(String auther) {
		this.auther = auther;
	}

	public Integer getPages() {
		return pages;
	}

	public void setPages(Integer pages) {
		this.pages = pages;
	}

	public Float getRating() {
		return rating;
	}

	public void setRating(Float rating) {
		this.rating = rating;
	}
	
	
}
