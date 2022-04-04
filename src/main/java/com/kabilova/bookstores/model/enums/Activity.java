package com.kabilova.bookstores.model.enums;

import org.springframework.lang.Nullable;

public enum Activity {

	LITERATURE("Literature"),
	EDUCATION("Education"),
	ART("Art");

	private String label;

	Activity(String label) {
		this.label = label;
	}

	public String getLabel() {
		return label;
	}

	@Nullable
	public static Activity from(String label) {
		try {
			return Activity.valueOf(label);
		} catch (NullPointerException e) {
			return null;
		}
	}
}