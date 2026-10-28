package androidx.compose.material3;

import androidx.compose.animation.core.e2;
import kotlin.Metadata;

/* compiled from: TextFieldImpl.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JÇ\u0001\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\t¢\u0006\u0002\b\n2\u0006\u0010\r\u001a\u00020\f2z\u0010\u0018\u001av\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0013\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0014\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0015\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u00170\u000e¢\u0006\u0002\b\nH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001b²\u0006\f\u0010\u0012\u001a\u00020\u000f8\nX\u008a\u0084\u0002²\u0006\f\u0010\u0015\u001a\u00020\u000f8\nX\u008a\u0084\u0002²\u0006\f\u0010\u0016\u001a\u00020\u000f8\nX\u008a\u0084\u0002²\u0006\f\u0010\u0013\u001a\u00020\u00068\nX\u008a\u0084\u0002²\u0006\f\u0010\u0014\u001a\u00020\u00068\nX\u008a\u0084\u0002"}, d2 = {"Landroidx/compose/material3/va;", "", "<init>", "()V", "Landroidx/compose/material3/z5;", "inputState", "Landroidx/compose/ui/graphics/d2;", "focusedTextStyleColor", "unfocusedTextStyleColor", "Lkotlin/Function1;", "Landroidx/compose/runtime/i;", "contentColor", "", "showLabel", "Lkotlin/Function5;", "", "Lkotlin/r0;", "name", "labelProgress", "labelTextStyleColor", "labelContentColor", "placeholderOpacity", "prefixSuffixOpacity", "Lkotlin/k2;", "content", "a", "(Landroidx/compose/material3/z5;JJLld/q;ZLld/u;Landroidx/compose/runtime/t;I)V", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nTextFieldImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldImpl.kt\nandroidx/compose/material3/TextFieldTransitionScope\n+ 2 Transition.kt\nandroidx/compose/animation/core/TransitionKt\n+ 3 Transition.kt\nandroidx/compose/animation/TransitionKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 6 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,433:1\n1166#2:434\n1083#2,5:435\n1166#2:440\n1083#2,5:441\n1166#2:446\n1083#2,5:447\n1083#2,5:463\n1083#2,5:479\n69#3,2:452\n71#3:458\n74#3:462\n69#3,2:468\n71#3:474\n74#3:478\n36#4:454\n36#4:470\n1116#5,3:455\n1119#5,3:459\n1116#5,3:471\n1119#5,3:475\n81#6:484\n81#6:485\n81#6:486\n81#6:487\n81#6:488\n*S KotlinDebug\n*F\n+ 1 TextFieldImpl.kt\nandroidx/compose/material3/TextFieldTransitionScope\n*L\n316#1:434\n316#1:435,5\n327#1:440\n327#1:441,5\n355#1:446\n355#1:447,5\n366#1:463,5\n376#1:479,5\n366#1:452,2\n366#1:458\n366#1:462\n376#1:468,2\n376#1:474\n376#1:478\n366#1:454\n376#1:470\n366#1:455,3\n366#1:459,3\n376#1:471,3\n376#1:475,3\n316#1:484\n327#1:485\n355#1:486\n366#1:487\n376#1:488\n*E\n"})
/* loaded from: classes.dex */
final class va {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    public static final va f15193a = new va();

    /* compiled from: TextFieldImpl.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class a extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ z5 f15195c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f15196d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f15197e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ld.q<z5, androidx.compose.runtime.t, Integer, androidx.compose.ui.graphics.d2> f15198f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f15199g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ ld.u<Float, androidx.compose.ui.graphics.d2, androidx.compose.ui.graphics.d2, Float, Float, androidx.compose.runtime.t, Integer, kotlin.k2> f15200h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f15201i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(z5 z5Var, long j4, long j5, ld.q<? super z5, ? super androidx.compose.runtime.t, ? super Integer, androidx.compose.ui.graphics.d2> qVar, boolean z4, ld.u<? super Float, ? super androidx.compose.ui.graphics.d2, ? super androidx.compose.ui.graphics.d2, ? super Float, ? super Float, ? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> uVar, int i4) {
            super(2);
            this.f15195c = z5Var;
            this.f15196d = j4;
            this.f15197e = j5;
            this.f15198f = qVar;
            this.f15199g = z4;
            this.f15200h = uVar;
            this.f15201i = i4;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            va.this.a(this.f15195c, this.f15196d, this.f15197e, this.f15198f, this.f15199g, this.f15200h, tVar, androidx.compose.runtime.g3.b(this.f15201i | 1));
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: TextFieldImpl.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/animation/core/e2$b;", "Landroidx/compose/material3/z5;", "Landroidx/compose/animation/core/p0;", "Landroidx/compose/ui/graphics/d2;", "a", "(Landroidx/compose/animation/core/e2$b;Landroidx/compose/runtime/t;I)Landroidx/compose/animation/core/p0;"}, k = 3, mv = {1, 8, 0})
    static final class b extends kotlin.jvm.internal.n0 implements ld.q<e2.b<z5>, androidx.compose.runtime.t, Integer, androidx.compose.animation.core.p0<androidx.compose.ui.graphics.d2>> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f15202b = new b(3);

        b() {
            super(3);
        }

        @Override // ld.q
        public /* bridge */ /* synthetic */ androidx.compose.animation.core.p0<androidx.compose.ui.graphics.d2> R(e2.b<z5> bVar, androidx.compose.runtime.t tVar, Integer num) {
            return a(bVar, tVar, num.intValue());
        }

