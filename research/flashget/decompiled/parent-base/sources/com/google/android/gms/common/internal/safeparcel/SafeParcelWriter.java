package com.google.android.gms.common.internal.safeparcel;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.util.SparseLongArray;
import androidx.annotation.o0;
import c1.a;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* loaded from: classes5.dex */
public class SafeParcelWriter {
    private SafeParcelWriter() {
    }

    public static int beginObjectHeader(@o0 Parcel parcel) {
        return zzb(parcel, 20293);
    }

    public static void finishObjectHeader(@o0 Parcel parcel, int i4) {
        zzc(parcel, i4);
    }

    public static void writeBigDecimal(@o0 Parcel parcel, int i4, @o0 BigDecimal bigDecimal, boolean z4) {
        if (bigDecimal == null) {
            if (z4) {
                zza(parcel, i4, 0);
            }
        } else {
            int zzb = zzb(parcel, i4);
            parcel.writeByteArray(bigDecimal.unscaledValue().toByteArray());
            parcel.writeInt(bigDecimal.scale());
            zzc(parcel, zzb);
        }
    }

    public static void writeBigDecimalArray(@o0 Parcel parcel, int i4, @o0 BigDecimal[] bigDecimalArr, boolean z4) {
        if (bigDecimalArr == null) {
            if (z4) {
                zza(parcel, i4, 0);
                return;
            }
            return;
        }
        int zzb = zzb(parcel, i4);
        int length = bigDecimalArr.length;
        parcel.writeInt(length);
        for (int i5 = 0; i5 < length; i5++) {
            parcel.writeByteArray(bigDecimalArr[i5].unscaledValue().toByteArray());
            parcel.writeInt(bigDecimalArr[i5].scale());
        }
        zzc(parcel, zzb);
    }

    public static void writeBigInteger(@o0 Parcel parcel, int i4, @o0 BigInteger bigInteger, boolean z4) {
        if (bigInteger == null) {
            if (z4) {
                zza(parcel, i4, 0);
            }
        } else {
            int zzb = zzb(parcel, i4);
            parcel.writeByteArray(bigInteger.toByteArray());
            zzc(parcel, zzb);
        }
    }

    public static void writeBigIntegerArray(@o0 Parcel parcel, int i4, @o0 BigInteger[] bigIntegerArr, boolean z4) {
        if (bigIntegerArr == null) {
            if (z4) {
                zza(parcel, i4, 0);
                return;
            }
            return;
        }
        int zzb = zzb(parcel, i4);
        parcel.writeInt(bigIntegerArr.length);
        for (BigInteger bigInteger : bigIntegerArr) {
            parcel.writeByteArray(bigInteger.toByteArray());
        }
        zzc(parcel, zzb);
    }

    public static void writeBoolean(@o0 Parcel parcel, int i4, boolean z4) {
        zza(parcel, i4, 4);
        parcel.writeInt(z4 ? 1 : 0);
    }

    public static void writeBooleanArray(@o0 Parcel parcel, int i4, @o0 boolean[] zArr, boolean z4) {
        if (zArr == null) {
            if (z4) {
                zza(parcel, i4, 0);
            }
        } else {
            int zzb = zzb(parcel, i4);
            parcel.writeBooleanArray(zArr);
            zzc(parcel, zzb);
        }
    }

    public static void writeBooleanList(@o0 Parcel parcel, int i4, @o0 List<Boolean> list, boolean z4) {
        if (list == null) {
            if (z4) {
                zza(parcel, i4, 0);
                return;
            }
            return;
        }
        int zzb = zzb(parcel, i4);
        int size = list.size();
        parcel.writeInt(size);
        for (int i5 = 0; i5 < size; i5++) {
            parcel.writeInt(list.get(i5).booleanValue() ? 1 : 0);
        }
        zzc(parcel, zzb);
    }

    public static void writeBooleanObject(@o0 Parcel parcel, int i4, @o0 Boolean bool, boolean z4) {
        if (bool != null) {
            zza(parcel, i4, 4);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        } else if (z4) {
            zza(parcel, i4, 0);
        }
    }

