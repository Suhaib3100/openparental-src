package androidx.compose.ui.input.pointer;

import android.view.MotionEvent;
import androidx.compose.ui.platform.a2;
import androidx.compose.ui.platform.y1;
import kotlin.Metadata;
import kotlin.a1;
import kotlin.jvm.internal.r1;
import kotlin.k2;

/* compiled from: PointerInteropFilter.android.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a3\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u001b\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\n\u001a\u00020\tH\u0001¢\u0006\u0004\b\u000b\u0010\f\u001a6\u0010\u0012\u001a\u00020\u0000*\u00020\u00002!\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00100\u0003H\u0007¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/q;", "Landroidx/compose/ui/input/pointer/t0;", "requestDisallowInterceptTouchEvent", "Lkotlin/Function1;", "Landroid/view/MotionEvent;", "", "onTouchEvent", "b", "(Landroidx/compose/ui/q;Landroidx/compose/ui/input/pointer/t0;Lld/l;)Landroidx/compose/ui/q;", "Landroidx/compose/ui/viewinterop/c;", "view", "c", "(Landroidx/compose/ui/q;Landroidx/compose/ui/viewinterop/c;)Landroidx/compose/ui/q;", "Lkotlin/r0;", "name", "motionEvent", "Lkotlin/k2;", "watcher", "a", "(Landroidx/compose/ui/q;Lld/l;)Landroidx/compose/ui/q;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nPointerInteropFilter.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PointerInteropFilter.android.kt\nandroidx/compose/ui/input/pointer/PointerInteropFilter_androidKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,352:1\n135#2:353\n*S KotlinDebug\n*F\n+ 1 PointerInteropFilter.android.kt\nandroidx/compose/ui/input/pointer/PointerInteropFilter_androidKt\n*L\n73#1:353\n*E\n"})
/* loaded from: classes.dex */
public final class n0 {

    /* compiled from: PointerInteropFilter.android.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.input.pointer.PointerInteropFilter_androidKt$motionEventSpy$1", f = "PointerInteropFilter.android.kt", i = {}, l = {345}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/k0;", "Lkotlin/k2;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/k0;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.coroutines.jvm.internal.o implements ld.p<k0, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f18796b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f18797c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ld.l<MotionEvent, k2> f18798d;

        /* compiled from: PointerInteropFilter.android.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.input.pointer.PointerInteropFilter_androidKt$motionEventSpy$1$1", f = "PointerInteropFilter.android.kt", i = {0}, l = {347}, m = "invokeSuspend", n = {"$this$awaitPointerEventScope"}, s = {"L$0"})
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/c;", "Lkotlin/k2;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/c;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.ui.input.pointer.n0$a$a, reason: collision with other inner class name */
        static final class C0338a extends kotlin.coroutines.jvm.internal.k implements ld.p<androidx.compose.ui.input.pointer.c, kotlin.coroutines.d<? super k2>, Object> {

            /* renamed from: c, reason: collision with root package name */
            int f18799c;

            /* renamed from: d, reason: collision with root package name */
            private /* synthetic */ Object f18800d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ ld.l<MotionEvent, k2> f18801e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0338a(ld.l<? super MotionEvent, k2> lVar, kotlin.coroutines.d<? super C0338a> dVar) {
                super(2, dVar);
                this.f18801e = lVar;
            }

