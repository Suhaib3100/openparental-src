package androidx.compose.animation.core;

import androidx.compose.animation.core.s;
import kotlin.Metadata;

/* compiled from: VectorizedAnimationSpec.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B!\b\u0017\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB)\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J/\u0010\u0014\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J/\u0010\u0019\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00028\u00002\u0006\u0010\u0018\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0019\u0010\u0015J/\u0010\u001a\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00028\u00002\u0006\u0010\u0018\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001a\u0010\u0015J'\u0010\u001b\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00028\u00002\u0006\u0010\u0018\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001fR\u001a\u0010$\u001a\u00020\r8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0014\u0010&\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010!R\u0014\u0010)\u001a\u00020'8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010(¨\u0006*"}, d2 = {"Landroidx/compose/animation/core/s2;", "Landroidx/compose/animation/core/s;", "V", "Landroidx/compose/animation/core/l2;", "Landroidx/compose/animation/core/o2;", "animation", "Landroidx/compose/animation/core/q1;", "repeatMode", "<init>", "(Landroidx/compose/animation/core/o2;Landroidx/compose/animation/core/q1;)V", "Landroidx/compose/animation/core/z1;", "initialStartOffset", "(Landroidx/compose/animation/core/o2;Landroidx/compose/animation/core/q1;JLkotlin/jvm/internal/w;)V", "", "playTimeNanos", "o", "(J)J", "start", "startVelocity", "end", "p", "(JLandroidx/compose/animation/core/s;Landroidx/compose/animation/core/s;Landroidx/compose/animation/core/s;)Landroidx/compose/animation/core/s;", "initialValue", "targetValue", "initialVelocity", "m", "j", "b", "(Landroidx/compose/animation/core/s;Landroidx/compose/animation/core/s;Landroidx/compose/animation/core/s;)J", "a", "Landroidx/compose/animation/core/o2;", "Landroidx/compose/animation/core/q1;", "c", "J", "n", "()J", "durationNanos", "d", "initialOffsetNanos", "", "()Z", "isInfinite", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class s2<V extends s> implements l2<V> {

    /* renamed from: e, reason: collision with root package name */
    public static final int f2904e = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final o2<V> animation;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final q1 repeatMode;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final long durationNanos;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final long initialOffsetNanos;

    public /* synthetic */ s2(o2 o2Var, q1 q1Var, long j4, kotlin.jvm.internal.w wVar) {
        this(o2Var, q1Var, j4);
    }

    private final long o(long playTimeNanos) {
        long j4 = this.initialOffsetNanos;
        if (playTimeNanos + j4 <= 0) {
            return 0L;
        }
        long j5 = playTimeNanos + j4;
        long j6 = this.durationNanos;
        long j7 = j5 / j6;
        return (this.repeatMode == q1.Restart || j7 % ((long) 2) == 0) ? j5 - (j7 * j6) : ((j7 + 1) * j6) - j5;
    }

    private final V p(long playTimeNanos, V start, V startVelocity, V end) {
        long j4 = this.initialOffsetNanos;
        long j5 = playTimeNanos + j4;
        long j6 = this.durationNanos;
        return j5 > j6 ? this.animation.j(j6 - j4, start, end, startVelocity) : startVelocity;
    }

    @Override // androidx.compose.animation.core.l2
    public boolean a() {
        return true;
    }

    @Override // androidx.compose.animation.core.l2
    public long b(@fg.l V initialValue, @fg.l V targetValue, @fg.l V initialVelocity) {
        return Long.MAX_VALUE;
    }

    @Override // androidx.compose.animation.core.l2
    @fg.l
    public V j(long playTimeNanos, @fg.l V initialValue, @fg.l V targetValue, @fg.l V initialVelocity) {
        return this.animation.j(o(playTimeNanos), initialValue, targetValue, p(playTimeNanos, initialValue, initialVelocity, targetValue));
    }

    @Override // androidx.compose.animation.core.l2
    @fg.l
    public V m(long playTimeNanos, @fg.l V initialValue, @fg.l V targetValue, @fg.l V initialVelocity) {
        return this.animation.m(o(playTimeNanos), initialValue, targetValue, p(playTimeNanos, initialValue, initialVelocity, targetValue));
    }

    /* renamed from: n, reason: from getter */
    public final long getDurationNanos() {
        return this.durationNanos;
    }

    private s2(o2<V> o2Var, q1 q1Var, long j4) {
        this.animation = o2Var;
        this.repeatMode = q1Var;
        this.durationNanos = (o2Var.g() + o2Var.getDelayMillis()) * 1000000;
        this.initialOffsetNanos = j4 * 1000000;
    }

    public /* synthetic */ s2(o2 o2Var, q1 q1Var, long j4, int i4, kotlin.jvm.internal.w wVar) {
        this(o2Var, (i4 & 2) != 0 ? q1.Restart : q1Var, (i4 & 4) != 0 ? z1.d(0, 0, 2, null) : j4);
    }

    public /* synthetic */ s2(o2 o2Var, q1 q1Var, int i4, kotlin.jvm.internal.w wVar) {
        this(o2Var, (i4 & 2) != 0 ? q1.Restart : q1Var);
    }

    @kotlin.k(level = kotlin.m.HIDDEN, message = "This method has been deprecated in favor of the constructor that accepts start offset.")
    public /* synthetic */ s2(o2 o2Var, q1 q1Var) {
        this(o2Var, q1Var, z1.d(0, 0, 2, null));
    }
}
