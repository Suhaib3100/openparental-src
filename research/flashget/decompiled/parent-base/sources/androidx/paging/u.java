package androidx.paging;

import androidx.paging.w1;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.k2;

/* compiled from: HintHandler.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0002\f\u0014B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0012\u001a\u00060\u0010R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0011R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u00138F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Landroidx/paging/u;", "", "<init>", "()V", "Landroidx/paging/g0;", "loadType", "Lkotlinx/coroutines/flow/i;", "Landroidx/paging/w1;", "c", "(Landroidx/paging/g0;)Lkotlinx/coroutines/flow/i;", "viewportHint", "Lkotlin/k2;", "a", "(Landroidx/paging/g0;Landroidx/paging/w1;)V", "d", "(Landroidx/paging/w1;)V", "Landroidx/paging/u$b;", "Landroidx/paging/u$b;", "state", "Landroidx/paging/w1$a;", "b", "()Landroidx/paging/w1$a;", "lastAccessHint", "paging-common"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final b state = new b(this);

    /* compiled from: HintHandler.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R.\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\rR\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f8F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0010¨\u0006\u0012"}, d2 = {"Landroidx/paging/u$a;", "", "<init>", "(Landroidx/paging/u;)V", "Landroidx/paging/w1;", "value", "a", "Landroidx/paging/w1;", "b", "()Landroidx/paging/w1;", "c", "(Landroidx/paging/w1;)V", "Lkotlinx/coroutines/flow/d0;", "Lkotlinx/coroutines/flow/d0;", "_flow", "Lkotlinx/coroutines/flow/i;", "()Lkotlinx/coroutines/flow/i;", "flow", "paging-common"}, k = 1, mv = {1, 5, 1}, xi = 48)
    private final class a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @fg.m
        private w1 value;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final kotlinx.coroutines.flow.d0<w1> _flow;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ u f32393c;

        public a(u this$0) {
            kotlin.jvm.internal.l0.p(this$0, "this$0");
            this.f32393c = this$0;
            this._flow = kotlinx.coroutines.flow.k0.b(1, 0, kotlinx.coroutines.channels.i.DROP_OLDEST, 2, null);
        }

        @fg.l
        public final kotlinx.coroutines.flow.i<w1> a() {
            return this._flow;
        }

        @fg.m
        /* renamed from: b, reason: from getter */
        public final w1 getValue() {
            return this.value;
        }

        public final void c(@fg.m w1 w1Var) {
            this.value = w1Var;
            if (w1Var != null) {
                this._flow.b(w1Var);
            }
        }
    }

    /* compiled from: HintHandler.kt */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JW\u0010\u000f\u001a\u00020\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042>\u0010\u000e\u001a:\u0012\u0017\u0012\u00150\u0007R\u00020\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0017\u0012\u00150\u0007R\u00020\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\u0006¢\u0006\u0004\b\u000f\u0010\u0010R\u0018\u0010\u000b\u001a\u00060\u0007R\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0018\u0010\f\u001a\u00060\u0007R\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012R(\u0010\u0018\u001a\u0004\u0018\u00010\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u00048\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001aR\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u001eR\u0017\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u001e¨\u0006!"}, d2 = {"Landroidx/paging/u$b;", "", "<init>", "(Landroidx/paging/u;)V", "Landroidx/paging/w1$a;", "accessHint", "Lkotlin/Function2;", "Landroidx/paging/u$a;", "Landroidx/paging/u;", "Lkotlin/r0;", "name", "prepend", "append", "Lkotlin/k2;", "block", "d", "(Landroidx/paging/w1$a;Lld/p;)V", "a", "Landroidx/paging/u$a;", "b", "<set-?>", "c", "Landroidx/paging/w1$a;", "()Landroidx/paging/w1$a;", "lastAccessHint", "Ljava/util/concurrent/locks/ReentrantLock;", "Ljava/util/concurrent/locks/ReentrantLock;", "lock", "Lkotlinx/coroutines/flow/i;", "Landroidx/paging/w1;", "()Lkotlinx/coroutines/flow/i;", "prependFlow", "appendFlow", "paging-common"}, k = 1, mv = {1, 5, 1}, xi = 48)
    private final class b {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final a prepend;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final a append;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @fg.m
        private w1.a lastAccessHint;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final ReentrantLock lock;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ u f32398e;

        public b(u this$0) {
            kotlin.jvm.internal.l0.p(this$0, "this$0");
            this.f32398e = this$0;
            this.prepend = new a(this$0);
            this.append = new a(this$0);
            this.lock = new ReentrantLock();
        }

        @fg.l
        public final kotlinx.coroutines.flow.i<w1> a() {
            return this.append.a();
        }

        @fg.m
        /* renamed from: b, reason: from getter */
        public final w1.a getLastAccessHint() {
            return this.lastAccessHint;
        }

        @fg.l
        public final kotlinx.coroutines.flow.i<w1> c() {
            return this.prepend.a();
        }

        public final void d(@fg.m w1.a accessHint, @fg.l ld.p<? super a, ? super a, k2> block) {
            kotlin.jvm.internal.l0.p(block, "block");
            ReentrantLock reentrantLock = this.lock;
            reentrantLock.lock();
            if (accessHint != null) {
                try {
                    this.lastAccessHint = accessHint;
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            }
            block.invoke(this.prepend, this.append);
            k2 k2Var = k2.f75408a;
            reentrantLock.unlock();
        }
    }

    /* compiled from: HintHandler.kt */
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f32399a;

        static {
            int[] iArr = new int[g0.values().length];
            iArr[g0.PREPEND.ordinal()] = 1;
            iArr[g0.APPEND.ordinal()] = 2;
            f32399a = iArr;
        }
    }

    /* compiled from: HintHandler.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\n\u0010\u0002\u001a\u00060\u0000R\u00020\u00012\n\u0010\u0003\u001a\u00060\u0000R\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/paging/u$a;", "Landroidx/paging/u;", "prependHint", "appendHint", "Lkotlin/k2;", "<anonymous>", "(Landroidx/paging/u$a;Landroidx/paging/u$a;)V"}, k = 3, mv = {1, 5, 1})
    static final class d extends kotlin.jvm.internal.n0 implements ld.p<a, a, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ g0 f32400b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ w1 f32401c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(g0 g0Var, w1 w1Var) {
            super(2);
            this.f32400b = g0Var;
            this.f32401c = w1Var;
        }

        public final void a(@fg.l a prependHint, @fg.l a appendHint) {
            kotlin.jvm.internal.l0.p(prependHint, "prependHint");
            kotlin.jvm.internal.l0.p(appendHint, "appendHint");
            if (this.f32400b == g0.PREPEND) {
                prependHint.c(this.f32401c);
            } else {
                appendHint.c(this.f32401c);
            }
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(a aVar, a aVar2) {
            a(aVar, aVar2);
            return k2.f75408a;
        }
    }

    /* compiled from: HintHandler.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\n\u0010\u0002\u001a\u00060\u0000R\u00020\u00012\n\u0010\u0003\u001a\u00060\u0000R\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/paging/u$a;", "Landroidx/paging/u;", "prependHint", "appendHint", "Lkotlin/k2;", "<anonymous>", "(Landroidx/paging/u$a;Landroidx/paging/u$a;)V"}, k = 3, mv = {1, 5, 1})
    static final class e extends kotlin.jvm.internal.n0 implements ld.p<a, a, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ w1 f32402b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(w1 w1Var) {
            super(2);
            this.f32402b = w1Var;
        }

        public final void a(@fg.l a prependHint, @fg.l a appendHint) {
            kotlin.jvm.internal.l0.p(prependHint, "prependHint");
            kotlin.jvm.internal.l0.p(appendHint, "appendHint");
            if (v.a(this.f32402b, prependHint.getValue(), g0.PREPEND)) {
                prependHint.c(this.f32402b);
            }
            if (v.a(this.f32402b, appendHint.getValue(), g0.APPEND)) {
                appendHint.c(this.f32402b);
            }
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(a aVar, a aVar2) {
            a(aVar, aVar2);
            return k2.f75408a;
        }
    }

    public final void a(@fg.l g0 loadType, @fg.l w1 viewportHint) {
        kotlin.jvm.internal.l0.p(loadType, "loadType");
        kotlin.jvm.internal.l0.p(viewportHint, "viewportHint");
        if (!(loadType == g0.PREPEND || loadType == g0.APPEND)) {
            throw new IllegalArgumentException(kotlin.jvm.internal.l0.C("invalid load type for reset: ", loadType).toString());
        }
        this.state.d(null, new d(loadType, viewportHint));
    }

    @fg.m
    public final w1.a b() {
        return this.state.getLastAccessHint();
    }

    @fg.l
    public final kotlinx.coroutines.flow.i<w1> c(@fg.l g0 loadType) {
        kotlin.jvm.internal.l0.p(loadType, "loadType");
        int i4 = c.f32399a[loadType.ordinal()];
        if (i4 == 1) {
            return this.state.c();
        }
        if (i4 == 2) {
            return this.state.a();
        }
        throw new IllegalArgumentException("invalid load type for hints");
    }

    public final void d(@fg.l w1 viewportHint) {
        kotlin.jvm.internal.l0.p(viewportHint, "viewportHint");
        this.state.d(viewportHint instanceof w1.a ? (w1.a) viewportHint : null, new e(viewportHint));
    }
}
