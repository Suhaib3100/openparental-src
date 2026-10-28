package okhttp3;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.EmptyList;
import kotlin.text.Regex;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* compiled from: Cookie.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\"\u0018\u0000 $2\u00020\u0001:\u0002\u0015\u0012BQ\b\u0002\u0012\u0006\u0010\u001e\u001a\u00020\n\u0012\u0006\u0010 \u001a\u00020\n\u0012\u0006\u0010#\u001a\u00020\u0011\u0012\u0006\u0010%\u001a\u00020\n\u0012\u0006\u0010'\u001a\u00020\n\u0012\u0006\u0010*\u001a\u00020\u0004\u0012\u0006\u0010,\u001a\u00020\u0004\u0012\u0006\u0010.\u001a\u00020\u0004\u0012\u0006\u00100\u001a\u00020\u0004¢\u0006\u0004\b1\u00102J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0013\u0010\u0007\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\t\u001a\u00020\bH\u0017J\b\u0010\u000b\u001a\u00020\nH\u0016J\u000f\u0010\f\u001a\u00020\nH\u0007¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0014\u0010\u0010J\u000f\u0010\u0015\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0015\u0010\rJ\u000f\u0010\u0016\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0016\u0010\rJ\u000f\u0010\u0017\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0017\u0010\u0010J\u000f\u0010\u0018\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0018\u0010\u0010J\u0017\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u001e\u001a\u00020\n8\u0007¢\u0006\f\n\u0004\b\u0015\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u0017\u0010 \u001a\u00020\n8\u0007¢\u0006\f\n\u0004\b\u0012\u0010\u001c\u001a\u0004\b\u001f\u0010\rR\u0017\u0010#\u001a\u00020\u00118\u0007¢\u0006\f\n\u0004\b\u0014\u0010!\u001a\u0004\b\"\u0010\u0013R\u0017\u0010%\u001a\u00020\n8\u0007¢\u0006\f\n\u0004\b\u0017\u0010\u001c\u001a\u0004\b$\u0010\rR\u0017\u0010'\u001a\u00020\n8\u0007¢\u0006\f\n\u0004\b\f\u0010\u001c\u001a\u0004\b&\u0010\rR\u0017\u0010*\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0016\u0010(\u001a\u0004\b)\u0010\u0010R\u0017\u0010,\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u000f\u0010(\u001a\u0004\b+\u0010\u0010R\u0017\u0010.\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0018\u0010(\u001a\u0004\b-\u0010\u0010R\u0017\u00100\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u000e\u0010(\u001a\u0004\b/\u0010\u0010¨\u00063"}, d2 = {"Lokhttp3/m;", "", "Lokhttp3/w;", "url", "", "r", "other", "equals", "", "hashCode", "", "toString", "e", "()Ljava/lang/String;", "i", "g", "()Z", "", "b", "()J", "c", "a", "f", "d", "h", "forObsoleteRfc2965", "y", "(Z)Ljava/lang/String;", "Ljava/lang/String;", "s", "name", "z", "value", "J", "o", "expiresAt", "n", "domain", "v", "path", "Z", "x", "secure", "q", "httpOnly", "w", "persistent", "p", "hostOnly", "<init>", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;ZZZZ)V", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes5.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final String name;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final String value;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final long expiresAt;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final String domain;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @d5.d
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
    private static final Pattern f31478j = Pattern.compile(ProtectedSandApp.s("暅"));

    /* renamed from: k, reason: collision with root package name */
    private static final Pattern f31479k = Pattern.compile(ProtectedSandApp.s("暆"));

    /* renamed from: l, reason: collision with root package name */
    private static final Pattern f31480l = Pattern.compile(ProtectedSandApp.s("暇"));

    /* renamed from: m, reason: collision with root package name */
    private static final Pattern f31481m = Pattern.compile(ProtectedSandApp.s("暈"));

    /* compiled from: Cookie.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u000e\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0002J\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0002J\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000bJ\u000e\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0002J\u0006\u0010\u0012\u001a\u00020\u0000J\u0006\u0010\u0013\u001a\u00020\u0000J\u0006\u0010\u0015\u001a\u00020\u0014R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0016R\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0017R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0016R\u0016\u0010\u0010\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0016R\u0016\u0010\u0019\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0018R\u0016\u0010\u001a\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u0018R\u0016\u0010\u001b\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0018R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0018¨\u0006\u001e"}, d2 = {"Lokhttp3/m$a;", "", "", "domain", "", "hostOnly", "c", "name", "g", "value", "j", "", "expiresAt", "d", "b", "e", "path", "h", "i", "f", "Lokhttp3/m;", "a", "Ljava/lang/String;", "J", "Z", "secure", "httpOnly", "persistent", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
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
        private long expiresAt = okhttp3.internal.http.c.f30944a;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private String path = ProtectedSandApp.s("晙");

        private final a c(String domain, boolean hostOnly) {
            String e6 = okhttp3.internal.a.e(domain);
            if (e6 == null) {
                throw new IllegalArgumentException(androidx.constraintlayout.motion.widget.g.a(ProtectedSandApp.s("晚"), domain));
            }
            this.domain = e6;
            this.hostOnly = hostOnly;
            return this;
        }

        @d5.d
        public final m a() {
            String str = this.name;
            if (str == null) {
                throw new NullPointerException(ProtectedSandApp.s("晝"));
            }
            String str2 = this.value;
            if (str2 == null) {
                throw new NullPointerException(ProtectedSandApp.s("晜"));
            }
            long j5 = this.expiresAt;
            String str3 = this.domain;
            if (str3 != null) {
                return new m(str, str2, j5, str3, this.path, this.secure, this.httpOnly, this.persistent, this.hostOnly, null);
            }
            throw new NullPointerException(ProtectedSandApp.s("晛"));
        }

        @d5.d
        public final a b(@d5.d String domain) {
            kotlin.jvm.internal.l0.p(domain, ProtectedSandApp.s("晞"));
            return c(domain, false);
        }

        @d5.d
        public final a d(long expiresAt) {
            if (expiresAt <= 0) {
                expiresAt = Long.MIN_VALUE;
            }
            if (expiresAt > okhttp3.internal.http.c.f30944a) {
                expiresAt = 253402300799999L;
            }
            this.expiresAt = expiresAt;
            this.persistent = true;
            return this;
        }

        @d5.d
        public final a e(@d5.d String domain) {
            kotlin.jvm.internal.l0.p(domain, ProtectedSandApp.s("晟"));
            return c(domain, true);
        }

        @d5.d
        public final a f() {
            this.httpOnly = true;
            return this;
        }

        @d5.d
        public final a g(@d5.d String name) {
            CharSequence C5;
            kotlin.jvm.internal.l0.p(name, ProtectedSandApp.s("晠"));
            C5 = kotlin.text.h0.C5(name);
            if (!kotlin.jvm.internal.l0.g(C5.toString(), name)) {
                throw new IllegalArgumentException(ProtectedSandApp.s("晡").toString());
            }
            this.name = name;
            return this;
        }

        @d5.d
        public final a h(@d5.d String path) {
            boolean s22;
            kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("晢"));
            s22 = kotlin.text.e0.s2(path, ProtectedSandApp.s("晣"), false, 2, null);
            if (!s22) {
                throw new IllegalArgumentException(ProtectedSandApp.s("晤").toString());
            }
            this.path = path;
            return this;
        }

        @d5.d
        public final a i() {
            this.secure = true;
            return this;
        }

        @d5.d
        public final a j(@d5.d String value) {
            CharSequence C5;
            kotlin.jvm.internal.l0.p(value, ProtectedSandApp.s("晥"));
            C5 = kotlin.text.h0.C5(value);
            if (!kotlin.jvm.internal.l0.g(C5.toString(), value)) {
                throw new IllegalArgumentException(ProtectedSandApp.s("晦").toString());
            }
            this.value = value;
            return this;
        }
    }

    /* compiled from: Cookie.kt */
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b'\u0010(J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002J\u0018\u0010\n\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0002H\u0002J \u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0002J(\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0005H\u0002J\u0010\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u0002H\u0002J\u0010\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002H\u0002J\u001a\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0002H\u0007J)\u0010\u001a\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u001e\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00170\u001e2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u001cH\u0007R\u001c\u0010\"\u001a\n !*\u0004\u0018\u00010 0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u001c\u0010$\u001a\n !*\u0004\u0018\u00010 0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010#R\u001c\u0010%\u001a\n !*\u0004\u0018\u00010 0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010#R\u001c\u0010&\u001a\n !*\u0004\u0018\u00010 0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010#¨\u0006)"}, d2 = {"Lokhttp3/m$b;", "", "", "urlHost", "domain", "", "d", "Lokhttp3/w;", "url", "path", "k", "s", "", "pos", "limit", "", "i", "input", "invert", "c", "j", "h", "setCookie", "Lokhttp3/m;", "e", "currentTimeMillis", "f", "(JLokhttp3/w;Ljava/lang/String;)Lokhttp3/m;", "Lokhttp3/v;", "headers", "", "g", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "DAY_OF_MONTH_PATTERN", "Ljava/util/regex/Pattern;", "MONTH_PATTERN", "TIME_PATTERN", "YEAR_PATTERN", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
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
            boolean J1;
            if (kotlin.jvm.internal.l0.g(urlHost, domain)) {
                return true;
            }
            J1 = kotlin.text.e0.J1(urlHost, domain, false, 2, null);
            return J1 && urlHost.charAt((urlHost.length() - domain.length()) - 1) == '.' && !okhttp3.internal.d.h(urlHost);
        }

        private final String h(String s5) {
            boolean J1;
            String a42;
            String s6 = ProtectedSandApp.s("晧");
            J1 = kotlin.text.e0.J1(s5, s6, false, 2, null);
            if (!(!J1)) {
                throw new IllegalArgumentException(ProtectedSandApp.s("晨").toString());
            }
            a42 = kotlin.text.h0.a4(s5, s6);
            String e6 = okhttp3.internal.a.e(a42);
            if (e6 != null) {
                return e6;
            }
            throw new IllegalArgumentException();
        }

        private final long i(String s5, int pos, int limit) {
            int p32;
            int c6 = c(s5, pos, limit, false);
            Matcher matcher = m.f31481m.matcher(s5);
            int i5 = -1;
            int i6 = -1;
            int i7 = -1;
            int i8 = -1;
            int i9 = -1;
            int i10 = -1;
            while (c6 < limit) {
                int c7 = c(s5, c6 + 1, limit, true);
                matcher.region(c6, c7);
                String s6 = ProtectedSandApp.s("晩");
                if (i6 == -1 && matcher.usePattern(m.f31481m).matches()) {
                    String group = matcher.group(1);
                    kotlin.jvm.internal.l0.o(group, s6);
                    i6 = Integer.parseInt(group);
                    String group2 = matcher.group(2);
                    kotlin.jvm.internal.l0.o(group2, ProtectedSandApp.s("晪"));
                    i9 = Integer.parseInt(group2);
                    String group3 = matcher.group(3);
                    kotlin.jvm.internal.l0.o(group3, ProtectedSandApp.s("晫"));
                    i10 = Integer.parseInt(group3);
                } else if (i7 == -1 && matcher.usePattern(m.f31480l).matches()) {
                    String group4 = matcher.group(1);
                    kotlin.jvm.internal.l0.o(group4, s6);
                    i7 = Integer.parseInt(group4);
                } else if (i8 == -1 && matcher.usePattern(m.f31479k).matches()) {
                    String group5 = matcher.group(1);
                    kotlin.jvm.internal.l0.o(group5, s6);
                    Locale locale = Locale.US;
                    kotlin.jvm.internal.l0.o(locale, ProtectedSandApp.s("晬"));
                    if (group5 == null) {
                        throw new NullPointerException(ProtectedSandApp.s("景"));
                    }
                    String lowerCase = group5.toLowerCase(locale);
                    kotlin.jvm.internal.l0.o(lowerCase, ProtectedSandApp.s("晭"));
                    String pattern = m.f31479k.pattern();
                    kotlin.jvm.internal.l0.o(pattern, ProtectedSandApp.s("普"));
                    p32 = kotlin.text.h0.p3(pattern, lowerCase, 0, false, 6, null);
                    i8 = p32 / 4;
                } else if (i5 == -1 && matcher.usePattern(m.f31478j).matches()) {
                    String group6 = matcher.group(1);
                    kotlin.jvm.internal.l0.o(group6, s6);
                    i5 = Integer.parseInt(group6);
                }
                c6 = c(s5, c7 + 1, limit, false);
            }
            if (70 <= i5 && 99 >= i5) {
                i5 += 1900;
            }
            if (i5 >= 0 && 69 >= i5) {
                i5 += 2000;
            }
            boolean z5 = i5 >= 1601;
            String s7 = ProtectedSandApp.s("晰");
            if (!z5) {
                throw new IllegalArgumentException(s7.toString());
            }
            if (!(i8 != -1)) {
                throw new IllegalArgumentException(s7.toString());
            }
            if (!(1 <= i7 && 31 >= i7)) {
                throw new IllegalArgumentException(s7.toString());
            }
            if (!(i6 >= 0 && 23 >= i6)) {
                throw new IllegalArgumentException(s7.toString());
            }
            if (!(i9 >= 0 && 59 >= i9)) {
                throw new IllegalArgumentException(s7.toString());
            }
            if (!(i10 >= 0 && 59 >= i10)) {
                throw new IllegalArgumentException(s7.toString());
            }
            GregorianCalendar gregorianCalendar = new GregorianCalendar(okhttp3.internal.d.f30934f);
            gregorianCalendar.setLenient(false);
            gregorianCalendar.set(1, i5);
            gregorianCalendar.set(2, i8 - 1);
            gregorianCalendar.set(5, i7);
            gregorianCalendar.set(11, i6);
            gregorianCalendar.set(12, i9);
            gregorianCalendar.set(13, i10);
            gregorianCalendar.set(14, 0);
            return gregorianCalendar.getTimeInMillis();
        }

        private final long j(String s5) {
            boolean s22;
            try {
                long parseLong = Long.parseLong(s5);
                if (parseLong <= 0) {
                    return Long.MIN_VALUE;
                }
                return parseLong;
            } catch (NumberFormatException e6) {
                if (!new Regex(ProtectedSandApp.s("晱")).k(s5)) {
                    throw e6;
                }
                s22 = kotlin.text.e0.s2(s5, ProtectedSandApp.s("晲"), false, 2, null);
                return s22 ? Long.MIN_VALUE : Long.MAX_VALUE;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean k(w url, String path) {
            boolean s22;
            boolean J1;
            String x5 = url.x();
            if (kotlin.jvm.internal.l0.g(x5, path)) {
                return true;
            }
            s22 = kotlin.text.e0.s2(x5, path, false, 2, null);
            if (s22) {
                J1 = kotlin.text.e0.J1(path, ProtectedSandApp.s("晳"), false, 2, null);
                if (J1 || x5.charAt(path.length()) == '/') {
                    return true;
                }
            }
            return false;
        }

        @d5.e
        @p3.n
        public final m e(@d5.d w url, @d5.d String setCookie) {
            kotlin.jvm.internal.l0.p(url, ProtectedSandApp.s("晴"));
            kotlin.jvm.internal.l0.p(setCookie, ProtectedSandApp.s("晵"));
            return f(System.currentTimeMillis(), url, setCookie);
        }

        /* JADX WARN: Code restructure failed: missing block: B:88:0x0123, code lost:
        
            if (r1 > okhttp3.internal.http.c.f30944a) goto L59;
         */
        /* JADX WARN: Removed duplicated region for block: B:56:0x0135  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x014a  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x0166  */
        /* JADX WARN: Removed duplicated region for block: B:71:0x0182  */
        /* JADX WARN: Removed duplicated region for block: B:76:0x0137  */
        @d5.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final okhttp3.m f(long r26, @d5.d okhttp3.w r28, @d5.d java.lang.String r29) {
            /*
                Method dump skipped, instructions count: 427
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.m.Companion.f(long, okhttp3.w, java.lang.String):okhttp3.m");
        }

        @d5.d
        @p3.n
        public final List<m> g(@d5.d w url, @d5.d v headers) {
            kotlin.jvm.internal.l0.p(url, ProtectedSandApp.s("暁"));
            kotlin.jvm.internal.l0.p(headers, ProtectedSandApp.s("暂"));
            List<String> y5 = headers.y(ProtectedSandApp.s("暃"));
            int size = y5.size();
            ArrayList arrayList = null;
            for (int i5 = 0; i5 < size; i5++) {
                m e6 = e(url, y5.get(i5));
                if (e6 != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(e6);
                }
            }
            if (arrayList == null) {
                return EmptyList.f23167o;
            }
            List<m> unmodifiableList = Collections.unmodifiableList(arrayList);
            kotlin.jvm.internal.l0.o(unmodifiableList, ProtectedSandApp.s("暄"));
            return unmodifiableList;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.w wVar) {
            this();
        }
    }

    private m(String str, String str2, long j5, String str3, String str4, boolean z5, boolean z6, boolean z7, boolean z8) {
        this.name = str;
        this.value = str2;
        this.expiresAt = j5;
        this.domain = str3;
        this.path = str4;
        this.secure = z5;
        this.httpOnly = z6;
        this.persistent = z7;
        this.hostOnly = z8;
    }

    @d5.e
    @p3.n
    public static final m t(@d5.d w wVar, @d5.d String str) {
        return INSTANCE.e(wVar, str);
    }

    @d5.d
    @p3.n
    public static final List<m> u(@d5.d w wVar, @d5.d v vVar) {
        return INSTANCE.g(wVar, vVar);
    }

    @p3.i(name = "-deprecated_domain")
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "domain", imports = {}))
    @d5.d
    /* renamed from: a, reason: from getter */
    public final String getDomain() {
        return this.domain;
    }

    @p3.i(name = "-deprecated_expiresAt")
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "expiresAt", imports = {}))
    /* renamed from: b, reason: from getter */
    public final long getExpiresAt() {
        return this.expiresAt;
    }

    @p3.i(name = "-deprecated_hostOnly")
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "hostOnly", imports = {}))
    /* renamed from: c, reason: from getter */
    public final boolean getHostOnly() {
        return this.hostOnly;
    }

    @p3.i(name = "-deprecated_httpOnly")
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "httpOnly", imports = {}))
    /* renamed from: d, reason: from getter */
    public final boolean getHttpOnly() {
        return this.httpOnly;
    }

    @p3.i(name = "-deprecated_name")
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "name", imports = {}))
    @d5.d
    /* renamed from: e, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public boolean equals(@d5.e Object other) {
        if (other instanceof m) {
            m mVar = (m) other;
            if (kotlin.jvm.internal.l0.g(mVar.name, this.name) && kotlin.jvm.internal.l0.g(mVar.value, this.value) && mVar.expiresAt == this.expiresAt && kotlin.jvm.internal.l0.g(mVar.domain, this.domain) && kotlin.jvm.internal.l0.g(mVar.path, this.path) && mVar.secure == this.secure && mVar.httpOnly == this.httpOnly && mVar.persistent == this.persistent && mVar.hostOnly == this.hostOnly) {
                return true;
            }
        }
        return false;
    }

    @p3.i(name = "-deprecated_path")
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "path", imports = {}))
    @d5.d
    /* renamed from: f, reason: from getter */
    public final String getPath() {
        return this.path;
    }

    @p3.i(name = "-deprecated_persistent")
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "persistent", imports = {}))
    /* renamed from: g, reason: from getter */
    public final boolean getPersistent() {
        return this.persistent;
    }

    @p3.i(name = "-deprecated_secure")
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "secure", imports = {}))
    /* renamed from: h, reason: from getter */
    public final boolean getSecure() {
        return this.secure;
    }

    @IgnoreJRERequirement
    public int hashCode() {
        return Boolean.hashCode(this.hostOnly) + ((Boolean.hashCode(this.persistent) + ((Boolean.hashCode(this.httpOnly) + ((Boolean.hashCode(this.secure) + ((this.path.hashCode() + ((this.domain.hashCode() + ((Long.hashCode(this.expiresAt) + ((this.value.hashCode() + ((this.name.hashCode() + 527) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    @p3.i(name = "-deprecated_value")
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "value", imports = {}))
    @d5.d
    /* renamed from: i, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    @p3.i(name = "domain")
    @d5.d
    public final String n() {
        return this.domain;
    }

    @p3.i(name = "expiresAt")
    public final long o() {
        return this.expiresAt;
    }

    @p3.i(name = "hostOnly")
    public final boolean p() {
        return this.hostOnly;
    }

    @p3.i(name = "httpOnly")
    public final boolean q() {
        return this.httpOnly;
    }

    public final boolean r(@d5.d w url) {
        kotlin.jvm.internal.l0.p(url, ProtectedSandApp.s("暉"));
        if ((this.hostOnly ? kotlin.jvm.internal.l0.g(url.getHost(), this.domain) : INSTANCE.d(url.getHost(), this.domain)) && INSTANCE.k(url, this.path)) {
            return !this.secure || url.getIsHttps();
        }
        return false;
    }

    @p3.i(name = "name")
    @d5.d
    public final String s() {
        return this.name;
    }

    @d5.d
    public String toString() {
        return y(false);
    }

    @p3.i(name = "path")
    @d5.d
    public final String v() {
        return this.path;
    }

    @p3.i(name = "persistent")
    public final boolean w() {
        return this.persistent;
    }

    @p3.i(name = "secure")
    public final boolean x() {
        return this.secure;
    }

    @d5.d
    public final String y(boolean forObsoleteRfc2965) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.name);
        sb.append('=');
        sb.append(this.value);
        if (this.persistent) {
            if (this.expiresAt == Long.MIN_VALUE) {
                sb.append(ProtectedSandApp.s("暊"));
            } else {
                sb.append(ProtectedSandApp.s("暋"));
                sb.append(okhttp3.internal.http.c.b(new Date(this.expiresAt)));
            }
        }
        if (!this.hostOnly) {
            sb.append(ProtectedSandApp.s("暌"));
            if (forObsoleteRfc2965) {
                sb.append(ProtectedSandApp.s("暍"));
            }
            sb.append(this.domain);
        }
        sb.append(ProtectedSandApp.s("暎"));
        sb.append(this.path);
        if (this.secure) {
            sb.append(ProtectedSandApp.s("暏"));
        }
        if (this.httpOnly) {
            sb.append(ProtectedSandApp.s("暐"));
        }
        String sb2 = sb.toString();
        kotlin.jvm.internal.l0.o(sb2, ProtectedSandApp.s("暑"));
        return sb2;
    }

    @p3.i(name = "value")
    @d5.d
    public final String z() {
        return this.value;
    }

    public /* synthetic */ m(String str, String str2, long j5, String str3, String str4, boolean z5, boolean z6, boolean z7, boolean z8, kotlin.jvm.internal.w wVar) {
        this(str, str2, j5, str3, str4, z5, z6, z7, z8);
    }
}
