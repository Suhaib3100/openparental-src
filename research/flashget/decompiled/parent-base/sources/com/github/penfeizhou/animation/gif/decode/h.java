package com.github.penfeizhou.animation.gif.decode;

import android.content.Context;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.github.penfeizhou.animation.gif.io.GifReader;
import com.github.penfeizhou.animation.io.Reader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/* compiled from: GifParser.java */
/* loaded from: classes5.dex */
public class h {

    /* compiled from: GifParser.java */
    static class a extends IOException {
        a() {
            super(ProtectedSandApp.s("쒀"));
        }
    }

    private static void a(GifReader gifReader) throws IOException {
        byte peek;
        if (gifReader.peek() != 71 || gifReader.peek() != 73 || gifReader.peek() != 70 || gifReader.peek() != 56 || (((peek = gifReader.peek()) != 55 && peek != 57) || gifReader.peek() != 97)) {
            throw new a();
        }
    }

    public static boolean b(Context context, int i4) {
        InputStream inputStream = null;
        try {
            inputStream = context.getResources().openRawResource(i4);
            boolean d5 = d(new com.github.penfeizhou.animation.io.e(inputStream));
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e4) {
                    e4.printStackTrace();
                }
            }
            return d5;
        } catch (Exception unused) {
            if (inputStream == null) {
                return false;
            }
            try {
                inputStream.close();
                return false;
            } catch (IOException e5) {
                e5.printStackTrace();
                return false;
            }
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e6) {
                    e6.printStackTrace();
                }
            }
            throw th;
        }
    }

    public static boolean c(Context context, String str) {
        InputStream inputStream = null;
        try {
            inputStream = context.getAssets().open(str);
            boolean d5 = d(new com.github.penfeizhou.animation.io.e(inputStream));
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e4) {
                    e4.printStackTrace();
                }
            }
            return d5;
        } catch (Exception unused) {
            if (inputStream == null) {
                return false;
            }
            try {
                inputStream.close();
                return false;
            } catch (IOException e5) {
                e5.printStackTrace();
                return false;
            }
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e6) {
                    e6.printStackTrace();
                }
            }
            throw th;
        }
    }

    public static boolean d(Reader reader) {
        try {
            a(reader instanceof GifReader ? (GifReader) reader : new GifReader(reader));
            return true;
        } catch (IOException e4) {
            if (e4 instanceof a) {
                return false;
            }
            e4.printStackTrace();
            return false;
        }
    }

    public static boolean e(String str) {
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(str);
            try {
                boolean d5 = d(new com.github.penfeizhou.animation.io.e(fileInputStream2));
                try {
                    fileInputStream2.close();
                } catch (IOException e4) {
                    e4.printStackTrace();
                }
                return d5;
            } catch (Exception unused) {
                fileInputStream = fileInputStream2;
                if (fileInputStream == null) {
                    return false;
                }
                try {
                    fileInputStream.close();
                    return false;
                } catch (IOException e5) {
                    e5.printStackTrace();
                    return false;
                }
            } catch (Throwable th) {
                th = th;
                fileInputStream = fileInputStream2;
                if (fileInputStream != null) {
                    try {
                        fileInputStream.close();
                    } catch (IOException e6) {
                        e6.printStackTrace();
                    }
                }
                throw th;
            }
        } catch (Exception unused2) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static List<b> f(GifReader gifReader) throws IOException {
        a(gifReader);
        ArrayList arrayList = new ArrayList();
        k kVar = new k();
        kVar.a(gifReader);
        arrayList.add(kVar);
        if (kVar.c()) {
            c cVar = new c(kVar.d());
            cVar.a(gifReader);
            arrayList.add(cVar);
        }
        while (true) {
            try {
                byte peek = gifReader.peek();
                if (peek == 59) {
                    break;
                }
                b jVar = peek != 33 ? peek != 44 ? null : new j() : f.b(gifReader);
                if (jVar == null) {
                    throw new a();
                }
                jVar.a(gifReader);
                arrayList.add(jVar);
            } catch (Exception e4) {
                e4.printStackTrace();
            }
        }
        return arrayList;
    }
}
