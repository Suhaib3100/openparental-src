package retrofit2;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Objects;

/* loaded from: classes9.dex */
public class HttpException extends RuntimeException {

    /* renamed from: b, reason: collision with root package name */
    private final int f89874b;

    /* renamed from: c, reason: collision with root package name */
    private final String f89875c;

    /* renamed from: d, reason: collision with root package name */
    private final transient x<?> f89876d;

    public HttpException(x<?> xVar) {
        super(b(xVar));
        this.f89874b = xVar.b();
        this.f89875c = xVar.h();
        this.f89876d = xVar;
    }

    private static String b(x<?> xVar) {
        Objects.requireNonNull(xVar, ProtectedSandApp.s("ꖚ\u0001"));
        return ProtectedSandApp.s("ꖛ\u0001") + xVar.b() + ProtectedSandApp.s("ꖜ\u0001") + xVar.h();
    }

    public int a() {
        return this.f89874b;
    }

    public String c() {
        return this.f89875c;
    }

    @zc.h
    public x<?> d() {
        return this.f89876d;
    }
}
