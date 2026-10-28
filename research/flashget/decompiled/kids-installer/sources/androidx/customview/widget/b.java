package androidx.customview.widget;

import android.graphics.Rect;
import androidx.annotation.o0;
import androidx.annotation.q0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* compiled from: FocusStrategy.java */
/* loaded from: classes.dex */
class b {

    /* compiled from: FocusStrategy.java */
    public interface a<T> {
        void a(T t5, Rect rect);
    }

    /* compiled from: FocusStrategy.java */
    /* renamed from: androidx.customview.widget.b$b, reason: collision with other inner class name */
    public interface InterfaceC0064b<T, V> {
        V a(T t5, int i5);

        int b(T t5);
    }

    /* compiled from: FocusStrategy.java */
    private static class c<T> implements Comparator<T> {

        /* renamed from: o, reason: collision with root package name */
        private final Rect f5957o = new Rect();

        /* renamed from: p, reason: collision with root package name */
        private final Rect f5958p = new Rect();

        /* renamed from: q, reason: collision with root package name */
        private final boolean f5959q;

        /* renamed from: r, reason: collision with root package name */
        private final a<T> f5960r;

        c(boolean z5, a<T> aVar) {
            this.f5959q = z5;
            this.f5960r = aVar;
        }

        @Override // java.util.Comparator
        public int compare(T t5, T t6) {
            Rect rect = this.f5957o;
            Rect rect2 = this.f5958p;
            this.f5960r.a(t5, rect);
            this.f5960r.a(t6, rect2);
            int i5 = rect.top;
            int i6 = rect2.top;
            if (i5 < i6) {
                return -1;
            }
            if (i5 > i6) {
                return 1;
            }
            int i7 = rect.left;
            int i8 = rect2.left;
            if (i7 < i8) {
                return this.f5959q ? 1 : -1;
            }
            if (i7 > i8) {
                return this.f5959q ? -1 : 1;
            }
            int i9 = rect.bottom;
            int i10 = rect2.bottom;
            if (i9 < i10) {
                return -1;
            }
            if (i9 > i10) {
                return 1;
            }
            int i11 = rect.right;
            int i12 = rect2.right;
            if (i11 < i12) {
                return this.f5959q ? 1 : -1;
            }
            if (i11 > i12) {
                return this.f5959q ? -1 : 1;
            }
            return 0;
        }
    }

    private b() {
    }

    private static boolean a(int i5, @o0 Rect rect, @o0 Rect rect2, @o0 Rect rect3) {
        boolean b6 = b(i5, rect, rect2);
        if (b(i5, rect, rect3) || !b6) {
            return false;
        }
        return !j(i5, rect, rect3) || i5 == 17 || i5 == 66 || k(i5, rect, rect2) < m(i5, rect, rect3);
    }

