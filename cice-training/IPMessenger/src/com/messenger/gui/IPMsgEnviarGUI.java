package com.messenger.gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;

import com.messenger.cliente.IPCliente;

public class IPMsgEnviarGUI {

	private JFrame framePrincipal = null;
	private JPanel panelPrincipal = null;
	private JPanel jpanelTablaContactos = null;
	private JPanel jpanelTabla = null;
	//private JPanel jpanelAdjuntos = null;
	private JPanel jpanelTextArea = null;
	private JPanel jpanelBotonera = null;
	private JTextArea jtxtAMensajeEnviar = null;
	private JButton jbtnEnviar = null;
	private JButton jbtnRefrescar = null;
	private JButton jbtnOpciones = null;
	//private JButton jbtnAdjuntos = null;
	private JCheckBox jcheckSellar = null;
	private JCheckBox jcheckBloquear = null;
	private JLabel jlblMiembros = null;
	private JTable jtableContactos = null;
	private JScrollPane jscrollPaneTabla = null;
	private static IPMsgEnviarGUI enviarMsg = null;
	private String[] columnas = { "User", "Group", "Ip Address" };
	private IPCliente ipCliente;
	
	public IPMsgEnviarGUI(){
		ipCliente = new IPCliente();		
	}	

	public JFrame getFramePrincipal() {
		if (framePrincipal == null) {
			framePrincipal = new JFrame("Send Message");
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
			panelPrincipal.add(getJpanelTablaContactos(), BorderLayout.NORTH);			
			panelPrincipal.add(getJpanelTextArea(), BorderLayout.CENTER);
			panelPrincipal.add(getJpanelBotonera(), BorderLayout.SOUTH);
			panelPrincipal.setSize(380, 310);
		}
		return panelPrincipal;
	}

	private JPanel getJpanelTablaContactos() {
		if (jpanelTablaContactos == null) {
			jpanelTablaContactos = new JPanel();
			jpanelTablaContactos.setLayout(null);
			jpanelTablaContactos.setBounds(new Rectangle(5, 5, 350, 100));
			jpanelTablaContactos.add(getJpanelTabla());
			jpanelTablaContactos.add(getJbtnRefrescar());
			jpanelTablaContactos.add(getJlblMiembros());
			jpanelTablaContactos.add(getJbtnOpciones());
		}
		return jpanelTablaContactos;
	}

	private JPanel getJpanelTabla() {
		if (jpanelTabla == null) {
			jpanelTabla = new JPanel();
			jpanelTabla.setLayout(null);
			jpanelTabla.setBounds(new Rectangle(0, 0, 270, 100));
			jpanelTabla.setBorder(BorderFactory.createTitledBorder(""));
			jpanelTabla.add(getJscrollPaneTabla());
		}
		return jpanelTabla;
	}

	/*
	private JPanel getJpanelAdjuntos() {
		if (jpanelAdjuntos == null) {
			jpanelAdjuntos = new JPanel();
			jpanelAdjuntos.add(getJbtnAdjuntos());
			jpanelAdjuntos.setBounds(new Rectangle(5, 110, 380, 25));
		}
		return jpanelAdjuntos;
	}
	 */
	private JPanel getJpanelTextArea() {
		if (jpanelTextArea == null) {
			jpanelTextArea = new JPanel();
			jpanelTextArea.setLayout(null);
			jpanelTextArea.add(getJtxtAMensajeEnviar());
			jpanelTextArea.setBounds(new Rectangle(5, 110, 350, 120));
		}
		return jpanelTextArea;
	}

	private JPanel getJpanelBotonera() {
		if (jpanelBotonera == null) {
			jpanelBotonera = new JPanel();
			jpanelBotonera.setLayout(null);
			jpanelBotonera.setBounds(new Rectangle(5, 230, 350, 40));
			jpanelBotonera.add(getJbtnEnviar());
			jpanelBotonera.add(getJcheckSellar());
			jpanelBotonera.add(getJcheckBloquear());
		}
		return jpanelBotonera;
	}

	private JTextArea getJtxtAMensajeEnviar() {
		if (jtxtAMensajeEnviar == null) {
			jtxtAMensajeEnviar = new JTextArea();
			jtxtAMensajeEnviar.setBounds(new Rectangle(0, 0, 350, 120));
		}
		return jtxtAMensajeEnviar;
	}

	private JButton getJbtnEnviar() {
		if (jbtnEnviar == null) {
			jbtnEnviar = new JButton("Send");
			jbtnEnviar.setBounds(new Rectangle(120, 5, 100, 30));
			jbtnEnviar.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent evt){
					ipCliente.setUpNetworking();					
					ipCliente.sendClientMessage(getJtxtAMensajeEnviar().getText());
				}
			});
		}
		return jbtnEnviar;
	}

	private JButton getJbtnRefrescar() {
		if (jbtnRefrescar == null) {
			jbtnRefrescar = new JButton("Refresh");
			jbtnRefrescar.setBounds(new Rectangle(270, 40, 75, 30));
		}
		return jbtnRefrescar;
	}

	private JButton getJbtnOpciones() {
		if (jbtnOpciones == null) {
			jbtnOpciones = new JButton(">");
			jbtnOpciones.setBounds(new Rectangle(310, 70, 35, 25));
		}
		return jbtnOpciones;
	}

	/*
	private JButton getJbtnAdjuntos() {
		if (jbtnAdjuntos == null) {
			jbtnAdjuntos = new JButton("archivo");
			jbtnAdjuntos.setBounds(new Rectangle(0,0, 380, 25));
		}
		return jbtnAdjuntos;
	}
	 */
	private JCheckBox getJcheckSellar() {
		if (jcheckSellar == null) {
			jcheckSellar = new JCheckBox("seal");
			jcheckSellar.setBounds(new Rectangle(230, 5, 50, 30));
		}
		return jcheckSellar;
	}

	private JCheckBox getJcheckBloquear() {
		if (jcheckBloquear == null) {
			jcheckBloquear = new JCheckBox("lock");
			jcheckBloquear.setBounds(new Rectangle(290, 5, 50, 30));
		}
		return jcheckBloquear;
	}

	private JLabel getJlblMiembros() {
		if (jlblMiembros == null) {
			jlblMiembros = new JLabel("Members");
			jlblMiembros.setBounds(new Rectangle(270, 5, 80, 30));
			jlblMiembros.setBorder(BorderFactory.createTitledBorder(""));
		}
		return jlblMiembros;
	}

	private JTable getJtableContactos() {
		if (jtableContactos == null) {
			jtableContactos = new JTable(getClientesConectados(), columnas);
			jtableContactos.setBounds(new Rectangle(5, 5, 260, 85));
			jtableContactos.setPreferredScrollableViewportSize(new Dimension(250, 80));
		}
		return jtableContactos;
	}

	private JScrollPane getJscrollPaneTabla() {
		if (jscrollPaneTabla == null) {
			jscrollPaneTabla = new JScrollPane(getJtableContactos());
			jscrollPaneTabla.setBounds(new Rectangle(5, 5, 260, 85));
			jscrollPaneTabla.setAutoscrolls(true);
		}
		return jscrollPaneTabla;
	}

	private Object [][] getClientesConectados(){		
		Object[][] data = { { ipCliente.getHostName(), "Admin", ipCliente.getIP() }};
		return data;
	}
	
	private static synchronized void createInstance() {
		if (enviarMsg == null) {
			enviarMsg = new IPMsgEnviarGUI();
		}
	}

	public static IPMsgEnviarGUI getInstance() {
		if (enviarMsg == null) {
			createInstance();
		}
		return enviarMsg;
	}
}
