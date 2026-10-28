package okhttp3.internal.ws;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import kotlin.text.d0;
import kotlin.text.e0;
import kotlin.text.h0;
import okhttp3.v;

/* compiled from: WebSocketExtensions.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\b\u0018\u0000 \u001e2\u00020\u0001:\u0001\u0005BG\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000e\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\t\u001a\u00020\u0002HÆ\u0003J\u0012\u0010\n\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\n\u0010\bJ\t\u0010\u000b\u001a\u00020\u0002HÆ\u0003J\t\u0010\f\u001a\u00020\u0002HÆ\u0003JP\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0011\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010\u0016\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u0019\u001a\u00020\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0014\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001aR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001bR\u0014\u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001aR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001bR\u0014\u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001aR\u0014\u0010\u0012\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001a¨\u0006\u001f"}, d2 = {"Lokhttp3/internal/ws/f;", "", "", "clientOriginated", "i", "a", "", "b", "()Ljava/lang/Integer;", "c", "d", "e", "f", "perMessageDeflate", "clientMaxWindowBits", "clientNoContextTakeover", "serverMaxWindowBits", "serverNoContextTakeover", "unknownValues", "g", "(ZLjava/lang/Integer;ZLjava/lang/Integer;ZZ)Lokhttp3/internal/ws/f;", "", "toString", "hashCode", "other", "equals", "Z", "Ljava/lang/Integer;", "<init>", "(ZLjava/lang/Integer;ZLjava/lang/Integer;ZZ)V", "h", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes5.dex */
public final /* data */ class f {

    /* renamed from: g, reason: collision with root package name */
    private static final String f31403g = ProtectedSandApp.s("旭");

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @p3.f
    public final boolean perMessageDeflate;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @d5.e
    @p3.f
    public final Integer clientMaxWindowBits;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @p3.f
    public final boolean clientNoContextTakeover;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @d5.e
    @p3.f
    public final Integer serverMaxWindowBits;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @p3.f
    public final boolean serverNoContextTakeover;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @p3.f
    public final boolean unknownValues;

    /* compiled from: WebSocketExtensions.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lokhttp3/internal/ws/f$a;", "", "Lokhttp3/v;", "responseHeaders", "Lokhttp3/internal/ws/f;", "a", "", "HEADER_WEB_SOCKET_EXTENSION", "Ljava/lang/String;", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: okhttp3.internal.ws.f$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @d5.d
        public final f a(@d5.d v responseHeaders) throws IOException {
            boolean K1;
            boolean K12;
            boolean K13;
            boolean K14;
            boolean K15;
            boolean K16;
            Integer X0;
            Integer X02;
            l0.p(responseHeaders, ProtectedSandApp.s("日"));
            int size = responseHeaders.size();
            boolean z5 = false;
            Integer num = null;
            boolean z6 = false;
            Integer num2 = null;
            boolean z7 = false;
            boolean z8 = false;
            for (int i5 = 0; i5 < size; i5++) {
                K1 = e0.K1(responseHeaders.q(i5), ProtectedSandApp.s("旦"), true);
                if (K1) {
                    String x5 = responseHeaders.x(i5);
                    int i6 = 0;
                    while (i6 < x5.length()) {
                        int r5 = okhttp3.internal.d.r(x5, ',', i6, 0, 4, null);
                        int p5 = okhttp3.internal.d.p(x5, ';', i6, r5);
                        String g02 = okhttp3.internal.d.g0(x5, i6, p5);
                        int i7 = p5 + 1;
                        K12 = e0.K1(g02, ProtectedSandApp.s("旧"), true);
                        if (K12) {
                            if (z5) {
                                z8 = true;
                            }
                            while (i7 < r5) {
                                int p6 = okhttp3.internal.d.p(x5, ';', i7, r5);
                                int p7 = okhttp3.internal.d.p(x5, '=', i7, p6);
                                String g03 = okhttp3.internal.d.g0(x5, i7, p7);
                                String j42 = p7 < p6 ? h0.j4(okhttp3.internal.d.g0(x5, p7 + 1, p6), ProtectedSandApp.s("旨")) : null;
                                int i8 = p6 + 1;
                                K13 = e0.K1(g03, ProtectedSandApp.s("早"), true);
                                if (K13) {
                                    if (num != null) {
                                        z8 = true;
                                    }
                                    if (j42 != null) {
                                        X02 = d0.X0(j42);
                                        num = X02;
                                    } else {
                                        num = null;
                                    }
                                    if (num != null) {
                                        i7 = i8;
                                    }
                                    z8 = true;
                                    i7 = i8;
                                } else {
                                    K14 = e0.K1(g03, ProtectedSandApp.s("旪"), true);
                                    if (K14) {
                                        if (z6) {
                                            z8 = true;
                                        }
                                        if (j42 != null) {
                                            z8 = true;
                                        }
                                        z6 = true;
                                    } else {
                                        K15 = e0.K1(g03, ProtectedSandApp.s("旫"), true);
                                        if (K15) {
                                            if (num2 != null) {
                                                z8 = true;
                                            }
                                            if (j42 != null) {
                                                X0 = d0.X0(j42);
                                                num2 = X0;
                                            } else {
                                                num2 = null;
                                            }
                                            if (num2 != null) {
                                            }
                                            z8 = true;
                                        } else {
                                            K16 = e0.K1(g03, ProtectedSandApp.s("旬"), true);
                                            if (K16) {
                                                if (z7) {
                                                    z8 = true;
                                                }
                                                if (j42 != null) {
                                                    z8 = true;
                                                }
                                                z7 = true;
                                            }
                                            z8 = true;
                                        }
                                    }
                                    i7 = i8;
                                }
                            }
                            i6 = i7;
                            z5 = true;
                        } else {
                            i6 = i7;
                            z8 = true;
                        }
                    }
                }
            }
            return new f(z5, num, z6, num2, z7, z8);
        }

        public Companion(w wVar) {
        }
    }

    public f() {
        this(false, null, false, null, false, false, 63, null);
    }

    public static /* synthetic */ f h(f fVar, boolean z5, Integer num, boolean z6, Integer num2, boolean z7, boolean z8, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            z5 = fVar.perMessageDeflate;
        }
        if ((i5 & 2) != 0) {
            num = fVar.clientMaxWindowBits;
        }
        Integer num3 = num;
        if ((i5 & 4) != 0) {
            z6 = fVar.clientNoContextTakeover;
        }
        boolean z9 = z6;
        if ((i5 & 8) != 0) {
            num2 = fVar.serverMaxWindowBits;
        }
        Integer num4 = num2;
        if ((i5 & 16) != 0) {
            z7 = fVar.serverNoContextTakeover;
        }
        boolean z10 = z7;
        if ((i5 & 32) != 0) {
            z8 = fVar.unknownValues;
        }
        return fVar.g(z5, num3, z9, num4, z10, z8);
    }

    /* renamed from: a, reason: from getter */
    public final boolean getPerMessageDeflate() {
        return this.perMessageDeflate;
    }

    @d5.e
    /* renamed from: b, reason: from getter */
    public final Integer getClientMaxWindowBits() {
        return this.clientMaxWindowBits;
    }

    /* renamed from: c, reason: from getter */
    public final boolean getClientNoContextTakeover() {
        return this.clientNoContextTakeover;
    }

    @d5.e
    /* renamed from: d, reason: from getter */
    public final Integer getServerMaxWindowBits() {
        return this.serverMaxWindowBits;
    }

    /* renamed from: e, reason: from getter */
    public final boolean getServerNoContextTakeover() {
        return this.serverNoContextTakeover;
    }

    public boolean equals(@d5.e Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof f)) {
            return false;
        }
        f fVar = (f) other;
        return this.perMessageDeflate == fVar.perMessageDeflate && l0.g(this.clientMaxWindowBits, fVar.clientMaxWindowBits) && this.clientNoContextTakeover == fVar.clientNoContextTakeover && l0.g(this.serverMaxWindowBits, fVar.serverMaxWindowBits) && this.serverNoContextTakeover == fVar.serverNoContextTakeover && this.unknownValues == fVar.unknownValues;
    }

    /* renamed from: f, reason: from getter */
    public final boolean getUnknownValues() {
        return this.unknownValues;
    }

    @d5.d
    public final f g(boolean perMessageDeflate, @d5.e Integer clientMaxWindowBits, boolean clientNoContextTakeover, @d5.e Integer serverMaxWindowBits, boolean serverNoContextTakeover, boolean unknownValues) {
        return new f(perMessageDeflate, clientMaxWindowBits, clientNoContextTakeover, serverMaxWindowBits, serverNoContextTakeover, unknownValues);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r2v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v6, types: [boolean] */
    public int hashCode() {
        boolean z5 = this.perMessageDeflate;
        ?? r02 = z5;
        if (z5) {
            r02 = 1;
        }
        int i5 = r02 * 31;
        Integer num = this.clientMaxWindowBits;
        int hashCode = (i5 + (num != null ? num.hashCode() : 0)) * 31;
        ?? r22 = this.clientNoContextTakeover;
        int i6 = r22;
        if (r22 != 0) {
            i6 = 1;
        }
        int i7 = (hashCode + i6) * 31;
        Integer num2 = this.serverMaxWindowBits;
        int hashCode2 = (i7 + (num2 != null ? num2.hashCode() : 0)) * 31;
        ?? r23 = this.serverNoContextTakeover;
        int i8 = r23;
        if (r23 != 0) {
            i8 = 1;
        }
        int i9 = (hashCode2 + i8) * 31;
        boolean z6 = this.unknownValues;
        return i9 + (z6 ? 1 : z6 ? 1 : 0);
    }

    public final boolean i(boolean clientOriginated) {
        return clientOriginated ? this.clientNoContextTakeover : this.serverNoContextTakeover;
    }

    @d5.d
    public String toString() {
        return ProtectedSandApp.s("旮") + this.perMessageDeflate + ProtectedSandApp.s("旯") + this.clientMaxWindowBits + ProtectedSandApp.s("旰") + this.clientNoContextTakeover + ProtectedSandApp.s("旱") + this.serverMaxWindowBits + ProtectedSandApp.s("旲") + this.serverNoContextTakeover + ProtectedSandApp.s("旳") + this.unknownValues + ProtectedSandApp.s("旴");
    }

    public f(boolean z5, @d5.e Integer num, boolean z6, @d5.e Integer num2, boolean z7, boolean z8) {
        this.perMessageDeflate = z5;
        this.clientMaxWindowBits = num;
        this.clientNoContextTakeover = z6;
        this.serverMaxWindowBits = num2;
        this.serverNoContextTakeover = z7;
        this.unknownValues = z8;
    }

    public /* synthetic */ f(boolean z5, Integer num, boolean z6, Integer num2, boolean z7, boolean z8, int i5, w wVar) {
        this((i5 & 1) != 0 ? false : z5, (i5 & 2) != 0 ? null : num, (i5 & 4) != 0 ? false : z6, (i5 & 8) == 0 ? num2 : null, (i5 & 16) != 0 ? false : z7, (i5 & 32) != 0 ? false : z8);
    }
}
