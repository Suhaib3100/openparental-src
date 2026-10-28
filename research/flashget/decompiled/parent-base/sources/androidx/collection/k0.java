package androidx.collection;

import kotlin.Metadata;

/* compiled from: IntLongMap.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u000f\u001a\r\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\r\u0010\u0003\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0002\u001a\u001d\u0010\b\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t\u001a-\u0010\f\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\r\u001a=\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011\u001aM\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u0015\u001a]\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0006¢\u0006\u0004\b\u0018\u0010\u0019\u001a\r\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u001d\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u001d\u0010\u001e\u001a-\u0010\u001f\u001a\u00020\u001a2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u001f\u0010 \u001a=\u0010!\u001a\u00020\u001a2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b!\u0010\"\u001aM\u0010#\u001a\u00020\u001a2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0006¢\u0006\u0004\b#\u0010$\u001a]\u0010%\u001a\u00020\u001a2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0006¢\u0006\u0004\b%\u0010&\"\u0014\u0010(\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0001\u0010'¨\u0006)"}, d2 = {"Landroidx/collection/j0;", "a", "()Landroidx/collection/j0;", "b", "", "key1", "", "value1", "c", "(IJ)Landroidx/collection/j0;", "key2", "value2", "d", "(IJIJ)Landroidx/collection/j0;", "key3", "value3", "e", "(IJIJIJ)Landroidx/collection/j0;", "key4", "value4", "f", "(IJIJIJIJ)Landroidx/collection/j0;", "key5", "value5", "g", "(IJIJIJIJIJ)Landroidx/collection/j0;", "Landroidx/collection/v1;", "h", "()Landroidx/collection/v1;", "i", "(IJ)Landroidx/collection/v1;", "j", "(IJIJ)Landroidx/collection/v1;", "k", "(IJIJIJ)Landroidx/collection/v1;", "l", "(IJIJIJIJ)Landroidx/collection/v1;", "m", "(IJIJIJIJIJ)Landroidx/collection/v1;", "Landroidx/collection/v1;", "EmptyIntLongMap", "collection"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class k0 {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private static final v1 f2307a = new v1(0);

    @fg.l
    public static final j0 a() {
        return f2307a;
    }

    @fg.l
    public static final j0 b() {
        return f2307a;
    }

    @fg.l
    public static final j0 c(int i4, long j4) {
        v1 v1Var = new v1(0, 1, null);
        v1Var.k0(i4, j4);
        return v1Var;
    }

    @fg.l
    public static final j0 d(int i4, long j4, int i5, long j5) {
        v1 v1Var = new v1(0, 1, null);
        v1Var.k0(i4, j4);
        v1Var.k0(i5, j5);
        return v1Var;
    }

    @fg.l
    public static final j0 e(int i4, long j4, int i5, long j5, int i6, long j6) {
        v1 v1Var = new v1(0, 1, null);
        v1Var.k0(i4, j4);
        v1Var.k0(i5, j5);
        v1Var.k0(i6, j6);
        return v1Var;
    }

    @fg.l
    public static final j0 f(int i4, long j4, int i5, long j5, int i6, long j6, int i7, long j7) {
        v1 v1Var = new v1(0, 1, null);
        v1Var.k0(i4, j4);
        v1Var.k0(i5, j5);
        v1Var.k0(i6, j6);
        v1Var.k0(i7, j7);
        return v1Var;
    }

    @fg.l
    public static final j0 g(int i4, long j4, int i5, long j5, int i6, long j6, int i7, long j7, int i10, long j10) {
        v1 v1Var = new v1(0, 1, null);
        v1Var.k0(i4, j4);
        v1Var.k0(i5, j5);
        v1Var.k0(i6, j6);
        v1Var.k0(i7, j7);
        v1Var.k0(i10, j10);
        return v1Var;
    }

    @fg.l
    public static final v1 h() {
        return new v1(0, 1, null);
    }

    @fg.l
    public static final v1 i(int i4, long j4) {
        v1 v1Var = new v1(0, 1, null);
        v1Var.k0(i4, j4);
        return v1Var;
    }

    @fg.l
    public static final v1 j(int i4, long j4, int i5, long j5) {
        v1 v1Var = new v1(0, 1, null);
        v1Var.k0(i4, j4);
        v1Var.k0(i5, j5);
        return v1Var;
    }

    @fg.l
    public static final v1 k(int i4, long j4, int i5, long j5, int i6, long j6) {
        v1 v1Var = new v1(0, 1, null);
        v1Var.k0(i4, j4);
        v1Var.k0(i5, j5);
        v1Var.k0(i6, j6);
        return v1Var;
    }

    @fg.l
    public static final v1 l(int i4, long j4, int i5, long j5, int i6, long j6, int i7, long j7) {
        v1 v1Var = new v1(0, 1, null);
        v1Var.k0(i4, j4);
        v1Var.k0(i5, j5);
        v1Var.k0(i6, j6);
        v1Var.k0(i7, j7);
        return v1Var;
    }

    @fg.l
    public static final v1 m(int i4, long j4, int i5, long j5, int i6, long j6, int i7, long j7, int i10, long j10) {
        v1 v1Var = new v1(0, 1, null);
        v1Var.k0(i4, j4);
        v1Var.k0(i5, j5);
        v1Var.k0(i6, j6);
        v1Var.k0(i7, j7);
        v1Var.k0(i10, j10);
        return v1Var;
    }
}
