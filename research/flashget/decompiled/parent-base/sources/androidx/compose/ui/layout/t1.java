package androidx.compose.ui.layout;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.function.Predicate;
import kotlin.Metadata;

/* compiled from: SubcomposeLayout.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0001\u0005J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\n\u001a\u00020\t2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00012\b\u0010\b\u001a\u0004\u0018\u00010\u0001H&¢\u0006\u0004\b\n\u0010\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Landroidx/compose/ui/layout/t1;", "", "Landroidx/compose/ui/layout/t1$a;", "slotIds", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/layout/t1$a;)V", "slotId", "reusableSlotId", "", "b", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface t1 {

    /* compiled from: SubcomposeLayout.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0010\u0000\n\u0002\u0010#\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010)\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u001b\b\u0000\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0096\u0003¢\u0006\u0004\b\t\u0010\nJ \u0010\f\u001a\u00020\b2\u000e\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001H\u0096\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\bH\u0096\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0011\u001a\u00020\b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u0011\u0010\nJ\u0018\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0012H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0015\u0010\nJ\u001d\u0010\u0017\u001a\u00020\b2\u000e\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001¢\u0006\u0004\b\u0017\u0010\rJ#\u0010\u001a\u001a\u00020\b2\u0014\u0010\u0019\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\b0\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010\u001c\u001a\u00020\b2\u000e\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001¢\u0006\u0004\b\u001c\u0010\rJ#\u0010\u001d\u001a\u00020\b2\u0014\u0010\u0019\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\b0\u0018¢\u0006\u0004\b\u001d\u0010\u001bJ\r\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b\u001f\u0010 R\u001c\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010!R\u0014\u0010%\u001a\u00020\"8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006&"}, d2 = {"Landroidx/compose/ui/layout/t1$a;", "", "", "", "set", "<init>", "(Ljava/util/Set;)V", "element", "", "contains", "(Ljava/lang/Object;)Z", "elements", "containsAll", "(Ljava/util/Collection;)Z", "isEmpty", "()Z", "slotId", "b", "", "iterator", "()Ljava/util/Iterator;", "remove", "slotIds", "removeAll", "Lkotlin/Function1;", "predicate", "f", "(Lld/l;)Z", "retainAll", "h", "Lkotlin/k2;", "clear", "()V", "Ljava/util/Set;", "", "c", "()I", "size", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @androidx.compose.runtime.internal.u(parameters = 0)
    public static final class a implements Collection<Object>, md.a {

        /* renamed from: c, reason: collision with root package name */
        public static final int f19108c = 8;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final Set<Object> set;

        /* JADX WARN: Multi-variable type inference failed */
        public a() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // java.util.Collection
        public boolean add(Object obj) {
            return this.set.add(obj);
        }

        @Override // java.util.Collection
        public boolean addAll(Collection<? extends Object> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final boolean b(@fg.m Object slotId) {
            return this.set.add(slotId);
        }

        public int c() {
            return this.set.size();
        }

        @Override // java.util.Collection
        public final void clear() {
            this.set.clear();
        }

        @Override // java.util.Collection
        public boolean contains(@fg.m Object element) {
            return this.set.contains(element);
        }

        @Override // java.util.Collection
        public boolean containsAll(@fg.l Collection<? extends Object> elements) {
            return this.set.containsAll(elements);
        }

        public final boolean f(@fg.l ld.l<Object, Boolean> predicate) {
            return kotlin.collections.w.G0(this.set, predicate);
        }

        public final boolean h(@fg.l ld.l<Object, Boolean> predicate) {
            return kotlin.collections.w.Q0(this.set, predicate);
        }

        @Override // java.util.Collection
        public boolean isEmpty() {
            return this.set.isEmpty();
        }

        @Override // java.util.Collection, java.lang.Iterable
        @fg.l
        public Iterator<Object> iterator() {
            return this.set.iterator();
        }

        @Override // java.util.Collection
        public final boolean remove(@fg.m Object slotId) {
            return this.set.remove(slotId);
        }

        @Override // java.util.Collection
        public final boolean removeAll(@fg.l Collection<? extends Object> slotIds) {
            return this.set.remove(slotIds);
        }

        @Override // java.util.Collection
        public boolean removeIf(Predicate<? super Object> predicate) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Collection
        public final boolean retainAll(@fg.l Collection<? extends Object> slotIds) {
            return this.set.retainAll(slotIds);
        }

        @Override // java.util.Collection
        public final int size() {
            return this.set.size();
        }

        @Override // java.util.Collection
        public Object[] toArray() {
            return kotlin.jvm.internal.v.a(this);
        }

        public a(@fg.l Set<Object> set) {
            this.set = set;
        }

        @Override // java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) kotlin.jvm.internal.v.b(this, tArr);
        }

        public /* synthetic */ a(Set set, int i4, kotlin.jvm.internal.w wVar) {
            this((i4 & 1) != 0 ? new LinkedHashSet() : set);
        }
    }

    void a(@fg.l a slotIds);

    boolean b(@fg.m Object slotId, @fg.m Object reusableSlotId);
}
