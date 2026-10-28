package androidx.compose.animation.core;

import androidx.compose.animation.core.s;
import kotlin.Metadata;

/* compiled from: DecayAnimationSpec.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0012\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\f\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000e\u001a\u00020\b2\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0010\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0010\u0010\rJ\u001f\u0010\u0011\u001a\u00028\u00002\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0018\u001a\u00028\u00008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0010\u0010\u0017R\u0016\u0010\u0019\u001a\u00028\u00008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000e\u0010\u0017R\u0016\u0010\u001a\u001a\u00028\u00008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0011\u0010\u0017R\u001a\u0010\u001e\u001a\u00020\u001b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\u001c\u001a\u0004\b\u0013\u0010\u001d¨\u0006\u001f"}, d2 = {"Landroidx/compose/animation/core/r2;", "Landroidx/compose/animation/core/s;", "V", "Landroidx/compose/animation/core/n2;", "Landroidx/compose/animation/core/r0;", "floatDecaySpec", "<init>", "(Landroidx/compose/animation/core/r0;)V", "", "playTimeNanos", "initialValue", "initialVelocity", "e", "(JLandroidx/compose/animation/core/s;Landroidx/compose/animation/core/s;)Landroidx/compose/animation/core/s;", "c", "(Landroidx/compose/animation/core/s;Landroidx/compose/animation/core/s;)J", "b", "d", "(Landroidx/compose/animation/core/s;Landroidx/compose/animation/core/s;)Landroidx/compose/animation/core/s;", "a", "Landroidx/compose/animation/core/r0;", "f", "()Landroidx/compose/animation/core/r0;", "Landroidx/compose/animation/core/s;", "valueVector", "velocityVector", "targetVector", "", "F", "()F", "absVelocityThreshold", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class r2<V extends s> implements n2<V> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final r0 floatDecaySpec;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private V valueVector;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private V velocityVector;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private V targetVector;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final float absVelocityThreshold;

    public r2(@fg.l r0 r0Var) {
        this.floatDecaySpec = r0Var;
        this.absVelocityThreshold = r0Var.getAbsVelocityThreshold();
    }

    @Override // androidx.compose.animation.core.n2
    /* renamed from: a, reason: from getter */
    public float getAbsVelocityThreshold() {
        return this.absVelocityThreshold;
    }

    @Override // androidx.compose.animation.core.n2
    @fg.l
    public V b(long playTimeNanos, @fg.l V initialValue, @fg.l V initialVelocity) {
        if (this.velocityVector == null) {
            this.velocityVector = (V) t.g(initialValue);
        }
        V v4 = this.velocityVector;
        if (v4 == null) {
            kotlin.jvm.internal.l0.S("velocityVector");
            v4 = null;
        }
        int size = v4.getSize();
        for (int i4 = 0; i4 < size; i4++) {
            V v5 = this.velocityVector;
            if (v5 == null) {
                kotlin.jvm.internal.l0.S("velocityVector");
                v5 = null;
            }
            v5.e(i4, this.floatDecaySpec.b(playTimeNanos, initialValue.a(i4), initialVelocity.a(i4)));
        }
        V v6 = this.velocityVector;
        if (v6 != null) {
            return v6;
        }
        kotlin.jvm.internal.l0.S("velocityVector");
        return null;
    }

    @Override // androidx.compose.animation.core.n2
    public long c(@fg.l V initialValue, @fg.l V initialVelocity) {
        if (this.velocityVector == null) {
            this.velocityVector = (V) t.g(initialValue);
        }
        V v4 = this.velocityVector;
        if (v4 == null) {
            kotlin.jvm.internal.l0.S("velocityVector");
            v4 = null;
        }
        int size = v4.getSize();
        long j4 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            j4 = Math.max(j4, this.floatDecaySpec.c(initialValue.a(i4), initialVelocity.a(i4)));
        }
        return j4;
    }

    @Override // androidx.compose.animation.core.n2
    @fg.l
    public V d(@fg.l V initialValue, @fg.l V initialVelocity) {
        if (this.targetVector == null) {
            this.targetVector = (V) t.g(initialValue);
        }
        V v4 = this.targetVector;
        if (v4 == null) {
            kotlin.jvm.internal.l0.S("targetVector");
            v4 = null;
        }
        int size = v4.getSize();
        for (int i4 = 0; i4 < size; i4++) {
            V v5 = this.targetVector;
            if (v5 == null) {
                kotlin.jvm.internal.l0.S("targetVector");
                v5 = null;
            }
            v5.e(i4, this.floatDecaySpec.d(initialValue.a(i4), initialVelocity.a(i4)));
        }
        V v6 = this.targetVector;
        if (v6 != null) {
            return v6;
        }
        kotlin.jvm.internal.l0.S("targetVector");
        return null;
    }

    @Override // androidx.compose.animation.core.n2
    @fg.l
    public V e(long playTimeNanos, @fg.l V initialValue, @fg.l V initialVelocity) {
        if (this.valueVector == null) {
            this.valueVector = (V) t.g(initialValue);
        }
        V v4 = this.valueVector;
        if (v4 == null) {
            kotlin.jvm.internal.l0.S("valueVector");
            v4 = null;
        }
        int size = v4.getSize();
        for (int i4 = 0; i4 < size; i4++) {
            V v5 = this.valueVector;
            if (v5 == null) {
                kotlin.jvm.internal.l0.S("valueVector");
                v5 = null;
            }
            v5.e(i4, this.floatDecaySpec.e(playTimeNanos, initialValue.a(i4), initialVelocity.a(i4)));
        }
        V v6 = this.valueVector;
        if (v6 != null) {
            return v6;
        }
        kotlin.jvm.internal.l0.S("valueVector");
        return null;
    }

    @fg.l
    /* renamed from: f, reason: from getter */
    public final r0 getFloatDecaySpec() {
        return this.floatDecaySpec;
    }
}
