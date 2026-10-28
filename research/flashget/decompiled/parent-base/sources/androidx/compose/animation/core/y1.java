package androidx.compose.animation.core;

import kotlin.Metadata;

/* compiled from: AnimationSpec.kt */
@androidx.compose.runtime.m1
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B'\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0007\u0010\bJ3\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\r\"\b\b\u0001\u0010\n*\u00020\t2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u0019\u0010\u0006\u001a\u0004\u0018\u00018\u00008\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"Landroidx/compose/animation/core/y1;", "T", "Landroidx/compose/animation/core/p0;", "", "dampingRatio", "stiffness", "visibilityThreshold", "<init>", "(FFLjava/lang/Object;)V", "Landroidx/compose/animation/core/s;", "V", "Landroidx/compose/animation/core/i2;", "converter", "Landroidx/compose/animation/core/x2;", "k", "(Landroidx/compose/animation/core/i2;)Landroidx/compose/animation/core/x2;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "F", "h", "()F", "b", "i", "c", "Ljava/lang/Object;", "j", "()Ljava/lang/Object;", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class y1<T> implements p0<T> {

    /* renamed from: d, reason: collision with root package name */
    public static final int f3029d = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final float dampingRatio;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final float stiffness;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final T visibilityThreshold;

    public y1() {
        this(0.0f, 0.0f, null, 7, null);
    }

    public boolean equals(@fg.m Object other) {
        if (!(other instanceof y1)) {
            return false;
        }
        y1 y1Var = (y1) other;
        return y1Var.dampingRatio == this.dampingRatio && y1Var.stiffness == this.stiffness && kotlin.jvm.internal.l0.g(y1Var.visibilityThreshold, this.visibilityThreshold);
    }

    /* renamed from: h, reason: from getter */
    public final float getDampingRatio() {
        return this.dampingRatio;
    }

    public int hashCode() {
        T t4 = this.visibilityThreshold;
        return Float.hashCode(this.stiffness) + androidx.compose.animation.l0.a(this.dampingRatio, (t4 != null ? t4.hashCode() : 0) * 31, 31);
    }

    /* renamed from: i, reason: from getter */
    public final float getStiffness() {
        return this.stiffness;
    }

    @fg.m
    public final T j() {
        return this.visibilityThreshold;
    }

    @Override // androidx.compose.animation.core.p0, androidx.compose.animation.core.k
    @fg.l
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public <V extends s> x2<V> a(@fg.l i2<T, V> converter) {
        s b5;
        float f4 = this.dampingRatio;
        float f5 = this.stiffness;
        b5 = l.b(converter, this.visibilityThreshold);
        return new x2<>(f4, f5, b5);
    }

    public y1(float f4, float f5, @fg.m T t4) {
        this.dampingRatio = f4;
        this.stiffness = f5;
        this.visibilityThreshold = t4;
    }

    public /* synthetic */ y1(float f4, float f5, Object obj, int i4, kotlin.jvm.internal.w wVar) {
        this((i4 & 1) != 0 ? 1.0f : f4, (i4 & 2) != 0 ? 1500.0f : f5, (i4 & 4) != 0 ? null : obj);
    }
}
