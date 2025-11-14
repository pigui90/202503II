package service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.JOptionPane;

import model.Campus;

public class Main {

	public static void main(String[] args) {
		try {
			// Vector String con datos precargados
			String vectorAnimales[] = { "VACA", "PERRO", "GATO" };
			String animal = vectorAnimales[0].toString();
			Campus campus;

			List<Campus> listaCampus = new ArrayList<Campus>();

			for (int i = 0; i < 3; i++) {
				campus = new Campus();
				campus.setUbicacion(JOptionPane.showInputDialog("Indique la ubicacion"));
				campus.setNombre(JOptionPane.showInputDialog("Indique el nombre"));
				campus.setNumero(i);
				listaCampus.add(campus);
			}

			for (Campus campusEach : listaCampus) {
				JOptionPane.showMessageDialog(null, campusEach.toString());
			}

			List<String> nombres = new ArrayList<String>();
			nombres.add("Sergio");
			nombres.add("Jonathan");
			nombres.add("Diogo");
			nombres.add("Yari");
			nombres.add("Daniel");
			nombres.add("Josue");
			nombres.add("Diego");
			nombres.add("Salma");
			nombres.add("Dagoberto");

			for (int i = 0; i < nombres.size(); i++) {
				if (nombres.get(i).toString().equals("Daniel")) {
					nombres.remove(i);
				}
			}

			int posicion = Integer.parseInt(JOptionPane
					.showInputDialog("Digite la posicion a eliminar, el tamaño es " + (listaCampus.size() - 1)));

			listaCampus.remove(posicion);

			for (Campus campusEach : listaCampus) {
				JOptionPane.showMessageDialog(null, campusEach.toString());
			}

			for (Iterator<String> iterator = nombres.iterator(); iterator.hasNext();) {
				String nombre = iterator.next();
				JOptionPane.showMessageDialog(null, nombre);
			}

			for (Campus campusMod : listaCampus) {
				if (campusMod.getNumero() == 1) {
					campusMod.setNombre(JOptionPane.showInputDialog("Indique otro nombre"));
				}
			}
			
			for (int i = 0; i < listaCampus.size(); i++) {
				String ubicacion = listaCampus.get(i).getUbicacion();
			}

			JOptionPane.showMessageDialog(null, listaCampus.size());

			for (Campus campusEach : listaCampus) {
				JOptionPane.showMessageDialog(null, campusEach.toString());
			}

		} catch (IndexOutOfBoundsException exception) {
			JOptionPane.showMessageDialog(null, "Error de posicion");
		}
	}

}
