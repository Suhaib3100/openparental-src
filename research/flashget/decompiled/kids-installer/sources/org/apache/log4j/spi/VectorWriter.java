package org.apache.log4j.spi;

import java.io.PrintWriter;
import java.util.Vector;

/* loaded from: classes5.dex */
class VectorWriter extends PrintWriter {

    /* renamed from: v, reason: collision with root package name */
    private Vector f32119v;

    VectorWriter() {
        super(new NullWriter());
        this.f32119v = new Vector();
    }

    @Override // java.io.PrintWriter
    public void print(Object obj) {
        this.f32119v.addElement(String.valueOf(obj));
    }

    @Override // java.io.PrintWriter
    public void println(Object obj) {
        this.f32119v.addElement(String.valueOf(obj));
    }

    public String[] toStringArray() {
        int size = this.f32119v.size();
        String[] strArr = new String[size];
        for (int i5 = 0; i5 < size; i5++) {
            strArr[i5] = (String) this.f32119v.elementAt(i5);
        }
        return strArr;
    }

    @Override // java.io.PrintWriter, java.io.Writer
    public void write(char[] cArr) {
        this.f32119v.addElement(new String(cArr));
    }

    @Override // java.io.PrintWriter
    public void print(char[] cArr) {
        this.f32119v.addElement(new String(cArr));
    }

    @Override // java.io.PrintWriter
    public void println(char[] cArr) {
        this.f32119v.addElement(new String(cArr));
    }

    @Override // java.io.PrintWriter, java.io.Writer
    public void write(char[] cArr, int i5, int i6) {
        this.f32119v.addElement(new String(cArr, i5, i6));
    }

    @Override // java.io.PrintWriter
    public void print(String str) {
        this.f32119v.addElement(str);
    }

    @Override // java.io.PrintWriter
    public void println(String str) {
        this.f32119v.addElement(str);
    }

    @Override // java.io.PrintWriter, java.io.Writer
    public void write(String str, int i5, int i6) {
        this.f32119v.addElement(str.substring(i5, i6 + i5));
    }

    @Override // java.io.PrintWriter, java.io.Writer
    public void write(String str) {
        this.f32119v.addElement(str);
    }
}