        @fg.l
        @androidx.compose.runtime.i
        public final androidx.compose.animation.core.p0<androidx.compose.ui.graphics.d2> a(@fg.l e2.b<z5> bVar, @fg.m androidx.compose.runtime.t tVar, int i4) {
            tVar.P(766065458);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(766065458, i4, -1, "androidx.compose.material3.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:376)");
            }
            androidx.compose.animation.core.h2 r4 = androidx.compose.animation.core.l.r(150, 0, null, 6, null);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
            tVar.p0();
            return r4;
        }
    }

    /* compiled from: TextFieldImpl.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/animation/core/e2$b;", "Landroidx/compose/material3/z5;", "Landroidx/compose/animation/core/p0;", "", "a", "(Landroidx/compose/animation/core/e2$b;Landroidx/compose/runtime/t;I)Landroidx/compose/animation/core/p0;"}, k = 3, mv = {1, 8, 0})
    static final class c extends kotlin.jvm.internal.n0 implements ld.q<e2.b<z5>, androidx.compose.runtime.t, Integer, androidx.compose.animation.core.p0<Float>> {

        /* renamed from: b, reason: collision with root package name */
        public static final c f15203b = new c(3);

        c() {
            super(3);
        }

        @Override // ld.q
        public /* bridge */ /* synthetic */ androidx.compose.animation.core.p0<Float> R(e2.b<z5> bVar, androidx.compose.runtime.t tVar, Integer num) {
            return a(bVar, tVar, num.intValue());
        }

        @fg.l
        @androidx.compose.runtime.i
        public final androidx.compose.animation.core.p0<Float> a(@fg.l e2.b<z5> bVar, @fg.m androidx.compose.runtime.t tVar, int i4) {
            tVar.P(-4765522);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(-4765522, i4, -1, "androidx.compose.material3.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:317)");
            }
            androidx.compose.animation.core.h2 r4 = androidx.compose.animation.core.l.r(150, 0, null, 6, null);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
            tVar.p0();
            return r4;
        }
    }

    /* compiled from: TextFieldImpl.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/animation/core/e2$b;", "Landroidx/compose/material3/z5;", "Landroidx/compose/animation/core/p0;", "Landroidx/compose/ui/graphics/d2;", "a", "(Landroidx/compose/animation/core/e2$b;Landroidx/compose/runtime/t;I)Landroidx/compose/animation/core/p0;"}, k = 3, mv = {1, 8, 0})
    static final class d extends kotlin.jvm.internal.n0 implements ld.q<e2.b<z5>, androidx.compose.runtime.t, Integer, androidx.compose.animation.core.p0<androidx.compose.ui.graphics.d2>> {

        /* renamed from: b, reason: collision with root package name */
        public static final d f15204b = new d(3);

        d() {
            super(3);
        }

        @Override // ld.q
        public /* bridge */ /* synthetic */ androidx.compose.animation.core.p0<androidx.compose.ui.graphics.d2> R(e2.b<z5> bVar, androidx.compose.runtime.t tVar, Integer num) {
            return a(bVar, tVar, num.intValue());
        }

        @fg.l
        @androidx.compose.runtime.i
        public final androidx.compose.animation.core.p0<androidx.compose.ui.graphics.d2> a(@fg.l e2.b<z5> bVar, @fg.m androidx.compose.runtime.t tVar, int i4) {
            tVar.P(2041936647);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(2041936647, i4, -1, "androidx.compose.material3.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:366)");
            }
            androidx.compose.animation.core.h2 r4 = androidx.compose.animation.core.l.r(150, 0, null, 6, null);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
            tVar.p0();
            return r4;
        }
    }

    /* compiled from: TextFieldImpl.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/animation/core/e2$b;", "Landroidx/compose/material3/z5;", "Landroidx/compose/animation/core/p0;", "", "a", "(Landroidx/compose/animation/core/e2$b;Landroidx/compose/runtime/t;I)Landroidx/compose/animation/core/p0;"}, k = 3, mv = {1, 8, 0})
    static final class e extends kotlin.jvm.internal.n0 implements ld.q<e2.b<z5>, androidx.compose.runtime.t, Integer, androidx.compose.animation.core.p0<Float>> {

        /* renamed from: b, reason: collision with root package name */
        public static final e f15205b = new e(3);

        e() {
            super(3);
        }

        @Override // ld.q
        public /* bridge */ /* synthetic */ androidx.compose.animation.core.p0<Float> R(e2.b<z5> bVar, androidx.compose.runtime.t tVar, Integer num) {
            return a(bVar, tVar, num.intValue());
        }

        @fg.l
        @androidx.compose.runtime.i
        public final androidx.compose.animation.core.p0<Float> a(@fg.l e2.b<z5> bVar, @fg.m androidx.compose.runtime.t tVar, int i4) {
            tVar.P(-1635067817);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(-1635067817, i4, -1, "androidx.compose.material3.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:329)");
            }
            z5 z5Var = z5.Focused;
            z5 z5Var2 = z5.UnfocusedEmpty;
            androidx.compose.animation.core.p0<Float> r4 = bVar.j(z5Var, z5Var2) ? androidx.compose.animation.core.l.r(67, 0, androidx.compose.animation.core.m0.e(), 2, null) : (bVar.j(z5Var2, z5Var) || bVar.j(z5.UnfocusedNotEmpty, z5Var2)) ? new androidx.compose.animation.core.h2(83, 67, androidx.compose.animation.core.m0.e()) : androidx.compose.animation.core.l.p(0.0f, 0.0f, null, 7, null);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
            tVar.p0();
            return r4;
        }
    }

    /* compiled from: TextFieldImpl.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/animation/core/e2$b;", "Landroidx/compose/material3/z5;", "Landroidx/compose/animation/core/p0;", "", "a", "(Landroidx/compose/animation/core/e2$b;Landroidx/compose/runtime/t;I)Landroidx/compose/animation/core/p0;"}, k = 3, mv = {1, 8, 0})
    static final class f extends kotlin.jvm.internal.n0 implements ld.q<e2.b<z5>, androidx.compose.runtime.t, Integer, androidx.compose.animation.core.p0<Float>> {

        /* renamed from: b, reason: collision with root package name */
        public static final f f15206b = new f(3);

        f() {
            super(3);
        }

        @Override // ld.q
        public /* bridge */ /* synthetic */ androidx.compose.animation.core.p0<Float> R(e2.b<z5> bVar, androidx.compose.runtime.t tVar, Integer num) {
            return a(bVar, tVar, num.intValue());
        }

        @fg.l
        @androidx.compose.runtime.i
        public final androidx.compose.animation.core.p0<Float> a(@fg.l e2.b<z5> bVar, @fg.m androidx.compose.runtime.t tVar, int i4) {
            tVar.P(1189967029);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(1189967029, i4, -1, "androidx.compose.material3.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:356)");
            }
            androidx.compose.animation.core.h2 r4 = androidx.compose.animation.core.l.r(150, 0, null, 6, null);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
            tVar.p0();
            return r4;
        }
    }

    /* compiled from: TextFieldImpl.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class g {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15207a;

        static {
            int[] iArr = new int[z5.values().length];
            try {
                iArr[z5.Focused.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[z5.UnfocusedEmpty.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[z5.UnfocusedNotEmpty.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f15207a = iArr;
        }
    }

    private va() {
    }

    private static final float b(androidx.compose.runtime.b5<Float> b5Var) {
        return b5Var.getValue().floatValue();
    }

    private static final float c(androidx.compose.runtime.b5<Float> b5Var) {
        return b5Var.getValue().floatValue();
    }

    private static final float d(androidx.compose.runtime.b5<Float> b5Var) {
        return b5Var.getValue().floatValue();
    }

    private static final long e(androidx.compose.runtime.b5<androidx.compose.ui.graphics.d2> b5Var) {
        return b5Var.getValue().M();
    }

    private static final long f(androidx.compose.runtime.b5<androidx.compose.ui.graphics.d2> b5Var) {
        return b5Var.getValue().M();
    }

    /* JADX WARN: Code restructure failed: missing block: B:129:0x02b0, code lost:
    
        if (r31 != false) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x01f4, code lost:
    
        if (r31 != false) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x01b3, code lost:
    
        if (r31 != false) goto L97;
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x040a  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x04af  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01e6  */
    @androidx.compose.runtime.j(scheme = "[0[0][0]]")
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(@fg.l androidx.compose.material3.z5 r25, long r26, long r28, @fg.l ld.q<? super androidx.compose.material3.z5, ? super androidx.compose.runtime.t, ? super java.lang.Integer, androidx.compose.ui.graphics.d2> r30, boolean r31, @fg.l ld.u<? super java.lang.Float, ? super androidx.compose.ui.graphics.d2, ? super androidx.compose.ui.graphics.d2, ? super java.lang.Float, ? super java.lang.Float, ? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r32, @fg.m androidx.compose.runtime.t r33, int r34) {
        /*
            Method dump skipped, instructions count: 1234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.va.a(androidx.compose.material3.z5, long, long, ld.q, boolean, ld.u, androidx.compose.runtime.t, int):void");
    }
}
