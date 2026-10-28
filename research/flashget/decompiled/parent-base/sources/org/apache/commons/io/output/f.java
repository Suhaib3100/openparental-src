package org.apache.commons.io.output;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* compiled from: DeferredFileOutputStream.java */
/* loaded from: classes4.dex */
public class f extends q {

    /* renamed from: e, reason: collision with root package name */
    private b f85594e;

    /* renamed from: f, reason: collision with root package name */
    private OutputStream f85595f;

    /* renamed from: g, reason: collision with root package name */
    private File f85596g;

    /* renamed from: h, reason: collision with root package name */
    private final String f85597h;

    /* renamed from: i, reason: collision with root package name */
    private final String f85598i;

    /* renamed from: j, reason: collision with root package name */
    private final File f85599j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f85600k;

    public f(int i4, File file) {
        this(i4, file, null, null, null);
    }

    @Override // org.apache.commons.io.output.q
    protected OutputStream c() throws IOException {
        return this.f85595f;
    }

    @Override // org.apache.commons.io.output.q, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        super.close();
        this.f85600k = true;
    }

    @Override // org.apache.commons.io.output.q
    protected void g() throws IOException {
        String str = this.f85597h;
        if (str != null) {
            this.f85596g = File.createTempFile(str, this.f85598i, this.f85599j);
        }
        FileOutputStream fileOutputStream = new FileOutputStream(this.f85596g);
        this.f85594e.i(fileOutputStream);
        this.f85595f = fileOutputStream;
        this.f85594e = null;
    }

    public byte[] h() {
        b bVar = this.f85594e;
        if (bVar != null) {
            return bVar.f();
        }
        return null;
    }

    public File i() {
        return this.f85596g;
    }

    public boolean k() {
        return !e();
    }

    public void l(OutputStream outputStream) throws IOException {
        if (!this.f85600k) {
            throw new IOException("Stream not closed");
        }
        if (k()) {
            this.f85594e.i(outputStream);
            return;
        }
        FileInputStream fileInputStream = new FileInputStream(this.f85596g);
        try {
            org.apache.commons.io.m.m(fileInputStream, outputStream);
            org.apache.commons.io.m.b(fileInputStream);
        } catch (Throwable th) {
            org.apache.commons.io.m.c(fileInputStream);
            throw th;
        }
    }

    public f(int i4, String str, String str2, File file) {
        this(i4, null, str, str2, file);
        if (str == null) {
            throw new IllegalArgumentException("Temporary file prefix is missing");
        }
    }

    private f(int i4, File file, String str, String str2, File file2) {
        super(i4);
        this.f85600k = false;
        this.f85596g = file;
        b bVar = new b();
        this.f85594e = bVar;
        this.f85595f = bVar;
        this.f85597h = str;
        this.f85598i = str2;
        this.f85599j = file2;
    }
}
