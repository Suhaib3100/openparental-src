package androidx.collection;

import kotlin.Metadata;

/* compiled from: FloatLongMap.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u000f\u001a\r\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\r\u0010\u0003\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0002\u001a\u001d\u0010\b\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t\u001a-\u0010\f\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\r\u001a=\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011\u001aM\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u0015\u001a]\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0006¢\u0006\u0004\b\u0018\u0010\u0019\u001a\r\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u001d\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u001d\u0010\u001e\u001a-\u0010\u001f\u001a\u00020\u001a2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u001f\u0010 \u001a=\u0010!\u001a\u00020\u001a2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b!\u0010\"\u001aM\u0010#\u001a\u00020\u001a2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0006¢\u0006\u0004\b#\u0010$\u001a]\u0010%\u001a\u00020\u001a2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0006¢\u0006\u0004\b%\u0010&\"\u0014\u0010(\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0001\u0010'¨\u0006)"}, d2 = {"Landroidx/collection/v;", "a", "()Landroidx/collection/v;", "b", "", "key1", "", "value1", "c", "(FJ)Landroidx/collection/v;", "key2", "value2", "d", "(FJFJ)Landroidx/collection/v;", "key3", "value3", "e", "(FJFJFJ)Landroidx/collection/v;", "key4", "value4", "f", "(FJFJFJFJ)Landroidx/collection/v;", "key5", "value5", "g", "(FJFJFJFJFJ)Landroidx/collection/v;", "Landroidx/collection/p1;", "h", "()Landroidx/collection/p1;", "i", "(FJ)Landroidx/collection/p1;", "j", "(FJFJ)Landroidx/collection/p1;", "k", "(FJFJFJ)Landroidx/collection/p1;", "l", "(FJFJFJFJ)Landroidx/collection/p1;", "m", "(FJFJFJFJFJ)Landroidx/collection/p1;", "Landroidx/collection/p1;", "EmptyFloatLongMap", "collection"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private static final p1 f2404a = new p1(0);

    @fg.l
    public static final v a() {
        return f2404a;
    }

    @fg.l
    public static final v b() {
        return f2404a;
    }

    @fg.l
    public static final v c(float f4, long j4) {
        p1 p1Var = new p1(0, 1, null);
        p1Var.k0(f4, j4);
        return p1Var;
    }

    @fg.l
    public static final v d(float f4, long j4, float f5, long j5) {
        p1 p1Var = new p1(0, 1, null);
        p1Var.k0(f4, j4);
        p1Var.k0(f5, j5);
        return p1Var;
    }

    @fg.l
    public static final v e(float f4, long j4, float f5, long j5, float f6, long j6) {
        p1 p1Var = new p1(0, 1, null);
        p1Var.k0(f4, j4);
        p1Var.k0(f5, j5);
        p1Var.k0(f6, j6);
        return p1Var;
    }

    @fg.l
    public static final v f(float f4, long j4, float f5, long j5, float f6, long j6, float f7, long j7) {
        p1 p1Var = new p1(0, 1, null);
        p1Var.k0(f4, j4);
        p1Var.k0(f5, j5);
        p1Var.k0(f6, j6);
        p1Var.k0(f7, j7);
        return p1Var;
    }

    @fg.l
    public static final v g(float f4, long j4, float f5, long j5, float f6, long j6, float f7, long j7, float f10, long j10) {
        p1 p1Var = new p1(0, 1, null);
        p1Var.k0(f4, j4);
        p1Var.k0(f5, j5);
        p1Var.k0(f6, j6);
        p1Var.k0(f7, j7);
        p1Var.k0(f10, j10);
        return p1Var;
    }

    @fg.l
    public static final p1 h() {
        return new p1(0, 1, null);
    }

    @fg.l
    public static final p1 i(float f4, long j4) {
        p1 p1Var = new p1(0, 1, null);
        p1Var.k0(f4, j4);
        return p1Var;
    }

    @fg.l
    public static final p1 j(float f4, long j4, float f5, long j5) {
        p1 p1Var = new p1(0, 1, null);
        p1Var.k0(f4, j4);
        p1Var.k0(f5, j5);
        return p1Var;
    }

    @fg.l
    public static final p1 k(float f4, long j4, float f5, long j5, float f6, long j6) {
        p1 p1Var = new p1(0, 1, null);
        p1Var.k0(f4, j4);
        p1Var.k0(f5, j5);
        p1Var.k0(f6, j6);
        return p1Var;
    }

    @fg.l
    public static final p1 l(float f4, long j4, float f5, long j5, float f6, long j6, float f7, long j7) {
        p1 p1Var = new p1(0, 1, null);
        p1Var.k0(f4, j4);
        p1Var.k0(f5, j5);
        p1Var.k0(f6, j6);
        p1Var.k0(f7, j7);
        return p1Var;
    }

    @fg.l
    public static final p1 m(float f4, long j4, float f5, long j5, float f6, long j6, float f7, long j7, float f10, long j10) {
        p1 p1Var = new p1(0, 1, null);
        p1Var.k0(f4, j4);
        p1Var.k0(f5, j5);
        p1Var.k0(f6, j6);
        p1Var.k0(f7, j7);
        p1Var.k0(f10, j10);
        return p1Var;
    }
}
