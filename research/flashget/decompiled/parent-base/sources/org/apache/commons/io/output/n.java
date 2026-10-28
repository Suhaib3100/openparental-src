package org.apache.commons.io.output;

import java.io.Serializable;
import java.io.Writer;

/* compiled from: StringBuilderWriter.java */
/* loaded from: classes4.dex */
public class n extends Writer implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    private final StringBuilder f85608b;

    public n() {
        this.f85608b = new StringBuilder();
    }

    public StringBuilder a() {
        return this.f85608b;
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
    }

    public String toString() {
        return this.f85608b.toString();
    }

    @Override // java.io.Writer
    public void write(String str) {
        if (str != null) {
            this.f85608b.append(str);
        }
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i4, int i5) {
        if (cArr != null) {
            this.f85608b.append(cArr, i4, i5);
        }
    }

    public n(int i4) {
        this.f85608b = new StringBuilder(i4);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(char c5) {
        this.f85608b.append(c5);
        return this;
    }

    public n(StringBuilder sb) {
        this.f85608b = sb == null ? new StringBuilder() : sb;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence) {
        this.f85608b.append(charSequence);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence, int i4, int i5) {
        this.f85608b.append(charSequence, i4, i5);
        return this;
    }
}
