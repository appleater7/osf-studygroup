package jungkumjoo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BoardService {

public List <OrderBoardVO >selectBoard() {
Connection con = DBCon.getCon();
	String sql = "select * from order_board";
	try {
		PreparedStatement ps = DBCon.getCon().prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		List<OrderBoardVO> obList= new ArrayList<>();
				while(rs.next()) {
					OrderBoardVO ob = new OrderBoardVO();
					ob.setOrderNum(rs.getInt("orderNum"));
					ob.setBuyer(rs.getString("buyer"));
					ob.setBuyAdr(rs.getString("buyAdr"));
					ob.setReqName(rs.getString("reqName"));
					ob.setReqDat(rs.getString("reqDat"));
					ob.setReqTim(rs.getString("reqTim"));
					System.out.println(ob);
		}return obList;
	} catch (SQLException e) {
		e.printStackTrace();
	}finally {
		DBCon.close();
	}
	return null;
}
public void deleteBoard() {
	
}
public void updateBoard() {
	
}
public void insertBoard() {
	
}
}
