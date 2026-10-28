package yd;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;

/* compiled from: TargetPlatform.kt */
/* loaded from: classes8.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    @l
    private final String f93402a;

    /* renamed from: b, reason: collision with root package name */
    @l
    private final d f93403b;

    @l
    public String a() {
        return b().a();
    }

    @l
    public d b() {
        return this.f93403b;
    }

    @l
    public String toString() {
        String a5 = a();
        if (a5.length() <= 0) {
            return this.f93402a;
        }
        return this.f93402a + ProtectedSandApp.s("ꍎ\u0001") + a5 + ')';
    }
}
