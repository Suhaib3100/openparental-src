package androidx.fragment.app;

import android.view.View;
import java.util.ArrayList;

/* compiled from: FragmentTransition.java */
/* loaded from: classes3.dex */
class n0 {

    /* renamed from: a, reason: collision with root package name */
    static final p0 f30020a = new o0();

    /* renamed from: b, reason: collision with root package name */
    static final p0 f30021b = c();

    private n0() {
    }

    static void a(Fragment fragment, Fragment fragment2, boolean z4, androidx.collection.a<String, View> aVar, boolean z5) {
        androidx.core.app.w0 enterTransitionCallback = z4 ? fragment2.getEnterTransitionCallback() : fragment.getEnterTransitionCallback();
        if (enterTransitionCallback != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int size = aVar == null ? 0 : aVar.getSize();
            for (int i4 = 0; i4 < size; i4++) {
                arrayList2.add(aVar.keyAt(i4));
                arrayList.add(aVar.valueAt(i4));
            }
            if (z5) {
                enterTransitionCallback.g(arrayList2, arrayList, null);
            } else {
                enterTransitionCallback.f(arrayList2, arrayList, null);
            }
        }
    }

    static String b(androidx.collection.a<String, String> aVar, String str) {
        int size = aVar.getSize();
        for (int i4 = 0; i4 < size; i4++) {
            if (str.equals(aVar.valueAt(i4))) {
                return aVar.keyAt(i4);
            }
        }
        return null;
    }

    private static p0 c() {
        try {
            return (p0) androidx.transition.e.class.getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }

    static void d(@androidx.annotation.o0 androidx.collection.a<String, String> aVar, @androidx.annotation.o0 androidx.collection.a<String, View> aVar2) {
        for (int size = aVar.getSize() - 1; size >= 0; size--) {
            if (!aVar2.containsKey(aVar.valueAt(size))) {
                aVar.removeAt(size);
            }
        }
    }

    static void e(ArrayList<View> arrayList, int i4) {
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            arrayList.get(size).setVisibility(i4);
        }
    }

    static boolean f() {
        return (f30020a == null && f30021b == null) ? false : true;
    }
}
