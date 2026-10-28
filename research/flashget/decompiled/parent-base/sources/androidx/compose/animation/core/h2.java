package androidx.compose.animation.core;

import kotlin.Metadata;

/* compiled from: AnimationSpec.kt */
@androidx.compose.runtime.m1
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B%\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ3\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000e\"\b\b\u0001\u0010\u000b*\u00020\n2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001c\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Landroidx/compose/animation/core/h2;", "T", "Landroidx/compose/animation/core/c0;", "", "durationMillis", "delay", "Landroidx/compose/animation/core/d0;", "easing", "<init>", "(IILandroidx/compose/animation/core/d0;)V", "Landroidx/compose/animation/core/s;", "V", "Landroidx/compose/animation/core/i2;", "converter", "Landroidx/compose/animation/core/y2;", "k", "(Landroidx/compose/animation/core/i2;)Landroidx/compose/animation/core/y2;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "a", "I", "i", "b", "h", "c", "Landroidx/compose/animation/core/d0;", "j", "()Landroidx/compose/animation/core/d0;", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class h2<T> implements c0<T> {

    /* renamed from: d, reason: collision with root package name */
    public static final int f2737d = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int durationMillis;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int delay;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final d0 easing;

    public h2() {
        this(0, 0, null, 7, null);
    }

    public boolean equals(@fg.m Object other) {
        if (!(other instanceof h2)) {
            return false;
        }
        h2 h2Var = (h2) other;
        return h2Var.durationMillis == this.durationMillis && h2Var.delay == this.delay && kotlin.jvm.internal.l0.g(h2Var.easing, this.easing);
    }

    /* renamed from: h, reason: from getter */
    public final int getDelay() {
        return this.delay;
    }

    public int hashCode() {
        return ((this.easing.hashCode() + (this.durationMillis * 31)) * 31) + this.delay;
    }

    /* renamed from: i, reason: from getter */
    public final int getDurationMillis() {
        return this.durationMillis;
    }

    @fg.l
    /* renamed from: j, reason: from getter */
    public final d0 getEasing() {
        return this.easing;
    }

    @Override // androidx.compose.animation.core.p0, androidx.compose.animation.core.k
    @fg.l
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public <V extends s> y2<V> a(@fg.l i2<T, V> converter) {
        return new y2<>(this.durationMillis, this.delay, this.easing);
    }

    public h2(int i4, int i5, @fg.l d0 d0Var) {
        this.durationMillis = i4;
        this.delay = i5;
        this.easing = d0Var;
    }

    public /* synthetic */ h2(int i4, int i5, d0 d0Var, int i6, kotlin.jvm.internal.w wVar) {
        this((i6 & 1) != 0 ? 300 : i4, (i6 & 2) != 0 ? 0 : i5, (i6 & 4) != 0 ? m0.d() : d0Var);
    }
}
