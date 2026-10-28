package okio;

import com.flashget.kidsdownloader.ProtectedSandApp;
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
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0005\u001a\u00020\u0004*\u00020\u0003\u001a\n\u0010\u0007\u001a\u00020\u0001*\u00020\u0006\u001a\n\u0010\b\u001a\u00020\u0004*\u00020\u0006\u001a\u0016\u0010\f\u001a\u00020\u0001*\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007\u001a\n\u0010\r\u001a\u00020\u0001*\u00020\t\u001a\n\u0010\u000e\u001a\u00020\u0004*\u00020\t\u001a'\u0010\u0013\u001a\u00020\u0001*\u00020\u000f2\u0012\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00110\u0010\"\u00020\u0011H\u0007¢\u0006\u0004\b\u0013\u0010\u0014\u001a'\u0010\u0015\u001a\u00020\u0004*\u00020\u000f2\u0012\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00110\u0010\"\u00020\u0011H\u0007¢\u0006\u0004\b\u0015\u0010\u0016\"\"\u0010\u001d\u001a\n \u0018*\u0004\u0018\u00010\u00170\u00178\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u001c\u0010\"\u001a\u00020\n*\u00060\u001ej\u0002`\u001f8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006#"}, d2 = {"Ljava/io/OutputStream;", "Lokio/m0;", "g", "Ljava/io/InputStream;", "Lokio/o0;", "l", "Ljava/net/Socket;", "h", "m", "Ljava/io/File;", "", "append", "f", "b", "k", "Ljava/nio/file/Path;", "", "Ljava/nio/file/OpenOption;", "options", "i", "(Ljava/nio/file/Path;[Ljava/nio/file/OpenOption;)Lokio/m0;", "n", "(Ljava/nio/file/Path;[Ljava/nio/file/OpenOption;)Lokio/o0;", "Ljava/util/logging/Logger;", "kotlin.jvm.PlatformType", "a", "Ljava/util/logging/Logger;", "c", "()Ljava/util/logging/Logger;", "logger", "Ljava/lang/AssertionError;", "Lkotlin/AssertionError;", "d", "(Ljava/lang/AssertionError;)Z", "isAndroidGetsocknameError", "okio"}, k = 5, mv = {1, 4, 0}, xs = "okio/Okio")
/* loaded from: classes5.dex */
public final /* synthetic */ class b0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Logger f31602a = Logger.getLogger(ProtectedSandApp.s("柴"));

    @d5.d
    public static final m0 b(@d5.d File file) throws FileNotFoundException {
        kotlin.jvm.internal.l0.p(file, ProtectedSandApp.s("柵"));
        return g(new FileOutputStream(file, true));
    }

    private static final Logger c() {
        return f31602a;
    }

    public static final boolean d(@d5.d AssertionError assertionError) {
        kotlin.jvm.internal.l0.p(assertionError, ProtectedSandApp.s("柶"));
        if (assertionError.getCause() == null) {
            return false;
        }
        String message = assertionError.getMessage();
        return message != null ? kotlin.text.h0.T2(message, ProtectedSandApp.s("柷"), false, 2, null) : false;
    }

    @d5.d
    @p3.j
    public static final m0 e(@d5.d File file) throws FileNotFoundException {
        return j(file, false, 1, null);
    }

    @d5.d
    @p3.j
    public static final m0 f(@d5.d File file, boolean z5) throws FileNotFoundException {
        kotlin.jvm.internal.l0.p(file, ProtectedSandApp.s("柸"));
        return g(new FileOutputStream(file, z5));
    }

    @d5.d
    public static final m0 g(@d5.d OutputStream outputStream) {
        kotlin.jvm.internal.l0.p(outputStream, ProtectedSandApp.s("柹"));
        return new e0(outputStream, new q0());
    }

    @d5.d
    public static final m0 h(@d5.d Socket socket) throws IOException {
        kotlin.jvm.internal.l0.p(socket, ProtectedSandApp.s("柺"));
        n0 n0Var = new n0(socket);
        OutputStream outputStream = socket.getOutputStream();
        kotlin.jvm.internal.l0.o(outputStream, ProtectedSandApp.s("査"));
        return n0Var.z(new e0(outputStream, n0Var));
    }

    @d5.d
    @IgnoreJRERequirement
    public static final m0 i(@d5.d Path path, @d5.d OpenOption... openOptionArr) throws IOException {
        OutputStream newOutputStream;
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("柼"));
        kotlin.jvm.internal.l0.p(openOptionArr, ProtectedSandApp.s("柽"));
        newOutputStream = Files.newOutputStream(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
        kotlin.jvm.internal.l0.o(newOutputStream, ProtectedSandApp.s("柾"));
        return g(newOutputStream);
    }

    public static m0 j(File file, boolean z5, int i5, Object obj) throws FileNotFoundException {
        if ((i5 & 1) != 0) {
            z5 = false;
        }
        return f(file, z5);
    }

    @d5.d
    public static final o0 k(@d5.d File file) throws FileNotFoundException {
        kotlin.jvm.internal.l0.p(file, ProtectedSandApp.s("柿"));
        return l(new FileInputStream(file));
    }

    @d5.d
    public static final o0 l(@d5.d InputStream inputStream) {
        kotlin.jvm.internal.l0.p(inputStream, ProtectedSandApp.s("栀"));
        return new z(inputStream, new q0());
    }

    @d5.d
    public static final o0 m(@d5.d Socket socket) throws IOException {
        kotlin.jvm.internal.l0.p(socket, ProtectedSandApp.s("栁"));
        n0 n0Var = new n0(socket);
        InputStream inputStream = socket.getInputStream();
        kotlin.jvm.internal.l0.o(inputStream, ProtectedSandApp.s("栂"));
        return n0Var.A(new z(inputStream, n0Var));
    }

    @d5.d
    @IgnoreJRERequirement
    public static final o0 n(@d5.d Path path, @d5.d OpenOption... openOptionArr) throws IOException {
        InputStream newInputStream;
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("栃"));
        kotlin.jvm.internal.l0.p(openOptionArr, ProtectedSandApp.s("栄"));
        newInputStream = Files.newInputStream(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
        kotlin.jvm.internal.l0.o(newInputStream, ProtectedSandApp.s("栅"));
        return l(newInputStream);
    }
}
