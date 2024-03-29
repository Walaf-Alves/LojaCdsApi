package com.cds.apicds.principal.primarydb.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
@Entity
@Table(name = "Cds")
public class CdEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String name;

	private String genre;

	private String album;

	private Double price;

	public CdEntity(String name, String genre, String album, Double price) {
		this.name = name;
		this.genre = genre;
		this.album = album;
		this.price = price;
	}

}
