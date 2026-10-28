package kotlin.io;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.ByteArrayOutputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: FileReadWrite.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\t\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lkotlin/io/f;", "Ljava/io/ByteArrayOutputStream;", "", "size", "<init>", "(I)V", "", "a", "()[B", "buffer", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
final class f extends ByteArrayOutputStream {
    public f(int i4) {
        super(i4);
    }

    @fg.l
    public final byte[] a() {
        byte[] bArr = ((ByteArrayOutputStream) this).buf;
        l0.o(bArr, ProtectedSandApp.s("揧\u0001"));
        return bArr;
    }
}
