package androidx.compose.foundation.selection;

import androidx.compose.foundation.g0;
import androidx.compose.foundation.h0;
import androidx.compose.foundation.interaction.j;
import androidx.compose.foundation.interaction.k;
import androidx.compose.foundation.n1;
import androidx.compose.foundation.p1;
import androidx.compose.runtime.t;
import androidx.compose.runtime.x;
import androidx.compose.ui.platform.a2;
import androidx.compose.ui.platform.y1;
import androidx.compose.ui.q;
import androidx.compose.ui.semantics.i;
import androidx.compose.ui.semantics.o;
import androidx.compose.ui.semantics.w;
import androidx.compose.ui.semantics.z;
import fg.l;
import fg.m;
import kotlin.Metadata;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.k2;
import ld.q;

/* compiled from: Selectable.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a@\u0010\t\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001aR\u0010\u000f\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0003\u001a\u00020\u00012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/q;", "", "selected", "enabled", "Landroidx/compose/ui/semantics/i;", "role", "Lkotlin/Function0;", "Lkotlin/k2;", "onClick", "c", "(Landroidx/compose/ui/q;ZZLandroidx/compose/ui/semantics/i;Lld/a;)Landroidx/compose/ui/q;", "Landroidx/compose/foundation/interaction/k;", "interactionSource", "Landroidx/compose/foundation/n1;", "indication", "a", "(Landroidx/compose/ui/q;ZLandroidx/compose/foundation/interaction/k;Landroidx/compose/foundation/n1;ZLandroidx/compose/ui/semantics/i;Lld/a;)Landroidx/compose/ui/q;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nSelectable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Selectable.kt\nandroidx/compose/foundation/selection/SelectableKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,135:1\n135#2:136\n135#2:137\n146#2:138\n*S KotlinDebug\n*F\n+ 1 Selectable.kt\nandroidx/compose/foundation/selection/SelectableKt\n*L\n61#1:136\n114#1:137\n113#1:138\n*E\n"})
/* loaded from: classes.dex */
public final class b {

    /* compiled from: Selectable.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/q;", "a", "(Landroidx/compose/ui/q;Landroidx/compose/runtime/t;I)Landroidx/compose/ui/q;"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nSelectable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Selectable.kt\nandroidx/compose/foundation/selection/SelectableKt$selectable$2\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,135:1\n25#2:136\n1116#3,6:137\n74#4:143\n*S KotlinDebug\n*F\n+ 1 Selectable.kt\nandroidx/compose/foundation/selection/SelectableKt$selectable$2\n*L\n73#1:136\n73#1:137,6\n74#1:143\n*E\n"})
    static final class a extends n0 implements q<androidx.compose.ui.q, t, Integer, androidx.compose.ui.q> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f7011b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f7012c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ i f7013d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ld.a<k2> f7014e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(boolean z4, boolean z5, i iVar, ld.a<k2> aVar) {
            super(3);
            this.f7011b = z4;
            this.f7012c = z5;
            this.f7013d = iVar;
            this.f7014e = aVar;
        }

        @Override // ld.q
        public /* bridge */ /* synthetic */ androidx.compose.ui.q R(androidx.compose.ui.q qVar, t tVar, Integer num) {
            return a(qVar, tVar, num.intValue());
        }

