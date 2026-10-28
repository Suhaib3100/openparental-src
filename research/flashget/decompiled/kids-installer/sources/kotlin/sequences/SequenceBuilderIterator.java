package kotlin.sequences;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.a1;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.l0;
import kotlin.m2;

/* compiled from: SequenceBuilder.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u00032\b\u0012\u0004\u0012\u00020\u00050\u0004B\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0016\u001a\u00020\u0017H\u0002J\t\u0010\u0018\u001a\u00020\u0019H\u0096\u0002J\u000e\u0010\u001a\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\u001bJ\r\u0010\u001c\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010\u001bJ\u001b\u0010\u001d\u001a\u00020\u00052\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00050\u001fH\u0016¢\u0006\u0002\u0010 J\u0016\u0010!\u001a\u00020\u00052\u0006\u0010\"\u001a\u00028\u0000H\u0096@¢\u0006\u0002\u0010#J\u001c\u0010$\u001a\u00020\u00052\f\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096@¢\u0006\u0002\u0010&R\u0014\u0010\u0007\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0016\u0010\u000b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0012\u0010\u0011\u001a\u0004\u0018\u00018\u0000X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0012R\u0012\u0010\u0013\u001a\u00060\u0014j\u0002`\u0015X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lkotlin/sequences/SequenceBuilderIterator;", "T", "Lkotlin/sequences/SequenceScope;", "", "Lkotlin/coroutines/Continuation;", "", "()V", "context", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "nextIterator", "nextStep", "getNextStep", "()Lkotlin/coroutines/Continuation;", "setNextStep", "(Lkotlin/coroutines/Continuation;)V", "nextValue", "Ljava/lang/Object;", "state", "", "Lkotlin/sequences/State;", "exceptionalState", "", "hasNext", "", "next", "()Ljava/lang/Object;", "nextNotReady", "resumeWith", "result", "Lkotlin/Result;", "(Ljava/lang/Object;)V", "yield", "value", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "yieldAll", "iterator", "(Ljava/util/Iterator;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlin.sequences.n, reason: from Kotlin metadata */
/* loaded from: classes5.dex */
final class SequenceBuilderIterator<T> extends SequenceScope<T> implements Iterator<T>, Continuation<m2>, r3.a {

    /* renamed from: o, reason: collision with root package name */
    private int f26918o;

    /* renamed from: p, reason: collision with root package name */
    @d5.e
    private T f26919p;

    /* renamed from: q, reason: collision with root package name */
    @d5.e
    private Iterator<? extends T> f26920q;

    /* renamed from: r, reason: collision with root package name */
    @d5.e
    private Continuation<? super m2> f26921r;

    private final Throwable k() {
        int i5 = this.f26918o;
        if (i5 == 4) {
            return new NoSuchElementException();
        }
        if (i5 == 5) {
            return new IllegalStateException(ProtectedSandApp.s("娮"));
        }
        return new IllegalStateException(ProtectedSandApp.s("娭") + this.f26918o);
    }

    private final T p() {
        if (hasNext()) {
            return next();
        }
        throw new NoSuchElementException();
    }

    @Override // kotlin.sequences.SequenceScope
    @d5.e
    public Object f(T t5, @d5.d Continuation<? super m2> continuation) {
        this.f26919p = t5;
        this.f26918o = 3;
        this.f26921r = continuation;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        kotlin.coroutines.jvm.internal.h.c(continuation);
        return coroutineSingletons;
    }

    @Override // kotlin.sequences.SequenceScope
    @d5.e
    public Object h(@d5.d Iterator<? extends T> it, @d5.d Continuation<? super m2> continuation) {
        if (!it.hasNext()) {
            return m2.f23662a;
        }
        this.f26920q = it;
        this.f26918o = 2;
        this.f26921r = continuation;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        kotlin.coroutines.jvm.internal.h.c(continuation);
        return coroutineSingletons;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        while (true) {
            int i5 = this.f26918o;
            if (i5 != 0) {
                if (i5 != 1) {
                    if (i5 == 2 || i5 == 3) {
                        return true;
                    }
                    if (i5 == 4) {
                        return false;
                    }
                    throw k();
                }
                Iterator<? extends T> it = this.f26920q;
                l0.m(it);
                if (it.hasNext()) {
                    this.f26918o = 2;
                    return true;
                }
                this.f26920q = null;
            }
            this.f26918o = 5;
            Continuation<? super m2> continuation = this.f26921r;
            l0.m(continuation);
            this.f26921r = null;
            Result.a aVar = Result.f27242p;
            continuation.s(m2.f23662a);
        }
    }

    @Override // kotlin.coroutines.Continuation
    @d5.d
    /* renamed from: l */
    public CoroutineContext getContext() {
        return EmptyCoroutineContext.f23294o;
    }

    @d5.e
    public final Continuation<m2> n() {
        return this.f26921r;
    }

    @Override // java.util.Iterator
    public T next() {
        int i5 = this.f26918o;
        if (i5 == 0 || i5 == 1) {
            return p();
        }
        if (i5 == 2) {
            this.f26918o = 1;
            Iterator<? extends T> it = this.f26920q;
            l0.m(it);
            return it.next();
        }
        if (i5 != 3) {
            throw k();
        }
        this.f26918o = 0;
        T t5 = this.f26919p;
        this.f26919p = null;
        return t5;
    }

    public final void q(@d5.e Continuation<? super m2> continuation) {
        this.f26921r = continuation;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException(ProtectedSandApp.s("娯"));
    }

    @Override // kotlin.coroutines.Continuation
    public void s(@d5.d Object obj) {
        a1.n(obj);
        this.f26918o = 4;
    }
}
