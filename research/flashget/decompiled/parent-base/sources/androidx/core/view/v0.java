package androidx.core.view;

/* compiled from: NestedScrollingChild2.java */
/* loaded from: classes3.dex */
public interface v0 extends x0 {
    boolean dispatchNestedPreScroll(int i4, int i5, @androidx.annotation.q0 int[] iArr, @androidx.annotation.q0 int[] iArr2, int i6);

    boolean dispatchNestedScroll(int i4, int i5, int i6, int i7, @androidx.annotation.q0 int[] iArr, int i10);

    boolean hasNestedScrollingParent(int i4);

    boolean startNestedScroll(int i4, int i5);

    void stopNestedScroll(int i4);
}
