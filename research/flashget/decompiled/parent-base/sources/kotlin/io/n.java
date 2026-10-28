package kotlin.io;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.g0;
import kotlin.collections.w;
import kotlin.io.h;
import kotlin.io.h.b;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.k2;
import kotlin.text.v;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Utils.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0010\u001a1\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a1\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0004\b\u0007\u0010\u0006\u001a\u0019\u0010\t\u001a\u00020\u0000*\u00020\u00032\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\n\u001a\u0019\u0010\u000b\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\f\u001a\u0019\u0010\r\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\r\u0010\f\u001a\u001b\u0010\u000e\u001a\u0004\u0018\u00010\u0003*\u00020\u00032\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\u000e\u0010\f\u001a\u001d\u0010\u000f\u001a\u0004\u0018\u00010\u0000*\u00020\u00032\u0006\u0010\b\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u000f\u0010\n\u001a-\u0010\u0015\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016\u001a?\u0010\u001b\u001a\u00020\u0011*\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00112\u001a\b\u0002\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u0017¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0011\u0010\u001d\u001a\u00020\u0011*\u00020\u0003¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u0019\u0010 \u001a\u00020\u0011*\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u0003¢\u0006\u0004\b \u0010!\u001a\u0019\u0010\"\u001a\u00020\u0011*\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u0000¢\u0006\u0004\b\"\u0010#\u001a\u0019\u0010$\u001a\u00020\u0011*\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u0003¢\u0006\u0004\b$\u0010!\u001a\u0019\u0010%\u001a\u00020\u0011*\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u0000¢\u0006\u0004\b%\u0010#\u001a\u0011\u0010&\u001a\u00020\u0003*\u00020\u0003¢\u0006\u0004\b&\u0010'\u001a\u0013\u0010)\u001a\u00020(*\u00020(H\u0002¢\u0006\u0004\b)\u0010*\u001a\u001f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00030+*\b\u0012\u0004\u0012\u00020\u00030+H\u0002¢\u0006\u0004\b,\u0010-\u001a\u0019\u0010/\u001a\u00020\u0003*\u00020\u00032\u0006\u0010.\u001a\u00020\u0003¢\u0006\u0004\b/\u0010\f\u001a\u0019\u00100\u001a\u00020\u0003*\u00020\u00032\u0006\u0010.\u001a\u00020\u0000¢\u0006\u0004\b0\u00101\u001a\u0019\u00102\u001a\u00020\u0003*\u00020\u00032\u0006\u0010.\u001a\u00020\u0003¢\u0006\u0004\b2\u0010\f\u001a\u0019\u00103\u001a\u00020\u0003*\u00020\u00032\u0006\u0010.\u001a\u00020\u0000¢\u0006\u0004\b3\u00101\"\u0015\u00106\u001a\u00020\u0000*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b4\u00105\"\u0015\u00108\u001a\u00020\u0000*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b7\u00105\"\u0015\u0010:\u001a\u00020\u0000*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b9\u00105¨\u0006;"}, d2 = {"", "prefix", "suffix", "Ljava/io/File;", "directory", "R", "(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Ljava/io/File;", "T", "base", "n0", "(Ljava/io/File;Ljava/io/File;)Ljava/lang/String;", "e0", "(Ljava/io/File;Ljava/io/File;)Ljava/io/File;", "g0", "f0", "o0", "target", "", "overwrite", "", "bufferSize", "P", "(Ljava/io/File;Ljava/io/File;ZI)Ljava/io/File;", "Lkotlin/Function2;", "Ljava/io/IOException;", "Lkotlin/io/q;", "onError", "N", "(Ljava/io/File;Ljava/io/File;ZLld/p;)Z", "V", "(Ljava/io/File;)Z", "other", "l0", "(Ljava/io/File;Ljava/io/File;)Z", "m0", "(Ljava/io/File;Ljava/lang/String;)Z", "W", "X", "b0", "(Ljava/io/File;)Ljava/io/File;", "Lkotlin/io/g;", "d0", "(Lkotlin/io/g;)Lkotlin/io/g;", "", "c0", "(Ljava/util/List;)Ljava/util/List;", "relative", "h0", "i0", "(Ljava/io/File;Ljava/lang/String;)Ljava/io/File;", "j0", "k0", "Y", "(Ljava/io/File;)Ljava/lang/String;", "extension", "Z", "invariantSeparatorsPath", "a0", "nameWithoutExtension", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/io/FilesKt")
@r1({"SMAP\nUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Utils.kt\nkotlin/io/FilesKt__UtilsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,473:1\n1#2:474\n1284#3,3:475\n*S KotlinDebug\n*F\n+ 1 Utils.kt\nkotlin/io/FilesKt__UtilsKt\n*L\n347#1:475,3\n*E\n"})
/* loaded from: classes7.dex */
public class n extends m {

    /* compiled from: Utils.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ljava/io/File;", "<anonymous parameter 0>", "Ljava/io/IOException;", "exception", "", "a", "(Ljava/io/File;Ljava/io/IOException;)Ljava/lang/Void;"}, k = 3, mv = {1, 9, 0})
    static final class a extends n0 implements ld.p {

        /* renamed from: b, reason: collision with root package name */
        public static final a f75178b = new a(2);

        a() {
            super(2);
        }

        @Override // ld.p
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(@fg.l File file, @fg.l IOException iOException) {
            l0.p(file, ProtectedSandApp.s("搤\u0001"));
            l0.p(iOException, ProtectedSandApp.s("搥\u0001"));
            throw iOException;
        }
    }

    /* compiled from: Utils.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ljava/io/File;", "f", "Ljava/io/IOException;", "e", "Lkotlin/k2;", "a", "(Ljava/io/File;Ljava/io/IOException;)V"}, k = 3, mv = {1, 9, 0})
    static final class b extends n0 implements ld.p<File, IOException, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.p<File, IOException, q> f75179b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(ld.p<? super File, ? super IOException, ? extends q> pVar) {
            super(2);
            this.f75179b = pVar;
        }

        public final void a(@fg.l File file, @fg.l IOException iOException) {
            l0.p(file, ProtectedSandApp.s("搦\u0001"));
            l0.p(iOException, ProtectedSandApp.s("搧\u0001"));
            if (this.f75179b.invoke(file, iOException) == q.TERMINATE) {
                throw new s(file);
            }
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(File file, IOException iOException) {
            a(file, iOException);
            return k2.f75408a;
        }
    }

    public static final boolean N(@fg.l File file, @fg.l File file2, boolean z4, @fg.l ld.p<? super File, ? super IOException, ? extends q> pVar) {
        l0.p(file, ProtectedSandApp.s("搌\u0001"));
        l0.p(file2, ProtectedSandApp.s("損\u0001"));
        l0.p(pVar, ProtectedSandApp.s("搎\u0001"));
        if (!file.exists()) {
            return pVar.invoke(file, new NoSuchFileException(file, null, ProtectedSandApp.s("搏\u0001"), 2, null)) != q.TERMINATE;
        }
        try {
            h k4 = m.M(file).k(new b(pVar));
            k4.getClass();
            h.b bVar = k4.new b();
            while (bVar.hasNext()) {
                File next = bVar.next();
                if (next.exists()) {
                    File file3 = new File(file2, n0(next, file));
                    if (file3.exists() && (!next.isDirectory() || !file3.isDirectory())) {
                        if (z4) {
                            if (file3.isDirectory()) {
                                if (!V(file3)) {
                                }
                            } else if (!file3.delete()) {
                            }
                        }
                        if (pVar.invoke(file3, new FileAlreadyExistsException(next, file3, ProtectedSandApp.s("搐\u0001"))) == q.TERMINATE) {
                            return false;
                        }
                    }
                    if (next.isDirectory()) {
                        file3.mkdirs();
                    } else if (Q(next, file3, z4, 0, 4, null).length() != next.length() && pVar.invoke(next, new IOException(ProtectedSandApp.s("搑\u0001"))) == q.TERMINATE) {
                        return false;
                    }
                } else if (pVar.invoke(next, new NoSuchFileException(next, null, ProtectedSandApp.s("搏\u0001"), 2, null)) == q.TERMINATE) {
                    return false;
                }
            }
            return true;
        } catch (s unused) {
            return false;
        }
    }

    public static /* synthetic */ boolean O(File file, File file2, boolean z4, ld.p pVar, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            z4 = false;
        }
        if ((i4 & 4) != 0) {
            pVar = a.f75178b;
        }
        return N(file, file2, z4, pVar);
    }

    @fg.l
    public static final File P(@fg.l File file, @fg.l File file2, boolean z4, int i4) {
        l0.p(file, ProtectedSandApp.s("搌\u0001"));
        l0.p(file2, ProtectedSandApp.s("損\u0001"));
        if (!file.exists()) {
            throw new NoSuchFileException(file, null, ProtectedSandApp.s("搏\u0001"), 2, null);
        }
        if (file2.exists()) {
            if (!z4) {
                throw new FileAlreadyExistsException(file, file2, ProtectedSandApp.s("搐\u0001"));
            }
            if (!file2.delete()) {
                throw new FileAlreadyExistsException(file, file2, ProtectedSandApp.s("搒\u0001"));
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
                    kotlin.io.a.k(fileInputStream, fileOutputStream, i4);
                    kotlin.io.b.a(fileOutputStream, null);
                    kotlin.io.b.a(fileInputStream, null);
                } finally {
                }
            } finally {
            }
        } else if (!file2.mkdirs()) {
            throw new FileSystemException(file, file2, ProtectedSandApp.s("搓\u0001"));
        }
        return file2;
    }

    public static /* synthetic */ File Q(File file, File file2, boolean z4, int i4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            z4 = false;
        }
        if ((i5 & 4) != 0) {
            i4 = 8192;
        }
        return P(file, file2, z4, i4);
    }

    @fg.l
    @kotlin.k(message = "Avoid creating temporary directories in the default temp location with this function due to too wide permissions on the newly created directory. Use kotlin.io.path.createTempDirectory instead.")
    public static final File R(@fg.l String str, @fg.m String str2, @fg.m File file) {
        l0.p(str, ProtectedSandApp.s("搔\u0001"));
        File createTempFile = File.createTempFile(str, str2, file);
        createTempFile.delete();
        if (createTempFile.mkdir()) {
            l0.m(createTempFile);
            return createTempFile;
        }
        throw new IOException(ProtectedSandApp.s("搕\u0001") + createTempFile + '.');
    }

    public static /* synthetic */ File S(String str, String str2, File file, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = ProtectedSandApp.s("搖\u0001");
        }
        if ((i4 & 2) != 0) {
            str2 = null;
        }
        if ((i4 & 4) != 0) {
            file = null;
        }
        return R(str, str2, file);
    }

    @fg.l
    @kotlin.k(message = "Avoid creating temporary files in the default temp location with this function due to too wide permissions on the newly created file. Use kotlin.io.path.createTempFile instead or resort to java.io.File.createTempFile.")
    public static final File T(@fg.l String str, @fg.m String str2, @fg.m File file) {
        l0.p(str, ProtectedSandApp.s("搔\u0001"));
        File createTempFile = File.createTempFile(str, str2, file);
        l0.o(createTempFile, ProtectedSandApp.s("搗\u0001"));
        return createTempFile;
    }

    public static /* synthetic */ File U(String str, String str2, File file, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = ProtectedSandApp.s("搖\u0001");
        }
        if ((i4 & 2) != 0) {
            str2 = null;
        }
        if ((i4 & 4) != 0) {
            file = null;
        }
        return T(str, str2, file);
    }

    public static boolean V(@fg.l File file) {
        l0.p(file, ProtectedSandApp.s("搌\u0001"));
        while (true) {
            boolean z4 = true;
            for (File file2 : m.L(file)) {
                if (file2.delete() || !file2.exists()) {
                    if (z4) {
                        break;
                    }
                }
                z4 = false;
            }
            return z4;
        }
    }

    public static final boolean W(@fg.l File file, @fg.l File file2) {
        l0.p(file, ProtectedSandApp.s("搌\u0001"));
        l0.p(file2, ProtectedSandApp.s("搘\u0001"));
        g f4 = k.f(file);
        g f5 = k.f(file2);
        if (f5.i()) {
            return l0.g(file, file2);
        }
        int h4 = f4.h() - f5.h();
        if (h4 < 0) {
            return false;
        }
        return f4.g().subList(h4, f4.h()).equals(f5.g());
    }

    public static final boolean X(@fg.l File file, @fg.l String str) {
        l0.p(file, ProtectedSandApp.s("搌\u0001"));
        l0.p(str, ProtectedSandApp.s("搘\u0001"));
        return W(file, new File(str));
    }

    @fg.l
    public static String Y(@fg.l File file) {
        l0.p(file, ProtectedSandApp.s("搌\u0001"));
        String name = file.getName();
        l0.o(name, ProtectedSandApp.s("搙\u0001"));
        return v.o5(name, '.', "");
    }

    @fg.l
    public static final String Z(@fg.l File file) {
        l0.p(file, ProtectedSandApp.s("搌\u0001"));
        char c5 = File.separatorChar;
        String s4 = ProtectedSandApp.s("搚\u0001");
        String path = file.getPath();
        l0.o(path, s4);
        return c5 != '/' ? v.h2(path, c5, '/', false, 4, null) : path;
    }

    @fg.l
    public static String a0(@fg.l File file) {
        l0.p(file, ProtectedSandApp.s("搌\u0001"));
        String name = file.getName();
        l0.o(name, ProtectedSandApp.s("搙\u0001"));
        return v.z5(name, ProtectedSandApp.s("搛\u0001"), null, 2, null);
    }

    @fg.l
    public static final File b0(@fg.l File file) {
        l0.p(file, ProtectedSandApp.s("搌\u0001"));
        g f4 = k.f(file);
        File e4 = f4.e();
        List<File> c02 = c0(f4.g());
        String str = File.separator;
        l0.o(str, ProtectedSandApp.s("搜\u0001"));
        return i0(e4, w.m3(c02, str, null, null, 0, null, null, 62, null));
    }

    private static final List<File> c0(List<? extends File> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (File file : list) {
            String name = file.getName();
            if (!l0.g(name, ProtectedSandApp.s("搛\u0001"))) {
                String s4 = ProtectedSandApp.s("搝\u0001");
                if (!l0.g(name, s4)) {
                    arrayList.add(file);
                } else if (arrayList.isEmpty() || l0.g(((File) w.p3(arrayList)).getName(), s4)) {
                    arrayList.add(file);
                } else {
                    arrayList.remove(arrayList.size() - 1);
                }
            }
        }
        return arrayList;
    }

    private static final g d0(g gVar) {
        return new g(gVar.e(), c0(gVar.g()));
    }

    @fg.l
    public static final File e0(@fg.l File file, @fg.l File file2) {
        l0.p(file, ProtectedSandApp.s("搌\u0001"));
        l0.p(file2, ProtectedSandApp.s("搞\u0001"));
        return new File(n0(file, file2));
    }

    @fg.m
    public static final File f0(@fg.l File file, @fg.l File file2) {
        l0.p(file, ProtectedSandApp.s("搌\u0001"));
        l0.p(file2, ProtectedSandApp.s("搞\u0001"));
        String o02 = o0(file, file2);
        if (o02 != null) {
            return new File(o02);
        }
        return null;
    }

    @fg.l
    public static final File g0(@fg.l File file, @fg.l File file2) {
        l0.p(file, ProtectedSandApp.s("搌\u0001"));
        l0.p(file2, ProtectedSandApp.s("搞\u0001"));
        String o02 = o0(file, file2);
        return o02 != null ? new File(o02) : file;
    }

    @fg.l
    public static final File h0(@fg.l File file, @fg.l File file2) {
        l0.p(file, ProtectedSandApp.s("搌\u0001"));
        l0.p(file2, ProtectedSandApp.s("搟\u0001"));
        if (k.d(file2)) {
            return file2;
        }
        String file3 = file.toString();
        l0.o(file3, ProtectedSandApp.s("搠\u0001"));
        if (file3.length() != 0) {
            char c5 = File.separatorChar;
            if (!v.Y2(file3, c5, false, 2, null)) {
                return new File(file3 + c5 + file2);
            }
        }
        return new File(file3 + file2);
    }

    @fg.l
    public static final File i0(@fg.l File file, @fg.l String str) {
        l0.p(file, ProtectedSandApp.s("搌\u0001"));
        l0.p(str, ProtectedSandApp.s("搟\u0001"));
        return h0(file, new File(str));
    }

    @fg.l
    public static final File j0(@fg.l File file, @fg.l File file2) {
        l0.p(file, ProtectedSandApp.s("搌\u0001"));
        l0.p(file2, ProtectedSandApp.s("搟\u0001"));
        g f4 = k.f(file);
        return h0(h0(f4.e(), f4.h() == 0 ? new File(ProtectedSandApp.s("搝\u0001")) : f4.j(0, f4.h() - 1)), file2);
    }

    @fg.l
    public static final File k0(@fg.l File file, @fg.l String str) {
        l0.p(file, ProtectedSandApp.s("搌\u0001"));
        l0.p(str, ProtectedSandApp.s("搟\u0001"));
        return j0(file, new File(str));
    }

    public static final boolean l0(@fg.l File file, @fg.l File file2) {
        l0.p(file, ProtectedSandApp.s("搌\u0001"));
        l0.p(file2, ProtectedSandApp.s("搘\u0001"));
        g f4 = k.f(file);
        g f5 = k.f(file2);
        if (l0.g(f4.e(), f5.e()) && f4.h() >= f5.h()) {
            return f4.g().subList(0, f5.h()).equals(f5.g());
        }
        return false;
    }

    public static final boolean m0(@fg.l File file, @fg.l String str) {
        l0.p(file, ProtectedSandApp.s("搌\u0001"));
        l0.p(str, ProtectedSandApp.s("搘\u0001"));
        return l0(file, new File(str));
    }

    @fg.l
    public static final String n0(@fg.l File file, @fg.l File file2) {
        l0.p(file, ProtectedSandApp.s("搌\u0001"));
        l0.p(file2, ProtectedSandApp.s("搞\u0001"));
        String o02 = o0(file, file2);
        if (o02 != null) {
            return o02;
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("搡\u0001") + file + ProtectedSandApp.s("搢\u0001") + file2 + '.');
    }

    private static final String o0(File file, File file2) {
        g d02 = d0(k.f(file));
        g d03 = d0(k.f(file2));
        if (!l0.g(d02.e(), d03.e())) {
            return null;
        }
        int h4 = d03.h();
        int h5 = d02.h();
        int min = Math.min(h5, h4);
        int i4 = 0;
        while (i4 < min && l0.g(d02.g().get(i4), d03.g().get(i4))) {
            i4++;
        }
        StringBuilder sb = new StringBuilder();
        int i5 = h4 - 1;
        if (i4 <= i5) {
            while (true) {
                String name = d03.g().get(i5).getName();
                String s4 = ProtectedSandApp.s("搝\u0001");
                if (!l0.g(name, s4)) {
                    sb.append(s4);
                    if (i5 != i4) {
                        sb.append(File.separatorChar);
                    }
                    if (i5 == i4) {
                        break;
                    }
                    i5--;
                } else {
                    return null;
                }
            }
        }
        if (i4 < h5) {
            if (i4 < h4) {
                sb.append(File.separatorChar);
            }
            List c22 = w.c2(d02.g(), i4);
            String str = File.separator;
            l0.o(str, ProtectedSandApp.s("搜\u0001"));
            g0.j3(c22, sb, (r14 & 2) != 0 ? ProtectedSandApp.s("慰\u0001") : str, (r14 & 4) != 0 ? "" : null, (r14 & 8) == 0 ? null : "", (r14 & 16) != 0 ? -1 : 0, (r14 & 32) != 0 ? ProtectedSandApp.s("慱\u0001") : null, (r14 & 64) != 0 ? null : null);
        }
        return sb.toString();
    }
}
