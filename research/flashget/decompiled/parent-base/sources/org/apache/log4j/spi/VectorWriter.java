package org.apache.log4j.spi;

import java.io.PrintWriter;
import java.util.Vector;

/* loaded from: classes3.dex */
class VectorWriter extends PrintWriter {

    /* renamed from: v, reason: collision with root package name */
    private Vector f86723v;

    VectorWriter() {
        super(new NullWriter());
        this.f86723v = new Vector();
    }

    @Override // java.io.PrintWriter
    public void print(Object obj) {
        this.f86723v.addElement(String.valueOf(obj));
    }

    @Override // java.io.PrintWriter
    public void println(Object obj) {
        this.f86723v.addElement(String.valueOf(obj));
    }

    public String[] toStringArray() {
        int size = this.f86723v.size();
        String[] strArr = new String[size];
        for (int i4 = 0; i4 < size; i4++) {
            strArr[i4] = (String) this.f86723v.elementAt(i4);
        }
        return strArr;
    }

    @Override // java.io.PrintWriter, java.io.Writer
    public void write(char[] cArr) {
        this.f86723v.addElement(new String(cArr));
    }

    @Override // java.io.PrintWriter
    public void print(char[] cArr) {
        this.f86723v.addElement(new String(cArr));
    }

    @Override // java.io.PrintWriter
    public void println(char[] cArr) {
        this.f86723v.addElement(new String(cArr));
    }

    @Override // java.io.PrintWriter, java.io.Writer
    public void write(char[] cArr, int i4, int i5) {
        this.f86723v.addElement(new String(cArr, i4, i5));
    }

    @Override // java.io.PrintWriter
    public void print(String str) {
        this.f86723v.addElement(str);
    }

    @Override // java.io.PrintWriter
    public void println(String str) {
        this.f86723v.addElement(str);
    }

    @Override // java.io.PrintWriter, java.io.Writer
    public void write(String str, int i4, int i5) {
        this.f86723v.addElement(str.substring(i4, i5 + i4));
    }

    @Override // java.io.PrintWriter, java.io.Writer
    public void write(String str) {
        this.f86723v.addElement(str);
    }
}
