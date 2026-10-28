package androidx.compose.material3;

import androidx.compose.foundation.t2;
import androidx.compose.ui.node.g;
import androidx.compose.ui.q;
import kotlin.Metadata;
import org.apache.log4j.net.SyslogAppender;

/* compiled from: BasicTooltip.android.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\u001ac\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0011\u0010\u0005\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\u0011\u0010\r\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0004H\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001a<\u0010\u0010\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u0011\u0010\r\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0004H\u0003¢\u0006\u0004\b\u0010\u0010\u0011\u001aB\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\n2\u0011\u0010\r\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0004H\u0003¢\u0006\u0004\b\u0014\u0010\u0015\u001a#\u0010\u0017\u001a\u00020\b*\u00020\b2\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0017\u0010\u0018\u001a3\u0010\u001b\u001a\u00020\b*\u00020\b2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Landroidx/compose/ui/window/o;", "positionProvider", "Lkotlin/Function0;", "Lkotlin/k2;", "Landroidx/compose/runtime/i;", "tooltip", "Landroidx/compose/material3/b0;", "state", "Landroidx/compose/ui/q;", "modifier", "", "focusable", "enableUserInput", "content", "a", "(Landroidx/compose/ui/window/o;Lld/p;Landroidx/compose/material3/b0;Landroidx/compose/ui/q;ZZLld/p;Landroidx/compose/runtime/t;II)V", "c", "(ZLandroidx/compose/material3/b0;Landroidx/compose/ui/q;Lld/p;Landroidx/compose/runtime/t;II)V", "Lkotlinx/coroutines/r0;", "scope", "b", "(Landroidx/compose/ui/window/o;Landroidx/compose/material3/b0;Lkotlinx/coroutines/r0;ZLld/p;Landroidx/compose/runtime/t;I)V", "enabled", "g", "(Landroidx/compose/ui/q;ZLandroidx/compose/material3/b0;)Landroidx/compose/ui/q;", "", "label", "f", "(Landroidx/compose/ui/q;Ljava/lang/String;ZLandroidx/compose/material3/b0;Lkotlinx/coroutines/r0;)Landroidx/compose/ui/q;", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nBasicTooltip.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicTooltip.android.kt\nandroidx/compose/material3/BasicTooltip_androidKt\n+ 2 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 6 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 7 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,225:1\n487#2,4:226\n491#2,2:234\n495#2:240\n487#2,4:288\n491#2,2:296\n495#2:302\n25#3:230\n456#3,8:259\n464#3,3:273\n467#3,3:277\n25#3:292\n456#3,8:320\n464#3,3:334\n467#3,3:338\n1116#4,3:231\n1119#4,3:237\n1116#4,6:282\n1116#4,3:293\n1119#4,3:299\n1116#4,6:343\n487#5:236\n487#5:298\n67#6,7:241\n74#6:276\n78#6:281\n68#6,6:303\n74#6:337\n78#6:342\n78#7,11:248\n91#7:280\n78#7,11:309\n91#7:341\n3737#8,6:267\n3737#8,6:328\n*S KotlinDebug\n*F\n+ 1 BasicTooltip.android.kt\nandroidx/compose/material3/BasicTooltip_androidKt\n*L\n83#1:226,4\n83#1:234,2\n83#1:240\n115#1:288,4\n115#1:296,2\n115#1:302\n83#1:230\n84#1:259,8\n84#1:273,3\n84#1:277,3\n115#1:292\n117#1:320,8\n117#1:334,3\n117#1:338,3\n83#1:231,3\n83#1:237,3\n103#1:282,6\n115#1:293,3\n115#1:299,3\n134#1:343,6\n83#1:236\n115#1:298\n84#1:241,7\n84#1:276\n84#1:281\n117#1:303,6\n117#1:337\n117#1:342\n84#1:248,11\n84#1:280\n117#1:309,11\n117#1:341\n84#1:267,6\n117#1:328,6\n*E\n"})
/* loaded from: classes.dex */
public final class d0 {

