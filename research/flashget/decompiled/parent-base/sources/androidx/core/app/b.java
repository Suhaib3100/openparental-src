package androidx.core.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.SharedElementCallback;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.Display;
import android.view.DragEvent;
import android.view.View;
import androidx.annotation.c1;
import androidx.core.app.b;
import androidx.core.app.w0;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* compiled from: ActivityCompat.java */
/* loaded from: classes3.dex */
public class b extends androidx.core.content.d {

    /* renamed from: a, reason: collision with root package name */
    private static j f25410a;

    /* compiled from: ActivityCompat.java */
    class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String[] f25411b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Activity f25412c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f25413d;

        a(String[] strArr, Activity activity, int i4) {
            this.f25411b = strArr;
            this.f25412c = activity;
            this.f25413d = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            int[] iArr = new int[this.f25411b.length];
            PackageManager packageManager = this.f25412c.getPackageManager();
            String packageName = this.f25412c.getPackageName();
            int length = this.f25411b.length;
            for (int i4 = 0; i4 < length; i4++) {
                iArr[i4] = packageManager.checkPermission(this.f25411b[i4], packageName);
            }
            ((i) this.f25412c).onRequestPermissionsResult(this.f25413d, this.f25411b, iArr);
        }
    }

    /* compiled from: ActivityCompat.java */
    @androidx.annotation.x0(21)
    /* renamed from: androidx.core.app.b$b, reason: collision with other inner class name */
    static class C0401b {
        private C0401b() {
        }

        static void a(Activity activity) {
            activity.finishAfterTransition();
        }

        static void b(Activity activity) {
            activity.postponeEnterTransition();
        }

        static void c(Activity activity, SharedElementCallback sharedElementCallback) {
            activity.setEnterSharedElementCallback(sharedElementCallback);
        }

        static void d(Activity activity, SharedElementCallback sharedElementCallback) {
            activity.setExitSharedElementCallback(sharedElementCallback);
        }

        static void e(Activity activity) {
            activity.startPostponedEnterTransition();
        }
    }

    /* compiled from: ActivityCompat.java */
    @androidx.annotation.x0(22)
    static class c {
        private c() {
        }

        static Uri a(Activity activity) {
            return activity.getReferrer();
        }
    }

    /* compiled from: ActivityCompat.java */
    @androidx.annotation.x0(23)
    static class d {
        private d() {
        }

        static void a(Object obj) {
            ((SharedElementCallback.OnSharedElementsReadyListener) obj).onSharedElementsReady();
        }

        static void b(Activity activity, String[] strArr, int i4) {
            activity.requestPermissions(strArr, i4);
        }

        static boolean c(Activity activity, String str) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
    }

    /* compiled from: ActivityCompat.java */
    @androidx.annotation.x0(28)
    static class e {
        private e() {
        }

        static <T> T a(Activity activity, int i4) {
            return (T) activity.requireViewById(i4);
        }
    }

    /* compiled from: ActivityCompat.java */
    @androidx.annotation.x0(30)
    static class f {
        private f() {
        }

        static Display a(ContextWrapper contextWrapper) {
            return contextWrapper.getDisplay();
        }

        static void b(@androidx.annotation.o0 Activity activity, @androidx.annotation.q0 androidx.core.content.a0 a0Var, @androidx.annotation.q0 Bundle bundle) {
            activity.setLocusContext(a0Var == null ? null : a0Var.c(), bundle);
        }
    }

    /* compiled from: ActivityCompat.java */
    @androidx.annotation.x0(31)
    static class g {
        private g() {
        }

        static boolean a(@androidx.annotation.o0 Activity activity) {
            return activity.isLaunchedFromBubble();
        }

        @SuppressLint({"BanUncheckedReflection"})
        static boolean b(Activity activity, String str) {
            try {
                return ((Boolean) PackageManager.class.getMethod("shouldShowRequestPermissionRationale", String.class).invoke(activity.getApplication().getPackageManager(), str)).booleanValue();
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return activity.shouldShowRequestPermissionRationale(str);
            }
        }
    }

    /* compiled from: ActivityCompat.java */
    @androidx.annotation.x0(32)
    static class h {
        private h() {
        }

        static boolean a(Activity activity, String str) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
    }

    /* compiled from: ActivityCompat.java */
    public interface i {
        void onRequestPermissionsResult(int i4, @androidx.annotation.o0 String[] strArr, @androidx.annotation.o0 int[] iArr);
    }

    /* compiled from: ActivityCompat.java */
    public interface j {
        boolean a(@androidx.annotation.o0 Activity activity, @androidx.annotation.g0(from = 0) int i4, int i5, @androidx.annotation.q0 Intent intent);

        boolean b(@androidx.annotation.o0 Activity activity, @androidx.annotation.o0 String[] strArr, @androidx.annotation.g0(from = 0) int i4);
    }

    /* compiled from: ActivityCompat.java */
    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    public interface k {
        void validateRequestPermissionsRequestCode(int i4);
    }

    /* compiled from: ActivityCompat.java */
    @androidx.annotation.x0(21)
    static class l extends SharedElementCallback {

        /* renamed from: a, reason: collision with root package name */
        private final w0 f25414a;

        l(w0 w0Var) {
            this.f25414a = w0Var;
        }

        public static void a(SharedElementCallback.OnSharedElementsReadyListener onSharedElementsReadyListener) {
            onSharedElementsReadyListener.onSharedElementsReady();
        }

        private static void b(SharedElementCallback.OnSharedElementsReadyListener onSharedElementsReadyListener) {
            onSharedElementsReadyListener.onSharedElementsReady();
        }

        @Override // android.app.SharedElementCallback
        public Parcelable onCaptureSharedElementSnapshot(View view, Matrix matrix, RectF rectF) {
            return this.f25414a.b(view, matrix, rectF);
        }

        @Override // android.app.SharedElementCallback
        public View onCreateSnapshotView(Context context, Parcelable parcelable) {
            return this.f25414a.c(context, parcelable);
        }

        @Override // android.app.SharedElementCallback
        public void onMapSharedElements(List<String> list, Map<String, View> map) {
            this.f25414a.d(list, map);
        }

        @Override // android.app.SharedElementCallback
        public void onRejectSharedElements(List<View> list) {
            this.f25414a.e(list);
        }

        @Override // android.app.SharedElementCallback
        public void onSharedElementEnd(List<String> list, List<View> list2, List<View> list3) {
            this.f25414a.f(list, list2, list3);
        }

        @Override // android.app.SharedElementCallback
        public void onSharedElementStart(List<String> list, List<View> list2, List<View> list3) {
            this.f25414a.g(list, list2, list3);
        }

        @Override // android.app.SharedElementCallback
        @androidx.annotation.x0(23)
        public void onSharedElementsArrived(List<String> list, List<View> list2, final SharedElementCallback.OnSharedElementsReadyListener onSharedElementsReadyListener) {
            this.f25414a.h(list, list2, new w0.a() { // from class: androidx.core.app.c
                @Override // androidx.core.app.w0.a
                public final void a() {
                    b.l.a(onSharedElementsReadyListener);
                }
            });
        }
    }

    protected b() {
    }

    public static void b(@androidx.annotation.o0 Activity activity) {
        activity.finishAffinity();
    }

    public static void c(@androidx.annotation.o0 Activity activity) {
        activity.finishAfterTransition();
    }

    @androidx.annotation.q0
    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    public static j d() {
        return f25410a;
    }

    @androidx.annotation.q0
    public static Uri e(@androidx.annotation.o0 Activity activity) {
        return activity.getReferrer();
    }

    @Deprecated
    public static boolean f(Activity activity) {
        activity.invalidateOptionsMenu();
        return true;
    }

    public static boolean g(@androidx.annotation.o0 Activity activity) {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 31) {
            return g.a(activity);
        }
        if (i4 == 30) {
            return (f.a(activity) == null || f.a(activity).getDisplayId() == 0) ? false : true;
        }
        if (i4 == 29) {
            return (activity.getWindowManager().getDefaultDisplay() == null || activity.getWindowManager().getDefaultDisplay().getDisplayId() == 0) ? false : true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void h(Activity activity) {
        if (activity.isFinishing() || androidx.core.app.f.i(activity)) {
            return;
        }
        activity.recreate();
    }

    public static void i(@androidx.annotation.o0 Activity activity) {
        activity.postponeEnterTransition();
    }

    public static void j(@androidx.annotation.o0 final Activity activity) {
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
        } else {
            new Handler(activity.getMainLooper()).post(new Runnable() { // from class: androidx.core.app.a
                @Override // java.lang.Runnable
                public final void run() {
                    b.h(activity);
                }
            });
        }
    }

    @androidx.annotation.q0
    public static androidx.core.view.a0 k(@androidx.annotation.o0 Activity activity, @androidx.annotation.o0 DragEvent dragEvent) {
        return androidx.core.view.a0.b(activity, dragEvent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void l(@androidx.annotation.o0 Activity activity, @androidx.annotation.o0 String[] strArr, @androidx.annotation.g0(from = 0) int i4) {
        j jVar = f25410a;
        if (jVar == null || !jVar.b(activity, strArr, i4)) {
            HashSet hashSet = new HashSet();
            for (int i5 = 0; i5 < strArr.length; i5++) {
                if (TextUtils.isEmpty(strArr[i5])) {
                    throw new IllegalArgumentException(android.support.v4.media.c.a(new StringBuilder("Permission request for permissions "), Arrays.toString(strArr), " must not contain null or empty values"));
                }
                if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(strArr[i5], "android.permission.POST_NOTIFICATIONS")) {
                    hashSet.add(Integer.valueOf(i5));
                }
            }
            int size = hashSet.size();
            String[] strArr2 = size > 0 ? new String[strArr.length - size] : strArr;
            if (size > 0) {
                if (size == strArr.length) {
                    return;
                }
                int i6 = 0;
                for (int i7 = 0; i7 < strArr.length; i7++) {
                    if (!hashSet.contains(Integer.valueOf(i7))) {
                        strArr2[i6] = strArr[i7];
                        i6++;
                    }
                }
            }
            if (activity instanceof k) {
                ((k) activity).validateRequestPermissionsRequestCode(i4);
            }
            activity.requestPermissions(strArr, i4);
        }
    }

    @androidx.annotation.o0
    public static <T extends View> T m(@androidx.annotation.o0 Activity activity, @androidx.annotation.d0 int i4) {
        if (Build.VERSION.SDK_INT >= 28) {
            return (T) e.a(activity, i4);
        }
        T t4 = (T) activity.findViewById(i4);
        if (t4 != null) {
            return t4;
        }
        throw new IllegalArgumentException("ID does not reference a View inside this Activity");
    }

    public static void n(@androidx.annotation.o0 Activity activity, @androidx.annotation.q0 w0 w0Var) {
        activity.setEnterSharedElementCallback(w0Var != null ? new l(w0Var) : null);
    }

    public static void o(@androidx.annotation.o0 Activity activity, @androidx.annotation.q0 w0 w0Var) {
        activity.setExitSharedElementCallback(w0Var != null ? new l(w0Var) : null);
    }

    public static void p(@androidx.annotation.o0 Activity activity, @androidx.annotation.q0 androidx.core.content.a0 a0Var, @androidx.annotation.q0 Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 30) {
            f.b(activity, a0Var, bundle);
        }
    }

    public static void q(@androidx.annotation.q0 j jVar) {
        f25410a = jVar;
    }

    public static boolean r(@androidx.annotation.o0 Activity activity, @androidx.annotation.o0 String str) {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return i4 >= 32 ? activity.shouldShowRequestPermissionRationale(str) : i4 == 31 ? g.b(activity, str) : activity.shouldShowRequestPermissionRationale(str);
        }
        return false;
    }

    public static void s(@androidx.annotation.o0 Activity activity, @androidx.annotation.o0 Intent intent, int i4, @androidx.annotation.q0 Bundle bundle) {
        activity.startActivityForResult(intent, i4, bundle);
    }

    public static void t(@androidx.annotation.o0 Activity activity, @androidx.annotation.o0 IntentSender intentSender, int i4, @androidx.annotation.q0 Intent intent, int i5, int i6, int i7, @androidx.annotation.q0 Bundle bundle) throws IntentSender.SendIntentException {
        activity.startIntentSenderForResult(intentSender, i4, intent, i5, i6, i7, bundle);
    }

    public static void u(@androidx.annotation.o0 Activity activity) {
        activity.startPostponedEnterTransition();
    }
}
