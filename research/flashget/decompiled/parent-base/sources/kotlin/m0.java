package kotlin;

/* compiled from: Numbers.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0005\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\n\n\u0002\b\u000b\u001a\u0014\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0087\b¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0014\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u0087\b¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u0014\u0010\u0005\u001a\u00020\u0001*\u00020\u0000H\u0087\b¢\u0006\u0004\b\u0005\u0010\u0003\u001a\u0014\u0010\u0006\u001a\u00020\u0000*\u00020\u0000H\u0087\b¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0014\u0010\b\u001a\u00020\u0000*\u00020\u0000H\u0087\b¢\u0006\u0004\b\b\u0010\u0007\u001a\u001b\u0010\n\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\t\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u001b\u0010\f\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\t\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\f\u0010\u000b\u001a\u0014\u0010\u000e\u001a\u00020\u0001*\u00020\rH\u0087\b¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0014\u0010\u0010\u001a\u00020\u0001*\u00020\rH\u0087\b¢\u0006\u0004\b\u0010\u0010\u000f\u001a\u0014\u0010\u0011\u001a\u00020\u0001*\u00020\rH\u0087\b¢\u0006\u0004\b\u0011\u0010\u000f\u001a\u0014\u0010\u0012\u001a\u00020\r*\u00020\rH\u0087\b¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0014\u0010\u0014\u001a\u00020\r*\u00020\rH\u0087\b¢\u0006\u0004\b\u0014\u0010\u0013\u001a\u001b\u0010\u0015\u001a\u00020\r*\u00020\r2\u0006\u0010\t\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u001b\u0010\u0017\u001a\u00020\r*\u00020\r2\u0006\u0010\t\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0017\u0010\u0016¨\u0006\u0018"}, d2 = {"", "", "V0", "(B)I", "T0", "X0", "d1", "(B)B", "f1", "bitCount", "Z0", "(BI)B", "b1", "", "W0", "(S)I", "U0", "Y0", "e1", "(S)S", "g1", "a1", "(SI)S", "c1", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/NumbersKt")
/* loaded from: classes7.dex */
class m0 extends l0 {
    @o2(markerClass = {r.class})
    @c1(version = "1.4")
    @kotlin.internal.f
    private static final int T0(byte b5) {
        return Integer.numberOfLeadingZeros(b5 & 255) - 24;
    }

    @o2(markerClass = {r.class})
    @c1(version = "1.4")
    @kotlin.internal.f
    private static final int U0(short s4) {
        return Integer.numberOfLeadingZeros(s4 & g2.f75095e) - 16;
    }

    @o2(markerClass = {r.class})
    @c1(version = "1.4")
    @kotlin.internal.f
    private static final int V0(byte b5) {
        return Integer.bitCount(b5 & 255);
    }

    @o2(markerClass = {r.class})
    @c1(version = "1.4")
    @kotlin.internal.f
    private static final int W0(short s4) {
        return Integer.bitCount(s4 & g2.f75095e);
    }

    @o2(markerClass = {r.class})
    @c1(version = "1.4")
    @kotlin.internal.f
    private static final int X0(byte b5) {
        return Integer.numberOfTrailingZeros(b5 | 256);
    }

    @o2(markerClass = {r.class})
    @c1(version = "1.4")
    @kotlin.internal.f
    private static final int Y0(short s4) {
        return Integer.numberOfTrailingZeros(s4 | 65536);
    }

    @o2(markerClass = {r.class})
    @c1(version = "1.6")
    public static final byte Z0(byte b5, int i4) {
        int i5 = i4 & 7;
        return (byte) (((b5 & 255) >>> (8 - i5)) | (b5 << i5));
    }

    @o2(markerClass = {r.class})
    @c1(version = "1.6")
    public static final short a1(short s4, int i4) {
        int i5 = i4 & 15;
        return (short) (((s4 & 65535) >>> (16 - i5)) | (s4 << i5));
    }

    @o2(markerClass = {r.class})
    @c1(version = "1.6")
    public static final byte b1(byte b5, int i4) {
        int i5 = i4 & 7;
        return (byte) (((b5 & 255) >>> i5) | (b5 << (8 - i5)));
    }

    @o2(markerClass = {r.class})
    @c1(version = "1.6")
    public static final short c1(short s4, int i4) {
        int i5 = i4 & 15;
        return (short) (((s4 & 65535) >>> i5) | (s4 << (16 - i5)));
    }

    @o2(markerClass = {r.class})
    @c1(version = "1.4")
    @kotlin.internal.f
    private static final byte d1(byte b5) {
        return (byte) Integer.highestOneBit(b5 & 255);
    }

    @o2(markerClass = {r.class})
    @c1(version = "1.4")
    @kotlin.internal.f
    private static final short e1(short s4) {
        return (short) Integer.highestOneBit(s4 & g2.f75095e);
    }

    @o2(markerClass = {r.class})
    @c1(version = "1.4")
    @kotlin.internal.f
    private static final byte f1(byte b5) {
        return (byte) Integer.lowestOneBit(b5);
    }

    @o2(markerClass = {r.class})
    @c1(version = "1.4")
    @kotlin.internal.f
    private static final short g1(short s4) {
        return (short) Integer.lowestOneBit(s4);
    }
}
