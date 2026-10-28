package androidx.compose.ui.res;

import androidx.annotation.g1;
import androidx.annotation.t0;
import androidx.compose.runtime.d3;
import androidx.compose.runtime.t;
import androidx.compose.runtime.x;
import fg.l;
import fg.m;
import java.util.Arrays;
import kotlin.Metadata;

/* compiled from: StringResources.android.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u000b\u001a\u0019\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a-\u0010\b\u001a\u00020\u00022\b\b\u0001\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\"\u00020\u0006H\u0007¢\u0006\u0004\b\b\u0010\t\u001a\u001f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\b\b\u0001\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a!\u0010\r\u001a\u00020\u00022\b\b\u0001\u0010\u0001\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\r\u0010\u000e\u001a5\u0010\u000f\u001a\u00020\u00022\b\b\u0001\u0010\u0001\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u00002\u0012\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\"\u00020\u0006H\u0007¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"", "id", "", "d", "(ILandroidx/compose/runtime/t;I)Ljava/lang/String;", "", "", "formatArgs", "e", "(I[Ljava/lang/Object;Landroidx/compose/runtime/t;I)Ljava/lang/String;", "c", "(ILandroidx/compose/runtime/t;I)[Ljava/lang/String;", "count", "a", "(IILandroidx/compose/runtime/t;I)Ljava/lang/String;", "b", "(II[Ljava/lang/Object;Landroidx/compose/runtime/t;I)Ljava/lang/String;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class i {
    @l
    @d3
    @androidx.compose.runtime.i
    public static final String a(@t0 int i4, int i5, @m t tVar, int i6) {
        if (x.b0()) {
            x.r0(1784741530, i6, -1, "androidx.compose.ui.res.pluralStringResource (StringResources.android.kt:73)");
        }
        String quantityString = h.a(tVar, 0).getQuantityString(i4, i5);
        if (x.b0()) {
            x.q0();
        }
        return quantityString;
    }

    @l
    @d3
    @androidx.compose.runtime.i
    public static final String b(@t0 int i4, int i5, @l Object[] objArr, @m t tVar, int i6) {
        if (x.b0()) {
            x.r0(523207213, i6, -1, "androidx.compose.ui.res.pluralStringResource (StringResources.android.kt:88)");
        }
        String quantityString = h.a(tVar, 0).getQuantityString(i4, i5, Arrays.copyOf(objArr, objArr.length));
        if (x.b0()) {
            x.q0();
        }
        return quantityString;
    }

    @l
    @d3
    @androidx.compose.runtime.i
    public static final String[] c(@androidx.annotation.e int i4, @m t tVar, int i5) {
        if (x.b0()) {
            x.r0(1562162650, i5, -1, "androidx.compose.ui.res.stringArrayResource (StringResources.android.kt:59)");
        }
        String[] stringArray = h.a(tVar, 0).getStringArray(i4);
        if (x.b0()) {
            x.q0();
        }
        return stringArray;
    }

    @l
    @d3
    @androidx.compose.runtime.i
    public static final String d(@g1 int i4, @m t tVar, int i5) {
        if (x.b0()) {
            x.r0(1223887937, i5, -1, "androidx.compose.ui.res.stringResource (StringResources.android.kt:32)");
        }
        String string = h.a(tVar, 0).getString(i4);
        if (x.b0()) {
            x.q0();
        }
        return string;
    }

    @l
    @d3
    @androidx.compose.runtime.i
    public static final String e(@g1 int i4, @l Object[] objArr, @m t tVar, int i5) {
        if (x.b0()) {
            x.r0(2071230100, i5, -1, "androidx.compose.ui.res.stringResource (StringResources.android.kt:46)");
        }
        String string = h.a(tVar, 0).getString(i4, Arrays.copyOf(objArr, objArr.length));
        if (x.b0()) {
            x.q0();
        }
        return string;
    }
}
