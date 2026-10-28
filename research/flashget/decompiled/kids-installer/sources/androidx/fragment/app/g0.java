package androidx.fragment.app;

import android.view.View;
import androidx.core.app.f5;
import java.util.ArrayList;

/* compiled from: FragmentTransition.java */
/* loaded from: classes.dex */
class g0 {

    /* renamed from: a, reason: collision with root package name */
    static final i0 f8265a = new h0();

    /* renamed from: b, reason: collision with root package name */
    static final i0 f8266b = c();

    private g0() {
    }

    static void a(Fragment fragment, Fragment fragment2, boolean z5, androidx.collection.a<String, View> aVar, boolean z6) {
        f5 enterTransitionCallback = z5 ? fragment2.getEnterTransitionCallback() : fragment.getEnterTransitionCallback();
        if (enterTransitionCallback != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int size = aVar == null ? 0 : aVar.size();
            for (int i5 = 0; i5 < size; i5++) {
                arrayList2.add(aVar.l(i5));
                arrayList.add(aVar.q(i5));
            }
            if (z6) {
                enterTransitionCallback.g(arrayList2, arrayList, null);
            } else {
                enterTransitionCallback.f(arrayList2, arrayList, null);
            }
        }
    }

    static String b(androidx.collection.a<String, String> aVar, String str) {
        int size = aVar.size();
        for (int i5 = 0; i5 < size; i5++) {
            if (str.equals(aVar.q(i5))) {
                return aVar.l(i5);
            }
        }
        return null;
    }

    private static i0 c() {
        try {
            return (i0) androidx.transition.g.class.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    static void d(@androidx.annotation.o0 androidx.collection.a<String, String> aVar, @androidx.annotation.o0 androidx.collection.a<String, View> aVar2) {
        for (int size = aVar.size() - 1; size >= 0; size--) {
            if (!aVar2.containsKey(aVar.q(size))) {
                aVar.n(size);
            }
        }
    }

    static void e(ArrayList<View> arrayList, int i5) {
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            arrayList.get(size).setVisibility(i5);
        }
    }

    static boolean f() {
        return (f8265a == null && f8266b == null) ? false : true;
    }
}
