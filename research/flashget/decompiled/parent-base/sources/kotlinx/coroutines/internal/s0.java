package kotlinx.coroutines.internal;

import androidx.compose.foundation.layout.f3;
import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;

/* compiled from: Symbol.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\n\u001a\u00028\u0000\"\u0004\b\u0000\u0010\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0086\b¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\f¨\u0006\r"}, d2 = {"Lkotlinx/coroutines/internal/s0;", "", "", "symbol", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "T", "value", "a", "(Ljava/lang/Object;)Ljava/lang/Object;", "Ljava/lang/String;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class s0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    @kd.f
    public final String symbol;

    public s0(@fg.l String str) {
        this.symbol = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T> T a(@fg.m Object value) {
        if (value == this) {
            return null;
        }
        return value;
    }

    @fg.l
    public String toString() {
        return f3.a(new StringBuilder(ProtectedSandApp.s("蠋\u0001")), this.symbol, kotlin.text.m0.greater);
    }
}
