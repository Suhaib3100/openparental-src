package androidx.compose.foundation.text;

import androidx.compose.runtime.b5;
import androidx.compose.runtime.o4;
import androidx.compose.ui.platform.a2;
import androidx.compose.ui.platform.y1;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.r1;
import kotlin.k2;

/* compiled from: TextFieldScroll.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a1\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a;\u0010\u0010\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u000e\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\rH\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a=\u0010\u001c\u001a\u00020\u001b*\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Landroidx/compose/ui/q;", "Landroidx/compose/foundation/text/z0;", "scrollerPosition", "Landroidx/compose/foundation/interaction/k;", "interactionSource", "", "enabled", "d", "(Landroidx/compose/ui/q;Landroidx/compose/foundation/text/z0;Landroidx/compose/foundation/interaction/k;Z)Landroidx/compose/ui/q;", "Landroidx/compose/ui/text/input/z0;", "textFieldValue", "Landroidx/compose/ui/text/input/k1;", "visualTransformation", "Lkotlin/Function0;", "Landroidx/compose/foundation/text/e1;", "textLayoutResultProvider", "c", "(Landroidx/compose/ui/q;Landroidx/compose/foundation/text/z0;Landroidx/compose/ui/text/input/z0;Landroidx/compose/ui/text/input/k1;Lld/a;)Landroidx/compose/ui/q;", "Landroidx/compose/ui/unit/d;", "", "cursorOffset", "Landroidx/compose/ui/text/input/i1;", "transformedText", "Landroidx/compose/ui/text/n0;", "textLayoutResult", "rtl", "textFieldWidth", "Li0/i;", "b", "(Landroidx/compose/ui/unit/d;ILandroidx/compose/ui/text/input/i1;Landroidx/compose/ui/text/n0;ZI)Li0/i;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nTextFieldScroll.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldScroll.kt\nandroidx/compose/foundation/text/TextFieldScrollKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,371:1\n135#2:372\n*S KotlinDebug\n*F\n+ 1 TextFieldScroll.kt\nandroidx/compose/foundation/text/TextFieldScrollKt\n*L\n61#1:372\n*E\n"})
/* loaded from: classes.dex */
public final class y0 {

