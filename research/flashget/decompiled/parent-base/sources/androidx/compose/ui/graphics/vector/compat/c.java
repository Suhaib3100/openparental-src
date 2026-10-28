package androidx.compose.ui.graphics.vector.compat;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.compose.ui.graphics.d2;
import androidx.compose.ui.graphics.f2;
import androidx.compose.ui.graphics.g6;
import androidx.compose.ui.graphics.i5;
import androidx.compose.ui.graphics.i6;
import androidx.compose.ui.graphics.j6;
import androidx.compose.ui.graphics.k1;
import androidx.compose.ui.graphics.t1;
import androidx.compose.ui.graphics.u1;
import androidx.compose.ui.graphics.vector.d;
import androidx.compose.ui.graphics.vector.i;
import androidx.compose.ui.graphics.vector.u;
import androidx.compose.ui.unit.h;
import androidx.core.content.res.n;
import fg.l;
import fg.m;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: XmlVectorParser.android.kt */
@Metadata(d1 = {"\u0000\\\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0006\u001a$\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0006H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\u0005\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0000¢\u0006\u0004\b\n\u0010\u000b\u001aC\u0010\u0016\u001a\u00020\u0000*\u00020\f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u000e\b\u0002\u0010\u0012\u001a\b\u0018\u00010\u0011R\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0013\u0010\u0018\u001a\u00020\b*\u00020\bH\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a1\u0010\u001a\u001a\u00020\u0013*\u00020\f2\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0012\u001a\b\u0018\u00010\u0011R\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a9\u0010\u001d\u001a\u00020\u001c*\u00020\f2\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0012\u001a\b\u0018\u00010\u0011R\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u0019\u0010\"\u001a\u0004\u0018\u00010!2\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b\"\u0010#\u001a9\u0010$\u001a\u00020\u001c*\u00020\f2\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0012\u001a\b\u0018\u00010\u0011R\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0000¢\u0006\u0004\b$\u0010\u001e\u001a9\u0010%\u001a\u00020\u001c*\u00020\f2\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0012\u001a\b\u0018\u00010\u0011R\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0000¢\u0006\u0004\b%\u0010\u001e\"\u0014\u0010'\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010&\"\u0014\u0010(\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0004\u0010&\"\u0014\u0010*\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b)\u0010&\"\u0014\u0010+\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010&\"\u0014\u0010-\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b,\u0010&\"\u0014\u0010.\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010&\"\u0014\u0010/\u001a\u00020\u00008\u0002X\u0082D¢\u0006\u0006\n\u0004\b\"\u0010&\"\u0014\u00102\u001a\u0002008\u0002X\u0082T¢\u0006\u0006\n\u0004\b$\u00101\"\u0014\u00103\u001a\u0002008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u00101\"\u0014\u00105\u001a\u0002008\u0002X\u0082T¢\u0006\u0006\n\u0004\b4\u00101\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00066"}, d2 = {"", "id", "Landroidx/compose/ui/graphics/i6;", "defValue", "b", "(II)I", "Landroidx/compose/ui/graphics/j6;", "d", "Lorg/xmlpull/v1/XmlPullParser;", "", "f", "(Lorg/xmlpull/v1/XmlPullParser;)Z", "Landroidx/compose/ui/graphics/vector/compat/a;", "Landroid/content/res/Resources;", "res", "Landroid/util/AttributeSet;", "attrs", "Landroid/content/res/Resources$Theme;", "theme", "Landroidx/compose/ui/graphics/vector/d$a;", "builder", "nestedGroups", "i", "(Landroidx/compose/ui/graphics/vector/compat/a;Landroid/content/res/Resources;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;Landroidx/compose/ui/graphics/vector/d$a;I)I", "m", "(Lorg/xmlpull/v1/XmlPullParser;)Lorg/xmlpull/v1/XmlPullParser;", "a", "(Landroidx/compose/ui/graphics/vector/compat/a;Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Landroid/util/AttributeSet;)Landroidx/compose/ui/graphics/vector/d$a;", "Lkotlin/k2;", "l", "(Landroidx/compose/ui/graphics/vector/compat/a;Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Landroid/util/AttributeSet;Landroidx/compose/ui/graphics/vector/d$a;)V", "Landroidx/core/content/res/d;", "complexColor", "Landroidx/compose/ui/graphics/t1;", "g", "(Landroidx/core/content/res/d;)Landroidx/compose/ui/graphics/t1;", "h", "k", "I", "LINECAP_BUTT", "LINECAP_ROUND", "c", "LINECAP_SQUARE", "LINEJOIN_MITER", "e", "LINEJOIN_ROUND", "LINEJOIN_BEVEL", "FILL_TYPE_WINDING", "", "Ljava/lang/String;", "SHAPE_CLIP_PATH", "SHAPE_GROUP", "j", "SHAPE_PATH", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nXmlVectorParser.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 XmlVectorParser.android.kt\nandroidx/compose/ui/graphics/vector/compat/XmlVectorParser_androidKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,727:1\n174#2:728\n174#2:729\n*S KotlinDebug\n*F\n+ 1 XmlVectorParser.android.kt\nandroidx/compose/ui/graphics/vector/compat/XmlVectorParser_androidKt\n*L\n239#1:728\n240#1:729\n*E\n"})
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private static final int f18122a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static final int f18123b = 1;

    /* renamed from: c, reason: collision with root package name */
    private static final int f18124c = 2;

    /* renamed from: d, reason: collision with root package name */
    private static final int f18125d = 0;

    /* renamed from: e, reason: collision with root package name */
    private static final int f18126e = 1;

    /* renamed from: f, reason: collision with root package name */
    private static final int f18127f = 2;

    /* renamed from: g, reason: collision with root package name */
    private static final int f18128g = 0;

    /* renamed from: h, reason: collision with root package name */
    @l
    private static final String f18129h = "clip-path";

    /* renamed from: i, reason: collision with root package name */
    @l
    private static final String f18130i = "group";

    /* renamed from: j, reason: collision with root package name */
    @l
    private static final String f18131j = "path";

    @l
    public static final d.a a(@l a aVar, @l Resources resources, @m Resources.Theme theme, @l AttributeSet attributeSet) {
        long j4;
        int i4;
        b bVar = b.f18096a;
        TypedArray p4 = aVar.p(resources, theme, attributeSet, bVar.H());
        boolean i5 = aVar.i(p4, "autoMirrored", bVar.b(), false);
        float l4 = aVar.l(p4, "viewportWidth", bVar.J(), 0.0f);
        float l5 = aVar.l(p4, "viewportHeight", bVar.I(), 0.0f);
        if (l4 <= 0.0f) {
            throw new XmlPullParserException(p4.getPositionDescription() + "<VectorGraphic> tag requires viewportWidth > 0");
        }
        if (l5 <= 0.0f) {
            throw new XmlPullParserException(p4.getPositionDescription() + "<VectorGraphic> tag requires viewportHeight > 0");
        }
        float f4 = aVar.f(p4, bVar.K(), 0.0f);
        float f5 = aVar.f(p4, bVar.o(), 0.0f);
        if (p4.hasValue(bVar.F())) {
            TypedValue typedValue = new TypedValue();
            p4.getValue(bVar.F(), typedValue);
            if (typedValue.type == 2) {
                d2.INSTANCE.getClass();
                j4 = d2.f17778o;
            } else {
                ColorStateList j5 = aVar.j(p4, theme, "tint", bVar.F());
                if (j5 != null) {
                    j4 = f2.b(j5.getDefaultColor());
                } else {
                    d2.INSTANCE.getClass();
                    j4 = d2.f17778o;
                }
            }
        } else {
            d2.INSTANCE.getClass();
            j4 = d2.f17778o;
        }
        long j6 = j4;
        int h4 = aVar.h(p4, bVar.G(), -1);
        if (h4 == -1) {
            k1.INSTANCE.getClass();
            i4 = k1.f17879h;
        } else if (h4 == 3) {
            k1.INSTANCE.getClass();
            i4 = k1.f17877f;
        } else if (h4 == 5) {
            k1.INSTANCE.getClass();
            i4 = k1.f17879h;
        } else if (h4 != 9) {
            switch (h4) {
                case 14:
                    k1.INSTANCE.getClass();
                    i4 = k1.f17887p;
                    break;
                case 15:
                    k1.INSTANCE.getClass();
                    i4 = k1.f17888q;
                    break;
                case 16:
                    k1.INSTANCE.getClass();
                    i4 = k1.f17886o;
                    break;
                default:
                    k1.INSTANCE.getClass();
                    i4 = k1.f17879h;
                    break;
            }
        } else {
            k1.INSTANCE.getClass();
            i4 = k1.f17883l;
        }
        int i6 = i4;
        float g4 = h.g(f4 / resources.getDisplayMetrics().density);
        float f6 = f5 / resources.getDisplayMetrics().density;
        p4.recycle();
        return new d.a(null, g4, f6, l4, l5, j6, i6, i5, 1, null);
    }

    private static final int b(int i4, int i5) {
        if (i4 == 0) {
            i6.INSTANCE.getClass();
            return i6.f17861c;
        }
        if (i4 == 1) {
            i6.INSTANCE.getClass();
            return i6.f17862d;
        }
        if (i4 != 2) {
            return i5;
        }
        i6.INSTANCE.getClass();
        return i6.f17863e;
    }

    static int c(int i4, int i5, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            i6.INSTANCE.getClass();
            i5 = i6.f17861c;
        }
        return b(i4, i5);
    }

    private static final int d(int i4, int i5) {
        if (i4 == 0) {
            j6.INSTANCE.getClass();
            return j6.f17869c;
        }
        if (i4 == 1) {
            j6.INSTANCE.getClass();
            return j6.f17870d;
        }
        if (i4 != 2) {
            return i5;
        }
        j6.INSTANCE.getClass();
        return j6.f17871e;
    }

    static int e(int i4, int i5, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            j6.INSTANCE.getClass();
            i5 = j6.f17869c;
        }
        return d(i4, i5);
    }

    public static final boolean f(@l XmlPullParser xmlPullParser) {
        if (xmlPullParser.getEventType() != 1) {
            return xmlPullParser.getDepth() < 1 && xmlPullParser.getEventType() == 3;
        }
        return true;
    }

    private static final t1 g(androidx.core.content.res.d dVar) {
        if (!dVar.l()) {
            return null;
        }
        Shader f4 = dVar.f();
        return f4 != null ? u1.a(f4) : new g6(f2.b(dVar.e()), null);
    }

    public static final void h(@l a aVar, @l Resources resources, @m Resources.Theme theme, @l AttributeSet attributeSet, @l d.a aVar2) {
        b bVar = b.f18096a;
        TypedArray p4 = aVar.p(resources, theme, attributeSet, bVar.c());
        String n4 = aVar.n(p4, bVar.d());
        if (n4 == null) {
            n4 = "";
        }
        List<i> b5 = u.b(aVar.n(p4, bVar.e()));
        p4.recycle();
        aVar2.a((r20 & 1) != 0 ? "" : n4, (r20 & 2) != 0 ? 0.0f : 0.0f, (r20 & 4) != 0 ? 0.0f : 0.0f, (r20 & 8) != 0 ? 0.0f : 0.0f, (r20 & 16) != 0 ? 1.0f : 0.0f, (r20 & 32) == 0 ? 0.0f : 1.0f, (r20 & 64) != 0 ? 0.0f : 0.0f, (r20 & 128) == 0 ? 0.0f : 0.0f, (r20 & 256) != 0 ? u.h() : b5);
    }

    public static final int i(@l a aVar, @l Resources resources, @l AttributeSet attributeSet, @m Resources.Theme theme, @l d.a aVar2, int i4) {
        int eventType = aVar.o().getEventType();
        if (eventType != 2) {
            if (eventType != 3 || !l0.g("group", aVar.o().getName())) {
                return i4;
            }
            int i5 = i4 + 1;
            for (int i6 = 0; i6 < i5; i6++) {
                aVar2.g();
            }
            return 0;
        }
        String name = aVar.o().getName();
        if (name == null) {
            return i4;
        }
        int hashCode = name.hashCode();
        if (hashCode == -1649314686) {
            if (!name.equals("clip-path")) {
                return i4;
            }
            h(aVar, resources, theme, attributeSet, aVar2);
            return i4 + 1;
        }
        if (hashCode == 3433509) {
            if (!name.equals("path")) {
                return i4;
            }
            l(aVar, resources, theme, attributeSet, aVar2);
            return i4;
        }
        if (hashCode != 98629247 || !name.equals("group")) {
            return i4;
        }
        k(aVar, resources, theme, attributeSet, aVar2);
        return i4;
    }

    public static /* synthetic */ int j(a aVar, Resources resources, AttributeSet attributeSet, Resources.Theme theme, d.a aVar2, int i4, int i5, Object obj) {
        if ((i5 & 4) != 0) {
            theme = null;
        }
        return i(aVar, resources, attributeSet, theme, aVar2, i4);
    }

    public static final void k(@l a aVar, @l Resources resources, @m Resources.Theme theme, @l AttributeSet attributeSet, @l d.a aVar2) {
        b bVar = b.f18096a;
        TypedArray p4 = aVar.p(resources, theme, attributeSet, bVar.f());
        float l4 = aVar.l(p4, "rotation", bVar.j(), 0.0f);
        float g4 = aVar.g(p4, bVar.h(), 0.0f);
        float g5 = aVar.g(p4, bVar.i(), 0.0f);
        float l5 = aVar.l(p4, "scaleX", bVar.k(), 1.0f);
        float l6 = aVar.l(p4, "scaleY", bVar.l(), 1.0f);
        float l7 = aVar.l(p4, "translateX", bVar.m(), 0.0f);
        float l10 = aVar.l(p4, "translateY", bVar.n(), 0.0f);
        String n4 = aVar.n(p4, bVar.g());
        if (n4 == null) {
            n4 = "";
        }
        p4.recycle();
        aVar2.a(n4, l4, g4, g5, l5, l6, l7, l10, u.h());
    }

    public static final void l(@l a aVar, @l Resources resources, @m Resources.Theme theme, @l AttributeSet attributeSet, @l d.a aVar2) throws IllegalArgumentException {
        b bVar = b.f18096a;
        TypedArray p4 = aVar.p(resources, theme, attributeSet, bVar.q());
        if (!n.r(aVar.o(), "pathData")) {
            throw new IllegalArgumentException("No path data available");
        }
        String n4 = aVar.n(p4, bVar.t());
        if (n4 == null) {
            n4 = "";
        }
        String str = n4;
        List<i> b5 = u.b(aVar.n(p4, bVar.u()));
        androidx.core.content.res.d k4 = aVar.k(p4, theme, "fillColor", bVar.s(), 0);
        float l4 = aVar.l(p4, "fillAlpha", bVar.r(), 1.0f);
        int m4 = aVar.m(p4, "strokeLineCap", bVar.x(), -1);
        i6.INSTANCE.getClass();
        int b6 = b(m4, i6.f17861c);
        int m5 = aVar.m(p4, "strokeLineJoin", bVar.y(), -1);
        j6.INSTANCE.getClass();
        int d5 = d(m5, j6.f17871e);
        float l5 = aVar.l(p4, "strokeMiterLimit", bVar.z(), 1.0f);
        androidx.core.content.res.d k5 = aVar.k(p4, theme, "strokeColor", bVar.w(), 0);
        float l6 = aVar.l(p4, "strokeAlpha", bVar.v(), 1.0f);
        float l7 = aVar.l(p4, "strokeWidth", bVar.A(), 1.0f);
        float l10 = aVar.l(p4, "trimPathEnd", bVar.B(), 1.0f);
        float l11 = aVar.l(p4, "trimPathOffset", bVar.D(), 0.0f);
        float l12 = aVar.l(p4, "trimPathStart", bVar.E(), 0.0f);
        int m6 = aVar.m(p4, "fillType", bVar.C(), f18128g);
        p4.recycle();
        t1 g4 = g(k4);
        t1 g5 = g(k5);
        i5.INSTANCE.getClass();
        aVar2.c(b5, m6 == 0 ? i5.f17857c : i5.f17858d, str, g4, l4, g5, l6, l7, b6, d5, l5, l12, l10, l11);
    }

    @l
    public static final XmlPullParser m(@l XmlPullParser xmlPullParser) throws XmlPullParserException {
        int next = xmlPullParser.next();
        while (next != 2 && next != 1) {
            next = xmlPullParser.next();
        }
        if (next == 2) {
            return xmlPullParser;
        }
        throw new XmlPullParserException("No start tag found");
    }
}
