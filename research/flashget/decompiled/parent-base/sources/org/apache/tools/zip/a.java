package org.apache.tools.zip;

import java.util.zip.CRC32;
import java.util.zip.ZipException;

/* compiled from: AsiExtraField.java */
/* loaded from: classes3.dex */
public class a implements g, d, Cloneable {

    /* renamed from: h, reason: collision with root package name */
    private static final k f86724h = new k(30062);

    /* renamed from: b, reason: collision with root package name */
    private int f86725b = 0;

    /* renamed from: c, reason: collision with root package name */
    private int f86726c = 0;

    /* renamed from: d, reason: collision with root package name */
    private int f86727d = 0;

    /* renamed from: e, reason: collision with root package name */
    private String f86728e = "";

    /* renamed from: f, reason: collision with root package name */
    private boolean f86729f = false;

    /* renamed from: g, reason: collision with root package name */
    private CRC32 f86730g = new CRC32();

    @Override // org.apache.tools.zip.g
    public k b() {
        return f86724h;
    }

    @Override // org.apache.tools.zip.g
    public byte[] c() {
        int c5 = f().c();
        int i4 = c5 - 4;
        byte[] bArr = new byte[i4];
        System.arraycopy(new k(l()).b(), 0, bArr, 0, 2);
        byte[] bytes = k().getBytes();
        System.arraycopy(new i(bytes.length).b(), 0, bArr, 2, 4);
        System.arraycopy(new k(n()).b(), 0, bArr, 6, 2);
        System.arraycopy(new k(i()).b(), 0, bArr, 8, 2);
        System.arraycopy(bytes, 0, bArr, 10, bytes.length);
        this.f86730g.reset();
        this.f86730g.update(bArr);
        byte[] bArr2 = new byte[c5];
        System.arraycopy(new i(this.f86730g.getValue()).b(), 0, bArr2, 0, 4);
        System.arraycopy(bArr, 0, bArr2, 4, i4);
        return bArr2;
    }

    @Override // org.apache.tools.zip.g
    public byte[] d() {
        return c();
    }

    @Override // org.apache.tools.zip.g
    public k e() {
        return f();
    }

    @Override // org.apache.tools.zip.g
    public k f() {
        return new k(k().getBytes().length + 14);
    }

    @Override // org.apache.tools.zip.g
    public void g(byte[] bArr, int i4, int i5) throws ZipException {
        long c5 = new i(bArr, i4).c();
        int i6 = i5 - 4;
        byte[] bArr2 = new byte[i6];
        System.arraycopy(bArr, i4 + 4, bArr2, 0, i6);
        this.f86730g.reset();
        this.f86730g.update(bArr2);
        long value = this.f86730g.getValue();
        if (c5 != value) {
            throw new ZipException("bad CRC checksum " + Long.toHexString(c5) + " instead of " + Long.toHexString(value));
        }
        int c6 = new k(bArr2, 0).c();
        int c7 = (int) new i(bArr2, 2).c();
        byte[] bArr3 = new byte[c7];
        this.f86726c = new k(bArr2, 6).c();
        this.f86727d = new k(bArr2, 8).c();
        if (c7 == 0) {
            this.f86728e = "";
        } else {
            System.arraycopy(bArr2, 10, bArr3, 0, c7);
            this.f86728e = new String(bArr3);
        }
        q((c6 & 16384) != 0);
        t(c6);
    }

    public int i() {
        return this.f86727d;
    }

    public String k() {
        return this.f86728e;
    }

    public int l() {
        return this.f86725b;
    }

    protected int m(int i4) {
        return (i4 & d.f86736x2) | (p() ? d.f86737y2 : o() ? 16384 : 32768);
    }

    public int n() {
        return this.f86726c;
    }

    public boolean o() {
        return this.f86729f && !p();
    }

    public boolean p() {
        return k().length() != 0;
    }

    public void q(boolean z4) {
        this.f86729f = z4;
        this.f86725b = m(this.f86725b);
    }

    public void r(int i4) {
        this.f86727d = i4;
    }

    public void s(String str) {
        this.f86728e = str;
        this.f86725b = m(this.f86725b);
    }

    public void t(int i4) {
        this.f86725b = m(i4);
    }

    public void u(int i4) {
        this.f86726c = i4;
    }
}
