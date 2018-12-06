/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servidor;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Helio Junior
 */
public class Medico_ObjetoTest {
    /**
     * Test of getID method, of class Medico_Objeto.
     */
    @Test
    public void testGetID() {
        System.out.println("getID");
        Medico_Objeto instance = new Medico_Objeto(2,"6243624","TesteMed","32424","Cabeça","Consulta geral","120");
        int expResult = 2;
        int result = instance.getID();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCPF method, of class Medico_Objeto.
     */
    @Test
    public void testGetCPF() {
        System.out.println("getCPF");
        Medico_Objeto instance = new Medico_Objeto(2,"6243624","TesteMed","32424","Cabeça","Consulta geral","120");
        String expResult = "6243624";
        String result = instance.getCPF();
        assertEquals(expResult, result);
    }

    /**
     * Test of getNome method, of class Medico_Objeto.
     */
    @Test
    public void testGetNome() {
        System.out.println("getNome");
        Medico_Objeto instance = new Medico_Objeto(2,"6243624","TesteMed","32424","Cabeça","Consulta geral","120");
        String expResult = "TesteMed";
        String result = instance.getNome();
        assertEquals(expResult, result);
    }

    /**
     * Test of getEsp method, of class Medico_Objeto.
     */
    @Test
    public void testGetEsp() {
        System.out.println("getEsp");
        Medico_Objeto instance = new Medico_Objeto(2,"6243624","TesteMed","32424","Cabeça","Consulta geral","120");
        String expResult = "Cabeça";
        String result = instance.getEsp();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCRM method, of class Medico_Objeto.
     */
    @Test
    public void testGetCRM() {
        System.out.println("getCRM");
        Medico_Objeto instance = new Medico_Objeto(2,"6243624","TesteMed","32424","Cabeça","Consulta geral","120");
        String expResult = "32424";
        String result = instance.getCRM();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDesc method, of class Medico_Objeto.
     */
    @Test
    public void testGetDesc() {
        System.out.println("getDesc");
        Medico_Objeto instance = new Medico_Objeto(2,"6243624","TesteMed","32424","Cabeça","Consulta geral","120");
        String expResult = "Consulta geral";
        String result = instance.getDesc();
        assertEquals(expResult, result);
    }

    /**
     * Test of getValor method, of class Medico_Objeto.
     */
    @Test
    public void testGetValor() {
        System.out.println("getValor");
        Medico_Objeto instance = new Medico_Objeto(2,"6243624","TesteMed","32424","Cabeça","Consulta geral","120");
        String expResult = "120";
        String result = instance.getValor();
        assertEquals(expResult, result);
    }
}
