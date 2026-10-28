package kotlinx.coroutines.internal;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import kotlin.Metadata;
import kotlin.sequences.Sequence;
import kotlinx.coroutines.y2;

/* compiled from: MainDispatchers.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0003\u001a\u00020\u0002H\u0002R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lkotlinx/coroutines/internal/e0;", "", "Lkotlinx/coroutines/y2;", "a", "", "b", "Z", "FAST_SERVICE_LOADER_ENABLED", "c", "Lkotlinx/coroutines/y2;", "dispatcher", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes5.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    public static final e0 f28701a;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final boolean FAST_SERVICE_LOADER_ENABLED;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @d5.d
    @p3.f
    public static final y2 dispatcher;

    static {
        e0 e0Var = new e0();
        f28701a = e0Var;
        FAST_SERVICE_LOADER_ENABLED = v0.c(ProtectedSandApp.s("巒"), true);
        dispatcher = e0Var.a();
    }

    private e0() {
    }

    private final y2 a() {
        Sequence e6;
        List<d0> c32;
        Object next;
        y2 f6;
        try {
            if (FAST_SERVICE_LOADER_ENABLED) {
                c32 = o.f28735a.d();
            } else {
                e6 = kotlin.sequences.s.e(ServiceLoader.load(d0.class, d0.class.getClassLoader()).iterator());
                c32 = kotlin.sequences.v.c3(e6);
            }
            Iterator<T> it = c32.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    int c6 = ((d0) next).c();
                    do {
                        Object next2 = it.next();
                        int c7 = ((d0) next2).c();
                        if (c6 < c7) {
                            next = next2;
                            c6 = c7;
                        }
                    } while (it.hasNext());
                }
            } else {
                next = null;
            }
            d0 d0Var = (d0) next;
            return (d0Var == null || (f6 = f0.f(d0Var, c32)) == null) ? f0.b(null, null, 3, null) : f6;
        } catch (Throwable th) {
            return f0.b(th, null, 2, null);
        }
    }
}
