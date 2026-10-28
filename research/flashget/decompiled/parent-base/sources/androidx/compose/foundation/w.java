package androidx.compose.foundation;

import androidx.compose.foundation.t2;
import androidx.compose.runtime.g3;
import androidx.compose.runtime.t3;
import androidx.compose.runtime.v3;
import androidx.compose.ui.node.g;
import androidx.compose.ui.q;
import com.android.internal.telephony.SmsConstants;
import kotlin.Metadata;
import org.apache.log4j.net.SyslogAppender;

/* compiled from: BasicTooltip.android.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\u001ac\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0011\u0010\u0005\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\u0011\u0010\r\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0004H\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001a<\u0010\u0010\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u0011\u0010\r\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0004H\u0003¢\u0006\u0004\b\u0010\u0010\u0011\u001aB\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\n2\u0011\u0010\r\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0004H\u0003¢\u0006\u0004\b\u0014\u0010\u0015\u001a#\u0010\u0017\u001a\u00020\b*\u00020\b2\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0017\u0010\u0018\u001a3\u0010\u001b\u001a\u00020\b*\u00020\b2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Landroidx/compose/ui/window/o;", "positionProvider", "Lkotlin/Function0;", "Lkotlin/k2;", "Landroidx/compose/runtime/i;", "tooltip", "Landroidx/compose/foundation/u;", "state", "Landroidx/compose/ui/q;", "modifier", "", "focusable", "enableUserInput", "content", "a", "(Landroidx/compose/ui/window/o;Lld/p;Landroidx/compose/foundation/u;Landroidx/compose/ui/q;ZZLld/p;Landroidx/compose/runtime/t;II)V", "c", "(ZLandroidx/compose/foundation/u;Landroidx/compose/ui/q;Lld/p;Landroidx/compose/runtime/t;II)V", "Lkotlinx/coroutines/r0;", "scope", "b", "(Landroidx/compose/ui/window/o;Landroidx/compose/foundation/u;Lkotlinx/coroutines/r0;ZLld/p;Landroidx/compose/runtime/t;I)V", "enabled", "g", "(Landroidx/compose/ui/q;ZLandroidx/compose/foundation/u;)Landroidx/compose/ui/q;", "", "label", "f", "(Landroidx/compose/ui/q;Ljava/lang/String;ZLandroidx/compose/foundation/u;Lkotlinx/coroutines/r0;)Landroidx/compose/ui/q;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nBasicTooltip.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicTooltip.android.kt\nandroidx/compose/foundation/BasicTooltip_androidKt\n+ 2 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 6 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 7 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,222:1\n487#2,4:223\n491#2,2:231\n495#2:237\n487#2,4:285\n491#2,2:293\n495#2:299\n25#3:227\n456#3,8:256\n464#3,3:270\n467#3,3:274\n25#3:289\n456#3,8:317\n464#3,3:331\n467#3,3:335\n1116#4,3:228\n1119#4,3:234\n1116#4,6:279\n1116#4,3:290\n1119#4,3:296\n487#5:233\n487#5:295\n67#6,7:238\n74#6:273\n78#6:278\n68#6,6:300\n74#6:334\n78#6:339\n79#7,11:245\n92#7:277\n79#7,11:306\n92#7:338\n3737#8,6:264\n3737#8,6:325\n*S KotlinDebug\n*F\n+ 1 BasicTooltip.android.kt\nandroidx/compose/foundation/BasicTooltip_androidKt\n*L\n76#1:223,4\n76#1:231,2\n76#1:237\n109#1:285,4\n109#1:293,2\n109#1:299\n76#1:227\n77#1:256,8\n77#1:270,3\n77#1:274,3\n109#1:289\n111#1:317,8\n111#1:331,3\n111#1:335,3\n76#1:228,3\n76#1:234,3\n96#1:279,6\n109#1:290,3\n109#1:296,3\n76#1:233\n109#1:295\n77#1:238,7\n77#1:273\n77#1:278\n111#1:300,6\n111#1:334\n111#1:339\n77#1:245,11\n77#1:277\n111#1:306,11\n111#1:338\n77#1:264,6\n111#1:325,6\n*E\n"})
/* loaded from: classes.dex */
public final class w {

