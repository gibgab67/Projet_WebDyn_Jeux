package models ;

import java.util.*;
import io.ebean.*;
import javax.persistence.*;


@Entity
public class Person extends Model {
  
	private static final long serialVersionUID = 1L;

	@Id
	public long id;    
	private String firstname;
	private String mdp = null;
	private String mail = null;
	public int age = 0;
	public boolean inscrit;//false = anonyme, true = membre
		
		public Person(String firstname, int age, String mdp, String mail){ // nouveau membre
			this.firstname=firstname;
			this.age=age;
			this.inscrit=true;
			this.mdp=mdp;
			this.mail=mail;
		}
		
		public Person(String firstname){//nouvelle anonyme
			this.firstname=firstname;
			this.inscrit=false;
		}
		
		public String getFirstname(){
			return this.firstname;
		}
		
		public int getAge(){
			return this.age;
		}
		
		public void setAge(int age){
			this.age = age;
		}
		
		public void setFirstname(String firstname){
			this.firstname = firstname;
		}
		
		public static Finder<Long, Person> find = new Finder<Long,Person>(Person.class);
}