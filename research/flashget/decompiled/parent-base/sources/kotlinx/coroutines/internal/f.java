package kotlinx.coroutines.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.common.util.concurrent.d2;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;
import kotlin.k2;

/* compiled from: ConcurrentLinkedList.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u001al\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0000*\u00028\u00002\u0006\u0010\u0003\u001a\u00020\u000226\u0010\b\u001a2\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0003\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00028\u00000\u0004H\u0000ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a#\u0010\u000e\u001a\u00028\u0000\"\u000e\b\u0000\u0010\r*\b\u0012\u0004\u0012\u00028\u00000\f*\u00028\u0000H\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a?\u0010\u0017\u001a\u00020\u0015*\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00112!\u0010\u0016\u001a\u001d\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u00150\u0013H\u0082\b¢\u0006\u0004\b\u0017\u0010\u0018\"\u0014\u0010\u001b\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a\"\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006 "}, d2 = {"Lkotlinx/coroutines/internal/p0;", "S", "", "id", "Lkotlin/Function2;", "Lkotlin/r0;", "name", "prev", "createNewSegment", "Lkotlinx/coroutines/internal/q0;", "g", "(Lkotlinx/coroutines/internal/p0;JLld/p;)Ljava/lang/Object;", "Lkotlinx/coroutines/internal/g;", "N", "d", "(Lkotlinx/coroutines/internal/g;)Lkotlinx/coroutines/internal/g;", "Lkotlinx/atomicfu/AtomicInt;", "", "delta", "Lkotlin/Function1;", "cur", "", "condition", "addConditionally", "(Lkotlinx/atomicfu/AtomicInt;ILld/l;)Z", "a", "I", "POINTERS_SHIFT", "Lkotlinx/coroutines/internal/s0;", "b", "Lkotlinx/coroutines/internal/s0;", "CLOSED", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nConcurrentLinkedList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConcurrentLinkedList.kt\nkotlinx/coroutines/internal/ConcurrentLinkedListKt\n+ 2 ConcurrentLinkedList.kt\nkotlinx/coroutines/internal/ConcurrentLinkedListNode\n*L\n1#1,269:1\n46#1,8:284\n107#2,7:270\n107#2,7:277\n*S KotlinDebug\n*F\n+ 1 ConcurrentLinkedList.kt\nkotlinx/coroutines/internal/ConcurrentLinkedListKt\n*L\n74#1:284,8\n27#1:270,7\n85#1:277,7\n*E\n"})
/* loaded from: classes7.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private static final int f80765a = 16;

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    private static final s0 f80766b = new s0(ProtectedSandApp.s("蟢\u0001"));

    private static final boolean b(Object obj, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater, int i4, ld.l<? super Integer, Boolean> lVar) {
        int i5;
        do {
            i5 = atomicIntegerFieldUpdater.get(obj);
            if (!lVar.invoke(Integer.valueOf(i5)).booleanValue()) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(obj, i5, i5 + i4));
        return true;
    }

    private static final boolean c(Object obj, AtomicIntegerArray atomicIntegerArray, int i4, int i5, ld.l<? super Integer, Boolean> lVar) {
        int i6;
        do {
            i6 = atomicIntegerArray.get(i4);
            if (!lVar.invoke(Integer.valueOf(i6)).booleanValue()) {
                return false;
            }
        } while (!atomicIntegerArray.compareAndSet(i4, i6, i6 + i5));
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [kotlinx.coroutines.internal.g] */
    @fg.l
    public static final <N extends g<N>> N d(@fg.l N n4) {
        while (true) {
            Object a5 = g.a(n4);
            if (a5 == f80766b) {
                return n4;
            }
            ?? r02 = (g) a5;
            if (r02 != 0) {
                n4 = r02;
            } else if (n4.j()) {
                return n4;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @fg.l
    public static final Object e(@fg.m Object obj, @fg.l AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, long j4, @fg.l Object obj2, @fg.l ld.p<? super Long, Object, Object> pVar) {
        Object g4;
        loop0: while (true) {
            g4 = g(obj2, j4, pVar);
            if (!q0.h(g4)) {
                p0 f4 = q0.f(g4);
                while (true) {
                    p0 p0Var = (p0) atomicReferenceFieldUpdater.get(obj);
                    if (p0Var.id >= f4.id) {
                        break loop0;
                    }
                    if (!f4.s()) {
                        break;
                    }
                    if (androidx.concurrent.futures.c.a(atomicReferenceFieldUpdater, obj, p0Var, f4)) {
                        if (p0Var.o()) {
                            p0Var.l();
                        }
                    } else if (f4.o()) {
                        f4.l();
                    }
                }
            } else {
                break;
            }
        }
        return g4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @fg.l
    public static final Object f(@fg.m Object obj, @fg.l AtomicReferenceArray atomicReferenceArray, int i4, long j4, @fg.l Object obj2, @fg.l ld.p<? super Long, Object, Object> pVar) {
        Object g4;
        loop0: while (true) {
            g4 = g(obj2, j4, pVar);
            if (!q0.h(g4)) {
                p0 f4 = q0.f(g4);
                while (true) {
                    p0 p0Var = (p0) atomicReferenceArray.get(i4);
                    if (p0Var.id >= f4.id) {
                        break loop0;
                    }
                    if (!f4.s()) {
                        break;
                    }
                    if (d2.a(atomicReferenceArray, i4, p0Var, f4)) {
                        if (p0Var.o()) {
                            p0Var.l();
                        }
                    } else if (f4.o()) {
                        f4.l();
                    }
                }
            } else {
                break;
            }
        }
        return g4;
    }

    @fg.l
    public static final <S extends p0<S>> Object g(@fg.l S s4, long j4, @fg.l ld.p<? super Long, ? super S, ? extends S> pVar) {
        while (true) {
            if (s4.id >= j4 && !s4.h()) {
                return s4;
            }
            Object a5 = g.a(s4);
            s0 s0Var = f80766b;
            if (a5 == s0Var) {
                return s0Var;
            }
            S s5 = (S) ((g) a5);
            if (s5 == null) {
                s5 = pVar.invoke(Long.valueOf(s4.id + 1), s4);
                if (s4.m(s5)) {
                    if (s4.h()) {
                        s4.l();
                    }
                }
            }
            s4 = s5;
        }
    }

    private static final void h(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, ld.l<Object, k2> lVar, Object obj) {
        while (true) {
            lVar.invoke(atomicReferenceFieldUpdater.get(obj));
        }
    }

    private static final void i(AtomicReferenceArray atomicReferenceArray, int i4, ld.l<Object, k2> lVar) {
        while (true) {
            lVar.invoke(atomicReferenceArray.get(i4));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean j(@fg.m Object obj, @fg.l AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, @fg.l Object obj2) {
        while (true) {
            p0 p0Var = (p0) atomicReferenceFieldUpdater.get(obj);
            if (p0Var.id >= obj2.id) {
                return true;
            }
            if (!obj2.s()) {
                return false;
            }
            if (androidx.concurrent.futures.c.a(atomicReferenceFieldUpdater, obj, p0Var, obj2)) {
                if (p0Var.o()) {
                    p0Var.l();
                }
                return true;
            }
            if (obj2.o()) {
                obj2.l();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean k(@fg.m Object obj, @fg.l AtomicReferenceArray atomicReferenceArray, int i4, @fg.l Object obj2) {
        while (true) {
            p0 p0Var = (p0) atomicReferenceArray.get(i4);
            if (p0Var.id >= obj2.id) {
                return true;
            }
            if (!obj2.s()) {
                return false;
            }
            if (d2.a(atomicReferenceArray, i4, p0Var, obj2)) {
                if (p0Var.o()) {
                    p0Var.l();
                }
                return true;
            }
            if (obj2.o()) {
                obj2.l();
            }
        }
    }
}
