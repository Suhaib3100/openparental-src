package androidx.media;

import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageManager;
import android.provider.Settings;
import android.text.TextUtils;
import androidx.annotation.o0;
import androidx.media.h;
import java.util.Objects;

/* compiled from: MediaSessionManagerImplBase.java */
/* loaded from: classes3.dex */
class q implements h.a {

    /* renamed from: a, reason: collision with root package name */
    Context f30786a;

    /* renamed from: b, reason: collision with root package name */
    ContentResolver f30787b;

    /* renamed from: c, reason: collision with root package name */
    private static final String f30781c = "MediaSessionManager";

    /* renamed from: e, reason: collision with root package name */
    private static final String f30783e = "android.permission.STATUS_BAR_SERVICE";

    /* renamed from: f, reason: collision with root package name */
    private static final String f30784f = "android.permission.MEDIA_CONTENT_CONTROL";

    /* renamed from: g, reason: collision with root package name */
    private static final String f30785g = "enabled_notification_listeners";

    /* renamed from: d, reason: collision with root package name */
    private static final boolean f30782d = h.f30773c;

    /* compiled from: MediaSessionManagerImplBase.java */
    static class a implements h.c {

        /* renamed from: a, reason: collision with root package name */
        private String f30788a;

        /* renamed from: b, reason: collision with root package name */
        private int f30789b;

        /* renamed from: c, reason: collision with root package name */
        private int f30790c;

        a(String str, int i4, int i5) {
            this.f30788a = str;
            this.f30789b = i4;
            this.f30790c = i5;
        }

        @Override // androidx.media.h.c
        public int a() {
            return this.f30790c;
        }

        @Override // androidx.media.h.c
        public int b() {
            return this.f30789b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return TextUtils.equals(this.f30788a, aVar.f30788a) && this.f30789b == aVar.f30789b && this.f30790c == aVar.f30790c;
        }

        @Override // androidx.media.h.c
        public String getPackageName() {
            return this.f30788a;
        }

        public int hashCode() {
            return Objects.hash(this.f30788a, Integer.valueOf(this.f30789b), Integer.valueOf(this.f30790c));
        }
    }

    q(Context context) {
        this.f30786a = context;
        this.f30787b = context.getContentResolver();
    }

    private boolean c(h.c cVar, String str) {
        return cVar.b() < 0 ? this.f30786a.getPackageManager().checkPermission(str, cVar.getPackageName()) == 0 : this.f30786a.checkPermission(str, cVar.b(), cVar.a()) == 0;
    }

    @Override // androidx.media.h.a
    public boolean a(@o0 h.c cVar) {
        try {
            if (this.f30786a.getPackageManager().getApplicationInfo(cVar.getPackageName(), 0).uid == cVar.a()) {
                return c(cVar, "android.permission.STATUS_BAR_SERVICE") || c(cVar, "android.permission.MEDIA_CONTENT_CONTROL") || cVar.a() == 1000 || b(cVar);
            }
            if (f30782d) {
                cVar.getPackageName();
                cVar.a();
            }
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
            if (f30782d) {
                cVar.getPackageName();
            }
            return false;
        }
    }

    boolean b(@o0 h.c cVar) {
        String string = Settings.Secure.getString(this.f30787b, "enabled_notification_listeners");
        if (string != null) {
            for (String str : string.split(":")) {
                ComponentName unflattenFromString = ComponentName.unflattenFromString(str);
                if (unflattenFromString != null && unflattenFromString.getPackageName().equals(cVar.getPackageName())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // androidx.media.h.a
    public Context getContext() {
        return this.f30786a;
    }
}
