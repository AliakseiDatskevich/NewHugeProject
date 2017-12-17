import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @version 1.33 2007-06-12
 * @author Cay Horstmann
 */
public class MyFrame
{
   public static void main(String[] args)
   {
      EventQueue.invokeLater(new Runnable()
         {
            public void run()
            {

               ComboBoxFrame frame = new ComboBoxFrame();
               frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
               frame.setVisible(true);
            }
         });
   }
}

/**
 * Ramka z przyk�adow� etykiet� tekstow� i list� rozwijan� umo�liwiaj�c� wyb�r kroju czcionki.
 */
class ComboBoxFrame extends JFrame
{
   public ComboBoxFrame()
   {
      setTitle("ComboBoxTest");
      setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);

      // Dodanie tekstu etykiety.

      label = new JLabel("Ko� i ��w grali w ko�ci z pi�kn� �m� u �r�d�a.");
      label.setFont(new Font("Serif", Font.PLAIN, DEFAULT_SIZE));
      add(label, BorderLayout.CENTER);

      // Tworzenie listy rozwijanej i dodawanie nazw czcionek.

      faceCombo = new JComboBox();
      faceCombo.setEditable(true);
      faceCombo.addItem(1);
      faceCombo.addItem(2);
      faceCombo.addItem(3);
      faceCombo.addItem(4);
      faceCombo.addItem(5);
      faceCombo.addItem(6);
      faceCombo.addItem(7);
      faceCombo.addItem(8);
      faceCombo.addItem(9);
      faceCombo.addItem(10);
      
      
      faceCombo2 = new JComboBox();
      faceCombo2.setEditable(true);
      faceCombo2.addItem(1);
      faceCombo2.addItem(2);
      faceCombo2.addItem(3);
      faceCombo2.addItem(4);
      faceCombo2.addItem(5);
      faceCombo2.addItem(6);
      faceCombo2.addItem(7);
      faceCombo2.addItem(8);
      faceCombo2.addItem(9);
      faceCombo2.addItem(10);

      // S�uchacz listy rozwijanej zmienia kr�j pisma etykiety na czcionk� wybran� przez u�ytkownika.

      faceCombo.addActionListener(new ActionListener()
         {
            public void actionPerformed(ActionEvent event)
            {
               label.setFont(new Font((String) faceCombo.getSelectedItem(), Font.PLAIN,
                     DEFAULT_SIZE));
            }
         });
      faceCombo2.addActionListener(new ActionListener()
      {
         public void actionPerformed(ActionEvent event)
         {
            label.setFont(new Font((String) faceCombo2.getSelectedItem(), Font.PLAIN,
                  DEFAULT_SIZE));
         }
      });

      // Dodanie listy rozwijanej do panelu znajduj�cego si� przy po�udniowej kraw�dzi ramki.

      JPanel comboPanel = new JPanel();
      comboPanel.add(faceCombo);
      add(comboPanel, BorderLayout.WEST);
      
      JPanel comboPanel2 = new JPanel();
      comboPanel.add(faceCombo2);
      add(comboPanel2, BorderLayout.CENTER);
   }

   public static final int DEFAULT_WIDTH = 500;
   public static final int DEFAULT_HEIGHT = 400;

   private JComboBox faceCombo, faceCombo2 ;
   private JLabel label;
   private static final int DEFAULT_SIZE = 12;
}