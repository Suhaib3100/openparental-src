package androidx.compose.animation.core;

import androidx.compose.animation.core.s;
import kotlin.Metadata;

/* compiled from: VectorizedAnimationSpec.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B!\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB)\b\u0016\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\t\u0010\fJ(\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00028\u0000H\u0096\u0001¢\u0006\u0004\b\u0011\u0010\u0012J(\u0010\u0013\u001a\u00028\u00002\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00028\u0000H\u0096\u0001¢\u0006\u0004\b\u0013\u0010\u0014J0\u0010\u0016\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00020\u00102\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00028\u0000H\u0096\u0001¢\u0006\u0004\b\u0016\u0010\u0017J0\u0010\u0018\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00020\u00102\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00028\u0000H\u0096\u0001¢\u0006\u0004\b\u0018\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001a\u001a\u0004\b\u001d\u0010\u001cR\u0014\u0010 \u001a\u00020\u001e8VX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001f¨\u0006!"}, d2 = {"Landroidx/compose/animation/core/x2;", "Landroidx/compose/animation/core/s;", "V", "Landroidx/compose/animation/core/p2;", "", "dampingRatio", "stiffness", "Landroidx/compose/animation/core/u;", "anims", "<init>", "(FFLandroidx/compose/animation/core/u;)V", "visibilityThreshold", "(FFLandroidx/compose/animation/core/s;)V", "initialValue", "targetValue", "initialVelocity", "", "b", "(Landroidx/compose/animation/core/s;Landroidx/compose/animation/core/s;Landroidx/compose/animation/core/s;)J", "f", "(Landroidx/compose/animation/core/s;Landroidx/compose/animation/core/s;Landroidx/compose/animation/core/s;)Landroidx/compose/animation/core/s;", "playTimeNanos", "m", "(JLandroidx/compose/animation/core/s;Landroidx/compose/animation/core/s;Landroidx/compose/animation/core/s;)Landroidx/compose/animation/core/s;", "j", "a", "F", "n", "()F", "o", "", "()Z", "isInfinite", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class x2<V extends s> implements p2<V> {

    /* renamed from: d, reason: collision with root package name */
    public static final int f2984d = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final float dampingRatio;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final float stiffness;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ q2<V> f2987c;

    private x2(float f4, float f5, u uVar) {
        this.dampingRatio = f4;
        this.stiffness = f5;
        this.f2987c = new q2<>(uVar);
    }

    @Override // androidx.compose.animation.core.p2, androidx.compose.animation.core.l2
    public boolean a() {
        this.f2987c.getClass();
        return false;
    }

    @Override // androidx.compose.animation.core.l2
    public long b(@fg.l V initialValue, @fg.l V targetValue, @fg.l V initialVelocity) {
        return this.f2987c.b(initialValue, targetValue, initialVelocity);
    }

    @Override // androidx.compose.animation.core.l2
    @fg.l
    public V f(@fg.l V initialValue, @fg.l V targetValue, @fg.l V initialVelocity) {
        return this.f2987c.f(initialValue, targetValue, initialVelocity);
    }

    @Override // androidx.compose.animation.core.l2
    @fg.l
    public V j(long playTimeNanos, @fg.l V initialValue, @fg.l V targetValue, @fg.l V initialVelocity) {
        return this.f2987c.j(playTimeNanos, initialValue, targetValue, initialVelocity);
    }

    @Override // androidx.compose.animation.core.l2
    @fg.l
    public V m(long playTimeNanos, @fg.l V initialValue, @fg.l V targetValue, @fg.l V initialVelocity) {
        return this.f2987c.m(playTimeNanos, initialValue, targetValue, initialVelocity);
    }

    /* renamed from: n, reason: from getter */
    public final float getDampingRatio() {
        return this.dampingRatio;
    }

    /* renamed from: o, reason: from getter */
    public final float getStiffness() {
        return this.stiffness;
    }

    public /* synthetic */ x2(float f4, float f5, s sVar, int i4, kotlin.jvm.internal.w wVar) {
        this((i4 & 1) != 0 ? 1.0f : f4, (i4 & 2) != 0 ? 1500.0f : f5, (i4 & 4) != 0 ? null : sVar);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public x2(float r1, float r2, @fg.m V r3) {
        /*
            r0 = this;
            androidx.compose.animation.core.u r3 = androidx.compose.animation.core.m2.a(r3, r1, r2)
            r0.<init>(r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.x2.<init>(float, float, androidx.compose.animation.core.s):void");
    }
}
