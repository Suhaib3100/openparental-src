package kotlin.jvm.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.Serializable;

/* compiled from: FunInterfaceConstructorReference.java */
@kotlin.c1(version = "1.7")
/* loaded from: classes7.dex */
public class c0 extends g0 implements Serializable {

    /* renamed from: d, reason: collision with root package name */
    private final Class f75298d;

    public c0(Class cls) {
        super(1);
        this.f75298d = cls;
    }

    @Override // kotlin.jvm.internal.g0
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c0) {
            return this.f75298d.equals(((c0) obj).f75298d);
        }
        return false;
    }

    @Override // kotlin.jvm.internal.g0
    public int hashCode() {
        return this.f75298d.hashCode();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.jvm.internal.g0, kotlin.jvm.internal.q
    /* renamed from: l */
    public kotlin.reflect.i getReflected() {
        throw new UnsupportedOperationException(ProtectedSandApp.s("擜\u0001"));
    }

    @Override // kotlin.jvm.internal.g0
    public String toString() {
        return ProtectedSandApp.s("擝\u0001").concat(this.f75298d.getName());
    }
}
