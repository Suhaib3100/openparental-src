package androidx.fragment.app;

import androidx.view.n1;
import java.util.Collection;
import java.util.Map;

/* compiled from: FragmentManagerNonConfig.java */
@Deprecated
/* loaded from: classes3.dex */
public class b0 {

    /* renamed from: a, reason: collision with root package name */
    @androidx.annotation.q0
    private final Collection<Fragment> f29870a;

    /* renamed from: b, reason: collision with root package name */
    @androidx.annotation.q0
    private final Map<String, b0> f29871b;

    /* renamed from: c, reason: collision with root package name */
    @androidx.annotation.q0
    private final Map<String, n1> f29872c;

    b0(@androidx.annotation.q0 Collection<Fragment> collection, @androidx.annotation.q0 Map<String, b0> map, @androidx.annotation.q0 Map<String, n1> map2) {
        this.f29870a = collection;
        this.f29871b = map;
        this.f29872c = map2;
    }

    @androidx.annotation.q0
    Map<String, b0> a() {
        return this.f29871b;
    }

    @androidx.annotation.q0
    Collection<Fragment> b() {
        return this.f29870a;
    }

    @androidx.annotation.q0
    Map<String, n1> c() {
        return this.f29872c;
    }

    boolean d(Fragment fragment) {
        Collection<Fragment> collection = this.f29870a;
        if (collection == null) {
            return false;
        }
        return collection.contains(fragment);
    }
}
