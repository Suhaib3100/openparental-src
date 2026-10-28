package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.layout.c2;
import androidx.compose.foundation.layout.f2;
import androidx.compose.runtime.g3;
import androidx.compose.runtime.t3;
import androidx.compose.ui.graphics.d2;
import androidx.compose.ui.graphics.drawscope.a;
import androidx.compose.ui.graphics.e2;
import androidx.compose.ui.graphics.k1;
import androidx.compose.ui.graphics.s4;
import androidx.compose.ui.graphics.t4;
import androidx.compose.ui.graphics.u4;
import androidx.compose.ui.graphics.v1;
import androidx.compose.ui.platform.h1;
import androidx.compose.ui.platform.s5;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;
import kotlin.k2;

/* compiled from: AndroidSelectionHandles.android.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u001a7\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a-\u0010\u000f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u001a)\u0010\u0011\u001a\u00020\u0007*\u00020\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u001b\u0010\u0017\u001a\u00020\u0016*\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a2\u0010\u001e\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\u0011\u0010\u001d\u001a\r\u0012\u0004\u0012\u00020\t0\f¢\u0006\u0002\b\u001cH\u0001¢\u0006\u0004\b\u001e\u0010\u001f\u001a'\u0010 \u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0000¢\u0006\u0004\b \u0010!\u001a\u001f\u0010#\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u0002H\u0000¢\u0006\u0004\b#\u0010$¨\u0006%"}, d2 = {"Landroidx/compose/foundation/text/selection/n;", "offsetProvider", "", "isStartHandle", "Landroidx/compose/ui/text/style/i;", "direction", "handlesCrossed", "Landroidx/compose/ui/q;", "modifier", "Lkotlin/k2;", "b", "(Landroidx/compose/foundation/text/selection/n;ZLandroidx/compose/ui/text/style/i;ZLandroidx/compose/ui/q;Landroidx/compose/runtime/t;I)V", "Lkotlin/Function0;", "iconVisible", "isLeft", "c", "(Landroidx/compose/ui/q;Lld/a;ZLandroidx/compose/runtime/t;I)V", "e", "(Landroidx/compose/ui/q;Lld/a;Z)Landroidx/compose/ui/q;", "Landroidx/compose/ui/draw/g;", "", "radius", "Landroidx/compose/ui/graphics/s4;", "d", "(Landroidx/compose/ui/draw/g;F)Landroidx/compose/ui/graphics/s4;", "positionProvider", "Landroidx/compose/foundation/text/selection/i;", "handleReferencePoint", "Landroidx/compose/runtime/i;", "content", "a", "(Landroidx/compose/foundation/text/selection/n;Landroidx/compose/foundation/text/selection/i;Lld/p;Landroidx/compose/runtime/t;I)V", "g", "(ZLandroidx/compose/ui/text/style/i;Z)Z", "areHandlesCrossed", "f", "(Landroidx/compose/ui/text/style/i;Z)Z", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nAndroidSelectionHandles.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidSelectionHandles.android.kt\nandroidx/compose/foundation/text/selection/AndroidSelectionHandles_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 CanvasDrawScope.kt\nandroidx/compose/ui/graphics/drawscope/CanvasDrawScope\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,327:1\n74#2:328\n542#3,17:329\n50#4:346\n49#4:347\n1116#5,6:348\n*S KotlinDebug\n*F\n+ 1 AndroidSelectionHandles.android.kt\nandroidx/compose/foundation/text/selection/AndroidSelectionHandles_androidKt\n*L\n73#1:328\n189#1:329,17\n225#1:346\n225#1:347\n225#1:348,6\n*E\n"})
/* loaded from: classes.dex */
public final class a {

