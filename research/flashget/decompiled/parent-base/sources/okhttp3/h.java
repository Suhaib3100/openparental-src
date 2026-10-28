package okhttp3;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.z0;
import kotlin.jvm.internal.l0;
import kotlin.x0;

/* compiled from: Challenge.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\tJ\u0015\u0010\f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0010\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00020\u0004H\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0011\u0010\u0012\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u0012\u0010\u000fJ\u000f\u0010\u0013\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001c\u0010\u000fR%\u0010\u0005\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00020\u00048G¢\u0006\f\n\u0004\b\u0010\u0010\u001d\u001a\u0004\b\u001e\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u001f\u001a\u0004\b \u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u00028G¢\u0006\u0006\u001a\u0004\b!\u0010\u000fR\u0011\u0010\u000b\u001a\u00020\n8G¢\u0006\u0006\u001a\u0004\b\"\u0010\u0014¨\u0006#"}, d2 = {"Lokhttp3/h;", "", "", "scheme", "", "authParams", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "realm", "(Ljava/lang/String;Ljava/lang/String;)V", "Ljava/nio/charset/Charset;", "charset", "i", "(Ljava/nio/charset/Charset;)Lokhttp3/h;", "d", "()Ljava/lang/String;", "a", "()Ljava/util/Map;", "c", "b", "()Ljava/nio/charset/Charset;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/util/Map;", "e", "Ljava/lang/String;", "h", "g", "f", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes7.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Map<String, String> authParams;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final String scheme;

    public h(@fg.l String str, @fg.l Map<String, String> map) {
        String str2;
        l0.p(str, ProtectedSandApp.s("齄\u0001"));
        l0.p(map, ProtectedSandApp.s("齇\u0001"));
        this.scheme = str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (key != null) {
                Locale locale = Locale.US;
                l0.o(locale, ProtectedSandApp.s("齈\u0001"));
                str2 = key.toLowerCase(locale);
                l0.o(str2, ProtectedSandApp.s("齉\u0001"));
            } else {
                str2 = null;
            }
            linkedHashMap.put(str2, value);
        }
        Map<String, String> unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        l0.o(unmodifiableMap, ProtectedSandApp.s("齊\u0001"));
        this.authParams = unmodifiableMap;
    }

    @fg.l
    @kotlin.k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @x0(expression = "authParams", imports = {}))
    @kd.i(name = "-deprecated_authParams")
    public final Map<String, String> a() {
        return this.authParams;
    }

    @fg.l
    @kotlin.k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @x0(expression = "charset", imports = {}))
    @kd.i(name = "-deprecated_charset")
    public final Charset b() {
        return f();
    }

    @fg.m
    @kotlin.k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @x0(expression = "realm", imports = {}))
    @kd.i(name = "-deprecated_realm")
    public final String c() {
        return g();
    }

    @fg.l
    @kotlin.k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @x0(expression = "scheme", imports = {}))
    @kd.i(name = "-deprecated_scheme")
    /* renamed from: d, reason: from getter */
    public final String getScheme() {
        return this.scheme;
    }

    @fg.l
    @kd.i(name = "authParams")
    public final Map<String, String> e() {
        return this.authParams;
    }

    public boolean equals(@fg.m Object other) {
        if (other instanceof h) {
            h hVar = (h) other;
            if (l0.g(hVar.scheme, this.scheme) && l0.g(hVar.authParams, this.authParams)) {
                return true;
            }
        }
        return false;
    }

    @fg.l
    @kd.i(name = "charset")
    public final Charset f() {
        String str = this.authParams.get(ProtectedSandApp.s("齋\u0001"));
        if (str != null) {
            try {
                Charset forName = Charset.forName(str);
                l0.o(forName, ProtectedSandApp.s("齌\u0001"));
                return forName;
            } catch (Exception unused) {
            }
        }
        Charset charset = StandardCharsets.ISO_8859_1;
        l0.o(charset, ProtectedSandApp.s("齍\u0001"));
        return charset;
    }

    @fg.m
    @kd.i(name = "realm")
    public final String g() {
        return this.authParams.get(ProtectedSandApp.s("齅\u0001"));
    }

    @fg.l
    @kd.i(name = "scheme")
    public final String h() {
        return this.scheme;
    }

    public int hashCode() {
        return this.authParams.hashCode() + androidx.compose.foundation.text.modifiers.n.a(this.scheme, 899, 31);
    }

    @fg.l
    public final h i(@fg.l Charset charset) {
        String s4 = ProtectedSandApp.s("齋\u0001");
        l0.p(charset, s4);
        Map J0 = z0.J0(this.authParams);
        String name = charset.name();
        l0.o(name, ProtectedSandApp.s("齎\u0001"));
        J0.put(s4, name);
        return new h(this.scheme, (Map<String, String>) J0);
    }

    @fg.l
    public String toString() {
        return this.scheme + ProtectedSandApp.s("齏\u0001") + this.authParams;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public h(@fg.l java.lang.String r2, @fg.l java.lang.String r3) {
        /*
            r1 = this;
            java.lang.String r0 = "齄\u0001"
            java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
            kotlin.jvm.internal.l0.p(r2, r0)
            java.lang.String r0 = "齅\u0001"
            java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
            kotlin.jvm.internal.l0.p(r3, r0)
            java.util.Map r3 = java.util.Collections.singletonMap(r0, r3)
            java.lang.String r0 = "齆\u0001"
            java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
            kotlin.jvm.internal.l0.o(r3, r0)
            r1.<init>(r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.h.<init>(java.lang.String, java.lang.String):void");
    }
}
