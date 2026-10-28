package com.github.mikephil.charting.utils;

import com.github.mikephil.charting.data.Entry;
import java.util.Comparator;

/* compiled from: EntryXComparator.java */
/* loaded from: classes5.dex */
public class b implements Comparator<Entry> {
    @Override // java.util.Comparator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(Entry entry, Entry entry2) {
        float j4 = entry.j() - entry2.j();
        if (j4 == 0.0f) {
            return 0;
        }
        return j4 > 0.0f ? 1 : -1;
    }
}
