package androidx.collection;

import java.util.Iterator;
import kotlin.Metadata;

/* compiled from: SparseArray.kt */
@Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0006\u001a(\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\n¢\u0006\u0004\b\u0005\u0010\u0006\u001a0\u0010\t\u001a\u00020\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00028\u0000H\u0086\n¢\u0006\u0004\b\t\u0010\n\u001a4\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086\u0002¢\u0006\u0004\b\f\u0010\r\u001a0\u0010\u000f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00028\u0000H\u0086\b¢\u0006\u0004\b\u000f\u0010\u0010\u001a9\u0010\u0012\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a \u0010\u0014\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086\b¢\u0006\u0004\b\u0014\u0010\u0015\u001a/\u0010\u0016\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\u0016\u0010\u0017\u001a[\u0010\u001c\u001a\u00020\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000126\u0010\u001b\u001a2\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u0003\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0018H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u001d\u0010\u001f\u001a\u00020\u001e\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u001f\u0010 \u001a#\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000!\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\"\u0010#\"\"\u0010&\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00018Æ\u0002¢\u0006\u0006\u001a\u0004\b$\u0010%\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006'"}, d2 = {"T", "Landroidx/collection/c3;", "", "key", "", "a", "(Landroidx/collection/c3;I)Z", "value", "Lkotlin/k2;", "j", "(Landroidx/collection/c3;ILjava/lang/Object;)V", "other", "h", "(Landroidx/collection/c3;Landroidx/collection/c3;)Landroidx/collection/c3;", "defaultValue", "c", "(Landroidx/collection/c3;ILjava/lang/Object;)Ljava/lang/Object;", "Lkotlin/Function0;", "d", "(Landroidx/collection/c3;ILld/a;)Ljava/lang/Object;", "f", "(Landroidx/collection/c3;)Z", "i", "(Landroidx/collection/c3;ILjava/lang/Object;)Z", "Lkotlin/Function2;", "Lkotlin/r0;", "name", "action", "b", "(Landroidx/collection/c3;Lld/p;)V", "Lkotlin/collections/u0;", "g", "(Landroidx/collection/c3;)Lkotlin/collections/u0;", "", "k", "(Landroidx/collection/c3;)Ljava/util/Iterator;", "e", "(Landroidx/collection/c3;)I", "size", "collection"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class e3 {

    /* compiled from: SparseArray.kt */
    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\"\u0010\r\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"androidx/collection/e3$a", "Lkotlin/collections/u0;", "", "hasNext", "()Z", "", "c", "()I", "b", "I", "d", "e", "(I)V", "index", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a extends kotlin.collections.u0 {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private int index;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ c3<T> f2217c;

        a(c3<T> c3Var) {
            this.f2217c = c3Var;
        }

        @Override // kotlin.collections.u0
        public int c() {
            c3<T> c3Var = this.f2217c;
            int i4 = this.index;
            this.index = i4 + 1;
            return c3Var.p(i4);
        }

        /* renamed from: d, reason: from getter */
        public final int getIndex() {
            return this.index;
        }

        public final void e(int i4) {
            this.index = i4;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.index < this.f2217c.B();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: SparseArray.kt */
    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0010(\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\"\u0010\r\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"androidx/collection/e3$b", "", "", "hasNext", "()Z", "next", "()Ljava/lang/Object;", "", "b", "I", "()I", "c", "(I)V", "index", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b<T> implements Iterator<T>, md.a {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private int index;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ c3<T> f2219c;

        b(c3<T> c3Var) {
            this.f2219c = c3Var;
        }

        /* renamed from: b, reason: from getter */
        public final int getIndex() {
            return this.index;
        }

        public final void c(int i4) {
            this.index = i4;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.index < this.f2219c.B();
        }

        @Override // java.util.Iterator
        public T next() {
            c3<T> c3Var = this.f2219c;
            int i4 = this.index;
            this.index = i4 + 1;
            return c3Var.C(i4);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public static final <T> boolean a(@fg.l c3<T> c3Var, int i4) {
        kotlin.jvm.internal.l0.p(c3Var, "<this>");
        return c3Var.e(i4);
    }

    public static final <T> void b(@fg.l c3<T> c3Var, @fg.l ld.p<? super Integer, ? super T, kotlin.k2> action) {
        kotlin.jvm.internal.l0.p(c3Var, "<this>");
        kotlin.jvm.internal.l0.p(action, "action");
        int B = c3Var.B();
        for (int i4 = 0; i4 < B; i4++) {
            action.invoke(Integer.valueOf(c3Var.p(i4)), c3Var.C(i4));
        }
    }

    public static final <T> T c(@fg.l c3<T> c3Var, int i4, T t4) {
        kotlin.jvm.internal.l0.p(c3Var, "<this>");
        return c3Var.k(i4, t4);
    }

    public static final <T> T d(@fg.l c3<T> c3Var, int i4, @fg.l ld.a<? extends T> defaultValue) {
        kotlin.jvm.internal.l0.p(c3Var, "<this>");
        kotlin.jvm.internal.l0.p(defaultValue, "defaultValue");
        T i5 = c3Var.i(i4);
        return i5 == null ? defaultValue.invoke() : i5;
    }

    public static final <T> int e(@fg.l c3<T> c3Var) {
        kotlin.jvm.internal.l0.p(c3Var, "<this>");
        return c3Var.B();
    }

    public static final <T> boolean f(@fg.l c3<T> c3Var) {
        kotlin.jvm.internal.l0.p(c3Var, "<this>");
        return !c3Var.o();
    }

    @fg.l
    public static final <T> kotlin.collections.u0 g(@fg.l c3<T> c3Var) {
        kotlin.jvm.internal.l0.p(c3Var, "<this>");
        return new a(c3Var);
    }

    @fg.l
    public static final <T> c3<T> h(@fg.l c3<T> c3Var, @fg.l c3<T> other) {
        kotlin.jvm.internal.l0.p(c3Var, "<this>");
        kotlin.jvm.internal.l0.p(other, "other");
        c3<T> c3Var2 = new c3<>(other.B() + c3Var.B());
        c3Var2.r(c3Var);
        c3Var2.r(other);
        return c3Var2;
    }

    @kotlin.k(level = kotlin.m.HIDDEN, message = "Replaced with member function. Remove extension import!")
    public static final /* synthetic */ boolean i(c3 c3Var, int i4, Object obj) {
        kotlin.jvm.internal.l0.p(c3Var, "<this>");
        return c3Var.u(i4, obj);
    }

    public static final <T> void j(@fg.l c3<T> c3Var, int i4, T t4) {
        kotlin.jvm.internal.l0.p(c3Var, "<this>");
        c3Var.q(i4, t4);
    }

    @fg.l
    public static final <T> Iterator<T> k(@fg.l c3<T> c3Var) {
        kotlin.jvm.internal.l0.p(c3Var, "<this>");
        return new b(c3Var);
    }
}
