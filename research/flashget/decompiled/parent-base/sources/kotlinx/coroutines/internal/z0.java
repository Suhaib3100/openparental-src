package kotlinx.coroutines.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.coroutines.g;
import kotlinx.coroutines.l3;

/* compiled from: ThreadContext.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0012\u001a\u00020\b2\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J*\u0010\u0016\u001a\u0004\u0018\u00018\u0001\"\b\b\u0001\u0010\u0015*\u00020\u00142\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00028\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001dR\u001e\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lkotlinx/coroutines/internal/z0;", "T", "Lkotlinx/coroutines/l3;", "value", "Ljava/lang/ThreadLocal;", "threadLocal", "<init>", "(Ljava/lang/Object;Ljava/lang/ThreadLocal;)V", "Lkotlin/coroutines/g;", "context", "M0", "(Lkotlin/coroutines/g;)Ljava/lang/Object;", "oldState", "Lkotlin/k2;", "H", "(Lkotlin/coroutines/g;Ljava/lang/Object;)V", "Lkotlin/coroutines/g$c;", "key", "d", "(Lkotlin/coroutines/g$c;)Lkotlin/coroutines/g;", "Lkotlin/coroutines/g$b;", "E", "c", "(Lkotlin/coroutines/g$c;)Lkotlin/coroutines/g$b;", "", "toString", "()Ljava/lang/String;", "b", "Ljava/lang/Object;", "Ljava/lang/ThreadLocal;", "Lkotlin/coroutines/g$c;", "getKey", "()Lkotlin/coroutines/g$c;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class z0<T> implements l3<T> {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final T value;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ThreadLocal<T> threadLocal;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final g.c<?> key;

    public z0(T t4, @fg.l ThreadLocal<T> threadLocal) {
        this.value = t4;
        this.threadLocal = threadLocal;
        this.key = new a1(threadLocal);
    }

    @Override // kotlinx.coroutines.l3
    public void H(@fg.l kotlin.coroutines.g context, T oldState) {
        this.threadLocal.set(oldState);
    }

    @Override // kotlinx.coroutines.l3
    public T M0(@fg.l kotlin.coroutines.g context) {
        T t4 = this.threadLocal.get();
        this.threadLocal.set(this.value);
        return t4;
    }

    @Override // kotlin.coroutines.g
    @fg.l
    public kotlin.coroutines.g O(@fg.l kotlin.coroutines.g gVar) {
        return g.b.a.d(this, gVar);
    }

    @Override // kotlin.coroutines.g.b, kotlin.coroutines.g
    @fg.m
    public <E extends g.b> E c(@fg.l g.c<E> key) {
        if (!kotlin.jvm.internal.l0.g(this.key, key)) {
            return null;
        }
        kotlin.jvm.internal.l0.n(this, ProtectedSandApp.s("蠛\u0001"));
        return this;
    }

    @Override // kotlin.coroutines.g.b, kotlin.coroutines.g
    @fg.l
    public kotlin.coroutines.g d(@fg.l g.c<?> key) {
        return kotlin.jvm.internal.l0.g(this.key, key) ? kotlin.coroutines.i.f75057b : this;
    }

    @Override // kotlin.coroutines.g.b, kotlin.coroutines.g
    public <R> R g(R r4, @fg.l ld.p<? super R, ? super g.b, ? extends R> pVar) {
        return (R) g.b.a.a(this, r4, pVar);
    }

    @Override // kotlin.coroutines.g.b
    @fg.l
    public g.c<?> getKey() {
        return this.key;
    }

    @fg.l
    public String toString() {
        return ProtectedSandApp.s("蠜\u0001") + this.value + ProtectedSandApp.s("蠝\u0001") + this.threadLocal + ')';
    }
}
