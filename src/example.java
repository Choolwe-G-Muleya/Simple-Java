
import java.awt.*;
import java.awt.event.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.MessageFormat;
import javax.swing.*;
import javax.swing.table.*;

/**
 * Summary description for example
 */
public class example extends JFrame
{
	// Variables declaration
	private JLabel jLabel1;
	private JLabel jLabel2;
	private JLabel jLabel3;
	private JLabel jLabel4;
	private JLabel jLabel5;
	private JLabel jLabel6;
	private JLabel jLabel7;
	private JLabel jLabel8;

	private JTextField jTextField1;
	private JTextField jTextField2;
	private JTextField jTextField3;
	private JTextField jTextField4;
	private JTextField jTextField5;
	private JTextField jTextField6;
	private JTextField jTextField7;
	private JTextField jTextField8;
	private JTable jTable1;
	private JScrollPane jScrollPane1;
	private JPanel contentPane;

	private JButton jButton1;
	private JButton jButton2;
	private JButton jButton3;
	private JButton jButton4;

	PreparedStatement pst = null;
	ResultSet rs = null;
	DefaultTableModel model = new DefaultTableModel();
	// End of variables declaration

	public example()
	{
		super();
		initializeComponent();

		this.setVisible(true);
	}
	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always regenerated
	 * by the Windows Form Designer. Otherwise, retrieving design might not work properly.
	 * Tip: If you must revise this method, please backup this GUI file for JFrameBuilder
	 * to retrieve your design properly in future, before revising this method.
	 */

	private JFrame frame;

