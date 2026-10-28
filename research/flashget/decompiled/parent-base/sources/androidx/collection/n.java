package androidx.collection;

import kotlin.Metadata;

/* compiled from: FloatFloatMap.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u000f\u001a\r\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\r\u0010\u0003\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0002\u001a\u001d\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b\u001a-\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\f\u001a=\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0010\u001aM\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0014\u001a]\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u0018\u001a\r\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u001d\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u001c\u0010\u001d\u001a-\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u001e\u0010\u001f\u001a=\u0010 \u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b \u0010!\u001aM\u0010\"\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004¢\u0006\u0004\b\"\u0010#\u001a]\u0010$\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0004¢\u0006\u0004\b$\u0010%\"\u0014\u0010'\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0001\u0010&¨\u0006("}, d2 = {"Landroidx/collection/m;", "a", "()Landroidx/collection/m;", "b", "", "key1", "value1", "c", "(FF)Landroidx/collection/m;", "key2", "value2", "d", "(FFFF)Landroidx/collection/m;", "key3", "value3", "e", "(FFFFFF)Landroidx/collection/m;", "key4", "value4", "f", "(FFFFFFFF)Landroidx/collection/m;", "key5", "value5", "g", "(FFFFFFFFFF)Landroidx/collection/m;", "Landroidx/collection/k1;", "h", "()Landroidx/collection/k1;", "i", "(FF)Landroidx/collection/k1;", "j", "(FFFF)Landroidx/collection/k1;", "k", "(FFFFFF)Landroidx/collection/k1;", "l", "(FFFFFFFF)Landroidx/collection/k1;", "m", "(FFFFFFFFFF)Landroidx/collection/k1;", "Landroidx/collection/k1;", "EmptyFloatFloatMap", "collection"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private static final k1 f2344a = new k1(0);

    @fg.l
    public static final m a() {
        return f2344a;
    }

    @fg.l
    public static final m b() {
        return f2344a;
    }

    @fg.l
    public static final m c(float f4, float f5) {
        k1 k1Var = new k1(0, 1, null);
        k1Var.k0(f4, f5);
        return k1Var;
    }

    @fg.l
    public static final m d(float f4, float f5, float f6, float f7) {
        k1 k1Var = new k1(0, 1, null);
        k1Var.k0(f4, f5);
        k1Var.k0(f6, f7);
        return k1Var;
    }

    @fg.l
    public static final m e(float f4, float f5, float f6, float f7, float f10, float f11) {
        k1 k1Var = new k1(0, 1, null);
        k1Var.k0(f4, f5);
        k1Var.k0(f6, f7);
        k1Var.k0(f10, f11);
        return k1Var;
    }

    @fg.l
    public static final m f(float f4, float f5, float f6, float f7, float f10, float f11, float f12, float f13) {
        k1 k1Var = new k1(0, 1, null);
        k1Var.k0(f4, f5);
        k1Var.k0(f6, f7);
        k1Var.k0(f10, f11);
        k1Var.k0(f12, f13);
        return k1Var;
    }

    @fg.l
    public static final m g(float f4, float f5, float f6, float f7, float f10, float f11, float f12, float f13, float f14, float f15) {
        k1 k1Var = new k1(0, 1, null);
        k1Var.k0(f4, f5);
        k1Var.k0(f6, f7);
        k1Var.k0(f10, f11);
        k1Var.k0(f12, f13);
        k1Var.k0(f14, f15);
        return k1Var;
    }

    @fg.l
    public static final k1 h() {
        return new k1(0, 1, null);
    }

    @fg.l
    public static final k1 i(float f4, float f5) {
        k1 k1Var = new k1(0, 1, null);
        k1Var.k0(f4, f5);
        return k1Var;
    }

    @fg.l
    public static final k1 j(float f4, float f5, float f6, float f7) {
        k1 k1Var = new k1(0, 1, null);
        k1Var.k0(f4, f5);
        k1Var.k0(f6, f7);
        return k1Var;
    }

    @fg.l
    public static final k1 k(float f4, float f5, float f6, float f7, float f10, float f11) {
        k1 k1Var = new k1(0, 1, null);
        k1Var.k0(f4, f5);
        k1Var.k0(f6, f7);
        k1Var.k0(f10, f11);
        return k1Var;
    }

    @fg.l
    public static final k1 l(float f4, float f5, float f6, float f7, float f10, float f11, float f12, float f13) {
        k1 k1Var = new k1(0, 1, null);
        k1Var.k0(f4, f5);
        k1Var.k0(f6, f7);
        k1Var.k0(f10, f11);
        k1Var.k0(f12, f13);
        return k1Var;
    }

    @fg.l
    public static final k1 m(float f4, float f5, float f6, float f7, float f10, float f11, float f12, float f13, float f14, float f15) {
        k1 k1Var = new k1(0, 1, null);
        k1Var.k0(f4, f5);
        k1Var.k0(f6, f7);
        k1Var.k0(f10, f11);
        k1Var.k0(f12, f13);
        k1Var.k0(f14, f15);
        return k1Var;
    }
}
