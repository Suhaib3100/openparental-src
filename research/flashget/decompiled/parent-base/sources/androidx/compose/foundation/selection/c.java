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
import fg.m;
import kotlin.Metadata;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.k2;
import ld.l;
import ld.q;

/* compiled from: Toggleable.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aF\u0010\t\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00070\u0006ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001aX\u0010\u000f\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0003\u001a\u00020\u00012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00070\u0006ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a@\u0010\u0015\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0003\u001a\u00020\u00012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u0013ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001aR\u0010\u0017\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0003\u001a\u00020\u00012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u0013ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0019"}, d2 = {"Landroidx/compose/ui/q;", "", "value", "enabled", "Landroidx/compose/ui/semantics/i;", "role", "Lkotlin/Function1;", "Lkotlin/k2;", "onValueChange", "c", "(Landroidx/compose/ui/q;ZZLandroidx/compose/ui/semantics/i;Lld/l;)Landroidx/compose/ui/q;", "Landroidx/compose/foundation/interaction/k;", "interactionSource", "Landroidx/compose/foundation/n1;", "indication", "a", "(Landroidx/compose/ui/q;ZLandroidx/compose/foundation/interaction/k;Landroidx/compose/foundation/n1;ZLandroidx/compose/ui/semantics/i;Lld/l;)Landroidx/compose/ui/q;", "Lp0/a;", "state", "Lkotlin/Function0;", "onClick", "g", "(Landroidx/compose/ui/q;Lp0/a;ZLandroidx/compose/ui/semantics/i;Lld/a;)Landroidx/compose/ui/q;", "e", "(Landroidx/compose/ui/q;Lp0/a;Landroidx/compose/foundation/interaction/k;Landroidx/compose/foundation/n1;ZLandroidx/compose/ui/semantics/i;Lld/a;)Landroidx/compose/ui/q;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nToggleable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Toggleable.kt\nandroidx/compose/foundation/selection/ToggleableKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,228:1\n135#2:229\n135#2:230\n146#2:231\n135#2:232\n135#2:233\n146#2:234\n*S KotlinDebug\n*F\n+ 1 Toggleable.kt\nandroidx/compose/foundation/selection/ToggleableKt\n*L\n59#1:229\n108#1:230\n107#1:231\n156#1:232\n208#1:233\n207#1:234\n*E\n"})
/* loaded from: classes.dex */
public final class c {

    /* compiled from: Toggleable.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/q;", "a", "(Landroidx/compose/ui/q;Landroidx/compose/runtime/t;I)Landroidx/compose/ui/q;"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nToggleable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Toggleable.kt\nandroidx/compose/foundation/selection/ToggleableKt$toggleable$2\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,228:1\n25#2:229\n1116#3,6:230\n74#4:236\n*S KotlinDebug\n*F\n+ 1 Toggleable.kt\nandroidx/compose/foundation/selection/ToggleableKt$toggleable$2\n*L\n69#1:229\n69#1:230,6\n70#1:236\n*E\n"})
    static final class a extends n0 implements q<androidx.compose.ui.q, t, Integer, androidx.compose.ui.q> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f7026b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f7027c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ i f7028d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ l<Boolean, k2> f7029e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(boolean z4, boolean z5, i iVar, l<? super Boolean, k2> lVar) {
            super(3);
            this.f7026b = z4;
            this.f7027c = z5;
            this.f7028d = iVar;
            this.f7029e = lVar;
        }

        @Override // ld.q
        public /* bridge */ /* synthetic */ androidx.compose.ui.q R(androidx.compose.ui.q qVar, t tVar, Integer num) {
            return a(qVar, tVar, num.intValue());
        }

