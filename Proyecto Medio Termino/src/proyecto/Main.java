package proyecto;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
    // TODO Auto-generated method stub

    Scanner sc= new Scanner(System.in);
		
    String nombre="";
    String apellidop="";
    String apellidom="";
    String direccion="";
    String rfc="";
    int departamento=0;
    String puesto="";
    int anio=0;
    int mes=0; 
    int dia=0; 
    int sueldo=0;
    boolean asignado=false;
    char continuar; 
    char menu;
    int i;
    int posicion=0;
    String buscaRFC="";
    		
    Empleado[] a = new Empleado[10];
    
    /*for (int x=0;x<a.length;x++)
        {
            a[x]=new Empleado(asignado);
        }
    */
    do
    {
        System.out.println("Menu - Elige una opción");
	System.out.println("a)Crear empleado");
	System.out.println("b)Borrar empleado");
	System.out.println("c)Modificar empleado");
	System.out.println("d)Terminar");
	
	menu=sc.next().charAt(0);
                        
        for (int j=0;j<a.length;j++)
        {
            if (a[j]==null)
                posicion=j;
        }
        
	switch (menu)
	{
            case 'a':
                                             
                sc.nextLine();
                
                System.out.println("Elegiste la opción a)Crear empleado");
		System.out.println("¿Cuál es tu nombre?");
		nombre=sc.nextLine();
					
		System.out.println("¿Cuál es tu apellido paterno?");
		apellidop=sc.nextLine();
					
		System.out.println("¿Cuál es tu apellido materno?");
		apellidom=sc.nextLine();
		                
                System.out.println("Introducir el año de nacimiento: ");
                anio=sc.nextInt();
                
                System.out.println("Introducir el mes de nacimiento: ");
                mes=sc.nextInt();
                
                System.out.println("Introducir el dia de nacimiento");
                dia=sc.nextInt();
                
                sc.nextLine();
                                
                System.out.println("Introducir direccion: ");
                direccion=sc.nextLine();
                
                System.out.println("Introducir rfc");
                rfc=sc.nextLine().toUpperCase();
                
                System.out.println("Introducir departamento:");
                departamento=sc.nextInt();
                
                sc.nextLine();
                
                System.out.println("Introducir puesto:");
                puesto=sc.nextLine();
                                               
                System.out.println("Introducir sueldo:");
                sueldo=sc.nextInt();
                
                a[posicion]=new Empleado(nombre, apellidop, apellidom, direccion, rfc, departamento,
			  puesto,anio,mes,dia,sueldo);
                                                                  
		break;
            case 'b':
                System.out.println("Elegiste la opción b)Borrar empleado");
                System.out.println("Introduzca el RFC: ");
                buscaRFC=sc.nextLine().toUpperCase();
                for (int y=0;y<a.length;y++)
                {
                    if (a[y].getRFC()==buscaRFC)
                        ;
                    else
                        System.out.println("No se encontro el RFC introducido");
                }
                        
		break;
            case 'c':
               	System.out.println("Elegiste la opcion c)Modificar empleado");
                System.out.println("Introduzca el RFC del empleado que desea modificar: ");
                buscaRFC=sc.nextLine();
                for (int z=0;z<a.length;z++)
                {
                    if(a[z].getRFC()==buscaRFC)
                    {
                        System.out.println("Datos que puede modificar: ");
                        System.out.println("a. Nombre");
                        System.out.println("b. Apellido Paterno");
                        System.out.println("c. Apellido Materno");
                        System.out.println("d. Fecha de Nacimiento");
                        System.out.println("e. Direccion");
                        System.out.println("f. Departamento");
                        System.out.println("g. Puesto");
                        System.out.println("h. Sueldo");
                        System.out.println("Introduzca que dato desea modificar: ");
                        menu=sc.next().charAt(0);
                        switch (menu)
                        {
                            case 'a':
                                System.out.println("Introduzca el nombre: ");
                                a[z].setNombre(sc.nextLine());
                                break;
                            case 'b':
                                System.out.println("Introduzca el apellido paterno: ");
                                a[z].setApellidoPaterno(sc.nextLine());
                                break;
                            case 'c':
                                System.out.println("Introduzca el apellido materno: ");
                                a[z].setApellidoMaterno(sc.nextLine());
                                break;
                            case 'd':
                                System.out.println("Introduzca la Fecha de Nacimiento: ");
                                //a[z].setFecha(sc.nextLine());
                                break;
                            case 'e':
                                System.out.println("Introduzca la direccion: ");
                                a[z].setDireccion(sc.nextLine());
                                break;
                            case 'f':
                                System.out.println("Introduzca el departamento: ");
                                a[z].setDepartamento(sc.nextInt());
                                break;
                            case 'g':
                                System.out.println("Introduzca el puesto: ");
                                a[z].setPuesto(sc.nextLine());
                                break;
                            case 'h':
                                System.out.println("Introduzca el sueldo: ");
                                a[z].setSueldoBruto(sc.nextInt());
                                break;
                                
                                                       
                    
                        
                    }
                }
                
                
                
                        
                }
		break;
            default:
		break;
			
	}
        System.out.println("¿Deseas continuar?(S/N)");
	continuar=sc.next().charAt(0);
    }
    while (continuar=='S');
    }
}
