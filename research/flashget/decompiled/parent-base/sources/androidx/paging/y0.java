package androidx.paging;

import androidx.paging.e0;
import androidx.paging.l0;
import java.util.List;
import kotlin.Metadata;
import kotlinx.coroutines.flow.l;

/* compiled from: PagingData.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 \u0012*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001:\u0001\u000eB%\b\u0000\u0012\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR&\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Landroidx/paging/y0;", "", "T", "Lkotlinx/coroutines/flow/i;", "Landroidx/paging/l0;", "flow", "Landroidx/paging/u1;", "receiver", "<init>", "(Lkotlinx/coroutines/flow/i;Landroidx/paging/u1;)V", "a", "Lkotlinx/coroutines/flow/i;", "e", "()Lkotlinx/coroutines/flow/i;", "b", "Landroidx/paging/u1;", "f", "()Landroidx/paging/u1;", "c", "paging-common"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class y0<T> {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: d, reason: collision with root package name */
    @fg.l
    private static final u1 f32455d;

    /* renamed from: e, reason: collision with root package name */
    @fg.l
    private static final y0<Object> f32456e;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final kotlinx.coroutines.flow.i<l0<T>> flow;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final u1 receiver;

    /* compiled from: PagingData.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"androidx/paging/y0$a", "Landroidx/paging/u1;", "Landroidx/paging/w1;", "viewportHint", "Lkotlin/k2;", "a", "(Landroidx/paging/w1;)V", "b", "()V", "refresh", "paging-common"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class a implements u1 {
        a() {
        }

        @Override // androidx.paging.u1
        public void a(@fg.l w1 viewportHint) {
            kotlin.jvm.internal.l0.p(viewportHint, "viewportHint");
        }

        @Override // androidx.paging.u1
        public void b() {
        }

        @Override // androidx.paging.u1
        public void refresh() {
        }
    }

    /* compiled from: PagingData.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005\"\b\b\u0001\u0010\u0004*\u00020\u0001H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J-\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005\"\b\b\u0001\u0010\u0004*\u00020\u00012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\bH\u0007¢\u0006\u0004\b\n\u0010\u000bR&\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00058\u0000X\u0080\u0004¢\u0006\u0012\n\u0004\b\f\u0010\r\u0012\u0004\b\u000f\u0010\u0003\u001a\u0004\b\u000e\u0010\u0007R\u001a\u0010\u0011\u001a\u00020\u00108\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Landroidx/paging/y0$b;", "", "<init>", "()V", "T", "Landroidx/paging/y0;", "a", "()Landroidx/paging/y0;", "", "data", "b", "(Ljava/util/List;)Landroidx/paging/y0;", "EMPTY", "Landroidx/paging/y0;", "c", "d", "Landroidx/paging/u1;", "NOOP_RECEIVER", "Landroidx/paging/u1;", "e", "()Landroidx/paging/u1;", "paging-common"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: androidx.paging.y0$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public static /* synthetic */ void d() {
        }

        @fg.l
        @kd.n
        public final <T> y0<T> a() {
            return y0.f32456e;
        }

        @fg.l
        @kd.n
        public final <T> y0<T> b(@fg.l List<? extends T> data) {
            kotlin.jvm.internal.l0.p(data, "data");
            l0.b.Companion companion = l0.b.INSTANCE;
            List k4 = kotlin.collections.w.k(new t1(0, data));
            e0.c.Companion companion2 = e0.c.INSTANCE;
            companion2.getClass();
            e0.c cVar = e0.c.f31663d;
            companion2.getClass();
            e0.c cVar2 = e0.c.f31662c;
            companion2.getClass();
            return new y0<>(new l.C1243l(l0.b.Companion.f(companion, k4, 0, 0, new f0(cVar, cVar2, e0.c.f31662c), null, 16, null)), y0.f32455d);
        }

        @fg.l
        public final y0<Object> c() {
            return y0.f32456e;
        }

        @fg.l
        public final u1 e() {
            return y0.f32455d;
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    static {
        a aVar = new a();
        f32455d = aVar;
        l0.b.INSTANCE.getClass();
        f32456e = new y0<>(new l.C1243l(l0.b.f31828h), aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public y0(@fg.l kotlinx.coroutines.flow.i<? extends l0<T>> flow, @fg.l u1 receiver) {
        kotlin.jvm.internal.l0.p(flow, "flow");
        kotlin.jvm.internal.l0.p(receiver, "receiver");
        this.flow = flow;
        this.receiver = receiver;
    }

    @fg.l
    @kd.n
    public static final <T> y0<T> c() {
        INSTANCE.getClass();
        return f32456e;
    }

    @fg.l
    @kd.n
    public static final <T> y0<T> d(@fg.l List<? extends T> list) {
        return INSTANCE.b(list);
    }

    @fg.l
    public final kotlinx.coroutines.flow.i<l0<T>> e() {
        return this.flow;
    }

    @fg.l
    /* renamed from: f, reason: from getter */
    public final u1 getReceiver() {
        return this.receiver;
    }
}
