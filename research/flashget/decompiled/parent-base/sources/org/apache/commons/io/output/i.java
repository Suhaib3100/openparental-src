package org.apache.commons.io.output;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.Charset;

/* compiled from: LockableFileWriter.java */
/* loaded from: classes4.dex */
public class i extends Writer {

    /* renamed from: d, reason: collision with root package name */
    private static final String f85603d = ".lck";

    /* renamed from: b, reason: collision with root package name */
    private final Writer f85604b;

    /* renamed from: c, reason: collision with root package name */
    private final File f85605c;

    public i(String str) throws IOException {
        this(str, false, (String) null);
    }

    private void a() throws IOException {
        synchronized (i.class) {
            try {
                if (!this.f85605c.createNewFile()) {
                    throw new IOException("Can't write file, lock " + this.f85605c.getAbsolutePath() + " exists");
                }
                this.f85605c.deleteOnExit();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private Writer b(File file, Charset charset, boolean z4) throws IOException {
        FileOutputStream fileOutputStream;
        boolean exists = file.exists();
        try {
            fileOutputStream = new FileOutputStream(file.getAbsolutePath(), z4);
            try {
                return new OutputStreamWriter(fileOutputStream, org.apache.commons.io.b.b(charset));
            } catch (IOException e4) {
                e = e4;
                org.apache.commons.io.m.f(null);
                org.apache.commons.io.m.b(fileOutputStream);
                org.apache.commons.io.i.A(this.f85605c);
                if (!exists) {
                    org.apache.commons.io.i.A(file);
                }
                throw e;
            } catch (RuntimeException e5) {
                e = e5;
                org.apache.commons.io.m.f(null);
                org.apache.commons.io.m.b(fileOutputStream);
                org.apache.commons.io.i.A(this.f85605c);
                if (!exists) {
                    org.apache.commons.io.i.A(file);
                }
                throw e;
            }
        } catch (IOException e6) {
            e = e6;
            fileOutputStream = null;
        } catch (RuntimeException e7) {
            e = e7;
            fileOutputStream = null;
        }
    }

    private void c(File file) throws IOException {
        if (!file.exists()) {
            throw new IOException("Could not find lockDir: " + file.getAbsolutePath());
        }
        if (file.canWrite()) {
            return;
        }
        throw new IOException("Could not write to lockDir: " + file.getAbsolutePath());
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            this.f85604b.close();
        } finally {
            this.f85605c.delete();
        }
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() throws IOException {
        this.f85604b.flush();
    }

    @Override // java.io.Writer
    public void write(int i4) throws IOException {
        this.f85604b.write(i4);
    }

    public i(String str, boolean z4) throws IOException {
        this(str, z4, (String) null);
    }

    @Override // java.io.Writer
    public void write(char[] cArr) throws IOException {
        this.f85604b.write(cArr);
    }

    public i(String str, boolean z4, String str2) throws IOException {
        this(new File(str), z4, str2);
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i4, int i5) throws IOException {
        this.f85604b.write(cArr, i4, i5);
    }

    public i(File file) throws IOException {
        this(file, false, (String) null);
    }

    @Override // java.io.Writer
    public void write(String str) throws IOException {
        this.f85604b.write(str);
    }

    public i(File file, boolean z4) throws IOException {
        this(file, z4, (String) null);
    }

    @Override // java.io.Writer
    public void write(String str, int i4, int i5) throws IOException {
        this.f85604b.write(str, i4, i5);
    }

    public i(File file, boolean z4, String str) throws IOException {
        this(file, Charset.defaultCharset(), z4, str);
    }

    public i(File file, Charset charset) throws IOException {
        this(file, charset, false, (String) null);
    }

    public i(File file, String str) throws IOException {
        this(file, str, false, (String) null);
    }

    public i(File file, Charset charset, boolean z4, String str) throws IOException {
        File absoluteFile = file.getAbsoluteFile();
        if (absoluteFile.getParentFile() != null) {
            org.apache.commons.io.i.G(absoluteFile.getParentFile());
        }
        if (!absoluteFile.isDirectory()) {
            File file2 = new File(str == null ? System.getProperty("java.io.tmpdir") : str);
            org.apache.commons.io.i.G(file2);
            c(file2);
            this.f85605c = new File(file2, absoluteFile.getName() + ".lck");
            a();
            this.f85604b = b(absoluteFile, charset, z4);
            return;
        }
        throw new IOException("File specified is a directory");
    }

    public i(File file, String str, boolean z4, String str2) throws IOException {
        this(file, org.apache.commons.io.b.a(str), z4, str2);
    }
}
