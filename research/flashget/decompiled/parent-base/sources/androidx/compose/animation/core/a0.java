package androidx.compose.animation.core;

import kotlin.Metadata;

/* compiled from: DecayAnimationSpec.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J3\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000b\"\b\b\u0001\u0010\b*\u00020\u00072\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\tH\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/compose/animation/core/a0;", "T", "Landroidx/compose/animation/core/z;", "Landroidx/compose/animation/core/r0;", "floatDecaySpec", "<init>", "(Landroidx/compose/animation/core/r0;)V", "Landroidx/compose/animation/core/s;", "V", "Landroidx/compose/animation/core/i2;", "typeConverter", "Landroidx/compose/animation/core/n2;", "a", "(Landroidx/compose/animation/core/i2;)Landroidx/compose/animation/core/n2;", "Landroidx/compose/animation/core/r0;", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class a0<T> implements z<T> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final r0 floatDecaySpec;

    public a0(@fg.l r0 r0Var) {
        this.floatDecaySpec = r0Var;
    }

    @Override // androidx.compose.animation.core.z
    @fg.l
    public <V extends s> n2<V> a(@fg.l i2<T, V> typeConverter) {
        return new r2(this.floatDecaySpec);
    }
}
