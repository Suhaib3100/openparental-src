package org.eclipse.paho.client.mqttv3.persist;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Vector;
import org.eclipse.paho.client.mqttv3.MqttClientPersistence;
import org.eclipse.paho.client.mqttv3.MqttPersistable;
import org.eclipse.paho.client.mqttv3.MqttPersistenceException;
import org.eclipse.paho.client.mqttv3.internal.FileLock;
import org.eclipse.paho.client.mqttv3.internal.MqttPersistentData;

/* loaded from: classes5.dex */
public class MqttDefaultFilePersistence implements MqttClientPersistence {
    private static FilenameFilter FILENAME_FILTER;
    private File clientDir;
    private File dataDir;
    private FileLock fileLock;
    private static final String MESSAGE_FILE_EXTENSION = ".msg";
    private static final String MESSAGE_BACKUP_FILE_EXTENSION = ".bup";
    private static final String LOCK_FILENAME = ".lck";

    public MqttDefaultFilePersistence() {
        this(System.getProperty("user.dir"));
    }

    private void checkIsOpen() throws MqttPersistenceException {
        if (this.clientDir == null) {
            throw new MqttPersistenceException();
        }
    }

    private static FilenameFilter getFilenameFilter() {
        if (FILENAME_FILTER == null) {
            FILENAME_FILTER = new PersistanceFileNameFilter(".msg");
        }
        return FILENAME_FILTER;
    }

    private File[] getFiles() throws MqttPersistenceException {
        checkIsOpen();
        File[] listFiles = this.clientDir.listFiles(getFilenameFilter());
        if (listFiles != null) {
            return listFiles;
        }
        throw new MqttPersistenceException();
    }

    private boolean isSafeChar(char c5) {
        return Character.isJavaIdentifierPart(c5) || c5 == '-';
    }

    private void restoreBackups(File file) throws MqttPersistenceException {
        File[] listFiles = file.listFiles(new PersistanceFileFilter(".bup"));
        if (listFiles == null) {
            throw new MqttPersistenceException();
        }
        for (int i4 = 0; i4 < listFiles.length; i4++) {
            File file2 = new File(file, listFiles[i4].getName().substring(0, listFiles[i4].getName().length() - 4));
            if (!listFiles[i4].renameTo(file2)) {
                file2.delete();
                listFiles[i4].renameTo(file2);
            }
        }
    }

    @Override // org.eclipse.paho.client.mqttv3.MqttClientPersistence
    public void clear() throws MqttPersistenceException {
        checkIsOpen();
        for (File file : getFiles()) {
            file.delete();
        }
        this.clientDir.delete();
    }

    @Override // org.eclipse.paho.client.mqttv3.MqttClientPersistence
    public void close() throws MqttPersistenceException {
        synchronized (this) {
            try {
                FileLock fileLock = this.fileLock;
                if (fileLock != null) {
                    fileLock.release();
                }
                if (getFiles().length == 0) {
                    this.clientDir.delete();
                }
                this.clientDir = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // org.eclipse.paho.client.mqttv3.MqttClientPersistence
    public boolean containsKey(String str) throws MqttPersistenceException {
        checkIsOpen();
        return new File(this.clientDir, String.valueOf(str).concat(".msg")).exists();
    }

    @Override // org.eclipse.paho.client.mqttv3.MqttClientPersistence
    public MqttPersistable get(String str) throws MqttPersistenceException {
        checkIsOpen();
        try {
            FileInputStream fileInputStream = new FileInputStream(new File(this.clientDir, String.valueOf(str).concat(".msg")));
            int available = fileInputStream.available();
            byte[] bArr = new byte[available];
            for (int i4 = 0; i4 < available; i4 += fileInputStream.read(bArr, i4, available - i4)) {
            }
            fileInputStream.close();
            return new MqttPersistentData(str, bArr, 0, available, null, 0, 0);
        } catch (IOException e4) {
            throw new MqttPersistenceException(e4);
        }
    }

    @Override // org.eclipse.paho.client.mqttv3.MqttClientPersistence
    public Enumeration keys() throws MqttPersistenceException {
        checkIsOpen();
        File[] files = getFiles();
        Vector vector = new Vector(files.length);
        for (File file : files) {
            vector.addElement(file.getName().substring(0, r4.length() - 4));
        }
        return vector.elements();
    }

    @Override // org.eclipse.paho.client.mqttv3.MqttClientPersistence
    public void open(String str, String str2) throws MqttPersistenceException {
        if (this.dataDir.exists() && !this.dataDir.isDirectory()) {
            throw new MqttPersistenceException();
        }
        if (!this.dataDir.exists() && !this.dataDir.mkdirs()) {
            throw new MqttPersistenceException();
        }
        if (!this.dataDir.canWrite()) {
            throw new MqttPersistenceException();
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (int i4 = 0; i4 < str.length(); i4++) {
            char charAt = str.charAt(i4);
            if (isSafeChar(charAt)) {
                stringBuffer.append(charAt);
            }
        }
        stringBuffer.append("-");
        for (int i5 = 0; i5 < str2.length(); i5++) {
            char charAt2 = str2.charAt(i5);
            if (isSafeChar(charAt2)) {
                stringBuffer.append(charAt2);
            }
        }
        synchronized (this) {
            if (this.clientDir == null) {
                File file = new File(this.dataDir, stringBuffer.toString());
                this.clientDir = file;
                if (!file.exists()) {
                    this.clientDir.mkdir();
                }
            }
            try {
                this.fileLock = new FileLock(this.clientDir, ".lck");
            } catch (Exception unused) {
            }
            restoreBackups(this.clientDir);
        }
    }

    @Override // org.eclipse.paho.client.mqttv3.MqttClientPersistence
    public void put(String str, MqttPersistable mqttPersistable) throws MqttPersistenceException {
        checkIsOpen();
        File file = new File(this.clientDir, String.valueOf(str).concat(".msg"));
        File file2 = new File(this.clientDir, String.valueOf(str).concat(".msg.bup"));
        if (file.exists() && !file.renameTo(file2)) {
            file2.delete();
            file.renameTo(file2);
        }
        try {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                fileOutputStream.write(mqttPersistable.getHeaderBytes(), mqttPersistable.getHeaderOffset(), mqttPersistable.getHeaderLength());
                if (mqttPersistable.getPayloadBytes() != null) {
                    fileOutputStream.write(mqttPersistable.getPayloadBytes(), mqttPersistable.getPayloadOffset(), mqttPersistable.getPayloadLength());
                }
                fileOutputStream.getFD().sync();
                fileOutputStream.close();
                if (file2.exists()) {
                    file2.delete();
                }
                if (!file2.exists() || file2.renameTo(file)) {
                    return;
                }
                file.delete();
                file2.renameTo(file);
            } catch (IOException e4) {
                throw new MqttPersistenceException(e4);
            }
        } catch (Throwable th) {
            if (file2.exists() && !file2.renameTo(file)) {
                file.delete();
                file2.renameTo(file);
            }
            throw th;
        }
    }

    @Override // org.eclipse.paho.client.mqttv3.MqttClientPersistence
    public void remove(String str) throws MqttPersistenceException {
        checkIsOpen();
        File file = new File(this.clientDir, String.valueOf(str).concat(".msg"));
        if (file.exists()) {
            file.delete();
        }
    }

    public MqttDefaultFilePersistence(String str) {
        this.clientDir = null;
        this.fileLock = null;
        this.dataDir = new File(str);
    }
}
