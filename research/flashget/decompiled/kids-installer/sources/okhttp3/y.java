package okhttp3;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.text.Typography;

/* compiled from: MediaType.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\b\u0006\u0018\u0000 \u00072\u00020\u0001:\u0001\nB/\b\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0005\u0012\u0006\u0010\u0014\u001a\u00020\u0005\u0012\u0006\u0010\u0017\u001a\u00020\u0005\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0018¢\u0006\u0004\b\u001c\u0010\u001dJ\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0005J\u000f\u0010\b\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\n\u0010\tJ\b\u0010\u000b\u001a\u00020\u0005H\u0016J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0010\u001a\u00020\u000fH\u0016R\u0014\u0010\u0012\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0011R\u0017\u0010\u0014\u001a\u00020\u00058\u0007¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0013\u0010\tR\u0017\u0010\u0017\u001a\u00020\u00058\u0007¢\u0006\f\n\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0016\u0010\tR\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, d2 = {"Lokhttp3/y;", "", "Ljava/nio/charset/Charset;", "defaultValue", "f", "", "name", "i", "b", "()Ljava/lang/String;", "a", "toString", "other", "", "equals", "", "hashCode", "Ljava/lang/String;", "mediaType", "l", "type", "c", "k", "subtype", "", "d", "[Ljava/lang/String;", "parameterNamesAndValues", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes5.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String mediaType;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final String type;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final String subtype;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final String[] parameterNamesAndValues;

    /* renamed from: e, reason: collision with root package name */
    private static final String f31571e = ProtectedSandApp.s("柈");

    /* renamed from: f, reason: collision with root package name */
    private static final String f31572f = ProtectedSandApp.s("柉");

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: g, reason: collision with root package name */
    private static final Pattern f31573g = Pattern.compile(ProtectedSandApp.s("柊"));

    /* renamed from: h, reason: collision with root package name */
    private static final Pattern f31574h = Pattern.compile(ProtectedSandApp.s("柋"));

    /* compiled from: MediaType.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003*\u00020\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\b\u0010\u0005J\u0019\u0010\t\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\t\u0010\u0005R\u001c\u0010\f\u001a\n \u000b*\u0004\u0018\u00010\n0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u001c\u0010\u0011\u001a\n \u000b*\u0004\u0018\u00010\n0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\r¨\u0006\u0014"}, d2 = {"Lokhttp3/y$a;", "", "", "Lokhttp3/y;", "c", "(Ljava/lang/String;)Lokhttp3/y;", "d", "mediaType", "a", "b", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "PARAMETER", "Ljava/util/regex/Pattern;", "QUOTED", "Ljava/lang/String;", "TOKEN", "TYPE_SUBTYPE", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: okhttp3.y$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @p3.i(name = "-deprecated_get")
        @Deprecated(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @ReplaceWith(expression = "mediaType.toMediaType()", imports = {"okhttp3.MediaType.Companion.toMediaType"}))
        @d5.d
        public final y a(@d5.d String mediaType) {
            kotlin.jvm.internal.l0.p(mediaType, ProtectedSandApp.s("枸"));
            return c(mediaType);
        }

        @p3.i(name = "-deprecated_parse")
        @Deprecated(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @ReplaceWith(expression = "mediaType.toMediaTypeOrNull()", imports = {"okhttp3.MediaType.Companion.toMediaTypeOrNull"}))
        @d5.e
        public final y b(@d5.d String mediaType) {
            kotlin.jvm.internal.l0.p(mediaType, ProtectedSandApp.s("枹"));
            return d(mediaType);
        }

        @p3.i(name = "get")
        @d5.d
        @p3.n
        public final y c(@d5.d String str) {
            boolean s22;
            boolean J1;
            kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("枺"));
            Matcher matcher = y.f31573g.matcher(str);
            if (!matcher.lookingAt()) {
                throw new IllegalArgumentException((ProtectedSandApp.s("柆") + str + Typography.f27126b).toString());
            }
            String group = matcher.group(1);
            kotlin.jvm.internal.l0.o(group, ProtectedSandApp.s("枻"));
            Locale locale = Locale.US;
            String s5 = ProtectedSandApp.s("枼");
            kotlin.jvm.internal.l0.o(locale, s5);
            String s6 = ProtectedSandApp.s("枽");
            if (group == null) {
                throw new NullPointerException(s6);
            }
            String lowerCase = group.toLowerCase(locale);
            String s7 = ProtectedSandApp.s("枾");
            kotlin.jvm.internal.l0.o(lowerCase, s7);
            String group2 = matcher.group(2);
            kotlin.jvm.internal.l0.o(group2, ProtectedSandApp.s("枿"));
            kotlin.jvm.internal.l0.o(locale, s5);
            if (group2 == null) {
                throw new NullPointerException(s6);
            }
            String lowerCase2 = group2.toLowerCase(locale);
            kotlin.jvm.internal.l0.o(lowerCase2, s7);
            ArrayList arrayList = new ArrayList();
            Matcher matcher2 = y.f31574h.matcher(str);
            int end = matcher.end();
            while (end < str.length()) {
                matcher2.region(end, str.length());
                if (!matcher2.lookingAt()) {
                    StringBuilder sb = new StringBuilder(ProtectedSandApp.s("柂"));
                    String substring = str.substring(end);
                    kotlin.jvm.internal.l0.o(substring, ProtectedSandApp.s("柃"));
                    sb.append(substring);
                    sb.append(ProtectedSandApp.s("柄"));
                    sb.append(str);
                    sb.append(Typography.f27126b);
                    throw new IllegalArgumentException(sb.toString().toString());
                }
                String group3 = matcher2.group(1);
                if (group3 == null) {
                    end = matcher2.end();
                } else {
                    String group4 = matcher2.group(2);
                    if (group4 == null) {
                        group4 = matcher2.group(3);
                    } else {
                        String s8 = ProtectedSandApp.s("柀");
                        s22 = kotlin.text.e0.s2(group4, s8, false, 2, null);
                        if (s22) {
                            J1 = kotlin.text.e0.J1(group4, s8, false, 2, null);
                            if (J1 && group4.length() > 2) {
                                group4 = group4.substring(1, group4.length() - 1);
                                kotlin.jvm.internal.l0.o(group4, ProtectedSandApp.s("柁"));
                            }
                        }
                    }
                    arrayList.add(group3);
                    arrayList.add(group4);
                    end = matcher2.end();
                }
            }
            Object[] array = arrayList.toArray(new String[0]);
            if (array != null) {
                return new y(str, lowerCase, lowerCase2, (String[]) array, null);
            }
            throw new NullPointerException(ProtectedSandApp.s("柅"));
        }

        @p3.i(name = "parse")
        @d5.e
        @p3.n
        public final y d(@d5.d String str) {
            kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("柇"));
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

    private y(String str, String str2, String str3, String[] strArr) {
        this.mediaType = str;
        this.type = str2;
        this.subtype = str3;
        this.parameterNamesAndValues = strArr;
    }

    public static /* synthetic */ Charset g(y yVar, Charset charset, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            charset = null;
        }
        return yVar.f(charset);
    }

    @p3.i(name = "get")
    @d5.d
    @p3.n
    public static final y h(@d5.d String str) {
        return INSTANCE.c(str);
    }

    @p3.i(name = "parse")
    @d5.e
    @p3.n
    public static final y j(@d5.d String str) {
        return INSTANCE.d(str);
    }

    @p3.i(name = "-deprecated_subtype")
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "subtype", imports = {}))
    @d5.d
    /* renamed from: a, reason: from getter */
    public final String getSubtype() {
        return this.subtype;
    }

    @p3.i(name = "-deprecated_type")
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "type", imports = {}))
    @d5.d
    /* renamed from: b, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @d5.e
    @p3.j
    public final Charset e() {
        return g(this, null, 1, null);
    }

    public boolean equals(@d5.e Object other) {
        return (other instanceof y) && kotlin.jvm.internal.l0.g(((y) other).mediaType, this.mediaType);
    }

    @d5.e
    @p3.j
    public final Charset f(@d5.e Charset defaultValue) {
        String i5 = i(ProtectedSandApp.s("柌"));
        if (i5 == null) {
            return defaultValue;
        }
        try {
            return Charset.forName(i5);
        } catch (IllegalArgumentException unused) {
            return defaultValue;
        }
    }

    public int hashCode() {
        return this.mediaType.hashCode();
    }

    /* JADX WARN: Incorrect condition in loop: B:8:0x0030 */
    @d5.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String i(@d5.d java.lang.String r6) {
        /*
            r5 = this;
            java.lang.String r0 = "柍"
            java.lang.String r0 = com.flashget.kidsdownloader.ProtectedSandApp.s(r0)
            kotlin.jvm.internal.l0.p(r6, r0)
            java.lang.String[] r0 = r5.parameterNamesAndValues
            kotlin.ranges.l r0 = kotlin.collections.l.ne(r0)
            r1 = 2
            kotlin.ranges.j r0 = kotlin.ranges.s.B1(r0, r1)
            int r1 = r0.getF23724o()
            int r2 = r0.getF23725p()
            int r0 = r0.getF23726q()
            if (r0 < 0) goto L25
            if (r1 > r2) goto L3c
            goto L27
        L25:
            if (r1 < r2) goto L3c
        L27:
            java.lang.String[] r3 = r5.parameterNamesAndValues
            r3 = r3[r1]
            r4 = 1
            boolean r3 = kotlin.text.v.K1(r3, r6, r4)
            if (r3 == 0) goto L38
            java.lang.String[] r6 = r5.parameterNamesAndValues
            int r1 = r1 + r4
            r6 = r6[r1]
            return r6
        L38:
            if (r1 == r2) goto L3c
            int r1 = r1 + r0
            goto L27
        L3c:
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.y.i(java.lang.String):java.lang.String");
    }

    @p3.i(name = "subtype")
    @d5.d
    public final String k() {
        return this.subtype;
    }

    @p3.i(name = "type")
    @d5.d
    public final String l() {
        return this.type;
    }

    @d5.d
    /* renamed from: toString, reason: from getter */
    public String getMediaType() {
        return this.mediaType;
    }

    public /* synthetic */ y(String str, String str2, String str3, String[] strArr, kotlin.jvm.internal.w wVar) {
        this(str, str2, str3, strArr);
    }
}
