package androidx.compose.animation.core;

import kotlin.Metadata;

/* compiled from: Animation.kt */
@Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u001a5\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001aE\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\f\"\b\b\u0000\u0010\u0002*\u00020\u0001*\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u0000¢\u0006\u0004\b\r\u0010\u000e\u001ac\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\f\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00112\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a3\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u0010\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020\u00162\b\b\u0002\u0010\u000b\u001a\u00020\u0016¢\u0006\u0004\b\u0019\u0010\u001a\"\u0014\u0010\u001c\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0019\u0010\u001b\"\u0014\u0010\u001e\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001d\u0010\u001b\" \u0010!\u001a\u00020\u0004*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00038@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"T", "Landroidx/compose/animation/core/s;", "V", "Landroidx/compose/animation/core/e;", "", "playTimeNanos", "f", "(Landroidx/compose/animation/core/e;J)Ljava/lang/Object;", "Landroidx/compose/animation/core/l2;", "initialValue", "targetValue", "initialVelocity", "Landroidx/compose/animation/core/d2;", "d", "(Landroidx/compose/animation/core/l2;Landroidx/compose/animation/core/s;Landroidx/compose/animation/core/s;Landroidx/compose/animation/core/s;)Landroidx/compose/animation/core/d2;", "Landroidx/compose/animation/core/k;", "animationSpec", "Landroidx/compose/animation/core/i2;", "typeConverter", "c", "(Landroidx/compose/animation/core/k;Landroidx/compose/animation/core/i2;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Landroidx/compose/animation/core/d2;", "Landroidx/compose/animation/core/r0;", "", "Landroidx/compose/animation/core/y;", "Landroidx/compose/animation/core/o;", "a", "(Landroidx/compose/animation/core/r0;FF)Landroidx/compose/animation/core/y;", "J", "MillisToNanos", "b", "SecondsToMillis", "e", "(Landroidx/compose/animation/core/e;)J", "durationMillis", "animation-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final long f2730a = 1000000;

    /* renamed from: b, reason: collision with root package name */
    public static final long f2731b = 1000;

    /* JADX INFO: Add missing generic type declarations: [V] */
    /* compiled from: Animation.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0003\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/animation/core/s;", "V", "it", "a", "(Landroidx/compose/animation/core/s;)Landroidx/compose/animation/core/s;"}, k = 3, mv = {1, 8, 0})
    static final class a<V> extends kotlin.jvm.internal.n0 implements ld.l<V, V> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f2732b = new a(1);

        a() {
            super(1);
        }

        /* JADX WARN: Incorrect return type in method signature: (TV;)TV; */
        @fg.l
        public final s a(@fg.l s sVar) {
            return sVar;
        }

        @Override // ld.l
        public Object invoke(Object obj) {
            return (s) obj;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [V] */
    /* compiled from: Animation.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0003\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/animation/core/s;", "V", "it", "a", "(Landroidx/compose/animation/core/s;)Landroidx/compose/animation/core/s;"}, k = 3, mv = {1, 8, 0})
    static final class b<V> extends kotlin.jvm.internal.n0 implements ld.l<V, V> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f2733b = new b(1);

        b() {
            super(1);
        }

        /* JADX WARN: Incorrect return type in method signature: (TV;)TV; */
        @fg.l
        public final s a(@fg.l s sVar) {
            return sVar;
        }

        @Override // ld.l
        public Object invoke(Object obj) {
            return (s) obj;
        }
    }

    @fg.l
    public static final y<Float, o> a(@fg.l r0 r0Var, float f4, float f5) {
        return new y<>(new a0(r0Var), k2.i(kotlin.jvm.internal.a0.f75283a), Float.valueOf(f4), new o(f5));
    }

    public static /* synthetic */ y b(r0 r0Var, float f4, float f5, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            f5 = 0.0f;
        }
        return a(r0Var, f4, f5);
    }

    @fg.l
    public static final <T, V extends s> d2<T, V> c(@fg.l k<T> kVar, @fg.l i2<T, V> i2Var, T t4, T t5, T t6) {
        return new d2<>(kVar, i2Var, t4, t5, i2Var.a().invoke(t6));
    }

    @fg.l
    public static final <V extends s> d2<V, V> d(@fg.l l2<V> l2Var, @fg.l V v4, @fg.l V v5, @fg.l V v6) {
        return new d2<>(l2Var, (i2<V, V>) k2.a(a.f2732b, b.f2733b), v4, v5, v6);
    }

    public static final long e(@fg.l e<?, ?> eVar) {
        return eVar.getDurationNanos() / 1000000;
    }

    public static final <T, V extends s> T f(@fg.l e<T, V> eVar, long j4) {
        return eVar.e().b().invoke(eVar.b(j4));
    }
}
