package com.kabilova.bookstores.model.enums;

import org.springframework.lang.Nullable;

public enum Type {

	CONVENTIONAL("Conventional"),
	ONLINE("On-line");

	private String label;

	Type(String label) {
		this.label = label;
	}

	public String getLabel() {
		return label;
	}

	@Nullable
	public static Type from(String label) {
		try {
			return Type.valueOf(label);
		} catch (NullPointerException e) {
			return null;
		}
	}
}