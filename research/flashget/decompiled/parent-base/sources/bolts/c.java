package bolts;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Locale;
import java.util.concurrent.CancellationException;

/* compiled from: CancellationToken.java */
/* loaded from: classes3.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private final e f36864a;

    c(e eVar) {
        this.f36864a = eVar;
    }

    public boolean a() {
        return this.f36864a.h();
    }

    public d b(Runnable runnable) {
        return this.f36864a.k(runnable);
    }

    public void c() throws CancellationException {
        this.f36864a.l();
    }

    public String toString() {
        return String.format(Locale.US, ProtectedSandApp.s("Ú"), getClass().getName(), Integer.toHexString(hashCode()), Boolean.toString(this.f36864a.h()));
    }
}
