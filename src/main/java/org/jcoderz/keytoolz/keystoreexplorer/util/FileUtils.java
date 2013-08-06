package org.jcoderz.keytoolz.keystoreexplorer.util;

import java.net.URL;

/**
 * Simple fileutils used to find stuff etc..
 *
 * @author <a href="vegard.aasen@gmail.com">vegardaasen</a>
 */
public final class FileUtils {

    private FileUtils() {
    }

    public static URL getResourceByClassPath(String filename) {
        return FileUtils.class.getResource(filename);
    }

    public static URL getResourceByFileName() {
        return null;
    }

}
