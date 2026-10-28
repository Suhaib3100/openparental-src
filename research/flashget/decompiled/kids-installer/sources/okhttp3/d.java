package okhttp3;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.concurrent.TimeUnit;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;

/* compiled from: CacheControl.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b \u0018\u0000 $2\u00020\u0001:\u0002\u000f\u0007Bs\b\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\u0006\u0010\u0019\u001a\u00020\u0006\u0012\u0006\u0010\u001b\u001a\u00020\u0006\u0012\u0006\u0010\u001d\u001a\u00020\u0002\u0012\u0006\u0010\u001f\u001a\u00020\u0002\u0012\u0006\u0010!\u001a\u00020\u0002\u0012\u0006\u0010#\u001a\u00020\u0006\u0012\u0006\u0010%\u001a\u00020\u0006\u0012\u0006\u0010'\u001a\u00020\u0002\u0012\u0006\u0010*\u001a\u00020\u0002\u0012\u0006\u0010+\u001a\u00020\u0002\u0012\b\u0010-\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b.\u0010/J\u000f\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\bJ\u000f\u0010\f\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\f\u0010\bJ\u000f\u0010\r\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\r\u0010\u0004J\u000f\u0010\u000e\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u000e\u0010\u0004J\u000f\u0010\u000f\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u000f\u0010\u0004J\b\u0010\u0011\u001a\u00020\u0010H\u0016R\u0017\u0010\u0014\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u000f\u0010\u0012\u001a\u0004\b\u0013\u0010\u0004R\u0017\u0010\u0016\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0015\u0010\u0004R\u0017\u0010\u0019\u001a\u00020\u00068\u0007¢\u0006\f\n\u0004\b\u000b\u0010\u0017\u001a\u0004\b\u0018\u0010\bR\u0017\u0010\u001b\u001a\u00020\u00068\u0007¢\u0006\f\n\u0004\b\f\u0010\u0017\u001a\u0004\b\u001a\u0010\bR\u0017\u0010\u001d\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0012\u001a\u0004\b\u001c\u0010\u0004R\u0017\u0010\u001f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u001e\u0010\u0004R\u0017\u0010!\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b \u0010\u0004R\u0017\u0010#\u001a\u00020\u00068\u0007¢\u0006\f\n\u0004\b\u000e\u0010\u0017\u001a\u0004\b\"\u0010\bR\u0017\u0010%\u001a\u00020\u00068\u0007¢\u0006\f\n\u0004\b\r\u0010\u0017\u001a\u0004\b$\u0010\bR\u0017\u0010'\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\t\u0010\u0012\u001a\u0004\b&\u0010\u0004R\u0017\u0010*\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b(\u0010\u0012\u001a\u0004\b)\u0010\u0004R\u0017\u0010+\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u001c\u0010\u0012\u001a\u0004\b(\u0010\u0004R\u0018\u0010-\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010,¨\u00060"}, d2 = {"Lokhttp3/d;", "", "", "f", "()Z", "g", "", "b", "()I", "j", "e", "c", "d", "i", "h", "a", "", "toString", "Z", "r", "noCache", "s", "noStore", "I", "n", "maxAgeSeconds", "w", "sMaxAgeSeconds", "l", "isPrivate", "m", "isPublic", "q", "mustRevalidate", "o", "maxStaleSeconds", "p", "minFreshSeconds", "u", "onlyIfCached", "k", "t", "noTransform", "immutable", "Ljava/lang/String;", "headerValue", "<init>", "(ZZIIZZZIIZZZLjava/lang/String;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean noCache;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean noStore;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int maxAgeSeconds;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int sMaxAgeSeconds;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final boolean isPrivate;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final boolean isPublic;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final boolean mustRevalidate;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final int maxStaleSeconds;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final int minFreshSeconds;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final boolean onlyIfCached;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final boolean noTransform;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final boolean immutable;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private String headerValue;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: n, reason: collision with root package name */
    @d5.d
    @p3.f
    public static final d f30548n = new a().g().a();

    /* renamed from: o, reason: collision with root package name */
    @d5.d
    @p3.f
    public static final d f30549o = new a().j().e(Integer.MAX_VALUE, TimeUnit.SECONDS).a();

    /* compiled from: CacheControl.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001f\u0010 J\f\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0002J\u0006\u0010\u0005\u001a\u00020\u0000J\u0006\u0010\u0006\u001a\u00020\u0000J\u0016\u0010\n\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\bJ\u0016\u0010\f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\bJ\u0016\u0010\u000e\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\bJ\u0006\u0010\u000f\u001a\u00020\u0000J\u0006\u0010\u0010\u001a\u00020\u0000J\u0006\u0010\u0011\u001a\u00020\u0000J\u0006\u0010\u0013\u001a\u00020\u0012R\u0016\u0010\u0016\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0015R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u0015R\u0016\u0010\u0019\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0018R\u0016\u0010\u001a\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0018R\u0016\u0010\u001b\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u0018R\u0016\u0010\u001c\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0015R\u0016\u0010\u001d\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0015R\u0016\u0010\u001e\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0015¨\u0006!"}, d2 = {"Lokhttp3/d$a;", "", "", "", "b", "g", "h", "maxAge", "Ljava/util/concurrent/TimeUnit;", "timeUnit", "d", "maxStale", "e", "minFresh", "f", "j", "i", "c", "Lokhttp3/d;", "a", "", "Z", "noCache", "noStore", "I", "maxAgeSeconds", "maxStaleSeconds", "minFreshSeconds", "onlyIfCached", "noTransform", "immutable", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    public static final class a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private boolean noCache;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private boolean noStore;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private int maxAgeSeconds = -1;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private int maxStaleSeconds = -1;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private int minFreshSeconds = -1;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private boolean onlyIfCached;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        private boolean noTransform;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata */
        private boolean immutable;

        private final int b(long j5) {
            if (j5 > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            return (int) j5;
        }

        @d5.d
        public final d a() {
            return new d(this.noCache, this.noStore, this.maxAgeSeconds, -1, false, false, false, this.maxStaleSeconds, this.minFreshSeconds, this.onlyIfCached, this.noTransform, this.immutable, null, null);
        }

        @d5.d
        public final a c() {
            this.immutable = true;
            return this;
        }

        @d5.d
        public final a d(int maxAge, @d5.d TimeUnit timeUnit) {
            kotlin.jvm.internal.l0.p(timeUnit, ProtectedSandApp.s("彖"));
            if (!(maxAge >= 0)) {
                throw new IllegalArgumentException(androidx.appcompat.view.menu.s.a(ProtectedSandApp.s("彗"), maxAge).toString());
            }
            this.maxAgeSeconds = b(timeUnit.toSeconds(maxAge));
            return this;
        }

        @d5.d
        public final a e(int maxStale, @d5.d TimeUnit timeUnit) {
            kotlin.jvm.internal.l0.p(timeUnit, ProtectedSandApp.s("彘"));
            if (!(maxStale >= 0)) {
                throw new IllegalArgumentException(androidx.appcompat.view.menu.s.a(ProtectedSandApp.s("彙"), maxStale).toString());
            }
            this.maxStaleSeconds = b(timeUnit.toSeconds(maxStale));
            return this;
        }

        @d5.d
        public final a f(int minFresh, @d5.d TimeUnit timeUnit) {
            kotlin.jvm.internal.l0.p(timeUnit, ProtectedSandApp.s("彚"));
            if (!(minFresh >= 0)) {
                throw new IllegalArgumentException(androidx.appcompat.view.menu.s.a(ProtectedSandApp.s("彛"), minFresh).toString());
            }
            this.minFreshSeconds = b(timeUnit.toSeconds(minFresh));
            return this;
        }

        @d5.d
        public final a g() {
            this.noCache = true;
            return this;
        }

        @d5.d
        public final a h() {
            this.noStore = true;
            return this;
        }

        @d5.d
        public final a i() {
            this.noTransform = true;
            return this;
        }

        @d5.d
        public final a j() {
            this.onlyIfCached = true;
            return this;
        }
    }

    /* compiled from: CacheControl.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001e\u0010\u0006\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0007R\u0014\u0010\u000b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\f¨\u0006\u0010"}, d2 = {"Lokhttp3/d$b;", "", "", "characters", "", "startIndex", "a", "Lokhttp3/v;", "headers", "Lokhttp3/d;", "c", "FORCE_CACHE", "Lokhttp3/d;", "FORCE_NETWORK", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: okhttp3.d$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        private final int a(String str, String str2, int i5) {
            boolean S2;
            int length = str.length();
            while (i5 < length) {
                S2 = kotlin.text.h0.S2(str2, str.charAt(i5), false, 2, null);
                if (S2) {
                    return i5;
                }
                i5++;
            }
            return str.length();
        }

        static /* synthetic */ int b(Companion companion, String str, String str2, int i5, int i6, Object obj) {
            if ((i6 & 2) != 0) {
                i5 = 0;
            }
            return companion.a(str, str2, i5);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0056  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x00fd  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0101  */
        @d5.d
        @p3.n
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final okhttp3.d c(@d5.d okhttp3.v r32) {
            /*
                Method dump skipped, instructions count: 482
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.d.Companion.c(okhttp3.v):okhttp3.d");
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.w wVar) {
            this();
        }
    }

    private d(boolean z5, boolean z6, int i5, int i6, boolean z7, boolean z8, boolean z9, int i7, int i8, boolean z10, boolean z11, boolean z12, String str) {
        this.noCache = z5;
        this.noStore = z6;
        this.maxAgeSeconds = i5;
        this.sMaxAgeSeconds = i6;
        this.isPrivate = z7;
        this.isPublic = z8;
        this.mustRevalidate = z9;
        this.maxStaleSeconds = i7;
        this.minFreshSeconds = i8;
        this.onlyIfCached = z10;
        this.noTransform = z11;
        this.immutable = z12;
        this.headerValue = str;
    }

    @d5.d
    @p3.n
    public static final d v(@d5.d v vVar) {
        return INSTANCE.c(vVar);
    }

    @p3.i(name = "-deprecated_immutable")
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "immutable", imports = {}))
    /* renamed from: a, reason: from getter */
    public final boolean getImmutable() {
        return this.immutable;
    }

    @p3.i(name = "-deprecated_maxAgeSeconds")
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "maxAgeSeconds", imports = {}))
    /* renamed from: b, reason: from getter */
    public final int getMaxAgeSeconds() {
        return this.maxAgeSeconds;
    }

    @p3.i(name = "-deprecated_maxStaleSeconds")
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "maxStaleSeconds", imports = {}))
    /* renamed from: c, reason: from getter */
    public final int getMaxStaleSeconds() {
        return this.maxStaleSeconds;
    }

    @p3.i(name = "-deprecated_minFreshSeconds")
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "minFreshSeconds", imports = {}))
    /* renamed from: d, reason: from getter */
    public final int getMinFreshSeconds() {
        return this.minFreshSeconds;
    }

    @p3.i(name = "-deprecated_mustRevalidate")
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "mustRevalidate", imports = {}))
    /* renamed from: e, reason: from getter */
    public final boolean getMustRevalidate() {
        return this.mustRevalidate;
    }

    @p3.i(name = "-deprecated_noCache")
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "noCache", imports = {}))
    /* renamed from: f, reason: from getter */
    public final boolean getNoCache() {
        return this.noCache;
    }

    @p3.i(name = "-deprecated_noStore")
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "noStore", imports = {}))
    /* renamed from: g, reason: from getter */
    public final boolean getNoStore() {
        return this.noStore;
    }

    @p3.i(name = "-deprecated_noTransform")
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "noTransform", imports = {}))
    /* renamed from: h, reason: from getter */
    public final boolean getNoTransform() {
        return this.noTransform;
    }

    @p3.i(name = "-deprecated_onlyIfCached")
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "onlyIfCached", imports = {}))
    /* renamed from: i, reason: from getter */
    public final boolean getOnlyIfCached() {
        return this.onlyIfCached;
    }

    @p3.i(name = "-deprecated_sMaxAgeSeconds")
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "sMaxAgeSeconds", imports = {}))
    /* renamed from: j, reason: from getter */
    public final int getSMaxAgeSeconds() {
        return this.sMaxAgeSeconds;
    }

    @p3.i(name = "immutable")
    public final boolean k() {
        return this.immutable;
    }

    /* renamed from: l, reason: from getter */
    public final boolean getIsPrivate() {
        return this.isPrivate;
    }

    /* renamed from: m, reason: from getter */
    public final boolean getIsPublic() {
        return this.isPublic;
    }

    @p3.i(name = "maxAgeSeconds")
    public final int n() {
        return this.maxAgeSeconds;
    }

    @p3.i(name = "maxStaleSeconds")
    public final int o() {
        return this.maxStaleSeconds;
    }

    @p3.i(name = "minFreshSeconds")
    public final int p() {
        return this.minFreshSeconds;
    }

    @p3.i(name = "mustRevalidate")
    public final boolean q() {
        return this.mustRevalidate;
    }

    @p3.i(name = "noCache")
    public final boolean r() {
        return this.noCache;
    }

    @p3.i(name = "noStore")
    public final boolean s() {
        return this.noStore;
    }

    @p3.i(name = "noTransform")
    public final boolean t() {
        return this.noTransform;
    }

    @d5.d
    public String toString() {
        String str = this.headerValue;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        if (this.noCache) {
            sb.append(ProtectedSandApp.s("彽"));
        }
        if (this.noStore) {
            sb.append(ProtectedSandApp.s("彾"));
        }
        int i5 = this.maxAgeSeconds;
        String s5 = ProtectedSandApp.s("彿");
        if (i5 != -1) {
            sb.append(ProtectedSandApp.s("往"));
            sb.append(this.maxAgeSeconds);
            sb.append(s5);
        }
        if (this.sMaxAgeSeconds != -1) {
            sb.append(ProtectedSandApp.s("征"));
            sb.append(this.sMaxAgeSeconds);
            sb.append(s5);
        }
        if (this.isPrivate) {
            sb.append(ProtectedSandApp.s("徂"));
        }
        if (this.isPublic) {
            sb.append(ProtectedSandApp.s("徃"));
        }
        if (this.mustRevalidate) {
            sb.append(ProtectedSandApp.s("径"));
        }
        if (this.maxStaleSeconds != -1) {
            sb.append(ProtectedSandApp.s("待"));
            sb.append(this.maxStaleSeconds);
            sb.append(s5);
        }
        if (this.minFreshSeconds != -1) {
            sb.append(ProtectedSandApp.s("徆"));
            sb.append(this.minFreshSeconds);
            sb.append(s5);
        }
        if (this.onlyIfCached) {
            sb.append(ProtectedSandApp.s("徇"));
        }
        if (this.noTransform) {
            sb.append(ProtectedSandApp.s("很"));
        }
        if (this.immutable) {
            sb.append(ProtectedSandApp.s("徉"));
        }
        if (sb.length() == 0) {
            return "";
        }
        sb.delete(sb.length() - 2, sb.length());
        String sb2 = sb.toString();
        kotlin.jvm.internal.l0.o(sb2, ProtectedSandApp.s("徊"));
        this.headerValue = sb2;
        return sb2;
    }

    @p3.i(name = "onlyIfCached")
    public final boolean u() {
        return this.onlyIfCached;
    }

    @p3.i(name = "sMaxAgeSeconds")
    public final int w() {
        return this.sMaxAgeSeconds;
    }

    public /* synthetic */ d(boolean z5, boolean z6, int i5, int i6, boolean z7, boolean z8, boolean z9, int i7, int i8, boolean z10, boolean z11, boolean z12, String str, kotlin.jvm.internal.w wVar) {
        this(z5, z6, i5, i6, z7, z8, z9, i7, i8, z10, z11, z12, str);
    }
}
