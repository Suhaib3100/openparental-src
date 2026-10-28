package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import com.flashget.kidsdownloader.ProtectedSandApp;

/* compiled from: AnnotatedImpl.java */
/* loaded from: classes5.dex */
public class b implements a {

    /* renamed from: o, reason: collision with root package name */
    private final g f24104o;

    public b(@d5.d g gVar) {
        if (gVar == null) {
            Q(0);
        }
        this.f24104o = gVar;
    }

    private static /* synthetic */ void Q(int i5) {
        String s5 = i5 != 1 ? ProtectedSandApp.s("䛙") : ProtectedSandApp.s("䛚");
        Object[] objArr = new Object[i5 != 1 ? 3 : 2];
        String s6 = ProtectedSandApp.s("䛛");
        if (i5 != 1) {
            objArr[0] = ProtectedSandApp.s("䛜");
        } else {
            objArr[0] = s6;
        }
        if (i5 != 1) {
            objArr[1] = s6;
        } else {
            objArr[1] = ProtectedSandApp.s("䛝");
        }
        if (i5 != 1) {
            objArr[2] = ProtectedSandApp.s("䛞");
        }
        String format = String.format(s5, objArr);
        if (i5 == 1) {
            throw new IllegalStateException(format);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.a
    @d5.d
    public g getAnnotations() {
        g gVar = this.f24104o;
        if (gVar == null) {
            Q(1);
        }
        return gVar;
    }
}
