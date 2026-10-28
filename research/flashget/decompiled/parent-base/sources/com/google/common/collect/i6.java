package com.google.common.collect;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: SortedLists.java */
@w0
@d9.a
@d9.b
/* loaded from: classes6.dex */
final class i6 {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SortedLists.java */
    static abstract class b {
        public static final b NEXT_LOWER = new a(ProtectedSandApp.s("\uf4d5"), 0);
        public static final b NEXT_HIGHER = new C0850b(ProtectedSandApp.s("\uf4d6"), 1);
        public static final b INVERTED_INSERTION_INDEX = new c(ProtectedSandApp.s("\uf4d7"), 2);
        private static final /* synthetic */ b[] $VALUES = $values();

        /* compiled from: SortedLists.java */
        enum a extends b {
            a(String str, int i4) {
                super(str, i4);
            }

            @Override // com.google.common.collect.i6.b
            int resultIndex(int i4) {
                return i4 - 1;
            }
        }

        /* compiled from: SortedLists.java */
        /* renamed from: com.google.common.collect.i6$b$b, reason: collision with other inner class name */
        enum C0850b extends b {
            C0850b(String str, int i4) {
                super(str, i4);
            }

            @Override // com.google.common.collect.i6.b
            public int resultIndex(int i4) {
                return i4;
            }
        }

        /* compiled from: SortedLists.java */
        enum c extends b {
            c(String str, int i4) {
                super(str, i4);
            }

            @Override // com.google.common.collect.i6.b
            public int resultIndex(int i4) {
                return ~i4;
            }
        }

        private static /* synthetic */ b[] $values() {
            return new b[]{NEXT_LOWER, NEXT_HIGHER, INVERTED_INSERTION_INDEX};
        }

        private b(String str, int i4) {
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }

        abstract int resultIndex(int i4);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SortedLists.java */
    static abstract class c {
        public static final c ANY_PRESENT = new a(ProtectedSandApp.s("\uf4d8"), 0);
        public static final c LAST_PRESENT = new b(ProtectedSandApp.s("\uf4d9"), 1);
        public static final c FIRST_PRESENT = new C0851c(ProtectedSandApp.s("\uf4da"), 2);
        public static final c FIRST_AFTER = new d(ProtectedSandApp.s("\uf4db"), 3);
        public static final c LAST_BEFORE = new e(ProtectedSandApp.s("\uf4dc"), 4);
        private static final /* synthetic */ c[] $VALUES = $values();

        /* compiled from: SortedLists.java */
        enum a extends c {
            a(String str, int i4) {
                super(str, i4);
            }

            @Override // com.google.common.collect.i6.c
            <E> int resultIndex(Comparator<? super E> comparator, @f5 E e4, List<? extends E> list, int i4) {
                return i4;
            }
        }

        /* compiled from: SortedLists.java */
        enum b extends c {
            b(String str, int i4) {
                super(str, i4);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.collect.i6.c
            <E> int resultIndex(Comparator<? super E> comparator, @f5 E e4, List<? extends E> list, int i4) {
                int size = list.size() - 1;
                while (i4 < size) {
                    int i5 = ((i4 + size) + 1) >>> 1;
                    if (comparator.compare(list.get(i5), e4) > 0) {
                        size = i5 - 1;
                    } else {
                        i4 = i5;
                    }
                }
                return i4;
            }
        }

        /* compiled from: SortedLists.java */
        /* renamed from: com.google.common.collect.i6$c$c, reason: collision with other inner class name */
        enum C0851c extends c {
            C0851c(String str, int i4) {
                super(str, i4);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.collect.i6.c
            <E> int resultIndex(Comparator<? super E> comparator, @f5 E e4, List<? extends E> list, int i4) {
                int i5 = 0;
                while (i5 < i4) {
                    int i6 = (i5 + i4) >>> 1;
                    if (comparator.compare(list.get(i6), e4) < 0) {
                        i5 = i6 + 1;
                    } else {
                        i4 = i6;
                    }
                }
                return i5;
            }
        }

        /* compiled from: SortedLists.java */
        enum d extends c {
            d(String str, int i4) {
                super(str, i4);
            }

            @Override // com.google.common.collect.i6.c
            public <E> int resultIndex(Comparator<? super E> comparator, @f5 E e4, List<? extends E> list, int i4) {
                return c.LAST_PRESENT.resultIndex(comparator, e4, list, i4) + 1;
            }
        }

        /* compiled from: SortedLists.java */
        enum e extends c {
            e(String str, int i4) {
                super(str, i4);
            }

            @Override // com.google.common.collect.i6.c
            public <E> int resultIndex(Comparator<? super E> comparator, @f5 E e4, List<? extends E> list, int i4) {
                return c.FIRST_PRESENT.resultIndex(comparator, e4, list, i4) - 1;
            }
        }

        private static /* synthetic */ c[] $values() {
            return new c[]{ANY_PRESENT, LAST_PRESENT, FIRST_PRESENT, FIRST_AFTER, LAST_BEFORE};
        }

        private c(String str, int i4) {
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) $VALUES.clone();
        }

        abstract <E> int resultIndex(Comparator<? super E> comparator, @f5 E e4, List<? extends E> list, int i4);
    }

    private i6() {
    }

    public static <E, K extends Comparable> int a(List<E> list, com.google.common.base.x<? super E, K> xVar, K k4, c cVar, b bVar) {
        k4.getClass();
        return b(list, xVar, k4, x4.f56632f, cVar, bVar);
    }

    public static <E, K> int b(List<E> list, com.google.common.base.x<? super E, K> xVar, @f5 K k4, Comparator<? super K> comparator, c cVar, b bVar) {
        return d(l4.D(list, xVar), k4, comparator, cVar, bVar);
    }

    public static <E extends Comparable> int c(List<? extends E> list, E e4, c cVar, b bVar) {
        e4.getClass();
        return d(list, e4, x4.f56632f, cVar, bVar);
    }

    public static <E> int d(List<? extends E> list, @f5 E e4, Comparator<? super E> comparator, c cVar, b bVar) {
        comparator.getClass();
        list.getClass();
        cVar.getClass();
        bVar.getClass();
        if (!(list instanceof RandomAccess)) {
            list = l4.r(list);
        }
        int size = list.size() - 1;
        int i4 = 0;
        while (i4 <= size) {
            int i5 = (i4 + size) >>> 1;
            int compare = comparator.compare(e4, list.get(i5));
            if (compare < 0) {
                size = i5 - 1;
            } else {
                if (compare <= 0) {
                    return i4 + cVar.resultIndex(comparator, e4, list.subList(i4, size + 1), i5 - i4);
                }
                i4 = i5 + 1;
            }
        }
        return bVar.resultIndex(i4);
    }
}
