package tsc.draft.AWTSwing;


import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class RenderTable extends JxFrame
{
   public RenderTable()
   {
      super("Simple table");
      JPanel jp = new JPanel();
      getContentPane().add(jp);
      JTable table = new JTable(new MusicModel());
      JScrollPane sp = new JScrollPane(table);
      table.setPreferredScrollableViewportSize(new Dimension(250,170));
      table.setDefaultRenderer(String.class, new ourRenderer());
      jp.add(sp);
      
      setSize(300,200);
      setVisible(true);
   }
   static public void main(String argv[])
   {
      new RenderTable();
   }
}


