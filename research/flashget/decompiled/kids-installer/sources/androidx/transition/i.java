package androidx.transition;

import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.transition.s;
import java.util.ArrayList;

/* compiled from: GhostViewHolder.java */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes.dex */
class i extends FrameLayout {

    /* renamed from: o, reason: collision with root package name */
    @androidx.annotation.o0
    private ViewGroup f9904o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f9905p;

    i(ViewGroup viewGroup) {
        super(viewGroup.getContext());
        setClipChildren(false);
        this.f9904o = viewGroup;
        viewGroup.setTag(s.e.f10013k, this);
        l0.b(this.f9904o).c(this);
        this.f9905p = true;
    }

    static i b(@androidx.annotation.o0 ViewGroup viewGroup) {
        return (i) viewGroup.getTag(s.e.f10013k);
    }

    private int c(ArrayList<View> arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int childCount = getChildCount() - 1;
        int i5 = 0;
        while (i5 <= childCount) {
            int i6 = (i5 + childCount) / 2;
            d(((k) getChildAt(i6)).f9916q, arrayList2);
            if (f(arrayList, arrayList2)) {
                i5 = i6 + 1;
            } else {
                childCount = i6 - 1;
            }
            arrayList2.clear();
        }
        return i5;
    }

    private static void d(View view, ArrayList<View> arrayList) {
        Object parent = view.getParent();
        if (parent instanceof ViewGroup) {
            d((View) parent, arrayList);
        }
        arrayList.add(view);
    }

    private static boolean e(View view, View view2) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        int childCount = viewGroup.getChildCount();
        if (view.getZ() != view2.getZ()) {
            return view.getZ() > view2.getZ();
        }
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = viewGroup.getChildAt(l0.a(viewGroup, i5));
            if (childAt == view) {
                return false;
            }
            if (childAt == view2) {
                break;
            }
        }
        return true;
    }

    private static boolean f(ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        if (arrayList.isEmpty() || arrayList2.isEmpty() || arrayList.get(0) != arrayList2.get(0)) {
            return true;
        }
        int min = Math.min(arrayList.size(), arrayList2.size());
        for (int i5 = 1; i5 < min; i5++) {
            View view = arrayList.get(i5);
            View view2 = arrayList2.get(i5);
            if (view != view2) {
                return e(view, view2);
            }
        }
        return arrayList2.size() == min;
    }

    void a(k kVar) {
        ArrayList<View> arrayList = new ArrayList<>();
        d(kVar.f9916q, arrayList);
        int c6 = c(arrayList);
        if (c6 < 0 || c6 >= getChildCount()) {
            addView(kVar);
        } else {
            addView(kVar, c6);
        }
    }

    void g() {
        if (!this.f9905p) {
            throw new IllegalStateException("This GhostViewHolder is detached!");
        }
        l0.b(this.f9904o).d(this);
        new h0(this.f9904o).c(this);
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        if (!this.f9905p) {
            throw new IllegalStateException("This GhostViewHolder is detached!");
        }
        super.onViewAdded(view);
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if ((getChildCount() == 1 && getChildAt(0) == view) || getChildCount() == 0) {
            this.f9904o.setTag(s.e.f10013k, null);
            l0.b(this.f9904o).d(this);
            this.f9905p = false;
        }
    }
}
