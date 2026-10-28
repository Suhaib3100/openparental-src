package kotlinx.coroutines.internal;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.lang.Comparable;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.m2;
import kotlinx.coroutines.i2;
import kotlinx.coroutines.internal.b1;

/* compiled from: ThreadSafeHeap.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001d\b\u0017\u0018\u0000*\u0012\b\u0000\u0010\u0003*\u00020\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0004j\u0002`\u0005B\u0007¢\u0006\u0004\b3\u0010\u0012J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0082\u0010¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0082\u0010¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b\u0011\u0010\u0012J2\u0010\u0019\u001a\u0004\u0018\u00018\u00002!\u0010\u0018\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u00170\u0013¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u0007\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0007\u0010\u001bJ\u000f\u0010\u001c\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u001c\u0010\u001bJ&\u0010\u001d\u001a\u0004\u0018\u00018\u00002\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00170\u0013H\u0086\b¢\u0006\u0004\b\u001d\u0010\u001aJ\u0015\u0010\u001f\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00028\u0000¢\u0006\u0004\b\u001f\u0010 J.\u0010\"\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00028\u00002\u0014\u0010!\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00020\u00170\u0013H\u0086\b¢\u0006\u0004\b\"\u0010#J\u0015\u0010$\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00028\u0000¢\u0006\u0004\b$\u0010%J\u0011\u0010&\u001a\u0004\u0018\u00018\u0000H\u0001¢\u0006\u0004\b&\u0010\u001bJ\u0017\u0010(\u001a\u00028\u00002\u0006\u0010'\u001a\u00020\u0006H\u0001¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00028\u0000H\u0001¢\u0006\u0004\b*\u0010 R \u0010*\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R$\u0010/\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00068F@BX\u0086\u000e¢\u0006\f\u001a\u0004\b,\u0010-\"\u0004\b.\u0010\nR\u0011\u00102\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b0\u00101¨\u00064"}, d2 = {"Lkotlinx/coroutines/internal/a1;", "Lkotlinx/coroutines/internal/b1;", "", "T", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "", "i", "Lkotlin/m2;", "q", "(I)V", "p", "", "j", "()[Lkotlinx/coroutines/internal/b1;", "r", "(II)V", "d", "()V", "Lkotlin/Function1;", "Lkotlin/r0;", "name", "value", "", "predicate", "e", "(Lq3/l;)Lkotlinx/coroutines/internal/b1;", "()Lkotlinx/coroutines/internal/b1;", "n", "m", "node", "b", "(Lkotlinx/coroutines/internal/b1;)V", "cond", "c", "(Lkotlinx/coroutines/internal/b1;Lq3/l;)Z", "k", "(Lkotlinx/coroutines/internal/b1;)Z", "f", "index", "l", "(I)Lkotlinx/coroutines/internal/b1;", "a", "[Lkotlinx/coroutines/internal/b1;", "g", "()I", "o", "size", "h", "()Z", "isEmpty", "<init>", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
@i2
/* loaded from: classes5.dex */
public class a1<T extends b1 & Comparable<? super T>> {

    @d5.d
    private volatile /* synthetic */ int _size = 0;

    @d5.e
    private T[] a;

    private final T[] j() {
        T[] tArr = this.a;
        if (tArr == null) {
            T[] tArr2 = (T[]) new b1[4];
            this.a = tArr2;
            return tArr2;
        }
        if (get_size() < tArr.length) {
            return tArr;
        }
        Object[] copyOf = Arrays.copyOf(tArr, get_size() * 2);
        kotlin.jvm.internal.l0.o(copyOf, ProtectedSandApp.s("巇"));
        T[] tArr3 = (T[]) ((b1[]) copyOf);
        this.a = tArr3;
        return tArr3;
    }

    private final void o(int i5) {
        this._size = i5;
    }

    private final void p(int i5) {
        while (true) {
            int i6 = (i5 * 2) + 1;
            if (i6 >= get_size()) {
                return;
            }
            T[] tArr = this.a;
            kotlin.jvm.internal.l0.m(tArr);
            int i7 = i6 + 1;
            if (i7 < get_size()) {
                T t5 = tArr[i7];
                kotlin.jvm.internal.l0.m(t5);
                T t6 = tArr[i6];
                kotlin.jvm.internal.l0.m(t6);
                if (((Comparable) t5).compareTo(t6) < 0) {
                    i6 = i7;
                }
            }
            T t7 = tArr[i5];
            kotlin.jvm.internal.l0.m(t7);
            T t8 = tArr[i6];
            kotlin.jvm.internal.l0.m(t8);
            if (((Comparable) t7).compareTo(t8) <= 0) {
                return;
            }
            r(i5, i6);
            i5 = i6;
        }
    }

