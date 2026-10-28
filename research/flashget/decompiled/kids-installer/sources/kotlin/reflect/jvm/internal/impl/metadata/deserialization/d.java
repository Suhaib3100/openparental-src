package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.LinkedList;
import java.util.List;
import kotlin.Triple;
import kotlin.collections.j0;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.metadata.a;
import org.apache.commons.io.n;

/* compiled from: NameResolverImpl.kt */
/* loaded from: classes5.dex */
public final class d implements c {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    private final a.p f25462a;

    /* renamed from: b, reason: collision with root package name */
    @d5.d
    private final a.o f25463b;

    /* compiled from: NameResolverImpl.kt */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f25464a;

        static {
            int[] iArr = new int[a.o.c.EnumC0333c.values().length];
            try {
                iArr[a.o.c.EnumC0333c.CLASS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.o.c.EnumC0333c.PACKAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.o.c.EnumC0333c.LOCAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f25464a = iArr;
        }
    }

    public d(@d5.d a.p pVar, @d5.d a.o oVar) {
        l0.p(pVar, ProtectedSandApp.s("䴶"));
        l0.p(oVar, ProtectedSandApp.s("䴷"));
        this.f25462a = pVar;
        this.f25463b = oVar;
    }

    private final Triple<List<String>, List<String>, Boolean> c(int i5) {
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        boolean z5 = false;
        while (i5 != -1) {
            a.o.c t5 = this.f25463b.t(i5);
            String t6 = this.f25462a.t(t5.A());
            a.o.c.EnumC0333c w5 = t5.w();
            l0.m(w5);
            int i6 = a.f25464a[w5.ordinal()];
            if (i6 == 1) {
                linkedList2.addFirst(t6);
            } else if (i6 == 2) {
                linkedList.addFirst(t6);
            } else if (i6 == 3) {
                linkedList2.addFirst(t6);
                z5 = true;
            }
            i5 = t5.y();
        }
        return new Triple<>(linkedList, linkedList2, Boolean.valueOf(z5));
    }

    @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.c
    @d5.d
    public String a(int i5) {
        String m32;
        String m33;
        Triple<List<String>, List<String>, Boolean> c6 = c(i5);
        List<String> a6 = c6.a();
        m32 = j0.m3(c6.b(), ProtectedSandApp.s("䴸"), null, null, 0, null, null, 62, null);
        if (a6.isEmpty()) {
            return m32;
        }
        StringBuilder sb = new StringBuilder();
        m33 = j0.m3(a6, ProtectedSandApp.s("䴹"), null, null, 0, null, null, 62, null);
        sb.append(m33);
        sb.append(n.f32060b);
        sb.append(m32);
        return sb.toString();
    }

    @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.c
    public boolean b(int i5) {
        return c(i5).h().booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.c
    @d5.d
    public String getString(int i5) {
        String t5 = this.f25462a.t(i5);
        l0.o(t5, ProtectedSandApp.s("䴺"));
        return t5;
    }
}
