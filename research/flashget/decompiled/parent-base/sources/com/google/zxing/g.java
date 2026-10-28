package com.google.zxing;

/* compiled from: InvertedLuminanceSource.java */
/* loaded from: classes6.dex */
public final class g extends h {

    /* renamed from: c, reason: collision with root package name */
    private final h f62905c;

    public g(h hVar) {
        super(hVar.e(), hVar.b());
        this.f62905c = hVar;
    }

    @Override // com.google.zxing.h
    public h a(int i4, int i5, int i6, int i7) {
        return new g(this.f62905c.a(i4, i5, i6, i7));
    }

    @Override // com.google.zxing.h
    public byte[] c() {
        byte[] c5 = this.f62905c.c();
        int b5 = b() * e();
        byte[] bArr = new byte[b5];
        for (int i4 = 0; i4 < b5; i4++) {
            bArr[i4] = (byte) (255 - (c5[i4] & 255));
        }
        return bArr;
    }

    @Override // com.google.zxing.h
    public byte[] d(int i4, byte[] bArr) {
        byte[] d5 = this.f62905c.d(i4, bArr);
        int e4 = e();
        for (int i5 = 0; i5 < e4; i5++) {
            d5[i5] = (byte) (255 - (d5[i5] & 255));
        }
        return d5;
    }

    @Override // com.google.zxing.h
    public h f() {
        return this.f62905c;
    }

    @Override // com.google.zxing.h
    public boolean g() {
        return this.f62905c.g();
    }

    @Override // com.google.zxing.h
    public boolean h() {
        return this.f62905c.h();
    }

    @Override // com.google.zxing.h
    public h i() {
        return new g(this.f62905c.i());
    }

    @Override // com.google.zxing.h
    public h j() {
        return new g(this.f62905c.j());
    }
}
