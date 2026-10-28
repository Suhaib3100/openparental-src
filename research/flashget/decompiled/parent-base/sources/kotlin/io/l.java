package kotlin.io;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.k2;

/* compiled from: FileReadWrite.kt */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001e\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0087\b¢\u0006\u0004\b\u0004\u0010\u0005\u001a(\u0010\t\u001a\u00020\b*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0087\b¢\u0006\u0004\b\t\u0010\n\u001a\u001e\u0010\f\u001a\u00020\u000b*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0087\b¢\u0006\u0004\b\f\u0010\r\u001a(\u0010\u000f\u001a\u00020\u000e*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0087\b¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001e\u0010\u0012\u001a\u00020\u0011*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0087\b¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0011\u0010\u0015\u001a\u00020\u0014*\u00020\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0019\u0010\u0019\u001a\u00020\u0018*\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0014¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0019\u0010\u001b\u001a\u00020\u0018*\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0014¢\u0006\u0004\b\u001b\u0010\u001a\u001a\u001b\u0010\u001d\u001a\u00020\u001c*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u001d\u0010\u001e\u001a#\u0010 \u001a\u00020\u0018*\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u001c2\b\b\u0002\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b \u0010!\u001a#\u0010\"\u001a\u00020\u0018*\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u001c2\b\b\u0002\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\"\u0010!\u001aI\u0010)\u001a\u00020\u0018*\u00020\u000026\u0010(\u001a2\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(&\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b('\u0012\u0004\u0012\u00020\u00180#¢\u0006\u0004\b)\u0010*\u001aQ\u0010,\u001a\u00020\u0018*\u00020\u00002\u0006\u0010+\u001a\u00020\u000626\u0010(\u001a2\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(&\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b('\u0012\u0004\u0012\u00020\u00180#¢\u0006\u0004\b,\u0010-\u001a>\u00100\u001a\u00020\u0018*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012!\u0010(\u001a\u001d\u0012\u0013\u0012\u00110\u001c¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(/\u0012\u0004\u0012\u00020\u00180.¢\u0006\u0004\b0\u00101\u001a\u0014\u00103\u001a\u000202*\u00020\u0000H\u0087\b¢\u0006\u0004\b3\u00104\u001a\u0014\u00106\u001a\u000205*\u00020\u0000H\u0087\b¢\u0006\u0004\b6\u00107\u001a!\u00109\u001a\b\u0012\u0004\u0012\u00020\u001c08*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b9\u0010:\u001aA\u0010>\u001a\u00028\u0000\"\u0004\b\u0000\u0010;*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0018\u0010=\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0<\u0012\u0004\u0012\u00028\u00000.H\u0086\bø\u0001\u0000¢\u0006\u0004\b>\u0010?\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006@"}, d2 = {"Ljava/io/File;", "Ljava/nio/charset/Charset;", "charset", "Ljava/io/InputStreamReader;", "A", "(Ljava/io/File;Ljava/nio/charset/Charset;)Ljava/io/InputStreamReader;", "", "bufferSize", "Ljava/io/BufferedReader;", "j", "(Ljava/io/File;Ljava/nio/charset/Charset;I)Ljava/io/BufferedReader;", "Ljava/io/OutputStreamWriter;", "H", "(Ljava/io/File;Ljava/nio/charset/Charset;)Ljava/io/OutputStreamWriter;", "Ljava/io/BufferedWriter;", "l", "(Ljava/io/File;Ljava/nio/charset/Charset;I)Ljava/io/BufferedWriter;", "Ljava/io/PrintWriter;", "t", "(Ljava/io/File;Ljava/nio/charset/Charset;)Ljava/io/PrintWriter;", "", "v", "(Ljava/io/File;)[B", "array", "Lkotlin/k2;", "E", "(Ljava/io/File;[B)V", "g", "", "y", "(Ljava/io/File;Ljava/nio/charset/Charset;)Ljava/lang/String;", "text", "F", "(Ljava/io/File;Ljava/lang/String;Ljava/nio/charset/Charset;)V", "h", "Lkotlin/Function2;", "Lkotlin/r0;", "name", "buffer", "bytesRead", "action", "o", "(Ljava/io/File;Lld/p;)V", "blockSize", "n", "(Ljava/io/File;ILld/p;)V", "Lkotlin/Function1;", "line", "p", "(Ljava/io/File;Ljava/nio/charset/Charset;Lld/l;)V", "Ljava/io/FileInputStream;", "r", "(Ljava/io/File;)Ljava/io/FileInputStream;", "Ljava/io/FileOutputStream;", "s", "(Ljava/io/File;)Ljava/io/FileOutputStream;", "", "w", "(Ljava/io/File;Ljava/nio/charset/Charset;)Ljava/util/List;", "T", "Lkotlin/sequences/m;", "block", "C", "(Ljava/io/File;Ljava/nio/charset/Charset;Lld/l;)Ljava/lang/Object;", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/io/FilesKt")
@r1({"SMAP\nFileReadWrite.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileReadWrite.kt\nkotlin/io/FilesKt__FileReadWriteKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,232:1\n1#2:233\n*E\n"})
/* loaded from: classes7.dex */
class l extends k {

    /* compiled from: FileReadWrite.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/k2;", "a", "(Ljava/lang/String;)V"}, k = 3, mv = {1, 9, 0})
    static final class a extends n0 implements ld.l<String, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ArrayList<String> f75177b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(ArrayList<String> arrayList) {
            super(1);
            this.f75177b = arrayList;
        }

        public final void a(@fg.l String str) {
            l0.p(str, ProtectedSandApp.s("搣\u0001"));
            this.f75177b.add(str);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(String str) {
            a(str);
            return k2.f75408a;
        }
    }

    @kotlin.internal.f
    private static final InputStreamReader A(File file, Charset charset) {
        l0.p(file, ProtectedSandApp.s("揾\u0001"));
        l0.p(charset, ProtectedSandApp.s("揿\u0001"));
        return new InputStreamReader(new FileInputStream(file), charset);
    }

    static /* synthetic */ InputStreamReader B(File file, Charset charset, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            charset = kotlin.text.f.UTF_8;
        }
        l0.p(file, ProtectedSandApp.s("揾\u0001"));
        l0.p(charset, ProtectedSandApp.s("揿\u0001"));
        return new InputStreamReader(new FileInputStream(file), charset);
    }

    public static final <T> T C(@fg.l File file, @fg.l Charset charset, @fg.l ld.l<? super kotlin.sequences.m<String>, ? extends T> lVar) {
        l0.p(file, ProtectedSandApp.s("揾\u0001"));
        l0.p(charset, ProtectedSandApp.s("揿\u0001"));
        l0.p(lVar, ProtectedSandApp.s("搀\u0001"));
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), charset), 8192);
        try {
            T invoke = lVar.invoke(t.h(bufferedReader));
            if (kotlin.internal.m.a(1, 1, 0)) {
                b.a(bufferedReader, null);
            } else {
                bufferedReader.close();
            }
            return invoke;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (kotlin.internal.m.a(1, 1, 0)) {
                    b.a(bufferedReader, th);
                } else {
                    try {
                        bufferedReader.close();
                    } catch (Throwable unused) {
                    }
                }
                throw th2;
            }
        }
    }

    public static Object D(File file, Charset charset, ld.l lVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            charset = kotlin.text.f.UTF_8;
        }
        l0.p(file, ProtectedSandApp.s("揾\u0001"));
        l0.p(charset, ProtectedSandApp.s("揿\u0001"));
        l0.p(lVar, ProtectedSandApp.s("搀\u0001"));
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), charset), 8192);
        try {
            Object invoke = lVar.invoke(t.h(bufferedReader));
            if (kotlin.internal.m.a(1, 1, 0)) {
                b.a(bufferedReader, null);
            } else {
                bufferedReader.close();
            }
            return invoke;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (kotlin.internal.m.a(1, 1, 0)) {
                    b.a(bufferedReader, th);
                } else {
                    try {
                        bufferedReader.close();
                    } catch (Throwable unused) {
                    }
                }
                throw th2;
            }
        }
    }

    public static final void E(@fg.l File file, @fg.l byte[] bArr) {
        l0.p(file, ProtectedSandApp.s("揾\u0001"));
        l0.p(bArr, ProtectedSandApp.s("搁\u0001"));
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            fileOutputStream.write(bArr);
            k2 k2Var = k2.f75408a;
            b.a(fileOutputStream, null);
        } finally {
        }
    }

    public static final void F(@fg.l File file, @fg.l String str, @fg.l Charset charset) {
        l0.p(file, ProtectedSandApp.s("揾\u0001"));
        l0.p(str, ProtectedSandApp.s("搂\u0001"));
        l0.p(charset, ProtectedSandApp.s("揿\u0001"));
        byte[] bytes = str.getBytes(charset);
        l0.o(bytes, ProtectedSandApp.s("搃\u0001"));
        E(file, bytes);
    }

    public static /* synthetic */ void G(File file, String str, Charset charset, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            charset = kotlin.text.f.UTF_8;
        }
        F(file, str, charset);
    }

    @kotlin.internal.f
    private static final OutputStreamWriter H(File file, Charset charset) {
        l0.p(file, ProtectedSandApp.s("揾\u0001"));
        l0.p(charset, ProtectedSandApp.s("揿\u0001"));
        return new OutputStreamWriter(new FileOutputStream(file), charset);
    }

    static /* synthetic */ OutputStreamWriter I(File file, Charset charset, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            charset = kotlin.text.f.UTF_8;
        }
        l0.p(file, ProtectedSandApp.s("揾\u0001"));
        l0.p(charset, ProtectedSandApp.s("揿\u0001"));
        return new OutputStreamWriter(new FileOutputStream(file), charset);
    }

    public static final void g(@fg.l File file, @fg.l byte[] bArr) {
        l0.p(file, ProtectedSandApp.s("揾\u0001"));
        l0.p(bArr, ProtectedSandApp.s("搁\u0001"));
        FileOutputStream fileOutputStream = new FileOutputStream(file, true);
        try {
            fileOutputStream.write(bArr);
            k2 k2Var = k2.f75408a;
            b.a(fileOutputStream, null);
        } finally {
        }
    }

    public static final void h(@fg.l File file, @fg.l String str, @fg.l Charset charset) {
        l0.p(file, ProtectedSandApp.s("揾\u0001"));
        l0.p(str, ProtectedSandApp.s("搂\u0001"));
        l0.p(charset, ProtectedSandApp.s("揿\u0001"));
        byte[] bytes = str.getBytes(charset);
        l0.o(bytes, ProtectedSandApp.s("搃\u0001"));
        g(file, bytes);
    }

    public static /* synthetic */ void i(File file, String str, Charset charset, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            charset = kotlin.text.f.UTF_8;
        }
        h(file, str, charset);
    }

    @kotlin.internal.f
    private static final BufferedReader j(File file, Charset charset, int i4) {
        l0.p(file, ProtectedSandApp.s("揾\u0001"));
        l0.p(charset, ProtectedSandApp.s("揿\u0001"));
        return new BufferedReader(new InputStreamReader(new FileInputStream(file), charset), i4);
    }

    static /* synthetic */ BufferedReader k(File file, Charset charset, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            charset = kotlin.text.f.UTF_8;
        }
        if ((i5 & 2) != 0) {
            i4 = 8192;
        }
        l0.p(file, ProtectedSandApp.s("揾\u0001"));
        l0.p(charset, ProtectedSandApp.s("揿\u0001"));
        return new BufferedReader(new InputStreamReader(new FileInputStream(file), charset), i4);
    }

    @kotlin.internal.f
    private static final BufferedWriter l(File file, Charset charset, int i4) {
        l0.p(file, ProtectedSandApp.s("揾\u0001"));
        l0.p(charset, ProtectedSandApp.s("揿\u0001"));
        return new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), charset), i4);
    }

    static /* synthetic */ BufferedWriter m(File file, Charset charset, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            charset = kotlin.text.f.UTF_8;
        }
        if ((i5 & 2) != 0) {
            i4 = 8192;
        }
        l0.p(file, ProtectedSandApp.s("揾\u0001"));
        l0.p(charset, ProtectedSandApp.s("揿\u0001"));
        return new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), charset), i4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [byte[], java.lang.Object] */
    public static final void n(@fg.l File file, int i4, @fg.l ld.p<? super byte[], ? super Integer, k2> pVar) {
        l0.p(file, ProtectedSandApp.s("揾\u0001"));
        l0.p(pVar, ProtectedSandApp.s("搄\u0001"));
        if (i4 < 512) {
            i4 = 512;
        }
        ?? r22 = new byte[i4];
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                int read = fileInputStream.read(r22);
                if (read <= 0) {
                    k2 k2Var = k2.f75408a;
                    b.a(fileInputStream, null);
                    return;
                }
                pVar.invoke(r22, Integer.valueOf(read));
            } finally {
            }
        }
    }

    public static final void o(@fg.l File file, @fg.l ld.p<? super byte[], ? super Integer, k2> pVar) {
        l0.p(file, ProtectedSandApp.s("揾\u0001"));
        l0.p(pVar, ProtectedSandApp.s("搄\u0001"));
        n(file, 4096, pVar);
    }

    public static final void p(@fg.l File file, @fg.l Charset charset, @fg.l ld.l<? super String, k2> lVar) {
        l0.p(file, ProtectedSandApp.s("揾\u0001"));
        l0.p(charset, ProtectedSandApp.s("揿\u0001"));
        l0.p(lVar, ProtectedSandApp.s("搄\u0001"));
        t.g(new BufferedReader(new InputStreamReader(new FileInputStream(file), charset)), lVar);
    }

    public static /* synthetic */ void q(File file, Charset charset, ld.l lVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            charset = kotlin.text.f.UTF_8;
        }
        p(file, charset, lVar);
    }

    @kotlin.internal.f
    private static final FileInputStream r(File file) {
        l0.p(file, ProtectedSandApp.s("揾\u0001"));
        return new FileInputStream(file);
    }

    @kotlin.internal.f
    private static final FileOutputStream s(File file) {
        l0.p(file, ProtectedSandApp.s("揾\u0001"));
        return new FileOutputStream(file);
    }

    @kotlin.internal.f
    private static final PrintWriter t(File file, Charset charset) {
        l0.p(file, ProtectedSandApp.s("揾\u0001"));
        l0.p(charset, ProtectedSandApp.s("揿\u0001"));
        return new PrintWriter(new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), charset), 8192));
    }

    static /* synthetic */ PrintWriter u(File file, Charset charset, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            charset = kotlin.text.f.UTF_8;
        }
        l0.p(file, ProtectedSandApp.s("揾\u0001"));
        l0.p(charset, ProtectedSandApp.s("揿\u0001"));
        return new PrintWriter(new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), charset), 8192));
    }

    @fg.l
    public static final byte[] v(@fg.l File file) {
        l0.p(file, ProtectedSandApp.s("揾\u0001"));
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            long length = file.length();
            String s4 = ProtectedSandApp.s("搅\u0001");
            if (length > 2147483647L) {
                throw new OutOfMemoryError(s4 + file + ProtectedSandApp.s("搈\u0001") + length + ProtectedSandApp.s("搉\u0001"));
            }
            int i4 = (int) length;
            byte[] bArr = new byte[i4];
            int i5 = i4;
            int i6 = 0;
            while (i5 > 0) {
                int read = fileInputStream.read(bArr, i6, i5);
                if (read < 0) {
                    break;
                }
                i5 -= read;
                i6 += read;
            }
            String s5 = ProtectedSandApp.s("搆\u0001");
            if (i5 > 0) {
                bArr = Arrays.copyOf(bArr, i6);
                l0.o(bArr, s5);
            } else {
                int read2 = fileInputStream.read();
                if (read2 != -1) {
                    f fVar = new f(8193);
                    fVar.write(read2);
                    kotlin.io.a.l(fileInputStream, fVar, 0, 2, null);
                    int size = fVar.size() + i4;
                    if (size < 0) {
                        throw new OutOfMemoryError(s4 + file + ProtectedSandApp.s("搇\u0001"));
                    }
                    byte[] a5 = fVar.a();
                    byte[] copyOf = Arrays.copyOf(bArr, size);
                    l0.o(copyOf, s5);
                    bArr = kotlin.collections.l.v0(a5, copyOf, i4, 0, fVar.size());
                }
            }
            b.a(fileInputStream, null);
            return bArr;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                b.a(fileInputStream, th);
                throw th2;
            }
        }
    }

    @fg.l
    public static final List<String> w(@fg.l File file, @fg.l Charset charset) {
        l0.p(file, ProtectedSandApp.s("揾\u0001"));
        l0.p(charset, ProtectedSandApp.s("揿\u0001"));
        ArrayList arrayList = new ArrayList();
        p(file, charset, new a(arrayList));
        return arrayList;
    }

    public static /* synthetic */ List x(File file, Charset charset, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            charset = kotlin.text.f.UTF_8;
        }
        return w(file, charset);
    }

    @fg.l
    public static final String y(@fg.l File file, @fg.l Charset charset) {
        l0.p(file, ProtectedSandApp.s("揾\u0001"));
        l0.p(charset, ProtectedSandApp.s("揿\u0001"));
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), charset);
        try {
            String k4 = t.k(inputStreamReader);
            b.a(inputStreamReader, null);
            return k4;
        } finally {
        }
    }

    public static /* synthetic */ String z(File file, Charset charset, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            charset = kotlin.text.f.UTF_8;
        }
        return y(file, charset);
    }
}