            @Override // ld.p
            @fg.m
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@fg.l androidx.compose.ui.input.pointer.c cVar, @fg.m kotlin.coroutines.d<? super k2> dVar) {
                return ((C0338a) create(cVar, dVar)).invokeSuspend(k2.f75408a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.l
            public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                C0338a c0338a = new C0338a(this.f18801e, dVar);
                c0338a.f18800d = obj;
                return c0338a;
            }

            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            /* JADX WARN: Removed duplicated region for block: B:11:0x0036  */
            /* JADX WARN: Removed duplicated region for block: B:9:0x002d A[RETURN] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x002b -> B:5:0x002e). Please report as a decompilation issue!!! */
            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(@fg.l java.lang.Object r5) {
                /*
                    r4 = this;
                    kotlin.coroutines.intrinsics.a r0 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
                    int r1 = r4.f18799c
                    r2 = 1
                    if (r1 == 0) goto L19
                    if (r1 != r2) goto L11
                    java.lang.Object r1 = r4.f18800d
                    androidx.compose.ui.input.pointer.c r1 = (androidx.compose.ui.input.pointer.c) r1
                    kotlin.a1.n(r5)
                    goto L2e
                L11:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r0)
                    throw r5
                L19:
                    kotlin.a1.n(r5)
                    java.lang.Object r5 = r4.f18800d
                    androidx.compose.ui.input.pointer.c r5 = (androidx.compose.ui.input.pointer.c) r5
                    r1 = r5
                L21:
                    androidx.compose.ui.input.pointer.r r5 = androidx.compose.ui.input.pointer.r.Initial
                    r4.f18800d = r1
                    r4.f18799c = r2
                    java.lang.Object r5 = r1.u3(r5, r4)
                    if (r5 != r0) goto L2e
                    return r0
                L2e:
                    androidx.compose.ui.input.pointer.p r5 = (androidx.compose.ui.input.pointer.p) r5
                    android.view.MotionEvent r5 = r5.h()
                    if (r5 == 0) goto L21
                    ld.l<android.view.MotionEvent, kotlin.k2> r3 = r4.f18801e
                    r3.invoke(r5)
                    goto L21
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.pointer.n0.a.C0338a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(ld.l<? super MotionEvent, k2> lVar, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f18798d = lVar;
        }

        @Override // ld.p
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.l k0 k0Var, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            return ((a) create(k0Var, dVar)).invokeSuspend(k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            a aVar = new a(this.f18798d, dVar);
            aVar.f18797c = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f18796b;
            if (i4 == 0) {
                a1.n(obj);
                k0 k0Var = (k0) this.f18797c;
                k0Var.U2(true);
                C0338a c0338a = new C0338a(this.f18798d, null);
                this.f18796b = 1;
                if (k0Var.o3(c0338a, this) == aVar) {
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

    /* compiled from: InspectableValue.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/platform/a2;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/platform/a2;)V", "androidx/compose/ui/platform/y1$b"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 PointerInteropFilter.android.kt\nandroidx/compose/ui/input/pointer/PointerInteropFilter_androidKt\n*L\n1#1,170:1\n74#2,4:171\n*E\n"})
    public static final class b extends kotlin.jvm.internal.n0 implements ld.l<a2, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ t0 f18802b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.l f18803c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(t0 t0Var, ld.l lVar) {
            super(1);
            this.f18802b = t0Var;
            this.f18803c = lVar;
        }

        public final void a(@fg.l a2 a2Var) {
            a2Var.d("pointerInteropFilter");
            a2Var.getProperties().c("requestDisallowInterceptTouchEvent", this.f18802b);
            a2Var.getProperties().c("onTouchEvent", this.f18803c);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(a2 a2Var) {
            a(a2Var);
            return k2.f75408a;
        }
    }

    /* compiled from: PointerInteropFilter.android.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/q;", "a", "(Landroidx/compose/ui/q;Landroidx/compose/runtime/t;I)Landroidx/compose/ui/q;"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nPointerInteropFilter.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PointerInteropFilter.android.kt\nandroidx/compose/ui/input/pointer/PointerInteropFilter_androidKt$pointerInteropFilter$2\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,352:1\n25#2:353\n1116#3,6:354\n*S KotlinDebug\n*F\n+ 1 PointerInteropFilter.android.kt\nandroidx/compose/ui/input/pointer/PointerInteropFilter_androidKt$pointerInteropFilter$2\n*L\n79#1:353\n79#1:354,6\n*E\n"})
    static final class c extends kotlin.jvm.internal.n0 implements ld.q<androidx.compose.ui.q, androidx.compose.runtime.t, Integer, androidx.compose.ui.q> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.l<MotionEvent, Boolean> f18804b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ t0 f18805c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(ld.l<? super MotionEvent, Boolean> lVar, t0 t0Var) {
            super(3);
            this.f18804b = lVar;
            this.f18805c = t0Var;
        }

        @Override // ld.q
        public /* bridge */ /* synthetic */ androidx.compose.ui.q R(androidx.compose.ui.q qVar, androidx.compose.runtime.t tVar, Integer num) {
            return a(qVar, tVar, num.intValue());
        }

        @fg.l
        @androidx.compose.runtime.i
        public final androidx.compose.ui.q a(@fg.l androidx.compose.ui.q qVar, @fg.m androidx.compose.runtime.t tVar, int i4) {
            tVar.P(374375707);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(374375707, i4, -1, "androidx.compose.ui.input.pointer.pointerInteropFilter.<anonymous> (PointerInteropFilter.android.kt:78)");
            }
            tVar.P(-492369756);
            Object Q = tVar.Q();
            if (Q == androidx.compose.runtime.t.INSTANCE.a()) {
                Q = new m0();
                tVar.E(Q);
            }
            tVar.p0();
            m0 m0Var = (m0) Q;
            m0Var.onTouchEvent = this.f18804b;
            m0Var.h(this.f18805c);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
            tVar.p0();
            return m0Var;
        }
    }

    /* compiled from: PointerInteropFilter.android.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/MotionEvent;", "motionEvent", "", "a", "(Landroid/view/MotionEvent;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class d extends kotlin.jvm.internal.n0 implements ld.l<MotionEvent, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.viewinterop.c f18806b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(androidx.compose.ui.viewinterop.c cVar) {
            super(1);
            this.f18806b = cVar;
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(@fg.l MotionEvent motionEvent) {
            boolean dispatchTouchEvent;
            switch (motionEvent.getActionMasked()) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    dispatchTouchEvent = this.f18806b.dispatchTouchEvent(motionEvent);
                    break;
                default:
                    dispatchTouchEvent = this.f18806b.dispatchGenericMotionEvent(motionEvent);
                    break;
            }
            return Boolean.valueOf(dispatchTouchEvent);
        }
    }

    @fg.l
    @androidx.compose.ui.k
    public static final androidx.compose.ui.q a(@fg.l androidx.compose.ui.q qVar, @fg.l ld.l<? super MotionEvent, k2> lVar) {
        return u0.e(qVar, lVar, new a(lVar, null));
    }

    @fg.l
    @androidx.compose.ui.k
    public static final androidx.compose.ui.q b(@fg.l androidx.compose.ui.q qVar, @fg.m t0 t0Var, @fg.l ld.l<? super MotionEvent, Boolean> lVar) {
        return androidx.compose.ui.i.e(qVar, y1.e() ? new b(t0Var, lVar) : y1.b(), new c(lVar, t0Var));
    }

    @fg.l
    @androidx.compose.ui.k
    public static final androidx.compose.ui.q c(@fg.l androidx.compose.ui.q qVar, @fg.l androidx.compose.ui.viewinterop.c cVar) {
        m0 m0Var = new m0();
        m0Var.onTouchEvent = new d(cVar);
        t0 t0Var = new t0();
        m0Var.h(t0Var);
        cVar.P(t0Var);
        return qVar.w3(m0Var);
    }

    public static /* synthetic */ androidx.compose.ui.q d(androidx.compose.ui.q qVar, t0 t0Var, ld.l lVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            t0Var = null;
        }
        return b(qVar, t0Var, lVar);
    }
}
