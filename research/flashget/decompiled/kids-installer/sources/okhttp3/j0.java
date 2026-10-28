package okhttp3;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;

/* compiled from: TlsVersion.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\u0005\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0005\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004j\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lokhttp3/j0;", "", "", "-deprecated_javaName", "()Ljava/lang/String;", "javaName", "Ljava/lang/String;", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Companion", "a", "TLS_1_3", "TLS_1_2", "TLS_1_1", "TLS_1_0", "SSL_3_0", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes5.dex */
public enum j0 {
    TLS_1_3(ProtectedSandApp.s("昞")),
    TLS_1_2(ProtectedSandApp.s("映")),
    TLS_1_1(ProtectedSandApp.s("昢")),
    TLS_1_0(ProtectedSandApp.s("昤")),
    SSL_3_0(ProtectedSandApp.s("昦"));


    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @d5.d
    private final String javaName;

    /* compiled from: TlsVersion.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\b"}, d2 = {"Lokhttp3/j0$a;", "", "", "javaName", "Lokhttp3/j0;", "a", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: okhttp3.j0$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @d5.d
        @p3.n
        public final j0 a(@d5.d String javaName) {
            kotlin.jvm.internal.l0.p(javaName, ProtectedSandApp.s("昖"));
            int hashCode = javaName.hashCode();
            if (hashCode != 79201641) {
                if (hashCode != 79923350) {
                    switch (hashCode) {
                        case -503070503:
                            if (javaName.equals(ProtectedSandApp.s("昙"))) {
                                return j0.TLS_1_1;
                            }
                            break;
                        case -503070502:
                            if (javaName.equals(ProtectedSandApp.s("昘"))) {
                                return j0.TLS_1_2;
                            }
                            break;
                        case -503070501:
                            if (javaName.equals(ProtectedSandApp.s("昗"))) {
                                return j0.TLS_1_3;
                            }
                            break;
                    }
                } else if (javaName.equals(ProtectedSandApp.s("昚"))) {
                    return j0.TLS_1_0;
                }
            } else if (javaName.equals(ProtectedSandApp.s("昛"))) {
                return j0.SSL_3_0;
            }
            throw new IllegalArgumentException(ProtectedSandApp.s("昜").concat(javaName));
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    j0(String str) {
        this.javaName = str;
    }

    @d5.d
    @p3.n
    public static final j0 forJavaName(@d5.d String str) {
        return INSTANCE.a(str);
    }

    @p3.i(name = "-deprecated_javaName")
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "javaName", imports = {}))
    @d5.d
    /* renamed from: -deprecated_javaName, reason: not valid java name and from getter */
    public final String getJavaName() {
        return this.javaName;
    }

    @p3.i(name = "javaName")
    @d5.d
    public final String javaName() {
        return this.javaName;
    }
}
