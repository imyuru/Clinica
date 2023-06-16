package clinica;

import java.util.ArrayList;
import java.util.Scanner;


public class Principal {
	ArrayList <Medico> m = new ArrayList<Medico>();
	ArrayList <Paciente> pa = new ArrayList<Paciente>();
	ArrayList <Registro> re = new ArrayList<Registro>();
	
	Scanner sc = new Scanner(System.in);
	


	public void porcentual() {
		sc.nextLine();
		int op,n1=0,n2=0,n3=0,total=0;
		String dia;
		double iny=0,consulta=0,laboratorio=0,porcentaje=0;
		//Inyectable  2 dolares , Consulta 10 dolares , laboratorio 5 dolares 
		System.out.println("¿Como desea la consulta?");
		System.out.println("1.Ganancias de un dia");
		System.out.println("2.Ganancias historicas");
		System.out.println("3.Porcentual de un dia por servicio");
		System.out.println("4.Porcentual historico por servicio");
		op=sc.nextInt();
		sc.nextLine();
		switch(op){
		case 1:
			System.out.println("¿Que dia es hoy?");
			dia=sc.nextLine();
			for(int x=0; x<re.size();x++) {
				if(re.get(x).getServicio().equals("Consulta")&&re.get(x).getDia().equals(dia)){
					consulta=consulta+10;
				}
				if(re.get(x).getServicio().equals("Inyectable")&&re.get(x).getDia().equals(dia)){
					iny=iny+2;
				}
				if(re.get(x).getServicio().equals("Laboratorio")&&re.get(x).getDia().equals(dia)){
					laboratorio=laboratorio+5;
				}
			}
			System.out.println("Ganancias por consultas: "+consulta);
			System.out.println("Ganancias por inyectables: "+iny);
			System.out.println("Ganancias por laboratorio: "+laboratorio);
			System.out.println("Ganancias totales: "+total);
			total=0;
			consulta=0;
			iny=0;
			laboratorio=0;
			break;
		case 2:
			for(int x=0; x<re.size();x++) {
				if(re.get(x).getServicio().equals("Consulta")){
					consulta=consulta+10;
				}
				if(re.get(x).getServicio().equals("Inyectable")){
					iny=iny+2;
				}
				if(re.get(x).getServicio().equals("Laboratorio")){
					laboratorio=laboratorio+5;
				}
			}
			System.out.println("Ganancias por consultas: "+consulta);
			System.out.println("Ganancias por inyectables: "+iny);
			System.out.println("Ganancias por laboratorio: "+laboratorio);
			System.out.println("Ganancias totales: "+total);
			total=0;
			consulta=0;
			iny=0;
			laboratorio=0;
			break;
		case 3:
			System.out.println("¿Que dia es hoy?");
			dia=sc.nextLine();
			for(int x=0; x<re.size();x++) {
				if(re.get(x).getServicio().equals("Consulta")&&re.get(x).getDia().equals(dia)){
					n1++;
				}
				if(re.get(x).getServicio().equals("Inyectable")&&re.get(x).getDia().equals(dia)){
					n2++;
				}
				if(re.get(x).getServicio().equals("Laboratorio")&&re.get(x).getDia().equals(dia)){
					n3++;
				}
			}
			total=n1+n2+n3;
			System.out.println("Porcentaje por consultas: "+((n1*100)/total)+"%");
			System.out.println("Porcentaje por inyectables: "+((n2*100)/total)+"%");
			System.out.println("Porcentaje por laboratorio: "+((n3*100)/total)+"%");
			n1=0;
			n2=0;
			n3=0;
			break;
		case 4:
			for(int x=0; x<re.size();x++) {
				if(re.get(x).getServicio().equals("Consulta")){
					n1++;
				}
				if(re.get(x).getServicio().equals("Inyectable")){
					n2++;
				}
				if(re.get(x).getServicio().equals("Laboratorio")){
					n3++;
				}
			}
			total=n1+n2+n3;
			System.out.println("Porcentaje por consultas: "+((n1*100)/total)+"%");
			System.out.println("Porcentaje por inyectables: "+((n2*100)/total)+"%");
			System.out.println("Porcentaje por laboratorio: "+((n3*100)/total)+"%");
			n1=0;
			n2=0;
			n3=0;
			break;
		}
	}
	public void porMedico() {
		sc.nextLine();
		String dia,medico="";
		int op;
		System.out.println("¿Como desea la consulta?");
		System.out.println("1.Historial completo");
		System.out.println("2.Historial de un dia especifico");
		op=sc.nextInt();
		sc.nextLine();
		switch(op) {
		case 1:
			System.out.println("Ingrese el nombre del medico");
			medico=sc.nextLine();
			
			System.out.println("Los pacientes atendidos por el medico "+medico);
			for(int x=0;x<re.size();x++) {
				if(re.get(x).getMedico().equals(medico)) {
					System.out.println("--------------------------------");
					System.out.println("Id: "+re.get(x).getId());
					System.out.println("Nombre: "+re.get(x).getNombre());
					System.out.println("Apellido: "+re.get(x).getApellido());
					System.out.println("Direccion: "+re.get(x).getDireccion());
					System.out.println("Telefono: "+re.get(x).getTelefono());
					System.out.println("Correo: "+re.get(x).getCorreo());
					System.out.println("Fecha de nacimiento: "+re.get(x).getFechadenacimiento());
					System.out.println("Sexo: "+re.get(x).getSexo());
					System.out.println("Alergico: "+re.get(x).getAlergico());
					System.out.println("Servicio: "+re.get(x).getServicio());
					System.out.println("--------------------------------");
				}
			}
			break;
		case 2:
			System.out.println("¿Que dia es hoy?");
			dia=sc.nextLine();
			System.out.println("Ingrese el nombre del medico");
			medico=sc.nextLine();
			
			System.out.println("Los pacientes atendidos el dia "+dia+" por el medio "+medico);
			for(int x=0;x<re.size();x++) {
				if(re.get(x).getDia().equals(dia)&&re.get(x).getMedico().equals(medico)) {
					System.out.println("--------------------------------");
					System.out.println("Id: "+re.get(x).getId());
					System.out.println("Nombre: "+re.get(x).getNombre());
					System.out.println("Apellido: "+re.get(x).getApellido());
					System.out.println("Direccion: "+re.get(x).getDireccion());
					System.out.println("Telefono: "+re.get(x).getTelefono());
					System.out.println("Correo: "+re.get(x).getCorreo());
					System.out.println("Fecha de nacimiento: "+re.get(x).getFechadenacimiento());
					System.out.println("Sexo: "+re.get(x).getSexo());
					System.out.println("Alergico: "+re.get(x).getAlergico());
					System.out.println("Servicio: "+re.get(x).getServicio());
					System.out.println("--------------------------------");
				}
			}
			break;
		default:
			System.out.println("Ingrese una opcion valida");
			break;
		}
		
	}
	public void atendidosTipo() {
		sc.nextLine();
		int p,op;
		String dia,tipo="";
		System.out.println("¿Como desea la consulta?");
		System.out.println("1.Historial completo");
		System.out.println("2.Historial de un dia especifico");
		op=sc.nextInt();
		sc.nextLine();
		switch (op) {
		case 1:
			System.out.println("¿Que tipo de servicio?");
			System.out.println("1.Consulta");
			System.out.println("2.Inyectable");
			System.out.println("3.Laboratorio");
			p=sc.nextInt();
			if(p==1) {
				tipo="Consulta";
			}
			if(p==2) {
				tipo="Inyectable";
			}
			if(p==3) {
				tipo="Laboratorio";
			}
			System.out.println("Los pacientes atendidos por el servicio "+tipo);
			for(int x=0;x<re.size();x++) {
				if(re.get(x).getServicio().equals(tipo)) {
					System.out.println("--------------------------------");
					System.out.println("Id: "+re.get(x).getId());
					System.out.println("Nombre: "+re.get(x).getNombre());
					System.out.println("Apellido: "+re.get(x).getApellido());
					System.out.println("Direccion: "+re.get(x).getDireccion());
					System.out.println("Telefono: "+re.get(x).getTelefono());
					System.out.println("Correo: "+re.get(x).getCorreo());
					System.out.println("Fecha de nacimiento: "+re.get(x).getFechadenacimiento());
					System.out.println("Sexo: "+re.get(x).getSexo());
					System.out.println("Alergico: "+re.get(x).getAlergico());
					System.out.println("Medico: "+re.get(x).getMedico());
					System.out.println("--------------------------------");
				}
			}
			break;
		case 2:
			System.out.println("¿Que dia es hoy?");
			dia=sc.nextLine();
			System.out.println("¿Que tipo de servicio?");
			System.out.println("1.Consulta");
			System.out.println("2.Inyectable");
			System.out.println("3.Laboratorio");
			p=sc.nextInt();
			if(p==1) {
				tipo="Consulta";
			}
			if(p==2) {
				tipo="Inyectable";
			}
			if(p==3) {
				tipo="Laboratorio";
			}
			System.out.println("Los pacientes atendidos el dia "+dia+" por el servicio "+tipo);
			for(int x=0;x<re.size();x++) {
				if(re.get(x).getDia().equals(dia)&&re.get(x).getServicio().equals(tipo)) {
					System.out.println("--------------------------------");
					System.out.println("Id: "+re.get(x).getId());
					System.out.println("Nombre: "+re.get(x).getNombre());
					System.out.println("Apellido: "+re.get(x).getApellido());
					System.out.println("Direccion: "+re.get(x).getDireccion());
					System.out.println("Telefono: "+re.get(x).getTelefono());
					System.out.println("Correo: "+re.get(x).getCorreo());
					System.out.println("Fecha de nacimiento: "+re.get(x).getFechadenacimiento());
					System.out.println("Sexo: "+re.get(x).getSexo());
					System.out.println("Alergico: "+re.get(x).getAlergico());
					System.out.println("Medico: "+re.get(x).getMedico());
					System.out.println("--------------------------------");
				}
			}
			break;
			default:
				System.out.println("Ingrese una opcion valida");
		}
		
		
	}
	public void atendidos() {
		sc.nextLine();
		String dia;
		System.out.println("¿Que dia es hoy?");
		dia=sc.nextLine();
		
		System.out.println("Los pacientes atendidos el dia "+dia+ " en consultas");
		for(int x=0;x<re.size();x++) {
			if(re.get(x).getDia().equals(dia)&&re.get(x).getServicio().equals("Consulta")) {
				System.out.println("--------------------------------");
				System.out.println("Id: "+re.get(x).getId());
				System.out.println("Nombre: "+re.get(x).getNombre());
				System.out.println("Apellido: "+re.get(x).getApellido());
				System.out.println("Direccion: "+re.get(x).getDireccion());
				System.out.println("Telefono: "+re.get(x).getTelefono());
				System.out.println("Correo: "+re.get(x).getCorreo());
				System.out.println("Fecha de nacimiento: "+re.get(x).getFechadenacimiento());
				System.out.println("Sexo: "+re.get(x).getSexo());
				System.out.println("Alergico: "+re.get(x).getAlergico());
				System.out.println("Servicio: "+re.get(x).getServicio());
				System.out.println("Medico: "+re.get(x).getMedico());
				System.out.println("--------------------------------");
			}
			
		}
		System.out.println("Los pacientes atendidos el dia "+dia+ " en Inyectable");
		for(int x=0;x<re.size();x++) {
			if(re.get(x).getDia().equals(dia)&&re.get(x).getServicio().equals("Inyectable")) {
				System.out.println("--------------------------------");
				System.out.println("Id: "+re.get(x).getId());
				System.out.println("Nombre: "+re.get(x).getNombre());
				System.out.println("Apellido: "+re.get(x).getApellido());
				System.out.println("Direccion: "+re.get(x).getDireccion());
				System.out.println("Telefono: "+re.get(x).getTelefono());
				System.out.println("Correo: "+re.get(x).getCorreo());
				System.out.println("Fecha de nacimiento: "+re.get(x).getFechadenacimiento());
				System.out.println("Sexo: "+re.get(x).getSexo());
				System.out.println("Alergico: "+re.get(x).getAlergico());
				System.out.println("Servicio: "+re.get(x).getServicio());
				System.out.println("Medico: "+re.get(x).getMedico());
				System.out.println("--------------------------------");
			}
			
		}
		System.out.println("Los pacientes atendidos el dia "+dia+ " en Laboratorio");
		for(int x=0;x<re.size();x++) {
			if(re.get(x).getDia().equals(dia)&&re.get(x).getServicio().equals("Laboratorio")) {
				System.out.println("--------------------------------");
				System.out.println("Id: "+re.get(x).getId());
				System.out.println("Nombre: "+re.get(x).getNombre());
				System.out.println("Apellido: "+re.get(x).getApellido());
				System.out.println("Direccion: "+re.get(x).getDireccion());
				System.out.println("Telefono: "+re.get(x).getTelefono());
				System.out.println("Correo: "+re.get(x).getCorreo());
				System.out.println("Fecha de nacimiento: "+re.get(x).getFechadenacimiento());
				System.out.println("Sexo: "+re.get(x).getSexo());
				System.out.println("Alergico: "+re.get(x).getAlergico());
				System.out.println("Servicio: "+re.get(x).getServicio());
				System.out.println("Medico: "+re.get(x).getMedico());
				System.out.println("--------------------------------");
			}
			
		}
		
		
	}
	public void registroAtencion() {
		//Inyectable  2 dolares , Consulta 10 dolares , laboratorio 5 dolares 
		String ced,tipo="",medico="",servicio="";
		String id="",nombre="",apellido="",direccion="",telefono="",correo="",fechadenacimiento="",sexo="",alergico="",dia="";
		int w=1,p=0, y=0;;
		double pago=0;
		sc.nextLine();
		Registro reg=new Registro();
		System.out.println("Ingrece el numero de cedula del paciente");
		ced=sc.nextLine();
		System.out.println("Ingrese el dia");
		dia=sc.nextLine();
		do {
			for(int x=0;x<pa.size();x++) {
				if(pa.get(x).getId().equals(ced)) {
					w=0;
					id=pa.get(x).getId();
					nombre=pa.get(x).getNombre();
					apellido=pa.get(x).getApellido();
					direccion=pa.get(x).getDireccion();
					telefono=pa.get(x).getTelefono();
					correo=pa.get(x).getCorreo();
					fechadenacimiento=pa.get(x).getFechadenacimiento();
					sexo=pa.get(x).getSexo();
					alergico=pa.get(x).getAlergico();
					reg.setId(id);
					reg.setNombre(nombre);
					reg.setApellido(apellido);
					reg.setDireccion(direccion);
					reg.setTelefono(telefono);
					reg.setCorreo(correo);
					reg.setFechadenacimiento(fechadenacimiento);
					reg.setSexo(sexo);
					reg.setAlergico(alergico);
					
				}
				
			}
			if(w==0) {
				System.out.println("Ingresa la especialidad a la cual quieres asistir");
				System.out.println("1.Consulta");
				System.out.println("2.Inyectable");
				System.out.println("3.Laboratorio");
				p=sc.nextInt();
				if(p==1) {
					tipo="Consulta";
				}
				if(p==2) {
					tipo="Inyectable";
				}
				if(p==3) {
					tipo="Laboratorio";
				}
				for(int x=0;x<m.size();x++) {
					if(m.get(x).getEspecialidad().equals(tipo)) {
						y=1;
						medico=m.get(x).getNombre()+" "+m.get(x).getApellido() ;
						servicio=m.get(x).getEspecialidad();
						reg.setMedico(medico);
						reg.setServicio(servicio);
						reg.setDia(dia);
						re.add(reg);
						if (p==1) {
							System.out.println("Total a pagar el dia de la consulta: 10 dolares");
						}else if(p==2) {
							System.out.println("Total a pagar el dia de la inyeccion: 2 dolares");
						}else if(p==3) {
							System.out.println("Total a pagar el dia del laboratorio: 5 dolares");
						}
					}
				}
				if(y==0) {
					System.out.println("Medico con su especialidad no encontrado");
				}
				
			}else if(w==1) {
				System.out.println("PACIENTE NO ENCONTRADO INGRESE UNA CEDULA VALIDA");
				menu();
			}
			
		}while(w!=0);
		
		w=1;
		y=0;
	}
	public void registroMedico() {
		sc.nextLine();
		Medico med=new Medico();
		String id,nombre,apellido,direccion,telefono,correo,fechadenacimiento,sexo,especialidad;
		System.out.println("Ingrese el id del medico");
		id=sc.nextLine();
		System.out.println("Ingrese el nombre del medico");
		nombre=sc.nextLine();
		System.out.println("Ingrese el apellido del medico");
		apellido=sc.nextLine();
		System.out.println("Ingrese la dirección del medico");
		direccion=sc.nextLine();
		System.out.println("Ingrese el telefono del medico");
		telefono=sc.nextLine();
		System.out.println("Ingrese el correo del medico");
		correo=sc.nextLine();
		System.out.println("Ingrese la fecha de nacimiento del medico");
		fechadenacimiento=sc.nextLine();
		System.out.println("Ingrese el sexo del medico");
		sexo=sc.nextLine();
		System.out.println("Ingrese la especialidad del medico");
		especialidad=sc.nextLine();
		med.setId(id);
		med.setNombre(nombre);
		med.setApellido(apellido);
		med.setDireccion(direccion);
		med.setTelefono(telefono);
		med.setCorreo(correo);;
		med.setFechadenacimiento(fechadenacimiento);
		med.setSexo(sexo);
		med.setEspecialidad(especialidad);
		m.add(med);
	}
	public void registroPaciente(){
		sc.nextLine();
		Paciente pac=new Paciente();
		String id,nombre,apellido,direccion,telefono,correo,fechadenacimiento,sexo,alergico;
		System.out.println("Ingrese el id del paciente");
		id=sc.nextLine();
		System.out.println("Ingrese el nombre del paciente");
		nombre=sc.nextLine();
		System.out.println("Ingrese el apellido del paciente");
		apellido=sc.nextLine();
		System.out.println("Ingrese la dirección del paciente");
		direccion=sc.nextLine();
		System.out.println("Ingrese el telefono del paciente");
		telefono=sc.nextLine();
		System.out.println("Ingrese el correo del paciente");
		correo=sc.nextLine();
		System.out.println("Ingrese la fecha de nacimiento del paciente");
		fechadenacimiento=sc.nextLine();
		System.out.println("Ingrese el sexo del paciente");
		sexo=sc.nextLine();
		System.out.println("Ingrese el nombre de la alegergia si tiene sino agregar No");
		alergico=sc.nextLine();
		pac.setId(id);
		pac.setNombre(nombre);
		pac.setApellido(apellido);
		pac.setDireccion(direccion);
		pac.setTelefono(telefono);
		pac.setCorreo(correo);;
		pac.setFechadenacimiento(fechadenacimiento);
		pac.setSexo(sexo);
		pac.setAlergico(alergico);
		pa.add(pac);
	}
	public void menu() {
		int op=0,s=1;
		
		while (s!=0) {
			System.out.println("MENU");
			System.out.println("1.Registrar un paciente");
			System.out.println("2.Registrar un medico");
			System.out.println("3.Registro de atencion al paciente");
			System.out.println("4.Detalle de los pacientes que se atendieron en el día por tipo de servicio");
			System.out.println("5.Detalle de pacientes atendidos por un servicio X");
			System.out.println("6.Detalle de pacientes atendidos por un doctor");
			System.out.println("7.porcentual por tipo de servicio ofrecido"); 
			System.out.println("8.Salir");
			System.out.println("");
			op=sc.nextInt();
			switch(op) {
			case 1:
				registroPaciente();
				break;
			case 2:
				registroMedico();
				break;
			case 3:
				registroAtencion();
				break;
			case 4:
				atendidos();
				break;
			case 5:
				atendidosTipo();
				break;
			case 6:
				porMedico();
				break;
			case 7:
				porcentual();
				break;
			}
		}
		
	}
	public static void main(String[] args) {
		Principal p= new Principal();
		p.menu();
		

	}

}