    public static void writeBundle(@o0 Parcel parcel, int i4, @o0 Bundle bundle, boolean z4) {
        if (bundle == null) {
            if (z4) {
                zza(parcel, i4, 0);
            }
        } else {
            int zzb = zzb(parcel, i4);
            parcel.writeBundle(bundle);
            zzc(parcel, zzb);
        }
    }

    public static void writeByte(@o0 Parcel parcel, int i4, byte b5) {
        zza(parcel, i4, 4);
        parcel.writeInt(b5);
    }

    public static void writeByteArray(@o0 Parcel parcel, int i4, @o0 byte[] bArr, boolean z4) {
        if (bArr == null) {
            if (z4) {
                zza(parcel, i4, 0);
            }
        } else {
            int zzb = zzb(parcel, i4);
            parcel.writeByteArray(bArr);
            zzc(parcel, zzb);
        }
    }

    public static void writeByteArrayArray(@o0 Parcel parcel, int i4, @o0 byte[][] bArr, boolean z4) {
        if (bArr == null) {
            if (z4) {
                zza(parcel, i4, 0);
                return;
            }
            return;
        }
        int zzb = zzb(parcel, i4);
        parcel.writeInt(bArr.length);
        for (byte[] bArr2 : bArr) {
            parcel.writeByteArray(bArr2);
        }
        zzc(parcel, zzb);
    }

