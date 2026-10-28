package androidx.fragment.app;

import android.view.h1;
import androidx.annotation.q0;
import java.util.Collection;
import java.util.Map;

/* compiled from: FragmentManagerNonConfig.java */
@Deprecated
/* loaded from: classes.dex */
public class v {

    /* renamed from: a, reason: collision with root package name */
    @q0
    private final Collection<Fragment> f8365a;

    /* renamed from: b, reason: collision with root package name */
    @q0
    private final Map<String, v> f8366b;

    /* renamed from: c, reason: collision with root package name */
    @q0
    private final Map<String, h1> f8367c;

    v(@q0 Collection<Fragment> collection, @q0 Map<String, v> map, @q0 Map<String, h1> map2) {
        this.f8365a = collection;
        this.f8366b = map;
        this.f8367c = map2;
    }

    @q0
    Map<String, v> a() {
        return this.f8366b;
    }

    @q0
    Collection<Fragment> b() {
        return this.f8365a;
    }

    @q0
    Map<String, h1> c() {
        return this.f8367c;
    }

    boolean d(Fragment fragment) {
        Collection<Fragment> collection = this.f8365a;
        if (collection == null) {
            return false;
        }
        return collection.contains(fragment);
    }
}
