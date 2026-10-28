package okhttp3;

import androidx.compose.foundation.layout.f3;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.text.m0;
import kotlin.x0;

/* compiled from: MediaType.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\u0018\u0000 \u000f2\u00020\u0001:\u0001\u0013B/\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0013\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0012J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001cR\u0017\u0010\u0004\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0011\u0010\u001c\u001a\u0004\b\u001d\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u001f\u0010\u0012R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, d2 = {"Lokhttp3/x;", "", "", "mediaType", "type", "subtype", "", "parameterNamesAndValues", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V", "Ljava/nio/charset/Charset;", "defaultValue", "f", "(Ljava/nio/charset/Charset;)Ljava/nio/charset/Charset;", "name", "i", "(Ljava/lang/String;)Ljava/lang/String;", "b", "()Ljava/lang/String;", "a", "toString", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Ljava/lang/String;", "l", "c", "k", "d", "[Ljava/lang/String;", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes7.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String mediaType;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final String type;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final String subtype;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final String[] parameterNamesAndValues;

    /* renamed from: e, reason: collision with root package name */
    private static final String f85113e = ProtectedSandApp.s("ꊵ\u0001");

    /* renamed from: f, reason: collision with root package name */
    private static final String f85114f = ProtectedSandApp.s("ꊶ\u0001");

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: g, reason: collision with root package name */
    private static final Pattern f85115g = Pattern.compile(ProtectedSandApp.s("ꊷ\u0001"));

    /* renamed from: h, reason: collision with root package name */
    private static final Pattern f85116h = Pattern.compile(ProtectedSandApp.s("ꊸ\u0001"));

    /* compiled from: MediaType.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\b\u001a\u0004\u0018\u00010\u0005*\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\u0007J\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\u0007R\u001c\u0010\u000e\u001a\n \r*\u0004\u0018\u00010\f0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u001c\u0010\u0013\u001a\n \r*\u0004\u0018\u00010\f0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u000f¨\u0006\u0014"}, d2 = {"Lokhttp3/x$a;", "", "<init>", "()V", "", "Lokhttp3/x;", "c", "(Ljava/lang/String;)Lokhttp3/x;", "d", "mediaType", "a", "b", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "PARAMETER", "Ljava/util/regex/Pattern;", "QUOTED", "Ljava/lang/String;", "TOKEN", "TYPE_SUBTYPE", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: okhttp3.x$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @fg.l
        @kotlin.k(level = kotlin.m.ERROR, message = "moved to extension function", replaceWith = @x0(expression = "mediaType.toMediaType()", imports = {"okhttp3.MediaType.Companion.toMediaType"}))
        @kd.i(name = "-deprecated_get")
        public final x a(@fg.l String mediaType) {
            l0.p(mediaType, ProtectedSandApp.s("ꊦ\u0001"));
            return c(mediaType);
        }

        @fg.m
        @kotlin.k(level = kotlin.m.ERROR, message = "moved to extension function", replaceWith = @x0(expression = "mediaType.toMediaTypeOrNull()", imports = {"okhttp3.MediaType.Companion.toMediaTypeOrNull"}))
        @kd.i(name = "-deprecated_parse")
        public final x b(@fg.l String mediaType) {
            l0.p(mediaType, ProtectedSandApp.s("ꊦ\u0001"));
            return d(mediaType);
        }

        @fg.l
        @kd.n
        @kd.i(name = "get")
        public final x c(@fg.l String str) {
            l0.p(str, ProtectedSandApp.s("ꊧ\u0001"));
            Matcher matcher = x.f85115g.matcher(str);
            if (!matcher.lookingAt()) {
                throw new IllegalArgumentException((ProtectedSandApp.s("ꊳ\u0001") + str + m0.quote).toString());
            }
            String group = matcher.group(1);
            l0.o(group, ProtectedSandApp.s("ꊨ\u0001"));
            Locale locale = Locale.US;
            String s4 = ProtectedSandApp.s("ꊩ\u0001");
            l0.o(locale, s4);
            String s5 = ProtectedSandApp.s("ꊪ\u0001");
            if (group == null) {
                throw new NullPointerException(s5);
            }
            String lowerCase = group.toLowerCase(locale);
            String s6 = ProtectedSandApp.s("ꊫ\u0001");
            l0.o(lowerCase, s6);
            String group2 = matcher.group(2);
            l0.o(group2, ProtectedSandApp.s("ꊬ\u0001"));
            l0.o(locale, s4);
            if (group2 == null) {
                throw new NullPointerException(s5);
            }
            String lowerCase2 = group2.toLowerCase(locale);
            l0.o(lowerCase2, s6);
            ArrayList arrayList = new ArrayList();
            Matcher matcher2 = x.f85116h.matcher(str);
            int end = matcher.end();
            while (end < str.length()) {
                matcher2.region(end, str.length());
                if (!matcher2.lookingAt()) {
                    StringBuilder sb = new StringBuilder(ProtectedSandApp.s("ꊯ\u0001"));
                    String substring = str.substring(end);
                    l0.o(substring, ProtectedSandApp.s("ꊰ\u0001"));
                    sb.append(substring);
                    sb.append(ProtectedSandApp.s("ꊱ\u0001"));
                    throw new IllegalArgumentException(f3.a(sb, str, m0.quote).toString());
                }
                String group3 = matcher2.group(1);
                if (group3 == null) {
                    end = matcher2.end();
                } else {
                    String group4 = matcher2.group(2);
                    if (group4 == null) {
                        group4 = matcher2.group(3);
                    } else {
                        String s7 = ProtectedSandApp.s("ꊭ\u0001");
                        if (kotlin.text.v.s2(group4, s7, false, 2, null) && kotlin.text.v.J1(group4, s7, false, 2, null) && group4.length() > 2) {
                            group4 = group4.substring(1, group4.length() - 1);
                            l0.o(group4, ProtectedSandApp.s("ꊮ\u0001"));
                        }
                    }
                    arrayList.add(group3);
                    arrayList.add(group4);
                    end = matcher2.end();
                }
            }
            Object[] array = arrayList.toArray(new String[0]);
            if (array != null) {
                return new x(str, lowerCase, lowerCase2, (String[]) array, null);
            }
            throw new NullPointerException(ProtectedSandApp.s("ꊲ\u0001"));
        }

        @fg.m
        @kd.n
        @kd.i(name = "parse")
        public final x d(@fg.l String str) {
            l0.p(str, ProtectedSandApp.s("ꊴ\u0001"));
            try {
                return c(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.w wVar) {
            this();
        }
    }

    private x(String str, String str2, String str3, String[] strArr) {
        this.mediaType = str;
        this.type = str2;
        this.subtype = str3;
        this.parameterNamesAndValues = strArr;
    }

    public static /* synthetic */ Charset g(x xVar, Charset charset, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            charset = null;
        }
        return xVar.f(charset);
    }

    @fg.l
    @kd.n
    @kd.i(name = "get")
    public static final x h(@fg.l String str) {
        return INSTANCE.c(str);
    }

    @fg.m
    @kd.n
    @kd.i(name = "parse")
    public static final x j(@fg.l String str) {
        return INSTANCE.d(str);
    }

    @fg.l
    @kotlin.k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @x0(expression = "subtype", imports = {}))
    @kd.i(name = "-deprecated_subtype")
    /* renamed from: a, reason: from getter */
    public final String getSubtype() {
        return this.subtype;
    }

    @fg.l
    @kotlin.k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @x0(expression = "type", imports = {}))
    @kd.i(name = "-deprecated_type")
    /* renamed from: b, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @fg.m
    @kd.j
    public final Charset e() {
        return g(this, null, 1, null);
    }

    public boolean equals(@fg.m Object other) {
        return (other instanceof x) && l0.g(((x) other).mediaType, this.mediaType);
    }

    @fg.m
    @kd.j
    public final Charset f(@fg.m Charset defaultValue) {
        String i4 = i(ProtectedSandApp.s("ꊹ\u0001"));
        if (i4 == null) {
            return defaultValue;
        }
        try {
            return Charset.forName(i4);
        } catch (IllegalArgumentException unused) {
            return defaultValue;
        }
    }

    public int hashCode() {
        return this.mediaType.hashCode();
    }

    @fg.m
    public final String i(@fg.l String name) {
        l0.p(name, ProtectedSandApp.s("ꊺ\u0001"));
        kotlin.ranges.j B1 = kotlin.ranges.s.B1(kotlin.collections.l.ne(this.parameterNamesAndValues), 2);
        int first = B1.getFirst();
        int last = B1.getLast();
        int step = B1.getStep();
        if (step >= 0) {
            if (first > last) {
                return null;
            }
        } else if (first < last) {
            return null;
        }
        while (!kotlin.text.v.K1(this.parameterNamesAndValues[first], name, true)) {
            if (first == last) {
                return null;
            }
            first += step;
        }
        return this.parameterNamesAndValues[first + 1];
    }

    @fg.l
    @kd.i(name = "subtype")
    public final String k() {
        return this.subtype;
    }

    @fg.l
    @kd.i(name = "type")
    public final String l() {
        return this.type;
    }

    @fg.l
    /* renamed from: toString, reason: from getter */
    public String getMediaType() {
        return this.mediaType;
    }

    public /* synthetic */ x(String str, String str2, String str3, String[] strArr, kotlin.jvm.internal.w wVar) {
        this(str, str2, str3, strArr);
    }
}
