package okhttp3;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.f1;

/* compiled from: Challenge.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0019\u001a\u00020\u0005\u0012\u0014\u0010\u0016\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00050\b¢\u0006\u0004\b\u001d\u0010\u001eB\u0019\b\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0005\u0012\u0006\u0010\u001b\u001a\u00020\u0005¢\u0006\u0004\b\u001d\u0010\u001fJ\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J\u000f\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\t\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00050\bH\u0007¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\u000b\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\u000b\u0010\u0007J\u000f\u0010\f\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0011H\u0016J\b\u0010\u0013\u001a\u00020\u0005H\u0016R%\u0010\u0016\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00050\b8G¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0015\u0010\nR\u0017\u0010\u0019\u001a\u00020\u00058\u0007¢\u0006\f\n\u0004\b\f\u0010\u0017\u001a\u0004\b\u0018\u0010\u0007R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u00058G¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0007R\u0011\u0010\u0003\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\b\u001c\u0010\r¨\u0006 "}, d2 = {"Lokhttp3/h;", "", "Ljava/nio/charset/Charset;", "charset", "i", "", "d", "()Ljava/lang/String;", "", "a", "()Ljava/util/Map;", "c", "b", "()Ljava/nio/charset/Charset;", "other", "", "equals", "", "hashCode", "toString", "Ljava/util/Map;", "e", "authParams", "Ljava/lang/String;", "h", "scheme", "g", "realm", "f", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "(Ljava/lang/String;Ljava/lang/String;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes5.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final Map<String, String> authParams;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final String scheme;

    public h(@d5.d String str, @d5.d Map<String, String> map) {
        String str2;
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("怵"));
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("怶"));
        this.scheme = str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (key != null) {
                Locale locale = Locale.US;
                kotlin.jvm.internal.l0.o(locale, ProtectedSandApp.s("怷"));
                str2 = key.toLowerCase(locale);
                kotlin.jvm.internal.l0.o(str2, ProtectedSandApp.s("怸"));
            } else {
                str2 = null;
            }
            linkedHashMap.put(str2, value);
        }
        Map<String, String> unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        kotlin.jvm.internal.l0.o(unmodifiableMap, ProtectedSandApp.s("怹"));
        this.authParams = unmodifiableMap;
    }

    @p3.i(name = "-deprecated_authParams")
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "authParams", imports = {}))
    @d5.d
    public final Map<String, String> a() {
        return this.authParams;
    }

    @p3.i(name = "-deprecated_charset")
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "charset", imports = {}))
    @d5.d
    public final Charset b() {
        return f();
    }

    @p3.i(name = "-deprecated_realm")
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "realm", imports = {}))
    @d5.e
    public final String c() {
        return g();
    }

    @p3.i(name = "-deprecated_scheme")
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "scheme", imports = {}))
    @d5.d
    /* renamed from: d, reason: from getter */
    public final String getScheme() {
        return this.scheme;
    }

    @p3.i(name = "authParams")
    @d5.d
    public final Map<String, String> e() {
        return this.authParams;
    }

    public boolean equals(@d5.e Object other) {
        if (other instanceof h) {
            h hVar = (h) other;
            if (kotlin.jvm.internal.l0.g(hVar.scheme, this.scheme) && kotlin.jvm.internal.l0.g(hVar.authParams, this.authParams)) {
                return true;
            }
        }
        return false;
    }

    @p3.i(name = "charset")
    @d5.d
    public final Charset f() {
        String str = this.authParams.get(ProtectedSandApp.s("怺"));
        if (str != null) {
            try {
                Charset forName = Charset.forName(str);
                kotlin.jvm.internal.l0.o(forName, ProtectedSandApp.s("总"));
                return forName;
            } catch (Exception unused) {
            }
        }
        Charset charset = StandardCharsets.ISO_8859_1;
        kotlin.jvm.internal.l0.o(charset, ProtectedSandApp.s("怼"));
        return charset;
    }

    @p3.i(name = "realm")
    @d5.e
    public final String g() {
        return this.authParams.get(ProtectedSandApp.s("怽"));
    }

    @p3.i(name = "scheme")
    @d5.d
    public final String h() {
        return this.scheme;
    }

    public int hashCode() {
        return this.authParams.hashCode() + ((this.scheme.hashCode() + 899) * 31);
    }

    @d5.d
    public final h i(@d5.d Charset charset) {
        Map J0;
        String s5 = ProtectedSandApp.s("怾");
        kotlin.jvm.internal.l0.p(charset, s5);
        J0 = f1.J0(this.authParams);
        String name = charset.name();
        kotlin.jvm.internal.l0.o(name, ProtectedSandApp.s("怿"));
        J0.put(s5, name);
        return new h(this.scheme, (Map<String, String>) J0);
    }

    @d5.d
    public String toString() {
        return this.scheme + ProtectedSandApp.s("恀") + this.authParams;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public h(@d5.d java.lang.String r2, @d5.d java.lang.String r3) {
        /*
            r1 = this;
            java.lang.String r0 = "怲"
            java.lang.String r0 = com.flashget.kidsdownloader.ProtectedSandApp.s(r0)
            kotlin.jvm.internal.l0.p(r2, r0)
            java.lang.String r0 = "怳"
            java.lang.String r0 = com.flashget.kidsdownloader.ProtectedSandApp.s(r0)
            kotlin.jvm.internal.l0.p(r3, r0)
            java.util.Map r3 = java.util.Collections.singletonMap(r0, r3)
            java.lang.String r0 = "怴"
            java.lang.String r0 = com.flashget.kidsdownloader.ProtectedSandApp.s(r0)
            kotlin.jvm.internal.l0.o(r3, r0)
            r1.<init>(r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.h.<init>(java.lang.String, java.lang.String):void");
    }
}
