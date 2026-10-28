package androidx.compose.material3;

import kotlin.Metadata;

/* compiled from: MaterialTheme.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\u001a@\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0011\u0010\t\u001a\r\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bH\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\r\u0010\u000e\"\u0014\u0010\u0011\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0010\"\u0014\u0010\u0015\u001a\u00020\u00128\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Landroidx/compose/material3/a3;", "colorScheme", "Landroidx/compose/material3/w8;", "shapes", "Landroidx/compose/material3/sb;", "typography", "Lkotlin/Function0;", "Lkotlin/k2;", "Landroidx/compose/runtime/i;", "content", "a", "(Landroidx/compose/material3/a3;Landroidx/compose/material3/w8;Landroidx/compose/material3/sb;Lld/p;Landroidx/compose/runtime/t;II)V", "Landroidx/compose/foundation/text/selection/x0;", "c", "(Landroidx/compose/material3/a3;Landroidx/compose/runtime/t;I)Landroidx/compose/foundation/text/selection/x0;", "Landroidx/compose/material/ripple/h;", "Landroidx/compose/material/ripple/h;", "DefaultRippleAlpha", "", "b", "F", "TextSelectionBackgroundOpacity", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nMaterialTheme.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MaterialTheme.kt\nandroidx/compose/material3/MaterialThemeKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,139:1\n1116#2,6:140\n*S KotlinDebug\n*F\n+ 1 MaterialTheme.kt\nandroidx/compose/material3/MaterialThemeKt\n*L\n129#1:140,6\n*E\n"})
/* loaded from: classes.dex */
public final class q6 {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private static final androidx.compose.material.ripple.h f13668a = new androidx.compose.material.ripple.h(0.16f, 0.12f, 0.08f, 0.12f);

    /* renamed from: b, reason: collision with root package name */
    public static final float f13669b = 0.4f;

    /* compiled from: MaterialTheme.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ sb f13670b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f13671c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(sb sbVar, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar) {
            super(2);
            this.f13670b = sbVar;
            this.f13671c = pVar;
        }

        @androidx.compose.runtime.i
        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            if ((i4 & 3) == 2 && tVar.p()) {
                tVar.d0();
                return;
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(-1066563262, i4, -1, "androidx.compose.material3.MaterialTheme.<anonymous> (MaterialTheme.kt:71)");
            }
            xa.a(this.f13670b.getBodyLarge(), this.f13671c, tVar, 0);
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

    /* compiled from: MaterialTheme.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class b extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ a3 f13672b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ w8 f13673c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ sb f13674d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f13675e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f13676f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f13677g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(a3 a3Var, w8 w8Var, sb sbVar, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, int i4, int i5) {
            super(2);
            this.f13672b = a3Var;
            this.f13673c = w8Var;
            this.f13674d = sbVar;
            this.f13675e = pVar;
            this.f13676f = i4;
            this.f13677g = i5;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            q6.a(this.f13672b, this.f13673c, this.f13674d, this.f13675e, tVar, androidx.compose.runtime.g3.b(this.f13676f | 1), this.f13677g);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x008e, code lost:
    
        if ((r15 & 4) != 0) goto L60;
     */
    @androidx.compose.runtime.j(scheme = "[0[0]]")
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(@fg.m androidx.compose.material3.a3 r9, @fg.m androidx.compose.material3.w8 r10, @fg.m androidx.compose.material3.sb r11, @fg.l ld.p<? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r12, @fg.m androidx.compose.runtime.t r13, int r14, int r15) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.q6.a(androidx.compose.material3.a3, androidx.compose.material3.w8, androidx.compose.material3.sb, ld.p, androidx.compose.runtime.t, int, int):void");
    }

    @fg.l
    @androidx.compose.runtime.i
    public static final androidx.compose.foundation.text.selection.x0 c(@fg.l a3 a3Var, @fg.m androidx.compose.runtime.t tVar, int i4) {
        tVar.P(1866455512);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(1866455512, i4, -1, "androidx.compose.material3.rememberTextSelectionColors (MaterialTheme.kt:126)");
        }
        long primary = a3Var.getPrimary();
        tVar.P(-314518050);
        boolean g4 = tVar.g(primary);
        Object Q = tVar.Q();
        if (g4 || Q == androidx.compose.runtime.t.INSTANCE.a()) {
            Q = new androidx.compose.foundation.text.selection.x0(primary, androidx.compose.ui.graphics.d2.w(primary, 0.4f, 0.0f, 0.0f, 0.0f, 14, null), null);
            tVar.E(Q);
        }
        androidx.compose.foundation.text.selection.x0 x0Var = (androidx.compose.foundation.text.selection.x0) Q;
        tVar.p0();
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return x0Var;
    }
}
