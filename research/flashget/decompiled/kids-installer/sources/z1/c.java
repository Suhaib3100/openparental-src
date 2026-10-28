package z1;

import android.os.Bundle;
import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: com.google.firebase:firebase-analytics-ktx@@21.3.0 */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0016\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\bJ\u0016\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\nJ\u0016\u0010\f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002J#\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\n0\r¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0010\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lz1/c;", "", "", "key", "", "value", "Lkotlin/m2;", "b", "", "c", "Landroid/os/Bundle;", "d", "e", "", "f", "(Ljava/lang/String;[Landroid/os/Bundle;)V", "bundle", "Landroid/os/Bundle;", "a", "()Landroid/os/Bundle;", "<init>", "()V", "java.com.google.android.libraries.firebase.firebase_analytics_ktx_granule"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    private final Bundle f34399a = new Bundle();

    @d5.d
    /* renamed from: a, reason: from getter */
    public final Bundle getF34399a() {
        return this.f34399a;
    }

    public final void b(@d5.d String str, double d6) {
        l0.p(str, ProtectedSandApp.s("ᯋ"));
        this.f34399a.putDouble(str, d6);
    }

    public final void c(@d5.d String str, long j5) {
        l0.p(str, ProtectedSandApp.s("ᯌ"));
        this.f34399a.putLong(str, j5);
    }

    public final void d(@d5.d String str, @d5.d Bundle bundle) {
        l0.p(str, ProtectedSandApp.s("ᯍ"));
        l0.p(bundle, ProtectedSandApp.s("ᯎ"));
        this.f34399a.putBundle(str, bundle);
    }

    public final void e(@d5.d String str, @d5.d String str2) {
        l0.p(str, ProtectedSandApp.s("ᯏ"));
        l0.p(str2, ProtectedSandApp.s("ᯐ"));
        this.f34399a.putString(str, str2);
    }

    public final void f(@d5.d String key, @d5.d Bundle[] value) {
        l0.p(key, ProtectedSandApp.s("ᯑ"));
        l0.p(value, ProtectedSandApp.s("ᯒ"));
        this.f34399a.putParcelableArray(key, value);
    }
}
