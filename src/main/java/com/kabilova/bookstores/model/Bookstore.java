package com.kabilova.bookstores.model;

import com.kabilova.bookstores.model.enums.Activity;
import com.kabilova.bookstores.model.enums.Type;
import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Bookstore {

	private String     		name;
	private Type       		type;
	private String     		webAddress;
	private List<Activity>  activity;
	private String     		bulstat;
	private String     		city;
	private String     		address;
	private List<Book> 		books;
}