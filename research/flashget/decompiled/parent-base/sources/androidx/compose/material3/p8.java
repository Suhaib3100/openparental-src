package androidx.compose.material3;

import androidx.compose.foundation.interaction.d;
import androidx.compose.foundation.interaction.m;
import androidx.compose.foundation.layout.i;
import androidx.compose.runtime.t;
import androidx.compose.ui.c;
import androidx.compose.ui.layout.i1;
import androidx.compose.ui.node.g;
import java.util.List;
import kotlin.Metadata;

/* compiled from: SegmentedButton.kt */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0004\u001a\u0091\u0001\u0010\u0015\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00012\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\u0013\b\u0002\u0010\u0013\u001a\r\u0012\u0004\u0012\u00020\u00040\u0011¢\u0006\u0002\b\u00122\u0011\u0010\u0014\u001a\r\u0012\u0004\u0012\u00020\u00040\u0011¢\u0006\u0002\b\u0012H\u0007¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u008b\u0001\u0010\u001a\u001a\u00020\u0004*\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u00112\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00012\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\u0013\b\u0002\u0010\u0013\u001a\r\u0012\u0004\u0012\u00020\u00040\u0011¢\u0006\u0002\b\u00122\u0011\u0010\u0014\u001a\r\u0012\u0004\u0012\u00020\u00040\u0011¢\u0006\u0002\b\u0012H\u0007¢\u0006\u0004\b\u001a\u0010\u001b\u001aD\u0010 \u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\u001c\u0010\u001f\u001a\u0018\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u0012¢\u0006\u0002\b\u001eH\u0007ø\u0001\u0000¢\u0006\u0004\b \u0010!\u001aD\u0010\"\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\u001c\u0010\u001f\u001a\u0018\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u0012¢\u0006\u0002\b\u001eH\u0007ø\u0001\u0000¢\u0006\u0004\b\"\u0010!\u001a5\u0010#\u001a\u00020\u00042\u0011\u0010\u0013\u001a\r\u0012\u0004\u0012\u00020\u00040\u0011¢\u0006\u0002\b\u00122\u0011\u0010\u001f\u001a\r\u0012\u0004\u0012\u00020\u00040\u0011¢\u0006\u0002\b\u0012H\u0003¢\u0006\u0004\b#\u0010$\u001a\u0019\u0010(\u001a\b\u0012\u0004\u0012\u00020'0&*\u00020%H\u0003¢\u0006\u0004\b(\u0010)\u001a)\u0010+\u001a\u00020\b*\u00020\b2\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010*\u001a\b\u0012\u0004\u0012\u00020'0&H\u0002¢\u0006\u0004\b+\u0010,\"\u0014\u0010/\u001a\u00020-8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\"\u0010.\"\u0014\u00100\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010.\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00061"}, d2 = {"Landroidx/compose/material3/c7;", "", "checked", "Lkotlin/Function1;", "Lkotlin/k2;", "onCheckedChange", "Landroidx/compose/ui/graphics/e6;", "shape", "Landroidx/compose/ui/q;", "modifier", "enabled", "Landroidx/compose/material3/m8;", "colors", "Landroidx/compose/foundation/c0;", "border", "Landroidx/compose/foundation/interaction/k;", "interactionSource", "Lkotlin/Function0;", "Landroidx/compose/runtime/i;", "icon", "label", "b", "(Landroidx/compose/material3/c7;ZLld/l;Landroidx/compose/ui/graphics/e6;Landroidx/compose/ui/q;ZLandroidx/compose/material3/m8;Landroidx/compose/foundation/c0;Landroidx/compose/foundation/interaction/k;Lld/p;Lld/p;Landroidx/compose/runtime/t;III)V", "Landroidx/compose/material3/b9;", "selected", "onClick", "c", "(Landroidx/compose/material3/b9;ZLld/a;Landroidx/compose/ui/graphics/e6;Landroidx/compose/ui/q;ZLandroidx/compose/material3/m8;Landroidx/compose/foundation/c0;Landroidx/compose/foundation/interaction/k;Lld/p;Lld/p;Landroidx/compose/runtime/t;III)V", "Landroidx/compose/ui/unit/h;", "space", "Lkotlin/u;", "content", "e", "(Landroidx/compose/ui/q;FLld/q;Landroidx/compose/runtime/t;II)V", "a", "d", "(Lld/p;Lld/p;Landroidx/compose/runtime/t;I)V", "Landroidx/compose/foundation/interaction/i;", "Landroidx/compose/runtime/b5;", "", "h", "(Landroidx/compose/foundation/interaction/i;Landroidx/compose/runtime/t;I)Landroidx/compose/runtime/b5;", "interactionCount", "i", "(Landroidx/compose/ui/q;ZLandroidx/compose/runtime/b5;)Landroidx/compose/ui/q;", "", "F", "CheckedZIndexFactor", "IconSpacing", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nSegmentedButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SegmentedButton.kt\nandroidx/compose/material3/SegmentedButtonKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 4 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 9 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,786:1\n1116#2,6:787\n1116#2,6:793\n1116#2,6:831\n1116#2,6:874\n1116#2,6:924\n1116#2,6:930\n64#3:799\n64#3:842\n91#4,2:800\n93#4:830\n97#4:841\n91#4,2:843\n93#4:873\n97#4:884\n78#5,11:802\n91#5:840\n78#5,11:845\n91#5:883\n78#5,11:890\n91#5:922\n456#6,8:813\n464#6,3:827\n467#6,3:837\n456#6,8:856\n464#6,3:870\n467#6,3:880\n456#6,8:901\n464#6,3:915\n467#6,3:919\n3737#7,6:821\n3737#7,6:864\n3737#7,6:909\n69#8,5:885\n74#8:918\n78#8:923\n154#9:936\n*S KotlinDebug\n*F\n+ 1 SegmentedButton.kt\nandroidx/compose/material3/SegmentedButtonKt\n*L\n139#1:787,6\n214#1:793,6\n275#1:831,6\n312#1:874,6\n400#1:924,6\n401#1:930,6\n272#1:799\n309#1:842\n267#1:800,2\n267#1:830\n267#1:841\n305#1:843,2\n305#1:873\n305#1:884\n267#1:802,11\n267#1:840\n305#1:845,11\n305#1:883\n323#1:890,11\n323#1:922\n267#1:813,8\n267#1:827,3\n267#1:837,3\n305#1:856,8\n305#1:870,3\n305#1:880,3\n323#1:901,8\n323#1:915,3\n323#1:919,3\n267#1:821,6\n305#1:864,6\n323#1:909,6\n323#1:885,5\n323#1:918\n323#1:923\n777#1:936\n*E\n"})
/* loaded from: classes.dex */
public final class p8 {

    /* renamed from: a, reason: collision with root package name */
    private static final float f13318a = 5.0f;

    /* renamed from: b, reason: collision with root package name */
    private static final float f13319b = androidx.compose.ui.unit.h.g(8);

    /* compiled from: SegmentedButton.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class a extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f13320b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f13321c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ld.q<c7, androidx.compose.runtime.t, Integer, kotlin.k2> f13322d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f13323e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f13324f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(androidx.compose.ui.q qVar, float f4, ld.q<? super c7, ? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> qVar2, int i4, int i5) {
            super(2);
            this.f13320b = qVar;
            this.f13321c = f4;
            this.f13322d = qVar2;
            this.f13323e = i4;
            this.f13324f = i5;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            p8.a(this.f13320b, this.f13321c, this.f13322d, tVar, androidx.compose.runtime.g3.b(this.f13323e | 1), this.f13324f);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: SegmentedButton.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class b extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f13325b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(boolean z4) {
            super(2);
            this.f13325b = z4;
        }

        @androidx.compose.runtime.i
        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            if ((i4 & 3) == 2 && tVar.p()) {
                tVar.d0();
                return;
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(970447394, i4, -1, "androidx.compose.material3.SegmentedButton.<anonymous> (SegmentedButton.kt:139)");
            }
            o8.f12930a.b(this.f13325b, null, null, tVar, 3072, 6);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: SegmentedButton.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
    static final class c extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f13326b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f13327c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar2) {
            super(2);
            this.f13326b = pVar;
            this.f13327c = pVar2;
        }

        @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
        @androidx.compose.runtime.i
        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            if ((i4 & 3) == 2 && tVar.p()) {
                tVar.d0();
                return;
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(1635710341, i4, -1, "androidx.compose.material3.SegmentedButton.<anonymous> (SegmentedButton.kt:163)");
            }
            p8.d(this.f13326b, this.f13327c, tVar, 0);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: SegmentedButton.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class d extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ c7 f13328b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f13329c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ld.l<Boolean, kotlin.k2> f13330d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.graphics.e6 f13331e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f13332f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f13333g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ m8 f13334h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.c0 f13335i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.k f13336j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f13337k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f13338l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ int f13339m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ int f13340n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ int f13341o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(c7 c7Var, boolean z4, ld.l<? super Boolean, kotlin.k2> lVar, androidx.compose.ui.graphics.e6 e6Var, androidx.compose.ui.q qVar, boolean z5, m8 m8Var, androidx.compose.foundation.c0 c0Var, androidx.compose.foundation.interaction.k kVar, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar2, int i4, int i5, int i6) {
            super(2);
            this.f13328b = c7Var;
            this.f13329c = z4;
            this.f13330d = lVar;
            this.f13331e = e6Var;
            this.f13332f = qVar;
            this.f13333g = z5;
            this.f13334h = m8Var;
            this.f13335i = c0Var;
            this.f13336j = kVar;
            this.f13337k = pVar;
            this.f13338l = pVar2;
            this.f13339m = i4;
            this.f13340n = i5;
            this.f13341o = i6;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            p8.b(this.f13328b, this.f13329c, this.f13330d, this.f13331e, this.f13332f, this.f13333g, this.f13334h, this.f13335i, this.f13336j, this.f13337k, this.f13338l, tVar, androidx.compose.runtime.g3.b(this.f13339m | 1), androidx.compose.runtime.g3.b(this.f13340n), this.f13341o);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: SegmentedButton.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class e extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f13342b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(boolean z4) {
            super(2);
            this.f13342b = z4;
        }

        @androidx.compose.runtime.i
        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            if ((i4 & 3) == 2 && tVar.p()) {
                tVar.d0();
                return;
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(1235063168, i4, -1, "androidx.compose.material3.SegmentedButton.<anonymous> (SegmentedButton.kt:214)");
            }
            o8.f12930a.b(this.f13342b, null, null, tVar, 3072, 6);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: SegmentedButton.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/semantics/z;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/semantics/z;)V"}, k = 3, mv = {1, 8, 0})
    static final class f extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.semantics.z, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final f f13343b = new f(1);

        f() {
            super(1);
        }

        public final void a(@fg.l androidx.compose.ui.semantics.z zVar) {
            androidx.compose.ui.semantics.i.INSTANCE.getClass();
            androidx.compose.ui.semantics.w.l1(zVar, androidx.compose.ui.semantics.i.f20312f);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.ui.semantics.z zVar) {
            a(zVar);
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: SegmentedButton.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
    static final class g extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f13344b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f13345c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        g(ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar2) {
            super(2);
            this.f13344b = pVar;
            this.f13345c = pVar2;
        }

        @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
        @androidx.compose.runtime.i
        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            if ((i4 & 3) == 2 && tVar.p()) {
                tVar.d0();
                return;
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(383378045, i4, -1, "androidx.compose.material3.SegmentedButton.<anonymous> (SegmentedButton.kt:239)");
            }
            p8.d(this.f13344b, this.f13345c, tVar, 0);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: SegmentedButton.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class h extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ b9 f13346b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f13347c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ld.a<kotlin.k2> f13348d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.graphics.e6 f13349e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f13350f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f13351g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ m8 f13352h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.c0 f13353i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.k f13354j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f13355k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f13356l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ int f13357m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ int f13358n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ int f13359o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        h(b9 b9Var, boolean z4, ld.a<kotlin.k2> aVar, androidx.compose.ui.graphics.e6 e6Var, androidx.compose.ui.q qVar, boolean z5, m8 m8Var, androidx.compose.foundation.c0 c0Var, androidx.compose.foundation.interaction.k kVar, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar2, int i4, int i5, int i6) {
            super(2);
            this.f13346b = b9Var;
            this.f13347c = z4;
            this.f13348d = aVar;
            this.f13349e = e6Var;
            this.f13350f = qVar;
            this.f13351g = z5;
            this.f13352h = m8Var;
            this.f13353i = c0Var;
            this.f13354j = kVar;
            this.f13355k = pVar;
            this.f13356l = pVar2;
            this.f13357m = i4;
            this.f13358n = i5;
            this.f13359o = i6;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            p8.c(this.f13346b, this.f13347c, this.f13348d, this.f13349e, this.f13350f, this.f13351g, this.f13352h, this.f13353i, this.f13354j, this.f13355k, this.f13356l, tVar, androidx.compose.runtime.g3.b(this.f13357m | 1), androidx.compose.runtime.g3.b(this.f13358n), this.f13359o);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: SegmentedButton.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nSegmentedButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SegmentedButton.kt\nandroidx/compose/material3/SegmentedButtonKt$SegmentedButtonContent$1$1\n+ 2 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,786:1\n487#2,4:787\n491#2,2:795\n495#2:801\n25#3:791\n36#3:811\n456#3,8:830\n464#3,6:844\n1116#4,3:792\n1119#4,3:798\n1116#4,6:802\n1116#4,6:812\n487#5:797\n170#6,3:808\n169#6:818\n78#6,11:819\n91#6:850\n174#6:851\n3737#7,6:838\n*S KotlinDebug\n*F\n+ 1 SegmentedButton.kt\nandroidx/compose/material3/SegmentedButtonKt$SegmentedButtonContent$1$1\n*L\n330#1:787,4\n330#1:795,2\n330#1:801\n330#1:791\n333#1:811\n333#1:830,8\n333#1:844,6\n330#1:792,3\n330#1:798,3\n331#1:802,6\n333#1:812,6\n330#1:797\n333#1:808,3\n333#1:818\n333#1:819,11\n333#1:850\n333#1:851\n333#1:838,6\n*E\n"})
    static final class i extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f13360b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f13361c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        i(ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar2) {
            super(2);
            this.f13360b = pVar;
            this.f13361c = pVar2;
        }

        @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
        @androidx.compose.runtime.i
        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            if ((i4 & 3) == 2 && tVar.p()) {
                tVar.d0();
                return;
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(1420592651, i4, -1, "androidx.compose.material3.SegmentedButtonContent.<anonymous>.<anonymous> (SegmentedButton.kt:329)");
            }
            Object a5 = androidx.compose.foundation.j.a(tVar, 773894976, -492369756);
            t.Companion companion = androidx.compose.runtime.t.INSTANCE;
            if (a5 == companion.a()) {
                a5 = androidx.view.compose.l.a(androidx.compose.runtime.a1.m(kotlin.coroutines.i.f75057b, tVar), tVar);
            }
            tVar.p0();
            kotlinx.coroutines.r0 coroutineScope = ((androidx.compose.runtime.j0) a5).getCoroutineScope();
            tVar.p0();
            tVar.P(-1468900584);
            Object Q = tVar.Q();
            if (Q == companion.a()) {
                Q = new n8(coroutineScope);
                tVar.E(Q);
            }
            n8 n8Var = (n8) Q;
            tVar.p0();
            androidx.compose.ui.q a6 = androidx.compose.foundation.layout.v0.a(androidx.compose.ui.q.INSTANCE, androidx.compose.foundation.layout.x0.Min);
            List O = kotlin.collections.w.O(this.f13360b, this.f13361c);
            tVar.P(1399185516);
            ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> e4 = androidx.compose.ui.layout.a0.e(O);
            tVar.P(1157296644);
            boolean q02 = tVar.q0(n8Var);
            Object Q2 = tVar.Q();
            if (q02 || Q2 == companion.a()) {
                Q2 = androidx.compose.ui.layout.t0.a(n8Var);
                tVar.E(Q2);
            }
            tVar.p0();
            androidx.compose.ui.layout.m0 m0Var = (androidx.compose.ui.layout.m0) Q2;
            tVar.P(-1323940314);
            int j4 = androidx.compose.runtime.p.j(tVar, 0);
            androidx.compose.runtime.g0 B = tVar.B();
            g.Companion companion2 = androidx.compose.ui.node.g.INSTANCE;
            ld.a<androidx.compose.ui.node.g> a7 = companion2.a();
            ld.q<androidx.compose.runtime.v3<androidx.compose.ui.node.g>, androidx.compose.runtime.t, Integer, kotlin.k2> g4 = androidx.compose.ui.layout.a0.g(a6);
            if (tVar.s() == null) {
                androidx.compose.runtime.p.n();
            }
            tVar.W();
            if (tVar.getInserting()) {
                tVar.F(a7);
            } else {
                tVar.C();
            }
            ld.p a8 = androidx.compose.animation.p.a(companion2, tVar, m0Var, tVar, B);
            if (tVar.getInserting() || !kotlin.jvm.internal.l0.g(tVar.Q(), Integer.valueOf(j4))) {
                androidx.compose.animation.d.a(j4, tVar, j4, a8);
            }
            androidx.compose.animation.e.a(0, g4, androidx.compose.runtime.v3.a(tVar), tVar, 2058660585);
            if (androidx.compose.foundation.x.a(0, e4, tVar)) {
                androidx.compose.runtime.x.q0();
            }
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: SegmentedButton.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class j extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f13362b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f13363c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f13364d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        j(ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar2, int i4) {
            super(2);
            this.f13362b = pVar;
            this.f13363c = pVar2;
            this.f13364d = i4;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            p8.d(this.f13362b, this.f13363c, tVar, androidx.compose.runtime.g3.b(this.f13364d | 1));
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: SegmentedButton.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class k extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f13365b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f13366c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ld.q<b9, androidx.compose.runtime.t, Integer, kotlin.k2> f13367d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f13368e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f13369f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        k(androidx.compose.ui.q qVar, float f4, ld.q<? super b9, ? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> qVar2, int i4, int i5) {
            super(2);
            this.f13365b = qVar;
            this.f13366c = f4;
            this.f13367d = qVar2;
            this.f13368e = i4;
            this.f13369f = i5;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            p8.e(this.f13365b, this.f13366c, this.f13367d, tVar, androidx.compose.runtime.g3.b(this.f13368e | 1), this.f13369f);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: SegmentedButton.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.SegmentedButtonKt$interactionCountAsState$1$1", f = "SegmentedButton.kt", i = {}, l = {402}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
    static final class l extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super kotlin.k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f13370b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.i f13371c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.i2 f13372d;

        /* compiled from: SegmentedButton.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/foundation/interaction/h;", "interaction", "Lkotlin/k2;", "a", "(Landroidx/compose/foundation/interaction/h;Lkotlin/coroutines/d;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
        static final class a<T> implements kotlinx.coroutines.flow.j {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ androidx.compose.runtime.i2 f13373b;

            a(androidx.compose.runtime.i2 i2Var) {
                this.f13373b = i2Var;
            }

            @Override // kotlinx.coroutines.flow.j
            @fg.m
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(@fg.l androidx.compose.foundation.interaction.h hVar, @fg.l kotlin.coroutines.d<? super kotlin.k2> dVar) {
                if (hVar instanceof m.b ? true : hVar instanceof d.a) {
                    androidx.compose.runtime.i2 i2Var = this.f13373b;
                    i2Var.k(i2Var.f() + 1);
                } else {
                    if (hVar instanceof m.c ? true : hVar instanceof d.b ? true : hVar instanceof m.a) {
                        this.f13373b.k(r2.f() - 1);
                    }
                }
                return kotlin.k2.f75408a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(androidx.compose.foundation.interaction.i iVar, androidx.compose.runtime.i2 i2Var, kotlin.coroutines.d<? super l> dVar) {
            super(2, dVar);
            this.f13371c = iVar;
            this.f13372d = i2Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            return new l(this.f13371c, this.f13372d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f13370b;
            if (i4 == 0) {
                kotlin.a1.n(obj);
                kotlinx.coroutines.flow.i<androidx.compose.foundation.interaction.h> c5 = this.f13371c.c();
                a aVar2 = new a(this.f13372d);
                this.f13370b = 1;
                if (c5.a(aVar2, this) == aVar) {
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
            return ((l) create(r0Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
        }
    }

    /* compiled from: SegmentedButton.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroidx/compose/ui/layout/o0;", "Landroidx/compose/ui/layout/l0;", "measurable", "Landroidx/compose/ui/unit/b;", "constraints", "Landroidx/compose/ui/layout/n0;", "a", "(Landroidx/compose/ui/layout/o0;Landroidx/compose/ui/layout/l0;J)Landroidx/compose/ui/layout/n0;"}, k = 3, mv = {1, 8, 0})
    static final class m extends kotlin.jvm.internal.n0 implements ld.q<androidx.compose.ui.layout.o0, androidx.compose.ui.layout.l0, androidx.compose.ui.unit.b, androidx.compose.ui.layout.n0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.b5<Integer> f13374b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f13375c;

        /* compiled from: SegmentedButton.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/i1$a;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/layout/i1$a;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.jvm.internal.n0 implements ld.l<i1.a, kotlin.k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ androidx.compose.runtime.b5<Integer> f13376b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ boolean f13377c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.layout.i1 f13378d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(androidx.compose.runtime.b5<Integer> b5Var, boolean z4, androidx.compose.ui.layout.i1 i1Var) {
                super(1);
                this.f13376b = b5Var;
                this.f13377c = z4;
                this.f13378d = i1Var;
            }

            public final void a(@fg.l i1.a aVar) {
                aVar.f(this.f13378d, 0, 0, this.f13376b.getValue().floatValue() + (this.f13377c ? 5.0f : 0.0f));
            }

            @Override // ld.l
            public /* bridge */ /* synthetic */ kotlin.k2 invoke(i1.a aVar) {
                a(aVar);
                return kotlin.k2.f75408a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(androidx.compose.runtime.b5<Integer> b5Var, boolean z4) {
            super(3);
            this.f13374b = b5Var;
            this.f13375c = z4;
        }

        @Override // ld.q
        public /* bridge */ /* synthetic */ androidx.compose.ui.layout.n0 R(androidx.compose.ui.layout.o0 o0Var, androidx.compose.ui.layout.l0 l0Var, androidx.compose.ui.unit.b bVar) {
            return a(o0Var, l0Var, bVar.getValue());
        }

        @fg.l
        public final androidx.compose.ui.layout.n0 a(@fg.l androidx.compose.ui.layout.o0 o0Var, @fg.l androidx.compose.ui.layout.l0 l0Var, long j4) {
            androidx.compose.ui.layout.i1 m02 = l0Var.m0(j4);
            return androidx.compose.ui.layout.o0.x2(o0Var, m02.getWidth(), m02.getHeight(), null, new a(this.f13374b, this.f13375c, m02), 4, null);
        }
    }

    @f5
    @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.i
    public static final void a(@fg.m androidx.compose.ui.q qVar, float f4, @fg.l ld.q<? super c7, ? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> qVar2, @fg.m androidx.compose.runtime.t tVar, int i4, int i5) {
        int i6;
        androidx.compose.runtime.t o4 = tVar.o(155922315);
        int i7 = i5 & 1;
        if (i7 != 0) {
            i6 = i4 | 6;
        } else if ((i4 & 6) == 0) {
            i6 = (o4.q0(qVar) ? 4 : 2) | i4;
        } else {
            i6 = i4;
        }
        int i10 = i5 & 2;
        if (i10 != 0) {
            i6 |= 48;
        } else if ((i4 & 48) == 0) {
            i6 |= o4.d(f4) ? 32 : 16;
        }
        if ((i5 & 4) != 0) {
            i6 |= 384;
        } else if ((i4 & 384) == 0) {
            i6 |= o4.S(qVar2) ? 256 : 128;
        }
        if ((i6 & 147) == 146 && o4.p()) {
            o4.d0();
        } else {
            if (i7 != 0) {
                qVar = androidx.compose.ui.q.INSTANCE;
            }
            if (i10 != 0) {
                f4 = o8.f12930a.h();
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(155922315, i6, -1, "androidx.compose.material3.MultiChoiceSegmentedButtonRow (SegmentedButton.kt:303)");
            }
            androidx.compose.ui.q d5 = androidx.compose.foundation.layout.v0.d(androidx.compose.foundation.layout.c2.b(qVar, 0.0f, c0.p0.f37871a.a(), 1, null), androidx.compose.foundation.layout.x0.Min);
            i.f z4 = androidx.compose.foundation.layout.i.f5073a.z(androidx.compose.ui.unit.h.g(-f4));
            c.InterfaceC0326c q4 = androidx.compose.ui.c.INSTANCE.q();
            o4.P(693286680);
            androidx.compose.ui.layout.m0 d6 = androidx.compose.foundation.layout.w1.d(z4, q4, o4, 48);
            o4.P(-1323940314);
            int j4 = androidx.compose.runtime.p.j(o4, 0);
            androidx.compose.runtime.g0 B = o4.B();
            g.Companion companion = androidx.compose.ui.node.g.INSTANCE;
            ld.a<androidx.compose.ui.node.g> a5 = companion.a();
            ld.q<androidx.compose.runtime.v3<androidx.compose.ui.node.g>, androidx.compose.runtime.t, Integer, kotlin.k2> g4 = androidx.compose.ui.layout.a0.g(d5);
            if (o4.s() == null) {
                androidx.compose.runtime.p.n();
            }
            o4.W();
            if (o4.getInserting()) {
                o4.F(a5);
            } else {
                o4.C();
            }
            ld.p a6 = androidx.compose.animation.p.a(companion, o4, d6, o4, B);
            if (o4.getInserting() || !kotlin.jvm.internal.l0.g(o4.Q(), Integer.valueOf(j4))) {
                androidx.compose.animation.d.a(j4, o4, j4, a6);
            }
            androidx.compose.animation.e.a(0, g4, androidx.compose.runtime.v3.a(o4), o4, 2058660585);
            androidx.compose.foundation.layout.y1 y1Var = androidx.compose.foundation.layout.y1.f5410a;
            o4.P(573415834);
            Object Q = o4.Q();
            if (Q == androidx.compose.runtime.t.INSTANCE.a()) {
                Q = new d7(y1Var);
                o4.E(Q);
            }
            o4.p0();
            qVar2.R((d7) Q, o4, Integer.valueOf(((i6 >> 3) & 112) | 6));
            o4.p0();
            o4.H();
            o4.p0();
            o4.p0();
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }
        androidx.compose.ui.q qVar3 = qVar;
        float f5 = f4;
        androidx.compose.runtime.t3 t4 = o4.t();
        if (t4 != null) {
            t4.a(new a(qVar3, f5, qVar2, i4, i5));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x012f  */
    @androidx.compose.material3.f5
    @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[_][_]]")
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(@fg.l androidx.compose.material3.c7 r28, boolean r29, @fg.l ld.l<? super java.lang.Boolean, kotlin.k2> r30, @fg.l androidx.compose.ui.graphics.e6 r31, @fg.m androidx.compose.ui.q r32, boolean r33, @fg.m androidx.compose.material3.m8 r34, @fg.m androidx.compose.foundation.c0 r35, @fg.m androidx.compose.foundation.interaction.k r36, @fg.m ld.p<? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r37, @fg.l ld.p<? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r38, @fg.m androidx.compose.runtime.t r39, int r40, int r41, int r42) {
        /*
            Method dump skipped, instructions count: 759
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.p8.b(androidx.compose.material3.c7, boolean, ld.l, androidx.compose.ui.graphics.e6, androidx.compose.ui.q, boolean, androidx.compose.material3.m8, androidx.compose.foundation.c0, androidx.compose.foundation.interaction.k, ld.p, ld.p, androidx.compose.runtime.t, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x012f  */
    @androidx.compose.material3.f5
    @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[_][_]]")
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(@fg.l androidx.compose.material3.b9 r28, boolean r29, @fg.l ld.a<kotlin.k2> r30, @fg.l androidx.compose.ui.graphics.e6 r31, @fg.m androidx.compose.ui.q r32, boolean r33, @fg.m androidx.compose.material3.m8 r34, @fg.m androidx.compose.foundation.c0 r35, @fg.m androidx.compose.foundation.interaction.k r36, @fg.m ld.p<? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r37, @fg.l ld.p<? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r38, @fg.m androidx.compose.runtime.t r39, int r40, int r41, int r42) {
        /*
            Method dump skipped, instructions count: 766
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.p8.c(androidx.compose.material3.b9, boolean, ld.a, androidx.compose.ui.graphics.e6, androidx.compose.ui.q, boolean, androidx.compose.material3.m8, androidx.compose.foundation.c0, androidx.compose.foundation.interaction.k, ld.p, ld.p, androidx.compose.runtime.t, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @f5
    @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[_][_]]")
    @androidx.compose.runtime.i
    public static final void d(ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar2, androidx.compose.runtime.t tVar, int i4) {
        int i5;
        androidx.compose.runtime.t o4 = tVar.o(1464121570);
        if ((i4 & 6) == 0) {
            i5 = (o4.S(pVar) ? 4 : 2) | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            i5 |= o4.S(pVar2) ? 32 : 16;
        }
        if ((i5 & 19) == 18 && o4.p()) {
            o4.d0();
        } else {
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(1464121570, i5, -1, "androidx.compose.material3.SegmentedButtonContent (SegmentedButton.kt:321)");
            }
            androidx.compose.ui.c i6 = androidx.compose.ui.c.INSTANCE.i();
            androidx.compose.ui.q j4 = androidx.compose.foundation.layout.j1.j(androidx.compose.ui.q.INSTANCE, o0.f12901a.z());
            o4.P(733328855);
            androidx.compose.ui.layout.m0 i7 = androidx.compose.foundation.layout.m.i(i6, false, o4, 6);
            o4.P(-1323940314);
            int j5 = androidx.compose.runtime.p.j(o4, 0);
            androidx.compose.runtime.g0 B = o4.B();
            g.Companion companion = androidx.compose.ui.node.g.INSTANCE;
            ld.a<androidx.compose.ui.node.g> a5 = companion.a();
            ld.q<androidx.compose.runtime.v3<androidx.compose.ui.node.g>, androidx.compose.runtime.t, Integer, kotlin.k2> g4 = androidx.compose.ui.layout.a0.g(j4);
            if (o4.s() == null) {
                androidx.compose.runtime.p.n();
            }
            o4.W();
            if (o4.getInserting()) {
                o4.F(a5);
            } else {
                o4.C();
            }
            ld.p a6 = androidx.compose.animation.p.a(companion, o4, i7, o4, B);
            if (o4.getInserting() || !kotlin.jvm.internal.l0.g(o4.Q(), Integer.valueOf(j5))) {
                androidx.compose.animation.d.a(j5, o4, j5, a6);
            }
            androidx.compose.animation.e.a(0, g4, androidx.compose.runtime.v3.a(o4), o4, 2058660585);
            androidx.compose.foundation.layout.p pVar3 = androidx.compose.foundation.layout.p.f5235a;
            xa.a(tb.a(p6.f13227a.c(o4, 6), c0.p0.f37871a.i()), androidx.compose.runtime.internal.c.b(o4, 1420592651, true, new i(pVar, pVar2)), o4, 48);
            o4.p0();
            o4.H();
            o4.p0();
            o4.p0();
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }
        androidx.compose.runtime.t3 t4 = o4.t();
        if (t4 != null) {
            t4.a(new j(pVar, pVar2, i4));
        }
    }

    @f5
    @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.i
    public static final void e(@fg.m androidx.compose.ui.q qVar, float f4, @fg.l ld.q<? super b9, ? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> qVar2, @fg.m androidx.compose.runtime.t tVar, int i4, int i5) {
        int i6;
        androidx.compose.runtime.t o4 = tVar.o(-1520863498);
        int i7 = i5 & 1;
        if (i7 != 0) {
            i6 = i4 | 6;
        } else if ((i4 & 6) == 0) {
            i6 = (o4.q0(qVar) ? 4 : 2) | i4;
        } else {
            i6 = i4;
        }
        int i10 = i5 & 2;
        if (i10 != 0) {
            i6 |= 48;
        } else if ((i4 & 48) == 0) {
            i6 |= o4.d(f4) ? 32 : 16;
        }
        if ((i5 & 4) != 0) {
            i6 |= 384;
        } else if ((i4 & 384) == 0) {
            i6 |= o4.S(qVar2) ? 256 : 128;
        }
        if ((i6 & 147) == 146 && o4.p()) {
            o4.d0();
        } else {
            if (i7 != 0) {
                qVar = androidx.compose.ui.q.INSTANCE;
            }
            if (i10 != 0) {
                f4 = o8.f12930a.h();
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(-1520863498, i6, -1, "androidx.compose.material3.SingleChoiceSegmentedButtonRow (SegmentedButton.kt:265)");
            }
            androidx.compose.ui.q d5 = androidx.compose.foundation.layout.v0.d(androidx.compose.foundation.layout.c2.b(androidx.compose.foundation.selection.a.a(qVar), 0.0f, c0.p0.f37871a.a(), 1, null), androidx.compose.foundation.layout.x0.Min);
            i.f z4 = androidx.compose.foundation.layout.i.f5073a.z(androidx.compose.ui.unit.h.g(-f4));
            c.InterfaceC0326c q4 = androidx.compose.ui.c.INSTANCE.q();
            o4.P(693286680);
            androidx.compose.ui.layout.m0 d6 = androidx.compose.foundation.layout.w1.d(z4, q4, o4, 48);
            o4.P(-1323940314);
            int j4 = androidx.compose.runtime.p.j(o4, 0);
            androidx.compose.runtime.g0 B = o4.B();
            g.Companion companion = androidx.compose.ui.node.g.INSTANCE;
            ld.a<androidx.compose.ui.node.g> a5 = companion.a();
            ld.q<androidx.compose.runtime.v3<androidx.compose.ui.node.g>, androidx.compose.runtime.t, Integer, kotlin.k2> g4 = androidx.compose.ui.layout.a0.g(d5);
            if (o4.s() == null) {
                androidx.compose.runtime.p.n();
            }
            o4.W();
            if (o4.getInserting()) {
                o4.F(a5);
            } else {
                o4.C();
            }
            ld.p a6 = androidx.compose.animation.p.a(companion, o4, d6, o4, B);
            if (o4.getInserting() || !kotlin.jvm.internal.l0.g(o4.Q(), Integer.valueOf(j4))) {
                androidx.compose.animation.d.a(j4, o4, j4, a6);
            }
            androidx.compose.animation.e.a(0, g4, androidx.compose.runtime.v3.a(o4), o4, 2058660585);
            androidx.compose.foundation.layout.y1 y1Var = androidx.compose.foundation.layout.y1.f5410a;
            o4.P(-181589424);
            Object Q = o4.Q();
            if (Q == androidx.compose.runtime.t.INSTANCE.a()) {
                Q = new c9(y1Var);
                o4.E(Q);
            }
            o4.p0();
            qVar2.R((c9) Q, o4, Integer.valueOf(((i6 >> 3) & 112) | 6));
            o4.p0();
            o4.H();
            o4.p0();
            o4.p0();
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }
        androidx.compose.ui.q qVar3 = qVar;
        float f5 = f4;
        androidx.compose.runtime.t3 t4 = o4.t();
        if (t4 != null) {
            t4.a(new k(qVar3, f5, qVar2, i4, i5));
        }
    }

    @androidx.compose.runtime.i
    private static final androidx.compose.runtime.b5<Integer> h(androidx.compose.foundation.interaction.i iVar, androidx.compose.runtime.t tVar, int i4) {
        tVar.P(281890131);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(281890131, i4, -1, "androidx.compose.material3.interactionCountAsState (SegmentedButton.kt:398)");
        }
        tVar.P(-1372284393);
        Object Q = tVar.Q();
        t.Companion companion = androidx.compose.runtime.t.INSTANCE;
        if (Q == companion.a()) {
            Q = androidx.compose.runtime.b.c(0);
            tVar.E(Q);
        }
        androidx.compose.runtime.i2 i2Var = (androidx.compose.runtime.i2) Q;
        tVar.p0();
        tVar.P(-1372284334);
        int i5 = i4 & 14;
        boolean z4 = ((i5 ^ 6) > 4 && tVar.q0(iVar)) || (i4 & 6) == 4;
        Object Q2 = tVar.Q();
        if (z4 || Q2 == companion.a()) {
            Q2 = new l(iVar, i2Var, null);
            tVar.E(Q2);
        }
        tVar.p0();
        androidx.compose.runtime.a1.h(iVar, (ld.p) Q2, tVar, i5);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return i2Var;
    }

    private static final androidx.compose.ui.q i(androidx.compose.ui.q qVar, boolean z4, androidx.compose.runtime.b5<Integer> b5Var) {
        return androidx.compose.ui.layout.d0.a(qVar, new m(b5Var, z4));
    }
}
