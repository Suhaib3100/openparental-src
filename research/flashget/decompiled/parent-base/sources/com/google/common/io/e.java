package com.google.common.io;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.Charset;

/* compiled from: ByteSink.java */
@p
@d9.c
/* loaded from: classes6.dex */
public abstract class e {

    /* compiled from: ByteSink.java */
    private final class b extends i {

        /* renamed from: a, reason: collision with root package name */
        private final Charset f57097a;

        @Override // com.google.common.io.i
        public Writer b() throws IOException {
            return new OutputStreamWriter(e.this.c(), this.f57097a);
        }

        public String toString() {
            String obj = e.this.toString();
            String valueOf = String.valueOf(this.f57097a);
            return com.google.common.base.e.a(valueOf.length() + com.google.android.gms.common.internal.b.a(obj, 13), obj, ProtectedSandApp.s("\uf683"), valueOf, ProtectedSandApp.s("\uf684"));
        }

        private b(Charset charset) {
            charset.getClass();
            this.f57097a = charset;
        }
    }

    protected e() {
    }

    public i a(Charset charset) {
        return new b(charset);
    }

    public OutputStream b() throws IOException {
        OutputStream c5 = c();
        return c5 instanceof BufferedOutputStream ? (BufferedOutputStream) c5 : new BufferedOutputStream(c5);
    }

    public abstract OutputStream c() throws IOException;

    public void d(byte[] bArr) throws IOException {
        bArr.getClass();
        try {
            OutputStream outputStream = (OutputStream) m.a().b(c());
            outputStream.write(bArr);
            outputStream.flush();
        } finally {
        }
    }

    @f9.a
    public long e(InputStream inputStream) throws IOException {
        inputStream.getClass();
        try {
            OutputStream outputStream = (OutputStream) m.a().b(c());
            long b5 = g.b(inputStream, outputStream);
            outputStream.flush();
            return b5;
        } finally {
        }
    }
}
