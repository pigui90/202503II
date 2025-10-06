package service;

import java.math.BigDecimal;
import java.math.MathContext;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		String menu = "********************\n** Bienvenido al sistema de la clase 4\n-> 1-\n** 2-\n** 3-\n** Digite una opcion: \n**************************";

		try {
			JOptionPane.showMessageDialog(null, menu);
			
			
			SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");

			Date fechaParaStr = new Date();
			JOptionPane.showMessageDialog(null, fechaParaStr);

			String fechaStr = sdf.format(fechaParaStr);
			JOptionPane.showMessageDialog(null, fechaStr);

			String dateStr = "04-10-2025 08:20:50";

			Date dateUsuario = sdf.parse(dateStr);

			JOptionPane.showMessageDialog(null, dateUsuario);

			LocalDate fechaLD = dateUsuario.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

			JOptionPane.showMessageDialog(null, fechaLD.minusDays(7));
			fechaLD = fechaLD.minusDays(7);

			dateUsuario = Date.from(fechaLD.atStartOfDay(ZoneId.systemDefault()).toInstant());

			JOptionPane.showMessageDialog(null, dateUsuario);

			fechaStr = sdf.format(dateUsuario);

			JOptionPane.showMessageDialog(null, fechaStr);

			LocalDate fechaLD2 = LocalDate.now();
			JOptionPane.showMessageDialog(null, fechaLD2);

			BigDecimal salario = new BigDecimal(1000000);
			BigDecimal anualidad = new BigDecimal("500000");
			BigDecimal renta = BigDecimal.ONE;
			salario = salario.add(anualidad);
			BigDecimal rentaMonto = salario.multiply(renta, MathContext.DECIMAL128).divide(new BigDecimal(100),MathContext.DECIMAL128);
			JOptionPane.showMessageDialog(null, rentaMonto);

			salario = salario.subtract(rentaMonto);
			JOptionPane.showMessageDialog(null, salario);
			
			
		} catch (ParseException pe) {
			JOptionPane.showMessageDialog(null, pe.getMessage() + "\ndebe usar un formato dd-MM-yyyy HH:mm:ss",
					"Error al convertir", JOptionPane.ERROR_MESSAGE);
		}

	}

}
