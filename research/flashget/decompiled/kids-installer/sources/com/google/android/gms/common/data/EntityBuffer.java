package com.google.android.gms.common.data;

import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
@KeepForSdk
/* loaded from: classes4.dex */
public abstract class EntityBuffer<T> extends AbstractDataBuffer<T> {
    private boolean zaa;
    private ArrayList<Integer> zab;

    @KeepForSdk
    protected EntityBuffer(@o0 DataHolder dataHolder) {
        super(dataHolder);
        this.zaa = false;
    }

    private final void zab() {
        synchronized (this) {
            if (!this.zaa) {
                int count = ((DataHolder) Preconditions.checkNotNull(this.mDataHolder)).getCount();
                ArrayList<Integer> arrayList = new ArrayList<>();
                this.zab = arrayList;
                if (count > 0) {
                    arrayList.add(0);
                    String primaryDataMarkerColumn = getPrimaryDataMarkerColumn();
                    String string = this.mDataHolder.getString(primaryDataMarkerColumn, 0, this.mDataHolder.getWindowIndex(0));
                    for (int i5 = 1; i5 < count; i5++) {
                        int windowIndex = this.mDataHolder.getWindowIndex(i5);
                        String string2 = this.mDataHolder.getString(primaryDataMarkerColumn, i5, windowIndex);
                        if (string2 == null) {
                            StringBuilder sb = new StringBuilder(String.valueOf(primaryDataMarkerColumn).length() + 78);
                            sb.append(ProtectedSandApp.s("ⵧ"));
                            sb.append(primaryDataMarkerColumn);
                            sb.append(ProtectedSandApp.s("\u2d68"));
                            sb.append(i5);
                            sb.append(ProtectedSandApp.s("\u2d69"));
                            sb.append(windowIndex);
                            throw new NullPointerException(sb.toString());
                        }
                        if (!string2.equals(string)) {
                            this.zab.add(Integer.valueOf(i5));
                            string = string2;
                        }
                    }
                }
                this.zaa = true;
            }
        }
    }

    @Override // com.google.android.gms.common.data.AbstractDataBuffer, com.google.android.gms.common.data.DataBuffer
    @o0
    @KeepForSdk
    public final T get(int i5) {
        int intValue;
        int intValue2;
        zab();
        int zaa = zaa(i5);
        int i6 = 0;
        if (i5 >= 0 && i5 != this.zab.size()) {
            if (i5 == this.zab.size() - 1) {
                intValue = ((DataHolder) Preconditions.checkNotNull(this.mDataHolder)).getCount();
                intValue2 = this.zab.get(i5).intValue();
            } else {
                intValue = this.zab.get(i5 + 1).intValue();
                intValue2 = this.zab.get(i5).intValue();
            }
            int i7 = intValue - intValue2;
            if (i7 == 1) {
                int zaa2 = zaa(i5);
                int windowIndex = ((DataHolder) Preconditions.checkNotNull(this.mDataHolder)).getWindowIndex(zaa2);
                String childDataMarkerColumn = getChildDataMarkerColumn();
                if (childDataMarkerColumn == null || this.mDataHolder.getString(childDataMarkerColumn, zaa2, windowIndex) != null) {
                    i6 = 1;
                }
            } else {
                i6 = i7;
            }
        }
        return getEntry(zaa, i6);
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
    protected abstract T getEntry(int i5, int i6);

    @o0
    @KeepForSdk
    protected abstract String getPrimaryDataMarkerColumn();

    final int zaa(int i5) {
        if (i5 >= 0 && i5 < this.zab.size()) {
            return this.zab.get(i5).intValue();
        }
        StringBuilder sb = new StringBuilder(53);
        sb.append(ProtectedSandApp.s("\u2d6a"));
        sb.append(i5);
        sb.append(ProtectedSandApp.s("\u2d6b"));
        throw new IllegalArgumentException(sb.toString());
    }
}
