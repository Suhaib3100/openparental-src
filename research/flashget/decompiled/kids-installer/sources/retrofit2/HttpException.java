package retrofit2;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Objects;
import javax.annotation.Nullable;

/* loaded from: classes5.dex */
public class HttpException extends RuntimeException {

    /* renamed from: o, reason: collision with root package name */
    private final int f32958o;

    /* renamed from: p, reason: collision with root package name */
    private final String f32959p;

    /* renamed from: q, reason: collision with root package name */
    private final transient v<?> f32960q;

    public HttpException(v<?> vVar) {
        super(b(vVar));
        this.f32958o = vVar.b();
        this.f32959p = vVar.h();
        this.f32960q = vVar;
    }

    private static String b(v<?> vVar) {
        Objects.requireNonNull(vVar, ProtectedSandApp.s("椧"));
        return ProtectedSandApp.s("椨") + vVar.b() + ProtectedSandApp.s("椩") + vVar.h();
    }

    public int a() {
        return this.f32958o;
    }

    public String c() {
        return this.f32959p;
    }

    @Nullable
    public v<?> d() {
        return this.f32960q;
    }
}
