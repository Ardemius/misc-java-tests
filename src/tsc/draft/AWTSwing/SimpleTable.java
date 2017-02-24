package tsc.draft.AWTSwing;

import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class SimpleTable extends JxFrame
{
   public SimpleTable()
   {
      super("Simple table");
      JPanel jp = new JPanel();
      getContentPane().add(jp);
            Object[] [] musicData = {
         {"Tschaikovsky", "1812 Overture", new Boolean(true)},
         {"Stravinsky", "Le Sacre", new Boolean(true)},
         {"Lennon","Eleanor Rigby", new Boolean(false)},
         {"Wagner", "Gotterdammerung", new Boolean(true)}
      };
      String[] columnNames = {"Composer", "Title", "Orchestral"};
      JTable table = new JTable(musicData, columnNames);
      JScrollPane sp = new JScrollPane(table);
      table.setPreferredScrollableViewportSize(new Dimension(250,170));
      jp.add(sp);
      
      setSize(300,200);
      setVisible(true);
   }
   static public void main(String argv[])
   {
      new SimpleTable();
   }
}
