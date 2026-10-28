package androidx.compose.ui.graphics.vector.compat;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.i1;
import androidx.compose.runtime.internal.u;
import androidx.core.content.res.d;
import androidx.core.content.res.n;
import androidx.view.e;
import fg.l;
import fg.m;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: XmlVectorParser.android.kt */
@u(parameters = 0)
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0080\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000bJ3\u0010\u0015\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\f2\f\u0010\u000f\u001a\b\u0018\u00010\u000eR\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J/\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u00182\b\b\u0001\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u0004¢\u0006\u0004\b\u001c\u0010\u001dJ/\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u00182\b\b\u0001\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001e¢\u0006\u0004\b\u001f\u0010 J/\u0010\"\u001a\u00020!2\u0006\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u00182\b\b\u0001\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020!¢\u0006\u0004\b\"\u0010#J%\u0010%\u001a\u00020\u001e2\u0006\u0010\u0017\u001a\u00020\u00142\u0006\u0010$\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001e¢\u0006\u0004\b%\u0010&J%\u0010'\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00142\u0006\u0010$\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u0004¢\u0006\u0004\b'\u0010(J\u001f\u0010)\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0017\u001a\u00020\u00142\u0006\u0010$\u001a\u00020\u0004¢\u0006\u0004\b)\u0010*J%\u0010,\u001a\u00020\u001e2\u0006\u0010\u0017\u001a\u00020\u00142\u0006\u0010$\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u001e¢\u0006\u0004\b,\u0010&J?\u0010.\u001a\u00020-2\u0006\u0010\u0017\u001a\u00020\u00142\f\u0010\u000f\u001a\b\u0018\u00010\u000eR\u00020\f2\u0006\u0010\u0019\u001a\u00020\u00182\b\b\u0001\u0010\u001a\u001a\u00020\u00042\b\b\u0001\u0010\u001b\u001a\u00020\u0004¢\u0006\u0004\b.\u0010/J7\u00101\u001a\u0004\u0018\u0001002\u0006\u0010\u0017\u001a\u00020\u00142\f\u0010\u000f\u001a\b\u0018\u00010\u000eR\u00020\f2\u0006\u0010\u0019\u001a\u00020\u00182\b\b\u0001\u0010\u001a\u001a\u00020\u0004¢\u0006\u0004\b1\u00102J\u0010\u00103\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b3\u00104J\u0010\u00105\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b5\u00106J$\u00107\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b7\u00108J\u0010\u00109\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b9\u0010:J\u0010\u0010;\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b;\u00106J\u001a\u0010=\u001a\u00020!2\b\u0010<\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b=\u0010>R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b3\u0010?\u001a\u0004\b@\u00104R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u0010A\u001a\u0004\bB\u00106\"\u0004\bC\u0010\u000b¨\u0006D"}, d2 = {"Landroidx/compose/ui/graphics/vector/compat/a;", "", "Lorg/xmlpull/v1/XmlPullParser;", "xmlParser", "", "config", "<init>", "(Lorg/xmlpull/v1/XmlPullParser;I)V", "resConfig", "Lkotlin/k2;", "r", "(I)V", "Landroid/content/res/Resources;", "res", "Landroid/content/res/Resources$Theme;", "theme", "Landroid/util/AttributeSet;", "set", "", "attrs", "Landroid/content/res/TypedArray;", "p", "(Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;", "typedArray", "", "attrName", "resId", "defaultValue", "m", "(Landroid/content/res/TypedArray;Ljava/lang/String;II)I", "", "l", "(Landroid/content/res/TypedArray;Ljava/lang/String;IF)F", "", "i", "(Landroid/content/res/TypedArray;Ljava/lang/String;IZ)Z", "index", "g", "(Landroid/content/res/TypedArray;IF)F", "h", "(Landroid/content/res/TypedArray;II)I", "n", "(Landroid/content/res/TypedArray;I)Ljava/lang/String;", "defValue", "f", "Landroidx/core/content/res/d;", "k", "(Landroid/content/res/TypedArray;Landroid/content/res/Resources$Theme;Ljava/lang/String;II)Landroidx/core/content/res/d;", "Landroid/content/res/ColorStateList;", "j", "(Landroid/content/res/TypedArray;Landroid/content/res/Resources$Theme;Ljava/lang/String;I)Landroid/content/res/ColorStateList;", "a", "()Lorg/xmlpull/v1/XmlPullParser;", "b", "()I", "c", "(Lorg/xmlpull/v1/XmlPullParser;I)Landroidx/compose/ui/graphics/vector/compat/a;", "toString", "()Ljava/lang/String;", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "Lorg/xmlpull/v1/XmlPullParser;", "o", "I", "e", "q", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class a {

    /* renamed from: c, reason: collision with root package name */
    public static final int f18093c = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @l
    private final XmlPullParser xmlParser;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int config;

    public a(@l XmlPullParser xmlPullParser, int i4) {
        this.xmlParser = xmlPullParser;
        this.config = i4;
    }

    public static a d(a aVar, XmlPullParser xmlPullParser, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            xmlPullParser = aVar.xmlParser;
        }
        if ((i5 & 2) != 0) {
            i4 = aVar.config;
        }
        aVar.getClass();
        return new a(xmlPullParser, i4);
    }

    private final void r(int resConfig) {
        this.config = resConfig | this.config;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final XmlPullParser getXmlParser() {
        return this.xmlParser;
    }

    /* renamed from: b, reason: from getter */
    public final int getConfig() {
        return this.config;
    }

    @l
    public final a c(@l XmlPullParser xmlParser, int config) {
        return new a(xmlParser, config);
    }

    public final int e() {
        return this.config;
    }

    public boolean equals(@m Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof a)) {
            return false;
        }
        a aVar = (a) other;
        return l0.g(this.xmlParser, aVar.xmlParser) && this.config == aVar.config;
    }

    public final float f(@l TypedArray typedArray, int index, float defValue) {
        float dimension = typedArray.getDimension(index, defValue);
        r(typedArray.getChangingConfigurations());
        return dimension;
    }

    public final float g(@l TypedArray typedArray, int index, float defaultValue) {
        float f4 = typedArray.getFloat(index, defaultValue);
        r(typedArray.getChangingConfigurations());
        return f4;
    }

    public final int h(@l TypedArray typedArray, int index, int defaultValue) {
        int i4 = typedArray.getInt(index, defaultValue);
        r(typedArray.getChangingConfigurations());
        return i4;
    }

    public int hashCode() {
        return Integer.hashCode(this.config) + (this.xmlParser.hashCode() * 31);
    }

    public final boolean i(@l TypedArray typedArray, @l String attrName, @i1 int resId, boolean defaultValue) {
        boolean e4 = n.e(typedArray, this.xmlParser, attrName, resId, defaultValue);
        r(typedArray.getChangingConfigurations());
        return e4;
    }

    @m
    public final ColorStateList j(@l TypedArray typedArray, @m Resources.Theme theme, @l String attrName, @i1 int resId) {
        ColorStateList g4 = n.g(typedArray, this.xmlParser, theme, attrName, resId);
        r(typedArray.getChangingConfigurations());
        return g4;
    }

    @l
    public final d k(@l TypedArray typedArray, @m Resources.Theme theme, @l String attrName, @i1 int resId, @androidx.annotation.l int defaultValue) {
        d i4 = n.i(typedArray, this.xmlParser, theme, attrName, resId, defaultValue);
        r(typedArray.getChangingConfigurations());
        return i4;
    }

    public final float l(@l TypedArray typedArray, @l String attrName, @i1 int resId, float defaultValue) {
        float j4 = n.j(typedArray, this.xmlParser, attrName, resId, defaultValue);
        r(typedArray.getChangingConfigurations());
        return j4;
    }

    public final int m(@l TypedArray typedArray, @l String attrName, @i1 int resId, int defaultValue) {
        int k4 = n.k(typedArray, this.xmlParser, attrName, resId, defaultValue);
        r(typedArray.getChangingConfigurations());
        return k4;
    }

    @m
    public final String n(@l TypedArray typedArray, int index) {
        String string = typedArray.getString(index);
        r(typedArray.getChangingConfigurations());
        return string;
    }

    @l
    public final XmlPullParser o() {
        return this.xmlParser;
    }

    @l
    public final TypedArray p(@l Resources res, @m Resources.Theme theme, @l AttributeSet set, @l int[] attrs) {
        TypedArray s4 = n.s(res, theme, set, attrs);
        r(s4.getChangingConfigurations());
        return s4;
    }

    public final void q(int i4) {
        this.config = i4;
    }

    @l
    public String toString() {
        StringBuilder sb = new StringBuilder("AndroidVectorParser(xmlParser=");
        sb.append(this.xmlParser);
        sb.append(", config=");
        return e.a(sb, this.config, ')');
    }

    public /* synthetic */ a(XmlPullParser xmlPullParser, int i4, int i5, w wVar) {
        this(xmlPullParser, (i5 & 2) != 0 ? 0 : i4);
    }
}
