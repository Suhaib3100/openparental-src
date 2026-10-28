package okhttp3;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import kotlin.Metadata;

/* compiled from: Credentials.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\"\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0007¨\u0006\n"}, d2 = {"Lokhttp3/o;", "", "", "username", "password", "Ljava/nio/charset/Charset;", "charset", "b", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes5.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public static final o f31504a = new o();

    private o() {
    }

    @d5.d
    @p3.j
    @p3.n
    public static final String a(@d5.d String str, @d5.d String str2) {
        return c(str, str2, null, 4, null);
    }

    @d5.d
    @p3.j
    @p3.n
    public static final String b(@d5.d String username, @d5.d String password, @d5.d Charset charset) {
        kotlin.jvm.internal.l0.p(username, ProtectedSandApp.s("暒"));
        kotlin.jvm.internal.l0.p(password, ProtectedSandApp.s("暓"));
        kotlin.jvm.internal.l0.p(charset, ProtectedSandApp.s("暔"));
        return androidx.constraintlayout.motion.widget.g.a(ProtectedSandApp.s("暕"), okio.p.INSTANCE.j(username + ':' + password, charset).l());
    }

    public static /* synthetic */ String c(String str, String str2, Charset charset, int i5, Object obj) {
        if ((i5 & 4) != 0) {
            charset = StandardCharsets.ISO_8859_1;
            kotlin.jvm.internal.l0.o(charset, ProtectedSandApp.s("暖"));
        }
        return b(str, str2, charset);
    }
}
