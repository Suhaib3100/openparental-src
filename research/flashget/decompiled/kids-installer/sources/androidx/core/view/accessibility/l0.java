package androidx.core.view.accessibility;

import android.annotation.SuppressLint;
import android.os.Parcelable;
import android.view.View;
import android.view.accessibility.AccessibilityRecord;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.x0;
import java.util.List;

/* compiled from: AccessibilityRecordCompat.java */
/* loaded from: classes.dex */
public class l0 {

    /* renamed from: a, reason: collision with root package name */
    private final AccessibilityRecord f5411a;

    /* compiled from: AccessibilityRecordCompat.java */
    @x0(15)
    static class a {
        private a() {
        }

        @androidx.annotation.u
        static int a(AccessibilityRecord accessibilityRecord) {
            return accessibilityRecord.getMaxScrollX();
        }

        @androidx.annotation.u
        static int b(AccessibilityRecord accessibilityRecord) {
            return accessibilityRecord.getMaxScrollY();
        }

        @androidx.annotation.u
        static void c(AccessibilityRecord accessibilityRecord, int i5) {
            accessibilityRecord.setMaxScrollX(i5);
        }

        @androidx.annotation.u
        static void d(AccessibilityRecord accessibilityRecord, int i5) {
            accessibilityRecord.setMaxScrollY(i5);
        }
    }

    /* compiled from: AccessibilityRecordCompat.java */
    @x0(16)
    static class b {
        private b() {
        }

        @androidx.annotation.u
        static void a(AccessibilityRecord accessibilityRecord, View view, int i5) {
            accessibilityRecord.setSource(view, i5);
        }
    }

    @Deprecated
    public l0(Object obj) {
        this.f5411a = (AccessibilityRecord) obj;
    }

    @Deprecated
    public static l0 A(l0 l0Var) {
        return new l0(AccessibilityRecord.obtain(l0Var.f5411a));
    }

    public static void N(@o0 AccessibilityRecord accessibilityRecord, int i5) {
        a.c(accessibilityRecord, i5);
    }

    public static void P(@o0 AccessibilityRecord accessibilityRecord, int i5) {
        a.d(accessibilityRecord, i5);
    }

    public static void Y(@o0 AccessibilityRecord accessibilityRecord, @q0 View view, int i5) {
        b.a(accessibilityRecord, view, i5);
    }

    public static int j(@o0 AccessibilityRecord accessibilityRecord) {
        return a.a(accessibilityRecord);
    }

    public static int l(@o0 AccessibilityRecord accessibilityRecord) {
        return a.b(accessibilityRecord);
    }

    @Deprecated
    public static l0 z() {
        return new l0(AccessibilityRecord.obtain());
    }

    @Deprecated
    public void B() {
        this.f5411a.recycle();
    }

    @Deprecated
    public void C(int i5) {
        this.f5411a.setAddedCount(i5);
    }

    @Deprecated
    public void D(CharSequence charSequence) {
        this.f5411a.setBeforeText(charSequence);
    }

    @Deprecated
    public void E(boolean z5) {
        this.f5411a.setChecked(z5);
    }

    @Deprecated
    public void F(CharSequence charSequence) {
        this.f5411a.setClassName(charSequence);
    }

    @Deprecated
    public void G(CharSequence charSequence) {
        this.f5411a.setContentDescription(charSequence);
    }

    @Deprecated
    public void H(int i5) {
        this.f5411a.setCurrentItemIndex(i5);
    }

    @Deprecated
    public void I(boolean z5) {
        this.f5411a.setEnabled(z5);
    }

    @Deprecated
    public void J(int i5) {
        this.f5411a.setFromIndex(i5);
    }

    @Deprecated
    public void K(boolean z5) {
        this.f5411a.setFullScreen(z5);
    }

    @Deprecated
    public void L(int i5) {
        this.f5411a.setItemCount(i5);
    }

    @Deprecated
    public void M(int i5) {
        a.c(this.f5411a, i5);
    }

    @Deprecated
    public void O(int i5) {
        a.d(this.f5411a, i5);
    }

    @Deprecated
    public void Q(Parcelable parcelable) {
        this.f5411a.setParcelableData(parcelable);
    }

    @Deprecated
    public void R(boolean z5) {
        this.f5411a.setPassword(z5);
    }

    @Deprecated
    public void S(int i5) {
        this.f5411a.setRemovedCount(i5);
    }

    @Deprecated
    public void T(int i5) {
        this.f5411a.setScrollX(i5);
    }

    @Deprecated
    public void U(int i5) {
        this.f5411a.setScrollY(i5);
    }

    @Deprecated
    public void V(boolean z5) {
        this.f5411a.setScrollable(z5);
    }

    @SuppressLint({"KotlinPropertyAccess"})
    @Deprecated
    public void W(View view) {
        this.f5411a.setSource(view);
    }

    @Deprecated
    public void X(View view, int i5) {
        b.a(this.f5411a, view, i5);
    }

    @Deprecated
    public void Z(int i5) {
        this.f5411a.setToIndex(i5);
    }

    @Deprecated
    public int a() {
        return this.f5411a.getAddedCount();
    }

    @Deprecated
    public CharSequence b() {
        return this.f5411a.getBeforeText();
    }

    @Deprecated
    public CharSequence c() {
        return this.f5411a.getClassName();
    }

    @Deprecated
    public CharSequence d() {
        return this.f5411a.getContentDescription();
    }

    @Deprecated
    public int e() {
        return this.f5411a.getCurrentItemIndex();
    }

    @Deprecated
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        AccessibilityRecord accessibilityRecord = this.f5411a;
        return accessibilityRecord == null ? l0Var.f5411a == null : accessibilityRecord.equals(l0Var.f5411a);
    }

    @Deprecated
    public int f() {
        return this.f5411a.getFromIndex();
    }

    @Deprecated
    public Object g() {
        return this.f5411a;
    }

    @Deprecated
    public int h() {
        return this.f5411a.getItemCount();
    }

    @Deprecated
    public int hashCode() {
        AccessibilityRecord accessibilityRecord = this.f5411a;
        if (accessibilityRecord == null) {
            return 0;
        }
        return accessibilityRecord.hashCode();
    }

    @Deprecated
    public int i() {
        return a.a(this.f5411a);
    }

    @Deprecated
    public int k() {
        return a.b(this.f5411a);
    }

    @Deprecated
    public Parcelable m() {
        return this.f5411a.getParcelableData();
    }

    @Deprecated
    public int n() {
        return this.f5411a.getRemovedCount();
    }

    @Deprecated
    public int o() {
        return this.f5411a.getScrollX();
    }

    @Deprecated
    public int p() {
        return this.f5411a.getScrollY();
    }

    @SuppressLint({"KotlinPropertyAccess"})
    @Deprecated
    public g0 q() {
        return g0.Y1(this.f5411a.getSource());
    }

    @Deprecated
    public List<CharSequence> r() {
        return this.f5411a.getText();
    }

    @Deprecated
    public int s() {
        return this.f5411a.getToIndex();
    }

    @Deprecated
    public int t() {
        return this.f5411a.getWindowId();
    }

    @Deprecated
    public boolean u() {
        return this.f5411a.isChecked();
    }

    @Deprecated
    public boolean v() {
        return this.f5411a.isEnabled();
    }

    @Deprecated
    public boolean w() {
        return this.f5411a.isFullScreen();
    }

    @Deprecated
    public boolean x() {
        return this.f5411a.isPassword();
    }

    @Deprecated
    public boolean y() {
        return this.f5411a.isScrollable();
    }
}
