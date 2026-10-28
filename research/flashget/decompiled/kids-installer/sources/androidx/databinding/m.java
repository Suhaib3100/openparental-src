package androidx.databinding;

import android.R;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.o0;
import androidx.annotation.q0;

/* compiled from: DataBindingUtil.java */
/* loaded from: classes.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    private static k f6912a = new DataBinderMapperImpl();

    /* renamed from: b, reason: collision with root package name */
    private static l f6913b = null;

    private m() {
    }

    @q0
    public static <T extends ViewDataBinding> T a(@o0 View view) {
        return (T) b(view, f6913b);
    }

    @q0
    public static <T extends ViewDataBinding> T b(@o0 View view, l lVar) {
        T t5 = (T) ViewDataBinding.w(view);
        if (t5 != null) {
            return t5;
        }
        Object tag = view.getTag();
        if (!(tag instanceof String)) {
            throw new IllegalArgumentException("View is not a binding layout");
        }
        int e6 = f6912a.e((String) tag);
        if (e6 != 0) {
            return (T) f6912a.c(lVar, view, e6);
        }
        throw new IllegalArgumentException("View is not a binding layout. Tag: " + tag);
    }

    static <T extends ViewDataBinding> T c(l lVar, View view, int i5) {
        return (T) f6912a.c(lVar, view, i5);
    }

    static <T extends ViewDataBinding> T d(l lVar, View[] viewArr, int i5) {
        return (T) f6912a.d(lVar, viewArr, i5);
    }

    private static <T extends ViewDataBinding> T e(l lVar, ViewGroup viewGroup, int i5, int i6) {
        int childCount = viewGroup.getChildCount();
        int i7 = childCount - i5;
        if (i7 == 1) {
            return (T) c(lVar, viewGroup.getChildAt(childCount - 1), i6);
        }
        View[] viewArr = new View[i7];
        for (int i8 = 0; i8 < i7; i8++) {
            viewArr[i8] = viewGroup.getChildAt(i8 + i5);
        }
        return (T) d(lVar, viewArr, i6);
    }

    @q0
    public static String f(int i5) {
        return f6912a.b(i5);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0035, code lost:
    
        if (r3 == (-1)) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
    
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0039, code lost:
    
        r7 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0047, code lost:
    
        if (r1.indexOf(47, r3 + 1) == (-1)) goto L18;
     */
    @androidx.annotation.q0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <T extends androidx.databinding.ViewDataBinding> T g(@androidx.annotation.o0 android.view.View r9) {
        /*
        L0:
            r0 = 0
            if (r9 == 0) goto L5a
            androidx.databinding.ViewDataBinding r1 = androidx.databinding.ViewDataBinding.w(r9)
            if (r1 == 0) goto La
            return r1
        La:
            java.lang.Object r1 = r9.getTag()
            boolean r2 = r1 instanceof java.lang.String
            if (r2 == 0) goto L4d
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = "layout"
            boolean r2 = r1.startsWith(r2)
            if (r2 == 0) goto L4d
            java.lang.String r2 = "_0"
            boolean r2 = r1.endsWith(r2)
            if (r2 == 0) goto L4d
            r2 = 6
            char r2 = r1.charAt(r2)
            r3 = 7
            r4 = 47
            int r3 = r1.indexOf(r4, r3)
            r5 = 1
            r6 = -1
            r7 = 0
            if (r2 != r4) goto L3b
            if (r3 != r6) goto L38
            goto L39
        L38:
            r5 = r7
        L39:
            r7 = r5
            goto L4a
        L3b:
            r8 = 45
            if (r2 != r8) goto L4a
            if (r3 == r6) goto L4a
            int r3 = r3 + 1
            int r1 = r1.indexOf(r4, r3)
            if (r1 != r6) goto L38
            goto L39
        L4a:
            if (r7 == 0) goto L4d
            return r0
        L4d:
            android.view.ViewParent r9 = r9.getParent()
            boolean r1 = r9 instanceof android.view.View
            if (r1 == 0) goto L58
            android.view.View r9 = (android.view.View) r9
            goto L0
        L58:
            r9 = r0
            goto L0
        L5a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.databinding.m.g(android.view.View):androidx.databinding.ViewDataBinding");
    }

    @q0
    public static <T extends ViewDataBinding> T h(@o0 View view) {
        return (T) ViewDataBinding.w(view);
    }

    @q0
    public static l i() {
        return f6913b;
    }

    public static <T extends ViewDataBinding> T j(@o0 LayoutInflater layoutInflater, int i5, @q0 ViewGroup viewGroup, boolean z5) {
        return (T) k(layoutInflater, i5, viewGroup, z5, f6913b);
    }

    public static <T extends ViewDataBinding> T k(@o0 LayoutInflater layoutInflater, int i5, @q0 ViewGroup viewGroup, boolean z5, @q0 l lVar) {
        boolean z6 = viewGroup != null && z5;
        return z6 ? (T) e(lVar, viewGroup, z6 ? viewGroup.getChildCount() : 0, i5) : (T) c(lVar, layoutInflater.inflate(i5, viewGroup, z5), i5);
    }

    public static <T extends ViewDataBinding> T l(@o0 Activity activity, int i5) {
        return (T) m(activity, i5, f6913b);
    }

    public static <T extends ViewDataBinding> T m(@o0 Activity activity, int i5, @q0 l lVar) {
        activity.setContentView(i5);
        return (T) e(lVar, (ViewGroup) activity.getWindow().getDecorView().findViewById(R.id.content), 0, i5);
    }

    public static void n(@q0 l lVar) {
        f6913b = lVar;
    }
}
