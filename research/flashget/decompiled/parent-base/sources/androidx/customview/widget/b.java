package androidx.customview.widget;

import android.graphics.Rect;
import androidx.annotation.o0;
import androidx.annotation.q0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* compiled from: FocusStrategy.java */
/* loaded from: classes3.dex */
class b {

    /* compiled from: FocusStrategy.java */
    public interface a<T> {
        void a(T t4, Rect rect);
    }

    /* compiled from: FocusStrategy.java */
    /* renamed from: androidx.customview.widget.b$b, reason: collision with other inner class name */
    public interface InterfaceC0458b<T, V> {
        V a(T t4, int i4);

        int b(T t4);
    }

    /* compiled from: FocusStrategy.java */
    private static class c<T> implements Comparator<T> {

        /* renamed from: b, reason: collision with root package name */
        private final Rect f28350b = new Rect();

        /* renamed from: c, reason: collision with root package name */
        private final Rect f28351c = new Rect();

        /* renamed from: d, reason: collision with root package name */
        private final boolean f28352d;

        /* renamed from: e, reason: collision with root package name */
        private final a<T> f28353e;

        c(boolean z4, a<T> aVar) {
            this.f28352d = z4;
            this.f28353e = aVar;
        }

        @Override // java.util.Comparator
        public int compare(T t4, T t5) {
            Rect rect = this.f28350b;
            Rect rect2 = this.f28351c;
            this.f28353e.a(t4, rect);
            this.f28353e.a(t5, rect2);
            int i4 = rect.top;
            int i5 = rect2.top;
            if (i4 < i5) {
                return -1;
            }
            if (i4 > i5) {
                return 1;
            }
            int i6 = rect.left;
            int i7 = rect2.left;
            if (i6 < i7) {
                return this.f28352d ? 1 : -1;
            }
            if (i6 > i7) {
                return this.f28352d ? -1 : 1;
            }
            int i10 = rect.bottom;
            int i11 = rect2.bottom;
            if (i10 < i11) {
                return -1;
            }
            if (i10 > i11) {
                return 1;
            }
            int i12 = rect.right;
            int i13 = rect2.right;
            if (i12 < i13) {
                return this.f28352d ? 1 : -1;
            }
            if (i12 > i13) {
                return this.f28352d ? -1 : 1;
            }
            return 0;
        }
    }

    private b() {
    }

    private static boolean a(int i4, @o0 Rect rect, @o0 Rect rect2, @o0 Rect rect3) {
        boolean b5 = b(i4, rect, rect2);
        if (b(i4, rect, rect3) || !b5) {
            return false;
        }
        return !j(i4, rect, rect3) || i4 == 17 || i4 == 66 || k(i4, rect, rect2) < m(i4, rect, rect3);
    }

