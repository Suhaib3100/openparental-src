package com.google.android.gms.common.internal.safeparcel;

import android.app.PendingIntent;
import android.content.preferences.protobuf.v;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.util.SparseLongArray;
import androidx.annotation.o0;
import androidx.appcompat.view.menu.s;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import m.a;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes2.dex */
public class SafeParcelReader {

    /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    public static class ParseException extends RuntimeException {
        public ParseException(@o0 String str, @o0 Parcel parcel) {
            super(str + ProtectedSandApp.s("\u0b91") + parcel.dataPosition() + ProtectedSandApp.s("ஒ") + parcel.dataSize());
        }
    }

    private SafeParcelReader() {
    }

    @o0
    public static BigDecimal createBigDecimal(@o0 Parcel parcel, int i5) {
        int readSize = readSize(parcel, i5);
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
    public static BigDecimal[] createBigDecimalArray(@o0 Parcel parcel, int i5) {
        int readSize = readSize(parcel, i5);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        BigDecimal[] bigDecimalArr = new BigDecimal[readInt];
        for (int i6 = 0; i6 < readInt; i6++) {
            byte[] createByteArray = parcel.createByteArray();
            bigDecimalArr[i6] = new BigDecimal(new BigInteger(createByteArray), parcel.readInt());
        }
        parcel.setDataPosition(dataPosition + readSize);
        return bigDecimalArr;
    }

    @o0
    public static BigInteger createBigInteger(@o0 Parcel parcel, int i5) {
        int readSize = readSize(parcel, i5);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + readSize);
        return new BigInteger(createByteArray);
    }

    @o0
    public static BigInteger[] createBigIntegerArray(@o0 Parcel parcel, int i5) {
        int readSize = readSize(parcel, i5);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        BigInteger[] bigIntegerArr = new BigInteger[readInt];
        for (int i6 = 0; i6 < readInt; i6++) {
            bigIntegerArr[i6] = new BigInteger(parcel.createByteArray());
        }
        parcel.setDataPosition(dataPosition + readSize);
        return bigIntegerArr;
    }

