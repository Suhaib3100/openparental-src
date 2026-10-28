package okhttp3.internal.io;

import androidx.core.content.g;
import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import kd.f;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import okio.a0;
import okio.b0;
import okio.m0;
import okio.o0;

/* compiled from: FileSystem.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\bf\u0018\u0000 \u000f2\u00020\u0001:\u0001\u0019J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\n\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0002H&¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u0002H&¢\u0006\u0004\b\u0019\u0010\r¨\u0006\u001a"}, d2 = {"Lokhttp3/internal/io/a;", "", "Ljava/io/File;", "file", "Lokio/o0;", "e", "(Ljava/io/File;)Lokio/o0;", "Lokio/m0;", "f", "(Ljava/io/File;)Lokio/m0;", "c", "Lkotlin/k2;", "h", "(Ljava/io/File;)V", "", "b", "(Ljava/io/File;)Z", "", "d", "(Ljava/io/File;)J", "from", "to", "g", "(Ljava/io/File;Ljava/io/File;)V", "directory", "a", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public interface a {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* renamed from: a, reason: collision with root package name */
    @l
    @f
    public static final a f84800a = new Companion.C1321a();

    /* compiled from: FileSystem.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0001\u0082\u0002\u0007\n\u0005\b\u0091F0\u0001¨\u0006\b"}, d2 = {"Lokhttp3/internal/io/a$a;", "", "<init>", "()V", "Lokhttp3/internal/io/a;", "SYSTEM", "Lokhttp3/internal/io/a;", "a", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: okhttp3.internal.io.a$a, reason: collision with other inner class name and from kotlin metadata */
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f84802a = null;

        /* compiled from: FileSystem.kt */
        @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001b\u0010\u000fJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lokhttp3/internal/io/a$a$a;", "Lokhttp3/internal/io/a;", "<init>", "()V", "Ljava/io/File;", "file", "Lokio/o0;", "e", "(Ljava/io/File;)Lokio/o0;", "Lokio/m0;", "f", "(Ljava/io/File;)Lokio/m0;", "c", "Lkotlin/k2;", "h", "(Ljava/io/File;)V", "", "b", "(Ljava/io/File;)Z", "", "d", "(Ljava/io/File;)J", "from", "to", "g", "(Ljava/io/File;Ljava/io/File;)V", "directory", "a", "", "toString", "()Ljava/lang/String;", "okhttp"}, k = 1, mv = {1, 4, 0})
        /* renamed from: okhttp3.internal.io.a$a$a, reason: collision with other inner class name */
        private static final class C1321a implements a {
            @Override // okhttp3.internal.io.a
            public void a(@l File directory) throws IOException {
                l0.p(directory, ProtectedSandApp.s("ᶉ"));
                File[] listFiles = directory.listFiles();
                if (listFiles == null) {
                    throw new IOException(g.a(ProtectedSandApp.s("ᶌ"), directory));
                }
                for (File file : listFiles) {
                    l0.o(file, ProtectedSandApp.s("ᶊ"));
                    if (file.isDirectory()) {
                        a(file);
                    }
                    if (!file.delete()) {
                        throw new IOException(g.a(ProtectedSandApp.s("ᶋ"), file));
                    }
                }
            }

            @Override // okhttp3.internal.io.a
            public boolean b(@l File file) {
                l0.p(file, ProtectedSandApp.s("ᶊ"));
                return file.exists();
            }

            @Override // okhttp3.internal.io.a
            @l
            public m0 c(@l File file) throws FileNotFoundException {
                l0.p(file, ProtectedSandApp.s("ᶊ"));
                try {
                    return a0.a(file);
                } catch (FileNotFoundException unused) {
                    file.getParentFile().mkdirs();
                    return a0.a(file);
                }
            }

            @Override // okhttp3.internal.io.a
            public long d(@l File file) {
                l0.p(file, ProtectedSandApp.s("ᶊ"));
                return file.length();
            }

            @Override // okhttp3.internal.io.a
            @l
            public o0 e(@l File file) throws FileNotFoundException {
                l0.p(file, ProtectedSandApp.s("ᶊ"));
                return a0.l(file);
            }

            @Override // okhttp3.internal.io.a
            @l
            public m0 f(@l File file) throws FileNotFoundException {
                m0 j4;
                m0 j5;
                l0.p(file, ProtectedSandApp.s("ᶊ"));
                try {
                    j5 = b0.j(file, false, 1, null);
                    return j5;
                } catch (FileNotFoundException unused) {
                    file.getParentFile().mkdirs();
                    j4 = b0.j(file, false, 1, null);
                    return j4;
                }
            }

            @Override // okhttp3.internal.io.a
            public void g(@l File from, @l File to) throws IOException {
                l0.p(from, ProtectedSandApp.s("ᶍ"));
                l0.p(to, ProtectedSandApp.s("ᶎ"));
                h(to);
                if (from.renameTo(to)) {
                    return;
                }
                throw new IOException(ProtectedSandApp.s("ᶏ") + from + ProtectedSandApp.s("ᶐ") + to);
            }

            @Override // okhttp3.internal.io.a
            public void h(@l File file) throws IOException {
                l0.p(file, ProtectedSandApp.s("ᶊ"));
                if (!file.delete() && file.exists()) {
                    throw new IOException(g.a(ProtectedSandApp.s("ᶋ"), file));
                }
            }

            @l
            public String toString() {
                return ProtectedSandApp.s("ᶑ");
            }
        }

        private Companion() {
        }

        public Companion(w wVar) {
        }
    }

    void a(@l File directory) throws IOException;

    boolean b(@l File file);

    @l
    m0 c(@l File file) throws FileNotFoundException;

    long d(@l File file);

    @l
    o0 e(@l File file) throws FileNotFoundException;

    @l
    m0 f(@l File file) throws FileNotFoundException;

    void g(@l File from, @l File to) throws IOException;

    void h(@l File file) throws IOException;
}
