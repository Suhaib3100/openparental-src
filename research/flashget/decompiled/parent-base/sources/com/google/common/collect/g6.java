package com.google.common.collect;

import java.util.Comparator;
import java.util.Iterator;

/* compiled from: SortedIterable.java */
@w0
@d9.b
/* loaded from: classes6.dex */
interface g6<T> extends Iterable<T> {
    Comparator<? super T> comparator();

    @Override // com.google.common.collect.u4, com.google.common.collect.k6, com.google.common.collect.g6
    Iterator<T> iterator();
}
