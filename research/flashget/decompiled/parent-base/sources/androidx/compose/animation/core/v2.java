package androidx.compose.animation.core;

import androidx.compose.animation.core.s;
import kotlin.Metadata;

/* compiled from: VectorizedAnimationSpec.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u001c\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B)\b\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bB1\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\n\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J/\u0010\u0016\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J/\u0010\u001b\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00028\u00002\u0006\u0010\u0019\u001a\u00028\u00002\u0006\u0010\u001a\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001b\u0010\u0017J/\u0010\u001c\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00028\u00002\u0006\u0010\u0019\u001a\u00028\u00002\u0006\u0010\u001a\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001c\u0010\u0017J'\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00028\u00002\u0006\u0010\u0019\u001a\u00028\u00002\u0006\u0010\u001a\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010!R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u001a\u0010(\u001a\u00020\u000f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0014\u0010*\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010%¨\u0006+"}, d2 = {"Landroidx/compose/animation/core/v2;", "Landroidx/compose/animation/core/s;", "V", "Landroidx/compose/animation/core/p2;", "", "iterations", "Landroidx/compose/animation/core/o2;", "animation", "Landroidx/compose/animation/core/q1;", "repeatMode", "<init>", "(ILandroidx/compose/animation/core/o2;Landroidx/compose/animation/core/q1;)V", "Landroidx/compose/animation/core/z1;", "initialStartOffset", "(ILandroidx/compose/animation/core/o2;Landroidx/compose/animation/core/q1;JLkotlin/jvm/internal/w;)V", "", "playTimeNanos", "o", "(J)J", "start", "startVelocity", "end", "p", "(JLandroidx/compose/animation/core/s;Landroidx/compose/animation/core/s;Landroidx/compose/animation/core/s;)Landroidx/compose/animation/core/s;", "initialValue", "targetValue", "initialVelocity", "m", "j", "b", "(Landroidx/compose/animation/core/s;Landroidx/compose/animation/core/s;Landroidx/compose/animation/core/s;)J", "a", "I", "Landroidx/compose/animation/core/o2;", "c", "Landroidx/compose/animation/core/q1;", "d", "J", "n", "()J", "durationNanos", "e", "initialOffsetNanos", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class v2<V extends s> implements p2<V> {

    /* renamed from: f, reason: collision with root package name */
    public static final int f2954f = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int iterations;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final o2<V> animation;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final q1 repeatMode;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final long durationNanos;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final long initialOffsetNanos;

    public /* synthetic */ v2(int i4, o2 o2Var, q1 q1Var, long j4, kotlin.jvm.internal.w wVar) {
        this(i4, o2Var, q1Var, j4);
    }

    private final long o(long playTimeNanos) {
        long j4 = this.initialOffsetNanos;
        if (playTimeNanos + j4 <= 0) {
            return 0L;
        }
        long j5 = playTimeNanos + j4;
        long min = Math.min(j5 / this.durationNanos, this.iterations - 1);
        return (this.repeatMode == q1.Restart || min % ((long) 2) == 0) ? j5 - (min * this.durationNanos) : ((min + 1) * this.durationNanos) - j5;
    }

    private final V p(long playTimeNanos, V start, V startVelocity, V end) {
        long j4 = this.initialOffsetNanos;
        long j5 = playTimeNanos + j4;
        long j6 = this.durationNanos;
        return j5 > j6 ? j(j6 - j4, start, startVelocity, end) : startVelocity;
    }

    @Override // androidx.compose.animation.core.l2
    public long b(@fg.l V initialValue, @fg.l V targetValue, @fg.l V initialVelocity) {
        return (this.iterations * this.durationNanos) - this.initialOffsetNanos;
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

    private v2(int i4, o2<V> o2Var, q1 q1Var, long j4) {
        this.iterations = i4;
        this.animation = o2Var;
        this.repeatMode = q1Var;
        if (i4 < 1) {
            throw new IllegalArgumentException("Iterations count can't be less than 1");
        }
        this.durationNanos = (o2Var.g() + o2Var.getDelayMillis()) * 1000000;
        this.initialOffsetNanos = j4 * 1000000;
    }

    public /* synthetic */ v2(int i4, o2 o2Var, q1 q1Var, long j4, int i5, kotlin.jvm.internal.w wVar) {
        this(i4, o2Var, (i5 & 4) != 0 ? q1.Restart : q1Var, (i5 & 8) != 0 ? z1.d(0, 0, 2, null) : j4);
    }

    public /* synthetic */ v2(int i4, o2 o2Var, q1 q1Var, int i5, kotlin.jvm.internal.w wVar) {
        this(i4, o2Var, (i5 & 4) != 0 ? q1.Restart : q1Var);
    }

    @kotlin.k(level = kotlin.m.HIDDEN, message = "This method has been deprecated in favor of the constructor that accepts start offset.")
    public /* synthetic */ v2(int i4, o2 o2Var, q1 q1Var) {
        this(i4, o2Var, q1Var, z1.d(0, 0, 2, null));
    }
}
