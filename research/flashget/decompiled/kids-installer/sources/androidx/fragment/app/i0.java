package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.c1;
import androidx.core.view.r1;
import androidx.core.view.y1;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: FragmentTransitionImpl.java */
@c1({c1.a.LIBRARY_GROUP_PREFIX})
@SuppressLint({"UnknownNullness"})
/* loaded from: classes.dex */
public abstract class i0 {

    /* compiled from: FragmentTransitionImpl.java */
    class a implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ int f8291o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ ArrayList f8292p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ ArrayList f8293q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ ArrayList f8294r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ ArrayList f8295s;

        a(int i5, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
            this.f8291o = i5;
            this.f8292p = arrayList;
            this.f8293q = arrayList2;
            this.f8294r = arrayList3;
            this.f8295s = arrayList4;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (int i5 = 0; i5 < this.f8291o; i5++) {
                y1.t2((View) this.f8292p.get(i5), (String) this.f8293q.get(i5));
                y1.t2((View) this.f8294r.get(i5), (String) this.f8295s.get(i5));
            }
        }
    }

    protected static void d(List<View> list, View view) {
        int size = list.size();
        if (g(list, view, size)) {
            return;
        }
        if (y1.x0(view) != null) {
            list.add(view);
        }
        for (int i5 = size; i5 < list.size(); i5++) {
            View view2 = list.get(i5);
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                int childCount = viewGroup.getChildCount();
                for (int i6 = 0; i6 < childCount; i6++) {
                    View childAt = viewGroup.getChildAt(i6);
                    if (!g(list, childAt, size) && y1.x0(childAt) != null) {
                        list.add(childAt);
                    }
                }
            }
        }
    }

    private static boolean g(List<View> list, View view, int i5) {
        for (int i6 = 0; i6 < i5; i6++) {
            if (list.get(i6) == view) {
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
        if (y1.O0(view)) {
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
        for (int i5 = 0; i5 < size; i5++) {
            View view = arrayList.get(i5);
            arrayList2.add(y1.x0(view));
            y1.t2(view, null);
        }
        return arrayList2;
    }

    public abstract void m(Object obj, View view);

    public abstract void n(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    public abstract void o(Object obj, View view, ArrayList<View> arrayList);

    public abstract void p(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3);

    public abstract void q(Object obj, Rect rect);

    public abstract void r(Object obj, View view);

    public void s(@androidx.annotation.o0 Fragment fragment, @androidx.annotation.o0 Object obj, @androidx.annotation.o0 androidx.core.os.c cVar, @androidx.annotation.o0 Runnable runnable) {
        runnable.run();
    }

    void t(View view, ArrayList<View> arrayList, ArrayList<View> arrayList2, ArrayList<String> arrayList3, Map<String, String> map) {
        int size = arrayList2.size();
        ArrayList arrayList4 = new ArrayList();
        for (int i5 = 0; i5 < size; i5++) {
            View view2 = arrayList.get(i5);
            String x02 = y1.x0(view2);
            arrayList4.add(x02);
            if (x02 != null) {
                y1.t2(view2, null);
                String str = map.get(x02);
                int i6 = 0;
                while (true) {
                    if (i6 >= size) {
                        break;
                    }
                    if (str.equals(arrayList3.get(i6))) {
                        y1.t2(arrayList2.get(i6), x02);
                        break;
                    }
                    i6++;
                }
            }
        }
        r1.a(view, new a(size, arrayList2, arrayList3, arrayList, arrayList4));
    }

    public abstract void u(Object obj, View view, ArrayList<View> arrayList);

    public abstract void v(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    public abstract Object w(Object obj);
}
