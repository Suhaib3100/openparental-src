package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: AnnotatedImpl.java */
/* loaded from: classes7.dex */
public class b implements a {

    /* renamed from: b, reason: collision with root package name */
    private final g f75901b;

    public b(@fg.l g gVar) {
        if (gVar == null) {
            j0(0);
        }
        this.f75901b = gVar;
    }

    private static /* synthetic */ void j0(int i4) {
        String s4 = i4 != 1 ? ProtectedSandApp.s("桺\u0001") : ProtectedSandApp.s("桻\u0001");
        Object[] objArr = new Object[i4 != 1 ? 3 : 2];
        String s5 = ProtectedSandApp.s("桼\u0001");
        if (i4 != 1) {
            objArr[0] = ProtectedSandApp.s("桽\u0001");
        } else {
            objArr[0] = s5;
        }
        if (i4 != 1) {
            objArr[1] = s5;
        } else {
            objArr[1] = ProtectedSandApp.s("桾\u0001");
        }
        if (i4 != 1) {
            objArr[2] = ProtectedSandApp.s("桿\u0001");
        }
        String format = String.format(s4, objArr);
        if (i4 == 1) {
            throw new IllegalStateException(format);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.a
    @fg.l
    public g getAnnotations() {
        g gVar = this.f75901b;
        if (gVar == null) {
            j0(1);
        }
        return gVar;
    }
}
