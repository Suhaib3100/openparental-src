package androidx.core.view.accessibility;

import android.os.Build;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.x0;
import java.util.ArrayList;
import java.util.List;

/* compiled from: AccessibilityNodeProviderCompat.java */
/* loaded from: classes.dex */
public class k0 {

    /* renamed from: b, reason: collision with root package name */
    public static final int f5408b = -1;

    /* renamed from: a, reason: collision with root package name */
    @q0
    private final Object f5409a;

    /* compiled from: AccessibilityNodeProviderCompat.java */
    @x0(16)
    static class a extends AccessibilityNodeProvider {

        /* renamed from: a, reason: collision with root package name */
        final k0 f5410a;

        a(k0 k0Var) {
            this.f5410a = k0Var;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i5) {
            g0 b6 = this.f5410a.b(i5);
            if (b6 == null) {
                return null;
            }
            return b6.W1();
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i5) {
            List<g0> c6 = this.f5410a.c(str, i5);
            if (c6 == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int size = c6.size();
            for (int i6 = 0; i6 < size; i6++) {
                arrayList.add(c6.get(i6).W1());
            }
            return arrayList;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public boolean performAction(int i5, int i6, Bundle bundle) {
            return this.f5410a.f(i5, i6, bundle);
        }
    }

    /* compiled from: AccessibilityNodeProviderCompat.java */
    @x0(19)
    /* loaded from: classes3.dex */
    static class b extends a {
        b(k0 k0Var) {
            super(k0Var);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo findFocus(int i5) {
            g0 d6 = this.f5410a.d(i5);
            if (d6 == null) {
                return null;
            }
            return d6.W1();
        }
    }

    /* compiled from: AccessibilityNodeProviderCompat.java */
    @x0(26)
    /* loaded from: classes3.dex */
    static class c extends b {
        c(k0 k0Var) {
            super(k0Var);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public void addExtraDataToAccessibilityNodeInfo(int i5, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
            this.f5410a.a(i5, g0.X1(accessibilityNodeInfo), str, bundle);
        }
    }

    public k0() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f5409a = new c(this);
        } else {
            this.f5409a = new b(this);
        }
    }

    public void a(int i5, @o0 g0 g0Var, @o0 String str, @q0 Bundle bundle) {
    }

    @q0
    public g0 b(int i5) {
        return null;
    }

    @q0
    public List<g0> c(@o0 String str, int i5) {
        return null;
    }

    @q0
    public g0 d(int i5) {
        return null;
    }

    @q0
    public Object e() {
        return this.f5409a;
    }

    public boolean f(int i5, int i6, @q0 Bundle bundle) {
        return false;
    }

    public k0(@q0 Object obj) {
        this.f5409a = obj;
    }
}
