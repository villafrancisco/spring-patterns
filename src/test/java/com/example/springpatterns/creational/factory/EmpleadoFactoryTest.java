package com.example.springpatterns.creational.factory;

import com.example.springpatterns.patterns.creational.factory.Empleado;
import com.example.springpatterns.patterns.creational.factory.EmpleadoFactory;
import com.example.springpatterns.patterns.creational.factory.EmpleadoType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("EmpleadoFactoryTest")
class EmpleadoFactoryTest {

    EmpleadoFactory empleadoFactory;

    @BeforeEach
    void setUp() {
        empleadoFactory = new EmpleadoFactory();
    }

    @Test
    @DisplayName("Seleccionar empleado mecanico")
    void getEmpleadoMecanico() {
        Empleado empleado=empleadoFactory.getEmpleado(EmpleadoType.MECANICO);
        assertEquals("Mecanico",empleado.getClass().getSimpleName());
    }
    @Test
    @DisplayName("Seleccionar empleado programador")
    void getEmpleadoProgramador() {
        Empleado empleado=empleadoFactory.getEmpleado(EmpleadoType.PROGRAMADOR);
        assertEquals("Programador",empleado.getClass().getSimpleName());
    }

}