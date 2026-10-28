package okhttp3.internal.ws;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import fg.m;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import kotlin.text.v;
import okhttp3.u;

/* compiled from: WebSocketExtensions.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\b\u0018\u0000 #2\u00020\u0001:\u0001\u000fBG\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0010J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0012J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0010J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0010JP\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010\u001f\u001a\u00020\u00022\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010!R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\"R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010!R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\"R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010!R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010!¨\u0006$"}, d2 = {"Lokhttp3/internal/ws/f;", "", "", "perMessageDeflate", "", "clientMaxWindowBits", "clientNoContextTakeover", "serverMaxWindowBits", "serverNoContextTakeover", "unknownValues", "<init>", "(ZLjava/lang/Integer;ZLjava/lang/Integer;ZZ)V", "clientOriginated", "i", "(Z)Z", "a", "()Z", "b", "()Ljava/lang/Integer;", "c", "d", "e", "f", "g", "(ZLjava/lang/Integer;ZLjava/lang/Integer;ZZ)Lokhttp3/internal/ws/f;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "Ljava/lang/Integer;", "h", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final /* data */ class f {

    /* renamed from: g, reason: collision with root package name */
    private static final String f84943g = ProtectedSandApp.s("ệ");

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @kd.f
    public final boolean perMessageDeflate;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @m
    @kd.f
    public final Integer clientMaxWindowBits;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @kd.f
    public final boolean clientNoContextTakeover;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @m
    @kd.f
    public final Integer serverMaxWindowBits;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @kd.f
    public final boolean serverNoContextTakeover;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @kd.f
    public final boolean unknownValues;

    /* compiled from: WebSocketExtensions.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lokhttp3/internal/ws/f$a;", "", "<init>", "()V", "Lokhttp3/u;", "responseHeaders", "Lokhttp3/internal/ws/f;", "a", "(Lokhttp3/u;)Lokhttp3/internal/ws/f;", "", "HEADER_WEB_SOCKET_EXTENSION", "Ljava/lang/String;", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: okhttp3.internal.ws.f$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @l
        public final f a(@l u responseHeaders) throws IOException {
            l0.p(responseHeaders, ProtectedSandApp.s("ế"));
            int size = responseHeaders.size();
            boolean z4 = false;
            Integer num = null;
            boolean z5 = false;
            Integer num2 = null;
            boolean z6 = false;
            boolean z7 = false;
            for (int i4 = 0; i4 < size; i4++) {
                if (v.K1(responseHeaders.j(i4), ProtectedSandApp.s("Ề"), true)) {
                    String s4 = responseHeaders.s(i4);
                    int i5 = 0;
                    while (i5 < s4.length()) {
                        int r4 = okhttp3.internal.d.r(s4, ',', i5, 0, 4, null);
                        int p4 = okhttp3.internal.d.p(s4, ';', i5, r4);
                        String g02 = okhttp3.internal.d.g0(s4, i5, p4);
                        int i6 = p4 + 1;
                        if (v.K1(g02, ProtectedSandApp.s("ề"), true)) {
                            if (z4) {
                                z7 = true;
                            }
                            while (i6 < r4) {
                                int p5 = okhttp3.internal.d.p(s4, ';', i6, r4);
                                int p6 = okhttp3.internal.d.p(s4, '=', i6, p5);
                                String g03 = okhttp3.internal.d.g0(s4, i6, p6);
                                String j4 = p6 < p5 ? v.j4(okhttp3.internal.d.g0(s4, p6 + 1, p5), ProtectedSandApp.s("Ể")) : null;
                                int i7 = p5 + 1;
                                if (v.K1(g03, ProtectedSandApp.s("ể"), true)) {
                                    if (num != null) {
                                        z7 = true;
                                    }
                                    Integer X0 = j4 != null ? v.X0(j4) : null;
                                    num = X0;
                                    if (X0 != null) {
                                        i6 = i7;
                                    }
                                    z7 = true;
                                    i6 = i7;
                                } else {
                                    if (v.K1(g03, ProtectedSandApp.s("Ễ"), true)) {
                                        if (z5) {
                                            z7 = true;
                                        }
                                        if (j4 != null) {
                                            z7 = true;
                                        }
                                        z5 = true;
                                    } else if (v.K1(g03, ProtectedSandApp.s("ễ"), true)) {
                                        if (num2 != null) {
                                            z7 = true;
                                        }
                                        Integer X02 = j4 != null ? v.X0(j4) : null;
                                        num2 = X02;
                                        if (X02 != null) {
                                        }
                                        z7 = true;
                                    } else {
                                        if (v.K1(g03, ProtectedSandApp.s("Ệ"), true)) {
                                            if (z6) {
                                                z7 = true;
                                            }
                                            if (j4 != null) {
                                                z7 = true;
                                            }
                                            z6 = true;
                                        }
                                        z7 = true;
                                    }
                                    i6 = i7;
                                }
                            }
                            i5 = i6;
                            z4 = true;
                        } else {
                            i5 = i6;
                            z7 = true;
                        }
                    }
                }
            }
            return new f(z4, num, z5, num2, z6, z7);
        }

        public Companion(w wVar) {
        }
    }

    public f() {
        this(false, null, false, null, false, false, 63, null);
    }

    public static f h(f fVar, boolean z4, Integer num, boolean z5, Integer num2, boolean z6, boolean z7, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z4 = fVar.perMessageDeflate;
        }
        if ((i4 & 2) != 0) {
            num = fVar.clientMaxWindowBits;
        }
        Integer num3 = num;
        if ((i4 & 4) != 0) {
            z5 = fVar.clientNoContextTakeover;
        }
        boolean z10 = z5;
        if ((i4 & 8) != 0) {
            num2 = fVar.serverMaxWindowBits;
        }
        Integer num4 = num2;
        if ((i4 & 16) != 0) {
            z6 = fVar.serverNoContextTakeover;
        }
        boolean z11 = z6;
        if ((i4 & 32) != 0) {
            z7 = fVar.unknownValues;
        }
        fVar.getClass();
        return new f(z4, num3, z10, num4, z11, z7);
    }

    /* renamed from: a, reason: from getter */
    public final boolean getPerMessageDeflate() {
        return this.perMessageDeflate;
    }

    @m
    /* renamed from: b, reason: from getter */
    public final Integer getClientMaxWindowBits() {
        return this.clientMaxWindowBits;
    }

    /* renamed from: c, reason: from getter */
    public final boolean getClientNoContextTakeover() {
        return this.clientNoContextTakeover;
    }

    @m
    /* renamed from: d, reason: from getter */
    public final Integer getServerMaxWindowBits() {
        return this.serverMaxWindowBits;
    }

    /* renamed from: e, reason: from getter */
    public final boolean getServerNoContextTakeover() {
        return this.serverNoContextTakeover;
    }

    public boolean equals(@m Object other) {
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

    @l
    public final f g(boolean perMessageDeflate, @m Integer clientMaxWindowBits, boolean clientNoContextTakeover, @m Integer serverMaxWindowBits, boolean serverNoContextTakeover, boolean unknownValues) {
        return new f(perMessageDeflate, clientMaxWindowBits, clientNoContextTakeover, serverMaxWindowBits, serverNoContextTakeover, unknownValues);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r2v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v6, types: [boolean] */
    public int hashCode() {
        boolean z4 = this.perMessageDeflate;
        ?? r02 = z4;
        if (z4) {
            r02 = 1;
        }
        int i4 = r02 * 31;
        Integer num = this.clientMaxWindowBits;
        int hashCode = (i4 + (num != null ? num.hashCode() : 0)) * 31;
        ?? r22 = this.clientNoContextTakeover;
        int i5 = r22;
        if (r22 != 0) {
            i5 = 1;
        }
        int i6 = (hashCode + i5) * 31;
        Integer num2 = this.serverMaxWindowBits;
        int hashCode2 = (i6 + (num2 != null ? num2.hashCode() : 0)) * 31;
        ?? r23 = this.serverNoContextTakeover;
        int i7 = r23;
        if (r23 != 0) {
            i7 = 1;
        }
        int i10 = (hashCode2 + i7) * 31;
        boolean z5 = this.unknownValues;
        return i10 + (z5 ? 1 : z5 ? 1 : 0);
    }

    public final boolean i(boolean clientOriginated) {
        return clientOriginated ? this.clientNoContextTakeover : this.serverNoContextTakeover;
    }

    @l
    public String toString() {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("Ỉ"));
        sb.append(this.perMessageDeflate);
        sb.append(ProtectedSandApp.s("ỉ"));
        sb.append(this.clientMaxWindowBits);
        sb.append(ProtectedSandApp.s("Ị"));
        sb.append(this.clientNoContextTakeover);
        sb.append(ProtectedSandApp.s("ị"));
        sb.append(this.serverMaxWindowBits);
        sb.append(ProtectedSandApp.s("Ọ"));
        sb.append(this.serverNoContextTakeover);
        sb.append(ProtectedSandApp.s("ọ"));
        return androidx.appcompat.app.h.a(sb, this.unknownValues, ProtectedSandApp.s("Ỏ"));
    }

    public f(boolean z4, @m Integer num, boolean z5, @m Integer num2, boolean z6, boolean z7) {
        this.perMessageDeflate = z4;
        this.clientMaxWindowBits = num;
        this.clientNoContextTakeover = z5;
        this.serverMaxWindowBits = num2;
        this.serverNoContextTakeover = z6;
        this.unknownValues = z7;
    }

    public /* synthetic */ f(boolean z4, Integer num, boolean z5, Integer num2, boolean z6, boolean z7, int i4, w wVar) {
        this((i4 & 1) != 0 ? false : z4, (i4 & 2) != 0 ? null : num, (i4 & 4) != 0 ? false : z5, (i4 & 8) == 0 ? num2 : null, (i4 & 16) != 0 ? false : z6, (i4 & 32) != 0 ? false : z7);
    }
}
