package com.grocerly.retail_tracker.model;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
//import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="gr_itemdetail")
//@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ItemModel {
	
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name="item_id")
		private int itemId;
		
		@Column(name="item_name")
		private String itemName;
		
		@Column(name="item_cp")
		private double itemCp;
	    
		@Column(name="item_sp")
		private double itemSp;
		
		@Column(name="item_margin")
		private double itemMargin;
		
		public int getItemId() { return itemId; }
	    public void setItemId(int itemId) { this.itemId = itemId; }

	    public String getItemName() { return itemName; }
	    public void setItemName(String itemName) { this.itemName = itemName; }

	    public double getItemCp() { return itemCp; }
	    public void setItemCp(double itemCp) { this.itemCp = itemCp; }

	    public double getItemSp() { return itemSp; }
	    public void setItemSp(double itemSp) { this.itemSp = itemSp; }

	    public double getItemMargin() { return itemMargin; }
	    public void setItemMargin(double itemMargin) { this.itemMargin = itemMargin; }

}
