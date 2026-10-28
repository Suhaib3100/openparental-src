package kotlin;

import kotlin.internal.InlineOnly;
import kotlin.internal.IntrinsicConstEvaluation;
import kotlin.ranges.UIntRange;

/* compiled from: UInt.kt */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\n\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0087@\u0018\u0000 {2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001{B\u0011\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\f¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\f\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\rH\u0087\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\f\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0000H\u0097\n¢\u0006\u0004\b\u0010\u0010\u000bJ\u0018\u0010\f\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0011H\u0087\n¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\f\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0014H\u0087\n¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u0000H\u0087\nø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0005J\u0018\u0010\u0019\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\rH\u0087\n¢\u0006\u0004\b\u001a\u0010\u000fJ\u0018\u0010\u0019\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b\u001b\u0010\u000bJ\u0018\u0010\u0019\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0011H\u0087\n¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010\u0019\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0014H\u0087\n¢\u0006\u0004\b\u001e\u0010\u0016J\u001a\u0010\u001f\u001a\u00020 2\b\u0010\t\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b\"\u0010#J\u0018\u0010$\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\rH\u0087\b¢\u0006\u0004\b%\u0010\u000fJ\u0018\u0010$\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\b&\u0010\u000bJ\u0018\u0010$\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0011H\u0087\b¢\u0006\u0004\b'\u0010\u001dJ\u0018\u0010$\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0014H\u0087\b¢\u0006\u0004\b(\u0010\u0016J\u0010\u0010)\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b*\u0010\u0005J\u0013\u0010+\u001a\u00020\u0000H\u0087\nø\u0001\u0000¢\u0006\u0004\b,\u0010\u0005J\u0013\u0010-\u001a\u00020\u0000H\u0087\bø\u0001\u0000¢\u0006\u0004\b.\u0010\u0005J\u0018\u0010/\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\rH\u0087\n¢\u0006\u0004\b0\u0010\u000fJ\u0018\u0010/\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b1\u0010\u000bJ\u0018\u0010/\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0011H\u0087\n¢\u0006\u0004\b2\u0010\u001dJ\u0018\u0010/\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0014H\u0087\n¢\u0006\u0004\b3\u0010\u0016J\u0018\u00104\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\rH\u0087\b¢\u0006\u0004\b5\u00106J\u0018\u00104\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\b7\u0010\u000bJ\u0018\u00104\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0011H\u0087\b¢\u0006\u0004\b8\u0010\u001dJ\u0018\u00104\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\u0014H\u0087\b¢\u0006\u0004\b9\u0010:J\u0018\u0010;\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\f¢\u0006\u0004\b<\u0010\u000bJ\u0018\u0010=\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\rH\u0087\n¢\u0006\u0004\b>\u0010\u000fJ\u0018\u0010=\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b?\u0010\u000bJ\u0018\u0010=\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0011H\u0087\n¢\u0006\u0004\b@\u0010\u001dJ\u0018\u0010=\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0014H\u0087\n¢\u0006\u0004\bA\u0010\u0016J\u0018\u0010B\u001a\u00020C2\u0006\u0010\t\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\bD\u0010EJ\u0018\u0010F\u001a\u00020C2\u0006\u0010\t\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\bG\u0010EJ\u0018\u0010H\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\rH\u0087\n¢\u0006\u0004\bI\u0010\u000fJ\u0018\u0010H\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\bJ\u0010\u000bJ\u0018\u0010H\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0011H\u0087\n¢\u0006\u0004\bK\u0010\u001dJ\u0018\u0010H\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0014H\u0087\n¢\u0006\u0004\bL\u0010\u0016J\u001b\u0010M\u001a\u00020\u00002\u0006\u0010N\u001a\u00020\u0003H\u0087\fø\u0001\u0000¢\u0006\u0004\bO\u0010\u000bJ\u001b\u0010P\u001a\u00020\u00002\u0006\u0010N\u001a\u00020\u0003H\u0087\fø\u0001\u0000¢\u0006\u0004\bQ\u0010\u000bJ\u0018\u0010R\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\rH\u0087\n¢\u0006\u0004\bS\u0010\u000fJ\u0018\u0010R\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\bT\u0010\u000bJ\u0018\u0010R\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0011H\u0087\n¢\u0006\u0004\bU\u0010\u001dJ\u0018\u0010R\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0014H\u0087\n¢\u0006\u0004\bV\u0010\u0016J\u0010\u0010W\u001a\u00020XH\u0087\b¢\u0006\u0004\bY\u0010ZJ\u0010\u0010[\u001a\u00020\\H\u0087\b¢\u0006\u0004\b]\u0010^J\u0010\u0010_\u001a\u00020`H\u0087\b¢\u0006\u0004\ba\u0010bJ\u0010\u0010c\u001a\u00020\u0003H\u0087\b¢\u0006\u0004\bd\u0010\u0005J\u0010\u0010e\u001a\u00020fH\u0087\b¢\u0006\u0004\bg\u0010hJ\u0010\u0010i\u001a\u00020jH\u0087\b¢\u0006\u0004\bk\u0010lJ\u000f\u0010m\u001a\u00020nH\u0016¢\u0006\u0004\bo\u0010pJ\u0013\u0010q\u001a\u00020\rH\u0087\bø\u0001\u0000¢\u0006\u0004\br\u0010ZJ\u0013\u0010s\u001a\u00020\u0000H\u0087\bø\u0001\u0000¢\u0006\u0004\bt\u0010\u0005J\u0013\u0010u\u001a\u00020\u0011H\u0087\bø\u0001\u0000¢\u0006\u0004\bv\u0010hJ\u0013\u0010w\u001a\u00020\u0014H\u0087\bø\u0001\u0000¢\u0006\u0004\bx\u0010lJ\u0018\u0010y\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\f¢\u0006\u0004\bz\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0000X\u0081\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002\u0092\u0001\u00020\u0003\u0082\u0002\u0004\n\u0002\b!¨\u0006|"}, d2 = {"Lkotlin/UInt;", "", "data", "", "constructor-impl", "(I)I", "getData$annotations", "()V", "and", "other", "and-WZ4Q5Ns", "(II)I", "compareTo", "Lkotlin/UByte;", "compareTo-7apg3OU", "(IB)I", "compareTo-WZ4Q5Ns", "Lkotlin/ULong;", "compareTo-VKZWuLQ", "(IJ)I", "Lkotlin/UShort;", "compareTo-xj2QHRw", "(IS)I", "dec", "dec-pVg5ArA", "div", "div-7apg3OU", "div-WZ4Q5Ns", "div-VKZWuLQ", "(IJ)J", "div-xj2QHRw", "equals", "", "", "equals-impl", "(ILjava/lang/Object;)Z", "floorDiv", "floorDiv-7apg3OU", "floorDiv-WZ4Q5Ns", "floorDiv-VKZWuLQ", "floorDiv-xj2QHRw", "hashCode", "hashCode-impl", "inc", "inc-pVg5ArA", "inv", "inv-pVg5ArA", "minus", "minus-7apg3OU", "minus-WZ4Q5Ns", "minus-VKZWuLQ", "minus-xj2QHRw", "mod", "mod-7apg3OU", "(IB)B", "mod-WZ4Q5Ns", "mod-VKZWuLQ", "mod-xj2QHRw", "(IS)S", "or", "or-WZ4Q5Ns", "plus", "plus-7apg3OU", "plus-WZ4Q5Ns", "plus-VKZWuLQ", "plus-xj2QHRw", "rangeTo", "Lkotlin/ranges/UIntRange;", "rangeTo-WZ4Q5Ns", "(II)Lkotlin/ranges/UIntRange;", "rangeUntil", "rangeUntil-WZ4Q5Ns", "rem", "rem-7apg3OU", "rem-WZ4Q5Ns", "rem-VKZWuLQ", "rem-xj2QHRw", "shl", "bitCount", "shl-pVg5ArA", "shr", "shr-pVg5ArA", "times", "times-7apg3OU", "times-WZ4Q5Ns", "times-VKZWuLQ", "times-xj2QHRw", "toByte", "", "toByte-impl", "(I)B", "toDouble", "", "toDouble-impl", "(I)D", "toFloat", "", "toFloat-impl", "(I)F", "toInt", "toInt-impl", "toLong", "", "toLong-impl", "(I)J", "toShort", "", "toShort-impl", "(I)S", "toString", "", "toString-impl", "(I)Ljava/lang/String;", "toUByte", "toUByte-w2LRezQ", "toUInt", "toUInt-pVg5ArA", "toULong", "toULong-s-VKNKU", "toUShort", "toUShort-Mh2AYeg", "xor", "xor-WZ4Q5Ns", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SinceKotlin(version = "1.5")
@WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
@p3.g
/* renamed from: kotlin.y1, reason: from Kotlin metadata */
/* loaded from: classes5.dex */
public final class UInt implements Comparable<UInt> {

    /* renamed from: p, reason: collision with root package name */
    @d5.d
    public static final a f27235p = new a(null);

    /* renamed from: q, reason: collision with root package name */
    public static final int f27236q = 0;

    /* renamed from: r, reason: collision with root package name */
    public static final int f27237r = -1;

    /* renamed from: s, reason: collision with root package name */
    public static final int f27238s = 4;

    /* renamed from: t, reason: collision with root package name */
    public static final int f27239t = 32;

    /* renamed from: o, reason: collision with root package name */
    private final int f27240o;

    /* compiled from: UInt.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0013\u0010\u0003\u001a\u00020\u0004X\u0086Tø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0005R\u0013\u0010\u0006\u001a\u00020\u0004X\u0086Tø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0005R\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b!¨\u0006\n"}, d2 = {"Lkotlin/UInt$Companion;", "", "()V", "MAX_VALUE", "Lkotlin/UInt;", "I", "MIN_VALUE", "SIZE_BITS", "", "SIZE_BYTES", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.y1$a */
    public static final class a {
        private a() {
        }

        public a(kotlin.jvm.internal.w wVar) {
        }
    }

    @IntrinsicConstEvaluation
    @PublishedApi
    private /* synthetic */ UInt(int i5) {
        this.f27240o = i5;
    }

    @InlineOnly
    private static final long A(int i5, long j5) {
        return t1.a(ULong.r(i5 & 4294967295L), j5);
    }

    @InlineOnly
    private static final int B(int i5, int i6) {
        return p1.a(i5, i6);
    }

    @InlineOnly
    private static final int C(int i5, short s5) {
        return p1.a(i5, s5 & UShort.f23340r);
    }

    @PublishedApi
    public static /* synthetic */ void D() {
    }

    public static int E(int i5) {
        return Integer.hashCode(i5);
    }

    @InlineOnly
    private static final int F(int i5) {
        return i5 + 1;
    }

    @InlineOnly
    private static final int G(int i5) {
        return ~i5;
    }

    @InlineOnly
    private static final int H(int i5, byte b6) {
        return i5 - (b6 & UByte.f27220r);
    }

    @InlineOnly
    private static final long I(int i5, long j5) {
        return ULong.r(i5 & 4294967295L) - j5;
    }

    @InlineOnly
    private static final int J(int i5, int i6) {
        return i5 - i6;
    }

    @InlineOnly
    private static final int K(int i5, short s5) {
        return i5 - (s5 & UShort.f23340r);
    }

    @InlineOnly
    private static final byte L(int i5, byte b6) {
        return UByte.r((byte) o1.a(i5, b6 & UByte.f27220r));
    }

    @InlineOnly
    private static final long M(int i5, long j5) {
        return r1.a(ULong.r(i5 & 4294967295L), j5);
    }

    @InlineOnly
    private static final int N(int i5, int i6) {
        return o1.a(i5, i6);
    }

    @InlineOnly
    private static final short O(int i5, short s5) {
        return UShort.r((short) o1.a(i5, s5 & UShort.f23340r));
    }

    @InlineOnly
    private static final int P(int i5, int i6) {
        return i5 | i6;
    }

    @InlineOnly
    private static final int Q(int i5, byte b6) {
        return i5 + (b6 & UByte.f27220r);
    }

    @InlineOnly
    private static final long R(int i5, long j5) {
        return ULong.r(i5 & 4294967295L) + j5;
    }

    @InlineOnly
    private static final int S(int i5, int i6) {
        return i5 + i6;
    }

    @InlineOnly
    private static final int T(int i5, short s5) {
        return i5 + (s5 & UShort.f23340r);
    }

    @InlineOnly
    private static final UIntRange U(int i5, int i6) {
        return new UIntRange(i5, i6, null);
    }

    @SinceKotlin(version = "1.9")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final UIntRange V(int i5, int i6) {
        UIntRange V;
        V = kotlin.ranges.c0.V(i5, i6);
        return V;
    }

    @InlineOnly
    private static final int W(int i5, byte b6) {
        return o1.a(i5, b6 & UByte.f27220r);
    }

    @InlineOnly
    private static final long X(int i5, long j5) {
        return r1.a(ULong.r(i5 & 4294967295L), j5);
    }

    @InlineOnly
    private static final int Y(int i5, int i6) {
        return p2.e(i5, i6);
    }

    @InlineOnly
    private static final int Z(int i5, short s5) {
        return o1.a(i5, s5 & UShort.f23340r);
    }

    @InlineOnly
    private static final int a0(int i5, int i6) {
        return i5 << i6;
    }

    @InlineOnly
    private static final int b0(int i5, int i6) {
        return i5 >>> i6;
    }

    @InlineOnly
    private static final int c0(int i5, byte b6) {
        return i5 * (b6 & UByte.f27220r);
    }

    @InlineOnly
    private static final long d0(int i5, long j5) {
        return ULong.r(i5 & 4294967295L) * j5;
    }

    @InlineOnly
    private static final int e0(int i5, int i6) {
        return i5 * i6;
    }

    @InlineOnly
    private static final int f0(int i5, short s5) {
        return i5 * (s5 & UShort.f23340r);
    }

    @InlineOnly
    private static final int g(int i5, int i6) {
        return i5 & i6;
    }

    @InlineOnly
    private static final byte g0(int i5) {
        return (byte) i5;
    }

    public static final /* synthetic */ UInt h(int i5) {
        return new UInt(i5);
    }

    @InlineOnly
    private static final double h0(int i5) {
        return p2.f(i5);
    }

    @InlineOnly
    private static final float i0(int i5) {
        return (float) p2.f(i5);
    }

    @InlineOnly
    private static final int j(int i5, byte b6) {
        int compare;
        compare = Integer.compare(i5 ^ Integer.MIN_VALUE, (b6 & UByte.f27220r) ^ Integer.MIN_VALUE);
        return compare;
    }

    @InlineOnly
    private static final int j0(int i5) {
        return i5;
    }

    @InlineOnly
    private static final long k0(int i5) {
        return i5 & 4294967295L;
    }

    @InlineOnly
    private static final int l(int i5, long j5) {
        int compare;
        compare = Long.compare(ULong.r(i5 & 4294967295L) ^ Long.MIN_VALUE, j5 ^ Long.MIN_VALUE);
        return compare;
    }

    @InlineOnly
    private static final short l0(int i5) {
        return (short) i5;
    }

    @d5.d
    public static String m0(int i5) {
        return String.valueOf(i5 & 4294967295L);
    }

    @InlineOnly
    private static final byte n0(int i5) {
        return UByte.r((byte) i5);
    }

    @InlineOnly
    private int o(int i5) {
        return p2.c(this.f27240o, i5);
    }

    @InlineOnly
    private static final int o0(int i5) {
        return i5;
    }

    @InlineOnly
    private static int p(int i5, int i6) {
        return p2.c(i5, i6);
    }

    @InlineOnly
    private static final long p0(int i5) {
        return ULong.r(i5 & 4294967295L);
    }

    @InlineOnly
    private static final int q(int i5, short s5) {
        int compare;
        compare = Integer.compare(i5 ^ Integer.MIN_VALUE, (s5 & UShort.f23340r) ^ Integer.MIN_VALUE);
        return compare;
    }

    @InlineOnly
    private static final short q0(int i5) {
        return UShort.r((short) i5);
    }

    @IntrinsicConstEvaluation
    @PublishedApi
    public static int r(int i5) {
        return i5;
    }

    @InlineOnly
    private static final int s(int i5) {
        return i5 - 1;
    }

    @InlineOnly
    private static final int s0(int i5, int i6) {
        return i5 ^ i6;
    }

    @InlineOnly
    private static final int t(int i5, byte b6) {
        return p1.a(i5, b6 & UByte.f27220r);
    }

    @InlineOnly
    private static final long u(int i5, long j5) {
        return t1.a(ULong.r(i5 & 4294967295L), j5);
    }

    @InlineOnly
    private static final int v(int i5, int i6) {
        return p2.d(i5, i6);
    }

    @InlineOnly
    private static final int w(int i5, short s5) {
        return p1.a(i5, s5 & UShort.f23340r);
    }

    public static boolean x(int i5, Object obj) {
        return (obj instanceof UInt) && i5 == ((UInt) obj).f27240o;
    }

    public static final boolean y(int i5, int i6) {
        return i5 == i6;
    }

    @InlineOnly
    private static final int z(int i5, byte b6) {
        return p1.a(i5, b6 & UByte.f27220r);
    }

    @Override // java.lang.Comparable
    public /* synthetic */ int compareTo(UInt uInt) {
        return p2.c(this.f27240o, uInt.f27240o);
    }

    public boolean equals(Object obj) {
        return x(this.f27240o, obj);
    }

    public int hashCode() {
        return Integer.hashCode(this.f27240o);
    }

    /* renamed from: r0, reason: from getter */
    public final /* synthetic */ int getF27240o() {
        return this.f27240o;
    }

    @d5.d
    public String toString() {
        return m0(this.f27240o);
    }
}
