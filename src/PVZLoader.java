import org.apache.log4j.Logger;

import java.io.File;

import org.apache.log4j.BasicConfigurator;
import org.lasfs.pvzloader.swing.PVZJFrame;

public class PVZLoader {
	Logger logger = Logger.getLogger(PVZLoader.class);
	File location;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PVZLoader loader = new PVZLoader();
	}
	
	public PVZLoader () {
		logger = Logger.getLogger(PVZLoader.class);
		BasicConfigurator.configure();
		PVZJFrame f = new PVZJFrame();
		f.setVisible(true);
	}
	
	private boolean checkPVZInstallation() {
		logger.info(System.getProperties());
		return false;
	}

}
