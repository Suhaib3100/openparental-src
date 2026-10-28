package androidx.paging;

import androidx.paging.e0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: MutableLoadStateCollection.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0013R\"\u0010\u0019\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010\u001d\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0014\u001a\u0004\b\u001b\u0010\u0016\"\u0004\b\u001c\u0010\u0018R\"\u0010\u001f\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0014\u001a\u0004\b\u001a\u0010\u0016\"\u0004\b\u001e\u0010\u0018¨\u0006 "}, d2 = {"Landroidx/paging/j0;", "", "<init>", "()V", "Landroidx/paging/f0;", "j", "()Landroidx/paging/f0;", "Landroidx/paging/g0;", "loadType", "Landroidx/paging/e0;", "a", "(Landroidx/paging/g0;)Landroidx/paging/e0;", "type", "state", "Lkotlin/k2;", "f", "(Landroidx/paging/g0;Landroidx/paging/e0;)V", "states", "e", "(Landroidx/paging/f0;)V", "Landroidx/paging/e0;", "d", "()Landroidx/paging/e0;", "i", "(Landroidx/paging/e0;)V", "refresh", "b", "c", "h", "prepend", "g", "append", "paging-common"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private e0 refresh;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private e0 prepend;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private e0 append;

    /* compiled from: MutableLoadStateCollection.kt */
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f31765a;

        static {
            int[] iArr = new int[g0.values().length];
            iArr[g0.REFRESH.ordinal()] = 1;
            iArr[g0.APPEND.ordinal()] = 2;
            iArr[g0.PREPEND.ordinal()] = 3;
            f31765a = iArr;
        }
    }

    public j0() {
        e0.c.Companion companion = e0.c.INSTANCE;
        companion.getClass();
        this.refresh = e0.c.f31663d;
        companion.getClass();
        this.prepend = e0.c.f31663d;
        companion.getClass();
        this.append = e0.c.f31663d;
    }

    @fg.l
    public final e0 a(@fg.l g0 loadType) {
        kotlin.jvm.internal.l0.p(loadType, "loadType");
        int i4 = a.f31765a[loadType.ordinal()];
        if (i4 == 1) {
            return this.refresh;
        }
        if (i4 == 2) {
            return this.append;
        }
        if (i4 == 3) {
            return this.prepend;
        }
        throw new NoWhenBranchMatchedException();
    }

    @fg.l
    /* renamed from: b, reason: from getter */
    public final e0 getAppend() {
        return this.append;
    }

    @fg.l
    /* renamed from: c, reason: from getter */
    public final e0 getPrepend() {
        return this.prepend;
    }

    @fg.l
    /* renamed from: d, reason: from getter */
    public final e0 getRefresh() {
        return this.refresh;
    }

    public final void e(@fg.l f0 states) {
        kotlin.jvm.internal.l0.p(states, "states");
        this.refresh = states.k();
        this.append = states.i();
        this.prepend = states.j();
    }

    public final void f(@fg.l g0 type, @fg.l e0 state) {
        kotlin.jvm.internal.l0.p(type, "type");
        kotlin.jvm.internal.l0.p(state, "state");
        int i4 = a.f31765a[type.ordinal()];
        if (i4 == 1) {
            this.refresh = state;
        } else if (i4 == 2) {
            this.append = state;
        } else {
            if (i4 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            this.prepend = state;
        }
    }

    public final void g(@fg.l e0 e0Var) {
        kotlin.jvm.internal.l0.p(e0Var, "<set-?>");
        this.append = e0Var;
    }

    public final void h(@fg.l e0 e0Var) {
        kotlin.jvm.internal.l0.p(e0Var, "<set-?>");
        this.prepend = e0Var;
    }

    public final void i(@fg.l e0 e0Var) {
        kotlin.jvm.internal.l0.p(e0Var, "<set-?>");
        this.refresh = e0Var;
    }

    @fg.l
    public final f0 j() {
        return new f0(this.refresh, this.prepend, this.append);
    }
}
