package androidx.compose.ui.res;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import androidx.annotation.v;
import androidx.compose.runtime.t;
import androidx.compose.runtime.x;
import androidx.compose.ui.graphics.vector.d;
import androidx.compose.ui.platform.o0;
import androidx.compose.ui.res.e;
import fg.l;
import fg.m;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;
import kotlin.k2;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: VectorResources.android.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a1\u0010\u000b\u001a\u00020\u0003*\u00020\u00002\u000e\b\u0002\u0010\b\u001a\b\u0018\u00010\u0006R\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0001¢\u0006\u0004\b\u000b\u0010\f\u001a7\u0010\u0011\u001a\u00020\u00102\u000e\b\u0002\u0010\b\u001a\b\u0018\u00010\u0006R\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/graphics/vector/d$b;", "", "id", "Landroidx/compose/ui/graphics/vector/d;", "c", "(Landroidx/compose/ui/graphics/vector/d$b;ILandroidx/compose/runtime/t;I)Landroidx/compose/ui/graphics/vector/d;", "Landroid/content/res/Resources$Theme;", "Landroid/content/res/Resources;", "theme", "res", "resId", "d", "(Landroidx/compose/ui/graphics/vector/d$b;Landroid/content/res/Resources$Theme;Landroid/content/res/Resources;I)Landroidx/compose/ui/graphics/vector/d;", "Landroid/content/res/XmlResourceParser;", "parser", "changingConfigurations", "Landroidx/compose/ui/res/e$a;", "a", "(Landroid/content/res/Resources$Theme;Landroid/content/res/Resources;Landroid/content/res/XmlResourceParser;I)Landroidx/compose/ui/res/e$a;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nVectorResources.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VectorResources.android.kt\nandroidx/compose/ui/res/VectorResources_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,154:1\n74#2:155\n83#3,3:156\n1116#4,6:159\n1#5:165\n*S KotlinDebug\n*F\n+ 1 VectorResources.android.kt\nandroidx/compose/ui/res/VectorResources_androidKt\n*L\n49#1:155\n53#1:156,3\n53#1:159,6\n*E\n"})
/* loaded from: classes.dex */
public final class j {
    @l
    public static final e.a a(@m Resources.Theme theme, @l Resources resources, @l XmlResourceParser xmlResourceParser, int i4) throws XmlPullParserException {
        AttributeSet asAttributeSet = Xml.asAttributeSet(xmlResourceParser);
        androidx.compose.ui.graphics.vector.compat.a aVar = new androidx.compose.ui.graphics.vector.compat.a(xmlResourceParser, 0, 2, null);
        d.a a5 = androidx.compose.ui.graphics.vector.compat.c.a(aVar, resources, theme, asAttributeSet);
        int i5 = 0;
        while (!androidx.compose.ui.graphics.vector.compat.c.f(xmlResourceParser)) {
            i5 = androidx.compose.ui.graphics.vector.compat.c.i(aVar, resources, asAttributeSet, theme, a5, i5);
            xmlResourceParser.next();
        }
        return new e.a(a5.f(), i4);
    }

    public static /* synthetic */ e.a b(Resources.Theme theme, Resources resources, XmlResourceParser xmlResourceParser, int i4, int i5, Object obj) throws XmlPullParserException {
        if ((i5 & 1) != 0) {
            theme = null;
        }
        return a(theme, resources, xmlResourceParser, i4);
    }

    @l
    @androidx.compose.runtime.i
    public static final androidx.compose.ui.graphics.vector.d c(@l d.Companion companion, @v int i4, @m t tVar, int i5) {
        tVar.P(44534090);
        if (x.b0()) {
            x.r0(44534090, i5, -1, "androidx.compose.ui.res.vectorResource (VectorResources.android.kt:47)");
        }
        Context context = (Context) tVar.x(o0.g());
        Resources a5 = h.a(tVar, 0);
        Resources.Theme theme = context.getTheme();
        Object[] objArr = {Integer.valueOf(i4), a5, theme, a5.getConfiguration()};
        tVar.P(-568225417);
        boolean z4 = false;
        for (int i6 = 0; i6 < 4; i6++) {
            z4 |= tVar.q0(objArr[i6]);
        }
        Object Q = tVar.Q();
        if (z4 || Q == t.INSTANCE.a()) {
            Q = d(companion, theme, a5, i4);
            tVar.E(Q);
        }
        tVar.p0();
        androidx.compose.ui.graphics.vector.d dVar = (androidx.compose.ui.graphics.vector.d) Q;
        if (x.b0()) {
            x.q0();
        }
        tVar.p0();
        return dVar;
    }

    @l
    public static final androidx.compose.ui.graphics.vector.d d(@l d.Companion companion, @m Resources.Theme theme, @l Resources resources, int i4) throws XmlPullParserException {
        TypedValue typedValue = new TypedValue();
        resources.getValue(i4, typedValue, true);
        XmlResourceParser xml = resources.getXml(i4);
        androidx.compose.ui.graphics.vector.compat.c.m(xml);
        k2 k2Var = k2.f75408a;
        return a(theme, resources, xml, typedValue.changingConfigurations).f();
    }

    public static /* synthetic */ androidx.compose.ui.graphics.vector.d e(d.Companion companion, Resources.Theme theme, Resources resources, int i4, int i5, Object obj) throws XmlPullParserException {
        if ((i5 & 1) != 0) {
            theme = null;
        }
        return d(companion, theme, resources, i4);
    }
}
