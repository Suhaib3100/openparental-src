package kotlin.io;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.j0;
import kotlin.collections.y;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.l0;
import kotlin.m2;
import kotlin.text.e0;
import kotlin.text.h0;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Utils.kt */
@Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u001a*\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002H\u0007\u001a*\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002H\u0007\u001a8\u0010\u000e\u001a\u00020\u000f*\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\u001a\b\u0002\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013\u001a&\u0010\u0016\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\b\b\u0002\u0010\u0017\u001a\u00020\u0018\u001a\n\u0010\u0019\u001a\u00020\u000f*\u00020\u0002\u001a\u0012\u0010\u001a\u001a\u00020\u000f*\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0002\u001a\u0012\u0010\u001a\u001a\u00020\u000f*\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0001\u001a\n\u0010\u001c\u001a\u00020\u0002*\u00020\u0002\u001a\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u001d*\b\u0012\u0004\u0012\u00020\u00020\u001dH\u0002¢\u0006\u0002\b\u001e\u001a\u0011\u0010\u001c\u001a\u00020\u001f*\u00020\u001fH\u0002¢\u0006\u0002\b\u001e\u001a\u0012\u0010 \u001a\u00020\u0002*\u00020\u00022\u0006\u0010!\u001a\u00020\u0002\u001a\u0014\u0010\"\u001a\u0004\u0018\u00010\u0002*\u00020\u00022\u0006\u0010!\u001a\u00020\u0002\u001a\u0012\u0010#\u001a\u00020\u0002*\u00020\u00022\u0006\u0010!\u001a\u00020\u0002\u001a\u0012\u0010$\u001a\u00020\u0002*\u00020\u00022\u0006\u0010%\u001a\u00020\u0002\u001a\u0012\u0010$\u001a\u00020\u0002*\u00020\u00022\u0006\u0010%\u001a\u00020\u0001\u001a\u0012\u0010&\u001a\u00020\u0002*\u00020\u00022\u0006\u0010%\u001a\u00020\u0002\u001a\u0012\u0010&\u001a\u00020\u0002*\u00020\u00022\u0006\u0010%\u001a\u00020\u0001\u001a\u0012\u0010'\u001a\u00020\u000f*\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0002\u001a\u0012\u0010'\u001a\u00020\u000f*\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0001\u001a\u0012\u0010(\u001a\u00020\u0001*\u00020\u00022\u0006\u0010!\u001a\u00020\u0002\u001a\u001b\u0010)\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010!\u001a\u00020\u0002H\u0002¢\u0006\u0002\b*\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0015\u0010\u0005\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004\"\u0015\u0010\u0007\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\b\u0010\u0004¨\u0006+"}, d2 = {"extension", "", "Ljava/io/File;", "getExtension", "(Ljava/io/File;)Ljava/lang/String;", "invariantSeparatorsPath", "getInvariantSeparatorsPath", "nameWithoutExtension", "getNameWithoutExtension", "createTempDir", "prefix", "suffix", "directory", "createTempFile", "copyRecursively", "", "target", "overwrite", "onError", "Lkotlin/Function2;", "Ljava/io/IOException;", "Lkotlin/io/OnErrorAction;", "copyTo", "bufferSize", "", "deleteRecursively", "endsWith", "other", "normalize", "", "normalize$FilesKt__UtilsKt", "Lkotlin/io/FilePathComponents;", "relativeTo", "base", "relativeToOrNull", "relativeToOrSelf", "resolve", "relative", "resolveSibling", "startsWith", "toRelativeString", "toRelativeStringOrNull", "toRelativeStringOrNull$FilesKt__UtilsKt", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/io/FilesKt")
@SourceDebugExtension({"SMAP\nUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Utils.kt\nkotlin/io/FilesKt__UtilsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,473:1\n1#2:474\n1284#3,3:475\n*S KotlinDebug\n*F\n+ 1 Utils.kt\nkotlin/io/FilesKt__UtilsKt\n*L\n347#1:475,3\n*E\n"})
/* loaded from: classes6.dex */
public class n extends m {

    /* compiled from: Utils.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Ljava/io/File;", "exception", "Ljava/io/IOException;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    static final class a extends Lambda implements q3.p {

        /* renamed from: p, reason: collision with root package name */
        public static final a f23419p = new a();

        a() {
            super(2);
        }

        @Override // q3.p
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void g0(@d5.d File file, @d5.d IOException iOException) {
            l0.p(file, ProtectedSandApp.s("縔"));
            l0.p(iOException, ProtectedSandApp.s("縕"));
            throw iOException;
        }
    }

    /* compiled from: Utils.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "f", "Ljava/io/File;", "e", "Ljava/io/IOException;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    static final class b extends Lambda implements q3.p<File, IOException, m2> {

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ q3.p<File, IOException, OnErrorAction> f23420p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(q3.p<? super File, ? super IOException, ? extends OnErrorAction> pVar) {
            super(2);
            this.f23420p = pVar;
        }

        public final void a(@d5.d File file, @d5.d IOException iOException) {
            l0.p(file, ProtectedSandApp.s("縖"));
            l0.p(iOException, ProtectedSandApp.s("縗"));
            if (this.f23420p.g0(file, iOException) == OnErrorAction.TERMINATE) {
                throw new TerminateException(file);
            }
        }

        @Override // q3.p
        public /* bridge */ /* synthetic */ m2 g0(File file, IOException iOException) {
            a(file, iOException);
            return m2.f23662a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00c8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b4 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean N(@d5.d java.io.File r11, @d5.d java.io.File r12, boolean r13, @d5.d q3.p<? super java.io.File, ? super java.io.IOException, ? extends kotlin.io.OnErrorAction> r14) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.io.n.N(java.io.File, java.io.File, boolean, q3.p):boolean");
    }

    public static /* synthetic */ boolean O(File file, File file2, boolean z5, q3.p pVar, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            z5 = false;
        }
        if ((i5 & 4) != 0) {
            pVar = a.f23419p;
        }
        return N(file, file2, z5, pVar);
    }

    @d5.d
    public static final File P(@d5.d File file, @d5.d File file2, boolean z5, int i5) {
        l0.p(file, ProtectedSandApp.s("緝"));
        l0.p(file2, ProtectedSandApp.s("緞"));
        if (!file.exists()) {
            throw new NoSuchFileException(file, null, ProtectedSandApp.s("緢"), 2, null);
        }
        if (file2.exists()) {
            if (!z5) {
                throw new FileAlreadyExistsException(file, file2, ProtectedSandApp.s("締"));
            }
            if (!file2.delete()) {
                throw new FileAlreadyExistsException(file, file2, ProtectedSandApp.s("緟"));
            }
        }
        if (!file.isDirectory()) {
            File parentFile = file2.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                try {
                    kotlin.io.a.k(fileInputStream, fileOutputStream, i5);
                    kotlin.io.b.a(fileOutputStream, null);
                    kotlin.io.b.a(fileInputStream, null);
                } finally {
                }
            } finally {
            }
        } else if (!file2.mkdirs()) {
            throw new FileSystemException(file, file2, ProtectedSandApp.s("緡"));
        }
        return file2;
    }

    public static /* synthetic */ File Q(File file, File file2, boolean z5, int i5, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            z5 = false;
        }
        if ((i6 & 4) != 0) {
            i5 = 8192;
        }
        return P(file, file2, z5, i5);
    }

    @Deprecated(message = "Avoid creating temporary directories in the default temp location with this function due to too wide permissions on the newly created directory. Use kotlin.io.path.createTempDirectory instead.")
    @d5.d
    public static final File R(@d5.d String str, @d5.e String str2, @d5.e File file) {
        l0.p(str, ProtectedSandApp.s("緣"));
        File createTempFile = File.createTempFile(str, str2, file);
        createTempFile.delete();
        if (createTempFile.mkdir()) {
            l0.m(createTempFile);
            return createTempFile;
        }
        throw new IOException(ProtectedSandApp.s("緤") + createTempFile + org.apache.commons.io.k.f32026a);
    }

    public static /* synthetic */ File S(String str, String str2, File file, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = ProtectedSandApp.s("緥");
        }
        if ((i5 & 2) != 0) {
            str2 = null;
        }
        if ((i5 & 4) != 0) {
            file = null;
        }
        return R(str, str2, file);
    }

    @Deprecated(message = "Avoid creating temporary files in the default temp location with this function due to too wide permissions on the newly created file. Use kotlin.io.path.createTempFile instead or resort to java.io.File.createTempFile.")
    @d5.d
    public static final File T(@d5.d String str, @d5.e String str2, @d5.e File file) {
        l0.p(str, ProtectedSandApp.s("緦"));
        File createTempFile = File.createTempFile(str, str2, file);
        l0.o(createTempFile, ProtectedSandApp.s("緧"));
        return createTempFile;
    }

    public static /* synthetic */ File U(String str, String str2, File file, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = ProtectedSandApp.s("編");
        }
        if ((i5 & 2) != 0) {
            str2 = null;
        }
        if ((i5 & 4) != 0) {
            file = null;
        }
        return T(str, str2, file);
    }

    public static final boolean V(@d5.d File file) {
        l0.p(file, ProtectedSandApp.s("緩"));
        while (true) {
            boolean z5 = true;
            for (File file2 : m.L(file)) {
                if (file2.delete() || !file2.exists()) {
                    if (z5) {
                        break;
                    }
                }
                z5 = false;
            }
            return z5;
        }
    }

    public static final boolean W(@d5.d File file, @d5.d File file2) {
        l0.p(file, ProtectedSandApp.s("緪"));
        l0.p(file2, ProtectedSandApp.s("緫"));
        FilePathComponents f6 = k.f(file);
        FilePathComponents f7 = k.f(file2);
        if (f7.i()) {
            return l0.g(file, file2);
        }
        int h5 = f6.h() - f7.h();
        if (h5 < 0) {
            return false;
        }
        return f6.g().subList(h5, f6.h()).equals(f7.g());
    }

    public static final boolean X(@d5.d File file, @d5.d String str) {
        l0.p(file, ProtectedSandApp.s("緬"));
        l0.p(str, ProtectedSandApp.s("緭"));
        return W(file, new File(str));
    }

    @d5.d
    public static String Y(@d5.d File file) {
        String o5;
        l0.p(file, ProtectedSandApp.s("緮"));
        String name = file.getName();
        l0.o(name, ProtectedSandApp.s("緯"));
        o5 = h0.o5(name, org.apache.commons.io.k.f32026a, "");
        return o5;
    }

    @d5.d
    public static final String Z(@d5.d File file) {
        String h22;
        l0.p(file, ProtectedSandApp.s("緰"));
        char c6 = File.separatorChar;
        String s5 = ProtectedSandApp.s("緱");
        if (c6 == '/') {
            String path = file.getPath();
            l0.o(path, s5);
            return path;
        }
        String path2 = file.getPath();
        l0.o(path2, s5);
        h22 = e0.h2(path2, File.separatorChar, org.apache.commons.io.n.f32060b, false, 4, null);
        return h22;
    }

    @d5.d
    public static final String a0(@d5.d File file) {
        String z5;
        l0.p(file, ProtectedSandApp.s("緲"));
        String name = file.getName();
        l0.o(name, ProtectedSandApp.s("緳"));
        z5 = h0.z5(name, ProtectedSandApp.s("練"), null, 2, null);
        return z5;
    }

    @d5.d
    public static final File b0(@d5.d File file) {
        String m32;
        l0.p(file, ProtectedSandApp.s("緵"));
        FilePathComponents f6 = k.f(file);
        File e6 = f6.e();
        List<File> c02 = c0(f6.g());
        String str = File.separator;
        l0.o(str, ProtectedSandApp.s("緶"));
        m32 = j0.m3(c02, str, null, null, 0, null, null, 62, null);
        return i0(e6, m32);
    }

    private static final List<File> c0(List<? extends File> list) {
        Object p32;
        ArrayList arrayList = new ArrayList(list.size());
        for (File file : list) {
            String name = file.getName();
            if (!l0.g(name, ProtectedSandApp.s("緷"))) {
                String s5 = ProtectedSandApp.s("緸");
                if (l0.g(name, s5)) {
                    if (!arrayList.isEmpty()) {
                        p32 = j0.p3(arrayList);
                        if (!l0.g(((File) p32).getName(), s5)) {
                            arrayList.remove(arrayList.size() - 1);
                        }
                    }
                    arrayList.add(file);
                } else {
                    arrayList.add(file);
                }
            }
        }
        return arrayList;
    }

    private static final FilePathComponents d0(FilePathComponents filePathComponents) {
        return new FilePathComponents(filePathComponents.e(), c0(filePathComponents.g()));
    }

    @d5.d
    public static final File e0(@d5.d File file, @d5.d File file2) {
        l0.p(file, ProtectedSandApp.s("緹"));
        l0.p(file2, ProtectedSandApp.s("緺"));
        return new File(n0(file, file2));
    }

    @d5.e
    public static final File f0(@d5.d File file, @d5.d File file2) {
        l0.p(file, ProtectedSandApp.s("緻"));
        l0.p(file2, ProtectedSandApp.s("緼"));
        String o02 = o0(file, file2);
        if (o02 != null) {
            return new File(o02);
        }
        return null;
    }

    @d5.d
    public static final File g0(@d5.d File file, @d5.d File file2) {
        l0.p(file, ProtectedSandApp.s("緽"));
        l0.p(file2, ProtectedSandApp.s("緾"));
        String o02 = o0(file, file2);
        return o02 != null ? new File(o02) : file;
    }

    @d5.d
    public static final File h0(@d5.d File file, @d5.d File file2) {
        boolean Y2;
        l0.p(file, ProtectedSandApp.s("緿"));
        l0.p(file2, ProtectedSandApp.s("縀"));
        if (k.d(file2)) {
            return file2;
        }
        String file3 = file.toString();
        l0.o(file3, ProtectedSandApp.s("縁"));
        if (!(file3.length() == 0)) {
            Y2 = h0.Y2(file3, File.separatorChar, false, 2, null);
            if (!Y2) {
                StringBuilder a6 = androidx.constraintlayout.motion.widget.r.a(file3);
                a6.append(File.separatorChar);
                a6.append(file2);
                return new File(a6.toString());
            }
        }
        return new File(file3 + file2);
    }

    @d5.d
    public static final File i0(@d5.d File file, @d5.d String str) {
        l0.p(file, ProtectedSandApp.s("縂"));
        l0.p(str, ProtectedSandApp.s("縃"));
        return h0(file, new File(str));
    }

    @d5.d
    public static final File j0(@d5.d File file, @d5.d File file2) {
        l0.p(file, ProtectedSandApp.s("縄"));
        l0.p(file2, ProtectedSandApp.s("縅"));
        FilePathComponents f6 = k.f(file);
        return h0(h0(f6.e(), f6.h() == 0 ? new File(ProtectedSandApp.s("縆")) : f6.j(0, f6.h() - 1)), file2);
    }

    @d5.d
    public static final File k0(@d5.d File file, @d5.d String str) {
        l0.p(file, ProtectedSandApp.s("縇"));
        l0.p(str, ProtectedSandApp.s("縈"));
        return j0(file, new File(str));
    }

    public static final boolean l0(@d5.d File file, @d5.d File file2) {
        l0.p(file, ProtectedSandApp.s("縉"));
        l0.p(file2, ProtectedSandApp.s("縊"));
        FilePathComponents f6 = k.f(file);
        FilePathComponents f7 = k.f(file2);
        if (l0.g(f6.e(), f7.e()) && f6.h() >= f7.h()) {
            return f6.g().subList(0, f7.h()).equals(f7.g());
        }
        return false;
    }

    public static final boolean m0(@d5.d File file, @d5.d String str) {
        l0.p(file, ProtectedSandApp.s("縋"));
        l0.p(str, ProtectedSandApp.s("縌"));
        return l0(file, new File(str));
    }

    @d5.d
    public static final String n0(@d5.d File file, @d5.d File file2) {
        l0.p(file, ProtectedSandApp.s("縍"));
        l0.p(file2, ProtectedSandApp.s("縎"));
        String o02 = o0(file, file2);
        if (o02 != null) {
            return o02;
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("縏") + file + ProtectedSandApp.s("縐") + file2 + org.apache.commons.io.k.f32026a);
    }

    private static final String o0(File file, File file2) {
        List c22;
        FilePathComponents d02 = d0(k.f(file));
        FilePathComponents d03 = d0(k.f(file2));
        if (!l0.g(d02.e(), d03.e())) {
            return null;
        }
        int h5 = d03.h();
        int h6 = d02.h();
        int min = Math.min(h6, h5);
        int i5 = 0;
        while (i5 < min && l0.g(d02.g().get(i5), d03.g().get(i5))) {
            i5++;
        }
        StringBuilder sb = new StringBuilder();
        int i6 = h5 - 1;
        if (i5 <= i6) {
            while (true) {
                String name = d03.g().get(i6).getName();
                String s5 = ProtectedSandApp.s("縑");
                if (!l0.g(name, s5)) {
                    sb.append(s5);
                    if (i6 != i5) {
                        sb.append(File.separatorChar);
                    }
                    if (i6 == i5) {
                        break;
                    }
                    i6--;
                } else {
                    return null;
                }
            }
        }
        if (i5 < h6) {
            if (i5 < h5) {
                sb.append(File.separatorChar);
            }
            c22 = j0.c2(d02.g(), i5);
            String str = File.separator;
            l0.o(str, ProtectedSandApp.s("縒"));
            y.k3(c22, sb, str, null, null, 0, null, null, 124, null);
        }
        return sb.toString();
    }
}
