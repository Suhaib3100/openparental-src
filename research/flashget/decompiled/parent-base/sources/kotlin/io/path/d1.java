package kotlin.io.path;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* compiled from: PathReadWrite.kt */
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001c\n\u0002\b\n\u001a2\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\"\u00020\u0004H\u0087\b¢\u0006\u0004\b\u0007\u0010\b\u001a<\u0010\f\u001a\u00020\u000b*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\n\u001a\u00020\t2\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\"\u00020\u0004H\u0087\b¢\u0006\u0004\b\f\u0010\r\u001a2\u0010\u000f\u001a\u00020\u000e*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\"\u00020\u0004H\u0087\b¢\u0006\u0004\b\u000f\u0010\u0010\u001a<\u0010\u0012\u001a\u00020\u0011*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\n\u001a\u00020\t2\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\"\u00020\u0004H\u0087\b¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0014\u0010\u0015\u001a\u00020\u0014*\u00020\u0000H\u0087\b¢\u0006\u0004\b\u0015\u0010\u0016\u001a0\u0010\u0019\u001a\u00020\u0018*\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00142\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\"\u00020\u0004H\u0087\b¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u001c\u0010\u001b\u001a\u00020\u0018*\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0014H\u0087\b¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u001d\u0010\u001e\u001a\u00020\u001d*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u001e\u0010\u001f\u001a9\u0010\"\u001a\u00020\u0018*\u00020\u00002\u0006\u0010!\u001a\u00020 2\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\"\u00020\u0004H\u0007¢\u0006\u0004\b\"\u0010#\u001a%\u0010$\u001a\u00020\u0018*\u00020\u00002\u0006\u0010!\u001a\u00020 2\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b$\u0010%\u001aD\u0010+\u001a\u00020\u0018*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012!\u0010*\u001a\u001d\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b'\u0012\b\b(\u0012\u0004\b\b()\u0012\u0004\u0012\u00020\u00180&H\u0087\bø\u0001\u0000¢\u0006\u0004\b+\u0010,\u001a(\u0010.\u001a\u00020-*\u00020\u00002\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\"\u00020\u0004H\u0087\b¢\u0006\u0004\b.\u0010/\u001a(\u00101\u001a\u000200*\u00020\u00002\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\"\u00020\u0004H\u0087\b¢\u0006\u0004\b1\u00102\u001a$\u00104\u001a\b\u0012\u0004\u0012\u00020\u001d03*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0087\b¢\u0006\u0004\b4\u00105\u001aA\u00109\u001a\u00028\u0000\"\u0004\b\u0000\u00106*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0018\u00108\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d07\u0012\u0004\u0012\u00028\u00000&H\u0087\bø\u0001\u0000¢\u0006\u0004\b9\u0010:\u001a@\u0010=\u001a\u00020\u0000*\u00020\u00002\f\u0010<\u001a\b\u0012\u0004\u0012\u00020 0;2\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\"\u00020\u0004H\u0087\b¢\u0006\u0004\b=\u0010>\u001a@\u0010?\u001a\u00020\u0000*\u00020\u00002\f\u0010<\u001a\b\u0012\u0004\u0012\u00020 072\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\"\u00020\u0004H\u0087\b¢\u0006\u0004\b?\u0010@\u001a,\u0010A\u001a\u00020\u0000*\u00020\u00002\f\u0010<\u001a\b\u0012\u0004\u0012\u00020 0;2\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0087\b¢\u0006\u0004\bA\u0010B\u001a,\u0010C\u001a\u00020\u0000*\u00020\u00002\f\u0010<\u001a\b\u0012\u0004\u0012\u00020 072\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0087\b¢\u0006\u0004\bC\u0010D\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006E"}, d2 = {"Ljava/nio/file/Path;", "Ljava/nio/charset/Charset;", "charset", "", "Ljava/nio/file/OpenOption;", "options", "Ljava/io/InputStreamReader;", "u", "(Ljava/nio/file/Path;Ljava/nio/charset/Charset;[Ljava/nio/file/OpenOption;)Ljava/io/InputStreamReader;", "", "bufferSize", "Ljava/io/BufferedReader;", "h", "(Ljava/nio/file/Path;Ljava/nio/charset/Charset;I[Ljava/nio/file/OpenOption;)Ljava/io/BufferedReader;", "Ljava/io/OutputStreamWriter;", "F", "(Ljava/nio/file/Path;Ljava/nio/charset/Charset;[Ljava/nio/file/OpenOption;)Ljava/io/OutputStreamWriter;", "Ljava/io/BufferedWriter;", "j", "(Ljava/nio/file/Path;Ljava/nio/charset/Charset;I[Ljava/nio/file/OpenOption;)Ljava/io/BufferedWriter;", "", "p", "(Ljava/nio/file/Path;)[B", "array", "Lkotlin/k2;", "y", "(Ljava/nio/file/Path;[B[Ljava/nio/file/OpenOption;)V", "a", "(Ljava/nio/file/Path;[B)V", "", "s", "(Ljava/nio/file/Path;Ljava/nio/charset/Charset;)Ljava/lang/String;", "", "text", "D", "(Ljava/nio/file/Path;Ljava/lang/CharSequence;Ljava/nio/charset/Charset;[Ljava/nio/file/OpenOption;)V", "f", "(Ljava/nio/file/Path;Ljava/lang/CharSequence;Ljava/nio/charset/Charset;)V", "Lkotlin/Function1;", "Lkotlin/r0;", "name", "line", "action", "l", "(Ljava/nio/file/Path;Ljava/nio/charset/Charset;Lld/l;)V", "Ljava/io/InputStream;", "n", "(Ljava/nio/file/Path;[Ljava/nio/file/OpenOption;)Ljava/io/InputStream;", "Ljava/io/OutputStream;", "o", "(Ljava/nio/file/Path;[Ljava/nio/file/OpenOption;)Ljava/io/OutputStream;", "", "q", "(Ljava/nio/file/Path;Ljava/nio/charset/Charset;)Ljava/util/List;", "T", "Lkotlin/sequences/m;", "block", "w", "(Ljava/nio/file/Path;Ljava/nio/charset/Charset;Lld/l;)Ljava/lang/Object;", "", "lines", "z", "(Ljava/nio/file/Path;Ljava/lang/Iterable;Ljava/nio/charset/Charset;[Ljava/nio/file/OpenOption;)Ljava/nio/file/Path;", "A", "(Ljava/nio/file/Path;Lkotlin/sequences/m;Ljava/nio/charset/Charset;[Ljava/nio/file/OpenOption;)Ljava/nio/file/Path;", "b", "(Ljava/nio/file/Path;Ljava/lang/Iterable;Ljava/nio/charset/Charset;)Ljava/nio/file/Path;", "c", "(Ljava/nio/file/Path;Lkotlin/sequences/m;Ljava/nio/charset/Charset;)Ljava/nio/file/Path;", "kotlin-stdlib-jdk7"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/io/path/PathsKt")
@kotlin.jvm.internal.r1({"SMAP\nPathReadWrite.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathReadWrite.kt\nkotlin/io/path/PathsKt__PathReadWriteKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ReadWrite.kt\nkotlin/io/TextStreamsKt\n+ 4 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,326:1\n1#2:327\n1#2:329\n52#3:328\n1313#4,2:330\n*S KotlinDebug\n*F\n+ 1 PathReadWrite.kt\nkotlin/io/path/PathsKt__PathReadWriteKt\n*L\n202#1:329\n202#1:328\n202#1:330,2\n*E\n"})
/* loaded from: classes7.dex */
class d1 {
    @kotlin.o2(markerClass = {t.class})
    @kotlin.c1(version = "1.5")
    @kotlin.internal.f
    private static final Path A(Path path, kotlin.sequences.m<? extends CharSequence> mVar, Charset charset, OpenOption... openOptionArr) throws IOException {
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("搷\u0001"));
        kotlin.jvm.internal.l0.p(mVar, ProtectedSandApp.s("搸\u0001"));
        kotlin.jvm.internal.l0.p(charset, ProtectedSandApp.s("搹\u0001"));
        kotlin.jvm.internal.l0.p(openOptionArr, ProtectedSandApp.s("携\u0001"));
        Path write = Files.write(path, kotlin.sequences.p.N(mVar), charset, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
        kotlin.jvm.internal.l0.o(write, ProtectedSandApp.s("搻\u0001"));
        return write;
    }

    static /* synthetic */ Path B(Path path, Iterable iterable, Charset charset, OpenOption[] openOptionArr, int i4, Object obj) throws IOException {
        if ((i4 & 2) != 0) {
            charset = kotlin.text.f.UTF_8;
        }
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("搷\u0001"));
        kotlin.jvm.internal.l0.p(iterable, ProtectedSandApp.s("搸\u0001"));
        kotlin.jvm.internal.l0.p(charset, ProtectedSandApp.s("搹\u0001"));
        kotlin.jvm.internal.l0.p(openOptionArr, ProtectedSandApp.s("携\u0001"));
        Path write = Files.write(path, iterable, charset, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
        kotlin.jvm.internal.l0.o(write, ProtectedSandApp.s("搻\u0001"));
        return write;
    }

    static /* synthetic */ Path C(Path path, kotlin.sequences.m mVar, Charset charset, OpenOption[] openOptionArr, int i4, Object obj) throws IOException {
        if ((i4 & 2) != 0) {
            charset = kotlin.text.f.UTF_8;
        }
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("搷\u0001"));
        kotlin.jvm.internal.l0.p(mVar, ProtectedSandApp.s("搸\u0001"));
        kotlin.jvm.internal.l0.p(charset, ProtectedSandApp.s("搹\u0001"));
        kotlin.jvm.internal.l0.p(openOptionArr, ProtectedSandApp.s("携\u0001"));
        Path write = Files.write(path, kotlin.sequences.p.N(mVar), charset, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
        kotlin.jvm.internal.l0.o(write, ProtectedSandApp.s("搻\u0001"));
        return write;
    }

    @kotlin.o2(markerClass = {t.class})
    @kotlin.c1(version = "1.5")
    public static final void D(@fg.l Path path, @fg.l CharSequence charSequence, @fg.l Charset charset, @fg.l OpenOption... openOptionArr) throws IOException {
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("搷\u0001"));
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("搼\u0001"));
        kotlin.jvm.internal.l0.p(charset, ProtectedSandApp.s("搹\u0001"));
        kotlin.jvm.internal.l0.p(openOptionArr, ProtectedSandApp.s("携\u0001"));
        OutputStream newOutputStream = Files.newOutputStream(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
        kotlin.jvm.internal.l0.o(newOutputStream, ProtectedSandApp.s("搽\u0001"));
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(newOutputStream, charset);
        try {
            outputStreamWriter.append(charSequence);
            kotlin.io.b.a(outputStreamWriter, null);
        } finally {
        }
    }

    public static /* synthetic */ void E(Path path, CharSequence charSequence, Charset charset, OpenOption[] openOptionArr, int i4, Object obj) throws IOException {
        if ((i4 & 2) != 0) {
            charset = kotlin.text.f.UTF_8;
        }
        D(path, charSequence, charset, openOptionArr);
    }

    @kotlin.o2(markerClass = {t.class})
    @kotlin.c1(version = "1.5")
    @kotlin.internal.f
    private static final OutputStreamWriter F(Path path, Charset charset, OpenOption... openOptionArr) throws IOException {
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("搷\u0001"));
        kotlin.jvm.internal.l0.p(charset, ProtectedSandApp.s("搹\u0001"));
        kotlin.jvm.internal.l0.p(openOptionArr, ProtectedSandApp.s("携\u0001"));
        return new OutputStreamWriter(Files.newOutputStream(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length)), charset);
    }

    static /* synthetic */ OutputStreamWriter G(Path path, Charset charset, OpenOption[] openOptionArr, int i4, Object obj) throws IOException {
        if ((i4 & 1) != 0) {
            charset = kotlin.text.f.UTF_8;
        }
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("搷\u0001"));
        kotlin.jvm.internal.l0.p(charset, ProtectedSandApp.s("搹\u0001"));
        kotlin.jvm.internal.l0.p(openOptionArr, ProtectedSandApp.s("携\u0001"));
        return new OutputStreamWriter(Files.newOutputStream(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length)), charset);
    }

    @kotlin.o2(markerClass = {t.class})
    @kotlin.c1(version = "1.5")
    @kotlin.internal.f
    private static final void a(Path path, byte[] bArr) throws IOException {
        StandardOpenOption standardOpenOption;
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("搷\u0001"));
        kotlin.jvm.internal.l0.p(bArr, ProtectedSandApp.s("搾\u0001"));
        standardOpenOption = StandardOpenOption.APPEND;
        Files.write(path, bArr, standardOpenOption);
    }

    @kotlin.o2(markerClass = {t.class})
    @kotlin.c1(version = "1.5")
    @kotlin.internal.f
    private static final Path b(Path path, Iterable<? extends CharSequence> iterable, Charset charset) throws IOException {
        StandardOpenOption standardOpenOption;
        Path write;
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("搷\u0001"));
        kotlin.jvm.internal.l0.p(iterable, ProtectedSandApp.s("搸\u0001"));
        kotlin.jvm.internal.l0.p(charset, ProtectedSandApp.s("搹\u0001"));
        standardOpenOption = StandardOpenOption.APPEND;
        write = Files.write(path, iterable, charset, standardOpenOption);
        kotlin.jvm.internal.l0.o(write, ProtectedSandApp.s("搻\u0001"));
        return write;
    }

    @kotlin.o2(markerClass = {t.class})
    @kotlin.c1(version = "1.5")
    @kotlin.internal.f
    private static final Path c(Path path, kotlin.sequences.m<? extends CharSequence> mVar, Charset charset) throws IOException {
        StandardOpenOption standardOpenOption;
        Path write;
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("搷\u0001"));
        kotlin.jvm.internal.l0.p(mVar, ProtectedSandApp.s("搸\u0001"));
        kotlin.jvm.internal.l0.p(charset, ProtectedSandApp.s("搹\u0001"));
        Iterable N = kotlin.sequences.p.N(mVar);
        standardOpenOption = StandardOpenOption.APPEND;
        write = Files.write(path, N, charset, standardOpenOption);
        kotlin.jvm.internal.l0.o(write, ProtectedSandApp.s("搻\u0001"));
        return write;
    }

    static /* synthetic */ Path d(Path path, Iterable iterable, Charset charset, int i4, Object obj) throws IOException {
        StandardOpenOption standardOpenOption;
        Path write;
        if ((i4 & 2) != 0) {
            charset = kotlin.text.f.UTF_8;
        }
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("搷\u0001"));
        kotlin.jvm.internal.l0.p(iterable, ProtectedSandApp.s("搸\u0001"));
        kotlin.jvm.internal.l0.p(charset, ProtectedSandApp.s("搹\u0001"));
        standardOpenOption = StandardOpenOption.APPEND;
        write = Files.write(path, iterable, charset, standardOpenOption);
        kotlin.jvm.internal.l0.o(write, ProtectedSandApp.s("搻\u0001"));
        return write;
    }

    static /* synthetic */ Path e(Path path, kotlin.sequences.m mVar, Charset charset, int i4, Object obj) throws IOException {
        StandardOpenOption standardOpenOption;
        Path write;
        if ((i4 & 2) != 0) {
            charset = kotlin.text.f.UTF_8;
        }
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("搷\u0001"));
        kotlin.jvm.internal.l0.p(mVar, ProtectedSandApp.s("搸\u0001"));
        kotlin.jvm.internal.l0.p(charset, ProtectedSandApp.s("搹\u0001"));
        Iterable N = kotlin.sequences.p.N(mVar);
        standardOpenOption = StandardOpenOption.APPEND;
        write = Files.write(path, N, charset, standardOpenOption);
        kotlin.jvm.internal.l0.o(write, ProtectedSandApp.s("搻\u0001"));
        return write;
    }

    @kotlin.o2(markerClass = {t.class})
    @kotlin.c1(version = "1.5")
    public static final void f(@fg.l Path path, @fg.l CharSequence charSequence, @fg.l Charset charset) throws IOException {
        StandardOpenOption standardOpenOption;
        OutputStream newOutputStream;
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("搷\u0001"));
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("搼\u0001"));
        kotlin.jvm.internal.l0.p(charset, ProtectedSandApp.s("搹\u0001"));
        standardOpenOption = StandardOpenOption.APPEND;
        newOutputStream = Files.newOutputStream(path, standardOpenOption);
        kotlin.jvm.internal.l0.o(newOutputStream, ProtectedSandApp.s("搽\u0001"));
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(newOutputStream, charset);
        try {
            outputStreamWriter.append(charSequence);
            kotlin.io.b.a(outputStreamWriter, null);
        } finally {
        }
    }

    public static /* synthetic */ void g(Path path, CharSequence charSequence, Charset charset, int i4, Object obj) throws IOException {
        if ((i4 & 2) != 0) {
            charset = kotlin.text.f.UTF_8;
        }
        f(path, charSequence, charset);
    }

    @kotlin.o2(markerClass = {t.class})
    @kotlin.c1(version = "1.5")
    @kotlin.internal.f
    private static final BufferedReader h(Path path, Charset charset, int i4, OpenOption... openOptionArr) throws IOException {
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("搷\u0001"));
        kotlin.jvm.internal.l0.p(charset, ProtectedSandApp.s("搹\u0001"));
        kotlin.jvm.internal.l0.p(openOptionArr, ProtectedSandApp.s("携\u0001"));
        return new BufferedReader(new InputStreamReader(Files.newInputStream(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length)), charset), i4);
    }

    static /* synthetic */ BufferedReader i(Path path, Charset charset, int i4, OpenOption[] openOptionArr, int i5, Object obj) throws IOException {
        if ((i5 & 1) != 0) {
            charset = kotlin.text.f.UTF_8;
        }
        if ((i5 & 2) != 0) {
            i4 = 8192;
        }
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("搷\u0001"));
        kotlin.jvm.internal.l0.p(charset, ProtectedSandApp.s("搹\u0001"));
        kotlin.jvm.internal.l0.p(openOptionArr, ProtectedSandApp.s("携\u0001"));
        return new BufferedReader(new InputStreamReader(Files.newInputStream(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length)), charset), i4);
    }

    @kotlin.o2(markerClass = {t.class})
    @kotlin.c1(version = "1.5")
    @kotlin.internal.f
    private static final BufferedWriter j(Path path, Charset charset, int i4, OpenOption... openOptionArr) throws IOException {
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("搷\u0001"));
        kotlin.jvm.internal.l0.p(charset, ProtectedSandApp.s("搹\u0001"));
        kotlin.jvm.internal.l0.p(openOptionArr, ProtectedSandApp.s("携\u0001"));
        return new BufferedWriter(new OutputStreamWriter(Files.newOutputStream(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length)), charset), i4);
    }

    static /* synthetic */ BufferedWriter k(Path path, Charset charset, int i4, OpenOption[] openOptionArr, int i5, Object obj) throws IOException {
        if ((i5 & 1) != 0) {
            charset = kotlin.text.f.UTF_8;
        }
        if ((i5 & 2) != 0) {
            i4 = 8192;
        }
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("搷\u0001"));
        kotlin.jvm.internal.l0.p(charset, ProtectedSandApp.s("搹\u0001"));
        kotlin.jvm.internal.l0.p(openOptionArr, ProtectedSandApp.s("携\u0001"));
        return new BufferedWriter(new OutputStreamWriter(Files.newOutputStream(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length)), charset), i4);
    }

    @kotlin.o2(markerClass = {t.class})
    @kotlin.c1(version = "1.5")
    @kotlin.internal.f
    private static final void l(Path path, Charset charset, ld.l<? super String, kotlin.k2> lVar) throws IOException {
        BufferedReader newBufferedReader;
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("搷\u0001"));
        kotlin.jvm.internal.l0.p(charset, ProtectedSandApp.s("搹\u0001"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("搿\u0001"));
        newBufferedReader = Files.newBufferedReader(path, charset);
        kotlin.jvm.internal.l0.o(newBufferedReader, ProtectedSandApp.s("摀\u0001"));
        try {
            Iterator<String> it = kotlin.io.t.h(newBufferedReader).iterator();
            while (it.hasNext()) {
                lVar.invoke(it.next());
            }
            kotlin.k2 k2Var = kotlin.k2.f75408a;
            if (kotlin.internal.m.a(1, 1, 0)) {
                kotlin.io.b.a(newBufferedReader, null);
            } else {
                newBufferedReader.close();
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (kotlin.internal.m.a(1, 1, 0)) {
                    kotlin.io.b.a(newBufferedReader, th);
                } else {
                    try {
                        newBufferedReader.close();
                    } catch (Throwable unused) {
                    }
                }
                throw th2;
            }
        }
    }

    static void m(Path path, Charset charset, ld.l lVar, int i4, Object obj) throws IOException {
        BufferedReader newBufferedReader;
        if ((i4 & 1) != 0) {
            charset = kotlin.text.f.UTF_8;
        }
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("搷\u0001"));
        kotlin.jvm.internal.l0.p(charset, ProtectedSandApp.s("搹\u0001"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("搿\u0001"));
        newBufferedReader = Files.newBufferedReader(path, charset);
        kotlin.jvm.internal.l0.o(newBufferedReader, ProtectedSandApp.s("摀\u0001"));
        try {
            Iterator<String> it = kotlin.io.t.h(newBufferedReader).iterator();
            while (it.hasNext()) {
                lVar.invoke(it.next());
            }
            kotlin.k2 k2Var = kotlin.k2.f75408a;
            if (kotlin.internal.m.a(1, 1, 0)) {
                kotlin.io.b.a(newBufferedReader, null);
            } else {
                newBufferedReader.close();
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (kotlin.internal.m.a(1, 1, 0)) {
                    kotlin.io.b.a(newBufferedReader, th);
                } else {
                    try {
                        newBufferedReader.close();
                    } catch (Throwable unused) {
                    }
                }
                throw th2;
            }
        }
    }

    @kotlin.o2(markerClass = {t.class})
    @kotlin.c1(version = "1.5")
    @kotlin.internal.f
    private static final InputStream n(Path path, OpenOption... openOptionArr) throws IOException {
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("搷\u0001"));
        kotlin.jvm.internal.l0.p(openOptionArr, ProtectedSandApp.s("携\u0001"));
        InputStream newInputStream = Files.newInputStream(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
        kotlin.jvm.internal.l0.o(newInputStream, ProtectedSandApp.s("摁\u0001"));
        return newInputStream;
    }

    @kotlin.o2(markerClass = {t.class})
    @kotlin.c1(version = "1.5")
    @kotlin.internal.f
    private static final OutputStream o(Path path, OpenOption... openOptionArr) throws IOException {
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("搷\u0001"));
        kotlin.jvm.internal.l0.p(openOptionArr, ProtectedSandApp.s("携\u0001"));
        OutputStream newOutputStream = Files.newOutputStream(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
        kotlin.jvm.internal.l0.o(newOutputStream, ProtectedSandApp.s("搽\u0001"));
        return newOutputStream;
    }

    @kotlin.o2(markerClass = {t.class})
    @kotlin.c1(version = "1.5")
    @kotlin.internal.f
    private static final byte[] p(Path path) throws IOException {
        byte[] readAllBytes;
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("搷\u0001"));
        readAllBytes = Files.readAllBytes(path);
        kotlin.jvm.internal.l0.o(readAllBytes, ProtectedSandApp.s("摂\u0001"));
        return readAllBytes;
    }

    @kotlin.o2(markerClass = {t.class})
    @kotlin.c1(version = "1.5")
    @kotlin.internal.f
    private static final List<String> q(Path path, Charset charset) throws IOException {
        List<String> readAllLines;
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("搷\u0001"));
        kotlin.jvm.internal.l0.p(charset, ProtectedSandApp.s("搹\u0001"));
        readAllLines = Files.readAllLines(path, charset);
        kotlin.jvm.internal.l0.o(readAllLines, ProtectedSandApp.s("摃\u0001"));
        return readAllLines;
    }

    static /* synthetic */ List r(Path path, Charset charset, int i4, Object obj) throws IOException {
        List readAllLines;
        if ((i4 & 1) != 0) {
            charset = kotlin.text.f.UTF_8;
        }
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("搷\u0001"));
        kotlin.jvm.internal.l0.p(charset, ProtectedSandApp.s("搹\u0001"));
        readAllLines = Files.readAllLines(path, charset);
        kotlin.jvm.internal.l0.o(readAllLines, ProtectedSandApp.s("摃\u0001"));
        return readAllLines;
    }

    @fg.l
    @kotlin.o2(markerClass = {t.class})
    @kotlin.c1(version = "1.5")
    public static final String s(@fg.l Path path, @fg.l Charset charset) throws IOException {
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("搷\u0001"));
        kotlin.jvm.internal.l0.p(charset, ProtectedSandApp.s("搹\u0001"));
        InputStreamReader inputStreamReader = new InputStreamReader(Files.newInputStream(path, (OpenOption[]) Arrays.copyOf(new OpenOption[0], 0)), charset);
        try {
            String k4 = kotlin.io.t.k(inputStreamReader);
            kotlin.io.b.a(inputStreamReader, null);
            return k4;
        } finally {
        }
    }

    public static /* synthetic */ String t(Path path, Charset charset, int i4, Object obj) throws IOException {
        if ((i4 & 1) != 0) {
            charset = kotlin.text.f.UTF_8;
        }
        return s(path, charset);
    }

    @kotlin.o2(markerClass = {t.class})
    @kotlin.c1(version = "1.5")
    @kotlin.internal.f
    private static final InputStreamReader u(Path path, Charset charset, OpenOption... openOptionArr) throws IOException {
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("搷\u0001"));
        kotlin.jvm.internal.l0.p(charset, ProtectedSandApp.s("搹\u0001"));
        kotlin.jvm.internal.l0.p(openOptionArr, ProtectedSandApp.s("携\u0001"));
        return new InputStreamReader(Files.newInputStream(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length)), charset);
    }

    static /* synthetic */ InputStreamReader v(Path path, Charset charset, OpenOption[] openOptionArr, int i4, Object obj) throws IOException {
        if ((i4 & 1) != 0) {
            charset = kotlin.text.f.UTF_8;
        }
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("搷\u0001"));
        kotlin.jvm.internal.l0.p(charset, ProtectedSandApp.s("搹\u0001"));
        kotlin.jvm.internal.l0.p(openOptionArr, ProtectedSandApp.s("携\u0001"));
        return new InputStreamReader(Files.newInputStream(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length)), charset);
    }

    @kotlin.o2(markerClass = {t.class})
    @kotlin.c1(version = "1.5")
    @kotlin.internal.f
    private static final <T> T w(Path path, Charset charset, ld.l<? super kotlin.sequences.m<String>, ? extends T> lVar) throws IOException {
        BufferedReader newBufferedReader;
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("搷\u0001"));
        kotlin.jvm.internal.l0.p(charset, ProtectedSandApp.s("搹\u0001"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("摄\u0001"));
        newBufferedReader = Files.newBufferedReader(path, charset);
        try {
            kotlin.jvm.internal.l0.m(newBufferedReader);
            T invoke = lVar.invoke(kotlin.io.t.h(newBufferedReader));
            if (kotlin.internal.m.a(1, 1, 0)) {
                kotlin.io.b.a(newBufferedReader, null);
            } else if (newBufferedReader != null) {
                newBufferedReader.close();
            }
            return invoke;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (kotlin.internal.m.a(1, 1, 0)) {
                    kotlin.io.b.a(newBufferedReader, th);
                } else if (newBufferedReader != null) {
                    try {
                        newBufferedReader.close();
                    } catch (Throwable unused) {
                    }
                }
                throw th2;
            }
        }
    }

    static Object x(Path path, Charset charset, ld.l lVar, int i4, Object obj) throws IOException {
        BufferedReader newBufferedReader;
        if ((i4 & 1) != 0) {
            charset = kotlin.text.f.UTF_8;
        }
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("搷\u0001"));
        kotlin.jvm.internal.l0.p(charset, ProtectedSandApp.s("搹\u0001"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("摄\u0001"));
        newBufferedReader = Files.newBufferedReader(path, charset);
        try {
            kotlin.jvm.internal.l0.m(newBufferedReader);
            Object invoke = lVar.invoke(kotlin.io.t.h(newBufferedReader));
            if (kotlin.internal.m.a(1, 1, 0)) {
                kotlin.io.b.a(newBufferedReader, null);
            } else if (newBufferedReader != null) {
                newBufferedReader.close();
            }
            return invoke;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (kotlin.internal.m.a(1, 1, 0)) {
                    kotlin.io.b.a(newBufferedReader, th);
                } else if (newBufferedReader != null) {
                    try {
                        newBufferedReader.close();
                    } catch (Throwable unused) {
                    }
                }
                throw th2;
            }
        }
    }

    @kotlin.o2(markerClass = {t.class})
    @kotlin.c1(version = "1.5")
    @kotlin.internal.f
    private static final void y(Path path, byte[] bArr, OpenOption... openOptionArr) throws IOException {
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("搷\u0001"));
        kotlin.jvm.internal.l0.p(bArr, ProtectedSandApp.s("搾\u0001"));
        kotlin.jvm.internal.l0.p(openOptionArr, ProtectedSandApp.s("携\u0001"));
        Files.write(path, bArr, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
    }

    @kotlin.o2(markerClass = {t.class})
    @kotlin.c1(version = "1.5")
    @kotlin.internal.f
    private static final Path z(Path path, Iterable<? extends CharSequence> iterable, Charset charset, OpenOption... openOptionArr) throws IOException {
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("搷\u0001"));
        kotlin.jvm.internal.l0.p(iterable, ProtectedSandApp.s("搸\u0001"));
        kotlin.jvm.internal.l0.p(charset, ProtectedSandApp.s("搹\u0001"));
        kotlin.jvm.internal.l0.p(openOptionArr, ProtectedSandApp.s("携\u0001"));
        Path write = Files.write(path, iterable, charset, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
        kotlin.jvm.internal.l0.o(write, ProtectedSandApp.s("搻\u0001"));
        return write;
    }
}
