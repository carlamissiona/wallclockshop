package com.wallclocks.webshop.data;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.*;

public class ClockItem {

	private final String productcode;
	private final String title;
	private final String description;
	private final String brand;
	private final String price;
	private final List<String> tags = new ArrayList<>();

	@JsonCreator
	public ClockItem(
					@JsonProperty("productcode") String productcode,
					@JsonProperty("title") String title,
					@JsonProperty("description") String description,
					@JsonProperty("brand") String brand,
					@JsonProperty("price") String price,
					@JsonProperty("tags") String... tags) {

		this.productcode = productcode;
		this.title = title;
		this.description = description;
		this.brand = brand;
		this.price = price;
		this.tags.addAll(Arrays.asList(tags));
	}

	public String getProductCode() {
		return productcode;
	}

	public String getTitle() {
		return title;
	}

    public String getDescription() {
		return description;
	}

    public String getBrand() {
		return brand;
	}

    public String getPrice() {
		return price;
	}

	public List<String> getTags() {
		return Collections.unmodifiableList(tags);
	}

	@Override
	public boolean equals(Object o) {

		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		ClockItem Citem = (ClockItem) o;
		return Objects.equals(productcode, Citem.productcode);
	}

	@Override
	public int hashCode() {

		return Objects.hash(productcode);
	}

	@Override
	public String toString() {
		return String.format(
				"Item [productcode=%s, title=%s, description=%s, brand=%s,  price=%s, tags=%s ]",
				this.productcode, this.title, this.description, this.brand, this.price, this.tags
            );
	}
}