    @o0
    public static boolean[] createBooleanArray(@o0 Parcel parcel, int i5) {
        int readSize = readSize(parcel, i5);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return null;
        }
        boolean[] createBooleanArray = parcel.createBooleanArray();
        parcel.setDataPosition(dataPosition + readSize);
        return createBooleanArray;
    }

    @o0
    public static ArrayList<Boolean> createBooleanList(@o0 Parcel parcel, int i5) {
        int readSize = readSize(parcel, i5);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return null;
        }
        ArrayList<Boolean> arrayList = new ArrayList<>();
        int readInt = parcel.readInt();
        for (int i6 = 0; i6 < readInt; i6++) {
            arrayList.add(Boolean.valueOf(parcel.readInt() != 0));
        }
        parcel.setDataPosition(dataPosition + readSize);
        return arrayList;
    }

    @o0
    public static Bundle createBundle(@o0 Parcel parcel, int i5) {
        int readSize = readSize(parcel, i5);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + readSize);
        return readBundle;
    }

    @o0
    public static byte[] createByteArray(@o0 Parcel parcel, int i5) {
        int readSize = readSize(parcel, i5);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + readSize);
        return createByteArray;
    }

    @o0
    public static byte[][] createByteArrayArray(@o0 Parcel parcel, int i5) {
        int readSize = readSize(parcel, i5);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        byte[][] bArr = new byte[readInt][];
        for (int i6 = 0; i6 < readInt; i6++) {
            bArr[i6] = parcel.createByteArray();
        }
        parcel.setDataPosition(dataPosition + readSize);
        return bArr;
    }

    @o0
    public static SparseArray<byte[]> createByteArraySparseArray(@o0 Parcel parcel, int i5) {
        int readSize = readSize(parcel, i5);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        SparseArray<byte[]> sparseArray = new SparseArray<>(readInt);
        for (int i6 = 0; i6 < readInt; i6++) {
            sparseArray.append(parcel.readInt(), parcel.createByteArray());
        }
        parcel.setDataPosition(dataPosition + readSize);
        return sparseArray;
    }

    @o0
    public static char[] createCharArray(@o0 Parcel parcel, int i5) {
        int readSize = readSize(parcel, i5);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return null;
        }
        char[] createCharArray = parcel.createCharArray();
        parcel.setDataPosition(dataPosition + readSize);
        return createCharArray;
    }

    @o0
    public static double[] createDoubleArray(@o0 Parcel parcel, int i5) {
        int readSize = readSize(parcel, i5);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return null;
        }
        double[] createDoubleArray = parcel.createDoubleArray();
        parcel.setDataPosition(dataPosition + readSize);
        return createDoubleArray;
    }

    @o0
    public static ArrayList<Double> createDoubleList(@o0 Parcel parcel, int i5) {
        int readSize = readSize(parcel, i5);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return null;
        }
        ArrayList<Double> arrayList = new ArrayList<>();
        int readInt = parcel.readInt();
        for (int i6 = 0; i6 < readInt; i6++) {
            arrayList.add(Double.valueOf(parcel.readDouble()));
        }
        parcel.setDataPosition(dataPosition + readSize);
        return arrayList;
    }

    @o0
    public static SparseArray<Double> createDoubleSparseArray(@o0 Parcel parcel, int i5) {
        int readSize = readSize(parcel, i5);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return null;
        }
        SparseArray<Double> sparseArray = new SparseArray<>();
        int readInt = parcel.readInt();
        for (int i6 = 0; i6 < readInt; i6++) {
            sparseArray.append(parcel.readInt(), Double.valueOf(parcel.readDouble()));
        }
        parcel.setDataPosition(dataPosition + readSize);
        return sparseArray;
    }

    @o0
    public static float[] createFloatArray(@o0 Parcel parcel, int i5) {
        int readSize = readSize(parcel, i5);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return null;
        }
        float[] createFloatArray = parcel.createFloatArray();
        parcel.setDataPosition(dataPosition + readSize);
        return createFloatArray;
    }

    @o0
    public static ArrayList<Float> createFloatList(@o0 Parcel parcel, int i5) {
        int readSize = readSize(parcel, i5);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return null;
        }
        ArrayList<Float> arrayList = new ArrayList<>();
        int readInt = parcel.readInt();
        for (int i6 = 0; i6 < readInt; i6++) {
            arrayList.add(Float.valueOf(parcel.readFloat()));
        }
        parcel.setDataPosition(dataPosition + readSize);
        return arrayList;
    }

    @o0
    public static SparseArray<Float> createFloatSparseArray(@o0 Parcel parcel, int i5) {
        int readSize = readSize(parcel, i5);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return null;
        }
        SparseArray<Float> sparseArray = new SparseArray<>();
        int readInt = parcel.readInt();
        for (int i6 = 0; i6 < readInt; i6++) {
            sparseArray.append(parcel.readInt(), Float.valueOf(parcel.readFloat()));
        }
        parcel.setDataPosition(dataPosition + readSize);
        return sparseArray;
    }

    @o0
    public static IBinder[] createIBinderArray(@o0 Parcel parcel, int i5) {
        int readSize = readSize(parcel, i5);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return null;
        }
        IBinder[] createBinderArray = parcel.createBinderArray();
        parcel.setDataPosition(dataPosition + readSize);
        return createBinderArray;
    }

    @o0
    public static ArrayList<IBinder> createIBinderList(@o0 Parcel parcel, int i5) {
        int readSize = readSize(parcel, i5);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return null;
        }
        ArrayList<IBinder> createBinderArrayList = parcel.createBinderArrayList();
        parcel.setDataPosition(dataPosition + readSize);
        return createBinderArrayList;
    }

    @o0
    public static SparseArray<IBinder> createIBinderSparseArray(@o0 Parcel parcel, int i5) {
        int readSize = readSize(parcel, i5);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        SparseArray<IBinder> sparseArray = new SparseArray<>(readInt);
        for (int i6 = 0; i6 < readInt; i6++) {
            sparseArray.append(parcel.readInt(), parcel.readStrongBinder());
        }
        parcel.setDataPosition(dataPosition + readSize);
        return sparseArray;
    }

    @o0
    public static int[] createIntArray(@o0 Parcel parcel, int i5) {
        int readSize = readSize(parcel, i5);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return null;
        }
        int[] createIntArray = parcel.createIntArray();
        parcel.setDataPosition(dataPosition + readSize);
        return createIntArray;
    }

    @o0
    public static ArrayList<Integer> createIntegerList(@o0 Parcel parcel, int i5) {
        int readSize = readSize(parcel, i5);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return null;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        int readInt = parcel.readInt();
        for (int i6 = 0; i6 < readInt; i6++) {
            arrayList.add(Integer.valueOf(parcel.readInt()));
        }
        parcel.setDataPosition(dataPosition + readSize);
        return arrayList;
    }

    @o0
    public static long[] createLongArray(@o0 Parcel parcel, int i5) {
        int readSize = readSize(parcel, i5);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return null;
        }
        long[] createLongArray = parcel.createLongArray();
        parcel.setDataPosition(dataPosition + readSize);
        return createLongArray;
    }

    @o0
    public static ArrayList<Long> createLongList(@o0 Parcel parcel, int i5) {
        int readSize = readSize(parcel, i5);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return null;
        }
        ArrayList<Long> arrayList = new ArrayList<>();
        int readInt = parcel.readInt();
        for (int i6 = 0; i6 < readInt; i6++) {
            arrayList.add(Long.valueOf(parcel.readLong()));
        }
        parcel.setDataPosition(dataPosition + readSize);
        return arrayList;
    }

    @o0
    public static Parcel createParcel(@o0 Parcel parcel, int i5) {
        int readSize = readSize(parcel, i5);
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
    public static Parcel[] createParcelArray(@o0 Parcel parcel, int i5) {
        int readSize = readSize(parcel, i5);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        Parcel[] parcelArr = new Parcel[readInt];
        for (int i6 = 0; i6 < readInt; i6++) {
            int readInt2 = parcel.readInt();
            if (readInt2 != 0) {
                int dataPosition2 = parcel.dataPosition();
                Parcel obtain = Parcel.obtain();
                obtain.appendFrom(parcel, dataPosition2, readInt2);
                parcelArr[i6] = obtain;
                parcel.setDataPosition(dataPosition2 + readInt2);
            } else {
                parcelArr[i6] = null;
            }
        }
        parcel.setDataPosition(dataPosition + readSize);
        return parcelArr;
    }

    @o0
    public static ArrayList<Parcel> createParcelList(@o0 Parcel parcel, int i5) {
        int readSize = readSize(parcel, i5);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        ArrayList<Parcel> arrayList = new ArrayList<>();
        for (int i6 = 0; i6 < readInt; i6++) {
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
    public static SparseArray<Parcel> createParcelSparseArray(@o0 Parcel parcel, int i5) {
        int readSize = readSize(parcel, i5);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        SparseArray<Parcel> sparseArray = new SparseArray<>();
        for (int i6 = 0; i6 < readInt; i6++) {
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
    public static <T extends Parcelable> T createParcelable(@o0 Parcel parcel, int i5, @o0 Parcelable.Creator<T> creator) {
        int readSize = readSize(parcel, i5);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return null;
        }
        T createFromParcel = creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + readSize);
        return createFromParcel;
    }

    @o0
    public static SparseBooleanArray createSparseBooleanArray(@o0 Parcel parcel, int i5) {
        int readSize = readSize(parcel, i5);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return null;
        }
        SparseBooleanArray readSparseBooleanArray = parcel.readSparseBooleanArray();
        parcel.setDataPosition(dataPosition + readSize);
        return readSparseBooleanArray;
    }

    @o0
    public static SparseIntArray createSparseIntArray(@o0 Parcel parcel, int i5) {
        int readSize = readSize(parcel, i5);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return null;
        }
        SparseIntArray sparseIntArray = new SparseIntArray();
        int readInt = parcel.readInt();
        for (int i6 = 0; i6 < readInt; i6++) {
            sparseIntArray.append(parcel.readInt(), parcel.readInt());
        }
        parcel.setDataPosition(dataPosition + readSize);
        return sparseIntArray;
    }

    @o0
    public static SparseLongArray createSparseLongArray(@o0 Parcel parcel, int i5) {
        int readSize = readSize(parcel, i5);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return null;
        }
        SparseLongArray sparseLongArray = new SparseLongArray();
        int readInt = parcel.readInt();
        for (int i6 = 0; i6 < readInt; i6++) {
            sparseLongArray.append(parcel.readInt(), parcel.readLong());
        }
        parcel.setDataPosition(dataPosition + readSize);
        return sparseLongArray;
    }

    @o0
    public static String createString(@o0 Parcel parcel, int i5) {
        int readSize = readSize(parcel, i5);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + readSize);
        return readString;
    }

    @o0
    public static String[] createStringArray(@o0 Parcel parcel, int i5) {
        int readSize = readSize(parcel, i5);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return null;
        }
        String[] createStringArray = parcel.createStringArray();
        parcel.setDataPosition(dataPosition + readSize);
        return createStringArray;
    }

    @o0
    public static ArrayList<String> createStringList(@o0 Parcel parcel, int i5) {
        int readSize = readSize(parcel, i5);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return null;
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(dataPosition + readSize);
        return createStringArrayList;
    }

    @o0
    public static SparseArray<String> createStringSparseArray(@o0 Parcel parcel, int i5) {
        int readSize = readSize(parcel, i5);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return null;
        }
        SparseArray<String> sparseArray = new SparseArray<>();
        int readInt = parcel.readInt();
        for (int i6 = 0; i6 < readInt; i6++) {
            sparseArray.append(parcel.readInt(), parcel.readString());
        }
        parcel.setDataPosition(dataPosition + readSize);
        return sparseArray;
    }

    @o0
    public static <T> T[] createTypedArray(@o0 Parcel parcel, int i5, @o0 Parcelable.Creator<T> creator) {
        int readSize = readSize(parcel, i5);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return null;
        }
        T[] tArr = (T[]) parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + readSize);
        return tArr;
    }

    @o0
    public static <T> ArrayList<T> createTypedList(@o0 Parcel parcel, int i5, @o0 Parcelable.Creator<T> creator) {
        int readSize = readSize(parcel, i5);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return null;
        }
        ArrayList<T> createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(dataPosition + readSize);
        return createTypedArrayList;
    }

    @o0
    public static <T> SparseArray<T> createTypedSparseArray(@o0 Parcel parcel, int i5, @o0 Parcelable.Creator<T> creator) {
        int readSize = readSize(parcel, i5);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        SparseArray<T> sparseArray = new SparseArray<>();
        for (int i6 = 0; i6 < readInt; i6++) {
            sparseArray.append(parcel.readInt(), parcel.readInt() != 0 ? creator.createFromParcel(parcel) : null);
        }
        parcel.setDataPosition(dataPosition + readSize);
        return sparseArray;
    }

    public static void ensureAtEnd(@o0 Parcel parcel, int i5) {
        if (parcel.dataPosition() != i5) {
            throw new ParseException(s.a(ProtectedSandApp.s("ஓ"), i5), parcel);
        }
    }

    public static int getFieldId(int i5) {
        return (char) i5;
    }

    public static boolean readBoolean(@o0 Parcel parcel, int i5) {
        zzb(parcel, i5, 4);
        return parcel.readInt() != 0;
    }

    @o0
    public static Boolean readBooleanObject(@o0 Parcel parcel, int i5) {
        int readSize = readSize(parcel, i5);
        if (readSize == 0) {
            return null;
        }
        zza(parcel, i5, readSize, 4);
        return Boolean.valueOf(parcel.readInt() != 0);
    }

    public static byte readByte(@o0 Parcel parcel, int i5) {
        zzb(parcel, i5, 4);
        return (byte) parcel.readInt();
    }

    public static char readChar(@o0 Parcel parcel, int i5) {
        zzb(parcel, i5, 4);
        return (char) parcel.readInt();
    }

    public static double readDouble(@o0 Parcel parcel, int i5) {
        zzb(parcel, i5, 8);
        return parcel.readDouble();
    }

    @o0
    public static Double readDoubleObject(@o0 Parcel parcel, int i5) {
        int readSize = readSize(parcel, i5);
        if (readSize == 0) {
            return null;
        }
        zza(parcel, i5, readSize, 8);
        return Double.valueOf(parcel.readDouble());
    }

    public static float readFloat(@o0 Parcel parcel, int i5) {
        zzb(parcel, i5, 4);
        return parcel.readFloat();
    }

    @o0
    public static Float readFloatObject(@o0 Parcel parcel, int i5) {
        int readSize = readSize(parcel, i5);
        if (readSize == 0) {
            return null;
        }
        zza(parcel, i5, readSize, 4);
        return Float.valueOf(parcel.readFloat());
    }

    public static int readHeader(@o0 Parcel parcel) {
        return parcel.readInt();
    }

    @o0
    public static IBinder readIBinder(@o0 Parcel parcel, int i5) {
        int readSize = readSize(parcel, i5);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + readSize);
        return readStrongBinder;
    }

    public static int readInt(@o0 Parcel parcel, int i5) {
        zzb(parcel, i5, 4);
        return parcel.readInt();
    }

    @o0
    public static Integer readIntegerObject(@o0 Parcel parcel, int i5) {
        int readSize = readSize(parcel, i5);
        if (readSize == 0) {
            return null;
        }
        zza(parcel, i5, readSize, 4);
        return Integer.valueOf(parcel.readInt());
    }

    public static void readList(@o0 Parcel parcel, int i5, @o0 List list, @o0 ClassLoader classLoader) {
        int readSize = readSize(parcel, i5);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return;
        }
        parcel.readList(list, classLoader);
        parcel.setDataPosition(dataPosition + readSize);
    }

    public static long readLong(@o0 Parcel parcel, int i5) {
        zzb(parcel, i5, 8);
        return parcel.readLong();
    }

    @o0
    public static Long readLongObject(@o0 Parcel parcel, int i5) {
        int readSize = readSize(parcel, i5);
        if (readSize == 0) {
            return null;
        }
        zza(parcel, i5, readSize, 8);
        return Long.valueOf(parcel.readLong());
    }

    @o0
    public static PendingIntent readPendingIntent(@o0 Parcel parcel, int i5) {
        int readSize = readSize(parcel, i5);
        int dataPosition = parcel.dataPosition();
        if (readSize == 0) {
            return null;
        }
        PendingIntent readPendingIntentOrNullFromParcel = PendingIntent.readPendingIntentOrNullFromParcel(parcel);
        parcel.setDataPosition(dataPosition + readSize);
        return readPendingIntentOrNullFromParcel;
    }

    public static short readShort(@o0 Parcel parcel, int i5) {
        zzb(parcel, i5, 4);
        return (short) parcel.readInt();
    }

    public static int readSize(@o0 Parcel parcel, int i5) {
        return (i5 & a.f29111c) != -65536 ? (char) (i5 >> 16) : parcel.readInt();
    }

    public static void skipUnknownField(@o0 Parcel parcel, int i5) {
        parcel.setDataPosition(parcel.dataPosition() + readSize(parcel, i5));
    }

    public static int validateObjectHeader(@o0 Parcel parcel) {
        int readHeader = readHeader(parcel);
        int readSize = readSize(parcel, readHeader);
        int dataPosition = parcel.dataPosition();
        if (getFieldId(readHeader) != 20293) {
            throw new ParseException(ProtectedSandApp.s("\u0b96").concat(String.valueOf(Integer.toHexString(readHeader))), parcel);
        }
        int i5 = readSize + dataPosition;
        if (i5 < dataPosition || i5 > parcel.dataSize()) {
            throw new ParseException(v.a(ProtectedSandApp.s("ஔ"), dataPosition, ProtectedSandApp.s("க"), i5), parcel);
        }
        return i5;
    }

    private static void zza(Parcel parcel, int i5, int i6, int i7) {
        if (i6 == i7) {
            return;
        }
        String hexString = Integer.toHexString(i6);
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("\u0b97"));
        sb.append(i7);
        sb.append(ProtectedSandApp.s("\u0b98"));
        sb.append(i6);
        sb.append(ProtectedSandApp.s("ங"));
        throw new ParseException(androidx.concurrent.futures.a.a(sb, hexString, ProtectedSandApp.s("ச")), parcel);
    }

    private static void zzb(Parcel parcel, int i5, int i6) {
        int readSize = readSize(parcel, i5);
        if (readSize == i6) {
            return;
        }
        String hexString = Integer.toHexString(readSize);
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("\u0b9b"));
        sb.append(i6);
        sb.append(ProtectedSandApp.s("ஜ"));
        sb.append(readSize);
        sb.append(ProtectedSandApp.s("\u0b9d"));
        throw new ParseException(androidx.concurrent.futures.a.a(sb, hexString, ProtectedSandApp.s("ஞ")), parcel);
    }
}
