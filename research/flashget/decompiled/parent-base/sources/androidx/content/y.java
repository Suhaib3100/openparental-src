package androidx.content;

import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.c1;
import fg.l;
import fg.m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kd.n;
import kotlin.Metadata;
import kotlin.b0;
import kotlin.c0;
import kotlin.collections.j0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.w;
import kotlin.text.r;
import kotlin.text.v;

/* compiled from: NavDeepLink.kt */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u000f\n\u0002\u0010!\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010 \n\u0002\b\u0003\u0018\u0000 K2\u00020\u0001:\u000426\u00107B'\b\u0000\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0017\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\tJ+\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u00022\n\u0010\f\u001a\u00060\nj\u0002`\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0013\u001a\u00020\u000f2\b\u0010\b\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0015\u001a\u00020\u000f2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0017\u001a\u00020\u000f2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0017\u0010\u0016J1\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u00022\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u0012H\u0000¢\u0006\u0004\b \u0010\u0014J\u0017\u0010#\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020!H\u0000¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020%2\u0006\u0010\u0005\u001a\u00020\u0002H\u0007¢\u0006\u0004\b&\u0010'J/\u0010+\u001a\u0004\u0018\u00010\u00182\u0006\u0010(\u001a\u00020\u00122\u0014\u0010*\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u001c0)H\u0007¢\u0006\u0004\b+\u0010,J\u001a\u0010.\u001a\u00020\u000f2\b\u0010-\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020%H\u0016¢\u0006\u0004\b0\u00101R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b6\u00103\u001a\u0004\b7\u00105R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u00103\u001a\u0004\b8\u00105R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u0010:R \u0010?\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020<0;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0018\u0010@\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u00103R\u001d\u0010D\u001a\u0004\u0018\u00010\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b8\u0010A\u001a\u0004\bB\u0010CR\u0016\u0010F\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010ER\u0018\u0010H\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u00103R\u001d\u0010I\u001a\u0004\u0018\u00010\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bB\u0010A\u001a\u0004\bG\u0010CR*\u0010O\u001a\u00020\u000f2\u0006\u0010J\u001a\u00020\u000f8G@@X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u0010E\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\u001a\u0010R\u001a\b\u0012\u0004\u0012\u00020\u00020P8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b=\u0010Q¨\u0006S"}, d2 = {"Landroidx/navigation/y;", "", "", "uriPattern", "action", "mimeType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "uri", "(Ljava/lang/String;)V", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "uriRegex", "Ljava/util/regex/Pattern;", "fillInPattern", "", "c", "(Ljava/lang/String;Ljava/lang/StringBuilder;Ljava/util/regex/Pattern;)Z", "Landroid/net/Uri;", "o", "(Landroid/net/Uri;)Z", "m", "(Ljava/lang/String;)Z", "n", "Landroid/os/Bundle;", "bundle", "name", "value", "Landroidx/navigation/q;", "argument", "r", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;Landroidx/navigation/q;)Z", "p", "Landroidx/navigation/d0;", "deepLinkRequest", "q", "(Landroidx/navigation/d0;)Z", "", "h", "(Ljava/lang/String;)I", "deepLink", "", "arguments", "f", "(Landroid/net/Uri;Ljava/util/Map;)Landroid/os/Bundle;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "a", "Ljava/lang/String;", "k", "()Ljava/lang/String;", "b", "d", "g", "", "Ljava/util/List;", "", "Landroidx/navigation/y$d;", "e", "Ljava/util/Map;", "paramArgMap", "patternFinalRegex", "Lkotlin/b0;", "j", "()Ljava/util/regex/Pattern;", "pattern", "Z", "isParameterizedQuery", "i", "mimeTypeFinalRegex", "mimeTypePattern", "<set-?>", "l", "()Z", "s", "(Z)V", "isExactDeepLink", "", "()Ljava/util/List;", "argumentsNames", "navigation-common_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class y {

    /* renamed from: l, reason: collision with root package name */
    @l
    private static final b f31392l = new b();

    /* renamed from: m, reason: collision with root package name */
    @Deprecated
    private static final Pattern f31393m = Pattern.compile("^[a-zA-Z]+[+\\w\\-.]*:");

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @m
    private final String uriPattern;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @m
    private final String action;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @m
    private final String mimeType;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @l
    private final List<String> arguments;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @l
    private final Map<String, d> paramArgMap;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @m
    private String patternFinalRegex;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @l
    private final b0 pattern;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private boolean isParameterizedQuery;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @m
    private String mimeTypeFinalRegex;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @l
    private final b0 mimeTypePattern;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private boolean isExactDeepLink;

    /* compiled from: NavDeepLink.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0001\rB\t\b\u0017¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\u0007J\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000fR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u000f¨\u0006\u0013"}, d2 = {"Landroidx/navigation/y$a;", "", "<init>", "()V", "", "uriPattern", "g", "(Ljava/lang/String;)Landroidx/navigation/y$a;", "action", "e", "mimeType", "f", "Landroidx/navigation/y;", "a", "()Landroidx/navigation/y;", "Ljava/lang/String;", "b", "c", "d", "navigation-common_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class a {

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        @l
        public static final Companion INSTANCE = new Companion();

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @m
        private String uriPattern;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @m
        private String action;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @m
        private String mimeType;

        /* compiled from: NavDeepLink.kt */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\bJ\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\f\u0010\b¨\u0006\r"}, d2 = {"Landroidx/navigation/y$a$a;", "", "<init>", "()V", "", "uriPattern", "Landroidx/navigation/y$a;", "c", "(Ljava/lang/String;)Landroidx/navigation/y$a;", "action", "a", "mimeType", "b", "navigation-common_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
        /* renamed from: androidx.navigation.y$a$a, reason: collision with other inner class name and from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            @l
            @n
            public final a a(@l String action) {
                l0.p(action, "action");
                if (action.length() <= 0) {
                    throw new IllegalArgumentException("The NavDeepLink cannot have an empty action.");
                }
                a aVar = new a();
                aVar.e(action);
                return aVar;
            }

            @l
            @n
            public final a b(@l String mimeType) {
                l0.p(mimeType, "mimeType");
                a aVar = new a();
                aVar.f(mimeType);
                return aVar;
            }

            @l
            @n
            public final a c(@l String uriPattern) {
                l0.p(uriPattern, "uriPattern");
                a aVar = new a();
                aVar.g(uriPattern);
                return aVar;
            }

            public Companion(w wVar) {
            }
        }

        @c1({c1.a.LIBRARY_GROUP})
        public a() {
        }

        @l
        @n
        public static final a b(@l String str) {
            return INSTANCE.a(str);
        }

        @l
        @n
        public static final a c(@l String str) {
            return INSTANCE.b(str);
        }

        @l
        @n
        public static final a d(@l String str) {
            return INSTANCE.c(str);
        }

        @l
        public final y a() {
            return new y(this.uriPattern, this.action, this.mimeType);
        }

        @l
        public final a e(@l String action) {
            l0.p(action, "action");
            if (action.length() <= 0) {
                throw new IllegalArgumentException("The NavDeepLink cannot have an empty action.");
            }
            this.action = action;
            return this;
        }

        @l
        public final a f(@l String mimeType) {
            l0.p(mimeType, "mimeType");
            this.mimeType = mimeType;
            return this;
        }

        @l
        public final a g(@l String uriPattern) {
            l0.p(uriPattern, "uriPattern");
            this.uriPattern = uriPattern;
            return this;
        }
    }

    /* compiled from: NavDeepLink.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/navigation/y$b;", "", "<init>", "()V", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "SCHEME_PATTERN", "Ljava/util/regex/Pattern;", "navigation-common_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    private static final class b {
        private b() {
        }

        public b(w wVar) {
        }
    }

    /* compiled from: NavDeepLink.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000b\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b\b\u0010\tR\"\u0010\u000f\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u0005R\"\u0010\u0011\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u000b\u001a\u0004\b\n\u0010\r\"\u0004\b\u0010\u0010\u0005¨\u0006\u0012"}, d2 = {"Landroidx/navigation/y$c;", "", "", "mimeType", "<init>", "(Ljava/lang/String;)V", "other", "", "a", "(Landroidx/navigation/y$c;)I", "b", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "e", "type", "d", "subType", "navigation-common_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    private static final class c implements Comparable<c> {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @l
        private String type;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @l
        private String subType;

        public c(@l String mimeType) {
            List list;
            l0.p(mimeType, "mimeType");
            List<String> p4 = new r("/").p(mimeType, 0);
            if (!p4.isEmpty()) {
                ListIterator<String> listIterator = p4.listIterator(p4.size());
                while (listIterator.hasPrevious()) {
                    if (listIterator.previous().length() != 0) {
                        list = kotlin.collections.w.J5(p4, listIterator.nextIndex() + 1);
                        break;
                    }
                }
            }
            list = j0.f74919b;
            this.type = (String) list.get(0);
            this.subType = (String) list.get(1);
        }

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(@l c other) {
            l0.p(other, "other");
            int i4 = l0.g(this.type, other.type) ? 2 : 0;
            return l0.g(this.subType, other.subType) ? i4 + 1 : i4;
        }

        @l
        /* renamed from: b, reason: from getter */
        public final String getSubType() {
            return this.subType;
        }

        @l
        /* renamed from: c, reason: from getter */
        public final String getType() {
            return this.type;
        }

        public final void d(@l String str) {
            l0.p(str, "<set-?>");
            this.subType = str;
        }

        public final void e(@l String str) {
            l0.p(str, "<set-?>");
            this.type = str;
        }
    }

    /* compiled from: NavDeepLink.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010!\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000eR$\u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\bR\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u00148\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Landroidx/navigation/y$d;", "", "<init>", "()V", "", "name", "Lkotlin/k2;", "a", "(Ljava/lang/String;)V", "", "index", "b", "(I)Ljava/lang/String;", "f", "()I", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "e", "paramRegex", "", "Ljava/util/List;", "c", "()Ljava/util/List;", "arguments", "navigation-common_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    private static final class d {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @m
        private String paramRegex;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @l
        private final List<String> arguments = new ArrayList();

        public final void a(@l String name) {
            l0.p(name, "name");
            this.arguments.add(name);
        }

        @l
        public final String b(int index) {
            return this.arguments.get(index);
        }

        @l
        public final List<String> c() {
            return this.arguments;
        }

        @m
        /* renamed from: d, reason: from getter */
        public final String getParamRegex() {
            return this.paramRegex;
        }

        public final void e(@m String str) {
            this.paramRegex = str;
        }

        public final int f() {
            return this.arguments.size();
        }
    }

    /* compiled from: NavDeepLink.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljava/util/regex/Pattern;", "a", "()Ljava/util/regex/Pattern;"}, k = 3, mv = {1, 6, 0})
    static final class e extends n0 implements ld.a<Pattern> {
        e() {
            super(0);
        }

        @Override // ld.a
        @m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Pattern invoke() {
            String str = y.this.mimeTypeFinalRegex;
            if (str == null) {
                return null;
            }
            return Pattern.compile(str);
        }
    }

    /* compiled from: NavDeepLink.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljava/util/regex/Pattern;", "a", "()Ljava/util/regex/Pattern;"}, k = 3, mv = {1, 6, 0})
    static final class f extends n0 implements ld.a<Pattern> {
        f() {
            super(0);
        }

        @Override // ld.a
        @m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Pattern invoke() {
            String str = y.this.patternFinalRegex;
            if (str == null) {
                return null;
            }
            return Pattern.compile(str, 2);
        }
    }

    public y(@m String str, @m String str2, @m String str3) {
        this.uriPattern = str;
        this.action = str2;
        this.mimeType = str3;
        this.arguments = new ArrayList();
        this.paramArgMap = new LinkedHashMap();
        this.pattern = c0.c(new f());
        this.mimeTypePattern = c0.c(new e());
        if (str != null) {
            Uri parse = Uri.parse(str);
            this.isParameterizedQuery = parse.getQuery() != null;
            StringBuilder sb = new StringBuilder("^");
            if (!f31393m.matcher(str).find()) {
                sb.append("http[s]?://");
            }
            Pattern fillInPattern = Pattern.compile("\\{(.+?)\\}");
            if (this.isParameterizedQuery) {
                Matcher matcher = Pattern.compile("(\\?)").matcher(str);
                if (matcher.find()) {
                    String substring = str.substring(0, matcher.start());
                    l0.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    l0.o(fillInPattern, "fillInPattern");
                    this.isExactDeepLink = c(substring, sb, fillInPattern);
                }
                for (String paramName : parse.getQueryParameterNames()) {
                    StringBuilder sb2 = new StringBuilder();
                    String queryParameter = parse.getQueryParameter(paramName);
                    if (queryParameter == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                    }
                    Matcher matcher2 = fillInPattern.matcher(queryParameter);
                    d dVar = new d();
                    int i4 = 0;
                    while (matcher2.find()) {
                        String group = matcher2.group(1);
                        if (group == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                        }
                        dVar.a(group);
                        String substring2 = queryParameter.substring(i4, matcher2.start());
                        l0.o(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                        sb2.append(Pattern.quote(substring2));
                        sb2.append("(.+?)?");
                        i4 = matcher2.end();
                    }
                    if (i4 < queryParameter.length()) {
                        String substring3 = queryParameter.substring(i4);
                        l0.o(substring3, "this as java.lang.String).substring(startIndex)");
                        sb2.append(Pattern.quote(substring3));
                    }
                    String sb3 = sb2.toString();
                    l0.o(sb3, "argRegex.toString()");
                    dVar.e(v.i2(sb3, ".*", "\\E.*\\Q", false, 4, null));
                    Map<String, d> map = this.paramArgMap;
                    l0.o(paramName, "paramName");
                    map.put(paramName, dVar);
                }
            } else {
                l0.o(fillInPattern, "fillInPattern");
                this.isExactDeepLink = c(str, sb, fillInPattern);
            }
            String sb4 = sb.toString();
            l0.o(sb4, "uriRegex.toString()");
            this.patternFinalRegex = v.i2(sb4, ".*", "\\E.*\\Q", false, 4, null);
        }
        if (this.mimeType != null) {
            if (!Pattern.compile("^[\\s\\S]+/[\\s\\S]+$").matcher(this.mimeType).matches()) {
                throw new IllegalArgumentException(("The given mimeType " + ((Object) this.mimeType) + " does not match to required \"type/subtype\" format").toString());
            }
            c cVar = new c(this.mimeType);
            StringBuilder sb5 = new StringBuilder("^(");
            sb5.append(cVar.getType());
            sb5.append("|[*]+)/(");
            this.mimeTypeFinalRegex = v.i2(android.support.v4.media.c.a(sb5, cVar.getSubType(), "|[*]+)$"), "*|[*]", "[\\s\\S]", false, 4, null);
        }
    }

    private final boolean c(String uri, StringBuilder uriRegex, Pattern fillInPattern) {
        Matcher matcher = fillInPattern.matcher(uri);
        boolean z4 = !v.T2(uri, ".*", false, 2, null);
        int i4 = 0;
        while (matcher.find()) {
            String group = matcher.group(1);
            if (group == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
            this.arguments.add(group);
            String substring = uri.substring(i4, matcher.start());
            l0.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            uriRegex.append(Pattern.quote(substring));
            uriRegex.append("([^/]+?)");
            i4 = matcher.end();
            z4 = false;
        }
        if (i4 < uri.length()) {
            String substring2 = uri.substring(i4);
            l0.o(substring2, "this as java.lang.String).substring(startIndex)");
            uriRegex.append(Pattern.quote(substring2));
        }
        uriRegex.append("($|(\\?(.)*)|(\\#(.)*))");
        return z4;
    }

    private final Pattern i() {
        return (Pattern) this.mimeTypePattern.getValue();
    }

    private final Pattern j() {
        return (Pattern) this.pattern.getValue();
    }

    private final boolean m(String action) {
        boolean z4 = action == null;
        String str = this.action;
        return z4 != (str != null) && (action == null || l0.g(str, action));
    }

    private final boolean n(String mimeType) {
        if ((mimeType == null) != (this.mimeType != null)) {
            if (mimeType == null) {
                return true;
            }
            Pattern i4 = i();
            l0.m(i4);
            if (i4.matcher(mimeType).matches()) {
                return true;
            }
        }
        return false;
    }

    private final boolean o(Uri uri) {
        if ((uri == null) != (j() != null)) {
            if (uri == null) {
                return true;
            }
            Pattern j4 = j();
            l0.m(j4);
            if (j4.matcher(uri.toString()).matches()) {
                return true;
            }
        }
        return false;
    }

    private final boolean r(Bundle bundle, String name, String value, q argument) {
        if (argument != null) {
            argument.b().g(bundle, name, value);
            return false;
        }
        bundle.putString(name, value);
        return false;
    }

    @m
    /* renamed from: d, reason: from getter */
    public final String getAction() {
        return this.action;
    }

    @l
    public final List<String> e() {
        List<String> list = this.arguments;
        Collection<d> values = this.paramArgMap.values();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = values.iterator();
        while (it.hasNext()) {
            kotlin.collections.w.q0(arrayList, ((d) it.next()).c());
        }
        return kotlin.collections.w.D4(list, arrayList);
    }

    public boolean equals(@m Object other) {
        if (other == null || !(other instanceof y)) {
            return false;
        }
        y yVar = (y) other;
        return l0.g(this.uriPattern, yVar.uriPattern) && l0.g(this.action, yVar.action) && l0.g(this.mimeType, yVar.mimeType);
    }

    @m
    @c1({c1.a.LIBRARY_GROUP})
    public final Bundle f(@l Uri deepLink, @l Map<String, q> arguments) {
        Matcher matcher;
        String str;
        l0.p(deepLink, "deepLink");
        l0.p(arguments, "arguments");
        Pattern j4 = j();
        Matcher matcher2 = j4 == null ? null : j4.matcher(deepLink.toString());
        if (matcher2 == null || !matcher2.matches()) {
            return null;
        }
        Bundle bundle = new Bundle();
        int size = this.arguments.size();
        int i4 = 0;
        while (i4 < size) {
            int i5 = i4 + 1;
            String str2 = this.arguments.get(i4);
            String value = Uri.decode(matcher2.group(i5));
            q qVar = arguments.get(str2);
            try {
                l0.o(value, "value");
                if (r(bundle, str2, value, qVar)) {
                    return null;
                }
                i4 = i5;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        if (this.isParameterizedQuery) {
            for (String str3 : this.paramArgMap.keySet()) {
                d dVar = this.paramArgMap.get(str3);
                String queryParameter = deepLink.getQueryParameter(str3);
                if (queryParameter != null) {
                    l0.m(dVar);
                    matcher = Pattern.compile(dVar.getParamRegex(), 32).matcher(queryParameter);
                    if (!matcher.matches()) {
                        return null;
                    }
                } else {
                    matcher = null;
                }
                Bundle bundle2 = new Bundle();
                try {
                    l0.m(dVar);
                    int f4 = dVar.f();
                    int i6 = 0;
                    while (i6 < f4) {
                        int i7 = i6 + 1;
                        if (matcher != null) {
                            str = matcher.group(i7);
                            if (str == null) {
                                str = "";
                            }
                        } else {
                            str = null;
                        }
                        String b5 = dVar.b(i6);
                        q qVar2 = arguments.get(b5);
                        if (str != null) {
                            if (!l0.g(str, '{' + b5 + '}') && r(bundle2, b5, str, qVar2)) {
                                return null;
                            }
                        }
                        i6 = i7;
                    }
                    bundle.putAll(bundle2);
                } catch (IllegalArgumentException unused2) {
                }
            }
        }
        for (Map.Entry<String, q> entry : arguments.entrySet()) {
            String key = entry.getKey();
            q value2 = entry.getValue();
            if (value2 != null && !value2.getIsNullable() && !value2.getIsDefaultValuePresent() && !bundle.containsKey(key)) {
                return null;
            }
        }
        return bundle;
    }

    @m
    /* renamed from: g, reason: from getter */
    public final String getMimeType() {
        return this.mimeType;
    }

    @c1({c1.a.LIBRARY_GROUP})
    public final int h(@l String mimeType) {
        l0.p(mimeType, "mimeType");
        if (this.mimeType != null) {
            Pattern i4 = i();
            l0.m(i4);
            if (i4.matcher(mimeType).matches()) {
                return new c(this.mimeType).compareTo(new c(mimeType));
            }
        }
        return -1;
    }

    public int hashCode() {
        String str = this.uriPattern;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.action;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.mimeType;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @m
    /* renamed from: k, reason: from getter */
    public final String getUriPattern() {
        return this.uriPattern;
    }

    @c1({c1.a.LIBRARY_GROUP})
    /* renamed from: l, reason: from getter */
    public final boolean getIsExactDeepLink() {
        return this.isExactDeepLink;
    }

    public final boolean p(@l Uri uri) {
        l0.p(uri, "uri");
        return q(new d0(uri, null, null));
    }

    public final boolean q(@l d0 deepLinkRequest) {
        l0.p(deepLinkRequest, "deepLinkRequest");
        if (o(deepLinkRequest.getUri()) && m(deepLinkRequest.getAction())) {
            return n(deepLinkRequest.getMimeType());
        }
        return false;
    }

    public final void s(boolean z4) {
        this.isExactDeepLink = z4;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @c1({c1.a.LIBRARY_GROUP})
    public y(@l String uri) {
        this(uri, null, null);
        l0.p(uri, "uri");
    }
}
