package kotlin;

import kotlin.internal.InlineOnly;
import kotlin.internal.IntrinsicConstEvaluation;
import kotlin.ranges.ULongRange;

/* compiled from: ULong.kt */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\n\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0087@\u0018\u0000 ~2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001~B\u0011\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\f¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u000eH\u0087\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0011H\u0087\n¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0000H\u0097\n¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0016H\u0087\n¢\u0006\u0004\b\u0017\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u0000H\u0087\nø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u0005J\u0018\u0010\u001b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u000eH\u0087\n¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010\u001b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0011H\u0087\n¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010\u001b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b \u0010\u000bJ\u0018\u0010\u001b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0016H\u0087\n¢\u0006\u0004\b!\u0010\"J\u001a\u0010#\u001a\u00020$2\b\u0010\t\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b&\u0010'J\u0018\u0010(\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u000eH\u0087\b¢\u0006\u0004\b)\u0010\u001dJ\u0018\u0010(\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0011H\u0087\b¢\u0006\u0004\b*\u0010\u001fJ\u0018\u0010(\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\b+\u0010\u000bJ\u0018\u0010(\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0016H\u0087\b¢\u0006\u0004\b,\u0010\"J\u0010\u0010-\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b.\u0010/J\u0013\u00100\u001a\u00020\u0000H\u0087\nø\u0001\u0000¢\u0006\u0004\b1\u0010\u0005J\u0013\u00102\u001a\u00020\u0000H\u0087\bø\u0001\u0000¢\u0006\u0004\b3\u0010\u0005J\u0018\u00104\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u000eH\u0087\n¢\u0006\u0004\b5\u0010\u001dJ\u0018\u00104\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0011H\u0087\n¢\u0006\u0004\b6\u0010\u001fJ\u0018\u00104\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b7\u0010\u000bJ\u0018\u00104\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0016H\u0087\n¢\u0006\u0004\b8\u0010\"J\u0018\u00109\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u000eH\u0087\b¢\u0006\u0004\b:\u0010;J\u0018\u00109\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0011H\u0087\b¢\u0006\u0004\b<\u0010\u0013J\u0018\u00109\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\b=\u0010\u000bJ\u0018\u00109\u001a\u00020\u00162\u0006\u0010\t\u001a\u00020\u0016H\u0087\b¢\u0006\u0004\b>\u0010?J\u0018\u0010@\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\f¢\u0006\u0004\bA\u0010\u000bJ\u0018\u0010B\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u000eH\u0087\n¢\u0006\u0004\bC\u0010\u001dJ\u0018\u0010B\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0011H\u0087\n¢\u0006\u0004\bD\u0010\u001fJ\u0018\u0010B\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\bE\u0010\u000bJ\u0018\u0010B\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0016H\u0087\n¢\u0006\u0004\bF\u0010\"J\u0018\u0010G\u001a\u00020H2\u0006\u0010\t\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\bI\u0010JJ\u0018\u0010K\u001a\u00020H2\u0006\u0010\t\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\bL\u0010JJ\u0018\u0010M\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u000eH\u0087\n¢\u0006\u0004\bN\u0010\u001dJ\u0018\u0010M\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0011H\u0087\n¢\u0006\u0004\bO\u0010\u001fJ\u0018\u0010M\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\bP\u0010\u000bJ\u0018\u0010M\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0016H\u0087\n¢\u0006\u0004\bQ\u0010\"J\u001b\u0010R\u001a\u00020\u00002\u0006\u0010S\u001a\u00020\rH\u0087\fø\u0001\u0000¢\u0006\u0004\bT\u0010\u001fJ\u001b\u0010U\u001a\u00020\u00002\u0006\u0010S\u001a\u00020\rH\u0087\fø\u0001\u0000¢\u0006\u0004\bV\u0010\u001fJ\u0018\u0010W\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u000eH\u0087\n¢\u0006\u0004\bX\u0010\u001dJ\u0018\u0010W\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0011H\u0087\n¢\u0006\u0004\bY\u0010\u001fJ\u0018\u0010W\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\bZ\u0010\u000bJ\u0018\u0010W\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0016H\u0087\n¢\u0006\u0004\b[\u0010\"J\u0010\u0010\\\u001a\u00020]H\u0087\b¢\u0006\u0004\b^\u0010_J\u0010\u0010`\u001a\u00020aH\u0087\b¢\u0006\u0004\bb\u0010cJ\u0010\u0010d\u001a\u00020eH\u0087\b¢\u0006\u0004\bf\u0010gJ\u0010\u0010h\u001a\u00020\rH\u0087\b¢\u0006\u0004\bi\u0010/J\u0010\u0010j\u001a\u00020\u0003H\u0087\b¢\u0006\u0004\bk\u0010\u0005J\u0010\u0010l\u001a\u00020mH\u0087\b¢\u0006\u0004\bn\u0010oJ\u000f\u0010p\u001a\u00020qH\u0016¢\u0006\u0004\br\u0010sJ\u0013\u0010t\u001a\u00020\u000eH\u0087\bø\u0001\u0000¢\u0006\u0004\bu\u0010_J\u0013\u0010v\u001a\u00020\u0011H\u0087\bø\u0001\u0000¢\u0006\u0004\bw\u0010/J\u0013\u0010x\u001a\u00020\u0000H\u0087\bø\u0001\u0000¢\u0006\u0004\by\u0010\u0005J\u0013\u0010z\u001a\u00020\u0016H\u0087\bø\u0001\u0000¢\u0006\u0004\b{\u0010oJ\u0018\u0010|\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\f¢\u0006\u0004\b}\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0000X\u0081\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002\u0092\u0001\u00020\u0003\u0082\u0002\u0004\n\u0002\b!¨\u0006\u007f"}, d2 = {"Lkotlin/ULong;", "", "data", "", "constructor-impl", "(J)J", "getData$annotations", "()V", "and", "other", "and-VKZWuLQ", "(JJ)J", "compareTo", "", "Lkotlin/UByte;", "compareTo-7apg3OU", "(JB)I", "Lkotlin/UInt;", "compareTo-WZ4Q5Ns", "(JI)I", "compareTo-VKZWuLQ", "(JJ)I", "Lkotlin/UShort;", "compareTo-xj2QHRw", "(JS)I", "dec", "dec-s-VKNKU", "div", "div-7apg3OU", "(JB)J", "div-WZ4Q5Ns", "(JI)J", "div-VKZWuLQ", "div-xj2QHRw", "(JS)J", "equals", "", "", "equals-impl", "(JLjava/lang/Object;)Z", "floorDiv", "floorDiv-7apg3OU", "floorDiv-WZ4Q5Ns", "floorDiv-VKZWuLQ", "floorDiv-xj2QHRw", "hashCode", "hashCode-impl", "(J)I", "inc", "inc-s-VKNKU", "inv", "inv-s-VKNKU", "minus", "minus-7apg3OU", "minus-WZ4Q5Ns", "minus-VKZWuLQ", "minus-xj2QHRw", "mod", "mod-7apg3OU", "(JB)B", "mod-WZ4Q5Ns", "mod-VKZWuLQ", "mod-xj2QHRw", "(JS)S", "or", "or-VKZWuLQ", "plus", "plus-7apg3OU", "plus-WZ4Q5Ns", "plus-VKZWuLQ", "plus-xj2QHRw", "rangeTo", "Lkotlin/ranges/ULongRange;", "rangeTo-VKZWuLQ", "(JJ)Lkotlin/ranges/ULongRange;", "rangeUntil", "rangeUntil-VKZWuLQ", "rem", "rem-7apg3OU", "rem-WZ4Q5Ns", "rem-VKZWuLQ", "rem-xj2QHRw", "shl", "bitCount", "shl-s-VKNKU", "shr", "shr-s-VKNKU", "times", "times-7apg3OU", "times-WZ4Q5Ns", "times-VKZWuLQ", "times-xj2QHRw", "toByte", "", "toByte-impl", "(J)B", "toDouble", "", "toDouble-impl", "(J)D", "toFloat", "", "toFloat-impl", "(J)F", "toInt", "toInt-impl", "toLong", "toLong-impl", "toShort", "", "toShort-impl", "(J)S", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "toUByte", "toUByte-w2LRezQ", "toUInt", "toUInt-pVg5ArA", "toULong", "toULong-s-VKNKU", "toUShort", "toUShort-Mh2AYeg", "xor", "xor-VKZWuLQ", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SinceKotlin(version = "1.5")
@WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
@p3.g
/* renamed from: kotlin.c2, reason: from Kotlin metadata */
/* loaded from: classes5.dex */
public final class ULong implements Comparable<ULong> {

    /* renamed from: p, reason: collision with root package name */
    @d5.d
    public static final a f23066p = new a(null);

    /* renamed from: q, reason: collision with root package name */
    public static final long f23067q = 0;

    /* renamed from: r, reason: collision with root package name */
    public static final long f23068r = -1;

    /* renamed from: s, reason: collision with root package name */
    public static final int f23069s = 8;

    /* renamed from: t, reason: collision with root package name */
    public static final int f23070t = 64;

    /* renamed from: o, reason: collision with root package name */
    private final long f23071o;

    /* compiled from: ULong.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0013\u0010\u0003\u001a\u00020\u0004X\u0086Tø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0005R\u0013\u0010\u0006\u001a\u00020\u0004X\u0086Tø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0005R\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b!¨\u0006\n"}, d2 = {"Lkotlin/ULong$Companion;", "", "()V", "MAX_VALUE", "Lkotlin/ULong;", "J", "MIN_VALUE", "SIZE_BITS", "", "SIZE_BYTES", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.c2$a */
    public static final class a {
        private a() {
        }

        public a(kotlin.jvm.internal.w wVar) {
        }
    }

    @IntrinsicConstEvaluation
    @PublishedApi
    private /* synthetic */ ULong(long j5) {
        this.f23071o = j5;
    }

    @InlineOnly
    private static final long A(long j5, long j6) {
        return t1.a(j5, j6);
    }

    @InlineOnly
    private static final long B(long j5, int i5) {
        return t1.a(j5, i5 & 4294967295L);
    }

    @InlineOnly
    private static final long C(long j5, short s5) {
        return t1.a(j5, s5 & okhttp3.internal.ws.g.f31429s);
    }

    @PublishedApi
    public static /* synthetic */ void D() {
    }

    public static int E(long j5) {
        return Long.hashCode(j5);
    }

    @InlineOnly
    private static final long F(long j5) {
        return j5 + 1;
    }

    @InlineOnly
    private static final long G(long j5) {
        return ~j5;
    }

    @InlineOnly
    private static final long H(long j5, byte b6) {
        return j5 - (b6 & 255);
    }

    @InlineOnly
    private static final long I(long j5, long j6) {
        return j5 - j6;
    }

    @InlineOnly
    private static final long J(long j5, int i5) {
        return j5 - (i5 & 4294967295L);
    }

    @InlineOnly
    private static final long K(long j5, short s5) {
        return j5 - (s5 & okhttp3.internal.ws.g.f31429s);
    }

    @InlineOnly
    private static final byte L(long j5, byte b6) {
        return UByte.r((byte) r1.a(j5, b6 & 255));
    }

    @InlineOnly
    private static final long M(long j5, long j6) {
        return r1.a(j5, j6);
    }

    @InlineOnly
    private static final int N(long j5, int i5) {
        return UInt.r((int) r1.a(j5, i5 & 4294967295L));
    }

    @InlineOnly
    private static final short O(long j5, short s5) {
        return UShort.r((short) r1.a(j5, s5 & okhttp3.internal.ws.g.f31429s));
    }

    @InlineOnly
    private static final long P(long j5, long j6) {
        return j5 | j6;
    }

    @InlineOnly
    private static final long Q(long j5, byte b6) {
        return j5 + (b6 & 255);
    }

    @InlineOnly
    private static final long R(long j5, long j6) {
        return j5 + j6;
    }

    @InlineOnly
    private static final long S(long j5, int i5) {
        return j5 + (i5 & 4294967295L);
    }

    @InlineOnly
    private static final long T(long j5, short s5) {
        return j5 + (s5 & okhttp3.internal.ws.g.f31429s);
    }

    @InlineOnly
    private static final ULongRange U(long j5, long j6) {
        return new ULongRange(j5, j6, null);
    }

    @SinceKotlin(version = "1.9")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final ULongRange V(long j5, long j6) {
        ULongRange X;
        X = kotlin.ranges.c0.X(j5, j6);
        return X;
    }

    @InlineOnly
    private static final long W(long j5, byte b6) {
        return r1.a(j5, b6 & 255);
    }

    @InlineOnly
    private static final long X(long j5, long j6) {
        return p2.i(j5, j6);
    }

    @InlineOnly
    private static final long Y(long j5, int i5) {
        return r1.a(j5, i5 & 4294967295L);
    }

    @InlineOnly
    private static final long Z(long j5, short s5) {
        return r1.a(j5, s5 & okhttp3.internal.ws.g.f31429s);
    }

    @InlineOnly
    private static final long a0(long j5, int i5) {
        return j5 << i5;
    }

    @InlineOnly
    private static final long b0(long j5, int i5) {
        return j5 >>> i5;
    }

    @InlineOnly
    private static final long c0(long j5, byte b6) {
        return j5 * (b6 & 255);
    }

    @InlineOnly
    private static final long d0(long j5, long j6) {
        return j5 * j6;
    }

    @InlineOnly
    private static final long e0(long j5, int i5) {
        return j5 * (i5 & 4294967295L);
    }

    @InlineOnly
    private static final long f0(long j5, short s5) {
        return j5 * (s5 & okhttp3.internal.ws.g.f31429s);
    }

    @InlineOnly
    private static final long g(long j5, long j6) {
        return j5 & j6;
    }

    @InlineOnly
    private static final byte g0(long j5) {
        return (byte) j5;
    }

    public static final /* synthetic */ ULong h(long j5) {
        return new ULong(j5);
    }

    @InlineOnly
    private static final double h0(long j5) {
        return p2.j(j5);
    }

    @InlineOnly
    private static final float i0(long j5) {
        return (float) p2.j(j5);
    }

    @InlineOnly
    private static final int j(long j5, byte b6) {
        int compare;
        compare = Long.compare(j5 ^ Long.MIN_VALUE, (b6 & 255) ^ Long.MIN_VALUE);
        return compare;
    }

    @InlineOnly
    private static final int j0(long j5) {
        return (int) j5;
    }

    @InlineOnly
    private static final long k0(long j5) {
        return j5;
    }

    @InlineOnly
    private int l(long j5) {
        return p2.g(this.f23071o, j5);
    }

    @InlineOnly
    private static final short l0(long j5) {
        return (short) j5;
    }

    @d5.d
    public static String m0(long j5) {
        return p2.k(j5);
    }

    @InlineOnly
    private static final byte n0(long j5) {
        return UByte.r((byte) j5);
    }

    @InlineOnly
    private static int o(long j5, long j6) {
        return p2.g(j5, j6);
    }

    @InlineOnly
    private static final int o0(long j5) {
        return UInt.r((int) j5);
    }

    @InlineOnly
    private static final int p(long j5, int i5) {
        int compare;
        compare = Long.compare(j5 ^ Long.MIN_VALUE, (i5 & 4294967295L) ^ Long.MIN_VALUE);
        return compare;
    }

    @InlineOnly
    private static final long p0(long j5) {
        return j5;
    }

    @InlineOnly
    private static final int q(long j5, short s5) {
        int compare;
        compare = Long.compare(j5 ^ Long.MIN_VALUE, (s5 & okhttp3.internal.ws.g.f31429s) ^ Long.MIN_VALUE);
        return compare;
    }

    @InlineOnly
    private static final short q0(long j5) {
        return UShort.r((short) j5);
    }

    @IntrinsicConstEvaluation
    @PublishedApi
    public static long r(long j5) {
        return j5;
    }

    @InlineOnly
    private static final long s(long j5) {
        return j5 - 1;
    }

    @InlineOnly
    private static final long s0(long j5, long j6) {
        return j5 ^ j6;
    }

    @InlineOnly
    private static final long t(long j5, byte b6) {
        return t1.a(j5, b6 & 255);
    }

    @InlineOnly
    private static final long u(long j5, long j6) {
        return p2.h(j5, j6);
    }

    @InlineOnly
    private static final long v(long j5, int i5) {
        return t1.a(j5, i5 & 4294967295L);
    }

    @InlineOnly
    private static final long w(long j5, short s5) {
        return t1.a(j5, s5 & okhttp3.internal.ws.g.f31429s);
    }

    public static boolean x(long j5, Object obj) {
        return (obj instanceof ULong) && j5 == ((ULong) obj).f23071o;
    }

    public static final boolean y(long j5, long j6) {
        return j5 == j6;
    }

    @InlineOnly
    private static final long z(long j5, byte b6) {
        return t1.a(j5, b6 & 255);
    }

    @Override // java.lang.Comparable
    public /* synthetic */ int compareTo(ULong uLong) {
        return p2.g(this.f23071o, uLong.f23071o);
    }

    public boolean equals(Object obj) {
        return x(this.f23071o, obj);
    }

    public int hashCode() {
        return Long.hashCode(this.f23071o);
    }

    /* renamed from: r0, reason: from getter */
    public final /* synthetic */ long getF23071o() {
        return this.f23071o;
    }

    @d5.d
    public String toString() {
        return p2.k(this.f23071o);
    }
}
