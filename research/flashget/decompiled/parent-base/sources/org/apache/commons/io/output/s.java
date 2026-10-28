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
/* loaded from: classes4.dex */
public class s extends Writer {

    /* renamed from: g, reason: collision with root package name */
    private static final int f85620g = 4096;

    /* renamed from: h, reason: collision with root package name */
    static final Pattern f85621h = x.f85527r;

    /* renamed from: b, reason: collision with root package name */
    private final OutputStream f85622b;

    /* renamed from: c, reason: collision with root package name */
    private final String f85623c;

    /* renamed from: d, reason: collision with root package name */
    private StringWriter f85624d;

    /* renamed from: e, reason: collision with root package name */
    private Writer f85625e;

    /* renamed from: f, reason: collision with root package name */
    private String f85626f;

    public s(OutputStream outputStream) {
        this(outputStream, (String) null);
    }

    private void a(char[] cArr, int i4, int i5) throws IOException {
        StringBuffer buffer = this.f85624d.getBuffer();
        int length = buffer.length() + i5 > 4096 ? 4096 - buffer.length() : i5;
        this.f85624d.write(cArr, i4, length);
        if (buffer.length() >= 5) {
            if (buffer.substring(0, 5).equals("<?xml")) {
                int indexOf = buffer.indexOf("?>");
                if (indexOf > 0) {
                    Matcher matcher = f85621h.matcher(buffer.substring(0, indexOf));
                    if (matcher.find()) {
                        String upperCase = matcher.group(1).toUpperCase();
                        this.f85626f = upperCase;
                        this.f85626f = androidx.core.content.f.a(upperCase, 1, 1);
                    } else {
                        this.f85626f = this.f85623c;
                    }
                } else if (buffer.length() >= 4096) {
                    this.f85626f = this.f85623c;
                }
            } else {
                this.f85626f = this.f85623c;
            }
            if (this.f85626f != null) {
                this.f85624d = null;
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(this.f85622b, this.f85626f);
                this.f85625e = outputStreamWriter;
                outputStreamWriter.write(buffer.toString());
                if (i5 > length) {
                    this.f85625e.write(cArr, i4 + length, i5 - length);
                }
            }
        }
    }

    public String b() {
        return this.f85623c;
    }

    public String c() {
        return this.f85626f;
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f85625e == null) {
            this.f85626f = this.f85623c;
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(this.f85622b, this.f85626f);
            this.f85625e = outputStreamWriter;
            outputStreamWriter.write(this.f85624d.toString());
        }
        this.f85625e.close();
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() throws IOException {
        Writer writer = this.f85625e;
        if (writer != null) {
            writer.flush();
        }
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i4, int i5) throws IOException {
        if (this.f85624d != null) {
            a(cArr, i4, i5);
        } else {
            this.f85625e.write(cArr, i4, i5);
        }
    }

    public s(OutputStream outputStream, String str) {
        this.f85624d = new StringWriter(4096);
        this.f85622b = outputStream;
        this.f85623c = str == null ? "UTF-8" : str;
    }

    public s(File file) throws FileNotFoundException {
        this(file, (String) null);
    }

    public s(File file, String str) throws FileNotFoundException {
        this(new FileOutputStream(file), str);
    }
}
