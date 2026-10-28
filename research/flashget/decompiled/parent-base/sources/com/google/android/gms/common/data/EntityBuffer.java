package com.google.android.gms.common.data;

import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.collection.r2;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
@KeepForSdk
/* loaded from: classes5.dex */
public abstract class EntityBuffer<T> extends AbstractDataBuffer<T> {
    private boolean zaa;
    private ArrayList zab;

    @KeepForSdk
    protected EntityBuffer(@o0 DataHolder dataHolder) {
        super(dataHolder);
        this.zaa = false;
    }

    private final void zab() {
        synchronized (this) {
            try {
                if (!this.zaa) {
                    int count = ((DataHolder) Preconditions.checkNotNull(this.mDataHolder)).getCount();
                    ArrayList arrayList = new ArrayList();
                    this.zab = arrayList;
                    if (count > 0) {
                        arrayList.add(0);
                        String primaryDataMarkerColumn = getPrimaryDataMarkerColumn();
                        String string = this.mDataHolder.getString(primaryDataMarkerColumn, 0, this.mDataHolder.getWindowIndex(0));
                        for (int i4 = 1; i4 < count; i4++) {
                            int windowIndex = this.mDataHolder.getWindowIndex(i4);
                            String string2 = this.mDataHolder.getString(primaryDataMarkerColumn, i4, windowIndex);
                            if (string2 == null) {
                                throw new NullPointerException(ProtectedSandApp.s("쪣") + primaryDataMarkerColumn + ProtectedSandApp.s("쪤") + i4 + ProtectedSandApp.s("쪥") + windowIndex);
                            }
                            if (!string2.equals(string)) {
                                this.zab.add(Integer.valueOf(i4));
                                string = string2;
                            }
                        }
                    }
                    this.zaa = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.common.data.AbstractDataBuffer, com.google.android.gms.common.data.DataBuffer
    @ResultIgnorabilityUnspecified
    @o0
    @KeepForSdk
    public final T get(int i4) {
        int intValue;
        int intValue2;
        zab();
        int zaa = zaa(i4);
        int i5 = 0;
        if (i4 >= 0 && i4 != this.zab.size()) {
            if (i4 == this.zab.size() - 1) {
                intValue = ((DataHolder) Preconditions.checkNotNull(this.mDataHolder)).getCount();
                intValue2 = ((Integer) this.zab.get(i4)).intValue();
            } else {
                intValue = ((Integer) this.zab.get(i4 + 1)).intValue();
                intValue2 = ((Integer) this.zab.get(i4)).intValue();
            }
            int i6 = intValue - intValue2;
            if (i6 == 1) {
                int zaa2 = zaa(i4);
                int windowIndex = ((DataHolder) Preconditions.checkNotNull(this.mDataHolder)).getWindowIndex(zaa2);
                String childDataMarkerColumn = getChildDataMarkerColumn();
                if (childDataMarkerColumn == null || this.mDataHolder.getString(childDataMarkerColumn, zaa2, windowIndex) != null) {
                    i5 = 1;
                }
            } else {
                i5 = i6;
            }
        }
        return getEntry(zaa, i5);
    }

    @q0
    @KeepForSdk
    protected String getChildDataMarkerColumn() {
        return null;
    }

    @Override // com.google.android.gms.common.data.AbstractDataBuffer, com.google.android.gms.common.data.DataBuffer
    @KeepForSdk
    public int getCount() {
        zab();
        return this.zab.size();
    }

    @o0
    @KeepForSdk
    protected abstract T getEntry(int i4, int i5);

    @o0
    @KeepForSdk
    protected abstract String getPrimaryDataMarkerColumn();

    final int zaa(int i4) {
        if (i4 < 0 || i4 >= this.zab.size()) {
            throw new IllegalArgumentException(r2.a(ProtectedSandApp.s("쪦"), i4, ProtectedSandApp.s("쪧")));
        }
        return ((Integer) this.zab.get(i4)).intValue();
    }
}
