package org.apache.tools.zip;

/* compiled from: UnrecognizedExtraField.java */
/* loaded from: classes3.dex */
public class e implements g {

    /* renamed from: b, reason: collision with root package name */
    private k f86739b;

    /* renamed from: c, reason: collision with root package name */
    private byte[] f86740c;

    /* renamed from: d, reason: collision with root package name */
    private byte[] f86741d;

    public void a(byte[] bArr) {
        this.f86741d = bArr;
    }

    @Override // org.apache.tools.zip.g
    public k b() {
        return this.f86739b;
    }

    @Override // org.apache.tools.zip.g
    public byte[] c() {
        return this.f86740c;
    }

    @Override // org.apache.tools.zip.g
    public byte[] d() {
        byte[] bArr = this.f86741d;
        return bArr != null ? bArr : c();
    }

    @Override // org.apache.tools.zip.g
    public k e() {
        byte[] bArr = this.f86741d;
        return bArr != null ? new k(bArr.length) : f();
    }

    @Override // org.apache.tools.zip.g
    public k f() {
        return new k(this.f86740c.length);
    }

    @Override // org.apache.tools.zip.g
    public void g(byte[] bArr, int i4, int i5) {
        byte[] bArr2 = new byte[i5];
        System.arraycopy(bArr, i4, bArr2, 0, i5);
        i(bArr2);
    }

    public void h(k kVar) {
        this.f86739b = kVar;
    }

    public void i(byte[] bArr) {
        this.f86740c = bArr;
    }
}
