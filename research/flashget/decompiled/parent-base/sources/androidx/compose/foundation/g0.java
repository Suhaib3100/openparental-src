package androidx.compose.foundation;

import android.view.KeyEvent;
import androidx.compose.foundation.a;
import androidx.compose.foundation.interaction.m;
import androidx.compose.runtime.b5;
import androidx.compose.ui.q;
import androidx.constraintlayout.core.motion.utils.w;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: Clickable.kt */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aD\u0010\n\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001aV\u0010\u0010\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001av\u0010\u0015\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0088\u0001\u0010\u0017\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a=\u0010\u001f\u001a\u00020\b*\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u001c2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 \u001a \u0001\u0010)\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\"\u001a\u00020!2\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020%0#2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u001a0'2\b\b\u0002\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0000ø\u0001\u0000¢\u0006\u0004\b)\u0010*\u001an\u0010,\u001a\u00020+2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u00032\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007ø\u0001\u0000¢\u0006\u0004\b,\u0010-\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006."}, d2 = {"Landroidx/compose/ui/q;", "", "enabled", "", "onClickLabel", "Landroidx/compose/ui/semantics/i;", "role", "Lkotlin/Function0;", "Lkotlin/k2;", "onClick", "e", "(Landroidx/compose/ui/q;ZLjava/lang/String;Landroidx/compose/ui/semantics/i;Lld/a;)Landroidx/compose/ui/q;", "Landroidx/compose/foundation/interaction/k;", "interactionSource", "Landroidx/compose/foundation/n1;", "indication", "c", "(Landroidx/compose/ui/q;Landroidx/compose/foundation/interaction/k;Landroidx/compose/foundation/n1;ZLjava/lang/String;Landroidx/compose/ui/semantics/i;Lld/a;)Landroidx/compose/ui/q;", "onLongClickLabel", "onLongClick", "onDoubleClick", "i", "(Landroidx/compose/ui/q;ZLjava/lang/String;Landroidx/compose/ui/semantics/i;Ljava/lang/String;Lld/a;Lld/a;Lld/a;)Landroidx/compose/ui/q;", "g", "(Landroidx/compose/ui/q;Landroidx/compose/foundation/interaction/k;Landroidx/compose/foundation/n1;ZLjava/lang/String;Landroidx/compose/ui/semantics/i;Ljava/lang/String;Lld/a;Lld/a;Lld/a;)Landroidx/compose/ui/q;", "Landroidx/compose/foundation/gestures/l0;", "Li0/f;", "pressPoint", "Landroidx/compose/foundation/a$a;", "interactionData", "delayPressInteraction", "n", "(Landroidx/compose/foundation/gestures/l0;JLandroidx/compose/foundation/interaction/k;Landroidx/compose/foundation/a$a;Lld/a;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlinx/coroutines/r0;", "indicationScope", "", "Landroidx/compose/ui/input/key/b;", "Landroidx/compose/foundation/interaction/m$b;", "currentKeyPressInteractions", "Landroidx/compose/runtime/b5;", "keyClickOffset", "k", "(Landroidx/compose/ui/q;Landroidx/compose/foundation/interaction/k;Landroidx/compose/foundation/n1;Lkotlinx/coroutines/r0;Ljava/util/Map;Landroidx/compose/runtime/b5;ZLjava/lang/String;Landroidx/compose/ui/semantics/i;Ljava/lang/String;Lld/a;Lld/a;)Landroidx/compose/ui/q;", "Landroidx/compose/foundation/n0;", "a", "(Lld/a;Ljava/lang/String;Lld/a;Lld/a;Landroidx/compose/foundation/interaction/k;ZLjava/lang/String;Landroidx/compose/ui/semantics/i;)Landroidx/compose/foundation/n0;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nClickable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Clickable.kt\nandroidx/compose/foundation/ClickableKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,1070:1\n135#2:1071\n135#2:1072\n146#2:1073\n135#2:1074\n135#2:1075\n146#2:1076\n*S KotlinDebug\n*F\n+ 1 Clickable.kt\nandroidx/compose/foundation/ClickableKt\n*L\n91#1:1071\n141#1:1072\n140#1:1073\n194#1:1074\n261#1:1075\n260#1:1076\n*E\n"})
/* loaded from: classes.dex */
public final class g0 {

