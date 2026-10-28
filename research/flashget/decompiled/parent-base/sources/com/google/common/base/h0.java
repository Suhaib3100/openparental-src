package com.google.common.base;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.Serializable;
import java.util.Iterator;

/* compiled from: PairwiseEquivalence.java */
@o
@d9.b(serializable = true)
/* loaded from: classes6.dex */
final class h0<E, T extends E> extends q<Iterable<T>> implements Serializable {

    /* renamed from: c, reason: collision with root package name */
    private static final long f54945c = 1;

    /* renamed from: b, reason: collision with root package name */
    final q<E> f54946b;

    h0(q<E> qVar) {
        qVar.getClass();
        this.f54946b = qVar;
    }

    public boolean equals(@zc.a Object obj) {
        if (obj instanceof h0) {
            return this.f54946b.equals(((h0) obj).f54946b);
        }
        return false;
    }

    public int hashCode() {
        return this.f54946b.hashCode() ^ 1185147655;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.base.q
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public boolean a(Iterable<T> iterable, Iterable<T> iterable2) {
        Iterator<T> it = iterable.iterator();
        Iterator<T> it2 = iterable2.iterator();
        while (it.hasNext() && it2.hasNext()) {
            if (!this.f54946b.d(it.next(), it2.next())) {
                return false;
            }
        }
        return (it.hasNext() || it2.hasNext()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.base.q
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public int b(Iterable<T> iterable) {
        Iterator<T> it = iterable.iterator();
        int i4 = 78721;
        while (it.hasNext()) {
            i4 = (i4 * 24943) + this.f54946b.f(it.next());
        }
        return i4;
    }

    public String toString() {
        String valueOf = String.valueOf(this.f54946b);
        return i.a(valueOf.length() + 11, valueOf, ProtectedSandApp.s("\uf2fa"));
    }
}
