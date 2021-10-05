package test;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import modelo.entidad.Autor;
import modelo.entidad.Editorial;
import modelo.entidad.Libreria;
import modelo.entidad.Libro;

public class AltaDatos {
	public static void main(String[] args) {
		EntityManagerFactory factoria = Persistence.createEntityManagerFactory("Libreria");
		EntityManager em = factoria.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Autor Jon = new Autor();
		Jon.setNombre("Jon");
		Jon.setApellido("Snow");
		Jon.setFecha_nac("8-08-1995");
				
		et.begin();
		em.persist(Jon);
		et.commit();
		
		System.out.println("Autor 1 creado");
		
		Autor severus = new Autor();
		severus.setNombre("Severus");
		severus.setApellido("Snape");
		severus.setFecha_nac("5-10-1965");
		
		et.begin();
		em.persist(severus);
		et.commit();
		
		System.out.println("Autor 2 creado");
		
		Autor albus = new Autor();
		albus.setNombre("Albus");
		albus.setApellido("Dumbledore");
		albus.setFecha_nac("2-2-1920");
		
		et.begin();
		em.persist(albus);
		et.commit();
		
		System.out.println("Autor 3 creado");
		
		Autor frodo = new Autor();
		frodo.setNombre("Frodo");
		frodo.setApellido("Bolsón");
		frodo.setFecha_nac("5-9-1990");
		
		et.begin();
		em.persist(frodo);
		et.commit();
		
		System.out.println("Autor 4 creado");
		
		Autor gollum = new Autor();
		gollum.setNombre("Gollum");
		gollum.setApellido("Smeagol");
		gollum.setFecha_nac("6-6-1945");
		
		et.begin();
		em.persist(gollum);
		et.commit();
		
		System.out.println("Autor 5 creado");
		
		System.out.println("############################## Autores Creados #############################");
		
		Editorial editorial1 = new Editorial();
		editorial1.setNombre("Editorial Isengard");
		editorial1.setDireccion("Calle Saruman 54");

		et.begin();
		em.persist(editorial1);
		et.commit();
		
		System.out.println("Editorial 1 creada");
		
		Editorial editorial2 = new Editorial();
		editorial2.setNombre("Editorial Hogwarts");
		editorial2.setDireccion("Calle Hogsmeade 57");

		et.begin();
		em.persist(editorial2);
		et.commit();
		
		System.out.println("Editorial 2 creada");
		
		Editorial editorial3 = new Editorial();
		editorial3.setNombre("Editorial Guardia de la noche");
		editorial3.setDireccion("Avenida El Muro 3");

		et.begin();
		em.persist(editorial3);
		et.commit();
		
		System.out.println("Editorial 3 creada");
		
		System.out.println("############################## Editoriales Creadas #############################");
		
		
		Libro libro1 = new Libro();
		
		libro1.setTitulo("Como ser un buen comandante");
		libro1.setPrecio(30);
		libro1.setAutor(Jon);
		libro1.setEditorial(editorial3);
		
		et.begin();
		em.persist(libro1);
		et.commit();
		System.out.println(libro1 + " creado");
		
		Libro libro2 = new Libro();
		
		libro2.setTitulo("10 maneras de hacerse amigo de un dragón");
		libro2.setPrecio(25.95);
		libro2.setAutor(Jon);
		libro2.setEditorial(editorial3);
		
		et.begin();
		em.persist(libro2);
		et.commit();
		System.out.println(libro2 + " creado");
		
		Libro libro3 = new Libro();
		
		libro3.setTitulo("Pociones");
		libro3.setPrecio(9);
		libro3.setAutor(severus);
		libro3.setEditorial(editorial2);
		
		et.begin();
		em.persist(libro3);
		et.commit();
		System.out.println(libro3 + " creado");
		
		Libro libro4 = new Libro();
		
		libro4.setTitulo("Infiltrados");
		libro4.setPrecio(5);
		libro4.setAutor(severus);
		libro4.setEditorial(editorial2);
		
		et.begin();
		em.persist(libro4);
		et.commit();
		System.out.println(libro4 + " creado");
		
		Libro libro5 = new Libro();
		
		libro5.setTitulo("Hablar inteligente para que nadie te entienda. Volumen 1");
		libro5.setPrecio(45);
		libro5.setAutor(albus);
		libro5.setEditorial(editorial2);
			
		et.begin();
		em.persist(libro5);
		et.commit();
		System.out.println(libro5 + " creado");
		
		Libro libro6 = new Libro();
		
		libro6.setTitulo("Como decirle a Harry Potter que no sea tan pesado");
		libro6.setPrecio(19);
		libro6.setAutor(albus);
		libro6.setEditorial(editorial2);
			
		et.begin();
		em.persist(libro6);
		et.commit();
		System.out.println(libro6 + " creado");
				
		Libro libro7 = new Libro();
				
		libro7.setTitulo("Usos de la sangre de Dragón");
		libro7.setPrecio(25);
		libro7.setAutor(albus);
		libro7.setEditorial(editorial2);
			
		et.begin();
		em.persist(libro7);
		et.commit();
		System.out.println(libro7 + " creado");
		
		Libro libro8 = new Libro();
		
		libro8.setTitulo("Tierra Media Maps");
		libro8.setPrecio(12);
		libro8.setAutor(frodo);
		libro8.setEditorial(editorial1);
			
		et.begin();
		em.persist(libro8);
		et.commit();
		System.out.println(libro8 + " creado");
		
		Libro libro9 = new Libro();
				
		libro9.setTitulo("Me sigue un bicho feo ¿Qué hacer?");
		libro9.setPrecio(4);
		libro9.setAutor(frodo);
		libro9.setEditorial(editorial1);
			
		et.begin();
		em.persist(libro9);
		et.commit();
		System.out.println(libro9 + " creado");
		
		Libro libro10 = new Libro();
		
		libro10.setTitulo("Catálogo de anillos únicos");
		libro10.setPrecio(9);
		libro10.setAutor(frodo);
		libro10.setEditorial(editorial1);
			
		et.begin();
		em.persist(libro10);
		et.commit();
		System.out.println(libro10 + " creado");
		
		Libro libro11 = new Libro();
		
		libro11.setTitulo("Cómo cocinar Hobbit sebosos");
		libro11.setPrecio(36);
		libro11.setAutor(gollum);
		libro11.setEditorial(editorial1);
			
		et.begin();
		em.persist(libro11);
		et.commit();
		System.out.println(libro11 + " creado");
		
		Libro libro12 = new Libro();
		
		libro12.setTitulo("Auto ayuda: ¿Debo robar el anillo?");
		libro12.setPrecio(36);
		libro12.setAutor(gollum);
		libro12.setEditorial(editorial1);
			
		et.begin();
		em.persist(libro12);
		et.commit();
		System.out.println(libro12 + " creado");
		
		System.out.println("############################## Libros Creados #############################");
		
		
		List<Libro> libros1 = new ArrayList<Libro>();
		libros1.add(libro1);
		libros1.add(libro2);		
		libros1.add(libro3);
		libros1.add(libro4);	
		libros1.add(libro5);
		libros1.add(libro6);	
		
		List<Libro> libros2 = new ArrayList<Libro>();
		libros2.add(libro7);
		libros2.add(libro8);		
		libros2.add(libro9);
		libros2.add(libro10);	
		libros2.add(libro11);
		libros2.add(libro12);	
		
		Libreria libreria1 = new Libreria();
		
		libreria1.setNombre("Libreria Ent");
		libreria1.setNombre_dueno("Bárbol");
		libreria1.setDireccion("Calle Bosque Negro 2");
		libreria1.setListaLibros(libros1);
		
		et.begin();
		em.persist(libreria1);
		et.commit();
		
		System.out.println("Librería 1 creada");

		Libreria libreria2 = new Libreria();
		
		libreria2.setNombre("Librería RocaDragon");
		libreria2.setNombre_dueno("Drogon");
		libreria2.setDireccion("Calle Daenerys 25");
		libreria2.setListaLibros(libros2);

		et.begin();
		em.persist(libreria2);
		et.commit();
		
		System.out.println("Librería 2 creada");
		
		System.out.println("############################## Librerías Creadas #############################");
		
		
		
		System.out.println("Consultas Requerimiento 2");
		
		
		System.out.println("Consulta sobre Libros y autor");
		Query query = em.createQuery("Select c from Libro c");
		List<Libro> list = query.getResultList();
		System.out.println("==== listado de Libros ====");
		System.out.println(list);
		System.out.println();
		
		System.out.println("Consulta sobre Autores");
		Query query2 = em.createQuery("Select c from Autor c");
		List<Autor> listAutores = query2.getResultList();
		System.out.println("==== listado de Autores ====");
		System.out.println(listAutores);
		System.out.println();
		
		System.out.println("Consulta sobre Librerias");
		Query query3 = em.createQuery("Select c from Libreria c");
		List<Libreria> listLibreria = query3.getResultList();
		System.out.println("==== listado de Librerias ====");
		System.out.println(listLibreria);
		System.out.println();
		

		em.close();
		
	}
}
