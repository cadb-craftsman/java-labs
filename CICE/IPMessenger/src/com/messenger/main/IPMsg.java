package com.messenger.main;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.UIManager.LookAndFeelInfo;

import com.messenger.gui.IPMsgEnviarGUI;

public class IPMsg {

	private static final String NIMBUS = "Nimbus";
	
	public static void main(String[] args) {
		
		try {
			LookAndFeelInfo [] info = UIManager.getInstalledLookAndFeels();
		    for (int i = 0; i < info.length; i++) {
		        if (NIMBUS.equals(info[i].getName())) {
		            UIManager.setLookAndFeel(info[i].getClassName());
		            break;
		        }
		    }
		} catch (UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
		    e.printStackTrace();
		} catch (InstantiationException e) {
		    e.printStackTrace();
		} catch (IllegalAccessException e) {
		    e.printStackTrace();
		}
		IPMsgEnviarGUI.getInstance().getFramePrincipal();		
	}
}
