package kotlinx.coroutines.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.coroutines.g;
import kotlinx.coroutines.l3;

/* compiled from: ThreadContext.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a#\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a!\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\n\u0010\u000b\"\u0014\u0010\u000e\u001a\u00020\f8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\n\u0010\r\"*\u0010\u0012\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011\"2\u0010\u0014\u001a \u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u0013\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00130\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0011\"&\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00150\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0011¨\u0006\u0018"}, d2 = {"Lkotlin/coroutines/g;", "context", "", "b", "(Lkotlin/coroutines/g;)Ljava/lang/Object;", "countOrElement", "c", "(Lkotlin/coroutines/g;Ljava/lang/Object;)Ljava/lang/Object;", "oldState", "Lkotlin/k2;", "a", "(Lkotlin/coroutines/g;Ljava/lang/Object;)V", "Lkotlinx/coroutines/internal/s0;", "Lkotlinx/coroutines/internal/s0;", "NO_THREAD_ELEMENTS", "Lkotlin/Function2;", "Lkotlin/coroutines/g$b;", "Lld/p;", "countAll", "Lkotlinx/coroutines/l3;", "findOne", "Lkotlinx/coroutines/internal/e1;", "d", "updateState", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class y0 {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    @kd.f
    public static final s0 f80834a = new s0(ProtectedSandApp.s("蠙\u0001"));

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    private static final ld.p<Object, g.b, Object> f80835b = a.f80838b;

    /* renamed from: c, reason: collision with root package name */
    @fg.l
    private static final ld.p<l3<?>, g.b, l3<?>> f80836c = b.f80839b;

    /* renamed from: d, reason: collision with root package name */
    @fg.l
    private static final ld.p<e1, g.b, e1> f80837d = c.f80840b;

    /* compiled from: ThreadContext.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "countOrElement", "Lkotlin/coroutines/g$b;", "element", "a", "(Ljava/lang/Object;Lkotlin/coroutines/g$b;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.jvm.internal.n0 implements ld.p<Object, g.b, Object> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f80838b = new a(2);

        a() {
            super(2);
        }

        @Override // ld.p
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.m Object obj, @fg.l g.b bVar) {
            if (!(bVar instanceof l3)) {
                return obj;
            }
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            int intValue = num != null ? num.intValue() : 1;
            return intValue == 0 ? bVar : Integer.valueOf(intValue + 1);
        }
    }

    /* compiled from: ThreadContext.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00002\f\u0010\u0001\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/coroutines/l3;", "found", "Lkotlin/coroutines/g$b;", "element", "a", "(Lkotlinx/coroutines/l3;Lkotlin/coroutines/g$b;)Lkotlinx/coroutines/l3;"}, k = 3, mv = {1, 8, 0})
    static final class b extends kotlin.jvm.internal.n0 implements ld.p<l3<?>, g.b, l3<?>> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f80839b = new b(2);

        b() {
            super(2);
        }

        @Override // ld.p
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final l3<?> invoke(@fg.m l3<?> l3Var, @fg.l g.b bVar) {
            if (l3Var != null) {
                return l3Var;
            }
            if (bVar instanceof l3) {
                return (l3) bVar;
            }
            return null;
        }
    }

    /* compiled from: ThreadContext.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/coroutines/internal/e1;", "state", "Lkotlin/coroutines/g$b;", "element", "a", "(Lkotlinx/coroutines/internal/e1;Lkotlin/coroutines/g$b;)Lkotlinx/coroutines/internal/e1;"}, k = 3, mv = {1, 8, 0})
    static final class c extends kotlin.jvm.internal.n0 implements ld.p<e1, g.b, e1> {

        /* renamed from: b, reason: collision with root package name */
        public static final c f80840b = new c(2);

        c() {
            super(2);
        }

        @Override // ld.p
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final e1 invoke(@fg.l e1 e1Var, @fg.l g.b bVar) {
            if (bVar instanceof l3) {
                l3<?> l3Var = (l3) bVar;
                e1Var.a(l3Var, l3Var.M0(e1Var.context));
            }
            return e1Var;
        }
    }

    public static final void a(@fg.l kotlin.coroutines.g gVar, @fg.m Object obj) {
        if (obj == f80834a) {
            return;
        }
        if (obj instanceof e1) {
            ((e1) obj).b(gVar);
            return;
        }
        Object g4 = gVar.g(null, f80836c);
        kotlin.jvm.internal.l0.n(g4, ProtectedSandApp.s("蠚\u0001"));
        ((l3) g4).H(gVar, obj);
    }

    @fg.l
    public static final Object b(@fg.l kotlin.coroutines.g gVar) {
        Object g4 = gVar.g(0, f80835b);
        kotlin.jvm.internal.l0.m(g4);
        return g4;
    }

    @fg.m
    public static final Object c(@fg.l kotlin.coroutines.g gVar, @fg.m Object obj) {
        if (obj == null) {
            obj = b(gVar);
        }
        if (obj == 0) {
            return f80834a;
        }
        if (obj instanceof Integer) {
            return gVar.g(new e1(gVar, ((Number) obj).intValue()), f80837d);
        }
        kotlin.jvm.internal.l0.n(obj, ProtectedSandApp.s("蠚\u0001"));
        return ((l3) obj).M0(gVar);
    }
}