        @fg.l
        @androidx.compose.runtime.i
        public final androidx.compose.ui.q a(@fg.l androidx.compose.ui.q qVar, @m t tVar, int i4) {
            tVar.P(290332169);
            if (x.b0()) {
                x.r0(290332169, i4, -1, "androidx.compose.foundation.selection.toggleable.<anonymous> (Toggleable.kt:66)");
            }
            q.Companion companion = androidx.compose.ui.q.INSTANCE;
            boolean z4 = this.f7026b;
            tVar.P(-492369756);
            Object Q = tVar.Q();
            if (Q == t.INSTANCE.a()) {
                Q = j.a();
                tVar.E(Q);
            }
            tVar.p0();
            androidx.compose.ui.q a5 = c.a(companion, z4, (k) Q, (n1) tVar.x(p1.a()), this.f7027c, this.f7028d, this.f7029e);
            if (x.b0()) {
                x.q0();
            }
            tVar.p0();
            return a5;
        }
    }

    /* compiled from: Toggleable.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    static final class b extends n0 implements ld.a<k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ l<Boolean, k2> f7030b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f7031c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(l<? super Boolean, k2> lVar, boolean z4) {
            super(0);
            this.f7030b = lVar;
            this.f7031c = z4;
        }

        public final void a() {
            this.f7030b.invoke(Boolean.valueOf(!this.f7031c));
        }

        @Override // ld.a
        public /* bridge */ /* synthetic */ k2 invoke() {
            a();
            return k2.f75408a;
        }
    }

    /* compiled from: InspectableValue.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/platform/a2;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/platform/a2;)V", "androidx/compose/ui/platform/y1$b"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Toggleable.kt\nandroidx/compose/foundation/selection/ToggleableKt\n*L\n1#1,170:1\n109#2,8:171\n*E\n"})
    /* renamed from: androidx.compose.foundation.selection.c$c, reason: collision with other inner class name */
    public static final class C0124c extends n0 implements l<a2, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f7032b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ k f7033c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ n1 f7034d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f7035e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ i f7036f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ l f7037g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0124c(boolean z4, k kVar, n1 n1Var, boolean z5, i iVar, l lVar) {
            super(1);
            this.f7032b = z4;
            this.f7033c = kVar;
            this.f7034d = n1Var;
            this.f7035e = z5;
            this.f7036f = iVar;
            this.f7037g = lVar;
        }

        public final void a(@fg.l a2 a2Var) {
            a2Var.d("toggleable");
            h0.a(this.f7032b, a2Var.getProperties(), "value", a2Var).c("interactionSource", this.f7033c);
            a2Var.getProperties().c("indication", this.f7034d);
            h0.a(this.f7035e, a2Var.getProperties(), "enabled", a2Var).c("role", this.f7036f);
            a2Var.getProperties().c("onValueChange", this.f7037g);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(a2 a2Var) {
            a(a2Var);
            return k2.f75408a;
        }
    }

    /* compiled from: InspectableValue.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/platform/a2;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/platform/a2;)V", "androidx/compose/ui/platform/y1$b"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Toggleable.kt\nandroidx/compose/foundation/selection/ToggleableKt\n*L\n1#1,170:1\n60#2,6:171\n*E\n"})
    public static final class d extends n0 implements l<a2, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f7038b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f7039c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ i f7040d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ l f7041e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(boolean z4, boolean z5, i iVar, l lVar) {
            super(1);
            this.f7038b = z4;
            this.f7039c = z5;
            this.f7040d = iVar;
            this.f7041e = lVar;
        }

        public final void a(@fg.l a2 a2Var) {
            a2Var.d("toggleable");
            h0.a(this.f7039c, h0.a(this.f7038b, a2Var.getProperties(), "value", a2Var), "enabled", a2Var).c("role", this.f7040d);
            a2Var.getProperties().c("onValueChange", this.f7041e);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(a2 a2Var) {
            a(a2Var);
            return k2.f75408a;
        }
    }

    /* compiled from: Toggleable.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/q;", "a", "(Landroidx/compose/ui/q;Landroidx/compose/runtime/t;I)Landroidx/compose/ui/q;"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nToggleable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Toggleable.kt\nandroidx/compose/foundation/selection/ToggleableKt$triStateToggleable$2\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,228:1\n25#2:229\n1116#3,6:230\n74#4:236\n*S KotlinDebug\n*F\n+ 1 Toggleable.kt\nandroidx/compose/foundation/selection/ToggleableKt$triStateToggleable$2\n*L\n166#1:229\n166#1:230,6\n167#1:236\n*E\n"})
    static final class e extends n0 implements ld.q<androidx.compose.ui.q, t, Integer, androidx.compose.ui.q> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ p0.a f7042b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f7043c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ i f7044d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ld.a<k2> f7045e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(p0.a aVar, boolean z4, i iVar, ld.a<k2> aVar2) {
            super(3);
            this.f7042b = aVar;
            this.f7043c = z4;
            this.f7044d = iVar;
            this.f7045e = aVar2;
        }

        @Override // ld.q
        public /* bridge */ /* synthetic */ androidx.compose.ui.q R(androidx.compose.ui.q qVar, t tVar, Integer num) {
            return a(qVar, tVar, num.intValue());
        }

        @fg.l
        @androidx.compose.runtime.i
        public final androidx.compose.ui.q a(@fg.l androidx.compose.ui.q qVar, @m t tVar, int i4) {
            tVar.P(-1808118329);
            if (x.b0()) {
                x.r0(-1808118329, i4, -1, "androidx.compose.foundation.selection.triStateToggleable.<anonymous> (Toggleable.kt:163)");
            }
            q.Companion companion = androidx.compose.ui.q.INSTANCE;
            p0.a aVar = this.f7042b;
            tVar.P(-492369756);
            Object Q = tVar.Q();
            if (Q == t.INSTANCE.a()) {
                Q = j.a();
                tVar.E(Q);
            }
            tVar.p0();
            androidx.compose.ui.q e4 = c.e(companion, aVar, (k) Q, (n1) tVar.x(p1.a()), this.f7043c, this.f7044d, this.f7045e);
            if (x.b0()) {
                x.q0();
            }
            tVar.p0();
            return e4;
        }
    }

    /* compiled from: Toggleable.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/semantics/z;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/semantics/z;)V"}, k = 3, mv = {1, 8, 0})
    static final class f extends n0 implements l<z, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ p0.a f7046b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(p0.a aVar) {
            super(1);
            this.f7046b = aVar;
        }

        public final void a(@fg.l z zVar) {
            w.z1(zVar, this.f7046b);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(z zVar) {
            a(zVar);
            return k2.f75408a;
        }
    }

    /* compiled from: InspectableValue.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/platform/a2;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/platform/a2;)V", "androidx/compose/ui/platform/y1$b"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Toggleable.kt\nandroidx/compose/foundation/selection/ToggleableKt\n*L\n1#1,170:1\n209#2,8:171\n*E\n"})
    public static final class g extends n0 implements l<a2, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ p0.a f7047b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f7048c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ i f7049d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ k f7050e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ n1 f7051f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ld.a f7052g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(p0.a aVar, boolean z4, i iVar, k kVar, n1 n1Var, ld.a aVar2) {
            super(1);
            this.f7047b = aVar;
            this.f7048c = z4;
            this.f7049d = iVar;
            this.f7050e = kVar;
            this.f7051f = n1Var;
            this.f7052g = aVar2;
        }

        public final void a(@fg.l a2 a2Var) {
            a2Var.d("triStateToggleable");
            a2Var.getProperties().c("state", this.f7047b);
            h0.a(this.f7048c, a2Var.getProperties(), "enabled", a2Var).c("role", this.f7049d);
            a2Var.getProperties().c("interactionSource", this.f7050e);
            a2Var.getProperties().c("indication", this.f7051f);
            a2Var.getProperties().c("onClick", this.f7052g);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(a2 a2Var) {
            a(a2Var);
            return k2.f75408a;
        }
    }

    /* compiled from: InspectableValue.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/platform/a2;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/platform/a2;)V", "androidx/compose/ui/platform/y1$b"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Toggleable.kt\nandroidx/compose/foundation/selection/ToggleableKt\n*L\n1#1,170:1\n157#2,6:171\n*E\n"})
    public static final class h extends n0 implements l<a2, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ p0.a f7053b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f7054c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ i f7055d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ld.a f7056e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(p0.a aVar, boolean z4, i iVar, ld.a aVar2) {
            super(1);
            this.f7053b = aVar;
            this.f7054c = z4;
            this.f7055d = iVar;
            this.f7056e = aVar2;
        }

        public final void a(@fg.l a2 a2Var) {
            a2Var.d("triStateToggleable");
            a2Var.getProperties().c("state", this.f7053b);
            h0.a(this.f7054c, a2Var.getProperties(), "enabled", a2Var).c("role", this.f7055d);
            a2Var.getProperties().c("onClick", this.f7056e);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(a2 a2Var) {
            a(a2Var);
            return k2.f75408a;
        }
    }

    @fg.l
    public static final androidx.compose.ui.q a(@fg.l androidx.compose.ui.q qVar, boolean z4, @fg.l k kVar, @m n1 n1Var, boolean z5, @m i iVar, @fg.l l<? super Boolean, k2> lVar) {
        return y1.d(qVar, y1.e() ? new C0124c(z4, kVar, n1Var, z5, iVar, lVar) : y1.b(), e(androidx.compose.ui.q.INSTANCE, p0.b.a(z4), kVar, n1Var, z5, iVar, new b(lVar, z4)));
    }

    public static /* synthetic */ androidx.compose.ui.q b(androidx.compose.ui.q qVar, boolean z4, k kVar, n1 n1Var, boolean z5, i iVar, l lVar, int i4, Object obj) {
        if ((i4 & 8) != 0) {
            z5 = true;
        }
        boolean z6 = z5;
        if ((i4 & 16) != 0) {
            iVar = null;
        }
        return a(qVar, z4, kVar, n1Var, z6, iVar, lVar);
    }

    @fg.l
    public static final androidx.compose.ui.q c(@fg.l androidx.compose.ui.q qVar, boolean z4, boolean z5, @m i iVar, @fg.l l<? super Boolean, k2> lVar) {
        return androidx.compose.ui.i.e(qVar, y1.e() ? new d(z4, z5, iVar, lVar) : y1.b(), new a(z4, z5, iVar, lVar));
    }

    public static /* synthetic */ androidx.compose.ui.q d(androidx.compose.ui.q qVar, boolean z4, boolean z5, i iVar, l lVar, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            z5 = true;
        }
        if ((i4 & 4) != 0) {
            iVar = null;
        }
        return c(qVar, z4, z5, iVar, lVar);
    }

    @fg.l
    public static final androidx.compose.ui.q e(@fg.l androidx.compose.ui.q qVar, @fg.l p0.a aVar, @fg.l k kVar, @m n1 n1Var, boolean z4, @m i iVar, @fg.l ld.a<k2> aVar2) {
        return y1.d(qVar, y1.e() ? new g(aVar, z4, iVar, kVar, n1Var, aVar2) : y1.b(), o.f(g0.d(androidx.compose.ui.q.INSTANCE, kVar, n1Var, z4, null, iVar, aVar2, 8, null), false, new f(aVar), 1, null));
    }

    public static /* synthetic */ androidx.compose.ui.q f(androidx.compose.ui.q qVar, p0.a aVar, k kVar, n1 n1Var, boolean z4, i iVar, ld.a aVar2, int i4, Object obj) {
        if ((i4 & 8) != 0) {
            z4 = true;
        }
        boolean z5 = z4;
        if ((i4 & 16) != 0) {
            iVar = null;
        }
        return e(qVar, aVar, kVar, n1Var, z5, iVar, aVar2);
    }

    @fg.l
    public static final androidx.compose.ui.q g(@fg.l androidx.compose.ui.q qVar, @fg.l p0.a aVar, boolean z4, @m i iVar, @fg.l ld.a<k2> aVar2) {
        return androidx.compose.ui.i.e(qVar, y1.e() ? new h(aVar, z4, iVar, aVar2) : y1.b(), new e(aVar, z4, iVar, aVar2));
    }

    public static /* synthetic */ androidx.compose.ui.q h(androidx.compose.ui.q qVar, p0.a aVar, boolean z4, i iVar, ld.a aVar2, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            z4 = true;
        }
        if ((i4 & 4) != 0) {
            iVar = null;
        }
        return g(qVar, aVar, z4, iVar, aVar2);
    }
}
