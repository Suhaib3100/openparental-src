package androidx.compose.foundation.layout;

import android.os.Build;
import android.view.View;
import android.view.ViewConfiguration;
import kotlin.Metadata;

/* compiled from: WindowInsetsConnection.android.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\u0006\n\u0002\b\r\u001a\u0013\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002\u001a\"\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0001ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\"\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\f\"\u0014\u0010\u000f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\f\"\u0014\u0010\u0011\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\f\"\u0014\u0010\u0012\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0001\u0010\f\"\u0014\u0010\u0015\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0014\"\u0014\u0010\u0017\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014\"\u0014\u0010\u0019\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\f\"\u0014\u0010\u001b\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\f\"\u0014\u0010\u001d\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\f\"\u0014\u0010\u001f\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006 "}, d2 = {"Landroidx/compose/ui/q;", "d", "(Landroidx/compose/ui/q;)Landroidx/compose/ui/q;", "Landroidx/compose/foundation/layout/h;", "windowInsets", "Landroidx/compose/foundation/layout/g3;", "side", "Landroidx/compose/ui/input/nestedscroll/a;", "e", "(Landroidx/compose/foundation/layout/h;ILandroidx/compose/runtime/t;I)Landroidx/compose/ui/input/nestedscroll/a;", "", "a", "F", "Inflection", "b", "PlatformFlingScrollFriction", "c", "GravityEarth", "InchesPerMeter", "", "D", "DecelerationRate", "f", "DecelMinusOne", "g", "StartTension", "h", "EndTension", "i", "P1", "j", "P2", "foundation-layout_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nWindowInsetsConnection.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsetsConnection.android.kt\nandroidx/compose/foundation/layout/WindowInsetsConnection_androidKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,725:1\n135#2:726\n74#3:727\n74#3:728\n74#3:729\n83#4,3:730\n1116#5,6:733\n*S KotlinDebug\n*F\n+ 1 WindowInsetsConnection.android.kt\nandroidx/compose/foundation/layout/WindowInsetsConnection_androidKt\n*L\n77#1:726\n113#1:727\n115#1:728\n116#1:729\n117#1:730,3\n117#1:733,6\n*E\n"})
/* loaded from: classes.dex */
public final class p2 {

    /* renamed from: a, reason: collision with root package name */
    private static final float f5243a = 0.35f;

    /* renamed from: b, reason: collision with root package name */
    private static final float f5244b = ViewConfiguration.getScrollFriction();

    /* renamed from: c, reason: collision with root package name */
    private static final float f5245c = 9.80665f;

    /* renamed from: d, reason: collision with root package name */
    private static final float f5246d = 39.37f;

    /* renamed from: e, reason: collision with root package name */
    private static final double f5247e;

    /* renamed from: f, reason: collision with root package name */
    private static final double f5248f;

    /* renamed from: g, reason: collision with root package name */
    private static final float f5249g = 0.5f;

    /* renamed from: h, reason: collision with root package name */
    private static final float f5250h = 1.0f;

    /* renamed from: i, reason: collision with root package name */
    private static final float f5251i = 0.175f;

    /* renamed from: j, reason: collision with root package name */
    private static final float f5252j = 0.35000002f;

    /* compiled from: InspectableValue.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/platform/a2;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/platform/a2;)V", "androidx/compose/ui/platform/y1$b"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 WindowInsetsConnection.android.kt\nandroidx/compose/foundation/layout/WindowInsetsConnection_androidKt\n*L\n1#1,170:1\n78#2,2:171\n*E\n"})
    public static final class a extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.platform.a2, kotlin.k2> {
        public a() {
            super(1);
        }

        public final void a(@fg.l androidx.compose.ui.platform.a2 a2Var) {
            a2Var.d("imeNestedScroll");
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.ui.platform.a2 a2Var) {
            a(a2Var);
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: WindowInsetsConnection.android.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/q;", "a", "(Landroidx/compose/ui/q;Landroidx/compose/runtime/t;I)Landroidx/compose/ui/q;"}, k = 3, mv = {1, 8, 0})
    static final class b extends kotlin.jvm.internal.n0 implements ld.q<androidx.compose.ui.q, androidx.compose.runtime.t, Integer, androidx.compose.ui.q> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f5253b = new b(3);

        b() {
            super(3);
        }

        @Override // ld.q
        public /* bridge */ /* synthetic */ androidx.compose.ui.q R(androidx.compose.ui.q qVar, androidx.compose.runtime.t tVar, Integer num) {
            return a(qVar, tVar, num.intValue());
        }

