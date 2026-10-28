package kotlin.collections.builders;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import fg.m;
import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;

/* compiled from: ListBuilder.kt */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0010\u001e\n\u0002\b\u0016\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0010+\n\u0002\b\u0019\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0000\u0018\u0000 m*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u00042\b\u0012\u0004\u0012\u00028\u00000\u00052\u00060\u0006j\u0002`\u0007:\u0002nbBO\b\u0002\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0000\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0000¢\u0006\u0004\b\u0011\u0010\u0012B\t\b\u0016¢\u0006\u0004\b\u0011\u0010\u0013B\u0011\b\u0016\u0012\u0006\u0010\u0014\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001a\u0010\u0013J\u000f\u0010\u001b\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u0013J\u000f\u0010\u001c\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001c\u0010\u0013J\u0017\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001e\u0010\u0015J\u0017\u0010 \u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020\nH\u0002¢\u0006\u0004\b \u0010\u0015J\u001b\u0010#\u001a\u00020\r2\n\u0010\"\u001a\u0006\u0012\u0002\b\u00030!H\u0002¢\u0006\u0004\b#\u0010$J\u001f\u0010&\u001a\u00020\u00192\u0006\u0010%\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\nH\u0002¢\u0006\u0004\b&\u0010'J\u001f\u0010)\u001a\u00020\u00192\u0006\u0010%\u001a\u00020\n2\u0006\u0010(\u001a\u00028\u0000H\u0002¢\u0006\u0004\b)\u0010*J-\u0010-\u001a\u00020\u00192\u0006\u0010%\u001a\u00020\n2\f\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000+2\u0006\u0010\u001d\u001a\u00020\nH\u0002¢\u0006\u0004\b-\u0010.J\u0017\u0010/\u001a\u00028\u00002\u0006\u0010%\u001a\u00020\nH\u0002¢\u0006\u0004\b/\u00100J\u001f\u00103\u001a\u00020\u00192\u0006\u00101\u001a\u00020\n2\u0006\u00102\u001a\u00020\nH\u0002¢\u0006\u0004\b3\u0010'J5\u00105\u001a\u00020\n2\u0006\u00101\u001a\u00020\n2\u0006\u00102\u001a\u00020\n2\f\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000+2\u0006\u00104\u001a\u00020\rH\u0002¢\u0006\u0004\b5\u00106J\u0013\u00107\u001a\b\u0012\u0004\u0012\u00028\u00000!¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020\rH\u0016¢\u0006\u0004\b9\u0010:J\u0018\u0010<\u001a\u00028\u00002\u0006\u0010;\u001a\u00020\nH\u0096\u0002¢\u0006\u0004\b<\u00100J \u0010=\u001a\u00028\u00002\u0006\u0010;\u001a\u00020\n2\u0006\u0010(\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b=\u0010>J\u0017\u0010?\u001a\u00020\n2\u0006\u0010(\u001a\u00028\u0000H\u0016¢\u0006\u0004\b?\u0010@J\u0017\u0010A\u001a\u00020\n2\u0006\u0010(\u001a\u00028\u0000H\u0016¢\u0006\u0004\bA\u0010@J\u0016\u0010C\u001a\b\u0012\u0004\u0012\u00028\u00000BH\u0096\u0002¢\u0006\u0004\bC\u0010DJ\u0015\u0010F\u001a\b\u0012\u0004\u0012\u00028\u00000EH\u0016¢\u0006\u0004\bF\u0010GJ\u001d\u0010F\u001a\b\u0012\u0004\u0012\u00028\u00000E2\u0006\u0010;\u001a\u00020\nH\u0016¢\u0006\u0004\bF\u0010HJ\u0017\u0010I\u001a\u00020\r2\u0006\u0010(\u001a\u00028\u0000H\u0016¢\u0006\u0004\bI\u0010JJ\u001f\u0010I\u001a\u00020\u00192\u0006\u0010;\u001a\u00020\n2\u0006\u0010(\u001a\u00028\u0000H\u0016¢\u0006\u0004\bI\u0010*J\u001d\u0010K\u001a\u00020\r2\f\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000+H\u0016¢\u0006\u0004\bK\u0010LJ%\u0010K\u001a\u00020\r2\u0006\u0010;\u001a\u00020\n2\f\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000+H\u0016¢\u0006\u0004\bK\u0010MJ\u000f\u0010N\u001a\u00020\u0019H\u0016¢\u0006\u0004\bN\u0010\u0013J\u0017\u0010O\u001a\u00028\u00002\u0006\u0010;\u001a\u00020\nH\u0016¢\u0006\u0004\bO\u00100J\u0017\u0010P\u001a\u00020\r2\u0006\u0010(\u001a\u00028\u0000H\u0016¢\u0006\u0004\bP\u0010JJ\u001d\u0010Q\u001a\u00020\r2\f\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000+H\u0016¢\u0006\u0004\bQ\u0010LJ\u001d\u0010R\u001a\u00020\r2\f\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000+H\u0016¢\u0006\u0004\bR\u0010LJ%\u0010U\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010S\u001a\u00020\n2\u0006\u0010T\u001a\u00020\nH\u0016¢\u0006\u0004\bU\u0010VJ)\u0010Y\u001a\b\u0012\u0004\u0012\u00028\u00010\b\"\u0004\b\u0001\u0010W2\f\u0010X\u001a\b\u0012\u0004\u0012\u00028\u00010\bH\u0016¢\u0006\u0004\bY\u0010ZJ\u0017\u0010Y\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\bH\u0016¢\u0006\u0004\bY\u0010[J\u001a\u0010\\\u001a\u00020\r2\b\u0010\"\u001a\u0004\u0018\u00010\u0016H\u0096\u0002¢\u0006\u0004\b\\\u0010JJ\u000f\u0010]\u001a\u00020\nH\u0016¢\u0006\u0004\b]\u0010^J\u000f\u0010`\u001a\u00020_H\u0016¢\u0006\u0004\b`\u0010aR\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010cR\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010\u0017R\u0016\u0010\f\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010\u0017R\u0016\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010fR\u001c\u0010\u000f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bg\u0010hR\u001c\u0010\u0010\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010hR\u0014\u0010k\u001a\u00020\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bj\u0010:R\u0014\u0010l\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bb\u0010^¨\u0006o"}, d2 = {"Lkotlin/collections/builders/b;", "E", "", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "Lkotlin/collections/f;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "array", "", "offset", "length", "", "isReadOnly", "backing", "root", "<init>", "([Ljava/lang/Object;IIZLkotlin/collections/builders/b;Lkotlin/collections/builders/b;)V", "()V", "initialCapacity", "(I)V", "", "I", "()Ljava/lang/Object;", "Lkotlin/k2;", "D", "q", "r", "n", "w", "minCapacity", "v", "", "other", "s", "(Ljava/util/List;)Z", "i", "x", "(II)V", "element", "m", "(ILjava/lang/Object;)V", "", "elements", "l", "(ILjava/util/Collection;I)V", "F", "(I)Ljava/lang/Object;", "rangeOffset", "rangeLength", "G", "retain", "H", "(IILjava/util/Collection;Z)I", "p", "()Ljava/util/List;", "isEmpty", "()Z", "index", "get", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "lastIndexOf", "", "iterator", "()Ljava/util/Iterator;", "", "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", "add", "(Ljava/lang/Object;)Z", "addAll", "(Ljava/util/Collection;)Z", "(ILjava/util/Collection;)Z", "clear", "c", "remove", "removeAll", "retainAll", "fromIndex", "toIndex", "subList", "(II)Ljava/util/List;", "T", "destination", "toArray", "([Ljava/lang/Object;)[Ljava/lang/Object;", "()[Ljava/lang/Object;", "equals", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "b", "[Ljava/lang/Object;", "d", "e", "Z", "f", "Lkotlin/collections/builders/b;", "g", "A", "isEffectivelyReadOnly", "size", "h", "a", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\nListBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListBuilder.kt\nkotlin/collections/builders/ListBuilder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,487:1\n1#2:488\n*E\n"})
/* loaded from: classes7.dex */
public final class b<E> extends kotlin.collections.f<E> implements List<E>, RandomAccess, Serializable, md.e {

    /* renamed from: h, reason: collision with root package name */
    @l
    private static final a f74834h = new a();

    /* renamed from: i, reason: collision with root package name */
    @l
    private static final b f74835i;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    private E[] array;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int offset;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int length;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private boolean isReadOnly;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @m
    private final b<E> backing;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @m
    private final b<E> root;

    /* compiled from: ListBuilder.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lkotlin/collections/builders/b$a;", "", "<init>", "()V", "Lkotlin/collections/builders/b;", "", "Empty", "Lkotlin/collections/builders/b;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class a {
        private a() {
        }

        public a(w wVar) {
        }
    }

    /* compiled from: ListBuilder.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010+\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u001f\b\u0016\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\fH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0013\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0019\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001a\u0010\u000bR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001bR\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001f\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001dR\u0016\u0010!\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010\u001d¨\u0006\""}, d2 = {"Lkotlin/collections/builders/b$b;", "E", "", "Lkotlin/collections/builders/b;", "list", "", "index", "<init>", "(Lkotlin/collections/builders/b;I)V", "Lkotlin/k2;", "b", "()V", "", "hasPrevious", "()Z", "hasNext", "previousIndex", "()I", "nextIndex", "previous", "()Ljava/lang/Object;", "next", "element", "set", "(Ljava/lang/Object;)V", "add", "remove", "Lkotlin/collections/builders/b;", "c", "I", "d", "lastIndex", "e", "expectedModCount", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @r1({"SMAP\nListBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListBuilder.kt\nkotlin/collections/builders/ListBuilder$Itr\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,487:1\n1#2:488\n*E\n"})
    /* renamed from: kotlin.collections.builders.b$b, reason: collision with other inner class name */
    private static final class C1047b<E> implements ListIterator<E>, md.f {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @l
        private final b<E> list;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private int index;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private int lastIndex;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private int expectedModCount;

        public C1047b(@l b<E> bVar, int i4) {
            l0.p(bVar, ProtectedSandApp.s("惐\u0001"));
            this.list = bVar;
            this.index = i4;
            this.lastIndex = -1;
            this.expectedModCount = ((AbstractList) bVar).modCount;
        }

        private final void b() {
            if (((AbstractList) this.list).modCount != this.expectedModCount) {
                throw new ConcurrentModificationException();
            }
        }

        @Override // java.util.ListIterator
        public void add(E element) {
            b();
            b<E> bVar = this.list;
            int i4 = this.index;
            this.index = i4 + 1;
            bVar.add(i4, element);
            this.lastIndex = -1;
            this.expectedModCount = ((AbstractList) this.list).modCount;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.index < ((b) this.list).length;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.index > 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public E next() {
            b();
            if (this.index >= ((b) this.list).length) {
                throw new NoSuchElementException();
            }
            int i4 = this.index;
            this.index = i4 + 1;
            this.lastIndex = i4;
            return (E) ((b) this.list).array[((b) this.list).offset + this.lastIndex];
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.index;
        }

        @Override // java.util.ListIterator
        public E previous() {
            b();
            int i4 = this.index;
            if (i4 <= 0) {
                throw new NoSuchElementException();
            }
            int i5 = i4 - 1;
            this.index = i5;
            this.lastIndex = i5;
            return (E) ((b) this.list).array[((b) this.list).offset + this.lastIndex];
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.index - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            b();
            int i4 = this.lastIndex;
            if (i4 == -1) {
                throw new IllegalStateException(ProtectedSandApp.s("惑\u0001"));
            }
            this.list.c(i4);
            this.index = this.lastIndex;
            this.lastIndex = -1;
            this.expectedModCount = ((AbstractList) this.list).modCount;
        }

        @Override // java.util.ListIterator
        public void set(E element) {
            b();
            int i4 = this.lastIndex;
            if (i4 == -1) {
                throw new IllegalStateException(ProtectedSandApp.s("惒\u0001"));
            }
            this.list.set(i4, element);
        }
    }

    static {
        b bVar = new b(0);
        bVar.isReadOnly = true;
        f74835i = bVar;
    }

    private b(E[] eArr, int i4, int i5, boolean z4, b<E> bVar, b<E> bVar2) {
        this.array = eArr;
        this.offset = i4;
        this.length = i5;
        this.isReadOnly = z4;
        this.backing = bVar;
        this.root = bVar2;
        if (bVar != null) {
            ((AbstractList) this).modCount = ((AbstractList) bVar).modCount;
        }
    }

    private final boolean A() {
        b<E> bVar;
        return this.isReadOnly || ((bVar = this.root) != null && bVar.isReadOnly);
    }

    private final void D() {
        ((AbstractList) this).modCount++;
    }

    private final E F(int i4) {
        D();
        b<E> bVar = this.backing;
        if (bVar != null) {
            this.length--;
            return bVar.F(i4);
        }
        E[] eArr = this.array;
        E e4 = eArr[i4];
        kotlin.collections.l.B0(eArr, eArr, i4, i4 + 1, this.offset + this.length);
        c.f(this.array, (this.offset + this.length) - 1);
        this.length--;
        return e4;
    }

    private final void G(int rangeOffset, int rangeLength) {
        if (rangeLength > 0) {
            D();
        }
        b<E> bVar = this.backing;
        if (bVar != null) {
            bVar.G(rangeOffset, rangeLength);
        } else {
            E[] eArr = this.array;
            kotlin.collections.l.B0(eArr, eArr, rangeOffset, rangeOffset + rangeLength, this.length);
            E[] eArr2 = this.array;
            int i4 = this.length;
            c.g(eArr2, i4 - rangeLength, i4);
        }
        this.length -= rangeLength;
    }

    private final int H(int rangeOffset, int rangeLength, Collection<? extends E> elements, boolean retain) {
        int i4;
        b<E> bVar = this.backing;
        if (bVar != null) {
            i4 = bVar.H(rangeOffset, rangeLength, elements, retain);
        } else {
            int i5 = 0;
            int i6 = 0;
            while (i5 < rangeLength) {
                int i7 = rangeOffset + i5;
                if (elements.contains(this.array[i7]) == retain) {
                    E[] eArr = this.array;
                    i5++;
                    eArr[i6 + rangeOffset] = eArr[i7];
                    i6++;
                } else {
                    i5++;
                }
            }
            int i10 = rangeLength - i6;
            E[] eArr2 = this.array;
            kotlin.collections.l.B0(eArr2, eArr2, rangeOffset + i6, rangeLength + rangeOffset, this.length);
            E[] eArr3 = this.array;
            int i11 = this.length;
            c.g(eArr3, i11 - i10, i11);
            i4 = i10;
        }
        if (i4 > 0) {
            D();
        }
        this.length -= i4;
        return i4;
    }

    private final Object I() {
        if (A()) {
            return new h(this, 0);
        }
        throw new NotSerializableException(ProtectedSandApp.s("惓\u0001"));
    }

    private final void l(int i4, Collection<? extends E> elements, int n4) {
        D();
        b<E> bVar = this.backing;
        if (bVar != null) {
            bVar.l(i4, elements, n4);
            this.array = this.backing.array;
            this.length += n4;
        } else {
            x(i4, n4);
            Iterator<? extends E> it = elements.iterator();
            for (int i5 = 0; i5 < n4; i5++) {
                this.array[i4 + i5] = it.next();
            }
        }
    }

    private final void m(int i4, E element) {
        D();
        b<E> bVar = this.backing;
        if (bVar == null) {
            x(i4, 1);
            this.array[i4] = element;
        } else {
            bVar.m(i4, element);
            this.array = this.backing.array;
            this.length++;
        }
    }

    private final void q() {
        b<E> bVar = this.root;
        if (bVar != null && ((AbstractList) bVar).modCount != ((AbstractList) this).modCount) {
            throw new ConcurrentModificationException();
        }
    }

    private final void r() {
        if (A()) {
            throw new UnsupportedOperationException();
        }
    }

    private final boolean s(List<?> other) {
        boolean h4;
        h4 = c.h(this.array, this.offset, this.length, other);
        return h4;
    }

    private final void v(int minCapacity) {
        if (minCapacity < 0) {
            throw new OutOfMemoryError();
        }
        E[] eArr = this.array;
        if (minCapacity > eArr.length) {
            this.array = (E[]) c.e(this.array, kotlin.collections.c.INSTANCE.e(eArr.length, minCapacity));
        }
    }

    private final void w(int n4) {
        v(this.length + n4);
    }

    private final void x(int i4, int n4) {
        w(n4);
        E[] eArr = this.array;
        kotlin.collections.l.B0(eArr, eArr, i4 + n4, i4, this.offset + this.length);
        this.length += n4;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E element) {
        r();
        q();
        m(this.offset + this.length, element);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(@l Collection<? extends E> elements) {
        l0.p(elements, ProtectedSandApp.s("惔\u0001"));
        r();
        q();
        int size = elements.size();
        l(this.offset + this.length, elements, size);
        return size > 0;
    }

    @Override // kotlin.collections.f
    /* renamed from: b */
    public int getSize() {
        q();
        return this.length;
    }

    @Override // kotlin.collections.f
    public E c(int index) {
        r();
        q();
        kotlin.collections.c.INSTANCE.b(index, this.length);
        return F(this.offset + index);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        r();
        q();
        G(this.offset, this.length);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(@m Object other) {
        q();
        return other == this || ((other instanceof List) && s((List) other));
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int index) {
        q();
        kotlin.collections.c.INSTANCE.b(index, this.length);
        return this.array[this.offset + index];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i4;
        q();
        i4 = c.i(this.array, this.offset, this.length);
        return i4;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object element) {
        q();
        for (int i4 = 0; i4 < this.length; i4++) {
            if (l0.g(this.array[this.offset + i4], element)) {
                return i4;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        q();
        return this.length == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    @l
    public Iterator<E> iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object element) {
        q();
        for (int i4 = this.length - 1; i4 >= 0; i4--) {
            if (l0.g(this.array[this.offset + i4], element)) {
                return i4;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    @l
    public ListIterator<E> listIterator() {
        return listIterator(0);
    }

    @l
    public final List<E> p() {
        if (this.backing != null) {
            throw new IllegalStateException();
        }
        r();
        this.isReadOnly = true;
        return this.length > 0 ? this : f74835i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object element) {
        r();
        q();
        int indexOf = indexOf(element);
        if (indexOf >= 0) {
            c(indexOf);
        }
        return indexOf >= 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(@l Collection<? extends Object> elements) {
        l0.p(elements, ProtectedSandApp.s("惔\u0001"));
        r();
        q();
        return H(this.offset, this.length, elements, false) > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(@l Collection<? extends Object> elements) {
        l0.p(elements, ProtectedSandApp.s("惔\u0001"));
        r();
        q();
        return H(this.offset, this.length, elements, true) > 0;
    }

    @Override // kotlin.collections.f, java.util.AbstractList, java.util.List
    public E set(int index, E element) {
        r();
        q();
        kotlin.collections.c.INSTANCE.b(index, this.length);
        E[] eArr = this.array;
        int i4 = this.offset;
        E e4 = eArr[i4 + index];
        eArr[i4 + index] = element;
        return e4;
    }

    @Override // java.util.AbstractList, java.util.List
    @l
    public List<E> subList(int fromIndex, int toIndex) {
        kotlin.collections.c.INSTANCE.d(fromIndex, toIndex, this.length);
        E[] eArr = this.array;
        int i4 = this.offset + fromIndex;
        int i5 = toIndex - fromIndex;
        boolean z4 = this.isReadOnly;
        b<E> bVar = this.root;
        return new b(eArr, i4, i5, z4, this, bVar == null ? this : bVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @l
    public <T> T[] toArray(@l T[] destination) {
        l0.p(destination, ProtectedSandApp.s("惕\u0001"));
        q();
        int length = destination.length;
        int i4 = this.length;
        if (length >= i4) {
            E[] eArr = this.array;
            int i5 = this.offset;
            kotlin.collections.l.B0(eArr, destination, 0, i5, i4 + i5);
            return (T[]) kotlin.collections.w.n(this.length, destination);
        }
        E[] eArr2 = this.array;
        int i6 = this.offset;
        T[] tArr = (T[]) Arrays.copyOfRange(eArr2, i6, i4 + i6, destination.getClass());
        l0.o(tArr, ProtectedSandApp.s("惖\u0001"));
        return tArr;
    }

    @Override // java.util.AbstractCollection
    @l
    public String toString() {
        String j4;
        q();
        j4 = c.j(this.array, this.offset, this.length, this);
        return j4;
    }

    @Override // java.util.AbstractList, java.util.List
    @l
    public ListIterator<E> listIterator(int index) {
        q();
        kotlin.collections.c.INSTANCE.c(index, this.length);
        return new C1047b(this, index);
    }

    @Override // kotlin.collections.f, java.util.AbstractList, java.util.List
    public void add(int index, E element) {
        r();
        q();
        kotlin.collections.c.INSTANCE.c(index, this.length);
        m(this.offset + index, element);
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int index, @l Collection<? extends E> elements) {
        l0.p(elements, ProtectedSandApp.s("惔\u0001"));
        r();
        q();
        kotlin.collections.c.INSTANCE.c(index, this.length);
        int size = elements.size();
        l(this.offset + index, elements, size);
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @l
    public Object[] toArray() {
        q();
        E[] eArr = this.array;
        int i4 = this.offset;
        return kotlin.collections.l.l1(eArr, i4, this.length + i4);
    }

    public b() {
        this(10);
    }

    public b(int i4) {
        this(c.d(i4), 0, 0, false, null, null);
    }
}
