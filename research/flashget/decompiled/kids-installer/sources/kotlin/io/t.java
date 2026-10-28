package kotlin.io;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.internal.InlineOnly;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.l0;
import kotlin.m2;
import kotlin.sequences.Sequence;
import kotlin.text.Charsets;

/* compiled from: ReadWrite.kt */
@p3.i(name = "TextStreamsKt")
@Metadata(d1 = {"\u0000X\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0017\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0087\b\u001a\u0017\u0010\u0000\u001a\u00020\u0005*\u00020\u00062\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0087\b\u001a\u001c\u0010\u0007\u001a\u00020\b*\u00020\u00022\u0006\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u001a\u001e\u0010\n\u001a\u00020\u000b*\u00020\u00022\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b0\r\u001a\u0010\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0010*\u00020\u0001\u001a\n\u0010\u0011\u001a\u00020\u0012*\u00020\u0013\u001a\u0010\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0015*\u00020\u0002\u001a\n\u0010\u0016\u001a\u00020\u000e*\u00020\u0002\u001a\u0017\u0010\u0016\u001a\u00020\u000e*\u00020\u00132\b\b\u0002\u0010\u0017\u001a\u00020\u0018H\u0087\b\u001a\r\u0010\u0019\u001a\u00020\u001a*\u00020\u000eH\u0087\b\u001a5\u0010\u001b\u001a\u0002H\u001c\"\u0004\b\u0000\u0010\u001c*\u00020\u00022\u0018\u0010\u001d\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u0010\u0012\u0004\u0012\u0002H\u001c0\rH\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\u001e\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001f"}, d2 = {"buffered", "Ljava/io/BufferedReader;", "Ljava/io/Reader;", "bufferSize", "", "Ljava/io/BufferedWriter;", "Ljava/io/Writer;", "copyTo", "", "out", "forEachLine", "", "action", "Lkotlin/Function1;", "", "lineSequence", "Lkotlin/sequences/Sequence;", "readBytes", "", "Ljava/net/URL;", "readLines", "", "readText", "charset", "Ljava/nio/charset/Charset;", "reader", "Ljava/io/StringReader;", "useLines", "T", "block", "(Ljava/io/Reader;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nReadWrite.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReadWrite.kt\nkotlin/io/TextStreamsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,151:1\n52#1:152\n1#2:153\n1#2:156\n1313#3,2:154\n*S KotlinDebug\n*F\n+ 1 ReadWrite.kt\nkotlin/io/TextStreamsKt\n*L\n33#1:152\n33#1:153\n33#1:154,2\n*E\n"})
/* loaded from: classes5.dex */
public final class t {

    /* compiled from: ReadWrite.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    static final class a extends Lambda implements q3.l<String, m2> {

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ ArrayList<String> f23503p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(ArrayList<String> arrayList) {
            super(1);
            this.f23503p = arrayList;
        }

        @Override // q3.l
        public /* bridge */ /* synthetic */ m2 N(String str) {
            a(str);
            return m2.f23662a;
        }

