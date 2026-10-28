package androidx.compose.foundation;

import kotlin.Metadata;

/* compiled from: Indication.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a#\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006\"\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\n¨\u0006\f"}, d2 = {"Landroidx/compose/ui/q;", "Landroidx/compose/foundation/interaction/i;", "interactionSource", "Landroidx/compose/foundation/n1;", "indication", "b", "(Landroidx/compose/ui/q;Landroidx/compose/foundation/interaction/i;Landroidx/compose/foundation/n1;)Landroidx/compose/ui/q;", "Landroidx/compose/runtime/a3;", "a", "Landroidx/compose/runtime/a3;", "()Landroidx/compose/runtime/a3;", "LocalIndication", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nIndication.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Indication.kt\nandroidx/compose/foundation/IndicationKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,187:1\n135#2:188\n*S KotlinDebug\n*F\n+ 1 Indication.kt\nandroidx/compose/foundation/IndicationKt\n*L\n115#1:188\n*E\n"})
/* loaded from: classes.dex */
public final class p1 {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private static final androidx.compose.runtime.a3<n1> f6647a = androidx.compose.runtime.f0.f(a.f6648b);

    /* compiled from: Indication.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/foundation/n1;", "a", "()Landroidx/compose/foundation/n1;"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.jvm.internal.n0 implements ld.a<n1> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f6648b = new a(0);

        a() {
            super(0);
        }

        @fg.l
        public final n1 a() {
            return s0.f7002a;
        }

        @Override // ld.a
        public n1 invoke() {
            return s0.f7002a;
        }
    }

    /* compiled from: InspectableValue.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/platform/a2;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/platform/a2;)V", "androidx/compose/ui/platform/y1$b"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Indication.kt\nandroidx/compose/foundation/IndicationKt\n*L\n1#1,170:1\n116#2,4:171\n*E\n"})
    public static final class b extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.platform.a2, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ n1 f6649b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.i f6650c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(n1 n1Var, androidx.compose.foundation.interaction.i iVar) {
            super(1);
            this.f6649b = n1Var;
            this.f6650c = iVar;
        }

        public final void a(@fg.l androidx.compose.ui.platform.a2 a2Var) {
            a2Var.d("indication");
            a2Var.getProperties().c("indication", this.f6649b);
            a2Var.getProperties().c("interactionSource", this.f6650c);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.ui.platform.a2 a2Var) {
            a(a2Var);
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: Indication.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/q;", "a", "(Landroidx/compose/ui/q;Landroidx/compose/runtime/t;I)Landroidx/compose/ui/q;"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nIndication.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Indication.kt\nandroidx/compose/foundation/IndicationKt$indication$2\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,187:1\n36#2:188\n1116#3,6:189\n*S KotlinDebug\n*F\n+ 1 Indication.kt\nandroidx/compose/foundation/IndicationKt$indication$2\n*L\n111#1:188\n111#1:189,6\n*E\n"})
    static final class c extends kotlin.jvm.internal.n0 implements ld.q<androidx.compose.ui.q, androidx.compose.runtime.t, Integer, androidx.compose.ui.q> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ n1 f6651b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.i f6652c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(n1 n1Var, androidx.compose.foundation.interaction.i iVar) {
            super(3);
            this.f6651b = n1Var;
            this.f6652c = iVar;
        }

        @Override // ld.q
        public /* bridge */ /* synthetic */ androidx.compose.ui.q R(androidx.compose.ui.q qVar, androidx.compose.runtime.t tVar, Integer num) {
            return a(qVar, tVar, num.intValue());
        }

        @fg.l
        @androidx.compose.runtime.i
        public final androidx.compose.ui.q a(@fg.l androidx.compose.ui.q qVar, @fg.m androidx.compose.runtime.t tVar, int i4) {
            tVar.P(-353972293);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(-353972293, i4, -1, "androidx.compose.foundation.indication.<anonymous> (Indication.kt:108)");
            }
            n1 n1Var = this.f6651b;
            if (n1Var == null) {
                n1Var = d2.f3611a;
            }
            o1 a5 = n1Var.a(this.f6652c, tVar, 0);
            tVar.P(1157296644);
            boolean q02 = tVar.q0(a5);
            Object Q = tVar.Q();
            if (q02 || Q == androidx.compose.runtime.t.INSTANCE.a()) {
                Q = new q1(a5);
                tVar.E(Q);
            }
            tVar.p0();
            q1 q1Var = (q1) Q;
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
            tVar.p0();
            return q1Var;
        }
    }

    @fg.l
    public static final androidx.compose.runtime.a3<n1> a() {
        return f6647a;
    }

    @fg.l
    public static final androidx.compose.ui.q b(@fg.l androidx.compose.ui.q qVar, @fg.l androidx.compose.foundation.interaction.i iVar, @fg.m n1 n1Var) {
        return androidx.compose.ui.i.e(qVar, androidx.compose.ui.platform.y1.e() ? new b(n1Var, iVar) : androidx.compose.ui.platform.y1.b(), new c(n1Var, iVar));
    }
}
