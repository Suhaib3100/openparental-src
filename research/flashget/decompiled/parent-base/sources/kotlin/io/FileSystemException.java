package kotlin.io;

import java.io.File;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.w;

/* compiled from: Exceptions.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0016\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\t\u0010\fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\r\u0010\u0010¨\u0006\u0011"}, d2 = {"Lkotlin/io/FileSystemException;", "Ljava/io/IOException;", "Ljava/io/File;", "file", "other", "", "reason", "<init>", "(Ljava/io/File;Ljava/io/File;Ljava/lang/String;)V", "b", "Ljava/io/File;", "a", "()Ljava/io/File;", "c", "d", "Ljava/lang/String;", "()Ljava/lang/String;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public class FileSystemException extends IOException {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final File file;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final File other;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final String reason;

    public /* synthetic */ FileSystemException(File file, File file2, String str, int i4, w wVar) {
        this(file, (i4 & 2) != 0 ? null : file2, (i4 & 4) != 0 ? null : str);
    }

    @fg.l
    /* renamed from: a, reason: from getter */
    public final File getFile() {
        return this.file;
    }

    @fg.m
    /* renamed from: b, reason: from getter */
    public final File getOther() {
        return this.other;
    }

    @fg.m
    /* renamed from: c, reason: from getter */
    public final String getReason() {
        return this.reason;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public FileSystemException(@fg.l java.io.File r2, @fg.m java.io.File r3, @fg.m java.lang.String r4) {
        /*
            r1 = this;
            java.lang.String r0 = "掞\u0001"
            java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
            kotlin.jvm.internal.l0.p(r2, r0)
            java.lang.String r0 = kotlin.io.e.a(r2, r3, r4)
            r1.<init>(r0)
            r1.file = r2
            r1.other = r3
            r1.reason = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.io.FileSystemException.<init>(java.io.File, java.io.File, java.lang.String):void");
    }
}
