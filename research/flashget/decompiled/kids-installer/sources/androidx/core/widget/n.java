package androidx.core.widget;

import android.widget.ListView;
import androidx.annotation.o0;
import androidx.core.widget.o;

/* compiled from: ListViewAutoScrollHelper.java */
/* loaded from: classes3.dex */
public class n extends a {
    private final ListView W;

    public n(@o0 ListView listView) {
        super(listView);
        this.W = listView;
    }

    @Override // androidx.core.widget.a
    public boolean a(int i5) {
        return false;
    }

    @Override // androidx.core.widget.a
    public boolean b(int i5) {
        ListView listView = this.W;
        int count = listView.getCount();
        if (count == 0) {
            return false;
        }
        int childCount = listView.getChildCount();
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        int i6 = firstVisiblePosition + childCount;
        if (i5 > 0) {
            if (i6 >= count && listView.getChildAt(childCount - 1).getBottom() <= listView.getHeight()) {
                return false;
            }
        } else {
            if (i5 >= 0) {
                return false;
            }
            if (firstVisiblePosition <= 0 && listView.getChildAt(0).getTop() >= 0) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.core.widget.a
    public void l(int i5, int i6) {
        o.a.b(this.W, i6);
    }
}
