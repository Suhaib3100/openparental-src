package androidx.compose.material3;

import android.content.res.Configuration;
import kotlin.Metadata;

/* compiled from: TimePicker.android.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u001a\u0010\u0005\u001a\u00020\u00008AX\u0080\u0004¢\u0006\f\u0012\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0001\u0010\u0002¨\u0006\u0006"}, d2 = {"Landroidx/compose/material3/cb;", "a", "(Landroidx/compose/runtime/t;I)I", "b", "()V", "defaultTimePickerLayoutType", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nTimePicker.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimePicker.android.kt\nandroidx/compose/material3/TimePicker_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,33:1\n74#2:34\n*S KotlinDebug\n*F\n+ 1 TimePicker.android.kt\nandroidx/compose/material3/TimePicker_androidKt\n*L\n26#1:34\n*E\n"})
/* loaded from: classes.dex */
public final class eb {
    @androidx.compose.runtime.d3
    @androidx.compose.runtime.i
    @kd.i(name = "getDefaultTimePickerLayoutType")
    public static final int a(@fg.m androidx.compose.runtime.t tVar, int i4) {
        int i5;
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-1979410629, i4, -1, "androidx.compose.material3.<get-defaultTimePickerLayoutType> (TimePicker.android.kt:25)");
        }
        Configuration configuration = (Configuration) tVar.x(androidx.compose.ui.platform.o0.f());
        if (configuration.screenHeightDp < configuration.screenWidthDp) {
            cb.INSTANCE.getClass();
            i5 = cb.f10347c;
        } else {
            cb.INSTANCE.getClass();
            i5 = cb.f10348d;
        }
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        return i5;
    }

    public static /* synthetic */ void b() {
    }
}
