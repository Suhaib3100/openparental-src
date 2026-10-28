package org.apache.commons.io;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.StringReader;
import java.io.Writer;

/* compiled from: CopyUtils.java */
@Deprecated
/* loaded from: classes5.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private static final int f31820a = 4096;

    public static int a(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[4096];
        int i5 = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (-1 == read) {
                return i5;
            }
            outputStream.write(bArr, 0, read);
            i5 += read;
        }
    }

    public static int b(Reader reader, Writer writer) throws IOException {
        char[] cArr = new char[4096];
        int i5 = 0;
        while (true) {
            int read = reader.read(cArr);
            if (-1 == read) {
                return i5;
            }
            writer.write(cArr, 0, read);
            i5 += read;
        }
    }

    public static void c(InputStream inputStream, Writer writer) throws IOException {
        b(new InputStreamReader(inputStream), writer);
    }

    public static void d(InputStream inputStream, Writer writer, String str) throws IOException {
        b(new InputStreamReader(inputStream, str), writer);
    }

    public static void e(Reader reader, OutputStream outputStream) throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);
        b(reader, outputStreamWriter);
        outputStreamWriter.flush();
    }

    public static void f(String str, OutputStream outputStream) throws IOException {
        StringReader stringReader = new StringReader(str);
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);
        b(stringReader, outputStreamWriter);
        outputStreamWriter.flush();
    }

    public static void g(String str, Writer writer) throws IOException {
        writer.write(str);
    }

    public static void h(byte[] bArr, OutputStream outputStream) throws IOException {
        outputStream.write(bArr);
    }

    public static void i(byte[] bArr, Writer writer) throws IOException {
        c(new ByteArrayInputStream(bArr), writer);
    }

    public static void j(byte[] bArr, Writer writer, String str) throws IOException {
        d(new ByteArrayInputStream(bArr), writer, str);
    }
}
