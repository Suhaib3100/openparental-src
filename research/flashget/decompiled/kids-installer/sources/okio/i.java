package okio;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.text.Charsets;

/* compiled from: -Platform.kt */
@p3.i(name = "-Platform")
@Metadata(d1 = {"\u0000.\n\u0002\u0010\u0012\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000\u001a\f\u0010\u0003\u001a\u00020\u0000*\u00020\u0001H\u0000\u001a/\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0080\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\n*\n\u0010\f\"\u00020\u000b2\u00020\u000b*\n\u0010\u000e\"\u00020\r2\u00020\r*\n\u0010\u0010\"\u00020\u000f2\u00020\u000f\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0011"}, d2 = {"", "", "c", "a", "R", "", "lock", "Lkotlin/Function0;", "block", "b", "(Ljava/lang/Object;Lq3/a;)Ljava/lang/Object;", "Ljava/lang/ArrayIndexOutOfBoundsException;", "ArrayIndexOutOfBoundsException", "Ljava/io/EOFException;", "EOFException", "Ljava/io/IOException;", "IOException", "okio"}, k = 2, mv = {1, 4, 0})
/* loaded from: classes5.dex */
public final class i {
    @d5.d
    public static final byte[] a(@d5.d String str) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("核"));
        byte[] bytes = str.getBytes(Charsets.f27049b);
        kotlin.jvm.internal.l0.o(bytes, ProtectedSandApp.s("根"));
        return bytes;
    }

    public static final <R> R b(@d5.d Object obj, @d5.d q3.a<? extends R> aVar) {
        R n5;
        kotlin.jvm.internal.l0.p(obj, ProtectedSandApp.s("栺"));
        kotlin.jvm.internal.l0.p(aVar, ProtectedSandApp.s("栻"));
        synchronized (obj) {
            n5 = aVar.n();
        }
        return n5;
    }

    @d5.d
    public static final String c(@d5.d byte[] bArr) {
        kotlin.jvm.internal.l0.p(bArr, ProtectedSandApp.s("格"));
        return new String(bArr, Charsets.f27049b);
    }
}
