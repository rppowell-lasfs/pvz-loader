import org.apache.log4j.Logger;

import java.io.File;

import org.apache.log4j.BasicConfigurator;
import org.lasfs.pvzloader.swing.PVZJFrame;

public class PVZLoader {
	Logger logger = Logger.getLogger(PVZLoader.class);
	File pvzLocation;
	// C:\ProgramData\Reflexive\PlantsVsZombies


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PVZLoader loader = new PVZLoader();
	}
	
	public PVZLoader () {
		logger = Logger.getLogger(PVZLoader.class);
		BasicConfigurator.configure();
		PVZJFrame f = new PVZJFrame();
		pvzLocation = new File("C:\\ProgramData\\Reflexive\\PlantsVsZombies");
		PVZInstanceFactory pvzInstanceFactory = new PVZInstanceFactory(pvzLocation);
		
		PVZInstance[] PVZInstances = pvzInstanceFactory.getInstances();
		
		f.setVisible(true);
	}
	
	private boolean checkPVZInstallation() {
		logger.info(System.getProperties());
		return false;
	}

}
