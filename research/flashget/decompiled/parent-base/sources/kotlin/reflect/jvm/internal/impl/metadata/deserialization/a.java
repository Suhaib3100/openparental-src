package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import fg.m;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.j0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;

/* compiled from: BinaryVersion.kt */
@r1({"SMAP\nBinaryVersion.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BinaryVersion.kt\norg/jetbrains/kotlin/metadata/deserialization/BinaryVersion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,101:1\n5306#2,7:102\n*S KotlinDebug\n*F\n+ 1 BinaryVersion.kt\norg/jetbrains/kotlin/metadata/deserialization/BinaryVersion\n*L\n73#1:102,7\n*E\n"})
/* loaded from: classes7.dex */
public abstract class a {

    /* renamed from: f, reason: collision with root package name */
    @l
    public static final C1155a f77405f = new C1155a();

    /* renamed from: a, reason: collision with root package name */
    @l
    private final int[] f77406a;

    /* renamed from: b, reason: collision with root package name */
    private final int f77407b;

    /* renamed from: c, reason: collision with root package name */
    private final int f77408c;

    /* renamed from: d, reason: collision with root package name */
    private final int f77409d;

    /* renamed from: e, reason: collision with root package name */
    @l
    private final List<Integer> f77410e;

    /* compiled from: BinaryVersion.kt */
    @r1({"SMAP\nBinaryVersion.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BinaryVersion.kt\norg/jetbrains/kotlin/metadata/deserialization/BinaryVersion$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,101:1\n1549#2:102\n1620#2,3:103\n37#3,2:106\n*S KotlinDebug\n*F\n+ 1 BinaryVersion.kt\norg/jetbrains/kotlin/metadata/deserialization/BinaryVersion$Companion\n*L\n97#1:102\n97#1:103,3\n98#1:106,2\n*E\n"})
    /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.deserialization.a$a, reason: collision with other inner class name */
    public static final class C1155a {
        private C1155a() {
        }

        public C1155a(w wVar) {
        }
    }

    public a(@l int... iArr) {
        List<Integer> list;
        l0.p(iArr, ProtectedSandApp.s("甌\u0001"));
        this.f77406a = iArr;
        Integer Ne = kotlin.collections.l.Ne(iArr, 0);
        this.f77407b = Ne != null ? Ne.intValue() : -1;
        Integer Ne2 = kotlin.collections.l.Ne(iArr, 1);
        this.f77408c = Ne2 != null ? Ne2.intValue() : -1;
        Integer Ne3 = kotlin.collections.l.Ne(iArr, 2);
        this.f77409d = Ne3 != null ? Ne3.intValue() : -1;
        if (iArr.length <= 3) {
            list = j0.f74919b;
        } else {
            if (iArr.length > 1024) {
                throw new IllegalArgumentException(androidx.view.e.a(new StringBuilder(ProtectedSandApp.s("甍\u0001")), iArr.length, '.'));
            }
            list = kotlin.collections.w.V5(kotlin.collections.l.r(iArr).subList(3, iArr.length));
        }
        this.f77410e = list;
    }

    public final int a() {
        return this.f77407b;
    }

    public final int b() {
        return this.f77408c;
    }

    public final boolean c(int i4, int i5, int i6) {
        int i7 = this.f77407b;
        if (i7 > i4) {
            return true;
        }
        if (i7 < i4) {
            return false;
        }
        int i10 = this.f77408c;
        if (i10 > i5) {
            return true;
        }
        return i10 >= i5 && this.f77409d >= i6;
    }

    public final boolean d(@l a aVar) {
        l0.p(aVar, ProtectedSandApp.s("甎\u0001"));
        return c(aVar.f77407b, aVar.f77408c, aVar.f77409d);
    }

    public final boolean e(int i4, int i5, int i6) {
        int i7 = this.f77407b;
        if (i7 < i4) {
            return true;
        }
        if (i7 > i4) {
            return false;
        }
        int i10 = this.f77408c;
        if (i10 < i5) {
            return true;
        }
        return i10 <= i5 && this.f77409d <= i6;
    }

    public boolean equals(@m Object obj) {
        if (obj != null && l0.g(getClass(), obj.getClass())) {
            a aVar = (a) obj;
            if (this.f77407b == aVar.f77407b && this.f77408c == aVar.f77408c && this.f77409d == aVar.f77409d && l0.g(this.f77410e, aVar.f77410e)) {
                return true;
            }
        }
        return false;
    }

    protected final boolean f(@l a aVar) {
        l0.p(aVar, ProtectedSandApp.s("甏\u0001"));
        int i4 = this.f77407b;
        if (i4 == 0) {
            if (aVar.f77407b != 0 || this.f77408c != aVar.f77408c) {
                return false;
            }
        } else if (i4 != aVar.f77407b || this.f77408c > aVar.f77408c) {
            return false;
        }
        return true;
    }

    @l
    public final int[] g() {
        return this.f77406a;
    }

    public int hashCode() {
        int i4 = this.f77407b;
        int i5 = (i4 * 31) + this.f77408c + i4;
        int i6 = (i5 * 31) + this.f77409d + i5;
        return this.f77410e.hashCode() + (i6 * 31) + i6;
    }

    @l
    public String toString() {
        int[] iArr = this.f77406a;
        ArrayList arrayList = new ArrayList();
        for (int i4 : iArr) {
            if (i4 == -1) {
                break;
            }
            arrayList.add(Integer.valueOf(i4));
        }
        return arrayList.isEmpty() ? ProtectedSandApp.s("甐\u0001") : kotlin.collections.w.m3(arrayList, ProtectedSandApp.s("甑\u0001"), null, null, 0, null, null, 62, null);
    }
}
