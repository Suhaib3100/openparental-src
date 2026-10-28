package androidx.compose.foundation.text;

import androidx.collection.q2;
import androidx.compose.foundation.layout.c2;
import androidx.compose.runtime.b5;
import androidx.compose.ui.platform.a2;
import androidx.compose.ui.platform.y1;
import androidx.compose.ui.q;
import androidx.compose.ui.text.font.y;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;
import kotlin.k2;

/* compiled from: HeightInLinesModifier.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0002\u001a/\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\t\u0010\n\"\u0014\u0010\f\u001a\u00020\u00038\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0006\u0010\u000b¨\u0006\u000f²\u0006\f\u0010\u000e\u001a\u00020\r8\nX\u008a\u0084\u0002"}, d2 = {"Landroidx/compose/ui/q;", "Landroidx/compose/ui/text/v0;", "textStyle", "", "minLines", "maxLines", "a", "(Landroidx/compose/ui/q;Landroidx/compose/ui/text/v0;II)Landroidx/compose/ui/q;", "Lkotlin/k2;", "c", "(II)V", "I", "DefaultMinLines", "", "typeface", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nHeightInLinesModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HeightInLinesModifier.kt\nandroidx/compose/foundation/text/HeightInLinesModifierKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,135:1\n135#2:136\n*S KotlinDebug\n*F\n+ 1 HeightInLinesModifier.kt\nandroidx/compose/foundation/text/HeightInLinesModifierKt\n*L\n53#1:136\n*E\n"})
/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public static final int f7866a = 1;

    /* compiled from: InspectableValue.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/platform/a2;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/platform/a2;)V", "androidx/compose/ui/platform/y1$b"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 HeightInLinesModifier.kt\nandroidx/compose/foundation/text/HeightInLinesModifierKt\n*L\n1#1,170:1\n54#2,5:171\n*E\n"})
    public static final class a extends kotlin.jvm.internal.n0 implements ld.l<a2, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f7867b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f7868c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.text.v0 f7869d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i4, int i5, androidx.compose.ui.text.v0 v0Var) {
            super(1);
            this.f7867b = i4;
            this.f7868c = i5;
            this.f7869d = v0Var;
        }

        public final void a(@fg.l a2 a2Var) {
            a2Var.d("heightInLines");
            a2Var.getProperties().c("minLines", Integer.valueOf(this.f7867b));
            a2Var.getProperties().c("maxLines", Integer.valueOf(this.f7868c));
            a2Var.getProperties().c("textStyle", this.f7869d);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(a2 a2Var) {
            a(a2Var);
            return k2.f75408a;
        }
    }

    /* compiled from: HeightInLinesModifier.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/q;", "a", "(Landroidx/compose/ui/q;Landroidx/compose/runtime/t;I)Landroidx/compose/ui/q;"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nHeightInLinesModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HeightInLinesModifier.kt\nandroidx/compose/foundation/text/HeightInLinesModifierKt$heightInLines$2\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,135:1\n74#2:136\n74#2:137\n74#2:138\n50#3:139\n49#3:140\n50#3:147\n49#3:148\n83#3,3:155\n83#3,3:164\n1116#4,6:141\n1116#4,6:149\n1116#4,6:158\n1116#4,6:167\n81#5:173\n*S KotlinDebug\n*F\n+ 1 HeightInLinesModifier.kt\nandroidx/compose/foundation/text/HeightInLinesModifierKt$heightInLines$2\n*L\n63#1:136\n64#1:137\n65#1:138\n69#1:139\n69#1:140\n72#1:147\n72#1:148\n81#1:155,3\n97#1:164,3\n69#1:141,6\n72#1:149,6\n81#1:158,6\n97#1:167,6\n72#1:173\n*E\n"})
    static final class b extends kotlin.jvm.internal.n0 implements ld.q<androidx.compose.ui.q, androidx.compose.runtime.t, Integer, androidx.compose.ui.q> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f7870b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f7871c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.text.v0 f7872d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i4, int i5, androidx.compose.ui.text.v0 v0Var) {
            super(3);
            this.f7870b = i4;
            this.f7871c = i5;
            this.f7872d = v0Var;
        }

        private static final Object b(b5<? extends Object> b5Var) {
            return b5Var.getValue();
        }

        @Override // ld.q
        public /* bridge */ /* synthetic */ androidx.compose.ui.q R(androidx.compose.ui.q qVar, androidx.compose.runtime.t tVar, Integer num) {
            return a(qVar, tVar, num.intValue());
        }

        @fg.l
        @androidx.compose.runtime.i
        public final androidx.compose.ui.q a(@fg.l androidx.compose.ui.q qVar, @fg.m androidx.compose.runtime.t tVar, int i4) {
            int i5;
            int i6;
            float f4;
            float f5;
            tVar.P(408240218);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(408240218, i4, -1, "androidx.compose.foundation.text.heightInLines.<anonymous> (HeightInLinesModifier.kt:59)");
            }
            r.c(this.f7870b, this.f7871c);
            if (this.f7870b == 1 && this.f7871c == Integer.MAX_VALUE) {
                q.Companion companion = androidx.compose.ui.q.INSTANCE;
                if (androidx.compose.runtime.x.b0()) {
                    androidx.compose.runtime.x.q0();
                }
                tVar.p0();
                return companion;
            }
            androidx.compose.ui.unit.d dVar = (androidx.compose.ui.unit.d) tVar.x(androidx.compose.ui.platform.h1.i());
            y.b bVar = (y.b) tVar.x(androidx.compose.ui.platform.h1.k());
            androidx.compose.ui.unit.w wVar = (androidx.compose.ui.unit.w) tVar.x(androidx.compose.ui.platform.h1.p());
            androidx.compose.ui.text.v0 v0Var = this.f7872d;
            tVar.P(511388516);
            boolean q02 = tVar.q0(v0Var) | tVar.q0(wVar);
            Object Q = tVar.Q();
            if (q02 || Q == androidx.compose.runtime.t.INSTANCE.a()) {
                Q = androidx.compose.ui.text.w0.d(v0Var, wVar);
                tVar.E(Q);
            }
            tVar.p0();
            androidx.compose.ui.text.v0 v0Var2 = (androidx.compose.ui.text.v0) Q;
            tVar.P(511388516);
            boolean q03 = tVar.q0(bVar) | tVar.q0(v0Var2);
            Object Q2 = tVar.Q();
            if (q03 || Q2 == androidx.compose.runtime.t.INSTANCE.a()) {
                androidx.compose.ui.text.font.y v4 = v0Var2.v();
                androidx.compose.ui.text.font.o0 A = v0Var2.A();
                if (A == null) {
                    androidx.compose.ui.text.font.o0.INSTANCE.getClass();
                    A = androidx.compose.ui.text.font.o0.f20834q;
                }
                androidx.compose.ui.text.font.k0 y4 = v0Var2.y();
                if (y4 != null) {
                    i5 = y4.j();
                } else {
                    androidx.compose.ui.text.font.k0.INSTANCE.getClass();
                    i5 = androidx.compose.ui.text.font.k0.f20754c;
                }
                androidx.compose.ui.text.font.l0 z4 = v0Var2.z();
                if (z4 != null) {
                    i6 = z4.getValue();
                } else {
                    androidx.compose.ui.text.font.l0.INSTANCE.getClass();
                    i6 = androidx.compose.ui.text.font.l0.f20760d;
                }
                Q2 = bVar.b(v4, A, i5, i6);
                tVar.E(Q2);
            }
            tVar.p0();
            b5 b5Var = (b5) Q2;
            Object[] objArr = {dVar, bVar, this.f7872d, wVar, b5Var.getValue()};
            tVar.P(-568225417);
            boolean z5 = false;
            for (int i7 = 0; i7 < 5; i7++) {
                z5 |= tVar.q0(objArr[i7]);
            }
            Object Q3 = tVar.Q();
            if (z5 || Q3 == androidx.compose.runtime.t.INSTANCE.a()) {
                Q3 = Integer.valueOf(androidx.compose.ui.unit.u.j(r0.a(v0Var2, dVar, bVar, r0.c(), 1)));
                tVar.E(Q3);
            }
            tVar.p0();
            int intValue = ((Number) Q3).intValue();
            Object[] objArr2 = {dVar, bVar, this.f7872d, wVar, b5Var.getValue()};
            tVar.P(-568225417);
            boolean z6 = false;
            for (int i10 = 0; i10 < 5; i10++) {
                z6 |= tVar.q0(objArr2[i10]);
            }
            Object Q4 = tVar.Q();
            if (z6 || Q4 == androidx.compose.runtime.t.INSTANCE.a()) {
                Q4 = Integer.valueOf(androidx.compose.ui.unit.u.j(r0.a(v0Var2, dVar, bVar, r0.c() + '\n' + r0.c(), 2)));
                tVar.E(Q4);
            }
            tVar.p0();
            int intValue2 = ((Number) Q4).intValue() - intValue;
            int i11 = this.f7870b;
            Integer valueOf = i11 == 1 ? null : Integer.valueOf(((i11 - 1) * intValue2) + intValue);
            int i12 = this.f7871c;
            Integer valueOf2 = i12 != Integer.MAX_VALUE ? Integer.valueOf(((i12 - 1) * intValue2) + intValue) : null;
            q.Companion companion2 = androidx.compose.ui.q.INSTANCE;
            if (valueOf != null) {
                f4 = dVar.R(valueOf.intValue());
            } else {
                androidx.compose.ui.unit.h.INSTANCE.getClass();
                f4 = androidx.compose.ui.unit.h.f21501f;
            }
            if (valueOf2 != null) {
                f5 = dVar.R(valueOf2.intValue());
            } else {
                androidx.compose.ui.unit.h.INSTANCE.getClass();
                f5 = androidx.compose.ui.unit.h.f21501f;
            }
            androidx.compose.ui.q j4 = c2.j(companion2, f4, f5);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
            tVar.p0();
            return j4;
        }
    }

    @fg.l
    public static final androidx.compose.ui.q a(@fg.l androidx.compose.ui.q qVar, @fg.l androidx.compose.ui.text.v0 v0Var, int i4, int i5) {
        return androidx.compose.ui.i.e(qVar, y1.e() ? new a(i4, i5, v0Var) : y1.b(), new b(i4, i5, v0Var));
    }

    public static /* synthetic */ androidx.compose.ui.q b(androidx.compose.ui.q qVar, androidx.compose.ui.text.v0 v0Var, int i4, int i5, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            i4 = 1;
        }
        if ((i6 & 4) != 0) {
            i5 = Integer.MAX_VALUE;
        }
        return a(qVar, v0Var, i4, i5);
    }

    public static final void c(int i4, int i5) {
        if (i4 <= 0 || i5 <= 0) {
            throw new IllegalArgumentException(q2.a("both minLines ", i4, " and maxLines ", i5, " must be greater than zero").toString());
        }
        if (i4 > i5) {
            throw new IllegalArgumentException(q.a("minLines ", i4, " must be less than or equal to maxLines ", i5).toString());
        }
    }
}
