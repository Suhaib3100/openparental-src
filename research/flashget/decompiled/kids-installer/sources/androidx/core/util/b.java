package androidx.core.util;

import android.util.AtomicFile;
import androidx.annotation.x0;
import java.io.FileOutputStream;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.m2;
import kotlin.text.Charsets;

/* compiled from: AtomicFile.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a3\u0010\b\u001a\u00020\u0006*\u00020\u00002!\u0010\u0007\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u00060\u0001H\u0087\bø\u0001\u0000\u001a\u0014\u0010\u000b\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\n\u001a\u00020\tH\u0007\u001a\u001e\u0010\u0010\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0007\u001a\r\u0010\u0011\u001a\u00020\t*\u00020\u0000H\u0087\b\u001a\u0016\u0010\u0012\u001a\u00020\f*\u00020\u00002\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0007\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0013"}, d2 = {"Landroid/util/AtomicFile;", "Lkotlin/Function1;", "Ljava/io/FileOutputStream;", "Lkotlin/r0;", "name", "out", "Lkotlin/m2;", "block", "d", "", "array", "e", "", "text", "Ljava/nio/charset/Charset;", "charset", "f", "a", "b", "core-ktx_release"}, k = 2, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class b {
    @x0(17)
    @d5.d
    public static final byte[] a(@d5.d AtomicFile atomicFile) {
        l0.p(atomicFile, "<this>");
        byte[] readFully = atomicFile.readFully();
        l0.o(readFully, "readFully()");
        return readFully;
    }

    @x0(17)
    @d5.d
    public static final String b(@d5.d AtomicFile atomicFile, @d5.d Charset charset) {
        l0.p(atomicFile, "<this>");
        l0.p(charset, "charset");
        byte[] readFully = atomicFile.readFully();
        l0.o(readFully, "readFully()");
        return new String(readFully, charset);
    }

    public static /* synthetic */ String c(AtomicFile atomicFile, Charset charset, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            charset = Charsets.f27049b;
        }
        return b(atomicFile, charset);
    }

    @x0(17)
    public static final void d(@d5.d AtomicFile atomicFile, @d5.d q3.l<? super FileOutputStream, m2> block) {
        l0.p(atomicFile, "<this>");
        l0.p(block, "block");
        FileOutputStream stream = atomicFile.startWrite();
        try {
            l0.o(stream, "stream");
            block.N(stream);
            atomicFile.finishWrite(stream);
        } catch (Throwable th) {
            atomicFile.failWrite(stream);
            throw th;
        }
    }

    @x0(17)
    public static final void e(@d5.d AtomicFile atomicFile, @d5.d byte[] array) {
        l0.p(atomicFile, "<this>");
        l0.p(array, "array");
        FileOutputStream stream = atomicFile.startWrite();
        try {
            l0.o(stream, "stream");
            stream.write(array);
            atomicFile.finishWrite(stream);
        } catch (Throwable th) {
            atomicFile.failWrite(stream);
            throw th;
        }
    }

    @x0(17)
    public static final void f(@d5.d AtomicFile atomicFile, @d5.d String text, @d5.d Charset charset) {
        l0.p(atomicFile, "<this>");
        l0.p(text, "text");
        l0.p(charset, "charset");
        byte[] bytes = text.getBytes(charset);
        l0.o(bytes, "(this as java.lang.String).getBytes(charset)");
        e(atomicFile, bytes);
    }

    public static /* synthetic */ void g(AtomicFile atomicFile, String str, Charset charset, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            charset = Charsets.f27049b;
        }
        f(atomicFile, str, charset);
    }
}
