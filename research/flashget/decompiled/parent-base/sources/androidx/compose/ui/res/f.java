package androidx.compose.ui.res;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.util.TypedValue;
import androidx.annotation.v;
import androidx.compose.runtime.t;
import androidx.compose.runtime.x;
import androidx.compose.ui.graphics.s4;
import androidx.compose.ui.platform.o0;
import androidx.compose.ui.res.e;
import fg.l;
import fg.m;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;

/* compiled from: PainterResources.android.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\u0019\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a3\u0010\u000b\u001a\u00020\n2\n\u0010\u0007\u001a\u00060\u0005R\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\u000b\u0010\f\u001a'\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0010\u0010\u0011\"\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"", "id", "Landroidx/compose/ui/graphics/painter/e;", "d", "(ILandroidx/compose/runtime/t;I)Landroidx/compose/ui/graphics/painter/e;", "Landroid/content/res/Resources$Theme;", "Landroid/content/res/Resources;", "theme", "res", "changingConfigurations", "Landroidx/compose/ui/graphics/vector/d;", "c", "(Landroid/content/res/Resources$Theme;Landroid/content/res/Resources;IILandroidx/compose/runtime/t;I)Landroidx/compose/ui/graphics/vector/d;", "", "path", "Landroidx/compose/ui/graphics/s4;", "b", "(Ljava/lang/CharSequence;Landroid/content/res/Resources;I)Landroidx/compose/ui/graphics/s4;", "", "a", "Ljava/lang/String;", "errorMessage", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nPainterResources.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PainterResources.android.kt\nandroidx/compose/ui/res/PainterResources_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,125:1\n74#2:126\n74#2:144\n25#3:127\n67#3,3:134\n66#3:137\n1116#4,6:128\n1116#4,6:138\n*S KotlinDebug\n*F\n+ 1 PainterResources.android.kt\nandroidx/compose/ui/res/PainterResources_androidKt\n*L\n58#1:126\n88#1:144\n60#1:127\n69#1:134,3\n69#1:137\n60#1:128,6\n69#1:138,6\n*E\n"})
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @l
    private static final String f20270a = "Only VectorDrawables and rasterized asset types are supported ex. PNG, JPG, WEBP";

    /* JADX INFO: Access modifiers changed from: private */
    public static final s4 b(CharSequence charSequence, Resources resources, int i4) {
        try {
            return d.b(s4.INSTANCE, resources, i4);
        } catch (Exception e4) {
            throw new ResourceResolutionException("Error attempting to load resource: " + ((Object) charSequence), e4);
        }
    }

    @androidx.compose.runtime.i
    private static final androidx.compose.ui.graphics.vector.d c(Resources.Theme theme, Resources resources, int i4, int i5, t tVar, int i6) {
        tVar.P(21855625);
        if (x.b0()) {
            x.r0(21855625, i6, -1, "androidx.compose.ui.res.loadVectorResource (PainterResources.android.kt:86)");
        }
        e eVar = (e) tVar.x(o0.h());
        e.b bVar = new e.b(theme, i4);
        e.a b5 = eVar.b(bVar);
        if (b5 == null) {
            XmlResourceParser xml = resources.getXml(i4);
            if (!l0.g(androidx.compose.ui.graphics.vector.compat.c.m(xml).getName(), "vector")) {
                throw new IllegalArgumentException("Only VectorDrawables and rasterized asset types are supported ex. PNG, JPG, WEBP");
            }
            b5 = j.a(theme, resources, xml, i5);
            eVar.d(bVar, b5);
        }
        androidx.compose.ui.graphics.vector.d f4 = b5.f();
        if (x.b0()) {
            x.q0();
        }
        tVar.p0();
        return f4;
    }

    @l
    @androidx.compose.runtime.i
    public static final androidx.compose.ui.graphics.painter.e d(@v int i4, @m t tVar, int i5) {
        androidx.compose.ui.graphics.painter.e aVar;
        tVar.P(473971343);
        if (x.b0()) {
            x.r0(473971343, i5, -1, "androidx.compose.ui.res.painterResource (PainterResources.android.kt:56)");
        }
        Context context = (Context) tVar.x(o0.g());
        Resources a5 = h.a(tVar, 0);
        tVar.P(-492369756);
        Object Q = tVar.Q();
        t.Companion companion = t.INSTANCE;
        if (Q == companion.a()) {
            Q = new TypedValue();
            tVar.E(Q);
        }
        tVar.p0();
        TypedValue typedValue = (TypedValue) Q;
        a5.getValue(i4, typedValue, true);
        CharSequence charSequence = typedValue.string;
        if (charSequence == null || !kotlin.text.v.Z2(charSequence, ".xml", false, 2, null)) {
            tVar.P(-738265172);
            Object valueOf = Integer.valueOf(i4);
            Object theme = context.getTheme();
            tVar.P(1618982084);
            boolean q02 = tVar.q0(valueOf) | tVar.q0(charSequence) | tVar.q0(theme);
            Object Q2 = tVar.Q();
            if (q02 || Q2 == companion.a()) {
                Q2 = b(charSequence, a5, i4);
                tVar.E(Q2);
            }
            tVar.p0();
            aVar = new androidx.compose.ui.graphics.painter.a((s4) Q2, 0L, 0L, 6, null);
            tVar.p0();
        } else {
            tVar.P(-738265327);
            aVar = androidx.compose.ui.graphics.vector.x.k(c(context.getTheme(), a5, i4, typedValue.changingConfigurations, tVar, ((i5 << 6) & 896) | 72), tVar, 0);
            tVar.p0();
        }
        if (x.b0()) {
            x.q0();
        }
        tVar.p0();
        return aVar;
    }
}
