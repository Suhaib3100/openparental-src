package org.apache.commons.io.output;

import java.io.Serializable;
import java.io.Writer;

/* compiled from: StringBuilderWriter.java */
/* loaded from: classes5.dex */
public class n extends Writer implements Serializable {

    /* renamed from: o, reason: collision with root package name */
    private final StringBuilder f32096o;

    public n() {
        this.f32096o = new StringBuilder();
    }

    public StringBuilder a() {
        return this.f32096o;
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
    }

    public String toString() {
        return this.f32096o.toString();
    }

    @Override // java.io.Writer
    public void write(String str) {
        if (str != null) {
            this.f32096o.append(str);
        }
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i5, int i6) {
        if (cArr != null) {
            this.f32096o.append(cArr, i5, i6);
        }
    }

    public n(int i5) {
        this.f32096o = new StringBuilder(i5);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(char c6) {
        this.f32096o.append(c6);
        return this;
    }

    public n(StringBuilder sb) {
        this.f32096o = sb == null ? new StringBuilder() : sb;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence) {
        this.f32096o.append(charSequence);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence, int i5, int i6) {
        this.f32096o.append(charSequence, i5, i6);
        return this;
    }
}
