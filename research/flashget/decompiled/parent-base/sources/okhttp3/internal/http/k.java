package okhttp3.internal.http;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import java.io.IOException;
import java.net.ProtocolException;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import kotlin.text.v;
import okhttp3.c0;
import okhttp3.f0;

/* compiled from: StatusLine.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\u0018\u0000 \u00122\u00020\u0001:\u0001\fB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lokhttp3/internal/http/k;", "", "Lokhttp3/c0;", "protocol", "", "code", "", "message", "<init>", "(Lokhttp3/c0;ILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "a", "Lokhttp3/c0;", "b", "I", "c", "Ljava/lang/String;", "h", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes.dex */
public final class k {

    /* renamed from: d, reason: collision with root package name */
    public static final int f84498d = 307;

    /* renamed from: e, reason: collision with root package name */
    public static final int f84499e = 308;

    /* renamed from: f, reason: collision with root package name */
    public static final int f84500f = 421;

    /* renamed from: g, reason: collision with root package name */
    public static final int f84501g = 100;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @l
    @kd.f
    public final c0 protocol;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @kd.f
    public final int code;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @l
    @kd.f
    public final String message;

    /* compiled from: StatusLine.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\r8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\r8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\r8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u000f¨\u0006\u0013"}, d2 = {"Lokhttp3/internal/http/k$a;", "", "<init>", "()V", "Lokhttp3/f0;", "response", "Lokhttp3/internal/http/k;", "a", "(Lokhttp3/f0;)Lokhttp3/internal/http/k;", "", "statusLine", "b", "(Ljava/lang/String;)Lokhttp3/internal/http/k;", "", "HTTP_CONTINUE", "I", "HTTP_MISDIRECTED_REQUEST", "HTTP_PERM_REDIRECT", "HTTP_TEMP_REDIRECT", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: okhttp3.internal.http.k$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @l
        public final k a(@l f0 response) {
            l0.p(response, ProtectedSandApp.s("o"));
            return new k(response.getProtocol(), response.u(), response.getMessage());
        }

        @l
        public final k b(@l String statusLine) throws IOException {
            c0 c0Var;
            int i4;
            String str;
            l0.p(statusLine, ProtectedSandApp.s("p"));
            boolean s22 = v.s2(statusLine, ProtectedSandApp.s("q"), false, 2, null);
            String s4 = ProtectedSandApp.s("r");
            if (s22) {
                i4 = 9;
                if (statusLine.length() < 9 || statusLine.charAt(8) != ' ') {
                    throw new ProtocolException(s4.concat(statusLine));
                }
                int charAt = statusLine.charAt(7) - '0';
                if (charAt == 0) {
                    c0Var = c0.HTTP_1_0;
                } else {
                    if (charAt != 1) {
                        throw new ProtocolException(s4.concat(statusLine));
                    }
                    c0Var = c0.HTTP_1_1;
                }
            } else {
                if (!v.s2(statusLine, ProtectedSandApp.s("s"), false, 2, null)) {
                    throw new ProtocolException(androidx.constraintlayout.core.motion.key.c.a(s4, statusLine));
                }
                c0Var = c0.HTTP_1_0;
                i4 = 4;
            }
            int i5 = i4 + 3;
            if (statusLine.length() < i5) {
                throw new ProtocolException(s4.concat(statusLine));
            }
            try {
                String substring = statusLine.substring(i4, i5);
                l0.o(substring, ProtectedSandApp.s("t"));
                int parseInt = Integer.parseInt(substring);
                if (statusLine.length() <= i5) {
                    str = "";
                } else {
                    if (statusLine.charAt(i5) != ' ') {
                        throw new ProtocolException(s4.concat(statusLine));
                    }
                    str = statusLine.substring(i4 + 4);
                    l0.o(str, ProtectedSandApp.s("u"));
                }
                return new k(c0Var, parseInt, str);
            } catch (NumberFormatException unused) {
                throw new ProtocolException(s4.concat(statusLine));
            }
        }

        public Companion(w wVar) {
        }
    }

    public k(@l c0 c0Var, int i4, @l String str) {
        l0.p(c0Var, ProtectedSandApp.s("v"));
        l0.p(str, ProtectedSandApp.s("w"));
        this.protocol = c0Var;
        this.code = i4;
        this.message = str;
    }

    @l
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.protocol == c0.HTTP_1_0) {
            sb.append(ProtectedSandApp.s("x"));
        } else {
            sb.append(ProtectedSandApp.s("y"));
        }
        sb.append(' ');
        sb.append(this.code);
        sb.append(' ');
        sb.append(this.message);
        String sb2 = sb.toString();
        l0.o(sb2, ProtectedSandApp.s("z"));
        return sb2;
    }
}
