package androidx.compose.animation.core;

import androidx.compose.animation.core.s;
import kotlin.Metadata;

/* compiled from: Animatable.kt */
@androidx.compose.runtime.internal.u(parameters = 4)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u0004B#\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0012\u001a\u0004\b\u000e\u0010\u0013¨\u0006\u0014"}, d2 = {"Landroidx/compose/animation/core/i;", "T", "Landroidx/compose/animation/core/s;", "V", "", "Landroidx/compose/animation/core/m;", "endState", "Landroidx/compose/animation/core/g;", "endReason", "<init>", "(Landroidx/compose/animation/core/m;Landroidx/compose/animation/core/g;)V", "", "toString", "()Ljava/lang/String;", "a", "Landroidx/compose/animation/core/m;", "b", "()Landroidx/compose/animation/core/m;", "Landroidx/compose/animation/core/g;", "()Landroidx/compose/animation/core/g;", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class i<T, V extends s> {

    /* renamed from: c, reason: collision with root package name */
    public static final int f2741c = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final m<T, V> endState;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final g endReason;

    public i(@fg.l m<T, V> mVar, @fg.l g gVar) {
        this.endState = mVar;
        this.endReason = gVar;
    }

    @fg.l
    /* renamed from: a, reason: from getter */
    public final g getEndReason() {
        return this.endReason;
    }

    @fg.l
    public final m<T, V> b() {
        return this.endState;
    }

    @fg.l
    public String toString() {
        return "AnimationResult(endReason=" + this.endReason + ", endState=" + this.endState + ')';
    }
}
