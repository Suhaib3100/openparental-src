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
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;
import m.a;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes2.dex */
public class SafeParcelWriter {
    private SafeParcelWriter() {
    }

    public static int beginObjectHeader(@o0 Parcel parcel) {
        return zza(parcel, 20293);
    }

    public static void finishObjectHeader(@o0 Parcel parcel, int i5) {
        zzb(parcel, i5);
    }

    public static void writeBigDecimal(@o0 Parcel parcel, int i5, @o0 BigDecimal bigDecimal, boolean z5) {
        if (bigDecimal == null) {
            if (z5) {
                zzc(parcel, i5, 0);
            }
        } else {
            int zza = zza(parcel, i5);
            parcel.writeByteArray(bigDecimal.unscaledValue().toByteArray());
            parcel.writeInt(bigDecimal.scale());
            zzb(parcel, zza);
        }
    }

    public static void writeBigDecimalArray(@o0 Parcel parcel, int i5, @o0 BigDecimal[] bigDecimalArr, boolean z5) {
        if (bigDecimalArr == null) {
            if (z5) {
                zzc(parcel, i5, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i5);
        int length = bigDecimalArr.length;
        parcel.writeInt(length);
        for (int i6 = 0; i6 < length; i6++) {
            parcel.writeByteArray(bigDecimalArr[i6].unscaledValue().toByteArray());
            parcel.writeInt(bigDecimalArr[i6].scale());
        }
        zzb(parcel, zza);
    }

    public static void writeBigInteger(@o0 Parcel parcel, int i5, @o0 BigInteger bigInteger, boolean z5) {
        if (bigInteger == null) {
            if (z5) {
                zzc(parcel, i5, 0);
            }
        } else {
            int zza = zza(parcel, i5);
            parcel.writeByteArray(bigInteger.toByteArray());
            zzb(parcel, zza);
        }
    }

    public static void writeBigIntegerArray(@o0 Parcel parcel, int i5, @o0 BigInteger[] bigIntegerArr, boolean z5) {
        if (bigIntegerArr == null) {
            if (z5) {
                zzc(parcel, i5, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i5);
        parcel.writeInt(bigIntegerArr.length);
        for (BigInteger bigInteger : bigIntegerArr) {
            parcel.writeByteArray(bigInteger.toByteArray());
        }
        zzb(parcel, zza);
    }

    public static void writeBoolean(@o0 Parcel parcel, int i5, boolean z5) {
        zzc(parcel, i5, 4);
        parcel.writeInt(z5 ? 1 : 0);
    }

    public static void writeBooleanArray(@o0 Parcel parcel, int i5, @o0 boolean[] zArr, boolean z5) {
        if (zArr == null) {
            if (z5) {
                zzc(parcel, i5, 0);
            }
        } else {
            int zza = zza(parcel, i5);
            parcel.writeBooleanArray(zArr);
            zzb(parcel, zza);
        }
    }

    public static void writeBooleanList(@o0 Parcel parcel, int i5, @o0 List<Boolean> list, boolean z5) {
        if (list == null) {
            if (z5) {
                zzc(parcel, i5, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i5);
        int size = list.size();
        parcel.writeInt(size);
        for (int i6 = 0; i6 < size; i6++) {
            parcel.writeInt(list.get(i6).booleanValue() ? 1 : 0);
        }
        zzb(parcel, zza);
    }

    public static void writeBooleanObject(@o0 Parcel parcel, int i5, @o0 Boolean bool, boolean z5) {
        if (bool != null) {
            zzc(parcel, i5, 4);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        } else if (z5) {
            zzc(parcel, i5, 0);
        }
    }

    public static void writeBundle(@o0 Parcel parcel, int i5, @o0 Bundle bundle, boolean z5) {
        if (bundle == null) {
            if (z5) {
                zzc(parcel, i5, 0);
            }
        } else {
            int zza = zza(parcel, i5);
            parcel.writeBundle(bundle);
            zzb(parcel, zza);
        }
    }

    public static void writeByte(@o0 Parcel parcel, int i5, byte b6) {
        zzc(parcel, i5, 4);
        parcel.writeInt(b6);
    }

    public static void writeByteArray(@o0 Parcel parcel, int i5, @o0 byte[] bArr, boolean z5) {
        if (bArr == null) {
            if (z5) {
                zzc(parcel, i5, 0);
            }
        } else {
            int zza = zza(parcel, i5);
            parcel.writeByteArray(bArr);
            zzb(parcel, zza);
        }
    }

    public static void writeByteArrayArray(@o0 Parcel parcel, int i5, @o0 byte[][] bArr, boolean z5) {
        if (bArr == null) {
            if (z5) {
                zzc(parcel, i5, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i5);
        parcel.writeInt(bArr.length);
        for (byte[] bArr2 : bArr) {
            parcel.writeByteArray(bArr2);
        }
        zzb(parcel, zza);
    }

    public static void writeByteArraySparseArray(@o0 Parcel parcel, int i5, @o0 SparseArray<byte[]> sparseArray, boolean z5) {
        if (sparseArray == null) {
            if (z5) {
                zzc(parcel, i5, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i5);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i6 = 0; i6 < size; i6++) {
            parcel.writeInt(sparseArray.keyAt(i6));
            parcel.writeByteArray(sparseArray.valueAt(i6));
        }
        zzb(parcel, zza);
    }

    public static void writeChar(@o0 Parcel parcel, int i5, char c6) {
        zzc(parcel, i5, 4);
        parcel.writeInt(c6);
    }

    public static void writeCharArray(@o0 Parcel parcel, int i5, @o0 char[] cArr, boolean z5) {
        if (cArr == null) {
            if (z5) {
                zzc(parcel, i5, 0);
            }
        } else {
            int zza = zza(parcel, i5);
            parcel.writeCharArray(cArr);
            zzb(parcel, zza);
        }
    }

    public static void writeDouble(@o0 Parcel parcel, int i5, double d6) {
        zzc(parcel, i5, 8);
        parcel.writeDouble(d6);
    }

    public static void writeDoubleArray(@o0 Parcel parcel, int i5, @o0 double[] dArr, boolean z5) {
        if (dArr == null) {
            if (z5) {
                zzc(parcel, i5, 0);
            }
        } else {
            int zza = zza(parcel, i5);
            parcel.writeDoubleArray(dArr);
            zzb(parcel, zza);
        }
    }

    public static void writeDoubleList(@o0 Parcel parcel, int i5, @o0 List<Double> list, boolean z5) {
        if (list == null) {
            if (z5) {
                zzc(parcel, i5, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i5);
        int size = list.size();
        parcel.writeInt(size);
        for (int i6 = 0; i6 < size; i6++) {
            parcel.writeDouble(list.get(i6).doubleValue());
        }
        zzb(parcel, zza);
    }

    public static void writeDoubleObject(@o0 Parcel parcel, int i5, @o0 Double d6, boolean z5) {
        if (d6 != null) {
            zzc(parcel, i5, 8);
            parcel.writeDouble(d6.doubleValue());
        } else if (z5) {
            zzc(parcel, i5, 0);
        }
    }

    public static void writeDoubleSparseArray(@o0 Parcel parcel, int i5, @o0 SparseArray<Double> sparseArray, boolean z5) {
        if (sparseArray == null) {
            if (z5) {
                zzc(parcel, i5, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i5);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i6 = 0; i6 < size; i6++) {
            parcel.writeInt(sparseArray.keyAt(i6));
            parcel.writeDouble(sparseArray.valueAt(i6).doubleValue());
        }
        zzb(parcel, zza);
    }

    public static void writeFloat(@o0 Parcel parcel, int i5, float f6) {
        zzc(parcel, i5, 4);
        parcel.writeFloat(f6);
    }

    public static void writeFloatArray(@o0 Parcel parcel, int i5, @o0 float[] fArr, boolean z5) {
        if (fArr == null) {
            if (z5) {
                zzc(parcel, i5, 0);
            }
        } else {
            int zza = zza(parcel, i5);
            parcel.writeFloatArray(fArr);
            zzb(parcel, zza);
        }
    }

    public static void writeFloatList(@o0 Parcel parcel, int i5, @o0 List<Float> list, boolean z5) {
        if (list == null) {
            if (z5) {
                zzc(parcel, i5, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i5);
        int size = list.size();
        parcel.writeInt(size);
        for (int i6 = 0; i6 < size; i6++) {
            parcel.writeFloat(list.get(i6).floatValue());
        }
        zzb(parcel, zza);
    }

    public static void writeFloatObject(@o0 Parcel parcel, int i5, @o0 Float f6, boolean z5) {
        if (f6 != null) {
            zzc(parcel, i5, 4);
            parcel.writeFloat(f6.floatValue());
        } else if (z5) {
            zzc(parcel, i5, 0);
        }
    }

    public static void writeFloatSparseArray(@o0 Parcel parcel, int i5, @o0 SparseArray<Float> sparseArray, boolean z5) {
        if (sparseArray == null) {
            if (z5) {
                zzc(parcel, i5, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i5);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i6 = 0; i6 < size; i6++) {
            parcel.writeInt(sparseArray.keyAt(i6));
            parcel.writeFloat(sparseArray.valueAt(i6).floatValue());
        }
        zzb(parcel, zza);
    }

    public static void writeIBinder(@o0 Parcel parcel, int i5, @o0 IBinder iBinder, boolean z5) {
        if (iBinder == null) {
            if (z5) {
                zzc(parcel, i5, 0);
            }
        } else {
            int zza = zza(parcel, i5);
            parcel.writeStrongBinder(iBinder);
            zzb(parcel, zza);
        }
    }

    public static void writeIBinderArray(@o0 Parcel parcel, int i5, @o0 IBinder[] iBinderArr, boolean z5) {
        if (iBinderArr == null) {
            if (z5) {
                zzc(parcel, i5, 0);
            }
        } else {
            int zza = zza(parcel, i5);
            parcel.writeBinderArray(iBinderArr);
            zzb(parcel, zza);
        }
    }

    public static void writeIBinderList(@o0 Parcel parcel, int i5, @o0 List<IBinder> list, boolean z5) {
        if (list == null) {
            if (z5) {
                zzc(parcel, i5, 0);
            }
        } else {
            int zza = zza(parcel, i5);
            parcel.writeBinderList(list);
            zzb(parcel, zza);
        }
    }

    public static void writeIBinderSparseArray(@o0 Parcel parcel, int i5, @o0 SparseArray<IBinder> sparseArray, boolean z5) {
        if (sparseArray == null) {
            if (z5) {
                zzc(parcel, i5, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i5);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i6 = 0; i6 < size; i6++) {
            parcel.writeInt(sparseArray.keyAt(i6));
            parcel.writeStrongBinder(sparseArray.valueAt(i6));
        }
        zzb(parcel, zza);
    }

    public static void writeInt(@o0 Parcel parcel, int i5, int i6) {
        zzc(parcel, i5, 4);
        parcel.writeInt(i6);
    }

    public static void writeIntArray(@o0 Parcel parcel, int i5, @o0 int[] iArr, boolean z5) {
        if (iArr == null) {
            if (z5) {
                zzc(parcel, i5, 0);
            }
        } else {
            int zza = zza(parcel, i5);
            parcel.writeIntArray(iArr);
            zzb(parcel, zza);
        }
    }

    public static void writeIntegerList(@o0 Parcel parcel, int i5, @o0 List<Integer> list, boolean z5) {
        if (list == null) {
            if (z5) {
                zzc(parcel, i5, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i5);
        int size = list.size();
        parcel.writeInt(size);
        for (int i6 = 0; i6 < size; i6++) {
            parcel.writeInt(list.get(i6).intValue());
        }
        zzb(parcel, zza);
    }

    public static void writeIntegerObject(@o0 Parcel parcel, int i5, @o0 Integer num, boolean z5) {
        if (num != null) {
            zzc(parcel, i5, 4);
            parcel.writeInt(num.intValue());
        } else if (z5) {
            zzc(parcel, i5, 0);
        }
    }

    public static void writeList(@o0 Parcel parcel, int i5, @o0 List list, boolean z5) {
        if (list == null) {
            if (z5) {
                zzc(parcel, i5, 0);
            }
        } else {
            int zza = zza(parcel, i5);
            parcel.writeList(list);
            zzb(parcel, zza);
        }
    }

    public static void writeLong(@o0 Parcel parcel, int i5, long j5) {
        zzc(parcel, i5, 8);
        parcel.writeLong(j5);
    }

    public static void writeLongArray(@o0 Parcel parcel, int i5, @o0 long[] jArr, boolean z5) {
        if (jArr == null) {
            if (z5) {
                zzc(parcel, i5, 0);
            }
        } else {
            int zza = zza(parcel, i5);
            parcel.writeLongArray(jArr);
            zzb(parcel, zza);
        }
    }

    public static void writeLongList(@o0 Parcel parcel, int i5, @o0 List<Long> list, boolean z5) {
        if (list == null) {
            if (z5) {
                zzc(parcel, i5, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i5);
        int size = list.size();
        parcel.writeInt(size);
        for (int i6 = 0; i6 < size; i6++) {
            parcel.writeLong(list.get(i6).longValue());
        }
        zzb(parcel, zza);
    }

    public static void writeLongObject(@o0 Parcel parcel, int i5, @o0 Long l5, boolean z5) {
        if (l5 != null) {
            zzc(parcel, i5, 8);
            parcel.writeLong(l5.longValue());
        } else if (z5) {
            zzc(parcel, i5, 0);
        }
    }

    public static void writeParcel(@o0 Parcel parcel, int i5, @o0 Parcel parcel2, boolean z5) {
        if (parcel2 == null) {
            if (z5) {
                zzc(parcel, i5, 0);
            }
        } else {
            int zza = zza(parcel, i5);
            parcel.appendFrom(parcel2, 0, parcel2.dataSize());
            zzb(parcel, zza);
        }
    }

    public static void writeParcelArray(@o0 Parcel parcel, int i5, @o0 Parcel[] parcelArr, boolean z5) {
        if (parcelArr == null) {
            if (z5) {
                zzc(parcel, i5, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i5);
        parcel.writeInt(parcelArr.length);
        for (Parcel parcel2 : parcelArr) {
            if (parcel2 != null) {
                parcel.writeInt(parcel2.dataSize());
                parcel.appendFrom(parcel2, 0, parcel2.dataSize());
            } else {
                parcel.writeInt(0);
            }
        }
        zzb(parcel, zza);
    }

    public static void writeParcelList(@o0 Parcel parcel, int i5, @o0 List<Parcel> list, boolean z5) {
        if (list == null) {
            if (z5) {
                zzc(parcel, i5, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i5);
        int size = list.size();
        parcel.writeInt(size);
        for (int i6 = 0; i6 < size; i6++) {
            Parcel parcel2 = list.get(i6);
            if (parcel2 != null) {
                parcel.writeInt(parcel2.dataSize());
                parcel.appendFrom(parcel2, 0, parcel2.dataSize());
            } else {
                parcel.writeInt(0);
            }
        }
        zzb(parcel, zza);
    }

    public static void writeParcelSparseArray(@o0 Parcel parcel, int i5, @o0 SparseArray<Parcel> sparseArray, boolean z5) {
        if (sparseArray == null) {
            if (z5) {
                zzc(parcel, i5, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i5);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i6 = 0; i6 < size; i6++) {
            parcel.writeInt(sparseArray.keyAt(i6));
            Parcel valueAt = sparseArray.valueAt(i6);
            if (valueAt != null) {
                parcel.writeInt(valueAt.dataSize());
                parcel.appendFrom(valueAt, 0, valueAt.dataSize());
            } else {
                parcel.writeInt(0);
            }
        }
        zzb(parcel, zza);
    }

    public static void writeParcelable(@o0 Parcel parcel, int i5, @o0 Parcelable parcelable, int i6, boolean z5) {
        if (parcelable == null) {
            if (z5) {
                zzc(parcel, i5, 0);
            }
        } else {
            int zza = zza(parcel, i5);
            parcelable.writeToParcel(parcel, i6);
            zzb(parcel, zza);
        }
    }

    public static void writePendingIntent(@o0 Parcel parcel, int i5, @o0 PendingIntent pendingIntent, boolean z5) {
        if (pendingIntent == null) {
            if (z5) {
                zzc(parcel, i5, 0);
            }
        } else {
            int zza = zza(parcel, i5);
            PendingIntent.writePendingIntentOrNullToParcel(pendingIntent, parcel);
            zzb(parcel, zza);
        }
    }

    public static void writeShort(@o0 Parcel parcel, int i5, short s5) {
        zzc(parcel, i5, 4);
        parcel.writeInt(s5);
    }

    public static void writeSparseBooleanArray(@o0 Parcel parcel, int i5, @o0 SparseBooleanArray sparseBooleanArray, boolean z5) {
        if (sparseBooleanArray == null) {
            if (z5) {
                zzc(parcel, i5, 0);
            }
        } else {
            int zza = zza(parcel, i5);
            parcel.writeSparseBooleanArray(sparseBooleanArray);
            zzb(parcel, zza);
        }
    }

    public static void writeSparseIntArray(@o0 Parcel parcel, int i5, @o0 SparseIntArray sparseIntArray, boolean z5) {
        if (sparseIntArray == null) {
            if (z5) {
                zzc(parcel, i5, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i5);
        int size = sparseIntArray.size();
        parcel.writeInt(size);
        for (int i6 = 0; i6 < size; i6++) {
            parcel.writeInt(sparseIntArray.keyAt(i6));
            parcel.writeInt(sparseIntArray.valueAt(i6));
        }
        zzb(parcel, zza);
    }

    public static void writeSparseLongArray(@o0 Parcel parcel, int i5, @o0 SparseLongArray sparseLongArray, boolean z5) {
        if (sparseLongArray == null) {
            if (z5) {
                zzc(parcel, i5, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i5);
        int size = sparseLongArray.size();
        parcel.writeInt(size);
        for (int i6 = 0; i6 < size; i6++) {
            parcel.writeInt(sparseLongArray.keyAt(i6));
            parcel.writeLong(sparseLongArray.valueAt(i6));
        }
        zzb(parcel, zza);
    }

    public static void writeString(@o0 Parcel parcel, int i5, @o0 String str, boolean z5) {
        if (str == null) {
            if (z5) {
                zzc(parcel, i5, 0);
            }
        } else {
            int zza = zza(parcel, i5);
            parcel.writeString(str);
            zzb(parcel, zza);
        }
    }

    public static void writeStringArray(@o0 Parcel parcel, int i5, @o0 String[] strArr, boolean z5) {
        if (strArr == null) {
            if (z5) {
                zzc(parcel, i5, 0);
            }
        } else {
            int zza = zza(parcel, i5);
            parcel.writeStringArray(strArr);
            zzb(parcel, zza);
        }
    }

    public static void writeStringList(@o0 Parcel parcel, int i5, @o0 List<String> list, boolean z5) {
        if (list == null) {
            if (z5) {
                zzc(parcel, i5, 0);
            }
        } else {
            int zza = zza(parcel, i5);
            parcel.writeStringList(list);
            zzb(parcel, zza);
        }
    }

    public static void writeStringSparseArray(@o0 Parcel parcel, int i5, @o0 SparseArray<String> sparseArray, boolean z5) {
        if (sparseArray == null) {
            if (z5) {
                zzc(parcel, i5, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i5);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i6 = 0; i6 < size; i6++) {
            parcel.writeInt(sparseArray.keyAt(i6));
            parcel.writeString(sparseArray.valueAt(i6));
        }
        zzb(parcel, zza);
    }

    public static <T extends Parcelable> void writeTypedArray(@o0 Parcel parcel, int i5, @o0 T[] tArr, int i6, boolean z5) {
        if (tArr == null) {
            if (z5) {
                zzc(parcel, i5, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i5);
        parcel.writeInt(tArr.length);
        for (T t5 : tArr) {
            if (t5 == null) {
                parcel.writeInt(0);
            } else {
                zzd(parcel, t5, i6);
            }
        }
        zzb(parcel, zza);
    }

    public static <T extends Parcelable> void writeTypedList(@o0 Parcel parcel, int i5, @o0 List<T> list, boolean z5) {
        if (list == null) {
            if (z5) {
                zzc(parcel, i5, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i5);
        int size = list.size();
        parcel.writeInt(size);
        for (int i6 = 0; i6 < size; i6++) {
            T t5 = list.get(i6);
            if (t5 == null) {
                parcel.writeInt(0);
            } else {
                zzd(parcel, t5, 0);
            }
        }
        zzb(parcel, zza);
    }

    public static <T extends Parcelable> void writeTypedSparseArray(@o0 Parcel parcel, int i5, @o0 SparseArray<T> sparseArray, boolean z5) {
        if (sparseArray == null) {
            if (z5) {
                zzc(parcel, i5, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i5);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i6 = 0; i6 < size; i6++) {
            parcel.writeInt(sparseArray.keyAt(i6));
            T valueAt = sparseArray.valueAt(i6);
            if (valueAt == null) {
                parcel.writeInt(0);
            } else {
                zzd(parcel, valueAt, 0);
            }
        }
        zzb(parcel, zza);
    }

    private static int zza(Parcel parcel, int i5) {
        parcel.writeInt(i5 | a.f29111c);
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    private static void zzb(Parcel parcel, int i5) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i5 - 4);
        parcel.writeInt(dataPosition - i5);
        parcel.setDataPosition(dataPosition);
    }

    private static void zzc(Parcel parcel, int i5, int i6) {
        parcel.writeInt(i5 | (i6 << 16));
    }

    private static void zzd(Parcel parcel, Parcelable parcelable, int i5) {
        int dataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int dataPosition2 = parcel.dataPosition();
        parcelable.writeToParcel(parcel, i5);
        int dataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(dataPosition);
        parcel.writeInt(dataPosition3 - dataPosition2);
        parcel.setDataPosition(dataPosition3);
    }
}
