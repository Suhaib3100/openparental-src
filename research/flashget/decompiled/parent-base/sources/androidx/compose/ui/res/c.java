package androidx.compose.ui.res;

import android.content.Context;
import androidx.annotation.b0;
import androidx.compose.runtime.d3;
import androidx.compose.runtime.t;
import androidx.compose.runtime.x;
import androidx.compose.ui.platform.o0;
import androidx.compose.ui.text.font.c1;
import androidx.compose.ui.text.font.d1;
import androidx.compose.ui.text.font.r0;
import androidx.compose.ui.text.font.y;
import fg.l;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;
import kotlin.k;
import kotlin.m;
import kotlin.x0;

/* compiled from: FontResources.android.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001f\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\u0007\u0010\b\"\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\n\" \u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\r¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/text/font/y;", "fontFamily", "Landroidx/compose/ui/text/font/d1;", "a", "(Landroidx/compose/ui/text/font/y;Landroidx/compose/runtime/t;I)Landroidx/compose/ui/text/font/d1;", "Landroid/content/Context;", "context", "b", "(Landroid/content/Context;Landroidx/compose/ui/text/font/y;)Landroidx/compose/ui/text/font/d1;", "Ljava/lang/Object;", "Ljava/lang/Object;", "cacheLock", "", "Ljava/util/Map;", "syncLoadedTypefaces", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nFontResources.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontResources.android.kt\nandroidx/compose/ui/res/FontResources_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,77:1\n74#2:78\n361#3,7:79\n*S KotlinDebug\n*F\n+ 1 FontResources.android.kt\nandroidx/compose/ui/res/FontResources_androidKt\n*L\n55#1:78\n69#1:79,7\n*E\n"})
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @l
    private static final Object f20260a = new Object();

    /* renamed from: b, reason: collision with root package name */
    @l
    @b0("cacheLock")
    private static final Map<y, d1> f20261b = new LinkedHashMap();

    @k(level = m.WARNING, message = "Prefer to preload fonts using FontFamily.Resolver.", replaceWith = @x0(expression = "FontFamily.Resolver.preload(fontFamily, Font.AndroidResourceLoader(context))", imports = {}))
    @d3
    @l
    @androidx.compose.runtime.i
    public static final d1 a(@l y yVar, @fg.m t tVar, int i4) {
        if (x.b0()) {
            x.r0(-190831095, i4, -1, "androidx.compose.ui.res.fontResource (FontResources.android.kt:53)");
        }
        d1 b5 = b((Context) tVar.x(o0.g()), yVar);
        if (x.b0()) {
            x.q0();
        }
        return b5;
    }

    @k(level = m.WARNING, message = "Prefer to preload fonts using FontFamily.Resolver.", replaceWith = @x0(expression = "FontFamily.Resolver.preload(fontFamily, Font.AndroidResourceLoader(context))", imports = {}))
    private static final d1 b(Context context, y yVar) {
        d1 d1Var;
        if (!(yVar instanceof c1) && !(yVar instanceof r0)) {
            return androidx.compose.ui.text.font.m.d(context, yVar, null, 4, null);
        }
        synchronized (f20260a) {
            try {
                Map<y, d1> map = f20261b;
                d1 d1Var2 = map.get(yVar);
                if (d1Var2 == null) {
                    d1Var2 = androidx.compose.ui.text.font.m.d(context, yVar, null, 4, null);
                    map.put(yVar, d1Var2);
                }
                d1Var = d1Var2;
            } catch (Throwable th) {
                throw th;
            }
        }
        return d1Var;
    }
}
