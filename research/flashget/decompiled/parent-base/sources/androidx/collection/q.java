package androidx.collection;

import kotlin.Metadata;

/* compiled from: FloatIntMap.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u000f\u001a\r\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\r\u0010\u0003\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0002\u001a\u001d\u0010\b\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t\u001a-\u0010\f\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\r\u001a=\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011\u001aM\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u0015\u001a]\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0006¢\u0006\u0004\b\u0018\u0010\u0019\u001a\r\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u001d\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u001d\u0010\u001e\u001a-\u0010\u001f\u001a\u00020\u001a2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u001f\u0010 \u001a=\u0010!\u001a\u00020\u001a2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b!\u0010\"\u001aM\u0010#\u001a\u00020\u001a2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0006¢\u0006\u0004\b#\u0010$\u001a]\u0010%\u001a\u00020\u001a2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0006¢\u0006\u0004\b%\u0010&\"\u0014\u0010(\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0001\u0010'¨\u0006)"}, d2 = {"Landroidx/collection/p;", "a", "()Landroidx/collection/p;", "b", "", "key1", "", "value1", "c", "(FI)Landroidx/collection/p;", "key2", "value2", "d", "(FIFI)Landroidx/collection/p;", "key3", "value3", "e", "(FIFIFI)Landroidx/collection/p;", "key4", "value4", "f", "(FIFIFIFI)Landroidx/collection/p;", "key5", "value5", "g", "(FIFIFIFIFI)Landroidx/collection/p;", "Landroidx/collection/l1;", "h", "()Landroidx/collection/l1;", "i", "(FI)Landroidx/collection/l1;", "j", "(FIFI)Landroidx/collection/l1;", "k", "(FIFIFI)Landroidx/collection/l1;", "l", "(FIFIFIFI)Landroidx/collection/l1;", "m", "(FIFIFIFIFI)Landroidx/collection/l1;", "Landroidx/collection/l1;", "EmptyFloatIntMap", "collection"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private static final l1 f2367a = new l1(0);

    @fg.l
    public static final p a() {
        return f2367a;
    }

    @fg.l
    public static final p b() {
        return f2367a;
    }

    @fg.l
    public static final p c(float f4, int i4) {
        l1 l1Var = new l1(0, 1, null);
        l1Var.k0(f4, i4);
        return l1Var;
    }

    @fg.l
    public static final p d(float f4, int i4, float f5, int i5) {
        l1 l1Var = new l1(0, 1, null);
        l1Var.k0(f4, i4);
        l1Var.k0(f5, i5);
        return l1Var;
    }

    @fg.l
    public static final p e(float f4, int i4, float f5, int i5, float f6, int i6) {
        l1 l1Var = new l1(0, 1, null);
        l1Var.k0(f4, i4);
        l1Var.k0(f5, i5);
        l1Var.k0(f6, i6);
        return l1Var;
    }

    @fg.l
    public static final p f(float f4, int i4, float f5, int i5, float f6, int i6, float f7, int i7) {
        l1 l1Var = new l1(0, 1, null);
        l1Var.k0(f4, i4);
        l1Var.k0(f5, i5);
        l1Var.k0(f6, i6);
        l1Var.k0(f7, i7);
        return l1Var;
    }

    @fg.l
    public static final p g(float f4, int i4, float f5, int i5, float f6, int i6, float f7, int i7, float f10, int i10) {
        l1 l1Var = new l1(0, 1, null);
        l1Var.k0(f4, i4);
        l1Var.k0(f5, i5);
        l1Var.k0(f6, i6);
        l1Var.k0(f7, i7);
        l1Var.k0(f10, i10);
        return l1Var;
    }

    @fg.l
    public static final l1 h() {
        return new l1(0, 1, null);
    }

    @fg.l
    public static final l1 i(float f4, int i4) {
        l1 l1Var = new l1(0, 1, null);
        l1Var.k0(f4, i4);
        return l1Var;
    }

    @fg.l
    public static final l1 j(float f4, int i4, float f5, int i5) {
        l1 l1Var = new l1(0, 1, null);
        l1Var.k0(f4, i4);
        l1Var.k0(f5, i5);
        return l1Var;
    }

    @fg.l
    public static final l1 k(float f4, int i4, float f5, int i5, float f6, int i6) {
        l1 l1Var = new l1(0, 1, null);
        l1Var.k0(f4, i4);
        l1Var.k0(f5, i5);
        l1Var.k0(f6, i6);
        return l1Var;
    }

    @fg.l
    public static final l1 l(float f4, int i4, float f5, int i5, float f6, int i6, float f7, int i7) {
        l1 l1Var = new l1(0, 1, null);
        l1Var.k0(f4, i4);
        l1Var.k0(f5, i5);
        l1Var.k0(f6, i6);
        l1Var.k0(f7, i7);
        return l1Var;
    }

    @fg.l
    public static final l1 m(float f4, int i4, float f5, int i5, float f6, int i6, float f7, int i7, float f10, int i10) {
        l1 l1Var = new l1(0, 1, null);
        l1Var.k0(f4, i4);
        l1Var.k0(f5, i5);
        l1Var.k0(f6, i6);
        l1Var.k0(f7, i7);
        l1Var.k0(f10, i10);
        return l1Var;
    }
}
