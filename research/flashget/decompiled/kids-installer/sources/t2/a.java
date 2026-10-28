package t2;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.annotation.m1;
import androidx.core.content.d;
import com.flashget.kidsdownloader.ProtectedSandApp;
import l2.c;

/* compiled from: DataCollectionConfigStorage.java */
/* loaded from: classes2.dex */
public class a {

    /* renamed from: e, reason: collision with root package name */
    private static final String f33446e = ProtectedSandApp.s("᭻");

    /* renamed from: f, reason: collision with root package name */
    @m1
    public static final String f33447f = ProtectedSandApp.s("᭼");

    /* renamed from: a, reason: collision with root package name */
    private final Context f33448a;

    /* renamed from: b, reason: collision with root package name */
    private final SharedPreferences f33449b;

    /* renamed from: c, reason: collision with root package name */
    private final c f33450c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f33451d;

    public a(Context context, String str, c cVar) {
        Context b6 = d.b(context);
        this.f33448a = b6;
        this.f33449b = b6.getSharedPreferences(ProtectedSandApp.s("᭶") + str, 0);
        this.f33450c = cVar;
        this.f33451d = c();
    }

    private static Context a(Context context) {
        return d.b(context);
    }

    private boolean c() {
        SharedPreferences sharedPreferences = this.f33449b;
        String s5 = ProtectedSandApp.s("᭷");
        return sharedPreferences.contains(s5) ? this.f33449b.getBoolean(s5, true) : d();
    }

    private boolean d() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        String s5 = ProtectedSandApp.s("᭸");
        try {
            PackageManager packageManager = this.f33448a.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(this.f33448a.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey(s5)) {
                return true;
            }
            return applicationInfo.metaData.getBoolean(s5);
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }

    private synchronized void f(boolean z5) {
        if (this.f33451d != z5) {
            this.f33451d = z5;
            this.f33450c.c(new l2.a<>(com.google.firebase.c.class, new com.google.firebase.c(z5)));
        }
    }

    public synchronized boolean b() {
        return this.f33451d;
    }

    public synchronized void e(Boolean bool) {
        if (bool == null) {
            this.f33449b.edit().remove(ProtectedSandApp.s("᭹")).apply();
            f(d());
        } else {
            boolean equals = Boolean.TRUE.equals(bool);
            this.f33449b.edit().putBoolean(ProtectedSandApp.s("᭺"), equals).apply();
            f(equals);
        }
    }
}
