package okio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import kotlin.Metadata;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

@Metadata(d1 = {"okio/b0", "okio/c0"}, d2 = {}, k = 4, mv = {1, 4, 0})
/* loaded from: classes5.dex */
public final class a0 {
    @d5.d
    public static final m0 a(@d5.d File file) throws FileNotFoundException {
        return b0.b(file);
    }

    @p3.i(name = "blackhole")
    @d5.d
    public static final m0 b() {
        return new l();
    }

    @d5.d
    public static final n c(@d5.d m0 m0Var) {
        return c0.b(m0Var);
    }

    @d5.d
    public static final o d(@d5.d o0 o0Var) {
        return c0.c(o0Var);
    }

    public static final boolean e(@d5.d AssertionError assertionError) {
        return b0.d(assertionError);
    }

    @d5.d
    @p3.j
    public static final m0 f(@d5.d File file) throws FileNotFoundException {
        return b0.j(file, false, 1, null);
    }

    @d5.d
    @p3.j
    public static final m0 g(@d5.d File file, boolean z5) throws FileNotFoundException {
        return b0.f(file, z5);
    }

    @d5.d
    public static final m0 h(@d5.d OutputStream outputStream) {
        return b0.g(outputStream);
    }

    @d5.d
    public static final m0 i(@d5.d Socket socket) throws IOException {
        return b0.h(socket);
    }

    @d5.d
    @IgnoreJRERequirement
    public static final m0 j(@d5.d Path path, @d5.d OpenOption... openOptionArr) throws IOException {
        return b0.i(path, openOptionArr);
    }

    @d5.d
    public static final o0 l(@d5.d File file) throws FileNotFoundException {
        return b0.k(file);
    }

    @d5.d
    public static final o0 m(@d5.d InputStream inputStream) {
        return b0.l(inputStream);
    }

    @d5.d
    public static final o0 n(@d5.d Socket socket) throws IOException {
        return b0.m(socket);
    }

    @d5.d
    @IgnoreJRERequirement
    public static final o0 o(@d5.d Path path, @d5.d OpenOption... openOptionArr) throws IOException {
        return b0.n(path, openOptionArr);
    }
}
