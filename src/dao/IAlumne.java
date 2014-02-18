package dao;

import java.util.ArrayList;

import vo.AlumneVo;
import vo.AssignaturaVo;

public interface IAlumne {

	void CrearAlumne(String user, String password, String nom, String cognoms, int edat);
	
	void CrearAssignatura(String nom, int credits);
	
	void CrearMatricula(AlumneVo alum, AssignaturaVo assign, int nota);
	
	AlumneVo buscarAlumne(String User);
	
	ArrayList<AlumneVo> llistarAlumnes();
}
