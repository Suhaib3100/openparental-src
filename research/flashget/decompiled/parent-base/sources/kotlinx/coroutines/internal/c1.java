package kotlinx.coroutines.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.lang.Comparable;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;
import kotlin.k2;
import kotlinx.coroutines.f2;
import kotlinx.coroutines.internal.d1;

/* compiled from: ThreadSafeHeap.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u0000*\u0012\b\u0000\u0010\u0003*\u00020\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0004j\u0002`\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0082\u0010¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0082\u0010¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0011\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\n¢\u0006\u0004\b\u0013\u0010\u0007J2\u0010\u001a\u001a\u0004\u0018\u00018\u00002!\u0010\u0019\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\u00180\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\t\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\t\u0010\u001cJ\u000f\u0010\u001d\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u001d\u0010\u001cJ&\u0010\u001e\u001a\u0004\u0018\u00018\u00002\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00180\u0014H\u0086\b¢\u0006\u0004\b\u001e\u0010\u001bJ\u0015\u0010 \u001a\u00020\n2\u0006\u0010\u001f\u001a\u00028\u0000¢\u0006\u0004\b \u0010!J.\u0010#\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00028\u00002\u0014\u0010\"\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00020\u00180\u0014H\u0086\b¢\u0006\u0004\b#\u0010$J\u0015\u0010%\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00028\u0000¢\u0006\u0004\b%\u0010&J\u0011\u0010'\u001a\u0004\u0018\u00018\u0000H\u0001¢\u0006\u0004\b'\u0010\u001cJ\u0017\u0010)\u001a\u00028\u00002\u0006\u0010(\u001a\u00020\bH\u0001¢\u0006\u0004\b)\u0010*J\u0017\u0010+\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00028\u0000H\u0001¢\u0006\u0004\b+\u0010!R \u0010+\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R$\u00100\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\b8F@BX\u0086\u000e¢\u0006\f\u001a\u0004\b-\u0010.\"\u0004\b/\u0010\fR\u0011\u00103\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b1\u00102R\u000b\u00105\u001a\u0002048\u0002X\u0082\u0004¨\u00066"}, d2 = {"Lkotlinx/coroutines/internal/c1;", "Lkotlinx/coroutines/internal/d1;", "", "T", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "<init>", "()V", "", "i", "Lkotlin/k2;", "q", "(I)V", "p", "", "j", "()[Lkotlinx/coroutines/internal/d1;", "r", "(II)V", "d", "Lkotlin/Function1;", "Lkotlin/r0;", "name", "value", "", "predicate", "e", "(Lld/l;)Lkotlinx/coroutines/internal/d1;", "()Lkotlinx/coroutines/internal/d1;", "n", "m", "node", "b", "(Lkotlinx/coroutines/internal/d1;)V", "cond", "c", "(Lkotlinx/coroutines/internal/d1;Lld/l;)Z", "k", "(Lkotlinx/coroutines/internal/d1;)Z", "f", "index", "l", "(I)Lkotlinx/coroutines/internal/d1;", "a", "[Lkotlinx/coroutines/internal/d1;", "g", "()I", "o", "size", "h", "()Z", "isEmpty", "Lkotlinx/atomicfu/AtomicInt;", "_size", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
@f2
@r1({"SMAP\nThreadSafeHeap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThreadSafeHeap.kt\nkotlinx/coroutines/internal/ThreadSafeHeap\n+ 2 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 3 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,168:1\n28#2,4:169\n28#2,4:174\n28#2,4:179\n28#2,4:184\n28#2,4:189\n28#2,4:194\n28#2,4:199\n28#2,4:204\n20#3:173\n20#3:178\n20#3:183\n20#3:188\n20#3:193\n20#3:198\n20#3:203\n20#3:208\n1#4:209\n*S KotlinDebug\n*F\n+ 1 ThreadSafeHeap.kt\nkotlinx/coroutines/internal/ThreadSafeHeap\n*L\n35#1:169,4\n42#1:174,4\n50#1:179,4\n52#1:184,4\n60#1:189,4\n69#1:194,4\n72#1:199,4\n81#1:204,4\n35#1:173\n42#1:178\n50#1:183\n52#1:188\n60#1:193\n69#1:198\n72#1:203\n81#1:208\n*E\n"})
/* loaded from: classes7.dex */
public class c1<T extends d1 & Comparable<? super T>> {

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    private static final AtomicIntegerFieldUpdater f80751b = AtomicIntegerFieldUpdater.newUpdater(c1.class, ProtectedSandApp.s("蟖\u0001"));

