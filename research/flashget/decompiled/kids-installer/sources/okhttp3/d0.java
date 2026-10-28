package okhttp3;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.IOException;
import kotlin.Metadata;

/* compiled from: Protocol.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005j\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lokhttp3/d0;", "", "", "toString", "protocol", "Ljava/lang/String;", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Companion", "a", "HTTP_1_0", "HTTP_1_1", "SPDY_3", "HTTP_2", "H2_PRIOR_KNOWLEDGE", "QUIC", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes5.dex */
public enum d0 {
    HTTP_1_0(ProtectedSandApp.s("彲")),
    HTTP_1_1(ProtectedSandApp.s("彴")),
    SPDY_3(ProtectedSandApp.s("彶")),
    HTTP_2(ProtectedSandApp.s("彸")),
    H2_PRIOR_KNOWLEDGE(ProtectedSandApp.s("彺")),
    QUIC(ProtectedSandApp.s("彼"));


    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String protocol;

    /* compiled from: Protocol.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\b"}, d2 = {"Lokhttp3/d0$a;", "", "", "protocol", "Lokhttp3/d0;", "a", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: okhttp3.d0$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @d5.d
        @p3.n
        public final d0 a(@d5.d String protocol) throws IOException {
            kotlin.jvm.internal.l0.p(protocol, ProtectedSandApp.s("彯"));
            d0 d0Var = d0.HTTP_1_0;
            if (!kotlin.jvm.internal.l0.g(protocol, d0Var.protocol)) {
                d0Var = d0.HTTP_1_1;
                if (!kotlin.jvm.internal.l0.g(protocol, d0Var.protocol)) {
                    d0Var = d0.H2_PRIOR_KNOWLEDGE;
                    if (!kotlin.jvm.internal.l0.g(protocol, d0Var.protocol)) {
                        d0Var = d0.HTTP_2;
                        if (!kotlin.jvm.internal.l0.g(protocol, d0Var.protocol)) {
                            d0Var = d0.SPDY_3;
                            if (!kotlin.jvm.internal.l0.g(protocol, d0Var.protocol)) {
                                d0Var = d0.QUIC;
                                if (!kotlin.jvm.internal.l0.g(protocol, d0Var.protocol)) {
                                    throw new IOException(androidx.constraintlayout.motion.widget.g.a(ProtectedSandApp.s("彰"), protocol));
                                }
                            }
                        }
                    }
                }
            }
            return d0Var;
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    d0(String str) {
        this.protocol = str;
    }

    @d5.d
    @p3.n
    public static final d0 get(@d5.d String str) throws IOException {
        return INSTANCE.a(str);
    }

    @Override // java.lang.Enum
    @d5.d
    public String toString() {
        return this.protocol;
    }
}