    /* compiled from: BasicTooltip.android.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/runtime/w0;", "Landroidx/compose/runtime/v0;", "a", "(Landroidx/compose/runtime/w0;)Landroidx/compose/runtime/v0;"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nBasicTooltip.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicTooltip.android.kt\nandroidx/compose/foundation/BasicTooltip_androidKt$BasicTooltipBox$2$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,222:1\n64#2,5:223\n*S KotlinDebug\n*F\n+ 1 BasicTooltip.android.kt\nandroidx/compose/foundation/BasicTooltip_androidKt$BasicTooltipBox$2$1\n*L\n97#1:223,5\n*E\n"})
    static final class a extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.runtime.w0, androidx.compose.runtime.v0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ u f9148b;

        /* compiled from: Effects.kt */
        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005¸\u0006\u0000"}, d2 = {"androidx/compose/runtime/w0$a", "Landroidx/compose/runtime/v0;", "Lkotlin/k2;", "dispose", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        @kotlin.jvm.internal.r1({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 BasicTooltip.android.kt\nandroidx/compose/foundation/BasicTooltip_androidKt$BasicTooltipBox$2$1\n*L\n1#1,497:1\n97#2:498\n*E\n"})
        /* renamed from: androidx.compose.foundation.w$a$a, reason: collision with other inner class name */
        public static final class C0196a implements androidx.compose.runtime.v0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ u f9149a;

            public C0196a(u uVar) {
                this.f9149a = uVar;
            }

            @Override // androidx.compose.runtime.v0
            public void dispose() {
                this.f9149a.a();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(u uVar) {
            super(1);
            this.f9148b = uVar;
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final androidx.compose.runtime.v0 invoke(@fg.l androidx.compose.runtime.w0 w0Var) {
            return new C0196a(this.f9148b);
        }
    }

    /* compiled from: BasicTooltip.android.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class b extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.window.o f9150b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f9151c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ u f9152d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f9153e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f9154f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f9155g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f9156h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f9157i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f9158j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(androidx.compose.ui.window.o oVar, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, u uVar, androidx.compose.ui.q qVar, boolean z4, boolean z5, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar2, int i4, int i5) {
            super(2);
            this.f9150b = oVar;
            this.f9151c = pVar;
            this.f9152d = uVar;
            this.f9153e = qVar;
            this.f9154f = z4;
            this.f9155g = z5;
            this.f9156h = pVar2;
            this.f9157i = i4;
            this.f9158j = i5;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            w.a(this.f9150b, this.f9151c, this.f9152d, this.f9153e, this.f9154f, this.f9155g, this.f9156h, tVar, g3.b(this.f9157i | 1), this.f9158j);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: BasicTooltip.android.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    static final class c extends kotlin.jvm.internal.n0 implements ld.a<kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ u f9159b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.r0 f9160c;

        /* compiled from: BasicTooltip.android.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.BasicTooltip_androidKt$TooltipPopup$1$1", f = "BasicTooltip.android.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super kotlin.k2>, Object> {

            /* renamed from: b, reason: collision with root package name */
            int f9161b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ u f9162c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(u uVar, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f9162c = uVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.l
            public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                return new a(this.f9162c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                if (this.f9161b != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a1.n(obj);
                this.f9162c.dismiss();
                return kotlin.k2.f75408a;
            }

            @Override // ld.p
            @fg.m
            public final Object invoke(@fg.l kotlinx.coroutines.r0 r0Var, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
                return ((a) create(r0Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(u uVar, kotlinx.coroutines.r0 r0Var) {
            super(0);
            this.f9159b = uVar;
            this.f9160c = r0Var;
        }

        public final void a() {
            if (this.f9159b.isVisible()) {
                kotlinx.coroutines.k.f(this.f9160c, null, null, new a(this.f9159b, null), 3, null);
            }
        }

        @Override // ld.a
        public /* bridge */ /* synthetic */ kotlin.k2 invoke() {
            a();
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: BasicTooltip.android.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nBasicTooltip.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicTooltip.android.kt\nandroidx/compose/foundation/BasicTooltip_androidKt$TooltipPopup$2\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,222:1\n1116#2,6:223\n68#3,6:229\n74#3:263\n78#3:268\n79#4,11:235\n92#4:267\n456#5,8:246\n464#5,3:260\n467#5,3:264\n3737#6,6:254\n*S KotlinDebug\n*F\n+ 1 BasicTooltip.android.kt\nandroidx/compose/foundation/BasicTooltip_androidKt$TooltipPopup$2\n*L\n137#1:223,6\n136#1:229,6\n136#1:263\n136#1:268\n136#1:235,11\n136#1:267\n136#1:246,8\n136#1:260,3\n136#1:264,3\n136#1:254,6\n*E\n"})
    static final class d extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f9163b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f9164c;

        /* compiled from: BasicTooltip.android.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/semantics/z;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/semantics/z;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.semantics.z, kotlin.k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f9165b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(String str) {
                super(1);
                this.f9165b = str;
            }

            public final void a(@fg.l androidx.compose.ui.semantics.z zVar) {
                androidx.compose.ui.semantics.g.INSTANCE.getClass();
                androidx.compose.ui.semantics.w.g1(zVar, androidx.compose.ui.semantics.g.f20300d);
                androidx.compose.ui.semantics.w.h1(zVar, this.f9165b);
            }

            @Override // ld.l
            public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.ui.semantics.z zVar) {
                a(zVar);
                return kotlin.k2.f75408a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(String str, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar) {
            super(2);
            this.f9163b = str;
            this.f9164c = pVar;
        }

        @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
        @androidx.compose.runtime.i
        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            if ((i4 & 11) == 2 && tVar.p()) {
                tVar.d0();
                return;
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(-1147839433, i4, -1, "androidx.compose.foundation.TooltipPopup.<anonymous> (BasicTooltip.android.kt:135)");
            }
            q.Companion companion = androidx.compose.ui.q.INSTANCE;
            tVar.P(428358658);
            boolean q02 = tVar.q0(this.f9163b);
            String str = this.f9163b;
            Object Q = tVar.Q();
            if (q02 || Q == androidx.compose.runtime.t.INSTANCE.a()) {
                Q = new a(str);
                tVar.E(Q);
            }
            tVar.p0();
            androidx.compose.ui.q f4 = androidx.compose.ui.semantics.o.f(companion, false, (ld.l) Q, 1, null);
            ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> pVar = this.f9164c;
            tVar.P(733328855);
            androidx.compose.ui.layout.m0 a5 = androidx.compose.animation.a0.a(androidx.compose.ui.c.INSTANCE, false, tVar, 0, -1323940314);
            int j4 = androidx.compose.runtime.p.j(tVar, 0);
            androidx.compose.runtime.g0 B = tVar.B();
            g.Companion companion2 = androidx.compose.ui.node.g.INSTANCE;
            ld.a<androidx.compose.ui.node.g> a6 = companion2.a();
            ld.q<v3<androidx.compose.ui.node.g>, androidx.compose.runtime.t, Integer, kotlin.k2> g4 = androidx.compose.ui.layout.a0.g(f4);
            if (tVar.s() == null) {
                androidx.compose.runtime.p.n();
            }
            tVar.W();
            if (tVar.getInserting()) {
                tVar.F(a6);
            } else {
                tVar.C();
            }
            ld.p a7 = androidx.compose.animation.p.a(companion2, tVar, a5, tVar, B);
            if (tVar.getInserting() || !kotlin.jvm.internal.l0.g(tVar.Q(), Integer.valueOf(j4))) {
                androidx.compose.animation.d.a(j4, tVar, j4, a7);
            }
            androidx.compose.animation.e.a(0, g4, v3.a(tVar), tVar, 2058660585);
            androidx.compose.foundation.layout.p pVar2 = androidx.compose.foundation.layout.p.f5235a;
            if (x.a(0, pVar, tVar)) {
                androidx.compose.runtime.x.q0();
            }
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: BasicTooltip.android.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class e extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.window.o f9166b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ u f9167c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.r0 f9168d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f9169e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f9170f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f9171g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(androidx.compose.ui.window.o oVar, u uVar, kotlinx.coroutines.r0 r0Var, boolean z4, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, int i4) {
            super(2);
            this.f9166b = oVar;
            this.f9167c = uVar;
            this.f9168d = r0Var;
            this.f9169e = z4;
            this.f9170f = pVar;
            this.f9171g = i4;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            w.b(this.f9166b, this.f9167c, this.f9168d, this.f9169e, this.f9170f, tVar, g3.b(this.f9171g | 1));
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: BasicTooltip.android.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class f extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f9172b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ u f9173c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f9174d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f9175e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f9176f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f9177g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(boolean z4, u uVar, androidx.compose.ui.q qVar, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, int i4, int i5) {
            super(2);
            this.f9172b = z4;
            this.f9173c = uVar;
            this.f9174d = qVar;
            this.f9175e = pVar;
            this.f9176f = i4;
            this.f9177g = i5;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            w.c(this.f9172b, this.f9173c, this.f9174d, this.f9175e, tVar, g3.b(this.f9176f | 1), this.f9177g);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: BasicTooltip.android.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/semantics/z;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/semantics/z;)V"}, k = 3, mv = {1, 8, 0})
    static final class g extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.semantics.z, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f9178b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.r0 f9179c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ u f9180d;

        /* compiled from: BasicTooltip.android.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.jvm.internal.n0 implements ld.a<Boolean> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.r0 f9181b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ u f9182c;

            /* compiled from: BasicTooltip.android.kt */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.BasicTooltip_androidKt$anchorSemantics$1$1$1", f = "BasicTooltip.android.kt", i = {}, l = {216}, m = "invokeSuspend", n = {}, s = {})
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
            /* renamed from: androidx.compose.foundation.w$g$a$a, reason: collision with other inner class name */
            static final class C0197a extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super kotlin.k2>, Object> {

                /* renamed from: b, reason: collision with root package name */
                int f9183b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ u f9184c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0197a(u uVar, kotlin.coroutines.d<? super C0197a> dVar) {
                    super(2, dVar);
                    this.f9184c = uVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @fg.l
                public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                    return new C0197a(this.f9184c, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @fg.m
                public final Object invokeSuspend(@fg.l Object obj) {
                    kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                    int i4 = this.f9183b;
                    if (i4 == 0) {
                        kotlin.a1.n(obj);
                        u uVar = this.f9184c;
                        this.f9183b = 1;
                        if (u.e(uVar, null, this, 1, null) == aVar) {
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
                    return ((C0197a) create(r0Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(kotlinx.coroutines.r0 r0Var, u uVar) {
                super(0);
                this.f9181b = r0Var;
                this.f9182c = uVar;
            }

            @Override // ld.a
            @fg.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                kotlinx.coroutines.k.f(this.f9181b, null, null, new C0197a(this.f9182c, null), 3, null);
                return Boolean.TRUE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(String str, kotlinx.coroutines.r0 r0Var, u uVar) {
            super(1);
            this.f9178b = str;
            this.f9179c = r0Var;
            this.f9180d = uVar;
        }

        public final void a(@fg.l androidx.compose.ui.semantics.z zVar) {
            androidx.compose.ui.semantics.w.A0(zVar, this.f9178b, new a(this.f9179c, this.f9180d));
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.ui.semantics.z zVar) {
            a(zVar);
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: BasicTooltip.android.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.BasicTooltip_androidKt$handleGestures$1", f = "BasicTooltip.android.kt", i = {}, l = {SyslogAppender.LOG_LOCAL3}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/k0;", "Lkotlin/k2;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/k0;)V"}, k = 3, mv = {1, 8, 0})
    static final class h extends kotlin.coroutines.jvm.internal.o implements ld.p<androidx.compose.ui.input.pointer.k0, kotlin.coroutines.d<? super kotlin.k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f9185b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f9186c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ u f9187d;

        /* compiled from: BasicTooltip.android.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.BasicTooltip_androidKt$handleGestures$1$1", f = "BasicTooltip.android.kt", i = {}, l = {SmsConstants.MAX_USER_DATA_SEPTETS_WITH_HEADER}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super kotlin.k2>, Object> {

            /* renamed from: b, reason: collision with root package name */
            int f9188b;

            /* renamed from: c, reason: collision with root package name */
            private /* synthetic */ Object f9189c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.input.pointer.k0 f9190d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ u f9191e;

            /* compiled from: BasicTooltip.android.kt */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.BasicTooltip_androidKt$handleGestures$1$1$1", f = "BasicTooltip.android.kt", i = {0, 0, 0, 1, 1}, l = {158, 164, 172}, m = "invokeSuspend", n = {"$this$awaitEachGesture", "pass", "longPressTimeout", "$this$awaitEachGesture", "pass"}, s = {"L$0", "L$1", "J$0", "L$0", "L$1"})
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/c;", "Lkotlin/k2;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/c;)V"}, k = 3, mv = {1, 8, 0})
            /* renamed from: androidx.compose.foundation.w$h$a$a, reason: collision with other inner class name */
            static final class C0198a extends kotlin.coroutines.jvm.internal.k implements ld.p<androidx.compose.ui.input.pointer.c, kotlin.coroutines.d<? super kotlin.k2>, Object> {

                /* renamed from: c, reason: collision with root package name */
                Object f9192c;

                /* renamed from: d, reason: collision with root package name */
                long f9193d;

                /* renamed from: e, reason: collision with root package name */
                int f9194e;

                /* renamed from: f, reason: collision with root package name */
                private /* synthetic */ Object f9195f;

                /* renamed from: g, reason: collision with root package name */
                final /* synthetic */ kotlinx.coroutines.r0 f9196g;

                /* renamed from: h, reason: collision with root package name */
                final /* synthetic */ u f9197h;

                /* compiled from: BasicTooltip.android.kt */
                @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.BasicTooltip_androidKt$handleGestures$1$1$1$1", f = "BasicTooltip.android.kt", i = {}, l = {165}, m = "invokeSuspend", n = {}, s = {})
                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/c;", "Landroidx/compose/ui/input/pointer/b0;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/c;)Landroidx/compose/ui/input/pointer/b0;"}, k = 3, mv = {1, 8, 0})
                /* renamed from: androidx.compose.foundation.w$h$a$a$a, reason: collision with other inner class name */
                static final class C0199a extends kotlin.coroutines.jvm.internal.k implements ld.p<androidx.compose.ui.input.pointer.c, kotlin.coroutines.d<? super androidx.compose.ui.input.pointer.b0>, Object> {

                    /* renamed from: c, reason: collision with root package name */
                    int f9198c;

                    /* renamed from: d, reason: collision with root package name */
                    private /* synthetic */ Object f9199d;

                    /* renamed from: e, reason: collision with root package name */
                    final /* synthetic */ androidx.compose.ui.input.pointer.r f9200e;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C0199a(androidx.compose.ui.input.pointer.r rVar, kotlin.coroutines.d<? super C0199a> dVar) {
                        super(2, dVar);
                        this.f9200e = rVar;
                    }

                    @Override // ld.p
                    @fg.m
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final Object invoke(@fg.l androidx.compose.ui.input.pointer.c cVar, @fg.m kotlin.coroutines.d<? super androidx.compose.ui.input.pointer.b0> dVar) {
                        return ((C0199a) create(cVar, dVar)).invokeSuspend(kotlin.k2.f75408a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    @fg.l
                    public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                        C0199a c0199a = new C0199a(this.f9200e, dVar);
                        c0199a.f9199d = obj;
                        return c0199a;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    @fg.m
                    public final Object invokeSuspend(@fg.l Object obj) {
                        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                        int i4 = this.f9198c;
                        if (i4 == 0) {
                            kotlin.a1.n(obj);
                            androidx.compose.ui.input.pointer.c cVar = (androidx.compose.ui.input.pointer.c) this.f9199d;
                            androidx.compose.ui.input.pointer.r rVar = this.f9200e;
                            this.f9198c = 1;
                            obj = androidx.compose.foundation.gestures.z0.n(cVar, rVar, this);
                            if (obj == aVar) {
                                return aVar;
                            }
                        } else {
                            if (i4 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            kotlin.a1.n(obj);
                        }
                        return obj;
                    }
                }

                /* compiled from: BasicTooltip.android.kt */
                @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.BasicTooltip_androidKt$handleGestures$1$1$1$2", f = "BasicTooltip.android.kt", i = {}, l = {169}, m = "invokeSuspend", n = {}, s = {})
                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
                /* renamed from: androidx.compose.foundation.w$h$a$a$b */
                static final class b extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super kotlin.k2>, Object> {

                    /* renamed from: b, reason: collision with root package name */
                    int f9201b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ u f9202c;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    b(u uVar, kotlin.coroutines.d<? super b> dVar) {
                        super(2, dVar);
                        this.f9202c = uVar;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    @fg.l
                    public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                        return new b(this.f9202c, dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    @fg.m
                    public final Object invokeSuspend(@fg.l Object obj) {
                        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                        int i4 = this.f9201b;
                        if (i4 == 0) {
                            kotlin.a1.n(obj);
                            u uVar = this.f9202c;
                            a2 a2Var = a2.UserInput;
                            this.f9201b = 1;
                            if (uVar.c(a2Var, this) == aVar) {
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
                        return ((b) create(r0Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0198a(kotlinx.coroutines.r0 r0Var, u uVar, kotlin.coroutines.d<? super C0198a> dVar) {
                    super(2, dVar);
                    this.f9196g = r0Var;
                    this.f9197h = uVar;
                }

                @Override // ld.p
                @fg.m
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(@fg.l androidx.compose.ui.input.pointer.c cVar, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
                    return ((C0198a) create(cVar, dVar)).invokeSuspend(kotlin.k2.f75408a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @fg.l
                public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                    C0198a c0198a = new C0198a(this.f9196g, this.f9197h, dVar);
                    c0198a.f9195f = obj;
                    return c0198a;
                }

                /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(1:(1:(1:(6:6|7|(1:9)|10|11|12)(2:14|15))(5:16|17|18|11|12))(1:24))(2:35|(1:37)(1:38))|25|(1:27)|29|30|(1:32)|11|12|(1:(0))) */
                /* JADX WARN: Code restructure failed: missing block: B:28:0x008a, code lost:
                
                    if (androidx.compose.ui.input.pointer.q0.i(r0, androidx.compose.ui.input.pointer.q0.f18819f) != false) goto L37;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:34:0x009e, code lost:
                
                    r0 = r14;
                 */
                /* JADX WARN: Removed duplicated region for block: B:23:0x00bc A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:9:0x00ca A[LOOP:0: B:8:0x00c8->B:9:0x00ca, LOOP_END] */
                @Override // kotlin.coroutines.jvm.internal.a
                @fg.m
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invokeSuspend(@fg.l java.lang.Object r18) {
                    /*
                        Method dump skipped, instructions count: 217
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.w.h.a.C0198a.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(androidx.compose.ui.input.pointer.k0 k0Var, u uVar, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f9190d = k0Var;
                this.f9191e = uVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.l
            public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                a aVar = new a(this.f9190d, this.f9191e, dVar);
                aVar.f9189c = obj;
                return aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                int i4 = this.f9188b;
                if (i4 == 0) {
                    kotlin.a1.n(obj);
                    kotlinx.coroutines.r0 r0Var = (kotlinx.coroutines.r0) this.f9189c;
                    androidx.compose.ui.input.pointer.k0 k0Var = this.f9190d;
                    C0198a c0198a = new C0198a(r0Var, this.f9191e, null);
                    this.f9188b = 1;
                    if (androidx.compose.foundation.gestures.f0.d(k0Var, c0198a, this) == aVar) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(u uVar, kotlin.coroutines.d<? super h> dVar) {
            super(2, dVar);
            this.f9187d = uVar;
        }

        @Override // ld.p
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.l androidx.compose.ui.input.pointer.k0 k0Var, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
            return ((h) create(k0Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            h hVar = new h(this.f9187d, dVar);
            hVar.f9186c = obj;
            return hVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f9185b;
            if (i4 == 0) {
                kotlin.a1.n(obj);
                a aVar2 = new a((androidx.compose.ui.input.pointer.k0) this.f9186c, this.f9187d, null);
                this.f9185b = 1;
                if (kotlinx.coroutines.s0.g(aVar2, this) == aVar) {
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
    }

    /* compiled from: BasicTooltip.android.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.BasicTooltip_androidKt$handleGestures$2", f = "BasicTooltip.android.kt", i = {}, l = {180}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/k0;", "Lkotlin/k2;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/k0;)V"}, k = 3, mv = {1, 8, 0})
    static final class i extends kotlin.coroutines.jvm.internal.o implements ld.p<androidx.compose.ui.input.pointer.k0, kotlin.coroutines.d<? super kotlin.k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f9203b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f9204c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ u f9205d;

        /* compiled from: BasicTooltip.android.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.BasicTooltip_androidKt$handleGestures$2$1", f = "BasicTooltip.android.kt", i = {}, l = {181}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super kotlin.k2>, Object> {

            /* renamed from: b, reason: collision with root package name */
            int f9206b;

            /* renamed from: c, reason: collision with root package name */
            private /* synthetic */ Object f9207c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.input.pointer.k0 f9208d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ u f9209e;

            /* compiled from: BasicTooltip.android.kt */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.BasicTooltip_androidKt$handleGestures$2$1$1", f = "BasicTooltip.android.kt", i = {0, 0}, l = {185}, m = "invokeSuspend", n = {"$this$awaitPointerEventScope", "pass"}, s = {"L$0", "L$1"})
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/c;", "Lkotlin/k2;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/c;)V"}, k = 3, mv = {1, 8, 0})
            /* renamed from: androidx.compose.foundation.w$i$a$a, reason: collision with other inner class name */
            static final class C0200a extends kotlin.coroutines.jvm.internal.k implements ld.p<androidx.compose.ui.input.pointer.c, kotlin.coroutines.d<? super kotlin.k2>, Object> {

                /* renamed from: c, reason: collision with root package name */
                Object f9210c;

                /* renamed from: d, reason: collision with root package name */
                int f9211d;

                /* renamed from: e, reason: collision with root package name */
                private /* synthetic */ Object f9212e;

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ kotlinx.coroutines.r0 f9213f;

                /* renamed from: g, reason: collision with root package name */
                final /* synthetic */ u f9214g;

                /* compiled from: BasicTooltip.android.kt */
                @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.BasicTooltip_androidKt$handleGestures$2$1$1$1", f = "BasicTooltip.android.kt", i = {}, l = {190}, m = "invokeSuspend", n = {}, s = {})
                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
                /* renamed from: androidx.compose.foundation.w$i$a$a$a, reason: collision with other inner class name */
                static final class C0201a extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super kotlin.k2>, Object> {

                    /* renamed from: b, reason: collision with root package name */
                    int f9215b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ u f9216c;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C0201a(u uVar, kotlin.coroutines.d<? super C0201a> dVar) {
                        super(2, dVar);
                        this.f9216c = uVar;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    @fg.l
                    public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                        return new C0201a(this.f9216c, dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    @fg.m
                    public final Object invokeSuspend(@fg.l Object obj) {
                        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                        int i4 = this.f9215b;
                        if (i4 == 0) {
                            kotlin.a1.n(obj);
                            u uVar = this.f9216c;
                            a2 a2Var = a2.UserInput;
                            this.f9215b = 1;
                            if (uVar.c(a2Var, this) == aVar) {
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
                        return ((C0201a) create(r0Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0200a(kotlinx.coroutines.r0 r0Var, u uVar, kotlin.coroutines.d<? super C0200a> dVar) {
                    super(2, dVar);
                    this.f9213f = r0Var;
                    this.f9214g = uVar;
                }

                @Override // ld.p
                @fg.m
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(@fg.l androidx.compose.ui.input.pointer.c cVar, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
                    return ((C0200a) create(cVar, dVar)).invokeSuspend(kotlin.k2.f75408a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @fg.l
                public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                    C0200a c0200a = new C0200a(this.f9213f, this.f9214g, dVar);
                    c0200a.f9212e = obj;
                    return c0200a;
                }

                /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                    jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
                    	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                    	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                    	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                    */
                /* JADX WARN: Removed duplicated region for block: B:11:0x0054  */
                /* JADX WARN: Removed duplicated region for block: B:9:0x0033 A[RETURN] */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x0031 -> B:5:0x0034). Please report as a decompilation issue!!! */
                @Override // kotlin.coroutines.jvm.internal.a
                @fg.m
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invokeSuspend(@fg.l java.lang.Object r13) {
                    /*
                        r12 = this;
                        kotlin.coroutines.intrinsics.a r0 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
                        int r1 = r12.f9211d
                        r2 = 1
                        if (r1 == 0) goto L1d
                        if (r1 != r2) goto L15
                        java.lang.Object r1 = r12.f9210c
                        androidx.compose.ui.input.pointer.r r1 = (androidx.compose.ui.input.pointer.r) r1
                        java.lang.Object r3 = r12.f9212e
                        androidx.compose.ui.input.pointer.c r3 = (androidx.compose.ui.input.pointer.c) r3
                        kotlin.a1.n(r13)
                        goto L34
                    L15:
                        java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r13.<init>(r0)
                        throw r13
                    L1d:
                        kotlin.a1.n(r13)
                        java.lang.Object r13 = r12.f9212e
                        androidx.compose.ui.input.pointer.c r13 = (androidx.compose.ui.input.pointer.c) r13
                        androidx.compose.ui.input.pointer.r r1 = androidx.compose.ui.input.pointer.r.Main
                        r3 = r13
                    L27:
                        r12.f9212e = r3
                        r12.f9210c = r1
                        r12.f9211d = r2
                        java.lang.Object r13 = r3.u3(r1, r12)
                        if (r13 != r0) goto L34
                        return r0
                    L34:
                        androidx.compose.ui.input.pointer.p r13 = (androidx.compose.ui.input.pointer.p) r13
                        java.util.List r4 = r13.e()
                        r5 = 0
                        java.lang.Object r4 = r4.get(r5)
                        androidx.compose.ui.input.pointer.b0 r4 = (androidx.compose.ui.input.pointer.b0) r4
                        int r4 = r4.getType()
                        androidx.compose.ui.input.pointer.q0$a r5 = androidx.compose.ui.input.pointer.q0.INSTANCE
                        r5.getClass()
                        int r5 = androidx.compose.ui.input.pointer.q0.b()
                        boolean r4 = androidx.compose.ui.input.pointer.q0.i(r4, r5)
                        if (r4 == 0) goto L27
                        int r13 = r13.getType()
                        androidx.compose.ui.input.pointer.t$a r4 = androidx.compose.ui.input.pointer.t.INSTANCE
                        r4.getClass()
                        int r5 = androidx.compose.ui.input.pointer.t.a()
                        boolean r5 = androidx.compose.ui.input.pointer.t.k(r13, r5)
                        if (r5 == 0) goto L79
                        kotlinx.coroutines.r0 r6 = r12.f9213f
                        androidx.compose.foundation.w$i$a$a$a r9 = new androidx.compose.foundation.w$i$a$a$a
                        androidx.compose.foundation.u r13 = r12.f9214g
                        r4 = 0
                        r9.<init>(r13, r4)
                        r10 = 3
                        r11 = 0
                        r7 = 0
                        r8 = 0
                        kotlinx.coroutines.i.e(r6, r7, r8, r9, r10, r11)
                        goto L27
                    L79:
                        r4.getClass()
                        int r4 = androidx.compose.ui.input.pointer.t.b()
                        boolean r13 = androidx.compose.ui.input.pointer.t.k(r13, r4)
                        if (r13 == 0) goto L27
                        androidx.compose.foundation.u r13 = r12.f9214g
                        r13.dismiss()
                        goto L27
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.w.i.a.C0200a.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(androidx.compose.ui.input.pointer.k0 k0Var, u uVar, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f9208d = k0Var;
                this.f9209e = uVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.l
            public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                a aVar = new a(this.f9208d, this.f9209e, dVar);
                aVar.f9207c = obj;
                return aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                int i4 = this.f9206b;
                if (i4 == 0) {
                    kotlin.a1.n(obj);
                    kotlinx.coroutines.r0 r0Var = (kotlinx.coroutines.r0) this.f9207c;
                    androidx.compose.ui.input.pointer.k0 k0Var = this.f9208d;
                    C0200a c0200a = new C0200a(r0Var, this.f9209e, null);
                    this.f9206b = 1;
                    if (k0Var.o3(c0200a, this) == aVar) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(u uVar, kotlin.coroutines.d<? super i> dVar) {
            super(2, dVar);
            this.f9205d = uVar;
        }

        @Override // ld.p
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.l androidx.compose.ui.input.pointer.k0 k0Var, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
            return ((i) create(k0Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            i iVar = new i(this.f9205d, dVar);
            iVar.f9204c = obj;
            return iVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f9203b;
            if (i4 == 0) {
                kotlin.a1.n(obj);
                a aVar2 = new a((androidx.compose.ui.input.pointer.k0) this.f9204c, this.f9205d, null);
                this.f9203b = 1;
                if (kotlinx.coroutines.s0.g(aVar2, this) == aVar) {
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
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0081  */
    @androidx.compose.foundation.z0
    @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(@fg.l androidx.compose.ui.window.o r19, @fg.l ld.p<? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r20, @fg.l androidx.compose.foundation.u r21, @fg.m androidx.compose.ui.q r22, boolean r23, boolean r24, @fg.l ld.p<? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r25, @fg.m androidx.compose.runtime.t r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 577
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.w.a(androidx.compose.ui.window.o, ld.p, androidx.compose.foundation.u, androidx.compose.ui.q, boolean, boolean, ld.p, androidx.compose.runtime.t, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.i
    public static final void b(androidx.compose.ui.window.o oVar, u uVar, kotlinx.coroutines.r0 r0Var, boolean z4, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, androidx.compose.runtime.t tVar, int i4) {
        androidx.compose.runtime.t o4 = tVar.o(-73658727);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-73658727, i4, -1, "androidx.compose.foundation.TooltipPopup (BasicTooltip.android.kt:124)");
        }
        androidx.compose.ui.window.c.a(oVar, new c(uVar, r0Var), new androidx.compose.ui.window.p(z4, false, false, null, false, false, 62, null), androidx.compose.runtime.internal.c.b(o4, -1147839433, true, new d(androidx.compose.ui.res.i.d(t2.a.f7090a, o4, 0), pVar)), o4, (i4 & 14) | 3072, 0);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        t3 t4 = o4.t();
        if (t4 != null) {
            t4.a(new e(oVar, uVar, r0Var, z4, pVar, i4));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.i
    public static final void c(boolean z4, u uVar, androidx.compose.ui.q qVar, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, androidx.compose.runtime.t tVar, int i4, int i5) {
        int i6;
        androidx.compose.runtime.t o4 = tVar.o(1712976033);
        if ((i5 & 1) != 0) {
            i6 = i4 | 6;
        } else if ((i4 & 14) == 0) {
            i6 = (o4.b(z4) ? 4 : 2) | i4;
        } else {
            i6 = i4;
        }
        if ((i5 & 2) != 0) {
            i6 |= 48;
        } else if ((i4 & 112) == 0) {
            i6 |= o4.q0(uVar) ? 32 : 16;
        }
        int i7 = i5 & 4;
        if (i7 != 0) {
            i6 |= 384;
        } else if ((i4 & 896) == 0) {
            i6 |= o4.q0(qVar) ? 256 : 128;
        }
        if ((i5 & 8) != 0) {
            i6 |= 3072;
        } else if ((i4 & 7168) == 0) {
            i6 |= o4.S(pVar) ? 2048 : 1024;
        }
        if ((i6 & 5851) == 1170 && o4.p()) {
            o4.d0();
        } else {
            if (i7 != 0) {
                qVar = androidx.compose.ui.q.INSTANCE;
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(1712976033, i6, -1, "androidx.compose.foundation.WrappedAnchor (BasicTooltip.android.kt:107)");
            }
            Object a5 = j.a(o4, 773894976, -492369756);
            if (a5 == androidx.compose.runtime.t.INSTANCE.a()) {
                a5 = androidx.view.compose.l.a(androidx.compose.runtime.a1.m(kotlin.coroutines.i.f75057b, o4), o4);
            }
            o4.p0();
            kotlinx.coroutines.r0 coroutineScope = ((androidx.compose.runtime.j0) a5).getCoroutineScope();
            o4.p0();
            androidx.compose.ui.q f4 = f(g(qVar, z4, uVar), androidx.compose.ui.res.i.d(t2.a.f7091b, o4, 0), z4, uVar, coroutineScope);
            o4.P(733328855);
            androidx.compose.ui.layout.m0 a6 = androidx.compose.animation.a0.a(androidx.compose.ui.c.INSTANCE, false, o4, 0, -1323940314);
            int j4 = androidx.compose.runtime.p.j(o4, 0);
            androidx.compose.runtime.g0 B = o4.B();
            g.Companion companion = androidx.compose.ui.node.g.INSTANCE;
            ld.a<androidx.compose.ui.node.g> a7 = companion.a();
            ld.q<v3<androidx.compose.ui.node.g>, androidx.compose.runtime.t, Integer, kotlin.k2> g4 = androidx.compose.ui.layout.a0.g(f4);
            if (o4.s() == null) {
                androidx.compose.runtime.p.n();
            }
            o4.W();
            if (o4.getInserting()) {
                o4.F(a7);
            } else {
                o4.C();
            }
            ld.p a8 = androidx.compose.animation.p.a(companion, o4, a6, o4, B);
            if (o4.getInserting() || !kotlin.jvm.internal.l0.g(o4.Q(), Integer.valueOf(j4))) {
                androidx.compose.animation.d.a(j4, o4, j4, a8);
            }
            androidx.compose.animation.e.a(0, g4, v3.a(o4), o4, 2058660585);
            androidx.compose.foundation.layout.p pVar2 = androidx.compose.foundation.layout.p.f5235a;
            if (x.a((i6 >> 9) & 14, pVar, o4)) {
                androidx.compose.runtime.x.q0();
            }
        }
        androidx.compose.ui.q qVar2 = qVar;
        t3 t4 = o4.t();
        if (t4 != null) {
            t4.a(new f(z4, uVar, qVar2, pVar, i4, i5));
        }
    }

    private static final androidx.compose.ui.q f(androidx.compose.ui.q qVar, String str, boolean z4, u uVar, kotlinx.coroutines.r0 r0Var) {
        return z4 ? androidx.compose.ui.semantics.o.e(qVar, true, new g(str, r0Var, uVar)) : qVar;
    }

    private static final androidx.compose.ui.q g(androidx.compose.ui.q qVar, boolean z4, u uVar) {
        return z4 ? androidx.compose.ui.input.pointer.u0.e(androidx.compose.ui.input.pointer.u0.e(qVar, uVar, new h(uVar, null)), uVar, new i(uVar, null)) : qVar;
    }
}
