package kotlin.jvm.internal;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.Serializable;
import kotlin.SinceKotlin;
import kotlin.reflect.KFunction;

/* compiled from: FunInterfaceConstructorReference.java */
@SinceKotlin(version = "1.7")
/* loaded from: classes6.dex */
public class c0 extends g0 implements Serializable {

    /* renamed from: x, reason: collision with root package name */
    private final Class f23540x;

    public c0(Class cls) {
        super(1);
        this.f23540x = cls;
    }

    @Override // kotlin.jvm.internal.g0
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c0) {
            return this.f23540x.equals(((c0) obj).f23540x);
        }
        return false;
    }

    @Override // kotlin.jvm.internal.g0
    public int hashCode() {
        return this.f23540x.hashCode();
    }

    @Override // kotlin.jvm.internal.g0
    public String toString() {
        return ProtectedSandApp.s("绪").concat(this.f23540x.getName());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.jvm.internal.g0, kotlin.jvm.internal.q
    /* renamed from: z0 */
    public KFunction x0() {
        throw new UnsupportedOperationException(ProtectedSandApp.s("绫"));
    }
}
