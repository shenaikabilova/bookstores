package com.kabilova.bookstores.model;

import com.kabilova.bookstores.model.enums.Genre;
import lombok.*;

@Getter
@Setter(value = AccessLevel.PRIVATE)
@Builder
@ToString
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Book {

	private String title;
	private Author author;
	private Genre  genre;

}