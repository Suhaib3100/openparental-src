package kotlinx.coroutines;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.g;
import kotlinx.coroutines.k2;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Job.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\u001a\u0019\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001b\u0010\u0005\u001a\u00020\u00002\n\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001b\u0010\t\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u0017\u0010\f\u001a\u00020\u000b*\u00020\u0000H\u0086@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001a#\u0010\u0011\u001a\u00020\u000b*\u00020\u00002\u0010\b\u0002\u0010\u0010\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0013\u0010\u0013\u001a\u00020\u000b*\u00020\u0000H\u0007¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001f\u0010\u0016\u001a\u00020\u000b*\u00020\u00002\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0015H\u0007¢\u0006\u0004\b\u0016\u0010\u0017\u001a#\u0010\u0019\u001a\u00020\u000b*\u00020\u00182\u0010\b\u0002\u0010\u0010\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0013\u0010\u001b\u001a\u00020\u000b*\u00020\u0018H\u0007¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0011\u0010\u001d\u001a\u00020\u000b*\u00020\u0000¢\u0006\u0004\b\u001d\u0010\u0014\u001a\u0011\u0010\u001e\u001a\u00020\u000b*\u00020\u0018¢\u0006\u0004\b\u001e\u0010\u001c\u001a%\u0010!\u001a\u00020\u000b*\u00020\u00002\u0006\u0010 \u001a\u00020\u001f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b!\u0010\"\u001a\u001f\u0010$\u001a\u00020#*\u00020\u00182\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0015H\u0007¢\u0006\u0004\b$\u0010%\u001a#\u0010&\u001a\u00020\u000b*\u00020\u00182\u0010\b\u0002\u0010\u0010\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f¢\u0006\u0004\b&\u0010\u001a\u001a\u0013\u0010'\u001a\u00020\u000b*\u00020\u0018H\u0007¢\u0006\u0004\b'\u0010\u001c\u001a\u001f\u0010(\u001a\u00020\u000b*\u00020\u00182\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0015H\u0007¢\u0006\u0004\b(\u0010)\u001a\u001d\u0010+\u001a\u00020\u0015*\u0004\u0018\u00010\u00152\u0006\u0010*\u001a\u00020\u0000H\u0002¢\u0006\u0004\b+\u0010,\"\u0015\u0010/\u001a\u00020#*\u00020\u00188F¢\u0006\u0006\u001a\u0004\b-\u0010.\"\u0015\u0010*\u001a\u00020\u0000*\u00020\u00188F¢\u0006\u0006\u001a\u0004\b0\u00101\u0082\u0002\u0004\n\u0002\b\u0019¨\u00062"}, d2 = {"Lkotlinx/coroutines/k2;", "parent", "Lkotlinx/coroutines/b0;", "a", "(Lkotlinx/coroutines/k2;)Lkotlinx/coroutines/b0;", "b", "(Lkotlinx/coroutines/k2;)Lkotlinx/coroutines/k2;", "Lkotlinx/coroutines/m1;", "handle", "w", "(Lkotlinx/coroutines/k2;Lkotlinx/coroutines/m1;)Lkotlinx/coroutines/m1;", "Lkotlin/k2;", "l", "(Lkotlinx/coroutines/k2;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "cause", "r", "(Lkotlinx/coroutines/k2;Ljava/util/concurrent/CancellationException;)V", "p", "(Lkotlinx/coroutines/k2;)V", "", "q", "(Lkotlinx/coroutines/k2;Ljava/lang/Throwable;)V", "Lkotlin/coroutines/g;", "f", "(Lkotlin/coroutines/g;Ljava/util/concurrent/CancellationException;)V", "e", "(Lkotlin/coroutines/g;)V", "y", "x", "", "message", "g", "(Lkotlinx/coroutines/k2;Ljava/lang/String;Ljava/lang/Throwable;)V", "", "h", "(Lkotlin/coroutines/g;Ljava/lang/Throwable;)Z", "o", "m", "n", "(Lkotlin/coroutines/g;Ljava/lang/Throwable;)V", "job", "B", "(Ljava/lang/Throwable;Lkotlinx/coroutines/k2;)Ljava/lang/Throwable;", "A", "(Lkotlin/coroutines/g;)Z", "isActive", "z", "(Lkotlin/coroutines/g;)Lkotlinx/coroutines/k2;", "kotlinx-coroutines-core"}, k = 5, mv = {1, 8, 0}, xi = 48, xs = "kotlinx/coroutines/JobKt")
@kotlin.jvm.internal.r1({"SMAP\nJob.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Job.kt\nkotlinx/coroutines/JobKt__JobKt\n+ 2 CompletionHandler.kt\nkotlinx/coroutines/CompletionHandlerKt\n+ 3 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,685:1\n13#2:686\n1295#3,2:687\n1295#3,2:689\n1295#3,2:691\n1295#3,2:693\n*S KotlinDebug\n*F\n+ 1 Job.kt\nkotlinx/coroutines/JobKt__JobKt\n*L\n494#1:686\n521#1:687,2\n535#1:689,2\n629#1:691,2\n653#1:693,2\n*E\n"})
/* loaded from: classes7.dex */
public final /* synthetic */ class p2 {
    public static final boolean A(@fg.l kotlin.coroutines.g gVar) {
        k2 k2Var = (k2) gVar.c(k2.INSTANCE);
        if (k2Var != null) {
            return k2Var.isActive();
        }
        return true;
    }

    private static final Throwable B(Throwable th, k2 k2Var) {
        return th == null ? new JobCancellationException(ProtectedSandApp.s("蠴\u0001"), null, k2Var) : th;
    }

    @fg.l
    public static final b0 a(@fg.m k2 k2Var) {
        return new m2(k2Var);
    }

    @kotlin.k(level = kotlin.m.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    @kd.i(name = "Job")
    public static final k2 b(k2 k2Var) {
        return new m2(k2Var);
    }

    public static b0 c(k2 k2Var, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            k2Var = null;
        }
        return new m2(k2Var);
    }

    public static k2 d(k2 k2Var, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            k2Var = null;
        }
        return new m2(k2Var);
    }

    @kotlin.k(level = kotlin.m.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public static final void e(kotlin.coroutines.g gVar) {
        f(gVar, null);
    }

    public static final void f(@fg.l kotlin.coroutines.g gVar, @fg.m CancellationException cancellationException) {
        k2 k2Var = (k2) gVar.c(k2.INSTANCE);
        if (k2Var != null) {
            k2Var.b(cancellationException);
        }
    }

    public static final void g(@fg.l k2 k2Var, @fg.l String str, @fg.m Throwable th) {
        k2Var.b(v1.a(str, th));
    }

    @kotlin.k(level = kotlin.m.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public static final /* synthetic */ boolean h(kotlin.coroutines.g gVar, Throwable th) {
        g.b c5 = gVar.c(k2.INSTANCE);
        r2 r2Var = c5 instanceof r2 ? (r2) c5 : null;
        if (r2Var == null) {
            return false;
        }
        r2Var.G0(B(th, r2Var));
        return true;
    }

    public static void i(kotlin.coroutines.g gVar, CancellationException cancellationException, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            cancellationException = null;
        }
        f(gVar, cancellationException);
    }

    public static void j(k2 k2Var, String str, Throwable th, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            th = null;
        }
        g(k2Var, str, th);
    }

    public static /* synthetic */ boolean k(kotlin.coroutines.g gVar, Throwable th, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            th = null;
        }
        return h(gVar, th);
    }

    @fg.m
    public static final Object l(@fg.l k2 k2Var, @fg.l kotlin.coroutines.d<? super kotlin.k2> dVar) {
        k2.a.b(k2Var, null, 1, null);
        Object j02 = k2Var.j0(dVar);
        return j02 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? j02 : kotlin.k2.f75408a;
    }

    @kotlin.k(level = kotlin.m.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public static final void m(kotlin.coroutines.g gVar) {
        o(gVar, null);
    }

    @kotlin.k(level = kotlin.m.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public static final /* synthetic */ void n(kotlin.coroutines.g gVar, Throwable th) {
        k2 k2Var = (k2) gVar.c(k2.INSTANCE);
        if (k2Var == null) {
            return;
        }
        for (k2 k2Var2 : k2Var.o()) {
            r2 r2Var = k2Var2 instanceof r2 ? (r2) k2Var2 : null;
            if (r2Var != null) {
                r2Var.G0(B(th, k2Var));
            }
        }
    }

    public static final void o(@fg.l kotlin.coroutines.g gVar, @fg.m CancellationException cancellationException) {
        kotlin.sequences.m<k2> o4;
        k2 k2Var = (k2) gVar.c(k2.INSTANCE);
        if (k2Var == null || (o4 = k2Var.o()) == null) {
            return;
        }
        Iterator<k2> it = o4.iterator();
        while (it.hasNext()) {
            it.next().b(cancellationException);
        }
    }

    @kotlin.k(level = kotlin.m.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public static final void p(k2 k2Var) {
        r(k2Var, null);
    }

    @kotlin.k(level = kotlin.m.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public static final /* synthetic */ void q(k2 k2Var, Throwable th) {
        for (k2 k2Var2 : k2Var.o()) {
            r2 r2Var = k2Var2 instanceof r2 ? (r2) k2Var2 : null;
            if (r2Var != null) {
                r2Var.G0(B(th, k2Var));
            }
        }
    }

    public static final void r(@fg.l k2 k2Var, @fg.m CancellationException cancellationException) {
        Iterator<k2> it = k2Var.o().iterator();
        while (it.hasNext()) {
            it.next().b(cancellationException);
        }
    }

    public static /* synthetic */ void s(kotlin.coroutines.g gVar, Throwable th, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            th = null;
        }
        n(gVar, th);
    }

    public static void t(kotlin.coroutines.g gVar, CancellationException cancellationException, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            cancellationException = null;
        }
        o(gVar, cancellationException);
    }

    public static /* synthetic */ void u(k2 k2Var, Throwable th, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            th = null;
        }
        q(k2Var, th);
    }

    public static void v(k2 k2Var, CancellationException cancellationException, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            cancellationException = null;
        }
        r(k2Var, cancellationException);
    }

    @fg.l
    public static final m1 w(@fg.l k2 k2Var, @fg.l m1 m1Var) {
        return k2Var.F(new o1(m1Var));
    }

    public static final void x(@fg.l kotlin.coroutines.g gVar) {
        k2 k2Var = (k2) gVar.c(k2.INSTANCE);
        if (k2Var != null) {
            y(k2Var);
        }
    }

    public static final void y(@fg.l k2 k2Var) {
        if (!k2Var.isActive()) {
            throw k2Var.x();
        }
    }

    @fg.l
    public static final k2 z(@fg.l kotlin.coroutines.g gVar) {
        k2 k2Var = (k2) gVar.c(k2.INSTANCE);
        if (k2Var != null) {
            return k2Var;
        }
        throw new IllegalStateException((ProtectedSandApp.s("蠵\u0001") + gVar).toString());
    }
}
