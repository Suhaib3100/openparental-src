package kotlin;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: UIntArray.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a/\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u0002H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001c\u0010\t\u001a\u00020\u00052\n\u0010\b\u001a\u00020\u0005\"\u00020\u0003H\u0087\b¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u000b"}, d2 = {"", "size", "Lkotlin/Function1;", "Lkotlin/w1;", "init", "Lkotlin/x1;", "a", "(ILld/l;)[I", "elements", "b", "([I)[I", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class y1 {
    @c1(version = "1.3")
    @t
    @kotlin.internal.f
    private static final int[] a(int i4, ld.l<? super Integer, w1> lVar) {
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("蕰\u0001"));
        int[] iArr = new int[i4];
        for (int i5 = 0; i5 < i4; i5++) {
            iArr[i5] = lVar.invoke(Integer.valueOf(i5)).getData();
        }
        kotlin.jvm.internal.l0.p(iArr, ProtectedSandApp.s("蕱\u0001"));
        return iArr;
    }

    @c1(version = "1.3")
    @t
    @kotlin.internal.f
    private static final int[] b(int... iArr) {
        kotlin.jvm.internal.l0.p(iArr, ProtectedSandApp.s("蕲\u0001"));
        return iArr;
    }
}
