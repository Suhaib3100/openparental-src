package androidx.collection;

import kotlin.Metadata;

/* compiled from: ScatterMap.kt */
@Metadata(d1 = {"\u0000n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u0016\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0001\n\u0002\b\t\u001a%\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a%\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001aQ\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012*\u0010\n\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t0\b\"\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t¢\u0006\u0004\b\u000b\u0010\f\u001a\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0080\b¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0018\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000fH\u0080\b¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0018\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000fH\u0080\b¢\u0006\u0004\b\u0015\u0010\u0014\u001a\u0017\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0017\u0010\u0014\u001a\u0017\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0019\u0010\u0014\u001a\u0017\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u001a\u0010\u0014\u001a\u0017\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u001b\u0010\u0014\u001a \u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u000fH\u0081\b¢\u0006\u0004\b \u0010!\u001a(\u0010$\u001a\u00020#2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020\u001fH\u0080\b¢\u0006\u0004\b$\u0010%\u001a \u0010)\u001a\u00020(2\u0006\u0010&\u001a\u00020\u001c2\u0006\u0010'\u001a\u00020\u000fH\u0080\b¢\u0006\u0004\b)\u0010*\u001a \u0010\u000e\u001a\u00020(2\u0006\u0010&\u001a\u00020\u001c2\u0006\u0010'\u001a\u00020\u000fH\u0080\b¢\u0006\u0004\b\u000e\u0010*\u001a \u0010\u0018\u001a\u00020(2\u0006\u0010&\u001a\u00020\u001c2\u0006\u0010'\u001a\u00020\u000fH\u0080\b¢\u0006\u0004\b\u0018\u0010*\u001a\u0018\u0010+\u001a\u00020(2\u0006\u0010\"\u001a\u00020\u001fH\u0081\b¢\u0006\u0004\b+\u0010,\u001a\u0018\u0010.\u001a\u00020\u000f*\u00060\u001fj\u0002`-H\u0081\b¢\u0006\u0004\b.\u0010/\u001a\u0018\u00101\u001a\u00020\u000f*\u00060\u001fj\u0002`0H\u0080\b¢\u0006\u0004\b1\u0010/\u001a\u0018\u00102\u001a\u00020\u001f*\u00060\u001fj\u0002`0H\u0080\b¢\u0006\u0004\b2\u00103\u001a\u0018\u00104\u001a\u00020(*\u00060\u001fj\u0002`0H\u0080\b¢\u0006\u0004\b4\u0010,\u001a$\u00106\u001a\u00060\u001fj\u0002`52\u0006\u0010&\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u000fH\u0080\b¢\u0006\u0004\b6\u0010!\u001a$\u00107\u001a\u00060\u001fj\u0002`0*\u00060\u001fj\u0002`52\u0006\u0010+\u001a\u00020\u000fH\u0081\b¢\u0006\u0004\b7\u00108\u001a\u001c\u00109\u001a\u00060\u001fj\u0002`0*\u00060\u001fj\u0002`5H\u0080\b¢\u0006\u0004\b9\u00103\u001a\u001c\u0010:\u001a\u00060\u001fj\u0002`0*\u00060\u001fj\u0002`5H\u0081\b¢\u0006\u0004\b:\u00103\"\u0014\u0010<\u001a\u00020\u001f8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0003\u0010;\"\u0014\u0010=\u001a\u00020\u001f8\u0000X\u0080T¢\u0006\u0006\n\u0004\b1\u0010;\"\u0014\u0010?\u001a\u00020\u001f8\u0000X\u0080T¢\u0006\u0006\n\u0004\b>\u0010;\"\u001a\u0010C\u001a\u00020\u001f8\u0000X\u0081T¢\u0006\f\n\u0004\b@\u0010;\u0012\u0004\bA\u0010B\"\u0014\u0010E\u001a\u00020\u001c8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\bA\u0010D\"\u0014\u0010G\u001a\u00020\u000f8\u0000X\u0080T¢\u0006\u0006\n\u0004\b6\u0010F\"\u0014\u0010H\u001a\u00020\u000f8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0013\u0010F\"\u0014\u0010I\u001a\u00020\u000f8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0015\u0010F\"\"\u0010L\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020J0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010K\"\u0014\u0010M\u001a\u00020\u000f8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0010\u0010F\"\u001a\u0010N\u001a\u00020\u001f8\u0000X\u0081T¢\u0006\f\n\u0004\b\u000e\u0010;\u0012\u0004\b>\u0010B\"\u001a\u0010O\u001a\u00020\u001f8\u0000X\u0081T¢\u0006\f\n\u0004\b)\u0010;\u0012\u0004\b@\u0010B*\f\b\u0000\u0010P\"\u00020\u001f2\u00020\u001f*\f\b\u0000\u0010Q\"\u00020\u001f2\u00020\u001f*\f\b\u0000\u0010R\"\u00020\u001f2\u00020\u001f¨\u0006S"}, d2 = {"K", "V", "Landroidx/collection/w2;", "a", "()Landroidx/collection/w2;", "Landroidx/collection/j2;", "t", "()Landroidx/collection/j2;", "", "Lkotlin/q0;", "pairs", "u", "([Lkotlin/q0;)Landroidx/collection/j2;", "", "k", "", "j", "(Ljava/lang/Object;)I", "hash", "g", "(I)I", "h", "capacity", "w", "n", "x", "o", "z", "", "data", "offset", "", "y", "([JI)J", "value", "Lkotlin/k2;", "A", "([JIJ)V", "metadata", "index", "", "l", "([JI)Z", "m", "(J)Z", "Landroidx/collection/StaticBitmask;", "p", "(J)I", "Landroidx/collection/Bitmask;", "b", "v", "(J)J", "i", "Landroidx/collection/Group;", "f", "s", "(JI)J", "q", "r", "J", "AllEmpty", "Empty", "c", "Deleted", "d", "e", "()V", "Sentinel", "[J", "EmptyGroup", "I", "GroupWidth", "ClonedMetadataCount", "DefaultScatterCapacity", "", "Landroidx/collection/j2;", "EmptyScatterMap", "MurmurHashC1", "BitmaskLsb", "BitmaskMsb", "Bitmask", "Group", "StaticBitmask", "collection"}, k = 2, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nScatterMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,1850:1\n1661#1:1851\n1661#1:1852\n1661#1:1853\n1715#1:1854\n*S KotlinDebug\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1680#1:1851\n1682#1:1852\n1685#1:1853\n1721#1:1854\n*E\n"})
/* loaded from: classes.dex */
public final class x2 {

    /* renamed from: a, reason: collision with root package name */
    public static final long f2457a = -9187201950435737472L;

    /* renamed from: b, reason: collision with root package name */
    public static final long f2458b = 128;

    /* renamed from: c, reason: collision with root package name */
    public static final long f2459c = 254;

    /* renamed from: d, reason: collision with root package name */
    public static final long f2460d = 255;

    /* renamed from: f, reason: collision with root package name */
    public static final int f2462f = 8;

    /* renamed from: g, reason: collision with root package name */
    public static final int f2463g = 7;

    /* renamed from: h, reason: collision with root package name */
    public static final int f2464h = 6;

    /* renamed from: j, reason: collision with root package name */
    public static final int f2466j = -862048943;

    /* renamed from: k, reason: collision with root package name */
    public static final long f2467k = 72340172838076673L;

    /* renamed from: l, reason: collision with root package name */
    public static final long f2468l = -9187201950435737472L;

    /* renamed from: e, reason: collision with root package name */
    @fg.l
    @kd.f
    public static final long[] f2461e = {-9187201950435737345L, -1};

    /* renamed from: i, reason: collision with root package name */
    @fg.l
    private static final j2 f2465i = new j2(0);

    public static final void A(@fg.l long[] data, int i4, long j4) {
        kotlin.jvm.internal.l0.p(data, "data");
        int i5 = i4 >> 3;
        int i6 = (i4 & 7) << 3;
        data[i5] = (j4 << i6) | (data[i5] & (~(255 << i6)));
    }

    @fg.l
    public static final <K, V> w2<K, V> a() {
        j2 j2Var = f2465i;
        kotlin.jvm.internal.l0.n(j2Var, "null cannot be cast to non-null type androidx.collection.ScatterMap<K of androidx.collection.ScatterMapKt.emptyScatterMap, V of androidx.collection.ScatterMapKt.emptyScatterMap>");
        return j2Var;
    }

    public static final int b(long j4) {
        return Long.numberOfTrailingZeros(j4) >> 3;
    }

    @kotlin.w0
    public static /* synthetic */ void c() {
    }

    @kotlin.w0
    public static /* synthetic */ void d() {
    }

    @kotlin.w0
    public static /* synthetic */ void e() {
    }

    public static final long f(@fg.l long[] metadata, int i4) {
        kotlin.jvm.internal.l0.p(metadata, "metadata");
        int i5 = i4 >> 3;
        int i6 = (i4 & 7) << 3;
        return (((-i6) >> 63) & (metadata[i5 + 1] << (64 - i6))) | (metadata[i5] >>> i6);
    }

    public static final int g(int i4) {
        return i4 >>> 7;
    }

    public static final int h(int i4) {
        return i4 & 127;
    }

    public static final boolean i(long j4) {
        return j4 != 0;
    }

    public static final int j(@fg.m Object obj) {
        int hashCode = (obj != null ? obj.hashCode() : 0) * f2466j;
        return hashCode ^ (hashCode << 16);
    }

    public static final boolean k(@fg.l long[] metadata, int i4) {
        kotlin.jvm.internal.l0.p(metadata, "metadata");
        return ((metadata[i4 >> 3] >> ((i4 & 7) << 3)) & 255) == 254;
    }

    public static final boolean l(@fg.l long[] metadata, int i4) {
        kotlin.jvm.internal.l0.p(metadata, "metadata");
        return ((metadata[i4 >> 3] >> ((i4 & 7) << 3)) & 255) == 128;
    }

    @kotlin.w0
    public static final boolean m(long j4) {
        return j4 < 128;
    }

    public static final boolean n(@fg.l long[] metadata, int i4) {
        kotlin.jvm.internal.l0.p(metadata, "metadata");
        return ((metadata[i4 >> 3] >> ((i4 & 7) << 3)) & 255) < 128;
    }

    public static final int o(int i4) {
        if (i4 == 7) {
            return 6;
        }
        return i4 - (i4 / 8);
    }

    @kotlin.w0
    public static final int p(long j4) {
        return Long.numberOfTrailingZeros(j4) >> 3;
    }

    public static final long q(long j4) {
        return j4 & ((~j4) << 6) & (-9187201950435737472L);
    }

    @kotlin.w0
    public static final long r(long j4) {
        return j4 & ((~j4) << 7) & (-9187201950435737472L);
    }

    @kotlin.w0
    public static final long s(long j4, int i4) {
        long j5 = j4 ^ (i4 * f2467k);
        return (~j5) & (j5 - f2467k) & (-9187201950435737472L);
    }

    @fg.l
    public static final <K, V> j2<K, V> t() {
        return new j2<>(0, 1, null);
    }

    @fg.l
    public static final <K, V> j2<K, V> u(@fg.l kotlin.q0<? extends K, ? extends V>... pairs) {
        kotlin.jvm.internal.l0.p(pairs, "pairs");
        j2<K, V> j2Var = new j2<>(pairs.length);
        j2Var.j0(pairs);
        return j2Var;
    }

    public static final long v(long j4) {
        return j4 & (j4 - 1);
    }

    public static final int w(int i4) {
        if (i4 == 0) {
            return 6;
        }
        return (i4 * 2) + 1;
    }

    public static final int x(int i4) {
        if (i4 > 0) {
            return (-1) >>> Integer.numberOfLeadingZeros(i4);
        }
        return 0;
    }

    @kotlin.w0
    public static final long y(@fg.l long[] data, int i4) {
        kotlin.jvm.internal.l0.p(data, "data");
        return (data[i4 >> 3] >> ((i4 & 7) << 3)) & 255;
    }

    public static final int z(int i4) {
        if (i4 == 7) {
            return 8;
        }
        return androidx.appcompat.widget.a.a(i4, 1, 7, i4);
    }
}
