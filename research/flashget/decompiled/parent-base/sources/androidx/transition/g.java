package androidx.transition;

import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.transition.q;
import java.util.ArrayList;

/* compiled from: GhostViewHolder.java */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes3.dex */
class g extends FrameLayout {

    /* renamed from: b, reason: collision with root package name */
    @androidx.annotation.o0
    private ViewGroup f34405b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f34406c;

    g(ViewGroup viewGroup) {
        super(viewGroup.getContext());
        setClipChildren(false);
        this.f34405b = viewGroup;
        viewGroup.setTag(q.g.f34836w0, this);
        j0.b(this.f34405b).c(this);
        this.f34406c = true;
    }

    static g b(@androidx.annotation.o0 ViewGroup viewGroup) {
        return (g) viewGroup.getTag(q.g.f34836w0);
    }

    private int c(ArrayList<View> arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int childCount = getChildCount() - 1;
        int i4 = 0;
        while (i4 <= childCount) {
            int i5 = (i4 + childCount) / 2;
            d(((i) getChildAt(i5)).f34417d, arrayList2);
            if (f(arrayList, arrayList2)) {
                i4 = i5 + 1;
            } else {
                childCount = i5 - 1;
            }
            arrayList2.clear();
        }
        return i4;
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
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = viewGroup.getChildAt(j0.a(viewGroup, i4));
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
        for (int i4 = 1; i4 < min; i4++) {
            View view = arrayList.get(i4);
            View view2 = arrayList2.get(i4);
            if (view != view2) {
                return e(view, view2);
            }
        }
        return arrayList2.size() == min;
    }

    void a(i iVar) {
        ArrayList<View> arrayList = new ArrayList<>();
        d(iVar.f34417d, arrayList);
        int c5 = c(arrayList);
        if (c5 < 0 || c5 >= getChildCount()) {
            addView(iVar);
        } else {
            addView(iVar, c5);
        }
    }

    void g() {
        if (!this.f34406c) {
            throw new IllegalStateException("This GhostViewHolder is detached!");
        }
        j0.b(this.f34405b).d(this);
        new f0(this.f34405b).c(this);
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        if (!this.f34406c) {
            throw new IllegalStateException("This GhostViewHolder is detached!");
        }
        super.onViewAdded(view);
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if ((getChildCount() == 1 && getChildAt(0) == view) || getChildCount() == 0) {
            this.f34405b.setTag(q.g.f34836w0, null);
            j0.b(this.f34405b).d(this);
            this.f34406c = false;
        }
    }
}
