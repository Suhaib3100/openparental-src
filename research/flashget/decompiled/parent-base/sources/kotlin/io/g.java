package kotlin.io;

import androidx.compose.ui.graphics.l6;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.w;
import kotlin.jvm.internal.l0;

/* compiled from: FilePathComponents.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\u000b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J*\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u001c\u001a\u0004\b\u001d\u0010\u000eR\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001e\u001a\u0004\b\u001f\u0010\u0010R\u0011\u0010!\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b \u0010\u0015R\u0011\u0010$\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0011\u0010&\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b%\u0010\u0017¨\u0006'"}, d2 = {"Lkotlin/io/g;", "", "Ljava/io/File;", "root", "", "segments", "<init>", "(Ljava/io/File;Ljava/util/List;)V", "", "beginIndex", "endIndex", "j", "(II)Ljava/io/File;", "a", "()Ljava/io/File;", "b", "()Ljava/util/List;", "c", "(Ljava/io/File;Ljava/util/List;)Lkotlin/io/g;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/io/File;", "e", "Ljava/util/List;", "g", "f", "rootName", "i", "()Z", "isRooted", "h", "size", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class g {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final File root;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final List<File> segments;

    /* JADX WARN: Multi-variable type inference failed */
    public g(@fg.l File file, @fg.l List<? extends File> list) {
        l0.p(file, ProtectedSandApp.s("揨\u0001"));
        l0.p(list, ProtectedSandApp.s("揩\u0001"));
        this.root = file;
        this.segments = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ g d(g gVar, File file, List list, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            file = gVar.root;
        }
        if ((i4 & 2) != 0) {
            list = gVar.segments;
        }
        return gVar.c(file, list);
    }

    @fg.l
    /* renamed from: a, reason: from getter */
    public final File getRoot() {
        return this.root;
    }

    @fg.l
    public final List<File> b() {
        return this.segments;
    }

    @fg.l
    public final g c(@fg.l File root, @fg.l List<? extends File> segments) {
        l0.p(root, ProtectedSandApp.s("揨\u0001"));
        l0.p(segments, ProtectedSandApp.s("揩\u0001"));
        return new g(root, segments);
    }

    @fg.l
    public final File e() {
        return this.root;
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof g)) {
            return false;
        }
        g gVar = (g) other;
        return l0.g(this.root, gVar.root) && l0.g(this.segments, gVar.segments);
    }

    @fg.l
    public final String f() {
        String path = this.root.getPath();
        l0.o(path, ProtectedSandApp.s("揪\u0001"));
        return path;
    }

    @fg.l
    public final List<File> g() {
        return this.segments;
    }

    public final int h() {
        return this.segments.size();
    }

    public int hashCode() {
        return this.segments.hashCode() + (this.root.hashCode() * 31);
    }

    public final boolean i() {
        String path = this.root.getPath();
        l0.o(path, ProtectedSandApp.s("揪\u0001"));
        return path.length() > 0;
    }

    @fg.l
    public final File j(int beginIndex, int endIndex) {
        if (beginIndex < 0 || beginIndex > endIndex || endIndex > this.segments.size()) {
            throw new IllegalArgumentException();
        }
        List<File> subList = this.segments.subList(beginIndex, endIndex);
        String str = File.separator;
        l0.o(str, ProtectedSandApp.s("揫\u0001"));
        return new File(w.m3(subList, str, null, null, 0, null, null, 62, null));
    }

    @fg.l
    public String toString() {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("揬\u0001"));
        sb.append(this.root);
        sb.append(ProtectedSandApp.s("揭\u0001"));
        return l6.a(sb, this.segments, ')');
    }
}
