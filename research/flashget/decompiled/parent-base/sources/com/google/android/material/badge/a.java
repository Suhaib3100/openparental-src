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
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.internal.ParcelableSparseArray;
import com.google.android.material.internal.o;
import s8.a;

/* compiled from: BadgeUtils.java */
@b
/* loaded from: classes6.dex */
public class a {

    /* renamed from: b, reason: collision with root package name */
    private static final String f52656b = ProtectedSandApp.s("\uf150");

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f52655a = false;

    /* compiled from: BadgeUtils.java */
    /* renamed from: com.google.android.material.badge.a$a, reason: collision with other inner class name */
    static class RunnableC0799a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Toolbar f52657b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f52658c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ BadgeDrawable f52659d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ FrameLayout f52660e;

        RunnableC0799a(Toolbar toolbar, int i4, BadgeDrawable badgeDrawable, FrameLayout frameLayout) {
            this.f52657b = toolbar;
            this.f52658c = i4;
            this.f52659d = badgeDrawable;
            this.f52660e = frameLayout;
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionMenuItemView a5 = o.a(this.f52657b, this.f52658c);
            if (a5 != null) {
                a.k(this.f52659d, this.f52657b.getResources());
                a.b(this.f52659d, a5, this.f52660e);
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
            if (f52655a) {
                throw new IllegalArgumentException(ProtectedSandApp.s("\uf151"));
            }
            view.getOverlay().add(badgeDrawable);
        }
    }

    public static void c(@o0 BadgeDrawable badgeDrawable, @o0 Toolbar toolbar, @d0 int i4) {
        d(badgeDrawable, toolbar, i4, null);
    }

    public static void d(@o0 BadgeDrawable badgeDrawable, @o0 Toolbar toolbar, @d0 int i4, @q0 FrameLayout frameLayout) {
        toolbar.post(new RunnableC0799a(toolbar, i4, badgeDrawable, frameLayout));
    }

    @o0
    public static SparseArray<BadgeDrawable> e(Context context, @o0 ParcelableSparseArray parcelableSparseArray) {
        SparseArray<BadgeDrawable> sparseArray = new SparseArray<>(parcelableSparseArray.size());
        for (int i4 = 0; i4 < parcelableSparseArray.size(); i4++) {
            int keyAt = parcelableSparseArray.keyAt(i4);
            BadgeDrawable.SavedState savedState = (BadgeDrawable.SavedState) parcelableSparseArray.valueAt(i4);
            if (savedState == null) {
                throw new IllegalArgumentException(ProtectedSandApp.s("\uf152"));
            }
            sparseArray.put(keyAt, BadgeDrawable.g(context, savedState));
        }
        return sparseArray;
    }

    @o0
    public static ParcelableSparseArray f(@o0 SparseArray<BadgeDrawable> sparseArray) {
        ParcelableSparseArray parcelableSparseArray = new ParcelableSparseArray();
        for (int i4 = 0; i4 < sparseArray.size(); i4++) {
            int keyAt = sparseArray.keyAt(i4);
            BadgeDrawable valueAt = sparseArray.valueAt(i4);
            if (valueAt == null) {
                throw new IllegalArgumentException(ProtectedSandApp.s("\uf153"));
            }
            parcelableSparseArray.put(keyAt, valueAt.t());
        }
        return parcelableSparseArray;
    }

    public static void g(@q0 BadgeDrawable badgeDrawable, @o0 View view) {
        if (badgeDrawable == null) {
            return;
        }
        if (f52655a || badgeDrawable.p() != null) {
            badgeDrawable.p().setForeground(null);
        } else {
            view.getOverlay().remove(badgeDrawable);
        }
    }

    public static void h(@q0 BadgeDrawable badgeDrawable, @o0 Toolbar toolbar, @d0 int i4) {
        ActionMenuItemView a5;
        if (badgeDrawable == null || (a5 = o.a(toolbar, i4)) == null) {
            return;
        }
        i(badgeDrawable);
        g(badgeDrawable, a5);
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

    public static void l(@o0 Rect rect, float f4, float f5, float f6, float f7) {
        rect.set((int) (f4 - f6), (int) (f5 - f7), (int) (f4 + f6), (int) (f5 + f7));
    }
}
