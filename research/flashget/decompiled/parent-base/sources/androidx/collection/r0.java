package androidx.collection;

import kotlin.Metadata;

/* compiled from: LongFloatMap.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u000f\u001a\r\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\r\u0010\u0003\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0002\u001a\u001d\u0010\b\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t\u001a-\u0010\f\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\r\u001a=\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011\u001aM\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u0015\u001a]\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0006¢\u0006\u0004\b\u0018\u0010\u0019\u001a\r\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u001d\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u001d\u0010\u001e\u001a-\u0010\u001f\u001a\u00020\u001a2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u001f\u0010 \u001a=\u0010!\u001a\u00020\u001a2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b!\u0010\"\u001aM\u0010#\u001a\u00020\u001a2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0006¢\u0006\u0004\b#\u0010$\u001a]\u0010%\u001a\u00020\u001a2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0006¢\u0006\u0004\b%\u0010&\"\u0014\u0010(\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0001\u0010'¨\u0006)"}, d2 = {"Landroidx/collection/q0;", "a", "()Landroidx/collection/q0;", "b", "", "key1", "", "value1", "c", "(JF)Landroidx/collection/q0;", "key2", "value2", "d", "(JFJF)Landroidx/collection/q0;", "key3", "value3", "e", "(JFJFJF)Landroidx/collection/q0;", "key4", "value4", "f", "(JFJFJFJF)Landroidx/collection/q0;", "key5", "value5", "g", "(JFJFJFJFJF)Landroidx/collection/q0;", "Landroidx/collection/y1;", "h", "()Landroidx/collection/y1;", "i", "(JF)Landroidx/collection/y1;", "j", "(JFJF)Landroidx/collection/y1;", "k", "(JFJFJF)Landroidx/collection/y1;", "l", "(JFJFJFJF)Landroidx/collection/y1;", "m", "(JFJFJFJFJF)Landroidx/collection/y1;", "Landroidx/collection/y1;", "EmptyLongFloatMap", "collection"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class r0 {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private static final y1 f2374a = new y1(0);

    @fg.l
    public static final q0 a() {
        return f2374a;
    }

    @fg.l
    public static final q0 b() {
        return f2374a;
    }

    @fg.l
    public static final q0 c(long j4, float f4) {
        y1 y1Var = new y1(0, 1, null);
        y1Var.k0(j4, f4);
        return y1Var;
    }

    @fg.l
    public static final q0 d(long j4, float f4, long j5, float f5) {
        y1 y1Var = new y1(0, 1, null);
        y1Var.k0(j4, f4);
        y1Var.k0(j5, f5);
        return y1Var;
    }

    @fg.l
    public static final q0 e(long j4, float f4, long j5, float f5, long j6, float f6) {
        y1 y1Var = new y1(0, 1, null);
        y1Var.k0(j4, f4);
        y1Var.k0(j5, f5);
        y1Var.k0(j6, f6);
        return y1Var;
    }

    @fg.l
    public static final q0 f(long j4, float f4, long j5, float f5, long j6, float f6, long j7, float f7) {
        y1 y1Var = new y1(0, 1, null);
        y1Var.k0(j4, f4);
        y1Var.k0(j5, f5);
        y1Var.k0(j6, f6);
        y1Var.k0(j7, f7);
        return y1Var;
    }

    @fg.l
    public static final q0 g(long j4, float f4, long j5, float f5, long j6, float f6, long j7, float f7, long j10, float f10) {
        y1 y1Var = new y1(0, 1, null);
        y1Var.k0(j4, f4);
        y1Var.k0(j5, f5);
        y1Var.k0(j6, f6);
        y1Var.k0(j7, f7);
        y1Var.k0(j10, f10);
        return y1Var;
    }

    @fg.l
    public static final y1 h() {
        return new y1(0, 1, null);
    }

    @fg.l
    public static final y1 i(long j4, float f4) {
        y1 y1Var = new y1(0, 1, null);
        y1Var.k0(j4, f4);
        return y1Var;
    }

    @fg.l
    public static final y1 j(long j4, float f4, long j5, float f5) {
        y1 y1Var = new y1(0, 1, null);
        y1Var.k0(j4, f4);
        y1Var.k0(j5, f5);
        return y1Var;
    }

    @fg.l
    public static final y1 k(long j4, float f4, long j5, float f5, long j6, float f6) {
        y1 y1Var = new y1(0, 1, null);
        y1Var.k0(j4, f4);
        y1Var.k0(j5, f5);
        y1Var.k0(j6, f6);
        return y1Var;
    }

    @fg.l
    public static final y1 l(long j4, float f4, long j5, float f5, long j6, float f6, long j7, float f7) {
        y1 y1Var = new y1(0, 1, null);
        y1Var.k0(j4, f4);
        y1Var.k0(j5, f5);
        y1Var.k0(j6, f6);
        y1Var.k0(j7, f7);
        return y1Var;
    }

    @fg.l
    public static final y1 m(long j4, float f4, long j5, float f5, long j6, float f6, long j7, float f7, long j10, float f10) {
        y1 y1Var = new y1(0, 1, null);
        y1Var.k0(j4, f4);
        y1Var.k0(j5, f5);
        y1Var.k0(j6, f6);
        y1Var.k0(j7, f7);
        y1Var.k0(j10, f10);
        return y1Var;
    }
}