    public static void writeByteArraySparseArray(@o0 Parcel parcel, int i4, @o0 SparseArray<byte[]> sparseArray, boolean z4) {
        if (sparseArray == null) {
            if (z4) {
                zza(parcel, i4, 0);
                return;
            }
            return;
        }
        int zzb = zzb(parcel, i4);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i5 = 0; i5 < size; i5++) {
            parcel.writeInt(sparseArray.keyAt(i5));
            parcel.writeByteArray(sparseArray.valueAt(i5));
        }
        zzc(parcel, zzb);
    }

    public static void writeChar(@o0 Parcel parcel, int i4, char c5) {
        zza(parcel, i4, 4);
        parcel.writeInt(c5);
    }

    public static void writeCharArray(@o0 Parcel parcel, int i4, @o0 char[] cArr, boolean z4) {
        if (cArr == null) {
            if (z4) {
                zza(parcel, i4, 0);
            }
        } else {
            int zzb = zzb(parcel, i4);
            parcel.writeCharArray(cArr);
            zzc(parcel, zzb);
        }
    }

    public static void writeDouble(@o0 Parcel parcel, int i4, double d5) {
        zza(parcel, i4, 8);
        parcel.writeDouble(d5);
    }

    public static void writeDoubleArray(@o0 Parcel parcel, int i4, @o0 double[] dArr, boolean z4) {
        if (dArr == null) {
            if (z4) {
                zza(parcel, i4, 0);
            }
        } else {
            int zzb = zzb(parcel, i4);
            parcel.writeDoubleArray(dArr);
            zzc(parcel, zzb);
        }
    }

    public static void writeDoubleList(@o0 Parcel parcel, int i4, @o0 List<Double> list, boolean z4) {
        if (list == null) {
            if (z4) {
                zza(parcel, i4, 0);
                return;
            }
            return;
        }
        int zzb = zzb(parcel, i4);
        int size = list.size();
        parcel.writeInt(size);
        for (int i5 = 0; i5 < size; i5++) {
            parcel.writeDouble(list.get(i5).doubleValue());
        }
        zzc(parcel, zzb);
    }

    public static void writeDoubleObject(@o0 Parcel parcel, int i4, @o0 Double d5, boolean z4) {
        if (d5 != null) {
            zza(parcel, i4, 8);
            parcel.writeDouble(d5.doubleValue());
        } else if (z4) {
            zza(parcel, i4, 0);
        }
    }

    public static void writeDoubleSparseArray(@o0 Parcel parcel, int i4, @o0 SparseArray<Double> sparseArray, boolean z4) {
        if (sparseArray == null) {
            if (z4) {
                zza(parcel, i4, 0);
                return;
            }
            return;
        }
        int zzb = zzb(parcel, i4);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i5 = 0; i5 < size; i5++) {
            parcel.writeInt(sparseArray.keyAt(i5));
            parcel.writeDouble(sparseArray.valueAt(i5).doubleValue());
        }
        zzc(parcel, zzb);
    }

    public static void writeFloat(@o0 Parcel parcel, int i4, float f4) {
        zza(parcel, i4, 4);
        parcel.writeFloat(f4);
    }

    public static void writeFloatArray(@o0 Parcel parcel, int i4, @o0 float[] fArr, boolean z4) {
        if (fArr == null) {
            if (z4) {
                zza(parcel, i4, 0);
            }
        } else {
            int zzb = zzb(parcel, i4);
            parcel.writeFloatArray(fArr);
            zzc(parcel, zzb);
        }
    }

    public static void writeFloatList(@o0 Parcel parcel, int i4, @o0 List<Float> list, boolean z4) {
        if (list == null) {
            if (z4) {
                zza(parcel, i4, 0);
                return;
            }
            return;
        }
        int zzb = zzb(parcel, i4);
        int size = list.size();
        parcel.writeInt(size);
        for (int i5 = 0; i5 < size; i5++) {
            parcel.writeFloat(list.get(i5).floatValue());
        }
        zzc(parcel, zzb);
    }

    public static void writeFloatObject(@o0 Parcel parcel, int i4, @o0 Float f4, boolean z4) {
        if (f4 != null) {
            zza(parcel, i4, 4);
            parcel.writeFloat(f4.floatValue());
        } else if (z4) {
            zza(parcel, i4, 0);
        }
    }

    public static void writeFloatSparseArray(@o0 Parcel parcel, int i4, @o0 SparseArray<Float> sparseArray, boolean z4) {
        if (sparseArray == null) {
            if (z4) {
                zza(parcel, i4, 0);
                return;
            }
            return;
        }
        int zzb = zzb(parcel, i4);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i5 = 0; i5 < size; i5++) {
            parcel.writeInt(sparseArray.keyAt(i5));
            parcel.writeFloat(sparseArray.valueAt(i5).floatValue());
        }
        zzc(parcel, zzb);
    }

    public static void writeIBinder(@o0 Parcel parcel, int i4, @o0 IBinder iBinder, boolean z4) {
        if (iBinder == null) {
            if (z4) {
                zza(parcel, i4, 0);
            }
        } else {
            int zzb = zzb(parcel, i4);
            parcel.writeStrongBinder(iBinder);
            zzc(parcel, zzb);
        }
    }

    public static void writeIBinderArray(@o0 Parcel parcel, int i4, @o0 IBinder[] iBinderArr, boolean z4) {
        if (iBinderArr == null) {
            if (z4) {
                zza(parcel, i4, 0);
            }
        } else {
            int zzb = zzb(parcel, i4);
            parcel.writeBinderArray(iBinderArr);
            zzc(parcel, zzb);
        }
    }

    public static void writeIBinderList(@o0 Parcel parcel, int i4, @o0 List<IBinder> list, boolean z4) {
        if (list == null) {
            if (z4) {
                zza(parcel, i4, 0);
            }
        } else {
            int zzb = zzb(parcel, i4);
            parcel.writeBinderList(list);
            zzc(parcel, zzb);
        }
    }

    public static void writeIBinderSparseArray(@o0 Parcel parcel, int i4, @o0 SparseArray<IBinder> sparseArray, boolean z4) {
        if (sparseArray == null) {
            if (z4) {
                zza(parcel, i4, 0);
                return;
            }
            return;
        }
        int zzb = zzb(parcel, i4);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i5 = 0; i5 < size; i5++) {
            parcel.writeInt(sparseArray.keyAt(i5));
            parcel.writeStrongBinder(sparseArray.valueAt(i5));
        }
        zzc(parcel, zzb);
    }

    public static void writeInt(@o0 Parcel parcel, int i4, int i5) {
        zza(parcel, i4, 4);
        parcel.writeInt(i5);
    }

    public static void writeIntArray(@o0 Parcel parcel, int i4, @o0 int[] iArr, boolean z4) {
        if (iArr == null) {
            if (z4) {
                zza(parcel, i4, 0);
            }
        } else {
            int zzb = zzb(parcel, i4);
            parcel.writeIntArray(iArr);
            zzc(parcel, zzb);
        }
    }

    public static void writeIntegerList(@o0 Parcel parcel, int i4, @o0 List<Integer> list, boolean z4) {
        if (list == null) {
            if (z4) {
                zza(parcel, i4, 0);
                return;
            }
            return;
        }
        int zzb = zzb(parcel, i4);
        int size = list.size();
        parcel.writeInt(size);
        for (int i5 = 0; i5 < size; i5++) {
            parcel.writeInt(list.get(i5).intValue());
        }
        zzc(parcel, zzb);
    }

    public static void writeIntegerObject(@o0 Parcel parcel, int i4, @o0 Integer num, boolean z4) {
        if (num != null) {
            zza(parcel, i4, 4);
            parcel.writeInt(num.intValue());
        } else if (z4) {
            zza(parcel, i4, 0);
        }
    }

    public static void writeList(@o0 Parcel parcel, int i4, @o0 List list, boolean z4) {
        if (list == null) {
            if (z4) {
                zza(parcel, i4, 0);
            }
        } else {
            int zzb = zzb(parcel, i4);
            parcel.writeList(list);
            zzc(parcel, zzb);
        }
    }

    public static void writeLong(@o0 Parcel parcel, int i4, long j4) {
        zza(parcel, i4, 8);
        parcel.writeLong(j4);
    }

    public static void writeLongArray(@o0 Parcel parcel, int i4, @o0 long[] jArr, boolean z4) {
        if (jArr == null) {
            if (z4) {
                zza(parcel, i4, 0);
            }
        } else {
            int zzb = zzb(parcel, i4);
            parcel.writeLongArray(jArr);
            zzc(parcel, zzb);
        }
    }

    public static void writeLongList(@o0 Parcel parcel, int i4, @o0 List<Long> list, boolean z4) {
        if (list == null) {
            if (z4) {
                zza(parcel, i4, 0);
                return;
            }
            return;
        }
        int zzb = zzb(parcel, i4);
        int size = list.size();
        parcel.writeInt(size);
        for (int i5 = 0; i5 < size; i5++) {
            parcel.writeLong(list.get(i5).longValue());
        }
        zzc(parcel, zzb);
    }

    public static void writeLongObject(@o0 Parcel parcel, int i4, @o0 Long l4, boolean z4) {
        if (l4 != null) {
            zza(parcel, i4, 8);
            parcel.writeLong(l4.longValue());
        } else if (z4) {
            zza(parcel, i4, 0);
        }
    }

    public static void writeParcel(@o0 Parcel parcel, int i4, @o0 Parcel parcel2, boolean z4) {
        if (parcel2 == null) {
            if (z4) {
                zza(parcel, i4, 0);
            }
        } else {
            int zzb = zzb(parcel, i4);
            parcel.appendFrom(parcel2, 0, parcel2.dataSize());
            zzc(parcel, zzb);
        }
    }

    public static void writeParcelArray(@o0 Parcel parcel, int i4, @o0 Parcel[] parcelArr, boolean z4) {
        if (parcelArr == null) {
            if (z4) {
                zza(parcel, i4, 0);
                return;
            }
            return;
        }
        int zzb = zzb(parcel, i4);
        parcel.writeInt(parcelArr.length);
        for (Parcel parcel2 : parcelArr) {
            if (parcel2 != null) {
                parcel.writeInt(parcel2.dataSize());
                parcel.appendFrom(parcel2, 0, parcel2.dataSize());
            } else {
                parcel.writeInt(0);
            }
        }
        zzc(parcel, zzb);
    }

    public static void writeParcelList(@o0 Parcel parcel, int i4, @o0 List<Parcel> list, boolean z4) {
        if (list == null) {
            if (z4) {
                zza(parcel, i4, 0);
                return;
            }
            return;
        }
        int zzb = zzb(parcel, i4);
        int size = list.size();
        parcel.writeInt(size);
        for (int i5 = 0; i5 < size; i5++) {
            Parcel parcel2 = list.get(i5);
            if (parcel2 != null) {
                parcel.writeInt(parcel2.dataSize());
                parcel.appendFrom(parcel2, 0, parcel2.dataSize());
            } else {
                parcel.writeInt(0);
            }
        }
        zzc(parcel, zzb);
    }

    public static void writeParcelSparseArray(@o0 Parcel parcel, int i4, @o0 SparseArray<Parcel> sparseArray, boolean z4) {
        if (sparseArray == null) {
            if (z4) {
                zza(parcel, i4, 0);
                return;
            }
            return;
        }
        int zzb = zzb(parcel, i4);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i5 = 0; i5 < size; i5++) {
            parcel.writeInt(sparseArray.keyAt(i5));
            Parcel valueAt = sparseArray.valueAt(i5);
            if (valueAt != null) {
                parcel.writeInt(valueAt.dataSize());
                parcel.appendFrom(valueAt, 0, valueAt.dataSize());
            } else {
                parcel.writeInt(0);
            }
        }
        zzc(parcel, zzb);
    }

    public static void writeParcelable(@o0 Parcel parcel, int i4, @o0 Parcelable parcelable, int i5, boolean z4) {
        if (parcelable == null) {
            if (z4) {
                zza(parcel, i4, 0);
            }
        } else {
            int zzb = zzb(parcel, i4);
            parcelable.writeToParcel(parcel, i5);
            zzc(parcel, zzb);
        }
    }

    public static void writePendingIntent(@o0 Parcel parcel, int i4, @o0 PendingIntent pendingIntent, boolean z4) {
        if (pendingIntent == null) {
            if (z4) {
                zza(parcel, i4, 0);
            }
        } else {
            int zzb = zzb(parcel, i4);
            PendingIntent.writePendingIntentOrNullToParcel(pendingIntent, parcel);
            zzc(parcel, zzb);
        }
    }

    public static void writeShort(@o0 Parcel parcel, int i4, short s4) {
        zza(parcel, i4, 4);
        parcel.writeInt(s4);
    }

    public static void writeSparseBooleanArray(@o0 Parcel parcel, int i4, @o0 SparseBooleanArray sparseBooleanArray, boolean z4) {
        if (sparseBooleanArray == null) {
            if (z4) {
                zza(parcel, i4, 0);
            }
        } else {
            int zzb = zzb(parcel, i4);
            parcel.writeSparseBooleanArray(sparseBooleanArray);
            zzc(parcel, zzb);
        }
    }

    public static void writeSparseIntArray(@o0 Parcel parcel, int i4, @o0 SparseIntArray sparseIntArray, boolean z4) {
        if (sparseIntArray == null) {
            if (z4) {
                zza(parcel, i4, 0);
                return;
            }
            return;
        }
        int zzb = zzb(parcel, i4);
        int size = sparseIntArray.size();
        parcel.writeInt(size);
        for (int i5 = 0; i5 < size; i5++) {
            parcel.writeInt(sparseIntArray.keyAt(i5));
            parcel.writeInt(sparseIntArray.valueAt(i5));
        }
        zzc(parcel, zzb);
    }

    public static void writeSparseLongArray(@o0 Parcel parcel, int i4, @o0 SparseLongArray sparseLongArray, boolean z4) {
        if (sparseLongArray == null) {
            if (z4) {
                zza(parcel, i4, 0);
                return;
            }
            return;
        }
        int zzb = zzb(parcel, i4);
        int size = sparseLongArray.size();
        parcel.writeInt(size);
        for (int i5 = 0; i5 < size; i5++) {
            parcel.writeInt(sparseLongArray.keyAt(i5));
            parcel.writeLong(sparseLongArray.valueAt(i5));
        }
        zzc(parcel, zzb);
    }

    public static void writeString(@o0 Parcel parcel, int i4, @o0 String str, boolean z4) {
        if (str == null) {
            if (z4) {
                zza(parcel, i4, 0);
            }
        } else {
            int zzb = zzb(parcel, i4);
            parcel.writeString(str);
            zzc(parcel, zzb);
        }
    }

    public static void writeStringArray(@o0 Parcel parcel, int i4, @o0 String[] strArr, boolean z4) {
        if (strArr == null) {
            if (z4) {
                zza(parcel, i4, 0);
            }
        } else {
            int zzb = zzb(parcel, i4);
            parcel.writeStringArray(strArr);
            zzc(parcel, zzb);
        }
    }

    public static void writeStringList(@o0 Parcel parcel, int i4, @o0 List<String> list, boolean z4) {
        if (list == null) {
            if (z4) {
                zza(parcel, i4, 0);
            }
        } else {
            int zzb = zzb(parcel, i4);
            parcel.writeStringList(list);
            zzc(parcel, zzb);
        }
    }

    public static void writeStringSparseArray(@o0 Parcel parcel, int i4, @o0 SparseArray<String> sparseArray, boolean z4) {
        if (sparseArray == null) {
            if (z4) {
                zza(parcel, i4, 0);
                return;
            }
            return;
        }
        int zzb = zzb(parcel, i4);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i5 = 0; i5 < size; i5++) {
            parcel.writeInt(sparseArray.keyAt(i5));
            parcel.writeString(sparseArray.valueAt(i5));
        }
        zzc(parcel, zzb);
    }

    public static <T extends Parcelable> void writeTypedArray(@o0 Parcel parcel, int i4, @o0 T[] tArr, int i5, boolean z4) {
        if (tArr == null) {
            if (z4) {
                zza(parcel, i4, 0);
                return;
            }
            return;
        }
        int zzb = zzb(parcel, i4);
        parcel.writeInt(tArr.length);
        for (T t4 : tArr) {
            if (t4 == null) {
                parcel.writeInt(0);
            } else {
                zzd(parcel, t4, i5);
            }
        }
        zzc(parcel, zzb);
    }

    public static <T extends Parcelable> void writeTypedList(@o0 Parcel parcel, int i4, @o0 List<T> list, boolean z4) {
        if (list == null) {
            if (z4) {
                zza(parcel, i4, 0);
                return;
            }
            return;
        }
        int zzb = zzb(parcel, i4);
        int size = list.size();
        parcel.writeInt(size);
        for (int i5 = 0; i5 < size; i5++) {
            T t4 = list.get(i5);
            if (t4 == null) {
                parcel.writeInt(0);
            } else {
                zzd(parcel, t4, 0);
            }
        }
        zzc(parcel, zzb);
    }

    public static <T extends Parcelable> void writeTypedSparseArray(@o0 Parcel parcel, int i4, @o0 SparseArray<T> sparseArray, boolean z4) {
        if (sparseArray == null) {
            if (z4) {
                zza(parcel, i4, 0);
                return;
            }
            return;
        }
        int zzb = zzb(parcel, i4);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i5 = 0; i5 < size; i5++) {
            parcel.writeInt(sparseArray.keyAt(i5));
            T valueAt = sparseArray.valueAt(i5);
            if (valueAt == null) {
                parcel.writeInt(0);
            } else {
                zzd(parcel, valueAt, 0);
            }
        }
        zzc(parcel, zzb);
    }

    private static void zza(Parcel parcel, int i4, int i5) {
        parcel.writeInt(i4 | (i5 << 16));
    }

    private static int zzb(Parcel parcel, int i4) {
        parcel.writeInt(i4 | a.f38447c);
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    private static void zzc(Parcel parcel, int i4) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i4 - 4);
        parcel.writeInt(dataPosition - i4);
        parcel.setDataPosition(dataPosition);
    }

    private static void zzd(Parcel parcel, Parcelable parcelable, int i4) {
        int dataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int dataPosition2 = parcel.dataPosition();
        parcelable.writeToParcel(parcel, i4);
        int dataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(dataPosition);
        parcel.writeInt(dataPosition3 - dataPosition2);
        parcel.setDataPosition(dataPosition3);
    }
}
