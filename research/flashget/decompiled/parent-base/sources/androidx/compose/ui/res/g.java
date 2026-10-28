package androidx.compose.ui.res;

import android.content.Context;
import androidx.annotation.h0;
import androidx.annotation.q;
import androidx.compose.runtime.d3;
import androidx.compose.runtime.t;
import androidx.compose.runtime.x;
import androidx.compose.ui.platform.h1;
import androidx.compose.ui.platform.o0;
import fg.l;
import fg.m;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;

/* compiled from: PrimitiveResources.android.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0002\u001a\u00020\u00002\b\b\u0001\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0019\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0019\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\b\u0010\t\u001a\u0019\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"", "id", "d", "(ILandroidx/compose/runtime/t;I)I", "", "c", "(ILandroidx/compose/runtime/t;I)[I", "", "a", "(ILandroidx/compose/runtime/t;I)Z", "Landroidx/compose/ui/unit/h;", "b", "(ILandroidx/compose/runtime/t;I)F", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nPrimitiveResources.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PrimitiveResources.android.kt\nandroidx/compose/ui/res/PrimitiveResources_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,82:1\n74#2:83\n74#2:84\n74#2:85\n74#2:86\n74#2:87\n*S KotlinDebug\n*F\n+ 1 PrimitiveResources.android.kt\nandroidx/compose/ui/res/PrimitiveResources_androidKt\n*L\n38#1:83\n51#1:84\n64#1:85\n77#1:86\n78#1:87\n*E\n"})
/* loaded from: classes.dex */
public final class g {
    @d3
    @androidx.compose.runtime.i
    public static final boolean a(@androidx.annotation.h int i4, @m t tVar, int i5) {
        if (x.b0()) {
            x.r0(-432394447, i5, -1, "androidx.compose.ui.res.booleanResource (PrimitiveResources.android.kt:62)");
        }
        boolean z4 = ((Context) tVar.x(o0.g())).getResources().getBoolean(i4);
        if (x.b0()) {
            x.q0();
        }
        return z4;
    }

    @d3
    @androidx.compose.runtime.i
    public static final float b(@q int i4, @m t tVar, int i5) {
        if (x.b0()) {
            x.r0(804324951, i5, -1, "androidx.compose.ui.res.dimensionResource (PrimitiveResources.android.kt:75)");
        }
        float g4 = androidx.compose.ui.unit.h.g(((Context) tVar.x(o0.g())).getResources().getDimension(i4) / ((androidx.compose.ui.unit.d) tVar.x(h1.i())).getDensity());
        if (x.b0()) {
            x.q0();
        }
        return g4;
    }

    @l
    @d3
    @androidx.compose.runtime.i
    public static final int[] c(@androidx.annotation.e int i4, @m t tVar, int i5) {
        if (x.b0()) {
            x.r0(-93991766, i5, -1, "androidx.compose.ui.res.integerArrayResource (PrimitiveResources.android.kt:49)");
        }
        int[] intArray = ((Context) tVar.x(o0.g())).getResources().getIntArray(i4);
        if (x.b0()) {
            x.q0();
        }
        return intArray;
    }

    @d3
    @androidx.compose.runtime.i
    public static final int d(@h0 int i4, @m t tVar, int i5) {
        if (x.b0()) {
            x.r0(916701108, i5, -1, "androidx.compose.ui.res.integerResource (PrimitiveResources.android.kt:36)");
        }
        int integer = ((Context) tVar.x(o0.g())).getResources().getInteger(i4);
        if (x.b0()) {
            x.q0();
        }
        return integer;
    }
}
