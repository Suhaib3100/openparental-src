package lg;

import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: AjTypeSystem.java */
/* loaded from: classes9.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private static Map<Class, WeakReference<d>> f81459a = Collections.synchronizedMap(new WeakHashMap());

    public static <T> d<T> a(Class<T> cls) {
        WeakReference<d> weakReference = f81459a.get(cls);
        if (weakReference == null) {
            org.mp4parser.aspectj.internal.lang.reflect.b bVar = new org.mp4parser.aspectj.internal.lang.reflect.b(cls);
            f81459a.put(cls, new WeakReference<>(bVar));
            return bVar;
        }
        d<T> dVar = weakReference.get();
        if (dVar != null) {
            return dVar;
        }
        org.mp4parser.aspectj.internal.lang.reflect.b bVar2 = new org.mp4parser.aspectj.internal.lang.reflect.b(cls);
        f81459a.put(cls, new WeakReference<>(bVar2));
        return bVar2;
    }
}
