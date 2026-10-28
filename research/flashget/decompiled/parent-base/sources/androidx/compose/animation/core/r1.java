package androidx.compose.animation.core;

import kotlin.Metadata;

/* compiled from: AnimationSpec.kt */
@androidx.compose.runtime.m1
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B)\b\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB1\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\t\u0010\rJ3\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u0012\"\b\b\u0001\u0010\u000f*\u00020\u000e2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u001c\u001a\u0004\b\u001d\u0010\u001bR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001d\u0010\f\u001a\u00020\u000b8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006*"}, d2 = {"Landroidx/compose/animation/core/r1;", "T", "Landroidx/compose/animation/core/p0;", "", "iterations", "Landroidx/compose/animation/core/c0;", "animation", "Landroidx/compose/animation/core/q1;", "repeatMode", "<init>", "(ILandroidx/compose/animation/core/c0;Landroidx/compose/animation/core/q1;)V", "Landroidx/compose/animation/core/z1;", "initialStartOffset", "(ILandroidx/compose/animation/core/c0;Landroidx/compose/animation/core/q1;JLkotlin/jvm/internal/w;)V", "Landroidx/compose/animation/core/s;", "V", "Landroidx/compose/animation/core/i2;", "converter", "Landroidx/compose/animation/core/p2;", "a", "(Landroidx/compose/animation/core/i2;)Landroidx/compose/animation/core/p2;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "I", "j", "b", "Landroidx/compose/animation/core/c0;", "h", "()Landroidx/compose/animation/core/c0;", "c", "Landroidx/compose/animation/core/q1;", "k", "()Landroidx/compose/animation/core/q1;", "d", "J", "i", "()J", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class r1<T> implements p0<T> {

    /* renamed from: e, reason: collision with root package name */
    public static final int f2876e = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int iterations;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final c0<T> animation;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final q1 repeatMode;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final long initialStartOffset;

    public /* synthetic */ r1(int i4, c0 c0Var, q1 q1Var, long j4, kotlin.jvm.internal.w wVar) {
        this(i4, c0Var, q1Var, j4);
    }

    public boolean equals(@fg.m Object other) {
        if (!(other instanceof r1)) {
            return false;
        }
        r1 r1Var = (r1) other;
        return r1Var.iterations == this.iterations && kotlin.jvm.internal.l0.g(r1Var.animation, this.animation) && r1Var.repeatMode == this.repeatMode && z1.f(r1Var.initialStartOffset, this.initialStartOffset);
    }

    @fg.l
    public final c0<T> h() {
        return this.animation;
    }

    public int hashCode() {
        return Long.hashCode(this.initialStartOffset) + ((this.repeatMode.hashCode() + ((this.animation.hashCode() + (this.iterations * 31)) * 31)) * 31);
    }

    /* renamed from: i, reason: from getter */
    public final long getInitialStartOffset() {
        return this.initialStartOffset;
    }

    /* renamed from: j, reason: from getter */
    public final int getIterations() {
        return this.iterations;
    }

    @fg.l
    /* renamed from: k, reason: from getter */
    public final q1 getRepeatMode() {
        return this.repeatMode;
    }

    private r1(int i4, c0<T> c0Var, q1 q1Var, long j4) {
        this.iterations = i4;
        this.animation = c0Var;
        this.repeatMode = q1Var;
        this.initialStartOffset = j4;
    }

    @Override // androidx.compose.animation.core.k
    @fg.l
    public <V extends s> p2<V> a(@fg.l i2<T, V> converter) {
        return new v2(this.iterations, this.animation.a((i2) converter), this.repeatMode, this.initialStartOffset, (kotlin.jvm.internal.w) null);
    }

    public /* synthetic */ r1(int i4, c0 c0Var, q1 q1Var, long j4, int i5, kotlin.jvm.internal.w wVar) {
        this(i4, c0Var, (i5 & 4) != 0 ? q1.Restart : q1Var, (i5 & 8) != 0 ? z1.d(0, 0, 2, null) : j4);
    }

    public /* synthetic */ r1(int i4, c0 c0Var, q1 q1Var, int i5, kotlin.jvm.internal.w wVar) {
        this(i4, c0Var, (i5 & 4) != 0 ? q1.Restart : q1Var);
    }

    @kotlin.k(level = kotlin.m.HIDDEN, message = "This constructor has been deprecated")
    public /* synthetic */ r1(int i4, c0 c0Var, q1 q1Var) {
        this(i4, c0Var, q1Var, z1.d(0, 0, 2, null));
    }
}
