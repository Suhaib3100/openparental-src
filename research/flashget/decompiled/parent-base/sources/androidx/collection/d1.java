package androidx.collection;

import kotlin.Metadata;

/* compiled from: LongSet.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u0016\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\t\u001a\r\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\r\u0010\u0003\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0002\u001a\u0015\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001d\u0010\t\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\n\u001a%\u0010\f\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\r\u001a\u0019\u0010\u0010\u001a\u00020\u00002\n\u0010\u000f\u001a\u00020\u000e\"\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0011\u001a\r\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0015\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u001d\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u0018\u001a%\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0019\u0010\u001b\u001a\u00020\u00122\n\u0010\u000f\u001a\u00020\u000e\"\u00020\u0004¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0018\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0017\u001a\u00020\u0004H\u0080\b¢\u0006\u0004\b\u001e\u0010\u001f\"\u0014\u0010!\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0001\u0010 \"\u001a\u0010%\u001a\u00020\u000e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\"\u0010$¨\u0006&"}, d2 = {"Landroidx/collection/c1;", "a", "()Landroidx/collection/c1;", "d", "", "element1", "e", "(J)Landroidx/collection/c1;", "element2", "f", "(JJ)Landroidx/collection/c1;", "element3", "g", "(JJJ)Landroidx/collection/c1;", "", "elements", "h", "([J)Landroidx/collection/c1;", "Landroidx/collection/d2;", "i", "()Landroidx/collection/d2;", "j", "(J)Landroidx/collection/d2;", "k", "(JJ)Landroidx/collection/d2;", "l", "(JJJ)Landroidx/collection/d2;", "m", "([J)Landroidx/collection/d2;", "", "c", "(J)I", "Landroidx/collection/d2;", "EmptyLongSet", "b", "[J", "()[J", "EmptyLongArray", "collection"}, k = 2, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nLongSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LongSet.kt\nandroidx/collection/LongSetKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,853:1\n1#2:854\n*E\n"})
/* loaded from: classes.dex */
public final class d1 {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private static final d2 f2200a = new d2(0);

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    private static final long[] f2201b = new long[0];

    @fg.l
    public static final c1 a() {
        return f2200a;
    }

    @fg.l
    public static final long[] b() {
        return f2201b;
    }

    public static final int c(long j4) {
        int hashCode = Long.hashCode(j4) * x2.f2466j;
        return hashCode ^ (hashCode << 16);
    }

    @fg.l
    public static final c1 d() {
        return f2200a;
    }

    @fg.l
    public static final c1 e(long j4) {
        return j(j4);
    }

    @fg.l
    public static final c1 f(long j4, long j5) {
        return k(j4, j5);
    }

    @fg.l
    public static final c1 g(long j4, long j5, long j6) {
        return l(j4, j5, j6);
    }

    @fg.l
    public static final c1 h(@fg.l long... elements) {
        kotlin.jvm.internal.l0.p(elements, "elements");
        d2 d2Var = new d2(elements.length);
        d2Var.V(elements);
        return d2Var;
    }

    @fg.l
    public static final d2 i() {
        return new d2(0, 1, null);
    }

    @fg.l
    public static final d2 j(long j4) {
        d2 d2Var = new d2(1);
        d2Var.T(j4);
        return d2Var;
    }

    @fg.l
    public static final d2 k(long j4, long j5) {
        d2 d2Var = new d2(2);
        d2Var.T(j4);
        d2Var.T(j5);
        return d2Var;
    }

    @fg.l
    public static final d2 l(long j4, long j5, long j6) {
        d2 d2Var = new d2(3);
        d2Var.T(j4);
        d2Var.T(j5);
        d2Var.T(j6);
        return d2Var;
    }

    @fg.l
    public static final d2 m(@fg.l long... elements) {
        kotlin.jvm.internal.l0.p(elements, "elements");
        d2 d2Var = new d2(elements.length);
        d2Var.V(elements);
        return d2Var;
    }
}
