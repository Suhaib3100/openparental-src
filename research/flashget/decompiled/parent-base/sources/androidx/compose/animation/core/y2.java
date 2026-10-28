package androidx.compose.animation.core;

import androidx.compose.animation.core.s;
import kotlin.Metadata;

/* compiled from: VectorizedAnimationSpec.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B%\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ/\u0010\u0010\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J/\u0010\u0012\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0012\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0006\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Landroidx/compose/animation/core/y2;", "Landroidx/compose/animation/core/s;", "V", "Landroidx/compose/animation/core/o2;", "", "durationMillis", "delayMillis", "Landroidx/compose/animation/core/d0;", "easing", "<init>", "(IILandroidx/compose/animation/core/d0;)V", "", "playTimeNanos", "initialValue", "targetValue", "initialVelocity", "m", "(JLandroidx/compose/animation/core/s;Landroidx/compose/animation/core/s;Landroidx/compose/animation/core/s;)Landroidx/compose/animation/core/s;", "j", "a", "I", "g", "()I", "b", "e", "c", "Landroidx/compose/animation/core/d0;", "n", "()Landroidx/compose/animation/core/d0;", "Landroidx/compose/animation/core/q2;", "d", "Landroidx/compose/animation/core/q2;", "anim", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class y2<V extends s> implements o2<V> {

    /* renamed from: e, reason: collision with root package name */
    public static final int f3033e = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int durationMillis;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int delayMillis;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final d0 easing;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final q2<V> anim;

    public y2() {
        this(0, 0, null, 7, null);
    }

    @Override // androidx.compose.animation.core.o2
    /* renamed from: e, reason: from getter */
    public int getDelayMillis() {
        return this.delayMillis;
    }

    @Override // androidx.compose.animation.core.o2
    /* renamed from: g, reason: from getter */
    public int getDurationMillis() {
        return this.durationMillis;
    }

    @Override // androidx.compose.animation.core.l2
    @fg.l
    public V j(long playTimeNanos, @fg.l V initialValue, @fg.l V targetValue, @fg.l V initialVelocity) {
        return this.anim.j(playTimeNanos, initialValue, targetValue, initialVelocity);
    }

    @Override // androidx.compose.animation.core.l2
    @fg.l
    public V m(long playTimeNanos, @fg.l V initialValue, @fg.l V targetValue, @fg.l V initialVelocity) {
        return this.anim.m(playTimeNanos, initialValue, targetValue, initialVelocity);
    }

    @fg.l
    /* renamed from: n, reason: from getter */
    public final d0 getEasing() {
        return this.easing;
    }

    public y2(int i4, int i5, @fg.l d0 d0Var) {
        this.durationMillis = i4;
        this.delayMillis = i5;
        this.easing = d0Var;
        this.anim = new q2<>(new v0(i4, i5, d0Var));
    }

    public /* synthetic */ y2(int i4, int i5, d0 d0Var, int i6, kotlin.jvm.internal.w wVar) {
        this((i6 & 1) != 0 ? 300 : i4, (i6 & 2) != 0 ? 0 : i5, (i6 & 4) != 0 ? m0.d() : d0Var);
    }
}
