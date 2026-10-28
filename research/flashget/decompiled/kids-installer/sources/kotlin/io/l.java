package kotlin.io;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.internal.InlineOnly;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.l0;
import kotlin.m2;
import kotlin.sequences.Sequence;
import kotlin.text.Charsets;

/* compiled from: FileReadWrite.kt */
@Metadata(d1 = {"\u0000z\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u001c\u0010\u0005\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t\u001a!\u0010\n\u001a\u00020\u000b*\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\rH\u0087\b\u001a!\u0010\u000e\u001a\u00020\u000f*\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\rH\u0087\b\u001aB\u0010\u0010\u001a\u00020\u0001*\u00020\u000226\u0010\u0011\u001a2\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u00010\u0012\u001aJ\u0010\u0010\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0017\u001a\u00020\r26\u0010\u0011\u001a2\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u00010\u0012\u001a7\u0010\u0018\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\t2!\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\u00010\u0019\u001a\r\u0010\u001b\u001a\u00020\u001c*\u00020\u0002H\u0087\b\u001a\r\u0010\u001d\u001a\u00020\u001e*\u00020\u0002H\u0087\b\u001a\u0017\u0010\u001f\u001a\u00020 *\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\tH\u0087\b\u001a\n\u0010!\u001a\u00020\u0004*\u00020\u0002\u001a\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00070#*\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\t\u001a\u0014\u0010$\u001a\u00020\u0007*\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\t\u001a\u0017\u0010%\u001a\u00020&*\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\tH\u0087\b\u001a?\u0010'\u001a\u0002H(\"\u0004\b\u0000\u0010(*\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\t2\u0018\u0010)\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070*\u0012\u0004\u0012\u0002H(0\u0019H\u0086\bø\u0001\u0000¢\u0006\u0002\u0010+\u001a\u0012\u0010,\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u001c\u0010-\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t\u001a\u0017\u0010.\u001a\u00020/*\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\tH\u0087\b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u00060"}, d2 = {"appendBytes", "", "Ljava/io/File;", "array", "", "appendText", "text", "", "charset", "Ljava/nio/charset/Charset;", "bufferedReader", "Ljava/io/BufferedReader;", "bufferSize", "", "bufferedWriter", "Ljava/io/BufferedWriter;", "forEachBlock", "action", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "buffer", "bytesRead", "blockSize", "forEachLine", "Lkotlin/Function1;", "line", "inputStream", "Ljava/io/FileInputStream;", "outputStream", "Ljava/io/FileOutputStream;", "printWriter", "Ljava/io/PrintWriter;", "readBytes", "readLines", "", "readText", "reader", "Ljava/io/InputStreamReader;", "useLines", "T", "block", "Lkotlin/sequences/Sequence;", "(Ljava/io/File;Ljava/nio/charset/Charset;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "writeBytes", "writeText", "writer", "Ljava/io/OutputStreamWriter;", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/io/FilesKt")
@SourceDebugExtension({"SMAP\nFileReadWrite.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileReadWrite.kt\nkotlin/io/FilesKt__FileReadWriteKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,232:1\n1#2:233\n*E\n"})
/* loaded from: classes5.dex */
class l extends k {

    /* compiled from: FileReadWrite.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    static final class a extends Lambda implements q3.l<String, m2> {

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ ArrayList<String> f23418p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(ArrayList<String> arrayList) {
            super(1);
            this.f23418p = arrayList;
        }

        @Override // q3.l
        public /* bridge */ /* synthetic */ m2 N(String str) {
            a(str);
            return m2.f23662a;
        }

        public final void a(@d5.d String str) {
            l0.p(str, ProtectedSandApp.s("縓"));
            this.f23418p.add(str);
        }
    }

    @InlineOnly
    private static final InputStreamReader A(File file, Charset charset) {
        l0.p(file, ProtectedSandApp.s("䀅"));
        l0.p(charset, ProtectedSandApp.s("䀆"));
        return new InputStreamReader(new FileInputStream(file), charset);
    }

    static /* synthetic */ InputStreamReader B(File file, Charset charset, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            charset = Charsets.f27049b;
        }
        l0.p(file, ProtectedSandApp.s("䀇"));
        l0.p(charset, ProtectedSandApp.s("䀈"));
        return new InputStreamReader(new FileInputStream(file), charset);
    }

    public static final <T> T C(@d5.d File file, @d5.d Charset charset, @d5.d q3.l<? super Sequence<String>, ? extends T> lVar) {
        l0.p(file, ProtectedSandApp.s("䀉"));
        l0.p(charset, ProtectedSandApp.s("䀊"));
        l0.p(lVar, ProtectedSandApp.s("䀋"));
        Reader inputStreamReader = new InputStreamReader(new FileInputStream(file), charset);
        BufferedReader bufferedReader = inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192);
        try {
            T N = lVar.N(t.h(bufferedReader));
            if (kotlin.internal.m.a(1, 1, 0)) {
                b.a(bufferedReader, null);
            } else {
                bufferedReader.close();
            }
            return N;
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

    public static Object D(File file, Charset charset, q3.l lVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            charset = Charsets.f27049b;
        }
        l0.p(file, ProtectedSandApp.s("䀌"));
        l0.p(charset, ProtectedSandApp.s("䀍"));
        l0.p(lVar, ProtectedSandApp.s("䀎"));
        Reader inputStreamReader = new InputStreamReader(new FileInputStream(file), charset);
        BufferedReader bufferedReader = inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192);
        try {
            Object N = lVar.N(t.h(bufferedReader));
            if (kotlin.internal.m.a(1, 1, 0)) {
                b.a(bufferedReader, null);
            } else {
                bufferedReader.close();
            }
            return N;
        } finally {
        }
    }

    public static final void E(@d5.d File file, @d5.d byte[] bArr) {
        l0.p(file, ProtectedSandApp.s("䀏"));
        l0.p(bArr, ProtectedSandApp.s("䀐"));
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            fileOutputStream.write(bArr);
            m2 m2Var = m2.f23662a;
            b.a(fileOutputStream, null);
        } finally {
        }
    }

    public static final void F(@d5.d File file, @d5.d String str, @d5.d Charset charset) {
        l0.p(file, ProtectedSandApp.s("䀑"));
        l0.p(str, ProtectedSandApp.s("䀒"));
        l0.p(charset, ProtectedSandApp.s("䀓"));
        byte[] bytes = str.getBytes(charset);
        l0.o(bytes, ProtectedSandApp.s("䀔"));
        E(file, bytes);
    }

    public static /* synthetic */ void G(File file, String str, Charset charset, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            charset = Charsets.f27049b;
        }
        F(file, str, charset);
    }

    @InlineOnly
    private static final OutputStreamWriter H(File file, Charset charset) {
        l0.p(file, ProtectedSandApp.s("䀕"));
        l0.p(charset, ProtectedSandApp.s("䀖"));
        return new OutputStreamWriter(new FileOutputStream(file), charset);
    }

    static /* synthetic */ OutputStreamWriter I(File file, Charset charset, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            charset = Charsets.f27049b;
        }
        l0.p(file, ProtectedSandApp.s("䀗"));
        l0.p(charset, ProtectedSandApp.s("䀘"));
        return new OutputStreamWriter(new FileOutputStream(file), charset);
    }

    public static final void g(@d5.d File file, @d5.d byte[] bArr) {
        l0.p(file, ProtectedSandApp.s("䀙"));
        l0.p(bArr, ProtectedSandApp.s("䀚"));
        FileOutputStream fileOutputStream = new FileOutputStream(file, true);
        try {
            fileOutputStream.write(bArr);
            m2 m2Var = m2.f23662a;
            b.a(fileOutputStream, null);
        } finally {
        }
    }

    public static final void h(@d5.d File file, @d5.d String str, @d5.d Charset charset) {
        l0.p(file, ProtectedSandApp.s("䀛"));
        l0.p(str, ProtectedSandApp.s("䀜"));
        l0.p(charset, ProtectedSandApp.s("䀝"));
        byte[] bytes = str.getBytes(charset);
        l0.o(bytes, ProtectedSandApp.s("䀞"));
        g(file, bytes);
    }

    public static /* synthetic */ void i(File file, String str, Charset charset, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            charset = Charsets.f27049b;
        }
        h(file, str, charset);
    }

    @InlineOnly
    private static final BufferedReader j(File file, Charset charset, int i5) {
        l0.p(file, ProtectedSandApp.s("䀟"));
        l0.p(charset, ProtectedSandApp.s("䀠"));
        Reader inputStreamReader = new InputStreamReader(new FileInputStream(file), charset);
        return inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, i5);
    }

    static /* synthetic */ BufferedReader k(File file, Charset charset, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            charset = Charsets.f27049b;
        }
        if ((i6 & 2) != 0) {
            i5 = 8192;
        }
        l0.p(file, ProtectedSandApp.s("䀡"));
        l0.p(charset, ProtectedSandApp.s("䀢"));
        Reader inputStreamReader = new InputStreamReader(new FileInputStream(file), charset);
        return inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, i5);
    }

    @InlineOnly
    private static final BufferedWriter l(File file, Charset charset, int i5) {
        l0.p(file, ProtectedSandApp.s("䀣"));
        l0.p(charset, ProtectedSandApp.s("䀤"));
        Writer outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), charset);
        return outputStreamWriter instanceof BufferedWriter ? (BufferedWriter) outputStreamWriter : new BufferedWriter(outputStreamWriter, i5);
    }

    static /* synthetic */ BufferedWriter m(File file, Charset charset, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            charset = Charsets.f27049b;
        }
        if ((i6 & 2) != 0) {
            i5 = 8192;
        }
        l0.p(file, ProtectedSandApp.s("䀥"));
        l0.p(charset, ProtectedSandApp.s("䀦"));
        Writer outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), charset);
        return outputStreamWriter instanceof BufferedWriter ? (BufferedWriter) outputStreamWriter : new BufferedWriter(outputStreamWriter, i5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [byte[], java.lang.Object] */
    public static final void n(@d5.d File file, int i5, @d5.d q3.p<? super byte[], ? super Integer, m2> pVar) {
        l0.p(file, ProtectedSandApp.s("䀧"));
        l0.p(pVar, ProtectedSandApp.s("䀨"));
        if (i5 < 512) {
            i5 = 512;
        }
        ?? r22 = new byte[i5];
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                int read = fileInputStream.read(r22);
                if (read <= 0) {
                    m2 m2Var = m2.f23662a;
                    b.a(fileInputStream, null);
                    return;
                }
                pVar.g0(r22, Integer.valueOf(read));
            } finally {
            }
        }
    }

    public static final void o(@d5.d File file, @d5.d q3.p<? super byte[], ? super Integer, m2> pVar) {
        l0.p(file, ProtectedSandApp.s("䀩"));
        l0.p(pVar, ProtectedSandApp.s("䀪"));
        n(file, 4096, pVar);
    }

    public static final void p(@d5.d File file, @d5.d Charset charset, @d5.d q3.l<? super String, m2> lVar) {
        l0.p(file, ProtectedSandApp.s("䀫"));
        l0.p(charset, ProtectedSandApp.s("䀬"));
        l0.p(lVar, ProtectedSandApp.s("䀭"));
        t.g(new BufferedReader(new InputStreamReader(new FileInputStream(file), charset)), lVar);
    }

    public static /* synthetic */ void q(File file, Charset charset, q3.l lVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            charset = Charsets.f27049b;
        }
        p(file, charset, lVar);
    }

    @InlineOnly
    private static final FileInputStream r(File file) {
        l0.p(file, ProtectedSandApp.s("䀮"));
        return new FileInputStream(file);
    }

    @InlineOnly
    private static final FileOutputStream s(File file) {
        l0.p(file, ProtectedSandApp.s("䀯"));
        return new FileOutputStream(file);
    }

    @InlineOnly
    private static final PrintWriter t(File file, Charset charset) {
        l0.p(file, ProtectedSandApp.s("䀰"));
        l0.p(charset, ProtectedSandApp.s("䀱"));
        Writer outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), charset);
        return new PrintWriter(outputStreamWriter instanceof BufferedWriter ? (BufferedWriter) outputStreamWriter : new BufferedWriter(outputStreamWriter, 8192));
    }

    static /* synthetic */ PrintWriter u(File file, Charset charset, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            charset = Charsets.f27049b;
        }
        l0.p(file, ProtectedSandApp.s("䀲"));
        l0.p(charset, ProtectedSandApp.s("䀳"));
        Writer outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), charset);
        return new PrintWriter(outputStreamWriter instanceof BufferedWriter ? (BufferedWriter) outputStreamWriter : new BufferedWriter(outputStreamWriter, 8192));
    }

    @d5.d
    public static final byte[] v(@d5.d File file) {
        l0.p(file, ProtectedSandApp.s("䀴"));
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            long length = file.length();
            String s5 = ProtectedSandApp.s("䀵");
            if (length > 2147483647L) {
                throw new OutOfMemoryError(s5 + file + ProtectedSandApp.s("䀸") + length + ProtectedSandApp.s("䀹"));
            }
            int i5 = (int) length;
            byte[] bArr = new byte[i5];
            int i6 = i5;
            int i7 = 0;
            while (i6 > 0) {
                int read = fileInputStream.read(bArr, i7, i6);
                if (read < 0) {
                    break;
                }
                i6 -= read;
                i7 += read;
            }
            String s6 = ProtectedSandApp.s("䀶");
            if (i6 > 0) {
                bArr = Arrays.copyOf(bArr, i7);
                l0.o(bArr, s6);
            } else {
                int read2 = fileInputStream.read();
                if (read2 != -1) {
                    ExposingBufferByteArrayOutputStream exposingBufferByteArrayOutputStream = new ExposingBufferByteArrayOutputStream(8193);
                    exposingBufferByteArrayOutputStream.write(read2);
                    kotlin.io.a.l(fileInputStream, exposingBufferByteArrayOutputStream, 0, 2, null);
                    int size = exposingBufferByteArrayOutputStream.size() + i5;
                    if (size < 0) {
                        throw new OutOfMemoryError(s5 + file + ProtectedSandApp.s("䀷"));
                    }
                    byte[] a6 = exposingBufferByteArrayOutputStream.a();
                    byte[] copyOf = Arrays.copyOf(bArr, size);
                    l0.o(copyOf, s6);
                    bArr = kotlin.collections.p.v0(a6, copyOf, i5, 0, exposingBufferByteArrayOutputStream.size());
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

    @d5.d
    public static final List<String> w(@d5.d File file, @d5.d Charset charset) {
        l0.p(file, ProtectedSandApp.s("䀺"));
        l0.p(charset, ProtectedSandApp.s("䀻"));
        ArrayList arrayList = new ArrayList();
        p(file, charset, new a(arrayList));
        return arrayList;
    }

    public static /* synthetic */ List x(File file, Charset charset, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            charset = Charsets.f27049b;
        }
        return w(file, charset);
    }

    @d5.d
    public static final String y(@d5.d File file, @d5.d Charset charset) {
        l0.p(file, ProtectedSandApp.s("䀼"));
        l0.p(charset, ProtectedSandApp.s("䀽"));
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), charset);
        try {
            String k5 = t.k(inputStreamReader);
            b.a(inputStreamReader, null);
            return k5;
        } finally {
        }
    }

    public static /* synthetic */ String z(File file, Charset charset, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            charset = Charsets.f27049b;
        }
        return y(file, charset);
    }
}
