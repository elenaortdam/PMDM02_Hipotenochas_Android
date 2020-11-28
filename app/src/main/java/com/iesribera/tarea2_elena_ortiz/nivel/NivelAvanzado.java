package com.iesribera.tarea2_elena_ortiz.nivel;


import com.iesribera.tarea2_elena_ortiz.Valores;

public class NivelAvanzado extends Nivel {
	@Override public String getNombre() {
		return Valores.NivelAvanzado.NOMBRE;
	}

	@Override public int getFilas() {
		return Valores.NivelAvanzado.FILAS;
	}

	@Override public int getColumnas() {
		return Valores.NivelAvanzado.COLUMNAS;
	}

	@Override public int getHipotenochasOcultas() {
		return Valores.NivelAvanzado.HIPOTENOCHAS;
	}
}