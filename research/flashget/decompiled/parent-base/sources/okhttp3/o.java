package okhttp3;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: Credentials.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lokhttp3/o;", "", "<init>", "()V", "", "username", "password", "Ljava/nio/charset/Charset;", "charset", "b", "(Ljava/lang/String;Ljava/lang/String;Ljava/nio/charset/Charset;)Ljava/lang/String;", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes7.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public static final o f85048a = new o();

    private o() {
    }

    @fg.l
    @kd.j
    @kd.n
    public static final String a(@fg.l String str, @fg.l String str2) {
        return c(str, str2, null, 4, null);
    }

    @fg.l
    @kd.j
    @kd.n
    public static final String b(@fg.l String username, @fg.l String password, @fg.l Charset charset) {
        l0.p(username, ProtectedSandApp.s("ꇱ\u0001"));
        l0.p(password, ProtectedSandApp.s("ꇲ\u0001"));
        l0.p(charset, ProtectedSandApp.s("ꇳ\u0001"));
        return androidx.constraintlayout.core.motion.key.c.a(ProtectedSandApp.s("ꇴ\u0001"), okio.p.INSTANCE.j(username + ':' + password, charset).d());
    }

    public static /* synthetic */ String c(String str, String str2, Charset charset, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            charset = StandardCharsets.ISO_8859_1;
            l0.o(charset, ProtectedSandApp.s("ꇵ\u0001"));
        }
        return b(str, str2, charset);
    }
}
