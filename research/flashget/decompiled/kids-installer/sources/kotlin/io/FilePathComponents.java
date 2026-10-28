package kotlin.io;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.j0;
import kotlin.jvm.internal.l0;

/* compiled from: FilePathComponents.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\r\b\u0080\b\u0018\u00002\u00020\u0001B\u001d\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J#\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0013HÖ\u0001J\u0016\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u0013J\t\u0010\u001f\u001a\u00020\rHÖ\u0001R\u0011\u0010\u0007\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006 "}, d2 = {"Lkotlin/io/FilePathComponents;", "", "root", "Ljava/io/File;", "segments", "", "(Ljava/io/File;Ljava/util/List;)V", "isRooted", "", "()Z", "getRoot", "()Ljava/io/File;", "rootName", "", "getRootName", "()Ljava/lang/String;", "getSegments", "()Ljava/util/List;", "size", "", "getSize", "()I", "component1", "component2", "copy", "equals", "other", "hashCode", "subPath", "beginIndex", "endIndex", "toString", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlin.io.g, reason: from Kotlin metadata */
/* loaded from: classes5.dex */
public final /* data */ class FilePathComponents {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    private final File f23395a;

    /* renamed from: b, reason: collision with root package name */
    @d5.d
    private final List<File> f23396b;

    /* JADX WARN: Multi-variable type inference failed */
    public FilePathComponents(@d5.d File file, @d5.d List<? extends File> list) {
        l0.p(file, ProtectedSandApp.s("㿨"));
        l0.p(list, ProtectedSandApp.s("㿩"));
        this.f23395a = file;
        this.f23396b = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FilePathComponents d(FilePathComponents filePathComponents, File file, List list, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            file = filePathComponents.f23395a;
        }
        if ((i5 & 2) != 0) {
            list = filePathComponents.f23396b;
        }
        return filePathComponents.c(file, list);
    }

    @d5.d
    /* renamed from: a, reason: from getter */
    public final File getF23395a() {
        return this.f23395a;
    }

    @d5.d
    public final List<File> b() {
        return this.f23396b;
    }

    @d5.d
    public final FilePathComponents c(@d5.d File file, @d5.d List<? extends File> list) {
        l0.p(file, ProtectedSandApp.s("㿪"));
        l0.p(list, ProtectedSandApp.s("㿫"));
        return new FilePathComponents(file, list);
    }

    @d5.d
    public final File e() {
        return this.f23395a;
    }

    public boolean equals(@d5.e Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FilePathComponents)) {
            return false;
        }
        FilePathComponents filePathComponents = (FilePathComponents) other;
        return l0.g(this.f23395a, filePathComponents.f23395a) && l0.g(this.f23396b, filePathComponents.f23396b);
    }

    @d5.d
    public final String f() {
        String path = this.f23395a.getPath();
        l0.o(path, ProtectedSandApp.s("㿬"));
        return path;
    }

    @d5.d
    public final List<File> g() {
        return this.f23396b;
    }

    public final int h() {
        return this.f23396b.size();
    }

    public int hashCode() {
        return this.f23396b.hashCode() + (this.f23395a.hashCode() * 31);
    }

    public final boolean i() {
        String path = this.f23395a.getPath();
        l0.o(path, ProtectedSandApp.s("㿭"));
        return path.length() > 0;
    }

    @d5.d
    public final File j(int i5, int i6) {
        String m32;
        if (i5 < 0 || i5 > i6 || i6 > h()) {
            throw new IllegalArgumentException();
        }
        List<File> subList = this.f23396b.subList(i5, i6);
        String str = File.separator;
        l0.o(str, ProtectedSandApp.s("㿮"));
        m32 = j0.m3(subList, str, null, null, 0, null, null, 62, null);
        return new File(m32);
    }

    @d5.d
    public String toString() {
        return ProtectedSandApp.s("㿯") + this.f23395a + ProtectedSandApp.s("㿰") + this.f23396b + ')';
    }
}
