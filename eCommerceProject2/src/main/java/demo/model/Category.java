package demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name="Category")
public class Category {
	
	@Id
	@Column(name="category_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int categoryId;
	
	//This is a OneToMany to Products
	
	@Column(name="category_name", nullable=false)
	String categoryName;


	public Category(String categoryName) {
		super();
		this.categoryName = categoryName;
	}
	
	
	
}