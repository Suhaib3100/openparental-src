package okio;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;

/* compiled from: -Platform.kt */
@kd.i(name = "-Platform")
@Metadata(d1 = {"\u0000.\n\u0002\u0010\u0012\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0004\u001a\u00020\u0000*\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a/\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00062\u0006\u0010\b\u001a\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0080\bø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f*\n\u0010\u000e\"\u00020\r2\u00020\r*\n\u0010\u0010\"\u00020\u000f2\u00020\u000f*\n\u0010\u0012\"\u00020\u00112\u00020\u0011\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0013"}, d2 = {"", "", "c", "([B)Ljava/lang/String;", "a", "(Ljava/lang/String;)[B", "R", "", "lock", "Lkotlin/Function0;", "block", "b", "(Ljava/lang/Object;Lld/a;)Ljava/lang/Object;", "Ljava/lang/ArrayIndexOutOfBoundsException;", "ArrayIndexOutOfBoundsException", "Ljava/io/EOFException;", "EOFException", "Ljava/io/IOException;", "IOException", "okio"}, k = 2, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class i {
    @fg.l
    public static final byte[] a(@fg.l String str) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("Ὡ"));
        byte[] bytes = str.getBytes(kotlin.text.f.UTF_8);
        kotlin.jvm.internal.l0.o(bytes, ProtectedSandApp.s("Ὢ"));
        return bytes;
    }

    public static final <R> R b(@fg.l Object obj, @fg.l ld.a<? extends R> aVar) {
        R invoke;
        kotlin.jvm.internal.l0.p(obj, ProtectedSandApp.s("Ὣ"));
        kotlin.jvm.internal.l0.p(aVar, ProtectedSandApp.s("Ὤ"));
        synchronized (obj) {
            invoke = aVar.invoke();
        }
        return invoke;
    }

    @fg.l
    public static final String c(@fg.l byte[] bArr) {
        kotlin.jvm.internal.l0.p(bArr, ProtectedSandApp.s("Ὥ"));
        return new String(bArr, kotlin.text.f.UTF_8);
    }
}
