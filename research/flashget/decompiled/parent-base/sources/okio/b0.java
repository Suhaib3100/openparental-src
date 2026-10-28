package okio;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.logging.Logger;
import kotlin.Metadata;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: JvmOkio.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0011\u0010\t\u001a\u00020\u0001*\u00020\b¢\u0006\u0004\b\t\u0010\n\u001a\u0011\u0010\u000b\u001a\u00020\u0005*\u00020\b¢\u0006\u0004\b\u000b\u0010\f\u001a\u001d\u0010\u0010\u001a\u00020\u0001*\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0011\u0010\u0012\u001a\u00020\u0001*\u00020\r¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0011\u0010\u0014\u001a\u00020\u0005*\u00020\r¢\u0006\u0004\b\u0014\u0010\u0015\u001a'\u0010\u001a\u001a\u00020\u0001*\u00020\u00162\u0012\u0010\u0019\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00180\u0017\"\u00020\u0018H\u0007¢\u0006\u0004\b\u001a\u0010\u001b\u001a'\u0010\u001c\u001a\u00020\u0005*\u00020\u00162\u0012\u0010\u0019\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00180\u0017\"\u00020\u0018H\u0007¢\u0006\u0004\b\u001c\u0010\u001d\"\"\u0010$\u001a\n \u001f*\u0004\u0018\u00010\u001e0\u001e8\u0002X\u0082\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u001c\u0010)\u001a\u00020\u000e*\u00060%j\u0002`&8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006*"}, d2 = {"Ljava/io/OutputStream;", "Lokio/m0;", "g", "(Ljava/io/OutputStream;)Lokio/m0;", "Ljava/io/InputStream;", "Lokio/o0;", "l", "(Ljava/io/InputStream;)Lokio/o0;", "Ljava/net/Socket;", "h", "(Ljava/net/Socket;)Lokio/m0;", "m", "(Ljava/net/Socket;)Lokio/o0;", "Ljava/io/File;", "", "append", "f", "(Ljava/io/File;Z)Lokio/m0;", "b", "(Ljava/io/File;)Lokio/m0;", "k", "(Ljava/io/File;)Lokio/o0;", "Ljava/nio/file/Path;", "", "Ljava/nio/file/OpenOption;", "options", "i", "(Ljava/nio/file/Path;[Ljava/nio/file/OpenOption;)Lokio/m0;", "n", "(Ljava/nio/file/Path;[Ljava/nio/file/OpenOption;)Lokio/o0;", "Ljava/util/logging/Logger;", "kotlin.jvm.PlatformType", "a", "Ljava/util/logging/Logger;", "c", "()Ljava/util/logging/Logger;", "logger", "Ljava/lang/AssertionError;", "Lkotlin/AssertionError;", "d", "(Ljava/lang/AssertionError;)Z", "isAndroidGetsocknameError", "okio"}, k = 5, mv = {1, 4, 0}, xs = "okio/Okio")
/* loaded from: classes3.dex */
public final /* synthetic */ class b0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Logger f85158a = Logger.getLogger(ProtectedSandApp.s("ἑ"));

    @fg.l
    public static final m0 b(@fg.l File file) throws FileNotFoundException {
        kotlin.jvm.internal.l0.p(file, ProtectedSandApp.s("ἒ"));
        return g(new FileOutputStream(file, true));
    }

    private static final Logger c() {
        return f85158a;
    }

    public static final boolean d(@fg.l AssertionError assertionError) {
        kotlin.jvm.internal.l0.p(assertionError, ProtectedSandApp.s("ἓ"));
        if (assertionError.getCause() == null) {
            return false;
        }
        String message = assertionError.getMessage();
        return message != null ? kotlin.text.v.T2(message, ProtectedSandApp.s("ἔ"), false, 2, null) : false;
    }

    @fg.l
    @kd.j
    public static final m0 e(@fg.l File file) throws FileNotFoundException {
        return j(file, false, 1, null);
    }

    @fg.l
    @kd.j
    public static final m0 f(@fg.l File file, boolean z4) throws FileNotFoundException {
        kotlin.jvm.internal.l0.p(file, ProtectedSandApp.s("ἕ"));
        return g(new FileOutputStream(file, z4));
    }

    @fg.l
    public static final m0 g(@fg.l OutputStream outputStream) {
        kotlin.jvm.internal.l0.p(outputStream, ProtectedSandApp.s("ἕ"));
        return new e0(outputStream, new q0());
    }

    @fg.l
    public static final m0 h(@fg.l Socket socket) throws IOException {
        kotlin.jvm.internal.l0.p(socket, ProtectedSandApp.s("ἕ"));
        n0 n0Var = new n0(socket);
        OutputStream outputStream = socket.getOutputStream();
        kotlin.jvm.internal.l0.o(outputStream, ProtectedSandApp.s("\u1f16"));
        return n0Var.z(new e0(outputStream, n0Var));
    }

    @fg.l
    @IgnoreJRERequirement
    public static final m0 i(@fg.l Path path, @fg.l OpenOption... openOptionArr) throws IOException {
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("ἕ"));
        kotlin.jvm.internal.l0.p(openOptionArr, ProtectedSandApp.s("\u1f17"));
        OutputStream newOutputStream = Files.newOutputStream(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
        kotlin.jvm.internal.l0.o(newOutputStream, ProtectedSandApp.s("Ἐ"));
        return g(newOutputStream);
    }

    public static m0 j(File file, boolean z4, int i4, Object obj) throws FileNotFoundException {
        if ((i4 & 1) != 0) {
            z4 = false;
        }
        return f(file, z4);
    }

    @fg.l
    public static final o0 k(@fg.l File file) throws FileNotFoundException {
        kotlin.jvm.internal.l0.p(file, ProtectedSandApp.s("Ἑ"));
        return l(new FileInputStream(file));
    }

    @fg.l
    public static final o0 l(@fg.l InputStream inputStream) {
        kotlin.jvm.internal.l0.p(inputStream, ProtectedSandApp.s("Ἑ"));
        return new z(inputStream, new q0());
    }

    @fg.l
    public static final o0 m(@fg.l Socket socket) throws IOException {
        kotlin.jvm.internal.l0.p(socket, ProtectedSandApp.s("Ἑ"));
        n0 n0Var = new n0(socket);
        InputStream inputStream = socket.getInputStream();
        kotlin.jvm.internal.l0.o(inputStream, ProtectedSandApp.s("Ἒ"));
        return n0Var.A(new z(inputStream, n0Var));
    }

    @fg.l
    @IgnoreJRERequirement
    public static final o0 n(@fg.l Path path, @fg.l OpenOption... openOptionArr) throws IOException {
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("Ἑ"));
        kotlin.jvm.internal.l0.p(openOptionArr, ProtectedSandApp.s("\u1f17"));
        InputStream newInputStream = Files.newInputStream(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
        kotlin.jvm.internal.l0.o(newInputStream, ProtectedSandApp.s("Ἓ"));
        return l(newInputStream);
    }
}
