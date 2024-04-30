/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vn.smartclinic.common;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 *
 * @author tuanpla
 */
public abstract class DFSUtils {

    private DFSUtils() {
        throw new IllegalStateException("Utility class");
    }

    public static boolean isFilelocked(File file) {
        try {
            try (FileInputStream in = new FileInputStream(file)) {
                in.read();
                return false;
            }
        } catch (FileNotFoundException e) {
            return file.exists();
        } catch (IOException ioe) {
            return true;
        }
    }

    public static boolean lockFile(File file) throws Exception {
        if (isFilelocked(file)) {
            return false;
        }
        if (!file.exists()) {
            file.getParentFile().mkdirs();
        }
        rndAccessFile(file).getChannel().lock();
        return true;
    }

    private static RandomAccessFile rndAccessFile(File file) throws FileNotFoundException {
        return new RandomAccessFile(file, "rw");
    }
}
