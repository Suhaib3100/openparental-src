package androidx.collection;

import kotlin.Metadata;

/* compiled from: LongLongMap.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u000f\u001a\r\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\r\u0010\u0003\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0002\u001a\u001d\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b\u001a-\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\f\u001a=\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0010\u001aM\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0014\u001a]\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u0018\u001a\r\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u001d\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u001c\u0010\u001d\u001a-\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u001e\u0010\u001f\u001a=\u0010 \u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b \u0010!\u001aM\u0010\"\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004¢\u0006\u0004\b\"\u0010#\u001a]\u0010$\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0004¢\u0006\u0004\b$\u0010%\"\u0014\u0010'\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0001\u0010&¨\u0006("}, d2 = {"Landroidx/collection/w0;", "a", "()Landroidx/collection/w0;", "b", "", "key1", "value1", "c", "(JJ)Landroidx/collection/w0;", "key2", "value2", "d", "(JJJJ)Landroidx/collection/w0;", "key3", "value3", "e", "(JJJJJJ)Landroidx/collection/w0;", "key4", "value4", "f", "(JJJJJJJJ)Landroidx/collection/w0;", "key5", "value5", "g", "(JJJJJJJJJJ)Landroidx/collection/w0;", "Landroidx/collection/b2;", "h", "()Landroidx/collection/b2;", "i", "(JJ)Landroidx/collection/b2;", "j", "(JJJJ)Landroidx/collection/b2;", "k", "(JJJJJJ)Landroidx/collection/b2;", "l", "(JJJJJJJJ)Landroidx/collection/b2;", "m", "(JJJJJJJJJJ)Landroidx/collection/b2;", "Landroidx/collection/b2;", "EmptyLongLongMap", "collection"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class x0 {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private static final b2 f2455a = new b2(0);

    @fg.l
    public static final w0 a() {
        return f2455a;
    }

    @fg.l
    public static final w0 b() {
        return f2455a;
    }

    @fg.l
    public static final w0 c(long j4, long j5) {
        b2 b2Var = new b2(0, 1, null);
        b2Var.k0(j4, j5);
        return b2Var;
    }

    @fg.l
    public static final w0 d(long j4, long j5, long j6, long j7) {
        b2 b2Var = new b2(0, 1, null);
        b2Var.k0(j4, j5);
        b2Var.k0(j6, j7);
        return b2Var;
    }

    @fg.l
    public static final w0 e(long j4, long j5, long j6, long j7, long j10, long j11) {
        b2 b2Var = new b2(0, 1, null);
        b2Var.k0(j4, j5);
        b2Var.k0(j6, j7);
        b2Var.k0(j10, j11);
        return b2Var;
    }

    @fg.l
    public static final w0 f(long j4, long j5, long j6, long j7, long j10, long j11, long j12, long j13) {
        b2 b2Var = new b2(0, 1, null);
        b2Var.k0(j4, j5);
        b2Var.k0(j6, j7);
        b2Var.k0(j10, j11);
        b2Var.k0(j12, j13);
        return b2Var;
    }

    @fg.l
    public static final w0 g(long j4, long j5, long j6, long j7, long j10, long j11, long j12, long j13, long j14, long j15) {
        b2 b2Var = new b2(0, 1, null);
        b2Var.k0(j4, j5);
        b2Var.k0(j6, j7);
        b2Var.k0(j10, j11);
        b2Var.k0(j12, j13);
        b2Var.k0(j14, j15);
        return b2Var;
    }

    @fg.l
    public static final b2 h() {
        return new b2(0, 1, null);
    }

    @fg.l
    public static final b2 i(long j4, long j5) {
        b2 b2Var = new b2(0, 1, null);
        b2Var.k0(j4, j5);
        return b2Var;
    }

    @fg.l
    public static final b2 j(long j4, long j5, long j6, long j7) {
        b2 b2Var = new b2(0, 1, null);
        b2Var.k0(j4, j5);
        b2Var.k0(j6, j7);
        return b2Var;
    }

    @fg.l
    public static final b2 k(long j4, long j5, long j6, long j7, long j10, long j11) {
        b2 b2Var = new b2(0, 1, null);
        b2Var.k0(j4, j5);
        b2Var.k0(j6, j7);
        b2Var.k0(j10, j11);
        return b2Var;
    }

    @fg.l
    public static final b2 l(long j4, long j5, long j6, long j7, long j10, long j11, long j12, long j13) {
        b2 b2Var = new b2(0, 1, null);
        b2Var.k0(j4, j5);
        b2Var.k0(j6, j7);
        b2Var.k0(j10, j11);
        b2Var.k0(j12, j13);
        return b2Var;
    }

    @fg.l
    public static final b2 m(long j4, long j5, long j6, long j7, long j10, long j11, long j12, long j13, long j14, long j15) {
        b2 b2Var = new b2(0, 1, null);
        b2Var.k0(j4, j5);
        b2Var.k0(j6, j7);
        b2Var.k0(j10, j11);
        b2Var.k0(j12, j13);
        b2Var.k0(j14, j15);
        return b2Var;
    }
}
