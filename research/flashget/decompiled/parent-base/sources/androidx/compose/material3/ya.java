package androidx.compose.material3;

import android.content.Context;
import android.text.format.DateFormat;
import kotlin.Metadata;

/* compiled from: TimeFormat.android.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0004\"\u0014\u0010\u0003\u001a\u00020\u00008AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0001\u0010\u0002¨\u0006\u0004"}, d2 = {"", "a", "(Landroidx/compose/runtime/t;I)Z", "is24HourFormat", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nTimeFormat.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimeFormat.android.kt\nandroidx/compose/material3/TimeFormat_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,27:1\n74#2:28\n*S KotlinDebug\n*F\n+ 1 TimeFormat.android.kt\nandroidx/compose/material3/TimeFormat_androidKt\n*L\n26#1:28\n*E\n"})
/* loaded from: classes.dex */
public final class ya {
    @androidx.compose.runtime.d3
    @androidx.compose.runtime.i
    @kd.i(name = "is24HourFormat")
    public static final boolean a(@fg.m androidx.compose.runtime.t tVar, int i4) {
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-972868615, i4, -1, "androidx.compose.material3.<get-is24HourFormat> (TimeFormat.android.kt:25)");
        }
        boolean is24HourFormat = DateFormat.is24HourFormat((Context) tVar.x(androidx.compose.ui.platform.o0.g()));
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        return is24HourFormat;
    }
}
