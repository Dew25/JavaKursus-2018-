/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p3;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;
import static org.mockito.Mockito.*;

/**
 *
 * @author Melnikov
 */
public class SecurityCodeTest {
    
    @Test
    public void testYear(){
       //SecurityCode sc=new SecurityCode("37605030299");
       SecurityCode sc=mock(SecurityCode.class);
       when(sc.getYear()).thenReturn(1976);
       assertThat(sc.getYear(), is(1976));
    }
    
    public SecurityCodeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testCreate() {
        SecurityCode sc=new SecurityCode("37605030299");
    }
    @Test(expected=RuntimeException.class)
    public void testCreateInvalidLength() {
        SecurityCode sc=new SecurityCode("37605030");
    }
    
    @Test
    public void testMan(){
       SecurityCode sc=new SecurityCode("37605030299");
       assertThat(sc.getSex(), is("M"));
    }
    
}
