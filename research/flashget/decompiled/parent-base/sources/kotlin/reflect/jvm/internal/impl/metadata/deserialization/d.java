package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import java.util.LinkedList;
import java.util.List;
import kotlin.collections.w;
import kotlin.jvm.internal.l0;
import kotlin.l1;
import kotlin.reflect.jvm.internal.impl.metadata.a;

/* compiled from: NameResolverImpl.kt */
/* loaded from: classes7.dex */
public final class d implements c {

    /* renamed from: a, reason: collision with root package name */
    @l
    private final a.p f77440a;

    /* renamed from: b, reason: collision with root package name */
    @l
    private final a.o f77441b;

    /* compiled from: NameResolverImpl.kt */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f77442a;

        static {
            int[] iArr = new int[a.o.c.EnumC1138c.values().length];
            try {
                iArr[a.o.c.EnumC1138c.CLASS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.o.c.EnumC1138c.PACKAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.o.c.EnumC1138c.LOCAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f77442a = iArr;
        }
    }

    public d(@l a.p pVar, @l a.o oVar) {
        l0.p(pVar, ProtectedSandApp.s("甥\u0001"));
        l0.p(oVar, ProtectedSandApp.s("甦\u0001"));
        this.f77440a = pVar;
        this.f77441b = oVar;
    }

    private final l1<List<String>, List<String>, Boolean> c(int i4) {
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        boolean z4 = false;
        while (i4 != -1) {
            a.o.c u4 = this.f77441b.u(i4);
            String u5 = this.f77440a.u(u4.A());
            a.o.c.EnumC1138c x4 = u4.x();
            l0.m(x4);
            int i5 = a.f77442a[x4.ordinal()];
            if (i5 == 1) {
                linkedList2.addFirst(u5);
            } else if (i5 == 2) {
                linkedList.addFirst(u5);
            } else if (i5 == 3) {
                linkedList2.addFirst(u5);
                z4 = true;
            }
            i4 = u4.y();
        }
        return new l1<>(linkedList, linkedList2, Boolean.valueOf(z4));
    }

    @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.c
    public boolean a(int i4) {
        return c(i4).h().booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.c
    @l
    public String b(int i4) {
        l1<List<String>, List<String>, Boolean> c5 = c(i4);
        List<String> a5 = c5.a();
        String m32 = w.m3(c5.b(), ProtectedSandApp.s("甧\u0001"), null, null, 0, null, null, 62, null);
        if (a5.isEmpty()) {
            return m32;
        }
        return w.m3(a5, ProtectedSandApp.s("用\u0001"), null, null, 0, null, null, 62, null) + '/' + m32;
    }

    @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.c
    @l
    public String getString(int i4) {
        String u4 = this.f77440a.u(i4);
        l0.o(u4, ProtectedSandApp.s("甩\u0001"));
        return u4;
    }
}
