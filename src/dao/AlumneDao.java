package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import vo.AlumneVo;
import vo.AssignaturaVo;
import vo.MatriculaVo;
import connection.DbConnection;
import factoria.Factory;



public class AlumneDao implements IAlumne {
	
	public void CrearAlumne(String user, String password, String nom, String cognoms, int edat){
		
		
		AlumneVo a= Factory.factoryMethod(user,password,nom,cognoms,edat);
		
		if(this.buscarAlumne(a.getNomUser())==null){
			
			//crear connexio
			DbConnection conex= new DbConnection();
			  try {
				  //Preparar connexio
			   Statement estatuto = conex.getConnection().createStatement();
			   
			   //executar consulta
			   estatuto.executeUpdate("INSERT INTO alumnes (nomUser, password, Nom, Cognoms, Edat) VALUES ('"+a.getNomUser()+"', '"+a.getPassword()+"', '" +a.getNom()+"', '"+a.getCognoms()+"', '" + a.getEdat()+ "');");
			   
			   estatuto.close();
			   conex.desconectar();
			    
			  } catch (SQLException e) {
			            System.out.println(e.getMessage());
			            System.out.println("Connexio incorrecta");
			  }
			
		}
		else{
			System.out.println("L'alumne ja existeix");
			
		}
		
	}
	
	public AssignaturaVo CrearAssignatura(String nom, int credits){
			
			
			AssignaturaVo assi= Factory.factoryMethod(nom,credits);
			
			//crear connexio
			DbConnection conex= new DbConnection();
			  try {
				  //Preparar connexio
			   Statement estatuto = conex.getConnection().createStatement();
			   
			   //executar consulta
			   estatuto.executeUpdate("INSERT INTO assignatures (nom, credits) VALUES ('"+assi.getNom()+"', '"+assi.getCredits()+ "');");
			   estatuto.close();
			   conex.desconectar();
			    
			  } catch (SQLException e) {
			            System.out.println(e.getMessage());
			            System.out.println("Connexio incorrecta");
			  }
			return assi;
		}
	
	public void CrearMatricula(AlumneVo alum, AssignaturaVo assign, int nota){
		
			MatriculaVo m= Factory.factoryMethod(alum, assign, nota);
			
			//crear connexio
			DbConnection conex= new DbConnection();
			  try {
				  //Preparar connexio
			   Statement estatuto = conex.getConnection().createStatement();
			   
			   alum.setId(this.retornaIdAlumne(alum.getNomUser()));
			   
			   assign.setId(this.retornaIdAssign(assign.getNom()));
			   
			   //executar consulta
			   estatuto.executeUpdate("INSERT INTO matricula (nota,idAlum,idAssign) VALUES ('"+m.getNota()+"', '"+m.getAlumne().getId()+"', '"+m.getAssignatura().getId()+ "');");
			   estatuto.close();
			   conex.desconectar();
			    
			  } catch (SQLException e) {
			            System.out.println(e.getMessage());
			            System.out.println("Connexio incorrecta");
			  }
	}
	
	public AlumneVo buscarAlumne(String User) {
			
			try {
					DbConnection conex= new DbConnection();
					
				   PreparedStatement consulta = conex.getConnection().prepareStatement("SELECT * FROM alumnes where nomUser='" + User + "';");
				   
				   ResultSet res = consulta.executeQuery();
				   
				   if (res.next()){
				   
				   		AlumneVo alum=(AlumneVo) Factory.factoryMethod("alumne");
					    
					    alum.setNomUser((res.getString("nomUser")));
					    
					    alum.setNom((res.getString("Nom")));
					    
					    alum.setCognoms((res.getString("Cognoms")));
					    
					    alum.setEdat((Integer.parseInt(res.getString("Edat"))));
					    
					    alum.setPassword((res.getString("password")));
					 
				          res.close();
				          consulta.close();
				          conex.desconectar();
				          
				          return alum;
				   }
				  } catch (Exception e) {
					  
				   System.out.print("La persona no existeix");
				  }
			
			
			return null;
		}

	/**
	 * Llista les persones 
	 * 
	 * 
	 * @return ArrayList<PersonaVO>
	 */
	public ArrayList<AlumneVo> llistarAlumnes() {
		
		//crea ArrayList de persones per guardarles
		ArrayList<AlumneVo> alumnes= new ArrayList< AlumneVo>();
		
			//connexio amb la bd
		  DbConnection conex= new DbConnection();
		     
		  try {
			  
		   PreparedStatement consulta = conex.getConnection().prepareStatement("SELECT * FROM alumnes");
		   
		   ResultSet res = consulta.executeQuery();
		   
		   while(res.next()){
			   
			   AlumneVo alum=(AlumneVo) Factory.factoryMethod("alumne");
			    
			    alum.setNomUser((res.getString("nomUser")));
			    
			    alum.setNom((res.getString("Nom")));
			    
			    alum.setCognoms((res.getString("Cognoms")));
			    
			    alum.setEdat((Integer.parseInt(res.getString("Edat"))));
			    
			    alum.setPassword((res.getString("password")));
			    
			    //afegir alumnes
			    alumnes.add(alum);
		          }
		   
		          res.close();
		          consulta.close();
		          conex.desconectar();
		    
		  } catch (Exception e) {
			  
		   System.out.print("No s'ha pogut fer el llistat");
		  }
		  
		  return alumnes;
	}
	
	public int retornaCredits(String nom){
		
				int credits=0;
				
					//connexio amb la bd
				  DbConnection conex= new DbConnection();
				     
				  try {
					  
				   PreparedStatement consulta = conex.getConnection().prepareStatement("SELECT credits FROM assignatures WHERE nom='" + nom + "';");
				   
				   ResultSet res = consulta.executeQuery();
				   
				   
				   		credits=((Integer.parseInt(res.getString("credits"))));
				   		
				          res.close();
				          consulta.close();
				          conex.desconectar();
				    
				  } catch (Exception e) {
					  
				   System.out.print("No s'ha pogut fer el llistat");
				  }
				  
				  return credits;
	}
	
	public int retornaIdAlumne(String nom){
		
		
			int id=0;
			
			//connexio amb la bd
		  DbConnection conex= new DbConnection();
		     
		  try {
			  
		   PreparedStatement consulta = conex.getConnection().prepareStatement("SELECT idAlumnes FROM alumnes WHERE nom='" + nom + "';");
		   
		   ResultSet res = consulta.executeQuery();
		   
		   
		   		id=((Integer.parseInt(res.getString("idAlumnes"))));
		   		
		          res.close();
		          consulta.close();
		          conex.desconectar();
		    
		  } catch (Exception e) {
			  
		   System.out.print("No s'ha pogut fer el llistat");
		  }
		  
		  return id;
			
			
		}
	
	public int retornaIdAssign(String nom){
		
		
		int id=0;
		
		//connexio amb la bd
	  DbConnection conex= new DbConnection();
	     
	  try {
		  
	   PreparedStatement consulta = conex.getConnection().prepareStatement("SELECT idAssignatures FROM assignatures WHERE nom='" + nom + "';");
	   
	   ResultSet res = consulta.executeQuery();
	   
	   
	   		id=((Integer.parseInt(res.getString("idAssignatures"))));
	   		
	          res.close();
	          consulta.close();
	          conex.desconectar();
	    
	  } catch (Exception e) {
		  
	   System.out.print("No s'ha pogut fer el llistat");
	  }
	  
	  return id;
		
		
	}

}
