package okhttp3.internal.publicsuffix;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.m;
import kotlin.Metadata;
import kotlin.jvm.internal.v0;

/* compiled from: PublicSuffixDatabase.kt */
@Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 0})
/* loaded from: classes3.dex */
final /* synthetic */ class a extends v0 {
    a(PublicSuffixDatabase publicSuffixDatabase) {
        super(publicSuffixDatabase, PublicSuffixDatabase.class, ProtectedSandApp.s("ẁ"), ProtectedSandApp.s("Ẃ"), 0);
    }

    @Override // kotlin.jvm.internal.v0, kotlin.reflect.p
    @m
    public Object get() {
        return PublicSuffixDatabase.b((PublicSuffixDatabase) this.receiver);
    }

    @Override // kotlin.jvm.internal.v0, kotlin.reflect.k
    public void set(@m Object obj) {
        ((PublicSuffixDatabase) this.receiver).publicSuffixListBytes = (byte[]) obj;
    }
}
