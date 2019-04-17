package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


import dto.TodoDto;

public class TodoDao {
	
	private Connection conn;
	private PreparedStatement ps;
	private ResultSet rs;
	
	private static String DRIVER = "com.mysql.cj.jdbc.Driver";
	private static String dburl = "jdbc:mysql://localhost:3306/testdb?characterEncoding=UTF-8&serverTimezone=UTC&useSSL=false";
	private static String dbUser = "tester";
	private static String dbpasswd = "tester";
	
	public TodoDao() {
		try {
			Class.forName(DRIVER);
		}catch (Exception e) {
			System.out.println("드라이버 문제?");
			e.printStackTrace();
		}
	}
	
	public int addTodo(TodoDto dto) {
		int insertCount = 0;
		
		String sql = "INSERT INTO todo(title,name,sequence) VALUES(?,?,?)";
		
		try{
			conn = (Connection) DriverManager.getConnection(dburl, dbUser, dbpasswd);
			ps = (PreparedStatement) conn.prepareStatement(sql);
			
			ps.setString(1,dto.getTitle());
			ps.setString(2, dto.getName());
			ps.setInt(3, dto.getSequence());
			
			insertCount = ps.executeUpdate();
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			close();
		}
		
		return insertCount;
	}
	
	public List<TodoDto> getTodos() {
		// TODO list print
		
		List<TodoDto> list = new ArrayList<>();
		String sql = "SELECT * FROM todo";
		
		try {
			
			conn = (Connection) DriverManager.getConnection(dburl, dbUser, dbpasswd);
			ps = (PreparedStatement) conn.prepareStatement(sql);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				TodoDto todo = new TodoDto();
				todo.setId(rs.getLong("id"));
				todo.setTitle(rs.getString("title"));
				todo.setName(rs.getString("name"));
				todo.setSequence(rs.getInt("sequence"));
				todo.setType(rs.getString("type"));
				
				String date = rs.getString("regdate").substring(0, 11);
				todo.setRegdate(date);
				list.add(todo);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close();
		}
		
		return list ;
	}
	
	public int updateTodo(TodoDto dto) {
		
		int updateCount = 0;
		
		try {
			conn = (Connection)DriverManager.getConnection(dburl, dbUser, dbpasswd);
			
			String sql = "update todo set type=? where id =?";
			ps = (PreparedStatement) conn.prepareStatement(sql);
			
			ps.setString(1, dto.getType());
			ps.setLong(2, dto.getId());
			
			updateCount = ps.executeUpdate();
		}catch (Exception e) {
			// TODO: handle exception
		}finally {
			close();
		}
		
		return updateCount;
	}
	
	private void close() {
        try {
            if (rs!= null) {
                rs.close();
            }
            if (ps!= null) {
                ps.close();
            }
            if (conn!= null) {
                conn.close();
            }
        } catch (Exception e) {

        }
    }
	
}
