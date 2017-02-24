package tsc.draft.AWTSwing;

import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;

public class ModelTable extends JxFrame {
	public ModelTable() {
		super("Simple table");
		JPanel jp = new JPanel();
		getContentPane().add(jp);
		JTable table = new JTable(new MusicModel());
		JScrollPane sp = new JScrollPane(table);
		table.setPreferredScrollableViewportSize(new Dimension(250, 170));
		jp.add(sp);

		setSize(300, 200);
		setVisible(true);
	}

	static public void main(String argv[]) {
		new ModelTable();
	}

	class MusicModel extends AbstractTableModel {

		String[] columnNames = { "Composer", "Title", "Orchestral" };

		Object[][] musicData = {
				{ "Tschaikovsky", "1812 Overture", new Boolean(true) },
				{ "Stravinsky", "Le Sacre", new Boolean(true) },
				{ "Lennon", "Eleanor Rigby", new Boolean(false) },
				{ "Wagner", "Gotterdammerung", new Boolean(true) } };

		int rowCount, columnCount;

		// ------------------------------------------
		public MusicModel() {
			rowCount = 4;
			columnCount = 3;
		}

		// ------------------------------------------
		public String getColumnName(int col) {
			return columnNames[col];
		}

		// ------------------------------------------
		public int getRowCount() {
			return rowCount;
		}

		public int getColumnCount() {
			return columnCount;
		}

		// ------------------------------------------
		public Class getColumnClass(int col) {
			return getValueAt(0, col).getClass();
		}

		// ------------------------------------------
		public boolean isCellEditable(int row, int col) {
			return (col > 1);
		}

		// ------------------------------------------
		public void setValueAt(Object obj, int row, int col) {
			musicData[row][col] = obj;
			fireTableCellUpdated(row, col);

		}

		// ------------------------------------------
		public Object getValueAt(int row, int col) {
			return musicData[row][col];
		}

	}
}
