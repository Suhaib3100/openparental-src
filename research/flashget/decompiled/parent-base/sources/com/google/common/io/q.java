package com.google.common.io;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Objects;

/* compiled from: FileBackedOutputStream.java */
@p
@d9.a
@d9.c
/* loaded from: classes6.dex */
public final class q extends OutputStream {

    /* renamed from: b, reason: collision with root package name */
    private final int f57152b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f57153c;

    /* renamed from: d, reason: collision with root package name */
    private final f f57154d;

    /* renamed from: e, reason: collision with root package name */
    @zc.a
    private final File f57155e;

    /* renamed from: f, reason: collision with root package name */
    @g9.a("this")
    private OutputStream f57156f;

    /* renamed from: g, reason: collision with root package name */
    @g9.a("this")
    @zc.a
    private c f57157g;

    /* renamed from: h, reason: collision with root package name */
    @g9.a("this")
    @zc.a
    private File f57158h;

    /* compiled from: FileBackedOutputStream.java */
    class a extends f {
        a() {
        }

        protected void finalize() {
            try {
                q.this.e();
            } catch (Throwable th) {
                th.printStackTrace(System.err);
            }
        }

        @Override // com.google.common.io.f
        public InputStream m() throws IOException {
            return q.this.d();
        }
    }

    /* compiled from: FileBackedOutputStream.java */
    class b extends f {
        b() {
        }

        @Override // com.google.common.io.f
        public InputStream m() throws IOException {
            return q.this.d();
        }
    }

    /* compiled from: FileBackedOutputStream.java */
    private static class c extends ByteArrayOutputStream {
        private c() {
        }

        byte[] a() {
            return ((ByteArrayOutputStream) this).buf;
        }

        int getCount() {
            return ((ByteArrayOutputStream) this).count;
        }

        c(a aVar) {
        }
    }

    public q(int i4) {
        this(i4, false, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized InputStream d() throws IOException {
        if (this.f57158h != null) {
            return new FileInputStream(this.f57158h);
        }
        Objects.requireNonNull(this.f57157g);
        return new ByteArrayInputStream(this.f57157g.a(), 0, this.f57157g.getCount());
    }

    @g9.a("this")
    private void f(int i4) throws IOException {
        c cVar = this.f57157g;
        if (cVar == null || cVar.getCount() + i4 <= this.f57152b) {
            return;
        }
        File createTempFile = File.createTempFile(ProtectedSandApp.s("\uf6b8"), null, this.f57155e);
        if (this.f57153c) {
            createTempFile.deleteOnExit();
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            fileOutputStream.write(this.f57157g.a(), 0, this.f57157g.getCount());
            fileOutputStream.flush();
            this.f57156f = fileOutputStream;
            this.f57158h = createTempFile;
            this.f57157g = null;
        } catch (IOException e4) {
            createTempFile.delete();
            throw e4;
        }
    }

    public f b() {
        return this.f57154d;
    }

    @d9.d
    @zc.a
    synchronized File c() {
        return this.f57158h;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        this.f57156f.close();
    }

    public synchronized void e() throws IOException {
        try {
            close();
            c cVar = this.f57157g;
            if (cVar == null) {
                this.f57157g = new c();
            } else {
                cVar.reset();
            }
            this.f57156f = this.f57157g;
            File file = this.f57158h;
            if (file != null) {
                this.f57158h = null;
                if (!file.delete()) {
                    String valueOf = String.valueOf(file);
                    StringBuilder sb = new StringBuilder(valueOf.length() + 18);
                    sb.append(ProtectedSandApp.s("\uf6b9"));
                    sb.append(valueOf);
                    throw new IOException(sb.toString());
                }
            }
        } catch (Throwable th) {
            if (this.f57157g == null) {
                this.f57157g = new c();
            } else {
                this.f57157g.reset();
            }
            this.f57156f = this.f57157g;
            File file2 = this.f57158h;
            if (file2 != null) {
                this.f57158h = null;
                if (!file2.delete()) {
                    String valueOf2 = String.valueOf(file2);
                    StringBuilder sb2 = new StringBuilder(valueOf2.length() + 18);
                    sb2.append(ProtectedSandApp.s("\uf6b9"));
                    sb2.append(valueOf2);
                    throw new IOException(sb2.toString());
                }
            }
            throw th;
        } finally {
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public synchronized void flush() throws IOException {
        this.f57156f.flush();
    }

    @Override // java.io.OutputStream
    public synchronized void write(int i4) throws IOException {
        f(1);
        this.f57156f.write(i4);
    }

    public q(int i4, boolean z4) {
        this(i4, z4, null);
    }

    private q(int i4, boolean z4, @zc.a File file) {
        this.f57152b = i4;
        this.f57153c = z4;
        this.f57155e = file;
        c cVar = new c();
        this.f57157g = cVar;
        this.f57156f = cVar;
        if (z4) {
            this.f57154d = new a();
        } else {
            this.f57154d = new b();
        }
    }

    @Override // java.io.OutputStream
    public synchronized void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public synchronized void write(byte[] bArr, int i4, int i5) throws IOException {
        f(i5);
        this.f57156f.write(bArr, i4, i5);
    }
}
