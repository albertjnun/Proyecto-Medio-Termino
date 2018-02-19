package proyecto;

public class Main {

	
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
                a[posicion]=new Empleado(nombre, apellidop, apellidom, direccion, rfc, departamento,
			  puesto,sueldo,asignado);
                              
                sc.nextLine();
                
                System.out.println("Elegiste la opción a)Crear empleado");
		System.out.println("¿Cuál es tu nombre?");
		a[posicion].setNombre(sc.nextLine());
		System.out.println("EL nuevo nombre es=" + a[posicion].getNombre());
			
		System.out.println("¿Cuál es tu apellido paterno?");
		a[posicion].setApellidoPaterno(sc.nextLine());
		System.out.println("EL nuevo nombre es=" + a[posicion].getApellidoPaterno());
			
		System.out.println("¿Cuál es tu apellido materno?");
		a[posicion].setApellidoMaterno(sc.nextLine());
		System.out.println("EL nuevo nombre es=" + a[posicion].getApellidoMaterno());
                
                System.out.println("Introducir direccion: ");
                a[posicion].setDireccion(sc.nextLine());
                
                System.out.println("Introducir rfc");
                a[posicion].setRFC(sc.nextLine());
                
                System.out.println("Introducir departamento:");
                a[posicion].setDepartamento(sc.nextInt());
                
                System.out.println("Introducir puesto:");
                a[posicion].setDepartamento(sc.nextInt());
                
                System.out.println("Introducir año:");
                a[posicion].setFecha(2018, 2, 1);
                
                System.out.println("Introducir sueldo:");
                a[posicion].setSueldoBruto(sc.nextInt());
                
                a[posicion].asignado=true;
                                                                  
		break;
            case 'b':
                System.out.println("Elegite la opción b)Borrar empleado");
		break;
            case 'c':
		System.out.println("Elegiste la opcion c)Modificar empleado");
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
