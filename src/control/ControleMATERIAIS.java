package control;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.MATERIAIS;
import persistence.MateriaisDao;


@WebServlet({"/ControleMATERIAIS","/Materiais.jsp"})
public class ControleMATERIAIS extends HttpServlet {
	private static final long serialVersionUID = 1L;

   
    public ControleMATERIAIS() {
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		execute(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		execute(request, response);
	}
	
protected void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String path = request.getContextPath();
		String url = request.getServletPath();
		
		try{
			
			if(url.equalsIgnoreCase("/Materiais.jsp")){
				buscar(request, response);
			
		}
		
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
		

protected void buscar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try{
			
			
			List<MATERIAIS> lista = new ArrayList<MATERIAIS>();
			MateriaisDao md = new MateriaisDao();
			
			lista = md.listar();
			
			request.setAttribute("lista", lista);
			
			request.getRequestDispatcher("Materiais.jsp").forward(request, response);
			
			
		}catch(Exception e){
			e.printStackTrace();
		}
	
}
}
