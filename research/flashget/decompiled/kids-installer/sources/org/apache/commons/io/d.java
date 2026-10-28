package org.apache.commons.io;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.UByte;

/* compiled from: EndianUtils.java */
/* loaded from: classes5.dex */
public class d {
    public static void A(OutputStream outputStream, long j5) throws IOException {
        outputStream.write((byte) ((j5 >> 0) & 255));
        outputStream.write((byte) ((j5 >> 8) & 255));
        outputStream.write((byte) ((j5 >> 16) & 255));
        outputStream.write((byte) ((j5 >> 24) & 255));
        outputStream.write((byte) ((j5 >> 32) & 255));
        outputStream.write((byte) ((j5 >> 40) & 255));
        outputStream.write((byte) ((j5 >> 48) & 255));
        outputStream.write((byte) ((j5 >> 56) & 255));
    }

    public static void B(byte[] bArr, int i5, long j5) {
        bArr[i5 + 0] = (byte) ((j5 >> 0) & 255);
        bArr[i5 + 1] = (byte) ((j5 >> 8) & 255);
        bArr[i5 + 2] = (byte) ((j5 >> 16) & 255);
        bArr[i5 + 3] = (byte) ((j5 >> 24) & 255);
        bArr[i5 + 4] = (byte) ((j5 >> 32) & 255);
        bArr[i5 + 5] = (byte) ((j5 >> 40) & 255);
        bArr[i5 + 6] = (byte) ((j5 >> 48) & 255);
        bArr[i5 + 7] = (byte) ((j5 >> 56) & 255);
    }

    public static void C(OutputStream outputStream, short s5) throws IOException {
        outputStream.write((byte) ((s5 >> 0) & 255));
        outputStream.write((byte) ((s5 >> 8) & 255));
    }

    public static void D(byte[] bArr, int i5, short s5) {
        bArr[i5 + 0] = (byte) ((s5 >> 0) & 255);
        bArr[i5 + 1] = (byte) ((s5 >> 8) & 255);
    }

    private static int a(InputStream inputStream) throws IOException {
        int read = inputStream.read();
        if (-1 != read) {
            return read;
        }
        throw new EOFException("Unexpected EOF reached");
    }

    public static double b(InputStream inputStream) throws IOException {
        return Double.longBitsToDouble(h(inputStream));
    }

    public static double c(byte[] bArr, int i5) {
        return Double.longBitsToDouble(i(bArr, i5));
    }

    public static float d(InputStream inputStream) throws IOException {
        return Float.intBitsToFloat(f(inputStream));
    }

    public static float e(byte[] bArr, int i5) {
        return Float.intBitsToFloat(g(bArr, i5));
    }

    public static int f(InputStream inputStream) throws IOException {
        return ((a(inputStream) & 255) << 0) + ((a(inputStream) & 255) << 8) + ((a(inputStream) & 255) << 16) + ((a(inputStream) & 255) << 24);
    }

    public static int g(byte[] bArr, int i5) {
        return ((bArr[i5 + 0] & UByte.f27220r) << 0) + ((bArr[i5 + 1] & UByte.f27220r) << 8) + ((bArr[i5 + 2] & UByte.f27220r) << 16) + ((bArr[i5 + 3] & UByte.f27220r) << 24);
    }

    public static long h(InputStream inputStream) throws IOException {
        byte[] bArr = new byte[8];
        for (int i5 = 0; i5 < 8; i5++) {
            bArr[i5] = (byte) a(inputStream);
        }
        return i(bArr, 0);
    }

    public static long i(byte[] bArr, int i5) {
        return ((((((bArr[i5 + 4] & UByte.f27220r) << 0) + ((bArr[i5 + 5] & UByte.f27220r) << 8)) + ((bArr[i5 + 6] & UByte.f27220r) << 16)) + ((bArr[i5 + 7] & UByte.f27220r) << 24)) << 32) + ((((bArr[i5 + 0] & UByte.f27220r) << 0) + ((bArr[i5 + 1] & UByte.f27220r) << 8) + ((bArr[i5 + 2] & UByte.f27220r) << 16) + ((bArr[i5 + 3] & UByte.f27220r) << 24)) & 4294967295L);
    }

