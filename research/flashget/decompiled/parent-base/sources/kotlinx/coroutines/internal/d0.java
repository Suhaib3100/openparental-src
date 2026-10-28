package kotlinx.coroutines.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;
import kotlinx.coroutines.v2;

/* compiled from: MainDispatchers.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lkotlinx/coroutines/internal/d0;", "", "<init>", "()V", "Lkotlinx/coroutines/v2;", "a", "()Lkotlinx/coroutines/v2;", "", "b", "Z", "FAST_SERVICE_LOADER_ENABLED", "c", "Lkotlinx/coroutines/v2;", "dispatcher", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nMainDispatchers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainDispatchers.kt\nkotlinx/coroutines/internal/MainDispatcherLoader\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,134:1\n1963#2,14:135\n*S KotlinDebug\n*F\n+ 1 MainDispatchers.kt\nkotlinx/coroutines/internal/MainDispatcherLoader\n*L\n38#1:135,14\n*E\n"})
/* loaded from: classes7.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    public static final d0 f80755a;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final boolean FAST_SERVICE_LOADER_ENABLED = false;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    @kd.f
    public static final v2 dispatcher;

    static {
        d0 d0Var = new d0();
        f80755a = d0Var;
        x0.d(ProtectedSandApp.s("蟙\u0001"), true);
        dispatcher = d0Var.a();
    }

    private d0() {
    }

    private final v2 a() {
        Object next;
        v2 f4;
        try {
            List c32 = kotlin.sequences.p.c3(kotlin.sequences.p.e(ServiceLoader.load(c0.class, c0.class.getClassLoader()).iterator()));
            Iterator it = c32.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    int c5 = ((c0) next).c();
                    do {
                        Object next2 = it.next();
                        int c6 = ((c0) next2).c();
                        if (c5 < c6) {
                            next = next2;
                            c5 = c6;
                        }
                    } while (it.hasNext());
                }
            } else {
                next = null;
            }
            c0 c0Var = (c0) next;
            if (c0Var != null && (f4 = e0.f(c0Var, c32)) != null) {
                return f4;
            }
            return e0.b(null, null, 3, null);
        } catch (Throwable th) {
            return e0.b(th, null, 2, null);
        }
    }
}
