package com.tencent.qcloud.core.util;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/* loaded from: classes7.dex */
public class QCloudUtils {
    public static boolean doesUriFileExist(Uri uri, ContentResolver contentResolver) {
        try {
            contentResolver.openFileDescriptor(uri, ProtectedSandApp.s("嫊\u0001")).close();
            return true;
        } catch (FileNotFoundException e4) {
            e4.printStackTrace();
            return false;
        } catch (IOException e5) {
            e5.printStackTrace();
            return true;
        }
    }

    public static long getUriContentLength(Uri uri, ContentResolver contentResolver) {
        long j4;
        String scheme = uri.getScheme();
        if (!ProtectedSandApp.s("嫋\u0001").equals(scheme)) {
            if (ProtectedSandApp.s("嫍\u0001").equals(scheme)) {
                return new File(uri.getPath()).length();
            }
            return -1L;
        }
        Cursor query = contentResolver.query(uri, null, null, null, null);
        if (query != null) {
            try {
                j4 = query.moveToFirst() ? query.getLong(query.getColumnIndex(ProtectedSandApp.s("嫌\u0001"))) : -1L;
            } finally {
                query.close();
            }
        } else {
            j4 = -1;
        }
        return j4 == -1 ? getUriContentLengthByRead(uri, contentResolver) : j4;
    }

    private static long getUriContentLengthByRead(Uri uri, ContentResolver contentResolver) {
        InputStream inputStream = null;
        try {
            try {
                inputStream = contentResolver.openInputStream(uri);
                byte[] bArr = new byte[8192];
                long j4 = 0;
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read != -1) {
                        j4 += read;
                    } else {
                        try {
                            break;
                        } catch (IOException e4) {
                            e4.printStackTrace();
                        }
                    }
                }
                inputStream.close();
                return j4;
            } catch (Exception e5) {
                e5.printStackTrace();
                if (inputStream == null) {
                    return -1L;
                }
                try {
                    inputStream.close();
                    return -1L;
                } catch (IOException e6) {
                    e6.printStackTrace();
                    return -1L;
                }
            }
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e7) {
                    e7.printStackTrace();
                }
            }
            throw th;
        }
    }

    private static long getUriContentLengthBySkip(Uri uri, ContentResolver contentResolver) {
        InputStream inputStream = null;
        try {
            try {
                inputStream = contentResolver.openInputStream(uri);
                long j4 = 0;
                while (true) {
                    long skip = inputStream.skip(8192);
                    if (skip != -1) {
                        j4 += skip;
                    } else {
                        try {
                            break;
                        } catch (IOException e4) {
                            e4.printStackTrace();
                        }
                    }
                }
                inputStream.close();
                return j4;
            } catch (Exception e5) {
                e5.printStackTrace();
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e6) {
                        e6.printStackTrace();
                    }
                }
                return -1L;
            }
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e7) {
                    e7.printStackTrace();
                }
            }
            throw th;
        }
    }

    public static boolean isNotEmpty(String str) {
        return !TextUtils.isEmpty(str);
    }

    public static byte[] readBytesFromFile(String str) {
        byte[] bArr = null;
        try {
            File file = new File(str);
            bArr = new byte[(int) file.length()];
            new FileInputStream(file).read(bArr);
            return bArr;
        } catch (IOException e4) {
            e4.printStackTrace();
            return bArr;
        }
    }

    public static byte[] toBytes(Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = null;
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(obj);
            objectOutputStream.flush();
            bArr = byteArrayOutputStream.toByteArray();
            objectOutputStream.close();
            byteArrayOutputStream.close();
            return bArr;
        } catch (IOException e4) {
            e4.printStackTrace();
            return bArr;
        }
    }

    public static Object toObject(byte[] bArr) {
        Object obj = null;
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
            obj = objectInputStream.readObject();
            objectInputStream.close();
            byteArrayInputStream.close();
            return obj;
        } catch (IOException e4) {
            e4.printStackTrace();
            return obj;
        } catch (ClassNotFoundException e5) {
            e5.printStackTrace();
            return obj;
        }
    }

    public static void writeToFile(String str, byte[] bArr) {
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                try {
                    fileOutputStream = new FileOutputStream(str);
                } catch (IOException e4) {
                    e = e4;
                }
            } catch (Throwable th) {
                th = th;
            }
            try {
                fileOutputStream.write(bArr);
                fileOutputStream.close();
            } catch (IOException e5) {
                e = e5;
                fileOutputStream2 = fileOutputStream;
                e.printStackTrace();
                if (fileOutputStream2 != null) {
                    fileOutputStream2.close();
                }
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream2 = fileOutputStream;
                if (fileOutputStream2 != null) {
                    try {
                        fileOutputStream2.close();
                    } catch (IOException e6) {
                        e6.printStackTrace();
                    }
                }
                throw th;
            }
        } catch (IOException e7) {
            e7.printStackTrace();
        }
    }
}
