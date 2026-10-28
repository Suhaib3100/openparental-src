package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: ByteBufferReadWriteBuf.java */
/* loaded from: classes3.dex */
public class d implements q {

    /* renamed from: a, reason: collision with root package name */
    private final ByteBuffer f29330a;

    public d(ByteBuffer byteBuffer) {
        this.f29330a = byteBuffer;
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
    }

    @Override // androidx.emoji2.text.flatbuffer.q
    public void C(int i4, boolean z4) {
        k(i4, z4 ? (byte) 1 : (byte) 0);
    }

    @Override // androidx.emoji2.text.flatbuffer.q
    public void E(int i4, double d5) {
        j(i4 + 8);
        this.f29330a.putDouble(i4, d5);
    }

    @Override // androidx.emoji2.text.flatbuffer.p
    public boolean J(int i4) {
        return get(i4) != 0;
    }

    @Override // androidx.emoji2.text.flatbuffer.q
    public void M(int i4, long j4) {
        j(i4 + 8);
        this.f29330a.putLong(i4, j4);
    }

    @Override // androidx.emoji2.text.flatbuffer.p
    public byte[] a() {
        return this.f29330a.array();
    }

    @Override // androidx.emoji2.text.flatbuffer.q
    public void b(double d5) {
        this.f29330a.putDouble(d5);
    }

    @Override // androidx.emoji2.text.flatbuffer.q
    public void c(float f4) {
        this.f29330a.putFloat(f4);
    }

    @Override // androidx.emoji2.text.flatbuffer.p
    public String d(int i4, int i5) {
        return a0.h(this.f29330a, i4, i5);
    }

    @Override // androidx.emoji2.text.flatbuffer.q
    public void e(short s4) {
        this.f29330a.putShort(s4);
    }

    @Override // androidx.emoji2.text.flatbuffer.q
    public void f(boolean z4) {
        this.f29330a.put(z4 ? (byte) 1 : (byte) 0);
    }

    @Override // androidx.emoji2.text.flatbuffer.q
    public void g(int i4) {
        this.f29330a.putInt(i4);
    }

    @Override // androidx.emoji2.text.flatbuffer.p
    public byte get(int i4) {
        return this.f29330a.get(i4);
    }

    @Override // androidx.emoji2.text.flatbuffer.p
    public double getDouble(int i4) {
        return this.f29330a.getDouble(i4);
    }

    @Override // androidx.emoji2.text.flatbuffer.p
    public float getFloat(int i4) {
        return this.f29330a.getFloat(i4);
    }

    @Override // androidx.emoji2.text.flatbuffer.p
    public int getInt(int i4) {
        return this.f29330a.getInt(i4);
    }

    @Override // androidx.emoji2.text.flatbuffer.p
    public long getLong(int i4) {
        return this.f29330a.getLong(i4);
    }

    @Override // androidx.emoji2.text.flatbuffer.p
    public short getShort(int i4) {
        return this.f29330a.getShort(i4);
    }

    @Override // androidx.emoji2.text.flatbuffer.q
    public void h(long j4) {
        this.f29330a.putLong(j4);
    }

    @Override // androidx.emoji2.text.flatbuffer.q
    public void i(int i4, byte[] bArr, int i5, int i6) {
        j((i6 - i5) + i4);
        int position = this.f29330a.position();
        this.f29330a.position(i4);
        this.f29330a.put(bArr, i5, i6);
        this.f29330a.position(position);
    }

    @Override // androidx.emoji2.text.flatbuffer.q
    public boolean j(int i4) {
        return i4 <= this.f29330a.limit();
    }

    @Override // androidx.emoji2.text.flatbuffer.q
    public void k(int i4, byte b5) {
        j(i4 + 1);
        this.f29330a.put(i4, b5);
    }

    @Override // androidx.emoji2.text.flatbuffer.q
    public int l() {
        return this.f29330a.position();
    }

    @Override // androidx.emoji2.text.flatbuffer.q, androidx.emoji2.text.flatbuffer.p
    public int limit() {
        return this.f29330a.limit();
    }

    @Override // androidx.emoji2.text.flatbuffer.q
    public void m(byte b5) {
        this.f29330a.put(b5);
    }

    @Override // androidx.emoji2.text.flatbuffer.q
    public void n(int i4, short s4) {
        j(i4 + 2);
        this.f29330a.putShort(i4, s4);
    }

    @Override // androidx.emoji2.text.flatbuffer.q
    public void o(byte[] bArr, int i4, int i5) {
        this.f29330a.put(bArr, i4, i5);
    }

    @Override // androidx.emoji2.text.flatbuffer.q
    public void t(int i4, int i5) {
        j(i4 + 4);
        this.f29330a.putInt(i4, i5);
    }

    @Override // androidx.emoji2.text.flatbuffer.q
    public void z(int i4, float f4) {
        j(i4 + 4);
        this.f29330a.putFloat(i4, f4);
    }
}
