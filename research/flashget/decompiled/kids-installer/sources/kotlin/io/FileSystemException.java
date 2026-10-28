package kotlin.io;

import java.io.File;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.w;

/* compiled from: Exceptions.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lkotlin/io/FileSystemException;", "Ljava/io/IOException;", "file", "Ljava/io/File;", "other", "reason", "", "(Ljava/io/File;Ljava/io/File;Ljava/lang/String;)V", "getFile", "()Ljava/io/File;", "getOther", "getReason", "()Ljava/lang/String;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public class FileSystemException extends IOException {

    /* renamed from: o, reason: collision with root package name */
    @d5.d
    private final File f23352o;

    /* renamed from: p, reason: collision with root package name */
    @d5.e
    private final File f23353p;

    /* renamed from: q, reason: collision with root package name */
    @d5.e
    private final String f23354q;

    public /* synthetic */ FileSystemException(File file, File file2, String str, int i5, w wVar) {
        this(file, (i5 & 2) != 0 ? null : file2, (i5 & 4) != 0 ? null : str);
    }

    @d5.d
    /* renamed from: a, reason: from getter */
    public final File getF23352o() {
        return this.f23352o;
    }

    @d5.e
    /* renamed from: b, reason: from getter */
    public final File getF23353p() {
        return this.f23353p;
    }

    @d5.e
    /* renamed from: c, reason: from getter */
    public final String getF23354q() {
        return this.f23354q;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public FileSystemException(@d5.d java.io.File r2, @d5.e java.io.File r3, @d5.e java.lang.String r4) {
        /*
            r1 = this;
            java.lang.String r0 = "㽠"
            java.lang.String r0 = com.flashget.kidsdownloader.ProtectedSandApp.s(r0)
            kotlin.jvm.internal.l0.p(r2, r0)
            java.lang.String r0 = kotlin.io.e.a(r2, r3, r4)
            r1.<init>(r0)
            r1.f23352o = r2
            r1.f23353p = r3
            r1.f23354q = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.io.FileSystemException.<init>(java.io.File, java.io.File, java.lang.String):void");
    }
}
