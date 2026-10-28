package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.c1;
import androidx.core.view.g1;
import androidx.core.view.x1;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: FragmentTransitionImpl.java */
@c1({c1.a.LIBRARY_GROUP_PREFIX})
@SuppressLint({"UnknownNullness"})
/* loaded from: classes3.dex */
public abstract class p0 {

    /* compiled from: FragmentTransitionImpl.java */
    class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f30044b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ArrayList f30045c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ArrayList f30046d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ArrayList f30047e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ArrayList f30048f;

        a(int i4, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
            this.f30044b = i4;
            this.f30045c = arrayList;
            this.f30046d = arrayList2;
            this.f30047e = arrayList3;
            this.f30048f = arrayList4;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (int i4 = 0; i4 < this.f30044b; i4++) {
                x1.D2((View) this.f30045c.get(i4), (String) this.f30046d.get(i4));
                x1.D2((View) this.f30047e.get(i4), (String) this.f30048f.get(i4));
            }
        }
    }

    protected static void d(List<View> list, View view) {
        int size = list.size();
        if (g(list, view, size)) {
            return;
        }
        if (x1.A0(view) != null) {
            list.add(view);
        }
        for (int i4 = size; i4 < list.size(); i4++) {
            View view2 = list.get(i4);
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                int childCount = viewGroup.getChildCount();
                for (int i5 = 0; i5 < childCount; i5++) {
                    View childAt = viewGroup.getChildAt(i5);
                    if (!g(list, childAt, size) && x1.A0(childAt) != null) {
                        list.add(childAt);
                    }
                }
            }
        }
    }

    private static boolean g(List<View> list, View view, int i4) {
        for (int i5 = 0; i5 < i4; i5++) {
            if (list.get(i5) == view) {
                return true;
            }
        }
        return false;
    }

    protected static boolean i(List list) {
        return list == null || list.isEmpty();
    }

    public abstract void a(Object obj, View view);

    public abstract void b(Object obj, ArrayList<View> arrayList);

    public abstract void c(ViewGroup viewGroup, Object obj);

    public abstract boolean e(Object obj);

    public abstract Object f(Object obj);

    protected void h(View view, Rect rect) {
        if (x1.R0(view)) {
            RectF rectF = new RectF();
            rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
            view.getMatrix().mapRect(rectF);
            rectF.offset(view.getLeft(), view.getTop());
            Object parent = view.getParent();
            while (parent instanceof View) {
                View view2 = (View) parent;
                rectF.offset(-view2.getScrollX(), -view2.getScrollY());
                view2.getMatrix().mapRect(rectF);
                rectF.offset(view2.getLeft(), view2.getTop());
                parent = view2.getParent();
            }
            view.getRootView().getLocationOnScreen(new int[2]);
            rectF.offset(r1[0], r1[1]);
            rect.set(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
        }
    }

    public abstract Object j(Object obj, Object obj2, Object obj3);

    public abstract Object k(Object obj, Object obj2, Object obj3);

    ArrayList<String> l(ArrayList<View> arrayList) {
        ArrayList<String> arrayList2 = new ArrayList<>();
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            View view = arrayList.get(i4);
            arrayList2.add(x1.A0(view));
            x1.D2(view, null);
        }
        return arrayList2;
    }

    public abstract void m(Object obj, View view);

    public abstract void n(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    public abstract void o(Object obj, View view, ArrayList<View> arrayList);

    public abstract void p(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3);

    public abstract void q(Object obj, Rect rect);

    public abstract void r(Object obj, View view);

    public void s(@androidx.annotation.o0 Fragment fragment, @androidx.annotation.o0 Object obj, @androidx.annotation.o0 androidx.core.os.f fVar, @androidx.annotation.o0 Runnable runnable) {
        runnable.run();
    }

    void t(View view, ArrayList<View> arrayList, ArrayList<View> arrayList2, ArrayList<String> arrayList3, Map<String, String> map) {
        int size = arrayList2.size();
        ArrayList arrayList4 = new ArrayList();
        for (int i4 = 0; i4 < size; i4++) {
            View view2 = arrayList.get(i4);
            String A0 = x1.A0(view2);
            arrayList4.add(A0);
            if (A0 != null) {
                x1.D2(view2, null);
                String str = map.get(A0);
                int i5 = 0;
                while (true) {
                    if (i5 >= size) {
                        break;
                    }
                    if (str.equals(arrayList3.get(i5))) {
                        x1.D2(arrayList2.get(i5), A0);
                        break;
                    }
                    i5++;
                }
            }
        }
        g1.a(view, new a(size, arrayList2, arrayList3, arrayList, arrayList4));
    }

    public abstract void u(Object obj, View view, ArrayList<View> arrayList);

    public abstract void v(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    public abstract Object w(Object obj);
}
