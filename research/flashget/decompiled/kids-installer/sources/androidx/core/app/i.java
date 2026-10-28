package androidx.core.app;

import android.app.Activity;
import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;

/* compiled from: ActivityOptionsCompat.java */
/* loaded from: classes.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    public static final String f4084a = "android.activity.usage_time";

    /* renamed from: b, reason: collision with root package name */
    public static final String f4085b = "android.usage_time_packages";

    /* compiled from: ActivityOptionsCompat.java */
    @androidx.annotation.x0(16)
    /* loaded from: classes3.dex */
    private static class a extends i {

        /* renamed from: c, reason: collision with root package name */
        private final ActivityOptions f4086c;

        a(ActivityOptions activityOptions) {
            this.f4086c = activityOptions;
        }

        @Override // androidx.core.app.i
        public Rect a() {
            return e.a(this.f4086c);
        }

        @Override // androidx.core.app.i
        public void j(@androidx.annotation.o0 PendingIntent pendingIntent) {
            d.c(this.f4086c, pendingIntent);
        }

        @Override // androidx.core.app.i
        @androidx.annotation.o0
        public i k(@androidx.annotation.q0 Rect rect) {
            return new a(e.b(this.f4086c, rect));
        }

        @Override // androidx.core.app.i
        public Bundle l() {
            return this.f4086c.toBundle();
        }

        @Override // androidx.core.app.i
        public void m(@androidx.annotation.o0 i iVar) {
            if (iVar instanceof a) {
                this.f4086c.update(((a) iVar).f4086c);
            }
        }
    }

    /* compiled from: ActivityOptionsCompat.java */
    @androidx.annotation.x0(16)
    static class b {
        private b() {
        }

        @androidx.annotation.u
        static ActivityOptions a(Context context, int i5, int i6) {
            return ActivityOptions.makeCustomAnimation(context, i5, i6);
        }

        @androidx.annotation.u
        static ActivityOptions b(View view, int i5, int i6, int i7, int i8) {
            return ActivityOptions.makeScaleUpAnimation(view, i5, i6, i7, i8);
        }

        @androidx.annotation.u
        static ActivityOptions c(View view, Bitmap bitmap, int i5, int i6) {
            return ActivityOptions.makeThumbnailScaleUpAnimation(view, bitmap, i5, i6);
        }
    }

    /* compiled from: ActivityOptionsCompat.java */
    @androidx.annotation.x0(21)
    static class c {
        private c() {
        }

        @androidx.annotation.u
        static ActivityOptions a(Activity activity, View view, String str) {
            return ActivityOptions.makeSceneTransitionAnimation(activity, view, str);
        }

        @SafeVarargs
        @androidx.annotation.u
        static ActivityOptions b(Activity activity, Pair<View, String>... pairArr) {
            return ActivityOptions.makeSceneTransitionAnimation(activity, pairArr);
        }

        @androidx.annotation.u
        static ActivityOptions c() {
            return ActivityOptions.makeTaskLaunchBehind();
        }
    }

    /* compiled from: ActivityOptionsCompat.java */
    @androidx.annotation.x0(23)
    static class d {
        private d() {
        }

        @androidx.annotation.u
        static ActivityOptions a() {
            return ActivityOptions.makeBasic();
        }

        @androidx.annotation.u
        static ActivityOptions b(View view, int i5, int i6, int i7, int i8) {
            return ActivityOptions.makeClipRevealAnimation(view, i5, i6, i7, i8);
        }

        @androidx.annotation.u
        static void c(ActivityOptions activityOptions, PendingIntent pendingIntent) {
            activityOptions.requestUsageTimeReport(pendingIntent);
        }
    }

    /* compiled from: ActivityOptionsCompat.java */
    @androidx.annotation.x0(24)
    static class e {
        private e() {
        }

        @androidx.annotation.u
        static Rect a(ActivityOptions activityOptions) {
            return activityOptions.getLaunchBounds();
        }

        @androidx.annotation.u
        static ActivityOptions b(ActivityOptions activityOptions, Rect rect) {
            return activityOptions.setLaunchBounds(rect);
        }
    }

    protected i() {
    }

    @androidx.annotation.o0
    public static i b() {
        return new a(d.a());
    }

    @androidx.annotation.o0
    public static i c(@androidx.annotation.o0 View view, int i5, int i6, int i7, int i8) {
        return new a(d.b(view, i5, i6, i7, i8));
    }

    @androidx.annotation.o0
    public static i d(@androidx.annotation.o0 Context context, int i5, int i6) {
        return new a(b.a(context, i5, i6));
    }

    @androidx.annotation.o0
    public static i e(@androidx.annotation.o0 View view, int i5, int i6, int i7, int i8) {
        return new a(b.b(view, i5, i6, i7, i8));
    }

    @androidx.annotation.o0
    public static i f(@androidx.annotation.o0 Activity activity, @androidx.annotation.o0 View view, @androidx.annotation.o0 String str) {
        return new a(c.a(activity, view, str));
    }

    @androidx.annotation.o0
    public static i g(@androidx.annotation.o0 Activity activity, @androidx.annotation.q0 androidx.core.util.m<View, String>... mVarArr) {
        Pair[] pairArr;
        if (mVarArr != null) {
            pairArr = new Pair[mVarArr.length];
            for (int i5 = 0; i5 < mVarArr.length; i5++) {
                androidx.core.util.m<View, String> mVar = mVarArr[i5];
                pairArr[i5] = Pair.create(mVar.f5251a, mVar.f5252b);
            }
        } else {
            pairArr = null;
        }
        return new a(c.b(activity, pairArr));
    }

    @androidx.annotation.o0
    public static i h() {
        return new a(c.c());
    }

    @androidx.annotation.o0
    public static i i(@androidx.annotation.o0 View view, @androidx.annotation.o0 Bitmap bitmap, int i5, int i6) {
        return new a(b.c(view, bitmap, i5, i6));
    }

    @androidx.annotation.q0
    public Rect a() {
        return null;
    }

    public void j(@androidx.annotation.o0 PendingIntent pendingIntent) {
    }

    @androidx.annotation.o0
    public i k(@androidx.annotation.q0 Rect rect) {
        return this;
    }

    @androidx.annotation.q0
    public Bundle l() {
        return null;
    }

    public void m(@androidx.annotation.o0 i iVar) {
    }
}
