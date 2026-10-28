package androidx.compose.animation.core;

import androidx.compose.animation.core.s;
import kotlin.Metadata;

/* compiled from: Animation.kt */
@androidx.compose.runtime.internal.u(parameters = 3)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004B9\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u0006\u0010\t\u001a\u00028\u0000\u0012\u0006\u0010\n\u001a\u00028\u0001¢\u0006\u0004\b\u000b\u0010\fB;\b\u0016\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\r\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u0006\u0010\t\u001a\u00028\u0000\u0012\u0006\u0010\n\u001a\u00028\u0001¢\u0006\u0004\b\u000b\u0010\u000eB;\b\u0016\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\r\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u0006\u0010\t\u001a\u00028\u0000\u0012\u0006\u0010\u000f\u001a\u00028\u0000¢\u0006\u0004\b\u000b\u0010\u0010J\u0017\u0010\u0013\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00028\u00012\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R&\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\t\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010\"\u001a\u00028\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0017\u0010\n\u001a\u00028\u00018\u0006¢\u0006\f\n\u0004\b\u001a\u0010!\u001a\u0004\b#\u0010$R\u0014\u0010%\u001a\u00028\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010!R\u001a\u0010'\u001a\u00028\u00008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010\u001d\u001a\u0004\b&\u0010\u001fR\u001a\u0010+\u001a\u00020\u00118VX\u0096\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b \u0010*R\u001a\u0010/\u001a\u00020,8\u0016X\u0096D¢\u0006\f\n\u0004\b\u001e\u0010-\u001a\u0004\b\u0017\u0010.¨\u00060"}, d2 = {"Landroidx/compose/animation/core/y;", "T", "Landroidx/compose/animation/core/s;", "V", "Landroidx/compose/animation/core/e;", "Landroidx/compose/animation/core/n2;", "animationSpec", "Landroidx/compose/animation/core/i2;", "typeConverter", "initialValue", "initialVelocityVector", "<init>", "(Landroidx/compose/animation/core/n2;Landroidx/compose/animation/core/i2;Ljava/lang/Object;Landroidx/compose/animation/core/s;)V", "Landroidx/compose/animation/core/z;", "(Landroidx/compose/animation/core/z;Landroidx/compose/animation/core/i2;Ljava/lang/Object;Landroidx/compose/animation/core/s;)V", "initialVelocity", "(Landroidx/compose/animation/core/z;Landroidx/compose/animation/core/i2;Ljava/lang/Object;Ljava/lang/Object;)V", "", "playTimeNanos", "f", "(J)Ljava/lang/Object;", "b", "(J)Landroidx/compose/animation/core/s;", "a", "Landroidx/compose/animation/core/n2;", "Landroidx/compose/animation/core/i2;", "e", "()Landroidx/compose/animation/core/i2;", "c", "Ljava/lang/Object;", "i", "()Ljava/lang/Object;", "d", "Landroidx/compose/animation/core/s;", "initialValueVector", "j", "()Landroidx/compose/animation/core/s;", "endVelocity", "g", "targetValue", "h", "J", "()J", "durationNanos", "", "Z", "()Z", "isInfinite", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class y<T, V extends s> implements e<T, V> {

    /* renamed from: j, reason: collision with root package name */
    public static final int f2988j = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final n2<V> animationSpec;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final i2<T, V> typeConverter;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final T initialValue;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final V initialValueVector;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final V initialVelocityVector;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final V endVelocity;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final T targetValue;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final long durationNanos;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final boolean isInfinite;

    public y(@fg.l n2<V> n2Var, @fg.l i2<T, V> i2Var, T t4, @fg.l V v4) {
        this.animationSpec = n2Var;
        this.typeConverter = i2Var;
        this.initialValue = t4;
        V invoke = i2Var.a().invoke(t4);
        this.initialValueVector = invoke;
        this.initialVelocityVector = (V) t.e(v4);
        this.targetValue = i2Var.b().invoke(n2Var.d(invoke, v4));
        long c5 = n2Var.c(invoke, v4);
        this.durationNanos = c5;
        V v5 = (V) t.e(n2Var.b(c5, invoke, v4));
        this.endVelocity = v5;
        int size = v5.getSize();
        for (int i4 = 0; i4 < size; i4++) {
            V v6 = this.endVelocity;
            v6.e(i4, kotlin.ranges.s.H(v6.a(i4), -this.animationSpec.getAbsVelocityThreshold(), this.animationSpec.getAbsVelocityThreshold()));
        }
    }

    @Override // androidx.compose.animation.core.e
    /* renamed from: a, reason: from getter */
    public boolean getIsInfinite() {
        return this.isInfinite;
    }

    @Override // androidx.compose.animation.core.e
    @fg.l
    public V b(long playTimeNanos) {
        return !c(playTimeNanos) ? this.animationSpec.b(playTimeNanos, this.initialValueVector, this.initialVelocityVector) : this.endVelocity;
    }

    @Override // androidx.compose.animation.core.e
    /* renamed from: d, reason: from getter */
    public long getDurationNanos() {
        return this.durationNanos;
    }

    @Override // androidx.compose.animation.core.e
    @fg.l
    public i2<T, V> e() {
        return this.typeConverter;
    }

    @Override // androidx.compose.animation.core.e
    public T f(long playTimeNanos) {
        return !c(playTimeNanos) ? (T) this.typeConverter.b().invoke(this.animationSpec.e(playTimeNanos, this.initialValueVector, this.initialVelocityVector)) : this.targetValue;
    }

    @Override // androidx.compose.animation.core.e
    public T g() {
        return this.targetValue;
    }

    public final T i() {
        return this.initialValue;
    }

    @fg.l
    public final V j() {
        return this.initialVelocityVector;
    }

    public y(@fg.l z<T> zVar, @fg.l i2<T, V> i2Var, T t4, @fg.l V v4) {
        this(zVar.a(i2Var), i2Var, t4, v4);
    }

    public y(@fg.l z<T> zVar, @fg.l i2<T, V> i2Var, T t4, T t5) {
        this(zVar.a(i2Var), i2Var, t4, i2Var.a().invoke(t5));
    }
}
