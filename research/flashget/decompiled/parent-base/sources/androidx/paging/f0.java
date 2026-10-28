package androidx.paging;

import androidx.annotation.c1;
import androidx.paging.e0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.k2;

/* compiled from: LoadStates.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u0000 \u00172\u00020\u0001:\u0001$B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J-\u0010\f\u001a\u00020\n2\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n0\bH\u0087\bø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\tH\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0015J.\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010%\u001a\u0004\b'\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010%\u001a\u0004\b(\u0010\u0015\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006)"}, d2 = {"Landroidx/paging/f0;", "", "Landroidx/paging/e0;", "refresh", "prepend", "append", "<init>", "(Landroidx/paging/e0;Landroidx/paging/e0;Landroidx/paging/e0;)V", "Lkotlin/Function2;", "Landroidx/paging/g0;", "Lkotlin/k2;", "op", "g", "(Lld/p;)V", "loadType", "newState", "l", "(Landroidx/paging/g0;Landroidx/paging/e0;)Landroidx/paging/f0;", "h", "(Landroidx/paging/g0;)Landroidx/paging/e0;", "b", "()Landroidx/paging/e0;", "c", "d", "e", "(Landroidx/paging/e0;Landroidx/paging/e0;Landroidx/paging/e0;)Landroidx/paging/f0;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Landroidx/paging/e0;", "k", "j", "i", "paging-common"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class f0 {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: e, reason: collision with root package name */
    @fg.l
    private static final f0 f31687e;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final e0 refresh;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final e0 prepend;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final e0 append;

    /* compiled from: LoadStates.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/paging/f0$a;", "", "<init>", "()V", "Landroidx/paging/f0;", "IDLE", "Landroidx/paging/f0;", "a", "()Landroidx/paging/f0;", "paging-common"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: androidx.paging.f0$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @fg.l
        public final f0 a() {
            return f0.f31687e;
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    /* compiled from: LoadStates.kt */
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f31691a;

        static {
            int[] iArr = new int[g0.values().length];
            iArr[g0.APPEND.ordinal()] = 1;
            iArr[g0.PREPEND.ordinal()] = 2;
            iArr[g0.REFRESH.ordinal()] = 3;
            f31691a = iArr;
        }
    }

    static {
        e0.c.Companion companion = e0.c.INSTANCE;
        companion.getClass();
        e0.c cVar = e0.c.f31663d;
        companion.getClass();
        e0.c cVar2 = e0.c.f31663d;
        companion.getClass();
        f31687e = new f0(cVar, cVar2, e0.c.f31663d);
    }

    public f0(@fg.l e0 refresh, @fg.l e0 prepend, @fg.l e0 append) {
        kotlin.jvm.internal.l0.p(refresh, "refresh");
        kotlin.jvm.internal.l0.p(prepend, "prepend");
        kotlin.jvm.internal.l0.p(append, "append");
        this.refresh = refresh;
        this.prepend = prepend;
        this.append = append;
    }

    public static /* synthetic */ f0 f(f0 f0Var, e0 e0Var, e0 e0Var2, e0 e0Var3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            e0Var = f0Var.refresh;
        }
        if ((i4 & 2) != 0) {
            e0Var2 = f0Var.prepend;
        }
        if ((i4 & 4) != 0) {
            e0Var3 = f0Var.append;
        }
        return f0Var.e(e0Var, e0Var2, e0Var3);
    }

    @fg.l
    /* renamed from: b, reason: from getter */
    public final e0 getRefresh() {
        return this.refresh;
    }

    @fg.l
    /* renamed from: c, reason: from getter */
    public final e0 getPrepend() {
        return this.prepend;
    }

    @fg.l
    /* renamed from: d, reason: from getter */
    public final e0 getAppend() {
        return this.append;
    }

    @fg.l
    public final f0 e(@fg.l e0 refresh, @fg.l e0 prepend, @fg.l e0 append) {
        kotlin.jvm.internal.l0.p(refresh, "refresh");
        kotlin.jvm.internal.l0.p(prepend, "prepend");
        kotlin.jvm.internal.l0.p(append, "append");
        return new f0(refresh, prepend, append);
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) other;
        return kotlin.jvm.internal.l0.g(this.refresh, f0Var.refresh) && kotlin.jvm.internal.l0.g(this.prepend, f0Var.prepend) && kotlin.jvm.internal.l0.g(this.append, f0Var.append);
    }

    @androidx.annotation.c1({c1.a.LIBRARY_GROUP})
    public final void g(@fg.l ld.p<? super g0, ? super e0, k2> op) {
        kotlin.jvm.internal.l0.p(op, "op");
        op.invoke(g0.REFRESH, this.refresh);
        op.invoke(g0.PREPEND, this.prepend);
        op.invoke(g0.APPEND, this.append);
    }

    @fg.l
    public final e0 h(@fg.l g0 loadType) {
        kotlin.jvm.internal.l0.p(loadType, "loadType");
        int i4 = b.f31691a[loadType.ordinal()];
        if (i4 == 1) {
            return this.append;
        }
        if (i4 == 2) {
            return this.prepend;
        }
        if (i4 == 3) {
            return this.refresh;
        }
        throw new NoWhenBranchMatchedException();
    }

    public int hashCode() {
        return this.append.hashCode() + ((this.prepend.hashCode() + (this.refresh.hashCode() * 31)) * 31);
    }

    @fg.l
    public final e0 i() {
        return this.append;
    }

    @fg.l
    public final e0 j() {
        return this.prepend;
    }

    @fg.l
    public final e0 k() {
        return this.refresh;
    }

    @fg.l
    public final f0 l(@fg.l g0 loadType, @fg.l e0 newState) {
        kotlin.jvm.internal.l0.p(loadType, "loadType");
        kotlin.jvm.internal.l0.p(newState, "newState");
        int i4 = b.f31691a[loadType.ordinal()];
        if (i4 == 1) {
            return f(this, null, null, newState, 3, null);
        }
        if (i4 == 2) {
            return f(this, null, newState, null, 5, null);
        }
        if (i4 == 3) {
            return f(this, newState, null, null, 6, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    @fg.l
    public String toString() {
        return "LoadStates(refresh=" + this.refresh + ", prepend=" + this.prepend + ", append=" + this.append + ')';
    }
}