	private void initializeComponent()
	{
		jLabel1 = new JLabel();
		jLabel2 = new JLabel();
		jLabel3 = new JLabel();
		jLabel4 = new JLabel();
		jLabel5 = new JLabel();
		jLabel6 = new JLabel();
		jLabel7 = new JLabel();
		jLabel8 = new JLabel();

		jTextField1 = new JTextField();
		jTextField2 = new JTextField();
		jTextField3 = new JTextField();
		jTextField4 = new JTextField();
		jTextField5 = new JTextField();
		jTextField6 = new JTextField();
		jTextField7 = new JTextField();
		jTextField8 = new JTextField();

		jButton1 = new JButton();
		jButton2 = new JButton();
		jButton3 = new JButton();
		jButton4 = new JButton();

		jTable1 = new JTable();
		jScrollPane1 = new JScrollPane();
		contentPane = (JPanel)this.getContentPane();
		//
		// jLabel1
		//
		jLabel1.setText("EmployeeID");
		//
		// jLabel2
		//
		jLabel2.setText("NRC_NO");
		//
		// jLabel3
		//
		jLabel3.setText("FirstName");
		//
		// jLabel4
		//
		jLabel4.setText("LastName");
		//
		// jLabel5
		//
		jLabel5.setText("Gender");
		//
		// jLabel6
		//
		jLabel6.setText("DoB");
		//
		// jLabel7
		//
		jLabel7.setText("Age");
		//
		// jLabel8
		//
		jLabel8.setText("Salary");
		//
		// jTextField1
		//
		jTextField1.setText("");
		jTextField1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				jTextField1_actionPerformed(e);
			}

		});
		//
		// jTextField2
		//
		jTextField2.setText("");
		jTextField2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				jTextField2_actionPerformed(e);
			}
		});
		//
		// jTextField3
		//
		jTextField3.setText("");
		jTextField3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				jTextField3_actionPerformed(e);
			}

		});
		//
		// jTextField4
		//
		jTextField4.setText("");
		jTextField4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				jTextField4_actionPerformed(e);
			}
		});
		// jTextField5
		//
		jTextField5.setText("");
		jTextField5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				jTextField5_actionPerformed(e);
			}

		});
		//
		// jTextField6
		//
		jTextField6.setText("");
		jTextField6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				jTextField6_actionPerformed(e);
			}
		});
		//
		// jTextField7
		//
		jTextField7.setText("");
		jTextField7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				jTextField7_actionPerformed(e);
			}
		});
		//
		// jTextField8
		//
		jTextField8.setText("");
		jTextField8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				jTextField8_actionPerformed(e);
			}
		});
		//
		// jButton1
		//
		jButton1.setText("Add Data");
		jButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				jButton1_actionPerformed(e);
			}

		});
		//
		// jButton2
		//
		jButton2.setText("Print");
		jButton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				jButton2_actionPerformed(e);
			}

		});
		//
		// jButton3
		//
		jButton3.setText("Clear Data");
		jButton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				jButton3_actionPerformed(e);
			}

		});
		//
		// jButton4
		//
		jButton4.setText("Exit");
		jButton4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				jButton4_actionPerformed(e);
			}

		});
		//
		// jTable1
		//
		Object cols[] = {"EmpID", "NRC_NO", "FirstName", "LastName", "Gender","DoB", "Age", "Salary"};
		model.setColumnIdentifiers(cols);
		jTable1.setModel(model);
		//
		// jScrollPane1
		//
		jScrollPane1.setViewportView(jTable1);
		//
		// contentPane
		//
		contentPane.setLayout(null);
		addComponent(contentPane, jLabel1, 14,70,60,22);
		addComponent(contentPane, jLabel2, 14,100,60,22);
		addComponent(contentPane, jLabel3, 14,130,60,22);
		addComponent(contentPane, jLabel4, 14,160,60,22);
		addComponent(contentPane, jLabel5, 14,190,60,22);
		addComponent(contentPane, jLabel6, 14,220,60,22);
		addComponent(contentPane, jLabel7, 14,250,60,22);
		addComponent(contentPane, jLabel8, 14,280,60,22);

		addComponent(contentPane, jTextField1, 114,70,110,22);
		addComponent(contentPane, jTextField2, 114,100,110,22);
		addComponent(contentPane, jTextField3, 114,130,110,22);
		addComponent(contentPane, jTextField4, 114,160,110,22);
		addComponent(contentPane, jTextField5, 114,190,110,22);
		addComponent(contentPane, jTextField6, 114,220,110,22);
		addComponent(contentPane, jTextField7, 114,250,110,22);
		addComponent(contentPane, jTextField8, 114,280,110,22);

		addComponent(contentPane, jScrollPane1, 242,68,534,202);

		addComponent(contentPane, jButton1, 59,335,92,28);
		addComponent(contentPane, jButton2, 213,335,92,28);
		addComponent(contentPane, jButton3, 381,335,92,28);
		addComponent(contentPane, jButton4, 546,335,92,28);
		//
		// example
		//
		this.setTitle("Employee Management System");
		this.setLocation(new Point(0, 0));
		this.setSize(new Dimension(815, 509));
	}
	/** Add Component Without a Layout Manager (Absolute Positioning) */
	private void addComponent(Container container,Component c,int x,int y,int width,int height)
	{
		c.setBounds(x,y,width,height);
		container.add(c);
	}

	private void jTextField1_actionPerformed(ActionEvent e)
	{
		System.out.println("\njTextField1_actionPerformed(ActionEvent e) called.");
		// TODO: Add any handling code here
	}

	private void jTextField2_actionPerformed(ActionEvent e)
	{
		System.out.println("\njTextField2_actionPerformed(ActionEvent e) called.");
		// TODO: Add any handling code here
	}

	private void jTextField3_actionPerformed(ActionEvent e)
	{
		System.out.println("\njTextField3_actionPerformed(ActionEvent e) called.");
		// TODO: Add any handling code here
	}

	private void jTextField4_actionPerformed(ActionEvent e)
	{
		System.out.println("\njTextField4_actionPerformed(ActionEvent e) called.");
		// TODO: Add any handling code here
	}
	private void jTextField5_actionPerformed(ActionEvent e)
	{
		System.out.println("\njTextField1_actionPerformed(ActionEvent e) called.");
		// TODO: Add any handling code here
	}

	private void jTextField6_actionPerformed(ActionEvent e)
	{
		System.out.println("\njTextField2_actionPerformed(ActionEvent e) called.");
		// TODO: Add any handling code here
	}

	private void jTextField7_actionPerformed(ActionEvent e)
	{
		System.out.println("\njTextField3_actionPerformed(ActionEvent e) called.");
		// TODO: Add any handling code here
	}

	private void jTextField8_actionPerformed(ActionEvent e) {
		System.out.println("\njTextField4_actionPerformed(ActionEvent e) called.");
		// TODO: Add any handling code here
	}

	private void jButton1_actionPerformed(ActionEvent e)
	{
		System.out.println("\njButton1_actionPerformed(ActionEvent e) called.");
		String sql = "INSERT INTO Employees(EmpID, NRC_NO, FirstName, LastName, Gender,DoB, Age, Salary) VALUES(?,?,?,?,?,?,?,?);";
		try{
//			pst = c.preparedStatement(sql);
			pst.setString(1, jTextField1.getText());
			pst.setString(2, jTextField2.getText());
			pst.setString(3, jTextField3.getText());
			pst.setString(4, jTextField4.getText());
			pst.setString(5, jTextField5.getText());
			pst.setString(6, jTextField6.getText());
			pst.setString(7, jTextField7.getText());
			pst.setString(8, jTextField8.getText());

			pst.execute();
			JOptionPane.showMessageDialog(null, "System Update Done..");

			rs.close();
			pst.close();
		}
		catch (Exception sql_entry_exception){
			JOptionPane.showMessageDialog(null, sql_entry_exception);
	}

	}

	private void jButton2_actionPerformed(ActionEvent e)
	{
		System.out.println("\njButton2_actionPerformed(ActionEvent e) called.");
		MessageFormat header = new MessageFormat("Printing in Progress");
		MessageFormat footer = new MessageFormat("Page [0, number, integer]");

		try {
			jTable1.print(JTable.PrintMode.NORMAL,header,footer);
		}catch(java.awt.print.PrinterException ex){
			System.err.format("No Printer found",ex.getMessage());
		}

	}

	private void jButton3_actionPerformed(ActionEvent e)
	{
		System.out.println("\njButton3_actionPerformed(ActionEvent e) called.");
		jTextField1.setText(null);
		jTextField2.setText(null);
		jTextField3.setText(null);
		jTextField4.setText(null);
		jTextField5.setText(null);
		jTextField6.setText(null);
		jTextField7.setText(null);
		jTextField8.setText(null);
	}

	private void jButton4_actionPerformed(ActionEvent e)
	{
		System.out.println("\njButton4_actionPerformed(ActionEvent e) called.");
		frame = new JFrame("Exit");
		if(JOptionPane.showConfirmDialog(frame,"Confirm if you want to exit", "Employee Management System",
				JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){
			System.exit(0);
		};

	}



	public static void main(String[] args)
	{
		SQLiteConnection con = new SQLiteConnection();
		con.connector();
		JFrame.setDefaultLookAndFeelDecorated(true);
		JDialog.setDefaultLookAndFeelDecorated(true);
		try
		{
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		}
		catch (Exception ex)
		{
			System.out.println("Failed loading L&F: ");
			System.out.println(ex);
		}
		new example();
	}

}
