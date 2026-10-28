package kotlinx.coroutines.flow;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.a1;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.k1;
import kotlin.m2;

/* compiled from: SharingStarted.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\b\u0010\t\u001a\u00020\bH\u0016¨\u0006\f"}, d2 = {"Lkotlinx/coroutines/flow/r0;", "Lkotlinx/coroutines/flow/o0;", "Lkotlinx/coroutines/flow/t0;", "", "subscriptionCount", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/m0;", "a", "", "toString", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes5.dex */
final class r0 implements o0 {

    /* compiled from: SharingStarted.kt */
    @DebugMetadata(c = "kotlinx.coroutines.flow.StartedLazily$command$1", f = "SharingStarted.kt", i = {}, l = {155}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lkotlinx/coroutines/flow/m0;", "Lkotlin/m2;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes6.dex */
    static final class a extends SuspendLambda implements q3.p<j<? super m0>, Continuation<? super m2>, Object> {

        /* renamed from: s, reason: collision with root package name */
        int f28324s;

        /* renamed from: t, reason: collision with root package name */
        private /* synthetic */ Object f28325t;

        /* renamed from: u, reason: collision with root package name */
        final /* synthetic */ t0<Integer> f28326u;

        /* compiled from: SharingStarted.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "count", "Lkotlin/m2;", "a", "(ILkotlin/coroutines/d;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0})
        /* renamed from: kotlinx.coroutines.flow.r0$a$a, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        static final class C0441a<T> implements j {

            /* renamed from: o, reason: collision with root package name */
            final /* synthetic */ k1.a f28327o;

            /* renamed from: p, reason: collision with root package name */
            final /* synthetic */ j<m0> f28328p;

            /* compiled from: SharingStarted.kt */
            @DebugMetadata(c = "kotlinx.coroutines.flow.StartedLazily$command$1$1", f = "SharingStarted.kt", i = {}, l = {158}, m = "emit", n = {}, s = {})
            @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
            /* renamed from: kotlinx.coroutines.flow.r0$a$a$a, reason: collision with other inner class name */
            /* loaded from: classes6.dex */
            static final class C0442a extends ContinuationImpl {

                /* renamed from: r, reason: collision with root package name */
                /* synthetic */ Object f28329r;

                /* renamed from: s, reason: collision with root package name */
                final /* synthetic */ C0441a<T> f28330s;

                /* renamed from: t, reason: collision with root package name */
                int f28331t;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C0442a(C0441a<? super T> c0441a, Continuation<? super C0442a> continuation) {
                    super(continuation);
                    this.f28330s = c0441a;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @d5.e
                public final Object A(@d5.d Object obj) {
                    this.f28329r = obj;
                    this.f28331t |= Integer.MIN_VALUE;
                    return this.f28330s.a(0, this);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            C0441a(k1.a aVar, j<? super m0> jVar) {
                this.f28327o = aVar;
                this.f28328p = jVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
            @d5.e
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object a(int r5, @d5.d kotlin.coroutines.Continuation<? super kotlin.m2> r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof kotlinx.coroutines.flow.r0.a.C0441a.C0442a
                    if (r0 == 0) goto L13
                    r0 = r6
                    kotlinx.coroutines.flow.r0$a$a$a r0 = (kotlinx.coroutines.flow.r0.a.C0441a.C0442a) r0
                    int r1 = r0.f28331t
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f28331t = r1
                    goto L18
                L13:
                    kotlinx.coroutines.flow.r0$a$a$a r0 = new kotlinx.coroutines.flow.r0$a$a$a
                    r0.<init>(r4, r6)
                L18:
                    java.lang.Object r6 = r0.f28329r
                    kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                    int r2 = r0.f28331t
                    r3 = 1
                    if (r2 == 0) goto L33
                    if (r2 != r3) goto L27
                    kotlin.a1.n(r6)
                    goto L4d
                L27:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "嵿"
                    java.lang.String r6 = com.flashget.kidsdownloader.ProtectedSandApp.s(r6)
                    r5.<init>(r6)
                    throw r5
                L33:
                    kotlin.a1.n(r6)
                    if (r5 <= 0) goto L50
                    kotlin.jvm.internal.k1$a r5 = r4.f28327o
                    boolean r6 = r5.f23565o
                    if (r6 != 0) goto L50
                    r5.f23565o = r3
                    kotlinx.coroutines.flow.j<kotlinx.coroutines.flow.m0> r5 = r4.f28328p
                    kotlinx.coroutines.flow.m0 r6 = kotlinx.coroutines.flow.m0.START
                    r0.f28331t = r3
                    java.lang.Object r5 = r5.b(r6, r0)
                    if (r5 != r1) goto L4d
                    return r1
                L4d:
                    kotlin.m2 r5 = kotlin.m2.f23662a
                    return r5
                L50:
                    kotlin.m2 r5 = kotlin.m2.f23662a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.r0.a.C0441a.a(int, kotlin.coroutines.d):java.lang.Object");
            }

            @Override // kotlinx.coroutines.flow.j
            public /* bridge */ /* synthetic */ Object b(Object obj, Continuation continuation) {
                return a(((Number) obj).intValue(), continuation);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(t0<Integer> t0Var, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f28326u = t0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.e
        public final Object A(@d5.d Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i5 = this.f28324s;
            if (i5 == 0) {
                a1.n(obj);
                j jVar = (j) this.f28325t;
                k1.a aVar = new k1.a();
                t0<Integer> t0Var = this.f28326u;
                C0441a c0441a = new C0441a(aVar, jVar);
                this.f28324s = 1;
                if (t0Var.a(c0441a, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i5 != 1) {
                    throw new IllegalStateException(ProtectedSandApp.s("鄛"));
                }
                a1.n(obj);
            }
            throw new KotlinNothingValueException();
        }

        @Override // q3.p
        @d5.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object g0(@d5.d j<? super m0> jVar, @d5.e Continuation<? super m2> continuation) {
            return ((a) c(jVar, continuation)).A(m2.f23662a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.d
        public final Continuation<m2> c(@d5.e Object obj, @d5.d Continuation<?> continuation) {
            a aVar = new a(this.f28326u, continuation);
            aVar.f28325t = obj;
            return aVar;
        }
    }

    @Override // kotlinx.coroutines.flow.o0
    @d5.d
    public i<m0> a(@d5.d t0<Integer> subscriptionCount) {
        return new h0(new a(subscriptionCount, null));
    }

    @d5.d
    public String toString() {
        return ProtectedSandApp.s("嶀");
    }
}
