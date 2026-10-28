package org.apache.commons.lang3;

/* compiled from: BitField.java */
/* loaded from: classes6.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private final int f85995a;

    /* renamed from: b, reason: collision with root package name */
    private final int f85996b;

    public f(int i4) {
        this.f85995a = i4;
        this.f85996b = i4 == 0 ? 0 : Integer.numberOfTrailingZeros(i4);
    }

    public int a(int i4) {
        return i4 & (~this.f85995a);
    }

    public byte b(byte b5) {
        return (byte) a(b5);
    }

    public short c(short s4) {
        return (short) a(s4);
    }

    public int d(int i4) {
        return i4 & this.f85995a;
    }

    public short e(short s4) {
        return (short) d(s4);
    }

    public short f(short s4) {
        return (short) g(s4);
    }

    public int g(int i4) {
        return d(i4) >> this.f85996b;
    }

    public boolean h(int i4) {
        int i5 = this.f85995a;
        return (i4 & i5) == i5;
    }

    public boolean i(int i4) {
        return (i4 & this.f85995a) != 0;
    }

    public int j(int i4) {
        return i4 | this.f85995a;
    }

    public int k(int i4, boolean z4) {
        return z4 ? j(i4) : a(i4);
    }

    public byte l(byte b5) {
        return (byte) j(b5);
    }

    public byte m(byte b5, boolean z4) {
        return z4 ? l(b5) : b(b5);
    }

    public short n(short s4) {
        return (short) j(s4);
    }

    public short o(short s4, boolean z4) {
        return z4 ? n(s4) : c(s4);
    }

    public short p(short s4, short s5) {
        return (short) q(s4, s5);
    }

    public int q(int i4, int i5) {
        int i6 = this.f85995a;
        return (i4 & (~i6)) | ((i5 << this.f85996b) & i6);
    }
}
