package androidx.collection;

import kotlin.Metadata;

/* compiled from: LongList.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u0016\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\u001a\r\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\r\u0010\u0003\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0002\u001a\u0015\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001d\u0010\t\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\n\u001a%\u0010\f\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\r\u001a\u0019\u0010\u0010\u001a\u00020\u00002\n\u0010\u000f\u001a\u00020\u000e\"\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0010\u0010\u0013\u001a\u00020\u0012H\u0086\b¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0015\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u001d\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u0018\u001a%\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u001c\u0010\u001b\u001a\u00020\u00122\n\u0010\u000f\u001a\u00020\u000e\"\u00020\u0004H\u0086\b¢\u0006\u0004\b\u001b\u0010\u001c\"\u0014\u0010\u001e\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0001\u0010\u001d¨\u0006\u001f"}, d2 = {"Landroidx/collection/u0;", "a", "()Landroidx/collection/u0;", "b", "", "element1", "c", "(J)Landroidx/collection/u0;", "element2", "d", "(JJ)Landroidx/collection/u0;", "element3", "e", "(JJJ)Landroidx/collection/u0;", "", "elements", "f", "([J)Landroidx/collection/u0;", "Landroidx/collection/a2;", "g", "()Landroidx/collection/a2;", "h", "(J)Landroidx/collection/a2;", "i", "(JJ)Landroidx/collection/a2;", "j", "(JJJ)Landroidx/collection/a2;", "k", "([J)Landroidx/collection/a2;", "Landroidx/collection/u0;", "EmptyLongList", "collection"}, k = 2, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nLongList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LongList.kt\nandroidx/collection/LongListKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 LongList.kt\nandroidx/collection/MutableLongList\n*L\n1#1,969:1\n1#2:970\n713#3,2:971\n713#3,2:973\n713#3,2:975\n713#3,2:977\n713#3,2:979\n713#3,2:981\n*S KotlinDebug\n*F\n+ 1 LongList.kt\nandroidx/collection/LongListKt\n*L\n938#1:971,2\n947#1:973,2\n948#1:975,2\n958#1:977,2\n959#1:979,2\n960#1:981,2\n*E\n"})
/* loaded from: classes.dex */
public final class v0 {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private static final u0 f2402a = new a2(0, null);

    @fg.l
    public static final u0 a() {
        return f2402a;
    }

    @fg.l
    public static final u0 b() {
        return f2402a;
    }

    @fg.l
    public static final u0 c(long j4) {
        return h(j4);
    }

    @fg.l
    public static final u0 d(long j4, long j5) {
        return i(j4, j5);
    }

    @fg.l
    public static final u0 e(long j4, long j5, long j6) {
        return j(j4, j5, j6);
    }

    @fg.l
    public static final u0 f(@fg.l long... elements) {
        kotlin.jvm.internal.l0.p(elements, "elements");
        a2 a2Var = new a2(elements.length, null);
        a2Var.k0(elements);
        return a2Var;
    }

    @fg.l
    public static final a2 g() {
        return new a2(0, 1, null);
    }

    @fg.l
    public static final a2 h(long j4) {
        a2 a2Var = new a2(1, null);
        a2Var.X(j4);
        return a2Var;
    }

    @fg.l
    public static final a2 i(long j4, long j5) {
        a2 a2Var = new a2(2, null);
        a2Var.X(j4);
        a2Var.X(j5);
        return a2Var;
    }

    @fg.l
    public static final a2 j(long j4, long j5, long j6) {
        a2 a2Var = new a2(3, null);
        a2Var.X(j4);
        a2Var.X(j5);
        a2Var.X(j6);
        return a2Var;
    }

    @fg.l
    public static final a2 k(@fg.l long... elements) {
        kotlin.jvm.internal.l0.p(elements, "elements");
        a2 a2Var = new a2(elements.length, null);
        a2Var.k0(elements);
        return a2Var;
    }
}
