package androidx.compose.animation.core;

import kotlin.Metadata;

/* compiled from: AnimationSpec.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0019\b\u0004\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J9\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00040\f\"\b\b\u0001\u0010\t*\u00020\b2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\nH\u0000¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0003\u001a\u00028\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\"\u0010\u0005\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0013\u001a\u0004\b\u000f\u0010\u0014\"\u0004\b\u0015\u0010\u0016\u0082\u0001\u0001\u0017¨\u0006\u0018"}, d2 = {"Landroidx/compose/animation/core/b1;", "T", "", "value", "Landroidx/compose/animation/core/d0;", "easing", "<init>", "(Ljava/lang/Object;Landroidx/compose/animation/core/d0;)V", "Landroidx/compose/animation/core/s;", "V", "Lkotlin/Function1;", "convertToVector", "Lkotlin/q0;", "d", "(Lld/l;)Lkotlin/q0;", "a", "Ljava/lang/Object;", "b", "()Ljava/lang/Object;", "Landroidx/compose/animation/core/d0;", "()Landroidx/compose/animation/core/d0;", "c", "(Landroidx/compose/animation/core/d0;)V", "Landroidx/compose/animation/core/c1$a;", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class b1<T> {

    /* renamed from: c, reason: collision with root package name */
    public static final int f2559c = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final T value;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private d0 easing;

    public /* synthetic */ b1(Object obj, d0 d0Var, kotlin.jvm.internal.w wVar) {
        this(obj, d0Var);
    }

    @fg.l
    /* renamed from: a, reason: from getter */
    public final d0 getEasing() {
        return this.easing;
    }

    public final T b() {
        return this.value;
    }

    public final void c(@fg.l d0 d0Var) {
        this.easing = d0Var;
    }

    @fg.l
    public final <V extends s> kotlin.q0<V, d0> d(@fg.l ld.l<? super T, ? extends V> convertToVector) {
        return new kotlin.q0<>(convertToVector.invoke(this.value), this.easing);
    }

    private b1(T t4, d0 d0Var) {
        this.value = t4;
        this.easing = d0Var;
    }
}
