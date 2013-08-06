package org.jcoderz.keytoolz.keystoreexplorer;

import org.jcoderz.keytoolz.keystoreexplorer.util.FileUtils;
import org.junit.Test;

import java.net.URL;

import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.assertTrue;

/**
 * @author <a href="vegard.aasen@gmail.com">vegardaasen</a>
 */
public final class CertificateExplorerTest {

    @Test
    public void testFindImageResource() {
        URL url = FileUtils.getResourceByClassPath("/images/information.gif");
        assertNotNull(url);
        assertTrue(url.getPath().contains("information.gif"));
    }

}
