package com.luck.picture.lib.magical;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public class BuildRecycleItemViewParams {
    private static final List<ViewParams> viewParams = new ArrayList();

    public static void clear() {
        List<ViewParams> list = viewParams;
        if (list.size() > 0) {
            list.clear();
        }
    }

    private static void fillPlaceHolder(List<View> list, int i4, int i5, int i6) {
        if (i5 > 0) {
            while (i5 >= 1) {
                list.add(0, null);
                i5--;
            }
        }
        if (i6 < i4) {
            for (int i7 = (i4 - 1) - i6; i7 >= 1; i7--) {
                list.add(null);
            }
        }
    }

    public static void generateViewParams(ViewGroup viewGroup, int i4) {
        int childCount;
        int count;
        int firstVisiblePosition;
        int lastVisiblePosition;
        ArrayList arrayList = new ArrayList();
        boolean z4 = viewGroup instanceof RecyclerView;
        if (z4) {
            childCount = ((RecyclerView) viewGroup).getChildCount();
        } else {
            if (!(viewGroup instanceof ListView)) {
                throw new IllegalArgumentException(viewGroup.getClass().getCanonicalName() + ProtectedSandApp.s("ᚫ\u0001") + RecyclerView.class + ProtectedSandApp.s("ᚬ\u0001") + ListView.class);
            }
            childCount = ((ListView) viewGroup).getChildCount();
        }
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = viewGroup.getChildAt(i5);
            if (childAt != null) {
                arrayList.add(childAt);
            }
        }
        if (z4) {
            GridLayoutManager gridLayoutManager = (GridLayoutManager) ((RecyclerView) viewGroup).getLayoutManager();
            if (gridLayoutManager == null) {
                return;
            }
            count = gridLayoutManager.getItemCount();
            firstVisiblePosition = gridLayoutManager.findFirstVisibleItemPosition();
            lastVisiblePosition = gridLayoutManager.findLastVisibleItemPosition();
        } else {
            ListView listView = (ListView) viewGroup;
            ListAdapter adapter = listView.getAdapter();
            if (adapter == null) {
                return;
            }
            count = adapter.getCount();
            firstVisiblePosition = listView.getFirstVisiblePosition();
            lastVisiblePosition = listView.getLastVisiblePosition();
        }
        if (lastVisiblePosition > count) {
            lastVisiblePosition = count - 1;
        }
        fillPlaceHolder(arrayList, count, firstVisiblePosition, lastVisiblePosition);
        viewParams.clear();
        for (int i6 = 0; i6 < arrayList.size(); i6++) {
            View view = (View) arrayList.get(i6);
            ViewParams viewParams2 = new ViewParams();
            if (view == null) {
                viewParams2.setLeft(0);
                viewParams2.setTop(0);
                viewParams2.setWidth(0);
                viewParams2.setHeight(0);
            } else {
                int[] iArr = new int[2];
                view.getLocationOnScreen(iArr);
                viewParams2.setLeft(iArr[0]);
                viewParams2.setTop(iArr[1] - i4);
                viewParams2.setWidth(view.getWidth());
                viewParams2.setHeight(view.getHeight());
            }
            viewParams.add(viewParams2);
        }
    }

    public static ViewParams getItemViewParams(int i4) {
        List<ViewParams> list = viewParams;
        if (list.size() > i4) {
            return list.get(i4);
        }
        return null;
    }
}
