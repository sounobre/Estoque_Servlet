package control;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.firebirdsql.jdbc.parser.JaybirdSqlParser.returningClause_return;

import model.MATERIAIS;
import persistence.MateriaisDao;


@WebServlet({"/ControleMATERIAIS","/template/pages/Materiais.html"})
public class ControleMATERIAIS extends HttpServlet {
	private static final long serialVersionUID = 1L;

   
    public ControleMATERIAIS() {
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet");
		execute(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost");
		execute(request, response);
	}
	
protected void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String path = request.getContextPath();
		String url = request.getServletPath();
		
		try{
			
			if(url.equalsIgnoreCase("/template/pages/Materiais.html")){
				buscar(request, response);
			
		}
		
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
protected void hql(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
			String codigo = request.getParameter("select");
			String edit = request.getParameter("editPesquisa");
			
			
			String q = "SELECT M FROM MATERIAIS AS M WHERE 1=1";
			if( edit != null  )  (codigo == codigo){
				q += "AND M.CODIGO = ";
			}
			
			
			return q;
		}

protected void buscar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try{
			
			
			List<MATERIAIS> lista = new ArrayList<MATERIAIS>();
			MateriaisDao md = new MateriaisDao();
			
			lista = md.listar();
			
			if(lista.size() == 0){
				System.out.println("NADA");
			}else{
				System.out.println(lista.size());
			}
			
			request.setAttribute("lista", lista);
			
			request.getRequestDispatcher("Materiais.jsp").forward(request, response);
			
			
		}catch(Exception e){
			e.printStackTrace();
		}
	
}
}
