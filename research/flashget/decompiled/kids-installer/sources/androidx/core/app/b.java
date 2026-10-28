package androidx.core.app;

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
import android.view.KeyEvent;
import android.view.View;
import androidx.annotation.c1;
import androidx.core.app.b;
import androidx.core.app.f5;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* compiled from: ActivityCompat.java */
/* loaded from: classes3.dex */
public class b extends androidx.core.content.d {

    /* renamed from: e, reason: collision with root package name */
    private static j f4012e;

    /* compiled from: ActivityCompat.java */
    /* loaded from: classes.dex */
    class a implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ String[] f4013o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ Activity f4014p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ int f4015q;

        a(String[] strArr, Activity activity, int i5) {
            this.f4013o = strArr;
            this.f4014p = activity;
            this.f4015q = i5;
        }

        @Override // java.lang.Runnable
        public void run() {
            int[] iArr = new int[this.f4013o.length];
            PackageManager packageManager = this.f4014p.getPackageManager();
            String packageName = this.f4014p.getPackageName();
            int length = this.f4013o.length;
            for (int i5 = 0; i5 < length; i5++) {
                iArr[i5] = packageManager.checkPermission(this.f4013o[i5], packageName);
            }
            ((i) this.f4014p).onRequestPermissionsResult(this.f4015q, this.f4013o, iArr);
        }
    }

    /* compiled from: ActivityCompat.java */
    @androidx.annotation.x0(16)
    /* renamed from: androidx.core.app.b$b, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static class C0027b {
        private C0027b() {
        }

        @androidx.annotation.u
        static void a(Activity activity) {
            activity.finishAffinity();
        }

        @androidx.annotation.u
        static void b(Activity activity, Intent intent, int i5, Bundle bundle) {
            activity.startActivityForResult(intent, i5, bundle);
        }

        @androidx.annotation.u
        static void c(Activity activity, IntentSender intentSender, int i5, Intent intent, int i6, int i7, int i8, Bundle bundle) throws IntentSender.SendIntentException {
            activity.startIntentSenderForResult(intentSender, i5, intent, i6, i7, i8, bundle);
        }
    }

    /* compiled from: ActivityCompat.java */
    @androidx.annotation.x0(21)
    /* loaded from: classes.dex */
    static class c {
        private c() {
        }

        @androidx.annotation.u
        static void a(Activity activity) {
            activity.finishAfterTransition();
        }

        @androidx.annotation.u
        static void b(Activity activity) {
            activity.postponeEnterTransition();
        }

        @androidx.annotation.u
        static void c(Activity activity, SharedElementCallback sharedElementCallback) {
            activity.setEnterSharedElementCallback(sharedElementCallback);
        }

        @androidx.annotation.u
        static void d(Activity activity, SharedElementCallback sharedElementCallback) {
            activity.setExitSharedElementCallback(sharedElementCallback);
        }

        @androidx.annotation.u
        static void e(Activity activity) {
            activity.startPostponedEnterTransition();
        }
    }

    /* compiled from: ActivityCompat.java */
    @androidx.annotation.x0(22)
    /* loaded from: classes.dex */
    static class d {
        private d() {
        }

        @androidx.annotation.u
        static Uri a(Activity activity) {
            return activity.getReferrer();
        }
    }

    /* compiled from: ActivityCompat.java */
    @androidx.annotation.x0(23)
    /* loaded from: classes.dex */
    static class e {
        private e() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @androidx.annotation.u
        public static void a(Object obj) {
            ((SharedElementCallback.OnSharedElementsReadyListener) obj).onSharedElementsReady();
        }

        @androidx.annotation.u
        static void b(Activity activity, String[] strArr, int i5) {
            activity.requestPermissions(strArr, i5);
        }

        @androidx.annotation.u
        static boolean c(Activity activity, String str) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
    }

    /* compiled from: ActivityCompat.java */
    @androidx.annotation.x0(28)
    /* loaded from: classes.dex */
    static class f {
        private f() {
        }

        @androidx.annotation.u
        static <T> T a(Activity activity, int i5) {
            KeyEvent.Callback requireViewById;
            requireViewById = activity.requireViewById(i5);
            return (T) requireViewById;
        }
    }

    /* compiled from: ActivityCompat.java */
    @androidx.annotation.x0(30)
    /* loaded from: classes.dex */
    static class g {
        private g() {
        }

        @androidx.annotation.u
        static Display a(ContextWrapper contextWrapper) {
            Display display;
            display = contextWrapper.getDisplay();
            return display;
        }

        @androidx.annotation.u
        static void b(@androidx.annotation.o0 Activity activity, @androidx.annotation.q0 androidx.core.content.k kVar, @androidx.annotation.q0 Bundle bundle) {
            activity.setLocusContext(kVar == null ? null : kVar.c(), bundle);
        }
    }

    /* compiled from: ActivityCompat.java */
    @androidx.annotation.x0(31)
    /* loaded from: classes.dex */
    static class h {
        private h() {
        }

        @androidx.annotation.u
        static boolean a(@androidx.annotation.o0 Activity activity) {
            boolean isLaunchedFromBubble;
            isLaunchedFromBubble = activity.isLaunchedFromBubble();
            return isLaunchedFromBubble;
        }
    }

    /* compiled from: ActivityCompat.java */
    /* loaded from: classes.dex */
    public interface i {
        void onRequestPermissionsResult(int i5, @androidx.annotation.o0 String[] strArr, @androidx.annotation.o0 int[] iArr);
    }

    /* compiled from: ActivityCompat.java */
    /* loaded from: classes.dex */
    public interface j {
        boolean a(@androidx.annotation.o0 Activity activity, @androidx.annotation.g0(from = 0) int i5, int i6, @androidx.annotation.q0 Intent intent);

        boolean b(@androidx.annotation.o0 Activity activity, @androidx.annotation.o0 String[] strArr, @androidx.annotation.g0(from = 0) int i5);
    }

    /* compiled from: ActivityCompat.java */
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes.dex */
    public interface k {
        void b(int i5);
    }

    /* compiled from: ActivityCompat.java */
    @androidx.annotation.x0(21)
    /* loaded from: classes.dex */
    static class l extends SharedElementCallback {

        /* renamed from: a, reason: collision with root package name */
        private final f5 f4016a;

        l(f5 f5Var) {
            this.f4016a = f5Var;
        }

        @Override // android.app.SharedElementCallback
        public Parcelable onCaptureSharedElementSnapshot(View view, Matrix matrix, RectF rectF) {
            return this.f4016a.b(view, matrix, rectF);
        }

        @Override // android.app.SharedElementCallback
        public View onCreateSnapshotView(Context context, Parcelable parcelable) {
            return this.f4016a.c(context, parcelable);
        }

        @Override // android.app.SharedElementCallback
        public void onMapSharedElements(List<String> list, Map<String, View> map) {
            this.f4016a.d(list, map);
        }

        @Override // android.app.SharedElementCallback
        public void onRejectSharedElements(List<View> list) {
            this.f4016a.e(list);
        }

        @Override // android.app.SharedElementCallback
        public void onSharedElementEnd(List<String> list, List<View> list2, List<View> list3) {
            this.f4016a.f(list, list2, list3);
        }

        @Override // android.app.SharedElementCallback
        public void onSharedElementStart(List<String> list, List<View> list2, List<View> list3) {
            this.f4016a.g(list, list2, list3);
        }

        @Override // android.app.SharedElementCallback
        @androidx.annotation.x0(23)
        public void onSharedElementsArrived(List<String> list, List<View> list2, final SharedElementCallback.OnSharedElementsReadyListener onSharedElementsReadyListener) {
            this.f4016a.h(list, list2, new f5.a() { // from class: androidx.core.app.g
                @Override // androidx.core.app.f5.a
                public final void onSharedElementsReady() {
                    b.e.a(onSharedElementsReadyListener);
                }
            });
        }
    }

    protected b() {
    }

    @Deprecated
    public static boolean A(Activity activity) {
        activity.invalidateOptionsMenu();
        return true;
    }

    public static boolean B(@androidx.annotation.o0 Activity activity) {
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 31) {
            return h.a(activity);
        }
        if (i5 == 30) {
            return (g.a(activity) == null || g.a(activity).getDisplayId() == 0) ? false : true;
        }
        if (i5 == 29) {
            return (activity.getWindowManager().getDefaultDisplay() == null || activity.getWindowManager().getDefaultDisplay().getDisplayId() == 0) ? false : true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void C(Activity activity) {
        if (activity.isFinishing() || androidx.core.app.j.i(activity)) {
            return;
        }
        activity.recreate();
    }

    public static void D(@androidx.annotation.o0 Activity activity) {
        c.b(activity);
    }

    public static void E(@androidx.annotation.o0 final Activity activity) {
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
        } else {
            new Handler(activity.getMainLooper()).post(new Runnable() { // from class: androidx.core.app.a
                @Override // java.lang.Runnable
                public final void run() {
                    b.C(activity);
                }
            });
        }
    }

    @androidx.annotation.q0
    public static androidx.core.view.y F(@androidx.annotation.o0 Activity activity, @androidx.annotation.o0 DragEvent dragEvent) {
        return androidx.core.view.y.b(activity, dragEvent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void G(@androidx.annotation.o0 Activity activity, @androidx.annotation.o0 String[] strArr, @androidx.annotation.g0(from = 0) int i5) {
        j jVar = f4012e;
        if (jVar == null || !jVar.b(activity, strArr, i5)) {
            for (String str : strArr) {
                if (TextUtils.isEmpty(str)) {
                    throw new IllegalArgumentException(androidx.concurrent.futures.a.a(new StringBuilder("Permission request for permissions "), Arrays.toString(strArr), " must not contain null or empty values"));
                }
            }
            if (activity instanceof k) {
                ((k) activity).b(i5);
            }
            e.b(activity, strArr, i5);
        }
    }

    @androidx.annotation.o0
    public static <T extends View> T H(@androidx.annotation.o0 Activity activity, @androidx.annotation.d0 int i5) {
        if (Build.VERSION.SDK_INT >= 28) {
            return (T) f.a(activity, i5);
        }
        T t5 = (T) activity.findViewById(i5);
        if (t5 != null) {
            return t5;
        }
        throw new IllegalArgumentException("ID does not reference a View inside this Activity");
    }

    public static void I(@androidx.annotation.o0 Activity activity, @androidx.annotation.q0 f5 f5Var) {
        c.c(activity, f5Var != null ? new l(f5Var) : null);
    }

    public static void J(@androidx.annotation.o0 Activity activity, @androidx.annotation.q0 f5 f5Var) {
        c.d(activity, f5Var != null ? new l(f5Var) : null);
    }

    public static void K(@androidx.annotation.o0 Activity activity, @androidx.annotation.q0 androidx.core.content.k kVar, @androidx.annotation.q0 Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 30) {
            g.b(activity, kVar, bundle);
        }
    }

    public static void L(@androidx.annotation.q0 j jVar) {
        f4012e = jVar;
    }

    public static boolean M(@androidx.annotation.o0 Activity activity, @androidx.annotation.o0 String str) {
        return e.c(activity, str);
    }

    public static void N(@androidx.annotation.o0 Activity activity, @androidx.annotation.o0 Intent intent, int i5, @androidx.annotation.q0 Bundle bundle) {
        C0027b.b(activity, intent, i5, bundle);
    }

    public static void O(@androidx.annotation.o0 Activity activity, @androidx.annotation.o0 IntentSender intentSender, int i5, @androidx.annotation.q0 Intent intent, int i6, int i7, int i8, @androidx.annotation.q0 Bundle bundle) throws IntentSender.SendIntentException {
        C0027b.c(activity, intentSender, i5, intent, i6, i7, i8, bundle);
    }

    public static void P(@androidx.annotation.o0 Activity activity) {
        c.e(activity);
    }

    public static void w(@androidx.annotation.o0 Activity activity) {
        C0027b.a(activity);
    }

    public static void x(@androidx.annotation.o0 Activity activity) {
        c.a(activity);
    }

    @androidx.annotation.q0
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public static j y() {
        return f4012e;
    }

    @androidx.annotation.q0
    public static Uri z(@androidx.annotation.o0 Activity activity) {
        return d.a(activity);
    }
}
