package androidx.content;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import androidx.annotation.c1;
import androidx.annotation.d0;
import androidx.annotation.i;
import androidx.appcompat.view.g;
import androidx.collection.c3;
import androidx.collection.e3;
import androidx.content.y;
import dd.b;
import dd.e;
import dd.f;
import fg.l;
import fg.m;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kd.j;
import kd.n;
import kotlin.Metadata;
import kotlin.collections.k;
import kotlin.collections.z0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.w;
import kotlin.k2;
import kotlin.sequences.p;
import kotlin.text.v;
import r2.a;

/* compiled from: NavDestination.kt */
@Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\b\n\u0002\u0010$\n\u0002\b\b\b\u0016\u0018\u0000 s2\u00020\u0001:\u0003tH:B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0016\u0012\u000e\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u0002¢\u0006\u0004\b\u001a\u0010\u0005J\u0015\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010!\u001a\u0004\u0018\u00010 2\u0006\u0010\u001f\u001a\u00020\u0015H\u0017¢\u0006\u0004\b!\u0010\"J\u001b\u0010%\u001a\u00020$2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0012H\u0017¢\u0006\u0004\b'\u0010(J\u0019\u0010,\u001a\u0004\u0018\u00010+2\b\b\u0001\u0010*\u001a\u00020)¢\u0006\u0004\b,\u0010-J!\u00100\u001a\u00020\r2\b\b\u0001\u0010.\u001a\u00020)2\b\b\u0001\u0010/\u001a\u00020)¢\u0006\u0004\b0\u00101J\u001f\u00103\u001a\u00020\r2\b\b\u0001\u0010.\u001a\u00020)2\u0006\u00102\u001a\u00020+¢\u0006\u0004\b3\u00104J\u0017\u00105\u001a\u00020\r2\b\b\u0001\u0010.\u001a\u00020)¢\u0006\u0004\b5\u00106J\u001d\u0010:\u001a\u00020\r2\u0006\u00107\u001a\u00020\u00022\u0006\u00109\u001a\u000208¢\u0006\u0004\b:\u0010;J\u0015\u0010<\u001a\u00020\r2\u0006\u00107\u001a\u00020\u0002¢\u0006\u0004\b<\u0010\u0005J\u001b\u0010?\u001a\u0004\u0018\u00010=2\b\u0010>\u001a\u0004\u0018\u00010=H\u0007¢\u0006\u0004\b?\u0010@J\u000f\u0010A\u001a\u00020\u0002H\u0016¢\u0006\u0004\bA\u0010BJ\u001a\u0010D\u001a\u00020\u00122\b\u0010C\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\bD\u0010EJ\u000f\u0010F\u001a\u00020)H\u0016¢\u0006\u0004\bF\u0010GR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010BR.\u0010R\u001a\u0004\u0018\u00010K2\b\u0010L\u001a\u0004\u0018\u00010K8\u0006@GX\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR\u0018\u0010T\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010IR$\u0010\\\u001a\u0004\u0018\u00010U8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bV\u0010W\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R\u001a\u0010_\u001a\b\u0012\u0004\u0012\u00020\u001b0]8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010^R\u001a\u0010c\u001a\b\u0012\u0004\u0012\u00020+0`8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010bR\"\u0010f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u0002080d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010eR,\u0010*\u001a\u00020)2\b\b\u0001\u0010*\u001a\u00020)8G@FX\u0086\u000e¢\u0006\u0012\n\u0004\b?\u0010!\u001a\u0004\bg\u0010G\"\u0004\bh\u00106R.\u0010i\u001a\u0004\u0018\u00010\u00022\b\u0010i\u001a\u0004\u0018\u00010\u00028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bj\u0010I\u001a\u0004\bk\u0010B\"\u0004\bl\u0010\u0005R\u001d\u0010p\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u0002080m8F¢\u0006\u0006\u001a\u0004\bn\u0010oR\u0014\u0010r\u001a\u00020\u00028WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bq\u0010B¨\u0006u"}, d2 = {"Landroidx/navigation/f0;", "", "", "navigatorName", "<init>", "(Ljava/lang/String;)V", "Landroidx/navigation/c1;", "navigator", "(Landroidx/navigation/c1;)V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "Lkotlin/k2;", "L", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroid/net/Uri;", "deepLink", "", "G", "(Landroid/net/Uri;)Z", "Landroidx/navigation/d0;", "deepLinkRequest", "H", "(Landroidx/navigation/d0;)Z", "uriPattern", "h", "Landroidx/navigation/y;", "navDeepLink", "f", "(Landroidx/navigation/y;)V", "navDeepLinkRequest", "Landroidx/navigation/f0$c;", "I", "(Landroidx/navigation/d0;)Landroidx/navigation/f0$c;", "previousDestination", "", "l", "(Landroidx/navigation/f0;)[I", "Z", "()Z", "", "id", "Landroidx/navigation/l;", "p", "(I)Landroidx/navigation/l;", "actionId", "destId", "Q", "(II)V", "action", "R", "(ILandroidx/navigation/l;)V", "S", "(I)V", "argumentName", "Landroidx/navigation/q;", "argument", "c", "(Ljava/lang/String;Landroidx/navigation/q;)V", "T", "Landroid/os/Bundle;", "args", "i", "(Landroid/os/Bundle;)Landroid/os/Bundle;", "toString", "()Ljava/lang/String;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "b", "Ljava/lang/String;", "A", "Landroidx/navigation/j0;", "<set-?>", "Landroidx/navigation/j0;", "D", "()Landroidx/navigation/j0;", "W", "(Landroidx/navigation/j0;)V", "parent", "d", "idName", "", "e", "Ljava/lang/CharSequence;", "x", "()Ljava/lang/CharSequence;", "V", "(Ljava/lang/CharSequence;)V", "label", "", "Ljava/util/List;", "deepLinks", "Landroidx/collection/c3;", "g", "Landroidx/collection/c3;", "actions", "", "Ljava/util/Map;", "_arguments", "w", "U", "route", "j", "F", "X", "", "q", "()Ljava/util/Map;", "arguments", "r", "displayName", "k", "a", "navigation-common_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public class f0 {

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    @l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: l, reason: collision with root package name */
    @l
    private static final Map<String, Class<?>> f31054l = new LinkedHashMap();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    private final String navigatorName;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @m
    private j0 parent;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @m
    private String idName;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @m
    private CharSequence label;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @l
    private final List<y> deepLinks;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @l
    private final c3<l> actions;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @l
    private Map<String, q> _arguments;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private int id;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @m
    private String route;

    /* compiled from: NavDestination.kt */
    @Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0015\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0006¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/navigation/f0$a;", "", "Lkotlin/reflect/d;", "value", "<init>", "(Lkotlin/reflect/d;)V", "()Ljava/lang/Class;", "navigation-common_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    @e(dd.a.BINARY)
    @Retention(RetentionPolicy.CLASS)
    @f(allowedTargets = {b.ANNOTATION_CLASS, b.CLASS})
    public @interface a {
        Class<?> value();
    }

    /* compiled from: NavDestination.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JA\u0010\u000b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00018\u00000\t\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0010\u0010\n\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00018\u00000\tH\u0005¢\u0006\u0004\b\u000b\u0010\fJA\u0010\r\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00018\u00000\t\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0010\u0010\n\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00018\u00000\tH\u0007¢\u0006\u0004\b\r\u0010\fJ\u001f\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0013\u001a\u00020\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\u0013\u0010\u0014R$\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00150\u0016*\u00020\u00158FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018R$\u0010\u001d\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Landroidx/navigation/f0$b;", "", "<init>", "()V", "C", "Landroid/content/Context;", "context", "", "name", "Ljava/lang/Class;", "expectedClassType", "e", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Class;", "f", "", "id", "b", "(Landroid/content/Context;I)Ljava/lang/String;", "route", "a", "(Ljava/lang/String;)Ljava/lang/String;", "Landroidx/navigation/f0;", "Lkotlin/sequences/m;", "c", "(Landroidx/navigation/f0;)Lkotlin/sequences/m;", "d", "(Landroidx/navigation/f0;)V", "hierarchy", "", "classes", "Ljava/util/Map;", "navigation-common_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* renamed from: androidx.navigation.f0$b, reason: from kotlin metadata */
    public static final class Companion {

        /* compiled from: NavDestination.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/navigation/f0;", "it", "a", "(Landroidx/navigation/f0;)Landroidx/navigation/f0;"}, k = 3, mv = {1, 6, 0})
        /* renamed from: androidx.navigation.f0$b$a */
        static final class a extends n0 implements ld.l<f0, f0> {

            /* renamed from: b, reason: collision with root package name */
            public static final a f31064b = new a(1);

            a() {
                super(1);
            }

            @Override // ld.l
            @m
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final f0 invoke(@l f0 it) {
                l0.p(it, "it");
                return it.getParent();
            }
        }

        private Companion() {
        }

        @n
        public static /* synthetic */ void d(f0 f0Var) {
        }

        @l
        @c1({c1.a.LIBRARY_GROUP})
        public final String a(@m String route) {
            return route != null ? l0.C("android-app://androidx.navigation/", route) : "";
        }

        @l
        @n
        @c1({c1.a.LIBRARY_GROUP})
        public final String b(@l Context context, int id2) {
            String valueOf;
            l0.p(context, "context");
            if (id2 <= 16777215) {
                return String.valueOf(id2);
            }
            try {
                valueOf = context.getResources().getResourceName(id2);
            } catch (Resources.NotFoundException unused) {
                valueOf = String.valueOf(id2);
            }
            l0.o(valueOf, "try {\n                co….toString()\n            }");
            return valueOf;
        }

        @l
        public final kotlin.sequences.m<f0> c(@l f0 f0Var) {
            l0.p(f0Var, "<this>");
            return p.l(f0Var, a.f31064b);
        }

        @l
        @n
        protected final <C> Class<? extends C> e(@l Context context, @l String name, @l Class<? extends C> expectedClassType) {
            l0.p(context, "context");
            l0.p(name, "name");
            l0.p(expectedClassType, "expectedClassType");
            String C = name.charAt(0) == '.' ? l0.C(context.getPackageName(), name) : name;
            Class<? extends C> cls = (Class) f0.f31054l.get(C);
            if (cls == null) {
                try {
                    cls = (Class<? extends C>) Class.forName(C, true, context.getClassLoader());
                    f0.f31054l.put(name, cls);
                } catch (ClassNotFoundException e4) {
                    throw new IllegalArgumentException(e4);
                }
            }
            l0.m(cls);
            if (expectedClassType.isAssignableFrom(cls)) {
                return cls;
            }
            throw new IllegalArgumentException((C + " must be a subclass of " + expectedClassType).toString());
        }

        @l
        @n
        @c1({c1.a.LIBRARY_GROUP})
        public final <C> Class<? extends C> f(@l Context context, @l String name, @l Class<? extends C> expectedClassType) {
            l0.p(context, "context");
            l0.p(name, "name");
            l0.p(expectedClassType, "expectedClassType");
            return f0.O(context, name, expectedClassType);
        }

        public Companion(w wVar) {
        }
    }

    /* compiled from: NavDestination.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Landroidx/navigation/f0$c;", "", "Landroidx/navigation/f0;", "destination", "Landroid/os/Bundle;", "matchingArgs", "", "isExactDeepLink", "hasMatchingAction", "", "mimeTypeMatchLevel", "<init>", "(Landroidx/navigation/f0;Landroid/os/Bundle;ZZI)V", "other", "a", "(Landroidx/navigation/f0$c;)I", "b", "Landroidx/navigation/f0;", "()Landroidx/navigation/f0;", "c", "Landroid/os/Bundle;", "()Landroid/os/Bundle;", "d", "Z", "e", "f", "I", "navigation-common_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    @c1({c1.a.LIBRARY_GROUP})
    public static final class c implements Comparable<c> {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @l
        private final f0 destination;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @m
        private final Bundle matchingArgs;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final boolean isExactDeepLink;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final boolean hasMatchingAction;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final int mimeTypeMatchLevel;

        public c(@l f0 destination, @m Bundle bundle, boolean z4, boolean z5, int i4) {
            l0.p(destination, "destination");
            this.destination = destination;
            this.matchingArgs = bundle;
            this.isExactDeepLink = z4;
            this.hasMatchingAction = z5;
            this.mimeTypeMatchLevel = i4;
        }

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(@l c other) {
            l0.p(other, "other");
            boolean z4 = this.isExactDeepLink;
            if (z4 && !other.isExactDeepLink) {
                return 1;
            }
            if (!z4 && other.isExactDeepLink) {
                return -1;
            }
            Bundle bundle = this.matchingArgs;
            if (bundle != null && other.matchingArgs == null) {
                return 1;
            }
            if (bundle == null && other.matchingArgs != null) {
                return -1;
            }
            if (bundle != null) {
                int size = bundle.size();
                Bundle bundle2 = other.matchingArgs;
                l0.m(bundle2);
                int size2 = size - bundle2.size();
                if (size2 > 0) {
                    return 1;
                }
                if (size2 < 0) {
                    return -1;
                }
            }
            boolean z5 = this.hasMatchingAction;
            if (z5 && !other.hasMatchingAction) {
                return 1;
            }
            if (z5 || !other.hasMatchingAction) {
                return this.mimeTypeMatchLevel - other.mimeTypeMatchLevel;
            }
            return -1;
        }

        @l
        /* renamed from: b, reason: from getter */
        public final f0 getDestination() {
            return this.destination;
        }

        @m
        /* renamed from: c, reason: from getter */
        public final Bundle getMatchingArgs() {
            return this.matchingArgs;
        }
    }

    public f0(@l String navigatorName) {
        l0.p(navigatorName, "navigatorName");
        this.navigatorName = navigatorName;
        this.deepLinks = new ArrayList();
        this.actions = new c3<>();
        this._arguments = new LinkedHashMap();
    }

    @l
    @n
    protected static final <C> Class<? extends C> O(@l Context context, @l String str, @l Class<? extends C> cls) {
        return INSTANCE.e(context, str, cls);
    }

    @l
    @n
    @c1({c1.a.LIBRARY_GROUP})
    public static final <C> Class<? extends C> P(@l Context context, @l String str, @l Class<? extends C> cls) {
        return INSTANCE.f(context, str, cls);
    }

    public static /* synthetic */ int[] m(f0 f0Var, f0 f0Var2, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: buildDeepLinkIds");
        }
        if ((i4 & 1) != 0) {
            f0Var2 = null;
        }
        return f0Var.l(f0Var2);
    }

    @l
    @n
    @c1({c1.a.LIBRARY_GROUP})
    public static final String s(@l Context context, int i4) {
        return INSTANCE.b(context, i4);
    }

    @l
    public static final kotlin.sequences.m<f0> v(@l f0 f0Var) {
        return INSTANCE.c(f0Var);
    }

    @l
    /* renamed from: A, reason: from getter */
    public final String getNavigatorName() {
        return this.navigatorName;
    }

    @m
    /* renamed from: D, reason: from getter */
    public final j0 getParent() {
        return this.parent;
    }

    @m
    /* renamed from: F, reason: from getter */
    public final String getRoute() {
        return this.route;
    }

    public boolean G(@l Uri deepLink) {
        l0.p(deepLink, "deepLink");
        return H(new d0(deepLink, null, null));
    }

    public boolean H(@l d0 deepLinkRequest) {
        l0.p(deepLinkRequest, "deepLinkRequest");
        return I(deepLinkRequest) != null;
    }

    @m
    @c1({c1.a.LIBRARY_GROUP})
    public c I(@l d0 navDeepLinkRequest) {
        l0.p(navDeepLinkRequest, "navDeepLinkRequest");
        if (this.deepLinks.isEmpty()) {
            return null;
        }
        c cVar = null;
        for (y yVar : this.deepLinks) {
            Uri uri = navDeepLinkRequest.getUri();
            Bundle f4 = uri != null ? yVar.f(uri, z0.D0(this._arguments)) : null;
            String action = navDeepLinkRequest.getAction();
            boolean z4 = action != null && l0.g(action, yVar.getAction());
            String mimeType = navDeepLinkRequest.getMimeType();
            int h4 = mimeType != null ? yVar.h(mimeType) : -1;
            if (f4 != null || z4 || h4 > -1) {
                c cVar2 = new c(this, f4, yVar.getIsExactDeepLink(), z4, h4);
                if (cVar == null || cVar2.compareTo(cVar) > 0) {
                    cVar = cVar2;
                }
            }
        }
        return cVar;
    }

    @i
    public void L(@l Context context, @l AttributeSet attrs) {
        l0.p(context, "context");
        l0.p(attrs, "attrs");
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attrs, a.b.f89743y);
        l0.o(obtainAttributes, "context.resources.obtain…s, R.styleable.Navigator)");
        X(obtainAttributes.getString(a.b.B));
        int i4 = a.b.A;
        if (obtainAttributes.hasValue(i4)) {
            U(obtainAttributes.getResourceId(i4, 0));
            this.idName = INSTANCE.b(context, this.id);
        }
        this.label = obtainAttributes.getText(a.b.f89744z);
        k2 k2Var = k2.f75408a;
        obtainAttributes.recycle();
    }

    public final void Q(@d0 int actionId, @d0 int destId) {
        R(actionId, new l(destId, null, null, 6, null));
    }

    public final void R(@d0 int actionId, @l l action) {
        l0.p(action, "action");
        if (Z()) {
            if (actionId == 0) {
                throw new IllegalArgumentException("Cannot have an action with actionId 0");
            }
            this.actions.q(actionId, action);
        } else {
            throw new UnsupportedOperationException("Cannot add action " + actionId + " to " + this + " as it does not support actions, indicating that it is a terminal destination in your navigation graph and will never trigger actions.");
        }
    }

    public final void S(@d0 int actionId) {
        this.actions.t(actionId);
    }

    public final void T(@l String argumentName) {
        l0.p(argumentName, "argumentName");
        this._arguments.remove(argumentName);
    }

    public final void U(@d0 int i4) {
        this.id = i4;
        this.idName = null;
    }

    public final void V(@m CharSequence charSequence) {
        this.label = charSequence;
    }

    @c1({c1.a.LIBRARY_GROUP})
    public final void W(@m j0 j0Var) {
        this.parent = j0Var;
    }

    public final void X(@m String str) {
        Object obj;
        if (str == null) {
            U(0);
        } else {
            if (v.S1(str)) {
                throw new IllegalArgumentException("Cannot have an empty route");
            }
            String a5 = INSTANCE.a(str);
            U(a5.hashCode());
            h(a5);
        }
        List<y> list = this.deepLinks;
        List<y> list2 = list;
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (l0.g(((y) obj).getUriPattern(), INSTANCE.a(this.route))) {
                    break;
                }
            }
        }
        list2.remove(obj);
        this.route = str;
    }

    @c1({c1.a.LIBRARY_GROUP})
    public boolean Z() {
        return true;
    }

    public final void c(@l String argumentName, @l q argument) {
        l0.p(argumentName, "argumentName");
        l0.p(argument, "argument");
        this._arguments.put(argumentName, argument);
    }

    public boolean equals(@m Object other) {
        boolean z4;
        boolean z5;
        if (other == null || !(other instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) other;
        boolean z6 = kotlin.collections.w.i3(this.deepLinks, f0Var.deepLinks).size() == this.deepLinks.size();
        if (this.actions.B() == f0Var.actions.B()) {
            Iterator it = p.e(e3.k(this.actions)).iterator();
            while (true) {
                if (it.hasNext()) {
                    if (!f0Var.actions.f((l) it.next())) {
                        break;
                    }
                } else {
                    Iterator it2 = p.e(e3.k(f0Var.actions)).iterator();
                    while (it2.hasNext()) {
                        if (!this.actions.f((l) it2.next())) {
                        }
                    }
                    z4 = true;
                }
            }
        }
        z4 = false;
        if (z0.D0(this._arguments).size() == z0.D0(f0Var._arguments).size()) {
            Iterator it3 = z0.T0(z0.D0(this._arguments)).iterator();
            while (true) {
                if (it3.hasNext()) {
                    Map.Entry entry = (Map.Entry) it3.next();
                    if (!z0.D0(f0Var._arguments).containsKey(entry.getKey()) || !l0.g(z0.D0(f0Var._arguments).get(entry.getKey()), entry.getValue())) {
                        break;
                    }
                } else {
                    for (Map.Entry entry2 : z0.T0(z0.D0(f0Var._arguments))) {
                        if (z0.D0(this._arguments).containsKey(entry2.getKey()) && l0.g(z0.D0(this._arguments).get(entry2.getKey()), entry2.getValue())) {
                        }
                    }
                    z5 = true;
                }
            }
        }
        z5 = false;
        return this.id == f0Var.id && l0.g(this.route, f0Var.route) && z6 && z4 && z5;
    }

    public final void f(@l y navDeepLink) {
        l0.p(navDeepLink, "navDeepLink");
        Map D0 = z0.D0(this._arguments);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : D0.entrySet()) {
            q qVar = (q) entry.getValue();
            if (!qVar.getIsNullable() && !qVar.getIsDefaultValuePresent()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Set keySet = linkedHashMap.keySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : keySet) {
            if (!navDeepLink.e().contains((String) obj)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            this.deepLinks.add(navDeepLink);
            return;
        }
        throw new IllegalArgumentException(("Deep link " + ((Object) navDeepLink.getUriPattern()) + " can't be used to open destination " + this + ".\nFollowing required arguments are missing: " + arrayList).toString());
    }

    public final void h(@l String uriPattern) {
        l0.p(uriPattern, "uriPattern");
        f(new y.a().g(uriPattern).a());
    }

    public int hashCode() {
        Set<String> keySet;
        int i4 = this.id * 31;
        String str = this.route;
        int hashCode = i4 + (str == null ? 0 : str.hashCode());
        for (y yVar : this.deepLinks) {
            int i5 = hashCode * 31;
            String uriPattern = yVar.getUriPattern();
            int hashCode2 = (i5 + (uriPattern == null ? 0 : uriPattern.hashCode())) * 31;
            String action = yVar.getAction();
            int hashCode3 = (hashCode2 + (action == null ? 0 : action.hashCode())) * 31;
            String mimeType = yVar.getMimeType();
            hashCode = hashCode3 + (mimeType == null ? 0 : mimeType.hashCode());
        }
        Iterator k4 = e3.k(this.actions);
        while (k4.hasNext()) {
            l lVar = (l) k4.next();
            int destinationId = (lVar.getDestinationId() + (hashCode * 31)) * 31;
            t0 navOptions = lVar.getNavOptions();
            int hashCode4 = destinationId + (navOptions == null ? 0 : navOptions.hashCode());
            Bundle defaultArguments = lVar.getDefaultArguments();
            if (defaultArguments != null && (keySet = defaultArguments.keySet()) != null) {
                for (String str2 : keySet) {
                    int i6 = hashCode4 * 31;
                    Bundle defaultArguments2 = lVar.getDefaultArguments();
                    l0.m(defaultArguments2);
                    Object obj = defaultArguments2.get(str2);
                    hashCode4 = i6 + (obj == null ? 0 : obj.hashCode());
                }
            }
            hashCode = hashCode4;
        }
        for (String str3 : z0.D0(this._arguments).keySet()) {
            int a5 = androidx.compose.foundation.text.modifiers.n.a(str3, hashCode * 31, 31);
            Object obj2 = z0.D0(this._arguments).get(str3);
            hashCode = a5 + (obj2 == null ? 0 : obj2.hashCode());
        }
        return hashCode;
    }

    @m
    @c1({c1.a.LIBRARY_GROUP})
    public final Bundle i(@m Bundle args) {
        Map<String, q> map;
        if (args == null && ((map = this._arguments) == null || map.isEmpty())) {
            return null;
        }
        Bundle bundle = new Bundle();
        for (Map.Entry<String, q> entry : this._arguments.entrySet()) {
            entry.getValue().e(entry.getKey(), bundle);
        }
        if (args != null) {
            bundle.putAll(args);
            for (Map.Entry<String, q> entry2 : this._arguments.entrySet()) {
                String key = entry2.getKey();
                q value = entry2.getValue();
                if (!value.f(key, bundle)) {
                    StringBuilder a5 = g.a("Wrong argument type for '", key, "' in argument bundle. ");
                    a5.append(value.b().getName());
                    a5.append(" expected.");
                    throw new IllegalArgumentException(a5.toString().toString());
                }
            }
        }
        return bundle;
    }

    @l
    @j
    @c1({c1.a.LIBRARY_GROUP})
    public final int[] j() {
        return m(this, null, 1, null);
    }

    @l
    @j
    @c1({c1.a.LIBRARY_GROUP})
    public final int[] l(@m f0 previousDestination) {
        k kVar = new k();
        f0 f0Var = this;
        while (true) {
            l0.m(f0Var);
            j0 j0Var = f0Var.parent;
            if ((previousDestination == null ? null : previousDestination.parent) != null) {
                j0 j0Var2 = previousDestination.parent;
                l0.m(j0Var2);
                if (j0Var2.g0(f0Var.id, true) == f0Var) {
                    kVar.addFirst(f0Var);
                    break;
                }
            }
            if (j0Var == null || j0Var.n0() != f0Var.id) {
                kVar.addFirst(f0Var);
            }
            if (l0.g(j0Var, previousDestination) || j0Var == null) {
                break;
            }
            f0Var = j0Var;
        }
        List V5 = kotlin.collections.w.V5(kVar);
        ArrayList arrayList = new ArrayList(kotlin.collections.w.b0(V5, 10));
        Iterator it = V5.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((f0) it.next()).id));
        }
        return kotlin.collections.w.U5(arrayList);
    }

    @m
    public final l p(@d0 int id2) {
        l i4 = this.actions.o() ? null : this.actions.i(id2);
        if (i4 != null) {
            return i4;
        }
        j0 j0Var = this.parent;
        if (j0Var == null) {
            return null;
        }
        return j0Var.p(id2);
    }

    @l
    public final Map<String, q> q() {
        return z0.D0(this._arguments);
    }

    @l
    @c1({c1.a.LIBRARY_GROUP})
    public String r() {
        String str = this.idName;
        return str == null ? String.valueOf(this.id) : str;
    }

    @l
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("(");
        String str = this.idName;
        if (str == null) {
            sb.append("0x");
            sb.append(Integer.toHexString(this.id));
        } else {
            sb.append(str);
        }
        sb.append(")");
        String str2 = this.route;
        if (str2 != null && !v.S1(str2)) {
            sb.append(" route=");
            sb.append(this.route);
        }
        if (this.label != null) {
            sb.append(" label=");
            sb.append(this.label);
        }
        String sb2 = sb.toString();
        l0.o(sb2, "sb.toString()");
        return sb2;
    }

    @d0
    /* renamed from: w, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @m
    /* renamed from: x, reason: from getter */
    public final CharSequence getLabel() {
        return this.label;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public f0(@l c1<? extends f0> navigator) {
        this(d1.INSTANCE.a(navigator.getClass()));
        l0.p(navigator, "navigator");
    }
}
