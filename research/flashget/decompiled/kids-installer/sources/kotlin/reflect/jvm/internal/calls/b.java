package kotlin.reflect.jvm.internal.calls;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;

/* loaded from: classes5.dex */
class b implements InvocationHandler {

    /* renamed from: a, reason: collision with root package name */
    private final Class f23831a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f23832b;

    /* renamed from: c, reason: collision with root package name */
    private final Lazy f23833c;

    /* renamed from: d, reason: collision with root package name */
    private final Lazy f23834d;

    /* renamed from: e, reason: collision with root package name */
    private final List f23835e;

    public b(Class cls, Map map, Lazy lazy, Lazy lazy2, List list) {
        this.f23831a = cls;
        this.f23832b = map;
        this.f23833c = lazy;
        this.f23834d = lazy2;
        this.f23835e = list;
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) {
        Object i5;
        i5 = c.i(this.f23831a, this.f23832b, this.f23833c, this.f23834d, this.f23835e, obj, method, objArr);
        return i5;
    }
}
