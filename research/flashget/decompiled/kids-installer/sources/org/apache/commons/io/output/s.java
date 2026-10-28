package org.apache.commons.io.output;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.io.input.x;

/* compiled from: XmlStreamWriter.java */
/* loaded from: classes5.dex */
public class s extends Writer {

    /* renamed from: t, reason: collision with root package name */
    private static final int f32108t = 4096;

    /* renamed from: u, reason: collision with root package name */
    static final Pattern f32109u = x.E;

    /* renamed from: o, reason: collision with root package name */
    private final OutputStream f32110o;

    /* renamed from: p, reason: collision with root package name */
    private final String f32111p;

    /* renamed from: q, reason: collision with root package name */
    private StringWriter f32112q;

    /* renamed from: r, reason: collision with root package name */
    private Writer f32113r;

    /* renamed from: s, reason: collision with root package name */
    private String f32114s;

    public s(OutputStream outputStream) {
        this(outputStream, (String) null);
    }

    private void a(char[] cArr, int i5, int i6) throws IOException {
        StringBuffer buffer = this.f32112q.getBuffer();
        int length = buffer.length() + i6 > 4096 ? 4096 - buffer.length() : i6;
        this.f32112q.write(cArr, i5, length);
        if (buffer.length() >= 5) {
            if (buffer.substring(0, 5).equals("<?xml")) {
                int indexOf = buffer.indexOf("?>");
                if (indexOf > 0) {
                    Matcher matcher = f32109u.matcher(buffer.substring(0, indexOf));
                    if (matcher.find()) {
                        String upperCase = matcher.group(1).toUpperCase();
                        this.f32114s = upperCase;
                        this.f32114s = upperCase.substring(1, upperCase.length() - 1);
                    } else {
                        this.f32114s = this.f32111p;
                    }
                } else if (buffer.length() >= 4096) {
                    this.f32114s = this.f32111p;
                }
            } else {
                this.f32114s = this.f32111p;
            }
            if (this.f32114s != null) {
                this.f32112q = null;
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(this.f32110o, this.f32114s);
                this.f32113r = outputStreamWriter;
                outputStreamWriter.write(buffer.toString());
                if (i6 > length) {
                    this.f32113r.write(cArr, i5 + length, i6 - length);
                }
            }
        }
    }

    public String b() {
        return this.f32111p;
    }

    public String c() {
        return this.f32114s;
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f32113r == null) {
            this.f32114s = this.f32111p;
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(this.f32110o, this.f32114s);
            this.f32113r = outputStreamWriter;
            outputStreamWriter.write(this.f32112q.toString());
        }
        this.f32113r.close();
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() throws IOException {
        Writer writer = this.f32113r;
        if (writer != null) {
            writer.flush();
        }
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i5, int i6) throws IOException {
        if (this.f32112q != null) {
            a(cArr, i5, i6);
        } else {
            this.f32113r.write(cArr, i5, i6);
        }
    }

    public s(OutputStream outputStream, String str) {
        this.f32112q = new StringWriter(4096);
        this.f32110o = outputStream;
        this.f32111p = str == null ? "UTF-8" : str;
    }

    public s(File file) throws FileNotFoundException {
        this(file, (String) null);
    }

    public s(File file, String str) throws FileNotFoundException {
        this(new FileOutputStream(file), str);
    }
}
