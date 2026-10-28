package kotlinx.coroutines.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;
import kotlinx.coroutines.internal.p0;

/* compiled from: ConcurrentLinkedList.kt */
@kd.g
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0081@\u0018\u0000*\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00012\u00020\u0003B\u0014\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0003HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0015\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u001a\u001a\u00028\u00008F¢\u0006\f\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017\u0088\u0001\u0004\u0092\u0001\u0004\u0018\u00010\u0003ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001b"}, d2 = {"Lkotlinx/coroutines/internal/q0;", "Lkotlinx/coroutines/internal/p0;", "S", "", "value", "b", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "i", "(Ljava/lang/Object;)Ljava/lang/String;", "", "g", "(Ljava/lang/Object;)I", "other", "", "c", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "a", "Ljava/lang/Object;", "h", "(Ljava/lang/Object;)Z", "isClosed", "f", "(Ljava/lang/Object;)Lkotlinx/coroutines/internal/p0;", "e", "()V", "segment", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class q0<S extends p0<S>> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final Object value;

    private /* synthetic */ q0(Object obj) {
        this.value = obj;
    }

    public static final /* synthetic */ q0 a(Object obj) {
        return new q0(obj);
    }

    @fg.l
    public static <S extends p0<S>> Object b(@fg.m Object obj) {
        return obj;
    }

    public static boolean c(Object obj, Object obj2) {
        return (obj2 instanceof q0) && kotlin.jvm.internal.l0.g(obj, ((q0) obj2).value);
    }

    public static final boolean d(Object obj, Object obj2) {
        return kotlin.jvm.internal.l0.g(obj, obj2);
    }

    public static /* synthetic */ void e() {
    }

    @fg.l
    public static final S f(Object obj) {
        s0 s0Var;
        s0Var = f.f80766b;
        if (obj == s0Var) {
            throw new IllegalStateException(ProtectedSandApp.s("蠅\u0001"));
        }
        kotlin.jvm.internal.l0.n(obj, ProtectedSandApp.s("蠄\u0001"));
        return (S) obj;
    }

    public static int g(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public static final boolean h(Object obj) {
        s0 s0Var;
        s0Var = f.f80766b;
        return obj == s0Var;
    }

    public static String i(Object obj) {
        return ProtectedSandApp.s("蠆\u0001") + obj + ')';
    }

    public boolean equals(Object obj) {
        return c(this.value, obj);
    }

    public int hashCode() {
        return g(this.value);
    }

    /* renamed from: j, reason: from getter */
    public final /* synthetic */ Object getValue() {
        return this.value;
    }

    public String toString() {
        return i(this.value);
    }
}
