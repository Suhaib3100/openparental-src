package androidx.paging;

import androidx.paging.e0;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.k2;
import kotlinx.coroutines.flow.a0;

/* compiled from: MutableCombinedLoadStateCollection.kt */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\u0003J1\u0010\u000e\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0013\u0010\u0014J%\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\t¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001c\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010 \u001a\u00020\u00072\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u001e¢\u0006\u0004\b \u0010!J!\u0010\"\u001a\u00020\u00072\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u001e¢\u0006\u0004\b\"\u0010!R\u0016\u0010$\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010#R&\u0010'\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u001e0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010&R\u0016\u0010)\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010(R\u0016\u0010+\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010(R\u0016\u0010-\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010(R$\u00102\u001a\u00020\u00102\u0006\u0010.\u001a\u00020\u00108\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b/\u00101R(\u00103\u001a\u0004\u0018\u00010\u00102\b\u0010.\u001a\u0004\u0018\u00010\u00108\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\"\u00100\u001a\u0004\b,\u00101R\u001c\u00106\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0004048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u00105R\u001d\u0010:\u001a\b\u0012\u0004\u0012\u00020\u0004078\u0006¢\u0006\f\n\u0004\b\u001a\u00108\u001a\u0004\b*\u00109¨\u0006;"}, d2 = {"Landroidx/paging/i0;", "", "<init>", "()V", "Landroidx/paging/i;", "j", "()Landroidx/paging/i;", "Lkotlin/k2;", "k", "Landroidx/paging/e0;", "previousState", "sourceRefreshState", "sourceState", "remoteState", "b", "(Landroidx/paging/e0;Landroidx/paging/e0;Landroidx/paging/e0;Landroidx/paging/e0;)Landroidx/paging/e0;", "Landroidx/paging/f0;", "sourceLoadStates", "remoteLoadStates", "h", "(Landroidx/paging/f0;Landroidx/paging/f0;)V", "Landroidx/paging/g0;", "type", "", "remote", "state", "i", "(Landroidx/paging/g0;ZLandroidx/paging/e0;)Z", "c", "(Landroidx/paging/g0;Z)Landroidx/paging/e0;", "Lkotlin/Function1;", "listener", "a", "(Lld/l;)V", "g", "Z", "isInitialized", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Ljava/util/concurrent/CopyOnWriteArrayList;", "listeners", "Landroidx/paging/e0;", "refresh", "d", "prepend", "e", "append", "<set-?>", "f", "Landroidx/paging/f0;", "()Landroidx/paging/f0;", "source", "mediator", "Lkotlinx/coroutines/flow/e0;", "Lkotlinx/coroutines/flow/e0;", "_stateFlow", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/i;", "()Lkotlinx/coroutines/flow/i;", "flow", "paging-common"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private boolean isInitialized;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final CopyOnWriteArrayList<ld.l<i, k2>> listeners = new CopyOnWriteArrayList<>();

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private e0 refresh;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private e0 prepend;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private e0 append;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private f0 source;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private f0 mediator;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final kotlinx.coroutines.flow.e0<i> _stateFlow;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final kotlinx.coroutines.flow.i<i> flow;

    public i0() {
        e0.c.Companion companion = e0.c.INSTANCE;
        companion.getClass();
        this.refresh = e0.c.f31663d;
        companion.getClass();
        this.prepend = e0.c.f31663d;
        companion.getClass();
        this.append = e0.c.f31663d;
        f0.INSTANCE.getClass();
        this.source = f0.f31687e;
        kotlinx.coroutines.flow.e0<i> a5 = kotlinx.coroutines.flow.v0.a(null);
        this._stateFlow = a5;
        this.flow = new a0.e(a5);
    }

    private final e0 b(e0 previousState, e0 sourceRefreshState, e0 sourceState, e0 remoteState) {
        return remoteState == null ? sourceState : (!(previousState instanceof e0.b) || ((sourceRefreshState instanceof e0.c) && (remoteState instanceof e0.c)) || (remoteState instanceof e0.a)) ? remoteState : previousState;
    }

    private final i j() {
        if (this.isInitialized) {
            return new i(this.refresh, this.prepend, this.append, this.source, this.mediator);
        }
        return null;
    }

    private final void k() {
        e0 e0Var = this.refresh;
        e0 k4 = this.source.k();
        e0 k5 = this.source.k();
        f0 f0Var = this.mediator;
        this.refresh = b(e0Var, k4, k5, f0Var == null ? null : f0Var.k());
        e0 e0Var2 = this.prepend;
        e0 k6 = this.source.k();
        e0 j4 = this.source.j();
        f0 f0Var2 = this.mediator;
        this.prepend = b(e0Var2, k6, j4, f0Var2 == null ? null : f0Var2.j());
        e0 e0Var3 = this.append;
        e0 k7 = this.source.k();
        e0 i4 = this.source.i();
        f0 f0Var3 = this.mediator;
        this.append = b(e0Var3, k7, i4, f0Var3 != null ? f0Var3.i() : null);
        i j5 = j();
        if (j5 != null) {
            this._stateFlow.setValue(j5);
            Iterator<T> it = this.listeners.iterator();
            while (it.hasNext()) {
                ((ld.l) it.next()).invoke(j5);
            }
        }
    }

    public final void a(@fg.l ld.l<? super i, k2> listener) {
        kotlin.jvm.internal.l0.p(listener, "listener");
        this.listeners.add(listener);
        i j4 = j();
        if (j4 == null) {
            return;
        }
        listener.invoke(j4);
    }

    @fg.m
    public final e0 c(@fg.l g0 type, boolean remote) {
        kotlin.jvm.internal.l0.p(type, "type");
        f0 f0Var = remote ? this.mediator : this.source;
        if (f0Var == null) {
            return null;
        }
        return f0Var.h(type);
    }

    @fg.l
    public final kotlinx.coroutines.flow.i<i> d() {
        return this.flow;
    }

    @fg.m
    /* renamed from: e, reason: from getter */
    public final f0 getMediator() {
        return this.mediator;
    }

    @fg.l
    /* renamed from: f, reason: from getter */
    public final f0 getSource() {
        return this.source;
    }

    public final void g(@fg.l ld.l<? super i, k2> listener) {
        kotlin.jvm.internal.l0.p(listener, "listener");
        this.listeners.remove(listener);
    }

    public final void h(@fg.l f0 sourceLoadStates, @fg.m f0 remoteLoadStates) {
        kotlin.jvm.internal.l0.p(sourceLoadStates, "sourceLoadStates");
        this.isInitialized = true;
        this.source = sourceLoadStates;
        this.mediator = remoteLoadStates;
        k();
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
    
        if (kotlin.jvm.internal.l0.g(r4, r5) == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0029, code lost:
    
        if (kotlin.jvm.internal.l0.g(r4, r5) == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002c, code lost:
    
        r0 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean i(@fg.l androidx.paging.g0 r4, boolean r5, @fg.l androidx.paging.e0 r6) {
        /*
            r3 = this;
            java.lang.String r0 = "type"
            kotlin.jvm.internal.l0.p(r4, r0)
            java.lang.String r0 = "state"
            kotlin.jvm.internal.l0.p(r6, r0)
            r0 = 1
            r3.isInitialized = r0
            r1 = 0
            if (r5 == 0) goto L2e
            androidx.paging.f0 r5 = r3.mediator
            if (r5 != 0) goto L1e
            androidx.paging.f0$a r2 = androidx.paging.f0.INSTANCE
            r2.getClass()
            androidx.paging.f0 r2 = androidx.paging.f0.a()
            goto L1f
        L1e:
            r2 = r5
        L1f:
            androidx.paging.f0 r4 = r2.l(r4, r6)
            r3.mediator = r4
            boolean r4 = kotlin.jvm.internal.l0.g(r4, r5)
            if (r4 != 0) goto L2c
            goto L3c
        L2c:
            r0 = r1
            goto L3c
        L2e:
            androidx.paging.f0 r5 = r3.source
            androidx.paging.f0 r4 = r5.l(r4, r6)
            r3.source = r4
            boolean r4 = kotlin.jvm.internal.l0.g(r4, r5)
            if (r4 != 0) goto L2c
        L3c:
            r3.k()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.i0.i(androidx.paging.g0, boolean, androidx.paging.e0):boolean");
    }
}
