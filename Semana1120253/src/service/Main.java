package service;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		try {
			File archivo = new File("saludos.txt");

			if (!archivo.exists()) {
				if (archivo.createNewFile()) {
					JOptionPane.showMessageDialog(null, "Se ha creado el archivo");
				}
			} else {
				JOptionPane.showMessageDialog(null, "Archivo ya existia");
			}
			int opcion;
			do {

				String menu = "1. Leer\n2. Escribir\n3. Salir\n4. Archivo Completo";

				opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));
				String linea;
				switch (opcion) {
				case 1:
					FileReader fileReader = new FileReader(archivo);
					BufferedReader bufferedReader = new BufferedReader(fileReader);

					linea = bufferedReader.readLine();
					String cadena = "";
					
					
					while (linea != null) {
						int i = 0;
						do {
							while (i < linea.length() && linea.charAt(i) != '|') {
								cadena = cadena + linea.charAt(i);
								System.out.println(cadena);
								i++;
							}
							JOptionPane.showMessageDialog(null, cadena);
							cadena = "";
							i++;
						} while (i < linea.length());
						cadena = cadena + "\n";
						linea = bufferedReader.readLine();
					}

					bufferedReader.close();

					break;
				case 2:

					FileWriter fileWriter = new FileWriter(archivo, true);
					BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
					String texto = JOptionPane.showInputDialog("Agregue un texto");
					bufferedWriter.write(texto);
					bufferedWriter.newLine();

					bufferedWriter.close();
					break;
				case 3:
					JOptionPane.showMessageDialog(null, "Saliendo");
					break;

				case 4:
					FileReader fr = new FileReader(archivo);
					BufferedReader br = new BufferedReader(fr);

					linea = br.readLine();

					while (linea != null) {
						JOptionPane.showMessageDialog(null, linea);
						linea = br.readLine();
					}

					break;

				default:
					JOptionPane.showMessageDialog(null, "Opcion no valida");
					break;
				}
			} while (opcion != 3);
		} catch (IOException ioException) {
			JOptionPane.showMessageDialog(null, ioException.getMessage());
		}

	}

}
