package org.apache.commons.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: LineIterator.java */
/* loaded from: classes5.dex */
public class o implements Iterator<String> {

    /* renamed from: o, reason: collision with root package name */
    private final BufferedReader f32070o;

    /* renamed from: p, reason: collision with root package name */
    private String f32071p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f32072q = false;

    public o(Reader reader) throws IllegalArgumentException {
        if (reader == null) {
            throw new IllegalArgumentException("Reader must not be null");
        }
        if (reader instanceof BufferedReader) {
            this.f32070o = (BufferedReader) reader;
        } else {
            this.f32070o = new BufferedReader(reader);
        }
    }

    public static void c(o oVar) {
        if (oVar != null) {
            oVar.a();
        }
    }

    public void a() {
        this.f32072q = true;
        n.e(this.f32070o);
        this.f32071p = null;
    }

    protected boolean d(String str) {
        return true;
    }

    @Override // java.util.Iterator
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public String next() {
        return f();
    }

    public String f() {
        if (!hasNext()) {
            throw new NoSuchElementException("No more lines");
        }
        String str = this.f32071p;
        this.f32071p = null;
        return str;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        String readLine;
        if (this.f32071p != null) {
            return true;
        }
        if (this.f32072q) {
            return false;
        }
        do {
            try {
                readLine = this.f32070o.readLine();
                if (readLine == null) {
                    this.f32072q = true;
                    return false;
                }
            } catch (IOException e6) {
                a();
                throw new IllegalStateException(e6);
            }
        } while (!d(readLine));
        this.f32071p = readLine;
        return true;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Remove unsupported on LineIterator");
    }
}
