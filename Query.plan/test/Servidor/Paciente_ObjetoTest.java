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
public class Paciente_ObjetoTest {
    /**
     * Test of getID method, of class Paciente_Objeto.
     */
    @Test
    public void testGetID() {
        System.out.println("getID");
        Paciente_Objeto instance = new Paciente_Objeto(3,"6132131","TestePac","22","85","1.9","pacteste","naotemsenha");
        int expResult = 3;
        int result = instance.getID();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCPF method, of class Paciente_Objeto.
     */
    @Test
    public void testGetCPF() {
        System.out.println("getCPF");
        Paciente_Objeto instance = new Paciente_Objeto(3,"6132131","TestePac","22","85","1.9","pacteste","naotemsenha");
        String expResult = "6132131";
        String result = instance.getCPF();
        assertEquals(expResult, result);
    }

    /**
     * Test of getNome method, of class Paciente_Objeto.
     */
    @Test
    public void testGetNome() {
        System.out.println("getNome");
        Paciente_Objeto instance = new Paciente_Objeto(3,"6132131","TestePac","22","85","1.9","pacteste","naotemsenha");
        String expResult = "TestePac";
        String result = instance.getNome();
        assertEquals(expResult, result);
    }

    /**
     * Test of getIdade method, of class Paciente_Objeto.
     */
    @Test
    public void testGetIdade() {
        System.out.println("getIdade");
        Paciente_Objeto instance = new Paciente_Objeto(3,"6132131","TestePac","22","85","1.9","pacteste","naotemsenha");
        String expResult = "22";
        String result = instance.getIdade();
        assertEquals(expResult, result);
    }

    /**
     * Test of getPeso method, of class Paciente_Objeto.
     */
    @Test
    public void testGetPeso() {
        System.out.println("getPeso");
        Paciente_Objeto instance = new Paciente_Objeto(3,"6132131","TestePac","22","85","1.9","pacteste","naotemsenha");
        String expResult = "85";
        String result = instance.getPeso();
        assertEquals(expResult, result);
    }

    /**
     * Test of getAltura method, of class Paciente_Objeto.
     */
    @Test
    public void testGetAltura() {
        System.out.println("getAltura");
        Paciente_Objeto instance = new Paciente_Objeto(3,"6132131","TestePac","22","85","1.9","pacteste","naotemsenha");
        String expResult = "1.9";
        String result = instance.getAltura();
        assertEquals(expResult, result);
    }

    /**
     * Test of getLogin method, of class Paciente_Objeto.
     */
    @Test
    public void testGetLogin() {
        System.out.println("getLogin");
        Paciente_Objeto instance = new Paciente_Objeto(3,"6132131","TestePac","22","85","1.9","pacteste","naotemsenha");
        String expResult = "pacteste";
        String result = instance.getLogin();
        assertEquals(expResult, result);
    }

    /**
     * Test of getSenha method, of class Paciente_Objeto.
     */
    @Test
    public void testGetSenha() {
        System.out.println("getSenha");
        Paciente_Objeto instance = new Paciente_Objeto(3,"6132131","TestePac","22","85","1.9","pacteste","naotemsenha");
        String expResult = "naotemsenha";
        String result = instance.getSenha();
        assertEquals(expResult, result);
    }
}
