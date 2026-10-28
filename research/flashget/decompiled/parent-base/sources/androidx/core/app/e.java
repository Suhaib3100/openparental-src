package androidx.core.app;

import android.app.Activity;
import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import androidx.annotation.c1;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: ActivityOptionsCompat.java */
/* loaded from: classes3.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public static final String f25693a = "android.activity.usage_time";

    /* renamed from: b, reason: collision with root package name */
    public static final String f25694b = "android.usage_time_packages";

    /* compiled from: ActivityOptionsCompat.java */
    private static class a extends e {

        /* renamed from: c, reason: collision with root package name */
        private final ActivityOptions f25695c;

        a(ActivityOptions activityOptions) {
            this.f25695c = activityOptions;
        }

        @Override // androidx.core.app.e
        public Rect a() {
            return this.f25695c.getLaunchBounds();
        }

        @Override // androidx.core.app.e
        public void j(@androidx.annotation.o0 PendingIntent pendingIntent) {
            this.f25695c.requestUsageTimeReport(pendingIntent);
        }

        @Override // androidx.core.app.e
        @androidx.annotation.o0
        public e k(@androidx.annotation.q0 Rect rect) {
            return new a(this.f25695c.setLaunchBounds(rect));
        }

        @Override // androidx.core.app.e
        @androidx.annotation.o0
        public e l(int i4) {
            int i5 = Build.VERSION.SDK_INT;
            if (i5 >= 34) {
                f.a(this.f25695c, i4);
            } else if (i5 >= 33) {
                C0405e.a(this.f25695c, i4 != 2);
            }
            return this;
        }

        @Override // androidx.core.app.e
        @androidx.annotation.o0
        public e m(boolean z4) {
            return Build.VERSION.SDK_INT < 34 ? this : new a(f.b(this.f25695c, z4));
        }

        @Override // androidx.core.app.e
        public Bundle n() {
            return this.f25695c.toBundle();
        }

        @Override // androidx.core.app.e
        public void o(@androidx.annotation.o0 e eVar) {
            if (eVar instanceof a) {
                this.f25695c.update(((a) eVar).f25695c);
            }
        }
    }

    /* compiled from: ActivityOptionsCompat.java */
    @androidx.annotation.x0(21)
    static class b {
        private b() {
        }

        static ActivityOptions a(Activity activity, View view, String str) {
            return ActivityOptions.makeSceneTransitionAnimation(activity, view, str);
        }

        @SafeVarargs
        static ActivityOptions b(Activity activity, Pair<View, String>... pairArr) {
            return ActivityOptions.makeSceneTransitionAnimation(activity, pairArr);
        }

        static ActivityOptions c() {
            return ActivityOptions.makeTaskLaunchBehind();
        }
    }

    /* compiled from: ActivityOptionsCompat.java */
    @androidx.annotation.x0(23)
    static class c {
        private c() {
        }

        static ActivityOptions a() {
            return ActivityOptions.makeBasic();
        }

        static ActivityOptions b(View view, int i4, int i5, int i6, int i7) {
            return ActivityOptions.makeClipRevealAnimation(view, i4, i5, i6, i7);
        }

        static void c(ActivityOptions activityOptions, PendingIntent pendingIntent) {
            activityOptions.requestUsageTimeReport(pendingIntent);
        }
    }

    /* compiled from: ActivityOptionsCompat.java */
    @androidx.annotation.x0(24)
    static class d {
        private d() {
        }

        static Rect a(ActivityOptions activityOptions) {
            return activityOptions.getLaunchBounds();
        }

        static ActivityOptions b(ActivityOptions activityOptions, Rect rect) {
            return activityOptions.setLaunchBounds(rect);
        }
    }

    /* compiled from: ActivityOptionsCompat.java */
    @androidx.annotation.x0(33)
    /* renamed from: androidx.core.app.e$e, reason: collision with other inner class name */
    static class C0405e {
        private C0405e() {
        }

        static void a(ActivityOptions activityOptions, boolean z4) {
            activityOptions.setPendingIntentBackgroundActivityLaunchAllowed(z4);
        }
    }

    /* compiled from: ActivityOptionsCompat.java */
    @androidx.annotation.x0(34)
    static class f {
        private f() {
        }

        static ActivityOptions a(ActivityOptions activityOptions, int i4) {
            return activityOptions.setPendingIntentBackgroundActivityStartMode(i4);
        }

        static ActivityOptions b(ActivityOptions activityOptions, boolean z4) {
            return activityOptions.setShareIdentityEnabled(z4);
        }
    }

    /* compiled from: ActivityOptionsCompat.java */
    @c1({c1.a.LIBRARY})
    @Retention(RetentionPolicy.SOURCE)
    public @interface g {
    }

    protected e() {
    }

    @androidx.annotation.o0
    public static e b() {
        return new a(ActivityOptions.makeBasic());
    }

    @androidx.annotation.o0
    public static e c(@androidx.annotation.o0 View view, int i4, int i5, int i6, int i7) {
        return new a(ActivityOptions.makeClipRevealAnimation(view, i4, i5, i6, i7));
    }

    @androidx.annotation.o0
    public static e d(@androidx.annotation.o0 Context context, int i4, int i5) {
        return new a(ActivityOptions.makeCustomAnimation(context, i4, i5));
    }

    @androidx.annotation.o0
    public static e e(@androidx.annotation.o0 View view, int i4, int i5, int i6, int i7) {
        return new a(ActivityOptions.makeScaleUpAnimation(view, i4, i5, i6, i7));
    }

    @androidx.annotation.o0
    public static e f(@androidx.annotation.o0 Activity activity, @androidx.annotation.o0 View view, @androidx.annotation.o0 String str) {
        return new a(ActivityOptions.makeSceneTransitionAnimation(activity, view, str));
    }

    @androidx.annotation.o0
    public static e g(@androidx.annotation.o0 Activity activity, @androidx.annotation.q0 androidx.core.util.s<View, String>... sVarArr) {
        Pair[] pairArr;
        if (sVarArr != null) {
            pairArr = new Pair[sVarArr.length];
            for (int i4 = 0; i4 < sVarArr.length; i4++) {
                androidx.core.util.s<View, String> sVar = sVarArr[i4];
                pairArr[i4] = Pair.create(sVar.f26881a, sVar.f26882b);
            }
        } else {
            pairArr = null;
        }
        return new a(ActivityOptions.makeSceneTransitionAnimation(activity, pairArr));
    }

    @androidx.annotation.o0
    public static e h() {
        return new a(ActivityOptions.makeTaskLaunchBehind());
    }

    @androidx.annotation.o0
    public static e i(@androidx.annotation.o0 View view, @androidx.annotation.o0 Bitmap bitmap, int i4, int i5) {
        return new a(ActivityOptions.makeThumbnailScaleUpAnimation(view, bitmap, i4, i5));
    }

    @androidx.annotation.q0
    public Rect a() {
        return null;
    }

    public void j(@androidx.annotation.o0 PendingIntent pendingIntent) {
    }

    @androidx.annotation.o0
    public e k(@androidx.annotation.q0 Rect rect) {
        return this;
    }

    @androidx.annotation.o0
    public e l(int i4) {
        return this;
    }

    @androidx.annotation.o0
    public e m(boolean z4) {
        return this;
    }

    @androidx.annotation.q0
    public Bundle n() {
        return null;
    }

    public void o(@androidx.annotation.o0 e eVar) {
    }
}
