package androidx.core.view;

import android.view.Menu;
import android.view.MenuItem;
import java.util.Iterator;
import kotlin.Metadata;

/* compiled from: Menu.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010)\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001c\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\n¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001c\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0003H\u0086\u0002¢\u0006\u0004\b\b\u0010\t\u001a\u001c\u0010\u000b\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0003H\u0086\n¢\u0006\u0004\b\u000b\u0010\f\u001a\u0014\u0010\r\u001a\u00020\u0007*\u00020\u0000H\u0086\b¢\u0006\u0004\b\r\u0010\u000e\u001a\u0014\u0010\u000f\u001a\u00020\u0007*\u00020\u0000H\u0086\b¢\u0006\u0004\b\u000f\u0010\u000e\u001a7\u0010\u0014\u001a\u00020\n*\u00020\u00002!\u0010\u0013\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\n0\u0010H\u0086\b¢\u0006\u0004\b\u0014\u0010\u0015\u001aL\u0010\u0017\u001a\u00020\n*\u00020\u000026\u0010\u0013\u001a2\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0002\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\n0\u0016H\u0086\b¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\u0019*\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u001c\u0010\u001c\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\b¢\u0006\u0004\b\u001c\u0010\u001d\"\u0016\u0010 \u001a\u00020\u0001*\u00020\u00008Æ\u0002¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f\"\u001b\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00030!*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Landroid/view/Menu;", "", "index", "Landroid/view/MenuItem;", "d", "(Landroid/view/Menu;I)Landroid/view/MenuItem;", "item", "", "a", "(Landroid/view/Menu;Landroid/view/MenuItem;)Z", "Lkotlin/k2;", "j", "(Landroid/view/Menu;Landroid/view/MenuItem;)V", "g", "(Landroid/view/Menu;)Z", "h", "Lkotlin/Function1;", "Lkotlin/r0;", "name", "action", "b", "(Landroid/view/Menu;Lld/l;)V", "Lkotlin/Function2;", "c", "(Landroid/view/Menu;Lld/p;)V", "", "i", "(Landroid/view/Menu;)Ljava/util/Iterator;", "k", "(Landroid/view/Menu;I)V", "f", "(Landroid/view/Menu;)I", "size", "Lkotlin/sequences/m;", "e", "(Landroid/view/Menu;)Lkotlin/sequences/m;", "children", "core-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nMenu.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Menu.kt\nandroidx/core/view/MenuKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,95:1\n1#2:96\n*E\n"})
/* loaded from: classes3.dex */
public final class s0 {

    /* compiled from: Menu.kt */
    @Metadata(d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"androidx/core/view/s0$a", "Lkotlin/sequences/m;", "Landroid/view/MenuItem;", "", "iterator", "()Ljava/util/Iterator;", "core-ktx_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a implements kotlin.sequences.m<MenuItem> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Menu f27399a;

        a(Menu menu) {
            this.f27399a = menu;
        }

        @Override // kotlin.sequences.m
        public Iterator<MenuItem> iterator() {
            return new b(this.f27399a);
        }
    }

    /* compiled from: Menu.kt */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\r\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\f¨\u0006\u000e"}, d2 = {"androidx/core/view/s0$b", "", "Landroid/view/MenuItem;", "", "hasNext", "()Z", "b", "()Landroid/view/MenuItem;", "Lkotlin/k2;", "remove", "()V", "", "I", "index", "core-ktx_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @kotlin.jvm.internal.r1({"SMAP\nMenu.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Menu.kt\nandroidx/core/view/MenuKt$iterator$1\n+ 2 Menu.kt\nandroidx/core/view/MenuKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,95:1\n87#2:96\n1#3:97\n*S KotlinDebug\n*F\n+ 1 Menu.kt\nandroidx/core/view/MenuKt$iterator$1\n*L\n78#1:96\n78#1:97\n*E\n"})
    public static final class b implements Iterator<MenuItem>, md.d {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private int index;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Menu f27401c;

        b(Menu menu) {
            this.f27401c = menu;
        }

        @Override // java.util.Iterator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public MenuItem next() {
            Menu menu = this.f27401c;
            int i4 = this.index;
            this.index = i4 + 1;
            MenuItem item = menu.getItem(i4);
            if (item != null) {
                return item;
            }
            throw new IndexOutOfBoundsException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.index < this.f27401c.size();
        }

        @Override // java.util.Iterator
        public void remove() {
            kotlin.k2 k2Var;
            Menu menu = this.f27401c;
            int i4 = this.index - 1;
            this.index = i4;
            MenuItem item = menu.getItem(i4);
            if (item != null) {
                menu.removeItem(item.getItemId());
                k2Var = kotlin.k2.f75408a;
            } else {
                k2Var = null;
            }
            if (k2Var == null) {
                throw new IndexOutOfBoundsException();
            }
        }
    }

    public static final boolean a(@fg.l Menu menu, @fg.l MenuItem menuItem) {
        int size = menu.size();
        for (int i4 = 0; i4 < size; i4++) {
            if (kotlin.jvm.internal.l0.g(menu.getItem(i4), menuItem)) {
                return true;
            }
        }
        return false;
    }

    public static final void b(@fg.l Menu menu, @fg.l ld.l<? super MenuItem, kotlin.k2> lVar) {
        int size = menu.size();
        for (int i4 = 0; i4 < size; i4++) {
            lVar.invoke(menu.getItem(i4));
        }
    }

    public static final void c(@fg.l Menu menu, @fg.l ld.p<? super Integer, ? super MenuItem, kotlin.k2> pVar) {
        int size = menu.size();
        for (int i4 = 0; i4 < size; i4++) {
            pVar.invoke(Integer.valueOf(i4), menu.getItem(i4));
        }
    }

    @fg.l
    public static final MenuItem d(@fg.l Menu menu, int i4) {
        return menu.getItem(i4);
    }

    @fg.l
    public static final kotlin.sequences.m<MenuItem> e(@fg.l Menu menu) {
        return new a(menu);
    }

    public static final int f(@fg.l Menu menu) {
        return menu.size();
    }

    public static final boolean g(@fg.l Menu menu) {
        return menu.size() == 0;
    }

    public static final boolean h(@fg.l Menu menu) {
        return menu.size() != 0;
    }

    @fg.l
    public static final Iterator<MenuItem> i(@fg.l Menu menu) {
        return new b(menu);
    }

    public static final void j(@fg.l Menu menu, @fg.l MenuItem menuItem) {
        menu.removeItem(menuItem.getItemId());
    }

    public static final void k(@fg.l Menu menu, int i4) {
        kotlin.k2 k2Var;
        MenuItem item = menu.getItem(i4);
        if (item != null) {
            menu.removeItem(item.getItemId());
            k2Var = kotlin.k2.f75408a;
        } else {
            k2Var = null;
        }
        if (k2Var == null) {
            throw new IndexOutOfBoundsException();
        }
    }
}
