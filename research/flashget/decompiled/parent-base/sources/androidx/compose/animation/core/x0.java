package androidx.compose.animation.core;

import kotlin.Metadata;

/* compiled from: AnimationSpec.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B!\b\u0017\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB)\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000bJ3\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00010\u0010\"\b\b\u0001\u0010\r*\u00020\f2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001d\u0010\n\u001a\u00020\t8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006&"}, d2 = {"Landroidx/compose/animation/core/x0;", "T", "Landroidx/compose/animation/core/k;", "Landroidx/compose/animation/core/c0;", "animation", "Landroidx/compose/animation/core/q1;", "repeatMode", "<init>", "(Landroidx/compose/animation/core/c0;Landroidx/compose/animation/core/q1;)V", "Landroidx/compose/animation/core/z1;", "initialStartOffset", "(Landroidx/compose/animation/core/c0;Landroidx/compose/animation/core/q1;JLkotlin/jvm/internal/w;)V", "Landroidx/compose/animation/core/s;", "V", "Landroidx/compose/animation/core/i2;", "converter", "Landroidx/compose/animation/core/l2;", "a", "(Landroidx/compose/animation/core/i2;)Landroidx/compose/animation/core/l2;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroidx/compose/animation/core/c0;", "h", "()Landroidx/compose/animation/core/c0;", "b", "Landroidx/compose/animation/core/q1;", "j", "()Landroidx/compose/animation/core/q1;", "c", "J", "i", "()J", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class x0<T> implements k<T> {

    /* renamed from: d, reason: collision with root package name */
    public static final int f2978d = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final c0<T> animation;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final q1 repeatMode;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final long initialStartOffset;

    public /* synthetic */ x0(c0 c0Var, q1 q1Var, long j4, kotlin.jvm.internal.w wVar) {
        this(c0Var, q1Var, j4);
    }

    @Override // androidx.compose.animation.core.k
    @fg.l
    public <V extends s> l2<V> a(@fg.l i2<T, V> converter) {
        return new s2(this.animation.a((i2) converter), this.repeatMode, this.initialStartOffset, (kotlin.jvm.internal.w) null);
    }

    public boolean equals(@fg.m Object other) {
        if (!(other instanceof x0)) {
            return false;
        }
        x0 x0Var = (x0) other;
        return kotlin.jvm.internal.l0.g(x0Var.animation, this.animation) && x0Var.repeatMode == this.repeatMode && z1.f(x0Var.initialStartOffset, this.initialStartOffset);
    }

    @fg.l
    public final c0<T> h() {
        return this.animation;
    }

    public int hashCode() {
        return Long.hashCode(this.initialStartOffset) + ((this.repeatMode.hashCode() + (this.animation.hashCode() * 31)) * 31);
    }

    /* renamed from: i, reason: from getter */
    public final long getInitialStartOffset() {
        return this.initialStartOffset;
    }

    @fg.l
    /* renamed from: j, reason: from getter */
    public final q1 getRepeatMode() {
        return this.repeatMode;
    }

    private x0(c0<T> c0Var, q1 q1Var, long j4) {
        this.animation = c0Var;
        this.repeatMode = q1Var;
        this.initialStartOffset = j4;
    }

    public /* synthetic */ x0(c0 c0Var, q1 q1Var, long j4, int i4, kotlin.jvm.internal.w wVar) {
        this(c0Var, (i4 & 2) != 0 ? q1.Restart : q1Var, (i4 & 4) != 0 ? z1.d(0, 0, 2, null) : j4);
    }

    public /* synthetic */ x0(c0 c0Var, q1 q1Var, int i4, kotlin.jvm.internal.w wVar) {
        this(c0Var, (i4 & 2) != 0 ? q1.Restart : q1Var);
    }

    @kotlin.k(level = kotlin.m.HIDDEN, message = "This constructor has been deprecated")
    public /* synthetic */ x0(c0 c0Var, q1 q1Var) {
        this(c0Var, q1Var, z1.d(0, 0, 2, null));
    }
}
