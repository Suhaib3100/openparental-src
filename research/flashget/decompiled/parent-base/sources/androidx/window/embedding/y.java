package androidx.window.embedding;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import java.util.HashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import n3.a;

/* compiled from: SplitRuleParser.kt */
@androidx.window.core.d
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ!\u0010\"\u001a\u00020!2\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0002¢\u0006\u0004\b\"\u0010#J'\u0010%\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u0006H\u0000¢\u0006\u0004\b%\u0010\u000b¨\u0006&"}, d2 = {"Landroidx/window/embedding/y;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "splitResourceId", "", "Landroidx/window/embedding/m;", "h", "(Landroid/content/Context;I)Ljava/util/Set;", "Landroid/content/res/XmlResourceParser;", "parser", "Landroidx/window/embedding/v;", "e", "(Landroid/content/Context;Landroid/content/res/XmlResourceParser;)Landroidx/window/embedding/v;", "Landroidx/window/embedding/w;", "f", "(Landroid/content/Context;Landroid/content/res/XmlResourceParser;)Landroidx/window/embedding/w;", "Landroidx/window/embedding/u;", "d", "(Landroid/content/Context;Landroid/content/res/XmlResourceParser;)Landroidx/window/embedding/u;", "Landroidx/window/embedding/b;", "c", "(Landroid/content/Context;Landroid/content/res/XmlResourceParser;)Landroidx/window/embedding/b;", "Landroidx/window/embedding/a;", "b", "(Landroid/content/Context;Landroid/content/res/XmlResourceParser;)Landroidx/window/embedding/a;", "", "pkg", "", "clsSeq", "Landroid/content/ComponentName;", "a", "(Ljava/lang/String;Ljava/lang/CharSequence;)Landroid/content/ComponentName;", "staticRuleResourceId", "g", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class y {
    private final ComponentName a(String pkg, CharSequence clsSeq) {
        if (clsSeq == null || clsSeq.length() == 0) {
            throw new IllegalArgumentException("Activity name must not be null");
        }
        String obj = clsSeq.toString();
        if (obj.charAt(0) == '.') {
            return new ComponentName(pkg, l0.C(pkg, obj));
        }
        int o32 = kotlin.text.v.o3(obj, '/', 0, false, 6, null);
        if (o32 > 0) {
            pkg = obj.substring(0, o32);
            l0.o(pkg, "this as java.lang.String…ing(startIndex, endIndex)");
            obj = obj.substring(o32 + 1);
            l0.o(obj, "this as java.lang.String).substring(startIndex)");
        }
        if (l0.g(obj, "*") || kotlin.text.v.o3(obj, '.', 0, false, 6, null) >= 0) {
            return new ComponentName(pkg, obj);
        }
        return new ComponentName(pkg, pkg + '.' + obj);
    }

    private final a b(Context context, XmlResourceParser parser) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(parser, a.c.f81658a, 0, 0);
        String string = obtainStyledAttributes.getString(a.c.f81660c);
        String string2 = obtainStyledAttributes.getString(a.c.f81659b);
        String packageName = context.getApplicationContext().getPackageName();
        l0.o(packageName, "packageName");
        return new a(a(packageName, string), string2);
    }

    private final b c(Context context, XmlResourceParser parser) {
        return new b(kotlin.collections.l0.f74939b, context.getTheme().obtainStyledAttributes(parser, a.c.f81661d, 0, 0).getBoolean(a.c.f81662e, false));
    }

    private final u d(Context context, XmlResourceParser parser) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(parser, a.c.f81663f, 0, 0);
        String string = obtainStyledAttributes.getString(a.c.f81664g);
        String string2 = obtainStyledAttributes.getString(a.c.f81666i);
        String string3 = obtainStyledAttributes.getString(a.c.f81665h);
        String packageName = context.getApplicationContext().getPackageName();
        l0.o(packageName, "packageName");
        return new u(a(packageName, string), a(packageName, string2), string3);
    }

    private final v e(Context context, XmlResourceParser parser) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(parser, a.c.f81667j, 0, 0);
        float f4 = obtainStyledAttributes.getFloat(a.c.f81674q, 0.0f);
        int dimension = (int) obtainStyledAttributes.getDimension(a.c.f81673p, 0.0f);
        int dimension2 = (int) obtainStyledAttributes.getDimension(a.c.f81672o, 0.0f);
        int i4 = obtainStyledAttributes.getInt(a.c.f81671n, 3);
        return new v(kotlin.collections.l0.f74939b, obtainStyledAttributes.getBoolean(a.c.f81669l, false), obtainStyledAttributes.getBoolean(a.c.f81670m, true), obtainStyledAttributes.getBoolean(a.c.f81668k, false), dimension, dimension2, f4, i4);
    }

    private final w f(Context context, XmlResourceParser parser) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(parser, a.c.f81675r, 0, 0);
        String string = obtainStyledAttributes.getString(a.c.f81676s);
        float f4 = obtainStyledAttributes.getFloat(a.c.f81680w, 0.0f);
        int dimension = (int) obtainStyledAttributes.getDimension(a.c.f81679v, 0.0f);
        int dimension2 = (int) obtainStyledAttributes.getDimension(a.c.f81678u, 0.0f);
        int i4 = obtainStyledAttributes.getInt(a.c.f81677t, 3);
        String packageName = context.getApplicationContext().getPackageName();
        l0.o(packageName, "packageName");
        ComponentName a5 = a(packageName, string);
        kotlin.collections.l0 l0Var = kotlin.collections.l0.f74939b;
        Intent component = new Intent().setComponent(a5);
        l0.o(component, "Intent().setComponent(pl…eholderActivityClassName)");
        return new w(l0Var, component, dimension, dimension2, f4, i4);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final Set<m> h(Context context, int splitResourceId) {
        w h4;
        b c5;
        v e4;
        try {
            XmlResourceParser xml = context.getResources().getXml(splitResourceId);
            l0.o(xml, "resources.getXml(splitResourceId)");
            HashSet hashSet = new HashSet();
            int depth = xml.getDepth();
            int next = xml.next();
            b bVar = null;
            v vVar = null;
            w wVar = null;
            while (next != 1 && (next != 3 || xml.getDepth() > depth)) {
                if (xml.getEventType() != 2 || l0.g("split-config", xml.getName())) {
                    next = xml.next();
                } else {
                    String name = xml.getName();
                    if (name != null) {
                        switch (name.hashCode()) {
                            case 511422343:
                                if (name.equals("ActivityFilter")) {
                                    if (bVar != null || wVar != null) {
                                        a b5 = b(context, xml);
                                        if (bVar == null) {
                                            if (wVar != null) {
                                                hashSet.remove(wVar);
                                                h4 = wVar.h(b5);
                                                hashSet.add(h4);
                                                wVar = h4;
                                                break;
                                            }
                                        } else {
                                            hashSet.remove(bVar);
                                            c5 = bVar.c(b5);
                                            hashSet.add(c5);
                                            bVar = c5;
                                            break;
                                        }
                                    } else {
                                        throw new IllegalArgumentException("Found orphaned ActivityFilter");
                                    }
                                }
                                break;
                            case 520447504:
                                if (name.equals("SplitPairRule")) {
                                    e4 = e(context, xml);
                                    hashSet.add(e4);
                                    bVar = null;
                                    wVar = null;
                                    vVar = e4;
                                    break;
                                }
                                break;
                            case 1579230604:
                                if (name.equals("SplitPairFilter")) {
                                    if (vVar == null) {
                                        throw new IllegalArgumentException("Found orphaned SplitPairFilter outside of SplitPairRule");
                                    }
                                    u d5 = d(context, xml);
                                    hashSet.remove(vVar);
                                    e4 = vVar.j(d5);
                                    hashSet.add(e4);
                                    vVar = e4;
                                    break;
                                }
                                break;
                            case 1793077963:
                                if (name.equals("ActivityRule")) {
                                    c5 = c(context, xml);
                                    hashSet.add(c5);
                                    vVar = null;
                                    wVar = null;
                                    bVar = c5;
                                    break;
                                }
                                break;
                            case 2050988213:
                                if (name.equals("SplitPlaceholderRule")) {
                                    h4 = f(context, xml);
                                    hashSet.add(h4);
                                    bVar = null;
                                    vVar = null;
                                    wVar = h4;
                                    break;
                                }
                                break;
                        }
                    }
                    next = xml.next();
                }
            }
            return hashSet;
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }

    @fg.m
    public final Set<m> g(@fg.l Context context, int staticRuleResourceId) {
        l0.p(context, "context");
        return h(context, staticRuleResourceId);
    }
}
