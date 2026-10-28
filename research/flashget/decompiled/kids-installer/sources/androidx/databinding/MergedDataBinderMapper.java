package androidx.databinding;

import android.view.View;
import androidx.annotation.c1;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

@c1({c1.a.LIBRARY})
/* loaded from: classes3.dex */
public class MergedDataBinderMapper extends k {

    /* renamed from: d, reason: collision with root package name */
    private static final String f5988d = "MergedDataBinderMapper";

    /* renamed from: a, reason: collision with root package name */
    private Set<Class<? extends k>> f5989a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    private List<k> f5990b = new CopyOnWriteArrayList();

    /* renamed from: c, reason: collision with root package name */
    private List<String> f5991c = new CopyOnWriteArrayList();

    private boolean h() {
        boolean z5 = false;
        for (String str : this.f5991c) {
            try {
                Class<?> cls = Class.forName(str);
                if (k.class.isAssignableFrom(cls)) {
                    f((k) cls.newInstance());
                    this.f5991c.remove(str);
                    z5 = true;
                }
            } catch (ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
            }
        }
        return z5;
    }

    @Override // androidx.databinding.k
    public String b(int i5) {
        Iterator<k> it = this.f5990b.iterator();
        while (it.hasNext()) {
            String b6 = it.next().b(i5);
            if (b6 != null) {
                return b6;
            }
        }
        if (h()) {
            return b(i5);
        }
        return null;
    }

    @Override // androidx.databinding.k
    public ViewDataBinding c(l lVar, View view, int i5) {
        Iterator<k> it = this.f5990b.iterator();
        while (it.hasNext()) {
            ViewDataBinding c6 = it.next().c(lVar, view, i5);
            if (c6 != null) {
                return c6;
            }
        }
        if (h()) {
            return c(lVar, view, i5);
        }
        return null;
    }

    @Override // androidx.databinding.k
    public ViewDataBinding d(l lVar, View[] viewArr, int i5) {
        Iterator<k> it = this.f5990b.iterator();
        while (it.hasNext()) {
            ViewDataBinding d6 = it.next().d(lVar, viewArr, i5);
            if (d6 != null) {
                return d6;
            }
        }
        if (h()) {
            return d(lVar, viewArr, i5);
        }
        return null;
    }

    @Override // androidx.databinding.k
    public int e(String str) {
        Iterator<k> it = this.f5990b.iterator();
        while (it.hasNext()) {
            int e6 = it.next().e(str);
            if (e6 != 0) {
                return e6;
            }
        }
        if (h()) {
            return e(str);
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void f(k kVar) {
        if (this.f5989a.add(kVar.getClass())) {
            this.f5990b.add(kVar);
            Iterator<k> it = kVar.a().iterator();
            while (it.hasNext()) {
                f(it.next());
            }
        }
    }

    protected void g(String str) {
        this.f5991c.add(str + ".DataBinderMapperImpl");
    }
}
