package androidx.paging;

import androidx.paging.b1;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;

/* compiled from: PagingState.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001B=\u0012\u0018\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0001\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u0004\u0018\u00018\u00012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u000f¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u0004\u0018\u00018\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u0004\u0018\u00018\u0001¢\u0006\u0004\b\u001c\u0010\u001bJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJY\u0010'\u001a\u00028\u0002\"\u0004\b\u0002\u0010 2\u0006\u0010\b\u001a\u00020\u000726\u0010&\u001a2\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(%\u0012\u0004\u0012\u00028\u00020!H\u0080\bø\u0001\u0000¢\u0006\u0004\b'\u0010(R)\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00050\u00048\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b'\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0014\u00100\u001a\u0004\b1\u00102R\u0014\u0010\u000b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u00103\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u00064"}, d2 = {"Landroidx/paging/d1;", "", "Key", "Value", "", "Landroidx/paging/b1$b$c;", "pages", "", "anchorPosition", "Landroidx/paging/x0;", "config", "leadingPlaceholderCount", "<init>", "(Ljava/util/List;Ljava/lang/Integer;Landroidx/paging/x0;I)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "c", "(I)Ljava/lang/Object;", "d", "(I)Landroidx/paging/b1$b$c;", "i", "()Z", "e", "()Ljava/lang/Object;", "j", "", "toString", "()Ljava/lang/String;", "T", "Lkotlin/Function2;", "Lkotlin/r0;", "name", "pageIndex", "index", "block", "b", "(ILld/p;)Ljava/lang/Object;", "a", "Ljava/util/List;", "h", "()Ljava/util/List;", "Ljava/lang/Integer;", "f", "()Ljava/lang/Integer;", "Landroidx/paging/x0;", "g", "()Landroidx/paging/x0;", "I", "paging-common"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class d1<Key, Value> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final List<b1.b.c<Key, Value>> pages;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final Integer anchorPosition;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final x0 config;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int leadingPlaceholderCount;

    public d1(@fg.l List<b1.b.c<Key, Value>> pages, @fg.m Integer num, @fg.l x0 config, @androidx.annotation.g0(from = 0) int i4) {
        kotlin.jvm.internal.l0.p(pages, "pages");
        kotlin.jvm.internal.l0.p(config, "config");
        this.pages = pages;
        this.anchorPosition = num;
        this.config = config;
        this.leadingPlaceholderCount = i4;
    }

    public final <T> T b(int anchorPosition, @fg.l ld.p<? super Integer, ? super Integer, ? extends T> block) {
        kotlin.jvm.internal.l0.p(block, "block");
        int i4 = anchorPosition - this.leadingPlaceholderCount;
        int i5 = 0;
        while (i5 < kotlin.collections.w.J(this.pages) && i4 > kotlin.collections.w.J(this.pages.get(i5).i())) {
            i4 -= this.pages.get(i5).i().size();
            i5++;
        }
        return block.invoke(Integer.valueOf(i5), Integer.valueOf(i4));
    }

    @fg.m
    public final Value c(int anchorPosition) {
        List<b1.b.c<Key, Value>> list = this.pages;
        if ((list instanceof Collection) && list.isEmpty()) {
            return null;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (!((b1.b.c) it.next()).i().isEmpty()) {
                int i4 = anchorPosition - this.leadingPlaceholderCount;
                int i5 = 0;
                while (i5 < kotlin.collections.w.J(this.pages) && i4 > kotlin.collections.w.J(this.pages.get(i5).i())) {
                    i4 -= this.pages.get(i5).i().size();
                    i5++;
                }
                Iterator<T> it2 = this.pages.iterator();
                while (it2.hasNext()) {
                    b1.b.c cVar = (b1.b.c) it2.next();
                    if (!cVar.i().isEmpty()) {
                        List<b1.b.c<Key, Value>> list2 = this.pages;
                        ListIterator<b1.b.c<Key, Value>> listIterator = list2.listIterator(list2.size());
                        while (listIterator.hasPrevious()) {
                            b1.b.c<Key, Value> previous = listIterator.previous();
                            if (!previous.i().isEmpty()) {
                                return i4 < 0 ? (Value) kotlin.collections.w.B2(cVar.i()) : (i5 != kotlin.collections.w.J(this.pages) || i4 <= kotlin.collections.w.J(((b1.b.c) kotlin.collections.w.p3(this.pages)).i())) ? this.pages.get(i5).i().get(i4) : (Value) kotlin.collections.w.p3(previous.i());
                            }
                        }
                        throw new NoSuchElementException("List contains no element matching the predicate.");
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        }
        return null;
    }

    @fg.m
    public final b1.b.c<Key, Value> d(int anchorPosition) {
        List<b1.b.c<Key, Value>> list = this.pages;
        if ((list instanceof Collection) && list.isEmpty()) {
            return null;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (!((b1.b.c) it.next()).i().isEmpty()) {
                int i4 = anchorPosition - this.leadingPlaceholderCount;
                int i5 = 0;
                while (i5 < kotlin.collections.w.J(this.pages) && i4 > kotlin.collections.w.J(this.pages.get(i5).i())) {
                    i4 -= this.pages.get(i5).i().size();
                    i5++;
                }
                return i4 < 0 ? (b1.b.c) kotlin.collections.w.B2(this.pages) : this.pages.get(i5);
            }
        }
        return null;
    }

    @fg.m
    public final Value e() {
        Object obj;
        List<Value> i4;
        Iterator<T> it = this.pages.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (!((b1.b.c) obj).i().isEmpty()) {
                break;
            }
        }
        b1.b.c cVar = (b1.b.c) obj;
        if (cVar == null || (i4 = cVar.i()) == null) {
            return null;
        }
        return (Value) kotlin.collections.w.G2(i4);
    }

    public boolean equals(@fg.m Object other) {
        if (other instanceof d1) {
            d1 d1Var = (d1) other;
            if (kotlin.jvm.internal.l0.g(this.pages, d1Var.pages) && kotlin.jvm.internal.l0.g(this.anchorPosition, d1Var.anchorPosition) && kotlin.jvm.internal.l0.g(this.config, d1Var.config) && this.leadingPlaceholderCount == d1Var.leadingPlaceholderCount) {
                return true;
            }
        }
        return false;
    }

    @fg.m
    /* renamed from: f, reason: from getter */
    public final Integer getAnchorPosition() {
        return this.anchorPosition;
    }

    @fg.l
    /* renamed from: g, reason: from getter */
    public final x0 getConfig() {
        return this.config;
    }

    @fg.l
    public final List<b1.b.c<Key, Value>> h() {
        return this.pages;
    }

    public int hashCode() {
        int hashCode = this.pages.hashCode();
        Integer num = this.anchorPosition;
        return Integer.hashCode(this.leadingPlaceholderCount) + this.config.hashCode() + hashCode + (num != null ? num.hashCode() : 0);
    }

    public final boolean i() {
        List<b1.b.c<Key, Value>> list = this.pages;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (!((b1.b.c) it.next()).i().isEmpty()) {
                return false;
            }
        }
        return true;
    }

    @fg.m
    public final Value j() {
        b1.b.c<Key, Value> cVar;
        List<Value> i4;
        List<b1.b.c<Key, Value>> list = this.pages;
        ListIterator<b1.b.c<Key, Value>> listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                cVar = null;
                break;
            }
            cVar = listIterator.previous();
            if (!cVar.i().isEmpty()) {
                break;
            }
        }
        b1.b.c<Key, Value> cVar2 = cVar;
        if (cVar2 == null || (i4 = cVar2.i()) == null) {
            return null;
        }
        return (Value) kotlin.collections.w.v3(i4);
    }

    @fg.l
    public String toString() {
        StringBuilder sb = new StringBuilder("PagingState(pages=");
        sb.append(this.pages);
        sb.append(", anchorPosition=");
        sb.append(this.anchorPosition);
        sb.append(", config=");
        sb.append(this.config);
        sb.append(", leadingPlaceholderCount=");
        return androidx.view.e.a(sb, this.leadingPlaceholderCount, ')');
    }
}
