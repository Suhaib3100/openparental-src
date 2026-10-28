package com.google.common.io;

import androidx.compose.runtime.z4;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.common.base.l0;
import com.google.common.base.m0;
import com.google.common.base.q0;
import com.google.common.collect.f3;
import com.google.common.collect.q3;
import com.google.common.graph.c1;
import com.google.common.graph.d1;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: Files.java */
@p
@d9.c
/* loaded from: classes6.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    private static final int f57161a = 10000;

    /* renamed from: b, reason: collision with root package name */
    private static final c1<File> f57162b = new b();

    /* compiled from: Files.java */
    class a implements w<List<String>> {

        /* renamed from: a, reason: collision with root package name */
        final List<String> f57163a = new ArrayList();

        a() {
        }

        @Override // com.google.common.io.w
        public boolean b(String str) {
            this.f57163a.add(str);
            return true;
        }

        @Override // com.google.common.io.w
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public List<String> a() {
            return this.f57163a;
        }
    }

    /* compiled from: Files.java */
    class b implements c1<File> {
        b() {
        }

        @Override // com.google.common.graph.c1
        /* renamed from: N, reason: merged with bridge method [inline-methods] */
        public Iterable<File> b(File file) {
            File[] listFiles;
            return (!file.isDirectory() || (listFiles = file.listFiles()) == null) ? f3.H() : Collections.unmodifiableList(Arrays.asList(listFiles));
        }
    }

    /* compiled from: Files.java */
    private static final class d extends f {

        /* renamed from: a, reason: collision with root package name */
        private final File f57166a;

        /* synthetic */ d(File file, a aVar) {
            this(file);
        }

        @Override // com.google.common.io.f
        public byte[] o() throws IOException {
            try {
                FileInputStream fileInputStream = (FileInputStream) m.a().b(m());
                return g.v(fileInputStream, fileInputStream.getChannel().size());
            } finally {
            }
        }

        @Override // com.google.common.io.f
        public long p() throws IOException {
            if (this.f57166a.isFile()) {
                return this.f57166a.length();
            }
            throw new FileNotFoundException(this.f57166a.toString());
        }

        @Override // com.google.common.io.f
        public com.google.common.base.g0<Long> q() {
            return this.f57166a.isFile() ? com.google.common.base.g0.f(Long.valueOf(this.f57166a.length())) : com.google.common.base.g0.a();
        }

        @Override // com.google.common.io.f
        /* renamed from: t, reason: merged with bridge method [inline-methods] */
        public FileInputStream m() throws IOException {
            return new FileInputStream(this.f57166a);
        }

        public String toString() {
            String valueOf = String.valueOf(this.f57166a);
            return com.google.common.base.h.a(valueOf.length() + 20, ProtectedSandApp.s("\uf6be"), valueOf, ProtectedSandApp.s("\uf6bf"));
        }

        private d(File file) {
            file.getClass();
            this.f57166a = file;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Files.java */
    private static abstract class e implements m0<File> {
        public static final e IS_DIRECTORY = new a(ProtectedSandApp.s("\uf6c0"), 0);
        public static final e IS_FILE = new b(ProtectedSandApp.s("\uf6c1"), 1);
        private static final /* synthetic */ e[] $VALUES = $values();

        /* compiled from: Files.java */
        enum a extends e {
            a(String str, int i4) {
                super(str, i4, null);
            }

            @Override // java.lang.Enum
            public String toString() {
                return ProtectedSandApp.s("\uf6c2");
            }

            @Override // com.google.common.base.m0
            public boolean apply(File file) {
                return file.isDirectory();
            }
        }

        /* compiled from: Files.java */
        enum b extends e {
            b(String str, int i4) {
                super(str, i4, null);
            }

            @Override // java.lang.Enum
            public String toString() {
                return ProtectedSandApp.s("\uf6c3");
            }

            @Override // com.google.common.base.m0
            public boolean apply(File file) {
                return file.isFile();
            }
        }

        private static /* synthetic */ e[] $values() {
            return new e[]{IS_DIRECTORY, IS_FILE};
        }

        private e(String str, int i4) {
        }

        public static e valueOf(String str) {
            return (e) Enum.valueOf(e.class, str);
        }

        public static e[] values() {
            return (e[]) $VALUES.clone();
        }

        /* synthetic */ e(String str, int i4, a aVar) {
            this(str, i4);
        }
    }

    private s() {
    }

    @f9.a
    @Deprecated
    @c0
    @f9.l(imports = {"com.google.common.io.Files"}, replacement = "Files.asCharSource(file, charset).readLines(callback)")
    public static <T> T A(File file, Charset charset, w<T> wVar) throws IOException {
        return (T) e(file, charset).q(wVar);
    }

    public static List<String> B(File file, Charset charset) throws IOException {
        return (List) e(file, charset).q(new a());
    }

    public static String C(String str) {
        String s4 = ProtectedSandApp.s("\uf6c4");
        String s5 = ProtectedSandApp.s("\uf6c5");
        str.getClass();
        if (str.length() == 0) {
            return s5;
        }
        Iterable<String> n4 = q0.h('/').g().n(str);
        ArrayList arrayList = new ArrayList();
        for (String str2 : n4) {
            str2.getClass();
            if (!str2.equals(s5)) {
                if (!str2.equals(s4)) {
                    arrayList.add(str2);
                } else if (arrayList.size() <= 0 || ((String) z4.a(arrayList, 1)).equals(s4)) {
                    arrayList.add(s4);
                } else {
                    arrayList.remove(arrayList.size() - 1);
                }
            }
        }
        String k4 = com.google.common.base.c0.o('/').k(arrayList);
        char charAt = str.charAt(0);
        String s6 = ProtectedSandApp.s("\uf6c6");
        if (charAt == '/') {
            String valueOf = String.valueOf(k4);
            k4 = valueOf.length() != 0 ? s6.concat(valueOf) : new String(s6);
        }
        while (k4.startsWith(ProtectedSandApp.s("\uf6c7"))) {
            k4 = k4.substring(3);
        }
        return k4.equals(ProtectedSandApp.s("\uf6c8")) ? s6 : "".equals(k4) ? s5 : k4;
    }

    public static byte[] D(File file) throws IOException {
        return c(file).o();
    }

    @f9.l(imports = {"com.google.common.io.Files"}, replacement = "Files.asCharSource(file, charset).read()")
    @Deprecated
    public static String E(File file, Charset charset) throws IOException {
        return e(file, charset).n();
    }

    public static void F(File file) throws IOException {
        file.getClass();
        if (file.createNewFile() || file.setLastModified(System.currentTimeMillis())) {
            return;
        }
        String valueOf = String.valueOf(file);
        throw new IOException(com.google.common.base.i.a(valueOf.length() + 38, ProtectedSandApp.s("\uf6c9"), valueOf));
    }

    @f9.l(imports = {"com.google.common.io.Files"}, replacement = "Files.asCharSink(to, charset).write(from)")
    @Deprecated
    public static void G(CharSequence charSequence, File file, Charset charset) throws IOException {
        d(file, charset, new r[0]).c(charSequence);
    }

    public static void H(byte[] bArr, File file) throws IOException {
        b(file, new r[0]).d(bArr);
    }

    @f9.l(imports = {"com.google.common.io.FileWriteMode", "com.google.common.io.Files"}, replacement = "Files.asCharSink(to, charset, FileWriteMode.APPEND).write(from)")
    @Deprecated
    public static void a(CharSequence charSequence, File file, Charset charset) throws IOException {
        d(file, charset, r.APPEND).c(charSequence);
    }

    public static com.google.common.io.e b(File file, r... rVarArr) {
        return new c(file, rVarArr, null);
    }

    public static f c(File file) {
        return new d(file, null);
    }

    public static i d(File file, Charset charset, r... rVarArr) {
        return b(file, rVarArr).a(charset);
    }

    public static j e(File file, Charset charset) {
        return c(file).a(charset);
    }

    public static void f(File file, File file2) throws IOException {
        l0.y(!file.equals(file2), ProtectedSandApp.s("\uf6ca"), file, file2);
        c(file).f(b(file2, new r[0]));
    }

    public static void g(File file, OutputStream outputStream) throws IOException {
        c(file).g(outputStream);
    }

    @f9.l(imports = {"com.google.common.io.Files"}, replacement = "Files.asCharSource(from, charset).copyTo(to)")
    @Deprecated
    public static void h(File file, Charset charset, Appendable appendable) throws IOException {
        e(file, charset).f(appendable);
    }

    public static void i(File file) throws IOException {
        file.getClass();
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile == null) {
            return;
        }
        parentFile.mkdirs();
        if (parentFile.isDirectory()) {
            return;
        }
        String valueOf = String.valueOf(file);
        throw new IOException(com.google.common.base.i.a(valueOf.length() + 39, ProtectedSandApp.s("\uf6cb"), valueOf));
    }

    @d9.a
    @Deprecated
    public static File j() {
        File file = new File(System.getProperty(ProtectedSandApp.s("\uf6cc")));
        long currentTimeMillis = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder(21);
        sb.append(currentTimeMillis);
        sb.append(ProtectedSandApp.s("\uf6cd"));
        String sb2 = sb.toString();
        for (int i4 = 0; i4 < 10000; i4++) {
            File file2 = new File(file, com.google.android.gms.internal.location.a.a(com.google.android.gms.common.internal.b.a(sb2, 11), sb2, i4));
            if (file2.mkdir()) {
                return file2;
            }
        }
        StringBuilder a5 = com.google.common.base.g.a(com.google.android.gms.common.internal.b.a(sb2, com.google.android.gms.common.internal.b.a(sb2, 66)), ProtectedSandApp.s("\uf6ce"), sb2, ProtectedSandApp.s("\uf6cf"), sb2);
        a5.append(ProtectedSandApp.s("\uf6d0"));
        throw new IllegalStateException(a5.toString());
    }

    public static boolean k(File file, File file2) throws IOException {
        file.getClass();
        file2.getClass();
        if (file == file2 || file.equals(file2)) {
            return true;
        }
        long length = file.length();
        long length2 = file2.length();
        if (length == 0 || length2 == 0 || length == length2) {
            return c(file).e(c(file2));
        }
        return false;
    }

    @d9.a
    public static d1<File> l() {
        return d1.h(f57162b);
    }

    public static String m(String str) {
        str.getClass();
        String name = new File(str).getName();
        int lastIndexOf = name.lastIndexOf(46);
        return lastIndexOf == -1 ? "" : name.substring(lastIndexOf + 1);
    }

    public static String n(String str) {
        str.getClass();
        String name = new File(str).getName();
        int lastIndexOf = name.lastIndexOf(46);
        return lastIndexOf == -1 ? name : name.substring(0, lastIndexOf);
    }

    @f9.l(imports = {"com.google.common.io.Files"}, replacement = "Files.asByteSource(file).hash(hashFunction)")
    @Deprecated
    public static com.google.common.hash.p o(File file, com.google.common.hash.q qVar) throws IOException {
        return c(file).j(qVar);
    }

    public static m0<File> p() {
        return e.IS_DIRECTORY;
    }

    public static m0<File> q() {
        return e.IS_FILE;
    }

    public static MappedByteBuffer r(File file) throws IOException {
        file.getClass();
        return u(file, FileChannel.MapMode.READ_ONLY, -1L);
    }

    public static MappedByteBuffer s(File file, FileChannel.MapMode mapMode) throws IOException {
        return u(file, mapMode, -1L);
    }

    public static MappedByteBuffer t(File file, FileChannel.MapMode mapMode, long j4) throws IOException {
        l0.p(j4 >= 0, ProtectedSandApp.s("\uf6d1"), j4);
        return u(file, mapMode, j4);
    }

    private static MappedByteBuffer u(File file, FileChannel.MapMode mapMode, long j4) throws IOException {
        file.getClass();
        mapMode.getClass();
        m a5 = m.a();
        try {
            FileChannel fileChannel = (FileChannel) a5.b(((RandomAccessFile) a5.b(new RandomAccessFile(file, mapMode == FileChannel.MapMode.READ_ONLY ? ProtectedSandApp.s("\uf6d2") : ProtectedSandApp.s("\uf6d3")))).getChannel());
            if (j4 == -1) {
                j4 = fileChannel.size();
            }
            return fileChannel.map(mapMode, 0L, j4);
        } finally {
        }
    }

    public static void v(File file, File file2) throws IOException {
        file.getClass();
        file2.getClass();
        l0.y(!file.equals(file2), ProtectedSandApp.s("\uf6ca"), file, file2);
        if (file.renameTo(file2)) {
            return;
        }
        f(file, file2);
        if (file.delete()) {
            return;
        }
        boolean delete = file2.delete();
        String s4 = ProtectedSandApp.s("\uf6d4");
        if (delete) {
            String valueOf = String.valueOf(file);
            throw new IOException(com.google.common.base.i.a(valueOf.length() + 17, s4, valueOf));
        }
        String valueOf2 = String.valueOf(file2);
        throw new IOException(com.google.common.base.i.a(valueOf2.length() + 17, s4, valueOf2));
    }

    public static BufferedReader w(File file, Charset charset) throws FileNotFoundException {
        file.getClass();
        charset.getClass();
        return new BufferedReader(new InputStreamReader(new FileInputStream(file), charset));
    }

    public static BufferedWriter x(File file, Charset charset) throws FileNotFoundException {
        file.getClass();
        charset.getClass();
        return new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), charset));
    }

    @f9.a
    @Deprecated
    @c0
    @f9.l(imports = {"com.google.common.io.Files"}, replacement = "Files.asByteSource(file).read(processor)")
    public static <T> T y(File file, com.google.common.io.d<T> dVar) throws IOException {
        return (T) c(file).n(dVar);
    }

    @zc.a
    @f9.l(imports = {"com.google.common.io.Files"}, replacement = "Files.asCharSource(file, charset).readFirstLine()")
    @Deprecated
    public static String z(File file, Charset charset) throws IOException {
        return e(file, charset).o();
    }

    /* compiled from: Files.java */
    private static final class c extends com.google.common.io.e {

        /* renamed from: a, reason: collision with root package name */
        private final File f57164a;

        /* renamed from: b, reason: collision with root package name */
        private final q3<r> f57165b;

        private c(File file, r... rVarArr) {
            file.getClass();
            this.f57164a = file;
            this.f57165b = q3.F(rVarArr);
        }

        @Override // com.google.common.io.e
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public FileOutputStream c() throws IOException {
            return new FileOutputStream(this.f57164a, this.f57165b.contains(r.APPEND));
        }

        public String toString() {
            String valueOf = String.valueOf(this.f57164a);
            String valueOf2 = String.valueOf(this.f57165b);
            StringBuilder a5 = com.google.common.base.g.a(valueOf2.length() + valueOf.length() + 20, ProtectedSandApp.s("\uf6bb"), valueOf, ProtectedSandApp.s("\uf6bc"), valueOf2);
            a5.append(ProtectedSandApp.s("\uf6bd"));
            return a5.toString();
        }

        /* synthetic */ c(File file, r[] rVarArr, a aVar) {
            this(file, rVarArr);
        }
    }
}
