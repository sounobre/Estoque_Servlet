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
	
	public List<MATERIAIS> listar() {
		session = session.getSessionFactory().openSession();
		transaction = session.beginTransaction();
		query = session.createQuery("select M from MATERIAIS M");
		List<MATERIAIS> lista = query.list();
		
		return lista;
	}
}
