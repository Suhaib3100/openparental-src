package androidx.view.compose;

import androidx.compose.runtime.b5;
import androidx.compose.runtime.j0;
import androidx.compose.runtime.o4;
import androidx.compose.runtime.t;
import androidx.compose.runtime.t3;
import androidx.compose.runtime.v0;
import androidx.compose.runtime.w0;
import androidx.compose.ui.platform.o0;
import androidx.view.InterfaceC1423e0;
import androidx.view.OnBackPressedDispatcher;
import androidx.view.c0;
import androidx.view.f0;
import fg.l;
import kotlin.Metadata;
import kotlin.a1;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.k2;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.r0;
import ld.p;

/* compiled from: PredictiveBackHandler.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u001a_\u0010\r\u001a\u00020\n2\b\b\u0002\u0010\u0001\u001a\u00020\u00002A\u0010\f\u001a=\b\u0001\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u000f\u0012\r\u0012\t\u0012\u00070\n¢\u0006\u0002\b\u00050\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010²\u0006G\u0010\u000f\u001a=\b\u0001\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u000f\u0012\r\u0012\t\u0012\u00070\n¢\u0006\u0002\b\u00050\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u00028\nX\u008a\u0084\u0002"}, d2 = {"", "enabled", "Lkotlin/Function2;", "Lkotlinx/coroutines/flow/i;", "Landroidx/activity/f;", "Lkd/o;", "Lkotlin/r0;", "name", "progress", "Lkotlin/coroutines/d;", "Lkotlin/k2;", "", "onBack", "a", "(ZLld/p;Landroidx/compose/runtime/t;II)V", "currentOnBack", "activity-compose_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nPredictiveBackHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PredictiveBackHandler.kt\nandroidx/activity/compose/PredictiveBackHandlerKt\n+ 2 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 6 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 7 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt\n*L\n1#1,172:1\n473#2,4:173\n477#2,2:181\n481#2:187\n25#3:177\n25#3:188\n955#4,3:178\n958#4,3:184\n955#4,6:189\n473#5:183\n76#6:195\n89#7:196\n*S KotlinDebug\n*F\n+ 1 PredictiveBackHandler.kt\nandroidx/activity/compose/PredictiveBackHandlerKt\n*L\n79#1:173,4\n79#1:181,2\n79#1:187\n79#1:177\n81#1:188\n79#1:178,3\n79#1:184,3\n81#1:189,6\n79#1:183\n135#1:195\n78#1:196\n*E\n"})
/* loaded from: classes.dex */
public final class m {

