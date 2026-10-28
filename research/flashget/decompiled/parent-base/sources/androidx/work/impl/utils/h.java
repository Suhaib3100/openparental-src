package androidx.work.impl.utils;

import android.content.ComponentName;
import android.content.Context;
import androidx.annotation.o0;

/* compiled from: PackageManagerHelper.java */
/* loaded from: classes3.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    private static final String f36489a = androidx.work.s.f("PackageManagerHelper");

    private h() {
    }

    public static boolean a(Context context, Class<?> klazz) {
        return b(context, klazz.getName());
    }

    public static boolean b(Context context, String className) {
        return context.getPackageManager().getComponentEnabledSetting(new ComponentName(context, className)) == 1;
    }

    public static void c(@o0 Context context, @o0 Class<?> klazz, boolean enabled) {
        try {
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, klazz.getName()), enabled ? 1 : 2, 1);
            androidx.work.s.c().a(f36489a, String.format("%s %s", klazz.getName(), enabled ? "enabled" : "disabled"), new Throwable[0]);
        } catch (Exception e4) {
            androidx.work.s.c().a(f36489a, String.format("%s could not be %s", klazz.getName(), enabled ? "enabled" : "disabled"), e4);
        }
    }
}
