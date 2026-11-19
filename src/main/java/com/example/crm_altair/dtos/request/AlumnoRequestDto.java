package com.example.crm_altair.dtos.request;

import java.time.LocalDate;

public record AlumnoRequestDto(
		String nombre_Alimno,
		String apellidos_Alumno,
		String dni_alumno,
		String numero_SS,
		String emain_Personal_Alumno,
		String telefono_Alumno,
		LocalDate fecha_Alta_Alumno,
		LocalDate fecha_Baja_Alumno,
		String email_Colegio_Alumno
		
) {}
