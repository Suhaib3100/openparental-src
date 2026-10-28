package org.apache.commons.io.output;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.Charset;

/* compiled from: LockableFileWriter.java */
/* loaded from: classes5.dex */
public class i extends Writer {

    /* renamed from: q, reason: collision with root package name */
    private static final String f32091q = ".lck";

    /* renamed from: o, reason: collision with root package name */
    private final Writer f32092o;

    /* renamed from: p, reason: collision with root package name */
    private final File f32093p;

    public i(String str) throws IOException {
        this(str, false, (String) null);
    }

    private void a() throws IOException {
        synchronized (i.class) {
            if (!this.f32093p.createNewFile()) {
                throw new IOException("Can't write file, lock " + this.f32093p.getAbsolutePath() + " exists");
            }
            this.f32093p.deleteOnExit();
        }
    }

    private Writer b(File file, Charset charset, boolean z5) throws IOException {
        FileOutputStream fileOutputStream;
        boolean exists = file.exists();
        try {
            fileOutputStream = new FileOutputStream(file.getAbsolutePath(), z5);
            try {
                return new OutputStreamWriter(fileOutputStream, org.apache.commons.io.b.b(charset));
            } catch (IOException e6) {
                e = e6;
                org.apache.commons.io.n.f(null);
                org.apache.commons.io.n.b(fileOutputStream);
                org.apache.commons.io.j.A(this.f32093p);
                if (!exists) {
                    org.apache.commons.io.j.A(file);
                }
                throw e;
            } catch (RuntimeException e7) {
                e = e7;
                org.apache.commons.io.n.f(null);
                org.apache.commons.io.n.b(fileOutputStream);
                org.apache.commons.io.j.A(this.f32093p);
                if (!exists) {
                    org.apache.commons.io.j.A(file);
                }
                throw e;
            }
        } catch (IOException e8) {
            e = e8;
            fileOutputStream = null;
        } catch (RuntimeException e9) {
            e = e9;
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
            this.f32092o.close();
        } finally {
            this.f32093p.delete();
        }
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() throws IOException {
        this.f32092o.flush();
    }

    @Override // java.io.Writer
    public void write(int i5) throws IOException {
        this.f32092o.write(i5);
    }

    public i(String str, boolean z5) throws IOException {
        this(str, z5, (String) null);
    }

    @Override // java.io.Writer
    public void write(char[] cArr) throws IOException {
        this.f32092o.write(cArr);
    }

    public i(String str, boolean z5, String str2) throws IOException {
        this(new File(str), z5, str2);
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i5, int i6) throws IOException {
        this.f32092o.write(cArr, i5, i6);
    }

    public i(File file) throws IOException {
        this(file, false, (String) null);
    }

    @Override // java.io.Writer
    public void write(String str) throws IOException {
        this.f32092o.write(str);
    }

    public i(File file, boolean z5) throws IOException {
        this(file, z5, (String) null);
    }

    @Override // java.io.Writer
    public void write(String str, int i5, int i6) throws IOException {
        this.f32092o.write(str, i5, i6);
    }

    public i(File file, boolean z5, String str) throws IOException {
        this(file, Charset.defaultCharset(), z5, str);
    }

    public i(File file, Charset charset) throws IOException {
        this(file, charset, false, (String) null);
    }

    public i(File file, String str) throws IOException {
        this(file, str, false, (String) null);
    }

    public i(File file, Charset charset, boolean z5, String str) throws IOException {
        File absoluteFile = file.getAbsoluteFile();
        if (absoluteFile.getParentFile() != null) {
            org.apache.commons.io.j.G(absoluteFile.getParentFile());
        }
        if (!absoluteFile.isDirectory()) {
            File file2 = new File(str == null ? System.getProperty("java.io.tmpdir") : str);
            org.apache.commons.io.j.G(file2);
            c(file2);
            this.f32093p = new File(file2, absoluteFile.getName() + ".lck");
            a();
            this.f32092o = b(absoluteFile, charset, z5);
            return;
        }
        throw new IOException("File specified is a directory");
    }

    public i(File file, String str, boolean z5, String str2) throws IOException {
        this(file, org.apache.commons.io.b.a(str), z5, str2);
    }
}
