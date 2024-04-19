
package org.comit.spring.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.comit.spring.bean.Product;
import org.springframework.jdbc.core.RowMapper;

public class productMapper implements RowMapper<Product>{

	@Override
	public Product mapRow(ResultSet rs, int rowNum) throws SQLException {

		Product product = new Product();
		
		
		product.setIdProduct(rs.getInt("ID_PRODUCT"));
		product.setSku(rs.getString("SKU"));
		product.setProductName(rs.getString("PRODUCT_NAME"));
		product.setDescription(rs.getString("DESCRIPTION"));
		product.setStatusProduct(rs.getString("STATUS_PRODUCT"));
		product.setProductImage(rs.getString("PRODUCT_IMAGE"));
		product.setStockQuantity(rs.getInt("STOCK_QUANTITY"));
		product.setProductPrice(rs.getDouble("PRODUCT_PRICE"));
		
		return product;
		
	}

}
