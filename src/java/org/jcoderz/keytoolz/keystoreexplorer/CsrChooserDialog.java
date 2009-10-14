/*
 * CsrChooserDialog.java
 *
 * Created on __DATE__, __TIME__
 */

package org.jcoderz.keytoolz.keystoreexplorer;

import java.io.File;

import org.jcoderz.keytoolz.keystoreexplorer.util.PropertiesUtil;


/**
 * @author __USER__
 */
public class CsrChooserDialog
    extends javax.swing.JDialog
{

  private static final long serialVersionUID = 1L;


  /** Creates new form CsrChooserDialog */
  public CsrChooserDialog(java.awt.Frame parent, boolean modal)
  {
    super(parent, modal);
    initComponents();
  }


  /**
   * This method is called from within the constructor to initialize the
   * form. WARNING: Do NOT modify this code. The content of this method
   * is always regenerated by the Form Editor.
   */
  // GEN-BEGIN:initComponents
  // <editor-fold defaultstate="collapsed" desc="Generated Code">
  private void initComponents()
  {

    jFileChooser1 = new javax.swing.JFileChooser();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

    jFileChooser1.setCurrentDirectory(new File(PropertiesUtil.PROGRAM_SETTINGS.getProperty(
        "start.dir", System.getProperty("user.dir"))));
    jFileChooser1.setDialogTitle("Save CSR");
    jFileChooser1.setDialogType(javax.swing.JFileChooser.SAVE_DIALOG);
    jFileChooser1.setFileFilter(new CsrFileFilter());

    org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
        .add(jFileChooser1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 596, Short.MAX_VALUE));
    layout.setVerticalGroup(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
        .add(jFileChooser1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE));

    pack();
  }// </editor-fold>


  // GEN-END:initComponents

  public File getSelectedFile()
  {
    return jFileChooser1.getSelectedFile();
  }


  public int showOpenDialog()
  {
    return jFileChooser1.showOpenDialog(getParent());
  }


  public int showSaveDialog()
  {
    return jFileChooser1.showSaveDialog(getParent());
  }


  /**
   * @param args the command line arguments
   */
  public static void main(String args[])
  {
    java.awt.EventQueue.invokeLater(new Runnable()
    {
      public void run()
      {
        CsrChooserDialog dialog = new CsrChooserDialog(new javax.swing.JFrame(), true);
        dialog.addWindowListener(new java.awt.event.WindowAdapter()
        {
          public void windowClosing(java.awt.event.WindowEvent e)
          {
            System.exit(0);
          }
        });
        dialog.setVisible(true);
      }
    });
  }

  // GEN-BEGIN:variables
  // Variables declaration - do not modify
  private javax.swing.JFileChooser jFileChooser1;
  // End of variables declaration//GEN-END:variables

}