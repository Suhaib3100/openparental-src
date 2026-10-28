package androidx.core.view;

import android.view.Menu;
import android.view.MenuItem;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.sequences.Sequence;

/* compiled from: Menu.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010)\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0015\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\n\u001a\u0015\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0003H\u0086\u0002\u001a\u0015\u0010\t\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0003H\u0086\n\u001a\r\u0010\n\u001a\u00020\u0006*\u00020\u0000H\u0086\b\u001a\r\u0010\u000b\u001a\u00020\u0006*\u00020\u0000H\u0086\b\u001a3\u0010\u0010\u001a\u00020\b*\u00020\u00002!\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\b0\fH\u0086\bø\u0001\u0000\u001aH\u0010\u0012\u001a\u00020\b*\u00020\u000026\u0010\u000f\u001a2\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0002\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\b0\u0011H\u0086\bø\u0001\u0000\u001a\u0013\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u0013*\u00020\u0000H\u0086\u0002\"\u0016\u0010\u0017\u001a\u00020\u0001*\u00020\u00008Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016\"\u001b\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0018*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001c"}, d2 = {"Landroid/view/Menu;", "", "index", "Landroid/view/MenuItem;", "d", "item", "", "a", "Lkotlin/m2;", "j", "g", "h", "Lkotlin/Function1;", "Lkotlin/r0;", "name", "action", "b", "Lkotlin/Function2;", "c", "", "i", "f", "(Landroid/view/Menu;)I", "size", "Lkotlin/sequences/m;", "e", "(Landroid/view/Menu;)Lkotlin/sequences/m;", "children", "core-ktx_release"}, k = 2, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class d1 {

    /* compiled from: Menu.kt */
    @Metadata(d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003H\u0096\u0002¨\u0006\u0005"}, d2 = {"androidx/core/view/d1$a", "Lkotlin/sequences/m;", "Landroid/view/MenuItem;", "", "iterator", "core-ktx_release"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes3.dex */
    public static final class a implements Sequence<MenuItem> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Menu f5467a;

        a(Menu menu) {
            this.f5467a = menu;
        }

        @Override // kotlin.sequences.Sequence
        @d5.d
        public Iterator<MenuItem> iterator() {
            return d1.i(this.f5467a);
        }
    }

    /* compiled from: Menu.kt */
    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\t\u0010\u0004\u001a\u00020\u0003H\u0096\u0002J\t\u0010\u0005\u001a\u00020\u0002H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"androidx/core/view/d1$b", "", "Landroid/view/MenuItem;", "", "hasNext", "a", "Lkotlin/m2;", "remove", "", "o", "I", "index", "core-ktx_release"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes3.dex */
    public static final class b implements Iterator<MenuItem>, r3.d {

        /* renamed from: o, reason: collision with root package name and from kotlin metadata */
        private int index;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ Menu f5469p;

        b(Menu menu) {
            this.f5469p = menu;
        }

        @Override // java.util.Iterator
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public MenuItem next() {
            Menu menu = this.f5469p;
            int i5 = this.index;
            this.index = i5 + 1;
            MenuItem item = menu.getItem(i5);
            if (item != null) {
                return item;
            }
            throw new IndexOutOfBoundsException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.index < this.f5469p.size();
        }

        @Override // java.util.Iterator
        public void remove() {
            Menu menu = this.f5469p;
            int i5 = this.index - 1;
            this.index = i5;
            menu.removeItem(i5);
        }
    }

    public static final boolean a(@d5.d Menu menu, @d5.d MenuItem item) {
        kotlin.jvm.internal.l0.p(menu, "<this>");
        kotlin.jvm.internal.l0.p(item, "item");
        int size = menu.size();
        if (size > 0) {
            int i5 = 0;
            while (true) {
                int i6 = i5 + 1;
                if (kotlin.jvm.internal.l0.g(menu.getItem(i5), item)) {
                    return true;
                }
                if (i6 >= size) {
                    break;
                }
                i5 = i6;
            }
        }
        return false;
    }

    public static final void b(@d5.d Menu menu, @d5.d q3.l<? super MenuItem, kotlin.m2> action) {
        kotlin.jvm.internal.l0.p(menu, "<this>");
        kotlin.jvm.internal.l0.p(action, "action");
        int size = menu.size();
        if (size <= 0) {
            return;
        }
        int i5 = 0;
        while (true) {
            int i6 = i5 + 1;
            MenuItem item = menu.getItem(i5);
            kotlin.jvm.internal.l0.o(item, "getItem(index)");
            action.N(item);
            if (i6 >= size) {
                return;
            } else {
                i5 = i6;
            }
        }
    }

    public static final void c(@d5.d Menu menu, @d5.d q3.p<? super Integer, ? super MenuItem, kotlin.m2> action) {
        kotlin.jvm.internal.l0.p(menu, "<this>");
        kotlin.jvm.internal.l0.p(action, "action");
        int size = menu.size();
        if (size <= 0) {
            return;
        }
        int i5 = 0;
        while (true) {
            int i6 = i5 + 1;
            Integer valueOf = Integer.valueOf(i5);
            MenuItem item = menu.getItem(i5);
            kotlin.jvm.internal.l0.o(item, "getItem(index)");
            action.g0(valueOf, item);
            if (i6 >= size) {
                return;
            } else {
                i5 = i6;
            }
        }
    }

    @d5.d
    public static final MenuItem d(@d5.d Menu menu, int i5) {
        kotlin.jvm.internal.l0.p(menu, "<this>");
        MenuItem item = menu.getItem(i5);
        kotlin.jvm.internal.l0.o(item, "getItem(index)");
        return item;
    }

    @d5.d
    public static final Sequence<MenuItem> e(@d5.d Menu menu) {
        kotlin.jvm.internal.l0.p(menu, "<this>");
        return new a(menu);
    }

    public static final int f(@d5.d Menu menu) {
        kotlin.jvm.internal.l0.p(menu, "<this>");
        return menu.size();
    }

    public static final boolean g(@d5.d Menu menu) {
        kotlin.jvm.internal.l0.p(menu, "<this>");
        return menu.size() == 0;
    }

    public static final boolean h(@d5.d Menu menu) {
        kotlin.jvm.internal.l0.p(menu, "<this>");
        return menu.size() != 0;
    }

    @d5.d
    public static final Iterator<MenuItem> i(@d5.d Menu menu) {
        kotlin.jvm.internal.l0.p(menu, "<this>");
        return new b(menu);
    }

    public static final void j(@d5.d Menu menu, @d5.d MenuItem item) {
        kotlin.jvm.internal.l0.p(menu, "<this>");
        kotlin.jvm.internal.l0.p(item, "item");
        menu.removeItem(item.getItemId());
    }
}
