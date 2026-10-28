package androidx.content;

import android.os.Bundle;
import androidx.annotation.c1;
import androidx.annotation.i;
import fg.l;
import fg.m;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.collections.j0;
import kotlin.collections.l0;
import kotlin.collections.l1;
import kotlin.collections.w;
import kotlin.k2;
import kotlinx.coroutines.flow.e0;
import kotlinx.coroutines.flow.k;
import kotlinx.coroutines.flow.t0;
import kotlinx.coroutines.flow.v0;

/* compiled from: NavigatorState.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\bJ!\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u0016\u0010\bJ\u0017\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0018\u0010\bR\u0014\u0010\u001b\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001aR \u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u001d0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR \u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040!0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u001fR\"\u0010)\u001a\u00020\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b$\u0010&\"\u0004\b'\u0010(R#\u0010-\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u001d0*8\u0006¢\u0006\f\n\u0004\b\u0018\u0010+\u001a\u0004\b\u001e\u0010,R#\u0010.\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040!0*8\u0006¢\u0006\f\n\u0004\b\u0016\u0010+\u001a\u0004\b\"\u0010,¨\u0006/"}, d2 = {"Landroidx/navigation/f1;", "", "<init>", "()V", "Landroidx/navigation/s;", "backStackEntry", "Lkotlin/k2;", "i", "(Landroidx/navigation/s;)V", "j", "Landroidx/navigation/f0;", "destination", "Landroid/os/Bundle;", "arguments", "a", "(Landroidx/navigation/f0;Landroid/os/Bundle;)Landroidx/navigation/s;", "popUpTo", "", "saveState", "g", "(Landroidx/navigation/s;Z)V", "h", "f", "entry", "e", "Ljava/util/concurrent/locks/ReentrantLock;", "Ljava/util/concurrent/locks/ReentrantLock;", "backStackLock", "Lkotlinx/coroutines/flow/e0;", "", "b", "Lkotlinx/coroutines/flow/e0;", "_backStack", "", "c", "_transitionsInProgress", "d", "Z", "()Z", "k", "(Z)V", "isNavigating", "Lkotlinx/coroutines/flow/t0;", "Lkotlinx/coroutines/flow/t0;", "()Lkotlinx/coroutines/flow/t0;", "backStack", "transitionsInProgress", "navigation-common_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class f1 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @l
    private final ReentrantLock backStackLock = new ReentrantLock(true);

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    private final e0<List<s>> _backStack;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @l
    private final e0<Set<s>> _transitionsInProgress;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @c1({c1.a.LIBRARY_GROUP})
    private boolean isNavigating;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @l
    private final t0<List<s>> backStack;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @l
    private final t0<Set<s>> transitionsInProgress;

    public f1() {
        e0<List<s>> a5 = v0.a(j0.f74919b);
        this._backStack = a5;
        e0<Set<s>> a6 = v0.a(l0.f74939b);
        this._transitionsInProgress = a6;
        this.backStack = k.m(a5);
        this.transitionsInProgress = k.m(a6);
    }

    @l
    public abstract s a(@l f0 destination, @m Bundle arguments);

    @l
    public final t0<List<s>> b() {
        return this.backStack;
    }

    @l
    public final t0<Set<s>> c() {
        return this.transitionsInProgress;
    }

    /* renamed from: d, reason: from getter */
    public final boolean getIsNavigating() {
        return this.isNavigating;
    }

    public void e(@l s entry) {
        kotlin.jvm.internal.l0.p(entry, "entry");
        e0<Set<s>> e0Var = this._transitionsInProgress;
        e0Var.setValue(l1.y(e0Var.getValue(), entry));
    }

    @i
    public void f(@l s backStackEntry) {
        kotlin.jvm.internal.l0.p(backStackEntry, "backStackEntry");
        e0<List<s>> e0Var = this._backStack;
        e0Var.setValue(w.E4(w.q4(e0Var.getValue(), w.p3(this._backStack.getValue())), backStackEntry));
    }

    public void g(@l s popUpTo, boolean saveState) {
        kotlin.jvm.internal.l0.p(popUpTo, "popUpTo");
        ReentrantLock reentrantLock = this.backStackLock;
        reentrantLock.lock();
        try {
            e0<List<s>> e0Var = this._backStack;
            List<s> value = e0Var.getValue();
            ArrayList arrayList = new ArrayList();
            for (Object obj : value) {
                if (kotlin.jvm.internal.l0.g((s) obj, popUpTo)) {
                    break;
                } else {
                    arrayList.add(obj);
                }
            }
            e0Var.setValue(arrayList);
            k2 k2Var = k2.f75408a;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public void h(@l s popUpTo, boolean saveState) {
        s sVar;
        kotlin.jvm.internal.l0.p(popUpTo, "popUpTo");
        e0<Set<s>> e0Var = this._transitionsInProgress;
        e0Var.setValue(l1.D(e0Var.getValue(), popUpTo));
        List<s> value = this.backStack.getValue();
        ListIterator<s> listIterator = value.listIterator(value.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                sVar = null;
                break;
            }
            sVar = listIterator.previous();
            s sVar2 = sVar;
            if (!kotlin.jvm.internal.l0.g(sVar2, popUpTo) && this.backStack.getValue().lastIndexOf(sVar2) < this.backStack.getValue().lastIndexOf(popUpTo)) {
                break;
            }
        }
        s sVar3 = sVar;
        if (sVar3 != null) {
            e0<Set<s>> e0Var2 = this._transitionsInProgress;
            e0Var2.setValue(l1.D(e0Var2.getValue(), sVar3));
        }
        g(popUpTo, saveState);
    }

    public void i(@l s backStackEntry) {
        kotlin.jvm.internal.l0.p(backStackEntry, "backStackEntry");
        ReentrantLock reentrantLock = this.backStackLock;
        reentrantLock.lock();
        try {
            e0<List<s>> e0Var = this._backStack;
            e0Var.setValue(w.E4(e0Var.getValue(), backStackEntry));
            k2 k2Var = k2.f75408a;
        } finally {
            reentrantLock.unlock();
        }
    }

    public void j(@l s backStackEntry) {
        kotlin.jvm.internal.l0.p(backStackEntry, "backStackEntry");
        s sVar = (s) w.v3(this.backStack.getValue());
        if (sVar != null) {
            e0<Set<s>> e0Var = this._transitionsInProgress;
            e0Var.setValue(l1.D(e0Var.getValue(), sVar));
        }
        e0<Set<s>> e0Var2 = this._transitionsInProgress;
        e0Var2.setValue(l1.D(e0Var2.getValue(), backStackEntry));
        i(backStackEntry);
    }

    public final void k(boolean z4) {
        this.isNavigating = z4;
    }
}
