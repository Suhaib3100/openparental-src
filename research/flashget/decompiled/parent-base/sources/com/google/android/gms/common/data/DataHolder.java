package com.google.android.gms.common.data;

import android.content.ContentValues;
import android.database.CharArrayBuffer;
import android.database.CursorIndexOutOfBoundsException;
import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import f9.a;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
@KeepForSdk
@KeepName
@SafeParcelable.Class(creator = "DataHolderCreator", validate = true)
/* loaded from: classes5.dex */
public final class DataHolder extends AbstractSafeParcelable implements Closeable {

    @o0
    @KeepForSdk
    public static final Parcelable.Creator<DataHolder> CREATOR = new zaf();
    private static final Builder zaf = new zab(new String[0], null);

    @SafeParcelable.VersionField(id = 1000)
    final int zaa;
    Bundle zab;
    int[] zac;
    int zad;
    boolean zae;

    @SafeParcelable.Field(getter = "getColumns", id = 1)
    private final String[] zag;

    @SafeParcelable.Field(getter = "getWindows", id = 2)
    private final CursorWindow[] zah;

    @SafeParcelable.Field(getter = "getStatusCode", id = 3)
    private final int zai;

    @q0
    @SafeParcelable.Field(getter = "getMetadata", id = 4)
    private final Bundle zaj;
    private boolean zak;

