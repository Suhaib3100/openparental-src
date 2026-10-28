package okhttp3;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.x0;

/* compiled from: TlsVersion.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\u0003\u0010\u0007j\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lokhttp3/i0;", "", "", "javaName", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "-deprecated_javaName", "()Ljava/lang/String;", "Ljava/lang/String;", "Companion", "a", "TLS_1_3", "TLS_1_2", "TLS_1_1", "TLS_1_0", "SSL_3_0", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes7.dex */
public enum i0 {
    TLS_1_3(ProtectedSandApp.s("齞\u0001")),
    TLS_1_2(ProtectedSandApp.s("齠\u0001")),
    TLS_1_1(ProtectedSandApp.s("齢\u0001")),
    TLS_1_0(ProtectedSandApp.s("齤\u0001")),
    SSL_3_0(ProtectedSandApp.s("齦\u0001"));


    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    @fg.l
    private final String javaName;

    /* compiled from: TlsVersion.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lokhttp3/i0$a;", "", "<init>", "()V", "", "javaName", "Lokhttp3/i0;", "a", "(Ljava/lang/String;)Lokhttp3/i0;", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: okhttp3.i0$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @fg.l
        @kd.n
        public final i0 a(@fg.l String javaName) {
            l0.p(javaName, ProtectedSandApp.s("齗\u0001"));
            int hashCode = javaName.hashCode();
            if (hashCode != 79201641) {
                if (hashCode != 79923350) {
                    switch (hashCode) {
                        case -503070503:
                            if (javaName.equals(ProtectedSandApp.s("齚\u0001"))) {
                                return i0.TLS_1_1;
                            }
                            break;
                        case -503070502:
                            if (javaName.equals(ProtectedSandApp.s("齙\u0001"))) {
                                return i0.TLS_1_2;
                            }
                            break;
                        case -503070501:
                            if (javaName.equals(ProtectedSandApp.s("齘\u0001"))) {
                                return i0.TLS_1_3;
                            }
                            break;
                    }
                } else if (javaName.equals(ProtectedSandApp.s("齛\u0001"))) {
                    return i0.TLS_1_0;
                }
            } else if (javaName.equals(ProtectedSandApp.s("齜\u0001"))) {
                return i0.SSL_3_0;
            }
            throw new IllegalArgumentException(ProtectedSandApp.s("齝\u0001").concat(javaName));
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    i0(String str) {
        this.javaName = str;
    }

    @fg.l
    @kd.n
    public static final i0 forJavaName(@fg.l String str) {
        return INSTANCE.a(str);
    }

    @fg.l
    @kotlin.k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @x0(expression = "javaName", imports = {}))
    @kd.i(name = "-deprecated_javaName")
    /* renamed from: -deprecated_javaName, reason: not valid java name and from getter */
    public final String getJavaName() {
        return this.javaName;
    }

    @fg.l
    @kd.i(name = "javaName")
    public final String javaName() {
        return this.javaName;
    }
}
