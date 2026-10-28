package kotlin;

/* compiled from: UNumbers.kt */
@kd.i(name = "UNumbersKt")
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a\u0014\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0087\b¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0014\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u0087\b¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u0014\u0010\u0005\u001a\u00020\u0001*\u00020\u0000H\u0087\b¢\u0006\u0004\b\u0005\u0010\u0003\u001a\u0014\u0010\u0006\u001a\u00020\u0000*\u00020\u0000H\u0087\b¢\u0006\u0004\b\u0006\u0010\u0003\u001a\u0014\u0010\u0007\u001a\u00020\u0000*\u00020\u0000H\u0087\b¢\u0006\u0004\b\u0007\u0010\u0003\u001a\u001c\u0010\t\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\b\u001a\u00020\u0001H\u0087\b¢\u0006\u0004\b\t\u0010\n\u001a\u001c\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\b\u001a\u00020\u0001H\u0087\b¢\u0006\u0004\b\u000b\u0010\n\u001a\u0014\u0010\r\u001a\u00020\u0001*\u00020\fH\u0087\b¢\u0006\u0004\b\r\u0010\u000e\u001a\u0014\u0010\u000f\u001a\u00020\u0001*\u00020\fH\u0087\b¢\u0006\u0004\b\u000f\u0010\u000e\u001a\u0014\u0010\u0010\u001a\u00020\u0001*\u00020\fH\u0087\b¢\u0006\u0004\b\u0010\u0010\u000e\u001a\u0014\u0010\u0011\u001a\u00020\f*\u00020\fH\u0087\b¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0014\u0010\u0013\u001a\u00020\f*\u00020\fH\u0087\b¢\u0006\u0004\b\u0013\u0010\u0012\u001a\u001c\u0010\u0014\u001a\u00020\f*\u00020\f2\u0006\u0010\b\u001a\u00020\u0001H\u0087\b¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001c\u0010\u0016\u001a\u00020\f*\u00020\f2\u0006\u0010\b\u001a\u00020\u0001H\u0087\b¢\u0006\u0004\b\u0016\u0010\u0015\u001a\u0014\u0010\u0018\u001a\u00020\u0001*\u00020\u0017H\u0087\b¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0014\u0010\u001a\u001a\u00020\u0001*\u00020\u0017H\u0087\b¢\u0006\u0004\b\u001a\u0010\u0019\u001a\u0014\u0010\u001b\u001a\u00020\u0001*\u00020\u0017H\u0087\b¢\u0006\u0004\b\u001b\u0010\u0019\u001a\u0014\u0010\u001c\u001a\u00020\u0017*\u00020\u0017H\u0087\b¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u0014\u0010\u001e\u001a\u00020\u0017*\u00020\u0017H\u0087\b¢\u0006\u0004\b\u001e\u0010\u001d\u001a\u001c\u0010\u001f\u001a\u00020\u0017*\u00020\u00172\u0006\u0010\b\u001a\u00020\u0001H\u0087\b¢\u0006\u0004\b\u001f\u0010 \u001a\u001c\u0010!\u001a\u00020\u0017*\u00020\u00172\u0006\u0010\b\u001a\u00020\u0001H\u0087\b¢\u0006\u0004\b!\u0010 \u001a\u0014\u0010#\u001a\u00020\u0001*\u00020\"H\u0087\b¢\u0006\u0004\b#\u0010$\u001a\u0014\u0010%\u001a\u00020\u0001*\u00020\"H\u0087\b¢\u0006\u0004\b%\u0010$\u001a\u0014\u0010&\u001a\u00020\u0001*\u00020\"H\u0087\b¢\u0006\u0004\b&\u0010$\u001a\u0014\u0010'\u001a\u00020\"*\u00020\"H\u0087\b¢\u0006\u0004\b'\u0010(\u001a\u0014\u0010)\u001a\u00020\"*\u00020\"H\u0087\b¢\u0006\u0004\b)\u0010(\u001a\u001c\u0010*\u001a\u00020\"*\u00020\"2\u0006\u0010\b\u001a\u00020\u0001H\u0087\b¢\u0006\u0004\b*\u0010+\u001a\u001c\u0010,\u001a\u00020\"*\u00020\"2\u0006\u0010\b\u001a\u00020\u0001H\u0087\b¢\u0006\u0004\b,\u0010+¨\u0006-"}, d2 = {"Lkotlin/w1;", "", "g", "(I)I", "c", "k", "w", "A", "bitCount", "o", "(II)I", "s", "Lkotlin/a2;", "f", "(J)I", "b", "j", "v", "(J)J", "z", "m", "(JI)J", "q", "Lkotlin/s1;", "e", "(B)I", "a", "i", "u", "(B)B", "y", "n", "(BI)B", "r", "Lkotlin/g2;", "h", "(S)I", "d", "l", "x", "(S)S", "B", "p", "(SI)S", "t", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class f2 {
    @o2(markerClass = {t.class, r.class})
    @c1(version = "1.5")
    @kotlin.internal.f
    private static final int A(int i4) {
        return w1.h(Integer.lowestOneBit(i4));
    }

    @o2(markerClass = {t.class, r.class})
    @c1(version = "1.5")
    @kotlin.internal.f
    private static final short B(short s4) {
        return g2.h((short) Integer.lowestOneBit(s4 & g2.f75095e));
    }

    @o2(markerClass = {t.class, r.class})
    @c1(version = "1.5")
    @kotlin.internal.f
    private static final int a(byte b5) {
        return Integer.numberOfLeadingZeros(b5 & 255) - 24;
    }

    @o2(markerClass = {t.class, r.class})
    @c1(version = "1.5")
    @kotlin.internal.f
    private static final int b(long j4) {
        return Long.numberOfLeadingZeros(j4);
    }

    @o2(markerClass = {t.class, r.class})
    @c1(version = "1.5")
    @kotlin.internal.f
    private static final int c(int i4) {
        return Integer.numberOfLeadingZeros(i4);
    }

    @o2(markerClass = {t.class, r.class})
    @c1(version = "1.5")
    @kotlin.internal.f
    private static final int d(short s4) {
        return Integer.numberOfLeadingZeros(s4 & g2.f75095e) - 16;
    }

    @o2(markerClass = {t.class, r.class})
    @c1(version = "1.5")
    @kotlin.internal.f
    private static final int e(byte b5) {
        return Integer.bitCount(w1.h(b5 & 255));
    }

    @o2(markerClass = {t.class, r.class})
    @c1(version = "1.5")
    @kotlin.internal.f
    private static final int f(long j4) {
        return Long.bitCount(j4);
    }

    @o2(markerClass = {t.class, r.class})
    @c1(version = "1.5")
    @kotlin.internal.f
    private static final int g(int i4) {
        return Integer.bitCount(i4);
    }

    @o2(markerClass = {t.class, r.class})
    @c1(version = "1.5")
    @kotlin.internal.f
    private static final int h(short s4) {
        return Integer.bitCount(w1.h(s4 & g2.f75095e));
    }

    @o2(markerClass = {t.class, r.class})
    @c1(version = "1.5")
    @kotlin.internal.f
    private static final int i(byte b5) {
        return Integer.numberOfTrailingZeros(b5 | 256);
    }

    @o2(markerClass = {t.class, r.class})
    @c1(version = "1.5")
    @kotlin.internal.f
    private static final int j(long j4) {
        return Long.numberOfTrailingZeros(j4);
    }

    @o2(markerClass = {t.class, r.class})
    @c1(version = "1.5")
    @kotlin.internal.f
    private static final int k(int i4) {
        return Integer.numberOfTrailingZeros(i4);
    }

    @o2(markerClass = {t.class, r.class})
    @c1(version = "1.5")
    @kotlin.internal.f
    private static final int l(short s4) {
        return Integer.numberOfTrailingZeros(s4 | 65536);
    }

    @o2(markerClass = {r.class, t.class})
    @c1(version = "1.6")
    @kotlin.internal.f
    private static final long m(long j4, int i4) {
        return a2.h(Long.rotateLeft(j4, i4));
    }

    @o2(markerClass = {r.class, t.class})
    @c1(version = "1.6")
    @kotlin.internal.f
    private static final byte n(byte b5, int i4) {
        return s1.h(m0.Z0(b5, i4));
    }

    @o2(markerClass = {r.class, t.class})
    @c1(version = "1.6")
    @kotlin.internal.f
    private static final int o(int i4, int i5) {
        return w1.h(Integer.rotateLeft(i4, i5));
    }

    @o2(markerClass = {r.class, t.class})
    @c1(version = "1.6")
    @kotlin.internal.f
    private static final short p(short s4, int i4) {
        return g2.h(m0.a1(s4, i4));
    }

    @o2(markerClass = {r.class, t.class})
    @c1(version = "1.6")
    @kotlin.internal.f
    private static final long q(long j4, int i4) {
        return a2.h(Long.rotateRight(j4, i4));
    }

    @o2(markerClass = {r.class, t.class})
    @c1(version = "1.6")
    @kotlin.internal.f
    private static final byte r(byte b5, int i4) {
        return s1.h(m0.b1(b5, i4));
    }

    @o2(markerClass = {r.class, t.class})
    @c1(version = "1.6")
    @kotlin.internal.f
    private static final int s(int i4, int i5) {
        return w1.h(Integer.rotateRight(i4, i5));
    }

    @o2(markerClass = {r.class, t.class})
    @c1(version = "1.6")
    @kotlin.internal.f
    private static final short t(short s4, int i4) {
        return g2.h(m0.c1(s4, i4));
    }

    @o2(markerClass = {t.class, r.class})
    @c1(version = "1.5")
    @kotlin.internal.f
    private static final byte u(byte b5) {
        return s1.h((byte) Integer.highestOneBit(b5 & 255));
    }

    @o2(markerClass = {t.class, r.class})
    @c1(version = "1.5")
    @kotlin.internal.f
    private static final long v(long j4) {
        return a2.h(Long.highestOneBit(j4));
    }

    @o2(markerClass = {t.class, r.class})
    @c1(version = "1.5")
    @kotlin.internal.f
    private static final int w(int i4) {
        return w1.h(Integer.highestOneBit(i4));
    }

    @o2(markerClass = {t.class, r.class})
    @c1(version = "1.5")
    @kotlin.internal.f
    private static final short x(short s4) {
        return g2.h((short) Integer.highestOneBit(s4 & g2.f75095e));
    }

    @o2(markerClass = {t.class, r.class})
    @c1(version = "1.5")
    @kotlin.internal.f
    private static final byte y(byte b5) {
        return s1.h((byte) Integer.lowestOneBit(b5 & 255));
    }

    @o2(markerClass = {t.class, r.class})
    @c1(version = "1.5")
    @kotlin.internal.f
    private static final long z(long j4) {
        return a2.h(Long.lowestOneBit(j4));
    }
}
