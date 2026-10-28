package androidx.compose.ui.text;

import androidx.compose.ui.platform.h1;
import androidx.compose.ui.text.font.y;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;

/* compiled from: TextMeasurerHelper.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0019\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\"\u0014\u0010\u0006\u001a\u00020\u00008\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0003\u0010\u0005¨\u0006\u0007"}, d2 = {"", "cacheSize", "Landroidx/compose/ui/text/o0;", "a", "(ILandroidx/compose/runtime/t;II)Landroidx/compose/ui/text/o0;", "I", "DefaultCacheSize", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nTextMeasurerHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextMeasurerHelper.kt\nandroidx/compose/ui/text/TextMeasurerHelperKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,55:1\n74#2:56\n74#2:57\n74#2:58\n83#3,3:59\n1116#4,6:62\n*S KotlinDebug\n*F\n+ 1 TextMeasurerHelper.kt\nandroidx/compose/ui/text/TextMeasurerHelperKt\n*L\n47#1:56\n48#1:57\n49#1:58\n51#1:59,3\n51#1:62,6\n*E\n"})
/* loaded from: classes.dex */
public final class p0 {

    /* renamed from: a, reason: collision with root package name */
    private static final int f21226a = 8;

    @fg.l
    @androidx.compose.runtime.i
    public static final o0 a(int i4, @fg.m androidx.compose.runtime.t tVar, int i5, int i6) {
        tVar.P(1538166871);
        if ((i6 & 1) != 0) {
            i4 = f21226a;
        }
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(1538166871, i5, -1, "androidx.compose.ui.text.rememberTextMeasurer (TextMeasurerHelper.kt:45)");
        }
        y.b bVar = (y.b) tVar.x(h1.k());
        androidx.compose.ui.unit.d dVar = (androidx.compose.ui.unit.d) tVar.x(h1.i());
        androidx.compose.ui.unit.w wVar = (androidx.compose.ui.unit.w) tVar.x(h1.p());
        Object[] objArr = {bVar, dVar, wVar, Integer.valueOf(i4)};
        tVar.P(-568225417);
        boolean z4 = false;
        for (int i7 = 0; i7 < 4; i7++) {
            z4 |= tVar.q0(objArr[i7]);
        }
        Object Q = tVar.Q();
        if (z4 || Q == androidx.compose.runtime.t.INSTANCE.a()) {
            Q = new o0(bVar, dVar, wVar, i4);
            tVar.E(Q);
        }
        tVar.p0();
        o0 o0Var = (o0) Q;
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return o0Var;
    }
}
