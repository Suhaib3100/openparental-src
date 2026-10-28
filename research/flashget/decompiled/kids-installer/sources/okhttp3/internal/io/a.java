package okhttp3.internal.io;

import com.flashget.kidsdownloader.ProtectedSandApp;
import d5.d;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import okio.a0;
import okio.b0;
import okio.m0;
import okio.o0;
import p3.f;

/* compiled from: FileSystem.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\bf\u0018\u0000 \u00072\u00020\u0001:\u0001\u0005J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0018\u0010\u0011\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0002H&J\u0010\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0002H&¨\u0006\u0014"}, d2 = {"Lokhttp3/internal/io/a;", "", "Ljava/io/File;", "file", "Lokio/o0;", "a", "Lokio/m0;", "b", "g", "Lkotlin/m2;", "f", "", "d", "", "h", "from", "to", "e", "directory", "c", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes5.dex */
public interface a {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    @d
    @f
    public static final a f31260a = new Companion.C0482a();

    /* compiled from: FileSystem.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0001\u0082\u0002\u0007\n\u0005\b\u0091F0\u0001¨\u0006\b"}, d2 = {"Lokhttp3/internal/io/a$a;", "", "Lokhttp3/internal/io/a;", "SYSTEM", "Lokhttp3/internal/io/a;", "<init>", "()V", "a", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: okhttp3.internal.io.a$a, reason: collision with other inner class name and from kotlin metadata */
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f31262a = null;

        /* compiled from: FileSystem.kt */
        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\u0011\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0002H\u0016J\u0010\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0002H\u0016J\b\u0010\u0015\u001a\u00020\u0014H\u0016¨\u0006\u0018"}, d2 = {"Lokhttp3/internal/io/a$a$a;", "Lokhttp3/internal/io/a;", "Ljava/io/File;", "file", "Lokio/o0;", "a", "Lokio/m0;", "b", "g", "Lkotlin/m2;", "f", "", "d", "", "h", "from", "to", "e", "directory", "c", "", "toString", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
        /* renamed from: okhttp3.internal.io.a$a$a, reason: collision with other inner class name */
        private static final class C0482a implements a {
            @Override // okhttp3.internal.io.a
            @d
            public o0 a(@d File file) throws FileNotFoundException {
                l0.p(file, ProtectedSandApp.s("擫"));
                return a0.l(file);
            }

            @Override // okhttp3.internal.io.a
            @d
            public m0 b(@d File file) throws FileNotFoundException {
                m0 j5;
                m0 j6;
                l0.p(file, ProtectedSandApp.s("擬"));
                try {
                    j6 = b0.j(file, false, 1, null);
                    return j6;
                } catch (FileNotFoundException unused) {
                    file.getParentFile().mkdirs();
                    j5 = b0.j(file, false, 1, null);
                    return j5;
                }
            }

            @Override // okhttp3.internal.io.a
            public void c(@d File file) throws IOException {
                l0.p(file, ProtectedSandApp.s("擭"));
                File[] listFiles = file.listFiles();
                if (listFiles == null) {
                    throw new IOException(ProtectedSandApp.s("擰") + file);
                }
                for (File file2 : listFiles) {
                    l0.o(file2, ProtectedSandApp.s("擮"));
                    if (file2.isDirectory()) {
                        c(file2);
                    }
                    if (!file2.delete()) {
                        throw new IOException(ProtectedSandApp.s("擯") + file2);
                    }
                }
            }

            @Override // okhttp3.internal.io.a
            public boolean d(@d File file) {
                l0.p(file, ProtectedSandApp.s("擱"));
                return file.exists();
            }

            @Override // okhttp3.internal.io.a
            public void e(@d File file, @d File file2) throws IOException {
                l0.p(file, ProtectedSandApp.s("擲"));
                l0.p(file2, ProtectedSandApp.s("擳"));
                f(file2);
                if (file.renameTo(file2)) {
                    return;
                }
                throw new IOException(ProtectedSandApp.s("擴") + file + ProtectedSandApp.s("擵") + file2);
            }

            @Override // okhttp3.internal.io.a
            public void f(@d File file) throws IOException {
                l0.p(file, ProtectedSandApp.s("擶"));
                if (file.delete() || !file.exists()) {
                    return;
                }
                throw new IOException(ProtectedSandApp.s("擷") + file);
            }

            @Override // okhttp3.internal.io.a
            @d
            public m0 g(@d File file) throws FileNotFoundException {
                l0.p(file, ProtectedSandApp.s("擸"));
                try {
                    return a0.a(file);
                } catch (FileNotFoundException unused) {
                    file.getParentFile().mkdirs();
                    return a0.a(file);
                }
            }

            @Override // okhttp3.internal.io.a
            public long h(@d File file) {
                l0.p(file, ProtectedSandApp.s("擹"));
                return file.length();
            }

            @d
            public String toString() {
                return ProtectedSandApp.s("擺");
            }
        }

        private Companion() {
        }

        public Companion(w wVar) {
        }
    }

    @d
    o0 a(@d File file) throws FileNotFoundException;

    @d
    m0 b(@d File file) throws FileNotFoundException;

    void c(@d File file) throws IOException;

    boolean d(@d File file);

    void e(@d File file, @d File file2) throws IOException;

    void f(@d File file) throws IOException;

    @d
    m0 g(@d File file) throws FileNotFoundException;

    long h(@d File file);
}
