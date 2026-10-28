package org.apache.commons.io;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: EndianUtils.java */
/* loaded from: classes4.dex */
public class d {
    public static void A(OutputStream outputStream, long j4) throws IOException {
        outputStream.write((byte) (j4 & 255));
        outputStream.write((byte) ((j4 >> 8) & 255));
        outputStream.write((byte) ((j4 >> 16) & 255));
        outputStream.write((byte) ((j4 >> 24) & 255));
        outputStream.write((byte) ((j4 >> 32) & 255));
        outputStream.write((byte) ((j4 >> 40) & 255));
        outputStream.write((byte) ((j4 >> 48) & 255));
        outputStream.write((byte) ((j4 >> 56) & 255));
    }

    public static void B(byte[] bArr, int i4, long j4) {
        bArr[i4] = (byte) (j4 & 255);
        bArr[i4 + 1] = (byte) ((j4 >> 8) & 255);
        bArr[i4 + 2] = (byte) ((j4 >> 16) & 255);
        bArr[i4 + 3] = (byte) ((j4 >> 24) & 255);
        bArr[i4 + 4] = (byte) ((j4 >> 32) & 255);
        bArr[i4 + 5] = (byte) ((j4 >> 40) & 255);
        bArr[i4 + 6] = (byte) ((j4 >> 48) & 255);
        bArr[i4 + 7] = (byte) ((j4 >> 56) & 255);
    }

    public static void C(OutputStream outputStream, short s4) throws IOException {
        outputStream.write((byte) (s4 & 255));
        outputStream.write((byte) ((s4 >> 8) & 255));
    }

    public static void D(byte[] bArr, int i4, short s4) {
        bArr[i4] = (byte) (s4 & 255);
        bArr[i4 + 1] = (byte) ((s4 >> 8) & 255);
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

    public static double c(byte[] bArr, int i4) {
        return Double.longBitsToDouble(i(bArr, i4));
    }

    public static float d(InputStream inputStream) throws IOException {
        return Float.intBitsToFloat(f(inputStream));
    }

    public static float e(byte[] bArr, int i4) {
        return Float.intBitsToFloat(g(bArr, i4));
    }

    public static int f(InputStream inputStream) throws IOException {
        return (a(inputStream) & 255) + ((a(inputStream) & 255) << 8) + ((a(inputStream) & 255) << 16) + ((a(inputStream) & 255) << 24);
    }

    public static int g(byte[] bArr, int i4) {
        return (bArr[i4] & 255) + ((bArr[i4 + 1] & 255) << 8) + ((bArr[i4 + 2] & 255) << 16) + ((bArr[i4 + 3] & 255) << 24);
    }

    public static long h(InputStream inputStream) throws IOException {
        byte[] bArr = new byte[8];
        for (int i4 = 0; i4 < 8; i4++) {
            bArr[i4] = (byte) a(inputStream);
        }
        return i(bArr, 0);
    }

    public static long i(byte[] bArr, int i4) {
        return (((((bArr[i4 + 4] & 255) + ((bArr[i4 + 5] & 255) << 8)) + ((bArr[i4 + 6] & 255) << 16)) + ((bArr[i4 + 7] & 255) << 24)) << 32) + (((bArr[i4] & 255) + ((bArr[i4 + 1] & 255) << 8) + ((bArr[i4 + 2] & 255) << 16) + ((bArr[i4 + 3] & 255) << 24)) & 4294967295L);
    }

    public static short j(InputStream inputStream) throws IOException {
        return (short) ((a(inputStream) & 255) + ((a(inputStream) & 255) << 8));
    }

    public static short k(byte[] bArr, int i4) {
        return (short) ((bArr[i4] & 255) + ((bArr[i4 + 1] & 255) << 8));
    }

    public static long l(InputStream inputStream) throws IOException {
        return ((a(inputStream) & 255) << 24) + (((a(inputStream) & 255) + ((a(inputStream) & 255) << 8) + ((a(inputStream) & 255) << 16)) & 4294967295L);
    }

    public static long m(byte[] bArr, int i4) {
        return ((bArr[i4 + 3] & 255) << 24) + (((bArr[i4] & 255) + ((bArr[i4 + 1] & 255) << 8) + ((bArr[i4 + 2] & 255) << 16)) & 4294967295L);
    }

    public static int n(InputStream inputStream) throws IOException {
        return (a(inputStream) & 255) + ((a(inputStream) & 255) << 8);
    }

    public static int o(byte[] bArr, int i4) {
        return (bArr[i4] & 255) + ((bArr[i4 + 1] & 255) << 8);
    }

    public static double p(double d5) {
        return Double.longBitsToDouble(s(Double.doubleToLongBits(d5)));
    }

    public static float q(float f4) {
        return Float.intBitsToFloat(r(Float.floatToIntBits(f4)));
    }

    public static int r(int i4) {
        return ((i4 & 255) << 24) + (((i4 >> 8) & 255) << 16) + (((i4 >> 16) & 255) << 8) + ((i4 >> 24) & 255);
    }

    public static long s(long j4) {
        return ((j4 & 255) << 56) + (((j4 >> 8) & 255) << 48) + (((j4 >> 16) & 255) << 40) + (((j4 >> 24) & 255) << 32) + (((j4 >> 32) & 255) << 24) + (((j4 >> 40) & 255) << 16) + (((j4 >> 48) & 255) << 8) + ((j4 >> 56) & 255);
    }

    public static short t(short s4) {
        return (short) (((s4 & 255) << 8) + ((s4 >> 8) & 255));
    }

    public static void u(OutputStream outputStream, double d5) throws IOException {
        A(outputStream, Double.doubleToLongBits(d5));
    }

    public static void v(byte[] bArr, int i4, double d5) {
        B(bArr, i4, Double.doubleToLongBits(d5));
    }

    public static void w(OutputStream outputStream, float f4) throws IOException {
        y(outputStream, Float.floatToIntBits(f4));
    }

    public static void x(byte[] bArr, int i4, float f4) {
        z(bArr, i4, Float.floatToIntBits(f4));
    }

    public static void y(OutputStream outputStream, int i4) throws IOException {
        outputStream.write((byte) (i4 & 255));
        outputStream.write((byte) ((i4 >> 8) & 255));
        outputStream.write((byte) ((i4 >> 16) & 255));
        outputStream.write((byte) ((i4 >> 24) & 255));
    }

    public static void z(byte[] bArr, int i4, int i5) {
        bArr[i4] = (byte) (i5 & 255);
        bArr[i4 + 1] = (byte) ((i5 >> 8) & 255);
        bArr[i4 + 2] = (byte) ((i5 >> 16) & 255);
        bArr[i4 + 3] = (byte) ((i5 >> 24) & 255);
    }
}