        @l
        @androidx.compose.runtime.i
        public final androidx.compose.ui.q a(@l androidx.compose.ui.q qVar, @m t tVar, int i4) {
            tVar.P(-2124609672);
            if (x.b0()) {
                x.r0(-2124609672, i4, -1, "androidx.compose.foundation.selection.selectable.<anonymous> (Selectable.kt:68)");
            }
            q.Companion companion = androidx.compose.ui.q.INSTANCE;
            tVar.P(-492369756);
            Object Q = tVar.Q();
            if (Q == t.INSTANCE.a()) {
                Q = j.a();
                tVar.E(Q);
            }
            tVar.p0();
            androidx.compose.ui.q a5 = b.a(companion, this.f7011b, (k) Q, (n1) tVar.x(p1.a()), this.f7012c, this.f7013d, this.f7014e);
            if (x.b0()) {
                x.q0();
            }
            tVar.p0();
            return a5;
        }
    }

    /* compiled from: Selectable.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/semantics/z;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/semantics/z;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.foundation.selection.b$b, reason: collision with other inner class name */
    static final class C0123b extends n0 implements ld.l<z, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f7015b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0123b(boolean z4) {
            super(1);
            this.f7015b = z4;
        }

        public final void a(@l z zVar) {
            w.m1(zVar, this.f7015b);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(z zVar) {
            a(zVar);
            return k2.f75408a;
        }
    }

    /* compiled from: InspectableValue.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/platform/a2;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/platform/a2;)V", "androidx/compose/ui/platform/y1$b"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Selectable.kt\nandroidx/compose/foundation/selection/SelectableKt\n*L\n1#1,170:1\n115#2,8:171\n*E\n"})
    public static final class c extends n0 implements ld.l<a2, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f7016b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ k f7017c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ n1 f7018d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f7019e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ i f7020f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ld.a f7021g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(boolean z4, k kVar, n1 n1Var, boolean z5, i iVar, ld.a aVar) {
            super(1);
            this.f7016b = z4;
            this.f7017c = kVar;
            this.f7018d = n1Var;
            this.f7019e = z5;
            this.f7020f = iVar;
            this.f7021g = aVar;
        }

        public final void a(@l a2 a2Var) {
            a2Var.d("selectable");
            h0.a(this.f7016b, a2Var.getProperties(), "selected", a2Var).c("interactionSource", this.f7017c);
            a2Var.getProperties().c("indication", this.f7018d);
            h0.a(this.f7019e, a2Var.getProperties(), "enabled", a2Var).c("role", this.f7020f);
            a2Var.getProperties().c("onClick", this.f7021g);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(a2 a2Var) {
            a(a2Var);
            return k2.f75408a;
        }
    }

    /* compiled from: InspectableValue.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/platform/a2;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/platform/a2;)V", "androidx/compose/ui/platform/y1$b"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Selectable.kt\nandroidx/compose/foundation/selection/SelectableKt\n*L\n1#1,170:1\n62#2,6:171\n*E\n"})
    public static final class d extends n0 implements ld.l<a2, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f7022b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f7023c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ i f7024d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ld.a f7025e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(boolean z4, boolean z5, i iVar, ld.a aVar) {
            super(1);
            this.f7022b = z4;
            this.f7023c = z5;
            this.f7024d = iVar;
            this.f7025e = aVar;
        }

        public final void a(@l a2 a2Var) {
            a2Var.d("selectable");
            h0.a(this.f7023c, h0.a(this.f7022b, a2Var.getProperties(), "selected", a2Var), "enabled", a2Var).c("role", this.f7024d);
            a2Var.getProperties().c("onClick", this.f7025e);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(a2 a2Var) {
            a(a2Var);
            return k2.f75408a;
        }
    }

    @l
    public static final androidx.compose.ui.q a(@l androidx.compose.ui.q qVar, boolean z4, @l k kVar, @m n1 n1Var, boolean z5, @m i iVar, @l ld.a<k2> aVar) {
        return y1.d(qVar, y1.e() ? new c(z4, kVar, n1Var, z5, iVar, aVar) : y1.b(), o.f(g0.d(androidx.compose.ui.q.INSTANCE, kVar, n1Var, z5, null, iVar, aVar, 8, null), false, new C0123b(z4), 1, null));
    }

    public static /* synthetic */ androidx.compose.ui.q b(androidx.compose.ui.q qVar, boolean z4, k kVar, n1 n1Var, boolean z5, i iVar, ld.a aVar, int i4, Object obj) {
        if ((i4 & 8) != 0) {
            z5 = true;
        }
        boolean z6 = z5;
        if ((i4 & 16) != 0) {
            iVar = null;
        }
        return a(qVar, z4, kVar, n1Var, z6, iVar, aVar);
    }

    @l
    public static final androidx.compose.ui.q c(@l androidx.compose.ui.q qVar, boolean z4, boolean z5, @m i iVar, @l ld.a<k2> aVar) {
        return androidx.compose.ui.i.e(qVar, y1.e() ? new d(z4, z5, iVar, aVar) : y1.b(), new a(z4, z5, iVar, aVar));
    }

    public static /* synthetic */ androidx.compose.ui.q d(androidx.compose.ui.q qVar, boolean z4, boolean z5, i iVar, ld.a aVar, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            z5 = true;
        }
        if ((i4 & 4) != 0) {
            iVar = null;
        }
        return c(qVar, z4, z5, iVar, aVar);
    }
}
