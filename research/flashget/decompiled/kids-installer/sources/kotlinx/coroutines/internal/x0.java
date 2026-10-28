package kotlinx.coroutines.internal;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.r3;

/* compiled from: ThreadContext.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\u0006\u0010\u0016\u001a\u00028\u0000\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0014\u0010\r\u001a\u00020\u00032\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u000bH\u0016J*\u0010\u0010\u001a\u0004\u0018\u00018\u0001\"\b\b\u0001\u0010\u000f*\u00020\u000e2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000bH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0013\u001a\u00020\u0012H\u0016R\u0014\u0010\u0016\u001a\u00028\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001e\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"Lkotlinx/coroutines/internal/x0;", "T", "Lkotlinx/coroutines/r3;", "Lkotlin/coroutines/g;", "context", "o0", "(Lkotlin/coroutines/g;)Ljava/lang/Object;", "oldState", "Lkotlin/m2;", "f0", "(Lkotlin/coroutines/g;Ljava/lang/Object;)V", "Lkotlin/coroutines/g$c;", "key", "c", "Lkotlin/coroutines/g$b;", "E", "b", "(Lkotlin/coroutines/g$c;)Lkotlin/coroutines/g$b;", "", "toString", "o", "Ljava/lang/Object;", "value", "Ljava/lang/ThreadLocal;", "p", "Ljava/lang/ThreadLocal;", "threadLocal", "q", "Lkotlin/coroutines/g$c;", "getKey", "()Lkotlin/coroutines/g$c;", "<init>", "(Ljava/lang/Object;Ljava/lang/ThreadLocal;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes6.dex */
public final class x0<T> implements r3<T> {

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final T value;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final ThreadLocal<T> threadLocal;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final CoroutineContext.c<?> key;

    public x0(T t5, @d5.d ThreadLocal<T> threadLocal) {
        this.value = t5;
        this.threadLocal = threadLocal;
        this.key = new y0(threadLocal);
    }

    @Override // kotlin.coroutines.CoroutineContext
    @d5.d
    public CoroutineContext B(@d5.d CoroutineContext coroutineContext) {
        return CoroutineContext.b.a.d(this, coroutineContext);
    }

    @Override // kotlin.coroutines.CoroutineContext.b, kotlin.coroutines.CoroutineContext
    @d5.e
    public <E extends CoroutineContext.b> E b(@d5.d CoroutineContext.c<E> key) {
        if (kotlin.jvm.internal.l0.g(this.key, key)) {
            return this;
        }
        return null;
    }

    @Override // kotlin.coroutines.CoroutineContext.b, kotlin.coroutines.CoroutineContext
    @d5.d
    public CoroutineContext c(@d5.d CoroutineContext.c<?> key) {
        return kotlin.jvm.internal.l0.g(this.key, key) ? EmptyCoroutineContext.f23294o : this;
    }

    @Override // kotlinx.coroutines.r3
    public void f0(@d5.d CoroutineContext context, T oldState) {
        this.threadLocal.set(oldState);
    }

    @Override // kotlin.coroutines.CoroutineContext.b
    @d5.d
    public CoroutineContext.c<?> getKey() {
        return this.key;
    }

    @Override // kotlin.coroutines.CoroutineContext.b, kotlin.coroutines.CoroutineContext
    public <R> R n(R r5, @d5.d q3.p<? super R, ? super CoroutineContext.b, ? extends R> pVar) {
        return (R) CoroutineContext.b.a.a(this, r5, pVar);
    }

    @Override // kotlinx.coroutines.r3
    public T o0(@d5.d CoroutineContext context) {
        T t5 = this.threadLocal.get();
        this.threadLocal.set(this.value);
        return t5;
    }

    @d5.d
    public String toString() {
        return ProtectedSandApp.s("酀") + this.value + ProtectedSandApp.s("酁") + this.threadLocal + ')';
    }
}
