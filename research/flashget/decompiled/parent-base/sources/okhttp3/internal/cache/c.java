package okhttp3.internal.cache;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import fg.m;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import kotlin.text.v;
import okhttp3.d0;
import okhttp3.f0;
import okhttp3.u;

/* compiled from: CacheStrategy.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 \u000e2\u00020\u0001:\u0002\b\nB\u001d\b\u0000\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\f\u001a\u0004\b\b\u0010\r¨\u0006\u000f"}, d2 = {"Lokhttp3/internal/cache/c;", "", "Lokhttp3/d0;", "networkRequest", "Lokhttp3/f0;", "cacheResponse", "<init>", "(Lokhttp3/d0;Lokhttp3/f0;)V", "a", "Lokhttp3/d0;", "b", "()Lokhttp3/d0;", "Lokhttp3/f0;", "()Lokhttp3/f0;", "c", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes7.dex */
public final class c {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @m
    private final d0 networkRequest;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @m
    private final f0 cacheResponse;

    /* compiled from: CacheStrategy.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lokhttp3/internal/cache/c$a;", "", "<init>", "()V", "Lokhttp3/f0;", "response", "Lokhttp3/d0;", "request", "", "a", "(Lokhttp3/f0;Lokhttp3/d0;)Z", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: okhttp3.internal.cache.c$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final boolean a(@l f0 response, @l d0 request) {
            l0.p(response, ProtectedSandApp.s("ꀈ\u0001"));
            l0.p(request, ProtectedSandApp.s("ꀉ\u0001"));
            int u4 = response.u();
            if (u4 != 200 && u4 != 410 && u4 != 414 && u4 != 501 && u4 != 203 && u4 != 204) {
                if (u4 != 307) {
                    if (u4 != 308 && u4 != 404 && u4 != 405) {
                        switch (u4) {
                            case 300:
                            case 301:
                                break;
                            case 302:
                                break;
                            default:
                                return false;
                        }
                    }
                }
                if (f0.C(response, ProtectedSandApp.s("ꀊ\u0001"), null, 2, null) == null && response.q().n() == -1 && !response.q().getIsPublic() && !response.q().getIsPrivate()) {
                    return false;
                }
            }
            return (response.q().s() || request.g().s()) ? false : true;
        }

        public Companion(w wVar) {
        }
    }

    /* compiled from: CacheStrategy.kt */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\n\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\r¢\u0006\u0004\b\u0015\u0010\u000fR\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0017R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u001aR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0017R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u001aR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u0017R\u0016\u0010!\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010 R\u0016\u0010\"\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010 R\u0018\u0010$\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010\u001aR\u0016\u0010(\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010 R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b\u001e\u0010,R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.¨\u0006/"}, d2 = {"Lokhttp3/internal/cache/c$b;", "", "", "nowMillis", "Lokhttp3/d0;", "request", "Lokhttp3/f0;", "cacheResponse", "<init>", "(JLokhttp3/d0;Lokhttp3/f0;)V", "", "g", "()Z", "Lokhttp3/internal/cache/c;", "c", "()Lokhttp3/internal/cache/c;", "d", "()J", "a", "f", "(Lokhttp3/d0;)Z", "b", "Ljava/util/Date;", "Ljava/util/Date;", "servedDate", "", "Ljava/lang/String;", "servedDateString", "lastModified", "lastModifiedString", "e", "expires", "J", "sentRequestMillis", "receivedResponseMillis", "h", "etag", "", "i", "I", "ageSeconds", "j", "k", "Lokhttp3/d0;", "()Lokhttp3/d0;", "l", "Lokhttp3/f0;", "okhttp"}, k = 1, mv = {1, 4, 0})
    public static final class b {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private Date servedDate;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private String servedDateString;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private Date lastModified;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private String lastModifiedString;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private Date expires;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private long sentRequestMillis;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        private long receivedResponseMillis;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata */
        private String etag;

        /* renamed from: i, reason: collision with root package name and from kotlin metadata */
        private int ageSeconds;

        /* renamed from: j, reason: collision with root package name and from kotlin metadata */
        private final long nowMillis;

        /* renamed from: k, reason: collision with root package name and from kotlin metadata */
        @l
        private final d0 request;

        /* renamed from: l, reason: collision with root package name and from kotlin metadata */
        private final f0 cacheResponse;

        public b(long j4, @l d0 d0Var, @m f0 f0Var) {
            l0.p(d0Var, ProtectedSandApp.s("ꀋ\u0001"));
            this.nowMillis = j4;
            this.request = d0Var;
            this.cacheResponse = f0Var;
            this.ageSeconds = -1;
            if (f0Var != null) {
                this.sentRequestMillis = f0Var.getSentRequestAtMillis();
                this.receivedResponseMillis = f0Var.getReceivedResponseAtMillis();
                u headers = f0Var.getHeaders();
                int size = headers.size();
                for (int i4 = 0; i4 < size; i4++) {
                    String j5 = headers.j(i4);
                    String s4 = headers.s(i4);
                    if (v.K1(j5, ProtectedSandApp.s("ꀌ\u0001"), true)) {
                        this.servedDate = okhttp3.internal.http.c.a(s4);
                        this.servedDateString = s4;
                    } else if (v.K1(j5, ProtectedSandApp.s("ꀍ\u0001"), true)) {
                        this.expires = okhttp3.internal.http.c.a(s4);
                    } else if (v.K1(j5, ProtectedSandApp.s("ꀎ\u0001"), true)) {
                        this.lastModified = okhttp3.internal.http.c.a(s4);
                        this.lastModifiedString = s4;
                    } else if (v.K1(j5, ProtectedSandApp.s("ꀏ\u0001"), true)) {
                        this.etag = s4;
                    } else if (v.K1(j5, ProtectedSandApp.s("ꀐ\u0001"), true)) {
                        this.ageSeconds = okhttp3.internal.d.f0(s4, -1);
                    }
                }
            }
        }

        private final long a() {
            Date date = this.servedDate;
            long max = date != null ? Math.max(0L, this.receivedResponseMillis - date.getTime()) : 0L;
            int i4 = this.ageSeconds;
            if (i4 != -1) {
                max = Math.max(max, TimeUnit.SECONDS.toMillis(i4));
            }
            long j4 = this.receivedResponseMillis;
            return max + (j4 - this.sentRequestMillis) + (this.nowMillis - j4);
        }

        private final c c() {
            String str;
            if (this.cacheResponse == null) {
                return new c(this.request, null);
            }
            if (this.request.l() && this.cacheResponse.y() == null) {
                return new c(this.request, null);
            }
            if (!c.INSTANCE.a(this.cacheResponse, this.request)) {
                return new c(this.request, null);
            }
            okhttp3.d g4 = this.request.g();
            if (g4.r() || f(this.request)) {
                return new c(this.request, null);
            }
            okhttp3.d q4 = this.cacheResponse.q();
            long a5 = a();
            long d5 = d();
            if (g4.n() != -1) {
                d5 = Math.min(d5, TimeUnit.SECONDS.toMillis(g4.n()));
            }
            long j4 = 0;
            long millis = g4.p() != -1 ? TimeUnit.SECONDS.toMillis(g4.p()) : 0L;
            if (!q4.q() && g4.o() != -1) {
                j4 = TimeUnit.SECONDS.toMillis(g4.o());
            }
            if (!q4.r()) {
                long j5 = millis + a5;
                if (j5 < j4 + d5) {
                    f0 f0Var = this.cacheResponse;
                    f0Var.getClass();
                    f0.a aVar = new f0.a(f0Var);
                    String s4 = ProtectedSandApp.s("ꀑ\u0001");
                    if (j5 >= d5) {
                        aVar.a(s4, ProtectedSandApp.s("ꀒ\u0001"));
                    }
                    if (a5 > 86400000 && g()) {
                        aVar.a(s4, ProtectedSandApp.s("ꀓ\u0001"));
                    }
                    return new c(null, aVar.c());
                }
            }
            String str2 = this.etag;
            if (str2 != null) {
                str = ProtectedSandApp.s("ꀔ\u0001");
            } else {
                Date date = this.lastModified;
                String s5 = ProtectedSandApp.s("ꀕ\u0001");
                if (date != null) {
                    str2 = this.lastModifiedString;
                } else {
                    if (this.servedDate == null) {
                        return new c(this.request, null);
                    }
                    str2 = this.servedDateString;
                }
                str = s5;
            }
            u.a m4 = this.request.k().m();
            l0.m(str2);
            m4.g(str, str2);
            d0 d0Var = this.request;
            d0Var.getClass();
            return new c(new d0.a(d0Var).o(m4.i()).b(), this.cacheResponse);
        }

        private final long d() {
            f0 f0Var = this.cacheResponse;
            l0.m(f0Var);
            if (f0Var.q().n() != -1) {
                return TimeUnit.SECONDS.toMillis(r0.n());
            }
            Date date = this.expires;
            if (date != null) {
                Date date2 = this.servedDate;
                long time = date.getTime() - (date2 != null ? date2.getTime() : this.receivedResponseMillis);
                if (time > 0) {
                    return time;
                }
                return 0L;
            }
            if (this.lastModified == null || this.cacheResponse.getRequest().q().O() != null) {
                return 0L;
            }
            Date date3 = this.servedDate;
            long time2 = date3 != null ? date3.getTime() : this.sentRequestMillis;
            Date date4 = this.lastModified;
            l0.m(date4);
            long time3 = time2 - date4.getTime();
            if (time3 > 0) {
                return time3 / 10;
            }
            return 0L;
        }

        private final boolean f(d0 request) {
            return (request.i(ProtectedSandApp.s("ꀕ\u0001")) == null && request.i(ProtectedSandApp.s("ꀔ\u0001")) == null) ? false : true;
        }

        private final boolean g() {
            f0 f0Var = this.cacheResponse;
            l0.m(f0Var);
            return f0Var.q().n() == -1 && this.expires == null;
        }

        @l
        public final c b() {
            c c5 = c();
            return (c5.getNetworkRequest() == null || !this.request.g().u()) ? c5 : new c(null, null);
        }

        @l
        /* renamed from: e, reason: from getter */
        public final d0 getRequest() {
            return this.request;
        }
    }

    public c(@m d0 d0Var, @m f0 f0Var) {
        this.networkRequest = d0Var;
        this.cacheResponse = f0Var;
    }

    @m
    /* renamed from: a, reason: from getter */
    public final f0 getCacheResponse() {
        return this.cacheResponse;
    }

    @m
    /* renamed from: b, reason: from getter */
    public final d0 getNetworkRequest() {
        return this.networkRequest;
    }
}
