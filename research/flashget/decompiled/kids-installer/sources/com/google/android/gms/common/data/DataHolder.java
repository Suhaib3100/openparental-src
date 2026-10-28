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
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
@KeepForSdk
@KeepName
@SafeParcelable.Class(creator = "DataHolderCreator", validate = true)
/* loaded from: classes3.dex */
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

    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    @KeepForSdk
    /* loaded from: classes2.dex */
    public static class Builder {
        private final String[] zaa;
        private final ArrayList<HashMap<String, Object>> zab = new ArrayList<>();
        private final HashMap<Object, Integer> zac = new HashMap<>();

        /* synthetic */ Builder(String[] strArr, String str, zac zacVar) {
            this.zaa = (String[]) Preconditions.checkNotNull(strArr);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @o0
        @KeepForSdk
        public DataHolder build(int i5) {
            return new DataHolder(this, i5);
        }

        @o0
        @KeepForSdk
        public Builder withRow(@o0 ContentValues contentValues) {
            Asserts.checkNotNull(contentValues);
            HashMap<String, Object> hashMap = new HashMap<>(contentValues.size());
            for (Map.Entry<String, Object> entry : contentValues.valueSet()) {
                hashMap.put(entry.getKey(), entry.getValue());
            }
            return zaa(hashMap);
        }

        @o0
        public Builder zaa(@o0 HashMap<String, Object> hashMap) {
            Asserts.checkNotNull(hashMap);
            this.zab.add(hashMap);
            return this;
        }

        @o0
        @KeepForSdk
        public DataHolder build(int i5, @o0 Bundle bundle) {
            return new DataHolder(this, i5, bundle);
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
    public static DataHolder empty(int i5) {
        return new DataHolder(zaf, i5, (Bundle) null);
    }

    private final void zae(String str, int i5) {
        Bundle bundle = this.zab;
        if (bundle == null || !bundle.containsKey(str)) {
            String valueOf = String.valueOf(str);
            int length = valueOf.length();
            String s5 = ProtectedSandApp.s("∵");
            throw new IllegalArgumentException(length != 0 ? s5.concat(valueOf) : new String(s5));
        }
        if (isClosed()) {
            throw new IllegalArgumentException(ProtectedSandApp.s("∴"));
        }
        if (i5 < 0 || i5 >= this.zad) {
            throw new CursorIndexOutOfBoundsException(i5, this.zad);
        }
    }

    private static CursorWindow[] zaf(Builder builder, int i5) {
        if (builder.zaa.length == 0) {
            return new CursorWindow[0];
        }
        ArrayList arrayList = builder.zab;
        int size = arrayList.size();
        CursorWindow cursorWindow = new CursorWindow(false);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(cursorWindow);
        cursorWindow.setNumColumns(builder.zaa.length);
        int i6 = 0;
        boolean z5 = false;
        while (i6 < size) {
            try {
                if (!cursorWindow.allocRow()) {
                    cursorWindow = new CursorWindow(false);
                    cursorWindow.setStartPosition(i6);
                    cursorWindow.setNumColumns(builder.zaa.length);
                    arrayList2.add(cursorWindow);
                    if (!cursorWindow.allocRow()) {
                        arrayList2.remove(cursorWindow);
                        return (CursorWindow[]) arrayList2.toArray(new CursorWindow[arrayList2.size()]);
                    }
                }
                Map map = (Map) arrayList.get(i6);
                int i7 = 0;
                boolean z6 = true;
                while (true) {
                    if (i7 < builder.zaa.length) {
                        if (!z6) {
                            break;
                        }
                        String str = builder.zaa[i7];
                        Object obj = map.get(str);
                        if (obj == null) {
                            z6 = cursorWindow.putNull(i6, i7);
                        } else if (obj instanceof String) {
                            z6 = cursorWindow.putString((String) obj, i6, i7);
                        } else if (obj instanceof Long) {
                            z6 = cursorWindow.putLong(((Long) obj).longValue(), i6, i7);
                        } else if (obj instanceof Integer) {
                            z6 = cursorWindow.putLong(((Integer) obj).intValue(), i6, i7);
                        } else if (obj instanceof Boolean) {
                            z6 = cursorWindow.putLong(true != ((Boolean) obj).booleanValue() ? 0L : 1L, i6, i7);
                        } else if (obj instanceof byte[]) {
                            z6 = cursorWindow.putBlob((byte[]) obj, i6, i7);
                        } else if (obj instanceof Double) {
                            z6 = cursorWindow.putDouble(((Double) obj).doubleValue(), i6, i7);
                        } else {
                            if (!(obj instanceof Float)) {
                                String obj2 = obj.toString();
                                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 32 + obj2.length());
                                sb.append(ProtectedSandApp.s("∶"));
                                sb.append(str);
                                sb.append(ProtectedSandApp.s("∷"));
                                sb.append(obj2);
                                throw new IllegalArgumentException(sb.toString());
                            }
                            z6 = cursorWindow.putDouble(((Float) obj).floatValue(), i6, i7);
                        }
                        i7++;
                    } else if (z6) {
                        z5 = false;
                    }
                }
                if (z5) {
                    throw new zad(ProtectedSandApp.s("∸"));
                }
                cursorWindow.freeLastRow();
                cursorWindow = new CursorWindow(false);
                cursorWindow.setStartPosition(i6);
                cursorWindow.setNumColumns(builder.zaa.length);
                arrayList2.add(cursorWindow);
                i6--;
                z5 = true;
                i6++;
            } catch (RuntimeException e6) {
                int size2 = arrayList2.size();
                for (int i8 = 0; i8 < size2; i8++) {
                    ((CursorWindow) arrayList2.get(i8)).close();
                }
                throw e6;
            }
        }
        return (CursorWindow[]) arrayList2.toArray(new CursorWindow[arrayList2.size()]);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    @KeepForSdk
    public void close() {
        synchronized (this) {
            if (!this.zae) {
                this.zae = true;
                int i5 = 0;
                while (true) {
                    CursorWindow[] cursorWindowArr = this.zah;
                    if (i5 >= cursorWindowArr.length) {
                        break;
                    }
                    cursorWindowArr[i5].close();
                    i5++;
                }
            }
        }
    }

    protected final void finalize() throws Throwable {
        try {
            if (this.zak && this.zah.length > 0 && !isClosed()) {
                close();
                new StringBuilder(String.valueOf(toString()).length() + 178);
            }
        } finally {
            super.finalize();
        }
    }

    @KeepForSdk
    public boolean getBoolean(@o0 String str, int i5, int i6) {
        zae(str, i5);
        return Long.valueOf(this.zah[i6].getLong(i5, this.zab.getInt(str))).longValue() == 1;
    }

    @o0
    @KeepForSdk
    public byte[] getByteArray(@o0 String str, int i5, int i6) {
        zae(str, i5);
        return this.zah[i6].getBlob(i5, this.zab.getInt(str));
    }

    @KeepForSdk
    public int getCount() {
        return this.zad;
    }

    @KeepForSdk
    public int getInteger(@o0 String str, int i5, int i6) {
        zae(str, i5);
        return this.zah[i6].getInt(i5, this.zab.getInt(str));
    }

    @KeepForSdk
    public long getLong(@o0 String str, int i5, int i6) {
        zae(str, i5);
        return this.zah[i6].getLong(i5, this.zab.getInt(str));
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
    public String getString(@o0 String str, int i5, int i6) {
        zae(str, i5);
        return this.zah[i6].getString(i5, this.zab.getInt(str));
    }

    @KeepForSdk
    public int getWindowIndex(int i5) {
        int length;
        int i6 = 0;
        Preconditions.checkState(i5 >= 0 && i5 < this.zad);
        while (true) {
            int[] iArr = this.zac;
            length = iArr.length;
            if (i6 >= length) {
                break;
            }
            if (i5 < iArr[i6]) {
                i6--;
                break;
            }
            i6++;
        }
        return i6 == length ? i6 - 1 : i6;
    }

    @KeepForSdk
    public boolean hasColumn(@o0 String str) {
        return this.zab.containsKey(str);
    }

    @KeepForSdk
    public boolean hasNull(@o0 String str, int i5, int i6) {
        zae(str, i5);
        return this.zah[i6].isNull(i5, this.zab.getInt(str));
    }

    @KeepForSdk
    public boolean isClosed() {
        boolean z5;
        synchronized (this) {
            z5 = this.zae;
        }
        return z5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@o0 Parcel parcel, int i5) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeStringArray(parcel, 1, this.zag, false);
        SafeParcelWriter.writeTypedArray(parcel, 2, this.zah, i5, false);
        SafeParcelWriter.writeInt(parcel, 3, getStatusCode());
        SafeParcelWriter.writeBundle(parcel, 4, getMetadata(), false);
        SafeParcelWriter.writeInt(parcel, 1000, this.zaa);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
        if ((i5 & 1) != 0) {
            close();
        }
    }

    public final double zaa(@o0 String str, int i5, int i6) {
        zae(str, i5);
        return this.zah[i6].getDouble(i5, this.zab.getInt(str));
    }

    public final float zab(@o0 String str, int i5, int i6) {
        zae(str, i5);
        return this.zah[i6].getFloat(i5, this.zab.getInt(str));
    }

    public final void zac(@o0 String str, int i5, int i6, @o0 CharArrayBuffer charArrayBuffer) {
        zae(str, i5);
        this.zah[i6].copyStringToBuffer(i5, this.zab.getInt(str), charArrayBuffer);
    }

    public final void zad() {
        this.zab = new Bundle();
        int i5 = 0;
        int i6 = 0;
        while (true) {
            String[] strArr = this.zag;
            if (i6 >= strArr.length) {
                break;
            }
            this.zab.putInt(strArr[i6], i6);
            i6++;
        }
        this.zac = new int[this.zah.length];
        int i7 = 0;
        while (true) {
            CursorWindow[] cursorWindowArr = this.zah;
            if (i5 >= cursorWindowArr.length) {
                this.zad = i7;
                return;
            }
            this.zac[i5] = i7;
            i7 += this.zah[i5].getNumRows() - (i7 - cursorWindowArr[i5].getStartPosition());
            i5++;
        }
    }

    @SafeParcelable.Constructor
    DataHolder(@SafeParcelable.Param(id = 1000) int i5, @SafeParcelable.Param(id = 1) String[] strArr, @SafeParcelable.Param(id = 2) CursorWindow[] cursorWindowArr, @SafeParcelable.Param(id = 3) int i6, @q0 @SafeParcelable.Param(id = 4) Bundle bundle) {
        this.zae = false;
        this.zak = true;
        this.zaa = i5;
        this.zag = strArr;
        this.zah = cursorWindowArr;
        this.zai = i6;
        this.zaj = bundle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @com.google.android.gms.common.annotation.KeepForSdk
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
            int r2 = r0.getCount()     // Catch: java.lang.Throwable -> L76
            android.database.CursorWindow r3 = r0.getWindow()     // Catch: java.lang.Throwable -> L76
            r4 = 0
            r5 = 0
            if (r3 == 0) goto L2e
            int r6 = r3.getStartPosition()     // Catch: java.lang.Throwable -> L76
            if (r6 != 0) goto L2e
            r3.acquireReference()     // Catch: java.lang.Throwable -> L76
            r0.setWindow(r4)     // Catch: java.lang.Throwable -> L76
            r1.add(r3)     // Catch: java.lang.Throwable -> L76
            int r3 = r3.getNumRows()     // Catch: java.lang.Throwable -> L76
            goto L2f
        L2e:
            r3 = r5
        L2f:
            if (r3 >= r2) goto L63
            boolean r6 = r0.moveToPosition(r3)     // Catch: java.lang.Throwable -> L76
            if (r6 == 0) goto L63
            android.database.CursorWindow r6 = r0.getWindow()     // Catch: java.lang.Throwable -> L76
            if (r6 == 0) goto L44
            r6.acquireReference()     // Catch: java.lang.Throwable -> L76
            r0.setWindow(r4)     // Catch: java.lang.Throwable -> L76
            goto L4f
        L44:
            android.database.CursorWindow r6 = new android.database.CursorWindow     // Catch: java.lang.Throwable -> L76
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L76
            r6.setStartPosition(r3)     // Catch: java.lang.Throwable -> L76
            r0.fillWindow(r3, r6)     // Catch: java.lang.Throwable -> L76
        L4f:
            int r3 = r6.getNumRows()     // Catch: java.lang.Throwable -> L76
            if (r3 != 0) goto L56
            goto L63
        L56:
            r1.add(r6)     // Catch: java.lang.Throwable -> L76
            int r3 = r6.getStartPosition()     // Catch: java.lang.Throwable -> L76
            int r6 = r6.getNumRows()     // Catch: java.lang.Throwable -> L76
            int r3 = r3 + r6
            goto L2f
        L63:
            r0.close()
            int r0 = r1.size()
            android.database.CursorWindow[] r0 = new android.database.CursorWindow[r0]
            java.lang.Object[] r0 = r1.toArray(r0)
            android.database.CursorWindow[] r0 = (android.database.CursorWindow[]) r0
            r7.<init>(r8, r0, r9, r10)
            return
        L76:
            r8 = move-exception
            r0.close()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.data.DataHolder.<init>(android.database.Cursor, int, android.os.Bundle):void");
    }

    private DataHolder(Builder builder, int i5, @q0 Bundle bundle) {
        this(builder.zaa, zaf(builder, -1), i5, (Bundle) null);
    }

    @KeepForSdk
    public DataHolder(@o0 String[] strArr, @o0 CursorWindow[] cursorWindowArr, int i5, @q0 Bundle bundle) {
        this.zae = false;
        this.zak = true;
        this.zaa = 1;
        this.zag = (String[]) Preconditions.checkNotNull(strArr);
        this.zah = (CursorWindow[]) Preconditions.checkNotNull(cursorWindowArr);
        this.zai = i5;
        this.zaj = bundle;
        zad();
    }
}
