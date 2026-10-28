package kotlinx.coroutines;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;

/* compiled from: CoroutineName.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u0000 \u00132\u00020\u0001:\u0001\u0014B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0015"}, d2 = {"Lkotlinx/coroutines/t0;", "Lkotlin/coroutines/a;", "", "toString", "y0", "name", "A0", "", "hashCode", "", "other", "", "equals", "p", "Ljava/lang/String;", "E0", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "q", "a", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes6.dex */
public final /* data */ class t0 extends AbstractCoroutineContextElement {

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    @d5.d
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final String name;

    /* compiled from: CoroutineName.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlinx/coroutines/t0$a;", "Lkotlin/coroutines/g$c;", "Lkotlinx/coroutines/t0;", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.t0$a, reason: from kotlin metadata */
    /* loaded from: classes5.dex */
    public static final class Companion implements CoroutineContext.c<t0> {
        private Companion() {
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    public t0(@d5.d String str) {
        super(INSTANCE);
        this.name = str;
    }

    public static t0 B0(t0 t0Var, String str, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = t0Var.name;
        }
        t0Var.getClass();
        return new t0(str);
    }

    @d5.d
    public final t0 A0(@d5.d String name) {
        return new t0(name);
    }

    @d5.d
    /* renamed from: E0, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public boolean equals(@d5.e Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof t0) && kotlin.jvm.internal.l0.g(this.name, ((t0) other).name);
    }

    public int hashCode() {
        return this.name.hashCode();
    }

    @d5.d
    public String toString() {
        return c1.c.a(new StringBuilder(ProtectedSandApp.s("醋")), this.name, ')');
    }

    @d5.d
    public final String y0() {
        return this.name;
    }
}
