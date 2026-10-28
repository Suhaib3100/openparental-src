package org.apache.commons.io.input;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/* compiled from: BOMInputStream.java */
/* loaded from: classes4.dex */
public class b extends n {

    /* renamed from: j, reason: collision with root package name */
    private static final Comparator<org.apache.commons.io.a> f85439j = new a();

    /* renamed from: b, reason: collision with root package name */
    private final boolean f85440b;

    /* renamed from: c, reason: collision with root package name */
    private final List<org.apache.commons.io.a> f85441c;

    /* renamed from: d, reason: collision with root package name */
    private org.apache.commons.io.a f85442d;

    /* renamed from: e, reason: collision with root package name */
    private int[] f85443e;

    /* renamed from: f, reason: collision with root package name */
    private int f85444f;

    /* renamed from: g, reason: collision with root package name */
    private int f85445g;

    /* renamed from: h, reason: collision with root package name */
    private int f85446h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f85447i;

    /* compiled from: BOMInputStream.java */
    static class a implements Comparator<org.apache.commons.io.a> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(org.apache.commons.io.a aVar, org.apache.commons.io.a aVar2) {
            int d5 = aVar.d();
            int d6 = aVar2.d();
            if (d5 > d6) {
                return -1;
            }
            return d6 > d5 ? 1 : 0;
        }
    }

    public b(InputStream inputStream, boolean z4, org.apache.commons.io.a... aVarArr) {
        super(inputStream);
        if (aVarArr == null || aVarArr.length == 0) {
            throw new IllegalArgumentException("No BOMs specified");
        }
        this.f85440b = z4;
        Arrays.sort(aVarArr, f85439j);
        this.f85441c = Arrays.asList(aVarArr);
    }

    private org.apache.commons.io.a d() {
        for (org.apache.commons.io.a aVar : this.f85441c) {
            if (i(aVar)) {
                return aVar;
            }
        }
        return null;
    }

    private boolean i(org.apache.commons.io.a aVar) {
        for (int i4 = 0; i4 < aVar.d(); i4++) {
            if (aVar.a(i4) != this.f85443e[i4]) {
                return false;
            }
        }
        return true;
    }

    private int k() throws IOException {
        e();
        int i4 = this.f85445g;
        if (i4 >= this.f85444f) {
            return -1;
        }
        int[] iArr = this.f85443e;
        this.f85445g = i4 + 1;
        return iArr[i4];
    }

    public org.apache.commons.io.a e() throws IOException {
        if (this.f85443e == null) {
            this.f85444f = 0;
            this.f85443e = new int[this.f85441c.get(0).d()];
            int i4 = 0;
            while (true) {
                int[] iArr = this.f85443e;
                if (i4 >= iArr.length) {
                    break;
                }
                iArr[i4] = ((FilterInputStream) this).in.read();
                this.f85444f++;
                if (this.f85443e[i4] < 0) {
                    break;
                }
                i4++;
            }
            org.apache.commons.io.a d5 = d();
            this.f85442d = d5;
            if (d5 != null && !this.f85440b) {
                if (d5.d() < this.f85443e.length) {
                    this.f85445g = this.f85442d.d();
                } else {
                    this.f85444f = 0;
                }
            }
        }
        return this.f85442d;
    }

    public String f() throws IOException {
        e();
        org.apache.commons.io.a aVar = this.f85442d;
        if (aVar == null) {
            return null;
        }
        return aVar.c();
    }

    public boolean g() throws IOException {
        return e() != null;
    }

    public boolean h(org.apache.commons.io.a aVar) throws IOException {
        if (this.f85441c.contains(aVar)) {
            return this.f85442d != null && e().equals(aVar);
        }
        throw new IllegalArgumentException("Stream not configure to detect " + aVar);
    }

    @Override // org.apache.commons.io.input.n, java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i4) {
        this.f85446h = this.f85445g;
        this.f85447i = this.f85443e == null;
        ((FilterInputStream) this).in.mark(i4);
    }

    @Override // org.apache.commons.io.input.n, java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        int k4 = k();
        return k4 >= 0 ? k4 : ((FilterInputStream) this).in.read();
    }

    @Override // org.apache.commons.io.input.n, java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() throws IOException {
        try {
            this.f85445g = this.f85446h;
            if (this.f85447i) {
                this.f85443e = null;
            }
            ((FilterInputStream) this).in.reset();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // org.apache.commons.io.input.n, java.io.FilterInputStream, java.io.InputStream
    public long skip(long j4) throws IOException {
        while (j4 > 0 && k() >= 0) {
            j4--;
        }
        return ((FilterInputStream) this).in.skip(j4);
    }

    @Override // org.apache.commons.io.input.n, java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i4, int i5) throws IOException {
        int i6 = 0;
        int i7 = 0;
        while (i5 > 0 && i6 >= 0) {
            i6 = k();
            if (i6 >= 0) {
                bArr[i4] = (byte) (i6 & 255);
                i5--;
                i7++;
                i4++;
            }
        }
        int read = ((FilterInputStream) this).in.read(bArr, i4, i5);
        if (read >= 0) {
            return i7 + read;
        }
        if (i7 > 0) {
            return i7;
        }
        return -1;
    }

    @Override // org.apache.commons.io.input.n, java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    public b(InputStream inputStream) {
        this(inputStream, false, org.apache.commons.io.a.f85307e);
    }

    public b(InputStream inputStream, boolean z4) {
        this(inputStream, z4, org.apache.commons.io.a.f85307e);
    }

    public b(InputStream inputStream, org.apache.commons.io.a... aVarArr) {
        this(inputStream, false, aVarArr);
    }
}