    /* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
    @KeepForSdk
    public static class Builder {
        private final String[] zaa;
        private final ArrayList zab = new ArrayList();
        private final HashMap zac = new HashMap();

        /* synthetic */ Builder(String[] strArr, String str, zac zacVar) {
            this.zaa = (String[]) Preconditions.checkNotNull(strArr);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @o0
        @KeepForSdk
        public DataHolder build(int i4) {
            return new DataHolder(this, i4);
        }

        @o0
        @KeepForSdk
        @a
        public Builder withRow(@o0 ContentValues contentValues) {
            Asserts.checkNotNull(contentValues);
            HashMap hashMap = new HashMap(contentValues.size());
            for (Map.Entry<String, Object> entry : contentValues.valueSet()) {
                hashMap.put(entry.getKey(), entry.getValue());
            }
            return zaa(hashMap);
        }

        @o0
        @a
        public Builder zaa(@o0 HashMap hashMap) {
            Asserts.checkNotNull(hashMap);
            this.zab.add(hashMap);
            return this;
        }

        @o0
        @KeepForSdk
        public DataHolder build(int i4, @o0 Bundle bundle) {
            return new DataHolder(this, i4, bundle);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @o0
    @KeepForSdk
    public static Builder builder(@o0 String[] strArr) {
        return new Builder(strArr, null, 0 == true ? 1 : 0);
    }

    @o0
    @KeepForSdk
    public static DataHolder empty(int i4) {
        return new DataHolder(zaf, i4, (Bundle) null);
    }

    private final void zae(String str, int i4) {
        Bundle bundle = this.zab;
        if (bundle == null || !bundle.containsKey(str)) {
            throw new IllegalArgumentException(ProtectedSandApp.s("쪟").concat(String.valueOf(str)));
        }
        if (isClosed()) {
            throw new IllegalArgumentException(ProtectedSandApp.s("쪞"));
        }
        if (i4 < 0 || i4 >= this.zad) {
            throw new CursorIndexOutOfBoundsException(i4, this.zad);
        }
    }

    private static CursorWindow[] zaf(Builder builder, int i4) {
        if (builder.zaa.length == 0) {
            return new CursorWindow[0];
        }
        ArrayList arrayList = builder.zab;
        int size = arrayList.size();
        CursorWindow cursorWindow = new CursorWindow(false);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(cursorWindow);
        cursorWindow.setNumColumns(builder.zaa.length);
        int i5 = 0;
        boolean z4 = false;
        while (i5 < size) {
            try {
                if (!cursorWindow.allocRow()) {
                    cursorWindow = new CursorWindow(false);
                    cursorWindow.setStartPosition(i5);
                    cursorWindow.setNumColumns(builder.zaa.length);
                    arrayList2.add(cursorWindow);
                    if (!cursorWindow.allocRow()) {
                        arrayList2.remove(cursorWindow);
                        return (CursorWindow[]) arrayList2.toArray(new CursorWindow[arrayList2.size()]);
                    }
                }
                Map map = (Map) arrayList.get(i5);
                int i6 = 0;
                boolean z5 = true;
                while (true) {
                    if (i6 < builder.zaa.length) {
                        if (!z5) {
                            break;
                        }
                        String str = builder.zaa[i6];
                        Object obj = map.get(str);
                        if (obj == null) {
                            z5 = cursorWindow.putNull(i5, i6);
                        } else if (obj instanceof String) {
                            z5 = cursorWindow.putString((String) obj, i5, i6);
                        } else if (obj instanceof Long) {
                            z5 = cursorWindow.putLong(((Long) obj).longValue(), i5, i6);
                        } else if (obj instanceof Integer) {
                            z5 = cursorWindow.putLong(((Integer) obj).intValue(), i5, i6);
                        } else if (obj instanceof Boolean) {
                            z5 = cursorWindow.putLong(true != ((Boolean) obj).booleanValue() ? 0L : 1L, i5, i6);
                        } else if (obj instanceof byte[]) {
                            z5 = cursorWindow.putBlob((byte[]) obj, i5, i6);
                        } else if (obj instanceof Double) {
                            z5 = cursorWindow.putDouble(((Double) obj).doubleValue(), i5, i6);
                        } else {
                            if (!(obj instanceof Float)) {
                                throw new IllegalArgumentException(ProtectedSandApp.s("쪠") + str + ProtectedSandApp.s("쪡") + obj.toString());
                            }
                            z5 = cursorWindow.putDouble(((Float) obj).floatValue(), i5, i6);
                        }
                        i6++;
                    } else if (z5) {
                        z4 = false;
                    }
                }
                if (z4) {
                    throw new zad(ProtectedSandApp.s("쪢"));
                }
                cursorWindow.freeLastRow();
                cursorWindow = new CursorWindow(false);
                cursorWindow.setStartPosition(i5);
                cursorWindow.setNumColumns(builder.zaa.length);
                arrayList2.add(cursorWindow);
                i5--;
                z4 = true;
                i5++;
            } catch (RuntimeException e4) {
                int size2 = arrayList2.size();
                for (int i7 = 0; i7 < size2; i7++) {
                    ((CursorWindow) arrayList2.get(i7)).close();
                }
                throw e4;
            }
        }
        return (CursorWindow[]) arrayList2.toArray(new CursorWindow[arrayList2.size()]);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    @KeepForSdk
    public void close() {
        synchronized (this) {
            try {
                if (!this.zae) {
                    this.zae = true;
                    int i4 = 0;
                    while (true) {
                        CursorWindow[] cursorWindowArr = this.zah;
                        if (i4 >= cursorWindowArr.length) {
                            break;
                        }
                        cursorWindowArr[i4].close();
                        i4++;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    protected final void finalize() throws Throwable {
        try {
            if (this.zak && this.zah.length > 0 && !isClosed()) {
                close();
            }
        } finally {
            super.finalize();
        }
    }

    @KeepForSdk
    public boolean getBoolean(@o0 String str, int i4, int i5) {
        zae(str, i4);
        return this.zah[i5].getLong(i4, this.zab.getInt(str)) == 1;
    }

    @o0
    @KeepForSdk
    public byte[] getByteArray(@o0 String str, int i4, int i5) {
        zae(str, i4);
        return this.zah[i5].getBlob(i4, this.zab.getInt(str));
    }

    @KeepForSdk
    public int getCount() {
        return this.zad;
    }

    @KeepForSdk
    public int getInteger(@o0 String str, int i4, int i5) {
        zae(str, i4);
        return this.zah[i5].getInt(i4, this.zab.getInt(str));
    }

    @KeepForSdk
    public long getLong(@o0 String str, int i4, int i5) {
        zae(str, i4);
        return this.zah[i5].getLong(i4, this.zab.getInt(str));
    }

    @q0
    @KeepForSdk
    public Bundle getMetadata() {
        return this.zaj;
    }

    @KeepForSdk
    public int getStatusCode() {
        return this.zai;
    }

    @o0
    @KeepForSdk
    public String getString(@o0 String str, int i4, int i5) {
        zae(str, i4);
        return this.zah[i5].getString(i4, this.zab.getInt(str));
    }

    @KeepForSdk
    public int getWindowIndex(int i4) {
        int length;
        int i5 = 0;
        Preconditions.checkState(i4 >= 0 && i4 < this.zad);
        while (true) {
            int[] iArr = this.zac;
            length = iArr.length;
            if (i5 >= length) {
                break;
            }
            if (i4 < iArr[i5]) {
                i5--;
                break;
            }
            i5++;
        }
        return i5 == length ? i5 - 1 : i5;
    }

    @KeepForSdk
    public boolean hasColumn(@o0 String str) {
        return this.zab.containsKey(str);
    }

    @KeepForSdk
    public boolean hasNull(@o0 String str, int i4, int i5) {
        zae(str, i4);
        return this.zah[i5].isNull(i4, this.zab.getInt(str));
    }

    @KeepForSdk
    public boolean isClosed() {
        boolean z4;
        synchronized (this) {
            z4 = this.zae;
        }
        return z4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@o0 Parcel parcel, int i4) {
        String[] strArr = this.zag;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeStringArray(parcel, 1, strArr, false);
        SafeParcelWriter.writeTypedArray(parcel, 2, this.zah, i4, false);
        SafeParcelWriter.writeInt(parcel, 3, getStatusCode());
        SafeParcelWriter.writeBundle(parcel, 4, getMetadata(), false);
        SafeParcelWriter.writeInt(parcel, 1000, this.zaa);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
        if ((i4 & 1) != 0) {
            close();
        }
    }

    public final double zaa(@o0 String str, int i4, int i5) {
        zae(str, i4);
        return this.zah[i5].getDouble(i4, this.zab.getInt(str));
    }

    public final float zab(@o0 String str, int i4, int i5) {
        zae(str, i4);
        return this.zah[i5].getFloat(i4, this.zab.getInt(str));
    }

    public final void zac(@o0 String str, int i4, int i5, @o0 CharArrayBuffer charArrayBuffer) {
        zae(str, i4);
        this.zah[i5].copyStringToBuffer(i4, this.zab.getInt(str), charArrayBuffer);
    }

    public final void zad() {
        this.zab = new Bundle();
        int i4 = 0;
        int i5 = 0;
        while (true) {
            String[] strArr = this.zag;
            if (i5 >= strArr.length) {
                break;
            }
            this.zab.putInt(strArr[i5], i5);
            i5++;
        }
        this.zac = new int[this.zah.length];
        int i6 = 0;
        while (true) {
            CursorWindow[] cursorWindowArr = this.zah;
            if (i4 >= cursorWindowArr.length) {
                this.zad = i6;
                return;
            }
            this.zac[i4] = i6;
            i6 += this.zah[i4].getNumRows() - (i6 - cursorWindowArr[i4].getStartPosition());
            i4++;
        }
    }

    @SafeParcelable.Constructor
    DataHolder(@SafeParcelable.Param(id = 1000) int i4, @SafeParcelable.Param(id = 1) String[] strArr, @SafeParcelable.Param(id = 2) CursorWindow[] cursorWindowArr, @SafeParcelable.Param(id = 3) int i5, @q0 @SafeParcelable.Param(id = 4) Bundle bundle) {
        this.zae = false;
        this.zak = true;
        this.zaa = i4;
        this.zag = strArr;
        this.zah = cursorWindowArr;
        this.zai = i5;
        this.zaj = bundle;
    }

    @KeepForSdk
    public DataHolder(@o0 String[] strArr, @o0 CursorWindow[] cursorWindowArr, int i4, @q0 Bundle bundle) {
        this.zae = false;
        this.zak = true;
        this.zaa = 1;
        this.zag = (String[]) Preconditions.checkNotNull(strArr);
        this.zah = (CursorWindow[]) Preconditions.checkNotNull(cursorWindowArr);
        this.zai = i4;
        this.zaj = bundle;
        zad();
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public DataHolder(@androidx.annotation.o0 android.database.Cursor r8, int r9, @androidx.annotation.q0 android.os.Bundle r10) {
        /*
            r7 = this;
            com.google.android.gms.common.sqlite.CursorWrapper r0 = new com.google.android.gms.common.sqlite.CursorWrapper
            r0.<init>(r8)
            java.lang.String[] r8 = r0.getColumnNames()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int r2 = r0.getCount()     // Catch: java.lang.Throwable -> L2e
            android.database.CursorWindow r3 = r0.getWindow()     // Catch: java.lang.Throwable -> L2e
            r4 = 0
            r5 = 0
            if (r3 == 0) goto L30
            int r6 = r3.getStartPosition()     // Catch: java.lang.Throwable -> L2e
            if (r6 != 0) goto L30
            r3.acquireReference()     // Catch: java.lang.Throwable -> L2e
            r0.setWindow(r4)     // Catch: java.lang.Throwable -> L2e
            r1.add(r3)     // Catch: java.lang.Throwable -> L2e
            int r3 = r3.getNumRows()     // Catch: java.lang.Throwable -> L2e
            goto L31
        L2e:
            r8 = move-exception
            goto L78
        L30:
            r3 = r5
        L31:
            if (r3 >= r2) goto L65
            boolean r6 = r0.moveToPosition(r3)     // Catch: java.lang.Throwable -> L2e
            if (r6 == 0) goto L65
            android.database.CursorWindow r6 = r0.getWindow()     // Catch: java.lang.Throwable -> L2e
            if (r6 == 0) goto L46
            r6.acquireReference()     // Catch: java.lang.Throwable -> L2e
            r0.setWindow(r4)     // Catch: java.lang.Throwable -> L2e
            goto L51
        L46:
            android.database.CursorWindow r6 = new android.database.CursorWindow     // Catch: java.lang.Throwable -> L2e
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L2e
            r6.setStartPosition(r3)     // Catch: java.lang.Throwable -> L2e
            r0.fillWindow(r3, r6)     // Catch: java.lang.Throwable -> L2e
        L51:
            int r3 = r6.getNumRows()     // Catch: java.lang.Throwable -> L2e
            if (r3 != 0) goto L58
            goto L65
        L58:
            r1.add(r6)     // Catch: java.lang.Throwable -> L2e
            int r3 = r6.getStartPosition()     // Catch: java.lang.Throwable -> L2e
            int r6 = r6.getNumRows()     // Catch: java.lang.Throwable -> L2e
            int r3 = r3 + r6
            goto L31
        L65:
            r0.close()
            int r0 = r1.size()
            android.database.CursorWindow[] r0 = new android.database.CursorWindow[r0]
            java.lang.Object[] r0 = r1.toArray(r0)
            android.database.CursorWindow[] r0 = (android.database.CursorWindow[]) r0
            r7.<init>(r8, r0, r9, r10)
            return
        L78:
            r0.close()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.data.DataHolder.<init>(android.database.Cursor, int, android.os.Bundle):void");
    }

    private DataHolder(Builder builder, int i4, @q0 Bundle bundle) {
        this(builder.zaa, zaf(builder, -1), i4, (Bundle) null);
    }
}
