package okhttp3;

import androidx.compose.animation.d1;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.x0;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* compiled from: Cookie.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u001f\u0018\u0000 /2\u00020\u0001:\u0002# BQ\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\t2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u001c\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u001d\u0010\u001bJ\u000f\u0010\u001e\u001a\u00020\tH\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0005H\u0007¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\tH\u0007¢\u0006\u0004\b\"\u0010\u001fJ\u000f\u0010#\u001a\u00020\u0002H\u0007¢\u0006\u0004\b#\u0010\u001bJ\u000f\u0010$\u001a\u00020\u0002H\u0007¢\u0006\u0004\b$\u0010\u001bJ\u000f\u0010%\u001a\u00020\tH\u0007¢\u0006\u0004\b%\u0010\u001fJ\u000f\u0010&\u001a\u00020\tH\u0007¢\u0006\u0004\b&\u0010\u001fJ\u0017\u0010(\u001a\u00020\u00022\u0006\u0010'\u001a\u00020\tH\u0000¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b#\u0010*\u001a\u0004\b+\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b \u0010*\u001a\u0004\b,\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00058\u0007¢\u0006\f\n\u0004\b\"\u0010-\u001a\u0004\b.\u0010!R\u0017\u0010\u0007\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b%\u0010*\u001a\u0004\b/\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u001c\u0010*\u001a\u0004\b0\u0010\u001bR\u0017\u0010\n\u001a\u00020\t8\u0007¢\u0006\f\n\u0004\b$\u00101\u001a\u0004\b2\u0010\u001fR\u0017\u0010\u000b\u001a\u00020\t8\u0007¢\u0006\f\n\u0004\b\u001e\u00101\u001a\u0004\b3\u0010\u001fR\u0017\u0010\f\u001a\u00020\t8\u0007¢\u0006\f\n\u0004\b&\u00101\u001a\u0004\b4\u0010\u001fR\u0017\u0010\r\u001a\u00020\t8\u0007¢\u0006\f\n\u0004\b\u001d\u00101\u001a\u0004\b5\u0010\u001f¨\u00066"}, d2 = {"Lokhttp3/m;", "", "", "name", "value", "", "expiresAt", "domain", "path", "", "secure", "httpOnly", "persistent", "hostOnly", "<init>", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;ZZZZ)V", "Lokhttp3/v;", "url", "r", "(Lokhttp3/v;)Z", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "e", "i", "g", "()Z", "b", "()J", "c", "a", "f", "d", "h", "forObsoleteRfc2965", "y", "(Z)Ljava/lang/String;", "Ljava/lang/String;", "s", "z", "J", "o", "n", "v", "Z", "x", "q", "w", "p", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes7.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final String name;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final String value;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final long expiresAt;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final String domain;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final String path;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final boolean secure;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final boolean httpOnly;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final boolean persistent;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final boolean hostOnly;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: j, reason: collision with root package name */
    private static final Pattern f85022j = Pattern.compile(ProtectedSandApp.s("ꇢ\u0001"));

    /* renamed from: k, reason: collision with root package name */
    private static final Pattern f85023k = Pattern.compile(ProtectedSandApp.s("ꇣ\u0001"));

    /* renamed from: l, reason: collision with root package name */
    private static final Pattern f85024l = Pattern.compile(ProtectedSandApp.s("ꇤ\u0001"));

    /* renamed from: m, reason: collision with root package name */
    private static final Pattern f85025m = Pattern.compile(ProtectedSandApp.s("ꇥ\u0001"));

    /* compiled from: Cookie.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\fJ\u0015\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\fJ\u0015\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\fJ\u0015\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\fJ\r\u0010\u0017\u001a\u00020\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0000¢\u0006\u0004\b\u0019\u0010\u0018J\r\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001dR\u0018\u0010\r\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u001dR\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u001eR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u001dR\u0016\u0010\u0015\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u001dR\u0016\u0010 \u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001fR\u0016\u0010!\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u001fR\u0016\u0010\"\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u001fR\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u001f¨\u0006#"}, d2 = {"Lokhttp3/m$a;", "", "<init>", "()V", "", "domain", "", "hostOnly", "c", "(Ljava/lang/String;Z)Lokhttp3/m$a;", "name", "g", "(Ljava/lang/String;)Lokhttp3/m$a;", "value", "j", "", "expiresAt", "d", "(J)Lokhttp3/m$a;", "b", "e", "path", "h", "i", "()Lokhttp3/m$a;", "f", "Lokhttp3/m;", "a", "()Lokhttp3/m;", "Ljava/lang/String;", "J", "Z", "secure", "httpOnly", "persistent", "okhttp"}, k = 1, mv = {1, 4, 0})
    public static final class a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private String name;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private String value;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private String domain;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private boolean secure;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        private boolean httpOnly;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata */
        private boolean persistent;

        /* renamed from: i, reason: collision with root package name and from kotlin metadata */
        private boolean hostOnly;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private long expiresAt = okhttp3.internal.http.c.f84471a;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private String path = ProtectedSandApp.s("ꆾ\u0001");

        private final a c(String domain, boolean hostOnly) {
            String e4 = okhttp3.internal.a.e(domain);
            if (e4 == null) {
                throw new IllegalArgumentException(androidx.constraintlayout.core.motion.key.c.a(ProtectedSandApp.s("ꆿ\u0001"), domain));
            }
            this.domain = e4;
            this.hostOnly = hostOnly;
            return this;
        }

        @fg.l
        public final m a() {
            String str = this.name;
            if (str == null) {
                throw new NullPointerException(ProtectedSandApp.s("ꇂ\u0001"));
            }
            String str2 = this.value;
            if (str2 == null) {
                throw new NullPointerException(ProtectedSandApp.s("ꇁ\u0001"));
            }
            long j4 = this.expiresAt;
            String str3 = this.domain;
            if (str3 != null) {
                return new m(str, str2, j4, str3, this.path, this.secure, this.httpOnly, this.persistent, this.hostOnly, null);
            }
            throw new NullPointerException(ProtectedSandApp.s("ꇀ\u0001"));
        }

        @fg.l
        public final a b(@fg.l String domain) {
            l0.p(domain, ProtectedSandApp.s("ꇃ\u0001"));
            return c(domain, false);
        }

        @fg.l
        public final a d(long expiresAt) {
            if (expiresAt <= 0) {
                expiresAt = Long.MIN_VALUE;
            }
            if (expiresAt > okhttp3.internal.http.c.f84471a) {
                expiresAt = 253402300799999L;
            }
            this.expiresAt = expiresAt;
            this.persistent = true;
            return this;
        }

        @fg.l
        public final a e(@fg.l String domain) {
            l0.p(domain, ProtectedSandApp.s("ꇃ\u0001"));
            return c(domain, true);
        }

        @fg.l
        public final a f() {
            this.httpOnly = true;
            return this;
        }

        @fg.l
        public final a g(@fg.l String name) {
            l0.p(name, ProtectedSandApp.s("ꇄ\u0001"));
            if (!l0.g(kotlin.text.v.C5(name).toString(), name)) {
                throw new IllegalArgumentException(ProtectedSandApp.s("ꇅ\u0001"));
            }
            this.name = name;
            return this;
        }

        @fg.l
        public final a h(@fg.l String path) {
            l0.p(path, ProtectedSandApp.s("ꇆ\u0001"));
            if (!kotlin.text.v.s2(path, ProtectedSandApp.s("ꆾ\u0001"), false, 2, null)) {
                throw new IllegalArgumentException(ProtectedSandApp.s("ꇇ\u0001"));
            }
            this.path = path;
            return this;
        }

        @fg.l
        public final a i() {
            this.secure = true;
            return this;
        }

        @fg.l
        public final a j(@fg.l String value) {
            l0.p(value, ProtectedSandApp.s("ꇈ\u0001"));
            if (!l0.g(kotlin.text.v.C5(value).toString(), value)) {
                throw new IllegalArgumentException(ProtectedSandApp.s("ꇉ\u0001"));
            }
            this.value = value;
            return this;
        }
    }

    /* compiled from: Cookie.kt */
    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J/\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010 \u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u0004H\u0007¢\u0006\u0004\b \u0010!J)\u0010#\u001a\u0004\u0018\u00010\u001f2\u0006\u0010\"\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u0004H\u0000¢\u0006\u0004\b#\u0010$J%\u0010(\u001a\b\u0012\u0004\u0012\u00020\u001f0'2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010&\u001a\u00020%H\u0007¢\u0006\u0004\b(\u0010)R\u001c\u0010,\u001a\n +*\u0004\u0018\u00010*0*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u001c\u0010.\u001a\n +*\u0004\u0018\u00010*0*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010-R\u001c\u0010/\u001a\n +*\u0004\u0018\u00010*0*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010-R\u001c\u00100\u001a\n +*\u0004\u0018\u00010*0*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010-¨\u00061"}, d2 = {"Lokhttp3/m$b;", "", "<init>", "()V", "", "urlHost", "domain", "", "d", "(Ljava/lang/String;Ljava/lang/String;)Z", "Lokhttp3/v;", "url", "path", "k", "(Lokhttp3/v;Ljava/lang/String;)Z", "s", "", "pos", "limit", "", "i", "(Ljava/lang/String;II)J", "input", "invert", "c", "(Ljava/lang/String;IIZ)I", "j", "(Ljava/lang/String;)J", "h", "(Ljava/lang/String;)Ljava/lang/String;", "setCookie", "Lokhttp3/m;", "e", "(Lokhttp3/v;Ljava/lang/String;)Lokhttp3/m;", "currentTimeMillis", "f", "(JLokhttp3/v;Ljava/lang/String;)Lokhttp3/m;", "Lokhttp3/u;", "headers", "", "g", "(Lokhttp3/v;Lokhttp3/u;)Ljava/util/List;", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "DAY_OF_MONTH_PATTERN", "Ljava/util/regex/Pattern;", "MONTH_PATTERN", "TIME_PATTERN", "YEAR_PATTERN", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: okhttp3.m$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        private final int c(String input, int pos, int limit, boolean invert) {
            while (pos < limit) {
                char charAt = input.charAt(pos);
                if (((charAt < ' ' && charAt != '\t') || charAt >= 127 || ('0' <= charAt && '9' >= charAt) || (('a' <= charAt && 'z' >= charAt) || (('A' <= charAt && 'Z' >= charAt) || charAt == ':'))) == (!invert)) {
                    return pos;
                }
                pos++;
            }
            return limit;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean d(String urlHost, String domain) {
            if (l0.g(urlHost, domain)) {
                return true;
            }
            return kotlin.text.v.J1(urlHost, domain, false, 2, null) && urlHost.charAt((urlHost.length() - domain.length()) - 1) == '.' && !okhttp3.internal.d.h(urlHost);
        }

        private final String h(String s4) {
            String s5 = ProtectedSandApp.s("ꇊ\u0001");
            if (kotlin.text.v.J1(s4, s5, false, 2, null)) {
                throw new IllegalArgumentException(ProtectedSandApp.s("ꇋ\u0001"));
            }
            String e4 = okhttp3.internal.a.e(kotlin.text.v.a4(s4, s5));
            if (e4 != null) {
                return e4;
            }
            throw new IllegalArgumentException();
        }

        private final long i(String s4, int pos, int limit) {
            int c5 = c(s4, pos, limit, false);
            Matcher matcher = m.f85025m.matcher(s4);
            int i4 = -1;
            int i5 = -1;
            int i6 = -1;
            int i7 = -1;
            int i10 = -1;
            int i11 = -1;
            while (c5 < limit) {
                int c6 = c(s4, c5 + 1, limit, true);
                matcher.region(c5, c6);
                String s5 = ProtectedSandApp.s("ꇌ\u0001");
                if (i5 == -1 && matcher.usePattern(m.f85025m).matches()) {
                    String group = matcher.group(1);
                    l0.o(group, s5);
                    i5 = Integer.parseInt(group);
                    String group2 = matcher.group(2);
                    l0.o(group2, ProtectedSandApp.s("ꇍ\u0001"));
                    i10 = Integer.parseInt(group2);
                    String group3 = matcher.group(3);
                    l0.o(group3, ProtectedSandApp.s("ꇎ\u0001"));
                    i11 = Integer.parseInt(group3);
                } else if (i6 == -1 && matcher.usePattern(m.f85024l).matches()) {
                    String group4 = matcher.group(1);
                    l0.o(group4, s5);
                    i6 = Integer.parseInt(group4);
                } else if (i7 == -1 && matcher.usePattern(m.f85023k).matches()) {
                    String group5 = matcher.group(1);
                    l0.o(group5, s5);
                    Locale locale = Locale.US;
                    l0.o(locale, ProtectedSandApp.s("ꇏ\u0001"));
                    if (group5 == null) {
                        throw new NullPointerException(ProtectedSandApp.s("ꇒ\u0001"));
                    }
                    String lowerCase = group5.toLowerCase(locale);
                    l0.o(lowerCase, ProtectedSandApp.s("ꇐ\u0001"));
                    String pattern = m.f85023k.pattern();
                    l0.o(pattern, ProtectedSandApp.s("ꇑ\u0001"));
                    i7 = kotlin.text.v.p3(pattern, lowerCase, 0, false, 6, null) / 4;
                } else if (i4 == -1 && matcher.usePattern(m.f85022j).matches()) {
                    String group6 = matcher.group(1);
                    l0.o(group6, s5);
                    i4 = Integer.parseInt(group6);
                }
                c5 = c(s4, c6 + 1, limit, false);
            }
            if (70 <= i4 && 99 >= i4) {
                i4 += 1900;
            }
            if (i4 >= 0 && 69 >= i4) {
                i4 += 2000;
            }
            boolean z4 = i4 >= 1601;
            String s6 = ProtectedSandApp.s("ꇋ\u0001");
            if (!z4) {
                throw new IllegalArgumentException(s6);
            }
            if (!(i7 != -1)) {
                throw new IllegalArgumentException(s6);
            }
            if (!(1 <= i6 && 31 >= i6)) {
                throw new IllegalArgumentException(s6);
            }
            if (!(i5 >= 0 && 23 >= i5)) {
                throw new IllegalArgumentException(s6);
            }
            if (!(i10 >= 0 && 59 >= i10)) {
                throw new IllegalArgumentException(s6);
            }
            if (!(i11 >= 0 && 59 >= i11)) {
                throw new IllegalArgumentException(s6);
            }
            GregorianCalendar gregorianCalendar = new GregorianCalendar(okhttp3.internal.d.f84461f);
            gregorianCalendar.setLenient(false);
            gregorianCalendar.set(1, i4);
            gregorianCalendar.set(2, i7 - 1);
            gregorianCalendar.set(5, i6);
            gregorianCalendar.set(11, i5);
            gregorianCalendar.set(12, i10);
            gregorianCalendar.set(13, i11);
            gregorianCalendar.set(14, 0);
            return gregorianCalendar.getTimeInMillis();
        }

        private final long j(String s4) {
            try {
                long parseLong = Long.parseLong(s4);
                if (parseLong <= 0) {
                    return Long.MIN_VALUE;
                }
                return parseLong;
            } catch (NumberFormatException e4) {
                if (new kotlin.text.r(ProtectedSandApp.s("ꇓ\u0001")).k(s4)) {
                    return kotlin.text.v.s2(s4, ProtectedSandApp.s("ꇔ\u0001"), false, 2, null) ? Long.MIN_VALUE : Long.MAX_VALUE;
                }
                throw e4;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean k(v url, String path) {
            String x4 = url.x();
            if (l0.g(x4, path)) {
                return true;
            }
            return kotlin.text.v.s2(x4, path, false, 2, null) && (kotlin.text.v.J1(path, ProtectedSandApp.s("ꇕ\u0001"), false, 2, null) || x4.charAt(path.length()) == '/');
        }

        @fg.m
        @kd.n
        public final m e(@fg.l v url, @fg.l String setCookie) {
            l0.p(url, ProtectedSandApp.s("ꇖ\u0001"));
            l0.p(setCookie, ProtectedSandApp.s("ꇗ\u0001"));
            return f(System.currentTimeMillis(), url, setCookie);
        }

        /* JADX WARN: Code restructure failed: missing block: B:86:0x0126, code lost:
        
            if (r1 > okhttp3.internal.http.c.f84471a) goto L56;
         */
        /* JADX WARN: Removed duplicated region for block: B:54:0x0138  */
        /* JADX WARN: Removed duplicated region for block: B:57:0x014d  */
        /* JADX WARN: Removed duplicated region for block: B:69:0x0186  */
        /* JADX WARN: Removed duplicated region for block: B:74:0x013a  */
        @fg.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final okhttp3.m f(long r26, @fg.l okhttp3.v r28, @fg.l java.lang.String r29) {
            /*
                Method dump skipped, instructions count: 431
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.m.Companion.f(long, okhttp3.v, java.lang.String):okhttp3.m");
        }

        @fg.l
        @kd.n
        public final List<m> g(@fg.l v url, @fg.l u headers) {
            l0.p(url, ProtectedSandApp.s("ꇖ\u0001"));
            l0.p(headers, ProtectedSandApp.s("ꇟ\u0001"));
            List<String> v4 = headers.v(ProtectedSandApp.s("ꇠ\u0001"));
            int size = v4.size();
            ArrayList arrayList = null;
            for (int i4 = 0; i4 < size; i4++) {
                m e4 = e(url, v4.get(i4));
                if (e4 != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(e4);
                }
            }
            if (arrayList == null) {
                return kotlin.collections.j0.f74919b;
            }
            List<m> unmodifiableList = Collections.unmodifiableList(arrayList);
            l0.o(unmodifiableList, ProtectedSandApp.s("ꇡ\u0001"));
            return unmodifiableList;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.w wVar) {
            this();
        }
    }

    private m(String str, String str2, long j4, String str3, String str4, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.name = str;
        this.value = str2;
        this.expiresAt = j4;
        this.domain = str3;
        this.path = str4;
        this.secure = z4;
        this.httpOnly = z5;
        this.persistent = z6;
        this.hostOnly = z7;
    }

    @fg.m
    @kd.n
    public static final m t(@fg.l v vVar, @fg.l String str) {
        return INSTANCE.e(vVar, str);
    }

    @fg.l
    @kd.n
    public static final List<m> u(@fg.l v vVar, @fg.l u uVar) {
        return INSTANCE.g(vVar, uVar);
    }

    @fg.l
    @kotlin.k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @x0(expression = "domain", imports = {}))
    @kd.i(name = "-deprecated_domain")
    /* renamed from: a, reason: from getter */
    public final String getDomain() {
        return this.domain;
    }

    @kotlin.k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @x0(expression = "expiresAt", imports = {}))
    @kd.i(name = "-deprecated_expiresAt")
    /* renamed from: b, reason: from getter */
    public final long getExpiresAt() {
        return this.expiresAt;
    }

    @kotlin.k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @x0(expression = "hostOnly", imports = {}))
    @kd.i(name = "-deprecated_hostOnly")
    /* renamed from: c, reason: from getter */
    public final boolean getHostOnly() {
        return this.hostOnly;
    }

    @kotlin.k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @x0(expression = "httpOnly", imports = {}))
    @kd.i(name = "-deprecated_httpOnly")
    /* renamed from: d, reason: from getter */
    public final boolean getHttpOnly() {
        return this.httpOnly;
    }

    @fg.l
    @kotlin.k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @x0(expression = "name", imports = {}))
    @kd.i(name = "-deprecated_name")
    /* renamed from: e, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public boolean equals(@fg.m Object other) {
        if (other instanceof m) {
            m mVar = (m) other;
            if (l0.g(mVar.name, this.name) && l0.g(mVar.value, this.value) && mVar.expiresAt == this.expiresAt && l0.g(mVar.domain, this.domain) && l0.g(mVar.path, this.path) && mVar.secure == this.secure && mVar.httpOnly == this.httpOnly && mVar.persistent == this.persistent && mVar.hostOnly == this.hostOnly) {
                return true;
            }
        }
        return false;
    }

    @fg.l
    @kotlin.k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @x0(expression = "path", imports = {}))
    @kd.i(name = "-deprecated_path")
    /* renamed from: f, reason: from getter */
    public final String getPath() {
        return this.path;
    }

    @kotlin.k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @x0(expression = "persistent", imports = {}))
    @kd.i(name = "-deprecated_persistent")
    /* renamed from: g, reason: from getter */
    public final boolean getPersistent() {
        return this.persistent;
    }

    @kotlin.k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @x0(expression = "secure", imports = {}))
    @kd.i(name = "-deprecated_secure")
    /* renamed from: h, reason: from getter */
    public final boolean getSecure() {
        return this.secure;
    }

    @IgnoreJRERequirement
    public int hashCode() {
        return Boolean.hashCode(this.hostOnly) + d1.a(this.persistent, d1.a(this.httpOnly, d1.a(this.secure, androidx.compose.foundation.text.modifiers.n.a(this.path, androidx.compose.foundation.text.modifiers.n.a(this.domain, i0.k.a(this.expiresAt, androidx.compose.foundation.text.modifiers.n.a(this.value, androidx.compose.foundation.text.modifiers.n.a(this.name, 527, 31), 31), 31), 31), 31), 31), 31), 31);
    }

    @fg.l
    @kotlin.k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @x0(expression = "value", imports = {}))
    @kd.i(name = "-deprecated_value")
    /* renamed from: i, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    @fg.l
    @kd.i(name = "domain")
    public final String n() {
        return this.domain;
    }

    @kd.i(name = "expiresAt")
    public final long o() {
        return this.expiresAt;
    }

    @kd.i(name = "hostOnly")
    public final boolean p() {
        return this.hostOnly;
    }

    @kd.i(name = "httpOnly")
    public final boolean q() {
        return this.httpOnly;
    }

    public final boolean r(@fg.l v url) {
        l0.p(url, ProtectedSandApp.s("ꇦ\u0001"));
        if ((this.hostOnly ? l0.g(url.getHost(), this.domain) : INSTANCE.d(url.getHost(), this.domain)) && INSTANCE.k(url, this.path)) {
            return !this.secure || url.getIsHttps();
        }
        return false;
    }

    @fg.l
    @kd.i(name = "name")
    public final String s() {
        return this.name;
    }

    @fg.l
    public String toString() {
        return y(false);
    }

    @fg.l
    @kd.i(name = "path")
    public final String v() {
        return this.path;
    }

    @kd.i(name = "persistent")
    public final boolean w() {
        return this.persistent;
    }

    @kd.i(name = "secure")
    public final boolean x() {
        return this.secure;
    }

    @fg.l
    public final String y(boolean forObsoleteRfc2965) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.name);
        sb.append('=');
        sb.append(this.value);
        if (this.persistent) {
            if (this.expiresAt == Long.MIN_VALUE) {
                sb.append(ProtectedSandApp.s("ꇧ\u0001"));
            } else {
                sb.append(ProtectedSandApp.s("ꇨ\u0001"));
                sb.append(okhttp3.internal.http.c.b(new Date(this.expiresAt)));
            }
        }
        if (!this.hostOnly) {
            sb.append(ProtectedSandApp.s("ꇩ\u0001"));
            if (forObsoleteRfc2965) {
                sb.append(ProtectedSandApp.s("ꇪ\u0001"));
            }
            sb.append(this.domain);
        }
        sb.append(ProtectedSandApp.s("ꇫ\u0001"));
        sb.append(this.path);
        if (this.secure) {
            sb.append(ProtectedSandApp.s("ꇬ\u0001"));
        }
        if (this.httpOnly) {
            sb.append(ProtectedSandApp.s("ꇭ\u0001"));
        }
        String sb2 = sb.toString();
        l0.o(sb2, ProtectedSandApp.s("ꇮ\u0001"));
        return sb2;
    }

    @fg.l
    @kd.i(name = "value")
    public final String z() {
        return this.value;
    }

    public /* synthetic */ m(String str, String str2, long j4, String str3, String str4, boolean z4, boolean z5, boolean z6, boolean z7, kotlin.jvm.internal.w wVar) {
        this(str, str2, j4, str3, str4, z4, z5, z6, z7);
    }
}
