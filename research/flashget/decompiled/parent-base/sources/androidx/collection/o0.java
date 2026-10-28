package androidx.collection;

import kotlin.Metadata;

/* compiled from: IntSet.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\u001a\r\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\r\u0010\u0003\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0002\u001a\u0015\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001d\u0010\t\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\n\u001a%\u0010\f\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\r\u001a\u0019\u0010\u0010\u001a\u00020\u00002\n\u0010\u000f\u001a\u00020\u000e\"\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0011\u001a\r\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0015\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u001d\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u0018\u001a%\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0019\u0010\u001b\u001a\u00020\u00122\n\u0010\u000f\u001a\u00020\u000e\"\u00020\u0004¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0018\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0004H\u0080\b¢\u0006\u0004\b\u001d\u0010\u001e\"\u0014\u0010 \u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0001\u0010\u001f\"\u001a\u0010$\u001a\u00020\u000e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b!\u0010#¨\u0006%"}, d2 = {"Landroidx/collection/n0;", "a", "()Landroidx/collection/n0;", "d", "", "element1", "e", "(I)Landroidx/collection/n0;", "element2", "f", "(II)Landroidx/collection/n0;", "element3", "g", "(III)Landroidx/collection/n0;", "", "elements", "h", "([I)Landroidx/collection/n0;", "Landroidx/collection/x1;", "i", "()Landroidx/collection/x1;", "j", "(I)Landroidx/collection/x1;", "k", "(II)Landroidx/collection/x1;", "l", "(III)Landroidx/collection/x1;", "m", "([I)Landroidx/collection/x1;", "c", "(I)I", "Landroidx/collection/x1;", "EmptyIntSet", "b", "[I", "()[I", "EmptyIntArray", "collection"}, k = 2, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nIntSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntSet.kt\nandroidx/collection/IntSetKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,853:1\n1#2:854\n*E\n"})
/* loaded from: classes.dex */
public final class o0 {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private static final x1 f2355a = new x1(0);

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    private static final int[] f2356b = new int[0];

    @fg.l
    public static final n0 a() {
        return f2355a;
    }

    @fg.l
    public static final int[] b() {
        return f2356b;
    }

    public static final int c(int i4) {
        int hashCode = Integer.hashCode(i4) * x2.f2466j;
        return hashCode ^ (hashCode << 16);
    }

    @fg.l
    public static final n0 d() {
        return f2355a;
    }

    @fg.l
    public static final n0 e(int i4) {
        return j(i4);
    }

    @fg.l
    public static final n0 f(int i4, int i5) {
        return k(i4, i5);
    }

    @fg.l
    public static final n0 g(int i4, int i5, int i6) {
        return l(i4, i5, i6);
    }

    @fg.l
    public static final n0 h(@fg.l int... elements) {
        kotlin.jvm.internal.l0.p(elements, "elements");
        x1 x1Var = new x1(elements.length);
        x1Var.V(elements);
        return x1Var;
    }

    @fg.l
    public static final x1 i() {
        return new x1(0, 1, null);
    }

    @fg.l
    public static final x1 j(int i4) {
        x1 x1Var = new x1(1);
        x1Var.T(i4);
        return x1Var;
    }

    @fg.l
    public static final x1 k(int i4, int i5) {
        x1 x1Var = new x1(2);
        x1Var.T(i4);
        x1Var.T(i5);
        return x1Var;
    }

    @fg.l
    public static final x1 l(int i4, int i5, int i6) {
        x1 x1Var = new x1(3);
        x1Var.T(i4);
        x1Var.T(i5);
        x1Var.T(i6);
        return x1Var;
    }

    @fg.l
    public static final x1 m(@fg.l int... elements) {
        kotlin.jvm.internal.l0.p(elements, "elements");
        x1 x1Var = new x1(elements.length);
        x1Var.V(elements);
        return x1Var;
    }
}
