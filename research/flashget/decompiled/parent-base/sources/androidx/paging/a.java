package androidx.paging;

import androidx.paging.e0;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: RemoteMediatorAccessor.kt */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001:\u0002\u0011 B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ)\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u000e¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010\u001b\u001a\u001c\u0012\u0004\u0012\u00020\u0006\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000e\u0018\u00010\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\u0015¢\u0006\u0004\b\u001d\u0010\u0005J\u0015\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\u0015¢\u0006\u0004\b \u0010\u0005J\u001f\u0010#\u001a\u00020\u00152\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\"\u001a\u0004\u0018\u00010!¢\u0006\u0004\b#\u0010$R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00130%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010&R\u001c\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010(R&\u0010-\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010+0*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010,¨\u0006."}, d2 = {"Landroidx/paging/a;", "", "Key", "Value", "<init>", "()V", "Landroidx/paging/g0;", "loadType", "Landroidx/paging/e0;", "f", "(Landroidx/paging/g0;)Landroidx/paging/e0;", "Landroidx/paging/f0;", "e", "()Landroidx/paging/f0;", "Landroidx/paging/d1;", "pagingState", "", "a", "(Landroidx/paging/g0;Landroidx/paging/d1;)Z", "Landroidx/paging/a$a;", "state", "Lkotlin/k2;", "i", "(Landroidx/paging/g0;Landroidx/paging/a$a;)V", "h", "()Landroidx/paging/d1;", "Lkotlin/q0;", "g", "()Lkotlin/q0;", "d", "c", "(Landroidx/paging/g0;)V", "b", "Landroidx/paging/e0$a;", "errorState", "j", "(Landroidx/paging/g0;Landroidx/paging/e0$a;)V", "", "[Landroidx/paging/a$a;", "blockStates", "[Landroidx/paging/e0$a;", "errors", "Lkotlin/collections/k;", "Landroidx/paging/a$b;", "Lkotlin/collections/k;", "pendingRequests", "paging-common"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes3.dex */
final class a<Key, Value> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final EnumC0519a[] blockStates;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final e0.a[] errors;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final kotlin.collections.k<b<Key, Value>> pendingRequests;

    /* compiled from: RemoteMediatorAccessor.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Landroidx/paging/a$a;", "", "<init>", "(Ljava/lang/String;I)V", "UNBLOCKED", "COMPLETED", "REQUIRES_REFRESH", "paging-common"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: androidx.paging.a$a, reason: collision with other inner class name */
    public enum EnumC0519a {
        UNBLOCKED,
        COMPLETED,
        REQUIRES_REFRESH
    }

    /* compiled from: RemoteMediatorAccessor.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000*\b\b\u0002\u0010\u0002*\u00020\u0001*\b\b\u0003\u0010\u0003*\u00020\u00012\u00020\u0001B#\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0006¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR.\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Landroidx/paging/a$b;", "", "Key", "Value", "Landroidx/paging/g0;", "loadType", "Landroidx/paging/d1;", "pagingState", "<init>", "(Landroidx/paging/g0;Landroidx/paging/d1;)V", "a", "Landroidx/paging/g0;", "()Landroidx/paging/g0;", "b", "Landroidx/paging/d1;", "()Landroidx/paging/d1;", "c", "(Landroidx/paging/d1;)V", "paging-common"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class b<Key, Value> {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final g0 loadType;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private d1<Key, Value> pagingState;

        public b(@fg.l g0 loadType, @fg.l d1<Key, Value> pagingState) {
            kotlin.jvm.internal.l0.p(loadType, "loadType");
            kotlin.jvm.internal.l0.p(pagingState, "pagingState");
            this.loadType = loadType;
            this.pagingState = pagingState;
        }

        @fg.l
        /* renamed from: a, reason: from getter */
        public final g0 getLoadType() {
            return this.loadType;
        }

        @fg.l
        public final d1<Key, Value> b() {
            return this.pagingState;
        }

        public final void c(@fg.l d1<Key, Value> d1Var) {
            kotlin.jvm.internal.l0.p(d1Var, "<set-?>");
            this.pagingState = d1Var;
        }
    }

    /* compiled from: RemoteMediatorAccessor.kt */
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f31429a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f31430b;

        static {
            int[] iArr = new int[EnumC0519a.values().length];
            iArr[EnumC0519a.COMPLETED.ordinal()] = 1;
            iArr[EnumC0519a.REQUIRES_REFRESH.ordinal()] = 2;
            iArr[EnumC0519a.UNBLOCKED.ordinal()] = 3;
            f31429a = iArr;
            int[] iArr2 = new int[g0.values().length];
            iArr2[g0.REFRESH.ordinal()] = 1;
            f31430b = iArr2;
        }
    }

    /* compiled from: RemoteMediatorAccessor.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Key", "Value", "Landroidx/paging/a$b;", "it", "", "<anonymous>", "(Landroidx/paging/a$b;)Z"}, k = 3, mv = {1, 5, 1})
    static final class d extends kotlin.jvm.internal.n0 implements ld.l<b<Key, Value>, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ g0 f31431b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(g0 g0Var) {
            super(1);
            this.f31431b = g0Var;
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(@fg.l b<Key, Value> it) {
            kotlin.jvm.internal.l0.p(it, "it");
            return Boolean.valueOf(it.getLoadType() == this.f31431b);
        }
    }

    public a() {
        int length = g0.values().length;
        EnumC0519a[] enumC0519aArr = new EnumC0519a[length];
        for (int i4 = 0; i4 < length; i4++) {
            enumC0519aArr[i4] = EnumC0519a.UNBLOCKED;
        }
        this.blockStates = enumC0519aArr;
        int length2 = g0.values().length;
        e0.a[] aVarArr = new e0.a[length2];
        for (int i5 = 0; i5 < length2; i5++) {
            aVarArr[i5] = null;
        }
        this.errors = aVarArr;
        this.pendingRequests = new kotlin.collections.k<>();
    }

    private final e0 f(g0 loadType) {
        EnumC0519a enumC0519a = this.blockStates[loadType.ordinal()];
        kotlin.collections.k<b<Key, Value>> kVar = this.pendingRequests;
        if (kVar == null || !kVar.isEmpty()) {
            Iterator<b<Key, Value>> it = kVar.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (it.next().getLoadType() == loadType) {
                    if (enumC0519a != EnumC0519a.REQUIRES_REFRESH) {
                        return e0.b.f31660b;
                    }
                }
            }
        }
        e0.a aVar = this.errors[loadType.ordinal()];
        if (aVar != null) {
            return aVar;
        }
        int i4 = c.f31429a[enumC0519a.ordinal()];
        if (i4 == 1) {
            if (c.f31430b[loadType.ordinal()] == 1) {
                e0.c.INSTANCE.getClass();
                return e0.c.f31663d;
            }
            e0.c.INSTANCE.getClass();
            return e0.c.f31662c;
        }
        if (i4 == 2) {
            e0.c.INSTANCE.getClass();
            return e0.c.f31663d;
        }
        if (i4 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        e0.c.INSTANCE.getClass();
        return e0.c.f31663d;
    }

    public final boolean a(@fg.l g0 loadType, @fg.l d1<Key, Value> pagingState) {
        b<Key, Value> bVar;
        kotlin.jvm.internal.l0.p(loadType, "loadType");
        kotlin.jvm.internal.l0.p(pagingState, "pagingState");
        Iterator<b<Key, Value>> it = this.pendingRequests.iterator();
        while (true) {
            if (!it.hasNext()) {
                bVar = null;
                break;
            }
            bVar = it.next();
            if (bVar.getLoadType() == loadType) {
                break;
            }
        }
        b<Key, Value> bVar2 = bVar;
        if (bVar2 != null) {
            bVar2.c(pagingState);
            return false;
        }
        EnumC0519a enumC0519a = this.blockStates[loadType.ordinal()];
        if (enumC0519a == EnumC0519a.REQUIRES_REFRESH && loadType != g0.REFRESH) {
            this.pendingRequests.addLast(new b<>(loadType, pagingState));
            return false;
        }
        if (enumC0519a != EnumC0519a.UNBLOCKED && loadType != g0.REFRESH) {
            return false;
        }
        g0 g0Var = g0.REFRESH;
        if (loadType == g0Var) {
            j(g0Var, null);
        }
        if (this.errors[loadType.ordinal()] != null) {
            return false;
        }
        this.pendingRequests.addLast(new b<>(loadType, pagingState));
        return true;
    }

    public final void b() {
        int length = this.errors.length - 1;
        if (length < 0) {
            return;
        }
        int i4 = 0;
        while (true) {
            int i5 = i4 + 1;
            this.errors[i4] = null;
            if (i5 > length) {
                return;
            } else {
                i4 = i5;
            }
        }
    }

    public final void c(@fg.l g0 loadType) {
        kotlin.jvm.internal.l0.p(loadType, "loadType");
        kotlin.collections.w.L0(this.pendingRequests, new d(loadType));
    }

    public final void d() {
        this.pendingRequests.clear();
    }

    @fg.l
    public final f0 e() {
        return new f0(f(g0.REFRESH), f(g0.PREPEND), f(g0.APPEND));
    }

    @fg.m
    public final kotlin.q0<g0, d1<Key, Value>> g() {
        b<Key, Value> bVar;
        Iterator<b<Key, Value>> it = this.pendingRequests.iterator();
        while (true) {
            if (!it.hasNext()) {
                bVar = null;
                break;
            }
            bVar = it.next();
            b<Key, Value> bVar2 = bVar;
            if (bVar2.getLoadType() != g0.REFRESH && this.blockStates[bVar2.getLoadType().ordinal()] == EnumC0519a.UNBLOCKED) {
                break;
            }
        }
        b<Key, Value> bVar3 = bVar;
        if (bVar3 == null) {
            return null;
        }
        return new kotlin.q0<>(bVar3.getLoadType(), bVar3.b());
    }

    @fg.m
    public final d1<Key, Value> h() {
        b<Key, Value> bVar;
        Iterator<b<Key, Value>> it = this.pendingRequests.iterator();
        while (true) {
            if (!it.hasNext()) {
                bVar = null;
                break;
            }
            bVar = it.next();
            if (bVar.getLoadType() == g0.REFRESH) {
                break;
            }
        }
        b<Key, Value> bVar2 = bVar;
        if (bVar2 == null) {
            return null;
        }
        return bVar2.b();
    }

    public final void i(@fg.l g0 loadType, @fg.l EnumC0519a state) {
        kotlin.jvm.internal.l0.p(loadType, "loadType");
        kotlin.jvm.internal.l0.p(state, "state");
        this.blockStates[loadType.ordinal()] = state;
    }

    public final void j(@fg.l g0 loadType, @fg.m e0.a errorState) {
        kotlin.jvm.internal.l0.p(loadType, "loadType");
        this.errors[loadType.ordinal()] = errorState;
    }
}
