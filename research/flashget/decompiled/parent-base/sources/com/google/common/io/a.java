package com.google.common.io;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;

/* compiled from: AppendableWriter.java */
@p
@d9.c
/* loaded from: classes6.dex */
class a extends Writer {

    /* renamed from: b, reason: collision with root package name */
    private final Appendable f57090b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f57091c;

    a(Appendable appendable) {
        appendable.getClass();
        this.f57090b = appendable;
    }

    private void a() throws IOException {
        if (this.f57091c) {
            throw new IOException(ProtectedSandApp.s("\uf680"));
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f57091c = true;
        Appendable appendable = this.f57090b;
        if (appendable instanceof Closeable) {
            ((Closeable) appendable).close();
        }
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() throws IOException {
        a();
        Appendable appendable = this.f57090b;
        if (appendable instanceof Flushable) {
            ((Flushable) appendable).flush();
        }
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i4, int i5) throws IOException {
        a();
        this.f57090b.append(new String(cArr, i4, i5));
    }

    @Override // java.io.Writer
    public void write(int i4) throws IOException {
        a();
        this.f57090b.append((char) i4);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(char c5) throws IOException {
        a();
        this.f57090b.append(c5);
        return this;
    }

    @Override // java.io.Writer
    public void write(String str) throws IOException {
        str.getClass();
        a();
        this.f57090b.append(str);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(@zc.a CharSequence charSequence) throws IOException {
        a();
        this.f57090b.append(charSequence);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(@zc.a CharSequence charSequence, int i4, int i5) throws IOException {
        a();
        this.f57090b.append(charSequence, i4, i5);
        return this;
    }

    @Override // java.io.Writer
    public void write(String str, int i4, int i5) throws IOException {
        str.getClass();
        a();
        this.f57090b.append(str, i4, i5 + i4);
    }
}
