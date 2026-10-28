package androidx.collection;

import java.util.Arrays;
import kotlin.Metadata;

/* compiled from: SparseArrayCompat.kt */
@Metadata(d1 = {"\u0000.\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b%\n\u0002\u0010\u000e\n\u0002\b\u0006\u001a<\u0010\u0006\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\n\b\u0001\u0010\u0001*\u0004\u0018\u00018\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00028\u0001H\u0082\b¢\u0006\u0004\b\u0006\u0010\u0007\u001a)\u0010\b\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\b\u0010\t\u001a/\u0010\n\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\n\u0010\u0007\u001a'\u0010\f\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\f\u0010\r\u001a2\u0010\u0011\u001a\u00020\u0010\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0080\b¢\u0006\u0004\b\u0011\u0010\u0012\u001a(\u0010\u0014\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0013\u001a\u00020\u0003H\u0080\b¢\u0006\u0004\b\u0014\u0010\r\u001a0\u0010\u0016\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0003H\u0080\b¢\u0006\u0004\b\u0016\u0010\u0017\u001a2\u0010\u0018\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00028\u0000H\u0080\b¢\u0006\u0004\b\u0018\u0010\u0007\u001a8\u0010\u001b\u001a\u00020\u0010\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00028\u00002\u0006\u0010\u001a\u001a\u00028\u0000H\u0080\b¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u001f\u0010\u001d\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0002¢\u0006\u0004\b\u001d\u0010\u001e\u001a0\u0010\u001f\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00028\u0000H\u0080\b¢\u0006\u0004\b\u001f\u0010 \u001a0\u0010\"\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u000e\u0010!\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0002H\u0080\b¢\u0006\u0004\b\"\u0010#\u001a2\u0010$\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00028\u0000H\u0080\b¢\u0006\u0004\b$\u0010\u0007\u001a \u0010%\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0080\b¢\u0006\u0004\b%\u0010&\u001a \u0010'\u001a\u00020\u0010\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0080\b¢\u0006\u0004\b'\u0010(\u001a(\u0010)\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0013\u001a\u00020\u0003H\u0080\b¢\u0006\u0004\b)\u0010*\u001a(\u0010+\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0013\u001a\u00020\u0003H\u0080\b¢\u0006\u0004\b+\u0010\t\u001a0\u0010,\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00028\u0000H\u0080\b¢\u0006\u0004\b,\u0010 \u001a(\u0010-\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0080\b¢\u0006\u0004\b-\u0010*\u001a(\u0010.\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u000f\u001a\u00028\u0000H\u0080\b¢\u0006\u0004\b.\u0010/\u001a(\u00100\u001a\u00020\u0010\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0080\b¢\u0006\u0004\b0\u00101\u001a(\u00102\u001a\u00020\u0010\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u000f\u001a\u00028\u0000H\u0080\b¢\u0006\u0004\b2\u00103\u001a \u00104\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0080\b¢\u0006\u0004\b4\u0010\u001e\u001a0\u00105\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00028\u0000H\u0080\b¢\u0006\u0004\b5\u0010 \u001a \u00107\u001a\u000206\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0080\b¢\u0006\u0004\b7\u00108\"\u0014\u0010;\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:¨\u0006<"}, d2 = {"E", "T", "Landroidx/collection/c3;", "", "key", "defaultValue", "A", "(Landroidx/collection/c3;ILjava/lang/Object;)Ljava/lang/Object;", "g", "(Landroidx/collection/c3;I)Ljava/lang/Object;", "h", "Lkotlin/k2;", "p", "(Landroidx/collection/c3;I)V", "", "value", "", "q", "(Landroidx/collection/c3;ILjava/lang/Object;)Z", "index", "r", "size", "s", "(Landroidx/collection/c3;II)V", "t", "oldValue", "newValue", "u", "(Landroidx/collection/c3;ILjava/lang/Object;Ljava/lang/Object;)Z", "z", "(Landroidx/collection/c3;)V", "m", "(Landroidx/collection/c3;ILjava/lang/Object;)V", "other", "n", "(Landroidx/collection/c3;Landroidx/collection/c3;)V", "o", "w", "(Landroidx/collection/c3;)I", "k", "(Landroidx/collection/c3;)Z", "l", "(Landroidx/collection/c3;I)I", "y", "v", "i", "j", "(Landroidx/collection/c3;Ljava/lang/Object;)I", "e", "(Landroidx/collection/c3;I)Z", "f", "(Landroidx/collection/c3;Ljava/lang/Object;)Z", "d", "c", "", "x", "(Landroidx/collection/c3;)Ljava/lang/String;", "a", "Ljava/lang/Object;", "DELETED", "collection"}, k = 2, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nSparseArrayCompat.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SparseArrayCompat.kt\nandroidx/collection/SparseArrayCompatKt\n*L\n1#1,535:1\n244#1,6:536\n244#1,6:542\n353#1,40:548\n353#1,40:588\n459#1,9:628\n*S KotlinDebug\n*F\n+ 1 SparseArrayCompat.kt\nandroidx/collection/SparseArrayCompatKt\n*L\n255#1:536,6\n260#1:542,6\n397#1:548,40\n405#1:588,40\n477#1:628,9\n*E\n"})
/* loaded from: classes.dex */
public final class d3 {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private static final Object f2203a = new Object();

    private static final <E, T extends E> T A(c3<E> c3Var, int i4, T t4) {
        T t5;
        int a5 = m.a.a(c3Var.keys, c3Var.size, i4);
        return (a5 < 0 || (t5 = (T) c3Var.values[a5]) == f2203a) ? t4 : t5;
    }

    public static final <E> void c(@fg.l c3<E> c3Var, int i4, E e4) {
        kotlin.jvm.internal.l0.p(c3Var, "<this>");
        int i5 = c3Var.size;
        if (i5 != 0 && i4 <= c3Var.keys[i5 - 1]) {
            c3Var.q(i4, e4);
            return;
        }
        if (c3Var.garbage && i5 >= c3Var.keys.length) {
            z(c3Var);
        }
        int i6 = c3Var.size;
        if (i6 >= c3Var.keys.length) {
            int e5 = m.a.e(i6 + 1);
            int[] copyOf = Arrays.copyOf(c3Var.keys, e5);
            kotlin.jvm.internal.l0.o(copyOf, "copyOf(this, newSize)");
            c3Var.keys = copyOf;
            Object[] copyOf2 = Arrays.copyOf(c3Var.values, e5);
            kotlin.jvm.internal.l0.o(copyOf2, "copyOf(this, newSize)");
            c3Var.values = copyOf2;
        }
        c3Var.keys[i6] = i4;
        c3Var.values[i6] = e4;
        c3Var.size = i6 + 1;
    }

    public static final <E> void d(@fg.l c3<E> c3Var) {
        kotlin.jvm.internal.l0.p(c3Var, "<this>");
        int i4 = c3Var.size;
        Object[] objArr = c3Var.values;
        for (int i5 = 0; i5 < i4; i5++) {
            objArr[i5] = null;
        }
        c3Var.size = 0;
        c3Var.garbage = false;
    }

    public static final <E> boolean e(@fg.l c3<E> c3Var, int i4) {
        kotlin.jvm.internal.l0.p(c3Var, "<this>");
        return c3Var.m(i4) >= 0;
    }

    public static final <E> boolean f(@fg.l c3<E> c3Var, E e4) {
        kotlin.jvm.internal.l0.p(c3Var, "<this>");
        if (c3Var.garbage) {
            z(c3Var);
        }
        int i4 = c3Var.size;
        int i5 = 0;
        while (true) {
            if (i5 >= i4) {
                i5 = -1;
                break;
            }
            if (c3Var.values[i5] == e4) {
                break;
            }
            i5++;
        }
        return i5 >= 0;
    }

    @fg.m
    public static final <E> E g(@fg.l c3<E> c3Var, int i4) {
        E e4;
        kotlin.jvm.internal.l0.p(c3Var, "<this>");
        int a5 = m.a.a(c3Var.keys, c3Var.size, i4);
        if (a5 < 0 || (e4 = (E) c3Var.values[a5]) == f2203a) {
            return null;
        }
        return e4;
    }

    public static final <E> E h(@fg.l c3<E> c3Var, int i4, E e4) {
        E e5;
        kotlin.jvm.internal.l0.p(c3Var, "<this>");
        int a5 = m.a.a(c3Var.keys, c3Var.size, i4);
        return (a5 < 0 || (e5 = (E) c3Var.values[a5]) == f2203a) ? e4 : e5;
    }

    public static final <E> int i(@fg.l c3<E> c3Var, int i4) {
        kotlin.jvm.internal.l0.p(c3Var, "<this>");
        if (c3Var.garbage) {
            z(c3Var);
        }
        return m.a.a(c3Var.keys, c3Var.size, i4);
    }

    public static final <E> int j(@fg.l c3<E> c3Var, E e4) {
        kotlin.jvm.internal.l0.p(c3Var, "<this>");
        if (c3Var.garbage) {
            z(c3Var);
        }
        int i4 = c3Var.size;
        for (int i5 = 0; i5 < i4; i5++) {
            if (c3Var.values[i5] == e4) {
                return i5;
            }
        }
        return -1;
    }

    public static final <E> boolean k(@fg.l c3<E> c3Var) {
        kotlin.jvm.internal.l0.p(c3Var, "<this>");
        return c3Var.B() == 0;
    }

    public static final <E> int l(@fg.l c3<E> c3Var, int i4) {
        kotlin.jvm.internal.l0.p(c3Var, "<this>");
        if (c3Var.garbage) {
            z(c3Var);
        }
        return c3Var.keys[i4];
    }

    public static final <E> void m(@fg.l c3<E> c3Var, int i4, E e4) {
        kotlin.jvm.internal.l0.p(c3Var, "<this>");
        int a5 = m.a.a(c3Var.keys, c3Var.size, i4);
        if (a5 >= 0) {
            c3Var.values[a5] = e4;
            return;
        }
        int i5 = ~a5;
        int i6 = c3Var.size;
        if (i5 < i6) {
            Object[] objArr = c3Var.values;
            if (objArr[i5] == f2203a) {
                c3Var.keys[i5] = i4;
                objArr[i5] = e4;
                return;
            }
        }
        if (c3Var.garbage && i6 >= c3Var.keys.length) {
            z(c3Var);
            i5 = ~m.a.a(c3Var.keys, c3Var.size, i4);
        }
        int i7 = c3Var.size;
        if (i7 >= c3Var.keys.length) {
            int e5 = m.a.e(i7 + 1);
            int[] copyOf = Arrays.copyOf(c3Var.keys, e5);
            kotlin.jvm.internal.l0.o(copyOf, "copyOf(this, newSize)");
            c3Var.keys = copyOf;
            Object[] copyOf2 = Arrays.copyOf(c3Var.values, e5);
            kotlin.jvm.internal.l0.o(copyOf2, "copyOf(this, newSize)");
            c3Var.values = copyOf2;
        }
        int i10 = c3Var.size;
        if (i10 - i5 != 0) {
            int[] iArr = c3Var.keys;
            int i11 = i5 + 1;
            kotlin.collections.l.z0(iArr, iArr, i11, i5, i10);
            Object[] objArr2 = c3Var.values;
            kotlin.collections.l.B0(objArr2, objArr2, i11, i5, c3Var.size);
        }
        c3Var.keys[i5] = i4;
        c3Var.values[i5] = e4;
        c3Var.size++;
    }

    public static final <E> void n(@fg.l c3<E> c3Var, @fg.l c3<? extends E> other) {
        kotlin.jvm.internal.l0.p(c3Var, "<this>");
        kotlin.jvm.internal.l0.p(other, "other");
        int B = other.B();
        for (int i4 = 0; i4 < B; i4++) {
            int p4 = other.p(i4);
            E C = other.C(i4);
            int a5 = m.a.a(c3Var.keys, c3Var.size, p4);
            if (a5 >= 0) {
                c3Var.values[a5] = C;
            } else {
                int i5 = ~a5;
                int i6 = c3Var.size;
                if (i5 < i6) {
                    Object[] objArr = c3Var.values;
                    if (objArr[i5] == f2203a) {
                        c3Var.keys[i5] = p4;
                        objArr[i5] = C;
                    }
                }
                if (c3Var.garbage && i6 >= c3Var.keys.length) {
                    z(c3Var);
                    i5 = ~m.a.a(c3Var.keys, c3Var.size, p4);
                }
                int i7 = c3Var.size;
                if (i7 >= c3Var.keys.length) {
                    int e4 = m.a.e(i7 + 1);
                    int[] copyOf = Arrays.copyOf(c3Var.keys, e4);
                    kotlin.jvm.internal.l0.o(copyOf, "copyOf(this, newSize)");
                    c3Var.keys = copyOf;
                    Object[] copyOf2 = Arrays.copyOf(c3Var.values, e4);
                    kotlin.jvm.internal.l0.o(copyOf2, "copyOf(this, newSize)");
                    c3Var.values = copyOf2;
                }
                int i10 = c3Var.size;
                if (i10 - i5 != 0) {
                    int[] iArr = c3Var.keys;
                    int i11 = i5 + 1;
                    kotlin.collections.l.z0(iArr, iArr, i11, i5, i10);
                    Object[] objArr2 = c3Var.values;
                    kotlin.collections.l.B0(objArr2, objArr2, i11, i5, c3Var.size);
                }
                c3Var.keys[i5] = p4;
                c3Var.values[i5] = C;
                c3Var.size++;
            }
        }
    }

    @fg.m
    public static final <E> E o(@fg.l c3<E> c3Var, int i4, E e4) {
        kotlin.jvm.internal.l0.p(c3Var, "<this>");
        E e5 = (E) g(c3Var, i4);
        if (e5 == null) {
            int a5 = m.a.a(c3Var.keys, c3Var.size, i4);
            if (a5 >= 0) {
                c3Var.values[a5] = e4;
            } else {
                int i5 = ~a5;
                int i6 = c3Var.size;
                if (i5 < i6) {
                    Object[] objArr = c3Var.values;
                    if (objArr[i5] == f2203a) {
                        c3Var.keys[i5] = i4;
                        objArr[i5] = e4;
                    }
                }
                if (c3Var.garbage && i6 >= c3Var.keys.length) {
                    z(c3Var);
                    i5 = ~m.a.a(c3Var.keys, c3Var.size, i4);
                }
                int i7 = c3Var.size;
                if (i7 >= c3Var.keys.length) {
                    int e6 = m.a.e(i7 + 1);
                    int[] copyOf = Arrays.copyOf(c3Var.keys, e6);
                    kotlin.jvm.internal.l0.o(copyOf, "copyOf(this, newSize)");
                    c3Var.keys = copyOf;
                    Object[] copyOf2 = Arrays.copyOf(c3Var.values, e6);
                    kotlin.jvm.internal.l0.o(copyOf2, "copyOf(this, newSize)");
                    c3Var.values = copyOf2;
                }
                int i10 = c3Var.size;
                if (i10 - i5 != 0) {
                    int[] iArr = c3Var.keys;
                    int i11 = i5 + 1;
                    kotlin.collections.l.z0(iArr, iArr, i11, i5, i10);
                    Object[] objArr2 = c3Var.values;
                    kotlin.collections.l.B0(objArr2, objArr2, i11, i5, c3Var.size);
                }
                c3Var.keys[i5] = i4;
                c3Var.values[i5] = e4;
                c3Var.size++;
            }
        }
        return e5;
    }

    public static final <E> void p(@fg.l c3<E> c3Var, int i4) {
        kotlin.jvm.internal.l0.p(c3Var, "<this>");
        int a5 = m.a.a(c3Var.keys, c3Var.size, i4);
        if (a5 >= 0) {
            Object[] objArr = c3Var.values;
            Object obj = objArr[a5];
            Object obj2 = f2203a;
            if (obj != obj2) {
                objArr[a5] = obj2;
                c3Var.garbage = true;
            }
        }
    }

    public static final <E> boolean q(@fg.l c3<E> c3Var, int i4, @fg.m Object obj) {
        kotlin.jvm.internal.l0.p(c3Var, "<this>");
        int m4 = c3Var.m(i4);
        if (m4 < 0 || !kotlin.jvm.internal.l0.g(obj, c3Var.C(m4))) {
            return false;
        }
        c3Var.v(m4);
        return true;
    }

    public static final <E> void r(@fg.l c3<E> c3Var, int i4) {
        kotlin.jvm.internal.l0.p(c3Var, "<this>");
        Object[] objArr = c3Var.values;
        Object obj = objArr[i4];
        Object obj2 = f2203a;
        if (obj != obj2) {
            objArr[i4] = obj2;
            c3Var.garbage = true;
        }
    }

    public static final <E> void s(@fg.l c3<E> c3Var, int i4, int i5) {
        kotlin.jvm.internal.l0.p(c3Var, "<this>");
        int min = Math.min(i5, i4 + i5);
        while (i4 < min) {
            c3Var.v(i4);
            i4++;
        }
    }

    @fg.m
    public static final <E> E t(@fg.l c3<E> c3Var, int i4, E e4) {
        kotlin.jvm.internal.l0.p(c3Var, "<this>");
        int m4 = c3Var.m(i4);
        if (m4 < 0) {
            return null;
        }
        Object[] objArr = c3Var.values;
        E e5 = (E) objArr[m4];
        objArr[m4] = e4;
        return e5;
    }

    public static final <E> boolean u(@fg.l c3<E> c3Var, int i4, E e4, E e5) {
        kotlin.jvm.internal.l0.p(c3Var, "<this>");
        int m4 = c3Var.m(i4);
        if (m4 < 0 || !kotlin.jvm.internal.l0.g(c3Var.values[m4], e4)) {
            return false;
        }
        c3Var.values[m4] = e5;
        return true;
    }

    public static final <E> void v(@fg.l c3<E> c3Var, int i4, E e4) {
        kotlin.jvm.internal.l0.p(c3Var, "<this>");
        if (c3Var.garbage) {
            z(c3Var);
        }
        c3Var.values[i4] = e4;
    }

    public static final <E> int w(@fg.l c3<E> c3Var) {
        kotlin.jvm.internal.l0.p(c3Var, "<this>");
        if (c3Var.garbage) {
            z(c3Var);
        }
        return c3Var.size;
    }

    @fg.l
    public static final <E> String x(@fg.l c3<E> c3Var) {
        kotlin.jvm.internal.l0.p(c3Var, "<this>");
        if (c3Var.B() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(c3Var.size * 28);
        sb.append('{');
        int i4 = c3Var.size;
        for (int i5 = 0; i5 < i4; i5++) {
            if (i5 > 0) {
                sb.append(", ");
            }
            sb.append(c3Var.p(i5));
            sb.append('=');
            E C = c3Var.C(i5);
            if (C != c3Var) {
                sb.append(C);
            } else {
                sb.append("(this Map)");
            }
        }
        return c.a(sb, '}', "buffer.toString()");
    }

    public static final <E> E y(@fg.l c3<E> c3Var, int i4) {
        kotlin.jvm.internal.l0.p(c3Var, "<this>");
        if (c3Var.garbage) {
            z(c3Var);
        }
        return (E) c3Var.values[i4];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <E> void z(c3<E> c3Var) {
        int i4 = c3Var.size;
        int[] iArr = c3Var.keys;
        Object[] objArr = c3Var.values;
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            Object obj = objArr[i6];
            if (obj != f2203a) {
                if (i6 != i5) {
                    iArr[i5] = iArr[i6];
                    objArr[i5] = obj;
                    objArr[i6] = null;
                }
                i5++;
            }
        }
        c3Var.garbage = false;
        c3Var.size = i5;
    }
}
