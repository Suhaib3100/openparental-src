package kotlin;

import kotlin.internal.InlineOnly;
import kotlin.internal.IntrinsicConstEvaluation;
import kotlin.ranges.UIntRange;

/* compiled from: UByte.kt */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\u0005\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\n\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0087@\u0018\u0000 v2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001vB\u0011\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\f¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0000H\u0097\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0010H\u0087\n¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0013H\u0087\n¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0016H\u0087\n¢\u0006\u0004\b\u0017\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u0000H\u0087\nø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u0005J\u0018\u0010\u001b\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b\u001c\u0010\u000fJ\u0018\u0010\u001b\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0010H\u0087\n¢\u0006\u0004\b\u001d\u0010\u0012J\u0018\u0010\u001b\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\u0013H\u0087\n¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010\u001b\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0016H\u0087\n¢\u0006\u0004\b \u0010\u0018J\u001a\u0010!\u001a\u00020\"2\b\u0010\t\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b$\u0010%J\u0018\u0010&\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\b'\u0010\u000fJ\u0018\u0010&\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0010H\u0087\b¢\u0006\u0004\b(\u0010\u0012J\u0018\u0010&\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\u0013H\u0087\b¢\u0006\u0004\b)\u0010\u001fJ\u0018\u0010&\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0016H\u0087\b¢\u0006\u0004\b*\u0010\u0018J\u0010\u0010+\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b,\u0010-J\u0013\u0010.\u001a\u00020\u0000H\u0087\nø\u0001\u0000¢\u0006\u0004\b/\u0010\u0005J\u0013\u00100\u001a\u00020\u0000H\u0087\bø\u0001\u0000¢\u0006\u0004\b1\u0010\u0005J\u0018\u00102\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b3\u0010\u000fJ\u0018\u00102\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0010H\u0087\n¢\u0006\u0004\b4\u0010\u0012J\u0018\u00102\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\u0013H\u0087\n¢\u0006\u0004\b5\u0010\u001fJ\u0018\u00102\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0016H\u0087\n¢\u0006\u0004\b6\u0010\u0018J\u0018\u00107\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\b8\u0010\u000bJ\u0018\u00107\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0010H\u0087\b¢\u0006\u0004\b9\u0010\u0012J\u0018\u00107\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\u0013H\u0087\b¢\u0006\u0004\b:\u0010\u001fJ\u0018\u00107\u001a\u00020\u00162\u0006\u0010\t\u001a\u00020\u0016H\u0087\b¢\u0006\u0004\b;\u0010<J\u0018\u0010=\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\f¢\u0006\u0004\b>\u0010\u000bJ\u0018\u0010?\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b@\u0010\u000fJ\u0018\u0010?\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0010H\u0087\n¢\u0006\u0004\bA\u0010\u0012J\u0018\u0010?\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\u0013H\u0087\n¢\u0006\u0004\bB\u0010\u001fJ\u0018\u0010?\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0016H\u0087\n¢\u0006\u0004\bC\u0010\u0018J\u0018\u0010D\u001a\u00020E2\u0006\u0010\t\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\bF\u0010GJ\u0018\u0010H\u001a\u00020E2\u0006\u0010\t\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\bI\u0010GJ\u0018\u0010J\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\bK\u0010\u000fJ\u0018\u0010J\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0010H\u0087\n¢\u0006\u0004\bL\u0010\u0012J\u0018\u0010J\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\u0013H\u0087\n¢\u0006\u0004\bM\u0010\u001fJ\u0018\u0010J\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0016H\u0087\n¢\u0006\u0004\bN\u0010\u0018J\u0018\u0010O\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\bP\u0010\u000fJ\u0018\u0010O\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0010H\u0087\n¢\u0006\u0004\bQ\u0010\u0012J\u0018\u0010O\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\u0013H\u0087\n¢\u0006\u0004\bR\u0010\u001fJ\u0018\u0010O\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0016H\u0087\n¢\u0006\u0004\bS\u0010\u0018J\u0010\u0010T\u001a\u00020\u0003H\u0087\b¢\u0006\u0004\bU\u0010\u0005J\u0010\u0010V\u001a\u00020WH\u0087\b¢\u0006\u0004\bX\u0010YJ\u0010\u0010Z\u001a\u00020[H\u0087\b¢\u0006\u0004\b\\\u0010]J\u0010\u0010^\u001a\u00020\rH\u0087\b¢\u0006\u0004\b_\u0010-J\u0010\u0010`\u001a\u00020aH\u0087\b¢\u0006\u0004\bb\u0010cJ\u0010\u0010d\u001a\u00020eH\u0087\b¢\u0006\u0004\bf\u0010gJ\u000f\u0010h\u001a\u00020iH\u0016¢\u0006\u0004\bj\u0010kJ\u0013\u0010l\u001a\u00020\u0000H\u0087\bø\u0001\u0000¢\u0006\u0004\bm\u0010\u0005J\u0013\u0010n\u001a\u00020\u0010H\u0087\bø\u0001\u0000¢\u0006\u0004\bo\u0010-J\u0013\u0010p\u001a\u00020\u0013H\u0087\bø\u0001\u0000¢\u0006\u0004\bq\u0010cJ\u0013\u0010r\u001a\u00020\u0016H\u0087\bø\u0001\u0000¢\u0006\u0004\bs\u0010gJ\u0018\u0010t\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\f¢\u0006\u0004\bu\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0000X\u0081\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002\u0092\u0001\u00020\u0003\u0082\u0002\u0004\n\u0002\b!¨\u0006w"}, d2 = {"Lkotlin/UByte;", "", "data", "", "constructor-impl", "(B)B", "getData$annotations", "()V", "and", "other", "and-7apg3OU", "(BB)B", "compareTo", "", "compareTo-7apg3OU", "(BB)I", "Lkotlin/UInt;", "compareTo-WZ4Q5Ns", "(BI)I", "Lkotlin/ULong;", "compareTo-VKZWuLQ", "(BJ)I", "Lkotlin/UShort;", "compareTo-xj2QHRw", "(BS)I", "dec", "dec-w2LRezQ", "div", "div-7apg3OU", "div-WZ4Q5Ns", "div-VKZWuLQ", "(BJ)J", "div-xj2QHRw", "equals", "", "", "equals-impl", "(BLjava/lang/Object;)Z", "floorDiv", "floorDiv-7apg3OU", "floorDiv-WZ4Q5Ns", "floorDiv-VKZWuLQ", "floorDiv-xj2QHRw", "hashCode", "hashCode-impl", "(B)I", "inc", "inc-w2LRezQ", "inv", "inv-w2LRezQ", "minus", "minus-7apg3OU", "minus-WZ4Q5Ns", "minus-VKZWuLQ", "minus-xj2QHRw", "mod", "mod-7apg3OU", "mod-WZ4Q5Ns", "mod-VKZWuLQ", "mod-xj2QHRw", "(BS)S", "or", "or-7apg3OU", "plus", "plus-7apg3OU", "plus-WZ4Q5Ns", "plus-VKZWuLQ", "plus-xj2QHRw", "rangeTo", "Lkotlin/ranges/UIntRange;", "rangeTo-7apg3OU", "(BB)Lkotlin/ranges/UIntRange;", "rangeUntil", "rangeUntil-7apg3OU", "rem", "rem-7apg3OU", "rem-WZ4Q5Ns", "rem-VKZWuLQ", "rem-xj2QHRw", "times", "times-7apg3OU", "times-WZ4Q5Ns", "times-VKZWuLQ", "times-xj2QHRw", "toByte", "toByte-impl", "toDouble", "", "toDouble-impl", "(B)D", "toFloat", "", "toFloat-impl", "(B)F", "toInt", "toInt-impl", "toLong", "", "toLong-impl", "(B)J", "toShort", "", "toShort-impl", "(B)S", "toString", "", "toString-impl", "(B)Ljava/lang/String;", "toUByte", "toUByte-w2LRezQ", "toUInt", "toUInt-pVg5ArA", "toULong", "toULong-s-VKNKU", "toUShort", "toUShort-Mh2AYeg", "xor", "xor-7apg3OU", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SinceKotlin(version = "1.5")
@WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
@p3.g
/* renamed from: kotlin.u1, reason: from Kotlin metadata */
/* loaded from: classes5.dex */
public final class UByte implements Comparable<UByte> {

    /* renamed from: p, reason: collision with root package name */
    @d5.d
    public static final a f27218p = new a(null);

    /* renamed from: q, reason: collision with root package name */
    public static final byte f27219q = 0;

    /* renamed from: r, reason: collision with root package name */
    public static final byte f27220r = -1;

    /* renamed from: s, reason: collision with root package name */
    public static final int f27221s = 1;

    /* renamed from: t, reason: collision with root package name */
    public static final int f27222t = 8;

    /* renamed from: o, reason: collision with root package name */
    private final byte f27223o;

    /* compiled from: UByte.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0013\u0010\u0003\u001a\u00020\u0004X\u0086Tø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0005R\u0013\u0010\u0006\u001a\u00020\u0004X\u0086Tø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0005R\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b!¨\u0006\n"}, d2 = {"Lkotlin/UByte$Companion;", "", "()V", "MAX_VALUE", "Lkotlin/UByte;", "B", "MIN_VALUE", "SIZE_BITS", "", "SIZE_BYTES", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.u1$a */
    public static final class a {
        private a() {
        }

        public a(kotlin.jvm.internal.w wVar) {
        }
    }

    @IntrinsicConstEvaluation
    @PublishedApi
    private /* synthetic */ UByte(byte b6) {
        this.f27223o = b6;
    }

    @InlineOnly
    private static final long A(byte b6, long j5) {
        return t1.a(ULong.r(b6 & 255), j5);
    }

    @InlineOnly
    private static final int B(byte b6, int i5) {
        return p1.a(UInt.r(b6 & f27220r), i5);
    }

    @InlineOnly
    private static final int C(byte b6, short s5) {
        return p1.a(UInt.r(b6 & f27220r), s5 & UShort.f23340r);
    }

    @PublishedApi
    public static /* synthetic */ void D() {
    }

    public static int E(byte b6) {
        return Byte.hashCode(b6);
    }

    @InlineOnly
    private static final byte F(byte b6) {
        return (byte) (b6 + 1);
    }

    @InlineOnly
    private static final byte G(byte b6) {
        return (byte) (~b6);
    }

    @InlineOnly
    private static final int H(byte b6, byte b7) {
        return UInt.r(b6 & f27220r) - (b7 & f27220r);
    }

    @InlineOnly
    private static final long I(byte b6, long j5) {
        return ULong.r(b6 & 255) - j5;
    }

    @InlineOnly
    private static final int J(byte b6, int i5) {
        return UInt.r(b6 & f27220r) - i5;
    }

    @InlineOnly
    private static final int K(byte b6, short s5) {
        return UInt.r(b6 & f27220r) - (s5 & UShort.f23340r);
    }

    @InlineOnly
    private static final byte L(byte b6, byte b7) {
        return (byte) o1.a(UInt.r(b6 & f27220r), b7 & f27220r);
    }

    @InlineOnly
    private static final long M(byte b6, long j5) {
        return r1.a(ULong.r(b6 & 255), j5);
    }

    @InlineOnly
    private static final int N(byte b6, int i5) {
        return o1.a(UInt.r(b6 & f27220r), i5);
    }

    @InlineOnly
    private static final short O(byte b6, short s5) {
        return UShort.r((short) o1.a(UInt.r(b6 & f27220r), s5 & UShort.f23340r));
    }

    @InlineOnly
    private static final byte P(byte b6, byte b7) {
        return (byte) (b6 | b7);
    }

    @InlineOnly
    private static final int Q(byte b6, byte b7) {
        return UInt.r(b6 & f27220r) + (b7 & f27220r);
    }

    @InlineOnly
    private static final long R(byte b6, long j5) {
        return ULong.r(b6 & 255) + j5;
    }

    @InlineOnly
    private static final int S(byte b6, int i5) {
        return UInt.r(b6 & f27220r) + i5;
    }

    @InlineOnly
    private static final int T(byte b6, short s5) {
        return UInt.r(b6 & f27220r) + (s5 & UShort.f23340r);
    }

    @InlineOnly
    private static final UIntRange U(byte b6, byte b7) {
        return new UIntRange(UInt.r(b6 & f27220r), b7 & f27220r, null);
    }

    @SinceKotlin(version = "1.9")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final UIntRange V(byte b6, byte b7) {
        UIntRange V;
        V = kotlin.ranges.c0.V(UInt.r(b6 & f27220r), b7 & f27220r);
        return V;
    }

    @InlineOnly
    private static final int W(byte b6, byte b7) {
        return o1.a(UInt.r(b6 & f27220r), b7 & f27220r);
    }

    @InlineOnly
    private static final long X(byte b6, long j5) {
        return r1.a(ULong.r(b6 & 255), j5);
    }

    @InlineOnly
    private static final int Y(byte b6, int i5) {
        return o1.a(UInt.r(b6 & f27220r), i5);
    }

    @InlineOnly
    private static final int Z(byte b6, short s5) {
        return o1.a(UInt.r(b6 & f27220r), s5 & UShort.f23340r);
    }

    @InlineOnly
    private static final int a0(byte b6, byte b7) {
        return UInt.r(b6 & f27220r) * (b7 & f27220r);
    }

    @InlineOnly
    private static final long b0(byte b6, long j5) {
        return ULong.r(b6 & 255) * j5;
    }

    @InlineOnly
    private static final int c0(byte b6, int i5) {
        return UInt.r(b6 & f27220r) * i5;
    }

    @InlineOnly
    private static final int d0(byte b6, short s5) {
        return UInt.r(b6 & f27220r) * (s5 & UShort.f23340r);
    }

    @InlineOnly
    private static final byte e0(byte b6) {
        return b6;
    }

    @InlineOnly
    private static final double f0(byte b6) {
        return b6 & f27220r;
    }

    @InlineOnly
    private static final byte g(byte b6, byte b7) {
        return (byte) (b6 & b7);
    }

    @InlineOnly
    private static final float g0(byte b6) {
        return b6 & f27220r;
    }

    public static final /* synthetic */ UByte h(byte b6) {
        return new UByte(b6);
    }

    @InlineOnly
    private static final int h0(byte b6) {
        return b6 & f27220r;
    }

    @InlineOnly
    private static final long i0(byte b6) {
        return b6 & 255;
    }

    @InlineOnly
    private int j(byte b6) {
        return kotlin.jvm.internal.l0.t(this.f27223o & f27220r, b6 & f27220r);
    }

    @InlineOnly
    private static final short j0(byte b6) {
        return (short) (b6 & 255);
    }

    @d5.d
    public static String k0(byte b6) {
        return String.valueOf(b6 & f27220r);
    }

    @InlineOnly
    private static int l(byte b6, byte b7) {
        return kotlin.jvm.internal.l0.t(b6 & f27220r, b7 & f27220r);
    }

    @InlineOnly
    private static final byte l0(byte b6) {
        return b6;
    }

    @InlineOnly
    private static final int m0(byte b6) {
        return UInt.r(b6 & f27220r);
    }

    @InlineOnly
    private static final long n0(byte b6) {
        return ULong.r(b6 & 255);
    }

    @InlineOnly
    private static final int o(byte b6, long j5) {
        int compare;
        compare = Long.compare(ULong.r(b6 & 255) ^ Long.MIN_VALUE, j5 ^ Long.MIN_VALUE);
        return compare;
    }

    @InlineOnly
    private static final short o0(byte b6) {
        return UShort.r((short) (b6 & 255));
    }

    @InlineOnly
    private static final int p(byte b6, int i5) {
        int compare;
        compare = Integer.compare(UInt.r(b6 & f27220r) ^ Integer.MIN_VALUE, i5 ^ Integer.MIN_VALUE);
        return compare;
    }

    @InlineOnly
    private static final int q(byte b6, short s5) {
        return kotlin.jvm.internal.l0.t(b6 & f27220r, s5 & UShort.f23340r);
    }

    @InlineOnly
    private static final byte q0(byte b6, byte b7) {
        return (byte) (b6 ^ b7);
    }

    @IntrinsicConstEvaluation
    @PublishedApi
    public static byte r(byte b6) {
        return b6;
    }

    @InlineOnly
    private static final byte s(byte b6) {
        return (byte) (b6 - 1);
    }

    @InlineOnly
    private static final int t(byte b6, byte b7) {
        return p1.a(UInt.r(b6 & f27220r), b7 & f27220r);
    }

    @InlineOnly
    private static final long u(byte b6, long j5) {
        return t1.a(ULong.r(b6 & 255), j5);
    }

    @InlineOnly
    private static final int v(byte b6, int i5) {
        return p1.a(UInt.r(b6 & f27220r), i5);
    }

    @InlineOnly
    private static final int w(byte b6, short s5) {
        return p1.a(UInt.r(b6 & f27220r), s5 & UShort.f23340r);
    }

    public static boolean x(byte b6, Object obj) {
        return (obj instanceof UByte) && b6 == ((UByte) obj).f27223o;
    }

    public static final boolean y(byte b6, byte b7) {
        return b6 == b7;
    }

    @InlineOnly
    private static final int z(byte b6, byte b7) {
        return p1.a(UInt.r(b6 & f27220r), b7 & f27220r);
    }

    @Override // java.lang.Comparable
    public /* synthetic */ int compareTo(UByte uByte) {
        return kotlin.jvm.internal.l0.t(this.f27223o & f27220r, uByte.f27223o & f27220r);
    }

    public boolean equals(Object obj) {
        return x(this.f27223o, obj);
    }

    public int hashCode() {
        return Byte.hashCode(this.f27223o);
    }

    /* renamed from: p0, reason: from getter */
    public final /* synthetic */ byte getF27223o() {
        return this.f27223o;
    }

    @d5.d
    public String toString() {
        return k0(this.f27223o);
    }
}
