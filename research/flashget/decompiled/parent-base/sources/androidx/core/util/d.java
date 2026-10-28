package androidx.core.util;

import android.util.AtomicFile;
import java.io.FileOutputStream;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;
import kotlin.k2;

/* compiled from: AtomicFile.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001a7\u0010\b\u001a\u00020\u0006*\u00020\u00002!\u0010\u0007\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u00060\u0001H\u0086\b¢\u0006\u0004\b\b\u0010\t\u001a\u0019\u0010\f\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r\u001a#\u0010\u0012\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0014\u0010\u0014\u001a\u00020\n*\u00020\u0000H\u0086\b¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001b\u0010\u0016\u001a\u00020\u000e*\u00020\u00002\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Landroid/util/AtomicFile;", "Lkotlin/Function1;", "Ljava/io/FileOutputStream;", "Lkotlin/r0;", "name", "out", "Lkotlin/k2;", "block", "d", "(Landroid/util/AtomicFile;Lld/l;)V", "", "array", "e", "(Landroid/util/AtomicFile;[B)V", "", "text", "Ljava/nio/charset/Charset;", "charset", "f", "(Landroid/util/AtomicFile;Ljava/lang/String;Ljava/nio/charset/Charset;)V", "a", "(Landroid/util/AtomicFile;)[B", "b", "(Landroid/util/AtomicFile;Ljava/nio/charset/Charset;)Ljava/lang/String;", "core-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nAtomicFile.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AtomicFile.kt\nandroidx/core/util/AtomicFileKt\n*L\n1#1,72:1\n30#1,13:73\n*S KotlinDebug\n*F\n+ 1 AtomicFile.kt\nandroidx/core/util/AtomicFileKt\n*L\n46#1:73,13\n*E\n"})
/* loaded from: classes3.dex */
public final class d {
    @fg.l
    public static final byte[] a(@fg.l AtomicFile atomicFile) {
        return atomicFile.readFully();
    }

    @fg.l
    public static final String b(@fg.l AtomicFile atomicFile, @fg.l Charset charset) {
        return new String(atomicFile.readFully(), charset);
    }

    public static /* synthetic */ String c(AtomicFile atomicFile, Charset charset, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            charset = kotlin.text.f.UTF_8;
        }
        return b(atomicFile, charset);
    }

    public static final void d(@fg.l AtomicFile atomicFile, @fg.l ld.l<? super FileOutputStream, k2> lVar) {
        FileOutputStream startWrite = atomicFile.startWrite();
        try {
            lVar.invoke(startWrite);
            atomicFile.finishWrite(startWrite);
        } catch (Throwable th) {
            atomicFile.failWrite(startWrite);
            throw th;
        }
    }

    public static final void e(@fg.l AtomicFile atomicFile, @fg.l byte[] bArr) {
        FileOutputStream startWrite = atomicFile.startWrite();
        try {
            startWrite.write(bArr);
            atomicFile.finishWrite(startWrite);
        } catch (Throwable th) {
            atomicFile.failWrite(startWrite);
            throw th;
        }
    }

    public static final void f(@fg.l AtomicFile atomicFile, @fg.l String str, @fg.l Charset charset) {
        byte[] bytes = str.getBytes(charset);
        kotlin.jvm.internal.l0.o(bytes, "this as java.lang.String).getBytes(charset)");
        e(atomicFile, bytes);
    }

    public static /* synthetic */ void g(AtomicFile atomicFile, String str, Charset charset, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            charset = kotlin.text.f.UTF_8;
        }
        f(atomicFile, str, charset);
    }
}
