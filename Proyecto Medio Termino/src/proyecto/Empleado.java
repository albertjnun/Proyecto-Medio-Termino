/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author alber
 */
public class Empleado {
    
    Scanner sc= new Scanner(System.in);

	public String Nombre,
				  ApellidoMaterno,
				  ApellidoPaterno,
				  Direccion,
				  RFC,
				  Departamento,
				  Puesto;
	
	public Calendar Fecha = new Calendar() {
            @Override
            protected void computeTime() {
                //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            protected void computeFields() {
                 //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void add(int i, int i1) {
                 //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void roll(int i, boolean bln) {
                //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public int getMinimum(int i) {
                return 0;//To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public int getMaximum(int i) {
                return 0; //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public int getGreatestMinimum(int i) {
                return 0;//To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public int getLeastMaximum(int i) {
                return 0;//To change body of generated methods, choose Tools | Templates.
            }
        };
	public int SueldoBruto;
                                       	
	public Empleado (String nombre,String apellidop,String apellidom,String direccion,String rfc,int departamento,
			  String puesto,int anio,int mes, int dia, int sueldo){
		setNombre(nombre);
		setApellidoPaterno(apellidop);
		setApellidoMaterno(apellidom);
		setFecha(anio, mes, dia);
		setDireccion(direccion);
		setDepartamento(departamento);
		setPuesto(puesto);
		setSueldoBruto(sueldo);
		setRFC(rfc);
                
	}
	
	public void setNombre(String a) {
		this.Nombre = a;
	}
	public void setApellidoMaterno(String a) {
		this.ApellidoMaterno = a;
	}
	public void setApellidoPaterno(String a) {
		this.ApellidoPaterno = a;
	}
	public void setDireccion(String a) {
		this.Direccion = a;
	}
	public void setRFC(String a) {
		char l1 = this.ApellidoPaterno.charAt(0);
		char l2 = 'a';
		char l7 = 'a', l8 = 'a', l9 = 'a', l10 = 'a';
		for (int i = 0; i < this.ApellidoPaterno.length(); i++) {
			switch (this.ApellidoPaterno.toUpperCase().charAt(i+1)) {
			case 'A':
				l2 = 'A';
				i = this.ApellidoPaterno.length();
				break;
			case 'E':
				l2 = 'E';
				i = this.ApellidoPaterno.length();
				break;
			case 'I':
				l2 = 'I';
				i = this.ApellidoPaterno.length();
				break;
			case 'O':
				l2 = 'O';
				i = this.ApellidoPaterno.length();
				break;
			case 'U':
				l2 = 'U';
				i = this.ApellidoPaterno.length();
				break;
			}
		}
		char l3 = this.ApellidoMaterno.charAt(0);
		char l4 = this.Nombre.charAt(0);
		char l5 = Integer.toString(this.Fecha.get(1)).charAt(2);
		char l6 = Integer.toString(this.Fecha.get(1)).charAt(3);
		if (this.Fecha.MONTH + 1 < 10) {
			 l7 = '0';
			 l8 = Integer.toString(this.Fecha.get(2)).charAt(0);
		}
		else {
			 l7 = Integer.toString(this.Fecha.get(2)).charAt(0);
			 l8 = Integer.toString(this.Fecha.get(2)).charAt(1);
		}
		if (this.Fecha.get(5) < 10) {
			 l9 = '0';
			 l10 = Integer.toString(this.Fecha.get(5)).charAt(0);
		}
		else {
			 l9 = Integer.toString(this.Fecha.get(5)).charAt(0);
			 l10 = Integer.toString(this.Fecha.get(5)).charAt(1);
		}
			
		char [] RFC = a.toCharArray();
		if (RFC [0] == l1 && RFC [1] == l2 && RFC [2] == l3 && RFC [3] == l4 && RFC [4] == l5
			&& RFC [5] == l6 && RFC [6] == l7 && RFC [7] == l8 && RFC [8] == l9 && RFC [9] == l10) {
			this.RFC = a;
		}
		else {
			System.out.println("El RFC es incorrecto.");
                        System.out.println("Vuelve a introducir el RFC. ");
                        String rfc=sc.nextLine().toUpperCase();
                        setRFC(rfc);
		}
                
                this.RFC=a;
	}
	public void setDepartamento(int a) {
		switch (a) {
                    case 1:
			this.Departamento = "Recursos Humanos";
			break;
                    case 2:
			this.Departamento = "Compras";
			break;
                    case 3:
			this.Departamento = "Inventario";
			break;
		}
		
	}
	public void setPuesto(String a) {
		this.Puesto = a;
	}
	public void setSueldoBruto(int a) {
		this.SueldoBruto = a;
	}
	public void setFecha(int a,int b, int c) {
		this.Fecha.set(a, b, c);
	}
        
	public String getRFC() {
		return this.RFC;
	}
	public String getNombre() {
		return Nombre;
	}
	public String getApellidoMaterno() {
		return ApellidoMaterno;
	}
	public String getApellidoPaterno() {
		return ApellidoPaterno;
	}
	public String getDireccion() {
		return Direccion;
	}
	public String getDepartamento() {
		return Departamento;
	}
	public String getPuesto() {
		return Puesto;
	}
	public Calendar getFecha() {
		return Fecha;
	}
	public int getSueldoBruto() {
		return SueldoBruto;
	}
                
}
    

