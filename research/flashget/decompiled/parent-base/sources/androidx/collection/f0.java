package androidx.collection;

import kotlin.Metadata;

/* compiled from: IntIntMap.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u000f\u001a\r\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\r\u0010\u0003\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0002\u001a\u001d\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b\u001a-\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\f\u001a=\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0010\u001aM\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0014\u001a]\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u0018\u001a\r\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u001d\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u001c\u0010\u001d\u001a-\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u001e\u0010\u001f\u001a=\u0010 \u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b \u0010!\u001aM\u0010\"\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004¢\u0006\u0004\b\"\u0010#\u001a]\u0010$\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0004¢\u0006\u0004\b$\u0010%\"\u0014\u0010'\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0001\u0010&¨\u0006("}, d2 = {"Landroidx/collection/e0;", "a", "()Landroidx/collection/e0;", "b", "", "key1", "value1", "c", "(II)Landroidx/collection/e0;", "key2", "value2", "d", "(IIII)Landroidx/collection/e0;", "key3", "value3", "e", "(IIIIII)Landroidx/collection/e0;", "key4", "value4", "f", "(IIIIIIII)Landroidx/collection/e0;", "key5", "value5", "g", "(IIIIIIIIII)Landroidx/collection/e0;", "Landroidx/collection/t1;", "h", "()Landroidx/collection/t1;", "i", "(II)Landroidx/collection/t1;", "j", "(IIII)Landroidx/collection/t1;", "k", "(IIIIII)Landroidx/collection/t1;", "l", "(IIIIIIII)Landroidx/collection/t1;", "m", "(IIIIIIIIII)Landroidx/collection/t1;", "Landroidx/collection/t1;", "EmptyIntIntMap", "collection"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private static final t1 f2221a = new t1(0);

    @fg.l
    public static final e0 a() {
        return f2221a;
    }

    @fg.l
    public static final e0 b() {
        return f2221a;
    }

    @fg.l
    public static final e0 c(int i4, int i5) {
        t1 t1Var = new t1(0, 1, null);
        t1Var.k0(i4, i5);
        return t1Var;
    }

    @fg.l
    public static final e0 d(int i4, int i5, int i6, int i7) {
        t1 t1Var = new t1(0, 1, null);
        t1Var.k0(i4, i5);
        t1Var.k0(i6, i7);
        return t1Var;
    }

    @fg.l
    public static final e0 e(int i4, int i5, int i6, int i7, int i10, int i11) {
        t1 t1Var = new t1(0, 1, null);
        t1Var.k0(i4, i5);
        t1Var.k0(i6, i7);
        t1Var.k0(i10, i11);
        return t1Var;
    }

    @fg.l
    public static final e0 f(int i4, int i5, int i6, int i7, int i10, int i11, int i12, int i13) {
        t1 t1Var = new t1(0, 1, null);
        t1Var.k0(i4, i5);
        t1Var.k0(i6, i7);
        t1Var.k0(i10, i11);
        t1Var.k0(i12, i13);
        return t1Var;
    }

    @fg.l
    public static final e0 g(int i4, int i5, int i6, int i7, int i10, int i11, int i12, int i13, int i14, int i15) {
        t1 t1Var = new t1(0, 1, null);
        t1Var.k0(i4, i5);
        t1Var.k0(i6, i7);
        t1Var.k0(i10, i11);
        t1Var.k0(i12, i13);
        t1Var.k0(i14, i15);
        return t1Var;
    }

    @fg.l
    public static final t1 h() {
        return new t1(0, 1, null);
    }

    @fg.l
    public static final t1 i(int i4, int i5) {
        t1 t1Var = new t1(0, 1, null);
        t1Var.k0(i4, i5);
        return t1Var;
    }

    @fg.l
    public static final t1 j(int i4, int i5, int i6, int i7) {
        t1 t1Var = new t1(0, 1, null);
        t1Var.k0(i4, i5);
        t1Var.k0(i6, i7);
        return t1Var;
    }

    @fg.l
    public static final t1 k(int i4, int i5, int i6, int i7, int i10, int i11) {
        t1 t1Var = new t1(0, 1, null);
        t1Var.k0(i4, i5);
        t1Var.k0(i6, i7);
        t1Var.k0(i10, i11);
        return t1Var;
    }

    @fg.l
    public static final t1 l(int i4, int i5, int i6, int i7, int i10, int i11, int i12, int i13) {
        t1 t1Var = new t1(0, 1, null);
        t1Var.k0(i4, i5);
        t1Var.k0(i6, i7);
        t1Var.k0(i10, i11);
        t1Var.k0(i12, i13);
        return t1Var;
    }

    @fg.l
    public static final t1 m(int i4, int i5, int i6, int i7, int i10, int i11, int i12, int i13, int i14, int i15) {
        t1 t1Var = new t1(0, 1, null);
        t1Var.k0(i4, i5);
        t1Var.k0(i6, i7);
        t1Var.k0(i10, i11);
        t1Var.k0(i12, i13);
        t1Var.k0(i14, i15);
        return t1Var;
    }
}
