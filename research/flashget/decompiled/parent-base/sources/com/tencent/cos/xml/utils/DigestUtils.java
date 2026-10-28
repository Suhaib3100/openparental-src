package com.tencent.cos.xml.utils;

import android.text.TextUtils;
import android.util.Base64;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.common.primitives.n;
import com.tencent.cos.xml.common.ClientErrorCode;
import com.tencent.cos.xml.exception.CosXmlClientException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes7.dex */
public class DigestUtils {

    public static class COSMd5AndReadData {
        public String md5;
        public byte[] readData;

        public COSMd5AndReadData(String str, byte[] bArr) {
            this.md5 = str;
            this.readData = bArr;
        }
    }

    public static String decodeBase64(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            return new String(Base64.decode(str, 0), ProtectedSandApp.s("僣\u0001"));
        } catch (UnsupportedEncodingException unused) {
            return str;
        }
    }

    public static String getBase64(String str) throws CosXmlClientException {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            return Base64.encodeToString(str.getBytes(ProtectedSandApp.s("僤\u0001")), 2);
        } catch (UnsupportedEncodingException e4) {
            throw new CosXmlClientException(ClientErrorCode.INTERNAL_ERROR.getCode(), e4);
        }
    }

    public static long getBigIntFromString(String str) {
        return new BigInteger(str).longValue();
    }

    public static String getBigIntToString(long j4) {
        BigInteger valueOf = BigInteger.valueOf((j4 >> 1) & n.f57520b);
        return valueOf.add(valueOf).add(BigInteger.valueOf(j4 & Long.MAX_VALUE)).toString();
    }

    @q0
    public static String getCOSMd5(InputStream inputStream, long j4, long j5) throws IOException {
        String s4 = ProtectedSandApp.s("僥\u0001");
        long j6 = 0;
        while (j6 < j4) {
            try {
                long skip = inputStream.skip(j4 - j6);
                if (skip == 0) {
                    throw new IOException(ProtectedSandApp.s("僦\u0001"));
                }
                j6 += skip;
            } catch (NoSuchAlgorithmException e4) {
                throw new IOException(ProtectedSandApp.s("僩\u0001"), e4);
            }
        }
        MessageDigest messageDigest = MessageDigest.getInstance(ProtectedSandApp.s("僧\u0001"));
        byte[] bArr = new byte[8192];
        if (j5 < 0) {
            j5 = Long.MAX_VALUE;
        }
        while (j5 > 0) {
            int min = (int) Math.min(j5, 8192);
            int i4 = 0;
            while (i4 < min) {
                int read = inputStream.read(bArr, i4, min - i4);
                if (read == -1) {
                    throw new IOException(ProtectedSandApp.s("僨\u0001"));
                }
                i4 += read;
            }
            messageDigest.update(bArr, 0, i4);
            j5 -= i4;
        }
        return s4 + StringUtils.toHexString(messageDigest.digest()) + s4;
    }

    public static COSMd5AndReadData getCOSMd5AndReadData(InputStream inputStream, int i4) throws IOException {
        String s4 = ProtectedSandApp.s("僥\u0001");
        try {
            byte[] bArr = new byte[i4];
            MessageDigest messageDigest = MessageDigest.getInstance(ProtectedSandApp.s("僧\u0001"));
            int read = inputStream.read(bArr, 0, i4);
            if (read != -1) {
                if (read < i4) {
                    return new COSMd5AndReadData("", subByte(bArr, 0, read));
                }
                messageDigest.update(bArr, 0, read);
            }
            return new COSMd5AndReadData(s4 + StringUtils.toHexString(messageDigest.digest()) + s4, subByte(bArr, 0, read));
        } catch (IOException e4) {
            throw e4;
        } catch (NoSuchAlgorithmException e5) {
            throw new IOException(ProtectedSandApp.s("僪\u0001"), e5);
        }
    }

    public static long getCRC64(InputStream inputStream) {
        try {
            CRC64 crc64 = new CRC64();
            byte[] bArr = new byte[8192];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    return crc64.getValue();
                }
                crc64.update(bArr, read);
            }
        } catch (IOException e4) {
            e4.printStackTrace();
            return -1L;
        }
    }

    public static String getCRC64String(InputStream inputStream) {
        return getBigIntToString(getCRC64(inputStream));
    }

    public static String getHmacSha1(String str, String str2) throws CosXmlClientException {
        String s4 = ProtectedSandApp.s("僫\u0001");
        String s5 = ProtectedSandApp.s("僣\u0001");
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(str2.getBytes(Charset.forName(s5)), s4);
            Mac mac = Mac.getInstance(s4);
            mac.init(secretKeySpec);
            return StringUtils.toHexString(mac.doFinal(str.getBytes(Charset.forName(s5))));
        } catch (InvalidKeyException e4) {
            throw new CosXmlClientException(ClientErrorCode.INTERNAL_ERROR.getCode(), e4);
        } catch (NoSuchAlgorithmException e5) {
            throw new CosXmlClientException(ClientErrorCode.INTERNAL_ERROR.getCode(), e5);
        }
    }

    public static String getMD5(String str) throws CosXmlClientException {
        Throwable th;
        NoSuchAlgorithmException e4;
        IOException e5;
        FileNotFoundException e6;
        if (str == null) {
            throw new CosXmlClientException(ClientErrorCode.INVALID_ARGUMENT.getCode(), ProtectedSandApp.s("僭\u0001"));
        }
        File file = new File(str);
        if (!file.exists()) {
            throw new CosXmlClientException(ClientErrorCode.INVALID_ARGUMENT.getCode(), ProtectedSandApp.s("僬\u0001"));
        }
        try {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance(ProtectedSandApp.s("僧\u0001"));
                FileInputStream fileInputStream = new FileInputStream(file);
                try {
                    byte[] bArr = new byte[32768];
                    while (true) {
                        int read = fileInputStream.read(bArr);
                        if (read == -1) {
                            String hexString = StringUtils.toHexString(messageDigest.digest());
                            CloseUtil.closeQuietly(fileInputStream);
                            return hexString;
                        }
                        messageDigest.update(bArr, 0, read);
                    }
                } catch (FileNotFoundException e7) {
                    e6 = e7;
                    throw new CosXmlClientException(ClientErrorCode.INVALID_ARGUMENT.getCode(), e6);
                } catch (IOException e10) {
                    e5 = e10;
                    throw new CosXmlClientException(ClientErrorCode.IO_ERROR.getCode(), e5);
                } catch (NoSuchAlgorithmException e11) {
                    e4 = e11;
                    throw new CosXmlClientException(ClientErrorCode.INTERNAL_ERROR.getCode(), e4);
                }
            } catch (Throwable th2) {
                th = th2;
                CloseUtil.closeQuietly(null);
                throw th;
            }
        } catch (FileNotFoundException e12) {
            e6 = e12;
        } catch (IOException e13) {
            e5 = e13;
        } catch (NoSuchAlgorithmException e14) {
            e4 = e14;
        } catch (Throwable th3) {
            th = th3;
            CloseUtil.closeQuietly(null);
            throw th;
        }
    }

    public static String getSHA1FromBytes(byte[] bArr, int i4, int i5) throws CosXmlClientException {
        if (bArr == null || i5 <= 0 || i4 < 0) {
            throw new CosXmlClientException(ClientErrorCode.INVALID_ARGUMENT.getCode(), ProtectedSandApp.s("僯\u0001"));
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(ProtectedSandApp.s("僮\u0001"));
            messageDigest.update(bArr, i4, i5);
            return StringUtils.toHexString(messageDigest.digest());
        } catch (OutOfMemoryError e4) {
            throw new CosXmlClientException(ClientErrorCode.INTERNAL_ERROR.getCode(), e4);
        } catch (NoSuchAlgorithmException e5) {
            throw new CosXmlClientException(ClientErrorCode.INTERNAL_ERROR.getCode(), e5);
        }
    }

    public static String getSHA1FromPath(String str) throws CosXmlClientException {
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2 = null;
        try {
            try {
                fileInputStream = new FileInputStream(str);
            } catch (Throwable th) {
                th = th;
            }
        } catch (FileNotFoundException e4) {
            e = e4;
        } catch (IOException e5) {
            e = e5;
        } catch (NoSuchAlgorithmException e6) {
            e = e6;
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(ProtectedSandApp.s("僮\u0001"));
            byte[] bArr = new byte[65536];
            while (true) {
                int read = fileInputStream.read(bArr, 0, 65536);
                if (read == -1) {
                    String hexString = StringUtils.toHexString(messageDigest.digest());
                    CloseUtil.closeQuietly(fileInputStream);
                    return hexString;
                }
                messageDigest.update(bArr, 0, read);
            }
        } catch (FileNotFoundException e7) {
            e = e7;
            throw new CosXmlClientException(ClientErrorCode.INVALID_ARGUMENT.getCode(), e);
        } catch (IOException e10) {
            e = e10;
            throw new CosXmlClientException(ClientErrorCode.IO_ERROR.getCode(), e);
        } catch (NoSuchAlgorithmException e11) {
            e = e11;
            throw new CosXmlClientException(ClientErrorCode.INTERNAL_ERROR.getCode(), e);
        } catch (Throwable th2) {
            th = th2;
            fileInputStream2 = fileInputStream;
            CloseUtil.closeQuietly(fileInputStream2);
            throw th;
        }
    }

    public static String getSecurityBase64(String str) throws CosXmlClientException {
        String base64 = getBase64(str);
        return TextUtils.isEmpty(base64) ? base64 : base64.replace(ProtectedSandApp.s("僰\u0001"), ProtectedSandApp.s("僱\u0001")).replace(ProtectedSandApp.s("僲\u0001"), ProtectedSandApp.s("僳\u0001"));
    }

    public static String getSha1(String str) throws CosXmlClientException {
        try {
            return StringUtils.toHexString(MessageDigest.getInstance(ProtectedSandApp.s("僮\u0001")).digest(str.getBytes(Charset.forName(ProtectedSandApp.s("僣\u0001")))));
        } catch (NoSuchAlgorithmException e4) {
            throw new CosXmlClientException(ClientErrorCode.INTERNAL_ERROR.getCode(), e4);
        }
    }

    private static byte[] subByte(byte[] bArr, int i4, int i5) {
        byte[] bArr2 = new byte[i5];
        System.arraycopy(bArr, i4, bArr2, 0, i5);
        return bArr2;
    }

    public static String getCRC64String(File file) {
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(file);
            try {
                String cRC64String = getCRC64String(fileInputStream2);
                try {
                    fileInputStream2.close();
                } catch (IOException e4) {
                    e4.printStackTrace();
                }
                return cRC64String;
            } catch (Exception unused) {
                fileInputStream = fileInputStream2;
                try {
                    fileInputStream.close();
                } catch (IOException e5) {
                    e5.printStackTrace();
                }
                return "";
            } catch (Throwable th) {
                th = th;
                fileInputStream = fileInputStream2;
                try {
                    fileInputStream.close();
                } catch (IOException e6) {
                    e6.printStackTrace();
                }
                throw th;
            }
        } catch (Exception unused2) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static long getCRC64(InputStream inputStream, long j4, long j5) {
        int read;
        try {
            if (inputStream.skip(j4) != j4) {
                return -1L;
            }
            CRC64 crc64 = new CRC64();
            byte[] bArr = new byte[8192];
            if (j5 < 0) {
                j5 = Long.MAX_VALUE;
            }
            int min = (int) Math.min(j5, 8192);
            while (j5 > 0 && (read = inputStream.read(bArr, 0, min)) != -1) {
                crc64.update(bArr, read);
                j5 -= read;
            }
            return crc64.getValue();
        } catch (IOException e4) {
            e4.printStackTrace();
            return -1L;
        }
    }
}