        @fg.l
        @androidx.compose.runtime.i
        public final androidx.compose.ui.q a(@fg.l androidx.compose.ui.q qVar, @fg.m androidx.compose.runtime.t tVar, int i4) {
            tVar.P(-369978792);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(-369978792, i4, -1, "androidx.compose.foundation.layout.imeNestedScroll.<anonymous> (WindowInsetsConnection.android.kt:80)");
            }
            h ime = q2.INSTANCE.c(tVar, 8).getIme();
            g3.INSTANCE.getClass();
            androidx.compose.ui.q b5 = androidx.compose.ui.input.nestedscroll.c.b(qVar, p2.e(ime, g3.f5048j, tVar, 48), null, 2, null);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
            tVar.p0();
            return b5;
        }
    }

    /* compiled from: WindowInsetsConnection.android.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/runtime/w0;", "Landroidx/compose/runtime/v0;", "a", "(Landroidx/compose/runtime/w0;)Landroidx/compose/runtime/v0;"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nWindowInsetsConnection.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsetsConnection.android.kt\nandroidx/compose/foundation/layout/WindowInsetsConnection_androidKt$rememberWindowInsetsConnection$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,725:1\n64#2,5:726\n*S KotlinDebug\n*F\n+ 1 WindowInsetsConnection.android.kt\nandroidx/compose/foundation/layout/WindowInsetsConnection_androidKt$rememberWindowInsetsConnection$1\n*L\n121#1:726,5\n*E\n"})
    static final class c extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.runtime.w0, androidx.compose.runtime.v0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ c3 f5254b;

        /* compiled from: Effects.kt */
        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005¸\u0006\u0000"}, d2 = {"androidx/compose/runtime/w0$a", "Landroidx/compose/runtime/v0;", "Lkotlin/k2;", "dispose", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        @kotlin.jvm.internal.r1({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 WindowInsetsConnection.android.kt\nandroidx/compose/foundation/layout/WindowInsetsConnection_androidKt$rememberWindowInsetsConnection$1\n*L\n1#1,497:1\n122#2,2:498\n*E\n"})
        public static final class a implements androidx.compose.runtime.v0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ c3 f5255a;

            public a(c3 c3Var) {
                this.f5255a = c3Var;
            }

            @Override // androidx.compose.runtime.v0
            public void dispose() {
                this.f5255a.k();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(c3 c3Var) {
            super(1);
            this.f5254b = c3Var;
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final androidx.compose.runtime.v0 invoke(@fg.l androidx.compose.runtime.w0 w0Var) {
            return new a(this.f5254b);
        }
    }

    static {
        double log = Math.log(0.78d) / Math.log(0.9d);
        f5247e = log;
        f5248f = log - 1.0d;
    }

    @d0
    @fg.l
    public static final androidx.compose.ui.q d(@fg.l androidx.compose.ui.q qVar) {
        if (Build.VERSION.SDK_INT < 30) {
            return qVar;
        }
        return androidx.compose.ui.i.e(qVar, androidx.compose.ui.platform.y1.e() ? new a(1) : androidx.compose.ui.platform.y1.b(), b.f5253b);
    }

    @d0
    @fg.l
    @androidx.compose.runtime.i
    public static final androidx.compose.ui.input.nestedscroll.a e(@fg.l h hVar, int i4, @fg.m androidx.compose.runtime.t tVar, int i5) {
        tVar.P(-1011341039);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-1011341039, i5, -1, "androidx.compose.foundation.layout.rememberWindowInsetsConnection (WindowInsetsConnection.android.kt:108)");
        }
        if (Build.VERSION.SDK_INT < 30) {
            b0 b0Var = b0.f4854b;
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
            tVar.p0();
            return b0Var;
        }
        b2 a5 = b2.INSTANCE.a(i4, (androidx.compose.ui.unit.w) tVar.x(androidx.compose.ui.platform.h1.p()));
        View view = (View) tVar.x(androidx.compose.ui.platform.o0.k());
        androidx.compose.ui.unit.d dVar = (androidx.compose.ui.unit.d) tVar.x(androidx.compose.ui.platform.h1.i());
        Object[] objArr = {hVar, view, a5, dVar};
        tVar.P(-568225417);
        boolean z4 = false;
        for (int i6 = 0; i6 < 4; i6++) {
            z4 |= tVar.q0(objArr[i6]);
        }
        Object Q = tVar.Q();
        if (z4 || Q == androidx.compose.runtime.t.INSTANCE.a()) {
            Q = new c3(hVar, view, a5, dVar);
            tVar.E(Q);
        }
        tVar.p0();
        c3 c3Var = (c3) Q;
        androidx.compose.runtime.a1.c(c3Var, new c(c3Var), tVar, 8);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return c3Var;
    }
}
