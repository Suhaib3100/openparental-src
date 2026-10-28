package da;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.annotation.m1;
import androidx.core.content.d;
import com.flashget.parentalcontrol.ProtectedSandApp;
import v9.c;

/* compiled from: DataCollectionConfigStorage.java */
/* loaded from: classes6.dex */
public class a {

    /* renamed from: e, reason: collision with root package name */
    private static final String f73643e = ProtectedSandApp.s("㜉\u0001");

    /* renamed from: f, reason: collision with root package name */
    @m1
    public static final String f73644f = ProtectedSandApp.s("㜊\u0001");

    /* renamed from: a, reason: collision with root package name */
    private final Context f73645a;

    /* renamed from: b, reason: collision with root package name */
    private final SharedPreferences f73646b;

    /* renamed from: c, reason: collision with root package name */
    private final c f73647c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f73648d;

    public a(Context context, String str, c cVar) {
        Context createDeviceProtectedStorageContext = d.createDeviceProtectedStorageContext(context);
        this.f73645a = createDeviceProtectedStorageContext;
        this.f73646b = createDeviceProtectedStorageContext.getSharedPreferences(ProtectedSandApp.s("㜉\u0001") + str, 0);
        this.f73647c = cVar;
        this.f73648d = c();
    }

    private static Context a(Context context) {
        return d.createDeviceProtectedStorageContext(context);
    }

    private boolean c() {
        SharedPreferences sharedPreferences = this.f73646b;
        String s4 = ProtectedSandApp.s("㜊\u0001");
        return sharedPreferences.contains(s4) ? this.f73646b.getBoolean(s4, true) : d();
    }

    private boolean d() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        String s4 = ProtectedSandApp.s("㜊\u0001");
        try {
            PackageManager packageManager = this.f73645a.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(this.f73645a.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey(s4)) {
                return true;
            }
            return applicationInfo.metaData.getBoolean(s4);
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }

    private synchronized void f(boolean z4) {
        if (this.f73648d != z4) {
            this.f73648d = z4;
            this.f73647c.b(new v9.a<>(com.google.firebase.c.class, new com.google.firebase.c(z4)));
        }
    }

    public synchronized boolean b() {
        return this.f73648d;
    }

    public synchronized void e(Boolean bool) {
        try {
            if (bool == null) {
                this.f73646b.edit().remove(ProtectedSandApp.s("㜊\u0001")).apply();
                f(d());
            } else {
                boolean equals = Boolean.TRUE.equals(bool);
                this.f73646b.edit().putBoolean(ProtectedSandApp.s("㜊\u0001"), equals).apply();
                f(equals);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