    /* compiled from: AndroidSelectionHandles.android.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.text.selection.a$a, reason: collision with other inner class name */
    static final class C0149a extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ n f7885b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ i f7886c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, k2> f7887d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f7888e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C0149a(n nVar, i iVar, ld.p<? super androidx.compose.runtime.t, ? super Integer, k2> pVar, int i4) {
            super(2);
            this.f7885b = nVar;
            this.f7886c = iVar;
            this.f7887d = pVar;
            this.f7888e = i4;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            a.a(this.f7885b, this.f7886c, this.f7887d, tVar, g3.b(this.f7888e | 1));
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return k2.f75408a;
        }
    }

    /* compiled from: AndroidSelectionHandles.android.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ s5 f7889b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f7890c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f7891d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ n f7892e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f7893f;

        /* compiled from: AndroidSelectionHandles.android.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.foundation.text.selection.a$b$a, reason: collision with other inner class name */
        static final class C0150a extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.q f7894b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ boolean f7895c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ n f7896d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ boolean f7897e;

            /* compiled from: AndroidSelectionHandles.android.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/semantics/z;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/semantics/z;)V"}, k = 3, mv = {1, 8, 0})
            /* renamed from: androidx.compose.foundation.text.selection.a$b$a$a, reason: collision with other inner class name */
            static final class C0151a extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.semantics.z, k2> {

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ n f7898b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ boolean f7899c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ boolean f7900d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0151a(n nVar, boolean z4, boolean z5) {
                    super(1);
                    this.f7898b = nVar;
                    this.f7899c = z4;
                    this.f7900d = z5;
                }

                public final void a(@fg.l androidx.compose.ui.semantics.z zVar) {
                    long a5 = this.f7898b.a();
                    zVar.b(c0.d(), new b0(this.f7899c ? androidx.compose.foundation.text.o.SelectionStart : androidx.compose.foundation.text.o.SelectionEnd, a5, this.f7900d ? a0.Left : a0.Right, i0.g.d(a5), null));
                }

                @Override // ld.l
                public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.ui.semantics.z zVar) {
                    a(zVar);
                    return k2.f75408a;
                }
            }

            /* compiled from: AndroidSelectionHandles.android.kt */
            @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
            /* renamed from: androidx.compose.foundation.text.selection.a$b$a$b, reason: collision with other inner class name */
            static final class C0152b extends kotlin.jvm.internal.n0 implements ld.a<Boolean> {

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ n f7901b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0152b(n nVar) {
                    super(0);
                    this.f7901b = nVar;
                }

                @Override // ld.a
                @fg.l
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Boolean invoke() {
                    return Boolean.valueOf(i0.g.d(this.f7901b.a()));
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0150a(androidx.compose.ui.q qVar, boolean z4, n nVar, boolean z5) {
                super(2);
                this.f7894b = qVar;
                this.f7895c = z4;
                this.f7896d = nVar;
                this.f7897e = z5;
            }

            @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
            @androidx.compose.runtime.i
            public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
                if ((i4 & 11) == 2 && tVar.p()) {
                    tVar.d0();
                    return;
                }
                if (androidx.compose.runtime.x.b0()) {
                    androidx.compose.runtime.x.r0(-1338858912, i4, -1, "androidx.compose.foundation.text.selection.SelectionHandle.<anonymous>.<anonymous> (AndroidSelectionHandles.android.kt:75)");
                }
                a.c(androidx.compose.ui.semantics.o.f(this.f7894b, false, new C0151a(this.f7896d, this.f7897e, this.f7895c), 1, null), new C0152b(this.f7896d), this.f7895c, tVar, 0);
                if (androidx.compose.runtime.x.b0()) {
                    androidx.compose.runtime.x.q0();
                }
            }

            @Override // ld.p
            public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
                a(tVar, num.intValue());
                return k2.f75408a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(s5 s5Var, androidx.compose.ui.q qVar, boolean z4, n nVar, boolean z5) {
            super(2);
            this.f7889b = s5Var;
            this.f7890c = qVar;
            this.f7891d = z4;
            this.f7892e = nVar;
            this.f7893f = z5;
        }

        @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
        @androidx.compose.runtime.i
        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            if ((i4 & 11) == 2 && tVar.p()) {
                tVar.d0();
                return;
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(1868300064, i4, -1, "androidx.compose.foundation.text.selection.SelectionHandle.<anonymous> (AndroidSelectionHandles.android.kt:74)");
            }
            androidx.compose.runtime.f0.b(h1.v().e(this.f7889b), androidx.compose.runtime.internal.c.b(tVar, -1338858912, true, new C0150a(this.f7890c, this.f7891d, this.f7892e, this.f7893f)), tVar, 56);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return k2.f75408a;
        }
    }

    /* compiled from: AndroidSelectionHandles.android.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class c extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ n f7902b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f7903c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.text.style.i f7904d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f7905e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f7906f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f7907g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(n nVar, boolean z4, androidx.compose.ui.text.style.i iVar, boolean z5, androidx.compose.ui.q qVar, int i4) {
            super(2);
            this.f7902b = nVar;
            this.f7903c = z4;
            this.f7904d = iVar;
            this.f7905e = z5;
            this.f7906f = qVar;
            this.f7907g = i4;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            a.b(this.f7902b, this.f7903c, this.f7904d, this.f7905e, this.f7906f, tVar, g3.b(this.f7907g | 1));
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return k2.f75408a;
        }
    }

    /* compiled from: AndroidSelectionHandles.android.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class d extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f7908b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.a<Boolean> f7909c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f7910d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f7911e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(androidx.compose.ui.q qVar, ld.a<Boolean> aVar, boolean z4, int i4) {
            super(2);
            this.f7908b = qVar;
            this.f7909c = aVar;
            this.f7910d = z4;
            this.f7911e = i4;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            a.c(this.f7908b, this.f7909c, this.f7910d, tVar, g3.b(this.f7911e | 1));
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return k2.f75408a;
        }
    }

    /* compiled from: AndroidSelectionHandles.android.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/q;", "a", "(Landroidx/compose/ui/q;Landroidx/compose/runtime/t;I)Landroidx/compose/ui/q;"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nAndroidSelectionHandles.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidSelectionHandles.android.kt\nandroidx/compose/foundation/text/selection/AndroidSelectionHandles_androidKt$drawSelectionHandle$1\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,327:1\n74#2:328\n1116#3,6:329\n*S KotlinDebug\n*F\n+ 1 AndroidSelectionHandles.android.kt\nandroidx/compose/foundation/text/selection/AndroidSelectionHandles_androidKt$drawSelectionHandle$1\n*L\n111#1:328\n112#1:329,6\n*E\n"})
    static final class e extends kotlin.jvm.internal.n0 implements ld.q<androidx.compose.ui.q, androidx.compose.runtime.t, Integer, androidx.compose.ui.q> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.a<Boolean> f7912b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f7913c;

        /* compiled from: AndroidSelectionHandles.android.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/draw/g;", "Landroidx/compose/ui/draw/m;", "a", "(Landroidx/compose/ui/draw/g;)Landroidx/compose/ui/draw/m;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.foundation.text.selection.a$e$a, reason: collision with other inner class name */
        static final class C0153a extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.draw.g, androidx.compose.ui.draw.m> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ long f7914b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ ld.a<Boolean> f7915c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ boolean f7916d;

            /* compiled from: AndroidSelectionHandles.android.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/c;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/graphics/drawscope/c;)V"}, k = 3, mv = {1, 8, 0})
            @r1({"SMAP\nAndroidSelectionHandles.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidSelectionHandles.android.kt\nandroidx/compose/foundation/text/selection/AndroidSelectionHandles_androidKt$drawSelectionHandle$1$1$1$1\n+ 2 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,327:1\n174#2,6:328\n262#2,11:334\n*S KotlinDebug\n*F\n+ 1 AndroidSelectionHandles.android.kt\nandroidx/compose/foundation/text/selection/AndroidSelectionHandles_androidKt$drawSelectionHandle$1$1$1$1\n*L\n121#1:328,6\n121#1:334,11\n*E\n"})
            /* renamed from: androidx.compose.foundation.text.selection.a$e$a$a, reason: collision with other inner class name */
            static final class C0154a extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.graphics.drawscope.c, k2> {

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ ld.a<Boolean> f7917b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ boolean f7918c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ s4 f7919d;

                /* renamed from: e, reason: collision with root package name */
                final /* synthetic */ e2 f7920e;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0154a(ld.a<Boolean> aVar, boolean z4, s4 s4Var, e2 e2Var) {
                    super(1);
                    this.f7917b = aVar;
                    this.f7918c = z4;
                    this.f7919d = s4Var;
                    this.f7920e = e2Var;
                }

                public final void a(@fg.l androidx.compose.ui.graphics.drawscope.c cVar) {
                    cVar.G6();
                    if (this.f7917b.invoke().booleanValue()) {
                        if (!this.f7918c) {
                            androidx.compose.ui.graphics.drawscope.f.E3(cVar, this.f7919d, 0L, 0.0f, null, this.f7920e, 0, 46, null);
                            return;
                        }
                        s4 s4Var = this.f7919d;
                        e2 e2Var = this.f7920e;
                        long c02 = cVar.c0();
                        androidx.compose.ui.graphics.drawscope.d drawContext = cVar.getDrawContext();
                        long e4 = drawContext.e();
                        drawContext.i().C();
                        drawContext.getTransform().i(-1.0f, 1.0f, c02);
                        androidx.compose.ui.graphics.drawscope.f.E3(cVar, s4Var, 0L, 0.0f, null, e2Var, 0, 46, null);
                        drawContext.i().o();
                        drawContext.j(e4);
                    }
                }

                @Override // ld.l
                public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.ui.graphics.drawscope.c cVar) {
                    a(cVar);
                    return k2.f75408a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0153a(long j4, ld.a<Boolean> aVar, boolean z4) {
                super(1);
                this.f7914b = j4;
                this.f7915c = aVar;
                this.f7916d = z4;
            }

            @Override // ld.l
            @fg.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final androidx.compose.ui.draw.m invoke(@fg.l androidx.compose.ui.draw.g gVar) {
                return gVar.p(new C0154a(this.f7915c, this.f7916d, a.d(gVar, i0.n.t(gVar.e()) / 2.0f), e2.Companion.d(e2.INSTANCE, this.f7914b, 0, 2, null)));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(ld.a<Boolean> aVar, boolean z4) {
            super(3);
            this.f7912b = aVar;
            this.f7913c = z4;
        }

        @Override // ld.q
        public /* bridge */ /* synthetic */ androidx.compose.ui.q R(androidx.compose.ui.q qVar, androidx.compose.runtime.t tVar, Integer num) {
            return a(qVar, tVar, num.intValue());
        }

        @fg.l
        @androidx.compose.runtime.i
        public final androidx.compose.ui.q a(@fg.l androidx.compose.ui.q qVar, @fg.m androidx.compose.runtime.t tVar, int i4) {
            tVar.P(-196777734);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(-196777734, i4, -1, "androidx.compose.foundation.text.selection.drawSelectionHandle.<anonymous> (AndroidSelectionHandles.android.kt:110)");
            }
            long handleColor = ((x0) tVar.x(y0.c())).getHandleColor();
            tVar.P(-433018279);
            boolean g4 = tVar.g(handleColor) | tVar.S(this.f7912b) | tVar.b(this.f7913c);
            ld.a<Boolean> aVar = this.f7912b;
            boolean z4 = this.f7913c;
            Object Q = tVar.Q();
            if (g4 || Q == androidx.compose.runtime.t.INSTANCE.a()) {
                Q = new C0153a(handleColor, aVar, z4);
                tVar.E(Q);
            }
            tVar.p0();
            androidx.compose.ui.q c5 = androidx.compose.ui.draw.l.c(qVar, (ld.l) Q);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
            tVar.p0();
            return c5;
        }
    }

    @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.i
    public static final void a(@fg.l n nVar, @fg.l i iVar, @fg.l ld.p<? super androidx.compose.runtime.t, ? super Integer, k2> pVar, @fg.m androidx.compose.runtime.t tVar, int i4) {
        int i5;
        androidx.compose.runtime.t o4 = tVar.o(345017889);
        if ((i4 & 14) == 0) {
            i5 = (o4.q0(nVar) ? 4 : 2) | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 112) == 0) {
            i5 |= o4.q0(iVar) ? 32 : 16;
        }
        if ((i4 & 896) == 0) {
            i5 |= o4.S(pVar) ? 256 : 128;
        }
        if ((i5 & 731) == 146 && o4.p()) {
            o4.d0();
        } else {
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(345017889, i5, -1, "androidx.compose.foundation.text.selection.HandlePopup (AndroidSelectionHandles.android.kt:223)");
            }
            int i6 = i5 << 3;
            o4.P(511388516);
            boolean q02 = o4.q0(iVar) | o4.q0(nVar);
            Object Q = o4.Q();
            if (q02 || Q == androidx.compose.runtime.t.INSTANCE.a()) {
                Q = new h(iVar, nVar);
                o4.E(Q);
            }
            o4.p0();
            androidx.compose.ui.window.c.a((h) Q, null, new androidx.compose.ui.window.p(false, false, false, null, true, false, 15, null), pVar, o4, (i6 & 7168) | 384, 2);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }
        t3 t4 = o4.t();
        if (t4 != null) {
            t4.a(new C0149a(nVar, iVar, pVar, i4));
        }
    }

    @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.i
    public static final void b(@fg.l n nVar, boolean z4, @fg.l androidx.compose.ui.text.style.i iVar, boolean z5, @fg.l androidx.compose.ui.q qVar, @fg.m androidx.compose.runtime.t tVar, int i4) {
        int i5;
        androidx.compose.runtime.t o4 = tVar.o(-626955031);
        if ((i4 & 14) == 0) {
            i5 = (o4.q0(nVar) ? 4 : 2) | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 112) == 0) {
            i5 |= o4.b(z4) ? 32 : 16;
        }
        if ((i4 & 896) == 0) {
            i5 |= o4.q0(iVar) ? 256 : 128;
        }
        if ((i4 & 7168) == 0) {
            i5 |= o4.b(z5) ? 2048 : 1024;
        }
        if ((57344 & i4) == 0) {
            i5 |= o4.q0(qVar) ? 16384 : 8192;
        }
        int i6 = i5;
        if ((46811 & i6) == 9362 && o4.p()) {
            o4.d0();
        } else {
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(-626955031, i6, -1, "androidx.compose.foundation.text.selection.SelectionHandle (AndroidSelectionHandles.android.kt:66)");
            }
            boolean g4 = g(z4, iVar, z5);
            a(nVar, g4 ? i.TopRight : i.TopLeft, androidx.compose.runtime.internal.c.b(o4, 1868300064, true, new b((s5) o4.x(h1.v()), qVar, g4, nVar, z4)), o4, (i6 & 14) | 384);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }
        t3 t4 = o4.t();
        if (t4 != null) {
            t4.a(new c(nVar, z4, iVar, z5, qVar, i4));
        }
    }

    @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.i
    public static final void c(@fg.l androidx.compose.ui.q qVar, @fg.l ld.a<Boolean> aVar, boolean z4, @fg.m androidx.compose.runtime.t tVar, int i4) {
        int i5;
        androidx.compose.runtime.t o4 = tVar.o(2111672474);
        if ((i4 & 14) == 0) {
            i5 = (o4.q0(qVar) ? 4 : 2) | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 112) == 0) {
            i5 |= o4.S(aVar) ? 32 : 16;
        }
        if ((i4 & 896) == 0) {
            i5 |= o4.b(z4) ? 256 : 128;
        }
        if ((i5 & 731) == 146 && o4.p()) {
            o4.d0();
        } else {
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(2111672474, i5, -1, "androidx.compose.foundation.text.selection.SelectionHandleIcon (AndroidSelectionHandles.android.kt:98)");
            }
            f2.a(e(c2.y(qVar, c0.c(), c0.b()), aVar, z4), o4, 0);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }
        t3 t4 = o4.t();
        if (t4 != null) {
            t4.a(new d(qVar, aVar, z4, i4));
        }
    }

    @fg.l
    public static final s4 d(@fg.l androidx.compose.ui.draw.g gVar, float f4) {
        int ceil = ((int) Math.ceil(f4)) * 2;
        g gVar2 = g.f7958a;
        s4 c5 = gVar2.c();
        v1 a5 = gVar2.a();
        androidx.compose.ui.graphics.drawscope.a b5 = gVar2.b();
        if (c5 == null || a5 == null || ceil > c5.getWidth() || ceil > c5.getHeight()) {
            t4.INSTANCE.getClass();
            c5 = u4.b(ceil, ceil, t4.f18043d, false, null, 24, null);
            gVar2.f(c5);
            a5 = androidx.compose.ui.graphics.h0.a(c5);
            gVar2.d(a5);
        }
        s4 s4Var = c5;
        v1 v1Var = a5;
        if (b5 == null) {
            b5 = new androidx.compose.ui.graphics.drawscope.a();
            gVar2.e(b5);
        }
        androidx.compose.ui.graphics.drawscope.a aVar = b5;
        androidx.compose.ui.unit.w layoutDirection = gVar.getLayoutDirection();
        long a6 = i0.o.a(s4Var.getWidth(), s4Var.getHeight());
        a.C0331a drawParams = aVar.getDrawParams();
        androidx.compose.ui.unit.d density = drawParams.getDensity();
        androidx.compose.ui.unit.w layoutDirection2 = drawParams.getLayoutDirection();
        v1 canvas = drawParams.getCanvas();
        long size = drawParams.getSize();
        a.C0331a drawParams2 = aVar.getDrawParams();
        drawParams2.l(gVar);
        drawParams2.m(layoutDirection);
        drawParams2.k(v1Var);
        drawParams2.n(a6);
        v1Var.C();
        d2.INSTANCE.getClass();
        long j4 = d2.f17766c;
        long e4 = aVar.e();
        k1.INSTANCE.getClass();
        androidx.compose.ui.graphics.drawscope.f.t5(aVar, j4, 0L, e4, 0.0f, null, null, k1.f17874c, 58, null);
        long d5 = androidx.compose.ui.graphics.f2.d(4278190080L);
        i0.f.INSTANCE.getClass();
        androidx.compose.ui.graphics.drawscope.f.t5(aVar, d5, i0.f.f74147c, i0.o.a(f4, f4), 0.0f, null, null, 0, 120, null);
        androidx.compose.ui.graphics.drawscope.f.u6(aVar, androidx.compose.ui.graphics.f2.d(4278190080L), f4, i0.g.a(f4, f4), 0.0f, null, null, 0, 120, null);
        v1Var.o();
        a.C0331a drawParams3 = aVar.getDrawParams();
        drawParams3.l(density);
        drawParams3.m(layoutDirection2);
        drawParams3.k(canvas);
        drawParams3.n(size);
        return s4Var;
    }

    @fg.l
    public static final androidx.compose.ui.q e(@fg.l androidx.compose.ui.q qVar, @fg.l ld.a<Boolean> aVar, boolean z4) {
        return androidx.compose.ui.i.j(qVar, null, new e(aVar, z4), 1, null);
    }

    public static final boolean f(@fg.l androidx.compose.ui.text.style.i iVar, boolean z4) {
        return (iVar == androidx.compose.ui.text.style.i.Ltr && !z4) || (iVar == androidx.compose.ui.text.style.i.Rtl && z4);
    }

    public static final boolean g(boolean z4, @fg.l androidx.compose.ui.text.style.i iVar, boolean z5) {
        return z4 ? f(iVar, z5) : !f(iVar, z5);
    }
}
