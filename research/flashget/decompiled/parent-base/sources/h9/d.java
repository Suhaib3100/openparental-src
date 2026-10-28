package h9;

import android.os.Bundle;
import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.k;

/* compiled from: com.google.android.gms:play-services-measurement-api@@22.1.2 */
@k(message = "Migrate to use the KTX API from the main module: https://firebase.google.com/docs/android/kotlin-migration.")
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J%\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0013H\u0007¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0016\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lh9/d;", "", "<init>", "()V", "", "key", "", "value", "Lkotlin/k2;", "b", "(Ljava/lang/String;D)V", "", "c", "(Ljava/lang/String;J)V", "Landroid/os/Bundle;", "d", "(Ljava/lang/String;Landroid/os/Bundle;)V", "e", "(Ljava/lang/String;Ljava/lang/String;)V", "", "f", "(Ljava/lang/String;[Landroid/os/Bundle;)V", "bundle", "Landroid/os/Bundle;", "a", "()Landroid/os/Bundle;", "java.com.google.android.gmscore.integ.client.measurement_api_measurement_api"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @l
    private final Bundle f74118a = new Bundle();

    @l
    /* renamed from: a, reason: from getter */
    public final Bundle getF74118a() {
        return this.f74118a;
    }

    @k(message = "Migrate to use the KTX API from the main module: https://firebase.google.com/docs/android/kotlin-migration.")
    public final void b(@o0 String key, double value) {
        l0.p(key, ProtectedSandApp.s("㟼\u0001"));
        this.f74118a.putDouble(key, value);
    }

    @k(message = "Migrate to use the KTX API from the main module: https://firebase.google.com/docs/android/kotlin-migration.")
    public final void c(@o0 String key, long value) {
        l0.p(key, ProtectedSandApp.s("㟼\u0001"));
        this.f74118a.putLong(key, value);
    }

    @k(message = "Migrate to use the KTX API from the main module: https://firebase.google.com/docs/android/kotlin-migration.")
    public final void d(@o0 String key, @o0 Bundle value) {
        l0.p(key, ProtectedSandApp.s("㟼\u0001"));
        l0.p(value, ProtectedSandApp.s("㟽\u0001"));
        this.f74118a.putBundle(key, value);
    }

    @k(message = "Migrate to use the KTX API from the main module: https://firebase.google.com/docs/android/kotlin-migration.")
    public final void e(@o0 String key, @o0 String value) {
        l0.p(key, ProtectedSandApp.s("㟼\u0001"));
        l0.p(value, ProtectedSandApp.s("㟽\u0001"));
        this.f74118a.putString(key, value);
    }

    @k(message = "Migrate to use the KTX API from the main module: https://firebase.google.com/docs/android/kotlin-migration.")
    public final void f(@o0 String key, @o0 Bundle[] value) {
        l0.p(key, ProtectedSandApp.s("㟼\u0001"));
        l0.p(value, ProtectedSandApp.s("㟽\u0001"));
        this.f74118a.putParcelableArray(key, value);
    }
}
