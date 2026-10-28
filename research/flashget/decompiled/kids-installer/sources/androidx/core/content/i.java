package androidx.core.content;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import androidx.annotation.o0;
import androidx.annotation.x0;

/* compiled from: IntentCompat.java */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    @SuppressLint({"ActionValue"})
    public static final String f4536a = "android.intent.action.CREATE_REMINDER";

    /* renamed from: b, reason: collision with root package name */
    public static final String f4537b = "android.intent.extra.HTML_TEXT";

    /* renamed from: c, reason: collision with root package name */
    public static final String f4538c = "android.intent.extra.START_PLAYBACK";

    /* renamed from: d, reason: collision with root package name */
    @SuppressLint({"ActionValue"})
    public static final String f4539d = "android.intent.extra.TIME";

    /* renamed from: e, reason: collision with root package name */
    public static final String f4540e = "android.intent.category.LEANBACK_LAUNCHER";

    /* compiled from: IntentCompat.java */
    @x0(15)
    static class a {
        private a() {
        }

        @androidx.annotation.u
        static Intent a(String str, String str2) {
            return Intent.makeMainSelectorActivity(str, str2);
        }
    }

    private i() {
    }

    @o0
    public static Intent a(@o0 Context context, @o0 String str) {
        if (!q.a(context.getPackageManager())) {
            throw new UnsupportedOperationException("Unused App Restriction features are not available on this device");
        }
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 31) {
            return new Intent("android.settings.APPLICATION_DETAILS_SETTINGS").setData(Uri.fromParts("package", str, null));
        }
        Intent data = new Intent("android.intent.action.AUTO_REVOKE_PERMISSIONS").setData(Uri.fromParts("package", str, null));
        if (i5 >= 30) {
            return data;
        }
        String b6 = q.b(context.getPackageManager());
        b6.getClass();
        return data.setPackage(b6);
    }

    @o0
    public static Intent b(@o0 String str, @o0 String str2) {
        return a.a(str, str2);
    }
}
