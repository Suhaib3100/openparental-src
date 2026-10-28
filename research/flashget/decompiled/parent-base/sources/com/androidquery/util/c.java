package com.androidquery.util;

import android.app.Activity;
import android.app.Dialog;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.Gallery;
import android.widget.ListAdapter;
import android.widget.ProgressBar;
import java.io.File;
import java.util.Comparator;

/* compiled from: Common.java */
/* loaded from: classes3.dex */
public class c implements Comparator<File>, Runnable, View.OnClickListener, View.OnLongClickListener, AdapterView.OnItemClickListener, AbsListView.OnScrollListener, AdapterView.OnItemSelectedListener, TextWatcher {

    /* renamed from: m, reason: collision with root package name */
    protected static final int f41222m = 1;

    /* renamed from: n, reason: collision with root package name */
    protected static final int f41223n = 2;

    /* renamed from: b, reason: collision with root package name */
    private Object f41224b;

    /* renamed from: c, reason: collision with root package name */
    private String f41225c;

    /* renamed from: d, reason: collision with root package name */
    private Object[] f41226d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f41227e;

    /* renamed from: f, reason: collision with root package name */
    private Class<?>[] f41228f;

    /* renamed from: g, reason: collision with root package name */
    private int f41229g;

    /* renamed from: i, reason: collision with root package name */
    private AbsListView.OnScrollListener f41231i;

    /* renamed from: j, reason: collision with root package name */
    private int f41232j;

    /* renamed from: k, reason: collision with root package name */
    private AdapterView.OnItemSelectedListener f41233k;

    /* renamed from: h, reason: collision with root package name */
    private int f41230h = 0;

    /* renamed from: l, reason: collision with root package name */
    private boolean f41234l = false;

    public static boolean B(int i4, View view, ViewGroup viewGroup, String str) {
        return viewGroup instanceof Gallery ? D(i4, view, viewGroup, str) : z(-2, i4, view, viewGroup, str);
    }

    public static boolean C(View view, ViewGroup viewGroup, String str, float f4, boolean z4) {
        return B(-1, view, viewGroup, str);
    }

    private static boolean D(int i4, View view, ViewGroup viewGroup, String str) {
        Integer num = 0;
        if (str == null || com.androidquery.callback.d.Q1(str)) {
            return false;
        }
        Gallery gallery = (Gallery) viewGroup;
        Integer num2 = (Integer) gallery.getTag(d.f41259y);
        if (num2 == null) {
            gallery.setTag(d.f41259y, num);
            gallery.setCallbackDuringFling(false);
            new c().o(gallery);
        } else {
            num = num2;
        }
        int lastVisiblePosition = ((gallery.getLastVisiblePosition() - gallery.getFirstVisiblePosition()) / 2) + 1;
        int intValue = num.intValue() - lastVisiblePosition;
        int intValue2 = num.intValue() + lastVisiblePosition;
        if (intValue < 0) {
            intValue2 -= intValue;
            intValue = 0;
        }
        if (i4 < intValue || i4 > intValue2) {
            view.setTag(d.f41259y, null);
            return true;
        }
        view.setTag(d.f41259y, Integer.valueOf(i4));
        return false;
    }

    public static void E(Object obj, String str, boolean z4) {
        if (obj != null) {
            if (!(obj instanceof View)) {
                if (obj instanceof Dialog) {
                    Dialog dialog = (Dialog) obj;
                    com.androidquery.a aVar = new com.androidquery.a(dialog.getContext());
                    if (z4) {
                        aVar.y1(dialog);
                        return;
                    } else {
                        aVar.C(dialog);
                        return;
                    }
                }
                if (obj instanceof Activity) {
                    Activity activity = (Activity) obj;
                    activity.setProgressBarIndeterminateVisibility(z4);
                    activity.setProgressBarVisibility(z4);
                    if (z4) {
                        activity.setProgress(0);
                        return;
                    }
                    return;
                }
                return;
            }
            View view = (View) obj;
            ProgressBar progressBar = obj instanceof ProgressBar ? (ProgressBar) obj : null;
            if (z4) {
                view.setTag(d.f41256v, str);
                view.setVisibility(0);
                if (progressBar != null) {
                    progressBar.setProgress(0);
                    progressBar.setMax(100);
                    return;
                }
                return;
            }
            Object tag = view.getTag(d.f41256v);
            if (tag == null || tag.equals(str)) {
                view.setTag(d.f41256v, null);
                if (progressBar == null || progressBar.isIndeterminate()) {
                    view.setVisibility(8);
                }
            }
        }
    }

