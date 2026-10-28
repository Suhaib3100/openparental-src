package c8;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.l0;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: FragmentChangeManager.java */
/* loaded from: classes5.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private FragmentManager f38599a;

    /* renamed from: b, reason: collision with root package name */
    private int f38600b;

    /* renamed from: c, reason: collision with root package name */
    private ArrayList<Fragment> f38601c;

    /* renamed from: d, reason: collision with root package name */
    private int f38602d;

    public a(FragmentManager fragmentManager, int i4, ArrayList<Fragment> arrayList) {
        this.f38599a = fragmentManager;
        this.f38600b = i4;
        this.f38601c = arrayList;
        c();
    }

    private void c() {
        Iterator<Fragment> it = this.f38601c.iterator();
        while (it.hasNext()) {
            Fragment next = it.next();
            this.f38599a.u().g(this.f38600b, next).z(next).r();
        }
        d(0);
    }

    public Fragment a() {
        return this.f38601c.get(this.f38602d);
    }

    public int b() {
        return this.f38602d;
    }

    public void d(int i4) {
        for (int i5 = 0; i5 < this.f38601c.size(); i5++) {
            l0 u4 = this.f38599a.u();
            Fragment fragment = this.f38601c.get(i5);
            if (i5 == i4) {
                u4.U(fragment);
            } else {
                u4.z(fragment);
            }
            u4.r();
        }
        this.f38602d = i4;
    }
}
