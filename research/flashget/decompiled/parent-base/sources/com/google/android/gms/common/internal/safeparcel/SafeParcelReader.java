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
import androidx.fragment.app.k0;
import c1.a;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* loaded from: classes5.dex */
public class SafeParcelReader {

    /* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
    public static class ParseException extends RuntimeException {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public ParseException(@androidx.annotation.o0 java.lang.String r5, @androidx.annotation.o0 android.os.Parcel r6) {
            /*
                r4 = this;
                int r0 = r6.dataPosition()
                int r6 = r6.dataSize()
                java.lang.String r1 = java.lang.String.valueOf(r5)
                int r1 = r1.length()
                java.lang.String r2 = java.lang.String.valueOf(r0)
                int r2 = r2.length()
                java.lang.String r3 = java.lang.String.valueOf(r6)
                int r3 = r3.length()
                int r1 = r1 + 13
                int r1 = r1 + r2
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                int r1 = r1 + 6
                int r1 = r1 + r3
                r2.<init>(r1)
                r2.append(r5)
                java.lang.String r5 = "쬎"
                java.lang.String r5 = com.flashget.parentalcontrol.ProtectedSandApp.s(r5)
                r2.append(r5)
                r2.append(r0)
                java.lang.String r5 = "쬏"
                java.lang.String r5 = com.flashget.parentalcontrol.ProtectedSandApp.s(r5)
                r2.append(r5)
                r2.append(r6)
                java.lang.String r5 = r2.toString()
                r4.<init>(r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException.<init>(java.lang.String, android.os.Parcel):void");
        }
    }

    private SafeParcelReader() {
    }

    @o0
    public static BigDecimal createBigDecimal(@o0 Parcel parcel, int i4) {
        int readSize = readSize(parcel, i4);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        int readInt = parcel.readInt();
        parcel.setDataPosition(dataPosition + readSize);
        return new BigDecimal(new BigInteger(createByteArray), readInt);
    }

    @o0
    public static BigDecimal[] createBigDecimalArray(@o0 Parcel parcel, int i4) {
        int readSize = readSize(parcel, i4);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        BigDecimal[] bigDecimalArr = new BigDecimal[readInt];
        for (int i5 = 0; i5 < readInt; i5++) {
            byte[] createByteArray = parcel.createByteArray();
            bigDecimalArr[i5] = new BigDecimal(new BigInteger(createByteArray), parcel.readInt());
        }
        parcel.setDataPosition(dataPosition + readSize);
        return bigDecimalArr;
    }

    @o0
    public static BigInteger createBigInteger(@o0 Parcel parcel, int i4) {
        int readSize = readSize(parcel, i4);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + readSize);
        return new BigInteger(createByteArray);
    }

    @o0
    public static BigInteger[] createBigIntegerArray(@o0 Parcel parcel, int i4) {
        int readSize = readSize(parcel, i4);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        BigInteger[] bigIntegerArr = new BigInteger[readInt];
        for (int i5 = 0; i5 < readInt; i5++) {
            bigIntegerArr[i5] = new BigInteger(parcel.createByteArray());
        }
        parcel.setDataPosition(dataPosition + readSize);
        return bigIntegerArr;
    }

    @o0
    public static boolean[] createBooleanArray(@o0 Parcel parcel, int i4) {
        int readSize = readSize(parcel, i4);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return null;
        }
        boolean[] createBooleanArray = parcel.createBooleanArray();
        parcel.setDataPosition(dataPosition + readSize);
        return createBooleanArray;
    }

    @o0
    public static ArrayList<Boolean> createBooleanList(@o0 Parcel parcel, int i4) {
        int readSize = readSize(parcel, i4);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return null;
        }
        ArrayList<Boolean> arrayList = new ArrayList<>();
        int readInt = parcel.readInt();
        for (int i5 = 0; i5 < readInt; i5++) {
            arrayList.add(Boolean.valueOf(parcel.readInt() != 0));
        }
        parcel.setDataPosition(dataPosition + readSize);
        return arrayList;
    }

    @o0
    public static Bundle createBundle(@o0 Parcel parcel, int i4) {
        int readSize = readSize(parcel, i4);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + readSize);
        return readBundle;
    }

    @o0
    public static byte[] createByteArray(@o0 Parcel parcel, int i4) {
        int readSize = readSize(parcel, i4);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + readSize);
        return createByteArray;
    }

    @o0
    public static byte[][] createByteArrayArray(@o0 Parcel parcel, int i4) {
        int readSize = readSize(parcel, i4);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        byte[][] bArr = new byte[readInt][];
        for (int i5 = 0; i5 < readInt; i5++) {
            bArr[i5] = parcel.createByteArray();
        }
        parcel.setDataPosition(dataPosition + readSize);
        return bArr;
    }

    @o0
    public static SparseArray<byte[]> createByteArraySparseArray(@o0 Parcel parcel, int i4) {
        int readSize = readSize(parcel, i4);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        SparseArray<byte[]> sparseArray = new SparseArray<>(readInt);
        for (int i5 = 0; i5 < readInt; i5++) {
            sparseArray.append(parcel.readInt(), parcel.createByteArray());
        }
        parcel.setDataPosition(dataPosition + readSize);
        return sparseArray;
    }

    @o0
    public static char[] createCharArray(@o0 Parcel parcel, int i4) {
        int readSize = readSize(parcel, i4);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return null;
        }
        char[] createCharArray = parcel.createCharArray();
        parcel.setDataPosition(dataPosition + readSize);
        return createCharArray;
    }

    @o0
    public static double[] createDoubleArray(@o0 Parcel parcel, int i4) {
        int readSize = readSize(parcel, i4);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return null;
        }
        double[] createDoubleArray = parcel.createDoubleArray();
        parcel.setDataPosition(dataPosition + readSize);
        return createDoubleArray;
    }

    @o0
    public static ArrayList<Double> createDoubleList(@o0 Parcel parcel, int i4) {
        int readSize = readSize(parcel, i4);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return null;
        }
        ArrayList<Double> arrayList = new ArrayList<>();
        int readInt = parcel.readInt();
        for (int i5 = 0; i5 < readInt; i5++) {
            arrayList.add(Double.valueOf(parcel.readDouble()));
        }
        parcel.setDataPosition(dataPosition + readSize);
        return arrayList;
    }

    @o0
    public static SparseArray<Double> createDoubleSparseArray(@o0 Parcel parcel, int i4) {
        int readSize = readSize(parcel, i4);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return null;
        }
        SparseArray<Double> sparseArray = new SparseArray<>();
        int readInt = parcel.readInt();
        for (int i5 = 0; i5 < readInt; i5++) {
            sparseArray.append(parcel.readInt(), Double.valueOf(parcel.readDouble()));
        }
        parcel.setDataPosition(dataPosition + readSize);
        return sparseArray;
    }

    @o0
    public static float[] createFloatArray(@o0 Parcel parcel, int i4) {
        int readSize = readSize(parcel, i4);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return null;
        }
        float[] createFloatArray = parcel.createFloatArray();
        parcel.setDataPosition(dataPosition + readSize);
        return createFloatArray;
    }

    @o0
    public static ArrayList<Float> createFloatList(@o0 Parcel parcel, int i4) {
        int readSize = readSize(parcel, i4);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return null;
        }
        ArrayList<Float> arrayList = new ArrayList<>();
        int readInt = parcel.readInt();
        for (int i5 = 0; i5 < readInt; i5++) {
            arrayList.add(Float.valueOf(parcel.readFloat()));
        }
        parcel.setDataPosition(dataPosition + readSize);
        return arrayList;
    }

    @o0
    public static SparseArray<Float> createFloatSparseArray(@o0 Parcel parcel, int i4) {
        int readSize = readSize(parcel, i4);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return null;
        }
        SparseArray<Float> sparseArray = new SparseArray<>();
        int readInt = parcel.readInt();
        for (int i5 = 0; i5 < readInt; i5++) {
            sparseArray.append(parcel.readInt(), Float.valueOf(parcel.readFloat()));
        }
        parcel.setDataPosition(dataPosition + readSize);
        return sparseArray;
    }

    @o0
    public static IBinder[] createIBinderArray(@o0 Parcel parcel, int i4) {
        int readSize = readSize(parcel, i4);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return null;
        }
        IBinder[] createBinderArray = parcel.createBinderArray();
        parcel.setDataPosition(dataPosition + readSize);
        return createBinderArray;
    }

    @o0
    public static ArrayList<IBinder> createIBinderList(@o0 Parcel parcel, int i4) {
        int readSize = readSize(parcel, i4);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return null;
        }
        ArrayList<IBinder> createBinderArrayList = parcel.createBinderArrayList();
        parcel.setDataPosition(dataPosition + readSize);
        return createBinderArrayList;
    }

    @o0
    public static SparseArray<IBinder> createIBinderSparseArray(@o0 Parcel parcel, int i4) {
        int readSize = readSize(parcel, i4);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        SparseArray<IBinder> sparseArray = new SparseArray<>(readInt);
        for (int i5 = 0; i5 < readInt; i5++) {
            sparseArray.append(parcel.readInt(), parcel.readStrongBinder());
        }
        parcel.setDataPosition(dataPosition + readSize);
        return sparseArray;
    }

    @o0
    public static int[] createIntArray(@o0 Parcel parcel, int i4) {
        int readSize = readSize(parcel, i4);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return null;
        }
        int[] createIntArray = parcel.createIntArray();
        parcel.setDataPosition(dataPosition + readSize);
        return createIntArray;
    }

    @o0
    public static ArrayList<Integer> createIntegerList(@o0 Parcel parcel, int i4) {
        int readSize = readSize(parcel, i4);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return null;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        int readInt = parcel.readInt();
        for (int i5 = 0; i5 < readInt; i5++) {
            arrayList.add(Integer.valueOf(parcel.readInt()));
        }
        parcel.setDataPosition(dataPosition + readSize);
        return arrayList;
    }

    @o0
    public static long[] createLongArray(@o0 Parcel parcel, int i4) {
        int readSize = readSize(parcel, i4);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return null;
        }
        long[] createLongArray = parcel.createLongArray();
        parcel.setDataPosition(dataPosition + readSize);
        return createLongArray;
    }

    @o0
    public static ArrayList<Long> createLongList(@o0 Parcel parcel, int i4) {
        int readSize = readSize(parcel, i4);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return null;
        }
        ArrayList<Long> arrayList = new ArrayList<>();
        int readInt = parcel.readInt();
        for (int i5 = 0; i5 < readInt; i5++) {
            arrayList.add(Long.valueOf(parcel.readLong()));
        }
        parcel.setDataPosition(dataPosition + readSize);
        return arrayList;
    }

    @o0
    public static Parcel createParcel(@o0 Parcel parcel, int i4) {
        int readSize = readSize(parcel, i4);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        obtain.appendFrom(parcel, dataPosition, readSize);
        parcel.setDataPosition(dataPosition + readSize);
        return obtain;
    }

    @o0
    public static Parcel[] createParcelArray(@o0 Parcel parcel, int i4) {
        int readSize = readSize(parcel, i4);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        Parcel[] parcelArr = new Parcel[readInt];
        for (int i5 = 0; i5 < readInt; i5++) {
            int readInt2 = parcel.readInt();
            if (readInt2 != 0) {
                int dataPosition2 = parcel.dataPosition();
                Parcel obtain = Parcel.obtain();
                obtain.appendFrom(parcel, dataPosition2, readInt2);
                parcelArr[i5] = obtain;
                parcel.setDataPosition(dataPosition2 + readInt2);
            } else {
                parcelArr[i5] = null;
            }
        }
        parcel.setDataPosition(dataPosition + readSize);
        return parcelArr;
    }

    @o0
    public static ArrayList<Parcel> createParcelList(@o0 Parcel parcel, int i4) {
        int readSize = readSize(parcel, i4);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        ArrayList<Parcel> arrayList = new ArrayList<>();
        for (int i5 = 0; i5 < readInt; i5++) {
            int readInt2 = parcel.readInt();
            if (readInt2 != 0) {
                int dataPosition2 = parcel.dataPosition();
                Parcel obtain = Parcel.obtain();
                obtain.appendFrom(parcel, dataPosition2, readInt2);
                arrayList.add(obtain);
                parcel.setDataPosition(dataPosition2 + readInt2);
            } else {
                arrayList.add(null);
            }
        }
        parcel.setDataPosition(dataPosition + readSize);
        return arrayList;
    }

    @o0
    public static SparseArray<Parcel> createParcelSparseArray(@o0 Parcel parcel, int i4) {
        int readSize = readSize(parcel, i4);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        SparseArray<Parcel> sparseArray = new SparseArray<>();
        for (int i5 = 0; i5 < readInt; i5++) {
            int readInt2 = parcel.readInt();
            int readInt3 = parcel.readInt();
            if (readInt3 != 0) {
                int dataPosition2 = parcel.dataPosition();
                Parcel obtain = Parcel.obtain();
                obtain.appendFrom(parcel, dataPosition2, readInt3);
                sparseArray.append(readInt2, obtain);
                parcel.setDataPosition(dataPosition2 + readInt3);
            } else {
                sparseArray.append(readInt2, null);
            }
        }
        parcel.setDataPosition(dataPosition + readSize);
        return sparseArray;
    }

    @o0
    public static <T extends Parcelable> T createParcelable(@o0 Parcel parcel, int i4, @o0 Parcelable.Creator<T> creator) {
        int readSize = readSize(parcel, i4);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return null;
        }
        T createFromParcel = creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + readSize);
        return createFromParcel;
    }

    @o0
    public static SparseBooleanArray createSparseBooleanArray(@o0 Parcel parcel, int i4) {
        int readSize = readSize(parcel, i4);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return null;
        }
        SparseBooleanArray readSparseBooleanArray = parcel.readSparseBooleanArray();
        parcel.setDataPosition(dataPosition + readSize);
        return readSparseBooleanArray;
    }

    @o0
    public static SparseIntArray createSparseIntArray(@o0 Parcel parcel, int i4) {
        int readSize = readSize(parcel, i4);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return null;
        }
        SparseIntArray sparseIntArray = new SparseIntArray();
        int readInt = parcel.readInt();
        for (int i5 = 0; i5 < readInt; i5++) {
            sparseIntArray.append(parcel.readInt(), parcel.readInt());
        }
        parcel.setDataPosition(dataPosition + readSize);
        return sparseIntArray;
    }

    @o0
    public static SparseLongArray createSparseLongArray(@o0 Parcel parcel, int i4) {
        int readSize = readSize(parcel, i4);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return null;
        }
        SparseLongArray sparseLongArray = new SparseLongArray();
        int readInt = parcel.readInt();
        for (int i5 = 0; i5 < readInt; i5++) {
            sparseLongArray.append(parcel.readInt(), parcel.readLong());
        }
        parcel.setDataPosition(dataPosition + readSize);
        return sparseLongArray;
    }

    @o0
    public static String createString(@o0 Parcel parcel, int i4) {
        int readSize = readSize(parcel, i4);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + readSize);
        return readString;
    }

    @o0
    public static String[] createStringArray(@o0 Parcel parcel, int i4) {
        int readSize = readSize(parcel, i4);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return null;
        }
        String[] createStringArray = parcel.createStringArray();
        parcel.setDataPosition(dataPosition + readSize);
        return createStringArray;
    }

    @o0
    public static ArrayList<String> createStringList(@o0 Parcel parcel, int i4) {
        int readSize = readSize(parcel, i4);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return null;
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(dataPosition + readSize);
        return createStringArrayList;
    }

    @o0
    public static SparseArray<String> createStringSparseArray(@o0 Parcel parcel, int i4) {
        int readSize = readSize(parcel, i4);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return null;
        }
        SparseArray<String> sparseArray = new SparseArray<>();
        int readInt = parcel.readInt();
        for (int i5 = 0; i5 < readInt; i5++) {
            sparseArray.append(parcel.readInt(), parcel.readString());
        }
        parcel.setDataPosition(dataPosition + readSize);
        return sparseArray;
    }

    @o0
    public static <T> T[] createTypedArray(@o0 Parcel parcel, int i4, @o0 Parcelable.Creator<T> creator) {
        int readSize = readSize(parcel, i4);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return null;
        }
        T[] tArr = (T[]) parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + readSize);
        return tArr;
    }

    @o0
    public static <T> ArrayList<T> createTypedList(@o0 Parcel parcel, int i4, @o0 Parcelable.Creator<T> creator) {
        int readSize = readSize(parcel, i4);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return null;
        }
        ArrayList<T> createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(dataPosition + readSize);
        return createTypedArrayList;
    }

    @o0
    public static <T> SparseArray<T> createTypedSparseArray(@o0 Parcel parcel, int i4, @o0 Parcelable.Creator<T> creator) {
        int readSize = readSize(parcel, i4);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        SparseArray<T> sparseArray = new SparseArray<>();
        for (int i5 = 0; i5 < readInt; i5++) {
            sparseArray.append(parcel.readInt(), parcel.readInt() != 0 ? creator.createFromParcel(parcel) : null);
        }
        parcel.setDataPosition(dataPosition + readSize);
        return sparseArray;
    }

    public static void ensureAtEnd(@o0 Parcel parcel, int i4) {
        if (parcel.dataPosition() == i4) {
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i4).length() + 26);
        sb.append(ProtectedSandApp.s("쬐"));
        sb.append(i4);
        throw new ParseException(sb.toString(), parcel);
    }

    public static int getFieldId(int i4) {
        return (char) i4;
    }

    public static boolean readBoolean(@o0 Parcel parcel, int i4) {
        zza(parcel, i4, 4);
        return parcel.readInt() != 0;
    }

    @o0
    public static Boolean readBooleanObject(@o0 Parcel parcel, int i4) {
        int readSize = readSize(parcel, i4);
        if (readSize == 0) {
            return null;
        }
        zzb(parcel, i4, readSize, 4);
        return Boolean.valueOf(parcel.readInt() != 0);
    }

    public static byte readByte(@o0 Parcel parcel, int i4) {
        zza(parcel, i4, 4);
        return (byte) parcel.readInt();
    }

    public static char readChar(@o0 Parcel parcel, int i4) {
        zza(parcel, i4, 4);
        return (char) parcel.readInt();
    }

    public static double readDouble(@o0 Parcel parcel, int i4) {
        zza(parcel, i4, 8);
        return parcel.readDouble();
    }

    @o0
    public static Double readDoubleObject(@o0 Parcel parcel, int i4) {
        int readSize = readSize(parcel, i4);
        if (readSize == 0) {
            return null;
        }
        zzb(parcel, i4, readSize, 8);
        return Double.valueOf(parcel.readDouble());
    }

    public static float readFloat(@o0 Parcel parcel, int i4) {
        zza(parcel, i4, 4);
        return parcel.readFloat();
    }

    @o0
    public static Float readFloatObject(@o0 Parcel parcel, int i4) {
        int readSize = readSize(parcel, i4);
        if (readSize == 0) {
            return null;
        }
        zzb(parcel, i4, readSize, 4);
        return Float.valueOf(parcel.readFloat());
    }

    public static int readHeader(@o0 Parcel parcel) {
        return parcel.readInt();
    }

    @o0
    public static IBinder readIBinder(@o0 Parcel parcel, int i4) {
        int readSize = readSize(parcel, i4);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + readSize);
        return readStrongBinder;
    }

    public static int readInt(@o0 Parcel parcel, int i4) {
        zza(parcel, i4, 4);
        return parcel.readInt();
    }

    @o0
    public static Integer readIntegerObject(@o0 Parcel parcel, int i4) {
        int readSize = readSize(parcel, i4);
        if (readSize == 0) {
            return null;
        }
        zzb(parcel, i4, readSize, 4);
        return Integer.valueOf(parcel.readInt());
    }

    public static void readList(@o0 Parcel parcel, int i4, @o0 List list, @o0 ClassLoader classLoader) {
        int readSize = readSize(parcel, i4);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return;
        }
        parcel.readList(list, classLoader);
        parcel.setDataPosition(dataPosition + readSize);
    }

    public static long readLong(@o0 Parcel parcel, int i4) {
        zza(parcel, i4, 8);
        return parcel.readLong();
    }

    @o0
    public static Long readLongObject(@o0 Parcel parcel, int i4) {
        int readSize = readSize(parcel, i4);
        if (readSize == 0) {
            return null;
        }
        zzb(parcel, i4, readSize, 8);
        return Long.valueOf(parcel.readLong());
    }

    @o0
    public static PendingIntent readPendingIntent(@o0 Parcel parcel, int i4) {
        int readSize = readSize(parcel, i4);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return null;
        }
        PendingIntent readPendingIntentOrNullFromParcel = PendingIntent.readPendingIntentOrNullFromParcel(parcel);
        parcel.setDataPosition(dataPosition + readSize);
        return readPendingIntentOrNullFromParcel;
    }

    public static short readShort(@o0 Parcel parcel, int i4) {
        zza(parcel, i4, 4);
        return (short) parcel.readInt();
    }

    public static int readSize(@o0 Parcel parcel, int i4) {
        return (i4 & a.f38447c) != -65536 ? (char) (i4 >> 16) : parcel.readInt();
    }

    public static void skipUnknownField(@o0 Parcel parcel, int i4) {
        parcel.setDataPosition(parcel.dataPosition() + readSize(parcel, i4));
    }

    public static int validateObjectHeader(@o0 Parcel parcel) {
        int readHeader = readHeader(parcel);
        int readSize = readSize(parcel, readHeader);
        int fieldId = getFieldId(readHeader);
        int dataPosition = parcel.dataPosition();
        if (fieldId != 20293) {
            throw new ParseException(ProtectedSandApp.s("쬓").concat(String.valueOf(Integer.toHexString(readHeader))), parcel);
        }
        int i4 = readSize + dataPosition;
        if (i4 >= dataPosition && i4 <= parcel.dataSize()) {
            return i4;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(dataPosition).length() + 32 + String.valueOf(i4).length());
        sb.append(ProtectedSandApp.s("쬑"));
        sb.append(dataPosition);
        sb.append(ProtectedSandApp.s("쬒"));
        sb.append(i4);
        throw new ParseException(sb.toString(), parcel);
    }

    private static void zza(Parcel parcel, int i4, int i5) {
        int readSize = readSize(parcel, i4);
        if (readSize == i5) {
            return;
        }
        String hexString = Integer.toHexString(readSize);
        int length = String.valueOf(i5).length();
        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + length + 19 + String.valueOf(readSize).length() + 4 + 1);
        sb.append(ProtectedSandApp.s("쬔"));
        sb.append(i5);
        sb.append(ProtectedSandApp.s("쬕"));
        sb.append(readSize);
        throw new ParseException(k0.a(sb, ProtectedSandApp.s("쬖"), hexString, ProtectedSandApp.s("쬗")), parcel);
    }

    private static void zzb(Parcel parcel, int i4, int i5, int i6) {
        if (i5 == i6) {
            return;
        }
        String hexString = Integer.toHexString(i5);
        int length = String.valueOf(i6).length();
        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + length + 19 + String.valueOf(i5).length() + 4 + 1);
        sb.append(ProtectedSandApp.s("쬔"));
        sb.append(i6);
        sb.append(ProtectedSandApp.s("쬕"));
        sb.append(i5);
        throw new ParseException(k0.a(sb, ProtectedSandApp.s("쬖"), hexString, ProtectedSandApp.s("쬗")), parcel);
    }
}