    public static short j(InputStream inputStream) throws IOException {
        return (short) (((a(inputStream) & 255) << 0) + ((a(inputStream) & 255) << 8));
    }

    public static short k(byte[] bArr, int i5) {
        return (short) (((bArr[i5 + 0] & UByte.f27220r) << 0) + ((bArr[i5 + 1] & UByte.f27220r) << 8));
    }

    public static long l(InputStream inputStream) throws IOException {
        return ((a(inputStream) & 255) << 24) + ((((a(inputStream) & 255) << 0) + ((a(inputStream) & 255) << 8) + ((a(inputStream) & 255) << 16)) & 4294967295L);
    }

    public static long m(byte[] bArr, int i5) {
        return ((bArr[i5 + 3] & UByte.f27220r) << 24) + ((((bArr[i5 + 0] & UByte.f27220r) << 0) + ((bArr[i5 + 1] & UByte.f27220r) << 8) + ((bArr[i5 + 2] & UByte.f27220r) << 16)) & 4294967295L);
    }

    public static int n(InputStream inputStream) throws IOException {
        return ((a(inputStream) & 255) << 0) + ((a(inputStream) & 255) << 8);
    }

    public static int o(byte[] bArr, int i5) {
        return ((bArr[i5 + 0] & UByte.f27220r) << 0) + ((bArr[i5 + 1] & UByte.f27220r) << 8);
    }

    public static double p(double d6) {
        return Double.longBitsToDouble(s(Double.doubleToLongBits(d6)));
    }

    public static float q(float f6) {
        return Float.intBitsToFloat(r(Float.floatToIntBits(f6)));
    }

    public static int r(int i5) {
        return (((i5 >> 0) & 255) << 24) + (((i5 >> 8) & 255) << 16) + (((i5 >> 16) & 255) << 8) + (((i5 >> 24) & 255) << 0);
    }

    public static long s(long j5) {
        return (((j5 >> 0) & 255) << 56) + (((j5 >> 8) & 255) << 48) + (((j5 >> 16) & 255) << 40) + (((j5 >> 24) & 255) << 32) + (((j5 >> 32) & 255) << 24) + (((j5 >> 40) & 255) << 16) + (((j5 >> 48) & 255) << 8) + (((j5 >> 56) & 255) << 0);
    }

    public static short t(short s5) {
        return (short) ((((s5 >> 0) & 255) << 8) + (((s5 >> 8) & 255) << 0));
    }

    public static void u(OutputStream outputStream, double d6) throws IOException {
        A(outputStream, Double.doubleToLongBits(d6));
    }

    public static void v(byte[] bArr, int i5, double d6) {
        B(bArr, i5, Double.doubleToLongBits(d6));
    }

    public static void w(OutputStream outputStream, float f6) throws IOException {
        y(outputStream, Float.floatToIntBits(f6));
    }

    public static void x(byte[] bArr, int i5, float f6) {
        z(bArr, i5, Float.floatToIntBits(f6));
    }

    public static void y(OutputStream outputStream, int i5) throws IOException {
        outputStream.write((byte) ((i5 >> 0) & 255));
        outputStream.write((byte) ((i5 >> 8) & 255));
        outputStream.write((byte) ((i5 >> 16) & 255));
        outputStream.write((byte) ((i5 >> 24) & 255));
    }

    public static void z(byte[] bArr, int i5, int i6) {
        bArr[i5 + 0] = (byte) ((i6 >> 0) & 255);
        bArr[i5 + 1] = (byte) ((i6 >> 8) & 255);
        bArr[i5 + 2] = (byte) ((i6 >> 16) & 255);
        bArr[i5 + 3] = (byte) ((i6 >> 24) & 255);
    }
}