    /* compiled from: TextFieldScroll.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f8319a;

        static {
            int[] iArr = new int[androidx.compose.foundation.gestures.j0.values().length];
            try {
                iArr[androidx.compose.foundation.gestures.j0.Vertical.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[androidx.compose.foundation.gestures.j0.Horizontal.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f8319a = iArr;
        }
    }

    /* compiled from: InspectableValue.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/platform/a2;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/platform/a2;)V", "androidx/compose/ui/platform/y1$b"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 TextFieldScroll.kt\nandroidx/compose/foundation/text/TextFieldScrollKt\n*L\n1#1,170:1\n62#2,5:171\n*E\n"})
    public static final class b extends kotlin.jvm.internal.n0 implements ld.l<a2, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ z0 f8320b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.k f8321c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f8322d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(z0 z0Var, androidx.compose.foundation.interaction.k kVar, boolean z4) {
            super(1);
            this.f8320b = z0Var;
            this.f8321c = kVar;
            this.f8322d = z4;
        }

        public final void a(@fg.l a2 a2Var) {
            a2Var.d("textFieldScrollable");
            a2Var.getProperties().c("scrollerPosition", this.f8320b);
            a2Var.getProperties().c("interactionSource", this.f8321c);
            a2Var.getProperties().c("enabled", Boolean.valueOf(this.f8322d));
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(a2 a2Var) {
            a(a2Var);
            return k2.f75408a;
        }
    }

    /* compiled from: TextFieldScroll.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/q;", "a", "(Landroidx/compose/ui/q;Landroidx/compose/runtime/t;I)Landroidx/compose/ui/q;"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nTextFieldScroll.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldScroll.kt\nandroidx/compose/foundation/text/TextFieldScrollKt$textFieldScrollable$2\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,371:1\n74#2:372\n1116#3,6:373\n1116#3,6:381\n50#4:379\n49#4:380\n*S KotlinDebug\n*F\n+ 1 TextFieldScroll.kt\nandroidx/compose/foundation/text/TextFieldScrollKt$textFieldScrollable$2\n*L\n69#1:372\n71#1:373,6\n84#1:381,6\n84#1:379\n84#1:380\n*E\n"})
    static final class c extends kotlin.jvm.internal.n0 implements ld.q<androidx.compose.ui.q, androidx.compose.runtime.t, Integer, androidx.compose.ui.q> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ z0 f8323b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f8324c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.k f8325d;

        /* compiled from: TextFieldScroll.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "delta", "a", "(F)Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.jvm.internal.n0 implements ld.l<Float, Float> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ z0 f8326b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(z0 z0Var) {
                super(1);
                this.f8326b = z0Var;
            }

            @fg.l
            public final Float a(float f4) {
                float d5 = this.f8326b.d() + f4;
                if (d5 > this.f8326b.c()) {
                    f4 = this.f8326b.c() - this.f8326b.d();
                } else if (d5 < 0.0f) {
                    f4 = -this.f8326b.d();
                }
                z0 z0Var = this.f8326b;
                z0Var.i(z0Var.d() + f4);
                return Float.valueOf(f4);
            }

            @Override // ld.l
            public /* bridge */ /* synthetic */ Float invoke(Float f4) {
                return a(f4.floatValue());
            }
        }

        /* compiled from: TextFieldScroll.kt */
        @Metadata(d1 = {"\u0000;\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0096\u0001¢\u0006\u0004\b\u0004\u0010\u0005JC\u0010\u000f\u001a\u00020\u000b2\b\b\u0002\u0010\u0007\u001a\u00020\u00062'\u0010\u000e\u001a#\b\u0001\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\b¢\u0006\u0002\b\rH\u0096A¢\u0006\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0015\u001a\u00020\u00118VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0018\u001a\u00020\u00118VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0012\u001a\u0004\b\u0017\u0010\u0014R\u0014\u0010\u001a\u001a\u00020\u00118\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0014¨\u0006\u001b"}, d2 = {"androidx/compose/foundation/text/y0$c$b", "Landroidx/compose/foundation/gestures/w0;", "", "delta", "b", "(F)F", "Landroidx/compose/foundation/a2;", "scrollPriority", "Lkotlin/Function2;", "Landroidx/compose/foundation/gestures/q0;", "Lkotlin/coroutines/d;", "Lkotlin/k2;", "", "Lkotlin/u;", "block", "f", "(Landroidx/compose/foundation/a2;Lld/p;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "Landroidx/compose/runtime/b5;", "a", "()Z", "canScrollForward", "c", "e", "canScrollBackward", "d", "isScrollInProgress", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        @r1({"SMAP\nTextFieldScroll.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldScroll.kt\nandroidx/compose/foundation/text/TextFieldScrollKt$textFieldScrollable$2$wrappedScrollableState$1$1\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,371:1\n81#2:372\n81#2:373\n*S KotlinDebug\n*F\n+ 1 TextFieldScroll.kt\nandroidx/compose/foundation/text/TextFieldScrollKt$textFieldScrollable$2$wrappedScrollableState$1$1\n*L\n86#1:372\n89#1:373\n*E\n"})
        public static final class b implements androidx.compose.foundation.gestures.w0 {

            /* renamed from: a, reason: collision with root package name */
            private final /* synthetic */ androidx.compose.foundation.gestures.w0 f8327a;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata */
            @fg.l
            private final b5 canScrollForward;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata */
            @fg.l
            private final b5 canScrollBackward;

            /* compiled from: TextFieldScroll.kt */
            @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
            static final class a extends kotlin.jvm.internal.n0 implements ld.a<Boolean> {

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ z0 f8330b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(z0 z0Var) {
                    super(0);
                    this.f8330b = z0Var;
                }

                @Override // ld.a
                @fg.l
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Boolean invoke() {
                    return Boolean.valueOf(this.f8330b.d() > 0.0f);
                }
            }

            /* compiled from: TextFieldScroll.kt */
            @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
            /* renamed from: androidx.compose.foundation.text.y0$c$b$b, reason: collision with other inner class name */
            static final class C0171b extends kotlin.jvm.internal.n0 implements ld.a<Boolean> {

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ z0 f8331b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0171b(z0 z0Var) {
                    super(0);
                    this.f8331b = z0Var;
                }

                @Override // ld.a
                @fg.l
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Boolean invoke() {
                    return Boolean.valueOf(this.f8331b.d() < this.f8331b.c());
                }
            }

            b(androidx.compose.foundation.gestures.w0 w0Var, z0 z0Var) {
                this.f8327a = w0Var;
                this.canScrollForward = o4.e(new C0171b(z0Var));
                this.canScrollBackward = o4.e(new a(z0Var));
            }

            @Override // androidx.compose.foundation.gestures.w0
            public boolean a() {
                return ((Boolean) this.canScrollForward.getValue()).booleanValue();
            }

            @Override // androidx.compose.foundation.gestures.w0
            public float b(float delta) {
                return this.f8327a.b(delta);
            }

            @Override // androidx.compose.foundation.gestures.w0
            public boolean d() {
                return this.f8327a.d();
            }

            @Override // androidx.compose.foundation.gestures.w0
            public boolean e() {
                return ((Boolean) this.canScrollBackward.getValue()).booleanValue();
            }

            @Override // androidx.compose.foundation.gestures.w0
            @fg.m
            public Object f(@fg.l androidx.compose.foundation.a2 a2Var, @fg.l ld.p<? super androidx.compose.foundation.gestures.q0, ? super kotlin.coroutines.d<? super k2>, ? extends Object> pVar, @fg.l kotlin.coroutines.d<? super k2> dVar) {
                return this.f8327a.f(a2Var, pVar, dVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(z0 z0Var, boolean z4, androidx.compose.foundation.interaction.k kVar) {
            super(3);
            this.f8323b = z0Var;
            this.f8324c = z4;
            this.f8325d = kVar;
        }

        @Override // ld.q
        public /* bridge */ /* synthetic */ androidx.compose.ui.q R(androidx.compose.ui.q qVar, androidx.compose.runtime.t tVar, Integer num) {
            return a(qVar, tVar, num.intValue());
        }

        @fg.l
        @androidx.compose.runtime.i
        public final androidx.compose.ui.q a(@fg.l androidx.compose.ui.q qVar, @fg.m androidx.compose.runtime.t tVar, int i4) {
            tVar.P(805428266);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(805428266, i4, -1, "androidx.compose.foundation.text.textFieldScrollable.<anonymous> (TextFieldScroll.kt:68)");
            }
            boolean z4 = this.f8323b.f() == androidx.compose.foundation.gestures.j0.Vertical || !(tVar.x(androidx.compose.ui.platform.h1.p()) == androidx.compose.ui.unit.w.Rtl);
            tVar.P(1235672980);
            boolean q02 = tVar.q0(this.f8323b);
            z0 z0Var = this.f8323b;
            Object Q = tVar.Q();
            if (q02 || Q == androidx.compose.runtime.t.INSTANCE.a()) {
                Q = new a(z0Var);
                tVar.E(Q);
            }
            tVar.p0();
            androidx.compose.foundation.gestures.w0 b5 = androidx.compose.foundation.gestures.x0.b((ld.l) Q, tVar, 0);
            z0 z0Var2 = this.f8323b;
            tVar.P(511388516);
            boolean q03 = tVar.q0(b5) | tVar.q0(z0Var2);
            Object Q2 = tVar.Q();
            if (q03 || Q2 == androidx.compose.runtime.t.INSTANCE.a()) {
                Q2 = new b(b5, z0Var2);
                tVar.E(Q2);
            }
            tVar.p0();
            androidx.compose.ui.q m4 = androidx.compose.foundation.gestures.t0.m(androidx.compose.ui.q.INSTANCE, (b) Q2, this.f8323b.f(), this.f8324c && this.f8323b.c() != 0.0f, z4, null, this.f8325d, 16, null);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
            tVar.p0();
            return m4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0.i b(androidx.compose.ui.unit.d dVar, int i4, androidx.compose.ui.text.input.i1 i1Var, androidx.compose.ui.text.n0 n0Var, boolean z4, int i5) {
        i0.i iVar;
        if (n0Var == null || (iVar = n0Var.e(i1Var.getOffsetMapping().b(i4))) == null) {
            i0.i.INSTANCE.getClass();
            iVar = i0.i.f74153g;
        }
        i0.i iVar2 = iVar;
        int q22 = dVar.q2(p0.c());
        return i0.i.h(iVar2, z4 ? (i5 - iVar2.t()) - q22 : iVar2.t(), 0.0f, z4 ? i5 - iVar2.t() : iVar2.t() + q22, 0.0f, 10, null);
    }

    @fg.l
    public static final androidx.compose.ui.q c(@fg.l androidx.compose.ui.q qVar, @fg.l z0 z0Var, @fg.l androidx.compose.ui.text.input.z0 z0Var2, @fg.l androidx.compose.ui.text.input.k1 k1Var, @fg.l ld.a<e1> aVar) {
        androidx.compose.ui.q o1Var;
        androidx.compose.foundation.gestures.j0 f4 = z0Var.f();
        int e4 = z0Var.e(z0Var2.getSelection());
        z0Var.k(z0Var2.getSelection());
        androidx.compose.ui.text.input.i1 a5 = n1.a(k1Var, z0Var2.getAnnotatedString());
        int i4 = a.f8319a[f4.ordinal()];
        if (i4 == 1) {
            o1Var = new o1(z0Var, e4, a5, aVar);
        } else {
            if (i4 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            o1Var = new s(z0Var, e4, a5, aVar);
        }
        return androidx.compose.ui.draw.h.b(qVar).w3(o1Var);
    }

    @fg.l
    public static final androidx.compose.ui.q d(@fg.l androidx.compose.ui.q qVar, @fg.l z0 z0Var, @fg.m androidx.compose.foundation.interaction.k kVar, boolean z4) {
        return androidx.compose.ui.i.e(qVar, y1.e() ? new b(z0Var, kVar, z4) : y1.b(), new c(z0Var, z4, kVar));
    }

    public static /* synthetic */ androidx.compose.ui.q e(androidx.compose.ui.q qVar, z0 z0Var, androidx.compose.foundation.interaction.k kVar, boolean z4, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            kVar = null;
        }
        if ((i4 & 4) != 0) {
            z4 = true;
        }
        return d(qVar, z0Var, kVar, z4);
    }
}
