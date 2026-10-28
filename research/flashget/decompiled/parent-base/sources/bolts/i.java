package bolts;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: TaskCompletionSource.java */
/* loaded from: classes3.dex */
public class i<TResult> {

    /* renamed from: a, reason: collision with root package name */
    private final h<TResult> f36942a = new h<>();

    public h<TResult> a() {
        return this.f36942a;
    }

    public void b() {
        if (!e()) {
            throw new IllegalStateException(ProtectedSandApp.s("à"));
        }
    }

    public void c(Exception exc) {
        if (!f(exc)) {
            throw new IllegalStateException(ProtectedSandApp.s("á"));
        }
    }

    public void d(TResult tresult) {
        if (!g(tresult)) {
            throw new IllegalStateException(ProtectedSandApp.s("â"));
        }
    }

    public boolean e() {
        return this.f36942a.V();
    }

    public boolean f(Exception exc) {
        return this.f36942a.W(exc);
    }

    public boolean g(TResult tresult) {
        return this.f36942a.X(tresult);
    }
}
