package androidx.core.content;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.x0;
import java.io.Serializable;
import java.util.ArrayList;

/* compiled from: IntentCompat.java */
/* loaded from: classes3.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    @SuppressLint({"ActionValue"})
    public static final String f25979a = "android.intent.action.CREATE_REMINDER";

    /* renamed from: b, reason: collision with root package name */
    public static final String f25980b = "android.intent.extra.HTML_TEXT";

    /* renamed from: c, reason: collision with root package name */
    public static final String f25981c = "android.intent.extra.START_PLAYBACK";

    /* renamed from: d, reason: collision with root package name */
    @SuppressLint({"ActionValue"})
    public static final String f25982d = "android.intent.extra.TIME";

    /* renamed from: e, reason: collision with root package name */
    public static final String f25983e = "android.intent.category.LEANBACK_LAUNCHER";

    /* compiled from: IntentCompat.java */
    @x0(33)
    static class a {
        private a() {
        }

        static <T> T[] a(@o0 Intent intent, @q0 String str, @o0 Class<T> cls) {
            return (T[]) intent.getParcelableArrayExtra(str, cls);
        }

        static <T> ArrayList<T> b(@o0 Intent intent, @q0 String str, @o0 Class<? extends T> cls) {
            return intent.getParcelableArrayListExtra(str, cls);
        }

        static <T> T c(@o0 Intent intent, @q0 String str, @o0 Class<T> cls) {
            return (T) intent.getParcelableExtra(str, cls);
        }

        static <T extends Serializable> T d(@o0 Intent intent, @q0 String str, @o0 Class<T> cls) {
            return (T) intent.getSerializableExtra(str, cls);
        }
    }

    private h() {
    }

    @o0
    public static Intent a(@o0 Context context, @o0 String str) {
        if (!f0.a(context.getPackageManager())) {
            throw new UnsupportedOperationException("Unused App Restriction features are not available on this device");
        }
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 31) {
            return new Intent("android.settings.APPLICATION_DETAILS_SETTINGS").setData(Uri.fromParts("package", str, null));
        }
        Intent data = new Intent("android.intent.action.AUTO_REVOKE_PERMISSIONS").setData(Uri.fromParts("package", str, null));
        if (i4 >= 30) {
            return data;
        }
        String b5 = f0.b(context.getPackageManager());
        b5.getClass();
        return data.setPackage(b5);
    }

    @q0
    @SuppressLint({"ArrayReturn", "NullableCollection"})
    public static Parcelable[] b(@o0 Intent intent, @q0 String str, @o0 Class<? extends Parcelable> cls) {
        return Build.VERSION.SDK_INT >= 34 ? (Parcelable[]) a.a(intent, str, cls) : intent.getParcelableArrayExtra(str);
    }

    @q0
    @SuppressLint({"ConcreteCollection", "NullableCollection"})
    public static <T> ArrayList<T> c(@o0 Intent intent, @q0 String str, @o0 Class<? extends T> cls) {
        return Build.VERSION.SDK_INT >= 34 ? a.b(intent, str, cls) : intent.getParcelableArrayListExtra(str);
    }

    @q0
    public static <T> T d(@o0 Intent intent, @q0 String str, @o0 Class<T> cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            return (T) a.c(intent, str, cls);
        }
        T t4 = (T) intent.getParcelableExtra(str);
        if (cls.isInstance(t4)) {
            return t4;
        }
        return null;
    }

    @q0
    public static <T extends Serializable> T e(@o0 Intent intent, @q0 String str, @o0 Class<T> cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            return (T) a.d(intent, str, cls);
        }
        T t4 = (T) intent.getSerializableExtra(str);
        if (cls.isInstance(t4)) {
            return t4;
        }
        return null;
    }

    @o0
    public static Intent f(@o0 String str, @o0 String str2) {
        return Intent.makeMainSelectorActivity(str, str2);
    }
}
