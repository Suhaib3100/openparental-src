package androidx.compose.foundation;

import android.content.res.Configuration;
import androidx.compose.runtime.d3;
import kotlin.Metadata;

/* compiled from: DarkTheme.android.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"", "a", "(Landroidx/compose/runtime/t;I)Z", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nDarkTheme.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DarkTheme.android.kt\nandroidx/compose/foundation/DarkTheme_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,51:1\n74#2:52\n*S KotlinDebug\n*F\n+ 1 DarkTheme.android.kt\nandroidx/compose/foundation/DarkTheme_androidKt\n*L\n48#1:52\n*E\n"})
/* loaded from: classes.dex */
public final class r0 {
    @d3
    @androidx.compose.runtime.i
    public static final boolean a(@fg.m androidx.compose.runtime.t tVar, int i4) {
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-882615028, i4, -1, "androidx.compose.foundation._isSystemInDarkTheme (DarkTheme.android.kt:46)");
        }
        boolean z4 = (((Configuration) tVar.x(androidx.compose.ui.platform.o0.f())).uiMode & 48) == 32;
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        return z4;
    }
}