    /* compiled from: BasicTooltip.android.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/runtime/w0;", "Landroidx/compose/runtime/v0;", "a", "(Landroidx/compose/runtime/w0;)Landroidx/compose/runtime/v0;"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nBasicTooltip.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicTooltip.android.kt\nandroidx/compose/material3/BasicTooltip_androidKt$BasicTooltipBox$2$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,225:1\n64#2,5:226\n*S KotlinDebug\n*F\n+ 1 BasicTooltip.android.kt\nandroidx/compose/material3/BasicTooltip_androidKt$BasicTooltipBox$2$1\n*L\n104#1:226,5\n*E\n"})
    static final class a extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.runtime.w0, androidx.compose.runtime.v0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ b0 f10350b;

        /* compiled from: Effects.kt */
        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005¸\u0006\u0000"}, d2 = {"androidx/compose/runtime/w0$a", "Landroidx/compose/runtime/v0;", "Lkotlin/k2;", "dispose", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        @kotlin.jvm.internal.r1({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 BasicTooltip.android.kt\nandroidx/compose/material3/BasicTooltip_androidKt$BasicTooltipBox$2$1\n*L\n1#1,497:1\n104#2:498\n*E\n"})
        /* renamed from: androidx.compose.material3.d0$a$a, reason: collision with other inner class name */
        public static final class C0230a implements androidx.compose.runtime.v0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ b0 f10351a;

            public C0230a(b0 b0Var) {
                this.f10351a = b0Var;
            }

            @Override // androidx.compose.runtime.v0
            public void dispose() {
                this.f10351a.a();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(b0 b0Var) {
            super(1);
            this.f10350b = b0Var;
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final androidx.compose.runtime.v0 invoke(@fg.l androidx.compose.runtime.w0 w0Var) {
            return new C0230a(this.f10350b);
        }
    }

    /* compiled from: BasicTooltip.android.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class b extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.window.o f10352b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f10353c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ b0 f10354d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f10355e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f10356f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f10357g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f10358h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f10359i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f10360j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(androidx.compose.ui.window.o oVar, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, b0 b0Var, androidx.compose.ui.q qVar, boolean z4, boolean z5, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar2, int i4, int i5) {
            super(2);
            this.f10352b = oVar;
            this.f10353c = pVar;
            this.f10354d = b0Var;
            this.f10355e = qVar;
            this.f10356f = z4;
            this.f10357g = z5;
            this.f10358h = pVar2;
            this.f10359i = i4;
            this.f10360j = i5;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            d0.a(this.f10352b, this.f10353c, this.f10354d, this.f10355e, this.f10356f, this.f10357g, this.f10358h, tVar, androidx.compose.runtime.g3.b(this.f10359i | 1), this.f10360j);
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
        final /* synthetic */ b0 f10361b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.r0 f10362c;

        /* compiled from: BasicTooltip.android.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.BasicTooltip_androidKt$TooltipPopup$1$1$1", f = "BasicTooltip.android.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super kotlin.k2>, Object> {

            /* renamed from: b, reason: collision with root package name */
            int f10363b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ b0 f10364c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(b0 b0Var, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f10364c = b0Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.l
            public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                return new a(this.f10364c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                if (this.f10363b != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a1.n(obj);
                this.f10364c.dismiss();
                return kotlin.k2.f75408a;
            }

            @Override // ld.p
            @fg.m
            public final Object invoke(@fg.l kotlinx.coroutines.r0 r0Var, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
                return ((a) create(r0Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(b0 b0Var, kotlinx.coroutines.r0 r0Var) {
            super(0);
            this.f10361b = b0Var;
            this.f10362c = r0Var;
        }

        public final void a() {
            if (this.f10361b.getIsVisible()) {
                kotlinx.coroutines.k.f(this.f10362c, null, null, new a(this.f10361b, null), 3, null);
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
    @kotlin.jvm.internal.r1({"SMAP\nBasicTooltip.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicTooltip.android.kt\nandroidx/compose/material3/BasicTooltip_androidKt$TooltipPopup$2\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,225:1\n1116#2,6:226\n68#3,6:232\n74#3:266\n78#3:271\n78#4,11:238\n91#4:270\n456#5,8:249\n464#5,3:263\n467#5,3:267\n3737#6,6:257\n*S KotlinDebug\n*F\n+ 1 BasicTooltip.android.kt\nandroidx/compose/material3/BasicTooltip_androidKt$TooltipPopup$2\n*L\n142#1:226,6\n141#1:232,6\n141#1:266\n141#1:271\n141#1:238,11\n141#1:270\n141#1:249,8\n141#1:263,3\n141#1:267,3\n141#1:257,6\n*E\n"})
    static final class d extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f10365b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f10366c;

        /* compiled from: BasicTooltip.android.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/semantics/z;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/semantics/z;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.semantics.z, kotlin.k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f10367b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(String str) {
                super(1);
                this.f10367b = str;
            }

            public final void a(@fg.l androidx.compose.ui.semantics.z zVar) {
                androidx.compose.ui.semantics.g.INSTANCE.getClass();
                androidx.compose.ui.semantics.w.g1(zVar, androidx.compose.ui.semantics.g.f20300d);
                androidx.compose.ui.semantics.w.h1(zVar, this.f10367b);
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
            this.f10365b = str;
            this.f10366c = pVar;
        }

        @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
        @androidx.compose.runtime.i
        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            if ((i4 & 3) == 2 && tVar.p()) {
                tVar.d0();
                return;
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(282408040, i4, -1, "androidx.compose.material3.TooltipPopup.<anonymous> (BasicTooltip.android.kt:140)");
            }
            q.Companion companion = androidx.compose.ui.q.INSTANCE;
            tVar.P(1706937961);
            boolean q02 = tVar.q0(this.f10365b);
            String str = this.f10365b;
            Object Q = tVar.Q();
            if (q02 || Q == androidx.compose.runtime.t.INSTANCE.a()) {
                Q = new a(str);
                tVar.E(Q);
            }
            tVar.p0();
            androidx.compose.ui.q f4 = androidx.compose.ui.semantics.o.f(companion, false, (ld.l) Q, 1, null);
            ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> pVar = this.f10366c;
            tVar.P(733328855);
            androidx.compose.ui.layout.m0 a5 = androidx.compose.animation.a0.a(androidx.compose.ui.c.INSTANCE, false, tVar, 0, -1323940314);
            int j4 = androidx.compose.runtime.p.j(tVar, 0);
            androidx.compose.runtime.g0 B = tVar.B();
            g.Companion companion2 = androidx.compose.ui.node.g.INSTANCE;
            ld.a<androidx.compose.ui.node.g> a6 = companion2.a();
            ld.q<androidx.compose.runtime.v3<androidx.compose.ui.node.g>, androidx.compose.runtime.t, Integer, kotlin.k2> g4 = androidx.compose.ui.layout.a0.g(f4);
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
            androidx.compose.animation.e.a(0, g4, androidx.compose.runtime.v3.a(tVar), tVar, 2058660585);
            androidx.compose.foundation.layout.p pVar2 = androidx.compose.foundation.layout.p.f5235a;
            if (androidx.compose.foundation.x.a(0, pVar, tVar)) {
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
        final /* synthetic */ androidx.compose.ui.window.o f10368b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ b0 f10369c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.r0 f10370d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f10371e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f10372f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f10373g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(androidx.compose.ui.window.o oVar, b0 b0Var, kotlinx.coroutines.r0 r0Var, boolean z4, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, int i4) {
            super(2);
            this.f10368b = oVar;
            this.f10369c = b0Var;
            this.f10370d = r0Var;
            this.f10371e = z4;
            this.f10372f = pVar;
            this.f10373g = i4;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            d0.b(this.f10368b, this.f10369c, this.f10370d, this.f10371e, this.f10372f, tVar, androidx.compose.runtime.g3.b(this.f10373g | 1));
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
        final /* synthetic */ boolean f10374b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ b0 f10375c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f10376d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f10377e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f10378f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f10379g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(boolean z4, b0 b0Var, androidx.compose.ui.q qVar, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, int i4, int i5) {
            super(2);
            this.f10374b = z4;
            this.f10375c = b0Var;
            this.f10376d = qVar;
            this.f10377e = pVar;
            this.f10378f = i4;
            this.f10379g = i5;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            d0.c(this.f10374b, this.f10375c, this.f10376d, this.f10377e, tVar, androidx.compose.runtime.g3.b(this.f10378f | 1), this.f10379g);
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
        final /* synthetic */ String f10380b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.r0 f10381c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ b0 f10382d;

        /* compiled from: BasicTooltip.android.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.jvm.internal.n0 implements ld.a<Boolean> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.r0 f10383b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ b0 f10384c;

            /* compiled from: BasicTooltip.android.kt */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.BasicTooltip_androidKt$anchorSemantics$1$1$1", f = "BasicTooltip.android.kt", i = {}, l = {219}, m = "invokeSuspend", n = {}, s = {})
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
            /* renamed from: androidx.compose.material3.d0$g$a$a, reason: collision with other inner class name */
            static final class C0231a extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super kotlin.k2>, Object> {

                /* renamed from: b, reason: collision with root package name */
                int f10385b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ b0 f10386c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0231a(b0 b0Var, kotlin.coroutines.d<? super C0231a> dVar) {
                    super(2, dVar);
                    this.f10386c = b0Var;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @fg.l
                public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                    return new C0231a(this.f10386c, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @fg.m
                public final Object invokeSuspend(@fg.l Object obj) {
                    kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                    int i4 = this.f10385b;
                    if (i4 == 0) {
                        kotlin.a1.n(obj);
                        b0 b0Var = this.f10386c;
                        this.f10385b = 1;
                        if (b0.e(b0Var, null, this, 1, null) == aVar) {
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
                    return ((C0231a) create(r0Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(kotlinx.coroutines.r0 r0Var, b0 b0Var) {
                super(0);
                this.f10383b = r0Var;
                this.f10384c = b0Var;
            }

            @Override // ld.a
            @fg.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                kotlinx.coroutines.k.f(this.f10383b, null, null, new C0231a(this.f10384c, null), 3, null);
                return Boolean.TRUE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(String str, kotlinx.coroutines.r0 r0Var, b0 b0Var) {
            super(1);
            this.f10380b = str;
            this.f10381c = r0Var;
            this.f10382d = b0Var;
        }

        public final void a(@fg.l androidx.compose.ui.semantics.z zVar) {
            androidx.compose.ui.semantics.w.A0(zVar, this.f10380b, new a(this.f10381c, this.f10382d));
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.ui.semantics.z zVar) {
            a(zVar);
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: BasicTooltip.android.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.BasicTooltip_androidKt$handleGestures$1", f = "BasicTooltip.android.kt", i = {}, l = {156}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/k0;", "Lkotlin/k2;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/k0;)V"}, k = 3, mv = {1, 8, 0})
    static final class h extends kotlin.coroutines.jvm.internal.o implements ld.p<androidx.compose.ui.input.pointer.k0, kotlin.coroutines.d<? super kotlin.k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f10387b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f10388c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ b0 f10389d;

        /* compiled from: BasicTooltip.android.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.BasicTooltip_androidKt$handleGestures$1$1", f = "BasicTooltip.android.kt", i = {}, l = {157}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super kotlin.k2>, Object> {

            /* renamed from: b, reason: collision with root package name */
            int f10390b;

            /* renamed from: c, reason: collision with root package name */
            private /* synthetic */ Object f10391c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.input.pointer.k0 f10392d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ b0 f10393e;

            /* compiled from: BasicTooltip.android.kt */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.BasicTooltip_androidKt$handleGestures$1$1$1", f = "BasicTooltip.android.kt", i = {0, 0, 0, 1, 1}, l = {162, SyslogAppender.LOG_LOCAL5, SyslogAppender.LOG_LOCAL6}, m = "invokeSuspend", n = {"$this$awaitEachGesture", "pass", "longPressTimeout", "$this$awaitEachGesture", "pass"}, s = {"L$0", "L$1", "J$0", "L$0", "L$1"})
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/c;", "Lkotlin/k2;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/c;)V"}, k = 3, mv = {1, 8, 0})
            /* renamed from: androidx.compose.material3.d0$h$a$a, reason: collision with other inner class name */
            static final class C0232a extends kotlin.coroutines.jvm.internal.k implements ld.p<androidx.compose.ui.input.pointer.c, kotlin.coroutines.d<? super kotlin.k2>, Object> {

                /* renamed from: c, reason: collision with root package name */
                Object f10394c;

                /* renamed from: d, reason: collision with root package name */
                long f10395d;

                /* renamed from: e, reason: collision with root package name */
                int f10396e;

                /* renamed from: f, reason: collision with root package name */
                private /* synthetic */ Object f10397f;

                /* renamed from: g, reason: collision with root package name */
                final /* synthetic */ kotlinx.coroutines.r0 f10398g;

                /* renamed from: h, reason: collision with root package name */
                final /* synthetic */ b0 f10399h;

                /* compiled from: BasicTooltip.android.kt */
                @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.BasicTooltip_androidKt$handleGestures$1$1$1$1", f = "BasicTooltip.android.kt", i = {}, l = {169}, m = "invokeSuspend", n = {}, s = {})
                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/c;", "Landroidx/compose/ui/input/pointer/b0;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/c;)Landroidx/compose/ui/input/pointer/b0;"}, k = 3, mv = {1, 8, 0})
                /* renamed from: androidx.compose.material3.d0$h$a$a$a, reason: collision with other inner class name */
                static final class C0233a extends kotlin.coroutines.jvm.internal.k implements ld.p<androidx.compose.ui.input.pointer.c, kotlin.coroutines.d<? super androidx.compose.ui.input.pointer.b0>, Object> {

                    /* renamed from: c, reason: collision with root package name */
                    int f10400c;

                    /* renamed from: d, reason: collision with root package name */
                    private /* synthetic */ Object f10401d;

                    /* renamed from: e, reason: collision with root package name */
                    final /* synthetic */ androidx.compose.ui.input.pointer.r f10402e;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C0233a(androidx.compose.ui.input.pointer.r rVar, kotlin.coroutines.d<? super C0233a> dVar) {
                        super(2, dVar);
                        this.f10402e = rVar;
                    }

                    @Override // ld.p
                    @fg.m
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final Object invoke(@fg.l androidx.compose.ui.input.pointer.c cVar, @fg.m kotlin.coroutines.d<? super androidx.compose.ui.input.pointer.b0> dVar) {
                        return ((C0233a) create(cVar, dVar)).invokeSuspend(kotlin.k2.f75408a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    @fg.l
                    public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                        C0233a c0233a = new C0233a(this.f10402e, dVar);
                        c0233a.f10401d = obj;
                        return c0233a;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    @fg.m
                    public final Object invokeSuspend(@fg.l Object obj) {
                        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                        int i4 = this.f10400c;
                        if (i4 == 0) {
                            kotlin.a1.n(obj);
                            androidx.compose.ui.input.pointer.c cVar = (androidx.compose.ui.input.pointer.c) this.f10401d;
                            androidx.compose.ui.input.pointer.r rVar = this.f10402e;
                            this.f10400c = 1;
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
                @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.BasicTooltip_androidKt$handleGestures$1$1$1$2", f = "BasicTooltip.android.kt", i = {}, l = {173}, m = "invokeSuspend", n = {}, s = {})
                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
                /* renamed from: androidx.compose.material3.d0$h$a$a$b */
                static final class b extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super kotlin.k2>, Object> {

                    /* renamed from: b, reason: collision with root package name */
                    int f10403b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ b0 f10404c;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    b(b0 b0Var, kotlin.coroutines.d<? super b> dVar) {
                        super(2, dVar);
                        this.f10404c = b0Var;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    @fg.l
                    public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                        return new b(this.f10404c, dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    @fg.m
                    public final Object invokeSuspend(@fg.l Object obj) {
                        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                        int i4 = this.f10403b;
                        if (i4 == 0) {
                            kotlin.a1.n(obj);
                            b0 b0Var = this.f10404c;
                            androidx.compose.foundation.a2 a2Var = androidx.compose.foundation.a2.UserInput;
                            this.f10403b = 1;
                            if (b0Var.c(a2Var, this) == aVar) {
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
                C0232a(kotlinx.coroutines.r0 r0Var, b0 b0Var, kotlin.coroutines.d<? super C0232a> dVar) {
                    super(2, dVar);
                    this.f10398g = r0Var;
                    this.f10399h = b0Var;
                }

                @Override // ld.p
                @fg.m
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(@fg.l androidx.compose.ui.input.pointer.c cVar, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
                    return ((C0232a) create(cVar, dVar)).invokeSuspend(kotlin.k2.f75408a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @fg.l
                public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                    C0232a c0232a = new C0232a(this.f10398g, this.f10399h, dVar);
                    c0232a.f10397f = obj;
                    return c0232a;
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
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.d0.h.a.C0232a.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(androidx.compose.ui.input.pointer.k0 k0Var, b0 b0Var, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f10392d = k0Var;
                this.f10393e = b0Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.l
            public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                a aVar = new a(this.f10392d, this.f10393e, dVar);
                aVar.f10391c = obj;
                return aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                int i4 = this.f10390b;
                if (i4 == 0) {
                    kotlin.a1.n(obj);
                    kotlinx.coroutines.r0 r0Var = (kotlinx.coroutines.r0) this.f10391c;
                    androidx.compose.ui.input.pointer.k0 k0Var = this.f10392d;
                    C0232a c0232a = new C0232a(r0Var, this.f10393e, null);
                    this.f10390b = 1;
                    if (androidx.compose.foundation.gestures.f0.d(k0Var, c0232a, this) == aVar) {
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
        h(b0 b0Var, kotlin.coroutines.d<? super h> dVar) {
            super(2, dVar);
            this.f10389d = b0Var;
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
            h hVar = new h(this.f10389d, dVar);
            hVar.f10388c = obj;
            return hVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f10387b;
            if (i4 == 0) {
                kotlin.a1.n(obj);
                a aVar2 = new a((androidx.compose.ui.input.pointer.k0) this.f10388c, this.f10389d, null);
                this.f10387b = 1;
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
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.BasicTooltip_androidKt$handleGestures$2", f = "BasicTooltip.android.kt", i = {}, l = {SyslogAppender.LOG_LOCAL7}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/k0;", "Lkotlin/k2;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/k0;)V"}, k = 3, mv = {1, 8, 0})
    static final class i extends kotlin.coroutines.jvm.internal.o implements ld.p<androidx.compose.ui.input.pointer.k0, kotlin.coroutines.d<? super kotlin.k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f10405b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f10406c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ b0 f10407d;

        /* compiled from: BasicTooltip.android.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.BasicTooltip_androidKt$handleGestures$2$1", f = "BasicTooltip.android.kt", i = {}, l = {185}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super kotlin.k2>, Object> {

            /* renamed from: b, reason: collision with root package name */
            int f10408b;

            /* renamed from: c, reason: collision with root package name */
            private /* synthetic */ Object f10409c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.input.pointer.k0 f10410d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ b0 f10411e;

            /* compiled from: BasicTooltip.android.kt */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.BasicTooltip_androidKt$handleGestures$2$1$1", f = "BasicTooltip.android.kt", i = {0, 0}, l = {189}, m = "invokeSuspend", n = {"$this$awaitPointerEventScope", "pass"}, s = {"L$0", "L$1"})
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/c;", "Lkotlin/k2;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/c;)V"}, k = 3, mv = {1, 8, 0})
            /* renamed from: androidx.compose.material3.d0$i$a$a, reason: collision with other inner class name */
            static final class C0234a extends kotlin.coroutines.jvm.internal.k implements ld.p<androidx.compose.ui.input.pointer.c, kotlin.coroutines.d<? super kotlin.k2>, Object> {

                /* renamed from: c, reason: collision with root package name */
                Object f10412c;

                /* renamed from: d, reason: collision with root package name */
                int f10413d;

                /* renamed from: e, reason: collision with root package name */
                private /* synthetic */ Object f10414e;

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ kotlinx.coroutines.r0 f10415f;

                /* renamed from: g, reason: collision with root package name */
                final /* synthetic */ b0 f10416g;

                /* compiled from: BasicTooltip.android.kt */
                @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.BasicTooltip_androidKt$handleGestures$2$1$1$1", f = "BasicTooltip.android.kt", i = {}, l = {194}, m = "invokeSuspend", n = {}, s = {})
                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
                /* renamed from: androidx.compose.material3.d0$i$a$a$a, reason: collision with other inner class name */
                static final class C0235a extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super kotlin.k2>, Object> {

                    /* renamed from: b, reason: collision with root package name */
                    int f10417b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ b0 f10418c;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C0235a(b0 b0Var, kotlin.coroutines.d<? super C0235a> dVar) {
                        super(2, dVar);
                        this.f10418c = b0Var;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    @fg.l
                    public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                        return new C0235a(this.f10418c, dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    @fg.m
                    public final Object invokeSuspend(@fg.l Object obj) {
                        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                        int i4 = this.f10417b;
                        if (i4 == 0) {
                            kotlin.a1.n(obj);
                            b0 b0Var = this.f10418c;
                            androidx.compose.foundation.a2 a2Var = androidx.compose.foundation.a2.UserInput;
                            this.f10417b = 1;
                            if (b0Var.c(a2Var, this) == aVar) {
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
                        return ((C0235a) create(r0Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0234a(kotlinx.coroutines.r0 r0Var, b0 b0Var, kotlin.coroutines.d<? super C0234a> dVar) {
                    super(2, dVar);
                    this.f10415f = r0Var;
                    this.f10416g = b0Var;
                }

                @Override // ld.p
                @fg.m
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(@fg.l androidx.compose.ui.input.pointer.c cVar, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
                    return ((C0234a) create(cVar, dVar)).invokeSuspend(kotlin.k2.f75408a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @fg.l
                public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                    C0234a c0234a = new C0234a(this.f10415f, this.f10416g, dVar);
                    c0234a.f10414e = obj;
                    return c0234a;
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
                        int r1 = r12.f10413d
                        r2 = 1
                        if (r1 == 0) goto L1d
                        if (r1 != r2) goto L15
                        java.lang.Object r1 = r12.f10412c
                        androidx.compose.ui.input.pointer.r r1 = (androidx.compose.ui.input.pointer.r) r1
                        java.lang.Object r3 = r12.f10414e
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
                        java.lang.Object r13 = r12.f10414e
                        androidx.compose.ui.input.pointer.c r13 = (androidx.compose.ui.input.pointer.c) r13
                        androidx.compose.ui.input.pointer.r r1 = androidx.compose.ui.input.pointer.r.Main
                        r3 = r13
                    L27:
                        r12.f10414e = r3
                        r12.f10412c = r1
                        r12.f10413d = r2
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
                        kotlinx.coroutines.r0 r6 = r12.f10415f
                        androidx.compose.material3.d0$i$a$a$a r9 = new androidx.compose.material3.d0$i$a$a$a
                        androidx.compose.material3.b0 r13 = r12.f10416g
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
                        androidx.compose.material3.b0 r13 = r12.f10416g
                        r13.dismiss()
                        goto L27
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.d0.i.a.C0234a.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(androidx.compose.ui.input.pointer.k0 k0Var, b0 b0Var, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f10410d = k0Var;
                this.f10411e = b0Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.l
            public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                a aVar = new a(this.f10410d, this.f10411e, dVar);
                aVar.f10409c = obj;
                return aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                int i4 = this.f10408b;
                if (i4 == 0) {
                    kotlin.a1.n(obj);
                    kotlinx.coroutines.r0 r0Var = (kotlinx.coroutines.r0) this.f10409c;
                    androidx.compose.ui.input.pointer.k0 k0Var = this.f10410d;
                    C0234a c0234a = new C0234a(r0Var, this.f10411e, null);
                    this.f10408b = 1;
                    if (k0Var.o3(c0234a, this) == aVar) {
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
        i(b0 b0Var, kotlin.coroutines.d<? super i> dVar) {
            super(2, dVar);
            this.f10407d = b0Var;
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
            i iVar = new i(this.f10407d, dVar);
            iVar.f10406c = obj;
            return iVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f10405b;
            if (i4 == 0) {
                kotlin.a1.n(obj);
                a aVar2 = new a((androidx.compose.ui.input.pointer.k0) this.f10406c, this.f10407d, null);
                this.f10405b = 1;
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

    /* JADX WARN: Removed duplicated region for block: B:16:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x007e  */
    @androidx.compose.material3.f5
    @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(@fg.l androidx.compose.ui.window.o r21, @fg.l ld.p<? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r22, @fg.l androidx.compose.material3.b0 r23, @fg.m androidx.compose.ui.q r24, boolean r25, boolean r26, @fg.l ld.p<? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r27, @fg.m androidx.compose.runtime.t r28, int r29, int r30) {
        /*
            Method dump skipped, instructions count: 578
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.d0.a(androidx.compose.ui.window.o, ld.p, androidx.compose.material3.b0, androidx.compose.ui.q, boolean, boolean, ld.p, androidx.compose.runtime.t, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.i
    public static final void b(androidx.compose.ui.window.o oVar, b0 b0Var, kotlinx.coroutines.r0 r0Var, boolean z4, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, androidx.compose.runtime.t tVar, int i4) {
        int i5;
        androidx.compose.runtime.t o4 = tVar.o(-237130298);
        if ((i4 & 6) == 0) {
            i5 = (o4.q0(oVar) ? 4 : 2) | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            i5 |= o4.q0(b0Var) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i5 |= o4.S(r0Var) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            i5 |= o4.b(z4) ? 2048 : 1024;
        }
        if ((i4 & 24576) == 0) {
            i5 |= o4.S(pVar) ? 16384 : 8192;
        }
        if ((i5 & 9363) == 9362 && o4.p()) {
            o4.d0();
        } else {
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(-237130298, i5, -1, "androidx.compose.material3.TooltipPopup (BasicTooltip.android.kt:129)");
            }
            String d5 = androidx.compose.ui.res.i.d(t2.a.f7090a, o4, 0);
            o4.P(1291172190);
            boolean S = o4.S(r0Var) | ((i5 & 112) == 32);
            Object Q = o4.Q();
            if (S || Q == androidx.compose.runtime.t.INSTANCE.a()) {
                Q = new c(b0Var, r0Var);
                o4.E(Q);
            }
            o4.p0();
            androidx.compose.ui.window.c.a(oVar, (ld.a) Q, new androidx.compose.ui.window.p(z4, false, false, null, false, false, 62, null), androidx.compose.runtime.internal.c.b(o4, 282408040, true, new d(d5, pVar)), o4, (i5 & 14) | 3072, 0);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }
        androidx.compose.runtime.t3 t4 = o4.t();
        if (t4 != null) {
            t4.a(new e(oVar, b0Var, r0Var, z4, pVar, i4));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.i
    public static final void c(boolean z4, b0 b0Var, androidx.compose.ui.q qVar, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, androidx.compose.runtime.t tVar, int i4, int i5) {
        int i6;
        androidx.compose.runtime.t o4 = tVar.o(513239742);
        if ((i5 & 1) != 0) {
            i6 = i4 | 6;
        } else if ((i4 & 6) == 0) {
            i6 = (o4.b(z4) ? 4 : 2) | i4;
        } else {
            i6 = i4;
        }
        if ((i5 & 2) != 0) {
            i6 |= 48;
        } else if ((i4 & 48) == 0) {
            i6 |= o4.q0(b0Var) ? 32 : 16;
        }
        int i7 = i5 & 4;
        if (i7 != 0) {
            i6 |= 384;
        } else if ((i4 & 384) == 0) {
            i6 |= o4.q0(qVar) ? 256 : 128;
        }
        if ((i5 & 8) != 0) {
            i6 |= 3072;
        } else if ((i4 & 3072) == 0) {
            i6 |= o4.S(pVar) ? 2048 : 1024;
        }
        if ((i6 & 1171) == 1170 && o4.p()) {
            o4.d0();
        } else {
            if (i7 != 0) {
                qVar = androidx.compose.ui.q.INSTANCE;
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(513239742, i6, -1, "androidx.compose.material3.WrappedAnchor (BasicTooltip.android.kt:113)");
            }
            Object a5 = androidx.compose.foundation.j.a(o4, 773894976, -492369756);
            if (a5 == androidx.compose.runtime.t.INSTANCE.a()) {
                a5 = androidx.view.compose.l.a(androidx.compose.runtime.a1.m(kotlin.coroutines.i.f75057b, o4), o4);
            }
            o4.p0();
            kotlinx.coroutines.r0 coroutineScope = ((androidx.compose.runtime.j0) a5).getCoroutineScope();
            o4.p0();
            androidx.compose.ui.q f4 = f(g(qVar, z4, b0Var), androidx.compose.ui.res.i.d(t2.a.f7091b, o4, 0), z4, b0Var, coroutineScope);
            o4.P(733328855);
            androidx.compose.ui.layout.m0 a6 = androidx.compose.animation.a0.a(androidx.compose.ui.c.INSTANCE, false, o4, 0, -1323940314);
            int j4 = androidx.compose.runtime.p.j(o4, 0);
            androidx.compose.runtime.g0 B = o4.B();
            g.Companion companion = androidx.compose.ui.node.g.INSTANCE;
            ld.a<androidx.compose.ui.node.g> a7 = companion.a();
            ld.q<androidx.compose.runtime.v3<androidx.compose.ui.node.g>, androidx.compose.runtime.t, Integer, kotlin.k2> g4 = androidx.compose.ui.layout.a0.g(f4);
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
            androidx.compose.animation.e.a(0, g4, androidx.compose.runtime.v3.a(o4), o4, 2058660585);
            androidx.compose.foundation.layout.p pVar2 = androidx.compose.foundation.layout.p.f5235a;
            if (androidx.compose.foundation.x.a((i6 >> 9) & 14, pVar, o4)) {
                androidx.compose.runtime.x.q0();
            }
        }
        androidx.compose.ui.q qVar2 = qVar;
        androidx.compose.runtime.t3 t4 = o4.t();
        if (t4 != null) {
            t4.a(new f(z4, b0Var, qVar2, pVar, i4, i5));
        }
    }

    private static final androidx.compose.ui.q f(androidx.compose.ui.q qVar, String str, boolean z4, b0 b0Var, kotlinx.coroutines.r0 r0Var) {
        return z4 ? androidx.compose.ui.semantics.o.e(qVar, true, new g(str, r0Var, b0Var)) : qVar;
    }

    private static final androidx.compose.ui.q g(androidx.compose.ui.q qVar, boolean z4, b0 b0Var) {
        return z4 ? androidx.compose.ui.input.pointer.u0.e(androidx.compose.ui.input.pointer.u0.e(qVar, b0Var, new h(b0Var, null)), b0Var, new i(b0Var, null)) : qVar;
    }
}
