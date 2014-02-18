package factoria;

import vo.AlumneVo;
import vo.AssignaturaVo;
import vo.MatriculaVo;


public class Factory {


	public static AlumneVo factoryMethod(String user, String password, String nom, String cognoms, int edat) {
		// TODO Auto-generated method stub
			 return new AlumneVo(user,password,nom,cognoms,edat);
		}
	
	public static Object factoryMethod(String nom){
		
		Object o=new Object();
		
		if(nom=="alumne"){
			
			o=new AlumneVo();
		}
		else if(nom=="assignatura"){
			
			return new AssignaturaVo();
		}
		else{
			
			o=new MatriculaVo();
		}
		
		return o;
	}
	
	public static AssignaturaVo factoryMethod(String nom, int credits){
		
		return new AssignaturaVo(nom,credits);
	}
	
	public static MatriculaVo factoryMethod(AlumneVo nomUser, AssignaturaVo nomAssign, int nota){
		
		return new MatriculaVo(nomUser,nomAssign,nota);
	}
}
