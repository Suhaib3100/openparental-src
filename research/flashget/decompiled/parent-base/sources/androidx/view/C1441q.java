package androidx.view;

import androidx.view.AbstractC1450w;
import fg.l;
import fg.m;
import kotlin.Metadata;
import kotlin.a1;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.internal.l0;
import kotlin.k2;
import kotlinx.coroutines.channels.b0;
import kotlinx.coroutines.channels.e0;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.j;
import kotlinx.coroutines.flow.k;
import kotlinx.coroutines.r0;
import ld.p;

/* compiled from: FlowExt.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a5\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"T", "Lkotlinx/coroutines/flow/i;", "Landroidx/lifecycle/w;", "lifecycle", "Landroidx/lifecycle/w$b;", "minActiveState", "a", "(Lkotlinx/coroutines/flow/i;Landroidx/lifecycle/w;Landroidx/lifecycle/w$b;)Lkotlinx/coroutines/flow/i;", "lifecycle-runtime-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.lifecycle.q, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1441q {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: FlowExt.kt */
    @f(c = "androidx.lifecycle.FlowExtKt$flowWithLifecycle$1", f = "FlowExt.kt", i = {0}, l = {91}, m = "invokeSuspend", n = {"$this$callbackFlow"}, s = {"L$0"})
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lkotlinx/coroutines/channels/b0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/channels/b0;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.lifecycle.q$a */
    static final class a<T> extends o implements p<b0<? super T>, d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f30408b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f30409c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ AbstractC1450w f30410d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ AbstractC1450w.b f30411e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ i<T> f30412f;

        /* compiled from: FlowExt.kt */
        @f(c = "androidx.lifecycle.FlowExtKt$flowWithLifecycle$1$1", f = "FlowExt.kt", i = {}, l = {92}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.lifecycle.q$a$a, reason: collision with other inner class name */
        static final class C0495a extends o implements p<r0, d<? super k2>, Object> {

            /* renamed from: b, reason: collision with root package name */
            int f30413b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ i<T> f30414c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ b0<T> f30415d;

            /* compiled from: FlowExt.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "it", "Lkotlin/k2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            /* renamed from: androidx.lifecycle.q$a$a$a, reason: collision with other inner class name */
            static final class C0496a<T> implements j {

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ b0<T> f30416b;

                /* JADX WARN: Multi-variable type inference failed */
                C0496a(b0<? super T> b0Var) {
                    this.f30416b = b0Var;
                }

                @Override // kotlinx.coroutines.flow.j
                @m
                public final Object emit(T t4, @l d<? super k2> dVar) {
                    Object f02 = this.f30416b.f0(t4, dVar);
                    return f02 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? f02 : k2.f75408a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0495a(i<? extends T> iVar, b0<? super T> b0Var, d<? super C0495a> dVar) {
                super(2, dVar);
                this.f30414c = iVar;
                this.f30415d = b0Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @l
            public final d<k2> create(@m Object obj, @l d<?> dVar) {
                return new C0495a(this.f30414c, this.f30415d, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object obj) {
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                int i4 = this.f30413b;
                if (i4 == 0) {
                    a1.n(obj);
                    i<T> iVar = this.f30414c;
                    C0496a c0496a = new C0496a(this.f30415d);
                    this.f30413b = 1;
                    if (iVar.a(c0496a, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    a1.n(obj);
                }
                return k2.f75408a;
            }

            @Override // ld.p
            @m
            public final Object invoke(@l r0 r0Var, @m d<? super k2> dVar) {
                return ((C0495a) create(r0Var, dVar)).invokeSuspend(k2.f75408a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(AbstractC1450w abstractC1450w, AbstractC1450w.b bVar, i<? extends T> iVar, d<? super a> dVar) {
            super(2, dVar);
            this.f30410d = abstractC1450w;
            this.f30411e = bVar;
            this.f30412f = iVar;
        }

        @Override // ld.p
        @m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@l b0<? super T> b0Var, @m d<? super k2> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @l
        public final d<k2> create(@m Object obj, @l d<?> dVar) {
            a aVar = new a(this.f30410d, this.f30411e, this.f30412f, dVar);
            aVar.f30409c = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @m
        public final Object invokeSuspend(@l Object obj) {
            b0 b0Var;
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f30408b;
            if (i4 == 0) {
                a1.n(obj);
                b0 b0Var2 = (b0) this.f30409c;
                AbstractC1450w abstractC1450w = this.f30410d;
                AbstractC1450w.b bVar = this.f30411e;
                C0495a c0495a = new C0495a(this.f30412f, b0Var2, null);
                this.f30409c = b0Var2;
                this.f30408b = 1;
                if (RepeatOnLifecycleKt.a(abstractC1450w, bVar, c0495a, this) == aVar) {
                    return aVar;
                }
                b0Var = b0Var2;
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                b0Var = (b0) this.f30409c;
                a1.n(obj);
            }
            e0.a.a(b0Var, null, 1, null);
            return k2.f75408a;
        }
    }

    @l
    public static final <T> i<T> a(@l i<? extends T> iVar, @l AbstractC1450w lifecycle, @l AbstractC1450w.b minActiveState) {
        l0.p(iVar, "<this>");
        l0.p(lifecycle, "lifecycle");
        l0.p(minActiveState, "minActiveState");
        return k.s(new a(lifecycle, minActiveState, iVar, null));
    }

    public static /* synthetic */ i b(i iVar, AbstractC1450w abstractC1450w, AbstractC1450w.b bVar, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            bVar = AbstractC1450w.b.STARTED;
        }
        return a(iVar, abstractC1450w, bVar);
    }
}