    @kd.x
    private volatile int _size;

    @fg.m
    private T[] a;

    private final T[] j() {
        T[] tArr = this.a;
        if (tArr == null) {
            T[] tArr2 = (T[]) new d1[4];
            this.a = tArr2;
            return tArr2;
        }
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f80751b;
        if (atomicIntegerFieldUpdater.get(this) < tArr.length) {
            return tArr;
        }
        Object[] copyOf = Arrays.copyOf(tArr, atomicIntegerFieldUpdater.get(this) * 2);
        kotlin.jvm.internal.l0.o(copyOf, ProtectedSandApp.s("蟗\u0001"));
        T[] tArr3 = (T[]) ((d1[]) copyOf);
        this.a = tArr3;
        return tArr3;
    }

    private final void o(int i4) {
        f80751b.set(this, i4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x002a, code lost:
    
        if (((java.lang.Comparable) r2).compareTo(r4) < 0) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void p(int r6) {
        /*
            r5 = this;
        L0:
            int r0 = r6 * 2
            int r1 = r0 + 1
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = kotlinx.coroutines.internal.c1.f80751b
            int r3 = r2.get(r5)
            if (r1 < r3) goto Ld
            return
        Ld:
            T extends kotlinx.coroutines.internal.d1 & java.lang.Comparable<? super T>[] r3 = r5.a
            kotlin.jvm.internal.l0.m(r3)
            int r0 = r0 + 2
            int r2 = r2.get(r5)
            if (r0 >= r2) goto L2d
            r2 = r3[r0]
            kotlin.jvm.internal.l0.m(r2)
            java.lang.Comparable r2 = (java.lang.Comparable) r2
            r4 = r3[r1]
            kotlin.jvm.internal.l0.m(r4)
            int r2 = r2.compareTo(r4)
            if (r2 >= 0) goto L2d
            goto L2e
        L2d:
            r0 = r1
        L2e:
            r1 = r3[r6]
            kotlin.jvm.internal.l0.m(r1)
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            r2 = r3[r0]
            kotlin.jvm.internal.l0.m(r2)
            int r1 = r1.compareTo(r2)
            if (r1 > 0) goto L41
            return
        L41:
            r5.r(r6, r0)
            r6 = r0
            goto L0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.c1.p(int):void");
    }

    private final void q(int i4) {
        while (i4 > 0) {
            T[] tArr = this.a;
            kotlin.jvm.internal.l0.m(tArr);
            int i5 = (i4 - 1) / 2;
            T t4 = tArr[i5];
            kotlin.jvm.internal.l0.m(t4);
            T t5 = tArr[i4];
            kotlin.jvm.internal.l0.m(t5);
            if (((Comparable) t4).compareTo(t5) <= 0) {
                return;
            }
            r(i4, i5);
            i4 = i5;
        }
    }

    private final void r(int i4, int j4) {
        T[] tArr = this.a;
        kotlin.jvm.internal.l0.m(tArr);
        T t4 = tArr[j4];
        kotlin.jvm.internal.l0.m(t4);
        T t5 = tArr[i4];
        kotlin.jvm.internal.l0.m(t5);
        tArr[i4] = t4;
        tArr[j4] = t5;
        t4.setIndex(i4);
        t5.setIndex(j4);
    }

    @kotlin.w0
    public final void a(@fg.l T node) {
        node.a(this);
        T[] j4 = j();
        int i4 = f80751b.get(this);
        o(i4 + 1);
        j4[i4] = node;
        node.setIndex(i4);
        q(i4);
    }

    public final void b(@fg.l T node) {
        synchronized (this) {
            a(node);
            k2 k2Var = k2.f75408a;
        }
    }

    public final boolean c(@fg.l T node, @fg.l ld.l<? super T, Boolean> cond) {
        boolean z4;
        synchronized (this) {
            if (cond.invoke(f()).booleanValue()) {
                a(node);
                z4 = true;
            } else {
                z4 = false;
            }
        }
        return z4;
    }

    public final void d() {
        synchronized (this) {
            try {
                T[] tArr = this.a;
                if (tArr != null) {
                    kotlin.collections.l.V1(tArr, null, 0, 0, 6, null);
                }
                f80751b.set(this, 0);
                k2 k2Var = k2.f75408a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @fg.m
    public final T e(@fg.l ld.l<? super T, Boolean> predicate) {
        T t4;
        synchronized (this) {
            try {
                int i4 = f80751b.get(this);
                int i5 = 0;
                while (true) {
                    t4 = null;
                    if (i5 >= i4) {
                        break;
                    }
                    T[] tArr = this.a;
                    if (tArr != null) {
                        t4 = (Object) tArr[i5];
                    }
                    kotlin.jvm.internal.l0.m(t4);
                    if (predicate.invoke(t4).booleanValue()) {
                        break;
                    }
                    i5++;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return t4;
    }

    @fg.m
    @kotlin.w0
    public final T f() {
        T[] tArr = this.a;
        if (tArr != null) {
            return tArr[0];
        }
        return null;
    }

    public final int g() {
        return f80751b.get(this);
    }

    public final boolean h() {
        return f80751b.get(this) == 0;
    }

    @fg.m
    public final T i() {
        T f4;
        synchronized (this) {
            f4 = f();
        }
        return f4;
    }

    public final boolean k(@fg.l T node) {
        boolean z4;
        synchronized (this) {
            if (node.c() == null) {
                z4 = false;
            } else {
                l(node.getIndex());
                z4 = true;
            }
        }
        return z4;
    }

    @fg.l
    @kotlin.w0
    public final T l(int index) {
        T[] tArr = this.a;
        kotlin.jvm.internal.l0.m(tArr);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f80751b;
        o(atomicIntegerFieldUpdater.get(this) - 1);
        if (index < atomicIntegerFieldUpdater.get(this)) {
            r(index, atomicIntegerFieldUpdater.get(this));
            int i4 = (index - 1) / 2;
            if (index > 0) {
                T t4 = tArr[index];
                kotlin.jvm.internal.l0.m(t4);
                T t5 = tArr[i4];
                kotlin.jvm.internal.l0.m(t5);
                if (((Comparable) t4).compareTo(t5) < 0) {
                    r(index, i4);
                    q(i4);
                }
            }
            p(index);
        }
        T t6 = tArr[atomicIntegerFieldUpdater.get(this)];
        kotlin.jvm.internal.l0.m(t6);
        t6.a(null);
        t6.setIndex(-1);
        tArr[atomicIntegerFieldUpdater.get(this)] = null;
        return t6;
    }

    @fg.m
    public final T m(@fg.l ld.l<? super T, Boolean> predicate) {
        synchronized (this) {
            T f4 = f();
            if (f4 == null) {
                return null;
            }
            return predicate.invoke(f4).booleanValue() ? l(0) : null;
        }
    }

    @fg.m
    public final T n() {
        T l4;
        synchronized (this) {
            l4 = f80751b.get(this) > 0 ? l(0) : null;
        }
        return l4;
    }
}
