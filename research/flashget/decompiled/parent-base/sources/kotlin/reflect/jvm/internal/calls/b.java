package kotlin.reflect.jvm.internal.calls;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import kotlin.b0;

/* loaded from: classes7.dex */
class b implements InvocationHandler {

    /* renamed from: a, reason: collision with root package name */
    private final Class f75586a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f75587b;

    /* renamed from: c, reason: collision with root package name */
    private final b0 f75588c;

    /* renamed from: d, reason: collision with root package name */
    private final b0 f75589d;

    /* renamed from: e, reason: collision with root package name */
    private final List f75590e;

    public b(Class cls, Map map, b0 b0Var, b0 b0Var2, List list) {
        this.f75586a = cls;
        this.f75587b = map;
        this.f75588c = b0Var;
        this.f75589d = b0Var2;
        this.f75590e = list;
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) {
        Object i4;
        i4 = c.i(this.f75586a, this.f75587b, this.f75588c, this.f75589d, this.f75590e, obj, method, objArr);
        return i4;
    }
}
