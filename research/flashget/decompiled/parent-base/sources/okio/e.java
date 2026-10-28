package okio;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.x0;

/* compiled from: -DeprecatedUtf8.kt */
@kotlin.k(message = "changed in Okio 2.x")
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lokio/e;", "", "<init>", "()V", "", "string", "", "a", "(Ljava/lang/String;)J", "", "beginIndex", "endIndex", "b", "(Ljava/lang/String;II)J", "okio"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final e f85165a = new e();

    private e() {
    }

    @kotlin.k(level = kotlin.m.ERROR, message = "moved to extension function", replaceWith = @x0(expression = "string.utf8Size()", imports = {"okio.utf8Size"}))
    public final long a(@fg.l String string) {
        kotlin.jvm.internal.l0.p(string, ProtectedSandApp.s("ἲ"));
        return r0.l(string, 0, 0, 3, null);
    }

    @kotlin.k(level = kotlin.m.ERROR, message = "moved to extension function", replaceWith = @x0(expression = "string.utf8Size(beginIndex, endIndex)", imports = {"okio.utf8Size"}))
    public final long b(@fg.l String string, int beginIndex, int endIndex) {
        kotlin.jvm.internal.l0.p(string, ProtectedSandApp.s("ἲ"));
        return r0.k(string, beginIndex, endIndex);
    }
}
