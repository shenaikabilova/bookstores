package com.kabilova.bookstores.model;

import lombok.*;

@Getter
@Setter(value = AccessLevel.PRIVATE)
@Builder
@ToString
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Author {

	private String name;
}