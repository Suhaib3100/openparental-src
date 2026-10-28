package androidx.compose.material3;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.compose.ui.layout.i1;
import kotlin.Metadata;

/* compiled from: ExposedDropdownMenu.android.kt */
@Metadata(d1 = {"\u0000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aS\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u001c\u0010\n\u001a\u0018\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\b¢\u0006\u0002\b\tH\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a-\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u0011H\u0003¢\u0006\u0004\b\u0013\u0010\u0014\u001a9\u0010\u0018\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00112\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019\u001a)\u0010\u001f\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 \u001a\u0013\u0010!\u001a\u00020\u001a*\u00020\rH\u0002¢\u0006\u0004\b!\u0010\"\u001a\u0015\u0010$\u001a\u00020\u001a*\u0004\u0018\u00010#H\u0002¢\u0006\u0004\b$\u0010%\"\u0014\u0010(\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010'¨\u0006,²\u0006\u0010\u0010)\u001a\u0004\u0018\u00010#8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010*\u001a\u00020\u001d8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010+\u001a\u00020\u001d8\n@\nX\u008a\u008e\u0002"}, d2 = {"", "expanded", "Lkotlin/Function1;", "Lkotlin/k2;", "onExpandedChange", "Landroidx/compose/ui/q;", "modifier", "Landroidx/compose/material3/g5;", "Landroidx/compose/runtime/i;", "Lkotlin/u;", "content", "a", "(ZLld/l;Landroidx/compose/ui/q;Lld/q;Landroidx/compose/runtime/t;II)V", "Landroid/view/View;", "view", "Landroidx/compose/ui/unit/d;", "density", "Lkotlin/Function0;", "onKeyboardVisibilityChange", "h", "(Landroid/view/View;Landroidx/compose/ui/unit/d;Lld/a;Landroidx/compose/runtime/t;I)V", "", "expandedDescription", "collapsedDescription", "v", "(Landroidx/compose/ui/q;ZLld/a;Ljava/lang/String;Ljava/lang/String;)Landroidx/compose/ui/q;", "Li0/i;", "windowBounds", "anchorBounds", "", "verticalMargin", "u", "(Li0/i;Li0/i;I)I", "x", "(Landroid/view/View;)Li0/i;", "Landroidx/compose/ui/layout/u;", "w", "(Landroidx/compose/ui/layout/u;)Li0/i;", "Landroidx/compose/ui/unit/h;", "F", "ExposedDropdownMenuItemHorizontalPadding", "anchorCoordinates", "anchorWidth", "menuMaxHeight", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nExposedDropdownMenu.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExposedDropdownMenu.android.kt\nandroidx/compose/material3/ExposedDropdownMenu_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Strings.android.kt\nandroidx/compose/material3/Strings$Companion\n+ 6 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 7 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 8 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 9 Composer.kt\nandroidx/compose/runtime/Updater\n+ 10 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 11 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n+ 12 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,1091:1\n74#2:1092\n74#2:1093\n74#2:1094\n1#3:1095\n1116#4,6:1096\n1116#4,6:1102\n1116#4,6:1108\n1116#4,6:1114\n1116#4,6:1122\n1116#4,6:1168\n1116#4,6:1174\n1116#4,6:1180\n56#5:1120\n58#5:1121\n68#6,6:1128\n74#6:1162\n78#6:1167\n78#7,11:1134\n91#7:1166\n456#8,8:1145\n464#8,3:1159\n467#8,3:1163\n3737#9,6:1153\n81#10:1186\n107#10,2:1187\n75#11:1189\n108#11,2:1190\n75#11:1192\n108#11,2:1193\n154#12:1195\n*S KotlinDebug\n*F\n+ 1 ExposedDropdownMenu.android.kt\nandroidx/compose/material3/ExposedDropdownMenu_androidKt\n*L\n117#1:1092\n118#1:1093\n119#1:1094\n123#1:1096,6\n124#1:1102,6\n125#1:1108,6\n127#1:1114,6\n131#1:1122,6\n172#1:1168,6\n181#1:1174,6\n194#1:1180,6\n128#1:1120\n129#1:1121\n167#1:1128,6\n167#1:1162\n167#1:1167\n167#1:1134,11\n167#1:1166\n167#1:1145,8\n167#1:1159,3\n167#1:1163,3\n167#1:1153,6\n123#1:1186\n123#1:1187,2\n124#1:1189\n124#1:1190,2\n125#1:1192\n125#1:1193,2\n1090#1:1195\n*E\n"})
/* loaded from: classes.dex */
public final class i5 {

    /* renamed from: a, reason: collision with root package name */
    private static final float f11417a = androidx.compose.ui.unit.h.g(16);

    /* compiled from: ExposedDropdownMenu.android.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.jvm.internal.n0 implements ld.a<kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f11418b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f11419c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.k2<androidx.compose.ui.layout.u> f11420d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.i2 f11421e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(View view, int i4, androidx.compose.runtime.k2<androidx.compose.ui.layout.u> k2Var, androidx.compose.runtime.i2 i2Var) {
            super(0);
            this.f11418b = view;
            this.f11419c = i4;
            this.f11420d = k2Var;
            this.f11421e = i2Var;
        }

        public final void a() {
            this.f11421e.k(i5.u(i5.x(this.f11418b.getRootView()), i5.w(this.f11420d.getValue()), this.f11419c));
        }

        @Override // ld.a
        public /* bridge */ /* synthetic */ kotlin.k2 invoke() {
            a();
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: ExposedDropdownMenu.android.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    static final class b extends kotlin.jvm.internal.n0 implements ld.a<kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f11422b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.focus.a0 f11423c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(boolean z4, androidx.compose.ui.focus.a0 a0Var) {
            super(0);
            this.f11422b = z4;
            this.f11423c = a0Var;
        }

        public final void a() {
            if (this.f11422b) {
                this.f11423c.e();
            }
        }

        @Override // ld.a
        public /* bridge */ /* synthetic */ kotlin.k2 invoke() {
            a();
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: ExposedDropdownMenu.android.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class c extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f11424b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.l<Boolean, kotlin.k2> f11425c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f11426d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ld.q<g5, androidx.compose.runtime.t, Integer, kotlin.k2> f11427e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f11428f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f11429g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(boolean z4, ld.l<? super Boolean, kotlin.k2> lVar, androidx.compose.ui.q qVar, ld.q<? super g5, ? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> qVar2, int i4, int i5) {
            super(2);
            this.f11424b = z4;
            this.f11425c = lVar;
            this.f11426d = qVar;
            this.f11427e = qVar2;
            this.f11428f = i4;
            this.f11429g = i5;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            i5.a(this.f11424b, this.f11425c, this.f11426d, this.f11427e, tVar, androidx.compose.runtime.g3.b(this.f11428f | 1), this.f11429g);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: ExposedDropdownMenu.android.kt */
    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0013\u0010\u0003\u001a\u00020\u0002*\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u001b\u0010\u0007\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"androidx/compose/material3/i5$d", "Landroidx/compose/material3/g5;", "Landroidx/compose/ui/q;", "d", "(Landroidx/compose/ui/q;)Landroidx/compose/ui/q;", "", "matchTextFieldWidth", "b", "(Landroidx/compose/ui/q;Z)Landroidx/compose/ui/q;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class d extends g5 {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f11430b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f11431c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f11432d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.focus.a0 f11433e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ View f11434f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f11435g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.k2<androidx.compose.ui.layout.u> f11436h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.i2 f11437i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.i2 f11438j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ ld.l<Boolean, kotlin.k2> f11439k;

        /* compiled from: ExposedDropdownMenu.android.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroidx/compose/ui/layout/o0;", "Landroidx/compose/ui/layout/l0;", "measurable", "Landroidx/compose/ui/unit/b;", "constraints", "Landroidx/compose/ui/layout/n0;", "a", "(Landroidx/compose/ui/layout/o0;Landroidx/compose/ui/layout/l0;J)Landroidx/compose/ui/layout/n0;"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.jvm.internal.n0 implements ld.q<androidx.compose.ui.layout.o0, androidx.compose.ui.layout.l0, androidx.compose.ui.unit.b, androidx.compose.ui.layout.n0> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ boolean f11440b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ androidx.compose.runtime.i2 f11441c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ androidx.compose.runtime.i2 f11442d;

            /* compiled from: ExposedDropdownMenu.android.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/i1$a;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/layout/i1$a;)V"}, k = 3, mv = {1, 8, 0})
            /* renamed from: androidx.compose.material3.i5$d$a$a, reason: collision with other inner class name */
            static final class C0250a extends kotlin.jvm.internal.n0 implements ld.l<i1.a, kotlin.k2> {

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ androidx.compose.ui.layout.i1 f11443b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0250a(androidx.compose.ui.layout.i1 i1Var) {
                    super(1);
                    this.f11443b = i1Var;
                }

                public final void a(@fg.l i1.a aVar) {
                    i1.a.g(aVar, this.f11443b, 0, 0, 0.0f, 4, null);
                }

                @Override // ld.l
                public /* bridge */ /* synthetic */ kotlin.k2 invoke(i1.a aVar) {
                    a(aVar);
                    return kotlin.k2.f75408a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(boolean z4, androidx.compose.runtime.i2 i2Var, androidx.compose.runtime.i2 i2Var2) {
                super(3);
                this.f11440b = z4;
                this.f11441c = i2Var;
                this.f11442d = i2Var2;
            }

            @Override // ld.q
            public /* bridge */ /* synthetic */ androidx.compose.ui.layout.n0 R(androidx.compose.ui.layout.o0 o0Var, androidx.compose.ui.layout.l0 l0Var, androidx.compose.ui.unit.b bVar) {
                return a(o0Var, l0Var, bVar.getValue());
            }

            @fg.l
            public final androidx.compose.ui.layout.n0 a(@fg.l androidx.compose.ui.layout.o0 o0Var, @fg.l androidx.compose.ui.layout.l0 l0Var, long j4) {
                int g4 = androidx.compose.ui.unit.c.g(j4, i5.k(this.f11441c));
                int f4 = androidx.compose.ui.unit.c.f(j4, this.f11442d.f());
                int r4 = this.f11440b ? g4 : androidx.compose.ui.unit.b.r(j4);
                if (!this.f11440b) {
                    g4 = androidx.compose.ui.unit.b.p(j4);
                }
                androidx.compose.ui.layout.i1 m02 = l0Var.m0(androidx.compose.ui.unit.b.e(j4, r4, g4, 0, f4, 4, null));
                return androidx.compose.ui.layout.o0.x2(o0Var, m02.getWidth(), m02.getHeight(), null, new C0250a(m02), 4, null);
            }
        }

        /* compiled from: ExposedDropdownMenu.android.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/layout/u;", "it", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/layout/u;)V"}, k = 3, mv = {1, 8, 0})
        static final class b extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.layout.u, kotlin.k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ View f11444b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f11445c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ androidx.compose.runtime.k2<androidx.compose.ui.layout.u> f11446d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ androidx.compose.runtime.i2 f11447e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ androidx.compose.runtime.i2 f11448f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(View view, int i4, androidx.compose.runtime.k2<androidx.compose.ui.layout.u> k2Var, androidx.compose.runtime.i2 i2Var, androidx.compose.runtime.i2 i2Var2) {
                super(1);
                this.f11444b = view;
                this.f11445c = i4;
                this.f11446d = k2Var;
                this.f11447e = i2Var;
                this.f11448f = i2Var2;
            }

            public final void a(@fg.l androidx.compose.ui.layout.u uVar) {
                i5.j(this.f11446d, uVar);
                this.f11447e.k(androidx.compose.ui.unit.u.m(uVar.c()));
                this.f11448f.k(i5.u(i5.x(this.f11444b.getRootView()), i5.w(this.f11446d.getValue()), this.f11445c));
            }

            @Override // ld.l
            public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.ui.layout.u uVar) {
                a(uVar);
                return kotlin.k2.f75408a;
            }
        }

        /* compiled from: ExposedDropdownMenu.android.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
        static final class c extends kotlin.jvm.internal.n0 implements ld.a<kotlin.k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ ld.l<Boolean, kotlin.k2> f11449b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ boolean f11450c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            c(ld.l<? super Boolean, kotlin.k2> lVar, boolean z4) {
                super(0);
                this.f11449b = lVar;
                this.f11450c = z4;
            }

            public final void a() {
                this.f11449b.invoke(Boolean.valueOf(!this.f11450c));
            }

            @Override // ld.a
            public /* bridge */ /* synthetic */ kotlin.k2 invoke() {
                a();
                return kotlin.k2.f75408a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        d(boolean z4, String str, String str2, androidx.compose.ui.focus.a0 a0Var, View view, int i4, androidx.compose.runtime.k2<androidx.compose.ui.layout.u> k2Var, androidx.compose.runtime.i2 i2Var, androidx.compose.runtime.i2 i2Var2, ld.l<? super Boolean, kotlin.k2> lVar) {
            this.f11430b = z4;
            this.f11431c = str;
            this.f11432d = str2;
            this.f11433e = a0Var;
            this.f11434f = view;
            this.f11435g = i4;
            this.f11436h = k2Var;
            this.f11437i = i2Var;
            this.f11438j = i2Var2;
            this.f11439k = lVar;
        }

        @Override // androidx.compose.material3.g5
        @fg.l
        public androidx.compose.ui.q b(@fg.l androidx.compose.ui.q qVar, boolean z4) {
            return androidx.compose.ui.layout.d0.a(qVar, new a(z4, this.f11437i, this.f11438j));
        }

        @Override // androidx.compose.material3.g5
        @fg.l
        public androidx.compose.ui.q d(@fg.l androidx.compose.ui.q qVar) {
            androidx.compose.ui.q a5 = androidx.compose.ui.layout.w0.a(qVar, new b(this.f11434f, this.f11435g, this.f11436h, this.f11437i, this.f11438j));
            boolean z4 = this.f11430b;
            return androidx.compose.ui.focus.d0.a(i5.v(a5, z4, new c(this.f11439k, z4), this.f11431c, this.f11432d), this.f11433e);
        }
    }

    /* compiled from: ExposedDropdownMenu.android.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/runtime/w0;", "Landroidx/compose/runtime/v0;", "a", "(Landroidx/compose/runtime/w0;)Landroidx/compose/runtime/v0;"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nExposedDropdownMenu.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExposedDropdownMenu.android.kt\nandroidx/compose/material3/ExposedDropdownMenu_androidKt$SoftKeyboardListener$1$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,1091:1\n64#2,5:1092\n*S KotlinDebug\n*F\n+ 1 ExposedDropdownMenu.android.kt\nandroidx/compose/material3/ExposedDropdownMenu_androidKt$SoftKeyboardListener$1$1\n*L\n221#1:1092,5\n*E\n"})
    static final class e extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.runtime.w0, androidx.compose.runtime.v0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f11451b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.a<kotlin.k2> f11452c;

        /* compiled from: Effects.kt */
        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005¸\u0006\u0000"}, d2 = {"androidx/compose/runtime/w0$a", "Landroidx/compose/runtime/v0;", "Lkotlin/k2;", "dispose", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        @kotlin.jvm.internal.r1({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 ExposedDropdownMenu.android.kt\nandroidx/compose/material3/ExposedDropdownMenu_androidKt$SoftKeyboardListener$1$1\n*L\n1#1,497:1\n221#2:498\n*E\n"})
        public static final class a implements androidx.compose.runtime.v0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ b f11453a;

            public a(b bVar) {
                this.f11453a = bVar;
            }

            @Override // androidx.compose.runtime.v0
            public void dispose() {
                this.f11453a.a();
            }
        }

        /* compiled from: ExposedDropdownMenu.android.kt */
        @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u000f\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0005J\u0017\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\f\u0010\u0005J\r\u0010\r\u001a\u00020\u0003¢\u0006\u0004\b\r\u0010\u0005R\u0016\u0010\u0010\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u000f¨\u0006\u0011"}, d2 = {"androidx/compose/material3/i5$e$b", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "Lkotlin/k2;", "b", "()V", "c", "Landroid/view/View;", "p0", "onViewAttachedToWindow", "(Landroid/view/View;)V", "onViewDetachedFromWindow", "onGlobalLayout", "a", "", "Z", "isListeningToGlobalLayout", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class b implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener {

            /* renamed from: b, reason: collision with root package name and from kotlin metadata */
            private boolean isListeningToGlobalLayout;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ View f11455c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ ld.a<kotlin.k2> f11456d;

            b(View view, ld.a<kotlin.k2> aVar) {
                this.f11455c = view;
                this.f11456d = aVar;
                view.addOnAttachStateChangeListener(this);
                b();
            }

            private final void b() {
                if (this.isListeningToGlobalLayout || !this.f11455c.isAttachedToWindow()) {
                    return;
                }
                this.f11455c.getViewTreeObserver().addOnGlobalLayoutListener(this);
                this.isListeningToGlobalLayout = true;
            }

            private final void c() {
                if (this.isListeningToGlobalLayout) {
                    this.f11455c.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    this.isListeningToGlobalLayout = false;
                }
            }

            public final void a() {
                c();
                this.f11455c.removeOnAttachStateChangeListener(this);
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                this.f11456d.invoke();
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(@fg.l View p02) {
                b();
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(@fg.l View p02) {
                c();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(View view, ld.a<kotlin.k2> aVar) {
            super(1);
            this.f11451b = view;
            this.f11452c = aVar;
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final androidx.compose.runtime.v0 invoke(@fg.l androidx.compose.runtime.w0 w0Var) {
            return new a(new b(this.f11451b, this.f11452c));
        }
    }

    /* compiled from: ExposedDropdownMenu.android.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class f extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f11457b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.unit.d f11458c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ld.a<kotlin.k2> f11459d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f11460e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(View view, androidx.compose.ui.unit.d dVar, ld.a<kotlin.k2> aVar, int i4) {
            super(2);
            this.f11457b = view;
            this.f11458c = dVar;
            this.f11459d = aVar;
            this.f11460e = i4;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            i5.h(this.f11457b, this.f11458c, this.f11459d, tVar, androidx.compose.runtime.g3.b(this.f11460e | 1));
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: ExposedDropdownMenu.android.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.ExposedDropdownMenu_androidKt$expandable$1", f = "ExposedDropdownMenu.android.kt", i = {}, l = {1041}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/k0;", "Lkotlin/k2;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/k0;)V"}, k = 3, mv = {1, 8, 0})
    static final class g extends kotlin.coroutines.jvm.internal.o implements ld.p<androidx.compose.ui.input.pointer.k0, kotlin.coroutines.d<? super kotlin.k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f11461b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f11462c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ld.a<kotlin.k2> f11463d;

        /* compiled from: ExposedDropdownMenu.android.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.ExposedDropdownMenu_androidKt$expandable$1$1", f = "ExposedDropdownMenu.android.kt", i = {0}, l = {1044, 1045}, m = "invokeSuspend", n = {"$this$awaitEachGesture"}, s = {"L$0"})
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/c;", "Lkotlin/k2;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/c;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.coroutines.jvm.internal.k implements ld.p<androidx.compose.ui.input.pointer.c, kotlin.coroutines.d<? super kotlin.k2>, Object> {

            /* renamed from: c, reason: collision with root package name */
            int f11464c;

            /* renamed from: d, reason: collision with root package name */
            private /* synthetic */ Object f11465d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ ld.a<kotlin.k2> f11466e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(ld.a<kotlin.k2> aVar, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f11466e = aVar;
            }

            @Override // ld.p
            @fg.m
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@fg.l androidx.compose.ui.input.pointer.c cVar, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
                return ((a) create(cVar, dVar)).invokeSuspend(kotlin.k2.f75408a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.l
            public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                a aVar = new a(this.f11466e, dVar);
                aVar.f11465d = obj;
                return aVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:8:0x004c  */
            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(@fg.l java.lang.Object r11) {
                /*
                    r10 = this;
                    kotlin.coroutines.intrinsics.a r0 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
                    int r1 = r10.f11464c
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L20
                    if (r1 == r3) goto L18
                    if (r1 != r2) goto L10
                    kotlin.a1.n(r11)
                    goto L48
                L10:
                    java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r11.<init>(r0)
                    throw r11
                L18:
                    java.lang.Object r1 = r10.f11465d
                    androidx.compose.ui.input.pointer.c r1 = (androidx.compose.ui.input.pointer.c) r1
                    kotlin.a1.n(r11)
                    goto L3a
                L20:
                    kotlin.a1.n(r11)
                    java.lang.Object r11 = r10.f11465d
                    r1 = r11
                    androidx.compose.ui.input.pointer.c r1 = (androidx.compose.ui.input.pointer.c) r1
                    androidx.compose.ui.input.pointer.r r6 = androidx.compose.ui.input.pointer.r.Initial
                    r10.f11465d = r1
                    r10.f11464c = r3
                    r5 = 0
                    r8 = 1
                    r9 = 0
                    r4 = r1
                    r7 = r10
                    java.lang.Object r11 = androidx.compose.foundation.gestures.z0.f(r4, r5, r6, r7, r8, r9)
                    if (r11 != r0) goto L3a
                    return r0
                L3a:
                    androidx.compose.ui.input.pointer.r r11 = androidx.compose.ui.input.pointer.r.Initial
                    r3 = 0
                    r10.f11465d = r3
                    r10.f11464c = r2
                    java.lang.Object r11 = androidx.compose.foundation.gestures.z0.n(r1, r11, r10)
                    if (r11 != r0) goto L48
                    return r0
                L48:
                    androidx.compose.ui.input.pointer.b0 r11 = (androidx.compose.ui.input.pointer.b0) r11
                    if (r11 == 0) goto L51
                    ld.a<kotlin.k2> r11 = r10.f11466e
                    r11.invoke()
                L51:
                    kotlin.k2 r11 = kotlin.k2.f75408a
                    return r11
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.i5.g.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(ld.a<kotlin.k2> aVar, kotlin.coroutines.d<? super g> dVar) {
            super(2, dVar);
            this.f11463d = aVar;
        }

        @Override // ld.p
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.l androidx.compose.ui.input.pointer.k0 k0Var, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
            return ((g) create(k0Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            g gVar = new g(this.f11463d, dVar);
            gVar.f11462c = obj;
            return gVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f11461b;
            if (i4 == 0) {
                kotlin.a1.n(obj);
                androidx.compose.ui.input.pointer.k0 k0Var = (androidx.compose.ui.input.pointer.k0) this.f11462c;
                a aVar2 = new a(this.f11463d, null);
                this.f11461b = 1;
                if (androidx.compose.foundation.gestures.f0.d(k0Var, aVar2, this) == aVar) {
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

    /* compiled from: ExposedDropdownMenu.android.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/semantics/z;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/semantics/z;)V"}, k = 3, mv = {1, 8, 0})
    static final class h extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.semantics.z, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f11467b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f11468c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f11469d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ld.a<kotlin.k2> f11470e;

        /* compiled from: ExposedDropdownMenu.android.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.jvm.internal.n0 implements ld.a<Boolean> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ ld.a<kotlin.k2> f11471b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(ld.a<kotlin.k2> aVar) {
                super(0);
                this.f11471b = aVar;
            }

            @Override // ld.a
            @fg.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                this.f11471b.invoke();
                return Boolean.TRUE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(boolean z4, String str, String str2, ld.a<kotlin.k2> aVar) {
            super(1);
            this.f11467b = z4;
            this.f11468c = str;
            this.f11469d = str2;
            this.f11470e = aVar;
        }

        public final void a(@fg.l androidx.compose.ui.semantics.z zVar) {
            androidx.compose.ui.semantics.w.q1(zVar, this.f11467b ? this.f11468c : this.f11469d);
            androidx.compose.ui.semantics.i.INSTANCE.getClass();
            androidx.compose.ui.semantics.w.l1(zVar, androidx.compose.ui.semantics.i.f20315i);
            androidx.compose.ui.semantics.w.x0(zVar, null, new a(this.f11470e), 1, null);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.ui.semantics.z zVar) {
            a(zVar);
            return kotlin.k2.f75408a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0066  */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v3 */
    @androidx.compose.material3.f5
    @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(boolean r26, @fg.l ld.l<? super java.lang.Boolean, kotlin.k2> r27, @fg.m androidx.compose.ui.q r28, @fg.l ld.q<? super androidx.compose.material3.g5, ? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r29, @fg.m androidx.compose.runtime.t r30, int r31, int r32) {
        /*
            Method dump skipped, instructions count: 706
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.i5.a(boolean, ld.l, androidx.compose.ui.q, ld.q, androidx.compose.runtime.t, int, int):void");
    }

    private static final androidx.compose.ui.layout.u b(androidx.compose.runtime.k2<androidx.compose.ui.layout.u> k2Var) {
        return k2Var.getValue();
    }

    private static final void c(androidx.compose.runtime.k2<androidx.compose.ui.layout.u> k2Var, androidx.compose.ui.layout.u uVar) {
        k2Var.setValue(uVar);
    }

    private static final int d(androidx.compose.runtime.i2 i2Var) {
        return i2Var.f();
    }

    private static final void e(androidx.compose.runtime.i2 i2Var, int i4) {
        i2Var.k(i4);
    }

    private static final int f(androidx.compose.runtime.i2 i2Var) {
        return i2Var.f();
    }

    private static final void g(androidx.compose.runtime.i2 i2Var, int i4) {
        i2Var.k(i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.compose.runtime.i
    public static final void h(View view, androidx.compose.ui.unit.d dVar, ld.a<kotlin.k2> aVar, androidx.compose.runtime.t tVar, int i4) {
        int i5;
        androidx.compose.runtime.t o4 = tVar.o(-1319522472);
        if ((i4 & 6) == 0) {
            i5 = (o4.S(view) ? 4 : 2) | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            i5 |= o4.q0(dVar) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i5 |= o4.S(aVar) ? 256 : 128;
        }
        if ((i5 & 147) == 146 && o4.p()) {
            o4.d0();
        } else {
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(-1319522472, i5, -1, "androidx.compose.material3.SoftKeyboardListener (ExposedDropdownMenu.android.kt:190)");
            }
            o4.P(-491766155);
            boolean S = o4.S(view) | ((i5 & 896) == 256);
            Object Q = o4.Q();
            if (S || Q == androidx.compose.runtime.t.INSTANCE.a()) {
                Q = new e(view, aVar);
                o4.E(Q);
            }
            o4.p0();
            androidx.compose.runtime.a1.b(view, dVar, (ld.l) Q, o4, i5 & 126);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }
        androidx.compose.runtime.t3 t4 = o4.t();
        if (t4 != null) {
            t4.a(new f(view, dVar, aVar, i4));
        }
    }

    public static final androidx.compose.ui.layout.u i(androidx.compose.runtime.k2 k2Var) {
        return (androidx.compose.ui.layout.u) k2Var.getValue();
    }

    public static final void j(androidx.compose.runtime.k2 k2Var, androidx.compose.ui.layout.u uVar) {
        k2Var.setValue(uVar);
    }

    public static final int k(androidx.compose.runtime.i2 i2Var) {
        return i2Var.f();
    }

    public static final void l(androidx.compose.runtime.i2 i2Var, int i4) {
        i2Var.k(i4);
    }

    public static final int m(androidx.compose.runtime.i2 i2Var) {
        return i2Var.f();
    }

    public static final void n(androidx.compose.runtime.i2 i2Var, int i4) {
        i2Var.k(i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int u(i0.i iVar, i0.i iVar2, int i4) {
        if (iVar2 == null) {
            return 0;
        }
        float f4 = i4;
        float top2 = iVar.getTop() + f4;
        float j4 = iVar.j() - f4;
        return Math.max((iVar2.getTop() > iVar.j() || iVar2.j() < iVar.getTop()) ? kotlin.math.b.L0(j4 - top2) : kotlin.math.b.L0(Math.max(iVar2.getTop() - top2, j4 - iVar2.j())), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.q v(androidx.compose.ui.q qVar, boolean z4, ld.a<kotlin.k2> aVar, String str, String str2) {
        return androidx.compose.ui.semantics.o.f(androidx.compose.ui.input.pointer.u0.e(qVar, aVar, new g(aVar, null)), false, new h(z4, str, str2, aVar), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0.i w(androidx.compose.ui.layout.u uVar) {
        if (uVar != null) {
            return i0.j.c(androidx.compose.ui.layout.v.g(uVar), androidx.compose.ui.unit.v.f(uVar.c()));
        }
        i0.i.INSTANCE.getClass();
        return i0.i.f74153g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0.i x(View view) {
        Rect rect = new Rect();
        view.getWindowVisibleDisplayFrame(rect);
        return androidx.compose.ui.graphics.q5.e(rect);
    }
}
