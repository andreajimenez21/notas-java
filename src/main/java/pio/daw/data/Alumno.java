package pio.daw.data;

import java.util.ArrayList;
import java.util.List;

public class Alumno extends AlumnoABC {

	public static Alumno fromLine(String line){
        String[] splited = line.strip().split(",");
        String nombre = splited[0];
        List<Double> notas = new ArrayList<>();
        for(int i = 1; i < splited.length ; i++){
            notas.add(Double.parseDouble(splited[i]));
        }
        return new Alumno(nombre, notas);
    }

    public Alumno(String nombre, List<Double> notas){
        super(nombre, notas);
    }
    
}
