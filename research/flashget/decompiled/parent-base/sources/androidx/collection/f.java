package androidx.collection;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;

/* compiled from: ArraySet.kt */
@Metadata(d1 = {"\u0000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\t\u001a\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000H\u0086\b¢\u0006\u0004\b\u0002\u0010\u0003\u001a-\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0004\"\u00028\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a'\u0010\u000b\u001a\u00020\t\"\u0004\b\u0000\u0010\b*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a1\u0010\u000f\u001a\u00020\t\"\u0004\b\u0000\u0010\b*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001f\u0010\u0011\u001a\u00020\t\"\u0004\b\u0000\u0010\b*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a'\u0010\u0015\u001a\u00020\u0014\"\u0004\b\u0000\u0010\b*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0013\u001a\u00020\tH\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a \u0010\u0017\u001a\u00020\u0014\"\u0004\b\u0000\u0010\b*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0080\b¢\u0006\u0004\b\u0017\u0010\u0018\u001a(\u0010\u001a\u001a\u00020\u0014\"\u0004\b\u0000\u0010\b*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0019\u001a\u00020\tH\u0080\b¢\u0006\u0004\b\u001a\u0010\u0016\u001a(\u0010\u001d\u001a\u00020\u001c\"\u0004\b\u0000\u0010\b*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u001b\u001a\u00028\u0000H\u0080\b¢\u0006\u0004\b\u001d\u0010\u001e\u001a*\u0010\u001f\u001a\u00020\t\"\u0004\b\u0000\u0010\b*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0080\b¢\u0006\u0004\b\u001f\u0010 \u001a(\u0010\"\u001a\u00028\u0000\"\u0004\b\u0000\u0010\b*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010!\u001a\u00020\tH\u0080\b¢\u0006\u0004\b\"\u0010#\u001a \u0010$\u001a\u00020\u001c\"\u0004\b\u0000\u0010\b*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0080\b¢\u0006\u0004\b$\u0010%\u001a(\u0010&\u001a\u00020\u001c\"\u0004\b\u0000\u0010\b*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u001b\u001a\u00028\u0000H\u0080\b¢\u0006\u0004\b&\u0010\u001e\u001a0\u0010(\u001a\u00020\u0014\"\u0004\b\u0000\u0010\b*\b\u0012\u0004\u0012\u00028\u00000\u00012\u000e\u0010'\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001H\u0080\b¢\u0006\u0004\b(\u0010)\u001a(\u0010*\u001a\u00020\u001c\"\u0004\b\u0000\u0010\b*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u001b\u001a\u00028\u0000H\u0080\b¢\u0006\u0004\b*\u0010\u001e\u001a(\u0010+\u001a\u00028\u0000\"\u0004\b\u0000\u0010\b*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010!\u001a\u00020\tH\u0080\b¢\u0006\u0004\b+\u0010#\u001a0\u0010,\u001a\u00020\u001c\"\u0004\b\u0000\u0010\b*\b\u0012\u0004\u0012\u00028\u00000\u00012\u000e\u0010'\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001H\u0080\b¢\u0006\u0004\b,\u0010-\u001a*\u0010/\u001a\u00020\u001c\"\u0004\b\u0000\u0010\b*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0010.\u001a\u0004\u0018\u00010\rH\u0080\b¢\u0006\u0004\b/\u0010\u001e\u001a \u00100\u001a\u00020\t\"\u0004\b\u0000\u0010\b*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0080\b¢\u0006\u0004\b0\u0010\u0012\u001a \u00102\u001a\u000201\"\u0004\b\u0000\u0010\b*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0080\b¢\u0006\u0004\b2\u00103\u001a.\u00106\u001a\u00020\u001c\"\u0004\b\u0000\u0010\b*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u00105\u001a\b\u0012\u0004\u0012\u00028\u000004H\u0080\b¢\u0006\u0004\b6\u00107\u001a.\u00108\u001a\u00020\u001c\"\u0004\b\u0000\u0010\b*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u00105\u001a\b\u0012\u0004\u0012\u00028\u000004H\u0080\b¢\u0006\u0004\b8\u00107\u001a.\u00109\u001a\u00020\u001c\"\u0004\b\u0000\u0010\b*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u00105\u001a\b\u0012\u0004\u0012\u00028\u000004H\u0080\b¢\u0006\u0004\b9\u00107\u001a.\u0010:\u001a\u00020\u001c\"\u0004\b\u0000\u0010\b*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u00105\u001a\b\u0012\u0004\u0012\u00028\u000004H\u0080\b¢\u0006\u0004\b:\u00107\"\u0014\u0010<\u001a\u00020\t8\u0000X\u0080T¢\u0006\u0006\n\u0004\b(\u0010;¨\u0006="}, d2 = {"T", "Landroidx/collection/d;", "e", "()Landroidx/collection/d;", "", "values", "f", "([Ljava/lang/Object;)Landroidx/collection/d;", "E", "", "hash", "g", "(Landroidx/collection/d;I)I", "", "key", "n", "(Landroidx/collection/d;Ljava/lang/Object;I)I", "p", "(Landroidx/collection/d;)I", "size", "Lkotlin/k2;", "d", "(Landroidx/collection/d;I)V", "h", "(Landroidx/collection/d;)V", "minimumCapacity", "k", "element", "", "j", "(Landroidx/collection/d;Ljava/lang/Object;)Z", "o", "(Landroidx/collection/d;Ljava/lang/Object;)I", "index", "x", "(Landroidx/collection/d;I)Ljava/lang/Object;", "q", "(Landroidx/collection/d;)Z", "c", "array", "a", "(Landroidx/collection/d;Landroidx/collection/d;)V", "u", "t", "r", "(Landroidx/collection/d;Landroidx/collection/d;)Z", "other", "l", "m", "", "w", "(Landroidx/collection/d;)Ljava/lang/String;", "", "elements", "i", "(Landroidx/collection/d;Ljava/util/Collection;)Z", "b", "s", "v", "I", "ARRAY_SET_BASE_SIZE", "collection"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final int f2220a = 4;

    public static final <E> void a(@fg.l d<E> dVar, @fg.l d<? extends E> array) {
        kotlin.jvm.internal.l0.p(dVar, "<this>");
        kotlin.jvm.internal.l0.p(array, "array");
        int j4 = array.j();
        dVar.c(dVar.j() + j4);
        if (dVar.j() != 0) {
            for (int i4 = 0; i4 < j4; i4++) {
                dVar.add(array.s(i4));
            }
            return;
        }
        if (j4 > 0) {
            kotlin.collections.l.I0(array.getHashes(), dVar.getHashes(), 0, 0, j4, 6, null);
            kotlin.collections.l.K0(array.getArray(), dVar.getArray(), 0, 0, j4, 6, null);
            if (dVar.j() != 0) {
                throw new ConcurrentModificationException();
            }
            dVar.r(j4);
        }
    }

    public static final <E> boolean b(@fg.l d<E> dVar, @fg.l Collection<? extends E> elements) {
        kotlin.jvm.internal.l0.p(dVar, "<this>");
        kotlin.jvm.internal.l0.p(elements, "elements");
        dVar.c(elements.size() + dVar.j());
        Iterator<? extends E> it = elements.iterator();
        boolean z4 = false;
        while (it.hasNext()) {
            z4 |= dVar.add(it.next());
        }
        return z4;
    }

    public static final <E> boolean c(@fg.l d<E> dVar, E e4) {
        int i4;
        int n4;
        kotlin.jvm.internal.l0.p(dVar, "<this>");
        int j4 = dVar.j();
        if (e4 == null) {
            n4 = p(dVar);
            i4 = 0;
        } else {
            int hashCode = e4.hashCode();
            i4 = hashCode;
            n4 = n(dVar, e4, hashCode);
        }
        if (n4 >= 0) {
            return false;
        }
        int i5 = ~n4;
        if (j4 >= dVar.getHashes().length) {
            int i6 = 8;
            if (j4 >= 8) {
                i6 = (j4 >> 1) + j4;
            } else if (j4 < 4) {
                i6 = 4;
            }
            int[] hashes = dVar.getHashes();
            Object[] array = dVar.getArray();
            d(dVar, i6);
            if (j4 != dVar.j()) {
                throw new ConcurrentModificationException();
            }
            if (!(dVar.getHashes().length == 0)) {
                kotlin.collections.l.I0(hashes, dVar.getHashes(), 0, 0, hashes.length, 6, null);
                kotlin.collections.l.K0(array, dVar.getArray(), 0, 0, array.length, 6, null);
            }
        }
        if (i5 < j4) {
            int i7 = i5 + 1;
            kotlin.collections.l.z0(dVar.getHashes(), dVar.getHashes(), i7, i5, j4);
            kotlin.collections.l.B0(dVar.getArray(), dVar.getArray(), i7, i5, j4);
        }
        if (j4 != dVar.j() || i5 >= dVar.getHashes().length) {
            throw new ConcurrentModificationException();
        }
        dVar.getHashes()[i5] = i4;
        dVar.getArray()[i5] = e4;
        dVar.r(dVar.j() + 1);
        return true;
    }

    public static final <E> void d(@fg.l d<E> dVar, int i4) {
        kotlin.jvm.internal.l0.p(dVar, "<this>");
        dVar.q(new int[i4]);
        dVar.p(new Object[i4]);
    }

    @fg.l
    public static final <T> d<T> e() {
        return new d<>(0, 1, null);
    }

    @fg.l
    public static final <T> d<T> f(@fg.l T... values) {
        kotlin.jvm.internal.l0.p(values, "values");
        d<T> dVar = new d<>(values.length);
        for (T t4 : values) {
            dVar.add(t4);
        }
        return dVar;
    }

    public static final <E> int g(@fg.l d<E> dVar, int i4) {
        kotlin.jvm.internal.l0.p(dVar, "<this>");
        try {
            return m.a.a(dVar.getHashes(), dVar.j(), i4);
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public static final <E> void h(@fg.l d<E> dVar) {
        kotlin.jvm.internal.l0.p(dVar, "<this>");
        if (dVar.j() != 0) {
            dVar.q(m.a.f81460a);
            dVar.p(m.a.f81462c);
            dVar.r(0);
        }
        if (dVar.j() != 0) {
            throw new ConcurrentModificationException();
        }
    }

    public static final <E> boolean i(@fg.l d<E> dVar, @fg.l Collection<? extends E> elements) {
        kotlin.jvm.internal.l0.p(dVar, "<this>");
        kotlin.jvm.internal.l0.p(elements, "elements");
        Iterator<? extends E> it = elements.iterator();
        while (it.hasNext()) {
            if (!dVar.contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public static final <E> boolean j(@fg.l d<E> dVar, E e4) {
        kotlin.jvm.internal.l0.p(dVar, "<this>");
        return dVar.indexOf(e4) >= 0;
    }

    public static final <E> void k(@fg.l d<E> dVar, int i4) {
        kotlin.jvm.internal.l0.p(dVar, "<this>");
        int j4 = dVar.j();
        if (dVar.getHashes().length < i4) {
            int[] hashes = dVar.getHashes();
            Object[] array = dVar.getArray();
            d(dVar, i4);
            if (dVar.j() > 0) {
                kotlin.collections.l.I0(hashes, dVar.getHashes(), 0, 0, dVar.j(), 6, null);
                kotlin.collections.l.K0(array, dVar.getArray(), 0, 0, dVar.j(), 6, null);
            }
        }
        if (dVar.j() != j4) {
            throw new ConcurrentModificationException();
        }
    }

    public static final <E> boolean l(@fg.l d<E> dVar, @fg.m Object obj) {
        kotlin.jvm.internal.l0.p(dVar, "<this>");
        if (dVar == obj) {
            return true;
        }
        if (!(obj instanceof Set) || dVar.size() != ((Set) obj).size()) {
            return false;
        }
        try {
            int j4 = dVar.j();
            for (int i4 = 0; i4 < j4; i4++) {
                if (!((Set) obj).contains(dVar.s(i4))) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public static final <E> int m(@fg.l d<E> dVar) {
        kotlin.jvm.internal.l0.p(dVar, "<this>");
        int[] hashes = dVar.getHashes();
        int j4 = dVar.j();
        int i4 = 0;
        for (int i5 = 0; i5 < j4; i5++) {
            i4 += hashes[i5];
        }
        return i4;
    }

    public static final <E> int n(@fg.l d<E> dVar, @fg.m Object obj, int i4) {
        kotlin.jvm.internal.l0.p(dVar, "<this>");
        int j4 = dVar.j();
        if (j4 == 0) {
            return -1;
        }
        int g4 = g(dVar, i4);
        if (g4 < 0) {
            return g4;
        }
        if (kotlin.jvm.internal.l0.g(obj, dVar.getArray()[g4])) {
            return g4;
        }
        int i5 = g4 + 1;
        while (i5 < j4 && dVar.getHashes()[i5] == i4) {
            if (kotlin.jvm.internal.l0.g(obj, dVar.getArray()[i5])) {
                return i5;
            }
            i5++;
        }
        for (int i6 = g4 - 1; i6 >= 0 && dVar.getHashes()[i6] == i4; i6--) {
            if (kotlin.jvm.internal.l0.g(obj, dVar.getArray()[i6])) {
                return i6;
            }
        }
        return ~i5;
    }

    public static final <E> int o(@fg.l d<E> dVar, @fg.m Object obj) {
        kotlin.jvm.internal.l0.p(dVar, "<this>");
        return obj == null ? p(dVar) : n(dVar, obj, obj.hashCode());
    }

    public static final <E> int p(@fg.l d<E> dVar) {
        kotlin.jvm.internal.l0.p(dVar, "<this>");
        return n(dVar, null, 0);
    }

    public static final <E> boolean q(@fg.l d<E> dVar) {
        kotlin.jvm.internal.l0.p(dVar, "<this>");
        return dVar.j() <= 0;
    }

    public static final <E> boolean r(@fg.l d<E> dVar, @fg.l d<? extends E> array) {
        kotlin.jvm.internal.l0.p(dVar, "<this>");
        kotlin.jvm.internal.l0.p(array, "array");
        int j4 = array.j();
        int j5 = dVar.j();
        for (int i4 = 0; i4 < j4; i4++) {
            dVar.remove(array.s(i4));
        }
        return j5 != dVar.j();
    }

    public static final <E> boolean s(@fg.l d<E> dVar, @fg.l Collection<? extends E> elements) {
        kotlin.jvm.internal.l0.p(dVar, "<this>");
        kotlin.jvm.internal.l0.p(elements, "elements");
        Iterator<? extends E> it = elements.iterator();
        boolean z4 = false;
        while (it.hasNext()) {
            z4 |= dVar.remove(it.next());
        }
        return z4;
    }

    public static final <E> E t(@fg.l d<E> dVar, int i4) {
        kotlin.jvm.internal.l0.p(dVar, "<this>");
        int j4 = dVar.j();
        E e4 = (E) dVar.getArray()[i4];
        if (j4 <= 1) {
            dVar.clear();
        } else {
            int i5 = j4 - 1;
            if (dVar.getHashes().length <= 8 || dVar.j() >= dVar.getHashes().length / 3) {
                if (i4 < i5) {
                    int i6 = i4 + 1;
                    kotlin.collections.l.z0(dVar.getHashes(), dVar.getHashes(), i4, i6, j4);
                    kotlin.collections.l.B0(dVar.getArray(), dVar.getArray(), i4, i6, j4);
                }
                dVar.getArray()[i5] = null;
            } else {
                int j5 = dVar.j() > 8 ? dVar.j() + (dVar.j() >> 1) : 8;
                int[] hashes = dVar.getHashes();
                Object[] array = dVar.getArray();
                d(dVar, j5);
                if (i4 > 0) {
                    kotlin.collections.l.I0(hashes, dVar.getHashes(), 0, 0, i4, 6, null);
                    kotlin.collections.l.K0(array, dVar.getArray(), 0, 0, i4, 6, null);
                }
                if (i4 < i5) {
                    int i7 = i4 + 1;
                    kotlin.collections.l.z0(hashes, dVar.getHashes(), i4, i7, j4);
                    kotlin.collections.l.B0(array, dVar.getArray(), i4, i7, j4);
                }
            }
            if (j4 != dVar.j()) {
                throw new ConcurrentModificationException();
            }
            dVar.r(i5);
        }
        return e4;
    }

    public static final <E> boolean u(@fg.l d<E> dVar, E e4) {
        kotlin.jvm.internal.l0.p(dVar, "<this>");
        int indexOf = dVar.indexOf(e4);
        if (indexOf < 0) {
            return false;
        }
        dVar.m(indexOf);
        return true;
    }

    public static final <E> boolean v(@fg.l d<E> dVar, @fg.l Collection<? extends E> elements) {
        kotlin.jvm.internal.l0.p(dVar, "<this>");
        kotlin.jvm.internal.l0.p(elements, "elements");
        boolean z4 = false;
        for (int j4 = dVar.j() - 1; -1 < j4; j4--) {
            if (!kotlin.collections.w.W1(elements, dVar.getArray()[j4])) {
                dVar.m(j4);
                z4 = true;
            }
        }
        return z4;
    }

    @fg.l
    public static final <E> String w(@fg.l d<E> dVar) {
        kotlin.jvm.internal.l0.p(dVar, "<this>");
        if (dVar.isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(dVar.j() * 14);
        sb.append('{');
        int j4 = dVar.j();
        for (int i4 = 0; i4 < j4; i4++) {
            if (i4 > 0) {
                sb.append(", ");
            }
            E s4 = dVar.s(i4);
            if (s4 != dVar) {
                sb.append(s4);
            } else {
                sb.append("(this Set)");
            }
        }
        return c.a(sb, '}', "StringBuilder(capacity).…builderAction).toString()");
    }

    public static final <E> E x(@fg.l d<E> dVar, int i4) {
        kotlin.jvm.internal.l0.p(dVar, "<this>");
        return (E) dVar.getArray()[i4];
    }
}
