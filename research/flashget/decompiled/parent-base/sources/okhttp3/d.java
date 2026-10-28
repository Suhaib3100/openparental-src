package okhttp3;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.x0;

/* compiled from: CacheControl.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b!\u0018\u0000 ,2\u00020\u0001:\u0002\u001f\u0017Bs\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0016\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0019\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u001a\u0010\u0015J\u000f\u0010\u001b\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u001b\u0010\u0018J\u000f\u0010\u001c\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u001c\u0010\u0018J\u000f\u0010\u001d\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u001d\u0010\u0015J\u000f\u0010\u001e\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u001e\u0010\u0015J\u000f\u0010\u001f\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u001f\u0010\u0015J\u000f\u0010 \u001a\u00020\u0010H\u0016¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u001f\u0010\"\u001a\u0004\b#\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0017\u0010\"\u001a\u0004\b$\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00058\u0007¢\u0006\f\n\u0004\b\u001b\u0010%\u001a\u0004\b&\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00058\u0007¢\u0006\f\n\u0004\b\u001c\u0010%\u001a\u0004\b'\u0010\u0018R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\"\u001a\u0004\b(\u0010\u0015R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\"\u001a\u0004\b)\u0010\u0015R\u0017\u0010\n\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0016\u0010\"\u001a\u0004\b*\u0010\u0015R\u0017\u0010\u000b\u001a\u00020\u00058\u0007¢\u0006\f\n\u0004\b\u001e\u0010%\u001a\u0004\b+\u0010\u0018R\u0017\u0010\f\u001a\u00020\u00058\u0007¢\u0006\f\n\u0004\b\u001d\u0010%\u001a\u0004\b,\u0010\u0018R\u0017\u0010\r\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0019\u0010\"\u001a\u0004\b-\u0010\u0015R\u0017\u0010\u000e\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b.\u0010\"\u001a\u0004\b/\u0010\u0015R\u0017\u0010\u000f\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b(\u0010\"\u001a\u0004\b.\u0010\u0015R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u00100¨\u00061"}, d2 = {"Lokhttp3/d;", "", "", "noCache", "noStore", "", "maxAgeSeconds", "sMaxAgeSeconds", "isPrivate", "isPublic", "mustRevalidate", "maxStaleSeconds", "minFreshSeconds", "onlyIfCached", "noTransform", "immutable", "", "headerValue", "<init>", "(ZZIIZZZIIZZZLjava/lang/String;)V", "f", "()Z", "g", "b", "()I", "j", "e", "c", "d", "i", "h", "a", "toString", "()Ljava/lang/String;", "Z", "r", "s", "I", "n", "w", "l", "m", "q", "o", "p", "u", "k", "t", "Ljava/lang/String;", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes7.dex */
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
    @fg.l
    @kd.f
    public static final d f84055n = new a().g().a();

    /* renamed from: o, reason: collision with root package name */
    @fg.l
    @kd.f
    public static final d f84056o = new a().j().e(Integer.MAX_VALUE, TimeUnit.SECONDS).a();

    /* compiled from: CacheControl.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\b\u001a\u00020\u0000¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0000¢\u0006\u0004\b\n\u0010\tJ\u001d\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u000fJ\u001d\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0013\u0010\u000fJ\r\u0010\u0014\u001a\u00020\u0000¢\u0006\u0004\b\u0014\u0010\tJ\r\u0010\u0015\u001a\u00020\u0000¢\u0006\u0004\b\u0015\u0010\tJ\r\u0010\u0016\u001a\u00020\u0000¢\u0006\u0004\b\u0016\u0010\tJ\r\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001c\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u001bR\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u001bR\u0016\u0010\u001f\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u001eR\u0016\u0010 \u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u001eR\u0016\u0010!\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u001eR\u0016\u0010\"\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u001bR\u0016\u0010#\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u001bR\u0016\u0010$\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u001b¨\u0006%"}, d2 = {"Lokhttp3/d$a;", "", "<init>", "()V", "", "", "b", "(J)I", "g", "()Lokhttp3/d$a;", "h", "maxAge", "Ljava/util/concurrent/TimeUnit;", "timeUnit", "d", "(ILjava/util/concurrent/TimeUnit;)Lokhttp3/d$a;", "maxStale", "e", "minFresh", "f", "j", "i", "c", "Lokhttp3/d;", "a", "()Lokhttp3/d;", "", "Z", "noCache", "noStore", "I", "maxAgeSeconds", "maxStaleSeconds", "minFreshSeconds", "onlyIfCached", "noTransform", "immutable", "okhttp"}, k = 1, mv = {1, 4, 0})
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

        private final int b(long j4) {
            if (j4 > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            return (int) j4;
        }

        @fg.l
        public final d a() {
            return new d(this.noCache, this.noStore, this.maxAgeSeconds, -1, false, false, false, this.maxStaleSeconds, this.minFreshSeconds, this.onlyIfCached, this.noTransform, this.immutable, null, null);
        }

        @fg.l
        public final a c() {
            this.immutable = true;
            return this;
        }

        @fg.l
        public final a d(int maxAge, @fg.l TimeUnit timeUnit) {
            l0.p(timeUnit, ProtectedSandApp.s("麗\u0001"));
            if (!(maxAge >= 0)) {
                throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("麘\u0001"), maxAge).toString());
            }
            this.maxAgeSeconds = b(timeUnit.toSeconds(maxAge));
            return this;
        }

        @fg.l
        public final a e(int maxStale, @fg.l TimeUnit timeUnit) {
            l0.p(timeUnit, ProtectedSandApp.s("麗\u0001"));
            if (!(maxStale >= 0)) {
                throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("麙\u0001"), maxStale).toString());
            }
            this.maxStaleSeconds = b(timeUnit.toSeconds(maxStale));
            return this;
        }

        @fg.l
        public final a f(int minFresh, @fg.l TimeUnit timeUnit) {
            l0.p(timeUnit, ProtectedSandApp.s("麗\u0001"));
            if (!(minFresh >= 0)) {
                throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("麚\u0001"), minFresh).toString());
            }
            this.minFreshSeconds = b(timeUnit.toSeconds(minFresh));
            return this;
        }

        @fg.l
        public final a g() {
            this.noCache = true;
            return this;
        }

        @fg.l
        public final a h() {
            this.noStore = true;
            return this;
        }

        @fg.l
        public final a i() {
            this.noTransform = true;
            return this;
        }

        @fg.l
        public final a j() {
            this.onlyIfCached = true;
            return this;
        }
    }

    /* compiled from: CacheControl.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\b\u001a\u00020\u0006*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010¨\u0006\u0012"}, d2 = {"Lokhttp3/d$b;", "", "<init>", "()V", "", "characters", "", "startIndex", "a", "(Ljava/lang/String;Ljava/lang/String;I)I", "Lokhttp3/u;", "headers", "Lokhttp3/d;", "c", "(Lokhttp3/u;)Lokhttp3/d;", "FORCE_CACHE", "Lokhttp3/d;", "FORCE_NETWORK", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: okhttp3.d$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        private final int a(String str, String str2, int i4) {
            int length = str.length();
            while (i4 < length) {
                if (kotlin.text.v.S2(str2, str.charAt(i4), false, 2, null)) {
                    return i4;
                }
                i4++;
            }
            return str.length();
        }

        static /* synthetic */ int b(Companion companion, String str, String str2, int i4, int i5, Object obj) {
            if ((i5 & 2) != 0) {
                i4 = 0;
            }
            return companion.a(str, str2, i4);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x005a  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0106  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x010a  */
        @fg.l
        @kd.n
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final okhttp3.d c(@fg.l okhttp3.u r32) {
            /*
                Method dump skipped, instructions count: 512
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.d.Companion.c(okhttp3.u):okhttp3.d");
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.w wVar) {
            this();
        }
    }

    private d(boolean z4, boolean z5, int i4, int i5, boolean z6, boolean z7, boolean z10, int i6, int i7, boolean z11, boolean z12, boolean z13, String str) {
        this.noCache = z4;
        this.noStore = z5;
        this.maxAgeSeconds = i4;
        this.sMaxAgeSeconds = i5;
        this.isPrivate = z6;
        this.isPublic = z7;
        this.mustRevalidate = z10;
        this.maxStaleSeconds = i6;
        this.minFreshSeconds = i7;
        this.onlyIfCached = z11;
        this.noTransform = z12;
        this.immutable = z13;
        this.headerValue = str;
    }

    @fg.l
    @kd.n
    public static final d v(@fg.l u uVar) {
        return INSTANCE.c(uVar);
    }

    @kotlin.k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @x0(expression = "immutable", imports = {}))
    @kd.i(name = "-deprecated_immutable")
    /* renamed from: a, reason: from getter */
    public final boolean getImmutable() {
        return this.immutable;
    }

    @kotlin.k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @x0(expression = "maxAgeSeconds", imports = {}))
    @kd.i(name = "-deprecated_maxAgeSeconds")
    /* renamed from: b, reason: from getter */
    public final int getMaxAgeSeconds() {
        return this.maxAgeSeconds;
    }

    @kotlin.k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @x0(expression = "maxStaleSeconds", imports = {}))
    @kd.i(name = "-deprecated_maxStaleSeconds")
    /* renamed from: c, reason: from getter */
    public final int getMaxStaleSeconds() {
        return this.maxStaleSeconds;
    }

    @kotlin.k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @x0(expression = "minFreshSeconds", imports = {}))
    @kd.i(name = "-deprecated_minFreshSeconds")
    /* renamed from: d, reason: from getter */
    public final int getMinFreshSeconds() {
        return this.minFreshSeconds;
    }

    @kotlin.k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @x0(expression = "mustRevalidate", imports = {}))
    @kd.i(name = "-deprecated_mustRevalidate")
    /* renamed from: e, reason: from getter */
    public final boolean getMustRevalidate() {
        return this.mustRevalidate;
    }

    @kotlin.k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @x0(expression = "noCache", imports = {}))
    @kd.i(name = "-deprecated_noCache")
    /* renamed from: f, reason: from getter */
    public final boolean getNoCache() {
        return this.noCache;
    }

    @kotlin.k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @x0(expression = "noStore", imports = {}))
    @kd.i(name = "-deprecated_noStore")
    /* renamed from: g, reason: from getter */
    public final boolean getNoStore() {
        return this.noStore;
    }

    @kotlin.k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @x0(expression = "noTransform", imports = {}))
    @kd.i(name = "-deprecated_noTransform")
    /* renamed from: h, reason: from getter */
    public final boolean getNoTransform() {
        return this.noTransform;
    }

    @kotlin.k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @x0(expression = "onlyIfCached", imports = {}))
    @kd.i(name = "-deprecated_onlyIfCached")
    /* renamed from: i, reason: from getter */
    public final boolean getOnlyIfCached() {
        return this.onlyIfCached;
    }

    @kotlin.k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @x0(expression = "sMaxAgeSeconds", imports = {}))
    @kd.i(name = "-deprecated_sMaxAgeSeconds")
    /* renamed from: j, reason: from getter */
    public final int getSMaxAgeSeconds() {
        return this.sMaxAgeSeconds;
    }

    @kd.i(name = "immutable")
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

    @kd.i(name = "maxAgeSeconds")
    public final int n() {
        return this.maxAgeSeconds;
    }

    @kd.i(name = "maxStaleSeconds")
    public final int o() {
        return this.maxStaleSeconds;
    }

    @kd.i(name = "minFreshSeconds")
    public final int p() {
        return this.minFreshSeconds;
    }

    @kd.i(name = "mustRevalidate")
    public final boolean q() {
        return this.mustRevalidate;
    }

    @kd.i(name = "noCache")
    public final boolean r() {
        return this.noCache;
    }

    @kd.i(name = "noStore")
    public final boolean s() {
        return this.noStore;
    }

    @kd.i(name = "noTransform")
    public final boolean t() {
        return this.noTransform;
    }

    @fg.l
    public String toString() {
        String str = this.headerValue;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        if (this.noCache) {
            sb.append(ProtectedSandApp.s("黗\u0001"));
        }
        if (this.noStore) {
            sb.append(ProtectedSandApp.s("默\u0001"));
        }
        int i4 = this.maxAgeSeconds;
        String s4 = ProtectedSandApp.s("黙\u0001");
        if (i4 != -1) {
            sb.append(ProtectedSandApp.s("黚\u0001"));
            sb.append(this.maxAgeSeconds);
            sb.append(s4);
        }
        if (this.sMaxAgeSeconds != -1) {
            sb.append(ProtectedSandApp.s("黛\u0001"));
            sb.append(this.sMaxAgeSeconds);
            sb.append(s4);
        }
        if (this.isPrivate) {
            sb.append(ProtectedSandApp.s("黜\u0001"));
        }
        if (this.isPublic) {
            sb.append(ProtectedSandApp.s("黝\u0001"));
        }
        if (this.mustRevalidate) {
            sb.append(ProtectedSandApp.s("點\u0001"));
        }
        if (this.maxStaleSeconds != -1) {
            sb.append(ProtectedSandApp.s("黟\u0001"));
            sb.append(this.maxStaleSeconds);
            sb.append(s4);
        }
        if (this.minFreshSeconds != -1) {
            sb.append(ProtectedSandApp.s("黠\u0001"));
            sb.append(this.minFreshSeconds);
            sb.append(s4);
        }
        if (this.onlyIfCached) {
            sb.append(ProtectedSandApp.s("黡\u0001"));
        }
        if (this.noTransform) {
            sb.append(ProtectedSandApp.s("黢\u0001"));
        }
        if (this.immutable) {
            sb.append(ProtectedSandApp.s("黣\u0001"));
        }
        if (sb.length() == 0) {
            return "";
        }
        sb.delete(sb.length() - 2, sb.length());
        String sb2 = sb.toString();
        l0.o(sb2, ProtectedSandApp.s("黤\u0001"));
        this.headerValue = sb2;
        return sb2;
    }

    @kd.i(name = "onlyIfCached")
    public final boolean u() {
        return this.onlyIfCached;
    }

    @kd.i(name = "sMaxAgeSeconds")
    public final int w() {
        return this.sMaxAgeSeconds;
    }

    public /* synthetic */ d(boolean z4, boolean z5, int i4, int i5, boolean z6, boolean z7, boolean z10, int i6, int i7, boolean z11, boolean z12, boolean z13, String str, kotlin.jvm.internal.w wVar) {
        this(z4, z5, i4, i5, z6, z7, z10, i6, i7, z11, z12, z13, str);
    }
}
