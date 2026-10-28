package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.k1;
import kotlin.m2;

/* compiled from: Distinct.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002Bg\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000b\u0012:\u0010\u0018\u001a6\u0012\u0015\u0012\u0013\u0018\u00010\f¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0015\u0012\u0013\u0018\u00010\f¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u00150\u0010¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\"\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eRH\u0010\u0018\u001a6\u0012\u0015\u0012\u0013\u0018\u00010\f¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0015\u0012\u0013\u0018\u00010\f¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u00150\u00108\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001b"}, d2 = {"Lkotlinx/coroutines/flow/g;", "T", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/m2;", "a", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "o", "Lkotlinx/coroutines/flow/i;", "upstream", "Lkotlin/Function1;", "", "p", "Lq3/l;", "keySelector", "Lkotlin/Function2;", "Lkotlin/r0;", "name", "old", "new", "", "q", "Lq3/p;", "areEquivalent", "<init>", "(Lkotlinx/coroutines/flow/i;Lq3/l;Lq3/p;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes5.dex */
final class g<T> implements i<T> {

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final i<T> upstream;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    @d5.d
    @p3.f
    public final q3.l<T, Object> keySelector;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    @d5.d
    @p3.f
    public final q3.p<Object, Object, Boolean> areEquivalent;

    /* compiled from: Distinct.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "value", "Lkotlin/m2;", "b", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0})
    static final class a<T> implements j {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ g<T> f27980o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ k1.h<Object> f27981p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ j<T> f27982q;

        /* compiled from: Distinct.kt */
        @DebugMetadata(c = "kotlinx.coroutines.flow.DistinctFlowImpl$collect$2", f = "Distinct.kt", i = {}, l = {81}, m = "emit", n = {}, s = {})
        @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
        /* renamed from: kotlinx.coroutines.flow.g$a$a, reason: collision with other inner class name */
        /* loaded from: classes6.dex */
        static final class C0424a extends ContinuationImpl {

            /* renamed from: r, reason: collision with root package name */
            /* synthetic */ Object f27983r;

            /* renamed from: s, reason: collision with root package name */
            final /* synthetic */ a<T> f27984s;

            /* renamed from: t, reason: collision with root package name */
            int f27985t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0424a(a<? super T> aVar, Continuation<? super C0424a> continuation) {
                super(continuation);
                this.f27984s = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @d5.e
            public final Object A(@d5.d Object obj) {
                this.f27983r = obj;
                this.f27985t |= Integer.MIN_VALUE;
                return this.f27984s.b(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        a(g<T> gVar, k1.h<Object> hVar, j<? super T> jVar) {
            this.f27980o = gVar;
            this.f27981p = hVar;
            this.f27982q = jVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
        @Override // kotlinx.coroutines.flow.j
        @d5.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object b(T r6, @d5.d kotlin.coroutines.Continuation<? super kotlin.m2> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof kotlinx.coroutines.flow.g.a.C0424a
                if (r0 == 0) goto L13
                r0 = r7
                kotlinx.coroutines.flow.g$a$a r0 = (kotlinx.coroutines.flow.g.a.C0424a) r0
                int r1 = r0.f27985t
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f27985t = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.g$a$a r0 = new kotlinx.coroutines.flow.g$a$a
                r0.<init>(r5, r7)
            L18:
                java.lang.Object r7 = r0.f27983r
                kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r2 = r0.f27985t
                r3 = 1
                if (r2 == 0) goto L33
                if (r2 != r3) goto L27
                kotlin.a1.n(r7)
                goto L69
            L27:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "嵏"
                java.lang.String r7 = com.flashget.kidsdownloader.ProtectedSandApp.s(r7)
                r6.<init>(r7)
                throw r6
            L33:
                kotlin.a1.n(r7)
                kotlinx.coroutines.flow.g<T> r7 = r5.f27980o
                q3.l<T, java.lang.Object> r7 = r7.keySelector
                java.lang.Object r7 = r7.N(r6)
                kotlin.jvm.internal.k1$h<java.lang.Object> r2 = r5.f27981p
                T r2 = r2.f23572o
                kotlinx.coroutines.internal.r0 r4 = kotlinx.coroutines.flow.internal.s.f28115a
                if (r2 == r4) goto L5a
                kotlinx.coroutines.flow.g<T> r4 = r5.f27980o
                q3.p<java.lang.Object, java.lang.Object, java.lang.Boolean> r4 = r4.areEquivalent
                java.lang.Object r2 = r4.g0(r2, r7)
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                boolean r2 = r2.booleanValue()
                if (r2 != 0) goto L57
                goto L5a
            L57:
                kotlin.m2 r6 = kotlin.m2.f23662a
                return r6
            L5a:
                kotlin.jvm.internal.k1$h<java.lang.Object> r2 = r5.f27981p
                r2.f23572o = r7
                kotlinx.coroutines.flow.j<T> r7 = r5.f27982q
                r0.f27985t = r3
                java.lang.Object r6 = r7.b(r6, r0)
                if (r6 != r1) goto L69
                return r1
            L69:
                kotlin.m2 r6 = kotlin.m2.f23662a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.g.a.b(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g(@d5.d i<? extends T> iVar, @d5.d q3.l<? super T, ? extends Object> lVar, @d5.d q3.p<Object, Object, Boolean> pVar) {
        this.upstream = iVar;
        this.keySelector = lVar;
        this.areEquivalent = pVar;
    }

    @Override // kotlinx.coroutines.flow.i
    @d5.e
    public Object a(@d5.d j<? super T> jVar, @d5.d Continuation<? super m2> continuation) {
        k1.h hVar = new k1.h();
        hVar.f23572o = (T) kotlinx.coroutines.flow.internal.s.f28115a;
        Object a6 = this.upstream.a(new a(this, hVar, jVar), continuation);
        return a6 == CoroutineSingletons.COROUTINE_SUSPENDED ? a6 : m2.f23662a;
    }
}
