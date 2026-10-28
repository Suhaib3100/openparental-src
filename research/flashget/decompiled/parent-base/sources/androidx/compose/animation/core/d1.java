package androidx.compose.animation.core;

import androidx.compose.animation.core.b1;
import kotlin.Metadata;

/* compiled from: AnimationSpec.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u000e\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0004B\t\b\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00028\u00012\u0006\u0010\u0007\u001a\u00028\u0000H ¢\u0006\u0004\b\b\u0010\tJ\u001e\u0010\f\u001a\u00028\u0001*\u00028\u00002\b\b\u0001\u0010\u000b\u001a\u00020\nH\u0096\u0004¢\u0006\u0004\b\f\u0010\rJ\u001c\u0010\u0010\u001a\u00028\u0001*\u00028\u00002\u0006\u0010\u000f\u001a\u00020\u000eH\u0096\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\u001c\u0010\u0014\u001a\u00028\u0001*\u00028\u00012\u0006\u0010\u0013\u001a\u00020\u0012H\u0086\u0004¢\u0006\u0004\b\u0014\u0010\u0015R\"\u0010\u001b\u001a\u00020\n8G@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010\u001e\u001a\u00020\n8G@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018\"\u0004\b\u001d\u0010\u001aR \u0010#\u001a\b\u0012\u0004\u0012\u00028\u00010\u001f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b!\u0010\"\u0082\u0001\u0002$%¨\u0006&"}, d2 = {"Landroidx/compose/animation/core/d1;", "T", "Landroidx/compose/animation/core/b1;", "E", "", "<init>", "()V", "value", "c", "(Ljava/lang/Object;)Landroidx/compose/animation/core/b1;", "", "timeStamp", "a", "(Ljava/lang/Object;I)Landroidx/compose/animation/core/b1;", "", "fraction", "b", "(Ljava/lang/Object;F)Landroidx/compose/animation/core/b1;", "Landroidx/compose/animation/core/d0;", "easing", "i", "(Landroidx/compose/animation/core/b1;Landroidx/compose/animation/core/d0;)Landroidx/compose/animation/core/b1;", "I", "e", "()I", "h", "(I)V", "durationMillis", "d", "g", "delayMillis", "Landroidx/collection/w1;", "Landroidx/collection/w1;", "f", "()Landroidx/collection/w1;", "keyframes", "Landroidx/compose/animation/core/c1$b;", "Landroidx/compose/animation/core/e1$a;", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class d1<T, E extends b1<T>> {

    /* renamed from: d, reason: collision with root package name */
    public static final int f2627d = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private int durationMillis;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int delayMillis;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.collection.w1<E> keyframes;

    public /* synthetic */ d1(kotlin.jvm.internal.w wVar) {
        this();
    }

    @fg.l
    public E a(T t4, @androidx.annotation.g0(from = 0) int i4) {
        E c5 = c(t4);
        this.keyframes.j0(i4, c5);
        return c5;
    }

    @fg.l
    public E b(T t4, float f4) {
        return a(t4, kotlin.math.b.L0(this.durationMillis * f4));
    }

    @fg.l
    public abstract E c(T value);

    @androidx.annotation.g0(from = 0)
    /* renamed from: d, reason: from getter */
    public final int getDelayMillis() {
        return this.delayMillis;
    }

    @androidx.annotation.g0(from = 0)
    /* renamed from: e, reason: from getter */
    public final int getDurationMillis() {
        return this.durationMillis;
    }

    @fg.l
    public final androidx.collection.w1<E> f() {
        return this.keyframes;
    }

    public final void g(int i4) {
        this.delayMillis = i4;
    }

    public final void h(int i4) {
        this.durationMillis = i4;
    }

    @fg.l
    public final E i(@fg.l E e4, @fg.l d0 d0Var) {
        e4.c(d0Var);
        return e4;
    }

    private d1() {
        this.durationMillis = 300;
        this.keyframes = androidx.collection.m0.h();
    }
}
