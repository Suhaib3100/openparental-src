package kotlinx.coroutines;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* compiled from: CoroutineContext.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0081\b\u0018\u0000 \u001b2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u001cB\u000f\u0012\u0006\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u0004\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0002H\u0016J\t\u0010\f\u001a\u00020\u000bHÆ\u0003J\u0013\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\u000bHÆ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003R\u0017\u0010\r\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001d"}, d2 = {"Lkotlinx/coroutines/s0;", "Lkotlinx/coroutines/r3;", "", "Lkotlin/coroutines/a;", "toString", "Lkotlin/coroutines/g;", "context", "J0", "oldState", "Lkotlin/m2;", "F0", "", "y0", "id", "A0", "", "hashCode", "", "other", "", "equals", "p", "J", "E0", "()J", "<init>", "(J)V", "q", "a", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
@IgnoreJRERequirement
/* loaded from: classes6.dex */
public final /* data */ class s0 extends AbstractCoroutineContextElement implements r3<String> {

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    @d5.d
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final long id;

    /* compiled from: CoroutineContext.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlinx/coroutines/s0$a;", "Lkotlin/coroutines/g$c;", "Lkotlinx/coroutines/s0;", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.s0$a, reason: from kotlin metadata */
    /* loaded from: classes5.dex */
    public static final class Companion implements CoroutineContext.c<s0> {
        private Companion() {
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    public s0(long j5) {
        super(INSTANCE);
        this.id = j5;
    }

    public static s0 B0(s0 s0Var, long j5, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            j5 = s0Var.id;
        }
        s0Var.getClass();
        return new s0(j5);
    }

    @d5.d
    public final s0 A0(long id) {
        return new s0(id);
    }

    /* renamed from: E0, reason: from getter */
    public final long getId() {
        return this.id;
    }

    @Override // kotlinx.coroutines.r3
    /* renamed from: F0, reason: merged with bridge method [inline-methods] */
    public void f0(@d5.d CoroutineContext coroutineContext, @d5.d String str) {
        Thread.currentThread().setName(str);
    }

    @Override // kotlinx.coroutines.r3
    @d5.d
    /* renamed from: J0, reason: merged with bridge method [inline-methods] */
    public String o0(@d5.d CoroutineContext context) {
        String s5;
        int D3;
        t0 t0Var = (t0) context.b(t0.INSTANCE);
        if (t0Var == null || (s5 = t0Var.getName()) == null) {
            s5 = ProtectedSandApp.s("酉");
        }
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        D3 = kotlin.text.h0.D3(name, ProtectedSandApp.s("酊"), 0, false, 6, null);
        if (D3 < 0) {
            D3 = name.length();
        }
        StringBuilder sb = new StringBuilder(s5.length() + D3 + 10);
        String substring = name.substring(0, D3);
        kotlin.jvm.internal.l0.o(substring, ProtectedSandApp.s("酋"));
        sb.append(substring);
        sb.append(ProtectedSandApp.s("酌"));
        sb.append(s5);
        sb.append('#');
        sb.append(this.id);
        String sb2 = sb.toString();
        kotlin.jvm.internal.l0.o(sb2, ProtectedSandApp.s("配"));
        currentThread.setName(sb2);
        return name;
    }

    public boolean equals(@d5.e Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof s0) && this.id == ((s0) other).id;
    }

    public int hashCode() {
        return Long.hashCode(this.id);
    }

    @d5.d
    public String toString() {
        return ProtectedSandApp.s("酎") + this.id + ')';
    }

    public final long y0() {
        return this.id;
    }
}
