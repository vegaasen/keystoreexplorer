/*
 * CertificateFileFilter.java
 *
 * Created on 15. M�rz 2007, 06:25
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package org.jcoderz.keytoolz.keystoreexplorer;

import java.io.File;

/**
 * @author cloroff
 */
public class CsrFileFilter
    extends StrictCsrFileFilter
{
  /**
   * @see java.io.FileFilter#accept(java.io.File)
   */
  public boolean accept(File file)
  {
    boolean result = false;
    if (file.isDirectory())
    {
      result = true;
    }
    else
    {
      result = super.accept(file);
    }
    return result;
  }

}
