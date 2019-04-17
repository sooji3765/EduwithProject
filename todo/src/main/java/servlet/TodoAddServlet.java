package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.TodoDao;
import dto.TodoDto;


@WebServlet("/TodoAddServlet")
public class TodoAddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private TodoDao dao;   
    
    public TodoAddServlet() {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		RequestDispatcher rd = request.getRequestDispatcher("todoForm.jsp");
		rd.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		dao = new TodoDao();
		request.setCharacterEncoding("utf-8");
		
		String title = request.getParameter("title");
		String name = request.getParameter("names");
		int sequence = Integer.parseInt(request.getParameter("sequence"));
		
		TodoDto dto = new TodoDto();
		dto.setTitle(title);
		dto.setName(name);
		dto.setSequence(sequence);
	
		int result = dao.addTodo(dto);
		
		System.out.println("result="+result);
		if(result==1) {
			response.sendRedirect("MainServlet");
		}else {
			RequestDispatcher rd = request.getRequestDispatcher("todoForm.jsp");
			rd.forward(request, response);
		}
		
		
	}

}
