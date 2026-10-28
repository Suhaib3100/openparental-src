package okhttp3.internal.http;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.IOException;
import java.net.ProtocolException;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import kotlin.text.e0;
import okhttp3.d0;
import okhttp3.g0;

/* compiled from: StatusLine.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\u0018\u0000 \u00112\u00020\u0001:\u0001\u0005B\u001f\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0012"}, d2 = {"Lokhttp3/internal/http/k;", "", "", "toString", "Lokhttp3/d0;", "a", "Lokhttp3/d0;", "protocol", "", "b", "I", "code", "c", "Ljava/lang/String;", "message", "<init>", "(Lokhttp3/d0;ILjava/lang/String;)V", "h", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes5.dex */
public final class k {

    /* renamed from: d, reason: collision with root package name */
    public static final int f30971d = 307;

    /* renamed from: e, reason: collision with root package name */
    public static final int f30972e = 308;

    /* renamed from: f, reason: collision with root package name */
    public static final int f30973f = 421;

    /* renamed from: g, reason: collision with root package name */
    public static final int f30974g = 100;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @d5.d
    @p3.f
    public final d0 protocol;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @p3.f
    public final int code;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @d5.d
    @p3.f
    public final String message;

    /* compiled from: StatusLine.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006R\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\r\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000b¨\u0006\u0011"}, d2 = {"Lokhttp3/internal/http/k$a;", "", "Lokhttp3/g0;", "response", "Lokhttp3/internal/http/k;", "a", "", "statusLine", "b", "", "HTTP_CONTINUE", "I", "HTTP_MISDIRECTED_REQUEST", "HTTP_PERM_REDIRECT", "HTTP_TEMP_REDIRECT", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: okhttp3.internal.http.k$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @d5.d
        public final k a(@d5.d g0 response) {
            l0.p(response, ProtectedSandApp.s("捌"));
            return new k(response.getProtocol(), response.getCode(), response.getMessage());
        }

        @d5.d
        public final k b(@d5.d String statusLine) throws IOException {
            boolean s22;
            boolean s23;
            d0 d0Var;
            int i5;
            String str;
            l0.p(statusLine, ProtectedSandApp.s("捍"));
            s22 = e0.s2(statusLine, ProtectedSandApp.s("捎"), false, 2, null);
            String s5 = ProtectedSandApp.s("捏");
            if (s22) {
                i5 = 9;
                if (statusLine.length() < 9 || statusLine.charAt(8) != ' ') {
                    throw new ProtocolException(s5.concat(statusLine));
                }
                int charAt = statusLine.charAt(7) - '0';
                if (charAt == 0) {
                    d0Var = d0.HTTP_1_0;
                } else {
                    if (charAt != 1) {
                        throw new ProtocolException(s5.concat(statusLine));
                    }
                    d0Var = d0.HTTP_1_1;
                }
            } else {
                s23 = e0.s2(statusLine, ProtectedSandApp.s("捐"), false, 2, null);
                if (!s23) {
                    throw new ProtocolException(androidx.constraintlayout.motion.widget.g.a(s5, statusLine));
                }
                d0Var = d0.HTTP_1_0;
                i5 = 4;
            }
            int i6 = i5 + 3;
            if (statusLine.length() < i6) {
                throw new ProtocolException(s5.concat(statusLine));
            }
            try {
                String substring = statusLine.substring(i5, i6);
                l0.o(substring, ProtectedSandApp.s("捑"));
                int parseInt = Integer.parseInt(substring);
                if (statusLine.length() <= i6) {
                    str = "";
                } else {
                    if (statusLine.charAt(i6) != ' ') {
                        throw new ProtocolException(s5.concat(statusLine));
                    }
                    str = statusLine.substring(i5 + 4);
                    l0.o(str, ProtectedSandApp.s("捒"));
                }
                return new k(d0Var, parseInt, str);
            } catch (NumberFormatException unused) {
                throw new ProtocolException(s5.concat(statusLine));
            }
        }

        public Companion(w wVar) {
        }
    }

    public k(@d5.d d0 d0Var, int i5, @d5.d String str) {
        l0.p(d0Var, ProtectedSandApp.s("捓"));
        l0.p(str, ProtectedSandApp.s("捔"));
        this.protocol = d0Var;
        this.code = i5;
        this.message = str;
    }

    @d5.d
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.protocol == d0.HTTP_1_0) {
            sb.append(ProtectedSandApp.s("捕"));
        } else {
            sb.append(ProtectedSandApp.s("捖"));
        }
        sb.append(' ');
        sb.append(this.code);
        sb.append(' ');
        sb.append(this.message);
        String sb2 = sb.toString();
        l0.o(sb2, ProtectedSandApp.s("捗"));
        return sb2;
    }
}
