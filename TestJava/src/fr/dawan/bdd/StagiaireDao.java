package fr.dawan.bdd;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import fr.dawan.domain.Stagiaire;
import fr.dawan.domain.Stagiaire.Civilite;
import fr.dawan.domain.Stagiaire.PriseEnCharge;

public class StagiaireDao extends AbstractDao<Stagiaire>{

	@Override
	protected void create(Stagiaire item) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	protected void update(Stagiaire item) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Stagiaire item) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	protected Stagiaire find(Long id) throws ClassNotFoundException, SQLException {
		Stagiaire resultat = null;
		PreparedStatement stmt = cnx.prepareStatement("SELECT * FROM stagiaire WHERE id = ?");

		// On execute la requete
		ResultSet rs = stmt.executeQuery();

		if (rs.next()) {

			Stagiaire s = fillStagiaireFrom(rs);

			resultat = s;
		}

		return resultat;
	}

	private Stagiaire fillStagiaireFrom(ResultSet rs) throws SQLException {
		Stagiaire s = new Stagiaire();
		s.setId(rs.getLong("id"));
		s.setNom(rs.getString("nom"));
		s.setPrenom(rs.getString("prenom"));
		s.setSociete(rs.getString("societe"));
		s.setConnu(rs.getBoolean("connu"));
		s.setDateNaissance(rs.getDate("date_naissance"));
		s.setGenre(Civilite.valueOf(rs.getString("genre")));
		s.setPayeur(PriseEnCharge.valueOf(rs.getString("payeur")));
		return s;
	}

	@Override
	protected List<Stagiaire> findAll() throws ClassNotFoundException, SQLException {
		List<Stagiaire> resultat = new ArrayList<Stagiaire>();
		Statement stmt = cnx.createStatement();

		// On execute la requete
		ResultSet rs = stmt.executeQuery("SELECT * FROM stagiaire");

		// On parcourt les résultat
		while (rs.next()) {
			Stagiaire s = fillStagiaireFrom(rs);
			// On ajoute le stagiaire créé au résultat
			resultat.add(s);
		}

		return resultat;
	}

}