        public final void a(@d5.d String str) {
            l0.p(str, ProtectedSandApp.s("绢"));
            this.f23503p.add(str);
        }
    }

    @InlineOnly
    private static final BufferedReader a(Reader reader, int i5) {
        l0.p(reader, ProtectedSandApp.s("䃹"));
        return reader instanceof BufferedReader ? (BufferedReader) reader : new BufferedReader(reader, i5);
    }

    @InlineOnly
    private static final BufferedWriter b(Writer writer, int i5) {
        l0.p(writer, ProtectedSandApp.s("䃺"));
        return writer instanceof BufferedWriter ? (BufferedWriter) writer : new BufferedWriter(writer, i5);
    }

    static /* synthetic */ BufferedReader c(Reader reader, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i5 = 8192;
        }
        l0.p(reader, ProtectedSandApp.s("䃻"));
        return reader instanceof BufferedReader ? (BufferedReader) reader : new BufferedReader(reader, i5);
    }

    static /* synthetic */ BufferedWriter d(Writer writer, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i5 = 8192;
        }
        l0.p(writer, ProtectedSandApp.s("䃼"));
        return writer instanceof BufferedWriter ? (BufferedWriter) writer : new BufferedWriter(writer, i5);
    }

    public static final long e(@d5.d Reader reader, @d5.d Writer writer, int i5) {
        l0.p(reader, ProtectedSandApp.s("䃽"));
        l0.p(writer, ProtectedSandApp.s("䃾"));
        char[] cArr = new char[i5];
        int read = reader.read(cArr);
        long j5 = 0;
        while (read >= 0) {
            writer.write(cArr, 0, read);
            j5 += read;
            read = reader.read(cArr);
        }
        return j5;
    }

    public static /* synthetic */ long f(Reader reader, Writer writer, int i5, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            i5 = 8192;
        }
        return e(reader, writer, i5);
    }

    public static final void g(@d5.d Reader reader, @d5.d q3.l<? super String, m2> lVar) {
        l0.p(reader, ProtectedSandApp.s("䃿"));
        l0.p(lVar, ProtectedSandApp.s("䄀"));
        BufferedReader bufferedReader = reader instanceof BufferedReader ? (BufferedReader) reader : new BufferedReader(reader, 8192);
        try {
            Iterator<String> it = h(bufferedReader).iterator();
            while (it.hasNext()) {
                lVar.N(it.next());
            }
            m2 m2Var = m2.f23662a;
            b.a(bufferedReader, null);
        } finally {
        }
    }

    @d5.d
    public static final Sequence<String> h(@d5.d BufferedReader bufferedReader) {
        Sequence<String> f6;
        l0.p(bufferedReader, ProtectedSandApp.s("䄁"));
        f6 = kotlin.sequences.s.f(new LinesSequence(bufferedReader));
        return f6;
    }

    @d5.d
    public static final byte[] i(@d5.d URL url) {
        l0.p(url, ProtectedSandApp.s("䄂"));
        InputStream openStream = url.openStream();
        try {
            l0.m(openStream);
            byte[] p5 = kotlin.io.a.p(openStream);
            b.a(openStream, null);
            return p5;
        } finally {
        }
    }

    @d5.d
    public static final List<String> j(@d5.d Reader reader) {
        l0.p(reader, ProtectedSandApp.s("䄃"));
        ArrayList arrayList = new ArrayList();
        g(reader, new a(arrayList));
        return arrayList;
    }

    @d5.d
    public static final String k(@d5.d Reader reader) {
        l0.p(reader, ProtectedSandApp.s("䄄"));
        StringWriter stringWriter = new StringWriter();
        f(reader, stringWriter, 0, 2, null);
        String stringWriter2 = stringWriter.toString();
        l0.o(stringWriter2, ProtectedSandApp.s("䄅"));
        return stringWriter2;
    }

    @InlineOnly
    private static final String l(URL url, Charset charset) {
        l0.p(url, ProtectedSandApp.s("䄆"));
        l0.p(charset, ProtectedSandApp.s("䄇"));
        return new String(i(url), charset);
    }

    static /* synthetic */ String m(URL url, Charset charset, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            charset = Charsets.f27049b;
        }
        l0.p(url, ProtectedSandApp.s("䄈"));
        l0.p(charset, ProtectedSandApp.s("䄉"));
        return new String(i(url), charset);
    }

    @InlineOnly
    private static final StringReader n(String str) {
        l0.p(str, ProtectedSandApp.s("䄊"));
        return new StringReader(str);
    }

    public static final <T> T o(@d5.d Reader reader, @d5.d q3.l<? super Sequence<String>, ? extends T> lVar) {
        l0.p(reader, ProtectedSandApp.s("䄋"));
        l0.p(lVar, ProtectedSandApp.s("䄌"));
        BufferedReader bufferedReader = reader instanceof BufferedReader ? (BufferedReader) reader : new BufferedReader(reader, 8192);
        try {
            T N = lVar.N(h(bufferedReader));
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
}
