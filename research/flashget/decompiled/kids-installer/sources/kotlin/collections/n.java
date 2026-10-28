package kotlin.collections;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.UByteArray;
import kotlin.UIntArray;
import kotlin.ULongArray;
import kotlin.UShortArray;
import kotlin.internal.InlineOnly;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: Arrays.kt */
@Metadata(d1 = {"\u0000H\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a5\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\f\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0018\u00010\u00032\u0010\u0010\u0004\u001a\f\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0018\u00010\u0003H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a#\u0010\u0007\u001a\u00020\b\"\u0004\b\u0000\u0010\u0002*\f\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0018\u00010\u0003H\u0001¢\u0006\u0004\b\t\u0010\n\u001a?\u0010\u000b\u001a\u00020\f\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u00032\n\u0010\r\u001a\u00060\u000ej\u0002`\u000f2\u0010\u0010\u0010\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a+\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0015\"\u0004\b\u0000\u0010\u0002*\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u00030\u0003¢\u0006\u0002\u0010\u0016\u001a;\u0010\u0017\u001a\u0002H\u0018\"\u0010\b\u0000\u0010\u0019*\u0006\u0012\u0002\b\u00030\u0003*\u0002H\u0018\"\u0004\b\u0001\u0010\u0018*\u0002H\u00192\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u0002H\u00180\u001bH\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\u001c\u001a)\u0010\u001d\u001a\u00020\u0001*\b\u0012\u0002\b\u0003\u0018\u00010\u0003H\u0087\b\u0082\u0002\u000e\n\f\b\u0000\u0012\u0002\u0018\u0001\u001a\u0004\b\u0003\u0010\u0000¢\u0006\u0002\u0010\u001e\u001aG\u0010\u001f\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00180\u00150 \"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0018*\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00180 0\u0003¢\u0006\u0002\u0010!\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\""}, d2 = {"contentDeepEqualsImpl", "", "T", "", "other", "contentDeepEquals", "([Ljava/lang/Object;[Ljava/lang/Object;)Z", "contentDeepToStringImpl", "", "contentDeepToString", "([Ljava/lang/Object;)Ljava/lang/String;", "contentDeepToStringInternal", "", "result", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "processed", "", "contentDeepToStringInternal$ArraysKt__ArraysKt", "([Ljava/lang/Object;Ljava/lang/StringBuilder;Ljava/util/List;)V", "flatten", "", "([[Ljava/lang/Object;)Ljava/util/List;", "ifEmpty", "R", "C", "defaultValue", "Lkotlin/Function0;", "([Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "isNullOrEmpty", "([Ljava/lang/Object;)Z", "unzip", "Lkotlin/Pair;", "([Lkotlin/Pair;)Lkotlin/Pair;", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/collections/ArraysKt")
@SourceDebugExtension({"SMAP\nArrays.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Arrays.kt\nkotlin/collections/ArraysKt__ArraysKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,161:1\n1#2:162\n*E\n"})
/* loaded from: classes5.dex */
class n extends m {
    /* JADX WARN: Multi-variable type inference failed */
    @p3.i(name = "contentDeepEquals")
    @SinceKotlin(version = "1.3")
    @PublishedApi
    public static final <T> boolean g(@d5.e T[] tArr, @d5.e T[] tArr2) {
        boolean V0;
        boolean T0;
        boolean S0;
        boolean U0;
        if (tArr == tArr2) {
            return true;
        }
        if (tArr == 0 || tArr2 == 0 || tArr.length != tArr2.length) {
            return false;
        }
        int length = tArr.length;
        for (int i5 = 0; i5 < length; i5++) {
            Object[] objArr = tArr[i5];
            Object[] objArr2 = tArr2[i5];
            if (objArr != objArr2) {
                if (objArr == 0 || objArr2 == 0) {
                    return false;
                }
                if ((objArr instanceof Object[]) && (objArr2 instanceof Object[])) {
                    if (!g(objArr, objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof byte[]) && (objArr2 instanceof byte[])) {
                    if (!Arrays.equals((byte[]) objArr, (byte[]) objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof short[]) && (objArr2 instanceof short[])) {
                    if (!Arrays.equals((short[]) objArr, (short[]) objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof int[]) && (objArr2 instanceof int[])) {
                    if (!Arrays.equals((int[]) objArr, (int[]) objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof long[]) && (objArr2 instanceof long[])) {
                    if (!Arrays.equals((long[]) objArr, (long[]) objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof float[]) && (objArr2 instanceof float[])) {
                    if (!Arrays.equals((float[]) objArr, (float[]) objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof double[]) && (objArr2 instanceof double[])) {
                    if (!Arrays.equals((double[]) objArr, (double[]) objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof char[]) && (objArr2 instanceof char[])) {
                    if (!Arrays.equals((char[]) objArr, (char[]) objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof boolean[]) && (objArr2 instanceof boolean[])) {
                    if (!Arrays.equals((boolean[]) objArr, (boolean[]) objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof UByteArray) && (objArr2 instanceof UByteArray)) {
                    U0 = kotlin.collections.unsigned.g.U0(((UByteArray) objArr).getF27224o(), ((UByteArray) objArr2).getF27224o());
                    if (!U0) {
                        return false;
                    }
                } else if ((objArr instanceof UShortArray) && (objArr2 instanceof UShortArray)) {
                    S0 = kotlin.collections.unsigned.g.S0(((UShortArray) objArr).getF23515o(), ((UShortArray) objArr2).getF23515o());
                    if (!S0) {
                        return false;
                    }
                } else if ((objArr instanceof UIntArray) && (objArr2 instanceof UIntArray)) {
                    T0 = kotlin.collections.unsigned.g.T0(((UIntArray) objArr).getF27245o(), ((UIntArray) objArr2).getF27245o());
                    if (!T0) {
                        return false;
                    }
                } else if ((objArr instanceof ULongArray) && (objArr2 instanceof ULongArray)) {
                    V0 = kotlin.collections.unsigned.g.V0(((ULongArray) objArr).getF23328o(), ((ULongArray) objArr2).getF23328o());
                    if (!V0) {
                        return false;
                    }
                } else if (!kotlin.jvm.internal.l0.g(objArr, objArr2)) {
                    return false;
                }
            }
        }
        return true;
    }

    @p3.i(name = "contentDeepToString")
    @d5.d
    @SinceKotlin(version = "1.3")
    @PublishedApi
    public static final <T> String h(@d5.e T[] tArr) {
        if (tArr == null) {
            return ProtectedSandApp.s("㠀");
        }
        int length = tArr.length;
        if (length > 429496729) {
            length = 429496729;
        }
        StringBuilder sb = new StringBuilder((length * 5) + 2);
        i(tArr, sb, new ArrayList());
        String sb2 = sb.toString();
        kotlin.jvm.internal.l0.o(sb2, ProtectedSandApp.s("㠁"));
        return sb2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final <T> void i(T[] tArr, StringBuilder sb, List<Object[]> list) {
        String d12;
        String b12;
        String c12;
        String a12;
        if (list.contains(tArr)) {
            sb.append(ProtectedSandApp.s("㠂"));
            return;
        }
        list.add(tArr);
        sb.append('[');
        int length = tArr.length;
        for (int i5 = 0; i5 < length; i5++) {
            if (i5 != 0) {
                sb.append(ProtectedSandApp.s("㠃"));
            }
            Object[] objArr = tArr[i5];
            if (objArr == 0) {
                sb.append(ProtectedSandApp.s("㠄"));
            } else if (objArr instanceof Object[]) {
                i(objArr, sb, list);
            } else {
                boolean z5 = objArr instanceof byte[];
                String s5 = ProtectedSandApp.s("㠅");
                if (z5) {
                    String arrays = Arrays.toString((byte[]) objArr);
                    kotlin.jvm.internal.l0.o(arrays, s5);
                    sb.append(arrays);
                } else if (objArr instanceof short[]) {
                    String arrays2 = Arrays.toString((short[]) objArr);
                    kotlin.jvm.internal.l0.o(arrays2, s5);
                    sb.append(arrays2);
                } else if (objArr instanceof int[]) {
                    String arrays3 = Arrays.toString((int[]) objArr);
                    kotlin.jvm.internal.l0.o(arrays3, s5);
                    sb.append(arrays3);
                } else if (objArr instanceof long[]) {
                    String arrays4 = Arrays.toString((long[]) objArr);
                    kotlin.jvm.internal.l0.o(arrays4, s5);
                    sb.append(arrays4);
                } else if (objArr instanceof float[]) {
                    String arrays5 = Arrays.toString((float[]) objArr);
                    kotlin.jvm.internal.l0.o(arrays5, s5);
                    sb.append(arrays5);
                } else if (objArr instanceof double[]) {
                    String arrays6 = Arrays.toString((double[]) objArr);
                    kotlin.jvm.internal.l0.o(arrays6, s5);
                    sb.append(arrays6);
                } else if (objArr instanceof char[]) {
                    String arrays7 = Arrays.toString((char[]) objArr);
                    kotlin.jvm.internal.l0.o(arrays7, s5);
                    sb.append(arrays7);
                } else if (objArr instanceof boolean[]) {
                    String arrays8 = Arrays.toString((boolean[]) objArr);
                    kotlin.jvm.internal.l0.o(arrays8, s5);
                    sb.append(arrays8);
                } else if (objArr instanceof UByteArray) {
                    a12 = kotlin.collections.unsigned.g.a1(((UByteArray) objArr).getF27224o());
                    sb.append(a12);
                } else if (objArr instanceof UShortArray) {
                    c12 = kotlin.collections.unsigned.g.c1(((UShortArray) objArr).getF23515o());
                    sb.append(c12);
                } else if (objArr instanceof UIntArray) {
                    b12 = kotlin.collections.unsigned.g.b1(((UIntArray) objArr).getF27245o());
                    sb.append(b12);
                } else if (objArr instanceof ULongArray) {
                    d12 = kotlin.collections.unsigned.g.d1(((ULongArray) objArr).getF23328o());
                    sb.append(d12);
                } else {
                    sb.append(objArr.toString());
                }
            }
        }
        sb.append(']');
        list.remove(a0.J(list));
    }

    @d5.d
    public static final <T> List<T> j(@d5.d T[][] tArr) {
        kotlin.jvm.internal.l0.p(tArr, ProtectedSandApp.s("㠆"));
        int i5 = 0;
        for (T[] tArr2 : tArr) {
            i5 += tArr2.length;
        }
        ArrayList arrayList = new ArrayList(i5);
        for (T[] tArr3 : tArr) {
            f0.s0(arrayList, tArr3);
        }
        return arrayList;
    }

    /* JADX WARN: Incorrect types in method signature: <C:[Ljava/lang/Object;:TR;R:Ljava/lang/Object;>(TC;Lq3/a<+TR;>;)TR; */
    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final Object k(Object[] objArr, q3.a aVar) {
        kotlin.jvm.internal.l0.p(aVar, ProtectedSandApp.s("㠇"));
        return objArr.length == 0 ? aVar.n() : objArr;
    }

    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final boolean l(Object[] objArr) {
        if (objArr != null) {
            return objArr.length == 0;
        }
        return true;
    }

    @d5.d
    public static final <T, R> Pair<List<T>, List<R>> m(@d5.d Pair<? extends T, ? extends R>[] pairArr) {
        kotlin.jvm.internal.l0.p(pairArr, ProtectedSandApp.s("㠈"));
        ArrayList arrayList = new ArrayList(pairArr.length);
        ArrayList arrayList2 = new ArrayList(pairArr.length);
        for (Pair<? extends T, ? extends R> pair : pairArr) {
            arrayList.add(pair.e());
            arrayList2.add(pair.f());
        }
        return new Pair<>(arrayList, arrayList2);
    }
}
