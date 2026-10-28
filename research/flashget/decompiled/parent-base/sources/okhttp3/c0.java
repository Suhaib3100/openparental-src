package okhttp3;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: Protocol.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lokhttp3/c0;", "", "", "protocol", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "Companion", "a", "HTTP_1_0", "HTTP_1_1", "SPDY_3", "HTTP_2", "H2_PRIOR_KNOWLEDGE", "QUIC", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes7.dex */
public enum c0 {
    HTTP_1_0(ProtectedSandApp.s("麂\u0001")),
    HTTP_1_1(ProtectedSandApp.s("麄\u0001")),
    SPDY_3(ProtectedSandApp.s("麆\u0001")),
    HTTP_2(ProtectedSandApp.s("麈\u0001")),
    H2_PRIOR_KNOWLEDGE(ProtectedSandApp.s("麊\u0001")),
    QUIC(ProtectedSandApp.s("麌\u0001"));


    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    private final String protocol;

    /* compiled from: Protocol.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lokhttp3/c0$a;", "", "<init>", "()V", "", "protocol", "Lokhttp3/c0;", "a", "(Ljava/lang/String;)Lokhttp3/c0;", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: okhttp3.c0$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @fg.l
        @kd.n
        public final c0 a(@fg.l String protocol) throws IOException {
            l0.p(protocol, ProtectedSandApp.s("麀\u0001"));
            c0 c0Var = c0.HTTP_1_0;
            if (!l0.g(protocol, c0Var.protocol)) {
                c0Var = c0.HTTP_1_1;
                if (!l0.g(protocol, c0Var.protocol)) {
                    c0Var = c0.H2_PRIOR_KNOWLEDGE;
                    if (!l0.g(protocol, c0Var.protocol)) {
                        c0Var = c0.HTTP_2;
                        if (!l0.g(protocol, c0Var.protocol)) {
                            c0Var = c0.SPDY_3;
                            if (!l0.g(protocol, c0Var.protocol)) {
                                c0Var = c0.QUIC;
                                if (!l0.g(protocol, c0Var.protocol)) {
                                    throw new IOException(androidx.constraintlayout.core.motion.key.c.a(ProtectedSandApp.s("麁\u0001"), protocol));
                                }
                            }
                        }
                    }
                }
            }
            return c0Var;
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    c0(String str) {
        this.protocol = str;
    }

    @fg.l
    @kd.n
    public static final c0 get(@fg.l String str) throws IOException {
        return INSTANCE.a(str);
    }

    @Override // java.lang.Enum
    @fg.l
    public String toString() {
        return this.protocol;
    }
}
