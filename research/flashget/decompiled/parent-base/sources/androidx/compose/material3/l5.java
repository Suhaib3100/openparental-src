package androidx.compose.material3;

import kotlin.Metadata;

/* compiled from: SnackbarHost.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0082\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002BF\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u00125\u0010\f\u001a1\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\b\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u00060\u0004j\u0002`\u000b¢\u0006\u0002\b\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00028\u0000HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J?\u0010\u0011\u001a1\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\b\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u00060\u0004j\u0002`\u000b¢\u0006\u0002\b\u0007HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012JY\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00028\u000027\b\u0002\u0010\f\u001a1\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\b\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u00060\u0004j\u0002`\u000b¢\u0006\u0002\b\u0007HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001f\u001a\u0004\b \u0010\u0010RF\u0010\f\u001a1\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\b\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u00060\u0004j\u0002`\u000b¢\u0006\u0002\b\u00078\u0006¢\u0006\f\n\u0004\b\u0011\u0010!\u001a\u0004\b\"\u0010\u0012¨\u0006#"}, d2 = {"Landroidx/compose/material3/l5;", "T", "", "key", "Lkotlin/Function1;", "Lkotlin/Function0;", "Lkotlin/k2;", "Landroidx/compose/runtime/i;", "Lkotlin/r0;", "name", "content", "Landroidx/compose/material3/FadeInFadeOutTransition;", "transition", "<init>", "(Ljava/lang/Object;Lld/q;)V", "a", "()Ljava/lang/Object;", "b", "()Lld/q;", "c", "(Ljava/lang/Object;Lld/q;)Landroidx/compose/material3/l5;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Object;", "e", "Lld/q;", "f", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final /* data */ class l5<T> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final T key;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ld.q<ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2>, androidx.compose.runtime.t, Integer, kotlin.k2> transition;

    /* JADX WARN: Multi-variable type inference failed */
    public l5(T t4, @fg.l ld.q<? super ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2>, ? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> qVar) {
        this.key = t4;
        this.transition = qVar;
    }

    public static l5 d(l5 l5Var, Object obj, ld.q qVar, int i4, Object obj2) {
        if ((i4 & 1) != 0) {
            obj = l5Var.key;
        }
        if ((i4 & 2) != 0) {
            qVar = l5Var.transition;
        }
        l5Var.getClass();
        return new l5(obj, qVar);
    }

    public final T a() {
        return this.key;
    }

    @fg.l
    public final ld.q<ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2>, androidx.compose.runtime.t, Integer, kotlin.k2> b() {
        return this.transition;
    }

    @fg.l
    public final l5<T> c(T key, @fg.l ld.q<? super ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2>, ? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> transition) {
        return new l5<>(key, transition);
    }

    public final T e() {
        return this.key;
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof l5)) {
            return false;
        }
        l5 l5Var = (l5) other;
        return kotlin.jvm.internal.l0.g(this.key, l5Var.key) && kotlin.jvm.internal.l0.g(this.transition, l5Var.transition);
    }

    @fg.l
    public final ld.q<ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2>, androidx.compose.runtime.t, Integer, kotlin.k2> f() {
        return this.transition;
    }

    public int hashCode() {
        T t4 = this.key;
        return this.transition.hashCode() + ((t4 == null ? 0 : t4.hashCode()) * 31);
    }

    @fg.l
    public String toString() {
        return "FadeInFadeOutAnimationItem(key=" + this.key + ", transition=" + this.transition + ')';
    }
}
