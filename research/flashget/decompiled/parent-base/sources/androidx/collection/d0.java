package androidx.collection;

import kotlin.Metadata;

/* compiled from: IntFloatMap.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u000f\u001a\r\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\r\u0010\u0003\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0002\u001a\u001d\u0010\b\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t\u001a-\u0010\f\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\r\u001a=\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011\u001aM\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u0015\u001a]\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0006¢\u0006\u0004\b\u0018\u0010\u0019\u001a\r\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u001d\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u001d\u0010\u001e\u001a-\u0010\u001f\u001a\u00020\u001a2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u001f\u0010 \u001a=\u0010!\u001a\u00020\u001a2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b!\u0010\"\u001aM\u0010#\u001a\u00020\u001a2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0006¢\u0006\u0004\b#\u0010$\u001a]\u0010%\u001a\u00020\u001a2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0006¢\u0006\u0004\b%\u0010&\"\u0014\u0010(\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0001\u0010'¨\u0006)"}, d2 = {"Landroidx/collection/c0;", "a", "()Landroidx/collection/c0;", "b", "", "key1", "", "value1", "c", "(IF)Landroidx/collection/c0;", "key2", "value2", "d", "(IFIF)Landroidx/collection/c0;", "key3", "value3", "e", "(IFIFIF)Landroidx/collection/c0;", "key4", "value4", "f", "(IFIFIFIF)Landroidx/collection/c0;", "key5", "value5", "g", "(IFIFIFIFIF)Landroidx/collection/c0;", "Landroidx/collection/s1;", "h", "()Landroidx/collection/s1;", "i", "(IF)Landroidx/collection/s1;", "j", "(IFIF)Landroidx/collection/s1;", "k", "(IFIFIF)Landroidx/collection/s1;", "l", "(IFIFIFIF)Landroidx/collection/s1;", "m", "(IFIFIFIFIF)Landroidx/collection/s1;", "Landroidx/collection/s1;", "EmptyIntFloatMap", "collection"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private static final s1 f2199a = new s1(0);

    @fg.l
    public static final c0 a() {
        return f2199a;
    }

    @fg.l
    public static final c0 b() {
        return f2199a;
    }

    @fg.l
    public static final c0 c(int i4, float f4) {
        s1 s1Var = new s1(0, 1, null);
        s1Var.k0(i4, f4);
        return s1Var;
    }

    @fg.l
    public static final c0 d(int i4, float f4, int i5, float f5) {
        s1 s1Var = new s1(0, 1, null);
        s1Var.k0(i4, f4);
        s1Var.k0(i5, f5);
        return s1Var;
    }

    @fg.l
    public static final c0 e(int i4, float f4, int i5, float f5, int i6, float f6) {
        s1 s1Var = new s1(0, 1, null);
        s1Var.k0(i4, f4);
        s1Var.k0(i5, f5);
        s1Var.k0(i6, f6);
        return s1Var;
    }

    @fg.l
    public static final c0 f(int i4, float f4, int i5, float f5, int i6, float f6, int i7, float f7) {
        s1 s1Var = new s1(0, 1, null);
        s1Var.k0(i4, f4);
        s1Var.k0(i5, f5);
        s1Var.k0(i6, f6);
        s1Var.k0(i7, f7);
        return s1Var;
    }

    @fg.l
    public static final c0 g(int i4, float f4, int i5, float f5, int i6, float f6, int i7, float f7, int i10, float f10) {
        s1 s1Var = new s1(0, 1, null);
        s1Var.k0(i4, f4);
        s1Var.k0(i5, f5);
        s1Var.k0(i6, f6);
        s1Var.k0(i7, f7);
        s1Var.k0(i10, f10);
        return s1Var;
    }

    @fg.l
    public static final s1 h() {
        return new s1(0, 1, null);
    }

    @fg.l
    public static final s1 i(int i4, float f4) {
        s1 s1Var = new s1(0, 1, null);
        s1Var.k0(i4, f4);
        return s1Var;
    }

    @fg.l
    public static final s1 j(int i4, float f4, int i5, float f5) {
        s1 s1Var = new s1(0, 1, null);
        s1Var.k0(i4, f4);
        s1Var.k0(i5, f5);
        return s1Var;
    }

    @fg.l
    public static final s1 k(int i4, float f4, int i5, float f5, int i6, float f6) {
        s1 s1Var = new s1(0, 1, null);
        s1Var.k0(i4, f4);
        s1Var.k0(i5, f5);
        s1Var.k0(i6, f6);
        return s1Var;
    }

    @fg.l
    public static final s1 l(int i4, float f4, int i5, float f5, int i6, float f6, int i7, float f7) {
        s1 s1Var = new s1(0, 1, null);
        s1Var.k0(i4, f4);
        s1Var.k0(i5, f5);
        s1Var.k0(i6, f6);
        s1Var.k0(i7, f7);
        return s1Var;
    }

    @fg.l
    public static final s1 m(int i4, float f4, int i5, float f5, int i6, float f6, int i7, float f7, int i10, float f10) {
        s1 s1Var = new s1(0, 1, null);
        s1Var.k0(i4, f4);
        s1Var.k0(i5, f5);
        s1Var.k0(i6, f6);
        s1Var.k0(i7, f7);
        s1Var.k0(i10, f10);
        return s1Var;
    }
}
