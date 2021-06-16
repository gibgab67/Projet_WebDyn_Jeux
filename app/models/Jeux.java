package models ;

import java.util.*;
import io.ebean.*;
import javax.persistence.*;


@Entity
public class Jeux extends Model {
  
	private static final long serialVersionUID = 1L;

	@Id
	public long id;
	public int nbJoueurs;
	public int joueursMax;
	private Person admin ;
	private ArrayList<Person> joueurs = new ArrayList<Person>();
		
	public Jeux(Person admin, int jMax){
		this.admin=admin;
		this.joueursMax = jMax;
	}
	
	public String getAdmin(){
		return this.admin;
	}
	
	public void setAdmin(Person admin){
		this.admin = admin;
	}
	
	public void addJoueur(Person joueur){
		this.joueurs.add(joueur);
		nbJoueurs++;
	}
	
	public static Finder<Long, Person> find = new Finder<Long,Person>(Person.class);
	
}