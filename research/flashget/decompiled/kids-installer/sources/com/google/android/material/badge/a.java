package com.google.android.material.badge;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.d0;
import androidx.annotation.m1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.Toolbar;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.internal.ParcelableSparseArray;
import com.google.android.material.internal.o;
import n1.a;

/* compiled from: BadgeUtils.java */
@b
/* loaded from: classes2.dex */
public class a {

    /* renamed from: b, reason: collision with root package name */
    private static final String f12932b = ProtectedSandApp.s("ሉ");

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f12931a = false;

    /* compiled from: BadgeUtils.java */
    /* renamed from: com.google.android.material.badge.a$a, reason: collision with other inner class name */
    static class RunnableC0165a implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ Toolbar f12933o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ int f12934p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ BadgeDrawable f12935q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ FrameLayout f12936r;

        RunnableC0165a(Toolbar toolbar, int i5, BadgeDrawable badgeDrawable, FrameLayout frameLayout) {
            this.f12933o = toolbar;
            this.f12934p = i5;
            this.f12935q = badgeDrawable;
            this.f12936r = frameLayout;
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionMenuItemView a6 = o.a(this.f12933o, this.f12934p);
            if (a6 != null) {
                a.k(this.f12935q, this.f12933o.getResources());
                a.b(this.f12935q, a6, this.f12936r);
            }
        }
    }

    private a() {
    }

    public static void a(@o0 BadgeDrawable badgeDrawable, @o0 View view) {
        b(badgeDrawable, view, null);
    }

    public static void b(@o0 BadgeDrawable badgeDrawable, @o0 View view, @q0 FrameLayout frameLayout) {
        j(badgeDrawable, view, frameLayout);
        if (badgeDrawable.p() != null) {
            badgeDrawable.p().setForeground(badgeDrawable);
        } else {
            if (f12931a) {
                throw new IllegalArgumentException(ProtectedSandApp.s("ሊ"));
            }
            view.getOverlay().add(badgeDrawable);
        }
    }

    public static void c(@o0 BadgeDrawable badgeDrawable, @o0 Toolbar toolbar, @d0 int i5) {
        d(badgeDrawable, toolbar, i5, null);
    }

    public static void d(@o0 BadgeDrawable badgeDrawable, @o0 Toolbar toolbar, @d0 int i5, @q0 FrameLayout frameLayout) {
        toolbar.post(new RunnableC0165a(toolbar, i5, badgeDrawable, frameLayout));
    }

    @o0
    public static SparseArray<BadgeDrawable> e(Context context, @o0 ParcelableSparseArray parcelableSparseArray) {
        SparseArray<BadgeDrawable> sparseArray = new SparseArray<>(parcelableSparseArray.size());
        for (int i5 = 0; i5 < parcelableSparseArray.size(); i5++) {
            int keyAt = parcelableSparseArray.keyAt(i5);
            BadgeDrawable.SavedState savedState = (BadgeDrawable.SavedState) parcelableSparseArray.valueAt(i5);
            if (savedState == null) {
                throw new IllegalArgumentException(ProtectedSandApp.s("ላ"));
            }
            sparseArray.put(keyAt, BadgeDrawable.g(context, savedState));
        }
        return sparseArray;
    }

    @o0
    public static ParcelableSparseArray f(@o0 SparseArray<BadgeDrawable> sparseArray) {
        ParcelableSparseArray parcelableSparseArray = new ParcelableSparseArray();
        for (int i5 = 0; i5 < sparseArray.size(); i5++) {
            int keyAt = sparseArray.keyAt(i5);
            BadgeDrawable valueAt = sparseArray.valueAt(i5);
            if (valueAt == null) {
                throw new IllegalArgumentException(ProtectedSandApp.s("ሌ"));
            }
            parcelableSparseArray.put(keyAt, valueAt.t());
        }
        return parcelableSparseArray;
    }

    public static void g(@q0 BadgeDrawable badgeDrawable, @o0 View view) {
        if (badgeDrawable == null) {
            return;
        }
        if (f12931a || badgeDrawable.p() != null) {
            badgeDrawable.p().setForeground(null);
        } else {
            view.getOverlay().remove(badgeDrawable);
        }
    }

    public static void h(@q0 BadgeDrawable badgeDrawable, @o0 Toolbar toolbar, @d0 int i5) {
        ActionMenuItemView a6;
        if (badgeDrawable == null || (a6 = o.a(toolbar, i5)) == null) {
            return;
        }
        i(badgeDrawable);
        g(badgeDrawable, a6);
    }

    @m1
    static void i(BadgeDrawable badgeDrawable) {
        badgeDrawable.z(0);
        badgeDrawable.A(0);
    }

    public static void j(@o0 BadgeDrawable badgeDrawable, @o0 View view, @q0 FrameLayout frameLayout) {
        Rect rect = new Rect();
        view.getDrawingRect(rect);
        badgeDrawable.setBounds(rect);
        badgeDrawable.S(view, frameLayout);
    }

    @m1
    static void k(BadgeDrawable badgeDrawable, Resources resources) {
        badgeDrawable.z(resources.getDimensionPixelOffset(a.f.R2));
        badgeDrawable.A(resources.getDimensionPixelOffset(a.f.S2));
    }

    public static void l(@o0 Rect rect, float f6, float f7, float f8, float f9) {
        rect.set((int) (f6 - f8), (int) (f7 - f9), (int) (f6 + f8), (int) (f7 + f9));
    }
}
