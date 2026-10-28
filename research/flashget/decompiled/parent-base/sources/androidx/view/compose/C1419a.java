package androidx.view.compose;

import androidx.compose.runtime.b5;
import androidx.compose.runtime.o4;
import androidx.compose.runtime.t;
import androidx.compose.runtime.y2;
import androidx.compose.ui.platform.o0;
import androidx.view.AbstractC1450w;
import androidx.view.InterfaceC1423e0;
import androidx.view.RepeatOnLifecycleKt;
import fg.l;
import fg.m;
import kotlin.Metadata;
import kotlin.a1;
import kotlin.coroutines.d;
import kotlin.coroutines.g;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.k2;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.j;
import kotlinx.coroutines.flow.t0;
import kotlinx.coroutines.r0;
import ld.p;

/* compiled from: FlowExt.kt */
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aC\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n\u001aA\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\r\u0010\u000e\u001aK\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000f2\u0006\u0010\u0010\u001a\u00028\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001aI\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000f2\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"T", "Lkotlinx/coroutines/flow/t0;", "Landroidx/lifecycle/e0;", "lifecycleOwner", "Landroidx/lifecycle/w$b;", "minActiveState", "Lkotlin/coroutines/g;", "context", "Landroidx/compose/runtime/b5;", "d", "(Lkotlinx/coroutines/flow/t0;Landroidx/lifecycle/e0;Landroidx/lifecycle/w$b;Lkotlin/coroutines/g;Landroidx/compose/runtime/t;II)Landroidx/compose/runtime/b5;", "Landroidx/lifecycle/w;", "lifecycle", "c", "(Lkotlinx/coroutines/flow/t0;Landroidx/lifecycle/w;Landroidx/lifecycle/w$b;Lkotlin/coroutines/g;Landroidx/compose/runtime/t;II)Landroidx/compose/runtime/b5;", "Lkotlinx/coroutines/flow/i;", "initialValue", "b", "(Lkotlinx/coroutines/flow/i;Ljava/lang/Object;Landroidx/lifecycle/e0;Landroidx/lifecycle/w$b;Lkotlin/coroutines/g;Landroidx/compose/runtime/t;II)Landroidx/compose/runtime/b5;", "a", "(Lkotlinx/coroutines/flow/i;Ljava/lang/Object;Landroidx/lifecycle/w;Landroidx/lifecycle/w$b;Lkotlin/coroutines/g;Landroidx/compose/runtime/t;II)Landroidx/compose/runtime/b5;", "lifecycle-runtime-compose_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nFlowExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowExt.kt\nandroidx/lifecycle/compose/FlowExtKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,180:1\n76#2:181\n76#2:182\n*S KotlinDebug\n*F\n+ 1 FlowExt.kt\nandroidx/lifecycle/compose/FlowExtKt\n*L\n58#1:181\n130#1:182\n*E\n"})
/* renamed from: androidx.lifecycle.compose.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1419a {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: FlowExt.kt */
    @f(c = "androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1", f = "FlowExt.kt", i = {}, l = {171}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.lifecycle.compose.a$a, reason: collision with other inner class name */
    static final class C0487a<T> extends o implements p<y2<T>, d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f30253b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f30254c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ AbstractC1450w f30255d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ AbstractC1450w.b f30256e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ g f30257f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ i<T> f30258g;

        /* compiled from: FlowExt.kt */
        @f(c = "androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1$1", f = "FlowExt.kt", i = {}, l = {173, 174}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: androidx.lifecycle.compose.a$a$a, reason: collision with other inner class name */
        static final class C0488a extends o implements p<r0, d<? super k2>, Object> {

            /* renamed from: b, reason: collision with root package name */
            int f30259b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ g f30260c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ i<T> f30261d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ y2<T> f30262e;

            /* compiled from: FlowExt.kt */
            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            /* renamed from: androidx.lifecycle.compose.a$a$a$a, reason: collision with other inner class name */
            static final class C0489a implements j<T> {

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ y2<T> f30263b;

                C0489a(y2<T> y2Var) {
                    this.f30263b = y2Var;
                }

                @Override // kotlinx.coroutines.flow.j
                @m
                public final Object emit(T t4, @l d<? super k2> dVar) {
                    this.f30263b.setValue(t4);
                    return k2.f75408a;
                }
            }

            /* compiled from: FlowExt.kt */
            @f(c = "androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1$1$2", f = "FlowExt.kt", i = {}, l = {175}, m = "invokeSuspend", n = {}, s = {})
            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            /* renamed from: androidx.lifecycle.compose.a$a$a$b */
            static final class b extends o implements p<r0, d<? super k2>, Object> {

                /* renamed from: b, reason: collision with root package name */
                int f30264b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ i<T> f30265c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ y2<T> f30266d;

                /* compiled from: FlowExt.kt */
                @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                /* renamed from: androidx.lifecycle.compose.a$a$a$b$a, reason: collision with other inner class name */
                static final class C0490a implements j<T> {

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ y2<T> f30267b;

                    C0490a(y2<T> y2Var) {
                        this.f30267b = y2Var;
                    }

                    @Override // kotlinx.coroutines.flow.j
                    @m
                    public final Object emit(T t4, @l d<? super k2> dVar) {
                        this.f30267b.setValue(t4);
                        return k2.f75408a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                b(i<? extends T> iVar, y2<T> y2Var, d<? super b> dVar) {
                    super(2, dVar);
                    this.f30265c = iVar;
                    this.f30266d = y2Var;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @l
                public final d<k2> create(@m Object obj, @l d<?> dVar) {
                    return new b(this.f30265c, this.f30266d, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object obj) {
                    a aVar = a.COROUTINE_SUSPENDED;
                    int i4 = this.f30264b;
                    if (i4 == 0) {
                        a1.n(obj);
                        i<T> iVar = this.f30265c;
                        C0490a c0490a = new C0490a(this.f30266d);
                        this.f30264b = 1;
                        if (iVar.a(c0490a, this) == aVar) {
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
                    return ((b) create(r0Var, dVar)).invokeSuspend(k2.f75408a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0488a(g gVar, i<? extends T> iVar, y2<T> y2Var, d<? super C0488a> dVar) {
                super(2, dVar);
                this.f30260c = gVar;
                this.f30261d = iVar;
                this.f30262e = y2Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @l
            public final d<k2> create(@m Object obj, @l d<?> dVar) {
                return new C0488a(this.f30260c, this.f30261d, this.f30262e, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object obj) {
                a aVar = a.COROUTINE_SUSPENDED;
                int i4 = this.f30259b;
                if (i4 == 0) {
                    a1.n(obj);
                    if (l0.g(this.f30260c, kotlin.coroutines.i.f75057b)) {
                        i<T> iVar = this.f30261d;
                        C0489a c0489a = new C0489a(this.f30262e);
                        this.f30259b = 1;
                        if (iVar.a(c0489a, this) == aVar) {
                            return aVar;
                        }
                    } else {
                        g gVar = this.f30260c;
                        b bVar = new b(this.f30261d, this.f30262e, null);
                        this.f30259b = 2;
                        if (kotlinx.coroutines.i.h(gVar, bVar, this) == aVar) {
                            return aVar;
                        }
                    }
                } else {
                    if (i4 != 1 && i4 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    a1.n(obj);
                }
                return k2.f75408a;
            }

            @Override // ld.p
            @m
            public final Object invoke(@l r0 r0Var, @m d<? super k2> dVar) {
                return ((C0488a) create(r0Var, dVar)).invokeSuspend(k2.f75408a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C0487a(AbstractC1450w abstractC1450w, AbstractC1450w.b bVar, g gVar, i<? extends T> iVar, d<? super C0487a> dVar) {
            super(2, dVar);
            this.f30255d = abstractC1450w;
            this.f30256e = bVar;
            this.f30257f = gVar;
            this.f30258g = iVar;
        }

        @Override // ld.p
        @m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@l y2<T> y2Var, @m d<? super k2> dVar) {
            return ((C0487a) create(y2Var, dVar)).invokeSuspend(k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @l
        public final d<k2> create(@m Object obj, @l d<?> dVar) {
            C0487a c0487a = new C0487a(this.f30255d, this.f30256e, this.f30257f, this.f30258g, dVar);
            c0487a.f30254c = obj;
            return c0487a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @m
        public final Object invokeSuspend(@l Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            int i4 = this.f30253b;
            if (i4 == 0) {
                a1.n(obj);
                y2 y2Var = (y2) this.f30254c;
                AbstractC1450w abstractC1450w = this.f30255d;
                AbstractC1450w.b bVar = this.f30256e;
                C0488a c0488a = new C0488a(this.f30257f, this.f30258g, y2Var, null);
                this.f30253b = 1;
                if (RepeatOnLifecycleKt.a(abstractC1450w, bVar, c0488a, this) == aVar) {
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
    }

    @l
    @androidx.compose.runtime.i
    public static final <T> b5<T> a(@l i<? extends T> iVar, T t4, @l AbstractC1450w lifecycle, @m AbstractC1450w.b bVar, @m g gVar, @m t tVar, int i4, int i5) {
        l0.p(iVar, "<this>");
        l0.p(lifecycle, "lifecycle");
        tVar.P(1977777920);
        if ((i5 & 4) != 0) {
            bVar = AbstractC1450w.b.STARTED;
        }
        AbstractC1450w.b bVar2 = bVar;
        if ((i5 & 8) != 0) {
            gVar = kotlin.coroutines.i.f75057b;
        }
        g gVar2 = gVar;
        Object[] objArr = {iVar, lifecycle, bVar2, gVar2};
        C0487a c0487a = new C0487a(lifecycle, bVar2, gVar2, iVar, null);
        int i6 = i4 >> 3;
        b5<T> s4 = o4.s(t4, objArr, c0487a, tVar, (i6 & 14) | (i6 & 8) | 576);
        tVar.p0();
        return s4;
    }

    @l
    @androidx.compose.runtime.i
    public static final <T> b5<T> b(@l i<? extends T> iVar, T t4, @m InterfaceC1423e0 interfaceC1423e0, @m AbstractC1450w.b bVar, @m g gVar, @m t tVar, int i4, int i5) {
        l0.p(iVar, "<this>");
        tVar.P(-1485997211);
        if ((i5 & 2) != 0) {
            interfaceC1423e0 = (InterfaceC1423e0) tVar.x(o0.i());
        }
        if ((i5 & 4) != 0) {
            bVar = AbstractC1450w.b.STARTED;
        }
        AbstractC1450w.b bVar2 = bVar;
        if ((i5 & 8) != 0) {
            gVar = kotlin.coroutines.i.f75057b;
        }
        b5<T> a5 = a(iVar, t4, interfaceC1423e0.getLifecycle(), bVar2, gVar, tVar, (((i4 >> 3) & 8) << 3) | 33288 | (i4 & 112) | (i4 & 7168), 0);
        tVar.p0();
        return a5;
    }

    @l
    @androidx.compose.runtime.i
    public static final <T> b5<T> c(@l t0<? extends T> t0Var, @l AbstractC1450w lifecycle, @m AbstractC1450w.b bVar, @m g gVar, @m t tVar, int i4, int i5) {
        l0.p(t0Var, "<this>");
        l0.p(lifecycle, "lifecycle");
        tVar.P(-1858162195);
        if ((i5 & 2) != 0) {
            bVar = AbstractC1450w.b.STARTED;
        }
        AbstractC1450w.b bVar2 = bVar;
        if ((i5 & 4) != 0) {
            gVar = kotlin.coroutines.i.f75057b;
        }
        b5<T> a5 = a(t0Var, t0Var.getValue(), lifecycle, bVar2, gVar, tVar, ((i4 << 3) & 7168) | 33288, 0);
        tVar.p0();
        return a5;
    }

    @l
    @androidx.compose.runtime.i
    public static final <T> b5<T> d(@l t0<? extends T> t0Var, @m InterfaceC1423e0 interfaceC1423e0, @m AbstractC1450w.b bVar, @m g gVar, @m t tVar, int i4, int i5) {
        l0.p(t0Var, "<this>");
        tVar.P(743249048);
        if ((i5 & 1) != 0) {
            interfaceC1423e0 = (InterfaceC1423e0) tVar.x(o0.i());
        }
        if ((i5 & 2) != 0) {
            bVar = AbstractC1450w.b.STARTED;
        }
        AbstractC1450w.b bVar2 = bVar;
        if ((i5 & 4) != 0) {
            gVar = kotlin.coroutines.i.f75057b;
        }
        b5<T> a5 = a(t0Var, t0Var.getValue(), interfaceC1423e0.getLifecycle(), bVar2, gVar, tVar, ((i4 << 3) & 7168) | 33288, 0);
        tVar.p0();
        return a5;
    }
}
