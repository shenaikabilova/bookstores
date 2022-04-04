package com.kabilova.bookstores.model.enums;

import org.springframework.lang.Nullable;

public enum Type {

	CONVENTIONAL("Conventional"),
	ONLINE("Online");

	private String label;

	Type(String label) {
		this.label = label;
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