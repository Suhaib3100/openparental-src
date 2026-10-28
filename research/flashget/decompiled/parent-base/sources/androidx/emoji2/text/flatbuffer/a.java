package androidx.emoji2.text.flatbuffer;

import java.util.Arrays;

/* compiled from: ArrayReadWriteBuf.java */
/* loaded from: classes3.dex */
public class a implements q {

    /* renamed from: a, reason: collision with root package name */
    private byte[] f29324a;

    /* renamed from: b, reason: collision with root package name */
    private int f29325b;

    public a() {
        this(10);
    }

    @Override // androidx.emoji2.text.flatbuffer.q
    public void C(int i4, boolean z4) {
        k(i4, z4 ? (byte) 1 : (byte) 0);
    }

    @Override // androidx.emoji2.text.flatbuffer.q
    public void E(int i4, double d5) {
        j(i4 + 8);
        long doubleToRawLongBits = Double.doubleToRawLongBits(d5);
        int i5 = (int) doubleToRawLongBits;
        byte[] bArr = this.f29324a;
        bArr[i4] = (byte) (i5 & 255);
        bArr[i4 + 1] = (byte) ((i5 >> 8) & 255);
        bArr[i4 + 2] = (byte) ((i5 >> 16) & 255);
        bArr[i4 + 3] = (byte) ((i5 >> 24) & 255);
        int i6 = (int) (doubleToRawLongBits >> 32);
        bArr[i4 + 4] = (byte) (i6 & 255);
        bArr[i4 + 5] = (byte) ((i6 >> 8) & 255);
        bArr[i4 + 6] = (byte) ((i6 >> 16) & 255);
        bArr[i4 + 7] = (byte) ((i6 >> 24) & 255);
    }

    @Override // androidx.emoji2.text.flatbuffer.p
    public boolean J(int i4) {
        return this.f29324a[i4] != 0;
    }

    @Override // androidx.emoji2.text.flatbuffer.q
    public void M(int i4, long j4) {
        j(i4 + 8);
        int i5 = (int) j4;
        byte[] bArr = this.f29324a;
        bArr[i4] = (byte) (i5 & 255);
        bArr[i4 + 1] = (byte) ((i5 >> 8) & 255);
        bArr[i4 + 2] = (byte) ((i5 >> 16) & 255);
        bArr[i4 + 3] = (byte) ((i5 >> 24) & 255);
        int i6 = (int) (j4 >> 32);
        bArr[i4 + 4] = (byte) (i6 & 255);
        bArr[i4 + 5] = (byte) ((i6 >> 8) & 255);
        bArr[i4 + 6] = (byte) ((i6 >> 16) & 255);
        bArr[i4 + 7] = (byte) ((i6 >> 24) & 255);
    }

    @Override // androidx.emoji2.text.flatbuffer.p
    public byte[] a() {
        return this.f29324a;
    }

    @Override // androidx.emoji2.text.flatbuffer.q
    public void b(double d5) {
        E(this.f29325b, d5);
        this.f29325b += 8;
    }

    @Override // androidx.emoji2.text.flatbuffer.q
    public void c(float f4) {
        z(this.f29325b, f4);
        this.f29325b += 4;
    }

    @Override // androidx.emoji2.text.flatbuffer.p
    public String d(int i4, int i5) {
        return a0.g(this.f29324a, i4, i5);
    }

    @Override // androidx.emoji2.text.flatbuffer.q
    public void e(short s4) {
        n(this.f29325b, s4);
        this.f29325b += 2;
    }

    @Override // androidx.emoji2.text.flatbuffer.q
    public void f(boolean z4) {
        C(this.f29325b, z4);
        this.f29325b++;
    }

    @Override // androidx.emoji2.text.flatbuffer.q
    public void g(int i4) {
        t(this.f29325b, i4);
        this.f29325b += 4;
    }

    @Override // androidx.emoji2.text.flatbuffer.p
    public byte get(int i4) {
        return this.f29324a[i4];
    }

    @Override // androidx.emoji2.text.flatbuffer.p
    public double getDouble(int i4) {
        return Double.longBitsToDouble(getLong(i4));
    }

    @Override // androidx.emoji2.text.flatbuffer.p
    public float getFloat(int i4) {
        return Float.intBitsToFloat(getInt(i4));
    }

