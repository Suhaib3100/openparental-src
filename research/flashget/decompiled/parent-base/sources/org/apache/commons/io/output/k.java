package org.apache.commons.io.output;

import java.io.Writer;

/* compiled from: NullWriter.java */
/* loaded from: classes4.dex */
public class k extends Writer {

    /* renamed from: b, reason: collision with root package name */
    public static final k f85607b = new k();

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(char c5) {
        return this;
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
    }

    @Override // java.io.Writer
    public void write(int i4) {
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence) {
        return this;
    }

    @Override // java.io.Writer
    public void write(String str) {
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence, int i4, int i5) {
        return this;
    }

    @Override // java.io.Writer
    public void write(String str, int i4, int i5) {
    }

    @Override // java.io.Writer
    public void write(char[] cArr) {
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i4, int i5) {
    }
}
