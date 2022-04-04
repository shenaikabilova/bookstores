package com.kabilova.bookstores.model.enums;

import org.springframework.lang.Nullable;

public enum Genre {

	ACTIONS_AND_ADVENTURES("Actions and adventure"),
	HORROR("Horror"),
	CLASSICS("Classics"),
	FANTASY("Fantasy"),
	ROMANCE("Romance"),
	SCI_FI("Sci-fi"),
	HISTORY("History"),
	POETRY("Poetry");

	private String label;

	Genre(String label) {
		this.label = label;
	}

	@Nullable
	public static Genre from(String label) {
		try {
			return Genre.valueOf(label);
		} catch (NullPointerException e) {
			return null;
		}
	}
}