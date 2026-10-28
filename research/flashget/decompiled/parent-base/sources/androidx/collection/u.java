package androidx.collection;

import kotlin.Metadata;

/* compiled from: FloatList.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\u001a\r\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\r\u0010\u0003\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0002\u001a\u0015\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001d\u0010\t\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\n\u001a%\u0010\f\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\r\u001a\u0019\u0010\u0010\u001a\u00020\u00002\n\u0010\u000f\u001a\u00020\u000e\"\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0010\u0010\u0013\u001a\u00020\u0012H\u0086\b¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0015\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u001d\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u0018\u001a%\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u001c\u0010\u001b\u001a\u00020\u00122\n\u0010\u000f\u001a\u00020\u000e\"\u00020\u0004H\u0086\b¢\u0006\u0004\b\u001b\u0010\u001c\"\u0014\u0010\u001e\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0001\u0010\u001d¨\u0006\u001f"}, d2 = {"Landroidx/collection/t;", "a", "()Landroidx/collection/t;", "b", "", "element1", "c", "(F)Landroidx/collection/t;", "element2", "d", "(FF)Landroidx/collection/t;", "element3", "e", "(FFF)Landroidx/collection/t;", "", "elements", "f", "([F)Landroidx/collection/t;", "Landroidx/collection/o1;", "g", "()Landroidx/collection/o1;", "h", "(F)Landroidx/collection/o1;", "i", "(FF)Landroidx/collection/o1;", "j", "(FFF)Landroidx/collection/o1;", "k", "([F)Landroidx/collection/o1;", "Landroidx/collection/t;", "EmptyFloatList", "collection"}, k = 2, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nFloatList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatList.kt\nandroidx/collection/FloatListKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 FloatList.kt\nandroidx/collection/MutableFloatList\n*L\n1#1,969:1\n1#2:970\n713#3,2:971\n713#3,2:973\n713#3,2:975\n713#3,2:977\n713#3,2:979\n713#3,2:981\n*S KotlinDebug\n*F\n+ 1 FloatList.kt\nandroidx/collection/FloatListKt\n*L\n938#1:971,2\n947#1:973,2\n948#1:975,2\n958#1:977,2\n959#1:979,2\n960#1:981,2\n*E\n"})
/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private static final t f2393a = new o1(0, null);

    @fg.l
    public static final t a() {
        return f2393a;
    }

    @fg.l
    public static final t b() {
        return f2393a;
    }

    @fg.l
    public static final t c(float f4) {
        return h(f4);
    }

    @fg.l
    public static final t d(float f4, float f5) {
        return i(f4, f5);
    }

    @fg.l
    public static final t e(float f4, float f5, float f6) {
        return j(f4, f5, f6);
    }

    @fg.l
    public static final t f(@fg.l float... elements) {
        kotlin.jvm.internal.l0.p(elements, "elements");
        o1 o1Var = new o1(elements.length, null);
        o1Var.k0(elements);
        return o1Var;
    }

    @fg.l
    public static final o1 g() {
        return new o1(0, 1, null);
    }

    @fg.l
    public static final o1 h(float f4) {
        o1 o1Var = new o1(1, null);
        o1Var.X(f4);
        return o1Var;
    }

    @fg.l
    public static final o1 i(float f4, float f5) {
        o1 o1Var = new o1(2, null);
        o1Var.X(f4);
        o1Var.X(f5);
        return o1Var;
    }

    @fg.l
    public static final o1 j(float f4, float f5, float f6) {
        o1 o1Var = new o1(3, null);
        o1Var.X(f4);
        o1Var.X(f5);
        o1Var.X(f6);
        return o1Var;
    }

    @fg.l
    public static final o1 k(@fg.l float... elements) {
        kotlin.jvm.internal.l0.p(elements, "elements");
        o1 o1Var = new o1(elements.length, null);
        o1Var.k0(elements);
        return o1Var;
    }
}
