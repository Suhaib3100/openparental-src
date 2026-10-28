package org.apache.commons.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: LineIterator.java */
/* loaded from: classes4.dex */
public class n implements Iterator<String> {

    /* renamed from: b, reason: collision with root package name */
    private final BufferedReader f85580b;

    /* renamed from: c, reason: collision with root package name */
    private String f85581c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f85582d = false;

    public n(Reader reader) throws IllegalArgumentException {
        if (reader == null) {
            throw new IllegalArgumentException("Reader must not be null");
        }
        if (reader instanceof BufferedReader) {
            this.f85580b = (BufferedReader) reader;
        } else {
            this.f85580b = new BufferedReader(reader);
        }
    }

    public static void b(n nVar) {
        if (nVar != null) {
            nVar.a();
        }
    }

    public void a() {
        this.f85582d = true;
        m.e(this.f85580b);
        this.f85581c = null;
    }

    protected boolean c(String str) {
        return true;
    }

    @Override // java.util.Iterator
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public String next() {
        return e();
    }

    public String e() {
        if (!hasNext()) {
            throw new NoSuchElementException("No more lines");
        }
        String str = this.f85581c;
        this.f85581c = null;
        return str;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        String readLine;
        if (this.f85581c != null) {
            return true;
        }
        if (this.f85582d) {
            return false;
        }
        do {
            try {
                readLine = this.f85580b.readLine();
                if (readLine == null) {
                    this.f85582d = true;
                    return false;
                }
            } catch (IOException e4) {
                a();
                throw new IllegalStateException(e4);
            }
        } while (!c(readLine));
        this.f85581c = readLine;
        return true;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Remove unsupported on LineIterator");
    }
}
