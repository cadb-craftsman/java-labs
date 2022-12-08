package com.messenger.gui;

import java.awt.BorderLayout;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class IPMsgRecibirGUI {

	private JFrame framePrincipal = null;
	private JPanel panelPrincipal = null;	
	private JTextArea jtxtAMensajeRecibir = null;	
	private JButton jbtnResponder = null;
	private JButton jbtnCerrar = null;
	private JButton jbtnAbrir = null;
	private JCheckBox jcheckCitar = null;	
	private JPanel jpanelMensajeDe = null;
	private JPanel jpanelTextArea = null;
	private JPanel jpanelBotonera = null;
	private JLabel jlblUsuario = null;
	private JLabel jlblFechaHora = null;	
	private static IPMsgRecibirGUI recibirMsg = null;
	
	public JFrame getFramePrincipal() {
		if (framePrincipal == null) {
			framePrincipal = new JFrame("Receive Message +++");
			framePrincipal.setLayout(null);
			framePrincipal.setBounds(new Rectangle(200, 200, 380, 310));
			framePrincipal.add(getPanelPrincipal());
			framePrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			framePrincipal.setResizable(false);
			framePrincipal.setVisible(true);			
		}
		return framePrincipal;
	}
	
	private JPanel getPanelPrincipal() {
		if (panelPrincipal == null) {
			panelPrincipal = new JPanel();
			panelPrincipal.setLayout(null);						
			panelPrincipal.add(getJpanelMensajeDe(), BorderLayout.NORTH);			
			panelPrincipal.add(getJpanelTextArea(), BorderLayout.CENTER);
			panelPrincipal.add(getJpanelBotonera(), BorderLayout.SOUTH);
			panelPrincipal.setSize(380, 300);
		}
		return panelPrincipal;
	}
	
	private JPanel getJpanelTextArea() {
		if (jpanelTextArea == null) {
			jpanelTextArea = new JPanel();
			jpanelTextArea.setLayout(null);
			jpanelTextArea.setBounds(new Rectangle(5, 80, 350, 150));
			if (true) {
				jpanelTextArea.add(getJbtnAbrir());
			}else{
				jpanelTextArea.add(getJtxtAMensajeRecibir());
			}			
		}
		return jpanelTextArea;
	}
	
	private JPanel getJpanelBotonera() {
		if (jpanelBotonera == null) {
			jpanelBotonera = new JPanel();
			jpanelBotonera.setLayout(null);
			jpanelBotonera.setBounds(new Rectangle(5, 230, 350, 40));
			jpanelBotonera.add(getJbtnCerrar());
			jpanelBotonera.add(getJbtnResponder());
			jpanelBotonera.add(getJcheckCitar());
		}
		return jpanelBotonera;
	}
	
	private JTextArea getJtxtAMensajeRecibir() {
		if (jtxtAMensajeRecibir == null) {
			jtxtAMensajeRecibir = new JTextArea();
			jtxtAMensajeRecibir.setBounds(new Rectangle(0, 0, 350, 150));
			jtxtAMensajeRecibir.setEditable(true);	
			jtxtAMensajeRecibir.setEnabled(false);
		}
		return jtxtAMensajeRecibir;
	}
	
	private JButton getJbtnAbrir() {
		if (jbtnAbrir == null) {
			jbtnAbrir = new JButton("Open");
			jbtnAbrir.setBounds(new Rectangle(0, 0, 350, 150));
			jbtnAbrir.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent evt){
					getJpanelTextArea().add(getJtxtAMensajeRecibir());
					jbtnAbrir.setVisible(false);
				}
			});
		}
		return jbtnAbrir;
	}
	
	private JButton getJbtnResponder() {
		if (jbtnResponder == null) {
			jbtnResponder = new JButton("Reply");
			jbtnResponder.setBounds(new Rectangle(180, 5, 100, 30));
			jbtnResponder.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent evt){
					IPMsgEnviarGUI.getInstance().getFramePrincipal();					
				}
			});
		}
		return jbtnResponder;
	}
	private JButton getJbtnCerrar() {
		if (jbtnCerrar == null) {
			jbtnCerrar = new JButton("Close");
			jbtnCerrar.setBounds(new Rectangle(50, 5, 100, 30));
			jbtnCerrar.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent evt){
					System.exit(0);
				}
			});
		}
		return jbtnCerrar;
	}
	private JCheckBox getJcheckCitar() {
		if (jcheckCitar == null) {
			jcheckCitar = new JCheckBox("Quote");	
			jcheckCitar.setBounds(new Rectangle(290, 5, 100, 30));
		}
		return jcheckCitar;
	}
	
	private JLabel getJlblUsuario() {
		if (jlblUsuario == null) {
			jlblUsuario = new JLabel("charlie (GDI/ISBCXIS07997)");
			jlblUsuario.setBounds(new Rectangle(100, 15, 200, 30));
		}
		return jlblUsuario;
	}
	
	private JLabel getJlblFechaHora() {
		if (jlblFechaHora == null) {
			jlblFechaHora = new JLabel("at Fri Jun 17 12:09:51 2011");
			jlblFechaHora.setBounds(new Rectangle(100, 35, 200, 30));
		}
		return jlblFechaHora;
	}
	
	private JPanel getJpanelMensajeDe() {
		if (jpanelMensajeDe == null) {
			jpanelMensajeDe = new JPanel();
			jpanelMensajeDe.setLayout(null);
			jpanelMensajeDe.setBounds(new Rectangle(5, 5, 350, 70));
			jpanelMensajeDe.setBorder(BorderFactory.createTitledBorder("Message From"));
			jpanelMensajeDe.add(getJlblUsuario());
			jpanelMensajeDe.add(getJlblFechaHora());			
		}
		return jpanelMensajeDe;
	}	
	
	private static synchronized void createInstance(){
		if (recibirMsg == null) {
			recibirMsg = new IPMsgRecibirGUI();
		}
	}
	
	public static IPMsgRecibirGUI getInstance(){
		if (recibirMsg == null) {
			createInstance();
		}
		return recibirMsg;
	}
}