    /* compiled from: Clickable.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/q;", "a", "(Landroidx/compose/ui/q;Landroidx/compose/runtime/t;I)Landroidx/compose/ui/q;"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nClickable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Clickable.kt\nandroidx/compose/foundation/ClickableKt$clickable$2\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,1070:1\n74#2:1071\n25#3:1072\n1116#4,6:1073\n*S KotlinDebug\n*F\n+ 1 Clickable.kt\nandroidx/compose/foundation/ClickableKt$clickable$2\n*L\n104#1:1071\n105#1:1072\n105#1:1073,6\n*E\n"})
    static final class a extends kotlin.jvm.internal.n0 implements ld.q<androidx.compose.ui.q, androidx.compose.runtime.t, Integer, androidx.compose.ui.q> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f3660b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f3661c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.semantics.i f3662d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ld.a<kotlin.k2> f3663e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(boolean z4, String str, androidx.compose.ui.semantics.i iVar, ld.a<kotlin.k2> aVar) {
            super(3);
            this.f3660b = z4;
            this.f3661c = str;
            this.f3662d = iVar;
            this.f3663e = aVar;
        }

        @Override // ld.q
        public /* bridge */ /* synthetic */ androidx.compose.ui.q R(androidx.compose.ui.q qVar, androidx.compose.runtime.t tVar, Integer num) {
            return a(qVar, tVar, num.intValue());
        }