    private void a(AbsListView absListView, int i4) {
        int count = absListView.getCount();
        int lastVisiblePosition = absListView.getLastVisiblePosition();
        if (i4 != 0 || count != lastVisiblePosition + 1) {
            this.f41232j = -1;
        } else if (lastVisiblePosition != this.f41232j) {
            this.f41232j = lastVisiblePosition;
            n(absListView, Integer.valueOf(i4));
        }
    }

    private Object n(Object... objArr) {
        String str = this.f41225c;
        if (str != null) {
            Object[] objArr2 = this.f41226d;
            Object[] objArr3 = objArr2 != null ? objArr2 : objArr;
            Object obj = this.f41224b;
            return a.C(obj == null ? this : obj, str, this.f41227e, true, this.f41228f, objArr3);
        }
        int i4 = this.f41229g;
        if (i4 == 0) {
            return null;
        }
        if (i4 == 1) {
            Object[] objArr4 = this.f41226d;
            a.X((File) objArr4[0], (byte[]) objArr4[1]);
            return null;
        }
        if (i4 != 2) {
            return null;
        }
        Object[] objArr5 = this.f41226d;
        a.b((File) objArr5[0], ((Long) objArr5[1]).longValue(), ((Long) this.f41226d[2]).longValue());
        return null;
    }

    private void u(ExpandableListView expandableListView, int i4) {
        expandableListView.setTag(d.f41259y, Integer.valueOf(i4));
        if (i4 == 0) {
            int firstVisiblePosition = expandableListView.getFirstVisiblePosition();
            int lastVisiblePosition = expandableListView.getLastVisiblePosition() - firstVisiblePosition;
            ExpandableListAdapter expandableListAdapter = expandableListView.getExpandableListAdapter();
            for (int i5 = 0; i5 <= lastVisiblePosition; i5++) {
                long expandableListPosition = expandableListView.getExpandableListPosition(i5 + firstVisiblePosition);
                int packedPositionGroup = ExpandableListView.getPackedPositionGroup(expandableListPosition);
                int packedPositionChild = ExpandableListView.getPackedPositionChild(expandableListPosition);
                if (packedPositionGroup >= 0) {
                    View childAt = expandableListView.getChildAt(i5);
                    Long l4 = (Long) childAt.getTag(d.f41259y);
                    if (l4 != null && l4.longValue() == expandableListPosition) {
                        if (packedPositionChild == -1) {
                            expandableListAdapter.getGroupView(packedPositionGroup, expandableListView.isGroupExpanded(packedPositionGroup), childAt, expandableListView);
                        } else {
                            expandableListAdapter.getChildView(packedPositionGroup, packedPositionChild, packedPositionChild == expandableListAdapter.getChildrenCount(packedPositionGroup) - 1, childAt, expandableListView);
                        }
                        childAt.setTag(d.f41259y, null);
                    }
                }
            }
        }
    }

    private void y(AbsListView absListView, int i4) {
        absListView.setTag(d.f41259y, Integer.valueOf(i4));
        if (i4 == 0) {
            int firstVisiblePosition = absListView.getFirstVisiblePosition();
            int lastVisiblePosition = absListView.getLastVisiblePosition() - firstVisiblePosition;
            ListAdapter listAdapter = (ListAdapter) absListView.getAdapter();
            for (int i5 = 0; i5 <= lastVisiblePosition; i5++) {
                long j4 = i5 + firstVisiblePosition;
                View childAt = absListView.getChildAt(i5);
                if (((Number) childAt.getTag(d.f41259y)) != null) {
                    listAdapter.getView((int) j4, childAt, absListView);
                    childAt.setTag(d.f41259y, null);
                }
            }
        }
    }

