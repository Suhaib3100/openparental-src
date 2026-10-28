package org.apache.commons.io.output;

import java.io.Writer;

/* compiled from: NullWriter.java */
/* loaded from: classes5.dex */
public class k extends Writer {

    /* renamed from: o, reason: collision with root package name */
    public static final k f32095o = new k();

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(char c6) {
        return this;
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
    }

    @Override // java.io.Writer
    public void write(int i5) {
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence) {
        return this;
    }

    @Override // java.io.Writer
    public void write(String str) {
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence, int i5, int i6) {
        return this;
    }

    @Override // java.io.Writer
    public void write(String str, int i5, int i6) {
    }

    @Override // java.io.Writer
    public void write(char[] cArr) {
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i5, int i6) {
    }
}
