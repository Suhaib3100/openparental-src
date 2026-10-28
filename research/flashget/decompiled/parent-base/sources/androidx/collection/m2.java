package androidx.collection;

import kotlin.Metadata;

/* compiled from: ObjectFloatMap.kt */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0002\b\u0003\u001a\u0019\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0019\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000¢\u0006\u0004\b\u0004\u0010\u0003\u001a)\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t\u001a9\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\r\u001aI\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011\u001aY\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u0015\u001ai\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00020\u0006¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0019\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a\"\u0004\b\u0000\u0010\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a)\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u001d\u0010\u001e\u001a9\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u001f\u0010 \u001aI\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b!\u0010\"\u001aY\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00020\u0006¢\u0006\u0004\b#\u0010$\u001ai\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00020\u0006¢\u0006\u0004\b%\u0010&\"\u001c\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010'0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010(¨\u0006*"}, d2 = {"K", "Landroidx/collection/l2;", "a", "()Landroidx/collection/l2;", "h", "key1", "", "value1", "i", "(Ljava/lang/Object;F)Landroidx/collection/l2;", "key2", "value2", "j", "(Ljava/lang/Object;FLjava/lang/Object;F)Landroidx/collection/l2;", "key3", "value3", "k", "(Ljava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;F)Landroidx/collection/l2;", "key4", "value4", "l", "(Ljava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;F)Landroidx/collection/l2;", "key5", "value5", "m", "(Ljava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;F)Landroidx/collection/l2;", "Landroidx/collection/f2;", "b", "()Landroidx/collection/f2;", "c", "(Ljava/lang/Object;F)Landroidx/collection/f2;", "d", "(Ljava/lang/Object;FLjava/lang/Object;F)Landroidx/collection/f2;", "e", "(Ljava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;F)Landroidx/collection/f2;", "f", "(Ljava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;F)Landroidx/collection/f2;", "g", "(Ljava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;F)Landroidx/collection/f2;", "", "Landroidx/collection/f2;", "EmptyObjectFloatMap", "collection"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class m2 {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private static final f2<Object> f2343a = new f2<>(0);

    @fg.l
    public static final <K> l2<K> a() {
        f2<Object> f2Var = f2343a;
        kotlin.jvm.internal.l0.n(f2Var, "null cannot be cast to non-null type androidx.collection.ObjectFloatMap<K of androidx.collection.ObjectFloatMapKt.emptyObjectFloatMap>");
        return f2Var;
    }

    @fg.l
    public static final <K> f2<K> b() {
        return new f2<>(0, 1, null);
    }

    @fg.l
    public static final <K> f2<K> c(K k4, float f4) {
        f2<K> f2Var = new f2<>(0, 1, null);
        f2Var.l0(k4, f4);
        return f2Var;
    }

    @fg.l
    public static final <K> f2<K> d(K k4, float f4, K k5, float f5) {
        f2<K> f2Var = new f2<>(0, 1, null);
        f2Var.l0(k4, f4);
        f2Var.l0(k5, f5);
        return f2Var;
    }

    @fg.l
    public static final <K> f2<K> e(K k4, float f4, K k5, float f5, K k6, float f6) {
        f2<K> f2Var = new f2<>(0, 1, null);
        f2Var.l0(k4, f4);
        f2Var.l0(k5, f5);
        f2Var.l0(k6, f6);
        return f2Var;
    }

    @fg.l
    public static final <K> f2<K> f(K k4, float f4, K k5, float f5, K k6, float f6, K k7, float f7) {
        f2<K> f2Var = new f2<>(0, 1, null);
        f2Var.l0(k4, f4);
        f2Var.l0(k5, f5);
        f2Var.l0(k6, f6);
        f2Var.l0(k7, f7);
        return f2Var;
    }

    @fg.l
    public static final <K> f2<K> g(K k4, float f4, K k5, float f5, K k6, float f6, K k7, float f7, K k10, float f10) {
        f2<K> f2Var = new f2<>(0, 1, null);
        f2Var.l0(k4, f4);
        f2Var.l0(k5, f5);
        f2Var.l0(k6, f6);
        f2Var.l0(k7, f7);
        f2Var.l0(k10, f10);
        return f2Var;
    }

    @fg.l
    public static final <K> l2<K> h() {
        f2<Object> f2Var = f2343a;
        kotlin.jvm.internal.l0.n(f2Var, "null cannot be cast to non-null type androidx.collection.ObjectFloatMap<K of androidx.collection.ObjectFloatMapKt.objectFloatMap>");
        return f2Var;
    }

    @fg.l
    public static final <K> l2<K> i(K k4, float f4) {
        f2 f2Var = new f2(0, 1, null);
        f2Var.l0(k4, f4);
        return f2Var;
    }

    @fg.l
    public static final <K> l2<K> j(K k4, float f4, K k5, float f5) {
        f2 f2Var = new f2(0, 1, null);
        f2Var.l0(k4, f4);
        f2Var.l0(k5, f5);
        return f2Var;
    }

    @fg.l
    public static final <K> l2<K> k(K k4, float f4, K k5, float f5, K k6, float f6) {
        f2 f2Var = new f2(0, 1, null);
        f2Var.l0(k4, f4);
        f2Var.l0(k5, f5);
        f2Var.l0(k6, f6);
        return f2Var;
    }

    @fg.l
    public static final <K> l2<K> l(K k4, float f4, K k5, float f5, K k6, float f6, K k7, float f7) {
        f2 f2Var = new f2(0, 1, null);
        f2Var.l0(k4, f4);
        f2Var.l0(k5, f5);
        f2Var.l0(k6, f6);
        f2Var.l0(k7, f7);
        return f2Var;
    }

    @fg.l
    public static final <K> l2<K> m(K k4, float f4, K k5, float f5, K k6, float f6, K k7, float f7, K k10, float f10) {
        f2 f2Var = new f2(0, 1, null);
        f2Var.l0(k4, f4);
        f2Var.l0(k5, f5);
        f2Var.l0(k6, f6);
        f2Var.l0(k7, f7);
        f2Var.l0(k10, f10);
        return f2Var;
    }
}
