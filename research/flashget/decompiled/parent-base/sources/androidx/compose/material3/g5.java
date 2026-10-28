package androidx.compose.material3;

import kotlin.Metadata;

/* compiled from: ExposedDropdownMenu.android.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\t\u001a\u00020\u0004*\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\t\u0010\nJW\u0010\u0017\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\u00072\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\b\u0002\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u00102\u001c\u0010\u0016\u001a\u0018\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\r0\u0012¢\u0006\u0002\b\u0014¢\u0006\u0002\b\u0015H\u0007¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Landroidx/compose/material3/g5;", "", "<init>", "()V", "Landroidx/compose/ui/q;", "d", "(Landroidx/compose/ui/q;)Landroidx/compose/ui/q;", "", "matchTextFieldWidth", "b", "(Landroidx/compose/ui/q;Z)Landroidx/compose/ui/q;", "expanded", "Lkotlin/Function0;", "Lkotlin/k2;", "onDismissRequest", "modifier", "Landroidx/compose/foundation/w2;", "scrollState", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/u;", "Landroidx/compose/runtime/i;", "Lkotlin/u;", "content", "a", "(ZLld/a;Landroidx/compose/ui/q;Landroidx/compose/foundation/w2;Lld/q;Landroidx/compose/runtime/t;II)V", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@androidx.compose.runtime.internal.u(parameters = 1)
@f5
@kotlin.jvm.internal.r1({"SMAP\nExposedDropdownMenu.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExposedDropdownMenu.android.kt\nandroidx/compose/material3/ExposedDropdownMenuBoxScope\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,1091:1\n1116#2,6:1092\n1116#2,6:1098\n1116#2,6:1105\n74#3:1104\n*S KotlinDebug\n*F\n+ 1 ExposedDropdownMenu.android.kt\nandroidx/compose/material3/ExposedDropdownMenuBoxScope\n*L\n279#1:1092,6\n283#1:1098,6\n285#1:1105,6\n284#1:1104\n*E\n"})
/* loaded from: classes.dex */
public abstract class g5 {

    /* renamed from: a, reason: collision with root package name */
    public static final int f10987a = 0;

    /* compiled from: ExposedDropdownMenu.android.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.core.h1<Boolean> f10988b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.k2<androidx.compose.ui.graphics.p6> f10989c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.w2 f10990d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ g5 f10991e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f10992f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ld.q<androidx.compose.foundation.layout.u, androidx.compose.runtime.t, Integer, kotlin.k2> f10993g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(androidx.compose.animation.core.h1<Boolean> h1Var, androidx.compose.runtime.k2<androidx.compose.ui.graphics.p6> k2Var, androidx.compose.foundation.w2 w2Var, g5 g5Var, androidx.compose.ui.q qVar, ld.q<? super androidx.compose.foundation.layout.u, ? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> qVar2) {
            super(2);
            this.f10988b = h1Var;
            this.f10989c = k2Var;
            this.f10990d = w2Var;
            this.f10991e = g5Var;
            this.f10992f = qVar;
            this.f10993g = qVar2;
        }

        @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
        @androidx.compose.runtime.i
        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            if ((i4 & 3) == 2 && tVar.p()) {
                tVar.d0();
                return;
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(723773237, i4, -1, "androidx.compose.material3.ExposedDropdownMenuBoxScope.ExposedDropdownMenu.<anonymous> (ExposedDropdownMenu.android.kt:297)");
            }
            t6.a(this.f10988b, this.f10989c, this.f10990d, g5.c(this.f10991e, this.f10992f, false, 1, null), this.f10993g, tVar, androidx.compose.animation.core.h1.f2734e | 48, 0);
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

    /* compiled from: ExposedDropdownMenu.android.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class b extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f10995c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ld.a<kotlin.k2> f10996d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f10997e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.w2 f10998f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ld.q<androidx.compose.foundation.layout.u, androidx.compose.runtime.t, Integer, kotlin.k2> f10999g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f11000h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f11001i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(boolean z4, ld.a<kotlin.k2> aVar, androidx.compose.ui.q qVar, androidx.compose.foundation.w2 w2Var, ld.q<? super androidx.compose.foundation.layout.u, ? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> qVar2, int i4, int i5) {
            super(2);
            this.f10995c = z4;
            this.f10996d = aVar;
            this.f10997e = qVar;
            this.f10998f = w2Var;
            this.f10999g = qVar2;
            this.f11000h = i4;
            this.f11001i = i5;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            g5.this.a(this.f10995c, this.f10996d, this.f10997e, this.f10998f, this.f10999g, tVar, androidx.compose.runtime.g3.b(this.f11000h | 1), this.f11001i);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: ExposedDropdownMenu.android.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/ui/unit/s;", "anchorBounds", "menuBounds", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/unit/s;Landroidx/compose/ui/unit/s;)V"}, k = 3, mv = {1, 8, 0})
    static final class c extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.ui.unit.s, androidx.compose.ui.unit.s, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.k2<androidx.compose.ui.graphics.p6> f11002b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(androidx.compose.runtime.k2<androidx.compose.ui.graphics.p6> k2Var) {
            super(2);
            this.f11002b = k2Var;
        }

        public final void a(@fg.l androidx.compose.ui.unit.s sVar, @fg.l androidx.compose.ui.unit.s sVar2) {
            this.f11002b.setValue(androidx.compose.ui.graphics.p6.b(t6.h(sVar, sVar2)));
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.ui.unit.s sVar, androidx.compose.ui.unit.s sVar2) {
            a(sVar, sVar2);
            return kotlin.k2.f75408a;
        }
    }

    public static /* synthetic */ androidx.compose.ui.q c(g5 g5Var, androidx.compose.ui.q qVar, boolean z4, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: exposedDropdownSize");
        }
        if ((i4 & 1) != 0) {
            z4 = true;
        }
        return g5Var.b(qVar, z4);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0076  */
    @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(boolean r29, @fg.l ld.a<kotlin.k2> r30, @fg.m androidx.compose.ui.q r31, @fg.m androidx.compose.foundation.w2 r32, @fg.l ld.q<? super androidx.compose.foundation.layout.u, ? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r33, @fg.m androidx.compose.runtime.t r34, int r35, int r36) {
        /*
            Method dump skipped, instructions count: 522
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.g5.a(boolean, ld.a, androidx.compose.ui.q, androidx.compose.foundation.w2, ld.q, androidx.compose.runtime.t, int, int):void");
    }

    @fg.l
    public abstract androidx.compose.ui.q b(@fg.l androidx.compose.ui.q qVar, boolean z4);

    @fg.l
    public abstract androidx.compose.ui.q d(@fg.l androidx.compose.ui.q qVar);
}