    private static boolean b(int i4, @o0 Rect rect, @o0 Rect rect2) {
        if (i4 != 17) {
            if (i4 != 33) {
                if (i4 != 66) {
                    if (i4 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return rect2.right >= rect.left && rect2.left <= rect.right;
        }
        return rect2.bottom >= rect.top && rect2.top <= rect.bottom;
    }

    public static <L, T> T c(@o0 L l4, @o0 InterfaceC0458b<L, T> interfaceC0458b, @o0 a<T> aVar, @q0 T t4, @o0 Rect rect, int i4) {
        Rect rect2 = new Rect(rect);
        if (i4 == 17) {
            rect2.offset(rect.width() + 1, 0);
        } else if (i4 == 33) {
            rect2.offset(0, rect.height() + 1);
        } else if (i4 == 66) {
            rect2.offset(-(rect.width() + 1), 0);
        } else {
            if (i4 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            rect2.offset(0, -(rect.height() + 1));
        }
        int b5 = interfaceC0458b.b(l4);
        Rect rect3 = new Rect();
        T t5 = null;
        for (int i5 = 0; i5 < b5; i5++) {
            T a5 = interfaceC0458b.a(l4, i5);
            if (a5 != t4) {
                aVar.a(a5, rect3);
                if (h(i4, rect, rect3, rect2)) {
                    rect2.set(rect3);
                    t5 = a5;
                }
            }
        }
        return t5;
    }

    public static <L, T> T d(@o0 L l4, @o0 InterfaceC0458b<L, T> interfaceC0458b, @o0 a<T> aVar, @q0 T t4, int i4, boolean z4, boolean z5) {
        int b5 = interfaceC0458b.b(l4);
        ArrayList arrayList = new ArrayList(b5);
        for (int i5 = 0; i5 < b5; i5++) {
            arrayList.add(interfaceC0458b.a(l4, i5));
        }
        Collections.sort(arrayList, new c(z4, aVar));
        if (i4 == 1) {
            return (T) f(t4, arrayList, z5);
        }
        if (i4 == 2) {
            return (T) e(t4, arrayList, z5);
        }
        throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
    }

    private static <T> T e(T t4, ArrayList<T> arrayList, boolean z4) {
        int size = arrayList.size();
        int lastIndexOf = (t4 == null ? -1 : arrayList.lastIndexOf(t4)) + 1;
        if (lastIndexOf < size) {
            return arrayList.get(lastIndexOf);
        }
        if (!z4 || size <= 0) {
            return null;
        }
        return arrayList.get(0);
    }

    private static <T> T f(T t4, ArrayList<T> arrayList, boolean z4) {
        int size = arrayList.size();
        int indexOf = (t4 == null ? size : arrayList.indexOf(t4)) - 1;
        if (indexOf >= 0) {
            return arrayList.get(indexOf);
        }
        if (!z4 || size <= 0) {
            return null;
        }
        return arrayList.get(size - 1);
    }

    private static int g(int i4, int i5) {
        return (i5 * i5) + (i4 * 13 * i4);
    }

    private static boolean h(int i4, @o0 Rect rect, @o0 Rect rect2, @o0 Rect rect3) {
        if (!i(rect, rect2, i4)) {
            return false;
        }
        if (i(rect, rect3, i4) && !a(i4, rect, rect2, rect3)) {
            return !a(i4, rect, rect3, rect2) && g(k(i4, rect, rect2), o(i4, rect, rect2)) < g(k(i4, rect, rect3), o(i4, rect, rect3));
        }
        return true;
    }

    private static boolean i(@o0 Rect rect, @o0 Rect rect2, int i4) {
        if (i4 == 17) {
            int i5 = rect.right;
            int i6 = rect2.right;
            return (i5 > i6 || rect.left >= i6) && rect.left > rect2.left;
        }
        if (i4 == 33) {
            int i7 = rect.bottom;
            int i10 = rect2.bottom;
            return (i7 > i10 || rect.top >= i10) && rect.top > rect2.top;
        }
        if (i4 == 66) {
            int i11 = rect.left;
            int i12 = rect2.left;
            return (i11 < i12 || rect.right <= i12) && rect.right < rect2.right;
        }
        if (i4 != 130) {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        int i13 = rect.top;
        int i14 = rect2.top;
        return (i13 < i14 || rect.bottom <= i14) && rect.bottom < rect2.bottom;
    }

    private static boolean j(int i4, @o0 Rect rect, @o0 Rect rect2) {
        if (i4 == 17) {
            return rect.left >= rect2.right;
        }
        if (i4 == 33) {
            return rect.top >= rect2.bottom;
        }
        if (i4 == 66) {
            return rect.right <= rect2.left;
        }
        if (i4 == 130) {
            return rect.bottom <= rect2.top;
        }
        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
    }

    private static int k(int i4, @o0 Rect rect, @o0 Rect rect2) {
        return Math.max(0, l(i4, rect, rect2));
    }

    private static int l(int i4, @o0 Rect rect, @o0 Rect rect2) {
        int i5;
        int i6;
        if (i4 == 17) {
            i5 = rect.left;
            i6 = rect2.right;
        } else if (i4 == 33) {
            i5 = rect.top;
            i6 = rect2.bottom;
        } else if (i4 == 66) {
            i5 = rect2.left;
            i6 = rect.right;
        } else {
            if (i4 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            i5 = rect2.top;
            i6 = rect.bottom;
        }
        return i5 - i6;
    }

    private static int m(int i4, @o0 Rect rect, @o0 Rect rect2) {
        return Math.max(1, n(i4, rect, rect2));
    }

    private static int n(int i4, @o0 Rect rect, @o0 Rect rect2) {
        int i5;
        int i6;
        if (i4 == 17) {
            i5 = rect.left;
            i6 = rect2.left;
        } else if (i4 == 33) {
            i5 = rect.top;
            i6 = rect2.top;
        } else if (i4 == 66) {
            i5 = rect2.right;
            i6 = rect.right;
        } else {
            if (i4 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            i5 = rect2.bottom;
            i6 = rect.bottom;
        }
        return i5 - i6;
    }

    private static int o(int i4, @o0 Rect rect, @o0 Rect rect2) {
        if (i4 != 17) {
            if (i4 != 33) {
                if (i4 != 66) {
                    if (i4 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return Math.abs(((rect.width() / 2) + rect.left) - ((rect2.width() / 2) + rect2.left));
        }
        return Math.abs(((rect.height() / 2) + rect.top) - ((rect2.height() / 2) + rect2.top));
    }
}
