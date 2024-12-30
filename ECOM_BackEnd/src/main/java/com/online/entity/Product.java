package com.online.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="Product_Info_Master")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
	
		@Id
		@Column(name="pid")
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private int proid;
		private String name;
		private String price;
		private String quentity;
		private String category;
		private String description;
		private String discount;
		private String date;
		
		@ManyToOne
		@JoinColumn(name="category_id")
		private Category categoryid;
		
}
