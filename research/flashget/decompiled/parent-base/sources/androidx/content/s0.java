package androidx.content;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import androidx.annotation.c1;
import androidx.annotation.n0;
import androidx.content.i1;
import androidx.content.q;
import androidx.content.t0;
import androidx.content.y;
import fg.l;
import fg.m;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import kotlin.k2;
import kotlin.text.v;
import org.xmlpull.v1.XmlPullParserException;
import r2.a;

/* compiled from: NavInflater.kt */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 !2\u00020\u0001:\u0001\u0011B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J/\u0010\u0011\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J/\u0010\u0015\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J/\u0010\u0019\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0011\u001a\u00020\u001b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ'\u0010\u001f\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001f\u0010 J7\u0010!\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b!\u0010\"J\u0019\u0010$\u001a\u00020#2\b\b\u0001\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b$\u0010%R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010&R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010'¨\u0006("}, d2 = {"Landroidx/navigation/s0;", "", "Landroid/content/Context;", "context", "Landroidx/navigation/d1;", "navigatorProvider", "<init>", "(Landroid/content/Context;Landroidx/navigation/d1;)V", "Landroid/content/res/Resources;", "res", "Landroid/content/res/XmlResourceParser;", "parser", "Landroid/util/AttributeSet;", "attrs", "", "graphResId", "Landroidx/navigation/f0;", "a", "(Landroid/content/res/Resources;Landroid/content/res/XmlResourceParser;Landroid/util/AttributeSet;I)Landroidx/navigation/f0;", "dest", "Lkotlin/k2;", "f", "(Landroid/content/res/Resources;Landroidx/navigation/f0;Landroid/util/AttributeSet;I)V", "Landroid/os/Bundle;", "bundle", "e", "(Landroid/content/res/Resources;Landroid/os/Bundle;Landroid/util/AttributeSet;I)V", "Landroid/content/res/TypedArray;", "Landroidx/navigation/q;", "d", "(Landroid/content/res/TypedArray;Landroid/content/res/Resources;I)Landroidx/navigation/q;", "g", "(Landroid/content/res/Resources;Landroidx/navigation/f0;Landroid/util/AttributeSet;)V", "c", "(Landroid/content/res/Resources;Landroidx/navigation/f0;Landroid/util/AttributeSet;Landroid/content/res/XmlResourceParser;I)V", "Landroidx/navigation/j0;", "b", "(I)Landroidx/navigation/j0;", "Landroid/content/Context;", "Landroidx/navigation/d1;", "navigation-runtime_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class s0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @l
    private final Context context;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    private final d1 navigatorProvider;

    /* renamed from: d, reason: collision with root package name */
    @l
    private static final String f31222d = "argument";

    /* renamed from: e, reason: collision with root package name */
    @l
    private static final String f31223e = "deepLink";

    /* renamed from: f, reason: collision with root package name */
    @l
    private static final String f31224f = "action";

    /* renamed from: g, reason: collision with root package name */
    @l
    private static final String f31225g = "include";

    /* renamed from: h, reason: collision with root package name */
    @l
    @c1({c1.a.LIBRARY_GROUP})
    public static final String f31226h = "${applicationId}";

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: i, reason: collision with root package name */
    @l
    private static final ThreadLocal<TypedValue> f31227i = new ThreadLocal<>();

    /* compiled from: NavInflater.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JG\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00062\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000b\u001a\u00020\tH\u0000¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\t8\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u000fR\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Landroidx/navigation/s0$a;", "", "<init>", "()V", "Landroid/util/TypedValue;", "value", "Landroidx/navigation/x0;", "navType", "expectedNavType", "", "argType", "foundType", "a", "(Landroid/util/TypedValue;Landroidx/navigation/x0;Landroidx/navigation/x0;Ljava/lang/String;Ljava/lang/String;)Landroidx/navigation/x0;", "APPLICATION_ID_PLACEHOLDER", "Ljava/lang/String;", "TAG_ACTION", "TAG_ARGUMENT", "TAG_DEEP_LINK", "TAG_INCLUDE", "Ljava/lang/ThreadLocal;", "sTmpValue", "Ljava/lang/ThreadLocal;", "navigation-runtime_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* renamed from: androidx.navigation.s0$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @l
        public final x0<?> a(@l TypedValue value, @m x0<?> navType, @l x0<?> expectedNavType, @m String argType, @l String foundType) throws XmlPullParserException {
            l0.p(value, "value");
            l0.p(expectedNavType, "expectedNavType");
            l0.p(foundType, "foundType");
            if (navType == null || navType == expectedNavType) {
                return navType == null ? expectedNavType : navType;
            }
            throw new XmlPullParserException("Type is " + ((Object) argType) + " but found " + foundType + ": " + value.data);
        }

        public Companion(w wVar) {
        }
    }

    public s0(@l Context context, @l d1 navigatorProvider) {
        l0.p(context, "context");
        l0.p(navigatorProvider, "navigatorProvider");
        this.context = context;
        this.navigatorProvider = navigatorProvider;
    }

    private final f0 a(Resources res, XmlResourceParser parser, AttributeSet attrs, int graphResId) throws XmlPullParserException, IOException {
        int depth;
        d1 d1Var = this.navigatorProvider;
        String name = parser.getName();
        l0.o(name, "parser.name");
        f0 a5 = d1Var.f(name).a();
        a5.L(this.context, attrs);
        int depth2 = parser.getDepth() + 1;
        while (true) {
            int next = parser.next();
            if (next == 1 || ((depth = parser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2) {
                String name2 = parser.getName();
                if (l0.g("argument", name2)) {
                    f(res, a5, attrs, graphResId);
                } else if (l0.g("deepLink", name2)) {
                    g(res, a5, attrs);
                } else if (l0.g("action", name2)) {
                    c(res, a5, attrs, parser, graphResId);
                } else if (l0.g("include", name2) && (a5 instanceof j0)) {
                    TypedArray obtainAttributes = res.obtainAttributes(attrs, i1.c.f31153i);
                    l0.o(obtainAttributes, "res.obtainAttributes(att…n.R.styleable.NavInclude)");
                    ((j0) a5).b0(b(obtainAttributes.getResourceId(i1.c.f31154j, 0)));
                    k2 k2Var = k2.f75408a;
                    obtainAttributes.recycle();
                } else if (a5 instanceof j0) {
                    ((j0) a5).b0(a(res, parser, attrs, graphResId));
                }
            }
        }
        return a5;
    }

    private final void c(Resources res, f0 dest, AttributeSet attrs, XmlResourceParser parser, int graphResId) throws IOException, XmlPullParserException {
        int depth;
        Context context = this.context;
        int[] NavAction = a.b.f89719a;
        l0.o(NavAction, "NavAction");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attrs, NavAction, 0, 0);
        int resourceId = obtainStyledAttributes.getResourceId(a.b.f89720b, 0);
        l lVar = new l(obtainStyledAttributes.getResourceId(a.b.f89721c, 0), null, null, 6, null);
        t0.a aVar = new t0.a();
        aVar.d(obtainStyledAttributes.getBoolean(a.b.f89724f, false));
        aVar.m(obtainStyledAttributes.getBoolean(a.b.f89730l, false));
        aVar.h(obtainStyledAttributes.getResourceId(a.b.f89727i, -1), obtainStyledAttributes.getBoolean(a.b.f89728j, false), obtainStyledAttributes.getBoolean(a.b.f89729k, false));
        aVar.b(obtainStyledAttributes.getResourceId(a.b.f89722d, -1));
        aVar.c(obtainStyledAttributes.getResourceId(a.b.f89723e, -1));
        aVar.e(obtainStyledAttributes.getResourceId(a.b.f89725g, -1));
        aVar.f(obtainStyledAttributes.getResourceId(a.b.f89726h, -1));
        lVar.e(aVar.a());
        Bundle bundle = new Bundle();
        int depth2 = parser.getDepth() + 1;
        while (true) {
            int next = parser.next();
            if (next == 1 || ((depth = parser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && l0.g("argument", parser.getName())) {
                e(res, bundle, attrs, graphResId);
            }
        }
        if (!bundle.isEmpty()) {
            lVar.d(bundle);
        }
        dest.R(resourceId, lVar);
        obtainStyledAttributes.recycle();
    }

    private final q d(TypedArray a5, Resources res, int graphResId) throws XmlPullParserException {
        q.a aVar = new q.a();
        int i4 = 0;
        aVar.c(a5.getBoolean(a.b.f89735q, false));
        ThreadLocal<TypedValue> threadLocal = f31227i;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        String string = a5.getString(a.b.f89734p);
        Object obj = null;
        x0<Object> a6 = string != null ? x0.INSTANCE.a(string, res.getResourcePackageName(graphResId)) : null;
        int i5 = a.b.f89733o;
        if (a5.getValue(i5, typedValue)) {
            x0<Object> x0Var = x0.f31375e;
            if (a6 == x0Var) {
                int i6 = typedValue.resourceId;
                if (i6 != 0) {
                    i4 = i6;
                } else if (typedValue.type != 16 || typedValue.data != 0) {
                    throw new XmlPullParserException("unsupported value '" + ((Object) typedValue.string) + "' for " + a6.getName() + ". Must be a reference to a resource.");
                }
                obj = Integer.valueOf(i4);
            } else {
                int i7 = typedValue.resourceId;
                if (i7 != 0) {
                    if (a6 != null) {
                        throw new XmlPullParserException("unsupported value '" + ((Object) typedValue.string) + "' for " + a6.getName() + ". You must use a \"" + x0Var.getName() + "\" type to reference other resources.");
                    }
                    a6 = x0Var;
                    obj = Integer.valueOf(i7);
                } else if (a6 == x0.f31383m) {
                    obj = a5.getString(i5);
                } else {
                    int i10 = typedValue.type;
                    if (i10 == 3) {
                        String obj2 = typedValue.string.toString();
                        if (a6 == null) {
                            a6 = x0.INSTANCE.b(obj2);
                        }
                        obj = a6.k(obj2);
                    } else if (i10 == 4) {
                        a6 = INSTANCE.a(typedValue, a6, x0.f31379i, string, "float");
                        obj = Float.valueOf(typedValue.getFloat());
                    } else if (i10 == 5) {
                        a6 = INSTANCE.a(typedValue, a6, x0.f31374d, string, "dimension");
                        obj = Integer.valueOf((int) typedValue.getDimension(res.getDisplayMetrics()));
                    } else if (i10 == 18) {
                        a6 = INSTANCE.a(typedValue, a6, x0.f31381k, string, "boolean");
                        obj = Boolean.valueOf(typedValue.data != 0);
                    } else {
                        if (i10 < 16 || i10 > 31) {
                            throw new XmlPullParserException(l0.C("unsupported argument type ", Integer.valueOf(typedValue.type)));
                        }
                        x0<Object> x0Var2 = x0.f31379i;
                        if (a6 == x0Var2) {
                            a6 = INSTANCE.a(typedValue, a6, x0Var2, string, "float");
                            obj = Float.valueOf(typedValue.data);
                        } else {
                            a6 = INSTANCE.a(typedValue, a6, x0.f31374d, string, "integer");
                            obj = Integer.valueOf(typedValue.data);
                        }
                    }
                }
            }
        }
        if (obj != null) {
            aVar.b(obj);
        }
        if (a6 != null) {
            aVar.d(a6);
        }
        return aVar.a();
    }

    private final void e(Resources res, Bundle bundle, AttributeSet attrs, int graphResId) throws XmlPullParserException {
        TypedArray obtainAttributes = res.obtainAttributes(attrs, a.b.f89731m);
        l0.o(obtainAttributes, "res.obtainAttributes(att… R.styleable.NavArgument)");
        String string = obtainAttributes.getString(a.b.f89732n);
        if (string == null) {
            throw new XmlPullParserException("Arguments must have a name");
        }
        q d5 = d(obtainAttributes, res, graphResId);
        if (d5.getIsDefaultValuePresent()) {
            d5.e(string, bundle);
        }
        k2 k2Var = k2.f75408a;
        obtainAttributes.recycle();
    }

    private final void f(Resources res, f0 dest, AttributeSet attrs, int graphResId) throws XmlPullParserException {
        TypedArray obtainAttributes = res.obtainAttributes(attrs, a.b.f89731m);
        l0.o(obtainAttributes, "res.obtainAttributes(att… R.styleable.NavArgument)");
        String string = obtainAttributes.getString(a.b.f89732n);
        if (string == null) {
            throw new XmlPullParserException("Arguments must have a name");
        }
        dest.c(string, d(obtainAttributes, res, graphResId));
        k2 k2Var = k2.f75408a;
        obtainAttributes.recycle();
    }

    private final void g(Resources res, f0 dest, AttributeSet attrs) throws XmlPullParserException {
        TypedArray obtainAttributes = res.obtainAttributes(attrs, a.b.f89736r);
        l0.o(obtainAttributes, "res.obtainAttributes(att… R.styleable.NavDeepLink)");
        String string = obtainAttributes.getString(a.b.f89740v);
        String string2 = obtainAttributes.getString(a.b.f89738t);
        String string3 = obtainAttributes.getString(a.b.f89739u);
        if ((string == null || string.length() == 0) && ((string2 == null || string2.length() == 0) && (string3 == null || string3.length() == 0))) {
            throw new XmlPullParserException("Every <deepLink> must include at least one of app:uri, app:action, or app:mimeType");
        }
        y.a aVar = new y.a();
        if (string != null) {
            String packageName = this.context.getPackageName();
            l0.o(packageName, "context.packageName");
            aVar.g(v.i2(string, "${applicationId}", packageName, false, 4, null));
        }
        if (string2 != null && string2.length() != 0) {
            String packageName2 = this.context.getPackageName();
            l0.o(packageName2, "context.packageName");
            aVar.e(v.i2(string2, "${applicationId}", packageName2, false, 4, null));
        }
        if (string3 != null) {
            String packageName3 = this.context.getPackageName();
            l0.o(packageName3, "context.packageName");
            aVar.f(v.i2(string3, "${applicationId}", packageName3, false, 4, null));
        }
        dest.f(aVar.a());
        k2 k2Var = k2.f75408a;
        obtainAttributes.recycle();
    }

    @l
    @SuppressLint({"ResourceType"})
    public final j0 b(@n0 int graphResId) {
        int next;
        Resources res = this.context.getResources();
        XmlResourceParser xml = res.getXml(graphResId);
        l0.o(xml, "res.getXml(graphResId)");
        AttributeSet attrs = Xml.asAttributeSet(xml);
        do {
            try {
                try {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } catch (Exception e4) {
                    throw new RuntimeException("Exception inflating " + ((Object) res.getResourceName(graphResId)) + " line " + xml.getLineNumber(), e4);
                }
            } finally {
                xml.close();
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        String name = xml.getName();
        l0.o(res, "res");
        l0.o(attrs, "attrs");
        f0 a5 = a(res, xml, attrs, graphResId);
        if (a5 instanceof j0) {
            return (j0) a5;
        }
        throw new IllegalArgumentException(("Root element <" + ((Object) name) + "> did not inflate into a NavGraph").toString());
    }
}
