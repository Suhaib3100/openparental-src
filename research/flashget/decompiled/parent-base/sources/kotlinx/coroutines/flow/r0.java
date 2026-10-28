package kotlinx.coroutines.flow;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.a1;
import kotlin.jvm.internal.k1;
import kotlin.k2;

/* compiled from: SharingStarted.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lkotlinx/coroutines/flow/r0;", "Lkotlinx/coroutines/flow/o0;", "<init>", "()V", "Lkotlinx/coroutines/flow/t0;", "", "subscriptionCount", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/m0;", "a", "(Lkotlinx/coroutines/flow/t0;)Lkotlinx/coroutines/flow/i;", "", "toString", "()Ljava/lang/String;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
final class r0 implements o0 {

    /* compiled from: SharingStarted.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.StartedLazily$command$1", f = "SharingStarted.kt", i = {}, l = {155}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lkotlinx/coroutines/flow/m0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.coroutines.jvm.internal.o implements ld.p<j<? super m0>, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f80369b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f80370c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ t0<Integer> f80371d;

        /* compiled from: SharingStarted.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "count", "Lkotlin/k2;", "a", "(ILkotlin/coroutines/d;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: kotlinx.coroutines.flow.r0$a$a, reason: collision with other inner class name */
        static final class C1248a<T> implements j {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ k1.a f80372b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ j<m0> f80373c;

            /* compiled from: SharingStarted.kt */
            @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.StartedLazily$command$1$1", f = "SharingStarted.kt", i = {}, l = {158}, m = "emit", n = {}, s = {})
            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            /* renamed from: kotlinx.coroutines.flow.r0$a$a$a, reason: collision with other inner class name */
            static final class C1249a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: b, reason: collision with root package name */
                /* synthetic */ Object f80374b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ C1248a<T> f80375c;

                /* renamed from: d, reason: collision with root package name */
                int f80376d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C1249a(C1248a<? super T> c1248a, kotlin.coroutines.d<? super C1249a> dVar) {
                    super(dVar);
                    this.f80375c = c1248a;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @fg.m
                public final Object invokeSuspend(@fg.l Object obj) {
                    this.f80374b = obj;
                    this.f80376d |= Integer.MIN_VALUE;
                    return this.f80375c.a(0, this);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            C1248a(k1.a aVar, j<? super m0> jVar) {
                this.f80372b = aVar;
                this.f80373c = jVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
            @fg.m
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object a(int r5, @fg.l kotlin.coroutines.d<? super kotlin.k2> r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof kotlinx.coroutines.flow.r0.a.C1248a.C1249a
                    if (r0 == 0) goto L13
                    r0 = r6
                    kotlinx.coroutines.flow.r0$a$a$a r0 = (kotlinx.coroutines.flow.r0.a.C1248a.C1249a) r0
                    int r1 = r0.f80376d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f80376d = r1
                    goto L18
                L13:
                    kotlinx.coroutines.flow.r0$a$a$a r0 = new kotlinx.coroutines.flow.r0$a$a$a
                    r0.<init>(r4, r6)
                L18:
                    java.lang.Object r6 = r0.f80374b
                    kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
                    int r2 = r0.f80376d
                    r3 = 1
                    if (r2 == 0) goto L33
                    if (r2 != r3) goto L27
                    kotlin.a1.n(r6)
                    goto L4d
                L27:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "蝭\u0001"
                    java.lang.String r6 = com.flashget.parentalcontrol.ProtectedSandApp.s(r6)
                    r5.<init>(r6)
                    throw r5
                L33:
                    kotlin.a1.n(r6)
                    if (r5 <= 0) goto L50
                    kotlin.jvm.internal.k1$a r5 = r4.f80372b
                    boolean r6 = r5.f75322b
                    if (r6 != 0) goto L50
                    r5.f75322b = r3
                    kotlinx.coroutines.flow.j<kotlinx.coroutines.flow.m0> r5 = r4.f80373c
                    kotlinx.coroutines.flow.m0 r6 = kotlinx.coroutines.flow.m0.START
                    r0.f80376d = r3
                    java.lang.Object r5 = r5.emit(r6, r0)
                    if (r5 != r1) goto L4d
                    return r1
                L4d:
                    kotlin.k2 r5 = kotlin.k2.f75408a
                    return r5
                L50:
                    kotlin.k2 r5 = kotlin.k2.f75408a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.r0.a.C1248a.a(int, kotlin.coroutines.d):java.lang.Object");
            }

            @Override // kotlinx.coroutines.flow.j
            public /* bridge */ /* synthetic */ Object emit(Object obj, kotlin.coroutines.d dVar) {
                return a(((Number) obj).intValue(), dVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(t0<Integer> t0Var, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f80371d = t0Var;
        }

        @Override // ld.p
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.l j<? super m0> jVar, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            return ((a) create(jVar, dVar)).invokeSuspend(k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            a aVar = new a(this.f80371d, dVar);
            aVar.f80370c = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f80369b;
            if (i4 == 0) {
                a1.n(obj);
                j jVar = (j) this.f80370c;
                k1.a aVar2 = new k1.a();
                t0<Integer> t0Var = this.f80371d;
                C1248a c1248a = new C1248a(aVar2, jVar);
                this.f80369b = 1;
                if (t0Var.a(c1248a, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException(ProtectedSandApp.s("蝮\u0001"));
                }
                a1.n(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    @Override // kotlinx.coroutines.flow.o0
    @fg.l
    public i<m0> a(@fg.l t0<Integer> subscriptionCount) {
        return new h0(new a(subscriptionCount, null));
    }

    @fg.l
    public String toString() {
        return ProtectedSandApp.s("蝯\u0001");
    }
}
