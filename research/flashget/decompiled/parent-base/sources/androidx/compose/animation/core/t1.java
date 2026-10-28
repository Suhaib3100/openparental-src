package androidx.compose.animation.core;

import kotlin.Metadata;

/* compiled from: AnimationSpec.kt */
@androidx.compose.runtime.m1
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J3\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000b\"\b\b\u0001\u0010\b*\u00020\u00072\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\f\u0010\u0015\u001a\u0004\b\u0016\u0010\u0014¨\u0006\u0017"}, d2 = {"Landroidx/compose/animation/core/t1;", "T", "Landroidx/compose/animation/core/c0;", "", "delay", "<init>", "(I)V", "Landroidx/compose/animation/core/s;", "V", "Landroidx/compose/animation/core/i2;", "converter", "Landroidx/compose/animation/core/o2;", "a", "(Landroidx/compose/animation/core/i2;)Landroidx/compose/animation/core/o2;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "I", "h", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class t1<T> implements c0<T> {

    /* renamed from: b, reason: collision with root package name */
    public static final int f2912b = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int delay;

    public t1() {
        this(0, 1, null);
    }

    public boolean equals(@fg.m Object other) {
        return (other instanceof t1) && ((t1) other).delay == this.delay;
    }

    /* renamed from: h, reason: from getter */
    public final int getDelay() {
        return this.delay;
    }

    public int hashCode() {
        return this.delay;
    }

    public t1(int i4) {
        this.delay = i4;
    }

    @Override // androidx.compose.animation.core.p0, androidx.compose.animation.core.k
    @fg.l
    public <V extends s> o2<V> a(@fg.l i2<T, V> converter) {
        return new w2(this.delay);
    }

    public /* synthetic */ t1(int i4, int i5, kotlin.jvm.internal.w wVar) {
        this((i5 & 1) != 0 ? 0 : i4);
    }
}
