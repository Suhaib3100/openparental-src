package androidx.compose.material3;

import androidx.compose.animation.core.e2;
import kotlin.Metadata;

/* compiled from: Checkbox.kt */
@Metadata(d1 = {"\u0000`\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\u001aU\u0010\f\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\f\u0010\r\u001aO\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000e2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00102\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001a/\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0003¢\u0006\u0004\b\u0015\u0010\u0016\u001a6\u0010\u001e\u001a\u00020\u0003*\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001bH\u0002ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u001a>\u0010&\u001a\u00020\u0003*\u00020\u00172\u0006\u0010 \u001a\u00020\u00182\u0006\u0010!\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020\u001b2\u0006\u0010#\u001a\u00020\u001b2\u0006\u0010%\u001a\u00020$H\u0002ø\u0001\u0000¢\u0006\u0004\b&\u0010'\"\u0014\u0010*\u001a\u00020(8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010)\"\u0014\u0010+\u001a\u00020(8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010)\"\u0014\u0010,\u001a\u00020(8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010)\"\u0014\u00100\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/\"\u0014\u00102\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010/\"\u0014\u00104\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010/\"\u0014\u00106\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010/\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00067"}, d2 = {"", "checked", "Lkotlin/Function1;", "Lkotlin/k2;", "onCheckedChange", "Landroidx/compose/ui/q;", "modifier", "enabled", "Landroidx/compose/material3/r2;", "colors", "Landroidx/compose/foundation/interaction/k;", "interactionSource", "a", "(ZLld/l;Landroidx/compose/ui/q;ZLandroidx/compose/material3/r2;Landroidx/compose/foundation/interaction/k;Landroidx/compose/runtime/t;II)V", "Lp0/a;", "state", "Lkotlin/Function0;", "onClick", "c", "(Lp0/a;Lld/a;Landroidx/compose/ui/q;ZLandroidx/compose/material3/r2;Landroidx/compose/foundation/interaction/k;Landroidx/compose/runtime/t;II)V", "value", "b", "(ZLp0/a;Landroidx/compose/ui/q;Landroidx/compose/material3/r2;Landroidx/compose/runtime/t;I)V", "Landroidx/compose/ui/graphics/drawscope/f;", "Landroidx/compose/ui/graphics/d2;", "boxColor", "borderColor", "", "radius", "strokeWidth", "i", "(Landroidx/compose/ui/graphics/drawscope/f;JJFF)V", "checkColor", "checkFraction", "crossCenterGravitation", "strokeWidthPx", "Landroidx/compose/material3/q2;", "drawingCache", "j", "(Landroidx/compose/ui/graphics/drawscope/f;JFFFLandroidx/compose/material3/q2;)V", "", "I", "BoxInDuration", "BoxOutDuration", "CheckAnimationDuration", "Landroidx/compose/ui/unit/h;", "d", "F", "CheckboxDefaultPadding", "e", "CheckboxSize", "f", "StrokeWidth", "g", "RadiusSize", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nCheckbox.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Checkbox.kt\nandroidx/compose/material3/CheckboxKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 4 Transition.kt\nandroidx/compose/animation/core/TransitionKt\n+ 5 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,597:1\n1116#2,6:598\n1116#2,6:604\n1116#2,6:610\n1116#2,6:635\n1116#2,6:641\n75#3:616\n1163#4,4:617\n1083#4,5:621\n1163#4,4:626\n1083#4,5:630\n154#5:647\n154#5:648\n154#5:649\n154#5:650\n*S KotlinDebug\n*F\n+ 1 Checkbox.kt\nandroidx/compose/material3/CheckboxKt\n*L\n94#1:598,6\n99#1:604,6\n144#1:610,6\n297#1:635,6\n305#1:641,6\n157#1:616\n266#1:617,4\n266#1:621,5\n282#1:626,4\n282#1:630,5\n593#1:647\n594#1:648\n595#1:649\n596#1:650\n*E\n"})
/* loaded from: classes.dex */
public final class t2 {

    /* renamed from: a, reason: collision with root package name */
    private static final int f14523a = 50;

    /* renamed from: b, reason: collision with root package name */
    private static final int f14524b = 100;

    /* renamed from: c, reason: collision with root package name */
    private static final int f14525c = 100;

    /* renamed from: d, reason: collision with root package name */
    private static final float f14526d;

    /* renamed from: e, reason: collision with root package name */
    private static final float f14527e = 20;

    /* renamed from: f, reason: collision with root package name */
    private static final float f14528f;

    /* renamed from: g, reason: collision with root package name */
    private static final float f14529g;

    /* compiled from: Checkbox.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.jvm.internal.n0 implements ld.a<kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.l<Boolean, kotlin.k2> f14530b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f14531c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(ld.l<? super Boolean, kotlin.k2> lVar, boolean z4) {
            super(0);
            this.f14530b = lVar;
            this.f14531c = z4;
        }

        public final void a() {
            this.f14530b.invoke(Boolean.valueOf(!this.f14531c));
        }

        @Override // ld.a
        public /* bridge */ /* synthetic */ kotlin.k2 invoke() {
            a();
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: Checkbox.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class b extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f14532b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.l<Boolean, kotlin.k2> f14533c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f14534d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f14535e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ r2 f14536f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.k f14537g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f14538h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f14539i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(boolean z4, ld.l<? super Boolean, kotlin.k2> lVar, androidx.compose.ui.q qVar, boolean z5, r2 r2Var, androidx.compose.foundation.interaction.k kVar, int i4, int i5) {
            super(2);
            this.f14532b = z4;
            this.f14533c = lVar;
            this.f14534d = qVar;
            this.f14535e = z5;
            this.f14536f = r2Var;
            this.f14537g = kVar;
            this.f14538h = i4;
            this.f14539i = i5;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            t2.a(this.f14532b, this.f14533c, this.f14534d, this.f14535e, this.f14536f, this.f14537g, tVar, androidx.compose.runtime.g3.b(this.f14538h | 1), this.f14539i);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: Checkbox.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/f;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/graphics/drawscope/f;)V"}, k = 3, mv = {1, 8, 0})
    static final class c extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.graphics.drawscope.f, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.b5<androidx.compose.ui.graphics.d2> f14540b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.b5<androidx.compose.ui.graphics.d2> f14541c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.b5<androidx.compose.ui.graphics.d2> f14542d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.b5<Float> f14543e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.b5<Float> f14544f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ q2 f14545g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(androidx.compose.runtime.b5<androidx.compose.ui.graphics.d2> b5Var, androidx.compose.runtime.b5<androidx.compose.ui.graphics.d2> b5Var2, androidx.compose.runtime.b5<androidx.compose.ui.graphics.d2> b5Var3, androidx.compose.runtime.b5<Float> b5Var4, androidx.compose.runtime.b5<Float> b5Var5, q2 q2Var) {
            super(1);
            this.f14540b = b5Var;
            this.f14541c = b5Var2;
            this.f14542d = b5Var3;
            this.f14543e = b5Var4;
            this.f14544f = b5Var5;
            this.f14545g = q2Var;
        }

        public final void a(@fg.l androidx.compose.ui.graphics.drawscope.f fVar) {
            float floor = (float) Math.floor(fVar.v5(t2.f14528f));
            t2.i(fVar, this.f14540b.getValue().M(), this.f14541c.getValue().M(), fVar.v5(t2.f14529g), floor);
            t2.j(fVar, this.f14542d.getValue().M(), this.f14543e.getValue().floatValue(), this.f14544f.getValue().floatValue(), floor, this.f14545g);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.ui.graphics.drawscope.f fVar) {
            a(fVar);
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: Checkbox.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class d extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f14546b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ p0.a f14547c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f14548d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ r2 f14549e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f14550f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(boolean z4, p0.a aVar, androidx.compose.ui.q qVar, r2 r2Var, int i4) {
            super(2);
            this.f14546b = z4;
            this.f14547c = aVar;
            this.f14548d = qVar;
            this.f14549e = r2Var;
            this.f14550f = i4;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            t2.b(this.f14546b, this.f14547c, this.f14548d, this.f14549e, tVar, androidx.compose.runtime.g3.b(this.f14550f | 1));
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: Checkbox.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/animation/core/e2$b;", "Lp0/a;", "Landroidx/compose/animation/core/p0;", "", "a", "(Landroidx/compose/animation/core/e2$b;Landroidx/compose/runtime/t;I)Landroidx/compose/animation/core/p0;"}, k = 3, mv = {1, 8, 0})
    static final class e extends kotlin.jvm.internal.n0 implements ld.q<e2.b<p0.a>, androidx.compose.runtime.t, Integer, androidx.compose.animation.core.p0<Float>> {

        /* renamed from: b, reason: collision with root package name */
        public static final e f14551b = new e(3);

        e() {
            super(3);
        }

        @Override // ld.q
        public /* bridge */ /* synthetic */ androidx.compose.animation.core.p0<Float> R(e2.b<p0.a> bVar, androidx.compose.runtime.t tVar, Integer num) {
            return a(bVar, tVar, num.intValue());
        }

        @fg.l
        @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
        @androidx.compose.runtime.i
        public final androidx.compose.animation.core.p0<Float> a(@fg.l e2.b<p0.a> bVar, @fg.m androidx.compose.runtime.t tVar, int i4) {
            tVar.P(-1324481169);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(-1324481169, i4, -1, "androidx.compose.material3.CheckboxImpl.<anonymous> (Checkbox.kt:283)");
            }
            p0.a i5 = bVar.i();
            p0.a aVar = p0.a.Off;
            androidx.compose.animation.core.p0<Float> n4 = i5 == aVar ? androidx.compose.animation.core.l.n(0, 1, null) : bVar.f() == aVar ? new androidx.compose.animation.core.t1<>(100) : androidx.compose.animation.core.l.r(100, 0, null, 6, null);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
            tVar.p0();
            return n4;
        }
    }

    /* compiled from: Checkbox.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/animation/core/e2$b;", "Lp0/a;", "Landroidx/compose/animation/core/p0;", "", "a", "(Landroidx/compose/animation/core/e2$b;Landroidx/compose/runtime/t;I)Landroidx/compose/animation/core/p0;"}, k = 3, mv = {1, 8, 0})
    static final class f extends kotlin.jvm.internal.n0 implements ld.q<e2.b<p0.a>, androidx.compose.runtime.t, Integer, androidx.compose.animation.core.p0<Float>> {

        /* renamed from: b, reason: collision with root package name */
        public static final f f14552b = new f(3);

        f() {
            super(3);
        }

        @Override // ld.q
        public /* bridge */ /* synthetic */ androidx.compose.animation.core.p0<Float> R(e2.b<p0.a> bVar, androidx.compose.runtime.t tVar, Integer num) {
            return a(bVar, tVar, num.intValue());
        }

        @fg.l
        @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
        @androidx.compose.runtime.i
        public final androidx.compose.animation.core.p0<Float> a(@fg.l e2.b<p0.a> bVar, @fg.m androidx.compose.runtime.t tVar, int i4) {
            tVar.P(1373301606);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(1373301606, i4, -1, "androidx.compose.material3.CheckboxImpl.<anonymous> (Checkbox.kt:267)");
            }
            p0.a i5 = bVar.i();
            p0.a aVar = p0.a.Off;
            androidx.compose.animation.core.p0<Float> r4 = i5 == aVar ? androidx.compose.animation.core.l.r(100, 0, null, 6, null) : bVar.f() == aVar ? new androidx.compose.animation.core.t1<>(100) : androidx.compose.animation.core.l.p(0.0f, 0.0f, null, 7, null);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
            tVar.p0();
            return r4;
        }
    }

    /* compiled from: Checkbox.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class g extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ p0.a f14553b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.a<kotlin.k2> f14554c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f14555d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f14556e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ r2 f14557f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.k f14558g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f14559h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f14560i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(p0.a aVar, ld.a<kotlin.k2> aVar2, androidx.compose.ui.q qVar, boolean z4, r2 r2Var, androidx.compose.foundation.interaction.k kVar, int i4, int i5) {
            super(2);
            this.f14553b = aVar;
            this.f14554c = aVar2;
            this.f14555d = qVar;
            this.f14556e = z4;
            this.f14557f = r2Var;
            this.f14558g = kVar;
            this.f14559h = i4;
            this.f14560i = i5;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            t2.c(this.f14553b, this.f14554c, this.f14555d, this.f14556e, this.f14557f, this.f14558g, tVar, androidx.compose.runtime.g3.b(this.f14559h | 1), this.f14560i);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: Checkbox.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class h {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14561a;

        static {
            int[] iArr = new int[p0.a.values().length];
            try {
                iArr[p0.a.On.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p0.a.Off.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[p0.a.Indeterminate.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f14561a = iArr;
        }
    }

    static {
        float f4 = 2;
        f14526d = androidx.compose.ui.unit.h.g(f4);
        f14528f = f4;
        f14529g = f4;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0062  */
    @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(boolean r19, @fg.m ld.l<? super java.lang.Boolean, kotlin.k2> r20, @fg.m androidx.compose.ui.q r21, boolean r22, @fg.m androidx.compose.material3.r2 r23, @fg.m androidx.compose.foundation.interaction.k r24, @fg.m androidx.compose.runtime.t r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 432
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.t2.a(boolean, ld.l, androidx.compose.ui.q, boolean, androidx.compose.material3.r2, androidx.compose.foundation.interaction.k, androidx.compose.runtime.t, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x027c  */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v4 */
    @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(boolean r37, p0.a r38, androidx.compose.ui.q r39, androidx.compose.material3.r2 r40, androidx.compose.runtime.t r41, int r42) {
        /*
            Method dump skipped, instructions count: 705
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.t2.b(boolean, p0.a, androidx.compose.ui.q, androidx.compose.material3.r2, androidx.compose.runtime.t, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0064  */
    @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(@fg.l p0.a r19, @fg.m ld.a<kotlin.k2> r20, @fg.m androidx.compose.ui.q r21, boolean r22, @fg.m androidx.compose.material3.r2 r23, @fg.m androidx.compose.foundation.interaction.k r24, @fg.m androidx.compose.runtime.t r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 480
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.t2.c(p0.a, ld.a, androidx.compose.ui.q, boolean, androidx.compose.material3.r2, androidx.compose.foundation.interaction.k, androidx.compose.runtime.t, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(androidx.compose.ui.graphics.drawscope.f fVar, long j4, long j5, float f4, float f5) {
        float f6 = f5 / 2.0f;
        androidx.compose.ui.graphics.drawscope.n nVar = new androidx.compose.ui.graphics.drawscope.n(f5, 0.0f, 0, 0, null, 30, null);
        float t4 = i0.n.t(fVar.e());
        if (androidx.compose.ui.graphics.d2.y(j4, j5)) {
            androidx.compose.ui.graphics.drawscope.f.x6(fVar, j4, 0L, i0.o.a(t4, t4), i0.b.b(f4, 0.0f, 2, null), androidx.compose.ui.graphics.drawscope.m.f17797a, 0.0f, null, 0, 226, null);
            return;
        }
        float f7 = t4 - (2 * f5);
        androidx.compose.ui.graphics.drawscope.f.x6(fVar, j4, i0.g.a(f5, f5), i0.o.a(f7, f7), i0.b.b(Math.max(0.0f, f4 - f5), 0.0f, 2, null), androidx.compose.ui.graphics.drawscope.m.f17797a, 0.0f, null, 0, 224, null);
        float f10 = t4 - f5;
        androidx.compose.ui.graphics.drawscope.f.x6(fVar, j5, i0.g.a(f6, f6), i0.o.a(f10, f10), i0.b.b(f4 - f6, 0.0f, 2, null), nVar, 0.0f, null, 0, 224, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(androidx.compose.ui.graphics.drawscope.f fVar, long j4, float f4, float f5, float f6, q2 q2Var) {
        androidx.compose.ui.graphics.i6.INSTANCE.getClass();
        androidx.compose.ui.graphics.drawscope.n nVar = new androidx.compose.ui.graphics.drawscope.n(f6, 0.0f, androidx.compose.ui.graphics.i6.f17863e, 0, null, 26, null);
        float t4 = i0.n.t(fVar.e());
        float a5 = androidx.compose.ui.util.d.a(0.4f, 0.5f, f5);
        float a6 = androidx.compose.ui.util.d.a(0.7f, 0.5f, f5);
        float a7 = androidx.compose.ui.util.d.a(0.5f, 0.5f, f5);
        float a8 = androidx.compose.ui.util.d.a(0.3f, 0.5f, f5);
        q2Var.getCheckPath().reset();
        q2Var.getCheckPath().s(0.2f * t4, a7 * t4);
        q2Var.getCheckPath().z(a5 * t4, a6 * t4);
        q2Var.getCheckPath().z(0.8f * t4, t4 * a8);
        q2Var.getPathMeasure().c(q2Var.getCheckPath(), false);
        q2Var.getPathToDraw().reset();
        q2Var.getPathMeasure().b(0.0f, q2Var.getPathMeasure().getLength() * f4, q2Var.getPathToDraw(), true);
        androidx.compose.ui.graphics.drawscope.f.N1(fVar, q2Var.getPathToDraw(), j4, 0.0f, nVar, null, 0, 52, null);
    }
}
