package com.google.common.collect;

import java.util.Map;
import java.util.SortedMap;
import java.util.SortedSet;

/* compiled from: RowSortedTable.java */
@w0
@d9.b
/* loaded from: classes6.dex */
public interface a6<R, C, V> extends s6<R, C, V> {
    @Override // com.google.common.collect.s6
    SortedSet<R> i();

    @Override // com.google.common.collect.s6
    SortedMap<R, Map<C, V>> m();
}
