package kotlin.sequences;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.a1;
import kotlin.jvm.internal.l0;
import kotlin.k2;
import kotlin.z0;

/* compiled from: SequenceBuilder.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0012\u0004\u0012\u00020\u00050\u0004B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\tJ\u0018\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u0012\u0010\u0013J\u001e\u0010\u0015\u001a\u00020\u00052\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096@¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0019\u001a\u00020\u00052\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00050\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001e\u001a\u00060\u001bj\u0002`\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u001dR\u0018\u0010!\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001e\u0010#\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\"R*\u0010*\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u0014\u0010.\u001a\u00020+8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u0006/"}, d2 = {"Lkotlin/sequences/n;", "T", "Lkotlin/sequences/o;", "", "Lkotlin/coroutines/d;", "Lkotlin/k2;", "<init>", "()V", "j", "()Ljava/lang/Object;", "", "h", "()Ljava/lang/Throwable;", "", "hasNext", "()Z", "next", "value", "b", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "iterator", "d", "(Ljava/util/Iterator;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlin/z0;", "result", "resumeWith", "(Ljava/lang/Object;)V", "", "Lkotlin/sequences/State;", "I", "state", "c", "Ljava/lang/Object;", "nextValue", "Ljava/util/Iterator;", "nextIterator", "e", "Lkotlin/coroutines/d;", "i", "()Lkotlin/coroutines/d;", "m", "(Lkotlin/coroutines/d;)V", "nextStep", "Lkotlin/coroutines/g;", "getContext", "()Lkotlin/coroutines/g;", "context", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
final class n<T> extends o<T> implements Iterator<T>, kotlin.coroutines.d<k2>, md.a {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int state;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private T nextValue;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private Iterator<? extends T> nextIterator;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private kotlin.coroutines.d<? super k2> nextStep;

    private final Throwable h() {
        int i4 = this.state;
        if (i4 == 4) {
            return new NoSuchElementException();
        }
        if (i4 == 5) {
            return new IllegalStateException(ProtectedSandApp.s("苺\u0001"));
        }
        return new IllegalStateException(ProtectedSandApp.s("苹\u0001") + this.state);
    }

    private final T j() {
        if (hasNext()) {
            return next();
        }
        throw new NoSuchElementException();
    }

    @Override // kotlin.sequences.o
    @fg.m
    public Object b(T t4, @fg.l kotlin.coroutines.d<? super k2> dVar) {
        this.nextValue = t4;
        this.state = 3;
        this.nextStep = dVar;
        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
        kotlin.coroutines.jvm.internal.h.c(dVar);
        return aVar;
    }

    @Override // kotlin.sequences.o
    @fg.m
    public Object d(@fg.l Iterator<? extends T> it, @fg.l kotlin.coroutines.d<? super k2> dVar) {
        if (!it.hasNext()) {
            return k2.f75408a;
        }
        this.nextIterator = it;
        this.state = 2;
        this.nextStep = dVar;
        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
        kotlin.coroutines.jvm.internal.h.c(dVar);
        return aVar;
    }

    @Override // kotlin.coroutines.d
    @fg.l
    /* renamed from: getContext */
    public kotlin.coroutines.g getF75054b() {
        return kotlin.coroutines.i.f75057b;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        while (true) {
            int i4 = this.state;
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 == 2 || i4 == 3) {
                        return true;
                    }
                    if (i4 == 4) {
                        return false;
                    }
                    throw h();
                }
                Iterator<? extends T> it = this.nextIterator;
                l0.m(it);
                if (it.hasNext()) {
                    this.state = 2;
                    return true;
                }
                this.nextIterator = null;
            }
            this.state = 5;
            kotlin.coroutines.d<? super k2> dVar = this.nextStep;
            l0.m(dVar);
            this.nextStep = null;
            z0.Companion companion = z0.INSTANCE;
            dVar.resumeWith(k2.f75408a);
        }
    }

    @fg.m
    public final kotlin.coroutines.d<k2> i() {
        return this.nextStep;
    }

    public final void m(@fg.m kotlin.coroutines.d<? super k2> dVar) {
        this.nextStep = dVar;
    }

    @Override // java.util.Iterator
    public T next() {
        int i4 = this.state;
        if (i4 == 0 || i4 == 1) {
            return j();
        }
        if (i4 == 2) {
            this.state = 1;
            Iterator<? extends T> it = this.nextIterator;
            l0.m(it);
            return it.next();
        }
        if (i4 != 3) {
            throw h();
        }
        this.state = 0;
        T t4 = this.nextValue;
        this.nextValue = null;
        return t4;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException(ProtectedSandApp.s("苻\u0001"));
    }

    @Override // kotlin.coroutines.d
    public void resumeWith(@fg.l Object result) {
        a1.n(result);
        this.state = 4;
    }
}
