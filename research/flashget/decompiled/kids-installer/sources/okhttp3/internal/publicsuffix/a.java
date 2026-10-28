package okhttp3.internal.publicsuffix;

import com.flashget.kidsdownloader.ProtectedSandApp;
import d5.e;
import kotlin.Metadata;
import kotlin.jvm.internal.v0;

/* compiled from: PublicSuffixDatabase.kt */
@Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 0})
/* loaded from: classes6.dex */
final /* synthetic */ class a extends v0 {
    a(PublicSuffixDatabase publicSuffixDatabase) {
        super(publicSuffixDatabase, PublicSuffixDatabase.class, ProtectedSandApp.s("鈙"), ProtectedSandApp.s("鈚"), 0);
    }

    @Override // kotlin.jvm.internal.v0, kotlin.reflect.KProperty0
    @e
    public Object get() {
        return PublicSuffixDatabase.b((PublicSuffixDatabase) this.f23596p);
    }

    @Override // kotlin.jvm.internal.v0, kotlin.reflect.KMutableProperty0
    public void set(@e Object obj) {
        ((PublicSuffixDatabase) this.f23596p).publicSuffixListBytes = (byte[]) obj;
    }
}
