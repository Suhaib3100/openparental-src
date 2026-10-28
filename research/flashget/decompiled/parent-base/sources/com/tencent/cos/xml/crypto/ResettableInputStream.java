package com.tencent.cos.xml.crypto;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* loaded from: classes6.dex */
public class ResettableInputStream extends ReleasableInputStream {
    private final File file;
    private FileChannel fileChannel;
    private FileInputStream fis;
    private long markPos;

    public ResettableInputStream(File file) throws IOException {
        this(new FileInputStream(file), file);
    }

    public static ResettableInputStream newResettableInputStream(File file) {
        return newResettableInputStream(file, (String) null);
    }

    @Override // com.tencent.cos.xml.crypto.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public int available() throws IOException {
        abortIfNeeded();
        return this.fis.available();
    }

    public File getFile() {
        return this.file;
    }

    @Override // com.tencent.cos.xml.crypto.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public void mark(int i4) {
        abortIfNeeded();
        try {
            this.markPos = this.fileChannel.position();
        } catch (IOException unused) {
            throw new RuntimeException(ProtectedSandApp.s("㘰\u0001"));
        }
    }

    @Override // com.tencent.cos.xml.crypto.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // com.tencent.cos.xml.crypto.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        abortIfNeeded();
        return this.fis.read();
    }

    @Override // com.tencent.cos.xml.crypto.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public void reset() throws IOException {
        abortIfNeeded();
        this.fileChannel.position(this.markPos);
    }

    @Override // com.tencent.cos.xml.crypto.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public long skip(long j4) throws IOException {
        abortIfNeeded();
        return this.fis.skip(j4);
    }

    public ResettableInputStream(String str) throws IOException {
        this(new FileInputStream(str));
    }

    public static ResettableInputStream newResettableInputStream(File file, String str) {
        try {
            return new ResettableInputStream(file);
        } catch (IOException e4) {
            throw new RuntimeException(e4);
        }
    }

    public ResettableInputStream(FileInputStream fileInputStream) throws IOException {
        this(fileInputStream, null);
    }

    @Override // com.tencent.cos.xml.crypto.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i4, int i5) throws IOException {
        abortIfNeeded();
        return this.fis.read(bArr, i4, i5);
    }

    private ResettableInputStream(FileInputStream fileInputStream, File file) throws IOException {
        super(fileInputStream);
        this.file = file;
        this.fis = fileInputStream;
        FileChannel channel = fileInputStream.getChannel();
        this.fileChannel = channel;
        this.markPos = channel.position();
    }

    public static ResettableInputStream newResettableInputStream(FileInputStream fileInputStream) {
        return newResettableInputStream(fileInputStream, (String) null);
    }

    public static ResettableInputStream newResettableInputStream(FileInputStream fileInputStream, String str) {
        try {
            return new ResettableInputStream(fileInputStream);
        } catch (IOException unused) {
            throw new RuntimeException(str);
        }
    }
}
