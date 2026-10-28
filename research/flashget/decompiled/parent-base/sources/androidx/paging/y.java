package androidx.paging;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.k2;

/* compiled from: InvalidateCallbackTracker.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0007\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B-\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0001¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0012\u0010\u0013R \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0014R\u001c\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0018R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001bR$\u0010 \u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u00078\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b\u0011\u0010\u001e\u001a\u0004\b\u0015\u0010\u001f¨\u0006!"}, d2 = {"Landroidx/paging/y;", "T", "", "Lkotlin/Function1;", "Lkotlin/k2;", "callbackInvoker", "Lkotlin/Function0;", "", "invalidGetter", "<init>", "(Lld/l;Lld/a;)V", "", "a", "()I", "callback", "d", "(Ljava/lang/Object;)V", "e", "c", "()V", "Lld/l;", "b", "Lld/a;", "Ljava/util/concurrent/locks/ReentrantLock;", "Ljava/util/concurrent/locks/ReentrantLock;", "lock", "", "Ljava/util/List;", "callbacks", "<set-?>", "Z", "()Z", "invalid", "paging-common"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class y<T> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ld.l<T, k2> callbackInvoker;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final ld.a<Boolean> invalidGetter;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ReentrantLock lock;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final List<T> callbacks;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private boolean invalid;

    /* JADX WARN: Multi-variable type inference failed */
    public y(@fg.l ld.l<? super T, k2> callbackInvoker, @fg.m ld.a<Boolean> aVar) {
        kotlin.jvm.internal.l0.p(callbackInvoker, "callbackInvoker");
        this.callbackInvoker = callbackInvoker;
        this.invalidGetter = aVar;
        this.lock = new ReentrantLock();
        this.callbacks = new ArrayList();
    }

    @androidx.annotation.m1
    public final int a() {
        return this.callbacks.size();
    }

    /* renamed from: b, reason: from getter */
    public final boolean getInvalid() {
        return this.invalid;
    }

    public final void c() {
        if (this.invalid) {
            return;
        }
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (this.invalid) {
                return;
            }
            this.invalid = true;
            List V5 = kotlin.collections.w.V5(this.callbacks);
            this.callbacks.clear();
            k2 k2Var = k2.f75408a;
            if (V5 == null) {
                return;
            }
            ld.l<T, k2> lVar = this.callbackInvoker;
            Iterator<T> it = V5.iterator();
            while (it.hasNext()) {
                lVar.invoke(it.next());
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void d(T callback) {
        ld.a<Boolean> aVar = this.invalidGetter;
        boolean z4 = true;
        if (aVar != null && aVar.invoke().booleanValue()) {
            c();
        }
        if (this.invalid) {
            this.callbackInvoker.invoke(callback);
            return;
        }
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (this.invalid) {
                k2 k2Var = k2.f75408a;
            } else {
                this.callbacks.add(callback);
                z4 = false;
            }
            reentrantLock.unlock();
            if (z4) {
                this.callbackInvoker.invoke(callback);
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void e(T callback) {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            this.callbacks.remove(callback);
        } finally {
            reentrantLock.unlock();
        }
    }

    public /* synthetic */ y(ld.l lVar, ld.a aVar, int i4, kotlin.jvm.internal.w wVar) {
        this(lVar, (i4 & 2) != 0 ? null : aVar);
    }
}
