package kotlin.collections;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.h2;
import kotlin.x1;

/* compiled from: Arrays.kt */
@Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a-\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00010\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001aI\u0010\u0007\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00020\u0006\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0005*\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00060\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a+\u0010\n\u001a\u00020\t*\b\u0012\u0002\b\u0003\u0018\u00010\u0001H\u0087\b\u0082\u0002\u000e\n\f\b\u0000\u0012\u0002\u0018\u0001\u001a\u0004\b\u0003\u0010\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a=\u0010\u000f\u001a\u00028\u0001\"\u0010\b\u0000\u0010\f*\u0006\u0012\u0002\b\u00030\u0001*\u00028\u0001\"\u0004\b\u0001\u0010\u0005*\u00028\u00002\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\rH\u0087\bø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a5\u0010\u0012\u001a\u00020\t\"\u0004\b\u0000\u0010\u0000*\f\u0012\u0006\b\u0001\u0012\u00028\u0000\u0018\u00010\u00012\u0010\u0010\u0011\u001a\f\u0012\u0006\b\u0001\u0012\u00028\u0000\u0018\u00010\u0001H\u0001¢\u0006\u0004\b\u0012\u0010\u0013\u001a#\u0010\u0015\u001a\u00020\u0014\"\u0004\b\u0000\u0010\u0000*\f\u0012\u0006\b\u0001\u0012\u00028\u0000\u0018\u00010\u0001H\u0001¢\u0006\u0004\b\u0015\u0010\u0016\u001a?\u0010\u001d\u001a\u00020\u001c\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\n\u0010\u0019\u001a\u00060\u0017j\u0002`\u00182\u0010\u0010\u001b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00010\u001aH\u0002¢\u0006\u0004\b\u001d\u0010\u001e\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001f"}, d2 = {"T", "", "", "j", "([[Ljava/lang/Object;)Ljava/util/List;", "R", "Lkotlin/q0;", "m", "([Lkotlin/q0;)Lkotlin/q0;", "", "l", "([Ljava/lang/Object;)Z", "C", "Lkotlin/Function0;", "defaultValue", "k", "([Ljava/lang/Object;Lld/a;)Ljava/lang/Object;", "other", "g", "([Ljava/lang/Object;[Ljava/lang/Object;)Z", "", "h", "([Ljava/lang/Object;)Ljava/lang/String;", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "result", "", "processed", "Lkotlin/k2;", "i", "([Ljava/lang/Object;Ljava/lang/StringBuilder;Ljava/util/List;)V", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/collections/ArraysKt")
@kotlin.jvm.internal.r1({"SMAP\nArrays.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Arrays.kt\nkotlin/collections/ArraysKt__ArraysKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,161:1\n1#2:162\n*E\n"})
/* loaded from: classes7.dex */
class n extends m {
    /* JADX WARN: Multi-variable type inference failed */
    @kotlin.c1(version = "1.3")
    @kd.i(name = "contentDeepEquals")
    @kotlin.w0
    public static final <T> boolean g(@fg.m T[] tArr, @fg.m T[] tArr2) {
        if (tArr == tArr2) {
            return true;
        }
        if (tArr == 0 || tArr2 == 0 || tArr.length != tArr2.length) {
            return false;
        }
        int length = tArr.length;
        for (int i4 = 0; i4 < length; i4++) {
            Object[] objArr = tArr[i4];
            Object[] objArr2 = tArr2[i4];
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
                } else if ((objArr instanceof kotlin.t1) && (objArr2 instanceof kotlin.t1)) {
                    if (!kotlin.collections.unsigned.a.U0(((kotlin.t1) objArr).getStorage(), ((kotlin.t1) objArr2).getStorage())) {
                        return false;
                    }
                } else if ((objArr instanceof h2) && (objArr2 instanceof h2)) {
                    if (!kotlin.collections.unsigned.a.S0(((h2) objArr).getStorage(), ((h2) objArr2).getStorage())) {
                        return false;
                    }
                } else if ((objArr instanceof x1) && (objArr2 instanceof x1)) {
                    if (!kotlin.collections.unsigned.a.T0(((x1) objArr).getStorage(), ((x1) objArr2).getStorage())) {
                        return false;
                    }
                } else if ((objArr instanceof b2) && (objArr2 instanceof b2)) {
                    if (!kotlin.collections.unsigned.a.V0(((b2) objArr).getStorage(), ((b2) objArr2).getStorage())) {
                        return false;
                    }
                } else if (!kotlin.jvm.internal.l0.g(objArr, objArr2)) {
                    return false;
                }
            }
        }
        return true;
    }

    @fg.l
    @kotlin.c1(version = "1.3")
    @kd.i(name = "contentDeepToString")
    @kotlin.w0
    public static final <T> String h(@fg.m T[] tArr) {
        if (tArr == null) {
            return ProtectedSandApp.s("憵\u0001");
        }
        int length = tArr.length;
        if (length > 429496729) {
            length = 429496729;
        }
        StringBuilder sb = new StringBuilder((length * 5) + 2);
        i(tArr, sb, new ArrayList());
        String sb2 = sb.toString();
        kotlin.jvm.internal.l0.o(sb2, ProtectedSandApp.s("憶\u0001"));
        return sb2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final <T> void i(T[] tArr, StringBuilder sb, List<Object[]> list) {
        if (list.contains(tArr)) {
            sb.append(ProtectedSandApp.s("憷\u0001"));
            return;
        }
        list.add(tArr);
        sb.append('[');
        int length = tArr.length;
        for (int i4 = 0; i4 < length; i4++) {
            if (i4 != 0) {
                sb.append(ProtectedSandApp.s("憸\u0001"));
            }
            Object[] objArr = tArr[i4];
            if (objArr == 0) {
                sb.append(ProtectedSandApp.s("憵\u0001"));
            } else if (objArr instanceof Object[]) {
                i(objArr, sb, list);
            } else {
                boolean z4 = objArr instanceof byte[];
                String s4 = ProtectedSandApp.s("憶\u0001");
                if (z4) {
                    String arrays = Arrays.toString((byte[]) objArr);
                    kotlin.jvm.internal.l0.o(arrays, s4);
                    sb.append(arrays);
                } else if (objArr instanceof short[]) {
                    String arrays2 = Arrays.toString((short[]) objArr);
                    kotlin.jvm.internal.l0.o(arrays2, s4);
                    sb.append(arrays2);
                } else if (objArr instanceof int[]) {
                    String arrays3 = Arrays.toString((int[]) objArr);
                    kotlin.jvm.internal.l0.o(arrays3, s4);
                    sb.append(arrays3);
                } else if (objArr instanceof long[]) {
                    String arrays4 = Arrays.toString((long[]) objArr);
                    kotlin.jvm.internal.l0.o(arrays4, s4);
                    sb.append(arrays4);
                } else if (objArr instanceof float[]) {
                    String arrays5 = Arrays.toString((float[]) objArr);
                    kotlin.jvm.internal.l0.o(arrays5, s4);
                    sb.append(arrays5);
                } else if (objArr instanceof double[]) {
                    String arrays6 = Arrays.toString((double[]) objArr);
                    kotlin.jvm.internal.l0.o(arrays6, s4);
                    sb.append(arrays6);
                } else if (objArr instanceof char[]) {
                    String arrays7 = Arrays.toString((char[]) objArr);
                    kotlin.jvm.internal.l0.o(arrays7, s4);
                    sb.append(arrays7);
                } else if (objArr instanceof boolean[]) {
                    String arrays8 = Arrays.toString((boolean[]) objArr);
                    kotlin.jvm.internal.l0.o(arrays8, s4);
                    sb.append(arrays8);
                } else if (objArr instanceof kotlin.t1) {
                    sb.append(kotlin.collections.unsigned.a.a1(((kotlin.t1) objArr).getStorage()));
                } else if (objArr instanceof h2) {
                    sb.append(kotlin.collections.unsigned.a.c1(((h2) objArr).getStorage()));
                } else if (objArr instanceof x1) {
                    sb.append(kotlin.collections.unsigned.a.b1(((x1) objArr).getStorage()));
                } else if (objArr instanceof b2) {
                    sb.append(kotlin.collections.unsigned.a.d1(((b2) objArr).getStorage()));
                } else {
                    sb.append(objArr.toString());
                }
            }
        }
        sb.append(']');
        list.remove(y.J(list));
    }

    @fg.l
    public static final <T> List<T> j(@fg.l T[][] tArr) {
        kotlin.jvm.internal.l0.p(tArr, ProtectedSandApp.s("憹\u0001"));
        int i4 = 0;
        for (T[] tArr2 : tArr) {
            i4 += tArr2.length;
        }
        ArrayList arrayList = new ArrayList(i4);
        for (T[] tArr3 : tArr) {
            d0.s0(arrayList, tArr3);
        }
        return arrayList;
    }

    /* JADX WARN: Incorrect types in method signature: <C:[Ljava/lang/Object;:TR;R:Ljava/lang/Object;>(TC;Lld/a<+TR;>;)TR; */
    @kotlin.c1(version = "1.3")
    @kotlin.internal.f
    private static final Object k(Object[] objArr, ld.a aVar) {
        kotlin.jvm.internal.l0.p(aVar, ProtectedSandApp.s("憺\u0001"));
        return objArr.length == 0 ? aVar.invoke() : objArr;
    }

    @kotlin.c1(version = "1.3")
    @kotlin.internal.f
    private static final boolean l(Object[] objArr) {
        return objArr == null || objArr.length == 0;
    }

    @fg.l
    public static final <T, R> kotlin.q0<List<T>, List<R>> m(@fg.l kotlin.q0<? extends T, ? extends R>[] q0VarArr) {
        kotlin.jvm.internal.l0.p(q0VarArr, ProtectedSandApp.s("憹\u0001"));
        ArrayList arrayList = new ArrayList(q0VarArr.length);
        ArrayList arrayList2 = new ArrayList(q0VarArr.length);
        for (kotlin.q0<? extends T, ? extends R> q0Var : q0VarArr) {
            arrayList.add(q0Var.e());
            arrayList2.add(q0Var.f());
        }
        return new kotlin.q0<>(arrayList, arrayList2);
    }
}
