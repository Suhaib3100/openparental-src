package androidx.compose.material3;

import android.content.Context;
import android.content.res.Configuration;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;

/* compiled from: Strings.android.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a\u001a\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a.\u0010\b\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\"\u00020\u0006H\u0001ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\n"}, d2 = {"Landroidx/compose/material3/t9;", "string", "", "a", "(ILandroidx/compose/runtime/t;I)Ljava/lang/String;", "", "", "formatArgs", "b", "(I[Ljava/lang/Object;Landroidx/compose/runtime/t;I)Ljava/lang/String;", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nStrings.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Strings.android.kt\nandroidx/compose/material3/Strings_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,167:1\n74#2:168\n74#2:169\n74#2:170\n*S KotlinDebug\n*F\n+ 1 Strings.android.kt\nandroidx/compose/material3/Strings_androidKt\n*L\n32#1:168\n33#1:169\n42#1:170\n*E\n"})
/* loaded from: classes.dex */
public final class v9 {
    @fg.l
    @androidx.compose.runtime.d3
    @androidx.compose.runtime.i
    public static final String a(int i4, @fg.m androidx.compose.runtime.t tVar, int i5) {
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-176762646, i5, -1, "androidx.compose.material3.getString (Strings.android.kt:30)");
        }
        tVar.x(androidx.compose.ui.platform.o0.f());
        String string = ((Context) tVar.x(androidx.compose.ui.platform.o0.g())).getResources().getString(i4);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        return string;
    }

    @fg.l
    @androidx.compose.runtime.d3
    @androidx.compose.runtime.i
    public static final String b(int i4, @fg.l Object[] objArr, @fg.m androidx.compose.runtime.t tVar, int i5) {
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-1126124681, i5, -1, "androidx.compose.material3.getString (Strings.android.kt:38)");
        }
        String a5 = a(i4, tVar, i5 & 14);
        Locale d5 = androidx.core.os.g.a((Configuration) tVar.x(androidx.compose.ui.platform.o0.f())).d(0);
        if (d5 == null) {
            d5 = Locale.getDefault();
        }
        kotlin.jvm.internal.t1 t1Var = kotlin.jvm.internal.t1.f75371a;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        String a6 = u9.a(copyOf, copyOf.length, d5, a5, "format(locale, format, *args)");
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        return a6;
    }
}
