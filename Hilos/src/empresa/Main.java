/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa;

/**
 *
 * @author Samuel
 */
public class Main {
    
	public static void main(String[] args) {
		Cola cola = new Cola();
		
		Productor p1 = new Productor("Productor 1",cola);
		Productor p2 = new Productor("Productor 2",cola);
		Productor p3 = new Productor("Productor 3",cola);
                		
		Consumidor c1 = new Consumidor("Consumidor 1",cola);
		Consumidor c2 = new Consumidor("Consumidor 2",cola);
		
		p1.start();
		p2.start();
		p3.start();
		
		c1.start();
		c2.start();
	}
}
   
