package androidx.paging;

import kotlin.Metadata;
import kotlin.k2;

/* compiled from: CombinedLoadStates.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J/\u0010\u0019\u001a\u00020\u00172\u001e\u0010\u0018\u001a\u001a\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00170\u0015H\u0000¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b\u001e\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010!\u001a\u0004\b \u0010#¨\u0006$"}, d2 = {"Landroidx/paging/i;", "", "Landroidx/paging/e0;", "refresh", "prepend", "append", "Landroidx/paging/f0;", "source", "mediator", "<init>", "(Landroidx/paging/e0;Landroidx/paging/e0;Landroidx/paging/e0;Landroidx/paging/f0;Landroidx/paging/f0;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lkotlin/Function3;", "Landroidx/paging/g0;", "Lkotlin/k2;", "op", "a", "(Lld/q;)V", "Landroidx/paging/e0;", "e", "()Landroidx/paging/e0;", "b", "d", "c", "Landroidx/paging/f0;", "f", "()Landroidx/paging/f0;", "paging-common"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final e0 refresh;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final e0 prepend;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final e0 append;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final f0 source;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final f0 mediator;

    public i(@fg.l e0 refresh, @fg.l e0 prepend, @fg.l e0 append, @fg.l f0 source, @fg.m f0 f0Var) {
        kotlin.jvm.internal.l0.p(refresh, "refresh");
        kotlin.jvm.internal.l0.p(prepend, "prepend");
        kotlin.jvm.internal.l0.p(append, "append");
        kotlin.jvm.internal.l0.p(source, "source");
        this.refresh = refresh;
        this.prepend = prepend;
        this.append = append;
        this.source = source;
        this.mediator = f0Var;
    }

    public final void a(@fg.l ld.q<? super g0, ? super Boolean, ? super e0, k2> op) {
        kotlin.jvm.internal.l0.p(op, "op");
        f0 f0Var = this.source;
        g0 g0Var = g0.REFRESH;
        e0 k4 = f0Var.k();
        Boolean bool = Boolean.FALSE;
        op.R(g0Var, bool, k4);
        g0 g0Var2 = g0.PREPEND;
        op.R(g0Var2, bool, f0Var.j());
        g0 g0Var3 = g0.APPEND;
        op.R(g0Var3, bool, f0Var.i());
        f0 f0Var2 = this.mediator;
        if (f0Var2 == null) {
            return;
        }
        e0 k5 = f0Var2.k();
        Boolean bool2 = Boolean.TRUE;
        op.R(g0Var, bool2, k5);
        op.R(g0Var2, bool2, f0Var2.j());
        op.R(g0Var3, bool2, f0Var2.i());
    }

    @fg.l
    /* renamed from: b, reason: from getter */
    public final e0 getAppend() {
        return this.append;
    }

    @fg.m
    /* renamed from: c, reason: from getter */
    public final f0 getMediator() {
        return this.mediator;
    }

    @fg.l
    /* renamed from: d, reason: from getter */
    public final e0 getPrepend() {
        return this.prepend;
    }

    @fg.l
    /* renamed from: e, reason: from getter */
    public final e0 getRefresh() {
        return this.refresh;
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (!kotlin.jvm.internal.l0.g(i.class, other == null ? null : other.getClass())) {
            return false;
        }
        if (other == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.paging.CombinedLoadStates");
        }
        i iVar = (i) other;
        return kotlin.jvm.internal.l0.g(this.refresh, iVar.refresh) && kotlin.jvm.internal.l0.g(this.prepend, iVar.prepend) && kotlin.jvm.internal.l0.g(this.append, iVar.append) && kotlin.jvm.internal.l0.g(this.source, iVar.source) && kotlin.jvm.internal.l0.g(this.mediator, iVar.mediator);
    }

    @fg.l
    /* renamed from: f, reason: from getter */
    public final f0 getSource() {
        return this.source;
    }

    public int hashCode() {
        int hashCode = (this.source.hashCode() + ((this.append.hashCode() + ((this.prepend.hashCode() + (this.refresh.hashCode() * 31)) * 31)) * 31)) * 31;
        f0 f0Var = this.mediator;
        return hashCode + (f0Var == null ? 0 : f0Var.hashCode());
    }

    @fg.l
    public String toString() {
        return "CombinedLoadStates(refresh=" + this.refresh + ", prepend=" + this.prepend + ", append=" + this.append + ", source=" + this.source + ", mediator=" + this.mediator + ')';
    }

    public /* synthetic */ i(e0 e0Var, e0 e0Var2, e0 e0Var3, f0 f0Var, f0 f0Var2, int i4, kotlin.jvm.internal.w wVar) {
        this(e0Var, e0Var2, e0Var3, f0Var, (i4 & 16) != 0 ? null : f0Var2);
    }
}
