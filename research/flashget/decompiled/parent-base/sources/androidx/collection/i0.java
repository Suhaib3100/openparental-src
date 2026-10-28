package androidx.collection;

import kotlin.Metadata;

/* compiled from: IntList.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\u001a\r\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\r\u0010\u0003\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0002\u001a\u0015\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001d\u0010\t\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\n\u001a%\u0010\f\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\r\u001a\u0019\u0010\u0010\u001a\u00020\u00002\n\u0010\u000f\u001a\u00020\u000e\"\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0010\u0010\u0013\u001a\u00020\u0012H\u0086\b¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0015\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u001d\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u0018\u001a%\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u001c\u0010\u001b\u001a\u00020\u00122\n\u0010\u000f\u001a\u00020\u000e\"\u00020\u0004H\u0086\b¢\u0006\u0004\b\u001b\u0010\u001c\"\u0014\u0010\u001e\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0001\u0010\u001d¨\u0006\u001f"}, d2 = {"Landroidx/collection/h0;", "a", "()Landroidx/collection/h0;", "b", "", "element1", "c", "(I)Landroidx/collection/h0;", "element2", "d", "(II)Landroidx/collection/h0;", "element3", "e", "(III)Landroidx/collection/h0;", "", "elements", "f", "([I)Landroidx/collection/h0;", "Landroidx/collection/u1;", "g", "()Landroidx/collection/u1;", "h", "(I)Landroidx/collection/u1;", "i", "(II)Landroidx/collection/u1;", "j", "(III)Landroidx/collection/u1;", "k", "([I)Landroidx/collection/u1;", "Landroidx/collection/h0;", "EmptyIntList", "collection"}, k = 2, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nIntList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntList.kt\nandroidx/collection/IntListKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 IntList.kt\nandroidx/collection/MutableIntList\n*L\n1#1,969:1\n1#2:970\n713#3,2:971\n713#3,2:973\n713#3,2:975\n713#3,2:977\n713#3,2:979\n713#3,2:981\n*S KotlinDebug\n*F\n+ 1 IntList.kt\nandroidx/collection/IntListKt\n*L\n938#1:971,2\n947#1:973,2\n948#1:975,2\n958#1:977,2\n959#1:979,2\n960#1:981,2\n*E\n"})
/* loaded from: classes.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private static final h0 f2254a = new u1(0, null);

    @fg.l
    public static final h0 a() {
        return f2254a;
    }

    @fg.l
    public static final h0 b() {
        return f2254a;
    }

    @fg.l
    public static final h0 c(int i4) {
        return h(i4);
    }

    @fg.l
    public static final h0 d(int i4, int i5) {
        return i(i4, i5);
    }

    @fg.l
    public static final h0 e(int i4, int i5, int i6) {
        return j(i4, i5, i6);
    }

    @fg.l
    public static final h0 f(@fg.l int... elements) {
        kotlin.jvm.internal.l0.p(elements, "elements");
        u1 u1Var = new u1(elements.length, null);
        u1Var.k0(elements);
        return u1Var;
    }

    @fg.l
    public static final u1 g() {
        return new u1(0, 1, null);
    }

    @fg.l
    public static final u1 h(int i4) {
        u1 u1Var = new u1(1, null);
        u1Var.X(i4);
        return u1Var;
    }

    @fg.l
    public static final u1 i(int i4, int i5) {
        u1 u1Var = new u1(2, null);
        u1Var.X(i4);
        u1Var.X(i5);
        return u1Var;
    }

    @fg.l
    public static final u1 j(int i4, int i5, int i6) {
        u1 u1Var = new u1(3, null);
        u1Var.X(i4);
        u1Var.X(i5);
        u1Var.X(i6);
        return u1Var;
    }

    @fg.l
    public static final u1 k(@fg.l int... elements) {
        kotlin.jvm.internal.l0.p(elements, "elements");
        u1 u1Var = new u1(elements.length, null);
        u1Var.k0(elements);
        return u1Var;
    }
}
