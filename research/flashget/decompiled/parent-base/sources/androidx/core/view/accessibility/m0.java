package androidx.core.view.accessibility;

import android.os.Build;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.annotation.q0;
import androidx.annotation.x0;
import java.util.ArrayList;
import java.util.List;

/* compiled from: AccessibilityNodeProviderCompat.java */
/* loaded from: classes3.dex */
public class m0 {

    /* renamed from: b, reason: collision with root package name */
    public static final int f27056b = -1;

    /* renamed from: a, reason: collision with root package name */
    @q0
    private final Object f27057a;

    /* compiled from: AccessibilityNodeProviderCompat.java */
    static class a extends AccessibilityNodeProvider {

        /* renamed from: a, reason: collision with root package name */
        final m0 f27058a;

        a(m0 m0Var) {
            this.f27058a = m0Var;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i4) {
            h0 b5 = this.f27058a.b(i4);
            if (b5 == null) {
                return null;
            }
            return b5.q2();
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i4) {
            List<h0> c5 = this.f27058a.c(str, i4);
            if (c5 == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int size = c5.size();
            for (int i5 = 0; i5 < size; i5++) {
                arrayList.add(c5.get(i5).q2());
            }
            return arrayList;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo findFocus(int i4) {
            h0 d5 = this.f27058a.d(i4);
            if (d5 == null) {
                return null;
            }
            return d5.q2();
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public boolean performAction(int i4, int i5, Bundle bundle) {
            return this.f27058a.f(i4, i5, bundle);
        }
    }

    /* compiled from: AccessibilityNodeProviderCompat.java */
    @x0(26)
    static class b extends a {
        b(m0 m0Var) {
            super(m0Var);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public void addExtraDataToAccessibilityNodeInfo(int i4, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
            this.f27058a.a(i4, h0.r2(accessibilityNodeInfo), str, bundle);
        }
    }

    public m0() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f27057a = new b(this);
        } else {
            this.f27057a = new a(this);
        }
    }

    public void a(int i4, @androidx.annotation.o0 h0 h0Var, @androidx.annotation.o0 String str, @q0 Bundle bundle) {
    }

    @q0
    public h0 b(int i4) {
        return null;
    }

    @q0
    public List<h0> c(@androidx.annotation.o0 String str, int i4) {
        return null;
    }

    @q0
    public h0 d(int i4) {
        return null;
    }

    @q0
    public Object e() {
        return this.f27057a;
    }

    public boolean f(int i4, int i5, @q0 Bundle bundle) {
        return false;
    }

    public m0(@q0 Object obj) {
        this.f27057a = obj;
    }
}
