package kotlin;

import kotlin.internal.InlineOnly;
import kotlin.internal.IntrinsicConstEvaluation;
import kotlin.ranges.UIntRange;

/* compiled from: UShort.kt */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\n\n\u0002\b\t\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0087@\u0018\u0000 v2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001vB\u0011\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\f¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u000eH\u0087\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0011H\u0087\n¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0014H\u0087\n¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0000H\u0097\n¢\u0006\u0004\b\u0017\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u0000H\u0087\nø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u0005J\u0018\u0010\u001b\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u000eH\u0087\n¢\u0006\u0004\b\u001c\u0010\u0010J\u0018\u0010\u001b\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0011H\u0087\n¢\u0006\u0004\b\u001d\u0010\u0013J\u0018\u0010\u001b\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\u0014H\u0087\n¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010\u001b\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b \u0010\u0018J\u001a\u0010!\u001a\u00020\"2\b\u0010\t\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b$\u0010%J\u0018\u0010&\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u000eH\u0087\b¢\u0006\u0004\b'\u0010\u0010J\u0018\u0010&\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0011H\u0087\b¢\u0006\u0004\b(\u0010\u0013J\u0018\u0010&\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\u0014H\u0087\b¢\u0006\u0004\b)\u0010\u001fJ\u0018\u0010&\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\b*\u0010\u0018J\u0010\u0010+\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b,\u0010-J\u0013\u0010.\u001a\u00020\u0000H\u0087\nø\u0001\u0000¢\u0006\u0004\b/\u0010\u0005J\u0013\u00100\u001a\u00020\u0000H\u0087\bø\u0001\u0000¢\u0006\u0004\b1\u0010\u0005J\u0018\u00102\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u000eH\u0087\n¢\u0006\u0004\b3\u0010\u0010J\u0018\u00102\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0011H\u0087\n¢\u0006\u0004\b4\u0010\u0013J\u0018\u00102\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\u0014H\u0087\n¢\u0006\u0004\b5\u0010\u001fJ\u0018\u00102\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b6\u0010\u0018J\u0018\u00107\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u000eH\u0087\b¢\u0006\u0004\b8\u00109J\u0018\u00107\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0011H\u0087\b¢\u0006\u0004\b:\u0010\u0013J\u0018\u00107\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\u0014H\u0087\b¢\u0006\u0004\b;\u0010\u001fJ\u0018\u00107\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\b<\u0010\u000bJ\u0018\u0010=\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\f¢\u0006\u0004\b>\u0010\u000bJ\u0018\u0010?\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u000eH\u0087\n¢\u0006\u0004\b@\u0010\u0010J\u0018\u0010?\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0011H\u0087\n¢\u0006\u0004\bA\u0010\u0013J\u0018\u0010?\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\u0014H\u0087\n¢\u0006\u0004\bB\u0010\u001fJ\u0018\u0010?\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\bC\u0010\u0018J\u0018\u0010D\u001a\u00020E2\u0006\u0010\t\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\bF\u0010GJ\u0018\u0010H\u001a\u00020E2\u0006\u0010\t\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\bI\u0010GJ\u0018\u0010J\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u000eH\u0087\n¢\u0006\u0004\bK\u0010\u0010J\u0018\u0010J\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0011H\u0087\n¢\u0006\u0004\bL\u0010\u0013J\u0018\u0010J\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\u0014H\u0087\n¢\u0006\u0004\bM\u0010\u001fJ\u0018\u0010J\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\bN\u0010\u0018J\u0018\u0010O\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u000eH\u0087\n¢\u0006\u0004\bP\u0010\u0010J\u0018\u0010O\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0011H\u0087\n¢\u0006\u0004\bQ\u0010\u0013J\u0018\u0010O\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\u0014H\u0087\n¢\u0006\u0004\bR\u0010\u001fJ\u0018\u0010O\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\bS\u0010\u0018J\u0010\u0010T\u001a\u00020UH\u0087\b¢\u0006\u0004\bV\u0010WJ\u0010\u0010X\u001a\u00020YH\u0087\b¢\u0006\u0004\bZ\u0010[J\u0010\u0010\\\u001a\u00020]H\u0087\b¢\u0006\u0004\b^\u0010_J\u0010\u0010`\u001a\u00020\rH\u0087\b¢\u0006\u0004\ba\u0010-J\u0010\u0010b\u001a\u00020cH\u0087\b¢\u0006\u0004\bd\u0010eJ\u0010\u0010f\u001a\u00020\u0003H\u0087\b¢\u0006\u0004\bg\u0010\u0005J\u000f\u0010h\u001a\u00020iH\u0016¢\u0006\u0004\bj\u0010kJ\u0013\u0010l\u001a\u00020\u000eH\u0087\bø\u0001\u0000¢\u0006\u0004\bm\u0010WJ\u0013\u0010n\u001a\u00020\u0011H\u0087\bø\u0001\u0000¢\u0006\u0004\bo\u0010-J\u0013\u0010p\u001a\u00020\u0014H\u0087\bø\u0001\u0000¢\u0006\u0004\bq\u0010eJ\u0013\u0010r\u001a\u00020\u0000H\u0087\bø\u0001\u0000¢\u0006\u0004\bs\u0010\u0005J\u0018\u0010t\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\f¢\u0006\u0004\bu\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0000X\u0081\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002\u0092\u0001\u00020\u0003\u0082\u0002\u0004\n\u0002\b!¨\u0006w"}, d2 = {"Lkotlin/UShort;", "", "data", "", "constructor-impl", "(S)S", "getData$annotations", "()V", "and", "other", "and-xj2QHRw", "(SS)S", "compareTo", "", "Lkotlin/UByte;", "compareTo-7apg3OU", "(SB)I", "Lkotlin/UInt;", "compareTo-WZ4Q5Ns", "(SI)I", "Lkotlin/ULong;", "compareTo-VKZWuLQ", "(SJ)I", "compareTo-xj2QHRw", "(SS)I", "dec", "dec-Mh2AYeg", "div", "div-7apg3OU", "div-WZ4Q5Ns", "div-VKZWuLQ", "(SJ)J", "div-xj2QHRw", "equals", "", "", "equals-impl", "(SLjava/lang/Object;)Z", "floorDiv", "floorDiv-7apg3OU", "floorDiv-WZ4Q5Ns", "floorDiv-VKZWuLQ", "floorDiv-xj2QHRw", "hashCode", "hashCode-impl", "(S)I", "inc", "inc-Mh2AYeg", "inv", "inv-Mh2AYeg", "minus", "minus-7apg3OU", "minus-WZ4Q5Ns", "minus-VKZWuLQ", "minus-xj2QHRw", "mod", "mod-7apg3OU", "(SB)B", "mod-WZ4Q5Ns", "mod-VKZWuLQ", "mod-xj2QHRw", "or", "or-xj2QHRw", "plus", "plus-7apg3OU", "plus-WZ4Q5Ns", "plus-VKZWuLQ", "plus-xj2QHRw", "rangeTo", "Lkotlin/ranges/UIntRange;", "rangeTo-xj2QHRw", "(SS)Lkotlin/ranges/UIntRange;", "rangeUntil", "rangeUntil-xj2QHRw", "rem", "rem-7apg3OU", "rem-WZ4Q5Ns", "rem-VKZWuLQ", "rem-xj2QHRw", "times", "times-7apg3OU", "times-WZ4Q5Ns", "times-VKZWuLQ", "times-xj2QHRw", "toByte", "", "toByte-impl", "(S)B", "toDouble", "", "toDouble-impl", "(S)D", "toFloat", "", "toFloat-impl", "(S)F", "toInt", "toInt-impl", "toLong", "", "toLong-impl", "(S)J", "toShort", "toShort-impl", "toString", "", "toString-impl", "(S)Ljava/lang/String;", "toUByte", "toUByte-w2LRezQ", "toUInt", "toUInt-pVg5ArA", "toULong", "toULong-s-VKNKU", "toUShort", "toUShort-Mh2AYeg", "xor", "xor-xj2QHRw", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SinceKotlin(version = "1.5")
@WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
@p3.g
/* renamed from: kotlin.i2, reason: from Kotlin metadata */
/* loaded from: classes5.dex */
public final class UShort implements Comparable<UShort> {

    /* renamed from: p, reason: collision with root package name */
    @d5.d
    public static final a f23338p = new a(null);

    /* renamed from: q, reason: collision with root package name */
    public static final short f23339q = 0;

    /* renamed from: r, reason: collision with root package name */
    public static final short f23340r = -1;

    /* renamed from: s, reason: collision with root package name */
    public static final int f23341s = 2;

    /* renamed from: t, reason: collision with root package name */
    public static final int f23342t = 16;

    /* renamed from: o, reason: collision with root package name */
    private final short f23343o;

    /* compiled from: UShort.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0013\u0010\u0003\u001a\u00020\u0004X\u0086Tø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0005R\u0013\u0010\u0006\u001a\u00020\u0004X\u0086Tø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0005R\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b!¨\u0006\n"}, d2 = {"Lkotlin/UShort$Companion;", "", "()V", "MAX_VALUE", "Lkotlin/UShort;", "S", "MIN_VALUE", "SIZE_BITS", "", "SIZE_BYTES", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.i2$a */
    public static final class a {
        private a() {
        }

        public a(kotlin.jvm.internal.w wVar) {
        }
    }

    @IntrinsicConstEvaluation
    @PublishedApi
    private /* synthetic */ UShort(short s5) {
        this.f23343o = s5;
    }

    @InlineOnly
    private static final long A(short s5, long j5) {
        return t1.a(ULong.r(s5 & okhttp3.internal.ws.g.f31429s), j5);
    }

    @InlineOnly
    private static final int B(short s5, int i5) {
        return p1.a(UInt.r(s5 & f23340r), i5);
    }

    @InlineOnly
    private static final int C(short s5, short s6) {
        return p1.a(UInt.r(s5 & f23340r), s6 & f23340r);
    }

    @PublishedApi
    public static /* synthetic */ void D() {
    }

    public static int E(short s5) {
        return Short.hashCode(s5);
    }

    @InlineOnly
    private static final short F(short s5) {
        return (short) (s5 + 1);
    }

    @InlineOnly
    private static final short G(short s5) {
        return (short) (~s5);
    }

    @InlineOnly
    private static final int H(short s5, byte b6) {
        return UInt.r(s5 & f23340r) - (b6 & UByte.f27220r);
    }

    @InlineOnly
    private static final long I(short s5, long j5) {
        return ULong.r(s5 & okhttp3.internal.ws.g.f31429s) - j5;
    }

    @InlineOnly
    private static final int J(short s5, int i5) {
        return UInt.r(s5 & f23340r) - i5;
    }

    @InlineOnly
    private static final int K(short s5, short s6) {
        return UInt.r(s5 & f23340r) - (s6 & f23340r);
    }

    @InlineOnly
    private static final byte L(short s5, byte b6) {
        return UByte.r((byte) o1.a(UInt.r(s5 & f23340r), b6 & UByte.f27220r));
    }

    @InlineOnly
    private static final long M(short s5, long j5) {
        return r1.a(ULong.r(s5 & okhttp3.internal.ws.g.f31429s), j5);
    }

    @InlineOnly
    private static final int N(short s5, int i5) {
        return o1.a(UInt.r(s5 & f23340r), i5);
    }

    @InlineOnly
    private static final short O(short s5, short s6) {
        return (short) o1.a(UInt.r(s5 & f23340r), s6 & f23340r);
    }

    @InlineOnly
    private static final short P(short s5, short s6) {
        return (short) (s5 | s6);
    }

    @InlineOnly
    private static final int Q(short s5, byte b6) {
        return UInt.r(s5 & f23340r) + (b6 & UByte.f27220r);
    }

    @InlineOnly
    private static final long R(short s5, long j5) {
        return ULong.r(s5 & okhttp3.internal.ws.g.f31429s) + j5;
    }

    @InlineOnly
    private static final int S(short s5, int i5) {
        return UInt.r(s5 & f23340r) + i5;
    }

    @InlineOnly
    private static final int T(short s5, short s6) {
        return UInt.r(s5 & f23340r) + (s6 & f23340r);
    }

    @InlineOnly
    private static final UIntRange U(short s5, short s6) {
        return new UIntRange(UInt.r(s5 & f23340r), s6 & f23340r, null);
    }

    @SinceKotlin(version = "1.9")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final UIntRange V(short s5, short s6) {
        UIntRange V;
        V = kotlin.ranges.c0.V(UInt.r(s5 & f23340r), s6 & f23340r);
        return V;
    }

    @InlineOnly
    private static final int W(short s5, byte b6) {
        return o1.a(UInt.r(s5 & f23340r), b6 & UByte.f27220r);
    }

    @InlineOnly
    private static final long X(short s5, long j5) {
        return r1.a(ULong.r(s5 & okhttp3.internal.ws.g.f31429s), j5);
    }

    @InlineOnly
    private static final int Y(short s5, int i5) {
        return o1.a(UInt.r(s5 & f23340r), i5);
    }

    @InlineOnly
    private static final int Z(short s5, short s6) {
        return o1.a(UInt.r(s5 & f23340r), s6 & f23340r);
    }

    @InlineOnly
    private static final int a0(short s5, byte b6) {
        return UInt.r(s5 & f23340r) * (b6 & UByte.f27220r);
    }

    @InlineOnly
    private static final long b0(short s5, long j5) {
        return ULong.r(s5 & okhttp3.internal.ws.g.f31429s) * j5;
    }

    @InlineOnly
    private static final int c0(short s5, int i5) {
        return UInt.r(s5 & f23340r) * i5;
    }

    @InlineOnly
    private static final int d0(short s5, short s6) {
        return UInt.r(s5 & f23340r) * (s6 & f23340r);
    }

    @InlineOnly
    private static final byte e0(short s5) {
        return (byte) s5;
    }

    @InlineOnly
    private static final double f0(short s5) {
        return s5 & f23340r;
    }

    @InlineOnly
    private static final short g(short s5, short s6) {
        return (short) (s5 & s6);
    }

    @InlineOnly
    private static final float g0(short s5) {
        return s5 & f23340r;
    }

    public static final /* synthetic */ UShort h(short s5) {
        return new UShort(s5);
    }

    @InlineOnly
    private static final int h0(short s5) {
        return s5 & f23340r;
    }

    @InlineOnly
    private static final long i0(short s5) {
        return s5 & okhttp3.internal.ws.g.f31429s;
    }

    @InlineOnly
    private static final int j(short s5, byte b6) {
        return kotlin.jvm.internal.l0.t(s5 & f23340r, b6 & UByte.f27220r);
    }

    @InlineOnly
    private static final short j0(short s5) {
        return s5;
    }

    @d5.d
    public static String k0(short s5) {
        return String.valueOf(s5 & f23340r);
    }

    @InlineOnly
    private static final int l(short s5, long j5) {
        int compare;
        compare = Long.compare(ULong.r(s5 & okhttp3.internal.ws.g.f31429s) ^ Long.MIN_VALUE, j5 ^ Long.MIN_VALUE);
        return compare;
    }

    @InlineOnly
    private static final byte l0(short s5) {
        return UByte.r((byte) s5);
    }

    @InlineOnly
    private static final int m0(short s5) {
        return UInt.r(s5 & f23340r);
    }

    @InlineOnly
    private static final long n0(short s5) {
        return ULong.r(s5 & okhttp3.internal.ws.g.f31429s);
    }

    @InlineOnly
    private static final int o(short s5, int i5) {
        int compare;
        compare = Integer.compare(UInt.r(s5 & f23340r) ^ Integer.MIN_VALUE, i5 ^ Integer.MIN_VALUE);
        return compare;
    }

    @InlineOnly
    private static final short o0(short s5) {
        return s5;
    }

    @InlineOnly
    private int p(short s5) {
        return kotlin.jvm.internal.l0.t(this.f23343o & f23340r, s5 & f23340r);
    }

    @InlineOnly
    private static int q(short s5, short s6) {
        return kotlin.jvm.internal.l0.t(s5 & f23340r, s6 & f23340r);
    }

    @InlineOnly
    private static final short q0(short s5, short s6) {
        return (short) (s5 ^ s6);
    }

    @IntrinsicConstEvaluation
    @PublishedApi
    public static short r(short s5) {
        return s5;
    }

    @InlineOnly
    private static final short s(short s5) {
        return (short) (s5 - 1);
    }

    @InlineOnly
    private static final int t(short s5, byte b6) {
        return p1.a(UInt.r(s5 & f23340r), b6 & UByte.f27220r);
    }

    @InlineOnly
    private static final long u(short s5, long j5) {
        return t1.a(ULong.r(s5 & okhttp3.internal.ws.g.f31429s), j5);
    }

    @InlineOnly
    private static final int v(short s5, int i5) {
        return p1.a(UInt.r(s5 & f23340r), i5);
    }

    @InlineOnly
    private static final int w(short s5, short s6) {
        return p1.a(UInt.r(s5 & f23340r), s6 & f23340r);
    }

    public static boolean x(short s5, Object obj) {
        return (obj instanceof UShort) && s5 == ((UShort) obj).f23343o;
    }

    public static final boolean y(short s5, short s6) {
        return s5 == s6;
    }

    @InlineOnly
    private static final int z(short s5, byte b6) {
        return p1.a(UInt.r(s5 & f23340r), b6 & UByte.f27220r);
    }

    @Override // java.lang.Comparable
    public /* synthetic */ int compareTo(UShort uShort) {
        return kotlin.jvm.internal.l0.t(this.f23343o & f23340r, uShort.f23343o & f23340r);
    }

    public boolean equals(Object obj) {
        return x(this.f23343o, obj);
    }

    public int hashCode() {
        return Short.hashCode(this.f23343o);
    }

    /* renamed from: p0, reason: from getter */
    public final /* synthetic */ short getF23343o() {
        return this.f23343o;
    }

    @d5.d
    public String toString() {
        return k0(this.f23343o);
    }
}
