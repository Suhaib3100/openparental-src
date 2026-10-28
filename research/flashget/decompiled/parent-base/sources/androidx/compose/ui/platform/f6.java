package androidx.compose.ui.platform;

import kotlin.Metadata;

/* compiled from: WindowInfo.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a2\u0010\u0007\u001a\u00020\u00052!\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u0000H\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lkotlin/Function1;", "", "Lkotlin/r0;", "name", "isWindowFocused", "Lkotlin/k2;", "onWindowFocusChanged", "a", "(Lld/l;Landroidx/compose/runtime/t;I)V", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nWindowInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInfo.kt\nandroidx/compose/ui/platform/WindowInfoKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,81:1\n74#2:82\n1116#3,6:83\n*S KotlinDebug\n*F\n+ 1 WindowInfo.kt\nandroidx/compose/ui/platform/WindowInfoKt\n*L\n55#1:82\n57#1:83,6\n*E\n"})
/* loaded from: classes.dex */
public final class f6 {

    /* compiled from: WindowInfo.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.platform.WindowInfoKt$WindowFocusObserver$1$1", f = "WindowInfo.kt", i = {}, l = {58}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super kotlin.k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f19840b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ d6 f19841c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.b5<ld.l<Boolean, kotlin.k2>> f19842d;

        /* compiled from: WindowInfo.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.ui.platform.f6$a$a, reason: collision with other inner class name */
        static final class C0365a extends kotlin.jvm.internal.n0 implements ld.a<Boolean> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ d6 f19843b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0365a(d6 d6Var) {
                super(0);
                this.f19843b = d6Var;
            }

            @Override // ld.a
            @fg.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf(this.f19843b.b());
            }
        }

        /* compiled from: WindowInfo.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/k2;", "a", "(ZLkotlin/coroutines/d;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
        static final class b<T> implements kotlinx.coroutines.flow.j {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ androidx.compose.runtime.b5<ld.l<Boolean, kotlin.k2>> f19844b;

            /* JADX WARN: Multi-variable type inference failed */
            b(androidx.compose.runtime.b5<? extends ld.l<? super Boolean, kotlin.k2>> b5Var) {
                this.f19844b = b5Var;
            }

            @fg.m
            public final Object a(boolean z4, @fg.l kotlin.coroutines.d<? super kotlin.k2> dVar) {
                this.f19844b.getValue().invoke(Boolean.valueOf(z4));
                return kotlin.k2.f75408a;
            }

            @Override // kotlinx.coroutines.flow.j
            public /* bridge */ /* synthetic */ Object emit(Object obj, kotlin.coroutines.d dVar) {
                return a(((Boolean) obj).booleanValue(), dVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(d6 d6Var, androidx.compose.runtime.b5<? extends ld.l<? super Boolean, kotlin.k2>> b5Var, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f19841c = d6Var;
            this.f19842d = b5Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            return new a(this.f19841c, this.f19842d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f19840b;
            if (i4 == 0) {
                kotlin.a1.n(obj);
                kotlinx.coroutines.flow.i w4 = androidx.compose.runtime.o4.w(new C0365a(this.f19841c));
                b bVar = new b(this.f19842d);
                this.f19840b = 1;
                if (w4.a(bVar, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a1.n(obj);
            }
            return kotlin.k2.f75408a;
        }

        @Override // ld.p
        @fg.m
        public final Object invoke(@fg.l kotlinx.coroutines.r0 r0Var, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
            return ((a) create(r0Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
        }
    }

    /* compiled from: WindowInfo.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class b extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.l<Boolean, kotlin.k2> f19845b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f19846c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(ld.l<? super Boolean, kotlin.k2> lVar, int i4) {
            super(2);
            this.f19845b = lVar;
            this.f19846c = i4;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            f6.a(this.f19845b, tVar, androidx.compose.runtime.g3.b(this.f19846c | 1));
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    @androidx.compose.runtime.i
    public static final void a(@fg.l ld.l<? super Boolean, kotlin.k2> lVar, @fg.m androidx.compose.runtime.t tVar, int i4) {
        int i5;
        androidx.compose.runtime.t o4 = tVar.o(127829799);
        if ((i4 & 14) == 0) {
            i5 = (o4.S(lVar) ? 4 : 2) | i4;
        } else {
            i5 = i4;
        }
        if ((i5 & 11) == 2 && o4.p()) {
            o4.d0();
        } else {
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(127829799, i5, -1, "androidx.compose.ui.platform.WindowFocusObserver (WindowInfo.kt:53)");
            }
            d6 d6Var = (d6) o4.x(h1.w());
            androidx.compose.runtime.b5 u4 = androidx.compose.runtime.o4.u(lVar, o4, i5 & 14);
            o4.P(1439092530);
            boolean q02 = o4.q0(d6Var) | o4.q0(u4);
            Object Q = o4.Q();
            if (q02 || Q == androidx.compose.runtime.t.INSTANCE.a()) {
                Q = new a(d6Var, u4, null);
                o4.E(Q);
            }
            o4.p0();
            androidx.compose.runtime.a1.h(d6Var, (ld.p) Q, o4, 64);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }
        androidx.compose.runtime.t3 t4 = o4.t();
        if (t4 != null) {
            t4.a(new b(lVar, i4));
        }
    }
}
