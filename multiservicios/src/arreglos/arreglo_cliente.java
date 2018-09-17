package arreglos;

import classes.Cliente;
import java.io.*;
import java.util.ArrayList;
public class arreglo_cliente {
	
	private  ArrayList<Cliente> cli;
	public arreglo_cliente(){
		cli = new ArrayList<Cliente>();
		cargarClientes();
	}
	public int tamaño(){
		return cli.size();
	}
	public void eliminar(Cliente c){
		cli.remove(c);
	}
	public Cliente obtener(int pos){
		return cli.get(pos);
	}
	public void adicionar(Cliente c){
		cli.add(c);
		
	}
	
	public Cliente buscar(String placa){
		Cliente c;
		for (int i = 0; i < tamaño(); i++) {
			c= obtener(i);
			if (c.getPlaca().equals(placa)) {
				return c;
			}
		}
		return null;
	}
	
	
	public void grabarClientes(){
		try{
			PrintWriter pw;
			String linea;
			Cliente c;
			pw = new PrintWriter(new FileWriter("Cliente.txt"));
			for (int i=0; i<tamaño(); i++)
			{
				c=obtener(i);
				linea=	c.getNombre()+";"+
						c.getPlaca();
				pw.println(linea);
			}
			pw.close();
		}
		catch(Exception e){
			
		}
	}
	public void cargarClientes(){
		try{
			BufferedReader br;
			String linea,placa,nombre;
			String s[];
			
			br = new BufferedReader(new FileReader("Cliente.txt"));
			while((linea=br.readLine()) != null){
				s = linea.split(";");
				placa=s[0].trim();
				nombre=s[1].trim();
				adicionar(new Cliente(placa,nombre));
			}
			br.close();
		}
		catch(Exception e){
			
		}
	}
}
