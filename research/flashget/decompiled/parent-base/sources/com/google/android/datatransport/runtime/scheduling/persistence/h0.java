package com.google.android.datatransport.runtime.scheduling.persistence;

import android.database.Cursor;
import com.google.android.datatransport.runtime.scheduling.persistence.n0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class h0 implements n0.b {
    @Override // com.google.android.datatransport.runtime.scheduling.persistence.n0.b
    public final Object apply(Object obj) {
        return Boolean.valueOf(((Cursor) obj).moveToNext());
    }
}
