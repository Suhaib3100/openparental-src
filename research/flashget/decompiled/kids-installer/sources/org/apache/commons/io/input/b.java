package org.apache.commons.io.input;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/* compiled from: BOMInputStream.java */
/* loaded from: classes6.dex */
public class b extends n {

    /* renamed from: w, reason: collision with root package name */
    private static final Comparator<org.apache.commons.io.a> f31922w = new a();

    /* renamed from: o, reason: collision with root package name */
    private final boolean f31923o;

    /* renamed from: p, reason: collision with root package name */
    private final List<org.apache.commons.io.a> f31924p;

    /* renamed from: q, reason: collision with root package name */
    private org.apache.commons.io.a f31925q;

    /* renamed from: r, reason: collision with root package name */
    private int[] f31926r;

    /* renamed from: s, reason: collision with root package name */
    private int f31927s;

    /* renamed from: t, reason: collision with root package name */
    private int f31928t;

    /* renamed from: u, reason: collision with root package name */
    private int f31929u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f31930v;

    /* compiled from: BOMInputStream.java */
    /* loaded from: classes5.dex */
    static class a implements Comparator<org.apache.commons.io.a> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(org.apache.commons.io.a aVar, org.apache.commons.io.a aVar2) {
            int d6 = aVar.d();
            int d7 = aVar2.d();
            if (d6 > d7) {
                return -1;
            }
            return d7 > d6 ? 1 : 0;
        }
    }

    public b(InputStream inputStream) {
        this(inputStream, false, org.apache.commons.io.a.f31807r);
    }

    private org.apache.commons.io.a d() {
        for (org.apache.commons.io.a aVar : this.f31924p) {
            if (l(aVar)) {
                return aVar;
            }
        }
        return null;
    }

    private boolean l(org.apache.commons.io.a aVar) {
        for (int i5 = 0; i5 < aVar.d(); i5++) {
            if (aVar.a(i5) != this.f31926r[i5]) {
                return false;
            }
        }
        return true;
    }

    private int m() throws IOException {
        e();
        int i5 = this.f31928t;
        if (i5 >= this.f31927s) {
            return -1;
        }
        int[] iArr = this.f31926r;
        this.f31928t = i5 + 1;
        return iArr[i5];
    }

    public org.apache.commons.io.a e() throws IOException {
        if (this.f31926r == null) {
            this.f31927s = 0;
            this.f31926r = new int[this.f31924p.get(0).d()];
            int i5 = 0;
            while (true) {
                int[] iArr = this.f31926r;
                if (i5 >= iArr.length) {
                    break;
                }
                iArr[i5] = ((FilterInputStream) this).in.read();
                this.f31927s++;
                if (this.f31926r[i5] < 0) {
                    break;
                }
                i5++;
            }
            org.apache.commons.io.a d6 = d();
            this.f31925q = d6;
            if (d6 != null && !this.f31923o) {
                if (d6.d() < this.f31926r.length) {
                    this.f31928t = this.f31925q.d();
                } else {
                    this.f31927s = 0;
                }
            }
        }
        return this.f31925q;
    }

    public String g() throws IOException {
        e();
        org.apache.commons.io.a aVar = this.f31925q;
        if (aVar == null) {
            return null;
        }
        return aVar.c();
    }

    public boolean j() throws IOException {
        return e() != null;
    }

    public boolean k(org.apache.commons.io.a aVar) throws IOException {
        if (this.f31924p.contains(aVar)) {
            return this.f31925q != null && e().equals(aVar);
        }
        throw new IllegalArgumentException("Stream not configure to detect " + aVar);
    }

    @Override // org.apache.commons.io.input.n, java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i5) {
        this.f31929u = this.f31928t;
        this.f31930v = this.f31926r == null;
        ((FilterInputStream) this).in.mark(i5);
    }

    @Override // org.apache.commons.io.input.n, java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        int m5 = m();
        return m5 >= 0 ? m5 : ((FilterInputStream) this).in.read();
    }

    @Override // org.apache.commons.io.input.n, java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() throws IOException {
        this.f31928t = this.f31929u;
        if (this.f31930v) {
            this.f31926r = null;
        }
        ((FilterInputStream) this).in.reset();
    }

    @Override // org.apache.commons.io.input.n, java.io.FilterInputStream, java.io.InputStream
    public long skip(long j5) throws IOException {
        while (j5 > 0 && m() >= 0) {
            j5--;
        }
        return ((FilterInputStream) this).in.skip(j5);
    }

    public b(InputStream inputStream, boolean z5) {
        this(inputStream, z5, org.apache.commons.io.a.f31807r);
    }

    public b(InputStream inputStream, org.apache.commons.io.a... aVarArr) {
        this(inputStream, false, aVarArr);
    }

    @Override // org.apache.commons.io.input.n, java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i5, int i6) throws IOException {
        int i7 = 0;
        int i8 = 0;
        while (i6 > 0 && i7 >= 0) {
            i7 = m();
            if (i7 >= 0) {
                bArr[i5] = (byte) (i7 & 255);
                i6--;
                i8++;
                i5++;
            }
        }
        int read = ((FilterInputStream) this).in.read(bArr, i5, i6);
        if (read >= 0) {
            return i8 + read;
        }
        if (i8 > 0) {
            return i8;
        }
        return -1;
    }

    public b(InputStream inputStream, boolean z5, org.apache.commons.io.a... aVarArr) {
        super(inputStream);
        if (aVarArr != null && aVarArr.length != 0) {
            this.f31923o = z5;
            Arrays.sort(aVarArr, f31922w);
            this.f31924p = Arrays.asList(aVarArr);
            return;
        }
        throw new IllegalArgumentException("No BOMs specified");
    }

    @Override // org.apache.commons.io.input.n, java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }
}
