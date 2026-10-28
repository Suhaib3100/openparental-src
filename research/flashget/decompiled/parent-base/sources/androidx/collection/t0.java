package androidx.collection;

import kotlin.Metadata;

/* compiled from: LongIntMap.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u000f\u001a\r\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\r\u0010\u0003\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0002\u001a\u001d\u0010\b\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t\u001a-\u0010\f\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\r\u001a=\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011\u001aM\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u0015\u001a]\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0006¢\u0006\u0004\b\u0018\u0010\u0019\u001a\r\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u001d\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u001d\u0010\u001e\u001a-\u0010\u001f\u001a\u00020\u001a2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u001f\u0010 \u001a=\u0010!\u001a\u00020\u001a2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b!\u0010\"\u001aM\u0010#\u001a\u00020\u001a2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0006¢\u0006\u0004\b#\u0010$\u001a]\u0010%\u001a\u00020\u001a2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0006¢\u0006\u0004\b%\u0010&\"\u0014\u0010(\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0001\u0010'¨\u0006)"}, d2 = {"Landroidx/collection/s0;", "a", "()Landroidx/collection/s0;", "b", "", "key1", "", "value1", "c", "(JI)Landroidx/collection/s0;", "key2", "value2", "d", "(JIJI)Landroidx/collection/s0;", "key3", "value3", "e", "(JIJIJI)Landroidx/collection/s0;", "key4", "value4", "f", "(JIJIJIJI)Landroidx/collection/s0;", "key5", "value5", "g", "(JIJIJIJIJI)Landroidx/collection/s0;", "Landroidx/collection/z1;", "h", "()Landroidx/collection/z1;", "i", "(JI)Landroidx/collection/z1;", "j", "(JIJI)Landroidx/collection/z1;", "k", "(JIJIJI)Landroidx/collection/z1;", "l", "(JIJIJIJI)Landroidx/collection/z1;", "m", "(JIJIJIJIJI)Landroidx/collection/z1;", "Landroidx/collection/z1;", "EmptyLongIntMap", "collection"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class t0 {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private static final z1 f2386a = new z1(0);

    @fg.l
    public static final s0 a() {
        return f2386a;
    }

    @fg.l
    public static final s0 b() {
        return f2386a;
    }

    @fg.l
    public static final s0 c(long j4, int i4) {
        z1 z1Var = new z1(0, 1, null);
        z1Var.k0(j4, i4);
        return z1Var;
    }

    @fg.l
    public static final s0 d(long j4, int i4, long j5, int i5) {
        z1 z1Var = new z1(0, 1, null);
        z1Var.k0(j4, i4);
        z1Var.k0(j5, i5);
        return z1Var;
    }

    @fg.l
    public static final s0 e(long j4, int i4, long j5, int i5, long j6, int i6) {
        z1 z1Var = new z1(0, 1, null);
        z1Var.k0(j4, i4);
        z1Var.k0(j5, i5);
        z1Var.k0(j6, i6);
        return z1Var;
    }

    @fg.l
    public static final s0 f(long j4, int i4, long j5, int i5, long j6, int i6, long j7, int i7) {
        z1 z1Var = new z1(0, 1, null);
        z1Var.k0(j4, i4);
        z1Var.k0(j5, i5);
        z1Var.k0(j6, i6);
        z1Var.k0(j7, i7);
        return z1Var;
    }

    @fg.l
    public static final s0 g(long j4, int i4, long j5, int i5, long j6, int i6, long j7, int i7, long j10, int i10) {
        z1 z1Var = new z1(0, 1, null);
        z1Var.k0(j4, i4);
        z1Var.k0(j5, i5);
        z1Var.k0(j6, i6);
        z1Var.k0(j7, i7);
        z1Var.k0(j10, i10);
        return z1Var;
    }

    @fg.l
    public static final z1 h() {
        return new z1(0, 1, null);
    }

    @fg.l
    public static final z1 i(long j4, int i4) {
        z1 z1Var = new z1(0, 1, null);
        z1Var.k0(j4, i4);
        return z1Var;
    }

    @fg.l
    public static final z1 j(long j4, int i4, long j5, int i5) {
        z1 z1Var = new z1(0, 1, null);
        z1Var.k0(j4, i4);
        z1Var.k0(j5, i5);
        return z1Var;
    }

    @fg.l
    public static final z1 k(long j4, int i4, long j5, int i5, long j6, int i6) {
        z1 z1Var = new z1(0, 1, null);
        z1Var.k0(j4, i4);
        z1Var.k0(j5, i5);
        z1Var.k0(j6, i6);
        return z1Var;
    }

    @fg.l
    public static final z1 l(long j4, int i4, long j5, int i5, long j6, int i6, long j7, int i7) {
        z1 z1Var = new z1(0, 1, null);
        z1Var.k0(j4, i4);
        z1Var.k0(j5, i5);
        z1Var.k0(j6, i6);
        z1Var.k0(j7, i7);
        return z1Var;
    }

    @fg.l
    public static final z1 m(long j4, int i4, long j5, int i5, long j6, int i6, long j7, int i7, long j10, int i10) {
        z1 z1Var = new z1(0, 1, null);
        z1Var.k0(j4, i4);
        z1Var.k0(j5, i5);
        z1Var.k0(j6, i6);
        z1Var.k0(j7, i7);
        z1Var.k0(j10, i10);
        return z1Var;
    }
}
