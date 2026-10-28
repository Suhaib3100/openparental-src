package d4;

import com.flashget.kidsdownloader.ProtectedSandApp;

/* compiled from: TargetPlatform.kt */
/* loaded from: classes5.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    private final String f22333a;

    /* renamed from: b, reason: collision with root package name */
    @d5.d
    private final d f22334b;

    @d5.d
    public String a() {
        return b().a();
    }

    @d5.d
    public d b() {
        return this.f22334b;
    }

    @d5.d
    public String toString() {
        String a6 = a();
        if (!(a6.length() > 0)) {
            return this.f22333a;
        }
        return this.f22333a + ProtectedSandApp.s("㚘") + a6 + ')';
    }
}
