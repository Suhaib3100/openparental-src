package kotlinx.coroutines.flow.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.a1;
import kotlin.jvm.internal.r1;
import kotlin.k2;
import kotlinx.coroutines.channels.b0;
import kotlinx.coroutines.channels.d0;
import kotlinx.coroutines.r0;

/* compiled from: Merge.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B9\u0012\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ-\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0017\u001a\u00020\u00162\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0094@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018R \u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001b"}, d2 = {"Lkotlinx/coroutines/flow/internal/j;", "T", "Lkotlinx/coroutines/flow/internal/d;", "", "Lkotlinx/coroutines/flow/i;", "flows", "Lkotlin/coroutines/g;", "context", "", "capacity", "Lkotlinx/coroutines/channels/i;", "onBufferOverflow", "<init>", "(Ljava/lang/Iterable;Lkotlin/coroutines/g;ILkotlinx/coroutines/channels/i;)V", "k", "(Lkotlin/coroutines/g;ILkotlinx/coroutines/channels/i;)Lkotlinx/coroutines/flow/internal/d;", "Lkotlinx/coroutines/r0;", "scope", "Lkotlinx/coroutines/channels/d0;", "o", "(Lkotlinx/coroutines/r0;)Lkotlinx/coroutines/channels/d0;", "Lkotlinx/coroutines/channels/b0;", "Lkotlin/k2;", "i", "(Lkotlinx/coroutines/channels/b0;Lkotlin/coroutines/d;)Ljava/lang/Object;", "e", "Ljava/lang/Iterable;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nMerge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Merge.kt\nkotlinx/coroutines/flow/internal/ChannelLimitedFlowMerge\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,100:1\n1855#2,2:101\n*S KotlinDebug\n*F\n+ 1 Merge.kt\nkotlinx/coroutines/flow/internal/ChannelLimitedFlowMerge\n*L\n95#1:101,2\n*E\n"})
/* loaded from: classes7.dex */
public final class j<T> extends d<T> {

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Iterable<kotlinx.coroutines.flow.i<T>> flows;

    /* compiled from: Merge.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.internal.ChannelLimitedFlowMerge$collectTo$2$1", f = "Merge.kt", i = {}, l = {96}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.coroutines.jvm.internal.o implements ld.p<r0, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f80076b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i<T> f80077c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ w<T> f80078d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(kotlinx.coroutines.flow.i<? extends T> iVar, w<T> wVar, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f80077c = iVar;
            this.f80078d = wVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            return new a(this.f80077c, this.f80078d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f80076b;
            if (i4 == 0) {
                a1.n(obj);
                kotlinx.coroutines.flow.i<T> iVar = this.f80077c;
                w<T> wVar = this.f80078d;
                this.f80076b = 1;
                if (iVar.a(wVar, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException(ProtectedSandApp.s("蜛\u0001"));
                }
                a1.n(obj);
            }
            return k2.f75408a;
        }

        @Override // ld.p
        @fg.m
        public final Object invoke(@fg.l r0 r0Var, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            return ((a) create(r0Var, dVar)).invokeSuspend(k2.f75408a);
        }
    }

    public /* synthetic */ j(Iterable iterable, kotlin.coroutines.g gVar, int i4, kotlinx.coroutines.channels.i iVar, int i5, kotlin.jvm.internal.w wVar) {
        this(iterable, (i5 & 2) != 0 ? kotlin.coroutines.i.f75057b : gVar, (i5 & 4) != 0 ? -2 : i4, (i5 & 8) != 0 ? kotlinx.coroutines.channels.i.SUSPEND : iVar);
    }

    @Override // kotlinx.coroutines.flow.internal.d
    @fg.m
    protected Object i(@fg.l b0<? super T> b0Var, @fg.l kotlin.coroutines.d<? super k2> dVar) {
        w wVar = new w(b0Var);
        Iterator<kotlinx.coroutines.flow.i<T>> it = this.flows.iterator();
        while (it.hasNext()) {
            kotlinx.coroutines.k.f(b0Var, null, null, new a(it.next(), wVar, null), 3, null);
        }
        return k2.f75408a;
    }

    @Override // kotlinx.coroutines.flow.internal.d
    @fg.l
    protected d<T> k(@fg.l kotlin.coroutines.g context, int capacity, @fg.l kotlinx.coroutines.channels.i onBufferOverflow) {
        return new j(this.flows, context, capacity, onBufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.d
    @fg.l
    public d0<T> o(@fg.l r0 scope) {
        return kotlinx.coroutines.channels.z.e(scope, this.context, this.capacity, m());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public j(@fg.l Iterable<? extends kotlinx.coroutines.flow.i<? extends T>> iterable, @fg.l kotlin.coroutines.g gVar, int i4, @fg.l kotlinx.coroutines.channels.i iVar) {
        super(gVar, i4, iVar);
        this.flows = iterable;
    }
}
