package fr.dawan.bdd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

import fr.dawan.domain.DbObject;

public abstract class AbstractDao<T extends DbObject> {

	protected Connection cnx;

	protected abstract void create(T item) throws ClassNotFoundException, SQLException;
	protected abstract void update(T item) throws ClassNotFoundException, SQLException;
	public abstract void delete(T item) throws ClassNotFoundException, SQLException;

	protected abstract T find(Long id) throws ClassNotFoundException, SQLException;
	protected abstract List<T> findAll() throws ClassNotFoundException, SQLException;

	private void getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		cnx = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "dawan742");
	}

	public void persist(T item) throws ClassNotFoundException, SQLException {
		getConnection();
		if (item.getId() == null) {
			create(item);
		} else {
			update(item);
		}
		cnx.close();
	}

	public T read(Long id) throws ClassNotFoundException, SQLException  {
		getConnection();
		T resultat = find(id);
		cnx.close();
		return resultat;
	}

	public List<T> readAll() throws ClassNotFoundException, SQLException  {
		getConnection();
		List<T> resultat = findAll();
		cnx.close();
		return resultat;
	}

}
