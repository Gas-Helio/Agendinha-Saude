/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servidor;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Helio Junior
 */
public class Consulta_ObjetoTest {

    /**
     * Test of getID method, of class Consulta_Objeto.
     */
    @Test
    public void testGetID() {
        System.out.println("getID");
        Consulta_Objeto instance = new Consulta_Objeto(1,"TesteMed","TestePac","02/02/2019","08:00");
        int expResult = 1;
        int result = instance.getID();
        assertEquals(expResult, result);
    }

    /**
     * Test of getNMed method, of class Consulta_Objeto.
     */
    @Test
    public void testGetNMed() {
        System.out.println("getNMed");
        Consulta_Objeto instance = new Consulta_Objeto(1,"TesteMed","TestePac","02/02/2019","08:00");
        String expResult = "TesteMed";
        String result = instance.getNMed();
        assertEquals(expResult, result);
    }

    /**
     * Test of getNPac method, of class Consulta_Objeto.
     */
    @Test
    public void testGetNPac() {
        System.out.println("getNPac");
        Consulta_Objeto instance = new Consulta_Objeto(1,"TesteMed","TestePac","02/02/2019","08:00");
        String expResult = "TestePac";
        String result = instance.getNPac();
        assertEquals(expResult, result);
    }

    /**
     * Test of getData method, of class Consulta_Objeto.
     */
    @Test
    public void testGetData() {
        System.out.println("getData");
        Consulta_Objeto instance = new Consulta_Objeto(1,"TesteMed","TestePac","02/02/2019","08:00");
        String expResult = "02/02/2019";
        String result = instance.getData();
        assertEquals(expResult, result);
    }

    /**
     * Test of getHora method, of class Consulta_Objeto.
     */
    @Test
    public void testGetHora() {
        System.out.println("getHora");
        Consulta_Objeto instance = new Consulta_Objeto(1,"TesteMed","TestePac","02/02/2019","08:00");
        String expResult = "08:00";
        String result = instance.getHora();
        assertEquals(expResult, result);
    }
}
