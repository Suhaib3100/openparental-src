package androidx.compose.ui.platform;

import android.content.res.Configuration;
import kotlin.Metadata;

/* compiled from: AndroidComposeView.android.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001e\u0010\b\u001a\u00020\u0007*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0002ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a.\u0010\u000e\u001a\u00020\u0007*\u00020\u00052\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0005H\u0002ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a2\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0000H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\".\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00170\u00168\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d\"\u0018\u0010\"\u001a\u00020\u0002*\u00020\u001f8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b \u0010!\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006#"}, d2 = {"", "layoutDirection", "Landroidx/compose/ui/unit/w;", "g", "(I)Landroidx/compose/ui/unit/w;", "Landroidx/compose/ui/graphics/y4;", "other", "Lkotlin/k2;", "h", "([F[F)V", "", "x", "y", "tmpMatrix", "i", "([FFF[F)V", "m1", "row", "m2", "column", "d", "([FI[FI)F", "Lkotlin/Function1;", "Landroidx/compose/ui/text/input/t0;", "a", "Lld/l;", "f", "()Lld/l;", "j", "(Lld/l;)V", "platformTextInputServiceInterceptor", "Landroid/content/res/Configuration;", "e", "(Landroid/content/res/Configuration;)Landroidx/compose/ui/unit/w;", "localeLayoutDirection", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nAndroidComposeView.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidComposeView.android.kt\nandroidx/compose/ui/platform/AndroidComposeView_androidKt\n+ 2 Matrix.kt\nandroidx/compose/ui/graphics/Matrix\n*L\n1#1,2348:1\n42#2,2:2349\n42#2,2:2351\n42#2,2:2353\n42#2,2:2355\n42#2,2:2357\n42#2,2:2359\n42#2,2:2361\n42#2,2:2363\n42#2,2:2365\n42#2,2:2367\n42#2,2:2369\n42#2,2:2371\n42#2,2:2373\n42#2,2:2375\n42#2,2:2377\n42#2,2:2379\n39#2:2381\n39#2:2382\n39#2:2383\n39#2:2384\n*S KotlinDebug\n*F\n+ 1 AndroidComposeView.android.kt\nandroidx/compose/ui/platform/AndroidComposeView_androidKt\n*L\n2124#1:2349,2\n2125#1:2351,2\n2126#1:2353,2\n2127#1:2355,2\n2128#1:2357,2\n2129#1:2359,2\n2130#1:2361,2\n2131#1:2363,2\n2132#1:2365,2\n2133#1:2367,2\n2134#1:2369,2\n2135#1:2371,2\n2136#1:2373,2\n2137#1:2375,2\n2138#1:2377,2\n2139#1:2379,2\n2153#1:2381\n2154#1:2382\n2155#1:2383\n2156#1:2384\n*E\n"})
/* loaded from: classes.dex */
public final class n0 {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private static ld.l<? super androidx.compose.ui.text.input.t0, ? extends androidx.compose.ui.text.input.t0> f20014a = a.f20015b;

    /* compiled from: AndroidComposeView.android.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/text/input/t0;", "it", "a", "(Landroidx/compose/ui/text/input/t0;)Landroidx/compose/ui/text/input/t0;"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.text.input.t0, androidx.compose.ui.text.input.t0> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f20015b = new a(1);

        a() {
            super(1);
        }

        @fg.l
        public final androidx.compose.ui.text.input.t0 a(@fg.l androidx.compose.ui.text.input.t0 t0Var) {
            return t0Var;
        }

        @Override // ld.l
        public androidx.compose.ui.text.input.t0 invoke(androidx.compose.ui.text.input.t0 t0Var) {
            return t0Var;
        }
    }

    private static final float d(float[] fArr, int i4, float[] fArr2, int i5) {
        int i6 = i4 * 4;
        return (fArr[i6 + 3] * fArr2[12 + i5]) + (fArr[i6 + 2] * fArr2[8 + i5]) + (fArr[i6 + 1] * fArr2[4 + i5]) + (fArr[i6] * fArr2[i5]);
    }

    @fg.l
    public static final androidx.compose.ui.unit.w e(@fg.l Configuration configuration) {
        return g(configuration.getLayoutDirection());
    }

    @fg.l
    public static final ld.l<androidx.compose.ui.text.input.t0, androidx.compose.ui.text.input.t0> f() {
        return f20014a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.unit.w g(int i4) {
        return i4 != 0 ? i4 != 1 ? androidx.compose.ui.unit.w.Ltr : androidx.compose.ui.unit.w.Rtl : androidx.compose.ui.unit.w.Ltr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(float[] fArr, float[] fArr2) {
        float d5 = d(fArr2, 0, fArr, 0);
        float d6 = d(fArr2, 0, fArr, 1);
        float d7 = d(fArr2, 0, fArr, 2);
        float d10 = d(fArr2, 0, fArr, 3);
        float d11 = d(fArr2, 1, fArr, 0);
        float d12 = d(fArr2, 1, fArr, 1);
        float d13 = d(fArr2, 1, fArr, 2);
        float d14 = d(fArr2, 1, fArr, 3);
        float d15 = d(fArr2, 2, fArr, 0);
        float d16 = d(fArr2, 2, fArr, 1);
        float d17 = d(fArr2, 2, fArr, 2);
        float d18 = d(fArr2, 2, fArr, 3);
        float d19 = d(fArr2, 3, fArr, 0);
        float d20 = d(fArr2, 3, fArr, 1);
        float d21 = d(fArr2, 3, fArr, 2);
        float d22 = d(fArr2, 3, fArr, 3);
        fArr[0] = d5;
        fArr[1] = d6;
        fArr[2] = d7;
        fArr[3] = d10;
        fArr[4] = d11;
        fArr[5] = d12;
        fArr[6] = d13;
        fArr[7] = d14;
        fArr[8] = d15;
        fArr[9] = d16;
        fArr[10] = d17;
        fArr[11] = d18;
        fArr[12] = d19;
        fArr[13] = d20;
        fArr[14] = d21;
        fArr[15] = d22;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(float[] fArr, float f4, float f5, float[] fArr2) {
        androidx.compose.ui.graphics.y4.m(fArr2);
        androidx.compose.ui.graphics.y4.x(fArr2, f4, f5, 0.0f, 4, null);
        h(fArr, fArr2);
    }

    public static final void j(@fg.l ld.l<? super androidx.compose.ui.text.input.t0, ? extends androidx.compose.ui.text.input.t0> lVar) {
        f20014a = lVar;
    }
}
