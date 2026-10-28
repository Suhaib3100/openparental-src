package androidx.databinding.adapters;

import android.widget.TabHost;
import androidx.annotation.c1;

/* compiled from: TabHostBindingAdapter.java */
@c1({c1.a.LIBRARY})
/* loaded from: classes.dex */
public class c0 {

    /* compiled from: TabHostBindingAdapter.java */
    class a implements TabHost.OnTabChangeListener {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ TabHost.OnTabChangeListener f6035o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ androidx.databinding.o f6036p;

        a(TabHost.OnTabChangeListener onTabChangeListener, androidx.databinding.o oVar) {
            this.f6035o = onTabChangeListener;
            this.f6036p = oVar;
        }

        @Override // android.widget.TabHost.OnTabChangeListener
        public void onTabChanged(String str) {
            TabHost.OnTabChangeListener onTabChangeListener = this.f6035o;
            if (onTabChangeListener != null) {
                onTabChangeListener.onTabChanged(str);
            }
            this.f6036p.a();
        }
    }

    @androidx.databinding.n(attribute = "android:currentTab")
    public static int a(TabHost tabHost) {
        return tabHost.getCurrentTab();
    }

    @androidx.databinding.n(attribute = "android:currentTab")
    public static String b(TabHost tabHost) {
        return tabHost.getCurrentTabTag();
    }

    @androidx.databinding.d({"android:currentTab"})
    public static void c(TabHost tabHost, int i5) {
        if (tabHost.getCurrentTab() != i5) {
            tabHost.setCurrentTab(i5);
        }
    }

    @androidx.databinding.d({"android:currentTab"})
    public static void d(TabHost tabHost, String str) {
        String currentTabTag = tabHost.getCurrentTabTag();
        if ((currentTabTag == null || currentTabTag.equals(str)) && (currentTabTag != null || str == null)) {
            return;
        }
        tabHost.setCurrentTabByTag(str);
    }

    @androidx.databinding.d(requireAll = false, value = {"android:onTabChanged", "android:currentTabAttrChanged"})
    public static void e(TabHost tabHost, TabHost.OnTabChangeListener onTabChangeListener, androidx.databinding.o oVar) {
        if (oVar == null) {
            tabHost.setOnTabChangedListener(onTabChangeListener);
        } else {
            tabHost.setOnTabChangedListener(new a(onTabChangeListener, oVar));
        }
    }
}
