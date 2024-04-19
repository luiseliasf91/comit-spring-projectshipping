package org.comit.spring.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.comit.spring.bean.Order;
import org.springframework.jdbc.core.RowMapper;

public class orderMapper implements RowMapper<Order>{

	@Override
	public Order mapRow(ResultSet rs, int rowNum) throws SQLException {

		Order order = new Order();
		
		order.setIdOrder(rs.getInt("ID_ORDER"));
		order.setOrderDate(rs.getDate("ORDER_DATE"));
		order.setShippedDate(rs.getDate("SHIPPED_DATE"));
		order.setIdCustormer(rs.getInt("ID_CUSTOMER"));
		order.setIdShipMethod(rs.getInt("ID_SHIP_METHOD"));
		order.setIdOrderStatus(rs.getInt("ID_ORDER_STATUS"));
		
		return order;
		
	}

}
