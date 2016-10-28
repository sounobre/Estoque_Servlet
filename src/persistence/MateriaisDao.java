package persistence;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import model.MATERIAIS;

public class MateriaisDao {
	
	Session session;
	Transaction transaction;
	Query query;
	MATERIAIS materiais;
	
	public List<MATERIAIS> listar() {
		
		
		
		session = HibernateUtil.getSessionFactory().openSession();
		
		query = session.createQuery("SELECT M FROM MATERIAIS AS M");
		List<MATERIAIS> lista = query.list();
		session.close();
		
		return lista;
	}
}