    private final void q(int i5) {
        while (i5 > 0) {
            T[] tArr = this.a;
            kotlin.jvm.internal.l0.m(tArr);
            int i6 = (i5 - 1) / 2;
            T t5 = tArr[i6];
            kotlin.jvm.internal.l0.m(t5);
            T t6 = tArr[i5];
            kotlin.jvm.internal.l0.m(t6);
            if (((Comparable) t5).compareTo(t6) <= 0) {
                return;
            }
            r(i5, i6);
            i5 = i6;
        }
    }

    private final void r(int i5, int j5) {
        T[] tArr = this.a;
        kotlin.jvm.internal.l0.m(tArr);
        T t5 = tArr[j5];
        kotlin.jvm.internal.l0.m(t5);
        T t6 = tArr[i5];
        kotlin.jvm.internal.l0.m(t6);
        tArr[i5] = t5;
        tArr[j5] = t6;
        t5.setIndex(i5);
        t6.setIndex(j5);
    }

    @PublishedApi
    public final void a(@d5.d T node) {
        node.h(this);
        T[] j5 = j();
        int i5 = get_size();
        this._size = i5 + 1;
        j5[i5] = node;
        node.setIndex(i5);
        q(i5);
    }

    public final void b(@d5.d T node) {
        synchronized (this) {
            a(node);
            m2 m2Var = m2.f23662a;
        }
    }

    public final boolean c(@d5.d T node, @d5.d q3.l<? super T, Boolean> cond) {
        boolean z5;
        synchronized (this) {
            if (cond.N(f()).booleanValue()) {
                a(node);
                z5 = true;
            } else {
                z5 = false;
            }
        }
        return z5;
    }

    public final void d() {
        synchronized (this) {
            T[] tArr = this.a;
            if (tArr != null) {
                kotlin.collections.p.V1(tArr, null, 0, 0, 6, null);
            }
            this._size = 0;
            m2 m2Var = m2.f23662a;
        }
    }

    @d5.e
    public final T e(@d5.d q3.l<? super T, Boolean> predicate) {
        T t5;
        synchronized (this) {
            int i5 = get_size();
            int i6 = 0;
            while (true) {
                t5 = null;
                if (i6 >= i5) {
                    break;
                }
                T[] tArr = this.a;
                if (tArr != null) {
                    t5 = (Object) tArr[i6];
                }
                kotlin.jvm.internal.l0.m(t5);
                if (predicate.N(t5).booleanValue()) {
                    break;
                }
                i6++;
            }
        }
        return t5;
    }

    @d5.e
    @PublishedApi
    public final T f() {
        T[] tArr = this.a;
        if (tArr != null) {
            return tArr[0];
        }
        return null;
    }

    /* renamed from: g, reason: from getter */
    public final int get_size() {
        return this._size;
    }

    public final boolean h() {
        return get_size() == 0;
    }

    @d5.e
    public final T i() {
        T f6;
        synchronized (this) {
            f6 = f();
        }
        return f6;
    }

    public final boolean k(@d5.d T node) {
        boolean z5;
        synchronized (this) {
            if (node.j() == null) {
                z5 = false;
            } else {
                l(node.getIndex());
                z5 = true;
            }
        }
        return z5;
    }

    @PublishedApi
    @d5.d
    public final T l(int index) {
        T[] tArr = this.a;
        kotlin.jvm.internal.l0.m(tArr);
        this._size = get_size() - 1;
        if (index < get_size()) {
            r(index, get_size());
            int i5 = (index - 1) / 2;
            if (index > 0) {
                T t5 = tArr[index];
                kotlin.jvm.internal.l0.m(t5);
                T t6 = tArr[i5];
                kotlin.jvm.internal.l0.m(t6);
                if (((Comparable) t5).compareTo(t6) < 0) {
                    r(index, i5);
                    q(i5);
                }
            }
            p(index);
        }
        T t7 = tArr[get_size()];
        kotlin.jvm.internal.l0.m(t7);
        t7.h(null);
        t7.setIndex(-1);
        tArr[get_size()] = null;
        return t7;
    }

    @d5.e
    public final T m(@d5.d q3.l<? super T, Boolean> predicate) {
        synchronized (this) {
            T f6 = f();
            if (f6 == null) {
                return null;
            }
            return predicate.N(f6).booleanValue() ? l(0) : null;
        }
    }

    @d5.e
    public final T n() {
        T l5;
        synchronized (this) {
            l5 = get_size() > 0 ? l(0) : null;
        }
        return l5;
    }
}