    @Override // androidx.emoji2.text.flatbuffer.p
    public int getInt(int i4) {
        byte[] bArr = this.f29324a;
        return (bArr[i4] & 255) | (bArr[i4 + 3] << com.google.common.base.c.B) | ((bArr[i4 + 2] & 255) << 16) | ((bArr[i4 + 1] & 255) << 8);
    }

    @Override // androidx.emoji2.text.flatbuffer.p
    public long getLong(int i4) {
        byte[] bArr = this.f29324a;
        int i5 = i4 + 6;
        return (bArr[i4] & 255) | ((bArr[i4 + 1] & 255) << 8) | ((bArr[i4 + 2] & 255) << 16) | ((bArr[i4 + 3] & 255) << 24) | ((bArr[i4 + 4] & 255) << 32) | ((bArr[i4 + 5] & 255) << 40) | ((bArr[i5] & 255) << 48) | (bArr[i4 + 7] << 56);
    }

    @Override // androidx.emoji2.text.flatbuffer.p
    public short getShort(int i4) {
        byte[] bArr = this.f29324a;
        return (short) ((bArr[i4] & 255) | (bArr[i4 + 1] << 8));
    }

    @Override // androidx.emoji2.text.flatbuffer.q
    public void h(long j4) {
        M(this.f29325b, j4);
        this.f29325b += 8;
    }

    @Override // androidx.emoji2.text.flatbuffer.q
    public void i(int i4, byte[] bArr, int i5, int i6) {
        j((i6 - i5) + i4);
        System.arraycopy(bArr, i5, this.f29324a, i4, i6);
    }

    @Override // androidx.emoji2.text.flatbuffer.q
    public boolean j(int i4) {
        byte[] bArr = this.f29324a;
        if (bArr.length > i4) {
            return true;
        }
        int length = bArr.length;
        this.f29324a = Arrays.copyOf(bArr, length + (length >> 1));
        return true;
    }

    @Override // androidx.emoji2.text.flatbuffer.q
    public void k(int i4, byte b5) {
        j(i4 + 1);
        this.f29324a[i4] = b5;
    }

    @Override // androidx.emoji2.text.flatbuffer.q
    public int l() {
        return this.f29325b;
    }

    @Override // androidx.emoji2.text.flatbuffer.q, androidx.emoji2.text.flatbuffer.p
    public int limit() {
        return this.f29325b;
    }

    @Override // androidx.emoji2.text.flatbuffer.q
    public void m(byte b5) {
        k(this.f29325b, b5);
        this.f29325b++;
    }

    @Override // androidx.emoji2.text.flatbuffer.q
    public void n(int i4, short s4) {
        j(i4 + 2);
        byte[] bArr = this.f29324a;
        bArr[i4] = (byte) (s4 & 255);
        bArr[i4 + 1] = (byte) ((s4 >> 8) & 255);
    }

    @Override // androidx.emoji2.text.flatbuffer.q
    public void o(byte[] bArr, int i4, int i5) {
        i(this.f29325b, bArr, i4, i5);
        this.f29325b += i5;
    }

    @Override // androidx.emoji2.text.flatbuffer.q
    public void t(int i4, int i5) {
        j(i4 + 4);
        byte[] bArr = this.f29324a;
        bArr[i4] = (byte) (i5 & 255);
        bArr[i4 + 1] = (byte) ((i5 >> 8) & 255);
        bArr[i4 + 2] = (byte) ((i5 >> 16) & 255);
        bArr[i4 + 3] = (byte) ((i5 >> 24) & 255);
    }

    @Override // androidx.emoji2.text.flatbuffer.q
    public void z(int i4, float f4) {
        j(i4 + 4);
        int floatToRawIntBits = Float.floatToRawIntBits(f4);
        byte[] bArr = this.f29324a;
        bArr[i4] = (byte) (floatToRawIntBits & 255);
        bArr[i4 + 1] = (byte) ((floatToRawIntBits >> 8) & 255);
        bArr[i4 + 2] = (byte) ((floatToRawIntBits >> 16) & 255);
        bArr[i4 + 3] = (byte) ((floatToRawIntBits >> 24) & 255);
    }

    public a(int i4) {
        this(new byte[i4]);
    }

    public a(byte[] bArr) {
        this.f29324a = bArr;
        this.f29325b = 0;
    }

    public a(byte[] bArr, int i4) {
        this.f29324a = bArr;
        this.f29325b = i4;
    }
}
