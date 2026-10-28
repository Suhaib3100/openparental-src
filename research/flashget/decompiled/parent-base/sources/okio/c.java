package okio;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.x0;

/* compiled from: -DeprecatedOkio.kt */
@kotlin.k(message = "changed in Okio 2.x")
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0012\u0010\bJ\u0017\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J+\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00172\u0012\u0010\u001b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001a0\u0019\"\u00020\u001aH\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u001eH\u0007¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020\r2\u0006\u0010%\u001a\u00020$H\u0007¢\u0006\u0004\b&\u0010'J+\u0010(\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u00172\u0012\u0010\u001b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001a0\u0019\"\u00020\u001aH\u0007¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\u001eH\u0007¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u0006H\u0007¢\u0006\u0004\b,\u0010-¨\u0006."}, d2 = {"Lokio/c;", "", "<init>", "()V", "Ljava/io/File;", "file", "Lokio/m0;", "a", "(Ljava/io/File;)Lokio/m0;", "sink", "Lokio/n;", "c", "(Lokio/m0;)Lokio/n;", "Lokio/o0;", "source", "Lokio/o;", "d", "(Lokio/o0;)Lokio/o;", "e", "Ljava/io/OutputStream;", "outputStream", "f", "(Ljava/io/OutputStream;)Lokio/m0;", "Ljava/nio/file/Path;", "path", "", "Ljava/nio/file/OpenOption;", "options", "h", "(Ljava/nio/file/Path;[Ljava/nio/file/OpenOption;)Lokio/m0;", "Ljava/net/Socket;", "socket", "g", "(Ljava/net/Socket;)Lokio/m0;", "i", "(Ljava/io/File;)Lokio/o0;", "Ljava/io/InputStream;", "inputStream", "j", "(Ljava/io/InputStream;)Lokio/o0;", "l", "(Ljava/nio/file/Path;[Ljava/nio/file/OpenOption;)Lokio/o0;", "k", "(Ljava/net/Socket;)Lokio/o0;", "b", "()Lokio/m0;", "okio"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f85159a = new c();

    private c() {
    }

    @fg.l
    @kotlin.k(level = kotlin.m.ERROR, message = "moved to extension function", replaceWith = @x0(expression = "file.appendingSink()", imports = {"okio.appendingSink"}))
    public final m0 a(@fg.l File file) {
        kotlin.jvm.internal.l0.p(file, ProtectedSandApp.s("\u1f1f"));
        return b0.b(file);
    }

    @fg.l
    @kotlin.k(level = kotlin.m.ERROR, message = "moved to extension function", replaceWith = @x0(expression = "blackholeSink()", imports = {"okio.blackholeSink"}))
    public final m0 b() {
        return new l();
    }

    @fg.l
    @kotlin.k(level = kotlin.m.ERROR, message = "moved to extension function", replaceWith = @x0(expression = "sink.buffer()", imports = {"okio.buffer"}))
    public final n c(@fg.l m0 sink) {
        kotlin.jvm.internal.l0.p(sink, ProtectedSandApp.s("ἠ"));
        return c0.b(sink);
    }

    @fg.l
    @kotlin.k(level = kotlin.m.ERROR, message = "moved to extension function", replaceWith = @x0(expression = "source.buffer()", imports = {"okio.buffer"}))
    public final o d(@fg.l o0 source) {
        kotlin.jvm.internal.l0.p(source, ProtectedSandApp.s("ἡ"));
        return c0.c(source);
    }

    @fg.l
    @kotlin.k(level = kotlin.m.ERROR, message = "moved to extension function", replaceWith = @x0(expression = "file.sink()", imports = {"okio.sink"}))
    public final m0 e(@fg.l File file) {
        kotlin.jvm.internal.l0.p(file, ProtectedSandApp.s("\u1f1f"));
        return b0.j(file, false, 1, null);
    }

    @fg.l
    @kotlin.k(level = kotlin.m.ERROR, message = "moved to extension function", replaceWith = @x0(expression = "outputStream.sink()", imports = {"okio.sink"}))
    public final m0 f(@fg.l OutputStream outputStream) {
        kotlin.jvm.internal.l0.p(outputStream, ProtectedSandApp.s("ἢ"));
        return b0.g(outputStream);
    }

    @fg.l
    @kotlin.k(level = kotlin.m.ERROR, message = "moved to extension function", replaceWith = @x0(expression = "socket.sink()", imports = {"okio.sink"}))
    public final m0 g(@fg.l Socket socket) {
        kotlin.jvm.internal.l0.p(socket, ProtectedSandApp.s("ἣ"));
        return b0.h(socket);
    }

    @fg.l
    @kotlin.k(level = kotlin.m.ERROR, message = "moved to extension function", replaceWith = @x0(expression = "path.sink(*options)", imports = {"okio.sink"}))
    public final m0 h(@fg.l Path path, @fg.l OpenOption... options) {
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("ἤ"));
        kotlin.jvm.internal.l0.p(options, ProtectedSandApp.s("ἥ"));
        return b0.i(path, (OpenOption[]) Arrays.copyOf(options, options.length));
    }

    @fg.l
    @kotlin.k(level = kotlin.m.ERROR, message = "moved to extension function", replaceWith = @x0(expression = "file.source()", imports = {"okio.source"}))
    public final o0 i(@fg.l File file) {
        kotlin.jvm.internal.l0.p(file, ProtectedSandApp.s("\u1f1f"));
        return b0.k(file);
    }

    @fg.l
    @kotlin.k(level = kotlin.m.ERROR, message = "moved to extension function", replaceWith = @x0(expression = "inputStream.source()", imports = {"okio.source"}))
    public final o0 j(@fg.l InputStream inputStream) {
        kotlin.jvm.internal.l0.p(inputStream, ProtectedSandApp.s("ἦ"));
        return b0.l(inputStream);
    }

    @fg.l
    @kotlin.k(level = kotlin.m.ERROR, message = "moved to extension function", replaceWith = @x0(expression = "socket.source()", imports = {"okio.source"}))
    public final o0 k(@fg.l Socket socket) {
        kotlin.jvm.internal.l0.p(socket, ProtectedSandApp.s("ἣ"));
        return b0.m(socket);
    }

    @fg.l
    @kotlin.k(level = kotlin.m.ERROR, message = "moved to extension function", replaceWith = @x0(expression = "path.source(*options)", imports = {"okio.source"}))
    public final o0 l(@fg.l Path path, @fg.l OpenOption... options) {
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("ἤ"));
        kotlin.jvm.internal.l0.p(options, ProtectedSandApp.s("ἥ"));
        return b0.n(path, (OpenOption[]) Arrays.copyOf(options, options.length));
    }
}
