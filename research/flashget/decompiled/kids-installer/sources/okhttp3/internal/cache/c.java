package okhttp3.internal.cache;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import okhttp3.e0;
import okhttp3.g0;
import okhttp3.v;

/* compiled from: CacheStrategy.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0002\u0003\u0005B\u001d\b\u0000\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\f\u0010\rR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\u0003\u0010\n¨\u0006\u000f"}, d2 = {"Lokhttp3/internal/cache/c;", "", "Lokhttp3/e0;", "a", "Lokhttp3/e0;", "b", "()Lokhttp3/e0;", "networkRequest", "Lokhttp3/g0;", "Lokhttp3/g0;", "()Lokhttp3/g0;", "cacheResponse", "<init>", "(Lokhttp3/e0;Lokhttp3/g0;)V", "c", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes5.dex */
public final class c {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @d5.e
    private final e0 networkRequest;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @d5.e
    private final g0 cacheResponse;

    /* compiled from: CacheStrategy.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\n"}, d2 = {"Lokhttp3/internal/cache/c$a;", "", "Lokhttp3/g0;", "response", "Lokhttp3/e0;", "request", "", "a", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: okhttp3.internal.cache.c$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final boolean a(@d5.d g0 response, @d5.d e0 request) {
            l0.p(response, ProtectedSandApp.s("惮"));
            l0.p(request, ProtectedSandApp.s("惯"));
            int code = response.getCode();
            if (code != 200 && code != 410 && code != 414 && code != 501 && code != 203 && code != 204) {
                if (code != 307) {
                    if (code != 308 && code != 404 && code != 405) {
                        switch (code) {
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
                if (g0.P(response, ProtectedSandApp.s("惰"), null, 2, null) == null && response.w().n() == -1 && !response.w().getIsPublic() && !response.w().getIsPrivate()) {
                    return false;
                }
            }
            return (response.w().s() || request.g().s()) ? false : true;
        }

        public Companion(w wVar) {
        }
    }

    /* compiled from: CacheStrategy.kt */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010!\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010(\u001a\u0004\u0018\u00010%¢\u0006\u0004\b)\u0010*J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0002J\b\u0010\b\u001a\u00020\u0006H\u0002J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002J\u0006\u0010\f\u001a\u00020\u0004R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u000eR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u0011R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u000eR\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0011R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u000eR\u0016\u0010\u0018\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0017R\u0016\u0010\u0019\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0017R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u0011R\u0016\u0010\u001f\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010!\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0017R\u001a\u0010\n\u001a\u00020\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\u0015\u0010$R\u0016\u0010(\u001a\u0004\u0018\u00010%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006+"}, d2 = {"Lokhttp3/internal/cache/c$b;", "", "", "g", "Lokhttp3/internal/cache/c;", "c", "", "d", "a", "Lokhttp3/e0;", "request", "f", "b", "Ljava/util/Date;", "Ljava/util/Date;", "servedDate", "", "Ljava/lang/String;", "servedDateString", "lastModified", "lastModifiedString", "e", "expires", "J", "sentRequestMillis", "receivedResponseMillis", "h", "etag", "", "i", "I", "ageSeconds", "j", "nowMillis", "k", "Lokhttp3/e0;", "()Lokhttp3/e0;", "Lokhttp3/g0;", "l", "Lokhttp3/g0;", "cacheResponse", "<init>", "(JLokhttp3/e0;Lokhttp3/g0;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
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
        @d5.d
        private final e0 request;

        /* renamed from: l, reason: collision with root package name and from kotlin metadata */
        private final g0 cacheResponse;

        public b(long j5, @d5.d e0 e0Var, @d5.e g0 g0Var) {
            boolean K1;
            boolean K12;
            boolean K13;
            boolean K14;
            boolean K15;
            l0.p(e0Var, ProtectedSandApp.s("惱"));
            this.nowMillis = j5;
            this.request = e0Var;
            this.cacheResponse = g0Var;
            this.ageSeconds = -1;
            if (g0Var != null) {
                this.sentRequestMillis = g0Var.getSentRequestAtMillis();
                this.receivedResponseMillis = g0Var.getReceivedResponseAtMillis();
                v headers = g0Var.getHeaders();
                int size = headers.size();
                for (int i5 = 0; i5 < size; i5++) {
                    String q5 = headers.q(i5);
                    String x5 = headers.x(i5);
                    K1 = kotlin.text.e0.K1(q5, ProtectedSandApp.s("惲"), true);
                    if (K1) {
                        this.servedDate = okhttp3.internal.http.c.a(x5);
                        this.servedDateString = x5;
                    } else {
                        K12 = kotlin.text.e0.K1(q5, ProtectedSandApp.s("想"), true);
                        if (K12) {
                            this.expires = okhttp3.internal.http.c.a(x5);
                        } else {
                            K13 = kotlin.text.e0.K1(q5, ProtectedSandApp.s("惴"), true);
                            if (K13) {
                                this.lastModified = okhttp3.internal.http.c.a(x5);
                                this.lastModifiedString = x5;
                            } else {
                                K14 = kotlin.text.e0.K1(q5, ProtectedSandApp.s("惵"), true);
                                if (K14) {
                                    this.etag = x5;
                                } else {
                                    K15 = kotlin.text.e0.K1(q5, ProtectedSandApp.s("惶"), true);
                                    if (K15) {
                                        this.ageSeconds = okhttp3.internal.d.f0(x5, -1);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        private final long a() {
            Date date = this.servedDate;
            long max = date != null ? Math.max(0L, this.receivedResponseMillis - date.getTime()) : 0L;
            int i5 = this.ageSeconds;
            if (i5 != -1) {
                max = Math.max(max, TimeUnit.SECONDS.toMillis(i5));
            }
            long j5 = this.receivedResponseMillis;
            return max + (j5 - this.sentRequestMillis) + (this.nowMillis - j5);
        }

        private final c c() {
            String str;
            if (this.cacheResponse == null) {
                return new c(this.request, null);
            }
            if (this.request.l() && this.cacheResponse.getHandshake() == null) {
                return new c(this.request, null);
            }
            if (!c.INSTANCE.a(this.cacheResponse, this.request)) {
                return new c(this.request, null);
            }
            okhttp3.d g5 = this.request.g();
            if (g5.r() || f(this.request)) {
                return new c(this.request, null);
            }
            okhttp3.d w5 = this.cacheResponse.w();
            long a6 = a();
            long d6 = d();
            if (g5.n() != -1) {
                d6 = Math.min(d6, TimeUnit.SECONDS.toMillis(g5.n()));
            }
            long j5 = 0;
            long millis = g5.p() != -1 ? TimeUnit.SECONDS.toMillis(g5.p()) : 0L;
            if (!w5.q() && g5.o() != -1) {
                j5 = TimeUnit.SECONDS.toMillis(g5.o());
            }
            if (!w5.r()) {
                long j6 = millis + a6;
                if (j6 < j5 + d6) {
                    g0 g0Var = this.cacheResponse;
                    g0Var.getClass();
                    g0.a aVar = new g0.a(g0Var);
                    String s5 = ProtectedSandApp.s("惷");
                    if (j6 >= d6) {
                        aVar.a(s5, ProtectedSandApp.s("惸"));
                    }
                    if (a6 > 86400000 && g()) {
                        aVar.a(s5, ProtectedSandApp.s("惹"));
                    }
                    return new c(null, aVar.c());
                }
            }
            String str2 = this.etag;
            if (str2 != null) {
                str = ProtectedSandApp.s("惺");
            } else {
                Date date = this.lastModified;
                String s6 = ProtectedSandApp.s("惻");
                if (date != null) {
                    str2 = this.lastModifiedString;
                } else {
                    if (this.servedDate == null) {
                        return new c(this.request, null);
                    }
                    str2 = this.servedDateString;
                }
                str = s6;
            }
            v.a s7 = this.request.k().s();
            l0.m(str2);
            s7.g(str, str2);
            e0 e0Var = this.request;
            e0Var.getClass();
            return new c(new e0.a(e0Var).o(s7.i()).b(), this.cacheResponse);
        }

        private final long d() {
            g0 g0Var = this.cacheResponse;
            l0.m(g0Var);
            if (g0Var.w().n() != -1) {
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

        private final boolean f(e0 request) {
            return (request.i(ProtectedSandApp.s("惼")) == null && request.i(ProtectedSandApp.s("惽")) == null) ? false : true;
        }

        private final boolean g() {
            g0 g0Var = this.cacheResponse;
            l0.m(g0Var);
            return g0Var.w().n() == -1 && this.expires == null;
        }

        @d5.d
        public final c b() {
            c c6 = c();
            return (c6.getNetworkRequest() == null || !this.request.g().u()) ? c6 : new c(null, null);
        }

        @d5.d
        /* renamed from: e, reason: from getter */
        public final e0 getRequest() {
            return this.request;
        }
    }

    public c(@d5.e e0 e0Var, @d5.e g0 g0Var) {
        this.networkRequest = e0Var;
        this.cacheResponse = g0Var;
    }

    @d5.e
    /* renamed from: a, reason: from getter */
    public final g0 getCacheResponse() {
        return this.cacheResponse;
    }

    @d5.e
    /* renamed from: b, reason: from getter */
    public final e0 getNetworkRequest() {
        return this.networkRequest;
    }
}
