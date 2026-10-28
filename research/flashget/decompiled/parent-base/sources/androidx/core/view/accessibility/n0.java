package androidx.core.view.accessibility;

import android.annotation.SuppressLint;
import android.os.Parcelable;
import android.view.View;
import android.view.accessibility.AccessibilityRecord;
import androidx.annotation.q0;
import androidx.annotation.w0;
import java.util.List;

/* compiled from: AccessibilityRecordCompat.java */
/* loaded from: classes3.dex */
public class n0 {

    /* renamed from: a, reason: collision with root package name */
    private final AccessibilityRecord f27059a;

    @Deprecated
    public n0(Object obj) {
        this.f27059a = (AccessibilityRecord) obj;
    }

    @Deprecated
    public static n0 A(n0 n0Var) {
        return new n0(AccessibilityRecord.obtain(n0Var.f27059a));
    }

    @w0(expression = "record.setMaxScrollX(maxScrollX)")
    @Deprecated
    public static void N(@androidx.annotation.o0 AccessibilityRecord accessibilityRecord, int i4) {
        accessibilityRecord.setMaxScrollX(i4);
    }

    @w0(expression = "record.setMaxScrollY(maxScrollY)")
    @Deprecated
    public static void P(@androidx.annotation.o0 AccessibilityRecord accessibilityRecord, int i4) {
        accessibilityRecord.setMaxScrollY(i4);
    }

    @w0(expression = "record.setSource(root, virtualDescendantId)")
    @Deprecated
    public static void Y(@androidx.annotation.o0 AccessibilityRecord accessibilityRecord, @q0 View view, int i4) {
        accessibilityRecord.setSource(view, i4);
    }

    @w0(expression = "record.getMaxScrollX()")
    @Deprecated
    public static int j(@androidx.annotation.o0 AccessibilityRecord accessibilityRecord) {
        return accessibilityRecord.getMaxScrollX();
    }

    @w0(expression = "record.getMaxScrollY()")
    @Deprecated
    public static int l(@androidx.annotation.o0 AccessibilityRecord accessibilityRecord) {
        return accessibilityRecord.getMaxScrollY();
    }

    @Deprecated
    public static n0 z() {
        return new n0(AccessibilityRecord.obtain());
    }

    @Deprecated
    public void B() {
        this.f27059a.recycle();
    }

    @Deprecated
    public void C(int i4) {
        this.f27059a.setAddedCount(i4);
    }

    @Deprecated
    public void D(CharSequence charSequence) {
        this.f27059a.setBeforeText(charSequence);
    }

    @Deprecated
    public void E(boolean z4) {
        this.f27059a.setChecked(z4);
    }

    @Deprecated
    public void F(CharSequence charSequence) {
        this.f27059a.setClassName(charSequence);
    }

    @Deprecated
    public void G(CharSequence charSequence) {
        this.f27059a.setContentDescription(charSequence);
    }

    @Deprecated
    public void H(int i4) {
        this.f27059a.setCurrentItemIndex(i4);
    }

    @Deprecated
    public void I(boolean z4) {
        this.f27059a.setEnabled(z4);
    }

    @Deprecated
    public void J(int i4) {
        this.f27059a.setFromIndex(i4);
    }

    @Deprecated
    public void K(boolean z4) {
        this.f27059a.setFullScreen(z4);
    }

    @Deprecated
    public void L(int i4) {
        this.f27059a.setItemCount(i4);
    }

    @Deprecated
    public void M(int i4) {
        this.f27059a.setMaxScrollX(i4);
    }

    @Deprecated
    public void O(int i4) {
        this.f27059a.setMaxScrollY(i4);
    }

    @Deprecated
    public void Q(Parcelable parcelable) {
        this.f27059a.setParcelableData(parcelable);
    }

    @Deprecated
    public void R(boolean z4) {
        this.f27059a.setPassword(z4);
    }

    @Deprecated
    public void S(int i4) {
        this.f27059a.setRemovedCount(i4);
    }

    @Deprecated
    public void T(int i4) {
        this.f27059a.setScrollX(i4);
    }

    @Deprecated
    public void U(int i4) {
        this.f27059a.setScrollY(i4);
    }

    @Deprecated
    public void V(boolean z4) {
        this.f27059a.setScrollable(z4);
    }

    @SuppressLint({"KotlinPropertyAccess"})
    @Deprecated
    public void W(View view) {
        this.f27059a.setSource(view);
    }

    @Deprecated
    public void X(View view, int i4) {
        this.f27059a.setSource(view, i4);
    }

    @Deprecated
    public void Z(int i4) {
        this.f27059a.setToIndex(i4);
    }

    @Deprecated
    public int a() {
        return this.f27059a.getAddedCount();
    }

    @Deprecated
    public CharSequence b() {
        return this.f27059a.getBeforeText();
    }

    @Deprecated
    public CharSequence c() {
        return this.f27059a.getClassName();
    }

    @Deprecated
    public CharSequence d() {
        return this.f27059a.getContentDescription();
    }

    @Deprecated
    public int e() {
        return this.f27059a.getCurrentItemIndex();
    }

    @Deprecated
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj;
        AccessibilityRecord accessibilityRecord = this.f27059a;
        return accessibilityRecord == null ? n0Var.f27059a == null : accessibilityRecord.equals(n0Var.f27059a);
    }

    @Deprecated
    public int f() {
        return this.f27059a.getFromIndex();
    }

    @Deprecated
    public Object g() {
        return this.f27059a;
    }

    @Deprecated
    public int h() {
        return this.f27059a.getItemCount();
    }

    @Deprecated
    public int hashCode() {
        AccessibilityRecord accessibilityRecord = this.f27059a;
        if (accessibilityRecord == null) {
            return 0;
        }
        return accessibilityRecord.hashCode();
    }

    @Deprecated
    public int i() {
        return this.f27059a.getMaxScrollX();
    }

    @Deprecated
    public int k() {
        return this.f27059a.getMaxScrollY();
    }

    @Deprecated
    public Parcelable m() {
        return this.f27059a.getParcelableData();
    }

    @Deprecated
    public int n() {
        return this.f27059a.getRemovedCount();
    }

    @Deprecated
    public int o() {
        return this.f27059a.getScrollX();
    }

    @Deprecated
    public int p() {
        return this.f27059a.getScrollY();
    }

    @SuppressLint({"KotlinPropertyAccess"})
    @Deprecated
    public h0 q() {
        return h0.s2(this.f27059a.getSource());
    }

    @Deprecated
    public List<CharSequence> r() {
        return this.f27059a.getText();
    }

    @Deprecated
    public int s() {
        return this.f27059a.getToIndex();
    }

    @Deprecated
    public int t() {
        return this.f27059a.getWindowId();
    }

    @Deprecated
    public boolean u() {
        return this.f27059a.isChecked();
    }

    @Deprecated
    public boolean v() {
        return this.f27059a.isEnabled();
    }

    @Deprecated
    public boolean w() {
        return this.f27059a.isFullScreen();
    }

    @Deprecated
    public boolean x() {
        return this.f27059a.isPassword();
    }

    @Deprecated
    public boolean y() {
        return this.f27059a.isScrollable();
    }
}
