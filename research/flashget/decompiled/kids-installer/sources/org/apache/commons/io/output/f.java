package org.apache.commons.io.output;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* compiled from: DeferredFileOutputStream.java */
/* loaded from: classes6.dex */
public class f extends q {

    /* renamed from: r, reason: collision with root package name */
    private b f32082r;

    /* renamed from: s, reason: collision with root package name */
    private OutputStream f32083s;

    /* renamed from: t, reason: collision with root package name */
    private File f32084t;

    /* renamed from: u, reason: collision with root package name */
    private final String f32085u;

    /* renamed from: v, reason: collision with root package name */
    private final String f32086v;

    /* renamed from: w, reason: collision with root package name */
    private final File f32087w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f32088x;

    public f(int i5, File file) {
        this(i5, file, null, null, null);
    }

    @Override // org.apache.commons.io.output.q
    protected OutputStream c() throws IOException {
        return this.f32083s;
    }

    @Override // org.apache.commons.io.output.q, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        super.close();
        this.f32088x = true;
    }

    @Override // org.apache.commons.io.output.q
    protected void j() throws IOException {
        String str = this.f32085u;
        if (str != null) {
            this.f32084t = File.createTempFile(str, this.f32086v, this.f32087w);
        }
        FileOutputStream fileOutputStream = new FileOutputStream(this.f32084t);
        this.f32082r.l(fileOutputStream);
        this.f32083s = fileOutputStream;
        this.f32082r = null;
    }

    public byte[] k() {
        b bVar = this.f32082r;
        if (bVar != null) {
            return bVar.g();
        }
        return null;
    }

    public File l() {
        return this.f32084t;
    }

    public boolean m() {
        return !e();
    }

    public void n(OutputStream outputStream) throws IOException {
        if (!this.f32088x) {
            throw new IOException("Stream not closed");
        }
        if (m()) {
            this.f32082r.l(outputStream);
            return;
        }
        FileInputStream fileInputStream = new FileInputStream(this.f32084t);
        try {
            org.apache.commons.io.n.m(fileInputStream, outputStream);
            org.apache.commons.io.n.b(fileInputStream);
        } catch (Throwable th) {
            org.apache.commons.io.n.c(fileInputStream);
            throw th;
        }
    }

    public f(int i5, String str, String str2, File file) {
        this(i5, null, str, str2, file);
        if (str == null) {
            throw new IllegalArgumentException("Temporary file prefix is missing");
        }
    }

    private f(int i5, File file, String str, String str2, File file2) {
        super(i5);
        this.f32088x = false;
        this.f32084t = file;
        b bVar = new b();
        this.f32082r = bVar;
        this.f32083s = bVar;
        this.f32085u = str;
        this.f32086v = str2;
        this.f32087w = file2;
    }
}
