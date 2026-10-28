package kotlin.io;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.j0;
import kotlin.collections.w;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.text.v;

/* compiled from: FilePathComponents.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a#\u0010\n\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\n\u0010\u000b\"\u0018\u0010\u000e\u001a\u00020\u0000*\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r\"\u0018\u0010\u0011\u001a\u00020\u0004*\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\"\u0015\u0010\u0015\u001a\u00020\u0012*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"", "", "b", "(Ljava/lang/String;)I", "Ljava/io/File;", "Lkotlin/io/g;", "f", "(Ljava/io/File;)Lkotlin/io/g;", "beginIndex", "endIndex", "e", "(Ljava/io/File;II)Ljava/io/File;", "c", "(Ljava/io/File;)Ljava/lang/String;", "rootName", "a", "(Ljava/io/File;)Ljava/io/File;", "root", "", "d", "(Ljava/io/File;)Z", "isRooted", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/io/FilesKt")
@r1({"SMAP\nFilePathComponents.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FilePathComponents.kt\nkotlin/io/FilesKt__FilePathComponentsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,148:1\n1549#2:149\n1620#2,3:150\n*S KotlinDebug\n*F\n+ 1 FilePathComponents.kt\nkotlin/io/FilesKt__FilePathComponentsKt\n*L\n133#1:149\n133#1:150,3\n*E\n"})
/* loaded from: classes7.dex */
class k {
    @fg.l
    public static final File a(@fg.l File file) {
        l0.p(file, ProtectedSandApp.s("揻\u0001"));
        return new File(c(file));
    }

    private static final int b(String str) {
        int o32;
        char c5 = File.separatorChar;
        int o33 = v.o3(str, c5, 0, false, 4, null);
        if (o33 == 0) {
            if (str.length() <= 1 || str.charAt(1) != c5 || (o32 = v.o3(str, c5, 2, false, 4, null)) < 0) {
                return 1;
            }
            int o34 = v.o3(str, c5, o32 + 1, false, 4, null);
            return o34 >= 0 ? o34 + 1 : str.length();
        }
        if (o33 > 0 && str.charAt(o33 - 1) == ':') {
            return o33 + 1;
        }
        if (o33 == -1 && v.Y2(str, ':', false, 2, null)) {
            return str.length();
        }
        return 0;
    }

    @fg.l
    public static final String c(@fg.l File file) {
        l0.p(file, ProtectedSandApp.s("揻\u0001"));
        String path = file.getPath();
        String s4 = ProtectedSandApp.s("揼\u0001");
        l0.o(path, s4);
        String path2 = file.getPath();
        l0.o(path2, s4);
        String substring = path.substring(0, b(path2));
        l0.o(substring, ProtectedSandApp.s("揽\u0001"));
        return substring;
    }

    public static final boolean d(@fg.l File file) {
        l0.p(file, ProtectedSandApp.s("揻\u0001"));
        String path = file.getPath();
        l0.o(path, ProtectedSandApp.s("揼\u0001"));
        return b(path) > 0;
    }

    @fg.l
    public static final File e(@fg.l File file, int i4, int i5) {
        l0.p(file, ProtectedSandApp.s("揻\u0001"));
        return f(file).j(i4, i5);
    }

    @fg.l
    public static final g f(@fg.l File file) {
        List list;
        l0.p(file, ProtectedSandApp.s("揻\u0001"));
        String path = file.getPath();
        l0.m(path);
        int b5 = b(path);
        String substring = path.substring(0, b5);
        String s4 = ProtectedSandApp.s("揽\u0001");
        l0.o(substring, s4);
        String substring2 = path.substring(b5);
        l0.o(substring2, s4);
        if (substring2.length() == 0) {
            list = j0.f74919b;
        } else {
            List Q4 = v.Q4(substring2, new char[]{File.separatorChar}, false, 0, 6, null);
            ArrayList arrayList = new ArrayList(w.b0(Q4, 10));
            Iterator it = Q4.iterator();
            while (it.hasNext()) {
                arrayList.add(new File((String) it.next()));
            }
            list = arrayList;
        }
        return new g(new File(substring), list);
    }
}
