package kotlinx.coroutines.flow;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.jvm.internal.u1;

/* compiled from: Distinct.kt */
@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0007\u001a#\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0002\u0010\u0003\u001a[\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000126\u0010\n\u001a2\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\u0004\b\u000b\u0010\f\u001a=\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\r*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011\u001aw\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u000e2:\u0010\n\u001a6\u0012\u0015\u0012\u0013\u0018\u00010\u0012¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0015\u0012\u0013\u0018\u00010\u0012¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u0004H\u0002¢\u0006\u0004\b\u0013\u0010\u0014\"$\u0010\u0016\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u0015\"*\u0010\u0018\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\t0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0017¨\u0006\u0019"}, d2 = {"T", "Lkotlinx/coroutines/flow/i;", "a", "(Lkotlinx/coroutines/flow/i;)Lkotlinx/coroutines/flow/i;", "Lkotlin/Function2;", "Lkotlin/r0;", "name", "old", "new", "", "areEquivalent", "b", "(Lkotlinx/coroutines/flow/i;Lld/p;)Lkotlinx/coroutines/flow/i;", "K", "Lkotlin/Function1;", "keySelector", "c", "(Lkotlinx/coroutines/flow/i;Lld/l;)Lkotlinx/coroutines/flow/i;", "", "d", "(Lkotlinx/coroutines/flow/i;Lld/l;Lld/p;)Lkotlinx/coroutines/flow/i;", "Lld/l;", "defaultKeySelector", "Lld/p;", "defaultAreEquivalent", "kotlinx-coroutines-core"}, k = 5, mv = {1, 8, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
/* loaded from: classes7.dex */
final /* synthetic */ class s {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private static final ld.l<Object, Object> f80377a = b.f80380b;

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    private static final ld.p<Object, Object, Boolean> f80378b = a.f80379b;

    /* compiled from: Distinct.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "old", "new", "", "a", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.jvm.internal.n0 implements ld.p<Object, Object, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f80379b = new a(2);

        a() {
            super(2);
        }

        @Override // ld.p
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(@fg.m Object obj, @fg.m Object obj2) {
            return Boolean.valueOf(kotlin.jvm.internal.l0.g(obj, obj2));
        }
    }

    /* compiled from: Distinct.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "it", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class b extends kotlin.jvm.internal.n0 implements ld.l<Object, Object> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f80380b = new b(1);

        b() {
            super(1);
        }

        @Override // ld.l
        @fg.m
        public final Object invoke(@fg.m Object obj) {
            return obj;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @fg.l
    public static final <T> i<T> a(@fg.l i<? extends T> iVar) {
        return iVar instanceof t0 ? iVar : d(iVar, f80377a, f80378b);
    }

    @fg.l
    public static final <T> i<T> b(@fg.l i<? extends T> iVar, @fg.l ld.p<? super T, ? super T, Boolean> pVar) {
        ld.l<Object, Object> lVar = f80377a;
        kotlin.jvm.internal.l0.n(pVar, ProtectedSandApp.s("蝾\u0001"));
        return d(iVar, lVar, (ld.p) u1.q(pVar, 2));
    }

    @fg.l
    public static final <T, K> i<T> c(@fg.l i<? extends T> iVar, @fg.l ld.l<? super T, ? extends K> lVar) {
        return d(iVar, lVar, f80378b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final <T> i<T> d(i<? extends T> iVar, ld.l<? super T, ? extends Object> lVar, ld.p<Object, Object, Boolean> pVar) {
        if (iVar instanceof g) {
            g gVar = (g) iVar;
            if (gVar.keySelector == lVar && gVar.areEquivalent == pVar) {
                return iVar;
            }
        }
        return new g(iVar, lVar, pVar);
    }
}