    /* compiled from: PredictiveBackHandler.kt */
    @f(c = "androidx.activity.compose.PredictiveBackHandlerKt$PredictiveBackHandler$1", f = "PredictiveBackHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends o implements p<r0, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f480b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ d f481c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f482d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(d dVar, boolean z4, kotlin.coroutines.d<? super a> dVar2) {
            super(2, dVar2);
            this.f481c = dVar;
            this.f482d = z4;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @l kotlin.coroutines.d<?> dVar) {
            return new a(this.f481c, this.f482d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            if (this.f480b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a1.n(obj);
            this.f481c.setEnabled(this.f482d);
            return k2.f75408a;
        }

        @Override // ld.p
        @fg.m
        public final Object invoke(@l r0 r0Var, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            return ((a) create(r0Var, dVar)).invokeSuspend(k2.f75408a);
        }
    }

    /* compiled from: PredictiveBackHandler.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/runtime/w0;", "Landroidx/compose/runtime/v0;", "a", "(Landroidx/compose/runtime/w0;)Landroidx/compose/runtime/v0;"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nPredictiveBackHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PredictiveBackHandler.kt\nandroidx/activity/compose/PredictiveBackHandlerKt$PredictiveBackHandler$2\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,172:1\n62#2,5:173\n*S KotlinDebug\n*F\n+ 1 PredictiveBackHandler.kt\nandroidx/activity/compose/PredictiveBackHandlerKt$PredictiveBackHandler$2\n*L\n140#1:173,5\n*E\n"})
    static final class b extends n0 implements ld.l<w0, v0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ OnBackPressedDispatcher f483b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC1423e0 f484c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ d f485d;

        /* compiled from: Effects.kt */
        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005¸\u0006\u0000"}, d2 = {"androidx/compose/runtime/w0$a", "Landroidx/compose/runtime/v0;", "Lkotlin/k2;", "dispose", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        @r1({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 PredictiveBackHandler.kt\nandroidx/activity/compose/PredictiveBackHandlerKt$PredictiveBackHandler$2\n*L\n1#1,483:1\n141#2,2:484\n*E\n"})
        public static final class a implements v0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ d f486a;

            public a(d dVar) {
                this.f486a = dVar;
            }

            @Override // androidx.compose.runtime.v0
            public void dispose() {
                this.f486a.remove();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(OnBackPressedDispatcher onBackPressedDispatcher, InterfaceC1423e0 interfaceC1423e0, d dVar) {
            super(1);
            this.f483b = onBackPressedDispatcher;
            this.f484c = interfaceC1423e0;
            this.f485d = dVar;
        }

        @Override // ld.l
        @l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final v0 invoke(@l w0 w0Var) {
            this.f483b.i(this.f484c, this.f485d);
            return new a(this.f485d);
        }
    }

    /* compiled from: PredictiveBackHandler.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class c extends n0 implements p<t, Integer, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f487b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ p<i<androidx.view.f>, kotlin.coroutines.d<k2>, Object> f488c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f489d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f490e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(boolean z4, p<i<androidx.view.f>, ? super kotlin.coroutines.d<k2>, ? extends Object> pVar, int i4, int i5) {
            super(2);
            this.f487b = z4;
            this.f488c = pVar;
            this.f489d = i4;
            this.f490e = i5;
        }

        public final void a(@fg.m t tVar, int i4) {
            m.a(this.f487b, this.f488c, tVar, this.f489d | 1, this.f490e);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(t tVar, Integer num) {
            a(tVar, num.intValue());
            return k2.f75408a;
        }
    }

    /* compiled from: PredictiveBackHandler.kt */
    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\tR$\u0010\u0012\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"androidx/activity/compose/m$d", "Landroidx/activity/c0;", "Landroidx/activity/f;", "backEvent", "Lkotlin/k2;", "handleOnBackStarted", "(Landroidx/activity/f;)V", "handleOnBackProgressed", "handleOnBackPressed", "()V", "handleOnBackCancelled", "Landroidx/activity/compose/k;", "a", "Landroidx/activity/compose/k;", "d", "()Landroidx/activity/compose/k;", "e", "(Landroidx/activity/compose/k;)V", "onBackInstance", "activity-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class d extends c0 {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @fg.m
        private k onBackInstance;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ r0 f492b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ b5<p<i<androidx.view.f>, kotlin.coroutines.d<k2>, Object>> f493c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(boolean z4, r0 r0Var, b5<? extends p<i<androidx.view.f>, ? super kotlin.coroutines.d<k2>, ? extends Object>> b5Var) {
            super(z4);
            this.f492b = r0Var;
            this.f493c = b5Var;
        }

        @fg.m
        /* renamed from: d, reason: from getter */
        public final k getOnBackInstance() {
            return this.onBackInstance;
        }

        public final void e(@fg.m k kVar) {
            this.onBackInstance = kVar;
        }

        @Override // androidx.view.c0
        public void handleOnBackCancelled() {
            super.handleOnBackCancelled();
            k kVar = this.onBackInstance;
            if (kVar != null) {
                kVar.a();
            }
        }

        @Override // androidx.view.c0
        public void handleOnBackPressed() {
            k kVar = this.onBackInstance;
            if (kVar != null && !kVar.getIsPredictiveBack()) {
                kVar.a();
                this.onBackInstance = null;
            }
            if (this.onBackInstance == null) {
                this.onBackInstance = new k(this.f492b, false, this.f493c.getValue());
            }
            k kVar2 = this.onBackInstance;
            if (kVar2 != null) {
                kVar2.b();
            }
        }

        @Override // androidx.view.c0
        public void handleOnBackProgressed(@l androidx.view.f backEvent) {
            super.handleOnBackProgressed(backEvent);
            k kVar = this.onBackInstance;
            if (kVar != null) {
                kotlinx.coroutines.channels.p.b(kVar.f(backEvent));
            }
        }

        @Override // androidx.view.c0
        public void handleOnBackStarted(@l androidx.view.f backEvent) {
            super.handleOnBackStarted(backEvent);
            k kVar = this.onBackInstance;
            if (kVar != null) {
                kVar.a();
            }
            this.onBackInstance = new k(this.f492b, true, this.f493c.getValue());
        }
    }

    @androidx.compose.runtime.i
    public static final void a(boolean z4, @l p<i<androidx.view.f>, ? super kotlin.coroutines.d<k2>, ? extends Object> pVar, @fg.m t tVar, int i4, int i5) {
        t o4 = tVar.o(-642000585);
        if ((i5 & 1) != 0) {
            z4 = true;
        }
        b5 u4 = o4.u(pVar, o4, 8);
        o4.P(-723524056);
        o4.P(-3687241);
        Object Q = o4.Q();
        t.Companion companion = t.INSTANCE;
        if (Q == companion.a()) {
            Q = l.a(androidx.compose.runtime.a1.m(kotlin.coroutines.i.f75057b, o4), o4);
        }
        o4.p0();
        r0 coroutineScope = ((j0) Q).getCoroutineScope();
        o4.p0();
        o4.P(-3687241);
        Object Q2 = o4.Q();
        if (Q2 == companion.a()) {
            Q2 = new d(z4, coroutineScope, u4);
            o4.E(Q2);
        }
        o4.p0();
        d dVar = (d) Q2;
        androidx.compose.runtime.a1.h(Boolean.valueOf(z4), new a(dVar, z4, null), o4, (i4 & 14) | 64);
        f0 a5 = i.f464a.a(o4, 6);
        if (a5 == null) {
            throw new IllegalStateException("No OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner");
        }
        OnBackPressedDispatcher onBackPressedDispatcher = a5.getOnBackPressedDispatcher();
        InterfaceC1423e0 interfaceC1423e0 = (InterfaceC1423e0) o4.x(o0.i());
        androidx.compose.runtime.a1.b(interfaceC1423e0, onBackPressedDispatcher, new b(onBackPressedDispatcher, interfaceC1423e0, dVar), o4, 72);
        t3 t4 = o4.t();
        if (t4 == null) {
            return;
        }
        t4.a(new c(z4, pVar, i4, i5));
    }

    private static final p<i<androidx.view.f>, kotlin.coroutines.d<k2>, Object> b(b5<? extends p<i<androidx.view.f>, ? super kotlin.coroutines.d<k2>, ? extends Object>> b5Var) {
        return (p) b5Var.getValue();
    }

    public static final p c(b5 b5Var) {
        return (p) b5Var.getValue();
    }
}