    private static boolean b(int i5, @o0 Rect rect, @o0 Rect rect2) {
        if (i5 != 17) {
            if (i5 != 33) {
                if (i5 != 66) {
                    if (i5 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return rect2.right >= rect.left && rect2.left <= rect.right;
        }
        return rect2.bottom >= rect.top && rect2.top <= rect.bottom;
    }

    public static <L, T> T c(@o0 L l5, @o0 InterfaceC0064b<L, T> interfaceC0064b, @o0 a<T> aVar, @q0 T t5, @o0 Rect rect, int i5) {
        Rect rect2 = new Rect(rect);
        if (i5 == 17) {
            rect2.offset(rect.width() + 1, 0);
        } else if (i5 == 33) {
            rect2.offset(0, rect.height() + 1);
        } else if (i5 == 66) {
            rect2.offset(-(rect.width() + 1), 0);
        } else {
            if (i5 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            rect2.offset(0, -(rect.height() + 1));
        }
        int b6 = interfaceC0064b.b(l5);
        Rect rect3 = new Rect();
        T t6 = null;
        for (int i6 = 0; i6 < b6; i6++) {
            T a6 = interfaceC0064b.a(l5, i6);
            if (a6 != t5) {
                aVar.a(a6, rect3);
                if (h(i5, rect, rect3, rect2)) {
                    rect2.set(rect3);
                    t6 = a6;
                }
            }
        }
        return t6;
    }

    public static <L, T> T d(@o0 L l5, @o0 InterfaceC0064b<L, T> interfaceC0064b, @o0 a<T> aVar, @q0 T t5, int i5, boolean z5, boolean z6) {
        int b6 = interfaceC0064b.b(l5);
        ArrayList arrayList = new ArrayList(b6);
        for (int i6 = 0; i6 < b6; i6++) {
            arrayList.add(interfaceC0064b.a(l5, i6));
        }
        Collections.sort(arrayList, new c(z5, aVar));
        if (i5 == 1) {
            return (T) f(t5, arrayList, z6);
        }
        if (i5 == 2) {
            return (T) e(t5, arrayList, z6);
        }
        throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
    }

    private static <T> T e(T t5, ArrayList<T> arrayList, boolean z5) {
        int size = arrayList.size();
        int lastIndexOf = (t5 == null ? -1 : arrayList.lastIndexOf(t5)) + 1;
        if (lastIndexOf < size) {
            return arrayList.get(lastIndexOf);
        }
        if (!z5 || size <= 0) {
            return null;
        }
        return arrayList.get(0);
    }

    private static <T> T f(T t5, ArrayList<T> arrayList, boolean z5) {
        int size = arrayList.size();
        int indexOf = (t5 == null ? size : arrayList.indexOf(t5)) - 1;
        if (indexOf >= 0) {
            return arrayList.get(indexOf);
        }
        if (!z5 || size <= 0) {
            return null;
        }
        return arrayList.get(size - 1);
    }

    private static int g(int i5, int i6) {
        return (i6 * i6) + (i5 * 13 * i5);
    }

    private static boolean h(int i5, @o0 Rect rect, @o0 Rect rect2, @o0 Rect rect3) {
        if (!i(rect, rect2, i5)) {
            return false;
        }
        if (!i(rect, rect3, i5) || a(i5, rect, rect2, rect3)) {
            return true;
        }
        if (a(i5, rect, rect3, rect2)) {
            return false;
        }
        int k5 = k(i5, rect, rect2);
        int o5 = o(i5, rect, rect2);
        int i6 = (o5 * o5) + (k5 * 13 * k5);
        int k6 = k(i5, rect, rect3);
        int o6 = o(i5, rect, rect3);
        return i6 < (o6 * o6) + ((k6 * 13) * k6);
    }

    private static boolean i(@o0 Rect rect, @o0 Rect rect2, int i5) {
        if (i5 == 17) {
            int i6 = rect.right;
            int i7 = rect2.right;
            return (i6 > i7 || rect.left >= i7) && rect.left > rect2.left;
        }
        if (i5 == 33) {
            int i8 = rect.bottom;
            int i9 = rect2.bottom;
            return (i8 > i9 || rect.top >= i9) && rect.top > rect2.top;
        }
        if (i5 == 66) {
            int i10 = rect.left;
            int i11 = rect2.left;
            return (i10 < i11 || rect.right <= i11) && rect.right < rect2.right;
        }
        if (i5 != 130) {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        int i12 = rect.top;
        int i13 = rect2.top;
        return (i12 < i13 || rect.bottom <= i13) && rect.bottom < rect2.bottom;
    }

    private static boolean j(int i5, @o0 Rect rect, @o0 Rect rect2) {
        if (i5 == 17) {
            return rect.left >= rect2.right;
        }
        if (i5 == 33) {
            return rect.top >= rect2.bottom;
        }
        if (i5 == 66) {
            return rect.right <= rect2.left;
        }
        if (i5 == 130) {
            return rect.bottom <= rect2.top;
        }
        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
    }

    private static int k(int i5, @o0 Rect rect, @o0 Rect rect2) {
        return Math.max(0, l(i5, rect, rect2));
    }

    private static int l(int i5, @o0 Rect rect, @o0 Rect rect2) {
        int i6;
        int i7;
        if (i5 == 17) {
            i6 = rect.left;
            i7 = rect2.right;
        } else if (i5 == 33) {
            i6 = rect.top;
            i7 = rect2.bottom;
        } else if (i5 == 66) {
            i6 = rect2.left;
            i7 = rect.right;
        } else {
            if (i5 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            i6 = rect2.top;
            i7 = rect.bottom;
        }
        return i6 - i7;
    }

    private static int m(int i5, @o0 Rect rect, @o0 Rect rect2) {
        return Math.max(1, n(i5, rect, rect2));
    }

    private static int n(int i5, @o0 Rect rect, @o0 Rect rect2) {
        int i6;
        int i7;
        if (i5 == 17) {
            i6 = rect.left;
            i7 = rect2.left;
        } else if (i5 == 33) {
            i6 = rect.top;
            i7 = rect2.top;
        } else if (i5 == 66) {
            i6 = rect2.right;
            i7 = rect.right;
        } else {
            if (i5 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            i6 = rect2.bottom;
            i7 = rect.bottom;
        }
        return i6 - i7;
    }

    private static int o(int i5, @o0 Rect rect, @o0 Rect rect2) {
        if (i5 != 17) {
            if (i5 != 33) {
                if (i5 != 66) {
                    if (i5 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return Math.abs(((rect.width() / 2) + rect.left) - ((rect2.width() / 2) + rect2.left));
        }
        return Math.abs(((rect.height() / 2) + rect.top) - ((rect2.height() / 2) + rect2.top));
    }
}
