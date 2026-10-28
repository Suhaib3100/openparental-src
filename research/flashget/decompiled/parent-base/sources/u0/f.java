package u0;

import androidx.compose.runtime.m1;
import androidx.compose.ui.graphics.l6;
import fg.l;
import fg.m;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.v;
import kotlin.jvm.internal.w;

/* compiled from: LocaleList.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0007\u0018\u0000 +2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001,B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\tB\u001d\b\u0016\u0012\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\n\"\u00020\u0002¢\u0006\u0004\b\u0005\u0010\fJ\u0018\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0086\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0016\u001a\u00020\u00122\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u001aH\u0096\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u00122\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0096\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\rH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0007H\u0016¢\u0006\u0004\b#\u0010$R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00038\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001a\u0010*\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010)\u001a\u0004\b\u000e\u0010\"¨\u0006-"}, d2 = {"Lu0/f;", "", "Lu0/e;", "", "localeList", "<init>", "(Ljava/util/List;)V", "", "languageTags", "(Ljava/lang/String;)V", "", "locales", "([Lu0/e;)V", "", "i", "f", "(I)Lu0/e;", "element", "", "c", "(Lu0/e;)Z", "elements", "containsAll", "(Ljava/util/Collection;)Z", "isEmpty", "()Z", "", "iterator", "()Ljava/util/Iterator;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "b", "Ljava/util/List;", "h", "()Ljava/util/List;", "I", "size", "d", "a", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@m1
@r1({"SMAP\nLocaleList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocaleList.kt\nandroidx/compose/ui/text/intl/LocaleList\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,84:1\n151#2,3:85\n33#2,4:88\n154#2,2:92\n38#2:94\n156#2:95\n33#2,4:96\n154#2,2:100\n38#2:102\n156#2:103\n*S KotlinDebug\n*F\n+ 1 LocaleList.kt\nandroidx/compose/ui/text/intl/LocaleList\n*L\n48#1:85,3\n48#1:88,4\n48#1:92,2\n48#1:94\n48#1:95\n48#1:96,4\n48#1:100,2\n48#1:102\n48#1:103\n*E\n"})
/* loaded from: classes.dex */
public final class f implements Collection<e>, md.a {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: e, reason: collision with root package name */
    public static final int f92731e = 0;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    private final List<e> localeList;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int size;

    /* compiled from: LocaleList.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0007\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lu0/f$a;", "", "<init>", "()V", "Lu0/f;", "a", "()Lu0/f;", "current", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: u0.f$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @l
        public final f a() {
            return i.a().b();
        }

        public Companion(w wVar) {
        }
    }

    public f(@l List<e> list) {
        this.localeList = list;
        this.size = list.size();
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(e eVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends e> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean b(e eVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean c(@l e element) {
        return this.localeList.contains(element);
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        return this.localeList.contains((e) obj);
    }

    @Override // java.util.Collection
    public boolean containsAll(@l Collection<? extends Object> elements) {
        return this.localeList.containsAll(elements);
    }

    @Override // java.util.Collection
    public boolean equals(@m Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof f) && l0.g(this.localeList, ((f) other).localeList);
    }

    @l
    public final e f(int i4) {
        return this.localeList.get(i4);
    }

    @l
    public final List<e> h() {
        return this.localeList;
    }

    @Override // java.util.Collection
    public int hashCode() {
        return this.localeList.hashCode();
    }

    /* renamed from: i, reason: from getter */
    public int getSize() {
        return this.size;
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return this.localeList.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    @l
    public Iterator<e> iterator() {
        return this.localeList.iterator();
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeIf(Predicate<? super e> predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final int size() {
        return this.size;
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return v.a(this);
    }

    @l
    public String toString() {
        return l6.a(new StringBuilder("LocaleList(localeList="), this.localeList, ')');
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) v.b(this, tArr);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public f(@fg.l java.lang.String r8) {
        /*
            r7 = this;
            java.lang.String r0 = ","
            java.lang.String[] r2 = new java.lang.String[]{r0}
            r5 = 6
            r6 = 0
            r3 = 0
            r4 = 0
            r1 = r8
            java.util.List r8 = kotlin.text.v.R4(r1, r2, r3, r4, r5, r6)
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r8.size()
            r0.<init>(r1)
            int r1 = r8.size()
            r2 = 0
            r3 = r2
        L1e:
            if (r3 >= r1) goto L34
            java.lang.Object r4 = r8.get(r3)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.CharSequence r4 = kotlin.text.v.C5(r4)
            java.lang.String r4 = r4.toString()
            r0.add(r4)
            int r3 = r3 + 1
            goto L1e
        L34:
            java.util.ArrayList r8 = new java.util.ArrayList
            int r1 = r0.size()
            r8.<init>(r1)
            int r1 = r0.size()
        L41:
            if (r2 >= r1) goto L54
            java.lang.Object r3 = r0.get(r2)
            java.lang.String r3 = (java.lang.String) r3
            u0.e r4 = new u0.e
            r4.<init>(r3)
            r8.add(r4)
            int r2 = r2 + 1
            goto L41
        L54:
            r7.<init>(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: u0.f.<init>(java.lang.String):void");
    }

    public f(@l e... eVarArr) {
        this((List<e>) kotlin.collections.l.Ky(eVarArr));
    }
}
