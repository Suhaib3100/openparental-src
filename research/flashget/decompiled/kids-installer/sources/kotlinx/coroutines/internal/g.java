package kotlinx.coroutines.internal;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.Metadata;

/* compiled from: ConcurrentLinkedList.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001ao\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0000*\u00028\u00002\u0006\u0010\u0003\u001a\u00020\u000228\u0010\b\u001a4\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0003\u0012\u0015\u0012\u0013\u0018\u00018\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00028\u00000\u0004H\u0082\bø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a#\u0010\u000e\u001a\u00028\u0000\"\u000e\b\u0000\u0010\r*\b\u0012\u0004\u0012\u00028\u00000\f*\u00028\u0000H\u0000¢\u0006\u0004\b\u000e\u0010\u000f\"\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\"\u001a\u0010\u0018\u001a\u00020\u00148\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0015\u0012\u0004\b\u0016\u0010\u0017\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019"}, d2 = {"Lkotlinx/coroutines/internal/o0;", "S", "", "id", "Lkotlin/Function2;", "Lkotlin/r0;", "name", "prev", "createNewSegment", "Lkotlinx/coroutines/internal/p0;", "c", "(Lkotlinx/coroutines/internal/o0;JLq3/p;)Ljava/lang/Object;", "Lkotlinx/coroutines/internal/h;", "N", "b", "(Lkotlinx/coroutines/internal/h;)Lkotlinx/coroutines/internal/h;", "", "a", "I", "POINTERS_SHIFT", "Lkotlinx/coroutines/internal/r0;", "Lkotlinx/coroutines/internal/r0;", "getCLOSED$annotations", "()V", "CLOSED", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes5.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private static final int f28707a = 16;

    /* renamed from: b, reason: collision with root package name */
    @d5.d
    private static final r0 f28708b = new r0(ProtectedSandApp.s("巖"));

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [kotlinx.coroutines.internal.h] */
    @d5.d
    public static final <N extends h<N>> N b(@d5.d N n5) {
        while (true) {
            Object a6 = h.a(n5);
            if (a6 == f28708b) {
                return n5;
            }
            ?? r02 = (h) a6;
            if (r02 != 0) {
                n5 = r02;
            } else if (n5.j()) {
                return n5;
            }
        }
    }

    private static final <S extends o0<S>> Object c(S s5, long j5, q3.p<? super Long, ? super S, ? extends S> pVar) {
        while (true) {
            if (s5.getId() >= j5 && !s5.g()) {
                return s5;
            }
            Object a6 = h.a(s5);
            r0 r0Var = f28708b;
            if (a6 == r0Var) {
                return r0Var;
            }
            S s6 = (S) ((h) a6);
            if (s6 == null) {
                s6 = pVar.g0(Long.valueOf(s5.getId() + 1), s5);
                if (s5.m(s6)) {
                    if (s5.g()) {
                        s5.l();
                    }
                }
            }
            s5 = s6;
        }
    }

    private static /* synthetic */ void d() {
    }
}
