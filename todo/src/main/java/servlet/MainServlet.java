package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.oracle.jrockit.jfr.RequestDelegate;

import dao.TodoDao;
import dto.TodoDto;


@WebServlet("/MainServlet")
public class MainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private TodoDao dao;
    public MainServlet() {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		dao = new TodoDao();
		request.setAttribute("list", dao.getTodos());
		
		List<TodoDto> list = dao.getTodos();
	
		RequestDispatcher rd = request.getRequestDispatcher("/main.jsp");	
		rd.forward(request, response);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int result =0;
		String id = request.getParameter("id");
		String type = request.getParameter("type");
		
		dao = new TodoDao();
		TodoDto dto = new TodoDto();
		
		if(type.equals("TODO")) {
			type = "DOING";
		}else {
			type="DONE";
		}
		
		dto.setId(Long.parseLong(id));
		dto.setType(type);
		
		result = dao.updateTodo(dto);
		
		response.setContentType("application/x-json;charset=UTF-8");
		if(result==1) {
			
			response.getWriter().print("success");
		}else {
		
			response.getWriter().print("fail");
		}
	}

}
