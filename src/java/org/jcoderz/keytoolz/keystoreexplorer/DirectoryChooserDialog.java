/*
 * DirectoryChooserDialog.java
 *
 * Created on __DATE__, __TIME__
 */

package org.jcoderz.keytoolz.keystoreexplorer;

import java.io.File;

import org.jcoderz.keytoolz.keystoreexplorer.util.PropertiesUtil;


/**
 * @author __USER__
 */
public class DirectoryChooserDialog
    extends javax.swing.JDialog
{

  private static final long serialVersionUID = 1L;


  /** Creates new form DirectoryChooserDialog */
  public DirectoryChooserDialog(java.awt.Frame parent, boolean modal)
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
    setTitle("Choose Directory");
    setLocationByPlatform(true);

    jFileChooser1.setCurrentDirectory(new File(PropertiesUtil.PROGRAM_SETTINGS.getProperty(
        "start.dir", System.getProperty("user.dir"))));
    jFileChooser1.setDialogTitle("KeyStore Directory");
    jFileChooser1.setFileFilter(new KeyStoreFileFilter());
    jFileChooser1.setFileSelectionMode(javax.swing.JFileChooser.FILES_AND_DIRECTORIES);
    jFileChooser1.addActionListener(new java.awt.event.ActionListener()
    {
      public void actionPerformed(java.awt.event.ActionEvent evt)
      {
        DirectoryChooserDialog.this.actionPerformed(evt);
      }
    });

    org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
        .add(jFileChooser1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 606, Short.MAX_VALUE));
    layout.setVerticalGroup(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
        .add(jFileChooser1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE));

    pack();
  }// </editor-fold>


  // GEN-END:initComponents

  // GEN-FIRST:event_actionPerformed
  private void actionPerformed(java.awt.event.ActionEvent evt)
  {
    if (jFileChooser1.getSelectedFile() != null && jFileChooser1.getSelectedFile().isDirectory())
    {
      this.setVisible(false);
    }
  }// GEN-LAST:event_actionPerformed


  /**
   * @param args the command line arguments
   */
  public static void main(String args[])
  {
    java.awt.EventQueue.invokeLater(new Runnable()
    {
      public void run()
      {
        new DirectoryChooserDialog(new javax.swing.JFrame(), true).setVisible(true);
      }
    });
  }


  public File getSelectedDir()
  {
    return jFileChooser1.getSelectedFile();
  }

  // GEN-BEGIN:variables
  // Variables declaration - do not modify
  private javax.swing.JFileChooser jFileChooser1;
  // End of variables declaration//GEN-END:variables

}