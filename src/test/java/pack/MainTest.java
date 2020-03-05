package pack;

import static org.junit.Assert.*;

import org.junit.Test;

public class MainTest {

		@Test
		public void test() {
			Main j=new Main();
			assertEquals(5,j.sum(2, 3));
		}

	}

