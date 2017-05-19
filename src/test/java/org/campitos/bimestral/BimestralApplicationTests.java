package org.campitos.bimestral;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BimestralApplicationTests {

	@Test
	public void contextLoads() {
	}
        
        @Test
        public void probarHola()throws Exception {
        assertEquals(4, 2 + 2);
        }

}
