package com.google.common.collect;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.SortedSet;

/* compiled from: ForwardingSortedSet.java */
@w0
@d9.b
/* loaded from: classes6.dex */
public abstract class n2<E> extends j2<E> implements SortedSet<E> {
    protected n2() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.q1
    @d9.a
    protected boolean F3(@zc.a Object obj) {
        try {
            return l2.T3(comparator(), tailSet(obj).first(), obj) == 0;
        } catch (ClassCastException | NullPointerException | NoSuchElementException unused) {
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.q1
    @d9.a
    protected boolean N3(@zc.a Object obj) {
        try {
            Iterator<E> it = tailSet(obj).iterator();
            if (it.hasNext()) {
                if (l2.T3(comparator(), it.next(), obj) == 0) {
                    it.remove();
                    return true;
                }
            }
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.j2, com.google.common.collect.q1
    /* renamed from: W3 */
    public abstract SortedSet<E> u3();

    @d9.a
    protected SortedSet<E> X3(@f5 E e4, @f5 E e5) {
        return tailSet(e4).headSet(e5);
    }

    @zc.a
    public Comparator<? super E> comparator() {
        return u3().comparator();
    }

    @f5
    public E first() {
        return u3().first();
    }

    public SortedSet<E> headSet(@f5 E e4) {
        return u3().headSet(e4);
    }

    @f5
    public E last() {
        return u3().last();
    }

    public SortedSet<E> subSet(@f5 E e4, @f5 E e5) {
        return u3().subSet(e4, e5);
    }

    public SortedSet<E> tailSet(@f5 E e4) {
        return u3().tailSet(e4);
    }
}
