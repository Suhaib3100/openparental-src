package kotlin.collections;

import androidx.collection.q2;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import kotlin.Metadata;

/* compiled from: ArraysJVM.kt */
@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a.\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\f\u0012\u0006\b\u0001\u0012\u00028\u0000\u0018\u00010\u0001H\u0086\b¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001c\u0010\b\u001a\u00020\u0007*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0087\b¢\u0006\u0004\b\b\u0010\t\u001a(\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\b\u0012\u0004\u0012\u00028\u00000\nH\u0086\b¢\u0006\u0004\b\u000b\u0010\f\u001a1\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0014\u0010\u0015\u001a#\u0010\u0016\u001a\u00020\u000e\"\u0004\b\u0000\u0010\u0000*\f\u0012\u0006\b\u0001\u0012\u00028\u0000\u0018\u00010\u0001H\u0001¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"T", "", "d", "([Ljava/lang/Object;)[Ljava/lang/Object;", "", "Ljava/nio/charset/Charset;", "charset", "", "e", "([BLjava/nio/charset/Charset;)Ljava/lang/String;", "", "f", "(Ljava/util/Collection;)[Ljava/lang/Object;", "reference", "", "size", "a", "([Ljava/lang/Object;I)[Ljava/lang/Object;", "toIndex", "Lkotlin/k2;", "c", "(II)V", "b", "([Ljava/lang/Object;)I", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/collections/ArraysKt")
@kotlin.jvm.internal.r1({"SMAP\nArraysJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 2 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,61:1\n26#2:62\n*S KotlinDebug\n*F\n+ 1 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n18#1:62\n*E\n"})
/* loaded from: classes7.dex */
class m {
    @fg.l
    public static final <T> T[] a(@fg.l T[] tArr, int i4) {
        kotlin.jvm.internal.l0.p(tArr, ProtectedSandApp.s("憮\u0001"));
        Object newInstance = Array.newInstance(tArr.getClass().getComponentType(), i4);
        kotlin.jvm.internal.l0.n(newInstance, ProtectedSandApp.s("憯\u0001"));
        return (T[]) ((Object[]) newInstance);
    }

    @kotlin.c1(version = "1.3")
    @kd.i(name = "contentDeepHashCode")
    @kotlin.w0
    public static final <T> int b(@fg.m T[] tArr) {
        return Arrays.deepHashCode(tArr);
    }

    @kotlin.c1(version = "1.3")
    public static final void c(int i4, int i5) {
        if (i4 > i5) {
            throw new IndexOutOfBoundsException(q2.a(ProtectedSandApp.s("憰\u0001"), i4, ProtectedSandApp.s("憱\u0001"), i5, ProtectedSandApp.s("憲\u0001")));
        }
    }

    public static final <T> T[] d(T[] tArr) {
        if (tArr != null) {
            return tArr;
        }
        kotlin.jvm.internal.l0.P();
        return (T[]) new Object[0];
    }

    @kotlin.internal.f
    private static final String e(byte[] bArr, Charset charset) {
        kotlin.jvm.internal.l0.p(bArr, ProtectedSandApp.s("憳\u0001"));
        kotlin.jvm.internal.l0.p(charset, ProtectedSandApp.s("憴\u0001"));
        return new String(bArr, charset);
    }

    public static final <T> T[] f(Collection<? extends T> collection) {
        kotlin.jvm.internal.l0.p(collection, ProtectedSandApp.s("憳\u0001"));
        kotlin.jvm.internal.l0.P();
        return (T[]) collection.toArray(new Object[0]);
    }
}