    public static boolean z(int i4, int i5, View view, ViewGroup viewGroup, String str) {
        if (str != null && !com.androidquery.callback.d.Q1(str)) {
            AbsListView absListView = (AbsListView) viewGroup;
            if (((AbsListView.OnScrollListener) viewGroup.getTag(d.f41257w)) == null) {
                c cVar = new c();
                absListView.setOnScrollListener(cVar);
                viewGroup.setTag(d.f41257w, cVar);
            }
            Integer num = (Integer) absListView.getTag(d.f41259y);
            if (num != null && num.intValue() != 0 && num.intValue() != 1) {
                long j4 = i5;
                if (viewGroup instanceof ExpandableListView) {
                    j4 = ExpandableListView.getPackedPositionForChild(i4, i5);
                }
                view.setTag(d.f41259y, Long.valueOf(j4));
                return true;
            }
        }
        return false;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
    }

    @Override // java.util.Comparator
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public int compare(File file, File file2) {
        long lastModified = file.lastModified();
        long lastModified2 = file2.lastModified();
        if (lastModified2 > lastModified) {
            return 1;
        }
        return lastModified2 == lastModified ? 0 : -1;
    }

    public c e(Object obj, String str, boolean z4, Class<?>[] clsArr) {
        this.f41224b = obj;
        this.f41225c = str;
        this.f41227e = z4;
        this.f41228f = clsArr;
        return this;
    }

    public void g(AbsListView.OnScrollListener onScrollListener) {
        this.f41231i = onScrollListener;
    }

    public int k() {
        return this.f41230h;
    }

    public void o(Gallery gallery) {
        this.f41233k = gallery.getOnItemSelectedListener();
        this.f41234l = true;
        gallery.setOnItemSelectedListener(this);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        n(view);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i4, long j4) {
        n(adapterView, view, Integer.valueOf(i4), Long.valueOf(j4));
    }

    /* JADX WARN: Type inference failed for: r11v4, types: [android.widget.Adapter] */
    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> adapterView, View view, int i4, long j4) {
        n(adapterView, view, Integer.valueOf(i4), Long.valueOf(j4));
        AdapterView.OnItemSelectedListener onItemSelectedListener = this.f41233k;
        if (onItemSelectedListener != null) {
            onItemSelectedListener.onItemSelected(adapterView, view, i4, j4);
        }
        if (!this.f41234l || ((Integer) adapterView.getTag(d.f41259y)).intValue() == i4) {
            return;
        }
        ?? adapter = adapterView.getAdapter();
        adapterView.setTag(d.f41259y, Integer.valueOf(i4));
        int childCount = adapterView.getChildCount();
        int firstVisiblePosition = adapterView.getFirstVisiblePosition();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = adapterView.getChildAt(i5);
            int i6 = firstVisiblePosition + i5;
            Integer num = (Integer) childAt.getTag(d.f41259y);
            if (num == null || num.intValue() != i6) {
                adapter.getView(i6, childAt, adapterView);
            }
        }
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        Object n4 = n(view);
        if (n4 instanceof Boolean) {
            return ((Boolean) n4).booleanValue();
        }
        return false;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> adapterView) {
        AdapterView.OnItemSelectedListener onItemSelectedListener = this.f41233k;
        if (onItemSelectedListener != null) {
            onItemSelectedListener.onNothingSelected(adapterView);
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(AbsListView absListView, int i4, int i5, int i6) {
        a(absListView, this.f41230h);
        AbsListView.OnScrollListener onScrollListener = this.f41231i;
        if (onScrollListener != null) {
            onScrollListener.onScroll(absListView, i4, i5, i6);
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(AbsListView absListView, int i4) {
        this.f41230h = i4;
        a(absListView, i4);
        if (absListView instanceof ExpandableListView) {
            u((ExpandableListView) absListView, i4);
        } else {
            y(absListView, i4);
        }
        AbsListView.OnScrollListener onScrollListener = this.f41231i;
        if (onScrollListener != null) {
            onScrollListener.onScrollStateChanged(absListView, i4);
        }
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
        n(charSequence, Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6));
    }

    @Override // java.lang.Runnable
    public void run() {
        n(new Object[0]);
    }

    public c t(int i4, Object... objArr) {
        this.f41229g = i4;
        this.f41226d = objArr;
        return this;
    }
}
