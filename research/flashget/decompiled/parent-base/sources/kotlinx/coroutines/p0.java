package kotlinx.coroutines;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.coroutines.g;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* compiled from: CoroutineContext.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0081\b\u0018\u0000 !2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\"B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u0013¨\u0006#"}, d2 = {"Lkotlinx/coroutines/p0;", "Lkotlinx/coroutines/l3;", "", "Lkotlin/coroutines/a;", "", "id", "<init>", "(J)V", "toString", "()Ljava/lang/String;", "Lkotlin/coroutines/g;", "context", "j1", "(Lkotlin/coroutines/g;)Ljava/lang/String;", "oldState", "Lkotlin/k2;", "g1", "(Lkotlin/coroutines/g;Ljava/lang/String;)V", "S0", "()J", "U0", "(J)Lkotlinx/coroutines/p0;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "c", "J", "e1", "d", "a", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
@IgnoreJRERequirement
@kotlin.w0
/* loaded from: classes7.dex */
public final /* data */ class p0 extends kotlin.coroutines.a implements l3<String> {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final long id;

    /* compiled from: CoroutineContext.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlinx/coroutines/p0$a;", "Lkotlin/coroutines/g$c;", "Lkotlinx/coroutines/p0;", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: kotlinx.coroutines.p0$a, reason: from kotlin metadata */
    public static final class Companion implements g.c<p0> {
        private Companion() {
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    public p0(long j4) {
        super(INSTANCE);
        this.id = j4;
    }

    public static p0 c1(p0 p0Var, long j4, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            j4 = p0Var.id;
        }
        p0Var.getClass();
        return new p0(j4);
    }

    /* renamed from: S0, reason: from getter */
    public final long getId() {
        return this.id;
    }

    @fg.l
    public final p0 U0(long id2) {
        return new p0(id2);
    }

    public final long e1() {
        return this.id;
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof p0) && this.id == ((p0) other).id;
    }

    @Override // kotlinx.coroutines.l3
    /* renamed from: g1, reason: merged with bridge method [inline-methods] */
    public void H(@fg.l kotlin.coroutines.g context, @fg.l String oldState) {
        Thread.currentThread().setName(oldState);
    }

    public int hashCode() {
        return Long.hashCode(this.id);
    }

    @Override // kotlinx.coroutines.l3
    @fg.l
    /* renamed from: j1, reason: merged with bridge method [inline-methods] */
    public String M0(@fg.l kotlin.coroutines.g context) {
        String s4;
        q0 q0Var = (q0) context.c(q0.INSTANCE);
        if (q0Var == null || (s4 = q0Var.getName()) == null) {
            s4 = ProtectedSandApp.s("蠬\u0001");
        }
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        int D3 = kotlin.text.v.D3(name, ProtectedSandApp.s("蠭\u0001"), 0, false, 6, null);
        if (D3 < 0) {
            D3 = name.length();
        }
        StringBuilder sb = new StringBuilder(com.google.android.gms.common.stats.a.a(s4, D3, 10));
        String substring = name.substring(0, D3);
        kotlin.jvm.internal.l0.o(substring, ProtectedSandApp.s("蠮\u0001"));
        sb.append(substring);
        sb.append(ProtectedSandApp.s("蠭\u0001"));
        sb.append(s4);
        sb.append('#');
        sb.append(this.id);
        String sb2 = sb.toString();
        kotlin.jvm.internal.l0.o(sb2, ProtectedSandApp.s("蠯\u0001"));
        currentThread.setName(sb2);
        return name;
    }

    @fg.l
    public String toString() {
        return androidx.collection.y0.a(new StringBuilder(ProtectedSandApp.s("蠰\u0001")), this.id, ')');
    }
}
