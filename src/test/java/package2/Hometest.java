package package2;

import org.testng.Assert;
import org.testng.annotations.Test;

import package1.Basepage;
import package1.Homepage;

public class Hometest {
	Basepage bp;
	Homepage hp;
	public Hometest() {
		bp=new Basepage();
		hp=new Homepage();
				
		
	}
	@Test
	public void checkwomen() {
		Assert.assertTrue(bp.elementFound(hp.women()), "failed");
	}

}
