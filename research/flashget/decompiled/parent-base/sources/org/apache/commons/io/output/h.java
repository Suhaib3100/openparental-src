package org.apache.commons.io.output;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;

/* compiled from: FileWriterWithEncoding.java */
/* loaded from: classes4.dex */
public class h extends Writer {

    /* renamed from: b, reason: collision with root package name */
    private final Writer f85602b;

    public h(String str, String str2) throws IOException {
        this(new File(str), str2, false);
    }

    private static Writer a(File file, Object obj, boolean z4) throws IOException {
        FileOutputStream fileOutputStream;
        if (file == null) {
            throw new NullPointerException("File is missing");
        }
        if (obj == null) {
            throw new NullPointerException("Encoding is missing");
        }
        boolean exists = file.exists();
        try {
            fileOutputStream = new FileOutputStream(file, z4);
        } catch (IOException e4) {
            e = e4;
            fileOutputStream = null;
        } catch (RuntimeException e5) {
            e = e5;
            fileOutputStream = null;
        }
        try {
            return obj instanceof Charset ? new OutputStreamWriter(fileOutputStream, (Charset) obj) : obj instanceof CharsetEncoder ? new OutputStreamWriter(fileOutputStream, (CharsetEncoder) obj) : new OutputStreamWriter(fileOutputStream, (String) obj);
        } catch (IOException e6) {
            e = e6;
            org.apache.commons.io.m.f(null);
            org.apache.commons.io.m.b(fileOutputStream);
            if (!exists) {
                org.apache.commons.io.i.A(file);
            }
            throw e;
        } catch (RuntimeException e7) {
            e = e7;
            org.apache.commons.io.m.f(null);
            org.apache.commons.io.m.b(fileOutputStream);
            if (!exists) {
                org.apache.commons.io.i.A(file);
            }
            throw e;
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f85602b.close();
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() throws IOException {
        this.f85602b.flush();
    }

    @Override // java.io.Writer
    public void write(int i4) throws IOException {
        this.f85602b.write(i4);
    }

    public h(String str, String str2, boolean z4) throws IOException {
        this(new File(str), str2, z4);
    }

    @Override // java.io.Writer
    public void write(char[] cArr) throws IOException {
        this.f85602b.write(cArr);
    }

    public h(String str, Charset charset) throws IOException {
        this(new File(str), charset, false);
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i4, int i5) throws IOException {
        this.f85602b.write(cArr, i4, i5);
    }

    public h(String str, Charset charset, boolean z4) throws IOException {
        this(new File(str), charset, z4);
    }

    @Override // java.io.Writer
    public void write(String str) throws IOException {
        this.f85602b.write(str);
    }

    public h(String str, CharsetEncoder charsetEncoder) throws IOException {
        this(new File(str), charsetEncoder, false);
    }

    @Override // java.io.Writer
    public void write(String str, int i4, int i5) throws IOException {
        this.f85602b.write(str, i4, i5);
    }

    public h(String str, CharsetEncoder charsetEncoder, boolean z4) throws IOException {
        this(new File(str), charsetEncoder, z4);
    }

    public h(File file, String str) throws IOException {
        this(file, str, false);
    }

    public h(File file, String str, boolean z4) throws IOException {
        this.f85602b = a(file, str, z4);
    }

    public h(File file, Charset charset) throws IOException {
        this(file, charset, false);
    }

    public h(File file, Charset charset, boolean z4) throws IOException {
        this.f85602b = a(file, charset, z4);
    }

    public h(File file, CharsetEncoder charsetEncoder) throws IOException {
        this(file, charsetEncoder, false);
    }

    public h(File file, CharsetEncoder charsetEncoder, boolean z4) throws IOException {
        this.f85602b = a(file, charsetEncoder, z4);
    }
}
