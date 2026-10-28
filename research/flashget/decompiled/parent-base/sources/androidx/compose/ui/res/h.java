package androidx.compose.ui.res;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.runtime.d3;
import androidx.compose.runtime.t;
import androidx.compose.runtime.x;
import androidx.compose.ui.platform.o0;
import fg.l;
import fg.m;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;

/* compiled from: Resources.android.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Landroid/content/res/Resources;", "a", "(Landroidx/compose/runtime/t;I)Landroid/content/res/Resources;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nResources.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Resources.android.kt\nandroidx/compose/ui/res/Resources_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,35:1\n74#2:36\n74#2:37\n*S KotlinDebug\n*F\n+ 1 Resources.android.kt\nandroidx/compose/ui/res/Resources_androidKt\n*L\n32#1:36\n33#1:37\n*E\n"})
/* loaded from: classes.dex */
public final class h {
    @l
    @d3
    @androidx.compose.runtime.i
    public static final Resources a(@m t tVar, int i4) {
        if (x.b0()) {
            x.r0(1554054999, i4, -1, "androidx.compose.ui.res.resources (Resources.android.kt:30)");
        }
        tVar.x(o0.f());
        Resources resources = ((Context) tVar.x(o0.g())).getResources();
        if (x.b0()) {
            x.q0();
        }
        return resources;
    }
}
