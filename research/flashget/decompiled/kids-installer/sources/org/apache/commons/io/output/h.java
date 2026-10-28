package org.apache.commons.io.output;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;

/* compiled from: FileWriterWithEncoding.java */
/* loaded from: classes5.dex */
public class h extends Writer {

    /* renamed from: o, reason: collision with root package name */
    private final Writer f32090o;

    public h(String str, String str2) throws IOException {
        this(new File(str), str2, false);
    }

    private static Writer a(File file, Object obj, boolean z5) throws IOException {
        FileOutputStream fileOutputStream;
        if (file == null) {
            throw new NullPointerException("File is missing");
        }
        if (obj == null) {
            throw new NullPointerException("Encoding is missing");
        }
        boolean exists = file.exists();
        try {
            fileOutputStream = new FileOutputStream(file, z5);
        } catch (IOException e6) {
            e = e6;
            fileOutputStream = null;
        } catch (RuntimeException e7) {
            e = e7;
            fileOutputStream = null;
        }
        try {
            return obj instanceof Charset ? new OutputStreamWriter(fileOutputStream, (Charset) obj) : obj instanceof CharsetEncoder ? new OutputStreamWriter(fileOutputStream, (CharsetEncoder) obj) : new OutputStreamWriter(fileOutputStream, (String) obj);
        } catch (IOException e8) {
            e = e8;
            org.apache.commons.io.n.f(null);
            org.apache.commons.io.n.b(fileOutputStream);
            if (!exists) {
                org.apache.commons.io.j.A(file);
            }
            throw e;
        } catch (RuntimeException e9) {
            e = e9;
            org.apache.commons.io.n.f(null);
            org.apache.commons.io.n.b(fileOutputStream);
            if (!exists) {
                org.apache.commons.io.j.A(file);
            }
            throw e;
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f32090o.close();
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() throws IOException {
        this.f32090o.flush();
    }

    @Override // java.io.Writer
    public void write(int i5) throws IOException {
        this.f32090o.write(i5);
    }

    public h(String str, String str2, boolean z5) throws IOException {
        this(new File(str), str2, z5);
    }

    @Override // java.io.Writer
    public void write(char[] cArr) throws IOException {
        this.f32090o.write(cArr);
    }

    public h(String str, Charset charset) throws IOException {
        this(new File(str), charset, false);
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i5, int i6) throws IOException {
        this.f32090o.write(cArr, i5, i6);
    }

    public h(String str, Charset charset, boolean z5) throws IOException {
        this(new File(str), charset, z5);
    }

    @Override // java.io.Writer
    public void write(String str) throws IOException {
        this.f32090o.write(str);
    }

    public h(String str, CharsetEncoder charsetEncoder) throws IOException {
        this(new File(str), charsetEncoder, false);
    }

    @Override // java.io.Writer
    public void write(String str, int i5, int i6) throws IOException {
        this.f32090o.write(str, i5, i6);
    }

    public h(String str, CharsetEncoder charsetEncoder, boolean z5) throws IOException {
        this(new File(str), charsetEncoder, z5);
    }

    public h(File file, String str) throws IOException {
        this(file, str, false);
    }

    public h(File file, String str, boolean z5) throws IOException {
        this.f32090o = a(file, str, z5);
    }

    public h(File file, Charset charset) throws IOException {
        this(file, charset, false);
    }

    public h(File file, Charset charset, boolean z5) throws IOException {
        this.f32090o = a(file, charset, z5);
    }

    public h(File file, CharsetEncoder charsetEncoder) throws IOException {
        this(file, charsetEncoder, false);
    }

    public h(File file, CharsetEncoder charsetEncoder, boolean z5) throws IOException {
        this.f32090o = a(file, charsetEncoder, z5);
    }
}
