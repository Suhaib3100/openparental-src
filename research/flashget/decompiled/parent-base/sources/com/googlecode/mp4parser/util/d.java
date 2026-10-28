package com.googlecode.mp4parser.util;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;

/* compiled from: ChannelHelper.java */
/* loaded from: classes6.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private static ByteBuffer f64084a = ByteBuffer.allocate(0).asReadOnlyBuffer();

    public static int a(ReadableByteChannel readableByteChannel, ByteBuffer byteBuffer, int i4) throws IOException {
        int read;
        int i5 = 0;
        do {
            read = readableByteChannel.read(byteBuffer);
            if (-1 == read) {
                break;
            }
            i5 += read;
        } while (i5 != i4);
        if (read != -1) {
            return i5;
        }
        throw new EOFException(ProtectedSandApp.s("ᑈ\u0001"));
    }

    public static void b(ReadableByteChannel readableByteChannel, ByteBuffer byteBuffer) throws IOException {
        a(readableByteChannel, byteBuffer, byteBuffer.remaining());
    }
}