        @fg.l
        @androidx.compose.runtime.i
        public final androidx.compose.ui.q a(@fg.l androidx.compose.ui.q qVar, @fg.m androidx.compose.runtime.t tVar, int i4) {
            tVar.P(-756081143);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(-756081143, i4, -1, "androidx.compose.foundation.clickable.<anonymous> (Clickable.kt:98)");
            }
            q.Companion companion = androidx.compose.ui.q.INSTANCE;
            n1 n1Var = (n1) tVar.x(p1.a());
            tVar.P(-492369756);
            Object Q = tVar.Q();
            if (Q == androidx.compose.runtime.t.INSTANCE.a()) {
                Q = androidx.compose.foundation.interaction.j.a();
                tVar.E(Q);
            }
            tVar.p0();
            androidx.compose.ui.q c5 = g0.c(companion, (androidx.compose.foundation.interaction.k) Q, n1Var, this.f3660b, this.f3661c, this.f3662d, this.f3663e);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
            tVar.p0();
            return c5;
        }
    }

    /* compiled from: InspectableValue.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/platform/a2;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/platform/a2;)V", "androidx/compose/ui/platform/y1$b"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Clickable.kt\nandroidx/compose/foundation/ClickableKt\n*L\n1#1,170:1\n142#2,8:171\n*E\n"})
    public static final class b extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.platform.a2, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.k f3664b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ n1 f3665c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f3666d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f3667e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.semantics.i f3668f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ld.a f3669g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(androidx.compose.foundation.interaction.k kVar, n1 n1Var, boolean z4, String str, androidx.compose.ui.semantics.i iVar, ld.a aVar) {
            super(1);
            this.f3664b = kVar;
            this.f3665c = n1Var;
            this.f3666d = z4;
            this.f3667e = str;
            this.f3668f = iVar;
            this.f3669g = aVar;
        }

        public final void a(@fg.l androidx.compose.ui.platform.a2 a2Var) {
            a2Var.d("clickable");
            a2Var.getProperties().c("interactionSource", this.f3664b);
            a2Var.getProperties().c("indication", this.f3665c);
            h0.a(this.f3666d, a2Var.getProperties(), "enabled", a2Var).c("onClickLabel", this.f3667e);
            a2Var.getProperties().c("role", this.f3668f);
            a2Var.getProperties().c("onClick", this.f3669g);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.ui.platform.a2 a2Var) {
            a(a2Var);
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: InspectableValue.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/platform/a2;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/platform/a2;)V", "androidx/compose/ui/platform/y1$b"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Clickable.kt\nandroidx/compose/foundation/ClickableKt\n*L\n1#1,170:1\n92#2,6:171\n*E\n"})
    public static final class c extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.platform.a2, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f3670b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f3671c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.semantics.i f3672d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ld.a f3673e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(boolean z4, String str, androidx.compose.ui.semantics.i iVar, ld.a aVar) {
            super(1);
            this.f3670b = z4;
            this.f3671c = str;
            this.f3672d = iVar;
            this.f3673e = aVar;
        }

        public final void a(@fg.l androidx.compose.ui.platform.a2 a2Var) {
            a2Var.d("clickable");
            h0.a(this.f3670b, a2Var.getProperties(), "enabled", a2Var).c("onClickLabel", this.f3671c);
            a2Var.getProperties().c("role", this.f3672d);
            a2Var.getProperties().c("onClick", this.f3673e);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.ui.platform.a2 a2Var) {
            a(a2Var);
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: Clickable.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/q;", "a", "(Landroidx/compose/ui/q;Landroidx/compose/runtime/t;I)Landroidx/compose/ui/q;"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nClickable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Clickable.kt\nandroidx/compose/foundation/ClickableKt$combinedClickable$2\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,1070:1\n74#2:1071\n25#3:1072\n1116#4,6:1073\n*S KotlinDebug\n*F\n+ 1 Clickable.kt\nandroidx/compose/foundation/ClickableKt$combinedClickable$2\n*L\n213#1:1071\n214#1:1072\n214#1:1073,6\n*E\n"})
    static final class d extends kotlin.jvm.internal.n0 implements ld.q<androidx.compose.ui.q, androidx.compose.runtime.t, Integer, androidx.compose.ui.q> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f3674b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f3675c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.semantics.i f3676d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f3677e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ld.a<kotlin.k2> f3678f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ld.a<kotlin.k2> f3679g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ ld.a<kotlin.k2> f3680h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(boolean z4, String str, androidx.compose.ui.semantics.i iVar, String str2, ld.a<kotlin.k2> aVar, ld.a<kotlin.k2> aVar2, ld.a<kotlin.k2> aVar3) {
            super(3);
            this.f3674b = z4;
            this.f3675c = str;
            this.f3676d = iVar;
            this.f3677e = str2;
            this.f3678f = aVar;
            this.f3679g = aVar2;
            this.f3680h = aVar3;
        }

        @Override // ld.q
        public /* bridge */ /* synthetic */ androidx.compose.ui.q R(androidx.compose.ui.q qVar, androidx.compose.runtime.t tVar, Integer num) {
            return a(qVar, tVar, num.intValue());
        }

        @fg.l
        @androidx.compose.runtime.i
        public final androidx.compose.ui.q a(@fg.l androidx.compose.ui.q qVar, @fg.m androidx.compose.runtime.t tVar, int i4) {
            tVar.P(1969174843);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(1969174843, i4, -1, "androidx.compose.foundation.combinedClickable.<anonymous> (Clickable.kt:204)");
            }
            q.Companion companion = androidx.compose.ui.q.INSTANCE;
            n1 n1Var = (n1) tVar.x(p1.a());
            tVar.P(-492369756);
            Object Q = tVar.Q();
            if (Q == androidx.compose.runtime.t.INSTANCE.a()) {
                Q = androidx.compose.foundation.interaction.j.a();
                tVar.E(Q);
            }
            tVar.p0();
            androidx.compose.ui.q g4 = g0.g(companion, (androidx.compose.foundation.interaction.k) Q, n1Var, this.f3674b, this.f3675c, this.f3676d, this.f3677e, this.f3678f, this.f3679g, this.f3680h);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
            tVar.p0();
            return g4;
        }
    }

    /* compiled from: InspectableValue.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/platform/a2;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/platform/a2;)V", "androidx/compose/ui/platform/y1$b"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Clickable.kt\nandroidx/compose/foundation/ClickableKt\n*L\n1#1,170:1\n262#2,11:171\n*E\n"})
    public static final class e extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.platform.a2, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ n1 f3681b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.k f3682c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f3683d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f3684e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.semantics.i f3685f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ld.a f3686g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ ld.a f3687h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ ld.a f3688i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ String f3689j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(n1 n1Var, androidx.compose.foundation.interaction.k kVar, boolean z4, String str, androidx.compose.ui.semantics.i iVar, ld.a aVar, ld.a aVar2, ld.a aVar3, String str2) {
            super(1);
            this.f3681b = n1Var;
            this.f3682c = kVar;
            this.f3683d = z4;
            this.f3684e = str;
            this.f3685f = iVar;
            this.f3686g = aVar;
            this.f3687h = aVar2;
            this.f3688i = aVar3;
            this.f3689j = str2;
        }

        public final void a(@fg.l androidx.compose.ui.platform.a2 a2Var) {
            a2Var.d("combinedClickable");
            a2Var.getProperties().c("indication", this.f3681b);
            a2Var.getProperties().c("interactionSource", this.f3682c);
            h0.a(this.f3683d, a2Var.getProperties(), "enabled", a2Var).c("onClickLabel", this.f3684e);
            a2Var.getProperties().c("role", this.f3685f);
            a2Var.getProperties().c("onClick", this.f3686g);
            a2Var.getProperties().c("onDoubleClick", this.f3687h);
            a2Var.getProperties().c("onLongClick", this.f3688i);
            a2Var.getProperties().c("onLongClickLabel", this.f3689j);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.ui.platform.a2 a2Var) {
            a(a2Var);
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: InspectableValue.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/platform/a2;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/platform/a2;)V", "androidx/compose/ui/platform/y1$b"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Clickable.kt\nandroidx/compose/foundation/ClickableKt\n*L\n1#1,170:1\n195#2,9:171\n*E\n"})
    public static final class f extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.platform.a2, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f3690b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f3691c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.semantics.i f3692d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ld.a f3693e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ld.a f3694f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ld.a f3695g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f3696h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(boolean z4, String str, androidx.compose.ui.semantics.i iVar, ld.a aVar, ld.a aVar2, ld.a aVar3, String str2) {
            super(1);
            this.f3690b = z4;
            this.f3691c = str;
            this.f3692d = iVar;
            this.f3693e = aVar;
            this.f3694f = aVar2;
            this.f3695g = aVar3;
            this.f3696h = str2;
        }

        public final void a(@fg.l androidx.compose.ui.platform.a2 a2Var) {
            a2Var.d("combinedClickable");
            h0.a(this.f3690b, a2Var.getProperties(), "enabled", a2Var).c("onClickLabel", this.f3691c);
            a2Var.getProperties().c("role", this.f3692d);
            a2Var.getProperties().c("onClick", this.f3693e);
            a2Var.getProperties().c("onDoubleClick", this.f3694f);
            a2Var.getProperties().c("onLongClick", this.f3695g);
            a2Var.getProperties().c("onLongClickLabel", this.f3696h);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.ui.platform.a2 a2Var) {
            a(a2Var);
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: Clickable.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/input/key/c;", "keyEvent", "", "a", "(Landroid/view/KeyEvent;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class g extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.input.key.c, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f3697b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Map<androidx.compose.ui.input.key.b, m.b> f3698c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ b5<i0.f> f3699d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.r0 f3700e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ld.a<kotlin.k2> f3701f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.k f3702g;

        /* compiled from: Clickable.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.ClickableKt$genericClickableWithoutGesture$detectPressAndClickFromKey$1$1", f = "Clickable.kt", i = {}, l = {384}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super kotlin.k2>, Object> {

            /* renamed from: b, reason: collision with root package name */
            int f3703b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ androidx.compose.foundation.interaction.k f3704c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ m.b f3705d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(androidx.compose.foundation.interaction.k kVar, m.b bVar, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f3704c = kVar;
                this.f3705d = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.l
            public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                return new a(this.f3704c, this.f3705d, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                int i4 = this.f3703b;
                if (i4 == 0) {
                    kotlin.a1.n(obj);
                    androidx.compose.foundation.interaction.k kVar = this.f3704c;
                    m.b bVar = this.f3705d;
                    this.f3703b = 1;
                    if (kVar.a(bVar, this) == aVar) {
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

        /* compiled from: Clickable.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.ClickableKt$genericClickableWithoutGesture$detectPressAndClickFromKey$1$2$1", f = "Clickable.kt", i = {}, l = {393}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
        static final class b extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super kotlin.k2>, Object> {

            /* renamed from: b, reason: collision with root package name */
            int f3706b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ androidx.compose.foundation.interaction.k f3707c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ m.b f3708d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(androidx.compose.foundation.interaction.k kVar, m.b bVar, kotlin.coroutines.d<? super b> dVar) {
                super(2, dVar);
                this.f3707c = kVar;
                this.f3708d = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.l
            public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                return new b(this.f3707c, this.f3708d, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                int i4 = this.f3706b;
                if (i4 == 0) {
                    kotlin.a1.n(obj);
                    androidx.compose.foundation.interaction.k kVar = this.f3707c;
                    m.c cVar = new m.c(this.f3708d);
                    this.f3706b = 1;
                    if (kVar.a(cVar, this) == aVar) {
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
        g(boolean z4, Map<androidx.compose.ui.input.key.b, m.b> map, b5<i0.f> b5Var, kotlinx.coroutines.r0 r0Var, ld.a<kotlin.k2> aVar, androidx.compose.foundation.interaction.k kVar) {
            super(1);
            this.f3697b = z4;
            this.f3698c = map;
            this.f3699d = b5Var;
            this.f3700e = r0Var;
            this.f3701f = aVar;
            this.f3702g = kVar;
        }

        @fg.l
        public final Boolean a(@fg.l KeyEvent keyEvent) {
            boolean z4 = false;
            if (this.f3697b && l0.f(keyEvent)) {
                if (!this.f3698c.containsKey(androidx.compose.ui.input.key.b.B4(androidx.compose.ui.input.key.e.a(keyEvent)))) {
                    m.b bVar = new m.b(this.f3699d.getValue().getPackedValue(), null);
                    this.f3698c.put(androidx.compose.ui.input.key.b.B4(androidx.compose.ui.input.key.e.a(keyEvent)), bVar);
                    kotlinx.coroutines.k.f(this.f3700e, null, null, new a(this.f3702g, bVar, null), 3, null);
                    z4 = true;
                }
            } else if (this.f3697b && l0.b(keyEvent)) {
                m.b remove = this.f3698c.remove(androidx.compose.ui.input.key.b.B4(androidx.compose.ui.input.key.e.a(keyEvent)));
                if (remove != null) {
                    kotlinx.coroutines.k.f(this.f3700e, null, null, new b(this.f3702g, remove, null), 3, null);
                }
                this.f3701f.invoke();
                z4 = true;
            }
            return Boolean.valueOf(z4);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ Boolean invoke(androidx.compose.ui.input.key.c cVar) {
            return a(cVar.h());
        }
    }

    /* compiled from: Clickable.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.ClickableKt$handlePressInteraction$2", f = "Clickable.kt", i = {0, 1, 2}, l = {307, 309, w.a.f22419q, w.a.f22420r, 326}, m = "invokeSuspend", n = {"delayJob", "success", "release"}, s = {"L$0", "Z$0", "L$0"})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
    static final class h extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super kotlin.k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        boolean f3709b;

        /* renamed from: c, reason: collision with root package name */
        int f3710c;

        /* renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f3711d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.gestures.l0 f3712e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f3713f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.k f3714g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ a.C0051a f3715h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ ld.a<Boolean> f3716i;

        /* compiled from: Clickable.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.ClickableKt$handlePressInteraction$2$delayJob$1", f = "Clickable.kt", i = {1}, l = {301, 304}, m = "invokeSuspend", n = {"press"}, s = {"L$0"})
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super kotlin.k2>, Object> {

            /* renamed from: b, reason: collision with root package name */
            Object f3717b;

            /* renamed from: c, reason: collision with root package name */
            int f3718c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ ld.a<Boolean> f3719d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ long f3720e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ androidx.compose.foundation.interaction.k f3721f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ a.C0051a f3722g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(ld.a<Boolean> aVar, long j4, androidx.compose.foundation.interaction.k kVar, a.C0051a c0051a, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f3719d = aVar;
                this.f3720e = j4;
                this.f3721f = kVar;
                this.f3722g = c0051a;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.l
            public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                return new a(this.f3719d, this.f3720e, this.f3721f, this.f3722g, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                m.b bVar;
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                int i4 = this.f3718c;
                if (i4 == 0) {
                    kotlin.a1.n(obj);
                    if (this.f3719d.invoke().booleanValue()) {
                        long a5 = l0.a();
                        this.f3718c = 1;
                        if (kotlinx.coroutines.c1.b(a5, this) == aVar) {
                            return aVar;
                        }
                    }
                } else {
                    if (i4 != 1) {
                        if (i4 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bVar = (m.b) this.f3717b;
                        kotlin.a1.n(obj);
                        this.f3722g.e(bVar);
                        return kotlin.k2.f75408a;
                    }
                    kotlin.a1.n(obj);
                }
                m.b bVar2 = new m.b(this.f3720e, null);
                androidx.compose.foundation.interaction.k kVar = this.f3721f;
                this.f3717b = bVar2;
                this.f3718c = 2;
                if (kVar.a(bVar2, this) == aVar) {
                    return aVar;
                }
                bVar = bVar2;
                this.f3722g.e(bVar);
                return kotlin.k2.f75408a;
            }

            @Override // ld.p
            @fg.m
            public final Object invoke(@fg.l kotlinx.coroutines.r0 r0Var, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
                return ((a) create(r0Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(androidx.compose.foundation.gestures.l0 l0Var, long j4, androidx.compose.foundation.interaction.k kVar, a.C0051a c0051a, ld.a<Boolean> aVar, kotlin.coroutines.d<? super h> dVar) {
            super(2, dVar);
            this.f3712e = l0Var;
            this.f3713f = j4;
            this.f3714g = kVar;
            this.f3715h = c0051a;
            this.f3716i = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            h hVar = new h(this.f3712e, this.f3713f, this.f3714g, this.f3715h, this.f3716i, dVar);
            hVar.f3711d = obj;
            return hVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x00af A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0089  */
        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@fg.l java.lang.Object r18) {
            /*
                Method dump skipped, instructions count: 218
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.g0.h.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // ld.p
        @fg.m
        public final Object invoke(@fg.l kotlinx.coroutines.r0 r0Var, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
            return ((h) create(r0Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
        }
    }

    @fg.l
    @z0
    public static final n0 a(@fg.l ld.a<kotlin.k2> aVar, @fg.m String str, @fg.m ld.a<kotlin.k2> aVar2, @fg.m ld.a<kotlin.k2> aVar3, @fg.l androidx.compose.foundation.interaction.k kVar, boolean z4, @fg.m String str2, @fg.m androidx.compose.ui.semantics.i iVar) {
        return new o0(aVar, str, aVar2, aVar3, kVar, z4, str2, iVar, null);
    }

    @fg.l
    public static final androidx.compose.ui.q c(@fg.l androidx.compose.ui.q qVar, @fg.l androidx.compose.foundation.interaction.k kVar, @fg.m n1 n1Var, boolean z4, @fg.m String str, @fg.m androidx.compose.ui.semantics.i iVar, @fg.l ld.a<kotlin.k2> aVar) {
        return androidx.compose.ui.platform.y1.d(qVar, androidx.compose.ui.platform.y1.e() ? new b(kVar, n1Var, z4, str, iVar, aVar) : androidx.compose.ui.platform.y1.b(), FocusableKt.d(k1.a(p1.b(androidx.compose.ui.q.INSTANCE, kVar, n1Var), kVar, z4), z4, kVar).w3(new ClickableElement(kVar, z4, str, iVar, aVar, null)));
    }

    public static /* synthetic */ androidx.compose.ui.q d(androidx.compose.ui.q qVar, androidx.compose.foundation.interaction.k kVar, n1 n1Var, boolean z4, String str, androidx.compose.ui.semantics.i iVar, ld.a aVar, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            z4 = true;
        }
        return c(qVar, kVar, n1Var, z4, (i4 & 8) != 0 ? null : str, (i4 & 16) != 0 ? null : iVar, aVar);
    }

    @fg.l
    public static final androidx.compose.ui.q e(@fg.l androidx.compose.ui.q qVar, boolean z4, @fg.m String str, @fg.m androidx.compose.ui.semantics.i iVar, @fg.l ld.a<kotlin.k2> aVar) {
        return androidx.compose.ui.i.e(qVar, androidx.compose.ui.platform.y1.e() ? new c(z4, str, iVar, aVar) : androidx.compose.ui.platform.y1.b(), new a(z4, str, iVar, aVar));
    }

    public static /* synthetic */ androidx.compose.ui.q f(androidx.compose.ui.q qVar, boolean z4, String str, androidx.compose.ui.semantics.i iVar, ld.a aVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z4 = true;
        }
        if ((i4 & 2) != 0) {
            str = null;
        }
        if ((i4 & 4) != 0) {
            iVar = null;
        }
        return e(qVar, z4, str, iVar, aVar);
    }

    @fg.l
    @z0
    public static final androidx.compose.ui.q g(@fg.l androidx.compose.ui.q qVar, @fg.l androidx.compose.foundation.interaction.k kVar, @fg.m n1 n1Var, boolean z4, @fg.m String str, @fg.m androidx.compose.ui.semantics.i iVar, @fg.m String str2, @fg.m ld.a<kotlin.k2> aVar, @fg.m ld.a<kotlin.k2> aVar2, @fg.l ld.a<kotlin.k2> aVar3) {
        return androidx.compose.ui.platform.y1.d(qVar, androidx.compose.ui.platform.y1.e() ? new e(n1Var, kVar, z4, str, iVar, aVar3, aVar2, aVar, str2) : androidx.compose.ui.platform.y1.b(), FocusableKt.d(k1.a(p1.b(androidx.compose.ui.q.INSTANCE, kVar, n1Var), kVar, z4), z4, kVar).w3(new CombinedClickableElement(kVar, z4, str, iVar, aVar3, str2, aVar, aVar2, null)));
    }

    @fg.l
    @z0
    public static final androidx.compose.ui.q i(@fg.l androidx.compose.ui.q qVar, boolean z4, @fg.m String str, @fg.m androidx.compose.ui.semantics.i iVar, @fg.m String str2, @fg.m ld.a<kotlin.k2> aVar, @fg.m ld.a<kotlin.k2> aVar2, @fg.l ld.a<kotlin.k2> aVar3) {
        return androidx.compose.ui.i.e(qVar, androidx.compose.ui.platform.y1.e() ? new f(z4, str, iVar, aVar3, aVar2, aVar, str2) : androidx.compose.ui.platform.y1.b(), new d(z4, str, iVar, str2, aVar, aVar2, aVar3));
    }

    @fg.l
    public static final androidx.compose.ui.q k(@fg.l androidx.compose.ui.q qVar, @fg.l androidx.compose.foundation.interaction.k kVar, @fg.m n1 n1Var, @fg.l kotlinx.coroutines.r0 r0Var, @fg.l Map<androidx.compose.ui.input.key.b, m.b> map, @fg.l b5<i0.f> b5Var, boolean z4, @fg.m String str, @fg.m androidx.compose.ui.semantics.i iVar, @fg.m String str2, @fg.m ld.a<kotlin.k2> aVar, @fg.l ld.a<kotlin.k2> aVar2) {
        return qVar.w3(FocusableKt.d(k1.a(p1.b(m(new ClickableSemanticsElement(z4, iVar, str2, aVar, str, aVar2, null), z4, map, b5Var, r0Var, aVar2, kVar), kVar, n1Var), kVar, z4), z4, kVar));
    }

    private static final androidx.compose.ui.q m(androidx.compose.ui.q qVar, boolean z4, Map<androidx.compose.ui.input.key.b, m.b> map, b5<i0.f> b5Var, kotlinx.coroutines.r0 r0Var, ld.a<kotlin.k2> aVar, androidx.compose.foundation.interaction.k kVar) {
        return androidx.compose.ui.input.key.f.a(qVar, new g(z4, map, b5Var, r0Var, aVar, kVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object n(androidx.compose.foundation.gestures.l0 l0Var, long j4, androidx.compose.foundation.interaction.k kVar, a.C0051a c0051a, ld.a<Boolean> aVar, kotlin.coroutines.d<? super kotlin.k2> dVar) {
        Object g4 = kotlinx.coroutines.s0.g(new h(l0Var, j4, kVar, c0051a, aVar, null), dVar);
        return g4 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? g4 : kotlin.k2.f75408a;
    }
}
