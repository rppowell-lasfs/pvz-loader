package org.lasfs.pvzloader.swing;

import javax.swing.JFrame;

public class PVZJFrame extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public PVZJFrame() {
		addWindowListener(new PVZWindowAdapter(this));
		
	}

}
